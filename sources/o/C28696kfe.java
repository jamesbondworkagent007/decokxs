package o;

import com.okinc.business.market.features.meme.domain.model.MemeTabType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kfe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28696kfe {
    public final int AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final MemeTabType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28696kfe() {
        this(false, false, 0, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28696kfe copy$default(C28696kfe c28696kfe, boolean z, boolean z2, int i, java.lang.String str, MemeTabType memeTabType, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c28696kfe.EZpvd;
        }
        if ((i2 & 2) != 0) {
            z2 = c28696kfe.OLrzqt;
        }
        boolean z3 = z2;
        if ((i2 & 4) != 0) {
            i = c28696kfe.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str = c28696kfe.KWHzl;
        }
        java.lang.String str2 = str;
        if ((i2 & 16) != 0) {
            memeTabType = c28696kfe.copydefault;
        }
        return c28696kfe.KWHzl(z, z3, i3, str2, memeTabType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTabType EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28696kfe KWHzl(boolean z, boolean z2, int i, @NotNull java.lang.String str, @NotNull MemeTabType memeTabType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeTabType, "");
        return new C28696kfe(z, z2, i, str, memeTabType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28696kfe)) {
            return false;
        }
        C28696kfe c28696kfe = (C28696kfe) obj;
        return this.EZpvd == c28696kfe.EZpvd && this.OLrzqt == c28696kfe.OLrzqt && this.AEQbTJ == c28696kfe.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c28696kfe.KWHzl) && this.copydefault == c28696kfe.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MemeTabUiModel(isActive=" + this.EZpvd + ", hasNew=" + this.OLrzqt + ", tabIndex=" + this.AEQbTJ + ", tabName=" + this.KWHzl + ", rankType=" + this.copydefault + ")";
    }

    public C28696kfe(boolean z, boolean z2, int i, @NotNull java.lang.String str, @NotNull MemeTabType memeTabType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeTabType, "");
        this.EZpvd = z;
        this.OLrzqt = z2;
        this.AEQbTJ = i;
        this.KWHzl = str;
        this.copydefault = memeTabType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 int) : (0 int))
  (wrap:java.lang.String:0x001b: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.domain.model.MemeTabType:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.meme.domain.model.MemeTabType:0x0020: SGET  A[WRAPPED] (LINE:162) com.okinc.business.market.features.meme.domain.model.MemeTabType.NEW_PAIR com.okinc.business.market.features.meme.domain.model.MemeTabType) : (r8v0 com.okinc.business.market.features.meme.domain.model.MemeTabType))
 A[MD:(boolean, boolean, int, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeTabType):void (m)] (LINE:157) call: o.kfe.<init>(boolean, boolean, int, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeTabType):void type: THIS */
    public /* synthetic */ C28696kfe(boolean z, boolean z2, int i, java.lang.String str, MemeTabType memeTabType, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) == 0 ? i : 0, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? MemeTabType.NEW_PAIR : memeTabType);
    }
}
