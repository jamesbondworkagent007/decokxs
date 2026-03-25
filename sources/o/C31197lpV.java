package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lpV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31197lpV {
    public static final C31197lpV EZpvd = new C31197lpV();

    private C31197lpV() {
    }

    /* JADX INFO: renamed from: o.lpV$Application */
    public static final class Application implements Function1<androidx.fragment.app.Fragment, androidx.fragment.app.Fragment> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.Fragment invoke(androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "");
            return fragment.getParentFragment();
        }
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, @NotNull java.lang.String str, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
        androidx.fragment.app.Fragment fragmentInvoke;
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (fragmentManager.findFragmentByTag(str) == null && (fragmentInvoke = function0.invoke()) != null) {
            fragmentManager.beginTransaction().replace(i, fragmentInvoke, str).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.lpV$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ Function1<androidx.fragment.app.Fragment, java.lang.Boolean> AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX INFO: renamed from: o.lpV$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1 implements Function1<androidx.fragment.app.Fragment, androidx.fragment.app.Fragment> {
            public static final AnonymousClass1 EZpvd = new AnonymousClass1();

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final androidx.fragment.app.Fragment invoke(androidx.fragment.app.Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "");
                return fragment.getParentFragment();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            Sequence sequenceEZpvd = C59405zgS.EZpvd(this.copydefault, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) AnonymousClass1.EZpvd));
            Function1<androidx.fragment.app.Fragment, java.lang.Boolean> function1 = this.AEQbTJ;
            java.util.Iterator it = sequenceEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (function1.invoke((androidx.fragment.app.Fragment) next).booleanValue()) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            java.lang.Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.copydefault.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    /* JADX INFO: renamed from: o.lpV$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ Function1<androidx.fragment.app.Fragment, java.lang.Boolean> AEQbTJ;
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX INFO: renamed from: o.lpV$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1 implements Function1<androidx.fragment.app.Fragment, androidx.fragment.app.Fragment> {
            public static final AnonymousClass1 KWHzl = new AnonymousClass1();

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final androidx.fragment.app.Fragment invoke(androidx.fragment.app.Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "");
                return fragment.getParentFragment();
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            Sequence sequenceEZpvd = C59405zgS.EZpvd(this.EZpvd, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) AnonymousClass1.KWHzl));
            Function1<androidx.fragment.app.Fragment, java.lang.Boolean> function1 = this.AEQbTJ;
            java.util.Iterator it = sequenceEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (function1.invoke((androidx.fragment.app.Fragment) next).booleanValue()) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.market.common.DexFragmentNavigator.Activity.copy$default(com.okinc.business.dex.market.common.DexFragmentNavigator$Activity, int, int, int, int, boolean, boolean, com.okinc.business.dex.market.common.DexFragmentNavigator$TransactionMode, java.util.List, int, java.lang.Object):com.okinc.business.dex.market.common.DexFragmentNavigator$Activity */
    public final DexFragmentNavigator.Activity OLrzqt(@NotNull DexFragmentNavigator.Activity activity, @NotNull android.view.View view, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(str, "");
        return activity.EZpvd((127 & 1) != 0 ? activity.KWHzl : 0, (127 & 2) != 0 ? activity.OLrzqt : 0, (127 & 4) != 0 ? activity.AhwBna : 0, (127 & 8) != 0 ? activity.gEmmrt : 0, (127 & 16) != 0 ? activity.copydefault : false, (127 & 32) != 0 ? activity.AEQbTJ : false, (127 & 64) != 0 ? activity.EZpvd : null, (127 & 128) != 0 ? activity.valueOf : CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends kotlin.Pair>) activity.AhwBna(), C56390yDp.OLrzqt(view, str)));
    }
}
