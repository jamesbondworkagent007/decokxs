package o;

import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$authStage$1;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$authStage$2;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$isDownloading$1;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$isDownloading$2;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckDeviceStatusUseCase$state$1;
import com.okinc.wallet.hardware.api.onekey.OneKeyAuthStage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eHT {
    public final Flow<OneKeyAuthStage> AEQbTJ;
    public final Flow<eHS> EZpvd;
    public final Flow<java.lang.Boolean> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<eHS> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public eHT(@NotNull InterfaceC57039yar interfaceC57039yar) {
        Intrinsics.checkNotNullParameter(interfaceC57039yar, "");
        Flow<java.lang.Boolean> flowOnStart = FlowKt.onStart(FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new CheckDeviceStatusUseCase$isDownloading$1(interfaceC57039yar, null))), new CheckDeviceStatusUseCase$isDownloading$2(null));
        this.OLrzqt = flowOnStart;
        Flow<OneKeyAuthStage> flowOnStart2 = FlowKt.onStart(FlowKt.distinctUntilChanged(FlowKt.callbackFlow(new CheckDeviceStatusUseCase$authStage$1(interfaceC57039yar, null))), new CheckDeviceStatusUseCase$authStage$2(null));
        this.AEQbTJ = flowOnStart2;
        this.EZpvd = FlowKt.combine(flowOnStart, flowOnStart2, new CheckDeviceStatusUseCase$state$1(null));
    }
}
