package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yRW extends yRL {
    public static final /* synthetic */ yJA<java.lang.Object>[] AYXKKw = {C56524yIo.copydefault(new PropertyReference1Impl(yRW.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final InterfaceC59182zcH gEmmrt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yRW(@NotNull yTO yto, @NotNull C56794ySo c56794ySo) {
        super(c56794ySo, yto, yMB.Application.zuWLRA);
        Intrinsics.checkNotNullParameter(yto, "");
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        this.gEmmrt = c56794ySo.EZpvd().KWHzl(new yRV(this));
    }

    @Override // o.yRL, o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<java.lang.Object>> OLrzqt() {
        return (java.util.Map) C59183zcI.AEQbTJ(this.gEmmrt, this, AYXKKw[0]);
    }

    public static final java.util.Map KWHzl(yRW yrw) {
        AbstractC56975yZg<?> abstractC56975yZgAEQbTJ;
        yTN ytnCopydefault = yrw.copydefault();
        if (ytnCopydefault instanceof yTL) {
            abstractC56975yZgAEQbTJ = yRR.copydefault.AEQbTJ(((yTL) yrw.copydefault()).KWHzl());
        } else {
            abstractC56975yZgAEQbTJ = ytnCopydefault instanceof yTV ? yRR.copydefault.AEQbTJ(C56402yEa.EZpvd(yrw.copydefault())) : null;
        }
        java.util.Map mapEZpvd = abstractC56975yZgAEQbTJ != null ? C56423yEv.EZpvd(C56390yDp.OLrzqt(yRM.KWHzl.KWHzl(), abstractC56975yZgAEQbTJ)) : null;
        return mapEZpvd == null ? C56424yEw.KWHzl() : mapEZpvd;
    }
}
