package o;

import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25146irH {
    public TransactionGeneralInfoBean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25146irH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25146irH copy$default(C25146irH c25146irH, TransactionGeneralInfoBean transactionGeneralInfoBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionGeneralInfoBean = c25146irH.KWHzl;
        }
        return c25146irH.AEQbTJ(transactionGeneralInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25146irH AEQbTJ(@NotNull TransactionGeneralInfoBean transactionGeneralInfoBean) {
        Intrinsics.checkNotNullParameter(transactionGeneralInfoBean, "");
        return new C25146irH(transactionGeneralInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionGeneralInfoBean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25146irH) && Intrinsics.EZpvd(this.KWHzl, ((C25146irH) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApproveTransactionGeneralInfoBean(foldInfo=" + this.KWHzl + ")";
    }

    public C25146irH(@NotNull TransactionGeneralInfoBean transactionGeneralInfoBean) {
        Intrinsics.checkNotNullParameter(transactionGeneralInfoBean, "");
        this.KWHzl = transactionGeneralInfoBean;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ C25146irH(com.okinc.web3Uilib.bean.TransactionGeneralInfoBean r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r23 = this;
            r0 = r25 & 1
            if (r0 == 0) goto L2a
            com.okinc.web3Uilib.bean.TransactionGeneralInfoBean r0 = new com.okinc.web3Uilib.bean.TransactionGeneralInfoBean
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 524287(0x7ffff, float:7.34683E-40)
            r22 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r23
            goto L2e
        L2a:
            r1 = r23
            r0 = r24
        L2e:
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C25146irH.<init>(com.okinc.web3Uilib.bean.TransactionGeneralInfoBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
