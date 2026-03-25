package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class jSA {

    /* JADX INFO: loaded from: classes9.dex */
    public static final /* synthetic */ class ComponentCallbacks implements InterfaceC58227yxM {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58227yxM
        public final /* synthetic */ void accept(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    public static final /* synthetic */ class ContentResolver implements InterfaceC58227yxM {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC58227yxM
        public final /* synthetic */ void accept(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    public static /* synthetic */ void trackChildFragmentLifecycle$default(androidx.fragment.app.Fragment fragment, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        OLrzqt(fragment, z);
    }

    public static final <T extends androidx.fragment.app.Fragment> T copydefault(@NotNull T t, @NotNull Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(C6779aVn.copydefault(t));
        return t;
    }

    public static final <T extends androidx.fragment.app.Fragment> T EZpvd(@NotNull T t, @NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... pairArr) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        t.setArguments(BundleKt.bundleOf((kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length)));
        return t;
    }

    public static final androidx.fragment.app.Fragment AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.IdRes int i) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getChildFragmentManager().findFragmentById(i);
    }

    public static final void copydefault(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final java.lang.String str, @NotNull final Function2<? super java.lang.String, ? super android.os.Bundle, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        fragment.getChildFragmentManager().clearFragmentResultListener(str);
        fragment.getChildFragmentManager().setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: o.qpF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                jSA.copydefault(fragment, str, function2, str2, bundle);
            }
        });
    }

    public static final void copydefault(androidx.fragment.app.Fragment fragment, java.lang.String str, Function2 function2, java.lang.String str2, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        fragment.getParentFragmentManager().clearFragmentResultListener(str);
        function2.invoke(str2, bundle);
    }

    public static final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, @NotNull final Function2<? super java.lang.String, ? super android.os.Bundle, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        fragmentManager.clearFragmentResultListener(str);
        fragmentManager.setFragmentResultListener(str, fragment, new FragmentResultListener() { // from class: o.qpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str2, android.os.Bundle bundle) {
                jSA.KWHzl(fragmentManager, str, function2, str2, bundle);
            }
        });
    }

    public static final void KWHzl(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, Function2 function2, java.lang.String str2, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        fragmentManager.clearFragmentResultListener(str);
        function2.invoke(str2, bundle);
    }

    public static final void KWHzl(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.market.ext.FragmentExtKt$repeatExecuteTaskOnLifecycleResumed$$inlined$repeatOnLifecycleResume$1
            /* JADX WARN: Type inference failed for: r0v2, types: [T, kotlinx.coroutines.Job] */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                super.onResume(lifecycleOwner);
                Job job = (Job) objectRef.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                objectRef.element = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new FragmentExtKt$repeatExecuteTaskOnLifecycleResumed$1$1(function1, null), 3, null);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(LifecycleOwner lifecycleOwner) {
                Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                Job job = (Job) objectRef.element;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                objectRef.element = null;
                super.onPause(lifecycleOwner);
            }
        });
    }

    public static /* synthetic */ void checkVisibilityAndExecute$default(androidx.fragment.app.Fragment fragment, float f, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.5f;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function0, "");
        android.view.View view = fragment.getView();
        if (view != null && view.isShown() && view.isAttachedToWindow()) {
            if (view.getGlobalVisibleRect(new android.graphics.Rect()) && view.getHeight() > 0 && C33129mqd.copydefault(java.lang.Float.valueOf(r3.height() / view.getHeight()), java.lang.Float.valueOf(f))) {
                function0.invoke();
            }
        }
    }
}
