package o;

import com.okinc.unify_trade.biz.subscribe.WsResultInfo;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C54407xHg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xGU extends xGQ<java.lang.Object> {
    public final AbstractC55674xoR AEQbTJ;
    public WsResultInfo EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final java.lang.String OLrzqt;
    public WsArgV5 copydefault;
    public AbstractC57556yke djBIcL;

    public xGU(@NotNull java.lang.String str, @NotNull AbstractC55674xoR abstractC55674xoR) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC55674xoR, "");
        this.OLrzqt = str;
        this.AEQbTJ = abstractC55674xoR;
        WsResultInfo wsResultInfo = new WsResultInfo();
        this.EZpvd = wsResultInfo;
        wsResultInfo.getCallbacks().add(abstractC55674xoR);
        this.EZpvd.setOriginName(abstractC55674xoR.EZpvd());
    }

    public final void AEQbTJ(@NotNull AbstractC55755xpt<?> abstractC55755xpt) {
        Intrinsics.checkNotNullParameter(abstractC55755xpt, "");
        this.EZpvd.getCallbacks().add(abstractC55755xpt);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.getMessage())) {
            WsResultInfo.sendMessage$default(this.EZpvd, null, 1, null);
        }
    }

    public AbstractC57556yke KWHzl() {
        AbstractC55674xoR abstractC55674xoR = this.AEQbTJ;
        Intrinsics.copydefault(abstractC55674xoR, "");
        this.djBIcL = OLrzqt(abstractC55674xoR.EZpvd());
        copydefault();
        return this.djBIcL;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setMessage(str);
        this.EZpvd.setUpdate(true);
    }

    private final AbstractC57556yke OLrzqt(java.lang.String str) {
        C56121xwo c56121xwo = C56121xwo.copydefault;
        this.copydefault = new WsArgV5(c56121xwo.EZpvd(str), this.AEQbTJ.fetchVPNInfo(), null, null, null, null, null, null, 252, null);
        java.lang.String strEZpvd = c56121xwo.EZpvd(str);
        WsArgV5 wsArgV5 = this.copydefault;
        Intrinsics.copydefault(wsArgV5);
        return xGQ.getWsListener$default(this, strEZpvd, wsArgV5, (Function1) null, 4, (java.lang.Object) null);
    }

    private final void copydefault() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(0L, 700L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xGU.OLrzqt(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.KWHzl = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xGU.copydefault(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xGU xgu, java.lang.Long l) {
        if (xgu.EZpvd.isUpdate()) {
            WsResultInfo.sendMessage$default(xgu.EZpvd, null, 1, null);
            xgu.EZpvd.setUpdate(false);
        }
        return Unit.INSTANCE;
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        WsResultInfo wsResultInfo = this.EZpvd;
        Intrinsics.copydefault(obj);
        boolean zRemoveDataCallback = wsResultInfo.removeDataCallback(obj);
        if (zRemoveDataCallback) {
            EZpvd();
        }
        return zRemoveDataCallback;
    }

    private final void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.djBIcL;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC57556yke abstractC57556yke2 = this.djBIcL;
        if (abstractC57556yke2 != null) {
            C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
            WsArgV5 wsArgV5 = this.copydefault;
            stateListAnimator.EZpvd(wsArgV5 != null ? wsArgV5.getChannel() : null, abstractC57556yke2);
        }
    }
}
