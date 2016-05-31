SUMMARY = "gamepad library"
HOMEPAGE = "http://github.com/mtwilliams/libgamepad/"
SECTION = "libs"

LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS += "udev"

S="${WORKDIR}/git"

SRC_URI = "\
	git://github.com/mtwilliams/libgamepad;rev=67526682a3d8390a970c140c316e9f1f826f1802;\
	"

inherit base

do_install_append () {
	install -d "${D}/usr/lib"
	install -m644 "${S}/lib${PN}.so.1" "${D}${libdir}"
	ln -s "lib${PN}.so.1" ${D}${libdir}/lib${PN}.so
	install -d "${D}${includedir}"
	install -m644 "${S}/gamepad.h" "${D}${includedir}"
}

FILES_${PN} += "${libdir}/*.so*"
FILES_${PN}-dev += "${includedir}/*.h"
