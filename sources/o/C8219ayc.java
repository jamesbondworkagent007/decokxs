package o;

import com.okinc.assets.api.model.SelectionType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C8219ayc {
    public final java.lang.String EZpvd;
    public final SelectionType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8219ayc() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C8219ayc copy$default(C8219ayc c8219ayc, java.lang.String str, SelectionType selectionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c8219ayc.EZpvd;
        }
        if ((i & 2) != 0) {
            selectionType = c8219ayc.OLrzqt;
        }
        return c8219ayc.OLrzqt(str, selectionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectionType KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8219ayc OLrzqt(@NotNull java.lang.String str, SelectionType selectionType) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C8219ayc(str, selectionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8219ayc)) {
            return false;
        }
        C8219ayc c8219ayc = (C8219ayc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c8219ayc.EZpvd) && this.OLrzqt == c8219ayc.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        SelectionType selectionType = this.OLrzqt;
        return (iHashCode * 31) + (selectionType == null ? 0 : selectionType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CurrencyUnitDropDownUIModel(title=" + this.EZpvd + ", type=" + this.OLrzqt + ")";
    }

    public C8219ayc(@NotNull java.lang.String str, SelectionType selectionType) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
        this.OLrzqt = selectionType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.assets.api.model.SelectionType:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.api.model.SelectionType) : (r2v0 com.okinc.assets.api.model.SelectionType))
 A[MD:(java.lang.String, com.okinc.assets.api.model.SelectionType):void (m)] (LINE:3) call: o.ayc.<init>(java.lang.String, com.okinc.assets.api.model.SelectionType):void type: THIS */
    public /* synthetic */ C8219ayc(java.lang.String str, SelectionType selectionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : selectionType);
    }
}
