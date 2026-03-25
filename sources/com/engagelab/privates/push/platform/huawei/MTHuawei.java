package com.engagelab.privates.push.platform.huawei;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.engagelab.privates.push.platform.huawei.business.MTHuaweiBusiness;

/* JADX INFO: loaded from: classes14.dex */
public class MTHuawei extends MTObserver {
    private static final String THREAD_PLATFORM = MTCommonConstants.getLogTag() + "PLATFORM";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String[] getThreadName() {
        return new String[]{THREAD_PLATFORM};
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSupport(int i) {
        switch (i) {
            case 3101:
            case 3102:
            case MTPushConstants.MainWhat.TURN_OFF_PLATFORM_PUSH /* 3103 */:
                return true;
            default:
                return false;
        }
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        MTCommonPrivatesApi.sendMessage(context, THREAD_PLATFORM, i, bundle);
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleMessage(Context context, int i, Bundle bundle) {
        switch (i) {
            case 3101:
                MTHuaweiBusiness.getInstance().init(context);
                break;
            case 3102:
                MTHuaweiBusiness.getInstance().turnOnPush(context);
                break;
            case MTPushConstants.MainWhat.TURN_OFF_PLATFORM_PUSH /* 3103 */:
                MTHuaweiBusiness.getInstance().turnOffPush(context);
                break;
        }
    }
}
