package o;

import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25147irI {
    public boolean KWHzl;
    public TransactionNetworkFeeBean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25147irI() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25147irI copy$default(C25147irI c25147irI, boolean z, TransactionNetworkFeeBean transactionNetworkFeeBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25147irI.KWHzl;
        }
        if ((i & 2) != 0) {
            transactionNetworkFeeBean = c25147irI.copydefault;
        }
        return c25147irI.EZpvd(z, transactionNetworkFeeBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25147irI EZpvd(boolean z, @NotNull TransactionNetworkFeeBean transactionNetworkFeeBean) {
        Intrinsics.checkNotNullParameter(transactionNetworkFeeBean, "");
        return new C25147irI(z, transactionNetworkFeeBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionNetworkFeeBean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25147irI)) {
            return false;
        }
        C25147irI c25147irI = (C25147irI) obj;
        return this.KWHzl == c25147irI.KWHzl && Intrinsics.EZpvd(this.copydefault, c25147irI.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionLoopRefreshNetworkFeeBean(isLoopRefresh=" + this.KWHzl + ", networkFeeBean=" + this.copydefault + ")";
    }

    public C25147irI(boolean z, @NotNull TransactionNetworkFeeBean transactionNetworkFeeBean) {
        Intrinsics.checkNotNullParameter(transactionNetworkFeeBean, "");
        this.KWHzl = z;
        this.copydefault = transactionNetworkFeeBean;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C25147irI(boolean r19, com.okinc.web3Uilib.bean.TransactionNetworkFeeBean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r18 = this;
            r0 = r21 & 1
            if (r0 == 0) goto L6
            r0 = 0
            goto L8
        L6:
            r0 = r19
        L8:
            r1 = r21 & 2
            if (r1 == 0) goto L26
            com.okinc.web3Uilib.bean.TransactionNetworkFeeBean r1 = new com.okinc.web3Uilib.bean.TransactionNetworkFeeBean
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
            r16 = 8191(0x1fff, float:1.1478E-41)
            r17 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2 = r18
            goto L2a
        L26:
            r2 = r18
            r1 = r20
        L2a:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C25147irI.<init>(boolean, com.okinc.web3Uilib.bean.TransactionNetworkFeeBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
