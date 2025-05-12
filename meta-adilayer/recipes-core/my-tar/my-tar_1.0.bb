SUMMARY = "My custom tar utility"
LICENSE = "CLOSED"
SRC_URI = "file://my_tar-1.0.tar.gz"

S = "${WORKDIR}/my_tar-1.0"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 my_tar ${D}${bindir}/my_tar
}
