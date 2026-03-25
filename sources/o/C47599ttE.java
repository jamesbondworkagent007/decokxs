package o;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.im.bean.TrendingGroupsCollectionComponentStatus;
import com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeContentState$1;
import com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$observeUserEvent$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ttE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47599ttE extends AbstractC32996moC {
    public final InterfaceC56387yDm EZpvd;
    public boolean KWHzl;
    public tNQ OLrzqt;
    public C47638ttr copydefault;
    public C35743oCa gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C47501trL.Application.OqFWZa;
    }

    public C47599ttE() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47664tuQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_content.leaderboard.PlanetLeaderboardFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47664tuQ AYXKKw() {
        return (C47664tuQ) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.ttE$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ttE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        tNQ tnqKWHzl = tNQ.KWHzl(view);
        this.OLrzqt = tnqKWHzl;
        if (tnqKWHzl != null) {
            tnqKWHzl.isConnected.AhwBna(false);
            tnqKWHzl.isConnected.OLrzqt(new InterfaceC57903yrG() { // from class: o.ttF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C47599ttE.KWHzl(this.EZpvd, interfaceC57934yrl);
                }
            });
        }
        EZpvd();
        OLrzqt();
        gEmmrt();
    }

    public static final void KWHzl(C47599ttE c47599ttE, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c47599ttE.copydefault();
    }

    private final void gEmmrt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetLeaderboardFragment$observeUserEvent$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.ttE$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((java.lang.Integer) ((kotlin.Pair) t).getFirst(), (java.lang.Integer) ((kotlin.Pair) t2).getFirst());
        }
    }

    public final JSONObject copydefault(java.lang.String str) {
        java.lang.String string;
        java.lang.Object objM7377constructorimpl;
        JSONObject jSONObject = null;
        jSONObject = null;
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "orbit_foryou_dynamic_config", null, 2, null);
        if (value$default != null) {
            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value$default))) {
                value$default = null;
            }
            if (value$default != null) {
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(new JSONObject(value$default));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                jSONObject = (JSONObject) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }
        if (jSONObject == null || (string = jSONObject.toString()) == null) {
            string = AbstractJsonLexerKt.NULL;
        }
        pUU.EZpvd("PlanetLeaderboardFragment", "leaderboard order json (" + str + "): " + string);
        return jSONObject;
    }

    public final void EZpvd() {
        java.lang.Object objM7377constructorimpl;
        androidx.fragment.app.Fragment fragment;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C47638ttr.Companion.OLrzqt(copydefault("createFragments")));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C47638ttr c47638ttrCopydefault = C47638ttr.Companion.copydefault();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = c47638ttrCopydefault;
        }
        C47638ttr c47638ttr = (C47638ttr) objM7377constructorimpl;
        pUU.EZpvd("PlanetLeaderboardFragment", "leaderboard parsed display: " + c47638ttr.gEmmrt());
        C47620ttZ c47620ttZ = new C47620ttZ();
        c47620ttZ.OLrzqt(c47638ttr.AYXKKw().OLrzqt());
        c47620ttZ.EZpvd(c47638ttr.AYXKKw().AEQbTJ());
        C47608ttN c47608ttN = new C47608ttN();
        c47608ttN.EZpvd(c47638ttr.valueOf().OLrzqt());
        c47608ttN.AEQbTJ(c47638ttr.valueOf().AEQbTJ());
        C47605ttK c47605ttK = new C47605ttK();
        c47605ttK.EZpvd(c47638ttr.EZpvd().OLrzqt());
        c47605ttK.OLrzqt(c47638ttr.EZpvd().AEQbTJ());
        C47644ttx c47644ttx = new C47644ttx();
        c47644ttx.copydefault(c47638ttr.copydefault().OLrzqt());
        c47644ttx.AEQbTJ(c47638ttr.copydefault().AEQbTJ());
        C47595ttA c47595ttA = new C47595ttA();
        c47595ttA.KWHzl(c47638ttr.OLrzqt().OLrzqt());
        c47595ttA.OLrzqt(c47638ttr.OLrzqt().AEQbTJ());
        this.gEmmrt = EZpvd(c47638ttr);
        this.copydefault = c47638ttr;
        androidx.fragment.app.FragmentTransaction fragmentTransactionReplace = getChildFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.spnCvw, c47644ttx, "PlanetFollowingFragment").replace(C47501trL.TaskDescription.Dmq, c47605ttK, "PlanetSpotlightFragment").replace(C47501trL.TaskDescription.run, c47620ttZ, "PlanetTopTradersFragment").replace(C47501trL.TaskDescription.WS, c47608ttN, "PlanetTopOrbitersFragment");
        int i = C47501trL.TaskDescription.call;
        C35743oCa c35743oCa = this.gEmmrt;
        if (c35743oCa == null || (fragment = c35743oCa.KWHzl()) == null) {
            fragment = new androidx.fragment.app.Fragment();
        }
        fragmentTransactionReplace.replace(i, fragment).replace(C47501trL.TaskDescription.zblBkD, c47595ttA, "PlanetLatestNewsFragment").commit();
        KWHzl(c47638ttr);
        AEQbTJ(c47638ttr);
    }

    public final C35743oCa EZpvd(C47638ttr c47638ttr) {
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            return interfaceC35180nqU.KWHzl(new oBZ(java.lang.Integer.valueOf(c47638ttr.AEQbTJ().OLrzqt())), new ActionBar());
        }
        return null;
    }

    /* JADX INFO: renamed from: o.ttE$ActionBar */
    public static final class ActionBar implements InterfaceC35243nre {
        public ActionBar() {
        }

        @Override // o.InterfaceC35243nre
        public void copydefault(TrendingGroupsCollectionComponentStatus trendingGroupsCollectionComponentStatus) {
            android.widget.FrameLayout frameLayout;
            android.widget.FrameLayout frameLayout2;
            Intrinsics.checkNotNullParameter(trendingGroupsCollectionComponentStatus, "");
            boolean zAEQbTJ = C47599ttE.this.KWHzl().AEQbTJ().AEQbTJ();
            if (trendingGroupsCollectionComponentStatus != TrendingGroupsCollectionComponentStatus.NORMAL || !zAEQbTJ) {
                C47599ttE.this.AYXKKw().gEmmrt(false, true);
                tNQ tnq = C47599ttE.this.OLrzqt;
                if (tnq != null && (frameLayout = tnq.gEmmrt) != null) {
                    frameLayout.setVisibility(8);
                }
            } else {
                C47599ttE.this.AYXKKw().gEmmrt(true, true);
                tNQ tnq2 = C47599ttE.this.OLrzqt;
                if (tnq2 != null && (frameLayout2 = tnq2.gEmmrt) != null) {
                    frameLayout2.setVisibility(0);
                }
            }
            pUU.EZpvd("PlanetLeaderboardFragment", "TrendingGroupsCollectionComponentStatus: " + trendingGroupsCollectionComponentStatus + ", groupsEnabled: " + zAEQbTJ);
        }
    }

    public final void KWHzl(C47638ttr c47638ttr) {
        android.widget.LinearLayout linearLayout;
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        android.widget.FrameLayout frameLayout3;
        android.widget.FrameLayout frameLayout4;
        android.widget.FrameLayout frameLayout5;
        android.widget.FrameLayout frameLayout6;
        tNQ tnq = this.OLrzqt;
        if (tnq == null || (linearLayout = tnq.copydefault) == null) {
            return;
        }
        kotlin.Pair[] pairArr = new kotlin.Pair[6];
        kotlin.Pair pairOLrzqt = null;
        pairArr[0] = (tnq == null || (frameLayout6 = tnq.KWHzl) == null) ? null : C56390yDp.OLrzqt(java.lang.Integer.valueOf(c47638ttr.copydefault().KWHzl()), frameLayout6);
        tNQ tnq2 = this.OLrzqt;
        pairArr[1] = (tnq2 == null || (frameLayout5 = tnq2.OLrzqt) == null) ? null : C56390yDp.OLrzqt(java.lang.Integer.valueOf(c47638ttr.EZpvd().KWHzl()), frameLayout5);
        tNQ tnq3 = this.OLrzqt;
        pairArr[2] = (tnq3 == null || (frameLayout4 = tnq3.gEmmrt) == null) ? null : C56390yDp.OLrzqt(java.lang.Integer.valueOf(c47638ttr.AEQbTJ().KWHzl()), frameLayout4);
        tNQ tnq4 = this.OLrzqt;
        pairArr[3] = (tnq4 == null || (frameLayout3 = tnq4.AhwBna) == null) ? null : C56390yDp.OLrzqt(java.lang.Integer.valueOf(c47638ttr.AYXKKw().KWHzl()), frameLayout3);
        tNQ tnq5 = this.OLrzqt;
        pairArr[4] = (tnq5 == null || (frameLayout2 = tnq5.AEQbTJ) == null) ? null : C56390yDp.OLrzqt(java.lang.Integer.valueOf(c47638ttr.valueOf().KWHzl()), frameLayout2);
        tNQ tnq6 = this.OLrzqt;
        if (tnq6 != null && (frameLayout = tnq6.EZpvd) != null) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(c47638ttr.OLrzqt().KWHzl()), frameLayout);
        }
        pairArr[5] = pairOLrzqt;
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(yDY.valueOf(pairArr), new StateListAnimator());
        java.util.ArrayList<android.widget.FrameLayout> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add((android.widget.FrameLayout) ((kotlin.Pair) it.next()).getSecond());
        }
        for (android.widget.FrameLayout frameLayout7 : arrayList) {
            ViewGroup.LayoutParams layoutParams = frameLayout7.getLayoutParams();
            if (layoutParams != null) {
                linearLayout.removeView(frameLayout7);
                linearLayout.addView(frameLayout7, layoutParams);
            }
        }
    }

    public final void OLrzqt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new PlanetLeaderboardFragment$observeContentState$1(this, null), 3, null);
    }

    public final C47638ttr KWHzl() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C47638ttr.Companion.OLrzqt(copydefault("getCurrentLeaderboardConfig")));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C47638ttr c47638ttrCopydefault = C47638ttr.Companion.copydefault();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = c47638ttrCopydefault;
        }
        return (C47638ttr) objM7377constructorimpl;
    }

    public final void OLrzqt(C47638ttr c47638ttr) {
        androidx.fragment.app.Fragment fragmentKWHzl;
        pUU.EZpvd("PlanetLeaderboardFragment", "leaderboard parsed display: " + c47638ttr.gEmmrt());
        C47638ttr c47638ttr2 = this.copydefault;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("PlanetFollowingFragment");
        C47644ttx c47644ttx = fragmentFindFragmentByTag instanceof C47644ttx ? (C47644ttx) fragmentFindFragmentByTag : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("PlanetSpotlightFragment");
        C47605ttK c47605ttK = fragmentFindFragmentByTag2 instanceof C47605ttK ? (C47605ttK) fragmentFindFragmentByTag2 : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag3 = getChildFragmentManager().findFragmentByTag("PlanetTopOrbitersFragment");
        C47608ttN c47608ttN = fragmentFindFragmentByTag3 instanceof C47608ttN ? (C47608ttN) fragmentFindFragmentByTag3 : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag4 = getChildFragmentManager().findFragmentByTag("PlanetTopTradersFragment");
        C47620ttZ c47620ttZ = fragmentFindFragmentByTag4 instanceof C47620ttZ ? (C47620ttZ) fragmentFindFragmentByTag4 : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag5 = getChildFragmentManager().findFragmentByTag("PlanetLatestNewsFragment");
        C47595ttA c47595ttA = fragmentFindFragmentByTag5 instanceof C47595ttA ? (C47595ttA) fragmentFindFragmentByTag5 : null;
        if ((c47638ttr2 == null || c47638ttr2.copydefault().OLrzqt() != c47638ttr.copydefault().OLrzqt()) && c47644ttx != null) {
            c47644ttx.copydefault(c47638ttr.copydefault().OLrzqt());
        }
        if ((c47638ttr2 == null || c47638ttr2.EZpvd().OLrzqt() != c47638ttr.EZpvd().OLrzqt()) && c47605ttK != null) {
            c47605ttK.EZpvd(c47638ttr.EZpvd().OLrzqt());
        }
        if ((c47638ttr2 == null || c47638ttr2.valueOf().OLrzqt() != c47638ttr.valueOf().OLrzqt()) && c47608ttN != null) {
            c47608ttN.EZpvd(c47638ttr.valueOf().OLrzqt());
        }
        if ((c47638ttr2 == null || c47638ttr2.AYXKKw().OLrzqt() != c47638ttr.AYXKKw().OLrzqt()) && c47620ttZ != null) {
            c47620ttZ.OLrzqt(c47638ttr.AYXKKw().OLrzqt());
        }
        if ((c47638ttr2 == null || c47638ttr2.OLrzqt().OLrzqt() != c47638ttr.OLrzqt().OLrzqt()) && c47595ttA != null) {
            c47595ttA.KWHzl(c47638ttr.OLrzqt().OLrzqt());
        }
        if (c47638ttr2 == null || c47638ttr2.AEQbTJ().OLrzqt() != c47638ttr.AEQbTJ().OLrzqt()) {
            C35743oCa c35743oCaEZpvd = EZpvd(c47638ttr);
            this.gEmmrt = c35743oCaEZpvd;
            if (c35743oCaEZpvd != null && (fragmentKWHzl = c35743oCaEZpvd.KWHzl()) != null) {
                getChildFragmentManager().beginTransaction().replace(C47501trL.TaskDescription.call, fragmentKWHzl).commit();
            }
        }
        if (c47638ttr2 == null || !c47638ttr.AEQbTJ(c47638ttr2)) {
            KWHzl(c47638ttr);
        }
        if (c47644ttx != null) {
            c47644ttx.AEQbTJ(c47638ttr.copydefault().AEQbTJ());
        }
        if (c47605ttK != null) {
            c47605ttK.OLrzqt(c47638ttr.EZpvd().AEQbTJ());
        }
        if (c47608ttN != null) {
            c47608ttN.AEQbTJ(c47638ttr.valueOf().AEQbTJ());
        }
        if (c47620ttZ != null) {
            c47620ttZ.EZpvd(c47638ttr.AYXKKw().AEQbTJ());
        }
        if (c47595ttA != null) {
            c47595ttA.OLrzqt(c47638ttr.OLrzqt().AEQbTJ());
        }
        this.copydefault = c47638ttr;
    }

    public final void AEQbTJ(C47638ttr c47638ttr) {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        android.widget.FrameLayout frameLayout3;
        android.widget.FrameLayout frameLayout4;
        android.widget.FrameLayout frameLayout5;
        android.widget.FrameLayout frameLayout6;
        if (!c47638ttr.AYXKKw().AEQbTJ()) {
            tNQ tnq = this.OLrzqt;
            if (tnq != null && (frameLayout6 = tnq.AhwBna) != null) {
                frameLayout6.setVisibility(8);
            }
            AYXKKw().EZpvd(false, true);
        }
        if (!c47638ttr.valueOf().AEQbTJ()) {
            tNQ tnq2 = this.OLrzqt;
            if (tnq2 != null && (frameLayout5 = tnq2.AEQbTJ) != null) {
                frameLayout5.setVisibility(8);
            }
            AYXKKw().copydefault(false, true);
        }
        if (!c47638ttr.EZpvd().AEQbTJ()) {
            tNQ tnq3 = this.OLrzqt;
            if (tnq3 != null && (frameLayout4 = tnq3.OLrzqt) != null) {
                frameLayout4.setVisibility(8);
            }
            AYXKKw().AEQbTJ(false, true);
        }
        if (!c47638ttr.copydefault().AEQbTJ()) {
            tNQ tnq4 = this.OLrzqt;
            if (tnq4 != null && (frameLayout3 = tnq4.KWHzl) != null) {
                frameLayout3.setVisibility(8);
            }
            AYXKKw().KWHzl(false, true);
        }
        if (!c47638ttr.AEQbTJ().AEQbTJ()) {
            tNQ tnq5 = this.OLrzqt;
            if (tnq5 != null && (frameLayout2 = tnq5.gEmmrt) != null) {
                frameLayout2.setVisibility(8);
            }
            AYXKKw().gEmmrt(false, true);
        }
        if (c47638ttr.OLrzqt().AEQbTJ()) {
            return;
        }
        tNQ tnq6 = this.OLrzqt;
        if (tnq6 != null && (frameLayout = tnq6.EZpvd) != null) {
            frameLayout.setVisibility(8);
        }
        AYXKKw().OLrzqt(false, true);
    }

    public final void copydefault() {
        C35743oCa c35743oCa;
        oBX obxAEQbTJ;
        C47638ttr c47638ttrKWHzl = KWHzl();
        OLrzqt(c47638ttrKWHzl);
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("PlanetSpotlightFragment");
        C47605ttK c47605ttK = fragmentFindFragmentByTag instanceof C47605ttK ? (C47605ttK) fragmentFindFragmentByTag : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("PlanetTopOrbitersFragment");
        C47608ttN c47608ttN = fragmentFindFragmentByTag2 instanceof C47608ttN ? (C47608ttN) fragmentFindFragmentByTag2 : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag3 = getChildFragmentManager().findFragmentByTag("PlanetTopTradersFragment");
        C47620ttZ c47620ttZ = fragmentFindFragmentByTag3 instanceof C47620ttZ ? (C47620ttZ) fragmentFindFragmentByTag3 : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag4 = getChildFragmentManager().findFragmentByTag("PlanetFollowingFragment");
        C47644ttx c47644ttx = fragmentFindFragmentByTag4 instanceof C47644ttx ? (C47644ttx) fragmentFindFragmentByTag4 : null;
        androidx.fragment.app.Fragment fragmentFindFragmentByTag5 = getChildFragmentManager().findFragmentByTag("PlanetLatestNewsFragment");
        C47595ttA c47595ttA = fragmentFindFragmentByTag5 instanceof C47595ttA ? (C47595ttA) fragmentFindFragmentByTag5 : null;
        AYXKKw().AhwBna();
        AEQbTJ(c47638ttrKWHzl);
        if (c47638ttrKWHzl.AYXKKw().AEQbTJ() && c47620ttZ != null) {
            c47620ttZ.AEQbTJ();
        }
        if (c47638ttrKWHzl.valueOf().AEQbTJ() && c47608ttN != null) {
            c47608ttN.AEQbTJ();
        }
        if (c47638ttrKWHzl.EZpvd().AEQbTJ() && c47605ttK != null) {
            c47605ttK.gEmmrt();
        }
        if (c47638ttrKWHzl.copydefault().AEQbTJ() && c47644ttx != null) {
            c47644ttx.AYXKKw();
        }
        if (c47638ttrKWHzl.OLrzqt().AEQbTJ() && c47595ttA != null) {
            c47595ttA.valueOf();
        }
        if (!c47638ttrKWHzl.AEQbTJ().AEQbTJ() || (c35743oCa = this.gEmmrt) == null || (obxAEQbTJ = c35743oCa.AEQbTJ()) == null) {
            return;
        }
        obxAEQbTJ.AEQbTJ(AYXKKw().OLrzqt().getValue().AhwBna() && !AYXKKw().copydefault());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AEQbTJ();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        AEQbTJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("PlanetSpotlightFragment");
        C47605ttK c47605ttK = fragmentFindFragmentByTag instanceof C47605ttK ? (C47605ttK) fragmentFindFragmentByTag : null;
        if (c47605ttK != null) {
            c47605ttK.AEQbTJ();
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag("PlanetLatestNewsFragment");
        C47595ttA c47595ttA = fragmentFindFragmentByTag2 instanceof C47595ttA ? (C47595ttA) fragmentFindFragmentByTag2 : null;
        if (c47595ttA != null) {
            c47595ttA.AYXKKw();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C32866mlf.onEvent$default("Orbit_Page_Foryou_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C47638ttr c47638ttrKWHzl = KWHzl();
        java.util.List listGEmmrt = yDY.gEmmrt("PlanetSpotlightFragment", "PlanetTopTradersFragment", "PlanetTopOrbitersFragment", "PlanetFollowingFragment", "PlanetLatestNewsFragment");
        if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
            return;
        }
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            if (getChildFragmentManager().findFragmentByTag((java.lang.String) it.next()) != null) {
                OLrzqt(c47638ttrKWHzl);
                AEQbTJ(c47638ttrKWHzl);
                return;
            }
        }
    }
}
