DESCRIPTION = "Install my custom file"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=b1946ac92492d2347c6235b4d2611184"

SRC_URI = "file://myconfig.txt"

# Use a subfolder inside WORKDIR for unpacking
S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install() {
    install -d ${D}${sysconfdir}/myfiles/
    install -m 0644 ${S}/myconfig.txt ${D}${sysconfdir}/myfiles/
}
