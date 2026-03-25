package o;

import com.okinc.web3Uilib.uilib3.bean.InfoBottomSheetStyle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57477yjE extends AbstractC57480yjH {
    public final java.lang.String AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<C57481yjI> OLrzqt;
    public final InfoBottomSheetStyle copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yjE */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C57477yjE copy$default(C57477yjE c57477yjE, java.util.List list, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c57477yjE.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c57477yjE.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = c57477yjE.KWHzl;
        }
        if ((i & 8) != 0) {
            z = c57477yjE.EZpvd;
        }
        return c57477yjE.KWHzl(list, str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57480yjH
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C57481yjI> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57477yjE KWHzl(@NotNull java.util.List<C57481yjI> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C57477yjE(list, str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57480yjH
    public boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57480yjH
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57477yjE)) {
            return false;
        }
        C57477yjE c57477yjE = (C57477yjE) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c57477yjE.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c57477yjE.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c57477yjE.KWHzl) && this.EZpvd == c57477yjE.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InfoListData(items=" + this.OLrzqt + ", primaryButtonText=" + this.AEQbTJ + ", secondaryButtonText=" + this.KWHzl + ", isShowCloseIcon=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r2v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.util.List<o.yjI>, java.lang.String, java.lang.String, boolean):void (m)] (LINE:41) call: o.yjE.<init>(java.util.List, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C57477yjE(java.util.List list, java.lang.String str, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57477yjE(@NotNull java.util.List<C57481yjI> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = list;
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.EZpvd = z;
        this.copydefault = InfoBottomSheetStyle.INFO_LIST;
    }
}
