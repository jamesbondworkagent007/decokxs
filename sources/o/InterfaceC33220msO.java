package o;

import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33220msO extends InterfaceC43295rmb {

    /* JADX INFO: renamed from: o.msO$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC55083xdJ AEQbTJ(@NotNull InterfaceC33220msO interfaceC33220msO, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void EZpvd(@NotNull InterfaceC33220msO interfaceC33220msO, @NotNull android.content.Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull InterfaceC33220msO interfaceC33220msO, @NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            Intrinsics.checkNotNullParameter(menuItem, "");
        }
    }

    java.util.Set<java.lang.String> AEQbTJ();

    boolean AEQbTJ(@NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView, @NotNull android.os.Bundle bundle);

    java.lang.String AhwBna();

    NavigationBarView.OnItemSelectedListener EZpvd();

    InterfaceC55083xdJ EZpvd(@NotNull android.content.Context context);

    boolean KWHzl();

    NavigationBarView.OnItemReselectedListener OLrzqt();

    void OLrzqt(@NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem);

    android.view.MenuItem copydefault(@NotNull NavigationBarView navigationBarView);

    androidx.fragment.app.Fragment copydefault();

    void copydefault(@NotNull android.content.Intent intent);

    int djBIcL();
}
