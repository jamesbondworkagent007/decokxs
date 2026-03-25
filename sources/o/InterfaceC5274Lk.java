package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5274Lk {
    void AEQbTJ(@NotNull C5269Lf c5269Lf, @NotNull java.lang.Object obj, @NotNull java.lang.String str);

    void AEQbTJ(@NotNull C5270Lg c5270Lg, @NotNull java.lang.Object obj, @NotNull java.lang.String str);

    void AEQbTJ(@NotNull C5273Lj c5273Lj, @NotNull java.lang.Object obj, @NotNull java.lang.String str);

    void OLrzqt(@NotNull C5271Lh c5271Lh, @NotNull java.lang.Object obj, @NotNull java.lang.String str);

    void OLrzqt(@NotNull C5275Ll c5275Ll, @NotNull java.lang.Object obj, @NotNull java.lang.String str);

    void copydefault(@NotNull C5267Ld c5267Ld, @NotNull java.lang.Object obj, @NotNull java.lang.String str);

    default void AEQbTJ(@NotNull InterfaceC5268Le interfaceC5268Le, @NotNull java.lang.Object obj, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC5268Le, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC5268Le instanceof C5271Lh) {
            OLrzqt((C5271Lh) interfaceC5268Le, obj, str);
            return;
        }
        if (interfaceC5268Le instanceof C5267Ld) {
            copydefault((C5267Ld) interfaceC5268Le, obj, str);
            return;
        }
        if (interfaceC5268Le instanceof C5273Lj) {
            AEQbTJ((C5273Lj) interfaceC5268Le, obj, str);
            return;
        }
        if (interfaceC5268Le instanceof C5275Ll) {
            OLrzqt((C5275Ll) interfaceC5268Le, obj, str);
        } else if (interfaceC5268Le instanceof C5270Lg) {
            AEQbTJ((C5270Lg) interfaceC5268Le, obj, str);
        } else {
            AEQbTJ((C5269Lf) interfaceC5268Le, obj, str);
        }
    }
}
