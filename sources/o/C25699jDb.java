package o;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25699jDb {
    public final java.util.List<LeaderBoardFilterModel> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25699jDb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jDb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25699jDb copy$default(C25699jDb c25699jDb, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c25699jDb.KWHzl;
        }
        return c25699jDb.EZpvd(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LeaderBoardFilterModel> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25699jDb EZpvd(@NotNull java.util.List<LeaderBoardFilterModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C25699jDb(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25699jDb) && Intrinsics.EZpvd(this.KWHzl, ((C25699jDb) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LeaderBoardFilterLocalData(list=" + this.KWHzl + ")";
    }

    public C25699jDb(@NotNull java.util.List<LeaderBoardFilterModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:6) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel>):void (m)] (LINE:5) call: o.jDb.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C25699jDb(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list);
    }
}
