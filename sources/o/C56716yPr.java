package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56716yPr extends AbstractC56711yPm implements yNY {
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(C56716yPr.class, "fragments", "getFragments()Ljava/util/List;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C56716yPr.class, "empty", "getEmpty()Z", 0))};
    public final C56933yXs AEQbTJ;
    public final InterfaceC59182zcH OLrzqt;
    public final InterfaceC59182zcH copydefault;
    public final InterfaceC59098zad djBIcL;
    public final yPA valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNY
    public InterfaceC59098zad EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNY
    public C56933yXs KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: djBIcL()Lo/yNP; */
    @Override // o.yNY
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public yPA djBIcL() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56716yPr(@NotNull yPA ypa, @NotNull C56933yXs c56933yXs, @NotNull InterfaceC59187zcM interfaceC59187zcM) {
        super(yOL.KWHzl.OLrzqt(), c56933yXs.gEmmrt());
        Intrinsics.checkNotNullParameter(ypa, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        this.valueOf = ypa;
        this.AEQbTJ = c56933yXs;
        this.copydefault = interfaceC59187zcM.KWHzl(new C56714yPp(this));
        this.OLrzqt = interfaceC59187zcM.KWHzl(new C56721yPw(this));
        this.djBIcL = new yZZ(interfaceC59187zcM, new C56723yPy(this));
    }

    @Override // o.yNY
    public java.util.List<yNW> AEQbTJ() {
        return (java.util.List) C59183zcI.AEQbTJ(this.copydefault, this, EZpvd[0]);
    }

    public static final java.util.List KWHzl(C56716yPr c56716yPr) {
        return C56672yOa.OLrzqt(c56716yPr.djBIcL().AhwBna(), c56716yPr.KWHzl());
    }

    public final boolean DbNXlk() {
        return ((java.lang.Boolean) C59183zcI.AEQbTJ(this.OLrzqt, this, EZpvd[1])).booleanValue();
    }

    public static final boolean OLrzqt(C56716yPr c56716yPr) {
        return C56672yOa.EZpvd(c56716yPr.djBIcL().AhwBna(), c56716yPr.KWHzl());
    }

    @Override // o.yNY
    public boolean AhwBna() {
        return DbNXlk();
    }

    public static final InterfaceC59098zad djBIcL(C56716yPr c56716yPr) {
        if (c56716yPr.AhwBna()) {
            return InterfaceC59098zad.ActionBar.copydefault;
        }
        java.util.List<yNW> listAEQbTJ = c56716yPr.AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((yNW) it.next()).AEQbTJ());
        }
        java.util.List listCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends yPJ>) arrayList, new yPJ(c56716yPr.djBIcL(), c56716yPr.KWHzl()));
        return yZW.OLrzqt.AEQbTJ("package view scope for " + c56716yPr.KWHzl() + " in " + c56716yPr.djBIcL().bR_(), (java.lang.Iterable<? extends InterfaceC59098zad>) listCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yNu; */
    @Override // o.InterfaceC56665yNu
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public yNY AYXKKw() {
        if (KWHzl().AEQbTJ()) {
            return null;
        }
        return djBIcL().copydefault(KWHzl().EZpvd());
    }

    public boolean equals(java.lang.Object obj) {
        yNY yny = obj instanceof yNY ? (yNY) obj : null;
        return yny != null && Intrinsics.EZpvd(KWHzl(), yny.KWHzl()) && Intrinsics.EZpvd(djBIcL(), yny.djBIcL());
    }

    public int hashCode() {
        return (djBIcL().hashCode() * 31) + KWHzl().hashCode();
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(@NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        Intrinsics.checkNotNullParameter(interfaceC56667yNw, "");
        return interfaceC56667yNw.AEQbTJ(this, d);
    }
}
