DESCRIPTION = "Driver for Realtek USB wireless devices"
HOMEPAGE = "http://www.realtek.com/"
SECTION = "kernel/modules"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit module machine_kernel_pr

SRC_URI = "\
	git://github.com/lwfinger/rtl8188eu;rev=ced2b64a1139dcaf86947e3a9f7617dffbd64239\
	"

S = "${WORKDIR}/git"

MACHINE_KERNEL_PR_append = ".0"

EXTRA_OEMAKE = "KSRC=${STAGING_KERNEL_DIR}"

do_install() {
	install -d ${D}/lib/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
	install -m 0644 ${S}/8188eu.ko ${D}${base_libdir}/modules/${KERNEL_VERSION}/kernel/drivers/net/wireless
	install -d ${D}${base_libdir}/firmware/rtlwifi
	install -m 0644 ${S}/rtl8188eufw.bin ${D}${base_libdir}/firmware/rtlwifi
}

FILES_${PN} += "${base_libdir}/firmware/rtlwifi/rtl8188eufw.bin"
