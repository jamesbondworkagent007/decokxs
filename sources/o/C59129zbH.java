package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.yOL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59129zbH implements yOL {
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(C59129zbH.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};
    public final InterfaceC59182zcH OLrzqt;

    public C59129zbH(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull Function0<? extends java.util.List<? extends yOJ>> function0) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = interfaceC59187zcM.KWHzl(function0);
    }

    @Override // o.yOL
    public yOJ EZpvd(@NotNull C56933yXs c56933yXs) {
        return yOL.Activity.EZpvd(this, c56933yXs);
    }

    @Override // o.yOL
    public boolean copydefault(@NotNull C56933yXs c56933yXs) {
        return yOL.Activity.OLrzqt(this, c56933yXs);
    }

    private final java.util.List<yOJ> copydefault() {
        return (java.util.List) C59183zcI.AEQbTJ(this.OLrzqt, this, EZpvd[0]);
    }

    @Override // o.yOL
    public boolean AEQbTJ() {
        return copydefault().isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<yOJ> iterator() {
        return copydefault().iterator();
    }
}
