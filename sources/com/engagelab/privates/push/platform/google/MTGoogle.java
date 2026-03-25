package com.engagelab.privates.push.platform.google;

import android.content.Context;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.observer.MTObserver;
import com.engagelab.privates.push.platform.google.business.MTGoogleBusiness;

/* JADX INFO: loaded from: classes14.dex */
public class MTGoogle extends MTObserver {
    private static final String THREAD_PLATFORM = MTCommonConstants.getLogTag() + "PLATFORM-8";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.engagelab.privates.common.observer.MTObserver
    public String[] getThreadName() {
        return new String[]{THREAD_PLATFORM};
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public boolean isSupport(int i) {
        return i == 3101;
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        MTCommonPrivatesApi.sendMessage(context, THREAD_PLATFORM, i, bundle);
    }

    @Override // com.engagelab.privates.common.observer.MTObserver
    public void handleMessage(Context context, int i, Bundle bundle) {
        if (i != 3101) {
            return;
        }
        MTGoogleBusiness.getInstance().init(context);
    }
}
