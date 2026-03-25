package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.common.constants.RankingSortType;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractActivityC33041mov;
import o.AbstractC22421hez;
import o.AbstractC25695jCy;
import o.AbstractC25708jDk;
import o.AbstractC43238rlX;
import o.C22416heu;
import o.C23274hvD;
import o.C25352ivB;
import o.C25382ivf;
import o.C25389ivm;
import o.C25390ivn;
import o.C25688jCr;
import o.C25701jDd;
import o.C25702jDe;
import o.C25706jDi;
import o.C29408ktA;
import o.C33070mpX;
import o.C33546myW;
import o.C43251rlk;
import o.C52761wXj;
import o.C54989xbV;
import o.C55113xdn;
import o.C55173xeu;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.C57589ylK;
import o.C6777aVl;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.InterfaceC57901yrE;
import o.InterfaceC57934yrl;
import o.gKN;
import o.gKZ;
import o.gSN;
import o.gTI;
import o.hEO;
import o.jBN;
import o.jCC;
import o.jCJ;
import o.jCR;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFragment extends AbstractC25695jCy {
    public boolean AYXKKw;
    public jCC AkhnZx;
    public final InterfaceC56387yDm DbNXlk;

    @yCM
    public gTI editStrategyNavigator;
    public hEO gEmmrt;
    public final ActivityResultLauncher<gSN.Application> valueOf;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jCO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LeaderBoardFragment.AYXKKw();
        }
    });
    public boolean AhwBna = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(gSN.StateListAnimator stateListAnimator) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final hEO gEmmrt() {
        return this.gEmmrt;
    }

    public LeaderBoardFragment() {
        final Function0 function0 = null;
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(LeaderBoardViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.leaderboard.LeaderBoardFragment$special$$inlined$activityViewModels$default$3
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
        ActivityResultLauncher<gSN.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new gSN(), new ActivityResultCallback() { // from class: o.jCN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                LeaderBoardFragment.EZpvd((gSN.StateListAnimator) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.valueOf = activityResultLauncherRegisterForActivityResult;
    }

    public final LeaderBoardViewModel djBIcL() {
        return (LeaderBoardViewModel) this.DbNXlk.getValue();
    }

    public static final gKN AYXKKw() {
        return (gKN) C43251rlk.copydefault(gKN.class);
    }

    public final gKN AhwBna() {
        return (gKN) this.djBIcL.getValue();
    }

    public final gTI valueOf() {
        gTI gti = this.editStrategyNavigator;
        if (gti != null) {
            return gti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hEO heoAEQbTJ = hEO.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(heoAEQbTJ, "");
        this.gEmmrt = heoAEQbTJ;
        ConstraintLayout root = heoAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        iwGUEr();
        AkhnZx();
        uzCIH();
    }

    public final void AkhnZx() {
        djBIcL().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new LeaderBoardFragment$initFetch$1(this, null), 3, null);
    }

    private final void iwGUEr() {
        this.AhwBna = true;
        isConnected();
        AuCTel();
        fetchVPNInfo();
        values();
    }

    public final void isConnected() {
        hEO heoGEmmrt;
        LinearLayout linearLayout;
        hEO heoGEmmrt2 = gEmmrt();
        if (heoGEmmrt2 != null && (linearLayout = heoGEmmrt2.KWHzl) != null) {
            linearLayout.setVisibility(8);
        }
        if (C22416heu.fetchVPNInfo() && (heoGEmmrt = gEmmrt()) != null) {
            LinearLayout linearLayout2 = heoGEmmrt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setAllCorners(new RoundedCornerTreatment()).setAllCornerSizes(new RelativeCornerSize(0.5f)).build();
            Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "");
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI)));
            heoGEmmrt.AEQbTJ.setBackground(materialShapeDrawable);
            LinearLayout linearLayout3 = heoGEmmrt.KWHzl;
            linearLayout3.setOnClickListener(new Dialog(linearLayout3, 1000L, this));
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LeaderBoardFragment$setupCopyTradingPanel$1$2(this, heoGEmmrt, null), 3, null);
        }
    }

    public static final class Fragment implements Function1<AbstractC43238rlX, Unit> {
        public static final Fragment KWHzl = new Fragment();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            EZpvd(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public final void AuCTel() {
        AppCompatImageView appCompatImageView;
        fJNWhG();
        DbNXlk();
        ejfBZ();
        fARcdN();
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (appCompatImageView = heoGEmmrt.gEmmrt) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new AssistContent(appCompatImageView, 1000L, this));
    }

    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ LeaderBoardFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(View view, long j, LeaderBoardFragment leaderBoardFragment) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = leaderBoardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.FILTER_ICON, null, null, false, 14, null);
                LeaderBoardFragment leaderBoardFragment = this.copydefault;
                leaderBoardFragment.EZpvd(leaderBoardFragment.djBIcL().KWHzl());
            }
        }
    }

    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ LeaderBoardFragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(View view, long j, LeaderBoardFragment leaderBoardFragment) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = leaderBoardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LeaderBoardSortModel leaderBoardSortModelEZpvd = this.KWHzl.djBIcL().AEQbTJ().getValue().EZpvd();
                if (leaderBoardSortModelEZpvd != null) {
                    RankingSortType rankingSortType = RankingSortType.RANKING;
                    LeaderBoardFragment leaderBoardFragment = this.KWHzl;
                    LeaderBoardFragment.startSettingFragment$default(leaderBoardFragment, rankingSortType, leaderBoardSortModelEZpvd, null, leaderBoardFragment.new SharedElementCallback(), "DEXMarket_SmartMoney_Ranking_sort_View", this.KWHzl.new ComponentCallbacks(), 4, null);
                }
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ LeaderBoardFragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, LeaderBoardFragment leaderBoardFragment) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = leaderBoardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/copy-trade"), C56423yEv.EZpvd(C56390yDp.OLrzqt("tab", 0)), Fragment.KWHzl);
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ LeaderBoardFragment AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, LeaderBoardFragment leaderBoardFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = leaderBoardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                LeaderBoardSortModel leaderBoardSortModelAEQbTJ = this.AEQbTJ.djBIcL().AEQbTJ().getValue().AEQbTJ();
                if (leaderBoardSortModelAEQbTJ != null) {
                    RankingSortType rankingSortType = RankingSortType.CATEGORY;
                    LeaderBoardFragment leaderBoardFragment = this.AEQbTJ;
                    LeaderBoardFragment.startSettingFragment$default(leaderBoardFragment, rankingSortType, leaderBoardSortModelAEQbTJ, null, leaderBoardFragment.new FragmentManager(), "DEXMarket_SmartMoney_Ranking_FilterBy_View", this.AEQbTJ.new LoaderManager(), 4, null);
                }
            }
        }
    }

    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ LeaderBoardFragment EZpvd;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(View view, long j, LeaderBoardFragment leaderBoardFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = leaderBoardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LeaderBoardSortModel leaderBoardSortModelOLrzqt = this.EZpvd.djBIcL().AEQbTJ().getValue().OLrzqt();
                if (leaderBoardSortModelOLrzqt != null) {
                    RankingSortType rankingSortType = RankingSortType.DURATION;
                    LeaderBoardFragment leaderBoardFragment = this.EZpvd;
                    LeaderBoardFragment.startSettingFragment$default(leaderBoardFragment, rankingSortType, leaderBoardSortModelOLrzqt, null, leaderBoardFragment.new VoiceInteractor(), "DEXMarket_SmartMoney_Ranking_Duration_View", this.EZpvd.new TaskStackBuilder(), 4, null);
                }
            }
        }
    }

    public final void EZpvd(LeaderBoardFilterModel leaderBoardFilterModel) {
        C25688jCr.Companion.AEQbTJ(leaderBoardFilterModel, new Function1() { // from class: o.jCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LeaderBoardFragment.AEQbTJ(this.EZpvd, (LeaderBoardFilterModel) obj);
            }
        }).show(getParentFragmentManager(), "javaClass");
    }

    public static final Unit AEQbTJ(LeaderBoardFragment leaderBoardFragment, LeaderBoardFilterModel leaderBoardFilterModel) {
        if (leaderBoardFilterModel != null) {
            leaderBoardFragment.djBIcL().EZpvd(leaderBoardFilterModel);
        }
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        C54989xbV c54989xbV;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.DbNXlk) == null) {
            return;
        }
        EZpvd(c54989xbV);
        ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
        ViewGroup.LayoutParams layoutParams = imageViewOLrzqt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.width = C55298xhM.dpInt$default(14, (Context) null, 1, (Object) null);
            marginLayoutParams.height = C55298xhM.dpInt$default(14, (Context) null, 1, (Object) null);
            imageViewOLrzqt.setLayoutParams(marginLayoutParams);
        }
        imageViewOLrzqt.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.aPFruk));
        c54989xbV.setOnClickListener(new ComponentName(c54989xbV, 1000L, this));
    }

    public static final class ComponentCallbacks implements Function1<LeaderBoardSortModel, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LeaderBoardSortModel leaderBoardSortModel) {
            OLrzqt(leaderBoardSortModel);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LeaderBoardSortModel leaderBoardSortModel) {
            Intrinsics.checkNotNullParameter(leaderBoardSortModel, "");
            LeaderBoardFragment.this.djBIcL().OLrzqt(leaderBoardSortModel);
            C29408ktA.trackSmartMoneyRankingSortClick$default(C29408ktA.KWHzl, leaderBoardSortModel.getFilterId(), null, null, 6, null);
        }
    }

    public static final class SharedElementCallback implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C54989xbV c54989xbV;
            hEO heoGEmmrt = LeaderBoardFragment.this.gEmmrt();
            if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.DbNXlk) == null) {
                return;
            }
            c54989xbV.setSelected(false);
        }
    }

    public final void DbNXlk() {
        C54989xbV c54989xbV;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.OLrzqt) == null) {
            return;
        }
        EZpvd(c54989xbV);
        c54989xbV.setOnClickListener(new PendingIntent(c54989xbV, 1000L, this));
    }

    public static final class FragmentManager implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C54989xbV c54989xbV;
            hEO heoGEmmrt = LeaderBoardFragment.this.gEmmrt();
            if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.OLrzqt) == null) {
                return;
            }
            c54989xbV.setSelected(false);
        }
    }

    public static final class LoaderManager implements Function1<LeaderBoardSortModel, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LeaderBoardSortModel leaderBoardSortModel) {
            OLrzqt(leaderBoardSortModel);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LeaderBoardSortModel leaderBoardSortModel) {
            Intrinsics.checkNotNullParameter(leaderBoardSortModel, "");
            LeaderBoardFragment.this.djBIcL().OLrzqt(leaderBoardSortModel);
            C29408ktA.trackSmartMoneyRankingSortClick$default(C29408ktA.KWHzl, null, null, leaderBoardSortModel.getFilterId(), 3, null);
        }
    }

    public final void fARcdN() {
        C54989xbV c54989xbV;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.AuCTel) == null) {
            return;
        }
        EZpvd(c54989xbV);
        c54989xbV.setOnClickListener(new View.OnClickListener() { // from class: o.jCM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                LeaderBoardFragment.copydefault(this.copydefault, view);
            }
        });
    }

    public static final void copydefault(LeaderBoardFragment leaderBoardFragment, View view) {
        leaderBoardFragment.djBIcL().isConnected();
    }

    public final void ejfBZ() {
        C54989xbV c54989xbV;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.copydefault) == null) {
            return;
        }
        EZpvd(c54989xbV);
        c54989xbV.setOnClickListener(new PictureInPictureParams(c54989xbV, 1000L, this));
    }

    public static final class TaskStackBuilder implements Function1<LeaderBoardSortModel, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(LeaderBoardSortModel leaderBoardSortModel) {
            OLrzqt(leaderBoardSortModel);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(LeaderBoardSortModel leaderBoardSortModel) {
            Intrinsics.checkNotNullParameter(leaderBoardSortModel, "");
            LeaderBoardFragment.this.djBIcL().OLrzqt(leaderBoardSortModel);
            C29408ktA.trackSmartMoneyRankingSortClick$default(C29408ktA.KWHzl, null, leaderBoardSortModel.getFilterId(), null, 5, null);
        }
    }

    public static final class VoiceInteractor implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C54989xbV c54989xbV;
            hEO heoGEmmrt = LeaderBoardFragment.this.gEmmrt();
            if (heoGEmmrt == null || (c54989xbV = heoGEmmrt.copydefault) == null) {
                return;
            }
            c54989xbV.setSelected(false);
        }
    }

    private final void uzCIH() {
        hDKMBd();
        if (gEmmrt() != null) {
            C25390ivn.collectOnViewLifecycle$default(this, djBIcL().AEQbTJ(), null, new ActionBar(), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, djBIcL().AYXKKw(), null, new TaskDescription(), 2, null);
            C25390ivn.collectOnViewLifecycle$default(this, djBIcL().valueOf(), null, new Activity(), 2, null);
        }
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(C25702jDe c25702jDe, Continuation<? super Unit> continuation) {
            AppCompatImageView appCompatImageView;
            LinearLayout linearLayout;
            AppCompatImageView appCompatImageView2;
            C54989xbV c54989xbV;
            C54989xbV c54989xbV2;
            C54989xbV c54989xbV3;
            C54989xbV c54989xbV4;
            AppCompatImageView appCompatImageView3;
            LinearLayout linearLayout2;
            if (c25702jDe.AEQbTJ() != null) {
                hEO heoGEmmrt = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt != null && (linearLayout2 = heoGEmmrt.EZpvd) != null) {
                    linearLayout2.setVisibility(0);
                }
                hEO heoGEmmrt2 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt2 != null && (appCompatImageView3 = heoGEmmrt2.gEmmrt) != null) {
                    appCompatImageView3.setVisibility(0);
                }
                hEO heoGEmmrt3 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt3 != null && (c54989xbV4 = heoGEmmrt3.OLrzqt) != null) {
                    c54989xbV4.EZpvd().setText(c25702jDe.AEQbTJ().getFilterLabel());
                }
                hEO heoGEmmrt4 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt4 != null && (c54989xbV3 = heoGEmmrt4.DbNXlk) != null) {
                    TextView textViewEZpvd = c54989xbV3.EZpvd();
                    LeaderBoardSortModel leaderBoardSortModelEZpvd = c25702jDe.EZpvd();
                    textViewEZpvd.setText((leaderBoardSortModelEZpvd != null ? leaderBoardSortModelEZpvd.getLabelAliasName() : null) + " ");
                }
                hEO heoGEmmrt5 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt5 != null && (c54989xbV2 = heoGEmmrt5.copydefault) != null) {
                    TextView textViewEZpvd2 = c54989xbV2.EZpvd();
                    LeaderBoardSortModel leaderBoardSortModelOLrzqt = c25702jDe.OLrzqt();
                    textViewEZpvd2.setText(leaderBoardSortModelOLrzqt != null ? leaderBoardSortModelOLrzqt.getLabelAliasName() : null);
                }
                hEO heoGEmmrt6 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt6 != null && (c54989xbV = heoGEmmrt6.AuCTel) != null) {
                    LeaderBoardFragment leaderBoardFragment = LeaderBoardFragment.this;
                    C25701jDd c25701jDdKWHzl = c25702jDe.KWHzl();
                    if (c25701jDdKWHzl != null) {
                        c54989xbV.EZpvd().setText(c25701jDdKWHzl.copydefault());
                        jCC jcc = leaderBoardFragment.AkhnZx;
                        if (jcc != null) {
                            jcc.EZpvd(c25701jDdKWHzl.OLrzqt());
                        }
                    }
                }
                hEO heoGEmmrt7 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt7 != null && (appCompatImageView2 = heoGEmmrt7.gEmmrt) != null) {
                    appCompatImageView2.setImageDrawable(C33070mpX.KWHzl(c25702jDe.AYXKKw() ? C52761wXj.TaskDescription.fVBECu : C52761wXj.TaskDescription.GVpNrs));
                }
            } else {
                hEO heoGEmmrt8 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt8 != null && (linearLayout = heoGEmmrt8.EZpvd) != null) {
                    linearLayout.setVisibility(8);
                }
                hEO heoGEmmrt9 = LeaderBoardFragment.this.gEmmrt();
                if (heoGEmmrt9 != null && (appCompatImageView = heoGEmmrt9.gEmmrt) != null) {
                    appCompatImageView.setVisibility(8);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(C25706jDi c25706jDi, Continuation<? super Unit> continuation) {
            LeaderBoardFragment.this.copydefault(c25706jDi);
            return Unit.INSTANCE;
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC25708jDk abstractC25708jDk, Continuation<? super Unit> continuation) {
            if (abstractC25708jDk instanceof AbstractC25708jDk.StateListAnimator) {
                LeaderBoardFragment.this.zsXlph();
            } else if (abstractC25708jDk instanceof AbstractC25708jDk.Application) {
                LeaderBoardFragment.this.fIwbmz();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) LeaderBoardFragment.this, false, (String) null, 2, (Object) null);
            } else if (abstractC25708jDk instanceof AbstractC25708jDk.ActionBar) {
                AbstractC25708jDk.ActionBar actionBar = (AbstractC25708jDk.ActionBar) abstractC25708jDk;
                LeaderBoardFragment.this.EZpvd(actionBar.OLrzqt(), actionBar.AEQbTJ(), actionBar.copydefault(), actionBar.EZpvd());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) LeaderBoardFragment.this, true, (String) null, 2, (Object) null);
            } else if (abstractC25708jDk instanceof AbstractC25708jDk.Activity) {
                LeaderBoardFragment.this.getNewProxyInstance();
            } else {
                LeaderBoardFragment.this.KWHzl(true);
            }
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(List<LeaderBoardCardUIModel> list, int i, int i2, String str) {
        RecyclerView recyclerView;
        C55173xeu c55173xeu;
        C33546myW c33546myW;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null && (c33546myW = heoGEmmrt.ejfBZ) != null) {
            c33546myW.setVisibility(0);
        }
        jCC jcc = this.AkhnZx;
        if (jcc != null) {
            jcc.OLrzqt(list, i, i2, str);
        }
        hEO heoGEmmrt2 = gEmmrt();
        if (heoGEmmrt2 != null && (c55173xeu = heoGEmmrt2.valueOf) != null) {
            c55173xeu.setVisibility(8);
        }
        hEO heoGEmmrt3 = gEmmrt();
        if (heoGEmmrt3 != null && (recyclerView = heoGEmmrt3.isConnected) != null) {
            recyclerView.setVisibility(0);
        }
        KWHzl(false);
    }

    private final void EZpvd(C54989xbV c54989xbV) {
        c54989xbV.setStyle(2);
        c54989xbV.setOKDSSize(-20);
    }

    public static /* synthetic */ void startSettingFragment$default(LeaderBoardFragment leaderBoardFragment, RankingSortType rankingSortType, LeaderBoardSortModel leaderBoardSortModel, String str, Function0 function0, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        leaderBoardFragment.KWHzl(rankingSortType, leaderBoardSortModel, str, function0, str2, function1);
    }

    public final void KWHzl(RankingSortType rankingSortType, LeaderBoardSortModel leaderBoardSortModel, String str, Function0<Unit> function0, String str2, Function1<? super LeaderBoardSortModel, Unit> function1) {
        jCR.Companion.OLrzqt(rankingSortType, leaderBoardSortModel, str, function1, str2, function0).show(getParentFragmentManager(), "javaClass");
    }

    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (!LeaderBoardFragment.this.AYXKKw) {
                if (LeaderBoardFragment.this.AkhnZx != null) {
                    LeaderBoardFragment.this.copydefault(recyclerView);
                }
                LeaderBoardFragment.this.AYXKKw = true;
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int itemCount = linearLayoutManager.getItemCount();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (itemCount <= 0 || iFindLastVisibleItemPosition < itemCount - 1) {
                return;
            }
            LeaderBoardFragment.this.djBIcL().DbNXlk();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                LeaderBoardFragment.this.djBIcL().copydefault();
            } else {
                LeaderBoardFragment.this.copydefault(recyclerView);
            }
        }
    }

    private final void hDKMBd() {
        RecyclerView recyclerView;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (recyclerView = heoGEmmrt.isConnected) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new Application());
    }

    public final void copydefault(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindLastVisibleItemPosition <= iFindFirstVisibleItemPosition) {
            return;
        }
        djBIcL().KWHzl(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition + 1);
    }

    public final void fetchVPNInfo() {
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null) {
            heoGEmmrt.fetchVPNInfo.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
            heoGEmmrt.ejfBZ.setNoMoreDataEffective(true);
            heoGEmmrt.ejfBZ.AhwBna(false);
            heoGEmmrt.ejfBZ.OLrzqt((InterfaceC57901yrE) new StateListAnimator());
        }
    }

    public static final class StateListAnimator implements InterfaceC57901yrE {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        }

        public StateListAnimator() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            LeaderBoardFragment.this.getFieldNames();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFieldNames() {
        C55113xdn c55113xdn;
        hEO heoGEmmrt;
        C55113xdn c55113xdn2;
        C33546myW c33546myW;
        hEO heoGEmmrt2 = gEmmrt();
        if (heoGEmmrt2 != null && (c33546myW = heoGEmmrt2.ejfBZ) != null) {
            C57589ylK.KWHzl(c33546myW, false);
        }
        hEO heoGEmmrt3 = gEmmrt();
        if (heoGEmmrt3 != null && (c55113xdn = heoGEmmrt3.AYXKKw) != null && c55113xdn.getVisibility() == 0 && (heoGEmmrt = gEmmrt()) != null && (c55113xdn2 = heoGEmmrt.AYXKKw) != null) {
            c55113xdn2.setVisibility(8);
        }
        LeaderBoardViewModel.fetchBoardContent$default(djBIcL(), false, false, true, 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
        if (this.AhwBna) {
            this.AhwBna = false;
        } else {
            LeaderBoardViewModel.fetchBoardContent$default(djBIcL(), false, false, true, 3, null);
        }
    }

    private final void OLrzqt(String str) {
        String message;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Context context = getContext();
            if (context != null) {
                context.startActivity(intent);
            }
        } catch (Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new Exception("openSystemWebView:" + message + ">>>>>>>>" + str));
        }
    }

    public final void AEQbTJ(String str) {
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl = djBIcL().KWHzl();
        String strGEmmrt = leaderBoardFilterModelKWHzl != null ? leaderBoardFilterModelKWHzl.gEmmrt() : null;
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            C25352ivB.EZpvd(abstractActivityC33041mov, str, strGEmmrt);
        }
    }

    public final void values() {
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null) {
            heoGEmmrt.isConnected.setLayoutManager(new LinearLayoutManager(requireContext()));
            this.AkhnZx = new jCC(new Function1() { // from class: o.jCP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LeaderBoardFragment.EZpvd(this.AEQbTJ, (jCJ) obj);
                }
            });
            heoGEmmrt.isConnected.setLayoutManager(new LinearLayoutManager(requireContext()));
            heoGEmmrt.isConnected.setAdapter(this.AkhnZx);
            heoGEmmrt.isConnected.setItemAnimator(null);
        }
    }

    public static final Unit EZpvd(LeaderBoardFragment leaderBoardFragment, jCJ jcj) {
        Intrinsics.checkNotNullParameter(jcj, "");
        if (jcj instanceof jCJ.ActionBar) {
            leaderBoardFragment.OLrzqt(((jCJ.ActionBar) jcj).AEQbTJ());
        } else if (jcj instanceof jCJ.Activity) {
            AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.ActionBar.copydefault);
            jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.ADDRESS_INFO_CARD, null, null, false, 14, null);
            leaderBoardFragment.AEQbTJ(((jCJ.Activity) jcj).AEQbTJ().getWalletAddress());
        } else {
            if (jcj instanceof jCJ.TaskDescription) {
                jCJ.TaskDescription taskDescription = (jCJ.TaskDescription) jcj;
                LeaderBoardCardUIModel leaderBoardCardUIModelCopydefault = taskDescription.copydefault();
                boolean zIsBookmarked = taskDescription.copydefault().isBookmarked();
                jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.FOLLOW_UNFOLLOW_ICON, null, null, false, 14, null);
                LifecycleOwner viewLifecycleOwner = leaderBoardFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new LeaderBoardFragment$loadRecyclerView$1$1$1(leaderBoardFragment, leaderBoardCardUIModelCopydefault, zIsBookmarked, null), 3, null);
            } else {
                if (!(jcj instanceof jCJ.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.COPY_BUTTON, null, null, false, 14, null);
                if (leaderBoardFragment.djBIcL().AhwBna()) {
                    gTI gtiValueOf = leaderBoardFragment.valueOf();
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(leaderBoardFragment);
                    ActivityResultLauncher<gSN.Application> activityResultLauncher = leaderBoardFragment.valueOf;
                    LeaderBoardFilterModel leaderBoardFilterModelKWHzl = leaderBoardFragment.djBIcL().KWHzl();
                    gtiValueOf.EZpvd(lifecycleScope, activityResultLauncher, (64 & 4) != 0 ? null : leaderBoardFilterModelKWHzl != null ? leaderBoardFilterModelKWHzl.gEmmrt() : null, (64 & 8) != 0 ? null : null, (64 & 16) != 0 ? null : ((jCJ.Application) jcj).KWHzl().getWalletAddress(), (64 & 32) != 0 ? DexTrackEventParameter.EditStrategyFrom.DASHBOARD : DexTrackEventParameter.EditStrategyFrom.LEADERBOARD, (64 & 64) != 0 ? null : Integer.valueOf(leaderBoardFragment.djBIcL().EZpvd().getValue().intValue()));
                } else {
                    InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
                    FragmentActivity fragmentActivityRequireActivity = leaderBoardFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/copy-trade"), C56424yEw.KWHzl(), new Function1() { // from class: o.jCI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return LeaderBoardFragment.AEQbTJ((AbstractC43238rlX) obj);
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(C25706jDi c25706jDi) {
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null) {
            C55113xdn c55113xdn = heoGEmmrt.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(c25706jDi.KWHzl() ? 0 : 8);
            C55173xeu c55173xeu = heoGEmmrt.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(c25706jDi.OLrzqt() != null ? 0 : 8);
            RecyclerView recyclerView = heoGEmmrt.isConnected;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility((c25706jDi.KWHzl() || c25706jDi.OLrzqt() != null) ? 8 : 0);
        }
    }

    public final void fIwbmz() {
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null) {
            C33546myW c33546myW = heoGEmmrt.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(8);
            heoGEmmrt.valueOf.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
            heoGEmmrt.valueOf.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
            heoGEmmrt.valueOf.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
            heoGEmmrt.valueOf.setEmptyTypeImage(8);
            heoGEmmrt.valueOf.setRetryClickListener(new View.OnClickListener() { // from class: o.jCU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    LeaderBoardFragment.AEQbTJ(this.EZpvd, view);
                }
            });
            heoGEmmrt.valueOf.setVisibility(0);
            heoGEmmrt.isConnected.setVisibility(8);
            KWHzl(false);
        }
    }

    public static final void AEQbTJ(LeaderBoardFragment leaderBoardFragment, View view) {
        leaderBoardFragment.djBIcL().OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zsXlph() {
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null) {
            C33546myW c33546myW = heoGEmmrt.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(8);
            heoGEmmrt.valueOf.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.isConnected));
            heoGEmmrt.valueOf.setEmptyTypeImage(6);
            heoGEmmrt.valueOf.setTitle("");
            heoGEmmrt.valueOf.setRetry("");
            heoGEmmrt.valueOf.setVisibility(0);
            heoGEmmrt.isConnected.setVisibility(8);
            KWHzl(false);
        }
    }

    public final void getNewProxyInstance() {
        KWHzl(true);
        final hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt != null) {
            C33546myW c33546myW = heoGEmmrt.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(8);
            heoGEmmrt.valueOf.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.DbNXlk));
            heoGEmmrt.valueOf.setSubTitle((CharSequence) "");
            heoGEmmrt.valueOf.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
            heoGEmmrt.valueOf.setEmptyTypeImage(7);
            heoGEmmrt.valueOf.setRetryClickListener(new View.OnClickListener() { // from class: o.jCQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    LeaderBoardFragment.KWHzl(heoGEmmrt, this, view);
                }
            });
            heoGEmmrt.valueOf.setVisibility(0);
            heoGEmmrt.isConnected.setVisibility(8);
            KWHzl(false);
            heoGEmmrt.ejfBZ.djBIcL(false);
        }
    }

    public static final void KWHzl(hEO heo, LeaderBoardFragment leaderBoardFragment, View view) {
        heo.ejfBZ.djBIcL(true);
        LeaderBoardViewModel.fetchBoardContent$default(leaderBoardFragment.djBIcL(), true, false, false, 6, null);
    }

    public final void KWHzl(boolean z) {
        C55113xdn c55113xdn;
        hEO heoGEmmrt = gEmmrt();
        if (heoGEmmrt == null || (c55113xdn = heoGEmmrt.AYXKKw) == null) {
            return;
        }
        c55113xdn.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }
}
