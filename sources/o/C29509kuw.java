package o;

import com.okinc.business.market.data.model.CoinRankingWsData;
import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.smart_money.SignalOverview;
import com.okinc.business.market.data.model.smart_money.SignalOverviewResponse;
import com.okinc.business.market.features.smart_money.signal.domain.GetSingleSignalOverviewUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSingleSignalOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSingleSignalOverviewUseCase$stopTokenUpdatesWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29509kuw {
    public final CoroutineDispatcher AEQbTJ;
    public final CoroutineScope AhwBna;
    public final InterfaceC29466kuF EZpvd;
    public final StateFlow<CoinRankingWsData> KWHzl;
    public final C29474kuN OLrzqt;
    public final MutableStateFlow<CoinRankingWsData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<CoinRankingWsData> AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C29509kuw(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29474kuN c29474kuN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29474kuN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC29466kuF;
        this.OLrzqt = c29474kuN;
        this.AEQbTJ = coroutineDispatcher;
        this.AhwBna = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        MutableStateFlow<CoinRankingWsData> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<SignalOverviewUiModel>> continuation) throws java.lang.Throwable {
        GetSingleSignalOverviewUseCase$invoke$1 getSingleSignalOverviewUseCase$invoke$1;
        if (continuation instanceof GetSingleSignalOverviewUseCase$invoke$1) {
            getSingleSignalOverviewUseCase$invoke$1 = (GetSingleSignalOverviewUseCase$invoke$1) continuation;
            int i = getSingleSignalOverviewUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSingleSignalOverviewUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSingleSignalOverviewUseCase$invoke$1 = new GetSingleSignalOverviewUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSingleSignalOverviewUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSingleSignalOverviewUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetSingleSignalOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 getSingleSignalOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new GetSingleSignalOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            getSingleSignalOverviewUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSingleSignalOverviewUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, getSingleSignalOverviewUseCase$invoke$1);
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

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd();
        C25389ivm.safeLaunch$default(this.AhwBna, this.AEQbTJ, null, new GetSingleSignalOverviewUseCase$subscribeTokenUpdatesWs$1(this, str, str2, null), 2, null);
    }

    public final void EZpvd() {
        JobKt__JobKt.cancelChildren$default(this.AhwBna.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
        C25389ivm.safeLaunch$default(this.AhwBna, null, null, new GetSingleSignalOverviewUseCase$stopTokenUpdatesWs$1(this, null), 3, null);
    }

    public final java.util.List<SignalOverviewUiModel> KWHzl(SignalOverviewResponse signalOverviewResponse) {
        java.util.List<SignalOverview> listAEQbTJ = signalOverviewResponse.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SignalOverview signalOverview : listAEQbTJ) {
            TokenInfo tokenInfo = signalOverviewResponse.KWHzl().get(signalOverview.fetchVPNInfo());
            SignalOverviewUiModel signalOverviewUiModelMapSignalOverviewToUiModel$default = (tokenInfo == null || signalOverview.valueOf().isEmpty()) ? null : C29474kuN.mapSignalOverviewToUiModel$default(this.OLrzqt, signalOverview, tokenInfo, null, 4, null);
            if (signalOverviewUiModelMapSignalOverviewToUiModel$default != null) {
                arrayList.add(signalOverviewUiModelMapSignalOverviewToUiModel$default);
            }
        }
        return arrayList;
    }
}
