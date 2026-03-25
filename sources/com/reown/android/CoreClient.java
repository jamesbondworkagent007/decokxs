package com.reown.android;

import android.app.Application;
import com.reown.android.Core;
import com.reown.android.CoreInterface;
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
public final class CoreClient implements CoreInterface {
    public static final CoreClient INSTANCE = new CoreClient();
    public final /* synthetic */ CoreProtocol $$delegate_0 = CoreProtocol.Companion.getInstance();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PushInterface getEcho() {
        return this.$$delegate_0.getEcho();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public ExplorerInterface getExplorer() {
        return this.$$delegate_0.getExplorer();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PairingInterface getPairing() {
        return this.$$delegate_0.getPairing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PairingControllerInterface getPairingController() {
        return this.$$delegate_0.getPairingController();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PushInterface getPush() {
        return this.$$delegate_0.getPush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public RelayConnectionInterface getRelay() {
        return this.$$delegate_0.getRelay();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public VerifyInterface getVerify() {
        return this.$$delegate_0.getVerify();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public void initialize(@NotNull Application application, @NotNull String str, @NotNull Core.Model.AppMetaData appMetaData, @NotNull ConnectionType connectionType, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, @NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(connectionType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.$$delegate_0.initialize(application, str, appMetaData, connectionType, relayConnectionInterface, str2, networkClientTimeout, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public void initialize(@NotNull Core.Model.AppMetaData appMetaData, @NotNull String str, @NotNull ConnectionType connectionType, @NotNull Application application, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, @NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(connectionType, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.$$delegate_0.initialize(appMetaData, str, connectionType, application, relayConnectionInterface, str2, networkClientTimeout, z, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public void setDelegate(@NotNull CoreInterface.Delegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "");
        this.$$delegate_0.setDelegate(delegate);
    }

    public interface CoreDelegate extends CoreInterface.Delegate {

        public static final class DefaultImpls {
            public static void onPairingDelete(@NotNull CoreDelegate coreDelegate, @NotNull Core.Model.DeletedPairing deletedPairing) {
                Intrinsics.checkNotNullParameter(deletedPairing, "");
                CoreInterface.Delegate.DefaultImpls.onPairingDelete(coreDelegate, deletedPairing);
            }

            public static void onPairingExpired(@NotNull CoreDelegate coreDelegate, @NotNull Core.Model.ExpiredPairing expiredPairing) {
                Intrinsics.checkNotNullParameter(expiredPairing, "");
                CoreInterface.Delegate.DefaultImpls.onPairingExpired(coreDelegate, expiredPairing);
            }

            public static void onPairingState(@NotNull CoreDelegate coreDelegate, @NotNull Core.Model.PairingState pairingState) {
                Intrinsics.checkNotNullParameter(pairingState, "");
                CoreInterface.Delegate.DefaultImpls.onPairingState(coreDelegate, pairingState);
            }
        }
    }
}
