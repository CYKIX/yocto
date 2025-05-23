DESCRIPTION = "My Custom Yocto Image"
LICENSE = "MIT"

inherit core-image
inherit extrausers

IMAGE_INSTALL += " \
	myfiles \
	myapp \
	openssh \
	openssh-sftp-server \
    packagegroup-core-boot \
    nano \
    htop \
    my-tar \
    linux-firmware \
    wpa-supplicant \
    iw \
    dhcpcd \
"


EXTRA_USERS_PARAMS = "usermod -p '\$6\$nbuuA8q1a1KXiYJv\$a7PHv.153YJXPwlWSTAwZWyt4M59HHwSyMzGLYlS/gxXr.Mn6ZsR1HHoXibn.SdAyDiHgPxresQ1mrUE.vLXE/' root;"
