package o;

import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33214msI extends InterfaceC33212msG {

    /* JADX INFO: renamed from: o.msI$TaskDescription */
    public static final class TaskDescription {
        public static void AEQbTJ(@NotNull InterfaceC33214msI interfaceC33214msI) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void KWHzl(@NotNull InterfaceC33214msI interfaceC33214msI, @NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public static boolean OLrzqt(@NotNull InterfaceC33214msI interfaceC33214msI) {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void copydefault(@NotNull InterfaceC33214msI interfaceC33214msI, @NotNull InterfaceC33218msM interfaceC33218msM) {
            Intrinsics.checkNotNullParameter(interfaceC33218msM, "");
        }
    }

    java.lang.String AEQbTJ();

    void AEQbTJ(@NotNull InterfaceC33218msM interfaceC33218msM);

    InterfaceC33217msL AYXKKw();

    androidx.fragment.app.Fragment EZpvd(android.content.Intent intent);

    void EZpvd(@NotNull NavigationBarView navigationBarView);

    boolean EZpvd();

    java.lang.String KWHzl();

    boolean KWHzl(android.content.Intent intent);

    java.lang.String OLrzqt();

    android.view.MenuItem copydefault(@NotNull NavigationBarView navigationBarView);

    InterfaceC33217msL copydefault();

    void copydefault(android.content.Intent intent);

    void copydefault(@NotNull android.view.View view);

    void copydefault(@NotNull InterfaceC33215msJ interfaceC33215msJ);

    void djBIcL();

    boolean gEmmrt();
}
