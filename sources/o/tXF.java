package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tXF {
    public static final tXH AEQbTJ() {
        return new tXH();
    }

    public static final void AEQbTJ(@NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        InterfaceC56387yDm<? extends InterfaceC43234rlT> interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.tXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tXF.AEQbTJ();
            }
        });
        interfaceC43237rlW.copydefault(new tXE(DeeplinkMode.PRO), interfaceC56387yDmCopydefault);
        interfaceC43237rlW.copydefault(new tXE(DeeplinkMode.LITE), interfaceC56387yDmCopydefault);
    }
}
