SUMMARY = "Corona Opinion application"
SECTION = "examples"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/ronubo/foss2020-lightning-talk.git;protocol=https;branch=autoconf-quickfix"
SRC_URI[md5sum] = "5ac923fe82f87865ec86e1c4be5227ad"

SRCREV = "52a6664f92d571b6630f7114ee865f4ba599ff67"
S = "${WORKDIR}/git"

inherit autotools


