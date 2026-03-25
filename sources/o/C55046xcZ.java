package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55046xcZ implements InterfaceC55105xdf {
    public java.lang.String AEQbTJ;
    public java.lang.Object EZpvd;
    public boolean KWHzl;
    public java.util.List<java.lang.Object> OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55046xcZ() {
        this(false, null, null, null, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.util.List<java.lang.Object> getSectionDataList() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public boolean getShowSuspension() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.lang.String getSuspensionTag() {
        return this.AEQbTJ;
    }

    public C55046xcZ(boolean z, java.lang.String str, @NotNull java.util.List<java.lang.Object> list, @NotNull java.lang.Object obj, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.copydefault = z;
        this.AEQbTJ = str;
        this.OLrzqt = list;
        this.EZpvd = obj;
        this.KWHzl = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:java.lang.String:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.util.List:0x0015: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:13) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r6v0 java.util.List))
  (wrap:java.lang.Object:0x001f: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Object:0x001c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:14) call: java.lang.Object.<init>():void type: CONSTRUCTOR) : (r7v0 java.lang.Object))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(boolean, java.lang.String, java.util.List<java.lang.Object>, java.lang.Object, boolean):void (m)] (LINE:10) call: o.xcZ.<init>(boolean, java.lang.String, java.util.List, java.lang.Object, boolean):void type: THIS */
    public /* synthetic */ C55046xcZ(boolean z, java.lang.String str, java.util.List list, java.lang.Object obj, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new java.util.ArrayList() : list, (i & 8) != 0 ? new java.lang.Object() : obj, (i & 16) != 0 ? false : z2);
    }

    public java.lang.String toString() {
        return "AnchorSelectionEntity(showSuspension=" + getShowSuspension() + ", suspensionTag=" + getSuspensionTag() + ", sectionDataList=" + getSectionDataList() + ", anyData=" + this.EZpvd + ", showLine=" + this.KWHzl + ")";
    }
}
