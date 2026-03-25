package o;

import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33248msq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mst, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC33251mst extends InterfaceC33248msq, InterfaceC43295rmb {

    /* JADX INFO: renamed from: o.mst$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public static boolean EZpvd(@NotNull InterfaceC33251mst interfaceC33251mst, @NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            Intrinsics.checkNotNullParameter(menuItem, "");
            return InterfaceC33248msq.TaskDescription.copydefault(interfaceC33251mst, navigationBarView, menuItem);
        }

        public static InterfaceC55083xdJ KWHzl(@NotNull InterfaceC33251mst interfaceC33251mst, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return InterfaceC33248msq.TaskDescription.KWHzl(interfaceC33251mst, context);
        }

        public static void KWHzl(@NotNull InterfaceC33251mst interfaceC33251mst, android.content.Intent intent) {
            InterfaceC33248msq.TaskDescription.KWHzl(interfaceC33251mst, intent);
        }

        public static void KWHzl(@NotNull InterfaceC33251mst interfaceC33251mst, @NotNull NavigationBarView navigationBarView, @NotNull android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            Intrinsics.checkNotNullParameter(menuItem, "");
            InterfaceC33248msq.TaskDescription.AEQbTJ(interfaceC33251mst, navigationBarView, menuItem);
        }

        public static void KWHzl(@NotNull InterfaceC33251mst interfaceC33251mst, @NotNull InterfaceC33252msu interfaceC33252msu) {
            Intrinsics.checkNotNullParameter(interfaceC33252msu, "");
            InterfaceC33248msq.TaskDescription.EZpvd(interfaceC33251mst, interfaceC33252msu);
        }
    }
}
