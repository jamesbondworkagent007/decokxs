package com.reown.android.internal.common.connection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C60134zwX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ConnectivityState {
    public final MutableStateFlow<Boolean> _isAvailable;
    public final ConnectivityState$callback$1 callback;
    public final ConnectivityManager connectivityManager;
    public final StateFlow<Boolean> isAvailable;
    public final Set<Network> networks;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isAvailable() {
        return this.isAvailable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: android.net.ConnectivityManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.net.ConnectivityManager$NetworkCallback, com.reown.android.internal.common.connection.ConnectivityState$callback$1] */
    public ConnectivityState(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.copydefault(systemService, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        this.connectivityManager = connectivityManager;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._isAvailable = MutableStateFlow;
        this.isAvailable = FlowKt.asStateFlow(MutableStateFlow);
        this.networks = new LinkedHashSet();
        ?? r0 = new ConnectivityManager.NetworkCallback() { // from class: com.reown.android.internal.common.connection.ConnectivityState$callback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "");
                if (this.this$0.isCapable(network)) {
                    this.this$0.networks.add(network);
                    this.this$0._isAvailable.setValue(Boolean.TRUE);
                } else {
                    this.this$0._isAvailable.setValue(Boolean.FALSE);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NotNull Network network) {
                Intrinsics.checkNotNullParameter(network, "");
                this.this$0.networks.remove(network);
                this.this$0._isAvailable.setValue(Boolean.valueOf(!this.this$0.networks.isEmpty()));
            }
        };
        this.callback = r0;
        try {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addCapability(16).addTransportType(0).addTransportType(1).build(), (ConnectivityManager.NetworkCallback) r0);
        } catch (Exception e) {
            C60134zwX.EZpvd.e(e, "Failed to register network callback", new Object[0]);
            this._isAvailable.setValue(Boolean.TRUE);
        }
    }

    public final boolean isCapable(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
            return networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1);
        }
        return false;
    }
}
