package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import androidx.compose.material3.CalendarModelKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.activate.model.TeeOperateSuccessState;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ReEnableViewModel;
import com.okinc.business.defi.wallet.tee.common.model.TeeCommand;
import com.okinc.business.defi.wallet.tee.common.model.TeeType;
import com.okinc.business.defi.wallet.tee.review.viewmodel.ReNewEnableViewModel;
import com.okinc.business.dex.api.bean.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC12782ctV;
import o.C10854bwM;
import o.C10954byG;
import o.C17916fXa;
import o.C17922fXg;
import o.C33129mqd;
import o.C43248rlh;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
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
public final class ReEnableViewModel extends ViewModel {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public String AYXKKw;
    public final fTG AhwBna;
    public final StateFlow<fWX> AkhnZx;
    public int AuCTel;
    public final fWU DbNXlk;
    public final MutableStateFlow<fWX> EZpvd;
    public final StateFlow<ReNewEnableViewModel.ActionBar> KWHzl;
    public final MutableStateFlow<ReNewEnableViewModel.ActionBar> OLrzqt;
    public final MutableStateFlow<TeeMetadata> copydefault;
    public final Function0<Unit> djBIcL;
    public Map<String, String> ejfBZ;
    public TeeMetadata fARcdN;
    public final StateFlow<TeeMetadata> fIwbmz;
    public final StateFlow<Boolean> fJNWhG;
    public SingleTeeStatus fetchVPNInfo;
    public final Function1<List<TeeOperateSuccessState>, Unit> gEmmrt;
    public AbstractC12782ctV getFieldNames;
    public List<Long> getNewProxyInstance;
    public String isConnected;
    public List<Long> valueOf;
    public final C17916fXa values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ReNewEnableViewModel.ActionBar> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<fWX> copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TeeMetadata> djBIcL() {
        return this.fIwbmz;
    }

