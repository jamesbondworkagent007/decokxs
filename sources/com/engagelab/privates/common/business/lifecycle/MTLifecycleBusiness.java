package com.engagelab.privates.common.business.lifecycle;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.component.MTCommonService;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: loaded from: classes2.dex */
public class MTLifecycleBusiness {
    private static final String TAG = "MTLifecycleBusiness";
    private static volatile MTLifecycleBusiness instance;
    private MTLifecycleListener lifecycleListener;
    private boolean init = false;
    private int activityFlag = 0;
    private boolean startServiceFlag = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onActivityResumed(Context context, Bundle bundle) {
        MTGlobal.setCurrentActivityName(bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onMainLifecycleState(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("state");
        MTGlobal.setLifecycleState(z);
        if (z) {
            if (this.activityFlag == 0) {
                startCommonService(context);
                MTCommonLog.d(TAG, "toForeground currentActivity:" + MTGlobal.getCurrentActivityName());
                MTCommonPrivatesApi.sendMessageToMainProcess(context, 1005, bundle);
                if (MTGlobal.isNeedRemoteProcess) {
                    MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.TO_FOREGROUND, bundle);
                }
            }
            this.activityFlag++;
            return;
        }
        int i = this.activityFlag;
        if (i > 0) {
            this.activityFlag = i - 1;
        }
        if (this.activityFlag == 0) {
            MTCommonLog.d(TAG, "toBackground currentActivity:" + MTGlobal.getCurrentActivityName());
            MTCommonPrivatesApi.sendMessageToMainProcess(context, 1006, bundle);
            if (MTGlobal.isNeedRemoteProcess) {
                MTCommonPrivatesApi.sendMessageToRemoteProcess(context, MTCommonConstants.RemoteWhat.TO_BACKGROUND, bundle);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onRemoteLifecycleState(Context context, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string = bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        boolean z = bundle.getBoolean("state");
        MTGlobal.setCurrentActivityName(string);
        MTGlobal.setLifecycleState(z);
        StringBuilder sb = new StringBuilder();
        sb.append(MTGlobal.getLifecycleState() ? "toForeground" : "toBackground");
        sb.append(" currentActivity:");
        sb.append(MTGlobal.getCurrentActivityName());
        MTCommonLog.d(TAG, sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MTLifecycleBusiness getInstance() {
        if (instance == null) {
            synchronized (MTLifecycleBusiness.class) {
                instance = new MTLifecycleBusiness();
            }
        }
        return instance;
    }

    public void release(Context context) {
        ((Application) context).unregisterActivityLifecycleCallbacks(this.lifecycleListener);
    }

    private void startCommonService(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && !this.startServiceFlag && MTGlobal.isNeedRemoteProcess) {
            this.startServiceFlag = true;
            MTCommonService commonService = MTGlobal.getCommonService(context);
            if (commonService == null) {
                return;
            }
            Intent intent = new Intent();
            intent.setClass(context, commonService.getClass());
            context.startService(intent);
        }
    }

    public void init(Context context) {
        if (this.init) {
            return;
        }
        this.init = true;
        MTLifecycleListener mTLifecycleListener = new MTLifecycleListener();
        this.lifecycleListener = mTLifecycleListener;
        ((Application) context).registerActivityLifecycleCallbacks(mTLifecycleListener);
    }
}
