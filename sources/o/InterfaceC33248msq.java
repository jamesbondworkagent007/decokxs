package o;

import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33248msq {

    /* JADX INFO: renamed from: o.msq$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void AEQbTJ(@NotNull InterfaceC33248msq interfaceC33248msq, @NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            Intrinsics.checkNotNullParameter(menuItem, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void EZpvd(@NotNull InterfaceC33248msq interfaceC33248msq, @NotNull InterfaceC33252msu interfaceC33252msu) {
            Intrinsics.checkNotNullParameter(interfaceC33252msu, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC55083xdJ KWHzl(@NotNull InterfaceC33248msq interfaceC33248msq, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        public static void KWHzl(@NotNull InterfaceC33248msq interfaceC33248msq, android.content.Intent intent) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean copydefault(@NotNull InterfaceC33248msq interfaceC33248msq, @NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            Intrinsics.checkNotNullParameter(menuItem, "");
            return true;
        }
    }

    int AEQbTJ();

    androidx.fragment.app.Fragment AEQbTJ(android.content.Intent intent);

    void AEQbTJ(@NotNull NavigationBarView navigationBarView);

    void AEQbTJ(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem);

    void EZpvd(android.content.Intent intent);

    boolean EZpvd();

    int KWHzl();

    java.lang.String OLrzqt();

    void OLrzqt(@NotNull InterfaceC33252msu interfaceC33252msu);

    boolean OLrzqt(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem);

    int copydefault();

    InterfaceC55083xdJ copydefault(@NotNull android.content.Context context);

    boolean copydefault(android.content.Intent intent);

    int djBIcL();

    java.lang.String gEmmrt();
}
