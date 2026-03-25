package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rXu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42571rXu {

    @SerializedName("endTs")
    private final java.lang.Long endTs;

    @SerializedName("recTs")
    private final java.lang.Long recTs;

    @SerializedName("result")
    private final java.lang.String result;

    @SerializedName("startTs")
    private final java.lang.Long startTs;

    @SerializedName("streamId")
    private final java.lang.String streamId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C42571rXu() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C42571rXu copy$default(C42571rXu c42571rXu, java.lang.Long l, java.lang.Long l2, java.lang.String str, java.lang.Long l3, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c42571rXu.endTs;
        }
        if ((i & 2) != 0) {
            l2 = c42571rXu.recTs;
        }
        java.lang.Long l4 = l2;
        if ((i & 4) != 0) {
            str = c42571rXu.result;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            l3 = c42571rXu.startTs;
        }
        java.lang.Long l5 = l3;
        if ((i & 16) != 0) {
            str2 = c42571rXu.streamId;
        }
        return c42571rXu.EZpvd(l, l4, str3, l5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42571rXu EZpvd(java.lang.Long l, java.lang.Long l2, java.lang.String str, java.lang.Long l3, java.lang.String str2) {
        return new C42571rXu(l, l2, str, l3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42571rXu)) {
            return false;
        }
        C42571rXu c42571rXu = (C42571rXu) obj;
        return Intrinsics.EZpvd(this.endTs, c42571rXu.endTs) && Intrinsics.EZpvd(this.recTs, c42571rXu.recTs) && Intrinsics.EZpvd((java.lang.Object) this.result, (java.lang.Object) c42571rXu.result) && Intrinsics.EZpvd(this.startTs, c42571rXu.startTs) && Intrinsics.EZpvd((java.lang.Object) this.streamId, (java.lang.Object) c42571rXu.streamId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.endTs;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.recTs;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        java.lang.String str = this.result;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.Long l3 = this.startTs;
        int iHashCode4 = l3 == null ? 0 : l3.hashCode();
        java.lang.String str2 = this.streamId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TranslationResultModel(endTs=" + this.endTs + ", recTs=" + this.recTs + ", result=" + this.result + ", startTs=" + this.startTs + ", streamId=" + this.streamId + ")";
    }

    public C42571rXu(java.lang.Long l, java.lang.Long l2, java.lang.String str, java.lang.Long l3, java.lang.String str2) {
        this.endTs = l;
        this.recTs = l2;
        this.result = str;
        this.startTs = l3;
        this.streamId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:5) call: o.rXu.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ C42571rXu(java.lang.Long l, java.lang.Long l2, java.lang.String str, java.lang.Long l3, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l3, (i & 16) != 0 ? null : str2);
    }
}
