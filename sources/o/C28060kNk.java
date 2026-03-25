package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28060kNk implements kMU {
    public final android.text.SpannedString AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28060kNk copy$default(C28060kNk c28060kNk, java.lang.String str, java.lang.String str2, android.text.SpannedString spannedString, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c28060kNk.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c28060kNk.copydefault;
        }
        if ((i & 4) != 0) {
            spannedString = c28060kNk.AEQbTJ;
        }
        if ((i & 8) != 0) {
            z = c28060kNk.OLrzqt;
        }
        return c28060kNk.KWHzl(str, str2, spannedString, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannedString AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28060kNk KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.text.SpannedString spannedString, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C28060kNk(str, str2, spannedString, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28060kNk)) {
            return false;
        }
        C28060kNk c28060kNk = (C28060kNk) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28060kNk.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c28060kNk.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c28060kNk.AEQbTJ) && this.OLrzqt == c28060kNk.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        android.text.SpannedString spannedString = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (spannedString == null ? 0 : spannedString.hashCode())) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        java.lang.String str = this.EZpvd;
        java.lang.String str2 = this.copydefault;
        android.text.SpannedString spannedString = this.AEQbTJ;
        return "UiGridSelectionItem(key=" + str + ", displayText=" + str2 + ", displaySpan=" + ((java.lang.Object) spannedString) + ", isSelected=" + this.OLrzqt + ")";
    }

    public C28060kNk(@NotNull java.lang.String str, @NotNull java.lang.String str2, android.text.SpannedString spannedString, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.copydefault = str2;
        this.AEQbTJ = spannedString;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:android.text.SpannedString:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.text.SpannedString) : (r3v0 android.text.SpannedString))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, android.text.SpannedString, boolean):void (m)] (LINE:13) call: o.kNk.<init>(java.lang.String, java.lang.String, android.text.SpannedString, boolean):void type: THIS */
    public /* synthetic */ C28060kNk(java.lang.String str, java.lang.String str2, android.text.SpannedString spannedString, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : spannedString, (i & 8) != 0 ? false : z);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        Intrinsics.checkNotNullParameter(kmu, "");
        C28060kNk c28060kNk = kmu instanceof C28060kNk ? (C28060kNk) kmu : null;
        if (c28060kNk == null) {
            return false;
        }
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c28060kNk.EZpvd);
    }
}
