package o;

import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: o.chS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12145chS extends AbstractC12102cgc {
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(((FixedUTXOSignData) QVsKAR()).getBatchBean());
        java.lang.String from = fixedUTXOInfo != null ? fixedUTXOInfo.getFrom() : null;
        return from == null ? "" : from;
    }
}
