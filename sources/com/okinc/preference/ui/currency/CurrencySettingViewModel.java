package com.okinc.preference.ui.currency;

import androidx.lifecycle.ViewModel;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okuser.data.PersonalSetting;
import com.okinc.preference.data.model.ChangeValCurrencyData;
import com.okinc.preference.data.model.EmptyResp;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.preference.ui.currency.CurrencySettingViewModel;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC58185ywX;
import o.C32979mnm;
import o.C33129mqd;
import o.C46541tYd;
import o.C46548tYk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.C58216yxB;
import o.C58266yxz;
import o.InterfaceC46550tYm;
import o.InterfaceC46553tYp;
import o.InterfaceC47278tmy;
import o.InterfaceC58227yxM;
import o.tYL;
import o.yBP;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class CurrencySettingViewModel extends ViewModel {
    public final MutableStateFlow<String> AEQbTJ;
    public final InterfaceC46553tYp AYXKKw;
    public final Flow<List<C46548tYk<ValuationCurrencyBean>>> AhwBna;
    public final C58216yxB EZpvd;
    public final MutableStateFlow<Integer> KWHzl;
    public final MutableStateFlow<List<ValuationCurrencyBean>> OLrzqt;
    public final MutableStateFlow<tYL> copydefault;
    public final Flow<Boolean> djBIcL;
    public final InterfaceC46550tYm gEmmrt;
    public final InterfaceC47278tmy isConnected;
    public final StateFlow<tYL> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<tYL> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<List<C46548tYk<ValuationCurrencyBean>>> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<Boolean> OLrzqt() {
        return this.djBIcL;
    }

    @yCM
    public CurrencySettingViewModel(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC46553tYp interfaceC46553tYp, @NotNull InterfaceC46550tYm interfaceC46550tYm) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC46553tYp, "");
        Intrinsics.checkNotNullParameter(interfaceC46550tYm, "");
        this.isConnected = interfaceC47278tmy;
        this.AYXKKw = interfaceC46553tYp;
        this.gEmmrt = interfaceC46550tYm;
        this.EZpvd = new C58216yxB();
        MutableStateFlow<tYL> MutableStateFlow = StateFlowKt.MutableStateFlow(new tYL(false, null, 3, null));
        this.copydefault = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<ValuationCurrencyBean>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow2;
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.AEQbTJ = MutableStateFlow3;
        MutableStateFlow<Integer> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Integer.valueOf(interfaceC46553tYp.QKVWgx()));
        this.KWHzl = MutableStateFlow4;
        this.AhwBna = FlowKt.combine(MutableStateFlow2, MutableStateFlow3, MutableStateFlow4, new CurrencySettingViewModel$filteredCurrencyList$1(null));
        this.djBIcL = new TaskDescription(MutableStateFlow2);
        copydefault();
    }

    public static final class TaskDescription implements Flow<Boolean> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.preference.ui.currency.CurrencySettingViewModel$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CurrencySettingViewModel$special$$inlined$map$1$2$1 currencySettingViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof CurrencySettingViewModel$special$$inlined$map$1$2$1) {
                    currencySettingViewModel$special$$inlined$map$1$2$1 = (CurrencySettingViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = currencySettingViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        currencySettingViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        currencySettingViewModel$special$$inlined$map$1$2$1 = new CurrencySettingViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = currencySettingViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = currencySettingViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    Boolean boolKWHzl = C56443yFo.KWHzl(((List) obj).size() > 10);
                    currencySettingViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(boolKWHzl, currencySettingViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void copydefault() {
        MutableStateFlow<tYL> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(tYL.copy$default(mutableStateFlow.getValue(), true, null, 2, null));
        AbstractC58185ywX abstractC58185ywXKWHzl = InterfaceC46550tYm.ActionBar.getCurrencyList$default(this.gEmmrt, false, 1, null).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.tYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CurrencySettingViewModel.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CurrencySettingViewModel.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.tYS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CurrencySettingViewModel.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.EZpvd.AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CurrencySettingViewModel.AhwBna(function12, obj);
            }
        }));
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(CurrencySettingViewModel currencySettingViewModel, ResponseData responseData) {
        List<ValuationCurrencyBean> listAhwBna;
        if (C33129mqd.KWHzl((Collection) responseData.getData())) {
            ArrayList<ValuationCurrencyBean> arrayList = (ArrayList) responseData.getData();
            if (arrayList == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new ArrayList<>(C56403yEb.AYXKKw(arrayList, 10));
                for (ValuationCurrencyBean valuationCurrencyBean : arrayList) {
                    ValuationCurrencyBean valuationCurrencyBean2 = new ValuationCurrencyBean();
                    valuationCurrencyBean2.setCurrencyId(C33129mqd.AhwBna(Integer.valueOf(valuationCurrencyBean.getCurrencyId())));
                    valuationCurrencyBean2.setIsoCode(valuationCurrencyBean.getIsoCode());
                    valuationCurrencyBean2.setDisplayName(valuationCurrencyBean.getDisplayName());
                    valuationCurrencyBean2.setDefault(C33129mqd.AhwBna(Integer.valueOf(valuationCurrencyBean.isDefault())));
                    valuationCurrencyBean2.setSymbol(valuationCurrencyBean.getSymbol());
                    valuationCurrencyBean2.setUsdToThisRate(C33129mqd.AEQbTJ(Double.valueOf(valuationCurrencyBean.getUsdToThisRate())));
                    valuationCurrencyBean2.setUsdToThisRatePremium(C33129mqd.AEQbTJ(Double.valueOf(valuationCurrencyBean.getUsdToThisRatePremium())));
                    valuationCurrencyBean2.setPremium(valuationCurrencyBean.isPremium());
                    valuationCurrencyBean2.setPrecision(C33129mqd.AhwBna(Integer.valueOf(valuationCurrencyBean.getPrecision())));
                    listAhwBna.add(valuationCurrencyBean2);
                }
            }
            currencySettingViewModel.OLrzqt.setValue(listAhwBna);
            MutableStateFlow<tYL> mutableStateFlow = currencySettingViewModel.copydefault;
            Object obj = null;
            mutableStateFlow.setValue(mutableStateFlow.getValue().copydefault(false, null));
            currencySettingViewModel.AYXKKw.copydefault(new ArrayList<>(listAhwBna));
            currencySettingViewModel.AYXKKw.fJNWhG();
            if (currencySettingViewModel.AYXKKw.QVAiDq().length() == 0) {
                Iterator<T> it = listAhwBna.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ValuationCurrencyBean) next).isDefault() == 1) {
                        obj = next;
                        break;
                    }
                }
                ValuationCurrencyBean valuationCurrencyBean3 = (ValuationCurrencyBean) obj;
                if (valuationCurrencyBean3 != null) {
                    InterfaceC46553tYp.Application.setValuationCurrencyId$default(currencySettingViewModel.AYXKKw, C32979mnm.EZpvd.OLrzqt(), valuationCurrencyBean3.getCurrencyId(), false, 4, null);
                    currencySettingViewModel.KWHzl.setValue(Integer.valueOf(valuationCurrencyBean3.getCurrencyId()));
                }
            }
        } else {
            MutableStateFlow<tYL> mutableStateFlow2 = currencySettingViewModel.copydefault;
            mutableStateFlow2.setValue(mutableStateFlow2.getValue().copydefault(false, "Network error, please retry"));
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(CurrencySettingViewModel currencySettingViewModel, Throwable th) {
        MutableStateFlow<tYL> mutableStateFlow = currencySettingViewModel.copydefault;
        mutableStateFlow.setValue(mutableStateFlow.getValue().copydefault(false, "Network error, please retry"));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(int i, int i2) {
        if (this.KWHzl.getValue().intValue() == i) {
            InterfaceC46553tYp.Application.setValuationCurrencyId$default(this.AYXKKw, C32979mnm.EZpvd.OLrzqt(), i, false, 4, null);
            return;
        }
        if (this.isConnected.values()) {
            copydefault(i);
            return;
        }
        RxBus.KWHzl("NOTIFY_COIN_CHANGE");
        PersonalSetting personalSetting = new PersonalSetting(0, 0, 0, 0, 15, (DefaultConstructorMarker) null);
        personalSetting.setChargeUnit(i);
        RxBus.AEQbTJ(new C46541tYd.TaskDescription(personalSetting));
        InterfaceC46553tYp.Application.setValuationCurrencyId$default(this.AYXKKw, C32979mnm.EZpvd.OLrzqt(), i, false, 4, null);
        this.KWHzl.setValue(Integer.valueOf(i));
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setValue(str);
    }

    public final void copydefault(final int i) {
        MutableStateFlow<tYL> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(tYL.copy$default(mutableStateFlow.getValue(), true, null, 2, null));
        RxBus.KWHzl("save_pre_valuation_current_symbol");
        AbstractC58185ywX<ResponseData<EmptyResp>> abstractC58185ywXKWHzl = this.gEmmrt.AEQbTJ(new ChangeValCurrencyData(C33129mqd.gEmmrt(Integer.valueOf(i)))).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.tYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CurrencySettingViewModel.KWHzl(this.EZpvd, i, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<EmptyResp>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CurrencySettingViewModel.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.tYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CurrencySettingViewModel.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        this.EZpvd.AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tYV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                CurrencySettingViewModel.AYXKKw(function12, obj);
            }
        }));
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(CurrencySettingViewModel currencySettingViewModel, Throwable th) {
        MutableStateFlow<tYL> mutableStateFlow = currencySettingViewModel.copydefault;
        mutableStateFlow.setValue(mutableStateFlow.getValue().copydefault(false, "Network error, please retry"));
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        MutableStateFlow<tYL> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(tYL.copy$default(mutableStateFlow.getValue(), false, null, 1, null));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.EZpvd.OLrzqt();
    }

    public static final Unit KWHzl(CurrencySettingViewModel currencySettingViewModel, int i, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            InterfaceC46553tYp.Application.setValuationCurrencyId$default(currencySettingViewModel.AYXKKw, C32979mnm.EZpvd.OLrzqt(), i, false, 4, null);
            RxBus.KWHzl("save_valuation_current_symbol");
            currencySettingViewModel.KWHzl.setValue(Integer.valueOf(i));
            MutableStateFlow<tYL> mutableStateFlow = currencySettingViewModel.copydefault;
            mutableStateFlow.setValue(tYL.copy$default(mutableStateFlow.getValue(), false, null, 2, null));
        } else {
            MutableStateFlow<tYL> mutableStateFlow2 = currencySettingViewModel.copydefault;
            mutableStateFlow2.setValue(mutableStateFlow2.getValue().copydefault(false, "Network error, please retry"));
        }
        return Unit.INSTANCE;
    }
}
