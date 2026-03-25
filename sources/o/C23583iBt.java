package o;

import com.okinc.business.invest_biz.data.bean.InvestBaseFilter;
import com.okinc.business.invest_biz.data.bean.InvestFilterData;
import com.okinc.business.invest_biz.data.bean.InvestOrderTypeFilter;
import com.okinc.business.invest_biz.data.logic.InvestmentsManager$initData$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.SupervisorKt;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23583iBt {
    public static InvestFilterData EZpvd;
    public static final C23583iBt AEQbTJ = new C23583iBt();
    public static final C25592izd OLrzqt = C25592izd.OLrzqt;
    public static final int KWHzl = 8;

    private C23583iBt() {
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super C25542iyg> continuation) {
        return SupervisorKt.supervisorScope(new InvestmentsManager$initData$2(null), continuation);
    }

    public final boolean KWHzl() {
        return !EZpvd().isEmpty();
    }

    public final AbstractC58185ywX<java.lang.Boolean> AEQbTJ() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.iBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C23583iBt.OLrzqt(objectRef, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.iBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C23583iBt.OLrzqt(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, o.yxC] */
    public static final void OLrzqt(Ref.ObjectRef objectRef, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<InvestFilterData>> abstractC58185ywXAEQbTJ = C25592izd.OLrzqt.AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.iBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23583iBt.copydefault(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<InvestFilterData>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23583iBt.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23583iBt.AEQbTJ(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23583iBt.KWHzl(function12, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(new java.lang.Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final java.util.List<InvestBaseFilter> EZpvd() {
        java.util.List<InvestBaseFilter> arrayList;
        InvestFilterData investFilterData = EZpvd;
        if (investFilterData == null || (arrayList = investFilterData.getNetworkCondition()) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        return new java.util.ArrayList(arrayList);
    }

    public final java.util.List<InvestOrderTypeFilter> copydefault() {
        java.util.List<InvestOrderTypeFilter> orderTypeCondition;
        InvestFilterData investFilterData = EZpvd;
        java.util.List<InvestOrderTypeFilter> listAxsJAYsNCnLh = (investFilterData == null || (orderTypeCondition = investFilterData.getOrderTypeCondition()) == null) ? null : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(orderTypeCondition);
        return listAxsJAYsNCnLh == null ? yDY.AhwBna() : listAxsJAYsNCnLh;
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            EZpvd = (InvestFilterData) responseData.getData();
            interfaceC58184ywW.onNext(java.lang.Boolean.TRUE);
        } else {
            java.lang.String errorMsg = responseData.getErrorMsg();
            if (errorMsg.length() == 0) {
                errorMsg = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV);
            }
            interfaceC58184ywW.onError(new java.lang.Exception(errorMsg));
        }
        return Unit.INSTANCE;
    }
}
