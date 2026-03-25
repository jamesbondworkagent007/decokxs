package o;

import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC18198fdq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18204fdw extends InterfaceC18198fdq {

    /* JADX INFO: renamed from: o.fdw$Activity */
    public static final class Activity {
        public static java.lang.String AEQbTJ(@NotNull InterfaceC18204fdw interfaceC18204fdw) {
            return InterfaceC18198fdq.ActionBar.copydefault(interfaceC18204fdw);
        }

        public static void EZpvd(@NotNull InterfaceC18204fdw interfaceC18204fdw, @NotNull LottieDrawable lottieDrawable, boolean z) {
            Intrinsics.checkNotNullParameter(lottieDrawable, "");
            InterfaceC18198fdq.ActionBar.copydefault(interfaceC18204fdw, lottieDrawable, z);
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC18204fdw interfaceC18204fdw) {
            return InterfaceC18198fdq.ActionBar.AEQbTJ(interfaceC18204fdw);
        }

        public static LottieDrawable OLrzqt(@NotNull InterfaceC18204fdw interfaceC18204fdw, @NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            return InterfaceC18198fdq.ActionBar.OLrzqt(interfaceC18204fdw, str, navigationBarView);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC18204fdw interfaceC18204fdw) {
            return InterfaceC18198fdq.ActionBar.EZpvd(interfaceC18204fdw);
        }

        public static java.lang.String copydefault(@NotNull InterfaceC18204fdw interfaceC18204fdw) {
            return InterfaceC18198fdq.ActionBar.OLrzqt(interfaceC18204fdw);
        }
    }
}
