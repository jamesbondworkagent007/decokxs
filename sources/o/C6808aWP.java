package o;

import com.okinc.biz.model.RatingDisplayStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aWP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6808aWP {
    public final RatingDisplayStatus copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C6808aWP() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C6808aWP copy$default(C6808aWP c6808aWP, RatingDisplayStatus ratingDisplayStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ratingDisplayStatus = c6808aWP.copydefault;
        }
        return c6808aWP.OLrzqt(ratingDisplayStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6808aWP OLrzqt(@NotNull RatingDisplayStatus ratingDisplayStatus) {
        Intrinsics.checkNotNullParameter(ratingDisplayStatus, "");
        return new C6808aWP(ratingDisplayStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6808aWP) && this.copydefault == ((C6808aWP) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SupportRatingMetadata(status=" + this.copydefault + ")";
    }

    public C6808aWP(@NotNull RatingDisplayStatus ratingDisplayStatus) {
        Intrinsics.checkNotNullParameter(ratingDisplayStatus, "");
        this.copydefault = ratingDisplayStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.biz.model.RatingDisplayStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.biz.model.RatingDisplayStatus:0x0004: SGET  A[WRAPPED] (LINE:6) com.okinc.biz.model.RatingDisplayStatus.Unknown com.okinc.biz.model.RatingDisplayStatus) : (r1v0 com.okinc.biz.model.RatingDisplayStatus))
 A[MD:(com.okinc.biz.model.RatingDisplayStatus):void (m)] (LINE:5) call: o.aWP.<init>(com.okinc.biz.model.RatingDisplayStatus):void type: THIS */
    public /* synthetic */ C6808aWP(RatingDisplayStatus ratingDisplayStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RatingDisplayStatus.Unknown : ratingDisplayStatus);
    }
}
