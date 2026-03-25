package o;

import com.okinc.business.defi.dapp.base.FragmentNavigator;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15148dyp {
    public static java.lang.Boolean valueOf;
    public static final C15148dyp copydefault = new C15148dyp();
    public static final ConcurrentHashMap<java.lang.String, WeakReference<androidx.fragment.app.FragmentManager>> EZpvd = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<java.lang.String, WeakReference<androidx.fragment.app.Fragment>> AEQbTJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<java.lang.String, java.lang.Integer> KWHzl = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<java.lang.String, java.lang.String> gEmmrt = new ConcurrentHashMap<>();
    public static final int OLrzqt = 8;

    private C15148dyp() {
    }

    public static /* synthetic */ void storeFragmentData$default(C15148dyp c15148dyp, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, androidx.fragment.app.Fragment fragment, java.lang.String str2, int i, java.lang.Object obj) {
        androidx.fragment.app.FragmentManager fragmentManager2 = (i & 2) != 0 ? null : fragmentManager;
        java.lang.Integer num2 = (i & 4) != 0 ? null : num;
        androidx.fragment.app.Fragment fragment2 = (i & 8) != 0 ? null : fragment;
        if ((i & 16) != 0) {
            str2 = "default";
        }
        c15148dyp.OLrzqt(str, fragmentManager2, num2, fragment2, str2);
    }

    public final void OLrzqt(@NotNull java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, java.lang.Integer num, androidx.fragment.app.Fragment fragment, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (fragmentManager != null) {
            EZpvd.put(str, new WeakReference<>(fragmentManager));
        }
        if (num != null) {
            KWHzl.put(str, num);
        }
        if (fragment != null) {
            AEQbTJ.put(str, new WeakReference<>(fragment));
        }
        if (str2 != null) {
            gEmmrt.put(str, str2);
        }
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt.get(str);
    }

    public final androidx.fragment.app.FragmentManager copydefault(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        androidx.fragment.app.FragmentManager childFragmentManager;
        androidx.fragment.app.Fragment fragment;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            WeakReference<androidx.fragment.app.FragmentManager> weakReference = EZpvd.get(str);
            if (weakReference == null || (childFragmentManager = weakReference.get()) == null) {
                WeakReference<androidx.fragment.app.Fragment> weakReference2 = AEQbTJ.get(str);
                childFragmentManager = (weakReference2 == null || (fragment = weakReference2.get()) == null) ? null : fragment.getChildFragmentManager();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(childFragmentManager);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (androidx.fragment.app.FragmentManager) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final java.lang.Integer AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl.get(str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dst.closeContainer$default(o.dst, com.okinc.business.defi.dapp.base.FragmentNavigator$Application, int, java.lang.Object):void */
    public final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, java.lang.String str) {
        java.lang.Object objValueOf;
        Intrinsics.checkNotNullParameter(fragment, "");
        try {
            Result.Application application = Result.Companion;
            WeakReference<androidx.fragment.app.Fragment> weakReference = AEQbTJ.get(str);
            if (weakReference != null && (weakReference.get() instanceof C14834dst)) {
                androidx.fragment.app.Fragment fragment2 = weakReference.get();
                Intrinsics.copydefault(fragment2, "");
                C14834dst.closeContainer$default((C14834dst) fragment2, null, 1, null);
                objValueOf = Unit.INSTANCE;
            } else {
                FragmentNavigator.StateListAnimator stateListAnimator = FragmentNavigator.Companion;
                androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                objValueOf = java.lang.Boolean.valueOf(FragmentNavigator.StateListAnimator.from$default(stateListAnimator, parentFragmentManager, null, 2, null).OLrzqt(fragment, new FragmentNavigator.Application(0, 0, 0, 0, false, true, null, null, false, false, 976, null)));
            }
            Result.m7377constructorimpl(objValueOf);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final boolean AEQbTJ() {
        java.lang.Boolean bool = valueOf;
        if (bool != null) {
            Intrinsics.copydefault(bool);
            return bool.booleanValue();
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_discover_tabbar_hidden", AmplitudeName.WEB3), (java.lang.Object) "true"));
        valueOf = boolValueOf;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
