#!/bin/bash

sudo apt-get update -qq
sudo apt-get install libc6-i386 lib32z1 lib32stdc++6

OLD_PWD=$PWD

mkdir .sdk
cd .sdk
wget http://dl.google.com/android/android-sdk_r24-linux.tgz
tar xf android-sdk_r24-linux.tgz
SDK_PATH=$PWD/android-sdk-linux

cd $OLD_PWD

echo yes | $SDK_PATH/tools/android update sdk --all --filter platform-tools --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter build-tools-21.1.1 --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter android-21 --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter extra-android-support --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter extra-android-m2repository --no-ui

echo "sdk.dir=$SDK_PATH" > local.properties
