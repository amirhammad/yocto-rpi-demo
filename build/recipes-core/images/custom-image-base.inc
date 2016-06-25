# Base this image on core-image-minimal
include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
	dropbear \
	i2c-tools \
	userland \
	rtl8188eu \
	wireless-tools \
	wpa-supplicant \
	"
