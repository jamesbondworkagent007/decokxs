package o;

import com.okinc.im.imui.relationlist.model.SearchLocalRelationPayload;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37247oqI {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final C37246oqH EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C37247oqI copy$default(C37247oqI c37247oqI, C37246oqH c37246oqH, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c37246oqH = c37247oqI.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c37247oqI.KWHzl;
        }
        return c37247oqI.OLrzqt(c37246oqH, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37247oqI OLrzqt(@NotNull C37246oqH c37246oqH, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        return new C37247oqI(c37246oqH, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37246oqH copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37247oqI)) {
            return false;
        }
        C37247oqI c37247oqI = (C37247oqI) obj;
        return Intrinsics.EZpvd(this.EZpvd, c37247oqI.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c37247oqI.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.lang.String str = this.KWHzl;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchLocalRelation(groupedLocalRelation=" + this.EZpvd + ", searchKeyword=" + this.KWHzl + ")";
    }

    public C37247oqI(@NotNull C37246oqH c37246oqH, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c37246oqH, "");
        this.EZpvd = c37246oqH;
        this.KWHzl = str;
    }

    /* JADX INFO: renamed from: o.oqI$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oqI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.Object OLrzqt(@NotNull C37247oqI c37247oqI, @NotNull C37247oqI c37247oqI2) {
            Intrinsics.checkNotNullParameter(c37247oqI, "");
            Intrinsics.checkNotNullParameter(c37247oqI2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!Intrinsics.EZpvd((java.lang.Object) c37247oqI.AEQbTJ(), (java.lang.Object) c37247oqI2.AEQbTJ())) {
                arrayList.add(SearchLocalRelationPayload.KEYWORD);
            }
            if (c37247oqI.copydefault().OLrzqt().size() != c37247oqI2.copydefault().OLrzqt().size()) {
                arrayList.add(SearchLocalRelationPayload.OTHER_LOCAL_RELATION_COUNT);
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }
}
