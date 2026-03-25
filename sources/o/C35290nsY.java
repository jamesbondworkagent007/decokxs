package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.ObserverSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35290nsY {
    public static final android.os.Bundle KWHzl(@NotNull java.util.ArrayList<GeneralAction> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("FRAGMENT_RESULT_KEY_ACTION", arrayList);
        return bundle;
    }

    public static final java.util.ArrayList<GeneralAction> EZpvd(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return BundleCompat.getParcelableArrayList(bundle, "FRAGMENT_RESULT_KEY_ACTION", GeneralAction.class);
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull GeneralAction generalAction) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(generalAction, "");
        copydefault(fragment, (java.util.List<? extends GeneralAction>) C56402yEa.EZpvd(generalAction));
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends GeneralAction> list) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        for (java.lang.String str : ObserverSource.Companion.EZpvd()) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.setFragmentResult(str, KWHzl(new java.util.ArrayList(list)));
            }
        }
    }

    public static final void KWHzl(@NotNull AppCompatActivity appCompatActivity, @NotNull GeneralAction generalAction) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(generalAction, "");
        KWHzl(appCompatActivity, (java.util.List<? extends GeneralAction>) C56402yEa.EZpvd(generalAction));
    }

    public static final void KWHzl(@NotNull AppCompatActivity appCompatActivity, @NotNull java.util.List<? extends GeneralAction> list) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<androidx.fragment.app.Fragment> fragments = appCompatActivity.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) CollectionsKt___CollectionsKt.firstOrNull(fragments);
        if (fragment != null) {
            copydefault(fragment, new java.util.ArrayList(list));
        }
    }

    public static final void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull ObserverSource observerSource, @NotNull final Function1<? super java.util.ArrayList<GeneralAction>, Unit> function1) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(observerSource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String strKWHzl = ObserverSource.Companion.KWHzl(observerSource);
        FragmentActivity activity = fragment.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.setFragmentResultListener(strKWHzl, fragment.getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nte
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C35290nsY.EZpvd(function1, str, bundle);
            }
        });
    }

    public static final void EZpvd(Function1 function1, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.ArrayList<GeneralAction> arrayListEZpvd = EZpvd(bundle);
        if (arrayListEZpvd != null) {
            function1.invoke(arrayListEZpvd);
        }
    }
}
