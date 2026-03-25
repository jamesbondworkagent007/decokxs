package o;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.okinc.core.ok_app.homepage.TabViewModel;
import com.okinc.core.ok_app.homepage.pro.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C33160mrH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.muy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33362muy extends AbstractC33351mun implements InterfaceC33252msu {
    public final MainActivity AYXKKw;
    public final int AhwBna;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.muy$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC33351mun
    public int valueOf() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33362muy(@NotNull final MainActivity mainActivity) {
        super(mainActivity);
        Intrinsics.checkNotNullParameter(mainActivity, "");
        this.AYXKKw = mainActivity;
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(TabViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.core.ok_app.homepage.pro.PayMainActivityDelegate$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = mainActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.core.ok_app.homepage.pro.PayMainActivityDelegate$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = mainActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.core.ok_app.homepage.pro.PayMainActivityDelegate$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = mainActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.AhwBna = 5;
    }

    public final TabViewModel djBIcL() {
        return (TabViewModel) this.valueOf.getValue();
    }

    @Override // o.AbstractC33351mun
    public void AhwBna() {
        djBIcL().EZpvd(this);
        final java.util.List<InterfaceC33248msq> value = djBIcL().copydefault().getValue();
        if (value != null) {
            KWHzl(value);
        }
        djBIcL().copydefault().observe(this.AYXKKw, new Activity(new Function1() { // from class: o.muE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33362muy.KWHzl(value, this, (java.util.List) obj);
            }
        }));
        djBIcL().OLrzqt().observe(this.AYXKKw, new Activity(new Function1() { // from class: o.muD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33362muy.KWHzl(this.AEQbTJ, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit KWHzl(java.util.List list, final C33362muy c33362muy, final java.util.List list2) {
        if (Intrinsics.EZpvd(list, list2)) {
            return Unit.INSTANCE;
        }
        c33362muy.OLrzqt(new java.lang.Runnable() { // from class: o.muB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C33362muy.KWHzl(this.AEQbTJ, list2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C33362muy c33362muy, java.util.List list) {
        Intrinsics.copydefault(list);
        c33362muy.KWHzl((java.util.List<? extends InterfaceC33248msq>) list);
    }

    public static final Unit KWHzl(C33362muy c33362muy, java.lang.Integer num) {
        int iAEQbTJ = c33362muy.djBIcL().AEQbTJ();
        if (num != null && num.intValue() == iAEQbTJ) {
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(num);
        c33362muy.OLrzqt(num.intValue(), true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<? extends InterfaceC33248msq> list) {
        int i;
        gEmmrt();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC33248msq interfaceC33248msq = (InterfaceC33248msq) it.next();
            OLrzqt().getMenu().add(0, interfaceC33248msq.AEQbTJ(), 0, interfaceC33248msq.djBIcL());
        }
        for (InterfaceC33248msq interfaceC33248msq2 : list) {
            InterfaceC55083xdJ interfaceC55083xdJCopydefault = interfaceC33248msq2.copydefault(this.AYXKKw);
            if (interfaceC55083xdJCopydefault != null) {
                OLrzqt(interfaceC55083xdJCopydefault, interfaceC33248msq2.AEQbTJ());
            }
            final android.view.MenuItem menuItemFindItem = OLrzqt().getMenu().findItem(interfaceC33248msq2.AEQbTJ());
            if (interfaceC33248msq2.KWHzl() != 0) {
                final LottieDrawable lottieDrawable = new LottieDrawable();
                LottieCompositionFactory.fromRawRes(this.AYXKKw, interfaceC33248msq2.KWHzl()).addListener(new LottieListener() { // from class: o.muw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.airbnb.lottie.LottieListener
                    public final void onResult(java.lang.Object obj) {
                        C33362muy.AEQbTJ(lottieDrawable, menuItemFindItem, this, (LottieComposition) obj);
                    }
                }).addFailureListener(new LottieListener() { // from class: o.mux
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.airbnb.lottie.LottieListener
                    public final void onResult(java.lang.Object obj) {
                        C33362muy.KWHzl((java.lang.Throwable) obj);
                    }
                });
            } else if (interfaceC33248msq2.copydefault() != 0) {
                menuItemFindItem.setIcon(interfaceC33248msq2.copydefault());
            }
        }
        int size = OLrzqt().getMenu().size();
        for (i = 0; i < size; i++) {
            OLrzqt().findViewById(OLrzqt().getMenu().getItem(i).getItemId()).setOnLongClickListener(new View.OnLongClickListener() { // from class: o.muA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return C33362muy.AEQbTJ(view);
                }
            });
        }
        djBIcL().KWHzl(OLrzqt());
        AYXKKw();
    }

    public static final void AEQbTJ(LottieDrawable lottieDrawable, android.view.MenuItem menuItem, C33362muy c33362muy, LottieComposition lottieComposition) {
        lottieDrawable.setComposition(lottieComposition);
        menuItem.setIcon(lottieDrawable);
        TabViewModel tabViewModelDjBIcL = c33362muy.djBIcL();
        Intrinsics.copydefault(menuItem);
        if (tabViewModelDjBIcL.copydefault(menuItem)) {
            lottieDrawable.playAnimation();
        }
    }

    public static final void KWHzl(java.lang.Throwable th) {
        C43296rmc.copydefault("Lottie", "Failed to load animation", th);
    }

    public final void AYXKKw() {
        OLrzqt().setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: o.muz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(android.view.MenuItem menuItem) {
                return C33362muy.OLrzqt(this.KWHzl, menuItem);
            }
        });
        OLrzqt().setOnItemReselectedListener(null);
    }

    public static final boolean OLrzqt(C33362muy c33362muy, android.view.MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "");
        c33362muy.EZpvd();
        if (c33362muy.djBIcL().copydefault(menuItem)) {
            return false;
        }
        try {
            boolean zEZpvd = c33362muy.djBIcL().EZpvd(c33362muy.OLrzqt(), menuItem);
            if (zEZpvd) {
                c33362muy.AEQbTJ(c33362muy.djBIcL().AEQbTJ(), menuItem.getItemId());
            }
            return zEZpvd;
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception("currentItemIndex : " + ((java.lang.Object) menuItem.getTitle()), e));
            return true;
        }
    }

    @Override // o.AbstractC33351mun
    public void OLrzqt(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        djBIcL().AEQbTJ(intent);
        if (KWHzl(intent) == null) {
            OLrzqt(djBIcL().KWHzl());
            android.view.MenuItem menuItemFindItem = OLrzqt().getMenu().findItem(djBIcL().AEQbTJ());
            android.graphics.drawable.Drawable icon = menuItemFindItem.getIcon();
            if (icon instanceof LottieDrawable) {
                ((LottieDrawable) icon).setProgress(1.0f);
            }
            Intrinsics.checkNotNullExpressionValue(menuItemFindItem.setChecked(true), "");
        }
    }

    public final InterfaceC33248msq KWHzl(android.content.Intent intent) {
        InterfaceC33248msq interfaceC33248msqEZpvd = djBIcL().EZpvd(intent);
        if (interfaceC33248msqEZpvd == null) {
            return null;
        }
        OLrzqt(interfaceC33248msqEZpvd.AEQbTJ(), true);
        intent.removeExtra("path");
        return interfaceC33248msqEZpvd;
    }

    @Override // o.AbstractC33351mun
    public void AEQbTJ(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        djBIcL().AEQbTJ(intent);
        KWHzl(intent);
    }

    public final void OLrzqt(InterfaceC55083xdJ interfaceC55083xdJ, int i) {
        OLrzqt().setFloatingActionView(interfaceC55083xdJ, i);
    }

    public final void AEQbTJ(int i, int i2) {
        if (i != 0) {
            android.view.MenuItem menuItemFindItem = OLrzqt().getMenu().findItem(i);
            TabViewModel tabViewModelDjBIcL = djBIcL();
            C55089xdP c55089xdPOLrzqt = OLrzqt();
            Intrinsics.copydefault(menuItemFindItem);
            tabViewModelDjBIcL.copydefault(c55089xdPOLrzqt, menuItemFindItem);
            android.graphics.drawable.Drawable icon = menuItemFindItem.getIcon();
            if (icon != null && (icon instanceof LottieDrawable)) {
                LottieDrawable lottieDrawable = (LottieDrawable) icon;
                lottieDrawable.setSpeed(-1.0f);
                lottieDrawable.playAnimation();
            }
        }
        android.graphics.drawable.Drawable icon2 = OLrzqt().getMenu().findItem(i2).getIcon();
        if (icon2 != null && (icon2 instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) icon2;
            lottieDrawable2.setSpeed(1.0f);
            lottieDrawable2.playAnimation();
        }
        djBIcL().OLrzqt(i2);
        OLrzqt(djBIcL().AEQbTJ(i2));
    }

    public final void OLrzqt(InterfaceC33248msq interfaceC33248msq) {
        java.lang.String strGEmmrt = interfaceC33248msq.gEmmrt();
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = AEQbTJ().findFragmentByTag(strGEmmrt);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = interfaceC33248msq.AEQbTJ(copydefault());
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = AEQbTJ().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = AEQbTJ().findFragmentByTag(KWHzl());
        if (Intrinsics.EZpvd(fragmentFindFragmentByTag2, fragmentFindFragmentByTag)) {
            return;
        }
        if (fragmentFindFragmentByTag2 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentFindFragmentByTag2, Lifecycle.State.STARTED).hide(fragmentFindFragmentByTag2);
        }
        if (!fragmentFindFragmentByTag.isAdded()) {
            fragmentTransactionBeginTransaction.add(C33160mrH.StateListAnimator.fJNWhG, fragmentFindFragmentByTag, strGEmmrt);
        } else {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag).setMaxLifecycle(fragmentFindFragmentByTag, Lifecycle.State.RESUMED);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        AEQbTJ(strGEmmrt);
    }

    @Override // o.InterfaceC33252msu
    public boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC33248msq interfaceC33248msqCopydefault = djBIcL().copydefault(str);
        if (interfaceC33248msqCopydefault != null) {
            return trySetSelectedMenuItem$default(this, interfaceC33248msqCopydefault.AEQbTJ(), false, 2, null);
        }
        return false;
    }

    public static /* synthetic */ boolean trySetSelectedMenuItem$default(C33362muy c33362muy, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return c33362muy.OLrzqt(i, z);
    }

    public final boolean OLrzqt(int i, boolean z) {
        OLrzqt().setSelectedItemId(i);
        if (z) {
            android.view.MenuItem menuItemFindItem = OLrzqt().getMenu().findItem(djBIcL().AEQbTJ());
            android.graphics.drawable.Drawable icon = menuItemFindItem.getIcon();
            if (icon instanceof LottieDrawable) {
                ((LottieDrawable) icon).setProgress(1.0f);
            }
            menuItemFindItem.setChecked(true);
        }
        return true;
    }
}
