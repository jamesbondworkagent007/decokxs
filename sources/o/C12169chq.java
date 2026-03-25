package o;

import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: o.chq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12169chq extends C12167cho {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C12167cho
    public java.lang.String QIZEnU() {
        return ExtJson.BRC20TYPE_TRANSFER;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C12167cho, o.AbstractC12102cgc
    public java.lang.String DNMMPQ() {
        java.lang.String coinAmount;
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean());
        return C54862xYb.convertToBigIntegerString$default((fixedUTXOInfo == null || (coinAmount = fixedUTXOInfo.getCoinAmount()) == null) ? null : C54870xYj.KWHzl(coinAmount, fHqPtx().valueOf()), true, (RoundingMode) null, 2, (java.lang.Object) null);
    }
}
