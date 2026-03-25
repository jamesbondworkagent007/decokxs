package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54255xBq extends xKD {
    public final C56231xys AEQbTJ;
    public final boolean EZpvd;
    public final C56291xzz KWHzl;
    public final C56232xyt OLrzqt;
    public final C56208xyV copydefault;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C54255xBq() {
        boolean z = false;
        this(z, z, 3, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(boolean, boolean):void (m)] (LINE:16) call: o.xBq.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ C54255xBq(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public C54255xBq(boolean z, boolean z2) {
        this.EZpvd = z;
        this.djBIcL = z2;
        C56231xys c56231xys = new C56231xys();
        c56231xys.fIwbmz();
        this.AEQbTJ = c56231xys;
        C56232xyt c56232xyt = new C56232xyt();
        c56232xyt.fIwbmz();
        this.OLrzqt = c56232xyt;
        C56208xyV c56208xyV = new C56208xyV();
        c56208xyV.fIwbmz();
        this.copydefault = c56208xyV;
        C56291xzz c56291xzz = new C56291xzz();
        c56291xzz.fIwbmz();
        this.KWHzl = c56291xzz;
    }

    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ.bB_();
    }

    public final java.lang.String OLrzqt() {
        return this.OLrzqt.bB_();
    }

    public final java.lang.String KWHzl() {
        return this.copydefault.bB_();
    }

    public final java.lang.String EZpvd() {
        return this.KWHzl.bB_();
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this.AEQbTJ);
        if (this.djBIcL) {
            arrayList.add(this.OLrzqt);
        }
        arrayList.add(this.copydefault);
        arrayList.add(this.KWHzl);
        return arrayList;
    }
}
