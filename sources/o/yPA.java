package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yNP;
import o.yPH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yPA extends AbstractC56711yPm implements yNP {
    public boolean AEQbTJ;
    public final InterfaceC59181zcG<C56933yXs, yNY> AYXKKw;
    public yNU AhwBna;
    public final C56939yXy DbNXlk;
    public InterfaceC56724yPz EZpvd;
    public final AbstractC56640yMw OLrzqt;
    public final java.util.Map<yNN<?>, java.lang.Object> copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC59187zcM isConnected;
    public final yPH valueOf;
    public final C56935yXu values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yPA(@NotNull C56935yXu c56935yXu, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull AbstractC56640yMw abstractC56640yMw, C56939yXy c56939yXy) {
        this(c56935yXu, interfaceC59187zcM, abstractC56640yMw, c56939yXy, null, null, 48, null);
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean fetchVPNInfo() {
        return this.AhwBna != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNP
    public AbstractC56640yMw AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AkhnZx() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC56724yPz interfaceC56724yPz) {
        Intrinsics.checkNotNullParameter(interfaceC56724yPz, "");
        this.EZpvd = interfaceC56724yPz;
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(@NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return (R) yNP.Application.AEQbTJ(this, interfaceC56667yNw, d);
    }

    @Override // o.InterfaceC56665yNu
    public InterfaceC56665yNu AYXKKw() {
        return yNP.Application.OLrzqt(this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r10v0 o.yXu)
  (r11v0 o.zcM)
  (r12v0 o.yMw)
  (wrap:o.yXy:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.yXy) : (r13v0 o.yXy))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:34)) : (r14v0 java.util.Map))
  (wrap:o.yXu:?: TERNARY null = ((wrap:int:0x0013: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.yXu) : (r15v0 o.yXu))
 A[MD:(o.yXu, o.zcM, o.yMw, o.yXy, java.util.Map<o.yNN<?>, ? extends java.lang.Object>, o.yXu):void (m)] (LINE:28) call: o.yPA.<init>(o.yXu, o.zcM, o.yMw, o.yXy, java.util.Map, o.yXu):void type: THIS */
    public /* synthetic */ yPA(C56935yXu c56935yXu, InterfaceC59187zcM interfaceC59187zcM, AbstractC56640yMw abstractC56640yMw, C56939yXy c56939yXy, java.util.Map map, C56935yXu c56935yXu2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56935yXu, interfaceC59187zcM, abstractC56640yMw, (i & 8) != 0 ? null : c56939yXy, (i & 16) != 0 ? C56424yEw.KWHzl() : map, (i & 32) != 0 ? null : c56935yXu2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPA(@NotNull C56935yXu c56935yXu, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull AbstractC56640yMw abstractC56640yMw, C56939yXy c56939yXy, @NotNull java.util.Map<yNN<?>, ? extends java.lang.Object> map, C56935yXu c56935yXu2) {
        super(yOL.KWHzl.OLrzqt(), c56935yXu);
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(abstractC56640yMw, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.isConnected = interfaceC59187zcM;
        this.OLrzqt = abstractC56640yMw;
        this.DbNXlk = c56939yXy;
        this.values = c56935yXu2;
        if (!c56935yXu.OLrzqt()) {
            throw new java.lang.IllegalArgumentException("Module name must be special: " + c56935yXu);
        }
        this.copydefault = map;
        yPH yph = (yPH) OLrzqt(yPH.AEQbTJ.AEQbTJ());
        this.valueOf = yph == null ? yPH.Activity.copydefault : yph;
        this.AEQbTJ = true;
        this.AYXKKw = interfaceC59187zcM.AEQbTJ(new yPB(this));
        this.djBIcL = C56392yDr.copydefault(new yPC(this));
    }

    public void EZpvd() {
        if (AkhnZx()) {
            return;
        }
        yNK.KWHzl(this);
    }

    public static final yNY OLrzqt(yPA ypa, C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return ypa.valueOf.copydefault(ypa, c56933yXs, ypa.isConnected);
    }

    @Override // o.yNP
    public java.util.List<yNP> KWHzl() {
        InterfaceC56724yPz interfaceC56724yPz = this.EZpvd;
        if (interfaceC56724yPz != null) {
            return interfaceC56724yPz.KWHzl();
        }
        throw new java.lang.AssertionError("Dependencies of module " + valueOf() + " were not set");
    }

    @Override // o.yNP
    public yNY copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        EZpvd();
        return this.AYXKKw.invoke(c56933yXs);
    }

    @Override // o.yNP
    public java.util.Collection<C56933yXs> OLrzqt(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd();
        return AhwBna().KWHzl(c56933yXs, function1);
    }

    public final C56705yPg djBIcL() {
        return (C56705yPg) this.djBIcL.getValue();
    }

    public static final C56705yPg AEQbTJ(yPA ypa) {
        InterfaceC56724yPz interfaceC56724yPz = ypa.EZpvd;
        if (interfaceC56724yPz == null) {
            throw new java.lang.AssertionError("Dependencies of module " + ypa.valueOf() + " were not set before querying module content");
        }
        java.util.List<yPA> listEZpvd = interfaceC56724yPz.EZpvd();
        ypa.EZpvd();
        listEZpvd.contains(ypa);
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            ((yPA) it.next()).fetchVPNInfo();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it2 = listEZpvd.iterator();
        while (it2.hasNext()) {
            yNU ynu = ((yPA) it2.next()).AhwBna;
            Intrinsics.copydefault(ynu);
            arrayList.add(ynu);
        }
        return new C56705yPg(arrayList, "CompositeProvider@ModuleDescriptor for " + ypa.bR_());
    }

    public final void copydefault(@NotNull yPA... ypaArr) {
        Intrinsics.checkNotNullParameter(ypaArr, "");
        AEQbTJ(yDV.AwvSrB(ypaArr));
    }

    public final void AEQbTJ(@NotNull java.util.List<yPA> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt(list, yEE.copydefault());
    }

    public final void OLrzqt(@NotNull java.util.List<yPA> list, @NotNull java.util.Set<yPA> set) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(set, "");
        copydefault(new yPD(list, set, yDY.AhwBna(), yEE.copydefault()));
    }

    @Override // o.yNP
    public boolean EZpvd(@NotNull yNP ynp) {
        Intrinsics.checkNotNullParameter(ynp, "");
        if (Intrinsics.EZpvd(this, ynp)) {
            return true;
        }
        InterfaceC56724yPz interfaceC56724yPz = this.EZpvd;
        Intrinsics.copydefault(interfaceC56724yPz);
        return CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends yNP>) ((java.lang.Iterable<? extends java.lang.Object>) interfaceC56724yPz.copydefault()), ynp) || KWHzl().contains(ynp) || ynp.KWHzl().contains(this);
    }

    public final java.lang.String valueOf() {
        java.lang.String string = bR_().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void KWHzl(@NotNull yNU ynu) {
        Intrinsics.checkNotNullParameter(ynu, "");
        fetchVPNInfo();
        this.AhwBna = ynu;
    }

    public final yNU AhwBna() {
        EZpvd();
        return djBIcL();
    }

    @Override // o.yNP
    public <T> T OLrzqt(@NotNull yNN<T> ynn) {
        Intrinsics.checkNotNullParameter(ynn, "");
        T t = (T) this.copydefault.get(ynn);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // o.AbstractC56711yPm
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        if (!AkhnZx()) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        yNU ynu = this.AhwBna;
        sb.append(ynu != null ? ynu.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
