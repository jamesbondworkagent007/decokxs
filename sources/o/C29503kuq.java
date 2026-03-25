package o;

import com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$stopWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$2;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalActivityListUseCase$subscribeWs$3;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29503kuq {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C29474kuN AEQbTJ;
    public final CoroutineScope AYXKKw;
    public C29481kuU AhwBna;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC29466kuF OLrzqt;
    public final MutableStateFlow<java.util.List<SignalUiModel>> copydefault;
    public final StateFlow<java.util.List<SignalUiModel>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<SignalUiModel>> AEQbTJ() {
        return this.gEmmrt;
    }

    @yCM
    public C29503kuq(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29474kuN c29474kuN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29474kuN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC29466kuF;
        this.AEQbTJ = c29474kuN;
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<java.util.List<SignalUiModel>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX INFO: renamed from: o.kuq$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kuq.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void EZpvd() {
        this.copydefault.setValue(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull C29481kuU c29481kuU, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        GetSignalActivityListUseCase$invoke$1 getSignalActivityListUseCase$invoke$1;
        if (continuation instanceof GetSignalActivityListUseCase$invoke$1) {
            getSignalActivityListUseCase$invoke$1 = (GetSignalActivityListUseCase$invoke$1) continuation;
            int i = getSignalActivityListUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalActivityListUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalActivityListUseCase$invoke$1 = new GetSignalActivityListUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalActivityListUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalActivityListUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            this.AhwBna = c29481kuU;
            boolean z = str.length() == 0;
            SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequestEZpvd = SignalOverviewOrActivityListRequest.Companion.EZpvd(str2, 10, c29481kuU);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 getSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1 = new GetSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1(null, this, signalOverviewOrActivityListRequestEZpvd, z, list);
            getSignalActivityListUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalActivityListUseCase$invokeyxL6bBk$$inlined$dexRunCatching$1, getSignalActivityListUseCase$invoke$1);
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

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kuq */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8672invokeyxL6bBk$default(C29503kuq c29503kuq, java.util.List list, java.lang.String str, java.lang.String str2, C29481kuU c29481kuU, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        return c29503kuq.copydefault(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, c29481kuU, continuation);
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.AYXKKw, null, null, new GetSignalActivityListUseCase$subscribeWs$1(this, null), 3, null);
        if (list.isEmpty()) {
            return;
        }
        C25389ivm.safeLaunch$default(this.AYXKKw, this.KWHzl, null, new GetSignalActivityListUseCase$subscribeWs$2(this, list, null), 2, null);
        C25389ivm.safeLaunch$default(this.AYXKKw, this.KWHzl, null, new GetSignalActivityListUseCase$subscribeWs$3(this, list, null), 2, null);
    }

    public final void copydefault() {
        JobKt__JobKt.cancelChildren$default(this.AYXKKw.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.AYXKKw, null, null, new GetSignalActivityListUseCase$stopWs$1(this, null), 3, null);
    }
}
