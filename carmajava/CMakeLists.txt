#
# Copyright (C) 2018-2020 LEIDOS.
#
# Licensed under the Apache License, Version 2.0 (the "License"); you may not
# use this file except in compliance with the License. You may obtain a copy of
# the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
# WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
# License for the specific language governing permissions and limitations under
# the License.
#

##############################################################################
# CMake
##############################################################################

cmake_minimum_required(VERSION 2.8.3)
project(carma)

##############################################################################
# Catkin
##############################################################################

find_package(catkin REQUIRED
        cav_msgs
        cav_srvs
        j2735_msgs
        autoware_msgs
        derived_object_msgs
        radar_msgs
        rosjava_utils
)
# Enable integration tests using python
#if(CATKIN_ENABLE_TESTING)
#  find_package(rostest REQUIRED)
#  add_rostest(test/transform_server_integration.test)
#endif()

catkin_package()

##############################################################################
# Installation
##############################################################################

# Instal Binaries from Gradle Build folder
install(DIRECTORY
        launch
        routes
        scripts
        rviz
        DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION})
install(DIRECTORY
        ui/config
        DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/ui)
install(DIRECTORY
        test
        DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/test)
