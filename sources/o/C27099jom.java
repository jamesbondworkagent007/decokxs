package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.invest_biz.data.bean.InvestBaseFilter;
import com.okinc.business.invest_biz.data.bean.InvestDetailOrderVo;
import com.okinc.business.invest_biz.data.bean.InvestOrderBean;
import com.okinc.business.invest_biz.data.bean.InvestOrderTypeFilter;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27099jom extends AbstractC33073mpa {
    public final MutableStateFlow<InvestOrderTypeFilter> AEQbTJ;
    public int AYXKKw;
    public InvestBaseFilter EZpvd;
    public final StateFlow<InvestOrderTypeFilter> KWHzl;
    public final java.util.ArrayList<InvestOrderBean> OLrzqt = new java.util.ArrayList<>();
    public final MutableLiveData<Triple<java.util.List<InvestOrderBean>, java.lang.Boolean, java.lang.Boolean>> copydefault = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData KWHzl(java.lang.Boolean bool, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InvestOrderTypeFilter> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InvestBaseFilter investBaseFilter) {
        this.EZpvd = investBaseFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Triple<java.util.List<InvestOrderBean>, java.lang.Boolean, java.lang.Boolean>> copydefault() {
        return this.copydefault;
    }

    public C27099jom() {
        MutableStateFlow<InvestOrderTypeFilter> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt___CollectionsKt.firstOrNull(C23583iBt.AEQbTJ.copydefault()));
        this.AEQbTJ = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = 1;
    }

    public static /* synthetic */ void loadOrderList$default(C27099jom c27099jom, java.lang.String str, java.lang.Long l, java.util.List list, boolean z, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            i = 10;
        }
        c27099jom.KWHzl(str, l, list, z, i, function1);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.Long l, @NotNull java.util.List<InvestWalletAddressInfo> list, final boolean z, int i, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.String filterId;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            this.AYXKKw = 1;
        }
        C23583iBt c23583iBt = C23583iBt.AEQbTJ;
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = c23583iBt.AEQbTJ();
        C25592izd c25592izd = C25592izd.OLrzqt;
        InvestOrderTypeFilter value = this.AEQbTJ.getValue();
        AbstractC58185ywX<ResponseData<InvestDetailOrderVo>> abstractC58185ywXKWHzl = c25592izd.KWHzl(str, l, (value == null || (filterId = value.getFilterId()) == null) ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(filterId), list, i, this.AYXKKw);
        if (!c23583iBt.KWHzl()) {
            final Function2 function2 = new Function2() { // from class: o.jon
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C27099jom.KWHzl((java.lang.Boolean) obj, (ResponseData) obj2);
                }
            };
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(abstractC58185ywXAEQbTJ, abstractC58185ywXKWHzl, new InterfaceC58223yxI() { // from class: o.jol
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C27099jom.OLrzqt(function2, obj, obj2);
                }
            });
        }
        C58216yxB c58216yxBCall = call();
        final Function1 function12 = new Function1() { // from class: o.jop
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27099jom.copydefault(function1, this, z, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<InvestDetailOrderVo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.joo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27099jom.EZpvd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.jos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27099jom.KWHzl(this.copydefault, z, function1, (java.lang.Throwable) obj);
            }
        };
        c58216yxBCall.AEQbTJ(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C27099jom.OLrzqt(function13, obj);
            }
        }));
    }

    public static final ResponseData OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C27099jom c27099jom, boolean z, Function1 function1, java.lang.Throwable th) {
        MutableLiveData<Triple<java.util.List<InvestOrderBean>, java.lang.Boolean, java.lang.Boolean>> mutableLiveData = c27099jom.copydefault;
        java.util.ArrayList<InvestOrderBean> arrayList = c27099jom.OLrzqt;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        mutableLiveData.setValue(new Triple<>(arrayList, bool, java.lang.Boolean.valueOf(z)));
        function1.invoke(bool);
        th.printStackTrace();
        return Unit.INSTANCE;
    }

    public final InvestBaseFilter AEQbTJ() {
        if (this.EZpvd == null) {
            this.EZpvd = (InvestBaseFilter) CollectionsKt___CollectionsKt.firstOrNull(AhwBna());
        }
        return this.EZpvd;
    }

    public final java.util.List<InvestBaseFilter> AhwBna() {
        java.util.List<InvestBaseFilter> listEZpvd = C23583iBt.AEQbTJ.EZpvd();
        for (InvestBaseFilter investBaseFilter : listEZpvd) {
            InvestBaseFilter investBaseFilter2 = this.EZpvd;
            investBaseFilter.setSelected(C59449zhJ.gEmmrt(investBaseFilter2 != null ? investBaseFilter2.getFilterId() : null, investBaseFilter.getFilterId(), true));
        }
        return listEZpvd;
    }

    public final void OLrzqt(InvestOrderTypeFilter investOrderTypeFilter) {
        this.AEQbTJ.setValue(investOrderTypeFilter);
    }

    public final java.util.List<InvestOrderTypeFilter> KWHzl() {
        java.util.List<InvestOrderTypeFilter> listCopydefault = C23583iBt.AEQbTJ.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (InvestOrderTypeFilter investOrderTypeFilter : listCopydefault) {
            java.lang.String filterId = null;
            InvestOrderTypeFilter investOrderTypeFilterCopy$default = InvestOrderTypeFilter.copy$default(investOrderTypeFilter, null, null, 3, null);
            InvestOrderTypeFilter value = this.AEQbTJ.getValue();
            if (value != null) {
                filterId = value.getFilterId();
            }
            investOrderTypeFilterCopy$default.setSelected(Intrinsics.EZpvd((java.lang.Object) filterId, (java.lang.Object) investOrderTypeFilter.getFilterId()));
            arrayList.add(investOrderTypeFilterCopy$default);
        }
        return arrayList;
    }

    public final InvestOrderTypeFilter OLrzqt() {
        if (this.AEQbTJ.getValue() == null) {
            OLrzqt((InvestOrderTypeFilter) CollectionsKt___CollectionsKt.firstOrNull(KWHzl()));
        }
        return this.AEQbTJ.getValue();
    }

    public static final Unit copydefault(Function1 function1, C27099jom c27099jom, boolean z, ResponseData responseData) {
        java.util.List<InvestOrderBean> homeOrderInfoVoList;
        if (responseData.getCode() == 0) {
            InvestDetailOrderVo investDetailOrderVo = (InvestDetailOrderVo) responseData.getData();
            boolean zIsEmpty = true;
            if (investDetailOrderVo != null && (z || !investDetailOrderVo.getHomeOrderInfoVoList().isEmpty())) {
                c27099jom.AYXKKw++;
                if (z) {
                    c27099jom.OLrzqt.clear();
                }
                c27099jom.OLrzqt.addAll(investDetailOrderVo.getHomeOrderInfoVoList());
                c27099jom.copydefault.setValue(new Triple<>(c27099jom.OLrzqt, java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(z)));
            }
            InvestDetailOrderVo investDetailOrderVo2 = (InvestDetailOrderVo) responseData.getData();
            if (investDetailOrderVo2 != null && (homeOrderInfoVoList = investDetailOrderVo2.getHomeOrderInfoVoList()) != null) {
                zIsEmpty = homeOrderInfoVoList.isEmpty();
            }
            function1.invoke(java.lang.Boolean.valueOf(zIsEmpty));
        } else {
            MutableLiveData<Triple<java.util.List<InvestOrderBean>, java.lang.Boolean, java.lang.Boolean>> mutableLiveData = c27099jom.copydefault;
            java.util.ArrayList<InvestOrderBean> arrayList = c27099jom.OLrzqt;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            mutableLiveData.setValue(new Triple<>(arrayList, bool, java.lang.Boolean.valueOf(z)));
            function1.invoke(bool);
        }
        return Unit.INSTANCE;
    }
}
