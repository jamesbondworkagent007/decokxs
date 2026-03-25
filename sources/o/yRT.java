package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRT extends yRL {
    public static final /* synthetic */ yJA<java.lang.Object>[] gEmmrt = {C56524yIo.copydefault(new PropertyReference1Impl(yRT.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final InterfaceC59182zcH AYXKKw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yRT(yTO yto, @NotNull C56794ySo c56794ySo) {
        super(c56794ySo, yto, yMB.Application.uzCIH);
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        this.AYXKKw = c56794ySo.EZpvd().KWHzl(yRS.AEQbTJ);
    }

    @Override // o.yRL, o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt() {
        return (java.util.Map) C59183zcI.AEQbTJ(this.AYXKKw, this, gEmmrt[0]);
    }

    public static final java.util.Map djBIcL() {
        return C56423yEv.EZpvd(C56390yDp.OLrzqt(yRM.KWHzl.copydefault(), new C56993yZy("Deprecated in Java")));
    }
}
