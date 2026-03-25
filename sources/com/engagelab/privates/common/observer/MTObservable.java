package com.engagelab.privates.common.observer;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.engagelab.privates.common.binder.MTMessenger;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.log.MTCommonLog;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public class MTObservable {
    private static final String TAG = "MTObservable";
    public static final int WHAT_OBSERVER = 101;
    private static volatile MTObservable instance;
    public ConcurrentLinkedQueue<MTObserver> observeQueue = new ConcurrentLinkedQueue<>();
    public ConcurrentLinkedQueue<String> observeNameQueue = new ConcurrentLinkedQueue<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void dispatchMessage(Context context, int i, Bundle bundle) {
        for (MTObserver mTObserver : this.observeQueue) {
            if (mTObserver.isSupport(i)) {
                mTObserver.dispatchMessage(context, i, bundle);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void handleMessage(Context context, int i, String str, int i2, Bundle bundle) {
        for (MTObserver mTObserver : this.observeQueue) {
            if (Arrays.asList(mTObserver.getThreadName()).contains(str) && mTObserver.isSupport(i2)) {
                if (i == 0) {
                    mTObserver.handleMessage(context, i2, bundle);
                }
                if (i == 1) {
                    mTObserver.handleDelayMessage(context, i2, bundle);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void observer(Context context, MTObserver mTObserver) {
        if (this.observeQueue.contains(mTObserver)) {
            return;
        }
        String canonicalName = mTObserver.getClass().getCanonicalName();
        if (this.observeNameQueue.contains(canonicalName)) {
            return;
        }
        MTCommonLog.d(TAG, "observer " + canonicalName);
        this.observeQueue.add(mTObserver);
        this.observeNameQueue.add(canonicalName);
        Bundle bundle = new Bundle();
        bundle.putString(MTCommonConstants.Observer.KEY_OBSERVER_NAME, canonicalName);
        if (MTGlobal.isMainProcess(context)) {
            boolean lifecycleState = MTGlobal.getLifecycleState();
            String currentActivityName = MTGlobal.getCurrentActivityName();
            if (!TextUtils.isEmpty(currentActivityName)) {
                bundle.putBoolean("state", lifecycleState);
                bundle.putString(MTCommonConstants.Lifecycle.KEY_ACTIVITY, currentActivityName);
                if (mTObserver.isSupport(1005) || mTObserver.isSupport(1006)) {
                    mTObserver.dispatchMessage(context, 1005, null);
                }
            }
            boolean networkState = MTGlobal.getNetworkState();
            int networkType = MTGlobal.getNetworkType();
            String networkName = MTGlobal.getNetworkName();
            String networkRadio = MTGlobal.getNetworkRadio();
            if (!TextUtils.isEmpty(networkRadio)) {
                bundle.putBoolean("state", networkState);
                bundle.putInt("type", networkType);
                bundle.putString("name", networkName);
                bundle.putString(MTCommonConstants.Network.KEY_RADIO, networkRadio);
                if (mTObserver.isSupport(1003) || mTObserver.isSupport(1004)) {
                    mTObserver.dispatchMessage(context, networkState ? 1003 : 1004, null);
                }
            }
        }
        MTMessenger.getInstance().sendMessageToRemoteProcess(context, 101, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void observerOnRemoteProcess(Context context, Bundle bundle) {
        try {
            String string = bundle.getString(MTCommonConstants.Observer.KEY_OBSERVER_NAME);
            if (this.observeNameQueue.contains(string)) {
                return;
            }
            Object objNewInstance = Class.forName(string).newInstance();
            if (objNewInstance instanceof MTObserver) {
                MTObserver mTObserver = (MTObserver) objNewInstance;
                observer(context, mTObserver);
                boolean z = bundle.getBoolean("state");
                String string2 = bundle.getString(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
                if (!TextUtils.isEmpty(string2)) {
                    MTGlobal.setLifecycleState(z);
                    MTGlobal.setCurrentActivityName(string2);
                    int i = MTCommonConstants.RemoteWhat.TO_FOREGROUND;
                    if (mTObserver.isSupport(MTCommonConstants.RemoteWhat.TO_FOREGROUND) || mTObserver.isSupport(MTCommonConstants.RemoteWhat.TO_BACKGROUND)) {
                        if (!z) {
                            i = 1994;
                        }
                        mTObserver.dispatchMessage(context, i, null);
                    }
                }
                boolean z2 = bundle.getBoolean("state");
                int i2 = bundle.getInt("type");
                String string3 = bundle.getString("name");
                String string4 = bundle.getString(MTCommonConstants.Network.KEY_RADIO);
                if (TextUtils.isEmpty(string4)) {
                    return;
                }
                MTGlobal.setNetworkState(z2);
                MTGlobal.setNetworkType(i2);
                MTGlobal.setNetworkName(string3);
                MTGlobal.setNetworkRadio(string4);
                int i3 = MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED;
                if (mTObserver.isSupport(MTCommonConstants.RemoteWhat.ON_NETWORK_CONNECTED) || mTObserver.isSupport(MTCommonConstants.RemoteWhat.ON_NETWORK_DISCONNECTED)) {
                    if (!z) {
                        i3 = 1996;
                    }
                    mTObserver.dispatchMessage(context, i3, null);
                }
            }
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "observer failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static MTObservable getInstance() {
        if (instance == null) {
            synchronized (MTObservable.class) {
                instance = new MTObservable();
            }
        }
        return instance;
    }
}
