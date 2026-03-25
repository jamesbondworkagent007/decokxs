package o;

import com.okinc.core.widget.SortTextView;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyGridDealOrderGroup;
import com.okinc.unify_trade.biz.StrategyGridTradeOrderDetailsResponse;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.InterfaceC55705xow;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFQ extends xGQ<java.util.List<? extends StrategyGridTradeOrderDetailsResponse>> implements InterfaceC55705xow {
    public final C56216xyd AYXKKw;
    public int AhwBna;
    public final java.lang.String AkhnZx;
    public final java.util.ArrayList<StrategyGridTradeOrderDetailsResponse> DbNXlk;
    public InterfaceC58217yxC EZpvd;
    public final LinkedBlockingDeque<java.lang.String> KWHzl;
    public volatile boolean OLrzqt;
    public final java.lang.String copydefault;
    public AbstractC57556yke djBIcL;
    public java.lang.String fetchVPNInfo;
    public AbstractC55725xpP gEmmrt;
    public final java.util.ArrayList<StrategyGridTradeOrderDetailsResponse> valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortTextView.SortType.values().length];
            try {
                iArr[SortTextView.SortType.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SortTextView.SortType.UP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // o.xGQ
    public /* synthetic */ void AEQbTJ(java.util.List<? extends StrategyGridTradeOrderDetailsResponse> list) {
        copydefault((java.util.List<StrategyGridTradeOrderDetailsResponse>) list);
    }

    @Override // o.InterfaceC55705xow
    public void copydefault(@NotNull java.lang.Object obj) {
        InterfaceC55705xow.Application.EZpvd(this, obj);
    }

    public xFQ(@NotNull java.lang.String str, AbstractC55725xpP abstractC55725xpP) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AkhnZx = str;
        this.gEmmrt = abstractC55725xpP;
        this.copydefault = "TradeGridDealOrderTask";
        this.AYXKKw = new C56216xyd();
        this.valueOf = new java.util.ArrayList<>();
        this.DbNXlk = new java.util.ArrayList<>();
        this.KWHzl = new LinkedBlockingDeque<>();
        this.AhwBna = 1;
        valueOf();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xFQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC55705xow
    public void OLrzqt(SortTextView.SortType sortType) {
        StrategyGridDealOrderGroup strategyGridDealOrderGroupAEQbTJ;
        AbstractC55725xpP abstractC55725xpP = this.gEmmrt;
        if (abstractC55725xpP != null && (strategyGridDealOrderGroupAEQbTJ = abstractC55725xpP.AEQbTJ()) != null && strategyGridDealOrderGroupAEQbTJ.getHasWs()) {
            KWHzl();
        }
        this.AhwBna = 1;
        this.fetchVPNInfo = KWHzl(sortType);
        valueOf();
    }

    @Override // o.InterfaceC55705xow
    public void EZpvd() {
        if (this.valueOf.size() > 0) {
            valueOf();
        }
    }

    private final void valueOf() {
        java.lang.String algoId;
        StrategyGridDealOrderGroup strategyGridDealOrderGroupAEQbTJ;
        java.lang.String instId;
        StrategyGridDealOrderGroup strategyGridDealOrderGroupAEQbTJ2;
        this.OLrzqt = false;
        if (this.AhwBna == 1) {
            this.valueOf.clear();
        }
        C56216xyd c56216xyd = this.AYXKKw;
        AbstractC55725xpP abstractC55725xpP = this.gEmmrt;
        java.lang.String str = "";
        if (abstractC55725xpP == null || (strategyGridDealOrderGroupAEQbTJ2 = abstractC55725xpP.AEQbTJ()) == null || (algoId = strategyGridDealOrderGroupAEQbTJ2.getAlgoId()) == null) {
            algoId = "";
        }
        c56216xyd.KWHzl(algoId);
        AbstractC55725xpP abstractC55725xpP2 = this.gEmmrt;
        if (abstractC55725xpP2 != null && (strategyGridDealOrderGroupAEQbTJ = abstractC55725xpP2.AEQbTJ()) != null && (instId = strategyGridDealOrderGroupAEQbTJ.getInstId()) != null) {
            str = instId;
        }
        c56216xyd.copydefault(str);
        c56216xyd.copydefault(java.lang.Integer.valueOf(this.AhwBna));
        c56216xyd.OLrzqt(this.fetchVPNInfo);
        c56216xyd.KWHzl(new Function1() { // from class: o.xFN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xFQ.copydefault(this.copydefault, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56216xyd, 0L, 1, null);
    }

    public static final Unit copydefault(xFQ xfq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        xfq.OLrzqt = true;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            xfq.copydefault((java.util.List<StrategyGridTradeOrderDetailsResponse>) data, C33129mqd.AEQbTJ(java.lang.Integer.valueOf(xfq.AhwBna), 1));
            xfq.AhwBna++;
        } else {
            AbstractC55725xpP abstractC55725xpP = xfq.gEmmrt;
            if (abstractC55725xpP != null) {
                abstractC55725xpP.EZpvd(responseData.getMsg());
            }
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(java.util.List<StrategyGridTradeOrderDetailsResponse> list, boolean z) {
        AbstractC55725xpP abstractC55725xpP;
        StrategyGridDealOrderGroup strategyGridDealOrderGroupAEQbTJ;
        EZpvd(list);
        AbstractC55725xpP abstractC55725xpP2 = this.gEmmrt;
        if (abstractC55725xpP2 != null) {
            abstractC55725xpP2.AEQbTJ("http", new java.util.ArrayList(this.valueOf), this, java.lang.Boolean.valueOf(list.size() < C33129mqd.AhwBna("20")));
        }
        if (z || (abstractC55725xpP = this.gEmmrt) == null || (strategyGridDealOrderGroupAEQbTJ = abstractC55725xpP.AEQbTJ()) == null || !strategyGridDealOrderGroupAEQbTJ.getHasWs()) {
            return;
        }
        gEmmrt();
    }

    private final void EZpvd(java.util.List<StrategyGridTradeOrderDetailsResponse> list) {
        this.valueOf.addAll(list);
    }

    private final void gEmmrt() {
        StrategyGridDealOrderGroup strategyGridDealOrderGroupAEQbTJ;
        AbstractC55725xpP abstractC55725xpP = this.gEmmrt;
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "algo-grid-trade-group", new WsArgV5("algo-grid-trade-group", null, null, "ANY", null, (abstractC55725xpP == null || (strategyGridDealOrderGroupAEQbTJ = abstractC55725xpP.AEQbTJ()) == null) ? null : strategyGridDealOrderGroupAEQbTJ.getAlgoId(), null, null, 210, null), (Function1) null, 4, (java.lang.Object) null);
        this.djBIcL = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
        KWHzl(700L);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) throws java.lang.InterruptedException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(true);
        this.KWHzl.put(str);
    }

    /* JADX DEBUG: Method merged with bridge method: bD_()Ljava/lang/Object; */
    @Override // o.xGQ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<StrategyGridTradeOrderDetailsResponse> bD_() {
        if (!this.OLrzqt) {
            return null;
        }
        this.DbNXlk.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!this.KWHzl.isEmpty()) {
            arrayList.add(this.KWHzl.take());
        }
        java.util.Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.util.List<StrategyGridTradeOrderDetailsResponse> listCopydefault = copydefault((java.lang.String) next);
            if (listCopydefault != null) {
                AEQbTJ2(listCopydefault);
            }
        }
        return this.valueOf;
    }

    public void copydefault(@NotNull java.util.List<StrategyGridTradeOrderDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC55725xpP abstractC55725xpP = this.gEmmrt;
        if (abstractC55725xpP != null) {
            abstractC55725xpP.AEQbTJ("WebSocket", new java.util.ArrayList(this.valueOf), this, null);
        }
    }

    public final java.util.List<StrategyGridTradeOrderDetailsResponse> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            java.util.List list = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(StrategyGridTradeOrderDetailsResponse.Companion.serializer()), str);
            if (list != null && !list.isEmpty()) {
                return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final void AEQbTJ2(@NotNull java.util.List<StrategyGridTradeOrderDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<StrategyGridTradeOrderDetailsResponse> it = list.iterator();
        while (it.hasNext()) {
            KWHzl(it.next());
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55725xpP) {
            java.lang.String strKWHzl = ((AbstractC55725xpP) obj).KWHzl();
            AbstractC55725xpP abstractC55725xpP = this.gEmmrt;
            if (!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) (abstractC55725xpP != null ? abstractC55725xpP.KWHzl() : null))) {
                return false;
            }
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        C54407xHg.Companion.EZpvd("algo-grid-trade-group", this.djBIcL);
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.djBIcL = null;
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxCIwGUEr = iwGUEr();
        if (interfaceC58217yxCIwGUEr != null) {
            interfaceC58217yxCIwGUEr.dispose();
        }
        this.AYXKKw.AYXKKw();
    }

    public final java.lang.String KWHzl(SortTextView.SortType sortType) {
        int i = sortType == null ? -1 : ActionBar.OLrzqt[sortType.ordinal()];
        if (i == 1) {
            return "desc";
        }
        if (i != 2) {
            return null;
        }
        return "asc";
    }

    public final void KWHzl(StrategyGridTradeOrderDetailsResponse strategyGridTradeOrderDetailsResponse) {
        java.util.Iterator<StrategyGridTradeOrderDetailsResponse> it = this.valueOf.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) strategyGridTradeOrderDetailsResponse.getGroupId(), (java.lang.Object) it.next().getGroupId())) {
                break;
            } else {
                i++;
            }
        }
        if (C33129mqd.AhwBna(java.lang.Integer.valueOf(i), -1)) {
            Intrinsics.checkNotNullExpressionValue(this.valueOf.set(i, strategyGridTradeOrderDetailsResponse), "");
        } else {
            this.valueOf.add(0, strategyGridTradeOrderDetailsResponse);
            Unit unit = Unit.INSTANCE;
        }
    }
}
