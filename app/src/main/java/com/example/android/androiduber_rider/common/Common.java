package com.example.android.androiduber_rider.common;

import com.example.android.androiduber_rider.remote.FCMClient;
import com.example.android.androiduber_rider.remote.IFCMService;

public class Common {

    public static final String token_tbl = "Tokens";
    public static final String driver_tbl = "Drivers";
    public static final String usr_driver_tbl = "DriversInfo";
    public static final String usr_rider_tbl = "RidersInfo";
    public static final String pickup_request_tbl = "PickupRequest";

    public static final String fcm_url = "https://fcm.googleapis.com";

    public static IFCMService getIFCMService() {

        return FCMClient.getClient(fcm_url).create(IFCMService.class);
    }
}