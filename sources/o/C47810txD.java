package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.txD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47810txD {
    public static final Activity Companion = new Activity(null);

    @SerializedName("status")
    private final int status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47810txD copy$default(C47810txD c47810txD, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c47810txD.status;
        }
        return c47810txD.EZpvd(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47810txD EZpvd(int i) {
        return new C47810txD(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47810txD) && this.status == ((C47810txD) obj).status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AssetAiInsightLoadStatus(status=" + this.status + ")";
    }

    public C47810txD(int i) {
        this.status = i;
    }

    /* JADX INFO: renamed from: o.txD$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.txD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
