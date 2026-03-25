package o;

import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ttg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47627ttg {
    public final java.util.List<PublisherTopicInfo> KWHzl;
    public final java.util.List<PublisherTopicInfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47627ttg() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ttg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47627ttg copy$default(C47627ttg c47627ttg, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c47627ttg.KWHzl;
        }
        if ((i & 2) != 0) {
            list2 = c47627ttg.copydefault;
        }
        return c47627ttg.OLrzqt(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PublisherTopicInfo> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PublisherTopicInfo> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47627ttg OLrzqt(@NotNull java.util.List<PublisherTopicInfo> list, @NotNull java.util.List<PublisherTopicInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C47627ttg(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47627ttg)) {
            return false;
        }
        C47627ttg c47627ttg = (C47627ttg) obj;
        return Intrinsics.EZpvd(this.KWHzl, c47627ttg.KWHzl) && Intrinsics.EZpvd(this.copydefault, c47627ttg.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TopicUiState(allTopics=" + this.KWHzl + ", filtered=" + this.copydefault + ")";
    }

    public C47627ttg(@NotNull java.util.List<PublisherTopicInfo> list, @NotNull java.util.List<PublisherTopicInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.KWHzl = list;
        this.copydefault = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:52)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.planet.domain.remote.dto.PublisherTopicInfo>, java.util.List<com.okinc.planet.domain.remote.dto.PublisherTopicInfo>):void (m)] (LINE:50) call: o.ttg.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C47627ttg(java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
