package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.bean.EarlyBuyerInfoData;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.features.overview.domain.BasicInfo;
import com.okinc.business.market.features.overview.domain.Overview;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagAttribute;
import com.okinc.business.market.features.tag.domain.TagEventProperty;
import com.okinc.business.market.features.tag.domain.TagExtra;
import com.okinc.business.market.features.tag.domain.TagGroup;
import com.okinc.business.market.features.tag.domain.TagLocalProperty;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagExplanationBottomSheetParams;
import com.okinc.business.market.features.tag.ui.TagExplanationFragment$onDevAnalysisClick$1;
import com.okinc.business.market.features.tag.ui.TagExplanationViewModel;
import com.okinc.business.market.features.tag.ui.TagStaticDataParams;
import com.okinc.business.market.widget.tag.TagEventSource;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C26032jPk;
import o.C52761wXj;
import o.InterfaceC29685kyM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kyw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29721kyw extends AbstractC29716kyr {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public TagExplanationBottomSheetParams djBIcL;
    public hAC gEmmrt;

    /* JADX INFO: renamed from: o.kyw$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TagGroup.values().length];
            try {
                iArr[TagGroup.INFO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TagGroup.COMMUNITY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String AkhnZx() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String DbNXlk() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String fetchVPNInfo() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String isConnected() {
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String values() {
        return "--";
    }

    public final boolean fJNWhG() {
        return true;
    }

    public C29721kyw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.tag.ui.TagExplanationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.tag.ui.TagExplanationFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagExplanationViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.tag.ui.TagExplanationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.tag.ui.TagExplanationFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.tag.ui.TagExplanationFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.kyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.AuCTel();
            }
        });
    }

    public final TagExplanationViewModel ejfBZ() {
        return (TagExplanationViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM getNewProxyInstance() {
        return (kMM) this.AhwBna.getValue();
    }

    public static final kMM AuCTel() {
        kMM kmm = new kMM();
        kmm.register(C29686kyN.class, new C29692kyT());
        kmm.register(C29689kyQ.class, new C29693kyU());
        kmm.register(C29690kyR.class, new C29691kyS());
        return kmm;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        this.djBIcL = arguments != null ? (TagExplanationBottomSheetParams) arguments.getParcelable("arg.params") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAC hacCopydefault = hAC.copydefault(layoutInflater, viewGroup, false);
        this.gEmmrt = hacCopydefault;
        if (hacCopydefault != null) {
            return hacCopydefault.KWHzl;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
        uzCIH();
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        if (tagExplanationBottomSheetParams != null) {
            ejfBZ().OLrzqt(tagExplanationBottomSheetParams.EZpvd(), tagExplanationBottomSheetParams.valueOf(), tagExplanationBottomSheetParams.OLrzqt());
        }
        iwGUEr();
    }

    public final void fARcdN() {
        RecyclerView recyclerView;
        ConstraintLayout constraintLayout;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        if (tagExplanationBottomSheetParams == null || !tagExplanationBottomSheetParams.KWHzl()) {
            return;
        }
        hAC hac = this.gEmmrt;
        if (hac != null && (constraintLayout = hac.KWHzl) != null) {
            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        hAC hac2 = this.gEmmrt;
        if (hac2 == null || (recyclerView = hac2.AEQbTJ) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = null;
        ConstraintLayout.LayoutParams layoutParams3 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
            layoutParams2 = layoutParams3;
        }
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setNestedScrollingEnabled(true);
    }

    private final void uzCIH() {
        hAC hac = this.gEmmrt;
        if (hac != null) {
            hac.AEQbTJ.setAdapter(getNewProxyInstance());
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
            Application application = new Application(2);
            application.setSpanIndexCacheEnabled(true);
            gridLayoutManager.setSpanSizeLookup(application);
            hac.AEQbTJ.setLayoutManager(gridLayoutManager);
            hac.AEQbTJ.setItemAnimator(null);
            hac.AEQbTJ.addItemDecoration(new C29687kyO(getNewProxyInstance(), 2, 0, 0, 12, null));
            C55173xeu c55173xeu = hac.OLrzqt;
            java.lang.String string = getString(C23274hvD.Fragment.EZpvd);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setRetry(string);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kyE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29721kyw.AEQbTJ(this.EZpvd, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.kyw$Application */
    public static final class Application extends GridLayoutManager.SpanSizeLookup {
        public final /* synthetic */ int OLrzqt;

        public Application(int i) {
            this.OLrzqt = i;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            java.util.List<?> items = C29721kyw.this.getNewProxyInstance().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, i);
            if ((objAkhnZx instanceof kMU ? (kMU) objAkhnZx : null) instanceof C29689kyQ) {
                return 1;
            }
            return this.OLrzqt;
        }
    }

    public static final void AEQbTJ(C29721kyw c29721kyw, android.view.View view) {
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = c29721kyw.djBIcL;
        if (tagExplanationBottomSheetParams != null) {
            TagExplanationViewModel.loadData$default(c29721kyw.ejfBZ(), tagExplanationBottomSheetParams.EZpvd(), tagExplanationBottomSheetParams.valueOf(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.kyw$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC29685kyM interfaceC29685kyM, Continuation<? super Unit> continuation) {
            C29721kyw.this.KWHzl(interfaceC29685kyM);
            return Unit.INSTANCE;
        }
    }

    private final void iwGUEr() {
        C25390ivn.collectOnViewLifecycle$default(this, ejfBZ().AEQbTJ(), null, new Activity(), 2, null);
    }

    public final void KWHzl(InterfaceC29685kyM interfaceC29685kyM) {
        hAC hac = this.gEmmrt;
        if (hac != null) {
            C55113xdn c55113xdn = hac.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            boolean z = interfaceC29685kyM instanceof InterfaceC29685kyM.StateListAnimator;
            c55113xdn.setVisibility(z ? 0 : 8);
            C55173xeu c55173xeu = hac.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(interfaceC29685kyM instanceof InterfaceC29685kyM.Application ? 0 : 8);
            if (z) {
                hac.copydefault.KWHzl(0L);
                kMM.setData$default(getNewProxyInstance(), yDY.AhwBna(), null, 2, null);
            } else {
                hac.copydefault.copydefault();
            }
            if (interfaceC29685kyM instanceof InterfaceC29685kyM.ActionBar) {
                OLrzqt((InterfaceC29685kyM.ActionBar) interfaceC29685kyM);
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
    }

    public final void OLrzqt(InterfaceC29685kyM.ActionBar actionBar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<TagWrapper> listOLrzqt = actionBar.OLrzqt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (((TagWrapper) obj).AEQbTJ() != null) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            TagWrapper tagWrapper = (TagWrapper) obj2;
            TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
            if (tagExplanationBottomSheetParams == null || !tagExplanationBottomSheetParams.OLrzqt() || !C33129mqd.OLrzqt((java.lang.CharSequence) tagWrapper.copydefault().OLrzqt().gEmmrt())) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj3 : arrayList3) {
            TagMeta tagMetaAEQbTJ = ((TagWrapper) obj3).AEQbTJ();
            Intrinsics.copydefault(tagMetaAEQbTJ);
            TagGroup tagGroupDjBIcL = tagMetaAEQbTJ.djBIcL();
            java.lang.Object arrayList4 = linkedHashMap.get(tagGroupDjBIcL);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(tagGroupDjBIcL, arrayList4);
            }
            ((java.util.List) arrayList4).add(obj3);
        }
        for (TagGroup tagGroup : yDY.gEmmrt(TagGroup.INFO, TagGroup.COMMUNITY)) {
            java.util.List<TagWrapper> list = (java.util.List) linkedHashMap.getOrDefault(tagGroup, yDY.AhwBna());
            if (!list.isEmpty() && tagGroup.getResourceKey() != null) {
                arrayList.add(new C29686kyN(C33070mpX.OLrzqt(tagGroup.getResourceKey().intValue(), requireContext())));
                int i = StateListAnimator.EZpvd[tagGroup.ordinal()];
                if (i == 1) {
                    arrayList.addAll(KWHzl(list));
                } else if (i == 2) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(java.lang.Boolean.valueOf(arrayList.add(getTagOtherItemUiModel$default(this, (TagWrapper) it.next(), actionBar.AEQbTJ(), null, null, null, null, TagGroup.COMMUNITY, 60, null))));
                    }
                }
            }
        }
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams2 = this.djBIcL;
        if (tagExplanationBottomSheetParams2 != null && tagExplanationBottomSheetParams2.OLrzqt()) {
            arrayList.addAll(OLrzqt(actionBar.EZpvd()));
        }
        kMM.setData$default(getNewProxyInstance(), arrayList, null, 2, null);
    }

    public static final Unit OLrzqt(TagEventProperty tagEventProperty, C29721kyw c29721kyw) {
        TagEventSource tagEventSourceAEQbTJ;
        android.content.Context contextRequireContext = c29721kyw.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = c29721kyw.djBIcL;
        if (tagExplanationBottomSheetParams == null || (tagEventSourceAEQbTJ = tagExplanationBottomSheetParams.AEQbTJ()) == null) {
            tagEventSourceAEQbTJ = TagEventSource.TOKEN_DETAIL;
        }
        kNA.AEQbTJ(tagEventProperty, contextRequireContext, tagEventSourceAEQbTJ);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.kyw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C29690kyR getTagOtherItemUiModel$default(C29721kyw c29721kyw, TagWrapper tagWrapper, java.util.List list, java.lang.Integer num, android.text.SpannedString spannedString, java.lang.String str, Function0 function0, TagGroup tagGroup, int i, java.lang.Object obj) {
        return c29721kyw.AEQbTJ(tagWrapper, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : spannedString, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : function0, (i & 64) == 0 ? tagGroup : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C29690kyR AEQbTJ(final TagWrapper tagWrapper, java.util.List<TagAttribute> list, java.lang.Integer num, android.text.SpannedString spannedString, java.lang.String str, Function0<Unit> function0, TagGroup tagGroup) {
        java.lang.String strAhwBna;
        android.text.SpannedString spannedStringCopydefault;
        java.lang.String strAEQbTJ;
        java.lang.Object next;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        if (C33054mpH.AEQbTJ(contextRequireContext)) {
            TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
            strAhwBna = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.KWHzl() : null;
        } else {
            TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
            if (tagMetaAEQbTJ2 != null) {
                strAhwBna = tagMetaAEQbTJ2.AhwBna();
            }
        }
        java.lang.String str2 = strAhwBna == null ? "" : strAhwBna;
        TagMeta tagMetaAEQbTJ3 = tagWrapper.AEQbTJ();
        boolean zAEQbTJ = tagMetaAEQbTJ3 != null ? tagMetaAEQbTJ3.AEQbTJ() : false;
        if (spannedString == null) {
            spannedStringCopydefault = copydefault(tagWrapper, tagGroup != TagGroup.COMMUNITY);
        } else {
            spannedStringCopydefault = spannedString;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) tagWrapper.OLrzqt(), (java.lang.Object) "ds_paid")) {
            strAEQbTJ = C31256lqb.AEQbTJ(str, (Function0<java.lang.String>) new Function0() { // from class: o.kyG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29721kyw.AEQbTJ(tagWrapper);
                }
            });
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((TagAttribute) next).OLrzqt(), (java.lang.Object) tagWrapper.OLrzqt())) {
                    break;
                }
            }
            TagAttribute tagAttribute = (TagAttribute) next;
            strAEQbTJ = C31256lqb.KWHzl(tagAttribute != null ? tagAttribute.AEQbTJ() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kyJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29721kyw.AkhnZx();
                }
            });
        }
        return new C29690kyR(str2, num, zAEQbTJ, spannedStringCopydefault, strAEQbTJ, function0);
    }

    public static final java.lang.String AEQbTJ(TagWrapper tagWrapper) {
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        java.lang.String strCopydefault = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.copydefault() : null;
        return strCopydefault == null ? "" : strCopydefault;
    }

    public static /* synthetic */ android.text.SpannedString buildTitleSpan$default(C29721kyw c29721kyw, TagWrapper tagWrapper, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c29721kyw.copydefault(tagWrapper, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kyV.getTextColor$default(o.kyV, com.okinc.business.market.features.tag.domain.TagWrapper, boolean, java.lang.Integer, int, java.lang.Object):int */
    public final android.text.SpannedString copydefault(TagWrapper tagWrapper, boolean z) {
        int iKWHzl;
        if (z) {
            C29694kyV c29694kyV = C29694kyV.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            iKWHzl = C29694kyV.getTextColor$default(c29694kyV, tagWrapper, C33054mpH.AEQbTJ(contextRequireContext), null, 4, null);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        java.lang.String strDbNXlk = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.DbNXlk() : null;
        java.lang.String str = strDbNXlk != null ? strDbNXlk : "";
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), 0, str.length(), 33);
        return new android.text.SpannedString(spannableStringBuilder);
    }

    public final C29690kyR valueOf(TagWrapper tagWrapper) {
        int iKWHzl;
        TagStaticDataParams tagStaticDataParamsCopydefault;
        LatestMarketInfoBean latestMarketInfoBeanEZpvd;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        java.lang.String strKWHzl = C31256lqb.KWHzl((tagExplanationBottomSheetParams == null || (tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams.copydefault()) == null || (latestMarketInfoBeanEZpvd = tagStaticDataParamsCopydefault.EZpvd()) == null) ? null : latestMarketInfoBeanEZpvd.getTop10HoldAmountPercentage(), (Function0<java.lang.String>) new Function0() { // from class: o.kyB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.fetchVPNInfo();
            }
        });
        if (C33129mqd.djBIcL(strKWHzl) >= 80.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
        } else {
            iKWHzl = C33129mqd.djBIcL(strKWHzl) > 0.0f ? C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI) : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) KWHzl(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iKWHzl)));
        spannableStringBuilder.append((java.lang.CharSequence) C29083kmu.copydefault(C23311hvo.formatPercentWithoutSymbol$default(strKWHzl, false, 0, null, false, null, 30, null), iKWHzl));
        return getTagOtherItemUiModel$default(this, tagWrapper, null, java.lang.Integer.valueOf(iKWHzl), new android.text.SpannedString(spannableStringBuilder), null, null, null, 114, null);
    }

    public final C29690kyR KWHzl(final TagWrapper tagWrapper) {
        int iKWHzl;
        TagStaticDataParams tagStaticDataParamsCopydefault;
        TagStaticDataParams tagStaticDataParamsCopydefault2;
        LatestMarketInfoBean latestMarketInfoBeanEZpvd;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        Function0 function0 = null;
        java.lang.String strKWHzl = C31256lqb.KWHzl((tagExplanationBottomSheetParams == null || (tagStaticDataParamsCopydefault2 = tagExplanationBottomSheetParams.copydefault()) == null || (latestMarketInfoBeanEZpvd = tagStaticDataParamsCopydefault2.EZpvd()) == null) ? null : latestMarketInfoBeanEZpvd.getDevHoldingRatio(), (Function0<java.lang.String>) new Function0() { // from class: o.kyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.values();
            }
        });
        if (C33129mqd.djBIcL(strKWHzl) > 0.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        } else {
            iKWHzl = C33129mqd.djBIcL(strKWHzl) == 0.0f ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) KWHzl(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iKWHzl)));
        spannableStringBuilder.append((java.lang.CharSequence) C29083kmu.copydefault(C23311hvo.formatPercentWithoutSymbol$default(strKWHzl, true, 0, new BigDecimal(1.0E-4d), false, null, 26, null), iKWHzl));
        android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams2 = this.djBIcL;
        if (tagExplanationBottomSheetParams2 != null && (tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams2.copydefault()) != null && tagStaticDataParamsCopydefault.copydefault()) {
            function0 = new Function0() { // from class: o.kyD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29721kyw.OLrzqt(this.copydefault, tagWrapper);
                }
            };
        }
        return getTagOtherItemUiModel$default(this, tagWrapper, null, java.lang.Integer.valueOf(iKWHzl), spannedString, null, function0, null, 82, null);
    }

    public static final Unit OLrzqt(C29721kyw c29721kyw, TagWrapper tagWrapper) {
        c29721kyw.gEmmrt(tagWrapper);
        return Unit.INSTANCE;
    }

    public final C29690kyR OLrzqt(TagWrapper tagWrapper) {
        int iKWHzl;
        java.lang.Float fValues = tagWrapper.copydefault().OLrzqt().values();
        java.lang.String strAEQbTJ = C31256lqb.AEQbTJ(fValues != null ? fValues.toString() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.valueOf(this.EZpvd);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "--") || C33129mqd.djBIcL(strAEQbTJ) == 0.0f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(strAEQbTJ) >= 0.1f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI);
        } else if (C33129mqd.djBIcL(strAEQbTJ) > 0.01f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq);
        } else {
            iKWHzl = C33129mqd.djBIcL(strAEQbTJ) > 0.0f ? C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI) : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) KWHzl(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iKWHzl)));
        spannableStringBuilder.append((java.lang.CharSequence) C29083kmu.copydefault(C23311hvo.formatPercentWithoutSymbol$default(strAEQbTJ, false, 0, new BigDecimal(0.01d), false, null, 26, null), iKWHzl));
        return getTagOtherItemUiModel$default(this, tagWrapper, null, java.lang.Integer.valueOf(iKWHzl), new android.text.SpannedString(spannableStringBuilder), null, null, null, 114, null);
    }

    public static final java.lang.String valueOf(C29721kyw c29721kyw) {
        TagStaticDataParams tagStaticDataParamsCopydefault;
        Overview overviewAEQbTJ;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = c29721kyw.djBIcL;
        return C31256lqb.KWHzl((tagExplanationBottomSheetParams == null || (tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams.copydefault()) == null || (overviewAEQbTJ = tagStaticDataParamsCopydefault.AEQbTJ()) == null) ? null : overviewAEQbTJ.gEmmrt(), (Function0<java.lang.String>) new Function0() { // from class: o.kyI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.isConnected();
            }
        });
    }

    public final C29690kyR AhwBna(TagWrapper tagWrapper) {
        TagStaticDataParams tagStaticDataParamsCopydefault;
        LatestMarketInfoBean latestMarketInfoBeanEZpvd;
        java.lang.String sniperHoldingRatio;
        TagStaticDataParams tagStaticDataParamsCopydefault2;
        LatestMarketInfoBean latestMarketInfoBeanEZpvd2;
        EarlyBuyerInfoData earlyBuyerStatisticsInfo;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        int iAhwBna = C33129mqd.AhwBna((tagExplanationBottomSheetParams == null || (tagStaticDataParamsCopydefault2 = tagExplanationBottomSheetParams.copydefault()) == null || (latestMarketInfoBeanEZpvd2 = tagStaticDataParamsCopydefault2.EZpvd()) == null || (earlyBuyerStatisticsInfo = latestMarketInfoBeanEZpvd2.getEarlyBuyerStatisticsInfo()) == null) ? null : earlyBuyerStatisticsInfo.getTotalEarlyBuyerAmount());
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams2 = this.djBIcL;
        java.lang.Float fFIwbmz = (tagExplanationBottomSheetParams2 == null || (tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams2.copydefault()) == null || (latestMarketInfoBeanEZpvd = tagStaticDataParamsCopydefault.EZpvd()) == null || (sniperHoldingRatio = latestMarketInfoBeanEZpvd.getSniperHoldingRatio()) == null) ? null : C59443zhD.fIwbmz(sniperHoldingRatio);
        int iKWHzl = C25382ivf.KWHzl(C28074kNy.OLrzqt(fFIwbmz));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) KWHzl(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iKWHzl)));
        spannableStringBuilder.append((java.lang.CharSequence) C29694kyV.AEQbTJ.copydefault(requireContext(), fFIwbmz));
        return getTagOtherItemUiModel$default(this, tagWrapper, null, java.lang.Integer.valueOf(iKWHzl), new android.text.SpannedString(spannableStringBuilder), null, (!fJNWhG() || iAhwBna <= 0) ? null : new Function0() { // from class: o.kyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.AYXKKw(this.AEQbTJ);
            }
        }, null, 82, null);
    }

    public static final Unit AYXKKw(C29721kyw c29721kyw) {
        c29721kyw.fIwbmz();
        return Unit.INSTANCE;
    }

    public final C29690kyR EZpvd(TagWrapper tagWrapper) {
        int iKWHzl;
        java.lang.Float fOLrzqt = tagWrapper.copydefault().OLrzqt().OLrzqt();
        java.lang.String strAEQbTJ = C31256lqb.AEQbTJ(fOLrzqt != null ? fOLrzqt.toString() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.gEmmrt(this.EZpvd);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "--")) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else if (C33129mqd.djBIcL(strAEQbTJ) < 0.1f) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI);
        } else {
            iKWHzl = C33129mqd.djBIcL(strAEQbTJ) >= 0.1f ? C25382ivf.KWHzl(C52761wXj.ActionBar.OuxcSI) : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) KWHzl(tagWrapper.AEQbTJ(), java.lang.Integer.valueOf(iKWHzl)));
        spannableStringBuilder.append((java.lang.CharSequence) C29083kmu.copydefault(C23311hvo.formatPercentWithoutSymbol$default(strAEQbTJ, true, 0, null, false, null, 30, null), iKWHzl));
        return getTagOtherItemUiModel$default(this, tagWrapper, null, java.lang.Integer.valueOf(iKWHzl), new android.text.SpannedString(spannableStringBuilder), null, null, null, 114, null);
    }

    public static final java.lang.String gEmmrt(C29721kyw c29721kyw) {
        TagStaticDataParams tagStaticDataParamsCopydefault;
        Overview overviewAEQbTJ;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = c29721kyw.djBIcL;
        return C31256lqb.KWHzl((tagExplanationBottomSheetParams == null || (tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams.copydefault()) == null || (overviewAEQbTJ = tagStaticDataParamsCopydefault.AEQbTJ()) == null) ? null : overviewAEQbTJ.EZpvd(), (Function0<java.lang.String>) new Function0() { // from class: o.kyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29721kyw.DbNXlk();
            }
        });
    }

    public final void fIwbmz() {
        LatestMarketInfoBean latestMarketInfoBeanEZpvd;
        LatestMarketInfoBean latestMarketInfoBeanEZpvd2;
        LatestMarketInfoBean latestMarketInfoBeanEZpvd3;
        java.lang.String strIsSupportHolderExpandData;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        if (tagExplanationBottomSheetParams == null) {
            return;
        }
        C26032jPk.StateListAnimator stateListAnimator = C26032jPk.Companion;
        java.lang.String strEZpvd = tagExplanationBottomSheetParams.EZpvd();
        java.lang.String strValueOf = tagExplanationBottomSheetParams.valueOf();
        TagStaticDataParams tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams.copydefault();
        boolean z = (tagStaticDataParamsCopydefault == null || (latestMarketInfoBeanEZpvd3 = tagStaticDataParamsCopydefault.EZpvd()) == null || (strIsSupportHolderExpandData = latestMarketInfoBeanEZpvd3.isSupportHolderExpandData()) == null || !C27722kAy.OLrzqt(strIsSupportHolderExpandData)) ? false : true;
        TagStaticDataParams tagStaticDataParamsCopydefault2 = tagExplanationBottomSheetParams.copydefault();
        java.lang.String tokenName = null;
        java.lang.String chainName = (tagStaticDataParamsCopydefault2 == null || (latestMarketInfoBeanEZpvd2 = tagStaticDataParamsCopydefault2.EZpvd()) == null) ? null : latestMarketInfoBeanEZpvd2.getChainName();
        java.lang.String str = chainName == null ? "" : chainName;
        TagStaticDataParams tagStaticDataParamsCopydefault3 = tagExplanationBottomSheetParams.copydefault();
        if (tagStaticDataParamsCopydefault3 != null && (latestMarketInfoBeanEZpvd = tagStaticDataParamsCopydefault3.EZpvd()) != null) {
            tokenName = latestMarketInfoBeanEZpvd.getTokenName();
        }
        C26032jPk c26032jPkEZpvd = stateListAnimator.EZpvd(strEZpvd, strValueOf, z, tokenName == null ? "" : tokenName, str, "header");
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        c26032jPkEZpvd.show(parentFragmentManager);
    }

    private final void gEmmrt(TagWrapper tagWrapper) {
        Overview overviewAEQbTJ;
        BasicInfo basicInfoKWHzl;
        java.lang.String strKWHzl;
        Overview overviewAEQbTJ2;
        BasicInfo basicInfoKWHzl2;
        java.lang.String strCopydefault;
        TagExplanationBottomSheetParams tagExplanationBottomSheetParams = this.djBIcL;
        if (tagExplanationBottomSheetParams == null) {
            return;
        }
        TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
        CompactTag compactTagCopydefault = tagWrapper.copydefault();
        TagExtra tagExtraOLrzqt = tagWrapper.copydefault().OLrzqt();
        TagStaticDataParams tagStaticDataParamsCopydefault = tagExplanationBottomSheetParams.copydefault();
        java.lang.Integer intOrNull = (tagStaticDataParamsCopydefault == null || (overviewAEQbTJ2 = tagStaticDataParamsCopydefault.AEQbTJ()) == null || (basicInfoKWHzl2 = overviewAEQbTJ2.KWHzl()) == null || (strCopydefault = basicInfoKWHzl2.copydefault()) == null) ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(strCopydefault);
        TagStaticDataParams tagStaticDataParamsCopydefault2 = tagExplanationBottomSheetParams.copydefault();
        jOM jomAEQbTJ = jOM.Companion.AEQbTJ(tagExplanationBottomSheetParams.EZpvd(), tagExplanationBottomSheetParams.valueOf(), new TagWrapper(CompactTag.copy$default(compactTagCopydefault, null, false, tagExtraOLrzqt.EZpvd((247 & 1) != 0 ? tagExtraOLrzqt.AhwBna : null, (247 & 2) != 0 ? tagExtraOLrzqt.EZpvd : null, (247 & 4) != 0 ? tagExtraOLrzqt.KWHzl : null, (247 & 8) != 0 ? tagExtraOLrzqt.djBIcL : new TagLocalProperty(null, null, null, null, intOrNull, (tagStaticDataParamsCopydefault2 == null || (overviewAEQbTJ = tagStaticDataParamsCopydefault2.AEQbTJ()) == null || (basicInfoKWHzl = overviewAEQbTJ.KWHzl()) == null || (strKWHzl = basicInfoKWHzl.KWHzl()) == null) ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(strKWHzl), null, 79, null), (247 & 16) != 0 ? tagExtraOLrzqt.OLrzqt : null, (247 & 32) != 0 ? tagExtraOLrzqt.AEQbTJ : null, (247 & 64) != 0 ? tagExtraOLrzqt.gEmmrt : null, (247 & 128) != 0 ? tagExtraOLrzqt.copydefault : null), 3, null), tagMetaAEQbTJ));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        jomAEQbTJ.show(childFragmentManager);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new TagExplanationFragment$onDevAnalysisClick$1(this, null), 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [509=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.util.List<kMU> OLrzqt(java.util.List<TagWrapper> list) {
        java.lang.String strOLrzqt;
        C29690kyR c29690kyREZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Integer resourceKey = TagGroup.DATA.getResourceKey();
        if (resourceKey == null || (strOLrzqt = C33070mpX.OLrzqt(resourceKey.intValue(), requireContext())) == null) {
            return arrayList;
        }
        arrayList.add(new C29686kyN(strOLrzqt));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TagWrapper tagWrapper : list) {
            TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
            java.lang.Boolean boolValueOf = null;
            java.lang.String strFetchVPNInfo = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.fetchVPNInfo() : null;
            if (strFetchVPNInfo != null) {
                switch (strFetchVPNInfo.hashCode()) {
                    case -1377881982:
                        c29690kyREZpvd = strFetchVPNInfo.equals("bundle") ? EZpvd(tagWrapper) : null;
                        break;
                    case -897788689:
                        c29690kyREZpvd = strFetchVPNInfo.equals("sniper") ? AhwBna(tagWrapper) : null;
                        break;
                    case -544577695:
                        c29690kyREZpvd = strFetchVPNInfo.equals("topHolder") ? valueOf(tagWrapper) : null;
                        break;
                    case 99349:
                        c29690kyREZpvd = strFetchVPNInfo.equals("dev") ? KWHzl(tagWrapper) : null;
                        break;
                    case 133626717:
                        c29690kyREZpvd = strFetchVPNInfo.equals("suspicious") ? OLrzqt(tagWrapper) : null;
                        break;
                    default:
                        c29690kyREZpvd = null;
                        break;
                }
            } else {
                c29690kyREZpvd = null;
            }
            if (c29690kyREZpvd != null) {
                boolValueOf = java.lang.Boolean.valueOf(arrayList.add(c29690kyREZpvd));
            }
            arrayList2.add(boolValueOf);
        }
        return arrayList.size() > 1 ? arrayList : yDY.AhwBna();
    }

    public final android.text.SpannedString KWHzl(TagMeta tagMeta, java.lang.Integer num) {
        if (tagMeta == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tagMeta.DbNXlk())) {
            return new android.text.SpannedString("");
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) C29083kmu.copydefault(tagMeta.DbNXlk() + ": ", num != null ? num.intValue() : C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)));
        return new android.text.SpannedString(spannableStringBuilder);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.gEmmrt = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.kyw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kyw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29721kyw copydefault(@NotNull TagExplanationBottomSheetParams tagExplanationBottomSheetParams) {
            Intrinsics.checkNotNullParameter(tagExplanationBottomSheetParams, "");
            C29721kyw c29721kyw = new C29721kyw();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("arg.params", tagExplanationBottomSheetParams);
            c29721kyw.setArguments(bundle);
            return c29721kyw;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<C29689kyQ> KWHzl(java.util.List<TagWrapper> list) {
        java.lang.String strAhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TagWrapper tagWrapper : list) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Function0 function0 = null;
            if (C33054mpH.AEQbTJ(contextRequireContext)) {
                TagMeta tagMetaAEQbTJ = tagWrapper.AEQbTJ();
                strAhwBna = tagMetaAEQbTJ != null ? tagMetaAEQbTJ.KWHzl() : null;
            } else {
                TagMeta tagMetaAEQbTJ2 = tagWrapper.AEQbTJ();
                if (tagMetaAEQbTJ2 != null) {
                    strAhwBna = tagMetaAEQbTJ2.AhwBna();
                }
            }
            if (strAhwBna == null) {
                strAhwBna = "";
            }
            TagMeta tagMetaAEQbTJ3 = tagWrapper.AEQbTJ();
            boolean zAEQbTJ = tagMetaAEQbTJ3 != null ? tagMetaAEQbTJ3.AEQbTJ() : false;
            final TagEventProperty tagEventPropertyKWHzl = tagWrapper.copydefault().OLrzqt().KWHzl();
            TagMeta tagMetaAEQbTJ4 = tagWrapper.AEQbTJ();
            java.lang.String strDbNXlk = tagMetaAEQbTJ4 != null ? tagMetaAEQbTJ4.DbNXlk() : null;
            java.lang.String str = strDbNXlk != null ? strDbNXlk : "";
            if (tagEventPropertyKWHzl != null) {
                function0 = new Function0() { // from class: o.kyz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C29721kyw.OLrzqt(tagEventPropertyKWHzl, this);
                    }
                };
            }
            arrayList.add(new C29689kyQ(strAhwBna, zAEQbTJ, str, function0));
        }
        return arrayList;
    }
}
