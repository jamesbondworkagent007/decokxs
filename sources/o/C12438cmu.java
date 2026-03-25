package o;

import com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.zksync.ZKSyncToken;
import com.okinc.wallet.core.sign.zksync.ZKSyncTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cmu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12438cmu extends AbstractC12442cmy {
    public final C12426cmi EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12438cmu(@NotNull C12426cmi c12426cmi) {
        super(c12426cmi);
        Intrinsics.checkNotNullParameter(c12426cmi, "");
        this.EZpvd = c12426cmi;
    }

    public static /* synthetic */ SignedTx signTransfer$default(C12438cmu c12438cmu, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c12438cmu.copydefault(str, str2);
    }

    public final SignedTx copydefault(java.lang.String str, java.lang.String str2) {
        return C54903xZp.OLrzqt.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), KWHzl());
    }

    public final ZKSyncTransaction KWHzl() {
        java.lang.String strQKVWgx = this.EZpvd.QKVWgx();
        ZKSyncSignInfo zKSyncSignInfoOcIXYQ = this.EZpvd.OcIXYQ();
        java.lang.String strEZpvd = zKSyncSignInfoOcIXYQ != null ? zKSyncSignInfoOcIXYQ.EZpvd() : null;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        java.lang.String strHtlTjW = this.EZpvd.htlTjW();
        java.lang.String strZLjUOn = this.EZpvd.zLjUOn();
        java.lang.String strFARcdN = xYW.AEQbTJ.fARcdN(C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.EZpvd, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        ZKSyncSignInfo zKSyncSignInfoOcIXYQ2 = this.EZpvd.OcIXYQ();
        java.lang.String strAhwBna = zKSyncSignInfoOcIXYQ2 != null ? zKSyncSignInfoOcIXYQ2.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        ZKSyncSignInfo zKSyncSignInfoOcIXYQ3 = this.EZpvd.OcIXYQ();
        java.lang.String strOLrzqt = zKSyncSignInfoOcIXYQ3 != null ? zKSyncSignInfoOcIXYQ3.OLrzqt() : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        ZKSyncToken zKSyncToken = new ZKSyncToken(strAhwBna, strOLrzqt, C33129mqd.AYXKKw(java.lang.Integer.valueOf(this.EZpvd.fHqPtx().valueOf())));
        C12441cmx c12441cmxKWHzl = this.EZpvd.KWHzl();
        java.lang.String strEZpvd2 = c12441cmxKWHzl != null ? c12441cmxKWHzl.EZpvd() : null;
        java.lang.String str = strEZpvd2 == null ? "" : strEZpvd2;
        ZKSyncSignInfo zKSyncSignInfoOcIXYQ4 = this.EZpvd.OcIXYQ();
        java.lang.String strCopydefault = zKSyncSignInfoOcIXYQ4 != null ? zKSyncSignInfoOcIXYQ4.copydefault() : null;
        java.lang.String str2 = strCopydefault == null ? "" : strCopydefault;
        ZKSyncSignInfo zKSyncSignInfoOcIXYQ5 = this.EZpvd.OcIXYQ();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(zKSyncSignInfoOcIXYQ5 != null ? zKSyncSignInfoOcIXYQ5.gEmmrt() : null);
        ZKSyncSignInfo zKSyncSignInfoOcIXYQ6 = this.EZpvd.OcIXYQ();
        return new ZKSyncTransaction(strQKVWgx, strEZpvd, strHtlTjW, strZLjUOn, strFARcdN, zKSyncToken, str, str2, strGEmmrt, C33129mqd.gEmmrt(zKSyncSignInfoOcIXYQ6 != null ? zKSyncSignInfoOcIXYQ6.valueOf() : null));
    }
}
