package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.biz.TacticsType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.strategy.bean.StrategyItemData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPendingListReq;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.C55688xof;
import o.xKK;

/* JADX INFO: renamed from: o.vkC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51284vkC extends AbstractC51282vkA {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public InterfaceC58217yxC OLrzqt;
    public final MutableLiveData<C55804xqp<StrategyDetailsResponse>> valueOf = new MutableLiveData<>();
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Boolean>> gEmmrt = new MutableLiveData<>();
    public final C54301xDi AYXKKw = new C54301xDi(false, 1, null);
    public final C56258xzS AEQbTJ = new C56258xzS();
    public java.lang.String djBIcL = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54301xDi ejfBZ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.Boolean>> fJNWhG() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C55804xqp<StrategyDetailsResponse>> fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56258xzS isConnected() {
        return this.AEQbTJ;
    }

    public C51284vkC() {
        values();
    }

    public final java.lang.String fARcdN() {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        StrategyItemData value = AEQbTJ().getValue();
        java.lang.String dcdState = null;
        java.lang.String strCopydefault = value != null ? value.copydefault() : null;
        C55804xqp<StrategyDetailsResponse> value2 = this.valueOf.getValue();
        if (value2 != null && (strategyDetailsResponseCopydefault = value2.copydefault()) != null) {
            dcdState = strategyDetailsResponseCopydefault.getDcdState();
        }
        if (dcdState == null) {
            dcdState = "";
        }
        return (strCopydefault == null || strCopydefault.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) ? dcdState : strCopydefault;
    }

    /* JADX INFO: renamed from: o.vkC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vkC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void values() {
        InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl = AbstractC58185ywX.copydefault(0L, 11L, 0L, 1L, java.util.concurrent.TimeUnit.SECONDS).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.vkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51284vkC.copydefault(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.OLrzqt = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58227yxM() { // from class: o.vkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C51284vkC.copydefault(function1, obj);
            }
        }).OLrzqt(new InterfaceC58222yxH() { // from class: o.vkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C51284vkC.EZpvd(this.copydefault);
            }
        }).DbNXlk();
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C51284vkC c51284vkC, java.lang.Long l) {
        c51284vkC.gEmmrt.setValue(new kotlin.Pair<>(C33069mpW.copydefault(C55688xof.Application.iKEqwx, C56423yEv.EZpvd(C56390yDp.OLrzqt("second", C33129mqd.subS$default(10, l, 0, null, null, 12, null)))), java.lang.Boolean.FALSE));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C51284vkC c51284vkC) {
        c51284vkC.gEmmrt.setValue(new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.DPHsZd), java.lang.Boolean.TRUE));
    }

    @Override // o.AbstractC51282vkA
    public void AkhnZx() {
        C54301xDi c54301xDi = this.AYXKKw;
        c54301xDi.AEQbTJ(this.valueOf);
        c54301xDi.AEQbTJ(KWHzl());
        xKK.Activity.execute$default(c54301xDi, 0L, 1, null);
    }

    @Override // o.AbstractC51282vkA
    public int EZpvd() {
        return C33070mpX.copydefault(C52761wXj.Activity.Dmq);
    }

    @Override // o.AbstractC51282vkA
    public boolean valueOf() {
        return !Intrinsics.EZpvd((java.lang.Object) fARcdN(), (java.lang.Object) "pending_matching");
    }

    @Override // o.AbstractC51282vkA
    public int AhwBna() {
        java.lang.String strFARcdN = fARcdN();
        int iHashCode = strFARcdN.hashCode();
        if (iHashCode != -1884319283) {
            if (iHashCode != -559731291) {
                if (iHashCode == 391699048) {
                    strFARcdN.equals("dip_snipping");
                }
            } else if (strFARcdN.equals("pending_matching")) {
                return C52761wXj.PendingIntent.fIwbmz;
            }
        } else if (strFARcdN.equals("stopped")) {
            return C52761wXj.PendingIntent.valueOf;
        }
        return C52761wXj.PendingIntent.uzCIH;
    }

    @Override // o.AbstractC51282vkA
    public int AYXKKw() {
        return Intrinsics.EZpvd((java.lang.Object) fARcdN(), (java.lang.Object) "pending_matching") ? -1 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    @Override // o.AbstractC51282vkA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.ArrayList<java.lang.String> copydefault() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String strFARcdN = fARcdN();
        switch (strFARcdN.hashCode()) {
            case -1884319283:
                if (strFARcdN.equals("stopped")) {
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) KWHzl())) {
                        arrayList.add("btn_detail");
                    }
                    arrayList.add("btn_more");
                }
                return arrayList;
            case -559731291:
                if (strFARcdN.equals("pending_matching")) {
                    arrayList.add("my_bots");
                }
                return arrayList;
            case 391699048:
                if (strFARcdN.equals("dip_snipping")) {
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) KWHzl())) {
                        arrayList.add("btn_detail");
                    }
                    arrayList.add("btn_more");
                }
                return arrayList;
            case 1198784719:
                if (strFARcdN.equals("profit_snipping")) {
                }
                return arrayList;
            default:
                return arrayList;
        }
    }

    @Override // o.AbstractC51282vkA
    public java.lang.String OLrzqt() {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        C55804xqp<StrategyDetailsResponse> value = this.valueOf.getValue();
        if (value == null || (strategyDetailsResponseCopydefault = value.copydefault()) == null) {
            return "";
        }
        java.lang.String currency = strategyDetailsResponseCopydefault.getCurrency();
        if (currency == null) {
            currency = "";
        }
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String curStrike = strategyDetailsResponseCopydefault.getCurStrike();
        if (curStrike == null) {
            curStrike = "";
        }
        java.lang.String botPrice$default = C56033xvF.getBotPrice$default(instType, instId, curStrike, false, false, null, null, 120, null);
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId());
        java.lang.String strFARcdN = fARcdN();
        int iHashCode = strFARcdN.hashCode();
        return iHashCode != -1884319283 ? iHashCode != -559731291 ? (iHashCode == 391699048 && strFARcdN.equals("dip_snipping")) ? C33069mpW.copydefault(C55688xof.Application.DPhTBN, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, currency), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, botPrice$default), C56390yDp.OLrzqt("unit", strAEQbTJ))) : "" : strFARcdN.equals("pending_matching") ? C33070mpX.AYXKKw(C55688xof.Application.DLGVGj) : "" : !strFARcdN.equals("stopped") ? "" : C33069mpW.copydefault(C55688xof.Application.DPHNDa, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, currency), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, botPrice$default), C56390yDp.OLrzqt("unit", strAEQbTJ), C56390yDp.OLrzqt("failReason", C56033xvF.gEmmrt(strategyDetailsResponseCopydefault.getCancelType()))));
    }

    @Override // o.AbstractC51282vkA
    public java.lang.String gEmmrt() {
        java.lang.String strFARcdN = fARcdN();
        if (Intrinsics.EZpvd((java.lang.Object) strFARcdN, (java.lang.Object) "dip_snipping")) {
            InterfaceC58217yxC interfaceC58217yxC = this.OLrzqt;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            return C33070mpX.AYXKKw(C55688xof.Application.dkJJWw);
        }
        if (Intrinsics.EZpvd((java.lang.Object) strFARcdN, (java.lang.Object) "stopped")) {
            InterfaceC58217yxC interfaceC58217yxC2 = this.OLrzqt;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
            return C33070mpX.AYXKKw(C55688xof.Application.aJZHYI);
        }
        kotlin.Pair<java.lang.String, java.lang.Boolean> value = this.gEmmrt.getValue();
        return C33129mqd.gEmmrt(value != null ? value.getFirst() : null);
    }

    @Override // o.AbstractC51282vkA
    public boolean DbNXlk() {
        boolean z = !Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) fARcdN());
        if (z) {
            this.djBIcL = fARcdN();
        }
        return z;
    }

    @Override // o.AbstractC51282vkA
    public java.util.ArrayList<xKK> djBIcL() {
        return yDY.copydefault(this.AYXKKw, this.AEQbTJ);
    }

    public final void fIwbmz() {
        C56258xzS c56258xzS = this.AEQbTJ;
        StrategyPendingListReq strategyPendingListReq = new StrategyPendingListReq();
        strategyPendingListReq.setAlgoId(KWHzl());
        strategyPendingListReq.setOrdType("dcd_bot");
        strategyPendingListReq.setSource("");
        strategyPendingListReq.setRequireProfits(false);
        c56258xzS.KWHzl(strategyPendingListReq);
        c56258xzS.OLrzqt(AEQbTJ(), new StateListAnimator());
        xKK.Activity.execute$default(c56258xzS, 0L, 1, null);
    }

    /* JADX INFO: renamed from: o.vkC$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54501xKt<java.util.List<? extends StrategyPendingListResp>, StrategyItemData> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC54501xKt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public StrategyItemData KWHzl(java.util.List<StrategyPendingListResp> list) {
            Intrinsics.checkNotNullParameter(list, "");
            StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (strategyPendingListResp == null) {
                return null;
            }
            return new StrategyItemData("dcd_bot", TacticsType.TACTICS_DCD_BOT, Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "canceled") || Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "order_failed") || Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "stopped"), C51284vkC.this.KWHzl(), strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getDcdState(), null, null, null, null, 1920, null);
        }
    }
}
