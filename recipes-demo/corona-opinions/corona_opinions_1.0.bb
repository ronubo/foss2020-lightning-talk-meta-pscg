SUMMARY = "Corona Opinion application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# IMPORTANT caveat: this is NOT how you use git. You MUST provide the git:// prefix
#           SRC_URI = "https://github.com/ronubo/foss2020-lightning-talk.git"
# Instead, use the following form (you could add additional parmeters for the tag, branch, rev, etc)
SRC_URI = "git://github.com/ronubo/foss2020-lightning-talk.git;protocol=https"
SRC_URI[md5sum] = "5ac923fe82f87865ec86e1c4be5227ad"

# You MUST provide the SRCREV. 

# This commit will allow you to generate things yourelf - however autotools class excpects somethting you can autoreconf
SRCREV = "3e2a90a48253bdd43a587f896e12b2fb49bef0d4"

S = "${WORKDIR}/git"

inherit autotools


