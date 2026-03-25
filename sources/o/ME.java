package o;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ME {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final MM OLrzqt;
    public final java.lang.String copydefault;
    public final Logger djBIcL;
    public final java.io.File valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ME copy$default(ME me2, java.lang.String str, java.lang.String str2, java.lang.String str3, MM mm, java.io.File file, java.lang.String str4, Logger logger, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = me2.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = me2.KWHzl;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = me2.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            mm = me2.OLrzqt;
        }
        MM mm2 = mm;
        if ((i & 16) != 0) {
            file = me2.valueOf;
        }
        java.io.File file2 = file;
        if ((i & 32) != 0) {
            str4 = me2.AEQbTJ;
        }
        java.lang.String str7 = str4;
        if ((i & 64) != 0) {
            logger = me2.djBIcL;
        }
        return me2.EZpvd(str, str5, str6, mm2, file2, str7, logger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MM AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Logger AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ME EZpvd(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull MM mm, @NotNull java.io.File file, @NotNull java.lang.String str4, Logger logger) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mm, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ME(str, str2, str3, mm, file, str4, logger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.io.File djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ME)) {
            return false;
        }
        ME me2 = (ME) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) me2.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) me2.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) me2.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, me2.OLrzqt) && Intrinsics.EZpvd(this.valueOf, me2.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) me2.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, me2.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        int iHashCode5 = this.valueOf.hashCode();
        int iHashCode6 = this.AEQbTJ.hashCode();
        Logger logger = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (logger != null ? logger.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IdentityConfiguration(instanceName=" + this.copydefault + ", apiKey=" + this.KWHzl + ", experimentApiKey=" + this.EZpvd + ", identityStorageProvider=" + this.OLrzqt + ", storageDirectory=" + this.valueOf + ", fileName=" + this.AEQbTJ + ", logger=" + this.djBIcL + ')';
    }

    public ME(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull MM mm, @NotNull java.io.File file, @NotNull java.lang.String str4, Logger logger) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mm, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.OLrzqt = mm;
        this.valueOf = file;
        this.AEQbTJ = str4;
        this.djBIcL = logger;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (r14v0 o.MM)
  (r15v0 java.io.File)
  (r16v0 java.lang.String)
  (wrap:com.amplitude.common.Logger:?: TERNARY null = ((wrap:int:0x000f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.amplitude.common.Logger) : (r17v0 com.amplitude.common.Logger))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, o.MM, java.io.File, java.lang.String, com.amplitude.common.Logger):void (m)] (LINE:9) call: o.ME.<init>(java.lang.String, java.lang.String, java.lang.String, o.MM, java.io.File, java.lang.String, com.amplitude.common.Logger):void type: THIS */
    public /* synthetic */ ME(java.lang.String str, java.lang.String str2, java.lang.String str3, MM mm, java.io.File file, java.lang.String str4, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, mm, file, str4, (i & 64) != 0 ? null : logger);
    }
}
