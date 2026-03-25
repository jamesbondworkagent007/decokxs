package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.amplitude.common.Logger;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.JT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225Jn extends FragmentManager.FragmentLifecycleCallbacks {
    public final Function2<java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> AEQbTJ;
    public final Logger EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5225Jn(@NotNull Function2<? super java.lang.String, ? super java.util.Map<java.lang.String, ? extends java.lang.Object>, Unit> function2, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.AEQbTJ = function2;
        this.EZpvd = logger;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentResumed(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull androidx.fragment.app.Fragment fragment) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object objM7377constructorimpl2;
        java.lang.String strAEQbTJ;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        super.onFragmentResumed(fragmentManager, fragment);
        java.lang.String canonicalName = fragment.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = fragment.getClass().getSimpleName();
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(fragment.getResources().getResourceEntryName(fragment.getId()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            this.EZpvd.EZpvd("Failed to get resource entry name: " + thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.String str = (java.lang.String) objM7377constructorimpl;
        try {
            Result.Application application3 = Result.Companion;
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                JT.Activity activity2 = JT.Companion;
                Intrinsics.checkNotNullExpressionValue(activity, "");
                strAEQbTJ = activity2.AEQbTJ(activity);
            } else {
                strAEQbTJ = null;
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl(strAEQbTJ);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            this.EZpvd.EZpvd("Failed to get screen name: " + thM7380exceptionOrNullimpl2);
        }
        this.AEQbTJ.invoke("[Amplitude] Fragment Viewed", C56424yEw.gEmmrt(C56390yDp.OLrzqt("[Amplitude] Fragment Class", canonicalName), C56390yDp.OLrzqt("[Amplitude] Fragment Identifier", str), C56390yDp.OLrzqt("[Amplitude] Screen Name", (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl2) ? null : objM7377constructorimpl2)), C56390yDp.OLrzqt("[Amplitude] Fragment Tag", fragment.getTag())));
    }
}
