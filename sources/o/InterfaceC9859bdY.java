package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9859bdY extends InterfaceC43217rlC {
    AbstractC58185ywX<C9917bed> AhwBna(@NotNull java.lang.String str);

    C57567ykp KWHzl(boolean z);

    AbstractC58185ywX<java.util.List<C9922bei>> djBIcL(@NotNull java.lang.String str);

    AbstractC58185ywX<C9921beh> gEmmrt(@NotNull java.lang.String str);

    AbstractC58185ywX<C9860bdZ> i_(@NotNull java.lang.String str);

    AbstractC58185ywX<java.lang.Boolean> isConnected();

    C57567ykp values();

    /* JADX INFO: renamed from: o.bdY$Application */
    public static final class Application {
        public static /* synthetic */ C57567ykp walletPublicConnection$default(InterfaceC9859bdY interfaceC9859bdY, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walletPublicConnection");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return interfaceC9859bdY.KWHzl(z);
        }
    }
}
