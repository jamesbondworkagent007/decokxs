package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13784dYd implements InterfaceC55105xdf {
    public java.lang.String AEQbTJ;
    public boolean KWHzl;
    public java.util.List<java.lang.Object> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C13784dYd() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.util.List<java.lang.Object> getSectionDataList() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public boolean getShowSuspension() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55105xdf
    public java.lang.String getSuspensionTag() {
        return this.AEQbTJ;
    }

    public C13784dYd(boolean z, java.lang.String str, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = z;
        this.AEQbTJ = str;
        this.copydefault = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:8) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
 A[MD:(boolean, java.lang.String, java.util.List<java.lang.Object>):void (m)] (LINE:5) call: o.dYd.<init>(boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ C13784dYd(boolean z, java.lang.String str, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new java.util.ArrayList() : list);
    }
}
