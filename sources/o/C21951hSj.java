package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$generateTagsFromMetadata$1;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$initView$2;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$loadExplanationList$1;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21951hSj extends AbstractC21954hSm {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hSn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C21951hSj.copydefault(this.copydefault);
        }
    });
    public final InterfaceC56387yDm gEmmrt;
    public C23487hzE valueOf;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C21951hSj() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hSp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21951hSj.AhwBna();
            }
        });
    }

    public final HolderInfoParams djBIcL() {
        return (HolderInfoParams) this.AhwBna.getValue();
    }

    public static final HolderInfoParams copydefault(C21951hSj c21951hSj) {
        HolderInfoParams holderInfoParams;
        android.os.Bundle arguments = c21951hSj.getArguments();
        return (arguments == null || (holderInfoParams = (HolderInfoParams) arguments.getParcelable("holder.track")) == null) ? new HolderInfoParams("", "", null, 4, null) : holderInfoParams;
    }

    private final TagViewModel valueOf() {
        return (TagViewModel) this.AYXKKw.getValue();
    }

    public final kMM gEmmrt() {
        return (kMM) this.gEmmrt.getValue();
    }

    public static final kMM AhwBna() {
        kMM kmm = new kMM();
        kmm.register(C21961hSt.class, new C21956hSo());
        return kmm;
    }

    /* JADX INFO: renamed from: o.hSj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hSj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21951hSj EZpvd(@NotNull HolderInfoParams holderInfoParams) {
            Intrinsics.checkNotNullParameter(holderInfoParams, "");
            C21951hSj c21951hSj = new C21951hSj();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("holder.track", holderInfoParams);
            c21951hSj.setArguments(bundle);
            return c21951hSj;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.valueOf = C23487hzE.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        fetchVPNInfo();
    }

    private final void fetchVPNInfo() {
        C32866mlf.onEvent$default(djBIcL().OLrzqt(), (TrackChannel[]) null, new Function1() { // from class: o.hSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21951hSj.copydefault(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(C21951hSj c21951hSj, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_symbol", c21951hSj.djBIcL().EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        C23487hzE c23487hzE = this.valueOf;
        if (c23487hzE != null) {
            c23487hzE.copydefault.setAdapter(gEmmrt());
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HolderInfoBottomSheet$initView$2(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<TagWrapper> list, Continuation<? super java.util.List<C21961hSt>> continuation) throws java.lang.Throwable {
        HolderInfoBottomSheet$loadExplanationList$1 holderInfoBottomSheet$loadExplanationList$1;
        if (continuation instanceof HolderInfoBottomSheet$loadExplanationList$1) {
            holderInfoBottomSheet$loadExplanationList$1 = (HolderInfoBottomSheet$loadExplanationList$1) continuation;
            int i = holderInfoBottomSheet$loadExplanationList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderInfoBottomSheet$loadExplanationList$1.label = i - Integer.MIN_VALUE;
            } else {
                holderInfoBottomSheet$loadExplanationList$1 = new HolderInfoBottomSheet$loadExplanationList$1(this, continuation);
            }
        }
        HolderInfoBottomSheet$loadExplanationList$1 holderInfoBottomSheet$loadExplanationList$12 = holderInfoBottomSheet$loadExplanationList$1;
        java.lang.Object objEZpvd = holderInfoBottomSheet$loadExplanationList$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderInfoBottomSheet$loadExplanationList$12.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objEZpvd);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
            return (java.util.List) objEZpvd;
        }
        C56391yDq.AEQbTJ(objEZpvd);
        if (!(!list.isEmpty())) {
            java.util.List<java.lang.String> listGEmmrt = yDY.gEmmrt("kol", "liquidityPool", "suspicious", "suspectedRatTradingAddress", "suspectedPhishingWallet", "whales", "sniper", "smartMoney", "dev", "topHolder", "fresh", "paperHands", "diamondHands", "mevBot_sandwich", "tradingBot", "exchange", "bundle");
            holderInfoBottomSheet$loadExplanationList$12.label = 2;
            objEZpvd = EZpvd(listGEmmrt, true, holderInfoBottomSheet$loadExplanationList$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return (java.util.List) objEZpvd;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TagWrapper) it.next()).OLrzqt());
        }
        holderInfoBottomSheet$loadExplanationList$12.label = 1;
        objEZpvd = generateTagsFromMetadata$default(this, arrayList, false, holderInfoBottomSheet$loadExplanationList$12, 2, null);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    public static /* synthetic */ java.lang.Object generateTagsFromMetadata$default(C21951hSj c21951hSj, java.util.List list, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c21951hSj.EZpvd(list, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:21:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<java.lang.String> list, boolean z, Continuation<? super java.util.List<C21961hSt>> continuation) throws java.lang.Throwable {
        HolderInfoBottomSheet$generateTagsFromMetadata$1 holderInfoBottomSheet$generateTagsFromMetadata$1;
        C21951hSj c21951hSj;
        java.util.Collection arrayList;
        C21951hSj c21951hSj2;
        java.util.Iterator it;
        boolean z2;
        if (continuation instanceof HolderInfoBottomSheet$generateTagsFromMetadata$1) {
            holderInfoBottomSheet$generateTagsFromMetadata$1 = (HolderInfoBottomSheet$generateTagsFromMetadata$1) continuation;
            int i = holderInfoBottomSheet$generateTagsFromMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderInfoBottomSheet$generateTagsFromMetadata$1.label = i - Integer.MIN_VALUE;
                c21951hSj = this;
            } else {
                c21951hSj = this;
                holderInfoBottomSheet$generateTagsFromMetadata$1 = new HolderInfoBottomSheet$generateTagsFromMetadata$1(c21951hSj, continuation);
            }
        }
        java.lang.Object obj = holderInfoBottomSheet$generateTagsFromMetadata$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderInfoBottomSheet$generateTagsFromMetadata$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new java.util.ArrayList();
            c21951hSj2 = c21951hSj;
            it = list.iterator();
            z2 = z;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = holderInfoBottomSheet$generateTagsFromMetadata$1.Z$0;
            it = (java.util.Iterator) holderInfoBottomSheet$generateTagsFromMetadata$1.L$2;
            arrayList = (java.util.Collection) holderInfoBottomSheet$generateTagsFromMetadata$1.L$1;
            c21951hSj2 = (C21951hSj) holderInfoBottomSheet$generateTagsFromMetadata$1.L$0;
            C56391yDq.AEQbTJ(obj);
            java.lang.Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            TagMeta tagMeta = (TagMeta) objM7386unboximpl;
            if (tagMeta != null) {
                arrayList.add(tagMeta);
            }
            z2 = z3;
            if (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                TagViewModel tagViewModelValueOf = c21951hSj2.valueOf();
                holderInfoBottomSheet$generateTagsFromMetadata$1.L$0 = c21951hSj2;
                holderInfoBottomSheet$generateTagsFromMetadata$1.L$1 = arrayList;
                holderInfoBottomSheet$generateTagsFromMetadata$1.L$2 = it;
                holderInfoBottomSheet$generateTagsFromMetadata$1.Z$0 = z2;
                holderInfoBottomSheet$generateTagsFromMetadata$1.label = 1;
                java.lang.Object objEZpvd = tagViewModelValueOf.EZpvd(str, holderInfoBottomSheet$generateTagsFromMetadata$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                z3 = z2;
                objM7386unboximpl = objEZpvd;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                TagMeta tagMeta2 = (TagMeta) objM7386unboximpl;
                if (tagMeta2 != null) {
                }
                z2 = z3;
                if (it.hasNext()) {
                    java.util.List<TagMeta> list2 = (java.util.List) arrayList;
                    android.content.Context contextRequireContext = c21951hSj2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    boolean zAEQbTJ = C33054mpH.AEQbTJ(contextRequireContext);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                    for (TagMeta tagMeta3 : list2) {
                        arrayList2.add(new C21961hSt(tagMeta3.AYXKKw(), tagMeta3.copydefault(), C29694kyV.AEQbTJ.KWHzl(tagMeta3, zAEQbTJ), null, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.sElUiK), z2, 8, null));
                    }
                    return arrayList2;
                }
            }
        }
    }
}
