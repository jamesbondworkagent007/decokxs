package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9919bef extends C43265rly {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public int getPriority() {
        return 250;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43265rly
    public void onInit(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final C9693baR OLrzqt() {
        return new C9693baR();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        interfaceC43253rlm.EZpvd(InterfaceC54843xXj.class, C56392yDr.copydefault(new Function0() { // from class: o.beg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9919bef.OLrzqt();
            }
        }));
        interfaceC43253rlm.EZpvd(InterfaceC13652dTg.class, C56392yDr.copydefault(new Function0() { // from class: o.bee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9919bef.KWHzl();
            }
        }));
    }

    public static final C9696baU KWHzl() {
        return new C9696baU();
    }
}
