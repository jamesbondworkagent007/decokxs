package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33062mpP {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Function2<RecyclerView.ViewHolder, java.lang.Integer, android.view.View> copydefault(RecyclerView.ViewHolder viewHolder) {
        return new Function2() { // from class: o.mpS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C33062mpP.copydefault((RecyclerView.ViewHolder) obj, ((java.lang.Integer) obj2).intValue());
            }
        };
    }

    public static final <V extends android.view.View> yIO<RecyclerView.ViewHolder, V> OLrzqt(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        return KWHzl(i, copydefault(viewHolder));
    }

    public static final Unit EZpvd(androidx.fragment.app.Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.fragment.app.Fragment createInstance$default(InterfaceC56551yJo interfaceC56551yJo, android.os.Bundle bundle, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: o.mpM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C33062mpP.EZpvd((androidx.fragment.app.Fragment) obj2, ((java.lang.Boolean) obj3).booleanValue());
                }
            };
        }
        return EZpvd(interfaceC56551yJo, bundle, function2);
    }

    public static final <T extends androidx.fragment.app.Fragment> androidx.fragment.app.Fragment EZpvd(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, android.os.Bundle bundle, @NotNull Function2<? super T, ? super java.lang.Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) yHE.OLrzqt(interfaceC56551yJo).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        if (bundle != null) {
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
        }
        Intrinsics.copydefault(fragment);
        function2.invoke(fragment, java.lang.Boolean.TRUE);
        return fragment;
    }

    public static final Unit AEQbTJ(androidx.fragment.app.Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.fragment.app.Fragment findOrAddFragment$default(InterfaceC56551yJo interfaceC56551yJo, androidx.fragment.app.FragmentManager fragmentManager, int i, android.os.Bundle bundle, Function2 function2, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i2 & 8) != 0) {
            function2 = new Function2() { // from class: o.mpN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C33062mpP.AEQbTJ((androidx.fragment.app.Fragment) obj2, ((java.lang.Boolean) obj3).booleanValue());
                }
            };
        }
        Function2 function22 = function2;
        if ((i2 & 16) != 0) {
            str = yHE.OLrzqt(interfaceC56551yJo).getSimpleName();
        }
        return EZpvd(interfaceC56551yJo, fragmentManager, i, bundle2, function22, str);
    }

    public static final <T extends androidx.fragment.app.Fragment> T EZpvd(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, android.os.Bundle bundle, @NotNull Function2<? super T, ? super java.lang.Boolean, Unit> function2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = (T) EZpvd(interfaceC56551yJo, bundle, function2);
            fragmentManager.beginTransaction().add(i, fragmentFindFragmentByTag, str).commitNowAllowingStateLoss();
        } else {
            function2.invoke(fragmentFindFragmentByTag, java.lang.Boolean.FALSE);
        }
        Intrinsics.copydefault(fragmentFindFragmentByTag, "");
        return (T) fragmentFindFragmentByTag;
    }

    public static /* synthetic */ androidx.fragment.app.Fragment findOrReplaceFragment$default(InterfaceC56551yJo interfaceC56551yJo, androidx.fragment.app.FragmentManager fragmentManager, int i, android.os.Bundle bundle, Function2 function2, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        android.os.Bundle bundle2 = bundle;
        if ((i2 & 8) != 0) {
            function2 = new Function2() { // from class: o.mpT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C33062mpP.valueOf((androidx.fragment.app.Fragment) obj2, ((java.lang.Boolean) obj3).booleanValue());
                }
            };
        }
        Function2 function22 = function2;
        if ((i2 & 16) != 0) {
            str = yHE.OLrzqt(interfaceC56551yJo).getSimpleName();
        }
        return OLrzqt(interfaceC56551yJo, fragmentManager, i, bundle2, function22, str);
    }

    public static final Unit valueOf(androidx.fragment.app.Fragment fragment, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return Unit.INSTANCE;
    }

    public static final <T extends androidx.fragment.app.Fragment> T OLrzqt(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, android.os.Bundle bundle, @NotNull Function2<? super T, ? super java.lang.Boolean, Unit> function2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = (T) EZpvd(interfaceC56551yJo, bundle, function2);
            fragmentManager.beginTransaction().replace(i, fragmentFindFragmentByTag, str).commitAllowingStateLoss();
        } else {
            function2.invoke(fragmentFindFragmentByTag, java.lang.Boolean.FALSE);
        }
        Intrinsics.copydefault(fragmentFindFragmentByTag, "");
        return (T) fragmentFindFragmentByTag;
    }

    public static /* synthetic */ androidx.fragment.app.Fragment ReplaceNewFragment$default(InterfaceC56551yJo interfaceC56551yJo, androidx.fragment.app.FragmentManager fragmentManager, int i, android.os.Bundle bundle, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        if ((i2 & 8) != 0) {
            str = yHE.OLrzqt(interfaceC56551yJo).getSimpleName();
        }
        return KWHzl(interfaceC56551yJo, fragmentManager, i, bundle, str);
    }

    public static final <T extends androidx.fragment.app.Fragment> T KWHzl(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, android.os.Bundle bundle, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        T t = (T) createInstance$default(interfaceC56551yJo, bundle, null, 2, null);
        fragmentManager.beginTransaction().replace(i, t, str).commitAllowingStateLoss();
        Intrinsics.copydefault(t, "");
        return t;
    }

    public static /* synthetic */ androidx.fragment.app.Fragment findFragment$default(InterfaceC56551yJo interfaceC56551yJo, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = yHE.OLrzqt(interfaceC56551yJo).getSimpleName();
        }
        return KWHzl(interfaceC56551yJo, fragmentManager, str);
    }

    public static final <T extends androidx.fragment.app.Fragment> T KWHzl(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        T t = (T) fragmentManager.findFragmentByTag(str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public static /* synthetic */ boolean removeFragmentIfExist$default(InterfaceC56551yJo interfaceC56551yJo, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = yHE.OLrzqt(interfaceC56551yJo).getSimpleName();
        }
        return copydefault(interfaceC56551yJo, fragmentManager, str);
    }

    public static final <T extends androidx.fragment.app.Fragment> boolean copydefault(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        androidx.fragment.app.Fragment fragmentKWHzl = KWHzl(interfaceC56551yJo, fragmentManager, str);
        if (fragmentKWHzl == null) {
            return false;
        }
        fragmentManager.beginTransaction().remove(fragmentKWHzl).commitAllowingStateLoss();
        return true;
    }

    public static final boolean copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(fragment.getTag());
        if (fragmentFindFragmentByTag == null) {
            return false;
        }
        fragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        return true;
    }

    public static /* synthetic */ void show$default(androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        copydefault(fragment, fragmentManager, z);
    }

    public static final void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionShow = fragmentManager.beginTransaction().show(fragment);
        if (z) {
            fragmentTransactionShow.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionShow.commitAllowingStateLoss();
        }
    }

    public static /* synthetic */ void hide$default(androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        EZpvd(fragment, fragmentManager, z);
    }

    public static final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionHide = fragmentManager.beginTransaction().hide(fragment);
        if (z) {
            fragmentTransactionHide.commitNowAllowingStateLoss();
        } else {
            fragmentTransactionHide.commitAllowingStateLoss();
        }
    }

    public static final void OLrzqt(android.app.Dialog dialog) {
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    public static final <T> T EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(cls, "");
        T t = (T) fragment.getParentFragment();
        T t2 = (T) fragment.getActivity();
        if (cls.isInstance(t)) {
            return t;
        }
        if (cls.isInstance(t2)) {
            return t2;
        }
        return null;
    }

    public static final android.view.View copydefault(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        return viewHolder.itemView.findViewById(i);
    }

    public static final java.lang.Void KWHzl(int i, yJA<?> yja) {
        throw new java.lang.IllegalStateException("View ID " + i + " for '" + yja.getName() + "' not found.");
    }

    public static final <T, V extends android.view.View> C33063mpQ<T, V> KWHzl(final int i, final Function2<? super T, ? super java.lang.Integer, ? extends android.view.View> function2) {
        return new C33063mpQ<>(new Function2() { // from class: o.mpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C33062mpP.EZpvd(function2, i, obj, (yJA) obj2);
            }
        });
    }

    public static final android.view.View EZpvd(Function2 function2, int i, java.lang.Object obj, yJA yja) {
        Intrinsics.checkNotNullParameter(yja, "");
        android.view.View view = (android.view.View) function2.invoke(obj, java.lang.Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        KWHzl(i, (yJA<?>) yja);
        throw new KotlinNothingValueException();
    }
}
