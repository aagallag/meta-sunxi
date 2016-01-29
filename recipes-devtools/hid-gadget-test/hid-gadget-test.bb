#
# HID Gadget Test application can be used to simulate HID input via USB OTG
#

DESCRIPTION = "HID Gadget Test Application"
SECTION = "tools"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
PR = "r0"

SRC_URI = "git://github.com/aagallag/hid_gadget_test.git;protocol=git;branch=master"
SRCREV = "56069773acbd016241b0d0dcb93370e354739f14"

S = "${WORKDIR}/git"

do_compile() {
		${CC} hid_gadget_test.c -o hid_gadget_test
}

do_install() {
		install -d ${D}${bindir}
		install -m 0755 hid_gadget_test ${D}${bindir}
}
