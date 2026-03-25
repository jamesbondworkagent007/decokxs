package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.yML;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56902yWo {
    public static final <T> T OLrzqt(@NotNull yVY<T> yvy, @NotNull T t, boolean z) {
        Intrinsics.checkNotNullParameter(yvy, "");
        Intrinsics.checkNotNullParameter(t, "");
        return z ? yvy.KWHzl(t) : t;
    }

    public static final <T> T copydefault(@NotNull InterfaceC59324zer interfaceC59324zer, @NotNull InterfaceC59382zfw interfaceC59382zfw, @NotNull yVY<T> yvy, @NotNull C56900yWm c56900yWm) {
        Intrinsics.checkNotNullParameter(interfaceC59324zer, "");
        Intrinsics.checkNotNullParameter(interfaceC59382zfw, "");
        Intrinsics.checkNotNullParameter(yvy, "");
        Intrinsics.checkNotNullParameter(c56900yWm, "");
        InterfaceC59385zfz interfaceC59385zfzIwGUEr = interfaceC59324zer.iwGUEr(interfaceC59382zfw);
        if (!interfaceC59324zer.valueOf(interfaceC59385zfzIwGUEr)) {
            return null;
        }
        PrimitiveType primitiveTypeAEQbTJ = interfaceC59324zer.AEQbTJ(interfaceC59385zfzIwGUEr);
        if (primitiveTypeAEQbTJ != null) {
            return (T) OLrzqt(yvy, yvy.OLrzqt(primitiveTypeAEQbTJ), interfaceC59324zer.fIwbmz(interfaceC59382zfw) || yVE.EZpvd(interfaceC59324zer, interfaceC59382zfw));
        }
        PrimitiveType primitiveTypeOLrzqt = interfaceC59324zer.OLrzqt(interfaceC59385zfzIwGUEr);
        if (primitiveTypeOLrzqt != null) {
            return yvy.KWHzl(AbstractJsonLexerKt.BEGIN_LIST + JvmPrimitiveType.get(primitiveTypeOLrzqt).getDesc());
        }
        if (interfaceC59324zer.fetchVPNInfo(interfaceC59385zfzIwGUEr)) {
            C56930yXp c56930yXpKWHzl = interfaceC59324zer.KWHzl(interfaceC59385zfzIwGUEr);
            C56929yXo c56929yXoAEQbTJ = c56930yXpKWHzl != null ? yML.OLrzqt.AEQbTJ(c56930yXpKWHzl) : null;
            if (c56929yXoAEQbTJ != null) {
                if (!c56900yWm.KWHzl()) {
                    java.util.List<yML.Activity> listKWHzl = yML.OLrzqt.KWHzl();
                    if (!(listKWHzl instanceof java.util.Collection) || !listKWHzl.isEmpty()) {
                        java.util.Iterator<T> it = listKWHzl.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.EZpvd(((yML.Activity) it.next()).KWHzl(), c56929yXoAEQbTJ)) {
                                return null;
                            }
                        }
                    }
                }
                java.lang.String strOLrzqt = yZQ.OLrzqt(c56929yXoAEQbTJ);
                Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                return yvy.copydefault(strOLrzqt);
            }
        }
        return null;
    }
}
