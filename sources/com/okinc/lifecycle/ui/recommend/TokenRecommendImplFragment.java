package com.okinc.lifecycle.ui.recommend;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendClickItemBean;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendContentStyle;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendInfoBean;
import com.okinc.lifecycle.api.business.recommend.bean.TokenRecommendTitleAlign;
import com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment;
import com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.TaskDescription;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32998moE;
import o.AbstractC38077pLj;
import o.AbstractC38172pOx;
import o.C33062mpP;
import o.C33570myu;
import o.C38072pLe;
import o.C38160pOl;
import o.C38170pOv;
import o.C43246rlf;
import o.C43316rmw;
import o.C52761wXj;
import o.C55298xhM;
import o.C56392yDr;
import o.C56524yIo;
import o.C56548yJl;
import o.C58114yvF;
import o.InterfaceC56387yDm;
import o.pKF;
import o.pKK;
import o.pKX;
import o.pKY;
import o.pKZ;
import o.pMY;
import o.pOC;
import o.pPN;
import o.pPR;
import o.yCM;
import o.yHO;
import o.yHT;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
public final class TokenRecommendImplFragment extends AbstractC32998moE implements pPR {
    public AbstractC38077pLj AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public boolean KWHzl;
    public boolean copydefault;

    @yCM
    public C38160pOl tokenRecommendViewModelFactory;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final String EZpvd = "data";
    public final int OLrzqt = pKK.ActionBar.OLrzqt;
    public final List<pKX> gEmmrt = new ArrayList();
    public final C43316rmw djBIcL = new C43316rmw();
    public final pKY valueOf = ((pMY) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), pMY.class)).QwvEab();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(TokenRecommendImplFragment tokenRecommendImplFragment, List list, int i, Composer composer, int i2) {
        tokenRecommendImplFragment.copydefault(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(TokenRecommendImplFragment tokenRecommendImplFragment, pKX pkx, Modifier modifier, Function0 function0, int i, Composer composer, int i2) {
        tokenRecommendImplFragment.OLrzqt(pkx, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit KWHzl(TokenRecommendImplFragment tokenRecommendImplFragment, C38072pLe c38072pLe, int i, Composer composer, int i2) {
        tokenRecommendImplFragment.OLrzqt(c38072pLe, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Unit OLrzqt(TokenRecommendImplFragment tokenRecommendImplFragment, Modifier modifier, float f, float f2, float f3, long j, Function2 function2, int i, Composer composer, int i2) {
        tokenRecommendImplFragment.AEQbTJ(modifier, f, f2, f3, j, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public TokenRecommendImplFragment() {
        Function0 function0 = new Function0() { // from class: o.pPZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TokenRecommendImplFragment.djBIcL(this.EZpvd);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C38072pLe.class), new Function0<ViewModelStore>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final TokenRecommendImplFragment KWHzl(@NotNull TokenRecommendInfoBean tokenRecommendInfoBean) {
            Intrinsics.checkNotNullParameter(tokenRecommendInfoBean, "");
            TokenRecommendImplFragment tokenRecommendImplFragment = new TokenRecommendImplFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(tokenRecommendImplFragment.EZpvd, tokenRecommendInfoBean);
            tokenRecommendImplFragment.setArguments(bundle);
            return tokenRecommendImplFragment;
        }
    }

    public static final ViewModelProvider.Factory djBIcL(TokenRecommendImplFragment tokenRecommendImplFragment) {
        return tokenRecommendImplFragment.EZpvd();
    }

    public final C38072pLe KWHzl() {
        return (C38072pLe) this.AhwBna.getValue();
    }

    public final C38160pOl EZpvd() {
        C38160pOl c38160pOl = this.tokenRecommendViewModelFactory;
        if (c38160pOl != null) {
            return c38160pOl;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = C43246rlf.OLrzqt.valueOf().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        ((pMY) C58114yvF.OLrzqt(applicationContext, pMY.class)).KWHzl(this);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = AbstractC38077pLj.KWHzl(view);
        TokenRecommendInfoBean tokenRecommendInfoBean = null;
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                tokenRecommendInfoBean = (TokenRecommendInfoBean) arguments.getParcelable(this.EZpvd, TokenRecommendInfoBean.class);
            }
        } else {
            Bundle arguments2 = getArguments();
            TokenRecommendInfoBean tokenRecommendInfoBean2 = arguments2 != null ? (TokenRecommendInfoBean) arguments2.getParcelable(this.EZpvd) : null;
            if (tokenRecommendInfoBean2 instanceof TokenRecommendInfoBean) {
                tokenRecommendInfoBean = tokenRecommendInfoBean2;
            }
        }
        if (tokenRecommendInfoBean != null) {
            AEQbTJ(tokenRecommendInfoBean);
            EZpvd(tokenRecommendInfoBean);
            copydefault();
        }
    }

    public final void AEQbTJ(TokenRecommendInfoBean tokenRecommendInfoBean) {
        this.KWHzl = tokenRecommendInfoBean.getContentStyleType() == TokenRecommendContentStyle.HORIZONTAL_SCROLL;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenRecommendImplFragment$initData$1(this, tokenRecommendInfoBean, null), 3, null);
    }

    public final void EZpvd(TokenRecommendInfoBean tokenRecommendInfoBean) {
        AbstractC38077pLj abstractC38077pLj = this.AYXKKw;
        if (abstractC38077pLj != null) {
            abstractC38077pLj.KWHzl.setGravity(tokenRecommendInfoBean.getTitleAlignType() == TokenRecommendTitleAlign.ALIGN_LEFT ? 8388611 : 17);
            RecyclerView recyclerView = abstractC38077pLj.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(this.KWHzl ^ true ? 0 : 8);
            if (this.KWHzl) {
                ComposeView composeView = abstractC38077pLj.EZpvd;
                composeView.setContent(ComposableLambdaKt.composableLambdaInstance(870908207, true, new Activity(composeView, this)));
                Intrinsics.copydefault(composeView);
            } else {
                this.djBIcL.register(pKX.class, new pPN(this, this.valueOf));
                this.djBIcL.setItems(this.gEmmrt);
                int iAEQbTJ = (((C33570myu.AEQbTJ() - (C55298xhM.dp2px$default(16.0f, null, 1, null) * 2)) - (C55298xhM.dp2px$default(16.0f, null, 1, null) * 2)) - (C55298xhM.dp2px$default(130.0f, null, 1, null) * 3)) / 2;
                abstractC38077pLj.KWHzl.setPadding(C56548yJl.copydefault(iAEQbTJ, 0), 0, C56548yJl.copydefault(iAEQbTJ, 0), 0);
                abstractC38077pLj.AEQbTJ.setPadding(C56548yJl.copydefault(iAEQbTJ, 0), 0, C56548yJl.copydefault(iAEQbTJ, 0), 0);
                abstractC38077pLj.AEQbTJ.setLayoutManager(new GridLayoutManager(requireContext(), 3));
                abstractC38077pLj.AEQbTJ.addItemDecoration(new StateListAnimator());
                abstractC38077pLj.AEQbTJ.setItemAnimator(null);
            }
            abstractC38077pLj.AEQbTJ.setAdapter(this.djBIcL);
        }
    }

    public static final class Activity implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ ComposeView KWHzl;
        public final /* synthetic */ TokenRecommendImplFragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ComposeView composeView, TokenRecommendImplFragment tokenRecommendImplFragment) {
            this.KWHzl = composeView;
            this.OLrzqt = tokenRecommendImplFragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(870908207, i, -1, "com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.initView.<anonymous>.<anonymous>.<anonymous> (TokenRecommendImplFragment.kt:143)");
                }
                this.KWHzl.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
                TokenRecommendImplFragment tokenRecommendImplFragment = this.OLrzqt;
                tokenRecommendImplFragment.OLrzqt(tokenRecommendImplFragment.KWHzl(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public static final class StateListAnimator extends RecyclerView.ItemDecoration {
        public final int KWHzl = C55298xhM.dp2px$default(5.0f, null, 1, null);
        public final int AEQbTJ = C55298xhM.dp2px$default(11.0f, null, 1, null);

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % 3;
            if (childAdapterPosition == 0) {
                rect.set(0, 0, this.AEQbTJ, 0);
                return;
            }
            if (childAdapterPosition == 1) {
                int i = this.KWHzl;
                rect.set(i, 0, i, 0);
            } else {
                if (childAdapterPosition != 2) {
                    return;
                }
                rect.set(this.AEQbTJ, 0, 0, 0);
            }
        }
    }

    private final void copydefault() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TokenRecommendImplFragment$loadData$1(this, null), 3, null);
    }

    public final void EZpvd(pKX pkx) {
        pKF pkf = (pKF) C33062mpP.EZpvd(this, pKF.class);
        if (pkf != null) {
            pkf.AEQbTJ(new TokenRecommendClickItemBean(pkx.AhwBna(), pkx.gEmmrt(), pkx.AEQbTJ()));
        }
    }

    @Override // o.pPR
    public void AEQbTJ(@NotNull pKX pkx) {
        Intrinsics.checkNotNullParameter(pkx, "");
        KWHzl().AEQbTJ(pkx);
        EZpvd(pkx);
    }

    public final Modifier AEQbTJ(Modifier modifier, float f, boolean z, boolean z2, float f2, float f3) {
        Modifier.Companion companion = Modifier.Companion;
        float f4 = z ? f3 : f;
        if (!z2) {
            f2 = Dp.m5414constructorimpl(0);
        }
        return modifier.then(PaddingKt.m675paddingqDBjuR0$default(companion, f2, 0.0f, f4, 0.0f, 10, null));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView recyclerView;
        super.onDestroyView();
        AbstractC38077pLj abstractC38077pLj = this.AYXKKw;
        if (abstractC38077pLj != null && (recyclerView = abstractC38077pLj.AEQbTJ) != null) {
            recyclerView.setAdapter(null);
        }
        this.AYXKKw = null;
        this.gEmmrt.clear();
        this.copydefault = false;
    }

    public final void OLrzqt(final C38072pLe c38072pLe, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(289952641);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(c38072pLe) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(289952641, i2, -1, "com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.RecommendToken (TokenRecommendImplFragment.kt:251)");
            }
            copydefault(copydefault((State<pKZ>) SnapshotStateKt.collectAsState(c38072pLe.KWHzl(), null, composerStartRestartGroup, 0, 1)).OLrzqt(), composerStartRestartGroup, i2 & WalletImportError.ERROR_CODE_AA_EXIST);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.pPU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return TokenRecommendImplFragment.KWHzl(this.KWHzl, c38072pLe, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public final void copydefault(final List<pKX> list, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1196259258);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1196259258, i2, -1, "com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.RecommendTokenList (TokenRecommendImplFragment.kt:257)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(Modifier.Companion, null, false, 3, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWrapContentHeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            composerStartRestartGroup.startReplaceableGroup(1964808459);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | zChangedInstance) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TokenRecommendImplFragment$RecommendTokenList$1$1$1(lazyListStateRememberLazyListState, this, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1964821546);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(list);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance2 | zChangedInstance3) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: o.pPS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return TokenRecommendImplFragment.AEQbTJ(list, this, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyRow(null, lazyListStateRememberLazyListState, null, false, null, null, null, false, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 253);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.pPW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return TokenRecommendImplFragment.KWHzl(this.EZpvd, list, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit AEQbTJ(final List list, final TokenRecommendImplFragment tokenRecommendImplFragment, LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "");
        final Function2 function2 = new Function2() { // from class: o.pPV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return TokenRecommendImplFragment.OLrzqt(((java.lang.Integer) obj).intValue(), (pKX) obj2);
            }
        };
        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$RecommendTokenList$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$RecommendTokenList$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new yHT<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment$RecommendTokenList$lambda$12$lambda$11$lambda$10$$inlined$itemsIndexed$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // o.yHT
            public /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(lazyItemScope, "");
                if ((i2 & 14) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & WalletImportError.ERROR_CODE_AA_EXIST) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & 731) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
                }
                pKX pkx = (pKX) list.get(i);
                composer.startReplaceableGroup(2105500817);
                boolean z = i == 0;
                boolean z2 = i == list.size() - 1;
                TokenRecommendImplFragment tokenRecommendImplFragment2 = tokenRecommendImplFragment;
                Modifier modifierAEQbTJ = tokenRecommendImplFragment2.AEQbTJ(Modifier.Companion, Dp.m5414constructorimpl(8), (8 & 2) != 0 ? false : z2, (8 & 4) != 0 ? false : z, (8 & 8) != 0 ? Dp.m5414constructorimpl(24) : 0.0f, (8 & 16) != 0 ? Dp.m5414constructorimpl(0) : Dp.m5414constructorimpl(24));
                composer.startReplaceableGroup(1037767424);
                boolean zChangedInstance = composer.changedInstance(tokenRecommendImplFragment);
                boolean zChangedInstance2 = composer.changedInstance(pkx);
                Object objRememberedValue = composer.rememberedValue();
                if ((zChangedInstance | zChangedInstance2) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = tokenRecommendImplFragment.new TaskDescription(pkx);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                tokenRecommendImplFragment2.OLrzqt(pkx, modifierAEQbTJ, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Object OLrzqt(int i, pKX pkx) {
        Intrinsics.checkNotNullParameter(pkx, "");
        return Long.valueOf(pkx.AhwBna());
    }

    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ pKX KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(pKX pkx) {
            this.KWHzl = pkx;
        }

        public final void EZpvd() {
            TokenRecommendImplFragment.this.EZpvd(this.KWHzl);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.compose.foundation.ClickableKt.clickable-O2vRcR0$default(androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.Indication, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0, int, java.lang.Object):androidx.compose.ui.Modifier */
    public final void OLrzqt(final pKX pkx, final Modifier modifier, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(550085144);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(pkx) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(550085144, i2, -1, "com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.RecommendTokenItem (TokenRecommendImplFragment.kt:292)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(modifier, null, false, 3, null);
            composerStartRestartGroup.startReplaceableGroup(-2006683325);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            float f = 16;
            AEQbTJ(ClickableKt.m381clickableO2vRcR0$default(modifierWrapContentHeight$default, (MutableInteractionSource) objRememberedValue, null, false, null, null, function0, 28, null), Dp.m5414constructorimpl(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), Dp.m5414constructorimpl(f), Dp.m5414constructorimpl(f), ColorResources_androidKt.colorResource(C52761wXj.Activity.invokespecialaKhcqp, composerStartRestartGroup, 0), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1403532712, true, new ActionBar(pkx, this, context)), composerStartRestartGroup, ((i2 << 9) & 3670016) | 200112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.pPT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return TokenRecommendImplFragment.KWHzl(this.OLrzqt, pkx, modifier, function0, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final class ActionBar implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ pKX EZpvd;
        public final /* synthetic */ Context OLrzqt;
        public final /* synthetic */ TokenRecommendImplFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(pKX pkx, TokenRecommendImplFragment tokenRecommendImplFragment, Context context) {
            this.EZpvd = pkx;
            this.copydefault = tokenRecommendImplFragment;
            this.OLrzqt = context;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1403532712, i, -1, "com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.RecommendTokenItem.<anonymous> (TokenRecommendImplFragment.kt:307)");
                }
                pKX pkx = this.EZpvd;
                TokenRecommendImplFragment tokenRecommendImplFragment = this.copydefault;
                Context context = this.OLrzqt;
                composer.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.Companion;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.Companion;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM2783constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM2783constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 32;
                pOC.copydefault(SizeKt.m704height3ABfNKs(SizeKt.m723width3ABfNKs(companion, Dp.m5414constructorimpl(f)), Dp.m5414constructorimpl(f)), pkx.copydefault(), null, null, null, null, null, composer, 6, 124);
                TextStyle textStyleKWHzl = C38170pOv.KWHzl(C52761wXj.LoaderManager.zLjUOn, Integer.valueOf(C52761wXj.Activity.fdOvFl), composer, 0, 0);
                String strGEmmrt = pkx.gEmmrt();
                TextOverflow.Companion companion4 = TextOverflow.Companion;
                int iM5333getClipgIe3tQ8 = companion4.m5333getClipgIe3tQ8();
                TextUnitType.Companion companion5 = TextUnitType.Companion;
                C38170pOv.EZpvd(strGEmmrt, PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5414constructorimpl(8), 0.0f, 0.0f, 13, null), textStyleKWHzl, iM5333getClipgIe3tQ8, false, 1, 0, new AbstractC38172pOx.Application(TextUnitKt.m5607TextUnitanM5pPY(10.0f, companion5.m5628getSpUIouoOA()), null), composer, 224304, 64);
                Modifier modifierM675paddingqDBjuR0$default = PaddingKt.m675paddingqDBjuR0$default(companion, 0.0f, Dp.m5414constructorimpl(12), 0.0f, 0.0f, 13, null);
                composer.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM675paddingqDBjuR0$default);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM2783constructorimpl2 = Updater.m2783constructorimpl(composer);
                Updater.m2790setimpl(composerM2783constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m2790setimpl(composerM2783constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM2783constructorimpl2.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM2783constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM2783constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                yhoModifierMaterializerOf2.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                C38170pOv.EZpvd(pkx.KWHzl(), SizeKt.wrapContentHeight$default(SizeKt.m706heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5414constructorimpl(24), 0.0f, 2, null), companion2.getCenterVertically(), false, 2, null), C38170pOv.KWHzl(C52761wXj.LoaderManager.AxsJAY, Integer.valueOf(C52761wXj.Activity.Dmq), composer, 0, 0), companion4.m5333getClipgIe3tQ8(), false, 1, 0, new AbstractC38172pOx.Application(TextUnitKt.m5607TextUnitanM5pPY(10.0f, companion5.m5628getSpUIouoOA()), null), composer, 224304, 64);
                TextStyle textStyleKWHzl2 = C38170pOv.KWHzl(C52761wXj.LoaderManager.AwvSrB, Integer.valueOf(C52761wXj.Activity.Dmq), composer, 0, 0);
                C38170pOv.EZpvd(pkx.EZpvd(), SizeKt.wrapContentHeight$default(PaddingKt.m675paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5414constructorimpl(4), 0.0f, 0.0f, 13, null), companion2.getCenterVertically(), false, 2, null), textStyleKWHzl2.m4941copyv2rsoow((16777214 & 1) != 0 ? textStyleKWHzl2.spanStyle.m4882getColor0d7_KjU() : ColorKt.Color(tokenRecommendImplFragment.valueOf.AEQbTJ(context, pkx.OLrzqt())), (16777214 & 2) != 0 ? textStyleKWHzl2.spanStyle.m4883getFontSizeXSAIIZE() : 0L, (16777214 & 4) != 0 ? textStyleKWHzl2.spanStyle.getFontWeight() : null, (16777214 & 8) != 0 ? textStyleKWHzl2.spanStyle.m4884getFontStyle4Lr2A7w() : null, (16777214 & 16) != 0 ? textStyleKWHzl2.spanStyle.m4885getFontSynthesisZQGJjVo() : null, (16777214 & 32) != 0 ? textStyleKWHzl2.spanStyle.getFontFamily() : null, (16777214 & 64) != 0 ? textStyleKWHzl2.spanStyle.getFontFeatureSettings() : null, (16777214 & 128) != 0 ? textStyleKWHzl2.spanStyle.m4886getLetterSpacingXSAIIZE() : 0L, (16777214 & 256) != 0 ? textStyleKWHzl2.spanStyle.m4881getBaselineShift5SSeXJ0() : null, (16777214 & 512) != 0 ? textStyleKWHzl2.spanStyle.getTextGeometricTransform() : null, (16777214 & 1024) != 0 ? textStyleKWHzl2.spanStyle.getLocaleList() : null, (16777214 & 2048) != 0 ? textStyleKWHzl2.spanStyle.m4880getBackground0d7_KjU() : 0L, (16777214 & 4096) != 0 ? textStyleKWHzl2.spanStyle.getTextDecoration() : null, (16777214 & 8192) != 0 ? textStyleKWHzl2.spanStyle.getShadow() : null, (16777214 & 16384) != 0 ? textStyleKWHzl2.spanStyle.getDrawStyle() : null, (16777214 & 32768) != 0 ? textStyleKWHzl2.paragraphStyle.m4838getTextAlignbuA522U() : null, (16777214 & 65536) != 0 ? textStyleKWHzl2.paragraphStyle.m4840getTextDirectionmmuk1to() : null, (16777214 & 131072) != 0 ? textStyleKWHzl2.paragraphStyle.m4837getLineHeightXSAIIZE() : 0L, (16777214 & 262144) != 0 ? textStyleKWHzl2.paragraphStyle.getTextIndent() : null, (16777214 & 524288) != 0 ? textStyleKWHzl2.platformStyle : null, (16777214 & 1048576) != 0 ? textStyleKWHzl2.paragraphStyle.getLineHeightStyle() : null, (16777214 & 2097152) != 0 ? textStyleKWHzl2.paragraphStyle.m4835getLineBreakLgCVezo() : null, (16777214 & 4194304) != 0 ? textStyleKWHzl2.paragraphStyle.m4833getHyphensEaSxIns() : null, (16777214 & 8388608) != 0 ? textStyleKWHzl2.paragraphStyle.getTextMotion() : null), companion4.m5333getClipgIe3tQ8(), false, 1, 0, new AbstractC38172pOx.Application(TextUnitKt.m5607TextUnitanM5pPY(10.0f, companion5.m5628getSpUIouoOA()), null), composer, 224304, 64);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public final void AEQbTJ(final Modifier modifier, final float f, final float f2, final float f3, final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1966299848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1966299848, i2, -1, "com.okinc.lifecycle.ui.recommend.TokenRecommendImplFragment.RoundedBox (TokenRecommendImplFragment.kt:391)");
            }
            Modifier modifierM671padding3ABfNKs = PaddingKt.m671padding3ABfNKs(BackgroundKt.m349backgroundbw27NRU(SizeKt.m723width3ABfNKs(modifier, f), j, RoundedCornerShapeKt.m924RoundedCornerShape0680j_4(f2)), f3);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            yHO<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> yhoModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM671padding3ABfNKs);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2783constructorimpl = Updater.m2783constructorimpl(composerStartRestartGroup);
            Updater.m2790setimpl(composerM2783constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2790setimpl(composerM2783constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2783constructorimpl.getInserting() || !Intrinsics.EZpvd(composerM2783constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM2783constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM2783constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            yhoModifierMaterializerOf.invoke(SkippableUpdater.m2774boximpl(SkippableUpdater.m2775constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 15) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: o.pPQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return TokenRecommendImplFragment.OLrzqt(this.KWHzl, modifier, f, f2, f3, j, function2, i, (Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final pKZ copydefault(State<pKZ> state) {
        return state.getValue();
    }
}
