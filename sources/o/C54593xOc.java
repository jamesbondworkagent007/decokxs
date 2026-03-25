package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.dex.biz.data.OKTDexChainInfoModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C54593xOc;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54593xOc extends xNW {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final boolean AEQbTJ;
    public final java.lang.String KWHzl = "OKTDexChainsProvider";
    public final C54279xCn AhwBna = new C54279xCn();
    public final C54275xCj copydefault = new C54275xCj();
    public final MutableStateFlow<ActionBar> EZpvd = StateFlowKt.MutableStateFlow(ActionBar.Companion.OLrzqt());

    @Override // o.xNW
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public boolean bE_() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.xOc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xOc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.xOc$ActionBar */
    public static final class ActionBar {
        public static final C0995ActionBar Companion = new C0995ActionBar(null);
        public static final ActionBar copydefault = new ActionBar(yDY.AhwBna());
        public final InterfaceC56387yDm AEQbTJ;
        public final java.util.List<OKTDexChainInfoModel> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xOc$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.util.List<OKTDexChainInfoModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChainData(chains=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.util.List<OKTDexChainInfoModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xOi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C54593xOc.ActionBar.OLrzqt(this.copydefault);
                }
            });
        }

        public static final java.util.Map OLrzqt(ActionBar actionBar) {
            java.util.List<OKTDexChainInfoModel> list = actionBar.KWHzl;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
            for (java.lang.Object obj : list) {
                linkedHashMap.put(((OKTDexChainInfoModel) obj).getChainIndex(), obj);
            }
            return linkedHashMap;
        }

        /* JADX INFO: renamed from: o.xOc$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0995ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xOc.ActionBar.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0995ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0995ActionBar() {
            }

            public final ActionBar OLrzqt() {
                return ActionBar.copydefault;
            }
        }

        public final java.util.List<OKTDexChainInfoModel> EZpvd() {
            java.util.List<OKTDexChainInfoModel> list = this.KWHzl;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!((OKTDexChainInfoModel) obj).getBNBChain()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.List<OKTDexChainInfoModel>> xklAEQbTJ = AEQbTJ();
        xklAEQbTJ.AYXKKw();
        xklAEQbTJ.KWHzl(new Function1() { // from class: o.xOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54593xOc.KWHzl(this.copydefault, xklAEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklAEQbTJ, 0L, 1, null);
    }

    public static final Unit KWHzl(C54593xOc c54593xOc, xKL xkl, ResponseData responseData) {
        java.util.List list;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = c54593xOc.fJNWhG();
        java.lang.String strEZpvd = c54593xOc.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        java.lang.String msg = (responseData.getCode() != 0 || responseData.getData() == null) ? responseData.getMsg() : "";
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp requestCoinsInfo:" + z + ";" + msg + "; costTime: " + (java.lang.System.currentTimeMillis() - c54593xOc.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null && (list = (java.util.List) responseData.getData()) != null && (!list.isEmpty())) {
            xNW.notifyResult$default(c54593xOc, true, null, 2, null);
            MutableStateFlow<ActionBar> mutableStateFlow = c54593xOc.EZpvd;
            java.util.List listAhwBna = (java.util.List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            mutableStateFlow.setValue(new ActionBar(listAhwBna));
        } else {
            c54593xOc.AEQbTJ(false, c54593xOc.AEQbTJ(xkl.AhwBna().getValue()));
        }
        return Unit.INSTANCE;
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        return yDY.gEmmrt(this.AhwBna, this.copydefault);
    }

    public final OKTDexChainInfoModel OLrzqt() {
        java.lang.Object next;
        java.util.Iterator<T> it = this.EZpvd.getValue().EZpvd().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((OKTDexChainInfoModel) next).isDefault(), (java.lang.Object) "1")) {
                break;
            }
        }
        return (OKTDexChainInfoModel) next;
    }

    private final xKL<java.util.List<OKTDexChainInfoModel>> AEQbTJ() {
        return hDKMBd() ? this.copydefault : this.AhwBna;
    }
}
