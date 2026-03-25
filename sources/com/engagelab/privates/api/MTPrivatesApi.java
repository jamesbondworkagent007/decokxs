package com.engagelab.privates.api;

import android.content.Context;
import com.engagelab.privates.analysis.api.MTAnalysisPrivatesApi;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.core.global.MTCoreGlobal;
import com.engagelab.privates.push.api.MTPushPrivatesApi;

/* JADX INFO: loaded from: classes2.dex */
public class MTPrivatesApi {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configAddress(Context context, Address address) {
        if (context == null) {
            MTCoreGlobal.setAddress(address);
        } else if (MTGlobal.isMainProcess(context.getApplicationContext()) || MTGlobal.isRemoteProcess(context.getApplicationContext())) {
            MTCoreGlobal.setAddress(address);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void configDebugMode(Context context, boolean z) {
        MTCorePrivatesApi.configDebugMode(context, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void init(Context context) {
        MTPushPrivatesApi.init(context);
        MTAnalysisPrivatesApi.init(context);
    }
}
