package com.engagelab.privates.common.business.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.engagelab.privates.common.api.MTCommonPrivatesApi;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: loaded from: classes2.dex */
public class MTNetworkListener extends ConnectivityManager.NetworkCallback {
    private static final String TAG = "MTNetworkListener";
    private final Context context;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MTNetworkListener(Context context) {
        this.context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void onNetworkState(boolean z, Network network) {
        try {
            MTCommonLog.d(TAG, "onNetworkState state:" + z + ",network:" + network.toString());
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
            Bundle bundle = new Bundle();
            bundle.putBoolean("state", z);
            bundle.putParcelable("networkInfo", activeNetworkInfo);
            MTCommonPrivatesApi.sendMessageToMainProcess(this.context.getApplicationContext(), 1007, bundle);
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "onNetworkState failed " + th.getMessage());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        onNetworkState(true, network);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        onNetworkState(false, network);
    }
}
