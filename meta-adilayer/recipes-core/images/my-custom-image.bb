DESCRIPTION = "My Custom Yocto Image"
LICENSE = "MIT"

inherit core-image
inherit extrausers

IMAGE_INSTALL += " \
	myapp \
	openssh \
    packagegroup-core-boot \
    nano \
    htop \
    my-tar \
"
# Use OpenSSH instead of Dropbear
IMAGE_INSTALL:append = " openssh openssh-sftp-server"

EXTRA_USERS_PARAMS = "usermod -p '\$6\$nbuuA8q1a1KXiYJv\$a7PHv.153YJXPwlWSTAwZWyt4M59HHwSyMzGLYlS/gxXr.Mn6ZsR1HHoXibn.SdAyDiHgPxresQ1mrUE.vLXE/' root;"
