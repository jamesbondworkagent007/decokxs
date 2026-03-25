package o;

import android.view.KeyEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.kline.data.KLineTechPic;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pvP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39598pvP extends wXX {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public java.util.ArrayList<C39601pvS> OLrzqt;
    public oPI copydefault;

    @Override // o.wXX
    public float getHeightScale() {
        return 0.75f;
    }

    public C39598pvP() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.setting.KlineTeachPageDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.setting.KlineTeachPageDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.setting.KlineTeachPageDialog$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.setting.KlineTeachPageDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.setting.KlineTeachPageDialog$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.OLrzqt = new java.util.ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pCW copydefault() {
        return (pCW) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.pvP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pvP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C39598pvP OLrzqt() {
            return new C39598pvP();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        oPI opiOLrzqt = oPI.OLrzqt(android.view.LayoutInflater.from(getContext()));
        this.copydefault = opiOLrzqt;
        if (opiOLrzqt == null) {
            Intrinsics.gEmmrt("");
            opiOLrzqt = null;
        }
        constraintLayout.addView(opiOLrzqt.getRoot());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
        oPI opi = this.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        opi.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.pvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39598pvP.copydefault(this.AEQbTJ, view2);
            }
        });
        oPI opi3 = this.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
            opi3 = null;
        }
        opi3.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39598pvP.KWHzl(this.copydefault, view2);
            }
        });
        oPI opi4 = this.copydefault;
        if (opi4 == null) {
            Intrinsics.gEmmrt("");
            opi4 = null;
        }
        opi4.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.pvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39598pvP.gEmmrt(this.OLrzqt, view2);
            }
        });
        oPI opi5 = this.copydefault;
        if (opi5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi5;
        }
        opi2.OLrzqt.setCurrentItem(0, false);
        copydefault().OLrzqt().values().put("isRunningInVirtualEnvironment", "kline_teach");
    }

    public static final void copydefault(C39598pvP c39598pvP, android.view.View view) {
        c39598pvP.dismissAllowingStateLoss();
    }

    public static final void KWHzl(C39598pvP c39598pvP, android.view.View view) {
        oPI opi = c39598pvP.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        ViewPager viewPager = opi.OLrzqt;
        oPI opi3 = c39598pvP.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi3;
        }
        viewPager.setCurrentItem(opi2.OLrzqt.getCurrentItem() - 1);
    }

    public static final void gEmmrt(C39598pvP c39598pvP, android.view.View view) {
        oPI opi = c39598pvP.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        if (opi.OLrzqt.getCurrentItem() == c39598pvP.OLrzqt.size() - 1) {
            c39598pvP.dismissAllowingStateLoss();
            return;
        }
        oPI opi3 = c39598pvP.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
            opi3 = null;
        }
        ViewPager viewPager = opi3.OLrzqt;
        oPI opi4 = c39598pvP.copydefault;
        if (opi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi4;
        }
        viewPager.setCurrentItem(opi2.OLrzqt.getCurrentItem() + 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C39215poB.OLrzqt.copydefault(copydefault().OLrzqt());
    }

    private final void KWHzl() {
        oPI opi = this.copydefault;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        ViewPager viewPager = opi.OLrzqt;
        viewPager.setOffscreenPageLimit(this.OLrzqt.size());
        viewPager.setAdapter(new Activity(this, this.OLrzqt));
        viewPager.addOnPageChangeListener(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.pvP$StateListAnimator */
    public static final class StateListAnimator implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public StateListAnimator() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            java.lang.String string;
            oPI opi = C39598pvP.this.copydefault;
            oPI opi2 = null;
            if (opi == null) {
                Intrinsics.gEmmrt("");
                opi = null;
            }
            opi.KWHzl.setVisibility(i == 0 ? 8 : 0);
            oPI opi3 = C39598pvP.this.copydefault;
            if (opi3 == null) {
                Intrinsics.gEmmrt("");
                opi3 = null;
            }
            C52794wYp c52794wYp = opi3.gEmmrt;
            C39598pvP c39598pvP = C39598pvP.this;
            if (i == c39598pvP.OLrzqt.size() - 1) {
                string = C33070mpX.AYXKKw(C35964oKf.Fragment.gHZMYf);
            } else {
                string = c39598pvP.getString(C35964oKf.Fragment.AxsJAY);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            c52794wYp.setText(string);
            pCW pcwCopydefault = C39598pvP.this.copydefault();
            oPI opi4 = C39598pvP.this.copydefault;
            if (opi4 == null) {
                Intrinsics.gEmmrt("");
                opi4 = null;
            }
            pcwCopydefault.KWHzl(i > opi4.copydefault.OLrzqt() ? "renderTime" : "start_mode");
            oPI opi5 = C39598pvP.this.copydefault;
            if (opi5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                opi2 = opi5;
            }
            opi2.copydefault.setCurrentIndex(i);
            java.util.HashMap<java.lang.String, java.lang.String> mapValues = C39598pvP.this.copydefault().OLrzqt().values();
            if (C33129mqd.AhwBna(mapValues.get("activity_render")) < C39598pvP.this.OLrzqt.size()) {
                mapValues.put("activity_render", java.lang.String.valueOf(i + 1));
            }
        }
    }

    /* JADX INFO: renamed from: o.pvP$Activity */
    public final class Activity extends AbstractC33000moG {
        public final /* synthetic */ C39598pvP OLrzqt;
        public java.util.ArrayList<C39601pvS> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return "";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C39598pvP c39598pvP, java.util.ArrayList<C39601pvS> arrayList) {
            super(c39598pvP.getChildFragmentManager());
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.OLrzqt = c39598pvP;
            this.copydefault = arrayList;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.copydefault.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            C39601pvS c39601pvS = this.copydefault.get(i);
            Intrinsics.checkNotNullExpressionValue(c39601pvS, "");
            return c39601pvS;
        }

        @Override // o.AbstractC33000moG, androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@androidx.annotation.NonNull @NotNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            super.setPrimaryItem(viewGroup, i, obj);
            C39601pvS c39601pvS = (C39601pvS) obj;
            if (c39601pvS.getView() != null) {
                int count = getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    KeyEvent.Callback childAt = viewGroup.getChildAt(i2);
                    NestedScrollingChild nestedScrollingChild = childAt instanceof NestedScrollingChild ? (NestedScrollingChild) childAt : null;
                    if (nestedScrollingChild != null) {
                        nestedScrollingChild.setNestedScrollingEnabled(false);
                    }
                }
                KeyEvent.Callback view = c39601pvS.getView();
                Intrinsics.copydefault(view, "");
                ((NestedScrollingChild) view).setNestedScrollingEnabled(true);
                viewGroup.requestLayout();
            }
        }
    }

    private final void AEQbTJ() {
        EZpvd(new Function1() { // from class: o.pvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39598pvP.AEQbTJ(this.copydefault, (KLineTechPic) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C39598pvP c39598pvP, KLineTechPic kLineTechPic) {
        Intrinsics.checkNotNullParameter(kLineTechPic, "");
        c39598pvP.OLrzqt.clear();
        java.util.ArrayList<C39601pvS> arrayList = new java.util.ArrayList<>();
        for (int i = 0; i < 8; i++) {
            arrayList.add(C39601pvS.Companion.AEQbTJ(i, kLineTechPic));
        }
        c39598pvP.OLrzqt = arrayList;
        oPI opi = c39598pvP.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        C55172xet c55172xet = opi.copydefault;
        c55172xet.setCurrentIndex(0);
        c55172xet.setCount(c39598pvP.OLrzqt.size());
        c39598pvP.KWHzl();
        oPI opi3 = c39598pvP.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi3;
        }
        PagerAdapter adapter = opi2.OLrzqt.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pvP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getData$default(C39598pvP c39598pvP, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c39598pvP.EZpvd((Function1<? super KLineTechPic, Unit>) function1);
    }

    public final void EZpvd(final Function1<? super KLineTechPic, Unit> function1) {
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getTechPics(C59449zhJ.replace$default(xMP.AEQbTJ.KWHzl(), "-", "_", false, 4, (java.lang.Object) null), 1, java.lang.Boolean.TRUE), this), new Function1() { // from class: o.pvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39598pvP.KWHzl(function1, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39598pvP.AEQbTJ(function1, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function1 != null) {
            function1.invoke(new KLineTechPic());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, ResponseData responseData) {
        KLineTechPic kLineTechPic;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            if (function1 != null) {
                java.util.List list = (java.util.List) responseData.getData();
                if (list == null || (kLineTechPic = (KLineTechPic) list.get(0)) == null) {
                    kLineTechPic = new KLineTechPic();
                }
                function1.invoke(kLineTechPic);
            }
        } else if (function1 != null) {
            function1.invoke(new KLineTechPic());
        }
        return Unit.INSTANCE;
    }
}
