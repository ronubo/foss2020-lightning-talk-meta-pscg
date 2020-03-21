SUMMARY = "Corona Opinion application"
SECTION = "examples"
DEPENDS = ""
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

# In the demo prior to that, I start demonstrating bitbake without dependencies ($ bitbake -b corona-opinions ). 
# This will most likely fail on packaging, so "handling dependencies" is required (i.e. removing -b).
# However, if you remove "-b" and don't adhere to the rules, you will find that: ERROR: Nothing PROVIDES 'corona-opinions' .
# So you can either adhere to the rules, or specify yourself what you want to "provide". 
# In this example, we still don't follow the folder hierarchy rules for recipes, but declare ourselves what our recipe "proivdes". 
# We could give it any alternative way, just for fun, and it will work ( Build with:  $ bitbake blablabla )

PROVIDES = "blablabla"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# IMPORTANT caveat: this is NOT how you use git. You MUST provide the git:// prefix
#           SRC_URI = "https://github.com/ronubo/foss2020-lightning-talk.git"
# Instead, use the following form (you could add additional parmeters for the tag, branch, rev, etc)
SRC_URI = "git://github.com/ronubo/foss2020-lightning-talk.git;protocol=https;branch=autoconf-quickfix"
SRC_URI[md5sum] = "5ac923fe82f87865ec86e1c4be5227ad"

# You MUST provide the SRCREV. 

# This commit will allow you to generate things yourself - however autotools class excpects somethting you can autoreconf
# SRCREV = "3e2a90a48253bdd43a587f896e12b2fb49bef0d4"

# Now note that if this commit is NOT in the master branch - you would want to specify theh branch in SRC_URI (as we did above)
SRCREV = "52a6664f92d571b6630f7114ee865f4ba599ff67"
S = "${WORKDIR}/git"

inherit autotools