    @yCM
    public ReEnableViewModel(@NotNull fWU fwu, @NotNull fTG ftg, @NotNull C17916fXa c17916fXa) {
        Intrinsics.checkNotNullParameter(fwu, "");
        Intrinsics.checkNotNullParameter(ftg, "");
        Intrinsics.checkNotNullParameter(c17916fXa, "");
        this.DbNXlk = fwu;
        this.AhwBna = ftg;
        this.values = c17916fXa;
        this.getNewProxyInstance = yDY.AhwBna();
        this.ejfBZ = C56424yEw.KWHzl();
        MutableStateFlow<TeeMetadata> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow2;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow2);
        this.isConnected = "";
        MutableStateFlow<ReNewEnableViewModel.ActionBar> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<fWX> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow4;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow4);
        this.valueOf = new ArrayList();
        this.AYXKKw = "";
        this.gEmmrt = new Function1() { // from class: o.fTN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ReEnableViewModel.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        };
        this.djBIcL = new Function0() { // from class: o.fTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ReEnableViewModel.DbNXlk(this.EZpvd);
            }
        };
    }

    public final boolean EZpvd() {
        return C33129mqd.AEQbTJ(this.isConnected, "0");
    }

    public final String KWHzl() {
        if (this.valueOf.size() > 5) {
            C17916fXa c17916fXa = this.values;
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) this.valueOf, 5);
            ArrayList arrayList = new ArrayList();
            Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                String strDjBIcL = this.ejfBZ.get(String.valueOf(jLongValue));
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
        List<Long> list = this.valueOf;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = ((Number) it2.next()).longValue();
            String strDjBIcL2 = this.ejfBZ.get(String.valueOf(jLongValue2));
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

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DbNXlk.EZpvd(str);
    }

    public final void EZpvd(@NotNull String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReEnableViewModel$reEnable$1(this, str, i, z, null), 3, null);
    }

    public final void OLrzqt(boolean z, long j, boolean z2) {
        MutableStateFlow<fWX> mutableStateFlow = this.EZpvd;
        fWX.StateListAnimator stateListAnimator = new fWX.StateListAnimator(z, pTA.formatSimpleDate$default(new Date(j), null, 1, null));
        stateListAnimator.EZpvd(z2);
        mutableStateFlow.setValue(stateListAnimator);
    }

    public static final Unit AEQbTJ(ReEnableViewModel reEnableViewModel, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        TeeOperateSuccessState teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (teeOperateSuccessState != null) {
            reEnableViewModel.OLrzqt(teeOperateSuccessState.getAutoRenew(), teeOperateSuccessState.getExpireTimestamp(), false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ReEnableViewModel reEnableViewModel) {
        reEnableViewModel.valueOf();
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        this.EZpvd.setValue(new fWX.Application());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Continuation<? super Unit> continuation) throws Throwable {
        ReEnableViewModel$checkIfShowTipSuspendOrderDialog$1 reEnableViewModel$checkIfShowTipSuspendOrderDialog$1;
        ReEnableViewModel reEnableViewModel;
        if (continuation instanceof ReEnableViewModel$checkIfShowTipSuspendOrderDialog$1) {
            reEnableViewModel$checkIfShowTipSuspendOrderDialog$1 = (ReEnableViewModel$checkIfShowTipSuspendOrderDialog$1) continuation;
            int i = reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                reEnableViewModel$checkIfShowTipSuspendOrderDialog$1 = new ReEnableViewModel$checkIfShowTipSuspendOrderDialog$1(this, continuation);
            }
        }
        Object obj = reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.L$0 = this;
            reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label = 1;
            if (AEQbTJ(reEnableViewModel$checkIfShowTipSuspendOrderDialog$1) == objCopydefault) {
                return objCopydefault;
            }
            reEnableViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            reEnableViewModel = (ReEnableViewModel) reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!reEnableViewModel.EZpvd()) {
            return Unit.INSTANCE;
        }
        reEnableViewModel.OLrzqt.setValue(new ReNewEnableViewModel.ActionBar.Activity(reEnableViewModel.isConnected));
        reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.L$0 = null;
        reEnableViewModel$checkIfShowTipSuspendOrderDialog$1.label = 2;
        if (reEnableViewModel.EZpvd(reEnableViewModel$checkIfShowTipSuspendOrderDialog$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(Continuation<? super Unit> continuation) throws Throwable {
        ReEnableViewModel$getSuspendedOrdersAndThrowError$1 reEnableViewModel$getSuspendedOrdersAndThrowError$1;
        ReEnableViewModel reEnableViewModel;
        if (continuation instanceof ReEnableViewModel$getSuspendedOrdersAndThrowError$1) {
            reEnableViewModel$getSuspendedOrdersAndThrowError$1 = (ReEnableViewModel$getSuspendedOrdersAndThrowError$1) continuation;
            int i = reEnableViewModel$getSuspendedOrdersAndThrowError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reEnableViewModel$getSuspendedOrdersAndThrowError$1.label = i - Integer.MIN_VALUE;
            } else {
                reEnableViewModel$getSuspendedOrdersAndThrowError$1 = new ReEnableViewModel$getSuspendedOrdersAndThrowError$1(this, continuation);
            }
        }
        Object objCopydefault = reEnableViewModel$getSuspendedOrdersAndThrowError$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reEnableViewModel$getSuspendedOrdersAndThrowError$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (this.isConnected.length() == 0) {
                reEnableViewModel$getSuspendedOrdersAndThrowError$1.L$0 = this;
                reEnableViewModel$getSuspendedOrdersAndThrowError$1.label = 1;
                objCopydefault = copydefault(reEnableViewModel$getSuspendedOrdersAndThrowError$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                reEnableViewModel = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        reEnableViewModel = (ReEnableViewModel) reEnableViewModel$getSuspendedOrdersAndThrowError$1.L$0;
        C56391yDq.AEQbTJ(objCopydefault);
        reEnableViewModel.isConnected = (String) objCopydefault;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super String> continuation) throws Throwable {
        ReEnableViewModel$getSuspendedOrders$1 reEnableViewModel$getSuspendedOrders$1;
        String address;
        String address2;
        List listGEmmrt;
        ArrayList<Long> chainIndexList;
        if (continuation instanceof ReEnableViewModel$getSuspendedOrders$1) {
            reEnableViewModel$getSuspendedOrders$1 = (ReEnableViewModel$getSuspendedOrders$1) continuation;
            int i = reEnableViewModel$getSuspendedOrders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reEnableViewModel$getSuspendedOrders$1.label = i - Integer.MIN_VALUE;
            } else {
                reEnableViewModel$getSuspendedOrders$1 = new ReEnableViewModel$getSuspendedOrders$1(this, continuation);
            }
        }
        Object objCopydefault = reEnableViewModel$getSuspendedOrders$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = reEnableViewModel$getSuspendedOrders$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            AbstractC12782ctV abstractC12782ctV = this.getFieldNames;
            if (abstractC12782ctV == null) {
                return "";
            }
            gKO gko = (gKO) C43248rlh.KWHzl.AEQbTJ(gKO.class);
            String strDbNXlk = abstractC12782ctV.DbNXlk();
            SingleTeeStatus singleTeeStatus = this.fetchVPNInfo;
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
                listGEmmrt = new ArrayList();
                Iterator<T> it = chainIndexList.iterator();
                while (it.hasNext()) {
                    ChainAddress chainAddress3 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, ((Number) it.next()).longValue(), null, 2, null);
                    String address3 = chainAddress3 != null ? chainAddress3.getAddress() : null;
                    if (address3 != null) {
                        listGEmmrt.add(address3);
                    }
                }
            }
            gKU gku = new gKU(strDbNXlk, listGEmmrt, null, C56402yEa.EZpvd(OrderStatus.Suspended));
            reEnableViewModel$getSuspendedOrders$1.label = 1;
            objCopydefault = gko.copydefault(gku, reEnableViewModel$getSuspendedOrders$1);
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
        String strValueOf = gkv != null ? String.valueOf(gkv.getOrderNum() + gkv.getStrategyNum()) : null;
        return strValueOf == null ? "" : strValueOf;
    }

    public final void KWHzl(@NotNull String str, @NotNull ReNewEnableViewModel.ActionBar actionBar, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ReEnableViewModel$enable$1(this, str, i, z, actionBar, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, int i, boolean z, Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function2, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) throws Throwable {
        ReEnableViewModel$enable$2 reEnableViewModel$enable$2;
        Function1<? super Continuation<? super Unit>, ? extends Object> function12;
        Object objEZpvd;
        ReEnableViewModel reEnableViewModel;
        Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function22;
        List list;
        Function1<? super Continuation<? super Unit>, ? extends Object> function13;
        ReEnableViewModel reEnableViewModel2;
        TeeOperateSuccessState teeOperateSuccessState;
        Object obj;
        List list2;
        Object obj2;
        Function1<? super Continuation<? super Unit>, ? extends Object> function14;
        if (continuation instanceof ReEnableViewModel$enable$2) {
            reEnableViewModel$enable$2 = (ReEnableViewModel$enable$2) continuation;
            int i2 = reEnableViewModel$enable$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reEnableViewModel$enable$2.label = i2 - Integer.MIN_VALUE;
            } else {
                reEnableViewModel$enable$2 = new ReEnableViewModel$enable$2(this, continuation);
            }
        }
        Object obj3 = reEnableViewModel$enable$2.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = reEnableViewModel$enable$2.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj3);
            long jCurrentTimeMillis = System.currentTimeMillis();
            fTG ftg = this.AhwBna;
            List<Long> list3 = this.getNewProxyInstance;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list3) {
                long jLongValue = ((Number) obj4).longValue();
                AbstractC12782ctV abstractC12782ctV = this.getFieldNames;
                if (abstractC12782ctV != null && abstractC12782ctV.KWHzl(C56443yFo.KWHzl(jLongValue))) {
                    arrayList.add(obj4);
                }
            }
            ActivateTeeModel activateTeeModel = new ActivateTeeModel(arrayList, jCurrentTimeMillis, (((long) i) * CalendarModelKt.MillisecondsIn24Hours) + jCurrentTimeMillis, z, TeeType.PRIVATE_TEE, TeeCommand.UPGRADE_TEE);
            AbstractC12782ctV abstractC12782ctV2 = this.getFieldNames;
            Intrinsics.copydefault(abstractC12782ctV2);
            reEnableViewModel$enable$2.L$0 = this;
            reEnableViewModel$enable$2.L$1 = function2;
            function12 = function1;
            reEnableViewModel$enable$2.L$2 = function12;
            reEnableViewModel$enable$2.label = 1;
            objEZpvd = ftg.EZpvd(str, activateTeeModel, abstractC12782ctV2, reEnableViewModel$enable$2);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            reEnableViewModel = this;
            function22 = function2;
        } else if (i3 == 1) {
            Function1<? super Continuation<? super Unit>, ? extends Object> function15 = (Function1) reEnableViewModel$enable$2.L$2;
            function22 = (Function2) reEnableViewModel$enable$2.L$1;
            reEnableViewModel = (ReEnableViewModel) reEnableViewModel$enable$2.L$0;
            C56391yDq.AEQbTJ(obj3);
            objEZpvd = ((Result) obj3).m7386unboximpl();
            function12 = function15;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj3);
                        return Unit.INSTANCE;
                    }
                    obj = reEnableViewModel$enable$2.L$1;
                    function14 = (Function1) reEnableViewModel$enable$2.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    objEZpvd = obj;
                    function12 = function14;
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                        reEnableViewModel$enable$2.L$0 = objEZpvd;
                        reEnableViewModel$enable$2.L$1 = null;
                        reEnableViewModel$enable$2.L$2 = null;
                        reEnableViewModel$enable$2.label = 5;
                        if (function12.invoke(reEnableViewModel$enable$2) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                list = (List) reEnableViewModel$enable$2.L$3;
                obj2 = reEnableViewModel$enable$2.L$2;
                function13 = (Function1) reEnableViewModel$enable$2.L$1;
                function22 = (Function2) reEnableViewModel$enable$2.L$0;
                C56391yDq.AEQbTJ(obj3);
                list2 = list;
                obj = obj2;
                reEnableViewModel$enable$2.L$0 = function13;
                reEnableViewModel$enable$2.L$1 = obj;
                reEnableViewModel$enable$2.L$2 = null;
                reEnableViewModel$enable$2.L$3 = null;
                reEnableViewModel$enable$2.L$4 = null;
                reEnableViewModel$enable$2.label = 4;
                if (function22.invoke(list2, reEnableViewModel$enable$2) == objCopydefault) {
                    return objCopydefault;
                }
                function14 = function13;
                objEZpvd = obj;
                function12 = function14;
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                }
                return Unit.INSTANCE;
            }
            list = (List) reEnableViewModel$enable$2.L$4;
            Object obj5 = reEnableViewModel$enable$2.L$3;
            Function1<? super Continuation<? super Unit>, ? extends Object> function16 = (Function1) reEnableViewModel$enable$2.L$2;
            Function2<? super List<TeeOperateSuccessState>, ? super Continuation<? super Unit>, ? extends Object> function23 = (Function2) reEnableViewModel$enable$2.L$1;
            reEnableViewModel2 = (ReEnableViewModel) reEnableViewModel$enable$2.L$0;
            C56391yDq.AEQbTJ(obj3);
            objEZpvd = obj5;
            function13 = function16;
            function22 = function23;
            teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (teeOperateSuccessState == null) {
                fWU fwu = reEnableViewModel2.DbNXlk;
                long expireTimestamp = teeOperateSuccessState.getExpireTimestamp();
                reEnableViewModel$enable$2.L$0 = function22;
                reEnableViewModel$enable$2.L$1 = function13;
                reEnableViewModel$enable$2.L$2 = objEZpvd;
                reEnableViewModel$enable$2.L$3 = list;
                reEnableViewModel$enable$2.L$4 = null;
                reEnableViewModel$enable$2.label = 3;
                if (fwu.copydefault(expireTimestamp, reEnableViewModel$enable$2) == objCopydefault) {
                    return objCopydefault;
                }
                obj2 = objEZpvd;
                list2 = list;
                obj = obj2;
                reEnableViewModel$enable$2.L$0 = function13;
                reEnableViewModel$enable$2.L$1 = obj;
                reEnableViewModel$enable$2.L$2 = null;
                reEnableViewModel$enable$2.L$3 = null;
                reEnableViewModel$enable$2.L$4 = null;
                reEnableViewModel$enable$2.label = 4;
                if (function22.invoke(list2, reEnableViewModel$enable$2) == objCopydefault) {
                }
            } else {
                List list4 = list;
                obj = objEZpvd;
                list2 = list4;
                reEnableViewModel$enable$2.L$0 = function13;
                reEnableViewModel$enable$2.L$1 = obj;
                reEnableViewModel$enable$2.L$2 = null;
                reEnableViewModel$enable$2.L$3 = null;
                reEnableViewModel$enable$2.L$4 = null;
                reEnableViewModel$enable$2.label = 4;
                if (function22.invoke(list2, reEnableViewModel$enable$2) == objCopydefault) {
                }
            }
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            list = (List) objEZpvd;
            fWU fwu2 = reEnableViewModel.DbNXlk;
            reEnableViewModel$enable$2.L$0 = reEnableViewModel;
            reEnableViewModel$enable$2.L$1 = function22;
            reEnableViewModel$enable$2.L$2 = function12;
            reEnableViewModel$enable$2.L$3 = objEZpvd;
            reEnableViewModel$enable$2.L$4 = list;
            reEnableViewModel$enable$2.label = 2;
            if (fwu2.OLrzqt(reEnableViewModel$enable$2) == objCopydefault) {
                return objCopydefault;
            }
            function13 = function12;
            reEnableViewModel2 = reEnableViewModel;
            teeOperateSuccessState = (TeeOperateSuccessState) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (teeOperateSuccessState == null) {
            }
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(Continuation<? super Unit> continuation) throws Throwable {
        ReEnableViewModel$refreshTeeMetaData$1 reEnableViewModel$refreshTeeMetaData$1;
        ReEnableViewModel reEnableViewModel;
        ReEnableViewModel reEnableViewModel2;
        if (continuation instanceof ReEnableViewModel$refreshTeeMetaData$1) {
            reEnableViewModel$refreshTeeMetaData$1 = (ReEnableViewModel$refreshTeeMetaData$1) continuation;
            int i = reEnableViewModel$refreshTeeMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reEnableViewModel$refreshTeeMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                reEnableViewModel$refreshTeeMetaData$1 = new ReEnableViewModel$refreshTeeMetaData$1(this, continuation);
            }
        }
        Object objAEQbTJ = reEnableViewModel$refreshTeeMetaData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reEnableViewModel$refreshTeeMetaData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            fWU fwu = this.DbNXlk;
            reEnableViewModel$refreshTeeMetaData$1.L$0 = this;
            reEnableViewModel$refreshTeeMetaData$1.L$1 = this;
            reEnableViewModel$refreshTeeMetaData$1.label = 1;
            objAEQbTJ = fwu.AEQbTJ(reEnableViewModel$refreshTeeMetaData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            reEnableViewModel = this;
            reEnableViewModel2 = reEnableViewModel;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reEnableViewModel2 = (ReEnableViewModel) reEnableViewModel$refreshTeeMetaData$1.L$1;
            reEnableViewModel = (ReEnableViewModel) reEnableViewModel$refreshTeeMetaData$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        reEnableViewModel2.fARcdN = (TeeMetadata) objAEQbTJ;
        TeeMetadata teeMetadata = reEnableViewModel.fARcdN;
        if (teeMetadata == null) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(teeMetadata);
        reEnableViewModel.getNewProxyInstance = teeMetadata.getSupportChainIndexList();
        TeeMetadata teeMetadata2 = reEnableViewModel.fARcdN;
        Intrinsics.copydefault(teeMetadata2);
        reEnableViewModel.ejfBZ = teeMetadata2.getChainNameMapping();
        reEnableViewModel.copydefault.setValue(reEnableViewModel.fARcdN);
        TeeMetadata teeMetadata3 = reEnableViewModel.fARcdN;
        Intrinsics.copydefault(teeMetadata3);
        int iEZpvd = C17922fXg.EZpvd(teeMetadata3);
        reEnableViewModel.AuCTel = iEZpvd;
        if (iEZpvd != 1) {
            MutableStateFlow<Boolean> mutableStateFlow = reEnableViewModel.AEQbTJ;
            TeeMetadata teeMetadata4 = reEnableViewModel.fARcdN;
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
        ReEnableViewModel$refreshTeeStatus$1 reEnableViewModel$refreshTeeStatus$1;
        ReEnableViewModel reEnableViewModel;
        if (continuation instanceof ReEnableViewModel$refreshTeeStatus$1) {
            reEnableViewModel$refreshTeeStatus$1 = (ReEnableViewModel$refreshTeeStatus$1) continuation;
            int i = reEnableViewModel$refreshTeeStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reEnableViewModel$refreshTeeStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                reEnableViewModel$refreshTeeStatus$1 = new ReEnableViewModel$refreshTeeStatus$1(this, continuation);
            }
        }
        Object objOLrzqt = reEnableViewModel$refreshTeeStatus$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = reEnableViewModel$refreshTeeStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            fWU fwu = this.DbNXlk;
            reEnableViewModel$refreshTeeStatus$1.L$0 = this;
            reEnableViewModel$refreshTeeStatus$1.label = 1;
            objOLrzqt = fwu.OLrzqt(reEnableViewModel$refreshTeeStatus$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            reEnableViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reEnableViewModel = (ReEnableViewModel) reEnableViewModel$refreshTeeStatus$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        reEnableViewModel.fetchVPNInfo = (SingleTeeStatus) objOLrzqt;
        return Unit.INSTANCE;
    }
}
