package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.unify_trade.api.subscribe.TradeNotifyMessage;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xFV extends xGQ<java.lang.Object> {
    public final AbstractC55736xpa AEQbTJ;
    public final CopyOnWriteArrayList<AbstractC55736xpa> EZpvd;
    public final java.lang.String KWHzl;
    public AbstractC57556yke copydefault;

    public static final class TaskDescription extends TypeToken<TradeNotifyMessage> {
    }

    @Override // o.xGQ
    public boolean AhwBna() {
        return true;
    }

    public xFV(@NotNull AbstractC55736xpa abstractC55736xpa) {
        Intrinsics.checkNotNullParameter(abstractC55736xpa, "");
        this.AEQbTJ = abstractC55736xpa;
        CopyOnWriteArrayList<AbstractC55736xpa> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.EZpvd = copyOnWriteArrayList;
        this.KWHzl = "TradeMessageNotifyTask";
        copyOnWriteArrayList.add(abstractC55736xpa);
        copydefault();
    }

    private final void copydefault() {
        valueOf();
    }

    private final void valueOf() {
        KWHzl();
        AbstractC57556yke abstractC57556yke = this.copydefault;
        if (abstractC57556yke != null) {
            abstractC57556yke.AhwBna();
        }
    }

    @Override // o.xGQ
    public boolean OLrzqt(java.lang.Object obj) {
        if (obj instanceof AbstractC55736xpa) {
            java.util.Iterator<AbstractC55736xpa> it = this.EZpvd.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((java.lang.Object) it.next().copydefault(), (java.lang.Object) ((AbstractC55736xpa) obj).copydefault())) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return false;
            }
            this.EZpvd.remove(i);
            if (this.EZpvd.size() == 0) {
                EZpvd();
                return true;
            }
        }
        return false;
    }

    public final void EZpvd() {
        AbstractC57556yke abstractC57556yke = this.copydefault;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        C54407xHg.Companion.EZpvd("trade-message-notify", this.copydefault);
        this.copydefault = null;
        java.util.Iterator<T> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            OLrzqt((AbstractC55736xpa) it.next());
        }
    }

    public AbstractC57556yke KWHzl() {
        AbstractC57556yke wsListener$default = xGQ.getWsListener$default(this, "trade-message-notify", new WsArgV5("trade-message-notify", null, null, null, null, null, null, null, 254, null), (Function1) null, 4, (java.lang.Object) null);
        this.copydefault = wsListener$default;
        return wsListener$default;
    }

    @Override // o.xGQ
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl(this.KWHzl, "onMessage data: " + str);
        if (str.length() == 0) {
            return;
        }
        try {
            TradeNotifyMessage tradeNotifyMessage = (TradeNotifyMessage) new Gson().fromJson(str, new TaskDescription().getType());
            for (AbstractC55736xpa abstractC55736xpa : this.EZpvd) {
                Intrinsics.copydefault(tradeNotifyMessage);
                abstractC55736xpa.EZpvd(tradeNotifyMessage);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(this.KWHzl, "error: " + C56379yDe.AEQbTJ(e));
        }
    }

    public final void AEQbTJ(@NotNull AbstractC55736xpa abstractC55736xpa) {
        Intrinsics.checkNotNullParameter(abstractC55736xpa, "");
        this.EZpvd.add(abstractC55736xpa);
    }
}
