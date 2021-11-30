# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING.DOC
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & GPLv3"
LIC_FILES_CHKSUM = "file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
                    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

SRC_URI = "https://nano-editor.org/dist/v5/nano-${PV}.tar.xz"
SRC_URI[sha1sum] = "925e65db58cb8347bf809084d6ebb71637395176"
SRC_URI[sha256sum] = "757db8cda4bb2873599e47783af463e3b547a627b0cabb30ea7bf71fb4c24937"
SRC_URI[sha384sum] = "5bb367d6568bada511bc94ec670f30fde76cf56e368b91be010fd9b6ef33c90ac5b535664b8e09afdc35527a1bdaddae"
SRC_URI[sha512sum] = "ac614587f1a76c5ccb425fc8b4c6d4f7748dda89b863b2b8c6937b31e837edca5c83e3c13f53c9f5da5a9e24a1d8093c19dd0e8a85723f0bbae57fdab155e15c"

# NOTE: the following library dependencies are unknown, ignoring: curses
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "file ncurses zlib"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig gettext autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

