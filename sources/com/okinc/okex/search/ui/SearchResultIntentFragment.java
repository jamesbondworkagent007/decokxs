package com.okinc.okex.search.ui;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.common.ui.util.ViewsKt$afterLayoutStableHeight$heightFlow$1;
import com.okinc.okex.search.ui.SearchResultIntentFragment;
import com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter;
import com.okinc.okex.search.viewmodel.SearchResultIntentViewModel;
import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC44051sBn;
import o.AbstractC45841szG;
import o.AbstractC47355toV;
import o.ActivityC45850szP;
import o.C33070mpX;
import o.C34703nhO;
import o.C44052sBo;
import o.C44053sBp;
import o.C44711scA;
import o.C44997shV;
import o.C45363soQ;
import o.C45397soy;
import o.C47315tni;
import o.C54979xbL;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.C56524yIo;
import o.InterfaceC55228xfw;
import o.InterfaceC56387yDm;
import o.pUU;
import o.rVN;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SearchResultIntentFragment extends AbstractC45841szG implements C44997shV.ActionBar, SupportSearchSuggestionsAdapter.ActionBar {
    public static final String AhwBna;
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AkhnZx;
    public int AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public AbstractC47355toV fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final int isConnected;

    @yCM
    public C45397soy selfServiceUseCase;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.ActionBar
    public void KWHzl(@NotNull AbstractC44051sBn.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    public static final class ActionBar implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ SearchResultIntentFragment EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ AbstractC47355toV copydefault;

        public ActionBar(View view, SearchResultIntentFragment searchResultIntentFragment, AbstractC47355toV abstractC47355toV) {
            this.KWHzl = view;
            this.EZpvd = searchResultIntentFragment;
            this.copydefault = abstractC47355toV;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.KWHzl.isLaidOut()) {
                this.KWHzl.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.EZpvd.AuCTel = this.copydefault.AhwBna.getHeight();
                pUU.EZpvd(this.EZpvd.getTAG(), "initView > txtAnswerCollapsedHeight: " + this.EZpvd.AuCTel);
                TextView textView = this.copydefault.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = this.EZpvd.AuCTel;
                textView.setLayoutParams(layoutParams);
                pUU.EZpvd(this.EZpvd.getTAG(), "initView > txtRichAnswer locked to txtAnswerCollapsedHeight");
                ConstraintLayout constraintLayout = this.copydefault.copydefault;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.height = -2;
                constraintLayout.setLayoutParams(layoutParams2);
                pUU.EZpvd(this.EZpvd.getTAG(), "initView > intentResultContainer set to wrap_content");
            }
        }
    }

    public SearchResultIntentFragment() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$viewModels$default$2
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchResultIntentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchResultIntentFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = C47315tni.ActionBar.dNCPSb;
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.getNewProxyInstance(this.copydefault);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.AuCTel(this.copydefault);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.sAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.fJNWhG(this.OLrzqt);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.sAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.getFieldNames(this.KWHzl);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.sAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Long.valueOf(SearchResultIntentFragment.valueOf());
            }
        });
        this.ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.sAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.hDKMBd(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.sAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.fARcdN(this.OLrzqt);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SearchResultIntentFragment.fIwbmz(this.AEQbTJ);
            }
        });
    }

    public final C45397soy values() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSearchViewModel fARcdN() {
        return (SupportSearchViewModel) this.AYXKKw.getValue();
    }

    public final SearchResultIntentViewModel fIwbmz() {
        return (SearchResultIntentViewModel) this.fJNWhG.getValue();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.ui.SearchResultIntentFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final SearchResultIntentFragment OLrzqt() {
            return new SearchResultIntentFragment();
        }
    }

    static {
        String simpleName = SearchResultIntentFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        AhwBna = simpleName;
    }

    public final C44997shV fetchVPNInfo() {
        return (C44997shV) this.fetchVPNInfo.getValue();
    }

    public static final C44997shV getNewProxyInstance(SearchResultIntentFragment searchResultIntentFragment) {
        C44997shV c44997shV = new C44997shV(null, 1, 0 == true ? 1 : 0);
        c44997shV.OLrzqt(searchResultIntentFragment);
        return c44997shV;
    }

    public final SupportSearchSuggestionsAdapter gEmmrt() {
        return (SupportSearchSuggestionsAdapter) this.gEmmrt.getValue();
    }

    public static final SupportSearchSuggestionsAdapter AuCTel(SearchResultIntentFragment searchResultIntentFragment) {
        SupportSearchSuggestionsAdapter supportSearchSuggestionsAdapter = new SupportSearchSuggestionsAdapter();
        supportSearchSuggestionsAdapter.KWHzl(searchResultIntentFragment);
        return supportSearchSuggestionsAdapter;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47355toV abstractC47355toVKWHzl = AbstractC47355toV.KWHzl(view);
        this.fIwbmz = abstractC47355toVKWHzl;
        if (abstractC47355toVKWHzl == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toVKWHzl = null;
        }
        abstractC47355toVKWHzl.AEQbTJ.setAdapter(gEmmrt());
        gEmmrt().AEQbTJ(yDY.AhwBna());
        RecyclerView recyclerView = abstractC47355toVKWHzl.gEmmrt;
        recyclerView.setAdapter(fetchVPNInfo());
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(0);
        flexboxLayoutManager.setAlignItems(4);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.addItemDecoration(new Application());
        fetchVPNInfo().EZpvd(yDY.AhwBna());
        abstractC47355toVKWHzl.AhwBna.addTextChangedListener(isConnected());
        FrameLayout frameLayout = abstractC47355toVKWHzl.OLrzqt;
        frameLayout.setOnClickListener(new Dialog(frameLayout, 1000L, this));
        if (C34703nhO.AhwBna(abstractC47355toVKWHzl.AYXKKw.getContext())) {
            abstractC47355toVKWHzl.AYXKKw.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.sAc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view2) {
                    return SearchResultIntentFragment.KWHzl(this.OLrzqt, view2);
                }
            });
        }
        ConstraintLayout constraintLayout = abstractC47355toVKWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ActionBar(constraintLayout, this, abstractC47355toVKWHzl));
        AuCTel();
        view.post(new Runnable() { // from class: o.szZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SearchResultIntentFragment.ejfBZ(this.AEQbTJ);
            }
        });
    }

    public static final class Application extends RecyclerView.ItemDecoration {
        public final int AEQbTJ = C55298xhM.dp2px$default(8.0f, null, 1, null);
        public final int EZpvd = C55298xhM.dp2px$default(-20.0f, null, 1, null);

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            if (recyclerView.getChildAdapterPosition(view) != (recyclerView.getAdapter() != null ? r4.getItemCount() : 0) - 1) {
                if (!C55296xhK.AEQbTJ(view)) {
                    rect.right = this.AEQbTJ;
                } else {
                    rect.left = this.AEQbTJ;
                }
            }
            rect.top = this.EZpvd;
        }
    }

    public static final boolean KWHzl(SearchResultIntentFragment searchResultIntentFragment, View view) {
        searchResultIntentFragment.fIwbmz().KWHzl();
        return true;
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ SearchResultIntentFragment EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, SearchResultIntentFragment searchResultIntentFragment) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = searchResultIntentFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.fIwbmz().AEQbTJ();
            }
        }
    }

    public static final void ejfBZ(SearchResultIntentFragment searchResultIntentFragment) {
        rVN.reportFullyDrawn$default((Fragment) searchResultIntentFragment, true, (String) null, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        AbstractC47355toV abstractC47355toV = this.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        abstractC47355toV.AhwBna.removeTextChangedListener(isConnected());
        super.onDestroyView();
    }

    private final void AuCTel() {
        fIwbmz();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchResultIntentFragment$initViewModel$1$1(this, null), 3, null);
    }

    public final void copydefault(boolean z, boolean z2) {
        AbstractC47355toV abstractC47355toV = this.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        FrameLayout frameLayout = abstractC47355toV.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility((z2 || z) ? 0 : 8);
        View view = abstractC47355toV.valueOf;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        abstractC47355toV.OLrzqt.setClickable(z2);
        TextView textView = abstractC47355toV.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z2 ? 0 : 8);
    }

    public final C44053sBp DbNXlk() {
        return (C44053sBp) this.AkhnZx.getValue();
    }

    public static final C44053sBp fJNWhG(final SearchResultIntentFragment searchResultIntentFragment) {
        AbstractC47355toV abstractC47355toV = searchResultIntentFragment.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        Context context = abstractC47355toV.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C44053sBp(context, new InterfaceC55228xfw() { // from class: o.sAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC55228xfw
            public final boolean OLrzqt(java.lang.String str) {
                return SearchResultIntentFragment.KWHzl(this.AEQbTJ, str);
            }
        });
    }

    public static final boolean KWHzl(SearchResultIntentFragment searchResultIntentFragment, String str) {
        if (str != null && (!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
            searchResultIntentFragment.EZpvd(str);
        }
        return true;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class FragmentManager implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public FragmentManager() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC47355toV abstractC47355toV = SearchResultIntentFragment.this.fIwbmz;
            if (abstractC47355toV == null) {
                Intrinsics.gEmmrt("");
                abstractC47355toV = null;
            }
            SearchResultIntentFragment searchResultIntentFragment = SearchResultIntentFragment.this;
            TextView textView = abstractC47355toV.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            LifecycleOwner viewLifecycleOwner = searchResultIntentFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), C44711scA.EZpvd.KWHzl().getImmediate(), null, new SearchResultIntentFragment$richContentWatcher$2$1$afterTextChanged$lambda$1$$inlined$afterLayoutStableHeight$default$1(FlowKt.flow(new ViewsKt$afterLayoutStableHeight$heightFlow$1(30, 100L, textView, 3, null)), null, abstractC47355toV, searchResultIntentFragment), 2, null);
        }
    }

    public final TextWatcher isConnected() {
        return (TextWatcher) this.values.getValue();
    }

    public static final FragmentManager getFieldNames(SearchResultIntentFragment searchResultIntentFragment) {
        return searchResultIntentFragment.new FragmentManager();
    }

    public final void AEQbTJ(C44052sBo c44052sBo) {
        AbstractC47355toV abstractC47355toV = this.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchResultIntentFragment$showResultData$1$1(abstractC47355toV, this, c44052sBo, null), 3, null);
        fetchVPNInfo().EZpvd(c44052sBo.copydefault());
        gEmmrt().AEQbTJ(c44052sBo.KWHzl());
        List<AbstractC44051sBn.Application> listKWHzl = c44052sBo.KWHzl();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC44051sBn.Application) it.next()).KWHzl().getSlug());
        }
        KWHzl(arrayList);
    }

    private final long fJNWhG() {
        return ((Number) this.fARcdN.getValue()).longValue();
    }

    public static final long valueOf() {
        return C33070mpX.AhwBna(R.integer.config_shortAnimTime);
    }

    public final ValueAnimator.AnimatorUpdateListener AkhnZx() {
        return (ValueAnimator.AnimatorUpdateListener) this.ejfBZ.getValue();
    }

    public static final ValueAnimator.AnimatorUpdateListener hDKMBd(final SearchResultIntentFragment searchResultIntentFragment) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.sAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                SearchResultIntentFragment.KWHzl(this.OLrzqt, valueAnimator);
            }
        };
    }

    public static final void KWHzl(SearchResultIntentFragment searchResultIntentFragment, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        AbstractC47355toV abstractC47355toV = searchResultIntentFragment.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        TextView textView = abstractC47355toV.AhwBna;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        layoutParams.height = ((Integer) animatedValue).intValue();
        textView.requestLayout();
    }

    public static final class StateListAnimator extends AnimatorListenerAdapter {
        public StateListAnimator() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC47355toV abstractC47355toV = SearchResultIntentFragment.this.fIwbmz;
            if (abstractC47355toV == null) {
                Intrinsics.gEmmrt("");
                abstractC47355toV = null;
            }
            C54979xbL.expand$default(abstractC47355toV.EZpvd, false, 1, null);
        }
    }

    public final StateListAnimator AhwBna() {
        return (StateListAnimator) this.DbNXlk.getValue();
    }

    public static final StateListAnimator fARcdN(SearchResultIntentFragment searchResultIntentFragment) {
        return searchResultIntentFragment.new StateListAnimator();
    }

    public static final class TaskDescription extends AnimatorListenerAdapter {
        public TaskDescription() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            Intrinsics.checkNotNullParameter(animator, "");
            AbstractC47355toV abstractC47355toV = SearchResultIntentFragment.this.fIwbmz;
            if (abstractC47355toV == null) {
                Intrinsics.gEmmrt("");
                abstractC47355toV = null;
            }
            C54979xbL.collapse$default(abstractC47355toV.EZpvd, false, 1, null);
        }
    }

    public final TaskDescription djBIcL() {
        return (TaskDescription) this.djBIcL.getValue();
    }

    public static final TaskDescription fIwbmz(SearchResultIntentFragment searchResultIntentFragment) {
        return searchResultIntentFragment.new TaskDescription();
    }

    public final void OLrzqt(int i, Animator.AnimatorListener animatorListener) {
        AbstractC47355toV abstractC47355toV = this.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(abstractC47355toV.AhwBna.getHeight(), i);
        valueAnimatorOfInt.setDuration(fJNWhG());
        valueAnimatorOfInt.addUpdateListener(AkhnZx());
        valueAnimatorOfInt.addListener(animatorListener);
        valueAnimatorOfInt.start();
    }

    public final void EZpvd(Animator.AnimatorListener animatorListener) {
        AbstractC47355toV abstractC47355toV = this.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        TextView textView = abstractC47355toV.AhwBna;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
        textView.setLayoutParams(layoutParams2);
        textView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = textView.getMeasuredHeight();
        pUU.EZpvd(getTAG(), "animateRichTextToWrappedHeight > targetHeight: " + measuredHeight);
        OLrzqt(measuredHeight, animatorListener);
    }

    public final void AYXKKw() {
        if (this.fIwbmz == null) {
            Intrinsics.gEmmrt("");
        }
        pUU.EZpvd(getTAG(), "expandShowMoreSection > set txtRichAnswer to wrap_content and animate the change");
        copydefault(false, false);
        EZpvd(AhwBna());
    }

    public final void OLrzqt(boolean z) {
        AbstractC47355toV abstractC47355toV = this.fIwbmz;
        if (abstractC47355toV == null) {
            Intrinsics.gEmmrt("");
            abstractC47355toV = null;
        }
        int height = z ? this.AuCTel : abstractC47355toV.AhwBna.getHeight();
        pUU.EZpvd(getTAG(), "collapseShowMoreSection > reset txtRichAnswer height and animate back");
        pUU.EZpvd(getTAG(), "collapseShowMoreSection > answerIsClipped: " + z);
        pUU.EZpvd(getTAG(), "collapseShowMoreSection > targetHeight: " + height);
        copydefault(z, fIwbmz().copydefault() || z);
        OLrzqt(height, djBIcL());
    }

    @Override // o.C44997shV.ActionBar
    public void copydefault(@NotNull SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        fARcdN().values();
        Context context = getContext();
        if (context != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchResultIntentFragment$onSelfServiceItemClicked$1$1(this, context, selfServiceToolBean, null), 3, null);
        }
    }

    @Override // com.okinc.okex.search.ui.adapter.SupportSearchSuggestionsAdapter.ActionBar
    public void KWHzl(@NotNull final AbstractC44051sBn.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (getContext() == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) application.KWHzl().getUrl()))) {
            return;
        }
        C45363soQ.onSessionIdEvent$default("SupportCenterSearch_Search_AIAnswerArticle_Click", false, new Function1() { // from class: o.sAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SearchResultIntentFragment.AEQbTJ(application, this, (EventParamsList) obj);
            }
        }, 1, null);
        EZpvd(application.KWHzl().getUrl());
        fARcdN().AEQbTJ(application.KWHzl());
    }

    public static final Unit AEQbTJ(AbstractC44051sBn.Application application, SearchResultIntentFragment searchResultIntentFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "article_slug", application.KWHzl().getSlug(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", searchResultIntentFragment.fARcdN().OLrzqt(), false, 4, null);
        eventParamsList.put("page", searchResultIntentFragment.fARcdN().djBIcL(), true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(String str) {
        Context context = getContext();
        if (context != null) {
            ActivityC45850szP.ActionBar.openPage$default(ActivityC45850szP.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
        }
    }

    public final void KWHzl(List<String> list) {
        if (!list.isEmpty()) {
            final String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
            C45363soQ.onSessionIdEvent$default("SupportCenterSearch_Search_AIAnswerArticle_View", false, new Function1() { // from class: o.sAi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SearchResultIntentFragment.copydefault(strJoinToString$default, this, (EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit copydefault(String str, SearchResultIntentFragment searchResultIntentFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "article_slugs", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", searchResultIntentFragment.fARcdN().OLrzqt(), false, 4, null);
        eventParamsList.put("page", searchResultIntentFragment.fARcdN().djBIcL(), true);
        return Unit.INSTANCE;
    }
}
