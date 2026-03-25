package com.okinc.auth.impl.passkey.ui.management;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.auth.api.passkey.PasskeyManagementRequest;
import com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorFragment;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.web.WebActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC6149aJr;
import o.C33070mpX;
import o.C34703nhO;
import o.C55254xgV;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56524yIo;
import o.C5674aAt;
import o.C6122aJQ;
import o.C6151aJt;
import o.C6176aKR;
import o.C6690aUB;
import o.C8206ayP;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityPasskeyManagementFragment extends AbstractC6149aJr {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public boolean AYXKKw;
    public String AhwBna;
    public float AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final int DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C5674aAt gEmmrt;
    public final AppBarLayout.OnOffsetChangedListener isConnected;

    @yCM
    public InterfaceC47278tmy userManager;
    public final Application values;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityPasskeyManagementFragment() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public String getTAG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void setTAG(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.DAIeex int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:32) call: com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment.<init>(int):void type: THIS */
    public /* synthetic */ SecurityPasskeyManagementFragment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.DAIeex : i);
    }

    public SecurityPasskeyManagementFragment(int i) {
        this.DbNXlk = i;
        this.AhwBna = "SecurityPasskeyManagementFragment";
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.aJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SecurityPasskeyManagementFragment.AhwBna(this.copydefault);
            }
        });
        final Function0 function0 = null;
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SecurityPasskeyManagementViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.aJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SecurityPasskeyManagementFragment.AYXKKw(this.copydefault);
            }
        });
        this.values = new Application();
        this.AYXKKw = true;
        this.AkhnZx = 1.0f;
        this.isConnected = new AppBarLayout.OnOffsetChangedListener() { // from class: o.aJF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i2) {
                SecurityPasskeyManagementFragment.KWHzl(this.copydefault, appBarLayout, i2);
            }
        };
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.management.SecurityPasskeyManagementFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SecurityPasskeyManagementFragment copydefault(PasskeyManagementRequest passkeyManagementRequest) {
            SecurityPasskeyManagementFragment securityPasskeyManagementFragment = new SecurityPasskeyManagementFragment(0, 1, null);
            securityPasskeyManagementFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REQUEST", passkeyManagementRequest)));
            return securityPasskeyManagementFragment;
        }
    }

    public static final C6122aJQ AhwBna(SecurityPasskeyManagementFragment securityPasskeyManagementFragment) {
        return new C6122aJQ(securityPasskeyManagementFragment);
    }

    public final C6122aJQ AYXKKw() {
        return (C6122aJQ) this.fetchVPNInfo.getValue();
    }

    public final SecurityPasskeyManagementViewModel AhwBna() {
        return (SecurityPasskeyManagementViewModel) this.AuCTel.getValue();
    }

    private final PasskeyManagementRequest valueOf() {
        return (PasskeyManagementRequest) this.djBIcL.getValue();
    }

    public static final PasskeyManagementRequest AYXKKw(SecurityPasskeyManagementFragment securityPasskeyManagementFragment) {
        Bundle arguments = securityPasskeyManagementFragment.getArguments();
        if (arguments != null) {
            return (PasskeyManagementRequest) arguments.getParcelable("KEY_REQUEST");
        }
        return null;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C5674aAt c5674aAtOLrzqt = C5674aAt.OLrzqt(layoutInflater, viewGroup, false);
        this.gEmmrt = c5674aAtOLrzqt;
        if (c5674aAtOLrzqt != null) {
            return c5674aAtOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2 viewPager2;
        super.onDestroyView();
        C5674aAt c5674aAt = this.gEmmrt;
        if (c5674aAt != null && (viewPager2 = c5674aAt.AYXKKw) != null) {
            viewPager2.unregisterOnPageChangeCallback(this.values);
        }
        this.gEmmrt = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gEmmrt();
        DbNXlk();
        djBIcL();
        AhwBna().EZpvd();
        AhwBna().KWHzl().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.aJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityPasskeyManagementFragment.EZpvd(this.EZpvd, (Unit) obj);
            }
        }));
    }

    public static final Unit EZpvd(SecurityPasskeyManagementFragment securityPasskeyManagementFragment, Unit unit) {
        pUU.EZpvd(securityPasskeyManagementFragment.getTAG(), "finishPageIfPossible");
        FragmentActivity activity = securityPasskeyManagementFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C6690aUB.KWHzl(AhwBna().copydefault(), this, new SecurityPasskeyManagementFragment$observeLoading$1(this, null));
    }

    public final void gEmmrt() {
        SimpleToolBar simpleToolBar;
        AppBarLayout appBarLayout;
        C5674aAt c5674aAt = this.gEmmrt;
        if (c5674aAt != null && (appBarLayout = c5674aAt.EZpvd) != null) {
            appBarLayout.addOnOffsetChangedListener(this.isConnected);
        }
        C5674aAt c5674aAt2 = this.gEmmrt;
        if (c5674aAt2 == null || (simpleToolBar = c5674aAt2.KWHzl) == null) {
            return;
        }
        simpleToolBar.post(new Runnable() { // from class: o.aJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SecurityPasskeyManagementFragment.djBIcL(this.KWHzl);
            }
        });
    }

    public static final void djBIcL(SecurityPasskeyManagementFragment securityPasskeyManagementFragment) {
        AppBarLayout appBarLayout;
        C5674aAt c5674aAt = securityPasskeyManagementFragment.gEmmrt;
        securityPasskeyManagementFragment.AEQbTJ(((c5674aAt == null || (appBarLayout = c5674aAt.EZpvd) == null) ? 0 : appBarLayout.getTotalScrollRange()) * 0.5f);
    }

    public static final class Application extends ViewPager2.OnPageChangeCallback {
        public Application() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(final int i) {
            SimpleToolBar simpleToolBar;
            super.onPageSelected(i);
            C5674aAt c5674aAt = SecurityPasskeyManagementFragment.this.gEmmrt;
            if (c5674aAt == null || (simpleToolBar = c5674aAt.KWHzl) == null) {
                return;
            }
            final SecurityPasskeyManagementFragment securityPasskeyManagementFragment = SecurityPasskeyManagementFragment.this;
            simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aJH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SecurityPasskeyManagementFragment.Application.KWHzl(securityPasskeyManagementFragment, i);
                }
            });
        }

        public static final Unit KWHzl(SecurityPasskeyManagementFragment securityPasskeyManagementFragment, int i) {
            FragmentActivity activity = securityPasskeyManagementFragment.getActivity();
            if (activity != null) {
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", securityPasskeyManagementFragment.AEQbTJ(i))), null, 4, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void DbNXlk() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        C5674aAt c5674aAt = this.gEmmrt;
        if (c5674aAt != null && (viewPager22 = c5674aAt.AYXKKw) != null) {
            viewPager22.setAdapter(AYXKKw());
        }
        C5674aAt c5674aAt2 = this.gEmmrt;
        if (c5674aAt2 != null && (viewPager2 = c5674aAt2.AYXKKw) != null) {
            viewPager2.registerOnPageChangeCallback(this.values);
        }
        AhwBna().OLrzqt().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.aJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SecurityPasskeyManagementFragment.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit OLrzqt(SecurityPasskeyManagementFragment securityPasskeyManagementFragment, Boolean bool) {
        Intrinsics.copydefault(bool);
        securityPasskeyManagementFragment.KWHzl(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        ViewPager2 viewPager22;
        int i = C8206ayP.Dialog.vLaW;
        C6151aJt[] c6151aJtArr = new C6151aJt[2];
        int i2 = C8206ayP.Dialog.zAEkPU;
        SecurityFido2AuthenticatorFragment.StateListAnimator stateListAnimator = SecurityFido2AuthenticatorFragment.Companion;
        PasskeyManagementRequest passkeyManagementRequestAEQbTJ = AhwBna().AEQbTJ();
        c6151aJtArr[0] = new C6151aJt(i2, stateListAnimator.copydefault(passkeyManagementRequestAEQbTJ != null && passkeyManagementRequestAEQbTJ.OLrzqt(), !z));
        c6151aJtArr[1] = z ? new C6151aJt(i, C6176aKR.Companion.AEQbTJ()) : null;
        final List listValueOf = yDY.valueOf(c6151aJtArr);
        C5674aAt c5674aAt = this.gEmmrt;
        if (c5674aAt != null && (c55254xgV = c5674aAt.copydefault) != null) {
            c55254xgV.setVisibility(listValueOf.size() <= 1 ? 8 : 0);
            TabLayout tabLayoutCopydefault = c55254xgV.copydefault();
            C5674aAt c5674aAt2 = this.gEmmrt;
            if (c5674aAt2 != null && (viewPager22 = c5674aAt2.AYXKKw) != null) {
                new TabLayoutMediator(tabLayoutCopydefault, viewPager22, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.aJA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                    public final void onConfigureTab(TabLayout.Tab tab, int i3) {
                        SecurityPasskeyManagementFragment.EZpvd(listValueOf, tab, i3);
                    }
                }).attach();
            }
        }
        C6122aJQ c6122aJQAYXKKw = AYXKKw();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        Iterator it = listValueOf.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6151aJt) it.next()).AEQbTJ());
        }
        c6122aJQAYXKKw.KWHzl(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList));
        C5674aAt c5674aAt3 = this.gEmmrt;
        if (c5674aAt3 != null && (viewPager2 = c5674aAt3.AYXKKw) != null) {
            viewPager2.post(new Runnable() { // from class: o.aJy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    SecurityPasskeyManagementFragment.gEmmrt(this.KWHzl);
                }
            });
        }
        EZpvd();
    }

    public static final void EZpvd(List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(C33070mpX.AYXKKw(((C6151aJt) list.get(i)).OLrzqt()));
        if (i == 0) {
            tab.setContentDescription("passkeyListExchangeTab");
        } else {
            tab.setContentDescription("passkeyListPayTab");
        }
    }

    public static final void gEmmrt(SecurityPasskeyManagementFragment securityPasskeyManagementFragment) {
        Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            securityPasskeyManagementFragment.AYXKKw().notifyDataSetChanged();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return;
        }
        pUU.AEQbTJ("SecurityPasskeyManagementFragment", "setUpViewPager: notifyDataSetChanged failed", thM7380exceptionOrNullimpl);
    }

    public final void EZpvd() {
        ViewPager2 viewPager2;
        PasskeyManagementRequest passkeyManagementRequestValueOf = valueOf();
        if (passkeyManagementRequestValueOf != null && passkeyManagementRequestValueOf.EZpvd() && this.AYXKKw) {
            try {
                Result.Application application = Result.Companion;
                C5674aAt c5674aAt = this.gEmmrt;
                if (c5674aAt != null && (viewPager2 = c5674aAt.AYXKKw) != null) {
                    viewPager2.setCurrentItem(1);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            this.AYXKKw = !this.AYXKKw;
        }
    }

    public final String AEQbTJ(int i) {
        if (i == 0) {
            if (C34703nhO.AEQbTJ()) {
                String string = getString(C8206ayP.Dialog.zKcAg);
                Intrinsics.copydefault((Object) string);
                return string;
            }
            String string2 = getString(C8206ayP.Dialog.OcIXYQ);
            Intrinsics.copydefault((Object) string2);
            return string2;
        }
        String string3 = getString(C8206ayP.Dialog.RSDDiY);
        Intrinsics.copydefault((Object) string3);
        return string3;
    }

    public final void AEQbTJ(float f) {
        C5674aAt c5674aAt = this.gEmmrt;
        if (c5674aAt != null) {
            float totalScrollRange = c5674aAt.EZpvd.getTotalScrollRange();
            float f2 = this.AkhnZx;
            if (1.0f > f2 || f2 > totalScrollRange) {
                return;
            }
            this.AkhnZx = f;
        }
    }

    public static final void KWHzl(SecurityPasskeyManagementFragment securityPasskeyManagementFragment, AppBarLayout appBarLayout, int i) {
        C5674aAt c5674aAt = securityPasskeyManagementFragment.gEmmrt;
        if (c5674aAt != null) {
            int totalScrollRange = c5674aAt.EZpvd.getTotalScrollRange() + i;
            float f = totalScrollRange;
            float f2 = securityPasskeyManagementFragment.AkhnZx;
            float f3 = f < f2 ? 1 - (f / f2) : 0.0f;
            pUU.EZpvd(securityPasskeyManagementFragment.getTAG(), "offsetChangeListener: totalScrollRange=" + c5674aAt.EZpvd.getTotalScrollRange() + " | gapHeight=" + totalScrollRange + " | alpha=" + f3);
            c5674aAt.KWHzl.EZpvd().setAlpha(f3);
            c5674aAt.AEQbTJ.setHeight(totalScrollRange);
        }
    }
}
