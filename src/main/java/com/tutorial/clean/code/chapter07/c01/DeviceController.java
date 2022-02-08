package com.tutorial.clean.code.chapter07.c01;

public class DeviceController {

    /* With error code aproach

    public class DeviceController {

        public void sendShutDown() {
            DeviceHandle handle = getHandle(DEV1);
            // Check the state of the device
            if (handle != DeviceHandle.INVALID) {
                // Save the device status to the record field
                retrieveDeviceRecord(handle);
                // If not suspended, shut down
                if (record.getStatus() != DEVICE_SUSPENDED) {
                    pauseDevice(handle);
                    clearDeviceWorkQueue(handle);
                    closeDevice(handle);
                } else {
                    logger.log("Device suspended. Unable to shut down");
                }
            } else {
                logger.log("Invalid handle for: " + DEV1.toString());
            }
        }

    }
    */

/*
    public class DeviceController {
 ...

        public void sendShutDown(){
            try{
                tryToShutDown();
            } catch(DeviceShutDownError e){
                logger.log(e);
            }
        }

        private void tryToShutDown() throws DeviceShutDownError{
            DeviceHandle handle = getHandle(DEV1);
            DeviceRecord record = retrieveDeviceRecord(handle);
            pauseDevice(handle);
            clearDeviceWorkQueue(handle);
            closeDevice(handle);
        }

 ...
    } */




}
