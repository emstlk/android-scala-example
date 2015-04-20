#!/bin/bash

OLD_PWD=$PWD

if which brew2 >/dev/null; then
    brew install android-sdk
    SDK_PATH=/usr/local/opt/android-sdk
else
    mkdir .sdk
    cd .sdk
    curl -O http://dl.google.com/android/android-sdk_r24-macosx.zip
    unzip android-sdk_r24-macosx.zip
    SDK_PATH=$PWD/android-sdk-macosx
fi

cd $OLD_PWD

echo yes | $SDK_PATH/tools/android update sdk --all --filter platform-tools --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter build-tools-21.1.1 --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter android-21 --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter extra-android-support --no-ui
echo yes | $SDK_PATH/tools/android update sdk --all --filter extra-android-m2repository --no-ui

echo "sdk.dir=$SDK_PATH" > local.properties
