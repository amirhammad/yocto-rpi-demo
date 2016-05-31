# Base this image on core-image-minimal
include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += " \
	pi-blaster \
	dropbear \
	ssh \
	throttle2pwm \
	"
