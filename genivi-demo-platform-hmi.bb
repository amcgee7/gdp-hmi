# Copyright (C) 2015 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY  = "Simple HMI for the GENIVI Demo Platform (GDP)"
HOMEPAGE = "http://projects.genivi.org/genivi-demo-platform/"
LICENSE  = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS = "wayland-ivi-extension weston dbus-c++ dbus-c++-native systemd"

RDEPENDS = " \
	alsa-utils-aplay \
	pulseaudio \
	pulseaudio-server \
	pulseaudio-module-native-protocol-tcp \
	gstreamer1.0 \
	gstreamer1.0-libav \
	gstreamer1.0-plugins-good \
	gstreamer1.0-plugins-bad \
	gstreamer1.0-plugins-base \
	gstreamer1.0-plugins-ugly \
	gstreamer1.0-plugins-good-meta \
	gstreamer1.0-plugins-bad-meta \
	gstreamer1.0-plugins-base-meta \
	gstreamer1.0-plugins-ugly-meta \

# SRC_URI = "git://git.projects.genivi.org/genivi-demo-platform-hmi.git"
# SRCREV = ""
# S = "${WORKDIR}/git"

inherit autotools pkgconfig
inherit externalsrc
EXTERNALSRC = "/home/holger/Projects/GDP/stash.wrs.com/genivi-demo-platform-hmi"

# make sure this matches the version given in configure.ac
PV = "0.4"
