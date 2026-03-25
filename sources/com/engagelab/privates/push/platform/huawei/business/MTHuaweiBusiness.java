package com.engagelab.privates.push.platform.huawei.business;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.push.HmsMessaging;

/* JADX INFO: loaded from: classes17.dex */
public class MTHuaweiBusiness {
    private static final String TAG = "MTHuaweiBusiness";
    private static volatile MTHuaweiBusiness instance;
    private boolean isSupport;

    public static MTHuaweiBusiness getInstance() {
        if (instance == null) {
            synchronized (MTHuaweiBusiness.class) {
                instance = new MTHuaweiBusiness();
            }
        }
        return instance;
    }

    public void init(Context context) {
        try {
            int iIsHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(context);
            if (iIsHuaweiMobileServicesAvailable == 0) {
                this.isSupport = true;
                MTCommonLog.d(TAG, "support huawei push");
                String token = HmsInstanceId.getInstance(context).getToken(AGConnectInstance.getInstance().getOptions().getString("client/app_id"), HmsMessaging.DEFAULT_TOKEN_SCOPE);
                if (TextUtils.isEmpty(token)) {
                    MTCommonLog.d(TAG, "onTokenFailed:get token is empty");
                    onNode(context, 3003, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
                    return;
                }
                MTCommonLog.d(TAG, "onTokenSuccess:get token is " + token);
                onToken(context, token, 1);
                return;
            }
            this.isSupport = false;
            MTCommonLog.e(TAG, "not support huawei push, code:" + iIsHuaweiMobileServicesAvailable);
            onNode(context, 3002, iIsHuaweiMobileServicesAvailable, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_FAILED, 1);
        } catch (Throwable th) {
            this.isSupport = false;
            MTCommonLog.e(TAG, "init failed " + th.getMessage());
        }
    }

    public void onToken(Context context, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            MTCommonLog.d(TAG, "onToken:token is empty");
            return;
        }
        PlatformTokenMessage token = new PlatformTokenMessage().setPlatform((byte) 2).setToken(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("message", token);
        MTPushPrivatesApi.init(context);
        MTCommonPrivatesApi.sendMessageToMainProcess(context.getApplicationContext(), MTPushConstants.MainWhat.ON_PLATFORM_TOKEN, bundle);
        onNode(context, MTPushConstants.PlatformNode.CODE_GET_TOKEN_SUCCESS, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TOKEN_SUCCESS, i);
    }

    public void onNode(Context context, int i, int i2, int i3, int i4) {
        Bundle bundle = new Bundle();
        bundle.putByte(MTPushConstants.PlatformNode.KEY_PLATFORM, (byte) 2);
        bundle.putInt("code", i);
        bundle.putInt(MTPushConstants.PlatformNode.KEY_M_CODE, i2);
        bundle.putInt("type", i3);
        bundle.putInt("from", i4);
        MTCommonPrivatesApi.sendMessageToMainProcess(context, MTPushConstants.MainWhat.ON_PLATFORM_NODE, bundle);
    }

    public void turnOnPush(Context context) {
        try {
            if (this.isSupport) {
                HmsMessaging.getInstance(context).turnOnPush();
                onNode(context, 3101, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_ON_PUSH, 0);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "turnOnPush failed " + th.getMessage());
        }
    }

    public void turnOffPush(Context context) {
        try {
            if (this.isSupport) {
                HmsMessaging.getInstance(context).turnOffPush();
                onNode(context, 3102, 0, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, 0);
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "turnOffPush failed " + th.getMessage());
        }
    }
}
