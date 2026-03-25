package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRY extends yRL {
    public static final /* synthetic */ yJA<java.lang.Object>[] AYXKKw = {C56524yIo.copydefault(new PropertyReference1Impl(yRY.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final InterfaceC59182zcH gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yRY(@NotNull yTO yto, @NotNull C56794ySo c56794ySo) {
        super(c56794ySo, yto, yMB.Application.ODWQjV);
        Intrinsics.checkNotNullParameter(yto, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        this.gEmmrt = c56794ySo.EZpvd().KWHzl(new yRU(this));
    }

    @Override // o.yRL, o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt() {
        return (java.util.Map) C59183zcI.AEQbTJ(this.gEmmrt, this, AYXKKw[0]);
    }

    public static final java.util.Map EZpvd(yRY yry) {
        AbstractC56975yZg<?> abstractC56975yZgAEQbTJ = yRR.copydefault.AEQbTJ(yry.copydefault());
        java.util.Map mapEZpvd = abstractC56975yZgAEQbTJ != null ? C56423yEv.EZpvd(C56390yDp.OLrzqt(yRM.KWHzl.OLrzqt(), abstractC56975yZgAEQbTJ)) : null;
        return mapEZpvd == null ? C56424yEw.KWHzl() : mapEZpvd;
    }
}
