package o;

import com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.zksync.ZKSyncChangePubKeyTransaction;
import com.okinc.wallet.core.sign.zksync.ZKSyncToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12439cmv extends AbstractC12442cmy {
    public final C12355clQ OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12439cmv(@NotNull C12355clQ c12355clQ) {
        super(c12355clQ);
        Intrinsics.checkNotNullParameter(c12355clQ, "");
        this.OLrzqt = c12355clQ;
    }

    public static /* synthetic */ SignedTx signChangePubKey$default(C12439cmv c12439cmv, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c12439cmv.KWHzl(str, str2);
    }

    public final SignedTx KWHzl(java.lang.String str, java.lang.String str2) {
        return C54903xZp.OLrzqt.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), KWHzl());
    }

    public final ZKSyncChangePubKeyTransaction KWHzl() {
        C10854bwM c10854bwMKWHzl;
        java.lang.String strAKErDB = this.OLrzqt.aKErDB();
        ZKSyncSignInfo zKSyncSignInfoFARcdN = this.OLrzqt.fARcdN();
        java.lang.String strEZpvd = zKSyncSignInfoFARcdN != null ? zKSyncSignInfoFARcdN.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        java.lang.String strHtlTjW = this.OLrzqt.htlTjW();
        C12441cmx c12441cmxAEQbTJ = this.OLrzqt.AEQbTJ();
        java.lang.String strEZpvd2 = c12441cmxAEQbTJ != null ? c12441cmxAEQbTJ.EZpvd() : null;
        if (strEZpvd2 == null) {
            strEZpvd2 = "";
        }
        C12441cmx c12441cmxAEQbTJ2 = this.OLrzqt.AEQbTJ();
        java.lang.String strCopydefault = c12441cmxAEQbTJ2 != null ? c12441cmxAEQbTJ2.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        C12441cmx c12441cmxAEQbTJ3 = this.OLrzqt.AEQbTJ();
        java.lang.String strOLrzqt = c12441cmxAEQbTJ3 != null ? c12441cmxAEQbTJ3.OLrzqt() : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C12441cmx c12441cmxAEQbTJ4 = this.OLrzqt.AEQbTJ();
        ZKSyncToken zKSyncToken = new ZKSyncToken(strCopydefault, strOLrzqt, C33129mqd.AYXKKw((c12441cmxAEQbTJ4 == null || (c10854bwMKWHzl = c12441cmxAEQbTJ4.KWHzl()) == null) ? null : java.lang.Integer.valueOf(c10854bwMKWHzl.valueOf())));
        ZKSyncSignInfo zKSyncSignInfoFARcdN2 = this.OLrzqt.fARcdN();
        java.lang.String strCopydefault2 = zKSyncSignInfoFARcdN2 != null ? zKSyncSignInfoFARcdN2.copydefault() : null;
        java.lang.String str = strCopydefault2 == null ? "" : strCopydefault2;
        ZKSyncSignInfo zKSyncSignInfoFARcdN3 = this.OLrzqt.fARcdN();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(zKSyncSignInfoFARcdN3 != null ? zKSyncSignInfoFARcdN3.gEmmrt() : null);
        ZKSyncSignInfo zKSyncSignInfoFARcdN4 = this.OLrzqt.fARcdN();
        return new ZKSyncChangePubKeyTransaction(strAKErDB, strEZpvd, strHtlTjW, strEZpvd2, zKSyncToken, str, strGEmmrt, C33129mqd.gEmmrt(zKSyncSignInfoFARcdN4 != null ? zKSyncSignInfoFARcdN4.valueOf() : null));
    }
}
