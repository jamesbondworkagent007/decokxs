package o;

import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.ValidationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tse, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47572tse {
    public final java.lang.Object AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final long OLrzqt;
    public final ValidationStatus copydefault;
    public final ContentValidationType gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47572tse copy$default(C47572tse c47572tse, ContentValidationType contentValidationType, ValidationStatus validationStatus, java.lang.String str, java.lang.String str2, java.lang.Object obj, long j, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            contentValidationType = c47572tse.gEmmrt;
        }
        if ((i & 2) != 0) {
            validationStatus = c47572tse.copydefault;
        }
        ValidationStatus validationStatus2 = validationStatus;
        if ((i & 4) != 0) {
            str = c47572tse.EZpvd;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = c47572tse.KWHzl;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            obj = c47572tse.AEQbTJ;
        }
        java.lang.Object obj3 = obj;
        if ((i & 32) != 0) {
            j = c47572tse.OLrzqt;
        }
        return c47572tse.EZpvd(contentValidationType, validationStatus2, str3, str4, obj3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationStatus EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47572tse EZpvd(@NotNull ContentValidationType contentValidationType, @NotNull ValidationStatus validationStatus, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj, long j) {
        Intrinsics.checkNotNullParameter(contentValidationType, "");
        Intrinsics.checkNotNullParameter(validationStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C47572tse(contentValidationType, validationStatus, str, str2, obj, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentValidationType KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47572tse)) {
            return false;
        }
        C47572tse c47572tse = (C47572tse) obj;
        return this.gEmmrt == c47572tse.gEmmrt && this.copydefault == c47572tse.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47572tse.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c47572tse.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c47572tse.AEQbTJ) && this.OLrzqt == c47572tse.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        java.lang.Object obj = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (obj == null ? 0 : obj.hashCode())) * 31) + java.lang.Long.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ContentValidationResult(type=" + this.gEmmrt + ", status=" + this.copydefault + ", message=" + this.EZpvd + ", details=" + this.KWHzl + ", data=" + this.AEQbTJ + ", timestamp=" + this.OLrzqt + ")";
    }

    public C47572tse(@NotNull ContentValidationType contentValidationType, @NotNull ValidationStatus validationStatus, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj, long j) {
        Intrinsics.checkNotNullParameter(contentValidationType, "");
        Intrinsics.checkNotNullParameter(validationStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt = contentValidationType;
        this.copydefault = validationStatus;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = obj;
        this.OLrzqt = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r11v0 com.okinc.planet.biz_content.input.ContentValidationType)
  (r12v0 com.okinc.planet.biz_content.input.ValidationStatus)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r15v0 java.lang.Object))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:327)) : (r16v0 long))
 A[MD:(com.okinc.planet.biz_content.input.ContentValidationType, com.okinc.planet.biz_content.input.ValidationStatus, java.lang.String, java.lang.String, java.lang.Object, long):void (m)] (LINE:321) call: o.tse.<init>(com.okinc.planet.biz_content.input.ContentValidationType, com.okinc.planet.biz_content.input.ValidationStatus, java.lang.String, java.lang.String, java.lang.Object, long):void type: THIS */
    public /* synthetic */ C47572tse(ContentValidationType contentValidationType, ValidationStatus validationStatus, java.lang.String str, java.lang.String str2, java.lang.Object obj, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contentValidationType, validationStatus, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : obj, (i & 32) != 0 ? java.lang.System.currentTimeMillis() : j);
    }
}
