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

/* JADX INFO: renamed from: o.pvZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39608pvZ extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<C39671pwj> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public oPI copydefault;

    @Override // o.wXX
    public float getHeightScale() {
        return 0.75f;
    }

    public C39608pvZ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.ui.setting.KlineTradeTeachDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.ui.setting.KlineTradeTeachDialog$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.setting.KlineTradeTeachDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.setting.KlineTradeTeachDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.setting.KlineTradeTeachDialog$special$$inlined$viewModels$default$5
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
        this.KWHzl = new java.util.ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pCW OLrzqt() {
        return (pCW) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.pvZ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pvZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C39608pvZ AEQbTJ() {
            return new C39608pvZ();
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
        EZpvd();
        oPI opi = this.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        opi.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.pwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39608pvZ.KWHzl(this.KWHzl, view2);
            }
        });
        oPI opi3 = this.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
            opi3 = null;
        }
        opi3.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39608pvZ.OLrzqt(this.OLrzqt, view2);
            }
        });
        oPI opi4 = this.copydefault;
        if (opi4 == null) {
            Intrinsics.gEmmrt("");
            opi4 = null;
        }
        opi4.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.pwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C39608pvZ.djBIcL(this.KWHzl, view2);
            }
        });
        oPI opi5 = this.copydefault;
        if (opi5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi5;
        }
        opi2.OLrzqt.setCurrentItem(0, false);
        java.util.HashMap<java.lang.String, java.lang.String> mapValues = OLrzqt().OLrzqt().values();
        if (mapValues != null) {
            mapValues.put("isRunningInVirtualEnvironment", "position_teach");
        }
    }

    public static final void KWHzl(C39608pvZ c39608pvZ, android.view.View view) {
        c39608pvZ.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(C39608pvZ c39608pvZ, android.view.View view) {
        oPI opi = c39608pvZ.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        ViewPager viewPager = opi.OLrzqt;
        oPI opi3 = c39608pvZ.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi3;
        }
        viewPager.setCurrentItem(opi2.OLrzqt.getCurrentItem() - 1);
    }

    public static final void djBIcL(C39608pvZ c39608pvZ, android.view.View view) {
        oPI opi = c39608pvZ.copydefault;
        oPI opi2 = null;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        if (opi.OLrzqt.getCurrentItem() == c39608pvZ.KWHzl.size() - 1) {
            c39608pvZ.dismissAllowingStateLoss();
            return;
        }
        oPI opi3 = c39608pvZ.copydefault;
        if (opi3 == null) {
            Intrinsics.gEmmrt("");
            opi3 = null;
        }
        ViewPager viewPager = opi3.OLrzqt;
        oPI opi4 = c39608pvZ.copydefault;
        if (opi4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            opi2 = opi4;
        }
        viewPager.setCurrentItem(opi2.OLrzqt.getCurrentItem() + 1);
    }

    private final void copydefault() {
        oPI opi = this.copydefault;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        ViewPager viewPager = opi.OLrzqt;
        viewPager.setOffscreenPageLimit(this.KWHzl.size());
        viewPager.setAdapter(new StateListAnimator(this, this.KWHzl));
        viewPager.addOnPageChangeListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.pvZ$TaskDescription */
    public static final class TaskDescription implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public TaskDescription() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            java.lang.String string;
            oPI opi = C39608pvZ.this.copydefault;
            oPI opi2 = null;
            if (opi == null) {
                Intrinsics.gEmmrt("");
                opi = null;
            }
            opi.KWHzl.setVisibility(i == 0 ? 8 : 0);
            oPI opi3 = C39608pvZ.this.copydefault;
            if (opi3 == null) {
                Intrinsics.gEmmrt("");
                opi3 = null;
            }
            C52794wYp c52794wYp = opi3.gEmmrt;
            C39608pvZ c39608pvZ = C39608pvZ.this;
            if (i == c39608pvZ.KWHzl.size() - 1) {
                string = C33070mpX.AYXKKw(C35964oKf.Fragment.gHZMYf);
            } else {
                string = c39608pvZ.getString(C35964oKf.Fragment.AxsJAY);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            c52794wYp.setText(string);
            pCW pcwOLrzqt = C39608pvZ.this.OLrzqt();
            oPI opi4 = C39608pvZ.this.copydefault;
            if (opi4 == null) {
                Intrinsics.gEmmrt("");
                opi4 = null;
            }
            pcwOLrzqt.KWHzl(i > opi4.copydefault.OLrzqt() ? "renderTime" : "start_mode");
            oPI opi5 = C39608pvZ.this.copydefault;
            if (opi5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                opi2 = opi5;
            }
            opi2.copydefault.setCurrentIndex(i);
            java.util.HashMap<java.lang.String, java.lang.String> mapValues = C39608pvZ.this.OLrzqt().OLrzqt().values();
            if (C33129mqd.AhwBna(mapValues.get("activity_render")) < C39608pvZ.this.KWHzl.size()) {
                mapValues.put("activity_render", java.lang.String.valueOf(i + 1));
            }
        }
    }

    /* JADX INFO: renamed from: o.pvZ$StateListAnimator */
    public final class StateListAnimator extends AbstractC33000moG {
        public java.util.ArrayList<C39671pwj> OLrzqt;
        public final /* synthetic */ C39608pvZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return "";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C39608pvZ c39608pvZ, java.util.ArrayList<C39671pwj> arrayList) {
            super(c39608pvZ.getChildFragmentManager());
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault = c39608pvZ;
            this.OLrzqt = arrayList;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.OLrzqt.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            C39671pwj c39671pwj = this.OLrzqt.get(i);
            Intrinsics.checkNotNullExpressionValue(c39671pwj, "");
            return c39671pwj;
        }

        @Override // o.AbstractC33000moG, androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@androidx.annotation.NonNull @NotNull android.view.ViewGroup viewGroup, int i, @androidx.annotation.NonNull @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            super.setPrimaryItem(viewGroup, i, obj);
            C39671pwj c39671pwj = (C39671pwj) obj;
            if (c39671pwj.getView() != null) {
                int count = getCount();
                for (int i2 = 0; i2 < count; i2++) {
                    KeyEvent.Callback childAt = viewGroup.getChildAt(i2);
                    NestedScrollingChild nestedScrollingChild = childAt instanceof NestedScrollingChild ? (NestedScrollingChild) childAt : null;
                    if (nestedScrollingChild != null) {
                        nestedScrollingChild.setNestedScrollingEnabled(false);
                    }
                }
                KeyEvent.Callback view = c39671pwj.getView();
                Intrinsics.copydefault(view, "");
                ((NestedScrollingChild) view).setNestedScrollingEnabled(true);
                viewGroup.requestLayout();
            }
        }
    }

    private final void EZpvd() {
        copydefault(new Function1() { // from class: o.pwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39608pvZ.AEQbTJ(this.KWHzl, (KLineTechPic) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C39608pvZ c39608pvZ, KLineTechPic kLineTechPic) {
        Intrinsics.checkNotNullParameter(kLineTechPic, "");
        c39608pvZ.KWHzl.clear();
        java.util.ArrayList<C39671pwj> arrayList = new java.util.ArrayList<>();
        for (int i = 1; i < 7; i++) {
            arrayList.add(C39671pwj.Companion.copydefault(i, kLineTechPic));
        }
        c39608pvZ.KWHzl = arrayList;
        oPI opi = c39608pvZ.copydefault;
        if (opi == null) {
            Intrinsics.gEmmrt("");
            opi = null;
        }
        C55172xet c55172xet = opi.copydefault;
        c55172xet.setCurrentIndex(0);
        c55172xet.setCount(c39608pvZ.KWHzl.size());
        c39608pvZ.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pvZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getData$default(C39608pvZ c39608pvZ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c39608pvZ.copydefault((Function1<? super KLineTechPic, Unit>) function1);
    }

    public final void copydefault(final Function1<? super KLineTechPic, Unit> function1) {
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(((KlineBizMarketService) C43393roT.httpService$default(C56524yIo.AEQbTJ(KlineBizMarketService.class), null, 1, null)).getTechPics("", 2, java.lang.Boolean.FALSE), this), new Function1() { // from class: o.pvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39608pvZ.KWHzl(function1, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39608pvZ.AEQbTJ(function1, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function1 != null) {
            function1.invoke(new KLineTechPic());
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C39215poB.OLrzqt.copydefault(OLrzqt().OLrzqt());
    }

    /* JADX INFO: Access modifiers changed from: private */
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
