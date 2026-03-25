package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59285zeE implements yYZ {
    public final InterfaceC59317zek AEQbTJ;
    public final InterfaceC56691yOt EZpvd;
    public final C59285zeE KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public Function0<? extends java.util.List<? extends AbstractC59331zey>> copydefault;

    public static final java.util.List AEQbTJ(java.util.List list) {
        return list;
    }

    public static final java.util.List copydefault(java.util.List list) {
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yYZ
    public InterfaceC59317zek AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC59315zei
    public InterfaceC56663yNs KWHzl() {
        return null;
    }

    @Override // o.InterfaceC59315zei
    public boolean gEmmrt() {
        return false;
    }

    public C59285zeE(@NotNull InterfaceC59317zek interfaceC59317zek, Function0<? extends java.util.List<? extends AbstractC59331zey>> function0, C59285zeE c59285zeE, InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        this.AEQbTJ = interfaceC59317zek;
        this.copydefault = function0;
        this.KWHzl = c59285zeE;
        this.EZpvd = interfaceC56691yOt;
        this.OLrzqt = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new C59289zeI(this));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 o.zek)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:o.zeE:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.zeE) : (r4v0 o.zeE))
  (wrap:o.yOt:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.yOt) : (r5v0 o.yOt))
 A[MD:(o.zek, kotlin.jvm.functions.Function0<? extends java.util.List<? extends o.zey>>, o.zeE, o.yOt):void (m)] (LINE:233) call: o.zeE.<init>(o.zek, kotlin.jvm.functions.Function0, o.zeE, o.yOt):void type: THIS */
    public /* synthetic */ C59285zeE(InterfaceC59317zek interfaceC59317zek, Function0 function0, C59285zeE c59285zeE, InterfaceC56691yOt interfaceC56691yOt, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59317zek, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : c59285zeE, (i & 8) != 0 ? null : interfaceC56691yOt);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.zek)
  (r2v0 java.util.List)
  (wrap:o.zeE:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.zeE) : (r3v0 o.zeE))
 A[MD:(o.zek, java.util.List<? extends o.zey>, o.zeE):void (m)] (LINE:240) call: o.zeE.<init>(o.zek, java.util.List, o.zeE):void type: THIS */
    public /* synthetic */ C59285zeE(InterfaceC59317zek interfaceC59317zek, java.util.List list, C59285zeE c59285zeE, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC59317zek, list, (i & 4) != 0 ? null : c59285zeE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59285zeE(@NotNull InterfaceC59317zek interfaceC59317zek, @NotNull java.util.List<? extends AbstractC59331zey> list, C59285zeE c59285zeE) {
        this(interfaceC59317zek, new C59292zeL(list), c59285zeE, null, 8, null);
        Intrinsics.checkNotNullParameter(interfaceC59317zek, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    public final java.util.List<AbstractC59331zey> djBIcL() {
        return (java.util.List) this.OLrzqt.getValue();
    }

    public static final java.util.List AEQbTJ(C59285zeE c59285zeE) {
        Function0<? extends java.util.List<? extends AbstractC59331zey>> function0 = c59285zeE.copydefault;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final void OLrzqt(@NotNull java.util.List<? extends AbstractC59331zey> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = new C59290zeJ(list);
    }

    /* JADX DEBUG: Method merged with bridge method: bV_()Ljava/util/Collection; */
    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public java.util.List<AbstractC59331zey> bV_() {
        java.util.List<AbstractC59331zey> listDjBIcL = djBIcL();
        return listDjBIcL == null ? yDY.AhwBna() : listDjBIcL;
    }

    @Override // o.InterfaceC59315zei
    public java.util.List<InterfaceC56691yOt> copydefault() {
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59315zei
    public AbstractC56640yMw bU_() {
        AbstractC59233zdF abstractC59233zdFOLrzqt = AEQbTJ().OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        return C59336zfC.copydefault(abstractC59233zdFOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/zeG;)Lo/zei; */
    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59285zeE AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        InterfaceC59317zek interfaceC59317zekCopydefault = AEQbTJ().copydefault(abstractC59287zeG);
        Intrinsics.checkNotNullExpressionValue(interfaceC59317zekCopydefault, "");
        C59294zeN c59294zeN = this.copydefault != null ? new C59294zeN(this, abstractC59287zeG) : null;
        C59285zeE c59285zeE = this.KWHzl;
        if (c59285zeE == null) {
            c59285zeE = this;
        }
        return new C59285zeE(interfaceC59317zekCopydefault, c59294zeN, c59285zeE, this.EZpvd);
    }

    public static final java.util.List copydefault(C59285zeE c59285zeE, AbstractC59287zeG abstractC59287zeG) {
        java.util.List<AbstractC59331zey> listBV_ = c59285zeE.bV_();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listBV_, 10));
        java.util.Iterator<T> it = listBV_.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC59331zey) it.next()).KWHzl(abstractC59287zeG));
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C59285zeE.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        C59285zeE c59285zeE = (C59285zeE) obj;
        C59285zeE c59285zeE2 = this.KWHzl;
        if (c59285zeE2 == null) {
            c59285zeE2 = this;
        }
        C59285zeE c59285zeE3 = c59285zeE.KWHzl;
        if (c59285zeE3 != null) {
            obj = c59285zeE3;
        }
        return c59285zeE2 == obj;
    }

    public int hashCode() {
        C59285zeE c59285zeE = this.KWHzl;
        return c59285zeE != null ? c59285zeE.hashCode() : super.hashCode();
    }

    public java.lang.String toString() {
        return "CapturedType(" + AEQbTJ() + ')';
    }
}
