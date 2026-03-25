package com.okinc.business.dex.tee.common.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30510lcX;
import o.AbstractC43419rot;
import o.C19700gMb;
import o.C19703gMe;
import o.C28165kRh;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25414iwK;
import o.InterfaceC28149kQs;
import o.InterfaceC9738bbJ;
import o.gLQ;
import o.kUP;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TradeAutoSellViewModel extends ViewModel {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final StateFlow<AbstractC30510lcX> AEQbTJ;
    public final InterfaceC25414iwK AYXKKw;
    public final C28165kRh KWHzl;
    public final MutableStateFlow<AbstractC30510lcX> OLrzqt;
    public final InterfaceC28149kQs copydefault;
    public final C19703gMe djBIcL;
    public final C19700gMb gEmmrt;
    public final kUP valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19700gMb AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC30510lcX> EZpvd() {
        return this.AEQbTJ;
    }

    @yCM
    public TradeAutoSellViewModel(@NotNull InterfaceC28149kQs interfaceC28149kQs, @NotNull C19700gMb c19700gMb, @NotNull C19703gMe c19703gMe, @NotNull C28165kRh c28165kRh, @NotNull kUP kup, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(interfaceC28149kQs, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c28165kRh, "");
        Intrinsics.checkNotNullParameter(kup, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.copydefault = interfaceC28149kQs;
        this.gEmmrt = c19700gMb;
        this.djBIcL = c19703gMe;
        this.KWHzl = c28165kRh;
        this.valueOf = kup;
        this.AYXKKw = interfaceC25414iwK;
        MutableStateFlow<AbstractC30510lcX> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC30510lcX.TaskDescription.EZpvd);
        this.OLrzqt = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.viewmodel.TradeAutoSellViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeAutoSellViewModel$restoreAutoSellCheckboxState$1(this, str, null), 3, null);
    }

    public final boolean AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.gEmmrt.KWHzl();
        return interfaceC9738bbJKWHzl == null || interfaceC9738bbJKWHzl.zsXlph() || interfaceC9738bbJKWHzl.QfsBiF() || !copydefault(interfaceC9738bbJKWHzl, str);
    }

    public final boolean copydefault(InterfaceC9738bbJ interfaceC9738bbJ, String str) {
        return interfaceC9738bbJ.gEmmrt(C33129mqd.valueOf(str)) && interfaceC9738bbJ.djSkpj();
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeAutoSellViewModel$updateAutoSellState$1(this, str, null), 3, null);
    }

    public final void EZpvd(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new TradeAutoSellViewModel$autoSellCheckboxToggled$1(this, z, str, null), 3, null);
    }

    public final Object KWHzl(@NotNull Continuation<? super List<? extends AdvancedAutoSellStrategy>> continuation) {
        return BuildersKt.withContext(ViewModelKt.getViewModelScope(this).getCoroutineContext(), new TradeAutoSellViewModel$getStrategies$2(this, null), continuation);
    }

    public final boolean OLrzqt() {
        return this.AYXKKw.valueOf();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        TradeAutoSellViewModel$isSAActiveAndSupportedForChain$1 tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1;
        TradeAutoSellViewModel tradeAutoSellViewModel;
        Boolean boolKWHzl;
        boolean z;
        if (continuation instanceof TradeAutoSellViewModel$isSAActiveAndSupportedForChain$1) {
            tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1 = (TradeAutoSellViewModel$isSAActiveAndSupportedForChain$1) continuation;
            int i = tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1 = new TradeAutoSellViewModel$isSAActiveAndSupportedForChain$1(this, continuation);
            }
        }
        Object objKWHzl = tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            kUP kup = this.valueOf;
            tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.L$0 = this;
            tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.L$1 = str;
            tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.label = 1;
            objKWHzl = kup.KWHzl(tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            tradeAutoSellViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.L$1;
            tradeAutoSellViewModel = (TradeAutoSellViewModel) tradeAutoSellViewModel$isSAActiveAndSupportedForChain$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        List<DefiChainInfo> list = (List) ((AbstractC43419rot) objKWHzl).copydefault();
        if (list == null) {
            boolKWHzl = null;
        } else if (!list.isEmpty()) {
            for (DefiChainInfo defiChainInfo : list) {
                if (Intrinsics.EZpvd((Object) defiChainInfo.getChainId(), (Object) str) && defiChainInfo.getSupportSmartAccount()) {
                    z = true;
                    break;
                }
            }
            z = false;
            boolKWHzl = C56443yFo.KWHzl(z);
        } else {
            z = false;
            boolKWHzl = C56443yFo.KWHzl(z);
        }
        gLQ glqAEQbTJ = tradeAutoSellViewModel.djBIcL.AEQbTJ(str, boolKWHzl != null ? boolKWHzl.booleanValue() : false, false);
        return C56443yFo.KWHzl(tradeAutoSellViewModel.gEmmrt.djBIcL() && glqAEQbTJ != null && glqAEQbTJ.AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull String str, @NotNull Continuation<? super gLQ> continuation) throws Throwable {
        TradeAutoSellViewModel$getSmartAccountState$1 tradeAutoSellViewModel$getSmartAccountState$1;
        TradeAutoSellViewModel tradeAutoSellViewModel;
        Boolean boolKWHzl;
        if (continuation instanceof TradeAutoSellViewModel$getSmartAccountState$1) {
            tradeAutoSellViewModel$getSmartAccountState$1 = (TradeAutoSellViewModel$getSmartAccountState$1) continuation;
            int i = tradeAutoSellViewModel$getSmartAccountState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradeAutoSellViewModel$getSmartAccountState$1.label = i - Integer.MIN_VALUE;
            } else {
                tradeAutoSellViewModel$getSmartAccountState$1 = new TradeAutoSellViewModel$getSmartAccountState$1(this, continuation);
            }
        }
        Object objKWHzl = tradeAutoSellViewModel$getSmartAccountState$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradeAutoSellViewModel$getSmartAccountState$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            kUP kup = this.valueOf;
            tradeAutoSellViewModel$getSmartAccountState$1.L$0 = this;
            tradeAutoSellViewModel$getSmartAccountState$1.L$1 = str;
            tradeAutoSellViewModel$getSmartAccountState$1.label = 1;
            objKWHzl = kup.KWHzl(tradeAutoSellViewModel$getSmartAccountState$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            tradeAutoSellViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) tradeAutoSellViewModel$getSmartAccountState$1.L$1;
            tradeAutoSellViewModel = (TradeAutoSellViewModel) tradeAutoSellViewModel$getSmartAccountState$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        List<DefiChainInfo> list = (List) ((AbstractC43419rot) objKWHzl).copydefault();
        if (list == null) {
            boolKWHzl = null;
        } else if (!list.isEmpty()) {
            for (DefiChainInfo defiChainInfo : list) {
                if (Intrinsics.EZpvd((Object) defiChainInfo.getChainId(), (Object) str) && defiChainInfo.getSupportSmartAccount()) {
                    break;
                }
            }
            z = false;
            boolKWHzl = C56443yFo.KWHzl(z);
        } else {
            z = false;
            boolKWHzl = C56443yFo.KWHzl(z);
        }
        gLQ glqAEQbTJ = tradeAutoSellViewModel.djBIcL.AEQbTJ(str, boolKWHzl != null ? boolKWHzl.booleanValue() : false, false);
        return glqAEQbTJ == null ? gLQ.Dialog.OLrzqt : glqAEQbTJ;
    }

    public final void KWHzl() {
        MutableStateFlow<AbstractC30510lcX> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), AbstractC30510lcX.TaskDescription.EZpvd)) {
        }
    }
}
