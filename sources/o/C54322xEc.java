package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54322xEc extends xGQ<java.lang.Object> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public InterfaceC58217yxC AEQbTJ;
    public final java.lang.String AhwBna;
    public final CopyOnWriteArrayList<BizTradeStrategyInfo> KWHzl;
    public volatile boolean OLrzqt;
    public final AbstractC55714xpE copydefault;
    public AbstractC57556yke djBIcL;

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xGQ
    public java.lang.String bJ_() {
        return "all-algos";
    }

    public C54322xEc(@NotNull java.lang.String str, @NotNull AbstractC55714xpE abstractC55714xpE) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55714xpE, "");
        this.AhwBna = str;
        this.copydefault = abstractC55714xpE;
        this.KWHzl = new CopyOnWriteArrayList<>();
        this.OLrzqt = true;
        java.lang.String ordType = abstractC55714xpE.copydefault().getOrdType();
        if (Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) ordType, (java.lang.Object) "lvf_buy")) {
            return;
        }
        copydefault();
    }

    /* JADX INFO: renamed from: o.xEc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xEc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    private final void copydefault() {
        java.lang.String strBJ_ = bJ_();
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, strBJ_, new WsArgV5(strBJ_, null, null, null, null, this.copydefault.copydefault().getAlgoId(), null, null, 222, null), (Function1) null, 4, (java.lang.Object) null);
        this.djBIcL = wsListener$default;
        if (wsListener$default != null) {
            wsListener$default.AhwBna();
        }
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(1000L, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54322xEc.OLrzqt(this.EZpvd, str, (java.lang.Long) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgTimer.subscribe(new InterfaceC58227yxM() { // from class: o.xEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54322xEc.EZpvd(function1, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C54322xEc c54322xEc, java.lang.String str, java.lang.Long l) {
        c54322xEc.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            KWHzl(str);
            BizTradeStrategyInfo bizTradeStrategyInfo = (BizTradeStrategyInfo) CollectionsKt___CollectionsKt.firstOrNull(this.KWHzl);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (bizTradeStrategyInfo != null ? bizTradeStrategyInfo.getOrderAlgoId() : null))) {
                this.copydefault.KWHzl("WebSocket", this.KWHzl);
                pUU.EZpvd("BotSingleOrderTask", "onResult：" + this.KWHzl);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("BotSingleOrderTask", "handleWsData error cause by " + Unit.INSTANCE);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.OLrzqt) {
            this.KWHzl.clear();
            java.util.List<StrategyPendingListResp> listCopydefault = copydefault(str);
            if (listCopydefault != null) {
                java.util.Iterator<T> it = listCopydefault.iterator();
                while (it.hasNext()) {
                    EZpvd((StrategyPendingListResp) it.next());
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull StrategyPendingListResp strategyPendingListResp) {
        boolean z;
        Intrinsics.checkNotNullParameter(strategyPendingListResp, "");
        java.lang.String state = strategyPendingListResp.getState();
        switch (state.hashCode()) {
            case -1884319283:
                z = state.equals("stopped");
                break;
            case -1468651097:
                if (!state.equals("effective")) {
                }
                break;
            case -1402931637:
                if (!state.equals("completed")) {
                }
                break;
            case -123173735:
                if (!state.equals("canceled")) {
                }
                break;
            case 51:
                if (!state.equals("3")) {
                }
                break;
            case 54:
                if (!state.equals(OrderDetailListItem.SLIP_OUT)) {
                }
                break;
            case 55:
                if (!state.equals("7")) {
                }
                break;
            case 1567:
                if (state.equals("10")) {
                }
                break;
            case 1573:
                if (!state.equals("16")) {
                }
                break;
            case 3540994:
                if (!state.equals("stop")) {
                }
                break;
            case 651875918:
                if (!state.equals("order_failed")) {
                }
                break;
        }
        strategyPendingListResp.setStoped(z);
        this.KWHzl.add(strategyPendingListResp);
    }

    private final java.util.List<StrategyPendingListResp> copydefault(java.lang.String str) {
        java.util.List<StrategyPendingListResp> listEZpvd = new C56035xvH().EZpvd(str);
        if (listEZpvd == null || listEZpvd.isEmpty()) {
            return null;
        }
        return listEZpvd;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if ((obj instanceof AbstractC55714xpE) && !Intrinsics.EZpvd((java.lang.Object) ((AbstractC55714xpE) obj).AEQbTJ(), (java.lang.Object) this.copydefault.AEQbTJ())) {
            return false;
        }
        KWHzl();
        return true;
    }

    public final void KWHzl() {
        C54407xHg.Companion.EZpvd(bJ_(), this.djBIcL);
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        this.djBIcL = null;
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }
}
