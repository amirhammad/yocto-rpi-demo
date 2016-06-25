do_deploy_append() {
	# I2C bus support
	if [ -n "${ENABLE_I2C_BUS}" ]; then
			echo "# Enable I2C bus" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
			echo "dtparam=i2c=on" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	fi

	if [ -n "${ENABLE_RPI_ALSA}" ]; then
			echo "# Enable onboard alsa" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
			echo "dtparam=audio=on" >>${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	fi
}
