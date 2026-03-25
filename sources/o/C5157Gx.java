package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5157Gx implements InterfaceC5147Gn {
    public final InterfaceC60078zvA OLrzqt;

    public C5157Gx(@NotNull InterfaceC60078zvA interfaceC60078zvA) {
        Intrinsics.checkNotNullParameter(interfaceC60078zvA, "");
        this.OLrzqt = interfaceC60078zvA;
    }

    @Override // o.InterfaceC5147Gn
    public void KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        this.OLrzqt.EZpvd(th);
    }

    public static final java.lang.String EZpvd(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return (java.lang.String) function0.invoke();
    }

    @Override // o.InterfaceC5147Gn
    public void KWHzl(@NotNull final Function0<java.lang.String> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt.AEQbTJ(new java.util.function.Supplier() { // from class: o.Gy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                return C5157Gx.EZpvd(function0);
            }
        });
    }

    @Override // o.InterfaceC5147Gn
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        this.OLrzqt.AEQbTJ(str, obj);
    }

    @Override // o.InterfaceC5147Gn
    public void OLrzqt() {
        this.OLrzqt.EZpvd();
    }
}
