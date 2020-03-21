# Using the tutorial

In the case you have the entire repository DO NOT start from the master branch.
Instead, start from branch starting-point (and do not cheat ;-) )

Used repository for the FOSS2020 demo:

- <https://github.com/ronubo/foss2020-lightning-talk-meta-pscg>  (this one)
- <https://github.com/ronubo/foss2020-lightning-talk> (the repository which contains the example program we intend to build).
  In our work, we rely on exact commits and branches from there, so if that breaks (e.g. because I modify and forget), please let me know.


For Yocto First timers, the Yocto Project setup is described in <https://www.youtube.com/watch?v=CZ2cVtAsBVI>
When you clone this repository you would want to: 

- Clone to your build directory and name the folder "meta-pscg"
- Update conf/bblayers.conf : append    '${TOPDIR}/meta-pscg \'   (without the ' ' !!!) ) to BBLAYERS



*This document is deliberately not formatted so that text could be pasted as is if not rendered


