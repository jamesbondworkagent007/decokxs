package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.buysell.ui.currencylist.CurrencySelectionViewModel;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyModel;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lJO extends lJU {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public TradeType AhwBna;
    public java.lang.String KWHzl;
    public java.util.List<CurrencyModel> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final yHO<java.lang.String, java.lang.String, java.lang.Boolean, Unit> djBIcL;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public lJO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r1v0 o.yHO))
 A[MD:(o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:35) call: o.lJO.<init>(o.yHO):void type: THIS */
    public /* synthetic */ lJO(yHO yho, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public lJO(yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, Unit> yho) {
        this.djBIcL = yho;
        this.AEQbTJ = "";
        this.valueOf = "";
        this.OLrzqt = new java.util.ArrayList();
        this.AhwBna = TradeType.BUY;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.currencylist.CurrencySelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.currencylist.CurrencySelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CurrencySelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.currencylist.CurrencySelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.currencylist.CurrencySelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.currencylist.CurrencySelectionBottomSheet$special$$inlined$viewModels$default$5
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
        this.KWHzl = "";
    }

    public final CurrencySelectionViewModel KWHzl() {
        return (CurrencySelectionViewModel) this.copydefault.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        TradeType tradeType;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("default_currency") : null;
        if (string == null) {
            string = "";
        }
        this.AEQbTJ = string;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("selected_currency") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.valueOf = string2;
        CurrencySelectionViewModel currencySelectionViewModelKWHzl = KWHzl();
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string3 = arguments3 != null ? arguments3.getString("selected_token") : null;
        currencySelectionViewModelKWHzl.copydefault(string3 != null ? string3 : "");
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (tradeType = (TradeType) arguments4.getParcelable("trade_type")) == null) {
            tradeType = TradeType.BUY;
        }
        this.AhwBna = tradeType;
        KWHzl().OLrzqt(this.AhwBna, true);
        if (this.djBIcL == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        Intrinsics.copydefault(dialog, "");
        ((BottomSheetDialog) dialog).getBehavior().setSkipCollapsed(true);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull final ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AYXKKw();
        final android.view.View viewInflate = getLayoutInflater().inflate(C31351lsQ.ActionBar.getPostValueLengthLimit, (android.view.ViewGroup) constraintLayout, false);
        constraintLayout.addView(viewInflate, new ConstraintLayout.LayoutParams(-1, -1));
        final CurrencySelectionViewModel currencySelectionViewModelKWHzl = KWHzl();
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<java.lang.Boolean>> mutableLiveDataIsConnected = currencySelectionViewModelKWHzl.isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataIsConnected, viewLifecycleOwner, new Function1() { // from class: o.lJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lJO.KWHzl(viewInflate, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<kotlin.Pair<java.lang.String, java.lang.String>>> liveDataAuCTel = currencySelectionViewModelKWHzl.AuCTel();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataAuCTel, viewLifecycleOwner2, new Function1() { // from class: o.lJL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lJO.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<CurrencySelectionViewModel.TaskDescription>> liveDataFetchVPNInfo = currencySelectionViewModelKWHzl.fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner3, new Function1() { // from class: o.lJM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lJO.EZpvd(this.copydefault, constraintLayout, currencySelectionViewModelKWHzl, (CurrencySelectionViewModel.TaskDescription) obj);
            }
        });
    }

    public static final Unit KWHzl(android.view.View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lJO ljo, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.component1();
        java.lang.String str2 = (java.lang.String) pair.component2();
        lTZ ltz = lTZ.KWHzl;
        android.content.Context contextRequireContext = ljo.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ltz.KWHzl(contextRequireContext, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C31351lsQ.Activity.spnCvw), C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str2))), 5, true, 5000L);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(lJO ljo, ConstraintLayout constraintLayout, CurrencySelectionViewModel currencySelectionViewModel, CurrencySelectionViewModel.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        BuySellCurrency buySellCurrencyCopydefault = taskDescription.copydefault();
        java.util.List<BuySellCurrency> listKWHzl = taskDescription.KWHzl();
        ljo.AEQbTJ = buySellCurrencyCopydefault.getCurrency();
        if (!listKWHzl.isEmpty()) {
            java.util.List<CurrencyModel> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) lJY.OLrzqt(listKWHzl));
            ljo.OLrzqt = listFJNWhG;
            ljo.AEQbTJ(constraintLayout, listFJNWhG);
        } else {
            ljo.dismissAllowingStateLoss();
        }
        currencySelectionViewModel.KWHzl(false);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(ConstraintLayout constraintLayout, final java.util.List<CurrencyModel> list) {
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final OKAnchorSelection oKAnchorSelection = new OKAnchorSelection(context, null, 2, null);
        oKAnchorSelection.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        constraintLayout.addView(oKAnchorSelection, new ConstraintLayout.LayoutParams(-1, -2));
        oKAnchorSelection.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (Intrinsics.EZpvd((java.lang.Object) list.get(i).getCurrency(), (java.lang.Object) this.AEQbTJ)) {
                arrayList2.add(list.get(i));
                arrayList.add(new Application(true, C33070mpX.AYXKKw(C31351lsQ.Activity.dPkBzA), C56532yIw.OLrzqt(arrayList2)));
                list.remove(i);
                break;
            }
            i++;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.OijiEz);
        Intrinsics.copydefault(list, "");
        arrayList.add(new Application(true, strAYXKKw, C56532yIw.OLrzqt(list)));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oKAnchorSelection.OLrzqt((InterfaceC55105xdf) it.next());
        }
        oKAnchorSelection.OLrzqt().setVisibility(8);
        oKAnchorSelection.setConvertViewId(C31351lsQ.ActionBar.QCjLjM);
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.lJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return lJO.OLrzqt(this.copydefault, (C55043xcW) obj, obj2);
            }
        });
        oKAnchorSelection.djBIcL().KWHzl().setHint(C33070mpX.AYXKKw(C31351lsQ.Activity.hNurIN));
        oKAnchorSelection.djBIcL().KWHzl().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lJS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                lJO.AEQbTJ(this.KWHzl, view, z);
            }
        });
        C55173xeu c55173xeuCopydefault = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault != null) {
            c55173xeuCopydefault.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.hbZCHz));
        }
        oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.lJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lJO.AEQbTJ(arrayList2, list, oKAnchorSelection, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit OLrzqt(final lJO ljo, C55043xcW c55043xcW, java.lang.Object obj) {
        android.widget.ImageView imageView;
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        final CurrencyModel currencyModel = (CurrencyModel) obj;
        c55043xcW.EZpvd(C31351lsQ.Application.QDqgQU, currencyModel.getCurrency());
        if (currencyModel.getIconUrl().length() > 0 && (imageView = (android.widget.ImageView) c55043xcW.EZpvd(C31351lsQ.Application.QIZEnU)) != null) {
            C33054mpH.KWHzl(imageView, currencyModel.getIconUrl());
        }
        if (Intrinsics.EZpvd((java.lang.Object) currencyModel.getCurrency(), (java.lang.Object) ljo.valueOf)) {
            android.widget.ImageView imageView2 = (android.widget.ImageView) c55043xcW.EZpvd(C31351lsQ.Application.zuWLRA);
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            android.widget.ImageView imageView3 = (android.widget.ImageView) c55043xcW.EZpvd(C31351lsQ.Application.zuWLRA);
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        c55043xcW.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.lJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lJO.KWHzl(currencyModel, ljo, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void KWHzl(CurrencyModel currencyModel, lJO ljo, android.view.View view) {
        if (Intrinsics.EZpvd((java.lang.Object) currencyModel.getCurrency(), (java.lang.Object) ljo.valueOf)) {
            ljo.dismissAllowingStateLoss();
        } else {
            ljo.KWHzl = currencyModel.getCurrency();
            ljo.KWHzl().EZpvd(currencyModel.getCurrency(), ljo.AhwBna);
        }
    }

    public static final void AEQbTJ(lJO ljo, android.view.View view, boolean z) {
        if (z) {
            CurrencySelectionViewModel.trackSimpleTradeCryptoList$default(ljo.KWHzl(), ljo.AhwBna, "search_bar", null, 4, null);
        }
    }

    public static final Unit AEQbTJ(java.util.List list, java.util.List list2, OKAnchorSelection oKAnchorSelection, java.lang.CharSequence charSequence) {
        if (charSequence != null) {
            java.util.List<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                CurrencyModel currencyModel = (CurrencyModel) it.next();
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) currencyModel.getCurrency(), charSequence, true)) {
                    arrayList.add(currencyModel);
                }
            }
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                CurrencyModel currencyModel2 = (CurrencyModel) it2.next();
                if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) currencyModel2.getCurrency(), charSequence, true)) {
                    arrayList.add(currencyModel2);
                }
            }
            oKAnchorSelection.setSearchResultList(arrayList);
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        final CurrencySelectionViewModel currencySelectionViewModelKWHzl = KWHzl();
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<java.lang.Boolean>> liveDataValues = currencySelectionViewModelKWHzl.values();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataValues, viewLifecycleOwner, new Function1() { // from class: o.lJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lJO.AEQbTJ(currencySelectionViewModelKWHzl, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(CurrencySelectionViewModel currencySelectionViewModel, lJO ljo, boolean z) {
        currencySelectionViewModel.KWHzl(ljo.AhwBna, "select_fiat", ljo.KWHzl);
        if (z) {
            boolean zEZpvd = Intrinsics.EZpvd(mHA.OLrzqt.AEQbTJ(currencySelectionViewModel.fARcdN()), java.lang.Boolean.TRUE);
            yHO<java.lang.String, java.lang.String, java.lang.Boolean, Unit> yho = ljo.djBIcL;
            if (yho != null) {
                yho.invoke(ljo.KWHzl, currencySelectionViewModel.AkhnZx(), java.lang.Boolean.valueOf(zEZpvd));
            }
            ljo.dismissAllowingStateLoss();
        } else {
            ljo.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        int i = C31351lsQ.Activity.FHvxmb;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(this.KWHzl);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = strGEmmrt.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("fiatCurrency1", upperCase);
        java.lang.String upperCase2 = C33129mqd.gEmmrt(this.AEQbTJ).toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt("fiatCurrency2", upperCase2))));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.gkZNMa), new View.OnClickListener() { // from class: o.lJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                lJO.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application implements InterfaceC55105xdf {
        public java.util.List<java.lang.Object> KWHzl;
        public java.lang.String OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(false, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC55105xdf
        public java.util.List<java.lang.Object> getSectionDataList() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC55105xdf
        public boolean getShowSuspension() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC55105xdf
        public java.lang.String getSuspensionTag() {
            return this.OLrzqt;
        }

        public Application(boolean z, java.lang.String str, @NotNull java.util.List<java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = z;
            this.OLrzqt = str;
            this.KWHzl = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:282) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
 A[MD:(boolean, java.lang.String, java.util.List<java.lang.Object>):void (m)] (LINE:279) call: o.lJO.Application.<init>(boolean, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ Application(boolean z, java.lang.String str, java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new java.util.ArrayList() : list);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lJO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
