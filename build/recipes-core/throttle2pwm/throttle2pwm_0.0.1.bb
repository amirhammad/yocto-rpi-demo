SUMMARY = "throttle2pwm"
HOMEPAGE = "http://github.com/amirhammad"
SECTION = "stahp"

LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

DEPENDS += "gamepad pi-blaster"

S="${WORKDIR}/git"

SRC_URI = "\
	git://github.com/amirhammad/gamepad-fun;branch=throttle2pwm;rev=cdb45e75777f2e202bb0d7245aa47152303dce19; \
"

inherit cmake
