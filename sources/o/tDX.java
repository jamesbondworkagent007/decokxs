package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.biz_plugin.AllCryptoOption;
import com.okinc.planet.biz_plugin.spot.data.SpotHoldingBean;
import com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsSearchBottomSheet$observeViewModel$1;
import com.okinc.uilab.edit.OKEditText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47501trL;
import o.C52761wXj;
import o.tDE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tDX extends wXX {
    public final C43316rmw EZpvd;
    public final boolean KWHzl;
    public tOW OLrzqt;
    public final boolean copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.copydefault;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tDX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final tDX KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            tDX tdx = new tDX();
            tdx.show(fragmentManager, tDX.class.getSimpleName());
            return tdx;
        }
    }

    public tDX() {
        final Function0 function0 = new Function0() { // from class: o.tEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tDX.djBIcL(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsSearchBottomSheet$special$$inlined$viewModels$default$1
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(tDE.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsSearchBottomSheet$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsSearchBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_plugin.spot.ui.SpotHoldingsSearchBottomSheet$special$$inlined$viewModels$default$4
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
        this.copydefault = true;
        this.EZpvd = new C43316rmw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tDE OLrzqt() {
        return (tDE) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner djBIcL(tDX tdx) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = tdx.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C47501trL.Fragment.aCSzUz));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX));
        this.OLrzqt = tOW.copydefault(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().EZpvd();
        copydefault();
        AEQbTJ();
    }

    private final void copydefault() {
        tOW tow = this.OLrzqt;
        if (tow != null) {
            this.EZpvd.register(AllCryptoOption.class, new tBQ(new Function0() { // from class: o.tEa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return tDX.AEQbTJ(this.OLrzqt);
                }
            }, new Function0() { // from class: o.tEe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(tDX.AYXKKw(this.EZpvd));
                }
            }));
            this.EZpvd.register(SpotHoldingBean.class, new C46014tEq(new Function1() { // from class: o.tEc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return tDX.copydefault(this.EZpvd, (SpotHoldingBean) obj);
                }
            }));
            tow.AEQbTJ.setLayoutManager(new LinearLayoutManager(requireContext()));
            tow.AEQbTJ.setAdapter(this.EZpvd);
            tow.copydefault.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.ROgMPW));
            tow.KWHzl.KWHzl().addTextChangedListener(new StateListAnimator());
        }
    }

    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((SpotHoldingBean) t).getTradeAssetPlanetBean().getTokenName(), ((SpotHoldingBean) t2).getTradeAssetPlanetBean().getTokenName());
        }
    }

    public static final Unit AEQbTJ(tDX tdx) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        tOW tow = tdx.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        android.view.View view = tdx.getView();
        if (view != null) {
            view.clearFocus();
        }
        tdx.OLrzqt().copydefault();
        tdx.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final boolean AYXKKw(tDX tdx) {
        return tdx.OLrzqt().KWHzl().getValue().KWHzl() == null;
    }

    public static final Unit copydefault(tDX tdx, final SpotHoldingBean spotHoldingBean) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        Intrinsics.checkNotNullParameter(spotHoldingBean, "");
        tOW tow = tdx.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        android.view.View view = tdx.getView();
        if (view != null) {
            view.clearFocus();
        }
        tdx.OLrzqt().copydefault(spotHoldingBean);
        C32866mlf.onEvent$default("Feeds_Top_PluginCardTokenFilter_Click", (TrackChannel[]) null, new Function1() { // from class: o.tEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tDX.KWHzl(spotHoldingBean, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        tdx.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SpotHoldingBean spotHoldingBean, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "spot_position", true);
        eventParamsList.put("token", spotHoldingBean.getTradeAssetPlanetBean().getTokenName(), false);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            tDX.this.OLrzqt().KWHzl(java.lang.String.valueOf(editable));
        }
    }

    private final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpotHoldingsSearchBottomSheet$observeViewModel$1(this, null), 3, null);
    }

    public final void KWHzl(tDE.Activity activity) {
        tOW tow = this.OLrzqt;
        if (tow != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new AllCryptoOption((java.lang.String) null, 1, (DefaultConstructorMarker) null));
            java.util.List<SpotHoldingBean> listEZpvd = activity.EZpvd();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (java.lang.Object obj : listEZpvd) {
                java.lang.String tokenName = ((SpotHoldingBean) obj).getTradeAssetPlanetBean().getTokenName();
                java.lang.Object arrayList2 = linkedHashMap.get(tokenName);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                    linkedHashMap.put(tokenName, arrayList2);
                }
                ((java.util.List) arrayList2).add(obj);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(linkedHashMap.size());
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList3.add((SpotHoldingBean) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((Map.Entry) it.next()).getValue()));
            }
            arrayList.addAll(CollectionsKt___CollectionsKt.EZpvd(arrayList3, new Activity()));
            this.EZpvd.setItems(arrayList);
            this.EZpvd.notifyDataSetChanged();
            if (activity.EZpvd().isEmpty() && activity.KWHzl().length() > 0) {
                tow.AEQbTJ.setVisibility(0);
                tow.copydefault.getRoot().setVisibility(0);
            } else {
                tow.AEQbTJ.setVisibility(0);
                tow.copydefault.getRoot().setVisibility(8);
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        tOW tow = this.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        android.view.View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        C33570myu.copydefault((android.app.Activity) getActivity());
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55230xfy c55230xfy;
        OKEditText oKEditTextKWHzl;
        tOW tow = this.OLrzqt;
        if (tow != null && (c55230xfy = tow.KWHzl) != null && (oKEditTextKWHzl = c55230xfy.KWHzl()) != null) {
            oKEditTextKWHzl.clearFocus();
        }
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
