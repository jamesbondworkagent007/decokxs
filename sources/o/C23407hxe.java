package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$onFilterByChainName$1;
import com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$setupViews$1$3;
import com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$setupViews$1$4;
import com.okinc.business.dexui.chain_picker.ChainPickerParams;
import com.okinc.business.dexui.chain_picker.ChainPickerViewModel;
import com.okinc.uilab.list.OKAnchorSelection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC23411hxi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hxe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23407hxe extends AbstractC23410hxh {
    public final InterfaceC56387yDm EZpvd;
    public C23459hyd OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C23407hxe() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ChainPickerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.chain_picker.ChainPickerBottomSheet$special$$inlined$viewModels$default$5
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

    public final ChainPickerParams KWHzl() {
        ChainPickerParams chainPickerParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (chainPickerParams = (ChainPickerParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.params", ChainPickerParams.class))) == null) ? new ChainPickerParams(null, 1, null) : chainPickerParams;
    }

    /* JADX DEBUG: Possible override for method o.hxh.EZpvd()V */
    public final ChainPickerViewModel EZpvd() {
        return (ChainPickerViewModel) this.EZpvd.getValue();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.AYXKKw().setText(getString(C23274hvD.Fragment.ActivityResultRegistryOwner));
        wxq.AYXKKw().setContentDescription("web3_dex_chain_picker_title_view");
        wxq.setStyle(2);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.OLrzqt = C23459hyd.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL();
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().OLrzqt(), null, new Application(), 2, null);
        EZpvd().AEQbTJ();
    }

    /* JADX INFO: renamed from: o.hxe$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC23411hxi interfaceC23411hxi, Continuation<? super Unit> continuation) {
            C23407hxe.this.OLrzqt(interfaceC23411hxi);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    private final void djBIcL() {
        OKAnchorSelection oKAnchorSelection;
        C23459hyd c23459hyd = this.OLrzqt;
        if (c23459hyd == null || (oKAnchorSelection = c23459hyd.EZpvd) == null) {
            return;
        }
        if (oKAnchorSelection.djBIcL().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            C55230xfy c55230xfyDjBIcL = oKAnchorSelection.djBIcL();
            ViewGroup.LayoutParams layoutParams = c55230xfyDjBIcL.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginStart(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                layoutParams2.setMarginEnd(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                c55230xfyDjBIcL.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
        if (oKAnchorSelection.AYXKKw().getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RecyclerView recyclerViewAYXKKw = oKAnchorSelection.AYXKKw();
            ViewGroup.LayoutParams layoutParams3 = recyclerViewAYXKKw.getLayoutParams();
            if (layoutParams3 != null) {
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
                recyclerViewAYXKKw.setLayoutParams(layoutParams4);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
        }
        oKAnchorSelection.AYXKKw().setOverScrollMode(2);
        oKAnchorSelection.setConvertViewId(C23274hvD.Activity.fupbxE);
        oKAnchorSelection.setConvertViewCallback(new ChainPickerBottomSheet$setupViews$1$3(this));
        oKAnchorSelection.setSearchResultCallback(new ChainPickerBottomSheet$setupViews$1$4(this));
        C55173xeu c55173xeuCopydefault = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault != null) {
            java.lang.String string = getString(C23274hvD.Fragment.getMediaSession);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuCopydefault.setTitle(string);
        }
        oKAnchorSelection.djBIcL().KWHzl().setHint(getString(C23274hvD.Fragment.getStateWithUpdatedPosition));
    }

    /* JADX INFO: renamed from: o.hxe$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((MarketChainBean) t).getChainName(), ((MarketChainBean) t2).getChainName());
        }
    }

    public final void OLrzqt(InterfaceC23411hxi interfaceC23411hxi) {
        C23459hyd c23459hyd = this.OLrzqt;
        if (c23459hyd != null) {
            C55113xdn c55113xdn = c23459hyd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(interfaceC23411hxi instanceof InterfaceC23411hxi.Activity ? 0 : 8);
            OKAnchorSelection oKAnchorSelection = c23459hyd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(oKAnchorSelection, "");
            boolean z = interfaceC23411hxi instanceof InterfaceC23411hxi.Application;
            oKAnchorSelection.setVisibility(z ? 0 : 8);
            if (z) {
                copydefault(((InterfaceC23411hxi.Application) interfaceC23411hxi).copydefault());
            }
        }
    }

    /* JADX INFO: renamed from: o.hxe$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(((MarketChainBean) t2).getPopularWeight());
            int iIntValue = intOrNull != null ? intOrNull.intValue() : Integer.MIN_VALUE;
            java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(((MarketChainBean) t).getPopularWeight());
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : Integer.MIN_VALUE));
        }
    }

    public final void EZpvd(C55043xcW c55043xcW, java.lang.Object obj) {
        int iIndexOf$default;
        if (obj instanceof C23408hxf) {
            C21535hCz c21535hCzAEQbTJ = C21535hCz.AEQbTJ(c55043xcW.itemView);
            Intrinsics.checkNotNullExpressionValue(c21535hCzAEQbTJ, "");
            LinearLayoutCompat root = c21535hCzAEQbTJ.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, this, obj));
            C23408hxf c23408hxf = (C23408hxf) obj;
            if (c23408hxf.KWHzl().length() > 0) {
                c21535hCzAEQbTJ.getRoot().setContentDescription(c23408hxf.KWHzl());
            }
            if (c23408hxf.AEQbTJ().length() > 0 && (c21535hCzAEQbTJ.getRoot().getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                LinearLayoutCompat root2 = c21535hCzAEQbTJ.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                ViewGroup.LayoutParams layoutParams = root2.getLayoutParams();
                if (layoutParams != null) {
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                    layoutParams2.setMarginEnd(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null));
                    root2.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                }
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(c23408hxf.AYXKKw());
            if (c23408hxf.AEQbTJ().length() > 0 && (iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) c23408hxf.AYXKKw(), c23408hxf.AEQbTJ(), 0, true, 2, (java.lang.Object) null)) >= 0) {
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.fkESqH)), iIndexOf$default, c23408hxf.AEQbTJ().length() + iIndexOf$default, 18);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.QVsKAR)), iIndexOf$default, c23408hxf.AEQbTJ().length() + iIndexOf$default, 18);
            }
            c21535hCzAEQbTJ.OLrzqt.setText(spannableString);
            if (c23408hxf.EZpvd().length() > 0) {
                AppCompatImageView appCompatImageView = c21535hCzAEQbTJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                C25386ivj.KWHzl(appCompatImageView, c23408hxf.EZpvd(), new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
            } else if (c23408hxf.copydefault() != null) {
                c21535hCzAEQbTJ.EZpvd.setImageResource(c23408hxf.copydefault().intValue());
            } else {
                c21535hCzAEQbTJ.EZpvd.setImageResource(C57406yhn.Activity.QKVWgx);
            }
            wYC wyc = c21535hCzAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(c23408hxf.valueOf() ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: o.hxe$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C23407hxe AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ java.lang.Object OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C23407hxe c23407hxe, java.lang.Object obj) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c23407hxe;
            this.OLrzqt = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityResultCaller parentFragment = this.AEQbTJ.getParentFragment();
                InterfaceC23406hxd interfaceC23406hxd = parentFragment instanceof InterfaceC23406hxd ? (InterfaceC23406hxd) parentFragment : null;
                if (interfaceC23406hxd == null) {
                    KeyEventDispatcher.Component activity = this.AEQbTJ.getActivity();
                    InterfaceC23406hxd interfaceC23406hxd2 = activity instanceof InterfaceC23406hxd ? (InterfaceC23406hxd) activity : null;
                    if (interfaceC23406hxd2 == null) {
                        return;
                    } else {
                        interfaceC23406hxd = interfaceC23406hxd2;
                    }
                }
                interfaceC23406hxd.KWHzl(new MarketChainBean(((C23408hxf) this.OLrzqt).OLrzqt(), ((C23408hxf) this.OLrzqt).AYXKKw(), ((C23408hxf) this.OLrzqt).EZpvd(), (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 0, (java.lang.String) null, false, 1016, (DefaultConstructorMarker) null));
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public final void copydefault(java.util.List<MarketChainBean> list) {
        OKAnchorSelection oKAnchorSelection;
        OKAnchorSelection oKAnchorSelection2;
        OKAnchorSelection oKAnchorSelection3;
        OKAnchorSelection oKAnchorSelection4;
        C23459hyd c23459hyd = this.OLrzqt;
        if (c23459hyd != null && (oKAnchorSelection4 = c23459hyd.EZpvd) != null) {
            oKAnchorSelection4.EZpvd();
        }
        java.util.List<java.lang.String> listAhwBna = yDY.AhwBna("");
        C55102xdc c55102xdc = new C55102xdc(false, null, yDY.AhwBna(AEQbTJ()), 2, null);
        C23459hyd c23459hyd2 = this.OLrzqt;
        if (c23459hyd2 != null && (oKAnchorSelection3 = c23459hyd2.EZpvd) != null) {
            oKAnchorSelection3.OLrzqt(c55102xdc);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((MarketChainBean) obj).getPopularChain()) {
                arrayList.add(obj);
            }
        }
        java.lang.String string = getString(C23274hvD.Fragment.getMediaType);
        java.util.List<MarketChainBean> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar());
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (MarketChainBean marketChainBean : listEZpvd) {
            arrayList2.add(new C23408hxf(marketChainBean.getChainId(), marketChainBean.getChainName(), marketChainBean.getChainLogo(), null, Intrinsics.EZpvd((java.lang.Object) KWHzl().AEQbTJ(), (java.lang.Object) marketChainBean.getChainId()), null, null, 104, null));
        }
        C55102xdc c55102xdc2 = new C55102xdc(true, string, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2));
        if (!arrayList.isEmpty()) {
            listAhwBna.add("★");
            C23459hyd c23459hyd3 = this.OLrzqt;
            if (c23459hyd3 != null && (oKAnchorSelection2 = c23459hyd3.EZpvd) != null) {
                oKAnchorSelection2.OLrzqt(c55102xdc2);
            }
        }
        java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : listEZpvd2) {
            java.lang.Character chValueOf = java.lang.Character.valueOf(java.lang.Character.toUpperCase(C59454zhO.zLjUOn((java.lang.CharSequence) ((MarketChainBean) obj2).getChainName())));
            java.lang.Object arrayList3 = linkedHashMap.get(chValueOf);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap.put(chValueOf, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        SortedMap sortedMapGEmmrt = C56423yEv.gEmmrt(linkedHashMap);
        java.util.ArrayList arrayList4 = new java.util.ArrayList(sortedMapGEmmrt.size());
        for (Map.Entry entry : sortedMapGEmmrt.entrySet()) {
            java.lang.Character ch = (java.lang.Character) entry.getKey();
            java.util.List<MarketChainBean> list2 = (java.util.List) entry.getValue();
            java.lang.String string2 = ch.toString();
            listAhwBna.add(string2);
            Intrinsics.copydefault(list2);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (MarketChainBean marketChainBean2 : list2) {
                arrayList5.add(new C23408hxf(marketChainBean2.getChainId(), marketChainBean2.getChainName(), marketChainBean2.getChainLogo(), null, Intrinsics.EZpvd((java.lang.Object) KWHzl().AEQbTJ(), (java.lang.Object) marketChainBean2.getChainId()), null, null, 104, null));
            }
            arrayList4.add(new C55102xdc(true, string2, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList5)));
        }
        C23459hyd c23459hyd4 = this.OLrzqt;
        if (c23459hyd4 == null || (oKAnchorSelection = c23459hyd4.EZpvd) == null) {
            return;
        }
        oKAnchorSelection.setIndexList(listAhwBna);
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            oKAnchorSelection.OLrzqt((C55102xdc) it.next());
        }
    }

    public final void AEQbTJ(java.lang.CharSequence charSequence) {
        java.lang.String string;
        if (charSequence == null || (string = charSequence.toString()) == null) {
            return;
        }
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ChainPickerBottomSheet$onFilterByChainName$1(this, string, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C23408hxf AEQbTJ() {
        boolean z;
        java.lang.String string = getString(C23274hvD.Fragment.RKcVTr);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int i = C52761wXj.TaskDescription.createSocket;
        if (KWHzl().AEQbTJ() != null) {
            z = CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) C27625jyi.copydefault.OLrzqt()), KWHzl().AEQbTJ());
        }
        return new C23408hxf("-100", string, null, java.lang.Integer.valueOf(i), z, null, "web3_dex_chain_picker_all_network_cell", 36, null);
    }

    /* JADX INFO: renamed from: o.hxe$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hxe.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C23407hxe copydefault(@NotNull ChainPickerParams chainPickerParams) {
            Intrinsics.checkNotNullParameter(chainPickerParams, "");
            C23407hxe c23407hxe = new C23407hxe();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, "default_trade");
            bundle.putParcelable("key.params", chainPickerParams);
            c23407hxe.setArguments(bundle);
            return c23407hxe;
        }
    }
}
