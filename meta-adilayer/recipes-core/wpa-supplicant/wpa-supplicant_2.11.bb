LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9a1e25c1a3b2a0de6c9b1a4b02d24eb4"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

do_install:append() {
    # Install the wpa_supplicant configuration file
    install -d ${D}${sysconfdir}/wpa_supplicant
    install -m 0644 ${WORKDIR}/wpa_supplicant-wlan0.conf ${D}${sysconfdir}/wpa_supplicant/

    # Install the systemd service file
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/wpa_supplicant.service ${D}${systemd_unitdir}/system/
}
