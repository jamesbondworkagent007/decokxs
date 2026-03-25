package com.engagelab.privates.common.observer;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MTObserver {
    public abstract void dispatchMessage(Context context, int i, Bundle bundle);

    public short getSdkFlag() {
        return (short) 0;
    }

    public String getSdkName() {
        return null;
    }

    public int getSdkPriority() {
        return 0;
    }

    public String getSdkVersion() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String[] getThreadName() {
        return new String[0];
    }

    public void handleDelayMessage(Context context, int i, Bundle bundle) {
    }

    public void handleMessage(Context context, int i, Bundle bundle) {
    }

    public boolean isSdk() {
        return false;
    }

    public abstract boolean isSupport(int i);
}
