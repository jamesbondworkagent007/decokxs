package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Eu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5102Eu<T> implements InterfaceC5103Ev {
    public final Function2<InterfaceC5106Ey, T, Unit> AEQbTJ;
    public final T KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Eu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C5102Eu copy$default(C5102Eu c5102Eu, java.lang.Object obj, Function2 function2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = c5102Eu.KWHzl;
        }
        if ((i & 2) != 0) {
            function2 = c5102Eu.AEQbTJ;
        }
        return c5102Eu.EZpvd(obj, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5102Eu<T> EZpvd(T t, @NotNull Function2<? super InterfaceC5106Ey, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return new C5102Eu<>(t, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5102Eu)) {
            return false;
        }
        C5102Eu c5102Eu = (C5102Eu) obj;
        return Intrinsics.EZpvd(this.KWHzl, c5102Eu.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c5102Eu.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        T t = this.KWHzl;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SdkSerializableLambda(input=" + this.KWHzl + ", serializeFn=" + this.AEQbTJ + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super o.Ey, ? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5102Eu(T t, @NotNull Function2<? super InterfaceC5106Ey, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = t;
        this.AEQbTJ = function2;
    }

    @Override // o.InterfaceC5103Ev
    public void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        this.AEQbTJ.invoke(interfaceC5106Ey, this.KWHzl);
    }
}
