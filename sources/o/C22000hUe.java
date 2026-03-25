package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hUe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22000hUe implements InterfaceC55105xdf {
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.util.List<java.lang.Object> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.util.List<java.lang.Object> getSectionDataList() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public boolean getShowSuspension() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.lang.String getSuspensionTag() {
        return this.KWHzl;
    }

    public C22000hUe(java.lang.String str, @NotNull java.util.List<java.lang.Object> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.OLrzqt = list;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(java.lang.String, java.util.List<java.lang.Object>, boolean):void (m)] (LINE:6) call: o.hUe.<init>(java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C22000hUe(java.lang.String str, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? true : z);
    }
}
