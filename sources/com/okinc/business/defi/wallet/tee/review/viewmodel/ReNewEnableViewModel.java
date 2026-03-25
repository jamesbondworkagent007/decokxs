package com.okinc.business.defi.wallet.tee.review.viewmodel;

import androidx.compose.material3.CalendarModelKt;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeUpgradeStatus;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.common.model.TeeCommand;
import com.okinc.business.defi.wallet.tee.common.model.TeeType;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.business.dex.api.bean.OrderStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC12782ctV;
import o.AbstractC33073mpa;
import o.C10854bwM;
import o.C10954byG;
import o.C17871fVj;
import o.C17916fXa;
import o.C17922fXg;
import o.C33129mqd;
import o.C43248rlh;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56529yIt;
import o.InterfaceC9738bbJ;
import o.fTG;
import o.fWU;
import o.fWX;
import o.gKO;
import o.gKU;
import o.gKV;
import o.pTA;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ReNewEnableViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<StateListAnimator> AEQbTJ;
    public final MutableStateFlow<fWX> AYXKKw;
    public final MutableStateFlow<Boolean> AhwBna;
    public final StateFlow<String> AkhnZx;
    public String AuCTel;
    public final StateFlow<Activity> AuCTelauCTel;
    public final Function1<List<TeeOperateSuccessState>, Unit> AubY;
    public String AwvSrB;
    public SingleTeeStatus AxsJAY;
    public int DTwDnp;
    public CoroutineDispatcher DbNXlk;
    public final MutableStateFlow<Activity> EZpvd;
    public final MutableStateFlow<String> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final StateFlow<Activity.TaskDescription> ORxRYg;
    public Job OcIXYQ;
    public boolean QKVWgx;
    public final StateFlow<TeeMetadata> QOLQEE;
    public List<Long> QUSxYX;
    public Map<String, String> QVAiDq;
    public AbstractC12782ctV QbewEr;
    public final Function0<Unit> QfsBiF;
    public final Function1<List<TeeOperateSuccessState>, Unit> RJOkX;
    public final MutableStateFlow<ActionBar> copydefault;
    public final MutableStateFlow<TeeMetadata> djBIcL;
    public final Function1<List<TeeOperateSuccessState>, Unit> ejfBZ;
    public CoroutineDispatcher fARcdN;
    public List<Long> fIwbmz;
    public final C17871fVj fJNWhG;
    public final StateFlow<ActionBar> fetchVPNInfo;
    public final MutableStateFlow<Activity.TaskDescription> gEmmrt;
    public final StateFlow<Boolean> gHZMYf;
    public final StateFlow<Boolean> getFieldNames;
    public String getNewProxyInstance;
    public final Function0<Unit> hDKMBd;
    public final Function0<Unit> isConnected;
    public final fWU iwGUEr;
    public final C17916fXa sSMYrx;
    public final fTG uzCIH;
    public final MutableStateFlow<Integer> valueOf;
    public final StateFlow<StateListAnimator> values;
    public final StateFlow<Integer> wlaJM;
    public final Function1<TeeOperateSuccessState, Unit> zLjUOn;
    public final StateFlow<fWX> zsXlph;
    public TeeMetadata zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AhwBna() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Integer> AkhnZx() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity.TaskDescription> DbNXlk() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TeeMetadata> fetchVPNInfo() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineDispatcher gEmmrt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> isConnected() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Activity> valueOf() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<fWX> values() {
        return this.zsXlph;
    }

    @yCM
    public ReNewEnableViewModel(@NotNull fWU fwu, @NotNull C17871fVj c17871fVj, @NotNull fTG ftg, @NotNull C17916fXa c17916fXa) {
        Intrinsics.checkNotNullParameter(fwu, "");
        Intrinsics.checkNotNullParameter(c17871fVj, "");
        Intrinsics.checkNotNullParameter(ftg, "");
        Intrinsics.checkNotNullParameter(c17916fXa, "");
        this.iwGUEr = fwu;
        this.fJNWhG = c17871fVj;
        this.uzCIH = ftg;
        this.sSMYrx = c17916fXa;
        this.DbNXlk = Dispatchers.getDefault();
        this.fARcdN = Dispatchers.getIO();
        this.QUSxYX = yDY.AhwBna();
        this.QVAiDq = C56424yEw.KWHzl();
        this.getNewProxyInstance = "";
        this.fIwbmz = new ArrayList();
        this.AuCTel = "";
        this.AwvSrB = "";
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.KWHzl = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<StateListAnimator> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new StateListAnimator(15, false, false, null, 12, null));
        this.AEQbTJ = MutableStateFlow2;
        this.values = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Integer> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.valueOf = MutableStateFlow3;
        this.wlaJM = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Activity> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow4;
        this.AuCTelauCTel = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Activity.TaskDescription> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.gEmmrt = MutableStateFlow5;
        this.ORxRYg = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<ActionBar> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow6;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<fWX> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow7;
        this.zsXlph = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<Boolean> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow8;
        this.getFieldNames = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AhwBna = MutableStateFlow9;
        this.gHZMYf = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<TeeMetadata> MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = MutableStateFlow10;
        this.QOLQEE = FlowKt.asStateFlow(MutableStateFlow10);
        this.zLjUOn = new Function1() { // from class: o.fWK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReNewEnableViewModel.copydefault(this.AEQbTJ, (TeeOperateSuccessState) obj);
            }
        };
        this.AubY = new Function1() { // from class: o.fWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReNewEnableViewModel.copydefault(this.EZpvd, (java.util.List) obj);
            }
        };
        this.hDKMBd = new Function0() { // from class: o.fWM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ReNewEnableViewModel.zuBGHE(this.OLrzqt);
            }
        };
        this.RJOkX = new Function1() { // from class: o.fWL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReNewEnableViewModel.valueOf(this.AEQbTJ, (java.util.List) obj);
            }
        };
        this.QfsBiF = new Function0() { // from class: o.fWI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ReNewEnableViewModel.AwvSrB(this.EZpvd);
            }
        };
        this.ejfBZ = new Function1() { // from class: o.fWN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReNewEnableViewModel.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        };
        this.isConnected = new Function0() { // from class: o.fWQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ReNewEnableViewModel.gHZMYf(this.AEQbTJ);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String hDKMBd() {
        if (this.fIwbmz.size() > 5) {
            C17916fXa c17916fXa = this.sSMYrx;
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) this.fIwbmz, 5);
            ArrayList arrayList = new ArrayList();
            Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                String strDjBIcL = this.QVAiDq.get(String.valueOf(jLongValue));
                if (strDjBIcL == null) {
                    C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(jLongValue);
                    strDjBIcL = c10854bwMCopydefault != null ? c10854bwMCopydefault.djBIcL() : null;
                }
                if (strDjBIcL != null) {
                    arrayList.add(strDjBIcL);
                }
            }
            return c17916fXa.AEQbTJ(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        }
        List<Long> list = this.fIwbmz;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = ((Number) it2.next()).longValue();
            String strDjBIcL2 = this.QVAiDq.get(String.valueOf(jLongValue2));
            if (strDjBIcL2 == null) {
                C10854bwM c10854bwMCopydefault2 = C10954byG.EZpvd.valueOf().copydefault(jLongValue2);
                strDjBIcL2 = c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.djBIcL() : null;
            }
            if (strDjBIcL2 != null) {
                arrayList2.add(strDjBIcL2);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null);
    }

    private final boolean uzCIH() {
        return C33129mqd.AEQbTJ(this.AwvSrB, "0");
    }

    public static final Unit copydefault(ReNewEnableViewModel reNewEnableViewModel, TeeOperateSuccessState teeOperateSuccessState) {
        Intrinsics.checkNotNullParameter(teeOperateSuccessState, "");
        reNewEnableViewModel.copydefault(teeOperateSuccessState.getAutoRenew(), teeOperateSuccessState.getExpireTimestamp());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ReNewEnableViewModel reNewEnableViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TeeOperateSuccessState teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (teeOperateSuccessState != null) {
            reNewEnableViewModel.copydefault(teeOperateSuccessState.getAutoRenew(), teeOperateSuccessState.getExpireTimestamp());
        }
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(ReNewEnableViewModel reNewEnableViewModel) {
        reNewEnableViewModel.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ReNewEnableViewModel reNewEnableViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        reNewEnableViewModel.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(ReNewEnableViewModel reNewEnableViewModel) {
        reNewEnableViewModel.fARcdN();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ReNewEnableViewModel reNewEnableViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TeeOperateSuccessState teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (teeOperateSuccessState != null) {
            reNewEnableViewModel.copydefault(teeOperateSuccessState.getAutoRenew(), teeOperateSuccessState.getExpireTimestamp(), !(reNewEnableViewModel.copydefault.getValue() instanceof ActionBar.Activity));
        }
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(ReNewEnableViewModel reNewEnableViewModel) {
        reNewEnableViewModel.iwGUEr();
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iwGUEr.EZpvd(str);
        this.EZpvd.setValue(Activity.StateListAnimator.AEQbTJ);
        fJNWhG();
    }

    public final void AEQbTJ(int i, boolean z) {
        if (this.AEQbTJ.getValue().copydefault() == i && this.AEQbTJ.getValue().EZpvd() == z) {
            return;
        }
        MutableStateFlow<StateListAnimator> mutableStateFlow = this.AEQbTJ;
        mutableStateFlow.setValue(new StateListAnimator(i, z, true, mutableStateFlow.getValue().KWHzl()));
    }

    public static /* synthetic */ void confirm$default(ReNewEnableViewModel reNewEnableViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        reNewEnableViewModel.OLrzqt(str, z);
    }

    public final void OLrzqt(@NotNull String str, boolean z) {
        TeeStatus teeStatus;
        Intrinsics.checkNotNullParameter(str, "");
        SingleTeeStatus singleTeeStatus = this.AxsJAY;
        if (singleTeeStatus != null && (teeStatus = singleTeeStatus.getTeeStatus()) != null && teeStatus.isActive()) {
            KWHzl(str, z);
        } else {
            AEQbTJ(str);
        }
    }

    public final boolean EZpvd() {
        AbstractC12782ctV abstractC12782ctV = this.QbewEr;
        return abstractC12782ctV != null && abstractC12782ctV.zLjUOn();
    }

    public static /* synthetic */ void reNewEnable$default(ReNewEnableViewModel reNewEnableViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        reNewEnableViewModel.KWHzl(str, z);
    }

    public final void KWHzl(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReNewEnableViewModel$reNewEnable$1(this, str, z, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReNewEnableViewModel$reEnable$1(this, str, null), 3, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReNewEnableViewModel$enable$1(this, str, actionBar, null), 3, null);
    }

    public final void copydefault(boolean z, long j) {
        this.AYXKKw.setValue(new fWX.PendingIntent(z, pTA.formatSimpleDate$default(new Date(j), null, 1, null)));
    }

    public final void ejfBZ() {
        this.AYXKKw.setValue(new fWX.Dialog());
    }

    public final void fIwbmz() {
        this.AYXKKw.setValue(new fWX.FragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwGUEr() {
        this.AYXKKw.setValue(new fWX.Application());
    }

    public final void AuCTel() {
        this.AYXKKw.setValue(new fWX.ComponentName());
    }

    public final void fARcdN() {
        this.AYXKKw.setValue(new fWX.ComponentCallbacks2());
    }

    private final void copydefault(boolean z, long j, boolean z2) {
        MutableStateFlow<fWX> mutableStateFlow = this.AYXKKw;
        fWX.StateListAnimator stateListAnimator = new fWX.StateListAnimator(z, pTA.formatSimpleDate$default(new Date(j), null, 1, null));
        stateListAnimator.EZpvd(z2);
        mutableStateFlow.setValue(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1 reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1;
        ReNewEnableViewModel reNewEnableViewModel;
        if (continuation instanceof ReNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1) {
            reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1 = (ReNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1) continuation;
            int i = reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1 = new ReNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1(this, continuation);
            }
        }
        Object obj = reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.L$0 = this;
            reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label = 1;
            if (copydefault(reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1) == objCopydefault) {
                return objCopydefault;
            }
            reNewEnableViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            reNewEnableViewModel = (ReNewEnableViewModel) reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!reNewEnableViewModel.uzCIH()) {
            return Unit.INSTANCE;
        }
        reNewEnableViewModel.copydefault.setValue(new ActionBar.Activity(reNewEnableViewModel.AwvSrB));
        reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.L$0 = null;
        reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label = 2;
        if (reNewEnableViewModel.AYXKKw(reNewEnableViewModel$checkIfShowTipSuspendOrderDialog$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(String str, boolean z, long j, Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$enable$2 reNewEnableViewModel$enable$2;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        Object objEZpvd;
        Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function22;
        ReNewEnableViewModel reNewEnableViewModel;
        List list;
        Object obj;
        Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function23;
        Function1<? super Continuation<? super Unit>, ? extends Object> function13;
        ReNewEnableViewModel reNewEnableViewModel2;
        TeeOperateSuccessState teeOperateSuccessState;
        List list2;
        Object obj2;
        Function1<? super Continuation<? super Unit>, ? extends Object> function14;
        Object obj3;
        Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function24;
        Function1<? super Continuation<? super Unit>, ? extends Object> function15;
        if (continuation instanceof ReNewEnableViewModel$enable$2) {
            reNewEnableViewModel$enable$2 = (ReNewEnableViewModel$enable$2) continuation;
            int i = reNewEnableViewModel$enable$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$enable$2.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$enable$2 = new ReNewEnableViewModel$enable$2(this, continuation);
            }
        }
        Object obj4 = reNewEnableViewModel$enable$2.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$enable$2.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj4);
            long jCurrentTimeMillis = System.currentTimeMillis();
            fTG ftg = this.uzCIH;
            List<Long> list3 = this.QUSxYX;
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : list3) {
                long jLongValue = ((Number) obj5).longValue();
                AbstractC12782ctV abstractC12782ctV = this.QbewEr;
                if (abstractC12782ctV != null && abstractC12782ctV.KWHzl(C56443yFo.KWHzl(jLongValue))) {
                    arrayList.add(obj5);
                }
            }
            ActivateTeeModel activateTeeModel = new ActivateTeeModel(arrayList, jCurrentTimeMillis, z ? j : (((long) this.values.getValue().copydefault()) * CalendarModelKt.MillisecondsIn24Hours) + jCurrentTimeMillis, this.values.getValue().EZpvd(), TeeType.PRIVATE_TEE, TeeCommand.UPGRADE_TEE);
            AbstractC12782ctV abstractC12782ctV2 = this.QbewEr;
            Intrinsics.copydefault(abstractC12782ctV2);
            reNewEnableViewModel$enable$2.L$0 = this;
            reNewEnableViewModel$enable$2.L$1 = function2;
            function12 = function1;
            reNewEnableViewModel$enable$2.L$2 = function12;
            reNewEnableViewModel$enable$2.label = 1;
            objEZpvd = ftg.EZpvd(str, activateTeeModel, abstractC12782ctV2, reNewEnableViewModel$enable$2);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            function22 = function2;
            reNewEnableViewModel = this;
        } else if (i2 == 1) {
            Function1<? super Continuation<? super Unit>, ? extends Object> function16 = (Function1) reNewEnableViewModel$enable$2.L$2;
            function22 = (Function2) reNewEnableViewModel$enable$2.L$1;
            reNewEnableViewModel = (ReNewEnableViewModel) reNewEnableViewModel$enable$2.L$0;
            C56391yDq.AEQbTJ(obj4);
            objEZpvd = ((Result) obj4).m7386unboximpl();
            function12 = function16;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj4);
                        return Unit.INSTANCE;
                    }
                    obj2 = reNewEnableViewModel$enable$2.L$1;
                    function15 = (Function1) reNewEnableViewModel$enable$2.L$0;
                    C56391yDq.AEQbTJ(obj4);
                    objEZpvd = obj2;
                    function12 = function15;
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                        reNewEnableViewModel$enable$2.L$0 = objEZpvd;
                        reNewEnableViewModel$enable$2.L$1 = null;
                        reNewEnableViewModel$enable$2.L$2 = null;
                        reNewEnableViewModel$enable$2.label = 5;
                        if (function12.invoke(reNewEnableViewModel$enable$2) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                list = (List) reNewEnableViewModel$enable$2.L$3;
                obj3 = reNewEnableViewModel$enable$2.L$2;
                function14 = (Function1) reNewEnableViewModel$enable$2.L$1;
                function24 = (Function2) reNewEnableViewModel$enable$2.L$0;
                C56391yDq.AEQbTJ(obj4);
                list2 = list;
                obj2 = obj3;
                function23 = function24;
                reNewEnableViewModel$enable$2.L$0 = function14;
                reNewEnableViewModel$enable$2.L$1 = obj2;
                reNewEnableViewModel$enable$2.L$2 = null;
                reNewEnableViewModel$enable$2.L$3 = null;
                reNewEnableViewModel$enable$2.L$4 = null;
                reNewEnableViewModel$enable$2.label = 4;
                if (function23.invoke(list2, reNewEnableViewModel$enable$2) == objCopydefault) {
                    return objCopydefault;
                }
                function15 = function14;
                objEZpvd = obj2;
                function12 = function15;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                }
                return Unit.INSTANCE;
            }
            list = (List) reNewEnableViewModel$enable$2.L$4;
            obj = reNewEnableViewModel$enable$2.L$3;
            function13 = (Function1) reNewEnableViewModel$enable$2.L$2;
            function23 = (Function2) reNewEnableViewModel$enable$2.L$1;
            reNewEnableViewModel2 = (ReNewEnableViewModel) reNewEnableViewModel$enable$2.L$0;
            C56391yDq.AEQbTJ(obj4);
            teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (teeOperateSuccessState == null) {
                fWU fwu = reNewEnableViewModel2.iwGUEr;
                long expireTimestamp = teeOperateSuccessState.getExpireTimestamp();
                reNewEnableViewModel$enable$2.L$0 = function23;
                reNewEnableViewModel$enable$2.L$1 = function13;
                reNewEnableViewModel$enable$2.L$2 = obj;
                reNewEnableViewModel$enable$2.L$3 = list;
                reNewEnableViewModel$enable$2.L$4 = null;
                reNewEnableViewModel$enable$2.label = 3;
                if (fwu.copydefault(expireTimestamp, reNewEnableViewModel$enable$2) == objCopydefault) {
                    return objCopydefault;
                }
                obj3 = obj;
                function14 = function13;
                function24 = function23;
                list2 = list;
                obj2 = obj3;
                function23 = function24;
                reNewEnableViewModel$enable$2.L$0 = function14;
                reNewEnableViewModel$enable$2.L$1 = obj2;
                reNewEnableViewModel$enable$2.L$2 = null;
                reNewEnableViewModel$enable$2.L$3 = null;
                reNewEnableViewModel$enable$2.L$4 = null;
                reNewEnableViewModel$enable$2.label = 4;
                if (function23.invoke(list2, reNewEnableViewModel$enable$2) == objCopydefault) {
                }
            } else {
                list2 = list;
                obj2 = obj;
                function14 = function13;
                reNewEnableViewModel$enable$2.L$0 = function14;
                reNewEnableViewModel$enable$2.L$1 = obj2;
                reNewEnableViewModel$enable$2.L$2 = null;
                reNewEnableViewModel$enable$2.L$3 = null;
                reNewEnableViewModel$enable$2.L$4 = null;
                reNewEnableViewModel$enable$2.label = 4;
                if (function23.invoke(list2, reNewEnableViewModel$enable$2) == objCopydefault) {
                }
            }
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            list = (List) objEZpvd;
            fWU fwu2 = reNewEnableViewModel.iwGUEr;
            reNewEnableViewModel$enable$2.L$0 = reNewEnableViewModel;
            reNewEnableViewModel$enable$2.L$1 = function22;
            reNewEnableViewModel$enable$2.L$2 = function12;
            reNewEnableViewModel$enable$2.L$3 = objEZpvd;
            reNewEnableViewModel$enable$2.L$4 = list;
            reNewEnableViewModel$enable$2.label = 2;
            if (fwu2.OLrzqt(reNewEnableViewModel$enable$2) == objCopydefault) {
                return objCopydefault;
            }
            obj = objEZpvd;
            ReNewEnableViewModel reNewEnableViewModel3 = reNewEnableViewModel;
            function23 = function22;
            function13 = function12;
            reNewEnableViewModel2 = reNewEnableViewModel3;
            teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (teeOperateSuccessState == null) {
            }
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(String str, Function2<? super TeeOperateSuccessState, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$reNew$1 reNewEnableViewModel$reNew$1;
        List listAhwBna;
        Function2<? super TeeOperateSuccessState, ? super Continuation<? super Unit>, ? extends Object> function22;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        Object objCopydefault;
        ReNewEnableViewModel reNewEnableViewModel;
        Function2<? super TeeOperateSuccessState, ? super Continuation<? super Unit>, ? extends Object> function23;
        Object obj;
        TeeOperateSuccessState teeOperateSuccessState;
        Function1<? super Continuation<? super Unit>, ? extends Object> function13;
        if (continuation instanceof ReNewEnableViewModel$reNew$1) {
            reNewEnableViewModel$reNew$1 = (ReNewEnableViewModel$reNew$1) continuation;
            int i = reNewEnableViewModel$reNew$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$reNew$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$reNew$1 = new ReNewEnableViewModel$reNew$1(this, continuation);
            }
        }
        Object obj2 = reNewEnableViewModel$reNew$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$reNew$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C17871fVj c17871fVj = this.fJNWhG;
            SingleTeeStatus singleTeeStatus = this.AxsJAY;
            if (singleTeeStatus == null || (listAhwBna = singleTeeStatus.getChainIndexList()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            ActivateTeeModel activateTeeModel = new ActivateTeeModel(listAhwBna, jCurrentTimeMillis, (((long) this.values.getValue().copydefault()) * CalendarModelKt.MillisecondsIn24Hours) + jCurrentTimeMillis, this.values.getValue().EZpvd(), TeeType.PRIVATE_TEE, TeeCommand.EXTEND_TEE);
            AbstractC12782ctV abstractC12782ctV = this.QbewEr;
            Intrinsics.copydefault(abstractC12782ctV);
            reNewEnableViewModel$reNew$1.L$0 = this;
            function22 = function2;
            reNewEnableViewModel$reNew$1.L$1 = function22;
            function12 = function1;
            reNewEnableViewModel$reNew$1.L$2 = function12;
            reNewEnableViewModel$reNew$1.label = 1;
            objCopydefault = c17871fVj.copydefault(str, activateTeeModel, abstractC12782ctV, reNewEnableViewModel$reNew$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            reNewEnableViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    obj = reNewEnableViewModel$reNew$1.L$1;
                    function13 = (Function1) reNewEnableViewModel$reNew$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objCopydefault = obj;
                    function12 = function13;
                    if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                        reNewEnableViewModel$reNew$1.L$0 = objCopydefault;
                        reNewEnableViewModel$reNew$1.L$1 = null;
                        reNewEnableViewModel$reNew$1.L$2 = null;
                        reNewEnableViewModel$reNew$1.label = 4;
                        if (function12.invoke(reNewEnableViewModel$reNew$1) == objCopydefault2) {
                            return objCopydefault2;
                        }
                    }
                    return Unit.INSTANCE;
                }
                TeeOperateSuccessState teeOperateSuccessState2 = (TeeOperateSuccessState) reNewEnableViewModel$reNew$1.L$3;
                Object obj3 = reNewEnableViewModel$reNew$1.L$2;
                Function1<? super Continuation<? super Unit>, ? extends Object> function14 = (Function1) reNewEnableViewModel$reNew$1.L$1;
                function23 = (Function2) reNewEnableViewModel$reNew$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                teeOperateSuccessState = teeOperateSuccessState2;
                obj = obj3;
                function12 = function14;
                reNewEnableViewModel$reNew$1.L$0 = function12;
                reNewEnableViewModel$reNew$1.L$1 = obj;
                reNewEnableViewModel$reNew$1.L$2 = null;
                reNewEnableViewModel$reNew$1.L$3 = null;
                reNewEnableViewModel$reNew$1.label = 3;
                if (function23.invoke(teeOperateSuccessState, reNewEnableViewModel$reNew$1) != objCopydefault2) {
                    return objCopydefault2;
                }
                function13 = function12;
                objCopydefault = obj;
                function12 = function13;
                if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
                }
                return Unit.INSTANCE;
            }
            Function1<? super Continuation<? super Unit>, ? extends Object> function15 = (Function1) reNewEnableViewModel$reNew$1.L$2;
            Function2<? super TeeOperateSuccessState, ? super Continuation<? super Unit>, ? extends Object> function24 = (Function2) reNewEnableViewModel$reNew$1.L$1;
            reNewEnableViewModel = (ReNewEnableViewModel) reNewEnableViewModel$reNew$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            objCopydefault = ((Result) obj2).m7386unboximpl();
            function12 = function15;
            function22 = function24;
        }
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            TeeOperateSuccessState teeOperateSuccessState3 = (TeeOperateSuccessState) objCopydefault;
            fWU fwu = reNewEnableViewModel.iwGUEr;
            long expireTimestamp = teeOperateSuccessState3.getExpireTimestamp();
            reNewEnableViewModel$reNew$1.L$0 = function22;
            reNewEnableViewModel$reNew$1.L$1 = function12;
            reNewEnableViewModel$reNew$1.L$2 = objCopydefault;
            reNewEnableViewModel$reNew$1.L$3 = teeOperateSuccessState3;
            reNewEnableViewModel$reNew$1.label = 2;
            if (fwu.KWHzl(expireTimestamp, reNewEnableViewModel$reNew$1) == objCopydefault2) {
                return objCopydefault2;
            }
            function23 = function22;
            obj = objCopydefault;
            teeOperateSuccessState = teeOperateSuccessState3;
            reNewEnableViewModel$reNew$1.L$0 = function12;
            reNewEnableViewModel$reNew$1.L$1 = obj;
            reNewEnableViewModel$reNew$1.L$2 = null;
            reNewEnableViewModel$reNew$1.L$3 = null;
            reNewEnableViewModel$reNew$1.label = 3;
            if (function23.invoke(teeOperateSuccessState, reNewEnableViewModel$reNew$1) != objCopydefault2) {
            }
        }
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
        }
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReNewEnableViewModel$refreshData$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$getSuspendedOrdersAndThrowError$1 reNewEnableViewModel$getSuspendedOrdersAndThrowError$1;
        ReNewEnableViewModel reNewEnableViewModel;
        if (continuation instanceof ReNewEnableViewModel$getSuspendedOrdersAndThrowError$1) {
            reNewEnableViewModel$getSuspendedOrdersAndThrowError$1 = (ReNewEnableViewModel$getSuspendedOrdersAndThrowError$1) continuation;
            int i = reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$getSuspendedOrdersAndThrowError$1 = new ReNewEnableViewModel$getSuspendedOrdersAndThrowError$1(this, continuation);
            }
        }
        Object objOLrzqt = reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (this.AwvSrB.length() == 0) {
                reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.L$0 = this;
                reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.label = 1;
                objOLrzqt = OLrzqt(reNewEnableViewModel$getSuspendedOrdersAndThrowError$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                reNewEnableViewModel = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        reNewEnableViewModel = (ReNewEnableViewModel) reNewEnableViewModel$getSuspendedOrdersAndThrowError$1.L$0;
        C56391yDq.AEQbTJ(objOLrzqt);
        reNewEnableViewModel.AwvSrB = (String) objOLrzqt;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$refreshTeeMetaData$1 reNewEnableViewModel$refreshTeeMetaData$1;
        ReNewEnableViewModel reNewEnableViewModel;
        ReNewEnableViewModel reNewEnableViewModel2;
        if (continuation instanceof ReNewEnableViewModel$refreshTeeMetaData$1) {
            reNewEnableViewModel$refreshTeeMetaData$1 = (ReNewEnableViewModel$refreshTeeMetaData$1) continuation;
            int i = reNewEnableViewModel$refreshTeeMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$refreshTeeMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$refreshTeeMetaData$1 = new ReNewEnableViewModel$refreshTeeMetaData$1(this, continuation);
            }
        }
        Object objAEQbTJ = reNewEnableViewModel$refreshTeeMetaData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$refreshTeeMetaData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            fWU fwu = this.iwGUEr;
            reNewEnableViewModel$refreshTeeMetaData$1.L$0 = this;
            reNewEnableViewModel$refreshTeeMetaData$1.L$1 = this;
            reNewEnableViewModel$refreshTeeMetaData$1.label = 1;
            objAEQbTJ = fwu.AEQbTJ(reNewEnableViewModel$refreshTeeMetaData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            reNewEnableViewModel = this;
            reNewEnableViewModel2 = reNewEnableViewModel;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reNewEnableViewModel2 = (ReNewEnableViewModel) reNewEnableViewModel$refreshTeeMetaData$1.L$1;
            reNewEnableViewModel = (ReNewEnableViewModel) reNewEnableViewModel$refreshTeeMetaData$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        reNewEnableViewModel2.zuBGHE = (TeeMetadata) objAEQbTJ;
        TeeMetadata teeMetadata = reNewEnableViewModel.zuBGHE;
        if (teeMetadata == null) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(teeMetadata);
        reNewEnableViewModel.QUSxYX = teeMetadata.getSupportChainIndexList();
        TeeMetadata teeMetadata2 = reNewEnableViewModel.zuBGHE;
        Intrinsics.copydefault(teeMetadata2);
        reNewEnableViewModel.QVAiDq = teeMetadata2.getChainNameMapping();
        reNewEnableViewModel.djBIcL.setValue(reNewEnableViewModel.zuBGHE);
        TeeMetadata teeMetadata3 = reNewEnableViewModel.zuBGHE;
        Intrinsics.copydefault(teeMetadata3);
        int iEZpvd = C17922fXg.EZpvd(teeMetadata3);
        reNewEnableViewModel.DTwDnp = iEZpvd;
        if (iEZpvd != 1) {
            MutableStateFlow<Boolean> mutableStateFlow = reNewEnableViewModel.AhwBna;
            TeeMetadata teeMetadata4 = reNewEnableViewModel.zuBGHE;
            Intrinsics.copydefault(teeMetadata4);
            mutableStateFlow.setValue(C56443yFo.KWHzl(teeMetadata4.isTeeServiceMaintenance()));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$refreshTeeUpgradeStatus$1 reNewEnableViewModel$refreshTeeUpgradeStatus$1;
        MutableStateFlow<Integer> mutableStateFlow;
        if (continuation instanceof ReNewEnableViewModel$refreshTeeUpgradeStatus$1) {
            reNewEnableViewModel$refreshTeeUpgradeStatus$1 = (ReNewEnableViewModel$refreshTeeUpgradeStatus$1) continuation;
            int i = reNewEnableViewModel$refreshTeeUpgradeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$refreshTeeUpgradeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$refreshTeeUpgradeStatus$1 = new ReNewEnableViewModel$refreshTeeUpgradeStatus$1(this, continuation);
            }
        }
        Object obj = reNewEnableViewModel$refreshTeeUpgradeStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$refreshTeeUpgradeStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<Integer> mutableStateFlow2 = this.valueOf;
            fWU fwu = this.iwGUEr;
            reNewEnableViewModel$refreshTeeUpgradeStatus$1.L$0 = mutableStateFlow2;
            reNewEnableViewModel$refreshTeeUpgradeStatus$1.label = 1;
            Object objEZpvd = fwu.EZpvd(reNewEnableViewModel$refreshTeeUpgradeStatus$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = objEZpvd;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) reNewEnableViewModel$refreshTeeUpgradeStatus$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        TeeUpgradeStatus teeUpgradeStatus = (TeeUpgradeStatus) obj;
        mutableStateFlow.setValue(teeUpgradeStatus != null ? C56443yFo.AEQbTJ(teeUpgradeStatus.getUpgradeStatus()) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AYXKKw(Continuation<? super Unit> continuation) throws Throwable {
        ReNewEnableViewModel$refreshTeeStatus$1 reNewEnableViewModel$refreshTeeStatus$1;
        final ReNewEnableViewModel reNewEnableViewModel;
        ReNewEnableViewModel reNewEnableViewModel2;
        Activity actionBar;
        if (continuation instanceof ReNewEnableViewModel$refreshTeeStatus$1) {
            reNewEnableViewModel$refreshTeeStatus$1 = (ReNewEnableViewModel$refreshTeeStatus$1) continuation;
            int i = reNewEnableViewModel$refreshTeeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$refreshTeeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$refreshTeeStatus$1 = new ReNewEnableViewModel$refreshTeeStatus$1(this, continuation);
            }
        }
        Object objOLrzqt = reNewEnableViewModel$refreshTeeStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$refreshTeeStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            fWU fwu = this.iwGUEr;
            reNewEnableViewModel$refreshTeeStatus$1.L$0 = this;
            reNewEnableViewModel$refreshTeeStatus$1.L$1 = this;
            reNewEnableViewModel$refreshTeeStatus$1.label = 1;
            objOLrzqt = fwu.OLrzqt(reNewEnableViewModel$refreshTeeStatus$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            reNewEnableViewModel = this;
            reNewEnableViewModel2 = reNewEnableViewModel;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reNewEnableViewModel2 = (ReNewEnableViewModel) reNewEnableViewModel$refreshTeeStatus$1.L$1;
            reNewEnableViewModel = (ReNewEnableViewModel) reNewEnableViewModel$refreshTeeStatus$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        reNewEnableViewModel2.AxsJAY = (SingleTeeStatus) objOLrzqt;
        SingleTeeStatus singleTeeStatus = reNewEnableViewModel.AxsJAY;
        if (singleTeeStatus != null) {
            if ((singleTeeStatus != null ? singleTeeStatus.getTeeStatus() : null) != null) {
                SingleTeeStatus singleTeeStatus2 = reNewEnableViewModel.AxsJAY;
                Intrinsics.copydefault(singleTeeStatus2);
                if (!singleTeeStatus2.getTeeStatus().isCreated()) {
                    reNewEnableViewModel.getNewProxyInstance();
                    reNewEnableViewModel.EZpvd.setValue(Activity.Fragment.AEQbTJ);
                } else {
                    MutableStateFlow<Activity> mutableStateFlow = reNewEnableViewModel.EZpvd;
                    SingleTeeStatus singleTeeStatus3 = reNewEnableViewModel.AxsJAY;
                    Intrinsics.copydefault(singleTeeStatus3);
                    if (singleTeeStatus3.getTeeStatus().isActive()) {
                        SingleTeeStatus singleTeeStatus4 = reNewEnableViewModel.AxsJAY;
                        Intrinsics.copydefault(singleTeeStatus4);
                        if (C17922fXg.AEQbTJ(singleTeeStatus4.getTeeStatus())) {
                            reNewEnableViewModel.getNewProxyInstance();
                            SingleTeeStatus singleTeeStatus5 = reNewEnableViewModel.AxsJAY;
                            Intrinsics.copydefault(singleTeeStatus5);
                            actionBar = new Activity.ActionBar(true, pTA.formatSimpleDate$default(new Date(singleTeeStatus5.getTeeStatus().getExpiredTimestamp()), null, 1, null));
                        } else {
                            SingleTeeStatus singleTeeStatus6 = reNewEnableViewModel.AxsJAY;
                            Intrinsics.copydefault(singleTeeStatus6);
                            if (reNewEnableViewModel.EZpvd(C56443yFo.KWHzl(singleTeeStatus6.getTeeStatus().getExpiredTimestamp()))) {
                                SingleTeeStatus singleTeeStatus7 = reNewEnableViewModel.AxsJAY;
                                Intrinsics.copydefault(singleTeeStatus7);
                                if (reNewEnableViewModel.AEQbTJ(C56443yFo.KWHzl(singleTeeStatus7.getTeeStatus().getExpiredTimestamp()))) {
                                    if (!reNewEnableViewModel.QKVWgx) {
                                        reNewEnableViewModel.OLrzqt(new Function0() { // from class: o.fWD
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return ReNewEnableViewModel.AxsJAY(this.AEQbTJ);
                                            }
                                        });
                                    }
                                    SingleTeeStatus singleTeeStatus8 = reNewEnableViewModel.AxsJAY;
                                    Intrinsics.copydefault(singleTeeStatus8);
                                    actionBar = new Activity.TaskDescription(reNewEnableViewModel.copydefault(singleTeeStatus8.getTeeStatus().getExpiredTimestamp() - System.currentTimeMillis()), true);
                                } else {
                                    SingleTeeStatus singleTeeStatus9 = reNewEnableViewModel.AxsJAY;
                                    Intrinsics.copydefault(singleTeeStatus9);
                                    actionBar = new Activity.TaskDescription(pTA.formatSimpleDate$default(new Date(singleTeeStatus9.getTeeStatus().getExpiredTimestamp()), null, 1, null), false);
                                }
                            } else {
                                reNewEnableViewModel.getNewProxyInstance();
                                SingleTeeStatus singleTeeStatus10 = reNewEnableViewModel.AxsJAY;
                                Intrinsics.copydefault(singleTeeStatus10);
                                actionBar = new Activity.ActionBar(false, pTA.formatSimpleDate$default(new Date(singleTeeStatus10.getTeeStatus().getExpiredTimestamp()), null, 1, null));
                            }
                        }
                    } else {
                        reNewEnableViewModel.getNewProxyInstance();
                        actionBar = Activity.C0321Activity.OLrzqt;
                    }
                    mutableStateFlow.setValue(actionBar);
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(ReNewEnableViewModel reNewEnableViewModel) {
        SingleTeeStatus singleTeeStatus = reNewEnableViewModel.AxsJAY;
        Intrinsics.copydefault(singleTeeStatus);
        if (singleTeeStatus.getTeeStatus().isActive()) {
            SingleTeeStatus singleTeeStatus2 = reNewEnableViewModel.AxsJAY;
            Intrinsics.copydefault(singleTeeStatus2);
            long expiredTimestamp = singleTeeStatus2.getTeeStatus().getExpiredTimestamp() - System.currentTimeMillis();
            if (expiredTimestamp >= 0) {
                reNewEnableViewModel.gEmmrt.setValue(new Activity.TaskDescription(reNewEnableViewModel.copydefault(expiredTimestamp), false, 2, null));
            } else {
                reNewEnableViewModel.getNewProxyInstance();
                reNewEnableViewModel.fJNWhG();
            }
        } else {
            reNewEnableViewModel.getNewProxyInstance();
        }
        return Unit.INSTANCE;
    }

    public final String copydefault(long j) {
        long j2 = 60;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / ((long) 3600000)), Long.valueOf((j / ((long) 60000)) % j2), Long.valueOf((j / ((long) 1000)) % j2)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final boolean AEQbTJ(Long l) {
        return l != null && l.longValue() > System.currentTimeMillis() && l.longValue() < System.currentTimeMillis() + CalendarModelKt.MillisecondsIn24Hours;
    }

    public final boolean EZpvd(Long l) {
        return l != null && l.longValue() > System.currentTimeMillis() && l.longValue() < System.currentTimeMillis() + 172800000;
    }

    public final void KWHzl() {
        SingleTeeStatus singleTeeStatus;
        TeeMetadata teeMetadata = this.zuBGHE;
        if (teeMetadata == null || (singleTeeStatus = this.AxsJAY) == null || this.AEQbTJ.getValue().OLrzqt()) {
            return;
        }
        List<Integer> expirePeriodDayList = teeMetadata.getExpirePeriodDayList();
        Integer extendExpirePeriodDay = singleTeeStatus.getTeeStatus().getExtendExpirePeriodDay();
        this.AEQbTJ.setValue(new StateListAnimator(extendExpirePeriodDay != null ? extendExpirePeriodDay.intValue() : teeMetadata.getDefaultExpirePeriodDay(), C17922fXg.AEQbTJ(singleTeeStatus.getTeeStatus()), false, expirePeriodDayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(List<Long> list, Continuation<? super String> continuation) throws Throwable {
        ReNewEnableViewModel$getOrderNumberByChainIds$1 reNewEnableViewModel$getOrderNumberByChainIds$1;
        if (continuation instanceof ReNewEnableViewModel$getOrderNumberByChainIds$1) {
            reNewEnableViewModel$getOrderNumberByChainIds$1 = (ReNewEnableViewModel$getOrderNumberByChainIds$1) continuation;
            int i = reNewEnableViewModel$getOrderNumberByChainIds$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$getOrderNumberByChainIds$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$getOrderNumberByChainIds$1 = new ReNewEnableViewModel$getOrderNumberByChainIds$1(this, continuation);
            }
        }
        Object objCopydefault = reNewEnableViewModel$getOrderNumberByChainIds$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$getOrderNumberByChainIds$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AbstractC12782ctV abstractC12782ctV = this.QbewEr;
            if (abstractC12782ctV != null) {
                gKO gko = (gKO) C43248rlh.KWHzl.AEQbTJ(gKO.class);
                String strDbNXlk = abstractC12782ctV.DbNXlk();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, ((Number) it.next()).longValue(), null, 2, null);
                    String address = chainAddress != null ? chainAddress.getAddress() : null;
                    if (address != null) {
                        arrayList.add(address);
                    }
                }
                gKU gku = new gKU(strDbNXlk, arrayList, null, null, 12, null);
                reNewEnableViewModel$getOrderNumberByChainIds$1.label = 1;
                objCopydefault = gko.copydefault(gku, reNewEnableViewModel$getOrderNumberByChainIds$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        gKV gkv = (gKV) objCopydefault;
        String strValueOf = gkv != null ? String.valueOf(gkv.getStrategyNum() + gkv.getOrderNum()) : null;
        return strValueOf == null ? "" : strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super String> continuation) throws Throwable {
        ReNewEnableViewModel$getSuspendedOrders$1 reNewEnableViewModel$getSuspendedOrders$1;
        String address;
        String address2;
        List listGEmmrt;
        ArrayList<Long> chainIndexList;
        if (continuation instanceof ReNewEnableViewModel$getSuspendedOrders$1) {
            reNewEnableViewModel$getSuspendedOrders$1 = (ReNewEnableViewModel$getSuspendedOrders$1) continuation;
            int i = reNewEnableViewModel$getSuspendedOrders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reNewEnableViewModel$getSuspendedOrders$1.label = i - Integer.MIN_VALUE;
            } else {
                reNewEnableViewModel$getSuspendedOrders$1 = new ReNewEnableViewModel$getSuspendedOrders$1(this, continuation);
            }
        }
        Object objCopydefault = reNewEnableViewModel$getSuspendedOrders$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reNewEnableViewModel$getSuspendedOrders$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AbstractC12782ctV abstractC12782ctV = this.QbewEr;
            if (abstractC12782ctV == null) {
                return "";
            }
            gKO gko = (gKO) C43248rlh.KWHzl.AEQbTJ(gKO.class);
            String strDbNXlk = abstractC12782ctV.DbNXlk();
            SingleTeeStatus singleTeeStatus = this.AxsJAY;
            if (singleTeeStatus == null || (chainIndexList = singleTeeStatus.getChainIndexList()) == null) {
                String[] strArr = new String[2];
                ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, 1L, null, 2, null);
                if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
                    address = "";
                }
                strArr[0] = address;
                ChainAddress chainAddress2 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, 501L, null, 2, null);
                if (chainAddress2 == null || (address2 = chainAddress2.getAddress()) == null) {
                    address2 = "";
                }
                strArr[1] = address2;
                listGEmmrt = yDY.gEmmrt(strArr);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = chainIndexList.iterator();
                while (it.hasNext()) {
                    ChainAddress chainAddress3 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, ((Number) it.next()).longValue(), null, 2, null);
                    String address3 = chainAddress3 != null ? chainAddress3.getAddress() : null;
                    if (address3 != null) {
                        arrayList.add(address3);
                    }
                }
                listGEmmrt = arrayList;
            }
            gKU gku = new gKU(strDbNXlk, listGEmmrt, null, C56402yEa.EZpvd(OrderStatus.Suspended), 4, null);
            reNewEnableViewModel$getSuspendedOrders$1.label = 1;
            objCopydefault = gko.copydefault(gku, reNewEnableViewModel$getSuspendedOrders$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        gKV gkv = (gKV) objCopydefault;
        String strValueOf = gkv != null ? String.valueOf(gkv.getStrategyNum() + gkv.getOrderNum()) : null;
        return strValueOf == null ? "" : strValueOf;
    }

    public final void OLrzqt(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.QKVWgx) {
            return;
        }
        this.QKVWgx = true;
        this.OcIXYQ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReNewEnableViewModel$startTimer$1(this, function0, null), 3, null);
    }

    public final void getNewProxyInstance() {
        this.QKVWgx = false;
        Job job = this.OcIXYQ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.OcIXYQ = null;
    }

    public final ArrayList<Long> copydefault() {
        SingleTeeStatus singleTeeStatus = this.AxsJAY;
        if (singleTeeStatus != null) {
            return singleTeeStatus.getChainIndexList();
        }
        return null;
    }

    public static final class StateListAnimator {
        public int AEQbTJ;
        public final List<Integer> EZpvd;
        public boolean KWHzl;
        public boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, boolean z, boolean z2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                z2 = stateListAnimator.KWHzl;
            }
            if ((i2 & 8) != 0) {
                list = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(i, z, z2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(int i, boolean z, boolean z2, @NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(i, z, z2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && this.OLrzqt == stateListAnimator.OLrzqt && this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((Integer.hashCode(this.AEQbTJ) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EnableDaysInfo(selectDay=" + this.AEQbTJ + ", autoRenew=" + this.OLrzqt + ", isSelect=" + this.KWHzl + ", expirePeriodDayList=" + this.EZpvd + ")";
        }

        public StateListAnimator(int i, boolean z, boolean z2, @NotNull List<Integer> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = i;
            this.OLrzqt = z;
            this.KWHzl = z2;
            this.EZpvd = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001e: INVOKE 
  (wrap:java.lang.Integer[]:0x001a: FILLED_NEW_ARRAY (7 int), (15 int), (30 int) A[WRAPPED] (LINE:775) elemType: java.lang.Integer)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:775)) : (r4v0 java.util.List))
 A[MD:(int, boolean, boolean, java.util.List<java.lang.Integer>):void (m)] (LINE:771) call: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel.StateListAnimator.<init>(int, boolean, boolean, java.util.List):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, boolean z, boolean z2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? yDY.gEmmrt(7, 15, 30) : list);
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class Activity {
        public final String KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel.Activity.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        public static final class StateListAnimator extends Activity {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
                super("", null);
            }
        }

        public Activity(String str) {
            this.KWHzl = str;
        }

        public static class ActionBar extends Activity {
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(boolean z, @NotNull String str) {
                super(str, null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = z;
            }
        }

        public static final class TaskDescription extends ActionBar {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull String str, boolean z) {
                super(false, str);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = z;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:781) call: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel.Activity.TaskDescription.<init>(java.lang.String, boolean):void type: THIS */
            public /* synthetic */ TaskDescription(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? true : z);
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$Activity$Activity, reason: collision with other inner class name */
        public static final class C0321Activity extends Activity {
            public static final C0321Activity OLrzqt = new C0321Activity();

            private C0321Activity() {
                super("", null);
            }
        }

        public static final class Fragment extends Activity {
            public static final Fragment AEQbTJ = new Fragment();

            private Fragment() {
                super("", null);
            }
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Activity {
            public static final Application EZpvd = new Application();

            private Application() {
                super("", null);
            }
        }
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes15.dex */
        public static final class TaskDescription extends ActionBar {
            public final String EZpvd;
            public final String OLrzqt;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.copydefault;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.OLrzqt = str;
                this.copydefault = str2;
                this.EZpvd = str3;
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes15.dex */
        public static final class C0320ActionBar extends ActionBar {
            public final String EZpvd;
            public final String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0320ActionBar(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.copydefault = str;
                this.EZpvd = str2;
            }
        }

        public static final class Activity extends ActionBar {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }
}
