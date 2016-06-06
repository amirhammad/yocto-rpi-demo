# Base this image on core-image-minimal
include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
	pi-blaster \
	dropbear \
	throttle2pwm \
	i2c-tools \
	userland \
	rtl8188eu \
	wireless-tools \
	wpa-supplicant \
	"
