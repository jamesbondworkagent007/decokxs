package o;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieResult;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18198fdq extends InterfaceC43295rmb {
    boolean AEQbTJ(@NotNull android.content.Context context);

    int AYXKKw();

    java.lang.String AhwBna();

    java.lang.String AkhnZx();

    android.view.MenuItem EZpvd(@NotNull NavigationBarView navigationBarView);

    androidx.fragment.app.Fragment KWHzl(boolean z);

    java.lang.String KWHzl();

    void copydefault(@NotNull android.view.MenuItem menuItem, @NotNull NavigationBarView navigationBarView, boolean z);

    boolean copydefault();

    java.lang.String djBIcL();

    int fetchVPNInfo();

    NavigationBarView.OnItemSelectedListener gEmmrt();

    java.lang.String isConnected();

    NavigationBarView.OnItemSelectedListener valueOf();

    /* JADX INFO: renamed from: o.fdq$ActionBar */
    public static final class ActionBar {
        public static java.lang.String AEQbTJ(@NotNull InterfaceC18198fdq interfaceC18198fdq) {
            return null;
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC18198fdq interfaceC18198fdq) {
            return null;
        }

        public static boolean KWHzl(@NotNull InterfaceC18198fdq interfaceC18198fdq) {
            return true;
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC18198fdq interfaceC18198fdq) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean OLrzqt(@NotNull InterfaceC18198fdq interfaceC18198fdq, @NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return true;
        }

        public static java.lang.String copydefault(@NotNull InterfaceC18198fdq interfaceC18198fdq) {
            return null;
        }

        public static LottieDrawable OLrzqt(@NotNull InterfaceC18198fdq interfaceC18198fdq, @NotNull java.lang.String str, @NotNull NavigationBarView navigationBarView) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(navigationBarView, "");
            LottieDrawable lottieDrawable = new LottieDrawable();
            LottieResult<LottieComposition> lottieResultFromAssetSync = LottieCompositionFactory.fromAssetSync(navigationBarView.getContext().getApplicationContext(), str);
            lottieDrawable.setCallback(navigationBarView);
            lottieDrawable.setComposition(lottieResultFromAssetSync.getValue());
            return lottieDrawable;
        }

        public static void copydefault(@NotNull InterfaceC18198fdq interfaceC18198fdq, @NotNull LottieDrawable lottieDrawable, boolean z) {
            Intrinsics.checkNotNullParameter(lottieDrawable, "");
            lottieDrawable.setSpeed(z ? -1.0f : 1.0f);
            lottieDrawable.playAnimation();
        }
    }
}
