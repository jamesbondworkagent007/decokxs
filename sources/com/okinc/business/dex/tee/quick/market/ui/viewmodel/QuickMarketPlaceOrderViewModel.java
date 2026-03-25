package com.okinc.business.dex.tee.quick.market.ui.viewmodel;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.TransactionType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30503lcQ;
import o.AbstractC33073mpa;
import o.C19699gMa;
import o.C19700gMb;
import o.C19703gMe;
import o.C19750gNy;
import o.C22380heK;
import o.C28165kRh;
import o.C31200lpY;
import o.InterfaceC25414iwK;
import o.InterfaceC28149kQs;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.gLQ;
import o.kTW;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class QuickMarketPlaceOrderViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final kTW AYXKKw;
    public final MutableSharedFlow<SignAndBroadcastRes> AhwBna;
    public final StateFlow<Boolean> AkhnZx;
    public final String AuCTel;
    public final InterfaceC25414iwK DbNXlk;
    public final MutableStateFlow<AbstractC30503lcQ> EZpvd;
    public final MutableSharedFlow<String> OLrzqt;
    public final MutableStateFlow<String> copydefault;
    public final MutableStateFlow<TransactionType> djBIcL;
    public final SharedFlow<SignAndBroadcastRes> ejfBZ;
    public final SharedFlow<String> fARcdN;
    public final StateFlow<Boolean> fIwbmz;
    public final OrderRetryHelper fJNWhG;
    public final StateFlow<AbstractC30503lcQ> fetchVPNInfo;
    public final InterfaceC28149kQs gEmmrt;
    public final C19699gMa getFieldNames;
    public final C19700gMb hDKMBd;
    public final MutableStateFlow<Boolean> isConnected;
    public final C19750gNy uzCIH;
    public final C28165kRh valueOf;
    public final C19703gMe values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AEQbTJ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<SignAndBroadcastRes> copydefault() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> djBIcL() {
        return this.AkhnZx;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.quick.market.ui.viewmodel.QuickMarketPlaceOrderViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @yCM
    public QuickMarketPlaceOrderViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C19750gNy c19750gNy, @NotNull C19700gMb c19700gMb, @NotNull C19703gMe c19703gMe, @NotNull InterfaceC28149kQs interfaceC28149kQs, @NotNull C28165kRh c28165kRh, @NotNull C19699gMa c19699gMa, @NotNull kTW ktw, @NotNull InterfaceC25414iwK interfaceC25414iwK) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c19750gNy, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(interfaceC28149kQs, "");
        Intrinsics.checkNotNullParameter(c28165kRh, "");
        Intrinsics.checkNotNullParameter(c19699gMa, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        this.uzCIH = c19750gNy;
        this.hDKMBd = c19700gMb;
        this.values = c19703gMe;
        this.gEmmrt = interfaceC28149kQs;
        this.valueOf = c28165kRh;
        this.getFieldNames = c19699gMa;
        this.AYXKKw = ktw;
        this.DbNXlk = interfaceC25414iwK;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.AEQbTJ = MutableStateFlow;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<String> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<SignAndBroadcastRes> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AhwBna = mutableSharedFlowMutableSharedFlow$default2;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.AuCTel = C31200lpY.getSourceType$default(savedStateHandle, (String) null, 1, (Object) null);
        MutableStateFlow<AbstractC30503lcQ> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC30503lcQ.Activity.AEQbTJ);
        this.EZpvd = MutableStateFlow2;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow2);
        this.copydefault = StateFlowKt.MutableStateFlow("");
        MutableStateFlow<TransactionType> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = MutableStateFlow3;
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(bool);
        this.isConnected = MutableStateFlow4;
        this.fJNWhG = new OrderRetryHelper("QuickMarketPlaceOrderViewModel");
        this.AkhnZx = FlowKt.stateIn(FlowKt.combine(MutableStateFlow4, MutableStateFlow3, new QuickMarketPlaceOrderViewModel$isAutoSellVisible$1(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), bool);
        valueOf();
    }

    public final void OLrzqt(boolean z) {
        this.AEQbTJ.setValue(Boolean.valueOf(z));
    }

    public final boolean copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getFieldNames.KWHzl(str);
    }

    public final String KWHzl() {
        return this.hDKMBd.isConnected();
    }

    public final String EZpvd() {
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.hDKMBd.KWHzl();
        String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.hDKMBd.KWHzl(str);
    }

    public static /* synthetic */ void submitPlaceOrderV6$default(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        quickMarketPlaceOrderViewModel.AEQbTJ(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z);
    }

    public final void AEQbTJ(@NotNull TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z) {
        Intrinsics.checkNotNullParameter(teeMarketPlaceOrderParams, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.AEQbTJ.setValue(Boolean.TRUE);
        if (z) {
            pUU.KWHzl("QuickMarketPlaceOrderViewModel", "submitPlaceOrderV6 forceManualSign requested");
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new QuickMarketPlaceOrderViewModel$submitPlaceOrderV6$1(this, teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z, null), 3, null);
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new QuickMarketPlaceOrderViewModel$subscribeAutoSellVisibility$1(this, null), 3, null);
    }

    public static /* synthetic */ void updateAutoSell$default(QuickMarketPlaceOrderViewModel quickMarketPlaceOrderViewModel, AbstractC30503lcQ abstractC30503lcQ, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        quickMarketPlaceOrderViewModel.AEQbTJ(abstractC30503lcQ, z);
    }

    public final void AEQbTJ(@NotNull AbstractC30503lcQ abstractC30503lcQ, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC30503lcQ, "");
        this.EZpvd.setValue(abstractC30503lcQ);
        if (z) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new QuickMarketPlaceOrderViewModel$updateAutoSell$1(abstractC30503lcQ, this, null), 3, null);
        }
    }

    public final boolean OLrzqt(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        Boolean boolValueOf = defiChainInfo != null ? Boolean.valueOf(defiChainInfo.getSupportSmartAccount()) : null;
        gLQ glqAEQbTJ = this.values.AEQbTJ(str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
        return this.hDKMBd.djBIcL() && glqAEQbTJ != null && glqAEQbTJ.AEQbTJ();
    }

    public final gLQ EZpvd(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = C22380heK.OLrzqt.copydefault(this.AuCTel).AkhnZx().EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DefiChainInfo) next).getChainId(), (Object) str)) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        Boolean boolValueOf = defiChainInfo != null ? Boolean.valueOf(defiChainInfo.getSupportSmartAccount()) : null;
        return this.values.AEQbTJ(str, boolValueOf != null ? boolValueOf.booleanValue() : false, false);
    }

    public final boolean gEmmrt() {
        return this.DbNXlk.valueOf();
    }
}
