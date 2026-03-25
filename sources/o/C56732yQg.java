package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56888yWa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56732yQg implements InterfaceC56888yWa {
    public final C59122zbA EZpvd;
    public final java.lang.ClassLoader copydefault;

    public C56732yQg(@NotNull java.lang.ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        this.copydefault = classLoader;
        this.EZpvd = new C59122zbA();
    }

    public final InterfaceC56888yWa.Application OLrzqt(java.lang.String str) {
        C56726yQa c56726yQaOLrzqt;
        java.lang.Class<?> clsAEQbTJ = C56728yQc.AEQbTJ(this.copydefault, str);
        if (clsAEQbTJ == null || (c56726yQaOLrzqt = C56726yQa.KWHzl.OLrzqt(clsAEQbTJ)) == null) {
            return null;
        }
        return new InterfaceC56888yWa.Application.TaskDescription(c56726yQaOLrzqt, null, 2, null);
    }

    @Override // o.InterfaceC56888yWa
    public InterfaceC56888yWa.Application copydefault(@NotNull C56929yXo c56929yXo, @NotNull C56921yXg c56921yXg) {
        Intrinsics.checkNotNullParameter(c56929yXo, "");
        Intrinsics.checkNotNullParameter(c56921yXg, "");
        return OLrzqt(C56733yQh.AEQbTJ(c56929yXo));
    }

    @Override // o.InterfaceC56888yWa
    public InterfaceC56888yWa.Application EZpvd(@NotNull yTT ytt, @NotNull C56921yXg c56921yXg) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(ytt, "");
        Intrinsics.checkNotNullParameter(c56921yXg, "");
        C56933yXs c56933yXsValueOf = ytt.valueOf();
        if (c56933yXsValueOf == null || (strKWHzl = c56933yXsValueOf.KWHzl()) == null) {
            return null;
        }
        return OLrzqt(strKWHzl);
    }

    @Override // o.InterfaceC59150zbc
    public java.io.InputStream copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        if (c56933yXs.OLrzqt(yMB.EZpvd)) {
            return this.EZpvd.EZpvd(C59125zbD.fARcdN.AEQbTJ(c56933yXs));
        }
        return null;
    }
}
