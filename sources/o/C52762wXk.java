package o;

import com.airbnb.lottie.Lottie;
import com.airbnb.lottie.LottieConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52762wXk {
    public static boolean EZpvd;
    public static android.app.Application KWHzl;
    public static boolean copydefault;
    public static final C52762wXk AEQbTJ = new C52762wXk();
    public static int valueOf = C52761wXj.LoaderManager.iRxXKY;
    public static Function1<? super java.lang.String, java.lang.Boolean> djBIcL = new Function1() { // from class: o.wXn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(C52762wXk.OLrzqt((java.lang.String) obj));
        }
    };
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int KWHzl() {
        return valueOf;
    }

    public static final boolean OLrzqt(java.lang.String str) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean copydefault() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>, kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> */
    public final Function1<java.lang.String, java.lang.Boolean> EZpvd() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super java.lang.String, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        djBIcL = function1;
    }

    private C52762wXk() {
    }

    public static /* synthetic */ void init$default(android.app.Application application, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = C52761wXj.LoaderManager.iRxXKY;
        }
        KWHzl(application, z, i);
    }

    public static final void KWHzl(@NotNull android.app.Application application, boolean z, @androidx.annotation.StyleRes int i) {
        Intrinsics.checkNotNullParameter(application, "");
        KWHzl = application;
        EZpvd = z;
        application.setTheme(application.getApplicationInfo().theme);
        application.getTheme().applyStyle(C52761wXj.LoaderManager.fERRXa, true);
        C55328xhq.OLrzqt.KWHzl(application);
        application.getTheme().applyStyle(C33512mxp.AEQbTJ.values(), true);
    }

    public static final android.app.Application AEQbTJ() {
        android.app.Application application = KWHzl;
        if (application != null) {
            return application;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(@NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Lottie.initialize(new LottieConfig.Builder().setNetworkFetcher(new C55361xiW(okHttpClient)).build());
    }
}
