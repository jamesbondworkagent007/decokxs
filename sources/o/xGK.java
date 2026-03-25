package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.unify_trade.biz.subscribe.WsResultInfo;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGK extends xGQ<java.lang.Object> {
    public InterfaceC58217yxC AEQbTJ;
    public final java.lang.String AYXKKw;
    public AbstractC57556yke AhwBna;
    public AbstractC55755xpt<?> EZpvd;
    public java.util.ArrayList<WsArgV5> KWHzl;
    public final java.lang.String OLrzqt;
    public final AbstractC55755xpt<?> copydefault;
    public WsResultInfo valueOf;

    public xGK(@NotNull java.lang.String str, @NotNull AbstractC55755xpt<?> abstractC55755xpt) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55755xpt, "");
        this.AYXKKw = str;
        this.copydefault = abstractC55755xpt;
        this.OLrzqt = "WsCommonTask";
        this.valueOf = new WsResultInfo();
        this.KWHzl = new java.util.ArrayList<>();
        this.valueOf.getCallbacks().add(abstractC55755xpt);
        this.valueOf.setOriginName(abstractC55755xpt.EZpvd());
    }

    public final void KWHzl(@NotNull AbstractC55755xpt<?> abstractC55755xpt) {
        Intrinsics.checkNotNullParameter(abstractC55755xpt, "");
        this.valueOf.getCallbacks().add(abstractC55755xpt);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.valueOf.getMessage())) {
            WsResultInfo.sendMessage$default(this.valueOf, null, 1, null);
        }
    }

    public AbstractC57556yke EZpvd() {
        AbstractC55755xpt<?> abstractC55755xpt = this.copydefault;
        Intrinsics.copydefault(abstractC55755xpt, "");
        this.AhwBna = copydefault(abstractC55755xpt.EZpvd());
        copydefault();
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [56=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC57556yke copydefault(java.lang.String str) {
        java.lang.String strEZpvd;
        AbstractC55755xpt<?> abstractC55755xpt = this.copydefault;
        Intrinsics.copydefault(abstractC55755xpt, "");
        if (str != null) {
            int i = 0;
            switch (str.hashCode()) {
                case -2034176189:
                    if (str.equals("multi_ticker_listener")) {
                        java.util.ArrayList<java.lang.String> arrayListAYXKKw = this.copydefault.AYXKKw();
                        if (arrayListAYXKKw != null) {
                            for (java.lang.Object obj : arrayListAYXKKw) {
                                if (i < 0) {
                                    yDY.AYXKKw();
                                }
                                this.KWHzl.add(new WsArgV5(C56121xwo.copydefault.EZpvd(str), (java.lang.String) obj, null, this.copydefault.values(), null, null, null, null, 244, null));
                                i++;
                            }
                        }
                    } else {
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault.gEmmrt())) {
                            strEZpvd = this.copydefault.gEmmrt();
                            Intrinsics.copydefault((java.lang.Object) strEZpvd);
                        } else {
                            strEZpvd = C56121xwo.copydefault.EZpvd(str);
                        }
                        this.KWHzl.add(new WsArgV5(strEZpvd, abstractC55755xpt.fetchVPNInfo(), null, null, null, null, null, null, 252, null));
                    }
                    break;
                case -1808939205:
                    if (str.equals("OptionMarkPriceListener")) {
                        this.KWHzl.add(new WsArgV5(C56121xwo.copydefault.EZpvd(str), null, abstractC55755xpt.DbNXlk(), Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OptionTickersListener") ? "OPTION" : null, null, null, null, null, 242, null));
                        break;
                    }
                    break;
                case -1256710559:
                    if (str.equals("EstimatedPriceListener")) {
                        this.KWHzl.add(new WsArgV5(C56121xwo.copydefault.EZpvd(str), abstractC55755xpt.fetchVPNInfo(), abstractC55755xpt.DbNXlk(), abstractC55755xpt.values(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                        break;
                    }
                    break;
                case -659197477:
                    if (str.equals("InstrumentListener")) {
                        this.KWHzl.add(new WsArgV5(C56121xwo.copydefault.EZpvd(str), null, null, abstractC55755xpt.values(), null, null, null, null, 246, null));
                        break;
                    }
                    break;
                case -416543837:
                    if (!str.equals("OptionTradeListener")) {
                    }
                    break;
                case -165153945:
                    if (str.equals("OptSummaryListener")) {
                        java.lang.String strDbNXlk = abstractC55755xpt.DbNXlk();
                        this.KWHzl.add(new WsArgV5((strDbNXlk == null || strDbNXlk.length() == 0) ? "opt-summary-instId" : "opt-summary", abstractC55755xpt.fetchVPNInfo(), abstractC55755xpt.DbNXlk(), Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OptionTickersListener") ? "OPTION" : null, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                        break;
                    }
                    break;
                case -83473112:
                    if (!str.equals("OptionTickersListener")) {
                    }
                    break;
                case 182645320:
                    if (str.equals("cup_ticker_listener")) {
                        if (this.copydefault.AYXKKw() == null || !(!r2.isEmpty())) {
                            this.KWHzl.add(new WsArgV5(C56121xwo.copydefault.EZpvd(str), null, null, null, this.copydefault.fetchVPNInfo(), null, null, null, 238, null));
                        } else {
                            java.util.ArrayList<java.lang.String> arrayListAYXKKw2 = this.copydefault.AYXKKw();
                            if (arrayListAYXKKw2 != null) {
                                for (java.lang.Object obj2 : arrayListAYXKKw2) {
                                    if (i < 0) {
                                        yDY.AYXKKw();
                                    }
                                    this.KWHzl.add(new WsArgV5(C56121xwo.copydefault.EZpvd(str), null, null, null, (java.lang.String) obj2, null, null, null, 238, null));
                                    i++;
                                }
                            }
                        }
                        break;
                    }
                    break;
            }
        }
        this.EZpvd = abstractC55755xpt;
        xVP xvp = xVP.OLrzqt;
        java.lang.String str2 = this.OLrzqt;
        C56121xwo c56121xwo = C56121xwo.copydefault;
        xvp.OLrzqt(str2, "ws sub " + c56121xwo.EZpvd(this.copydefault.EZpvd()));
        return xGQ.getWsListener$default(this, c56121xwo.EZpvd(this.copydefault.EZpvd()), this.KWHzl, (Function1) null, 4, (java.lang.Object) null);
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C56121xwo c56121xwo = C56121xwo.copydefault;
        if (Intrinsics.EZpvd((java.lang.Object) c56121xwo.EZpvd(this.copydefault.EZpvd()), (java.lang.Object) "bt-tickers")) {
            xVP.OLrzqt.OLrzqt(this.OLrzqt, "ws result " + str);
            this.valueOf.parseOptionTicker(str);
        } else {
            this.valueOf.setMessage(str);
        }
        xVP.OLrzqt.OLrzqt(this.OLrzqt, "ws result " + c56121xwo.EZpvd(this.copydefault.EZpvd()));
        this.valueOf.setUpdate(true);
    }

    @Override // o.xGQ
    public boolean bC_() {
        boolean zOLrzqt;
        AbstractC55755xpt<?> abstractC55755xpt = this.EZpvd;
        if (abstractC55755xpt instanceof AbstractC55737xpb) {
            Intrinsics.copydefault(abstractC55755xpt, "");
            zOLrzqt = ((AbstractC55737xpb) abstractC55755xpt).OLrzqt();
        } else {
            zOLrzqt = false;
        }
        return !zOLrzqt;
    }

    private final void copydefault() {
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 700L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xGG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGK.copydefault(this.KWHzl, (java.lang.Long) obj);
            }
        };
        this.AEQbTJ = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xGK.copydefault(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(xGK xgk, java.lang.Long l) {
        if (xgk.valueOf.isUpdate()) {
            WsResultInfo.sendMessage$default(xgk.valueOf, null, 1, null);
            xgk.valueOf.setUpdate(false);
        }
        return Unit.INSTANCE;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        WsResultInfo wsResultInfo = this.valueOf;
        Intrinsics.copydefault(obj);
        boolean zRemoveDataCallback = wsResultInfo.removeDataCallback(obj);
        if (zRemoveDataCallback) {
            KWHzl();
        }
        return zRemoveDataCallback;
    }

    private final void KWHzl() {
        AbstractC57556yke abstractC57556yke = this.AhwBna;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC57556yke abstractC57556yke2 = this.AhwBna;
        if (abstractC57556yke2 != null) {
            C54407xHg.Companion.EZpvd(C56121xwo.copydefault.EZpvd(this.copydefault.EZpvd()), abstractC57556yke2);
        }
    }
}
