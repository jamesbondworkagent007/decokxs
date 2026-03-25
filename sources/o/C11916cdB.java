package o;

import com.okinc.business.defi.api.model.tx.signdata.TonContractSignData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.ton.TonMultiTransaction;
import com.okinc.wallet.core.sign.ton.TonSignedTx;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cdB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11916cdB extends AbstractC12442cmy {
    public final C11865ccD EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11916cdB(@NotNull C11865ccD c11865ccD) {
        super(c11865ccD);
        Intrinsics.checkNotNullParameter(c11865ccD, "");
        this.EZpvd = c11865ccD;
    }

    public final TonSignedTx EZpvd(@NotNull java.lang.String str, @NotNull TonContractSignData.Payload payload) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(payload, "");
        return C54901xZn.OLrzqt.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl(payload));
    }

    public final TonSignedTx OLrzqt(@NotNull TonContractSignData.Payload payload) {
        Intrinsics.checkNotNullParameter(payload, "");
        return C54901xZn.OLrzqt.EZpvd(new SignParams(this.EZpvd.dHguZz().QKVWgx(), this.EZpvd.dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, true, this.EZpvd.dUDNAs().QVAiDq(), null, 1276, null), KWHzl(payload));
    }

    public final TonMultiTransaction KWHzl(TonContractSignData.Payload payload) {
        java.util.List<TonContractSignData.Message> messages = payload.getMessages();
        if (messages == null) {
            messages = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(messages, 10));
        java.util.Iterator<T> it = messages.iterator();
        while (true) {
            java.lang.String str = "";
            if (!it.hasNext()) {
                break;
            }
            TonContractSignData.Message message = (TonContractSignData.Message) it.next();
            java.lang.String address = message.getAddress();
            if (address == null) {
                address = "";
            }
            java.lang.String amount = message.getAmount();
            if (amount == null) {
                amount = "";
            }
            java.lang.String payload2 = message.getPayload();
            if (payload2 == null) {
                payload2 = "";
            }
            java.lang.String stateInit = message.getStateInit();
            if (stateInit != null) {
                str = stateInit;
            }
            arrayList.add(new TonMultiTransaction.Message(address, amount, payload2, str));
        }
        long jOLrzqt = OLrzqt(C33129mqd.valueOf(payload.getValid_until()));
        java.lang.String from = payload.getFrom();
        if (from == null) {
            from = "";
        }
        java.lang.String network = payload.getNetwork();
        return new TonMultiTransaction(arrayList, jOLrzqt, from, network == null ? "" : network, this.EZpvd.igXuih(), C54862xYb.convertToBigIntegerString$default(this.EZpvd.AEQbTJ().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }

    public final long OLrzqt(long j) {
        if (C33129mqd.valueOf(java.lang.Long.valueOf(j)) > RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            j /= (long) 1000;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / ((long) 1000);
        if (C33129mqd.copydefault(C54862xYb.AEQbTJ(java.lang.Long.valueOf(j), java.lang.Long.valueOf(jCurrentTimeMillis)), this.EZpvd.AEQbTJ().getTtl())) {
            return C33129mqd.valueOf(java.lang.Long.valueOf(j));
        }
        return C33129mqd.valueOf(C54862xYb.KWHzl(java.lang.Long.valueOf(jCurrentTimeMillis), this.EZpvd.AEQbTJ().getTtl()));
    }
}
