package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5933aFn {
    public static final C5934aFo AEQbTJ() {
        return new C5934aFo();
    }

    public static final void copydefault(@NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.aFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5933aFn.AEQbTJ();
            }
        });
        interfaceC43237rlW.copydefault(new C5940aFu(DeeplinkMode.PRO), interfaceC56387yDmCopydefault);
        interfaceC43237rlW.copydefault(new C5940aFu(DeeplinkMode.LITE), interfaceC56387yDmCopydefault);
    }
}
