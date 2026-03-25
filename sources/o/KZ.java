package o;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class KZ {
    public final long AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;
    public final SimpleDateFormat djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KZ copy$default(KZ kz, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = kz.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = kz.EZpvd;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            num = kz.copydefault;
        }
        java.lang.Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = kz.KWHzl;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            j = kz.AEQbTJ;
        }
        return kz.OLrzqt(str, str4, num2, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KZ OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new KZ(str, str2, num, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KZ)) {
            return false;
        }
        KZ kz = (KZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) kz.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) kz.EZpvd) && Intrinsics.EZpvd(this.copydefault, kz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) kz.KWHzl) && this.AEQbTJ == kz.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.Integer num = this.copydefault;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AnalyticsRequest(apiKey=" + this.OLrzqt + ", events=" + this.EZpvd + ", minIdLength=" + this.copydefault + ", diagnostics=" + this.KWHzl + ", clientUploadTime=" + this.AEQbTJ + ')';
    }

    public KZ(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Integer num, java.lang.String str3, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.copydefault = num;
        this.KWHzl = str3;
        this.AEQbTJ = j;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", java.util.Locale.US);
        simpleDateFormat.setTimeZone(yCN.OLrzqt("UTC"));
        this.djBIcL = simpleDateFormat;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:13)) : (r14v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, long):void (m)] (LINE:8) call: o.KZ.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, long):void type: THIS */
    public /* synthetic */ KZ(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? java.lang.System.currentTimeMillis() : j);
    }

    public final java.lang.String AEQbTJ() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("{\"api_key\":\"" + this.OLrzqt + "\",\"client_upload_time\":\"" + OLrzqt() + "\",\"events\":" + this.EZpvd);
        if (this.copydefault != null) {
            sb.append(",\"options\":{\"min_id_length\":" + this.copydefault + AbstractJsonLexerKt.END_OBJ);
        }
        if (this.KWHzl != null) {
            sb.append(",\"request_metadata\":{\"sdk\":" + this.KWHzl + AbstractJsonLexerKt.END_OBJ);
        }
        sb.append("}");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String OLrzqt() {
        java.lang.String str = this.djBIcL.format(new Date(this.AEQbTJ));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
