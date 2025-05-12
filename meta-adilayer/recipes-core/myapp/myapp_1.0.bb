DESCRIPTION = "My Hello World App"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://COPYING;md5=b3bbd23cd9481b645539a156e55bcf17"

SRC_URI = "file://myapp-1.0"

S = "${WORKDIR}/myapp-1.0"

do_compile() {
    ${CXX} ${CXXFLAGS} hello.cpp -o myapp ${LDFLAGS}
}


do_install() {
    install -d ${D}${bindir}
    install -m 0755 myapp ${D}${bindir}
}
