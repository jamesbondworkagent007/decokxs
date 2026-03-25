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
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$generateTagsFromMetadata$1;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$initView$2;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$loadExplanationList$1;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.dexkline.market.features.tag.domain.TagMeta;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.tag.ui.TagViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mTY extends mTZ {
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm djBIcL;
    public oND gEmmrt;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.mTW
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mTY.copydefault(this.OLrzqt);
        }
    });
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public mTY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoBottomSheet$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.mTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mTY.djBIcL();
            }
        });
    }

    public final HolderInfoParams AYXKKw() {
        return (HolderInfoParams) this.valueOf.getValue();
    }

    public static final HolderInfoParams copydefault(mTY mty) {
        HolderInfoParams holderInfoParams;
        android.os.Bundle arguments = mty.getArguments();
        return (arguments == null || (holderInfoParams = (HolderInfoParams) arguments.getParcelable("holder.track")) == null) ? new HolderInfoParams("", "", null, 4, null) : holderInfoParams;
    }

    private final TagViewModel valueOf() {
        return (TagViewModel) this.djBIcL.getValue();
    }

    public final C34632nfk gEmmrt() {
        return (C34632nfk) this.AYXKKw.getValue();
    }

    public static final C34632nfk djBIcL() {
        C34632nfk c34632nfk = new C34632nfk();
        c34632nfk.register(C32224mUb.class, new C32227mUe());
        return c34632nfk;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mTY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final mTY EZpvd(@NotNull HolderInfoParams holderInfoParams) {
            Intrinsics.checkNotNullParameter(holderInfoParams, "");
            mTY mty = new mTY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("holder.track", holderInfoParams);
            mty.setArguments(bundle);
            return mty;
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
        this.gEmmrt = oND.copydefault(getCustomLayoutInflater(), constraintLayout, true);
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
        AkhnZx();
    }

    private final void AkhnZx() {
        oND ond = this.gEmmrt;
        if (ond != null) {
            ond.KWHzl.setAdapter(gEmmrt());
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new HolderInfoBottomSheet$initView$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.util.List<TagWrapper> list, Continuation<? super java.util.List<C32224mUb>> continuation) throws java.lang.Throwable {
        HolderInfoBottomSheet$loadExplanationList$1 holderInfoBottomSheet$loadExplanationList$1;
        java.util.List<C32224mUb> listAhwBna;
        if (continuation instanceof HolderInfoBottomSheet$loadExplanationList$1) {
            holderInfoBottomSheet$loadExplanationList$1 = (HolderInfoBottomSheet$loadExplanationList$1) continuation;
            int i = holderInfoBottomSheet$loadExplanationList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderInfoBottomSheet$loadExplanationList$1.label = i - Integer.MIN_VALUE;
            } else {
                holderInfoBottomSheet$loadExplanationList$1 = new HolderInfoBottomSheet$loadExplanationList$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = holderInfoBottomSheet$loadExplanationList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderInfoBottomSheet$loadExplanationList$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listAhwBna = (java.util.List) holderInfoBottomSheet$loadExplanationList$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) objAEQbTJ);
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        if (!(!list.isEmpty())) {
            listAhwBna = AhwBna();
            java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd("bundle");
            holderInfoBottomSheet$loadExplanationList$1.L$0 = listAhwBna;
            holderInfoBottomSheet$loadExplanationList$1.label = 2;
            objAEQbTJ = AEQbTJ(listEZpvd, holderInfoBottomSheet$loadExplanationList$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) objAEQbTJ);
        }
        java.util.List<java.lang.String> arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TagWrapper) it.next()).KWHzl());
        }
        holderInfoBottomSheet$loadExplanationList$1.label = 1;
        objAEQbTJ = AEQbTJ(arrayList, holderInfoBottomSheet$loadExplanationList$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    public final java.util.List<C32224mUb> AhwBna() {
        return yDY.AhwBna(new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKfwDlxl), C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKdMCrTj), null, java.lang.Integer.valueOf(C57406yhn.Activity.ejfBZ), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.RkASWs), C33070mpX.AYXKKw(C35964oKf.Fragment.Th), null, java.lang.Integer.valueOf(C57406yhn.Activity.fJNWhG), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialgBtXYZ), C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialRuDPQV), null, java.lang.Integer.valueOf(C57406yhn.Activity.gHZMYf), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.RZNAhV), C33070mpX.AYXKKw(C35964oKf.Fragment.DTeKQX), null, java.lang.Integer.valueOf(C57406yhn.Activity.sSMYrx), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.RgLUBD), C33070mpX.AYXKKw(C35964oKf.Fragment.fXYAwm), null, java.lang.Integer.valueOf(C57406yhn.Activity.getFieldNames), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKsfEqpH), C33070mpX.AYXKKw(C35964oKf.Fragment.fbC), null, java.lang.Integer.valueOf(C57406yhn.Activity.zsXlph), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.DlABUU), C33070mpX.AYXKKw(C35964oKf.Fragment.getStatusCode), null, java.lang.Integer.valueOf(C57406yhn.Activity.zuBGHE), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialdPnHjp), C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialRtjmuc), null, java.lang.Integer.valueOf(C57406yhn.Activity.wlaJM), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKfbSiEC), C33070mpX.AYXKKw(C35964oKf.Fragment.DsL), null, java.lang.Integer.valueOf(C57406yhn.Activity.AuCTel), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.getAdvertisingId), C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJKRKUgwx), null, java.lang.Integer.valueOf(C57406yhn.Activity.AwvSrB), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.XW), C33070mpX.AYXKKw(C35964oKf.Fragment.fcfzuX), null, java.lang.Integer.valueOf(C57406yhn.Activity.fARcdN), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.RbVjfb), C33070mpX.AYXKKw(C35964oKf.Fragment.DQzvGNdrmXxu), null, java.lang.Integer.valueOf(C57406yhn.Activity.AuCTelauCTel), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.RIuxYh), C33070mpX.AYXKKw(C35964oKf.Fragment.DQzvGN), null, java.lang.Integer.valueOf(C57406yhn.Activity.hDKMBd), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.RTWSvT), C33070mpX.AYXKKw(C35964oKf.Fragment.gdmIOq), null, java.lang.Integer.valueOf(C57406yhn.Activity.zLjUOn), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.DQzvGNdrmXxudrmXxu), C33070mpX.AYXKKw(C35964oKf.Fragment.reset), null, java.lang.Integer.valueOf(C57406yhn.Activity.isConnected), null, 20, null), new C32224mUb(C33070mpX.AYXKKw(C35964oKf.Fragment.DcMfJK), C33070mpX.AYXKKw(C35964oKf.Fragment.isReflectionWorking), null, java.lang.Integer.valueOf(C57406yhn.Activity.uzCIH), null, 20, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006d -> B:20:0x0070). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<java.lang.String> list, Continuation<? super java.util.List<C32224mUb>> continuation) throws java.lang.Throwable {
        HolderInfoBottomSheet$generateTagsFromMetadata$1 holderInfoBottomSheet$generateTagsFromMetadata$1;
        java.util.Iterator it;
        mTY mty;
        java.util.Collection collection;
        if (continuation instanceof HolderInfoBottomSheet$generateTagsFromMetadata$1) {
            holderInfoBottomSheet$generateTagsFromMetadata$1 = (HolderInfoBottomSheet$generateTagsFromMetadata$1) continuation;
            int i = holderInfoBottomSheet$generateTagsFromMetadata$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                holderInfoBottomSheet$generateTagsFromMetadata$1.label = i - Integer.MIN_VALUE;
            } else {
                holderInfoBottomSheet$generateTagsFromMetadata$1 = new HolderInfoBottomSheet$generateTagsFromMetadata$1(this, continuation);
            }
        }
        java.lang.Object obj = holderInfoBottomSheet$generateTagsFromMetadata$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = holderInfoBottomSheet$generateTagsFromMetadata$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            it = list.iterator();
            mty = this;
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) holderInfoBottomSheet$generateTagsFromMetadata$1.L$2;
            collection = (java.util.Collection) holderInfoBottomSheet$generateTagsFromMetadata$1.L$1;
            mty = (mTY) holderInfoBottomSheet$generateTagsFromMetadata$1.L$0;
            C56391yDq.AEQbTJ(obj);
            java.lang.Object objEZpvd = ((Result) obj).m7386unboximpl();
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            TagMeta tagMeta = (TagMeta) objEZpvd;
            if (tagMeta != null) {
                collection.add(tagMeta);
            }
            if (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                TagViewModel tagViewModelValueOf = mty.valueOf();
                holderInfoBottomSheet$generateTagsFromMetadata$1.L$0 = mty;
                holderInfoBottomSheet$generateTagsFromMetadata$1.L$1 = collection;
                holderInfoBottomSheet$generateTagsFromMetadata$1.L$2 = it;
                holderInfoBottomSheet$generateTagsFromMetadata$1.label = 1;
                objEZpvd = tagViewModelValueOf.EZpvd(str, holderInfoBottomSheet$generateTagsFromMetadata$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagMeta tagMeta2 = (TagMeta) objEZpvd;
                if (tagMeta2 != null) {
                }
                if (it.hasNext()) {
                    java.util.List<TagMeta> list2 = (java.util.List) collection;
                    android.content.Context contextRequireContext = mty.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    boolean zAEQbTJ = C33054mpH.AEQbTJ(contextRequireContext);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                    for (TagMeta tagMeta3 : list2) {
                        arrayList2.add(new C32224mUb(tagMeta3.fetchVPNInfo(), tagMeta3.KWHzl(), C34498ndH.OLrzqt.OLrzqt(tagMeta3, zAEQbTJ), null, C56443yFo.AEQbTJ(C52761wXj.TaskDescription.sElUiK), 8, null));
                    }
                    return arrayList2;
                }
            }
        }
    }
}
