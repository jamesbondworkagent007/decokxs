package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$fetchAndAddBoostData$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$observeQuoteAndTPSL$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$restoreCheckboxState$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$subscribeTeeStatus$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$updateAutoSell$2;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1;
import com.okinc.business.trade.features.home.ui.ConfirmOrderTag;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30503lcQ;
import o.InterfaceC30595leC;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28227kTp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final kRE AEQbTJ;
    public final C19757gOe AYXKKw;
    public Function1<? super java.lang.String, java.lang.Boolean> AhwBna;
    public final C19700gMb AkhnZx;
    public Function2<? super AbstractC30503lcQ, ? super Continuation<? super InterfaceC30595leC>, ? extends java.lang.Object> DbNXlk;
    public final MutableStateFlow<java.lang.Boolean> EZpvd;
    public final MutableStateFlow<C30457lbX> KWHzl;
    public final MutableStateFlow<AbstractC30503lcQ> copydefault;
    public final StateFlow<AbstractC30503lcQ> djBIcL;
    public final C28160kRc fetchVPNInfo;
    public final InterfaceC28149kQs gEmmrt;
    public final C23212htv isConnected;
    public final StateFlow<C30457lbX> valueOf;
    public Function2<? super java.lang.Boolean, ? super Continuation<? super InterfaceC30595leC>, ? extends java.lang.Object> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>, kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> */
    public final Function1<java.lang.String, java.lang.Boolean> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function2<? super AbstractC30503lcQ, ? super Continuation<? super InterfaceC30595leC>, ? extends java.lang.Object> function2) {
        this.DbNXlk = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC30503lcQ> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function2<? super java.lang.Boolean, ? super Continuation<? super InterfaceC30595leC>, ? extends java.lang.Object> function2) {
        this.values = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super kotlin.coroutines.Continuation<? super o.leC>, ? extends java.lang.Object>, kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super o.leC>, java.lang.Object> */
    public final Function2<java.lang.Boolean, Continuation<? super InterfaceC30595leC>, java.lang.Object> KWHzl() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super o.lcQ, ? super kotlin.coroutines.Continuation<? super o.leC>, ? extends java.lang.Object>, kotlin.jvm.functions.Function2<o.lcQ, kotlin.coroutines.Continuation<? super o.leC>, java.lang.Object> */
    public final Function2<AbstractC30503lcQ, Continuation<? super InterfaceC30595leC>, java.lang.Object> OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C30457lbX> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super java.lang.String, java.lang.Boolean> function1) {
        this.AhwBna = function1;
    }

    @yCM
    public C28227kTp(@NotNull InterfaceC28149kQs interfaceC28149kQs, @NotNull C19700gMb c19700gMb, @NotNull C19757gOe c19757gOe, @NotNull kRE kre, @NotNull C28160kRc c28160kRc, @NotNull C23212htv c23212htv) {
        Intrinsics.checkNotNullParameter(interfaceC28149kQs, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19757gOe, "");
        Intrinsics.checkNotNullParameter(kre, "");
        Intrinsics.checkNotNullParameter(c28160kRc, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        this.gEmmrt = interfaceC28149kQs;
        this.AkhnZx = c19700gMb;
        this.AYXKKw = c19757gOe;
        this.AEQbTJ = kre;
        this.fetchVPNInfo = c28160kRc;
        this.isConnected = c23212htv;
        MutableStateFlow<AbstractC30503lcQ> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC30503lcQ.Activity.AEQbTJ);
        this.copydefault = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        MutableStateFlow<C30457lbX> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C30457lbX(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null));
        this.KWHzl = MutableStateFlow2;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* JADX INFO: renamed from: o.kTp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final StateFlow<java.lang.Boolean> KWHzl(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<? extends AdvancedOrderType> stateFlow, @NotNull StateFlow<? extends AdvancedTradeType> stateFlow2, @NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(stateFlow2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return FlowKt.stateIn(FlowKt.combine(this.EZpvd, stateFlow, stateFlow2, new AdvancedAutoSellDelegate$createAutoSellVisibleFlow$1(function0, null)), coroutineScope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), java.lang.Boolean.FALSE);
    }

    public static /* synthetic */ void updateAutoSell$default(C28227kTp c28227kTp, CoroutineScope coroutineScope, AbstractC30503lcQ abstractC30503lcQ, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        c28227kTp.AEQbTJ(coroutineScope, abstractC30503lcQ, z);
    }

    public final void copydefault(@NotNull CoroutineScope coroutineScope, java.lang.String str, @NotNull Function1<? super InterfaceC30595leC, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$restoreCheckboxState$1(this, str, function1, null), 3, null);
    }

    public final void copydefault(@NotNull CoroutineScope coroutineScope, boolean z, @NotNull Function1<? super InterfaceC30595leC, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$updateMarketTpSlSupportStatus$1(this, function1, z, null), 3, null);
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<? extends AdvancedAutoSellStrategy>> continuation) {
        return this.gEmmrt.OLrzqt(continuation);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return this.gEmmrt.KWHzl(continuation);
    }

    public final boolean EZpvd(InterfaceC30595leC interfaceC30595leC, boolean z) {
        return z && (this.djBIcL.getValue() instanceof AbstractC30503lcQ.StateListAnimator) && (interfaceC30595leC == null || !(interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper) || (((InterfaceC30595leC.ContextWrapper) interfaceC30595leC).OLrzqt() instanceof gLQ.Application));
    }

    public final java.util.List<AdvancedAutoSellStrategy> KWHzl(boolean z) {
        AbstractC30503lcQ value = this.copydefault.getValue();
        AbstractC30503lcQ.StateListAnimator stateListAnimator = value instanceof AbstractC30503lcQ.StateListAnimator ? (AbstractC30503lcQ.StateListAnimator) value : null;
        java.util.List<AdvancedAutoSellStrategy> listKWHzl = stateListAnimator != null ? stateListAnimator.KWHzl() : null;
        if (z) {
            return listKWHzl;
        }
        return null;
    }

    public final void OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull Function1<? super InterfaceC30595leC, Unit> function1, @NotNull Function1<? super AbstractC30503lcQ, Unit> function12, @NotNull Function0<? extends InterfaceC30595leC> function0) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$subscribeTeeStatus$1(this, function1, function0, function12, null), 3, null);
    }

    public final void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<java.lang.Boolean> stateFlow, @NotNull Function2<? super AbstractC30503lcQ, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(function2, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$subscribeAutoSellVisibility$1(stateFlow, this, function2, null), 3, null);
    }

    public final void OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull StateFlow<AdvancedQuoteUiData> stateFlow, @NotNull StateFlow<C30808liD> stateFlow2, @NotNull StateFlow<? extends AdvancedTradeType> stateFlow3, @NotNull StateFlow<DexMultiTokenInfoBean> stateFlow4, @NotNull StateFlow<DexMultiTokenInfoBean> stateFlow5, @NotNull StateFlow<java.lang.String> stateFlow6, @NotNull StateFlow<java.lang.Boolean> stateFlow7, @NotNull StateFlow<? extends AdvancedLimitBy> stateFlow8, @NotNull StateFlow<C28222kTk> stateFlow9, @NotNull Function0<java.lang.String> function0, @NotNull Function1<? super C30808liD, java.lang.String> function1, @NotNull Function0<java.lang.Boolean> function02, @NotNull Function0<java.lang.Boolean> function03) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(stateFlow, "");
        Intrinsics.checkNotNullParameter(stateFlow2, "");
        Intrinsics.checkNotNullParameter(stateFlow3, "");
        Intrinsics.checkNotNullParameter(stateFlow4, "");
        Intrinsics.checkNotNullParameter(stateFlow5, "");
        Intrinsics.checkNotNullParameter(stateFlow6, "");
        Intrinsics.checkNotNullParameter(stateFlow7, "");
        Intrinsics.checkNotNullParameter(stateFlow8, "");
        Intrinsics.checkNotNullParameter(stateFlow9, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$observeQuoteAndTPSL$1(stateFlow, this, stateFlow2, stateFlow3, stateFlow8, function0, stateFlow9, function1, function02, stateFlow4, stateFlow6, stateFlow7, coroutineScope, stateFlow5, function03, null), 3, null);
    }

    public final void AEQbTJ(@NotNull CoroutineScope coroutineScope, AdvancedQuoteAndCallData advancedQuoteAndCallData, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        if (advancedQuoteAndCallData == null) {
            return;
        }
        if (this.AYXKKw.KWHzl(z ? null : advancedQuoteAndCallData.OLrzqt())) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$fetchAndAddBoostData$1(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, advancedQuoteAndCallData, z, this, null), 3, null);
            return;
        }
        C30457lbX value = this.KWHzl.getValue();
        java.util.List<C30516lcd> listEZpvd = value.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listEZpvd) {
            if (((C30516lcd) obj).OLrzqt() != ConfirmOrderTag.BOOST) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != value.EZpvd().size()) {
            this.KWHzl.setValue(value.copydefault((8159 & 1) != 0 ? value.EZpvd : null, (8159 & 2) != 0 ? value.OLrzqt : null, (8159 & 4) != 0 ? value.AYXKKw : null, (8159 & 8) != 0 ? value.DbNXlk : null, (8159 & 16) != 0 ? value.djBIcL : null, (8159 & 32) != 0 ? value.AEQbTJ : arrayList, (8159 & 64) != 0 ? value.fetchVPNInfo : null, (8159 & 128) != 0 ? value.KWHzl : null, (8159 & 256) != 0 ? value.gEmmrt : null, (8159 & 512) != 0 ? value.AhwBna : null, (8159 & 1024) != 0 ? value.copydefault : null, (8159 & 2048) != 0 ? value.values : null, (8159 & 4096) != 0 ? value.valueOf : null));
        }
    }

    public final void KWHzl(C30457lbX c30457lbX) {
        java.util.List<AdvancedAutoSellStrategy> listCopydefault = c30457lbX.copydefault();
        pUU.KWHzl("AutoSellDelegate", "observeQuoteAndTPSL: hasAutoSellStrategies=" + (listCopydefault == null || listCopydefault.isEmpty()));
    }

    public final void AEQbTJ(@NotNull CoroutineScope coroutineScope, @NotNull AbstractC30503lcQ abstractC30503lcQ, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        MutableStateFlow<AbstractC30503lcQ> mutableStateFlow = this.copydefault;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), abstractC30503lcQ)) {
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AdvancedAutoSellDelegate$updateAutoSell$2(this, abstractC30503lcQ, z, null), 3, null);
    }
}
