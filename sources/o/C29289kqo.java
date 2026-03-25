package o;

import com.okinc.business.market.features.scanner.surge.signal.data.GemItem;
import com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$invoke$1;
import com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$stopWs$1;
import com.okinc.business.market.features.scanner.surge.signal.domain.GetSignalGemsUseCase$subscribeWs$1;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagType;
import com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiplierTagUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kqo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29289kqo {
    public final MutableStateFlow<C29297kqw> AEQbTJ;
    public final CoroutineScope AYXKKw;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC29294kqt KWHzl;
    public final StateFlow<C29297kqw> OLrzqt;
    public final Json copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29297kqw> OLrzqt() {
        return this.OLrzqt;
    }

    @yCM
    public C29289kqo(@NotNull InterfaceC29294kqt interfaceC29294kqt, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC29294kqt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(json, "");
        this.KWHzl = interfaceC29294kqt;
        this.EZpvd = coroutineDispatcher;
        this.copydefault = json;
        MutableStateFlow<C29297kqw> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX INFO: renamed from: invoke-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8671invoke0E7RQCE$default(C29289kqo c29289kqo, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c29289kqo.AEQbTJ(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        GetSignalGemsUseCase$invoke$1 getSignalGemsUseCase$invoke$1;
        if (continuation instanceof GetSignalGemsUseCase$invoke$1) {
            getSignalGemsUseCase$invoke$1 = (GetSignalGemsUseCase$invoke$1) continuation;
            int i = getSignalGemsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalGemsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalGemsUseCase$invoke$1 = new GetSignalGemsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalGemsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalGemsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, z, str);
            getSignalGemsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalGemsUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getSignalGemsUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final void OLrzqt(java.lang.String str) {
        C25389ivm.safeLaunch$default(this.AYXKKw, null, null, new GetSignalGemsUseCase$subscribeWs$1(this, str, null), 3, null);
    }

    public final void AEQbTJ() {
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.AYXKKw, null, null, new GetSignalGemsUseCase$stopWs$1(this, null), 3, null);
    }

    public final C29295kqu AEQbTJ(GemItem gemItem) {
        java.lang.String strAhwBna;
        java.lang.String strGEmmrt = gemItem.gEmmrt();
        if (strGEmmrt == null || (strAhwBna = gemItem.AhwBna()) == null) {
            return null;
        }
        java.lang.String strAYXKKw = gemItem.AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = "";
        }
        java.lang.String strDjBIcL = gemItem.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strKWHzl = gemItem.KWHzl();
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        java.lang.String strOLrzqt = gemItem.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        java.lang.String strEZpvd = gemItem.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        SignalMultiplierTagType.Application application = SignalMultiplierTagType.Companion;
        java.lang.String strCopydefault = gemItem.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        SignalMultiplierTagType signalMultiplierTagTypeKWHzl = application.KWHzl(strCopydefault);
        if (signalMultiplierTagTypeKWHzl == null) {
            return null;
        }
        java.lang.String strAEQbTJ = gemItem.AEQbTJ();
        return new C29295kqu(strAYXKKw, strDjBIcL, strAhwBna, strGEmmrt, strKWHzl, strOLrzqt, strEZpvd, new SignalMultiplierTagUiModel(signalMultiplierTagTypeKWHzl, strAEQbTJ != null ? strAEQbTJ : ""));
    }
}
