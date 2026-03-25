package com.reown.android;

import android.app.Application;
import com.reown.android.Core;
import com.reown.android.internal.common.explorer.ExplorerInterface;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.push.PushInterface;
import com.reown.android.relay.ConnectionType;
import com.reown.android.relay.NetworkClientTimeout;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.android.verify.client.VerifyInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface CoreInterface {
    PushInterface getEcho();

    ExplorerInterface getExplorer();

    PairingInterface getPairing();

    PairingControllerInterface getPairingController();

    PushInterface getPush();

    RelayConnectionInterface getRelay();

    VerifyInterface getVerify();

    void initialize(@NotNull Application application, @NotNull String str, @NotNull Core.Model.AppMetaData appMetaData, @NotNull ConnectionType connectionType, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    void initialize(@NotNull Core.Model.AppMetaData appMetaData, @NotNull String str, @NotNull ConnectionType connectionType, @NotNull Application application, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    void setDelegate(@NotNull Delegate delegate);

    public interface Delegate extends PairingInterface.Delegate {

        public static final class DefaultImpls {
            public static void onPairingDelete(@NotNull Delegate delegate, @NotNull Core.Model.DeletedPairing deletedPairing) {
                Intrinsics.checkNotNullParameter(deletedPairing, "");
                PairingInterface.Delegate.DefaultImpls.onPairingDelete(delegate, deletedPairing);
            }

            public static void onPairingExpired(@NotNull Delegate delegate, @NotNull Core.Model.ExpiredPairing expiredPairing) {
                Intrinsics.checkNotNullParameter(expiredPairing, "");
                PairingInterface.Delegate.DefaultImpls.onPairingExpired(delegate, expiredPairing);
            }

            public static void onPairingState(@NotNull Delegate delegate, @NotNull Core.Model.PairingState pairingState) {
                Intrinsics.checkNotNullParameter(pairingState, "");
                PairingInterface.Delegate.DefaultImpls.onPairingState(delegate, pairingState);
            }
        }
    }

    public static final class DefaultImpls {
        public static /* synthetic */ void getEcho$annotations() {
        }

        public static /* synthetic */ void initialize$default(CoreInterface coreInterface, Core.Model.AppMetaData appMetaData, String str, ConnectionType connectionType, Application application, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
            }
            coreInterface.initialize(appMetaData, str, (i & 4) != 0 ? ConnectionType.AUTOMATIC : connectionType, application, (i & 16) != 0 ? null : relayConnectionInterface, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : networkClientTimeout, (i & 128) != 0 ? true : z, (Function1<? super Core.Model.Error, Unit>) function1);
        }

        public static /* synthetic */ void initialize$default(CoreInterface coreInterface, Application application, String str, Core.Model.AppMetaData appMetaData, ConnectionType connectionType, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
            }
            coreInterface.initialize(application, str, appMetaData, (i & 8) != 0 ? ConnectionType.AUTOMATIC : connectionType, (i & 16) != 0 ? null : relayConnectionInterface, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : networkClientTimeout, (i & 128) != 0 ? true : z, (Function1<? super Core.Model.Error, Unit>) function1);
        }
    }
}
