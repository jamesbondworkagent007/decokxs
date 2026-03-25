package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48832udC extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(InterfaceC47310tnd.class, C56392yDr.copydefault(new Function0() { // from class: o.udK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48832udC.KWHzl();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC46984thV.class, C56392yDr.copydefault(new Function0() { // from class: o.udG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48832udC.copydefault();
            }
        }));
    }

    public static final C60164zxa KWHzl() {
        return new C60164zxa();
    }

    public static final C48831udB copydefault() {
        return new C48831udB();
    }
}
