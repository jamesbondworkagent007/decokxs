package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9347bTq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bTh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9338bTh extends C9339bTi implements InterfaceC9347bTq {
    public java.lang.String AYXKKw;
    public java.lang.Integer djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.Integer num) {
        this.djBIcL = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AuCTel() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.bTi.fJNWhG()Ljava/lang/String; */
    @Override // o.InterfaceC9347bTq
    public java.lang.Integer fJNWhG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Possible override for method o.bTi.fIwbmz()Ljava/lang/String; */
    @Override // o.InterfaceC9347bTq
    public int fIwbmz() {
        return InterfaceC9347bTq.Application.copydefault(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9338bTh(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull InterfaceC9218bRT interfaceC9218bRT) {
        super(abstractC8564bFB, interfaceC9218bRT);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(interfaceC9218bRT, "");
    }

    @Override // o.C9339bTi, o.AbstractC8485bDc
    public void AEQbTJ(int i) {
        AEQbTJ((java.lang.Integer) 3);
        super.AEQbTJ(i);
    }

    @Override // o.C9339bTi, o.AbstractC9346bTp
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AEQbTJ((java.lang.Integer) 3);
        super.AEQbTJ(str, str2, z, z2);
    }

    public final void EZpvd(java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
        java.lang.Integer numFJNWhG = fJNWhG();
        if (numFJNWhG != null && numFJNWhG.intValue() == 3) {
            return;
        }
        AEQbTJ(num);
        AEQbTJ(str);
        if (num != null && num.intValue() == 0) {
            return;
        }
        if ((num != null && num.intValue() == 1) || num2 == null) {
            return;
        }
        if (num2.intValue() == 31) {
            copydefault(31);
        } else if (num2.intValue() == 32) {
            copydefault(32);
        } else if (num2.intValue() == 33) {
            copydefault(33);
        }
    }

    @Override // o.C9339bTi
    public java.lang.String AYXKKw(int i) {
        java.lang.Integer numFJNWhG;
        java.lang.Integer numFJNWhG2;
        if ((i == 4 || i == 32) && ((((numFJNWhG = fJNWhG()) != null && numFJNWhG.intValue() == 0) || ((numFJNWhG2 = fJNWhG()) != null && numFJNWhG2.intValue() == 1)) && C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel()))) {
            java.lang.String strAuCTel = AuCTel();
            Intrinsics.copydefault((java.lang.Object) strAuCTel);
            return strAuCTel;
        }
        return super.AYXKKw(i);
    }

    @Override // o.AbstractC8485bDc
    public int fetchVPNInfo() {
        java.lang.Integer numFJNWhG = fJNWhG();
        if (numFJNWhG != null && numFJNWhG.intValue() == 0) {
            return 0;
        }
        if (numFJNWhG != null && numFJNWhG.intValue() == 1) {
            return 1;
        }
        if (numFJNWhG != null && numFJNWhG.intValue() == 2) {
            return 2;
        }
        return super.fetchVPNInfo();
    }
}
