package com.okinc.buysell.ui.bsc.cryptolist;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.bsc.common.BSCTabIndex;
import com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterViewModel;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.oksearch.analytics.FuzzySearchEventSourceEnum;
import com.okinc.oksearch.analytics.FuzzySearchEventTracker;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.AbstractC31465luY;
import o.C30327lUg;
import o.C30350lVc;
import o.C31351lsQ;
import o.C31550lwD;
import o.C31596lwy;
import o.C32989mnw;
import o.C33061mpO;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55173xeu;
import o.C55187xfH;
import o.C55230xfy;
import o.C55363xiY;
import o.C55418xja;
import o.C56392yDr;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.C56524yIo;
import o.C56548yJl;
import o.InterfaceC31670lzr;
import o.InterfaceC47251tmX;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.lEE;
import o.lEI;
import o.lUY;
import o.mHA;
import o.mHT;
import o.wXQ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class CryptoListBottomSheet extends lEI {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public String AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public String AkhnZx;
    public final Function2<CurrencyToken, Boolean, Unit> DbNXlk;
    public AbstractC31465luY KWHzl;
    public boolean OLrzqt;
    public lEE copydefault;
    public ListType djBIcL;
    public double ejfBZ;
    public String fetchVPNInfo;
    public String gEmmrt;
    public List<CurrencyToken> isConnected;
    public boolean valueOf;
    public String values;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ListType.values().length];
            try {
                iArr[ListType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListType.CONVERT_TO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListType.CONVERT_FROM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoListBottomSheet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r1v0 kotlin.jvm.functions.Function2))
 A[MD:(kotlin.jvm.functions.Function2<? super com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken, ? super java.lang.Boolean, kotlin.Unit>):void (m)] (LINE:62) call: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet.<init>(kotlin.jvm.functions.Function2):void type: THIS */
    public /* synthetic */ CryptoListBottomSheet(Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoListBottomSheet(Function2<? super CurrencyToken, ? super Boolean, Unit> function2) {
        this.DbNXlk = function2;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CryptoListBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$viewModels$default$5
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BSCMasterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet$special$$inlined$activityViewModels$default$3
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
        this.djBIcL = ListType.BUY;
        this.AYXKKw = "";
        this.values = "";
        this.AkhnZx = "";
        this.fetchVPNInfo = "";
        this.OLrzqt = true;
        this.gEmmrt = "";
        this.isConnected = new ArrayList();
    }

    public final CryptoListBottomSheetViewModel EZpvd() {
        return (CryptoListBottomSheetViewModel) this.AEQbTJ.getValue();
    }

    private final BSCMasterViewModel gEmmrt() {
        return (BSCMasterViewModel) this.AhwBna.getValue();
    }

    public static final class Fragment implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Fragment() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            CryptoListBottomSheet.this.EZpvd().KWHzl(String.valueOf(editable));
            CryptoListBottomSheet.this.KWHzl(String.valueOf(editable));
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ListType listType;
        ArrayList arrayList;
        super.onCreate(bundle);
        BSCMasterViewModel.ActionBar actionBarValues = gEmmrt().values();
        if (actionBarValues != null) {
            this.djBIcL = actionBarValues.AEQbTJ();
            this.isConnected = CollectionsKt___CollectionsKt.fJNWhG((Collection) actionBarValues.EZpvd());
            this.AYXKKw = actionBarValues.copydefault();
            this.values = actionBarValues.OLrzqt();
            this.ejfBZ = actionBarValues.AhwBna();
            this.AkhnZx = actionBarValues.djBIcL();
            this.fetchVPNInfo = actionBarValues.AYXKKw();
            this.gEmmrt = actionBarValues.KWHzl();
            gEmmrt().EZpvd((BSCMasterViewModel.ActionBar) null);
        } else {
            Bundle arguments = getArguments();
            if (arguments == null || (listType = (ListType) arguments.getParcelable("list_type")) == null) {
                listType = ListType.BUY;
            }
            this.djBIcL = listType;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (arrayList = arguments2.getParcelableArrayList("crypto_list")) == null) {
                arrayList = new ArrayList();
            }
            this.isConnected = arrayList;
            Bundle arguments3 = getArguments();
            String string = arguments3 != null ? arguments3.getString("currency_symbol") : null;
            if (string == null) {
                string = "";
            }
            this.AYXKKw = string;
            Bundle arguments4 = getArguments();
            String string2 = arguments4 != null ? arguments4.getString(OtcExtraKeys.QUOTE_CURRENCY) : null;
            if (string2 == null) {
                string2 = "";
            }
            this.values = string2;
            Bundle arguments5 = getArguments();
            this.ejfBZ = arguments5 != null ? arguments5.getDouble("use_rate") : AudioStats.AUDIO_AMPLITUDE_NONE;
            Bundle arguments6 = getArguments();
            String string3 = arguments6 != null ? arguments6.getString("selected+token") : null;
            if (string3 == null) {
                string3 = "";
            }
            this.AkhnZx = string3;
            Bundle arguments7 = getArguments();
            String string4 = arguments7 != null ? arguments7.getString("selected_currency") : null;
            if (string4 == null) {
                string4 = "";
            }
            this.fetchVPNInfo = string4;
            Bundle arguments8 = getArguments();
            String string5 = arguments8 != null ? arguments8.getString("filter_token") : null;
            this.gEmmrt = string5 != null ? string5 : "";
        }
        EZpvd().AkhnZx().setValue(this.isConnected);
        if (this.DbNXlk == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        int i = Application.OLrzqt[this.djBIcL.ordinal()];
        if (i == 1) {
            EZpvd().wlaJM();
            EZpvd().iwGUEr();
            return;
        }
        if (i == 2) {
            EZpvd().EZpvd(this.fetchVPNInfo, gEmmrt().fJNWhG() == null);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        EZpvd().wlaJM();
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModelEZpvd = EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        cryptoListBottomSheetViewModelEZpvd.AEQbTJ(viewLifecycleOwner, this.isConnected, this.values);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        wxq.setStyle(2);
        int i = Application.OLrzqt[this.djBIcL.ordinal()];
        if (i == 1) {
            wxq.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.Dmq));
            return;
        }
        if (i == 2) {
            wxq.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.zblBkD));
        } else if (i == 3) {
            wxq.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.zLjUOn));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            wxq.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.iwGUEr));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC31465luY abstractC31465luYEZpvd = AbstractC31465luY.EZpvd(LayoutInflater.from(getContext()), constraintLayout, true);
        this.KWHzl = abstractC31465luYEZpvd;
        AbstractC31465luY abstractC31465luY = null;
        if (abstractC31465luYEZpvd == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luYEZpvd = null;
        }
        abstractC31465luYEZpvd.gEmmrt.addOnScrollListener(new StateListAnimator());
        lEE lee = new lEE(this.djBIcL, this.AkhnZx, new Function1() { // from class: o.lEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.KWHzl(this.OLrzqt, (CurrencyToken) obj);
            }
        });
        this.copydefault = lee;
        abstractC31465luYEZpvd.gEmmrt.setAdapter(lee);
        abstractC31465luYEZpvd.gEmmrt.setItemViewCacheSize(20);
        int i = Application.OLrzqt[this.djBIcL.ordinal()];
        if (i == 1) {
            List<CurrencyToken> value = EZpvd().AkhnZx().getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            EZpvd(lUY.toBuyCryptoListItemsLegacy$default(value, this.AYXKKw, this.ejfBZ, null, 4, null));
        } else if (i == 2) {
            List<CurrencyToken> value2 = EZpvd().AkhnZx().getValue();
            if (value2 == null) {
                value2 = yDY.AhwBna();
            }
            EZpvd((List<? extends CryptoListItem>) lUY.OLrzqt(value2, this.AYXKKw));
        } else if (i == 3) {
            List<CurrencyToken> value3 = EZpvd().AkhnZx().getValue();
            if (value3 == null) {
                value3 = yDY.AhwBna();
            }
            List<? extends CryptoListItem> convertToListItems$default = lUY.toConvertToListItems$default(value3, this.AYXKKw, this.ejfBZ, this.gEmmrt, null, 8, null);
            if (true ^ convertToListItems$default.isEmpty()) {
                AbstractC31465luY abstractC31465luY2 = this.KWHzl;
                if (abstractC31465luY2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY2 = null;
                }
                abstractC31465luY2.copydefault.getRoot().setVisibility(8);
                AbstractC31465luY abstractC31465luY3 = this.KWHzl;
                if (abstractC31465luY3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31465luY = abstractC31465luY3;
                }
                abstractC31465luY.OLrzqt.setVisibility(0);
                EZpvd(convertToListItems$default);
            } else {
                AbstractC31465luY abstractC31465luY4 = this.KWHzl;
                if (abstractC31465luY4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY4 = null;
                }
                abstractC31465luY4.OLrzqt.setVisibility(8);
                AbstractC31465luY abstractC31465luY5 = this.KWHzl;
                if (abstractC31465luY5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY5 = null;
                }
                abstractC31465luY5.copydefault.gEmmrt.getRoot().setVisibility(8);
                AbstractC31465luY abstractC31465luY6 = this.KWHzl;
                if (abstractC31465luY6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY6 = null;
                }
                abstractC31465luY6.copydefault.getRoot().setVisibility(0);
                AbstractC31465luY abstractC31465luY7 = this.KWHzl;
                if (abstractC31465luY7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31465luY = abstractC31465luY7;
                }
                C31550lwD c31550lwD = abstractC31465luY.copydefault;
                c31550lwD.copydefault.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.OBJEWx));
                c31550lwD.OLrzqt.setVisibility(8);
                c31550lwD.AEQbTJ.setVisibility(8);
            }
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            List<CurrencyToken> value4 = EZpvd().AkhnZx().getValue();
            if (value4 == null) {
                value4 = yDY.AhwBna();
            }
            List<CryptoListItem> listAEQbTJ = lUY.AEQbTJ(value4, this.AYXKKw, this.gEmmrt);
            if (true ^ listAEQbTJ.isEmpty()) {
                AbstractC31465luY abstractC31465luY8 = this.KWHzl;
                if (abstractC31465luY8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY8 = null;
                }
                abstractC31465luY8.copydefault.getRoot().setVisibility(8);
                AbstractC31465luY abstractC31465luY9 = this.KWHzl;
                if (abstractC31465luY9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31465luY = abstractC31465luY9;
                }
                abstractC31465luY.OLrzqt.setVisibility(0);
                EZpvd((List<? extends CryptoListItem>) listAEQbTJ);
            } else {
                EZpvd().values();
                AbstractC31465luY abstractC31465luY10 = this.KWHzl;
                if (abstractC31465luY10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY10 = null;
                }
                abstractC31465luY10.OLrzqt.setVisibility(8);
                AbstractC31465luY abstractC31465luY11 = this.KWHzl;
                if (abstractC31465luY11 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31465luY11 = null;
                }
                abstractC31465luY11.copydefault.getRoot().setVisibility(0);
                AbstractC31465luY abstractC31465luY12 = this.KWHzl;
                if (abstractC31465luY12 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31465luY = abstractC31465luY12;
                }
                C31550lwD c31550lwD2 = abstractC31465luY.copydefault;
                c31550lwD2.copydefault.setSubTitle((CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.gEmmrt));
                c31550lwD2.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lEj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        CryptoListBottomSheet.OLrzqt(this.EZpvd, view);
                    }
                });
                c31550lwD2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lEn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        CryptoListBottomSheet.AEQbTJ(this.copydefault, view);
                    }
                });
            }
        }
        AYXKKw();
        KWHzl();
        AhwBna();
    }

    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                if (i == 1 || i == 2) {
                    CryptoListBottomSheet.this.valueOf = true;
                    return;
                }
                return;
            }
            CryptoListBottomSheet.this.valueOf = false;
            if (C33129mqd.OLrzqt((CharSequence) CryptoListBottomSheet.this.EZpvd().ejfBZ())) {
                CryptoListBottomSheet cryptoListBottomSheet = CryptoListBottomSheet.this;
                cryptoListBottomSheet.KWHzl(cryptoListBottomSheet.EZpvd().ejfBZ());
            }
        }
    }

    public static final Unit KWHzl(CryptoListBottomSheet cryptoListBottomSheet, CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        cryptoListBottomSheet.KWHzl(currencyToken, true);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(CryptoListBottomSheet cryptoListBottomSheet, View view) {
        DepositWithdrawPageParameters depositWithdrawPageParameters = new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPage(null, null, null, 7, null), OKPaymentSource.LITE_CONVERT_TOPUP);
        InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
        FragmentActivity fragmentActivityRequireActivity = cryptoListBottomSheet.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default(interfaceC47251tmX, fragmentActivityRequireActivity, depositWithdrawPageParameters, null, null, 12, null);
    }

    public static final void AEQbTJ(CryptoListBottomSheet cryptoListBottomSheet, View view) {
        cryptoListBottomSheet.gEmmrt().AEQbTJ(BSCTabIndex.BUY);
        cryptoListBottomSheet.dismiss();
    }

    private final void AhwBna() {
        final CryptoListBottomSheetViewModel cryptoListBottomSheetViewModelEZpvd = EZpvd();
        cryptoListBottomSheetViewModelEZpvd.fetchVPNInfo().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.lEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.copydefault(this.OLrzqt, (java.util.Map) obj);
            }
        }));
        mHA mha = mHA.OLrzqt;
        MutableLiveData<C32989mnw<Boolean>> mutableLiveDataHDKMBd = cryptoListBottomSheetViewModelEZpvd.hDKMBd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(mutableLiveDataHDKMBd, viewLifecycleOwner, new Function1() { // from class: o.lEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.djBIcL(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        MutableLiveData<C32989mnw<Boolean>> mutableLiveDataUzCIH = cryptoListBottomSheetViewModelEZpvd.uzCIH();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(mutableLiveDataUzCIH, viewLifecycleOwner2, new Function1() { // from class: o.lEo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.AYXKKw(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<Boolean>> liveDataFJNWhG = cryptoListBottomSheetViewModelEZpvd.fJNWhG();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataFJNWhG, viewLifecycleOwner3, new Function1() { // from class: o.lEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.isConnected(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        LiveData<C32989mnw<List<CurrencyToken>>> liveDataIsConnected = cryptoListBottomSheetViewModelEZpvd.isConnected();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(liveDataIsConnected, viewLifecycleOwner4, new Function1() { // from class: o.lEt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.AEQbTJ(cryptoListBottomSheetViewModelEZpvd, this, (java.util.List) obj);
            }
        });
        LiveData<C32989mnw<Boolean>> liveDataFARcdN = cryptoListBottomSheetViewModelEZpvd.fARcdN();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        mha.copydefault(liveDataFARcdN, viewLifecycleOwner5, new Function1() { // from class: o.lEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.gEmmrt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        MutableLiveData<C32989mnw<Boolean>> mutableLiveDataFIwbmz = cryptoListBottomSheetViewModelEZpvd.fIwbmz();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        mha.copydefault(mutableLiveDataFIwbmz, viewLifecycleOwner6, new Function1() { // from class: o.lEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.AhwBna(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(CryptoListBottomSheet cryptoListBottomSheet, Map map) {
        Intrinsics.copydefault(map);
        cryptoListBottomSheet.copydefault((Map<String, FairPriceTickerData>) map);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(CryptoListBottomSheet cryptoListBottomSheet, boolean z) {
        AbstractC31465luY abstractC31465luY = null;
        if (z) {
            AbstractC31465luY abstractC31465luY2 = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY2;
            }
            abstractC31465luY.copydefault.gEmmrt.getRoot().setVisibility(0);
        } else {
            AbstractC31465luY abstractC31465luY3 = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY3;
            }
            abstractC31465luY.copydefault.gEmmrt.getRoot().setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(CryptoListBottomSheet cryptoListBottomSheet, boolean z) {
        AbstractC31465luY abstractC31465luY = null;
        if (z) {
            AbstractC31465luY abstractC31465luY2 = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY2;
            }
            abstractC31465luY.copydefault.OLrzqt.setVisibility(0);
        } else {
            AbstractC31465luY abstractC31465luY3 = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY3;
            }
            abstractC31465luY.copydefault.OLrzqt.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(CryptoListBottomSheet cryptoListBottomSheet, boolean z) {
        AbstractC31465luY abstractC31465luY = null;
        if (!z) {
            AbstractC31465luY abstractC31465luY2 = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY2;
            }
            abstractC31465luY.KWHzl.setVisibility(8);
            return Unit.INSTANCE;
        }
        AbstractC31465luY abstractC31465luY3 = cryptoListBottomSheet.KWHzl;
        if (abstractC31465luY3 == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY3 = null;
        }
        abstractC31465luY3.KWHzl.setVisibility(0);
        String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.copydefault);
        AbstractC31465luY abstractC31465luY4 = cryptoListBottomSheet.KWHzl;
        if (abstractC31465luY4 == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY4 = null;
        }
        abstractC31465luY4.KWHzl.setClickable(true);
        AbstractC31465luY abstractC31465luY5 = cryptoListBottomSheet.KWHzl;
        if (abstractC31465luY5 == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY5 = null;
        }
        abstractC31465luY5.KWHzl.setFocusable(true);
        AbstractC31465luY abstractC31465luY6 = cryptoListBottomSheet.KWHzl;
        if (abstractC31465luY6 == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY6 = null;
        }
        abstractC31465luY6.KWHzl.setMovementMethod(LinkMovementMethod.getInstance());
        String strAYXKKw2 = C33070mpX.AYXKKw(C31351lsQ.Activity.OLrzqt);
        String str = strAYXKKw + " " + strAYXKKw2;
        AbstractC31465luY abstractC31465luY7 = cryptoListBottomSheet.KWHzl;
        if (abstractC31465luY7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31465luY = abstractC31465luY7;
        }
        abstractC31465luY.KWHzl.setText(cryptoListBottomSheet.AEQbTJ(str, strAYXKKw2));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(CryptoListBottomSheetViewModel cryptoListBottomSheetViewModel, CryptoListBottomSheet cryptoListBottomSheet, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        cryptoListBottomSheetViewModel.AkhnZx().setValue(list);
        cryptoListBottomSheet.KWHzl();
        setCryptoListItems$default(cryptoListBottomSheet, list, null, 2, null);
        int i = Application.OLrzqt[cryptoListBottomSheet.djBIcL.ordinal()];
        if (i == 1 || i == 3) {
            LifecycleOwner viewLifecycleOwner = cryptoListBottomSheet.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            cryptoListBottomSheetViewModel.AEQbTJ(viewLifecycleOwner, list, cryptoListBottomSheet.values);
        }
        cryptoListBottomSheetViewModel.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(CryptoListBottomSheet cryptoListBottomSheet, boolean z) {
        if (z) {
            AbstractC31465luY abstractC31465luY = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY == null) {
                Intrinsics.gEmmrt("");
                abstractC31465luY = null;
            }
            C31596lwy c31596lwy = abstractC31465luY.AEQbTJ;
            c31596lwy.KWHzl.getRoot().setVisibility(8);
            c31596lwy.getRoot().setVisibility(0);
            c31596lwy.copydefault.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.OBJEWx));
            c31596lwy.OLrzqt.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(CryptoListBottomSheet cryptoListBottomSheet, boolean z) {
        if (cryptoListBottomSheet.gEmmrt().AkhnZx() != BSCTabIndex.CONVERT) {
            AbstractC31465luY abstractC31465luY = cryptoListBottomSheet.KWHzl;
            AbstractC31465luY abstractC31465luY2 = null;
            if (abstractC31465luY == null) {
                Intrinsics.gEmmrt("");
                abstractC31465luY = null;
            }
            if (z) {
                cryptoListBottomSheet.isConnected();
                AbstractC31465luY abstractC31465luY3 = cryptoListBottomSheet.KWHzl;
                if (abstractC31465luY3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31465luY2 = abstractC31465luY3;
                }
                View root = abstractC31465luY2.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                C55418xja.AEQbTJ(root);
                abstractC31465luY.valueOf.setVisibility(8);
            } else {
                AbstractC31465luY abstractC31465luY4 = cryptoListBottomSheet.KWHzl;
                if (abstractC31465luY4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31465luY2 = abstractC31465luY4;
                }
                View root2 = abstractC31465luY2.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                C55418xja.EZpvd(root2);
                abstractC31465luY.valueOf.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        AbstractC31465luY abstractC31465luY = this.KWHzl;
        if (abstractC31465luY == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY = null;
        }
        RecyclerView recyclerView = abstractC31465luY.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        C55418xja.KWHzl(recyclerView, new C55363xiY(false, false, false, null, null, false, null, false, false, 12, Boolean.TRUE, Integer.valueOf(C31351lsQ.ActionBar.dmfpNf), FrameMetricsAggregator.EVERY_DURATION, null));
    }

    public final void copydefault(Map<String, FairPriceTickerData> map) {
        List<CurrencyToken> value = EZpvd().AkhnZx().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(value, 10)), 16));
        for (Object obj : value) {
            linkedHashMap.put(((CurrencyToken) obj).getCurrency(), obj);
        }
        ArrayList arrayList = new ArrayList();
        List<CryptoListItem> value2 = EZpvd().AuCTel().getValue();
        if (value2 == null) {
            value2 = yDY.AhwBna();
        }
        if (!(!value2.isEmpty())) {
            if (Intrinsics.EZpvd(EZpvd().getFieldNames().getValue(), Boolean.TRUE)) {
                arrayList.clear();
            } else {
                arrayList.addAll(value);
            }
        } else {
            Iterator<T> it = value2.iterator();
            while (it.hasNext()) {
                CurrencyToken currencyToken = (CurrencyToken) linkedHashMap.get(((CryptoListItem) it.next()).getCryptoId());
                if (currencyToken != null) {
                    arrayList.add(currencyToken);
                }
            }
        }
        AEQbTJ(arrayList, map);
    }

    private final CharSequence AEQbTJ(String str, String str2) {
        return C33061mpO.setupSpanStyles$default(C33069mpW.getFormattedString$default(str, null, 2, null), new String[]{str2}, 0, null, false, new Function1() { // from class: o.lEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit OLrzqt(CryptoListBottomSheet cryptoListBottomSheet, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(cryptoListBottomSheet.getContext(), C52761wXj.LoaderManager.DTwDnp));
        list.add(cryptoListBottomSheet.new ActionBar());
        return Unit.INSTANCE;
    }

    public static final class ActionBar extends ClickableSpan {
        public ActionBar() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            InterfaceC31670lzr interfaceC31670lzr = (InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class);
            FragmentActivity fragmentActivityRequireActivity = CryptoListBottomSheet.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC31670lzr.copydefault(fragmentActivityRequireActivity);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCryptoListItems$default(CryptoListBottomSheet cryptoListBottomSheet, List list, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        cryptoListBottomSheet.AEQbTJ((List<CurrencyToken>) list, (Map<String, FairPriceTickerData>) map);
    }

    public final void AEQbTJ(List<CurrencyToken> list, Map<String, FairPriceTickerData> map) {
        int i = Application.OLrzqt[this.djBIcL.ordinal()];
        if (i == 1) {
            EZpvd((List<? extends CryptoListItem>) lUY.EZpvd(list, this.AYXKKw, this.ejfBZ, map));
            return;
        }
        if (i != 2) {
            if (i == 3) {
                EZpvd((List<? extends CryptoListItem>) lUY.OLrzqt(list, this.AYXKKw, this.ejfBZ, this.gEmmrt, map));
                return;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        AbstractC31465luY abstractC31465luY = null;
        if (list.isEmpty()) {
            AbstractC31465luY abstractC31465luY2 = this.KWHzl;
            if (abstractC31465luY2 == null) {
                Intrinsics.gEmmrt("");
                abstractC31465luY2 = null;
            }
            abstractC31465luY2.OLrzqt.setVisibility(8);
            AbstractC31465luY abstractC31465luY3 = this.KWHzl;
            if (abstractC31465luY3 == null) {
                Intrinsics.gEmmrt("");
                abstractC31465luY3 = null;
            }
            abstractC31465luY3.AEQbTJ.getRoot().setVisibility(0);
            AbstractC31465luY abstractC31465luY4 = this.KWHzl;
            if (abstractC31465luY4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY4;
            }
            C31596lwy c31596lwy = abstractC31465luY.AEQbTJ;
            C55173xeu c55173xeu = c31596lwy.copydefault;
            c55173xeu.setImage(C52761wXj.TaskDescription.HJWChPRGtXKC);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.QwvEab));
            C52794wYp c52794wYp = c31596lwy.OLrzqt;
            c52794wYp.setVisibility(0);
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.lEg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    CryptoListBottomSheet.gEmmrt(this.KWHzl, view);
                }
            });
            Intrinsics.copydefault(c31596lwy);
            return;
        }
        List<CurrencyToken> value = EZpvd().AkhnZx().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        EZpvd((List<? extends CryptoListItem>) lUY.OLrzqt(value, this.AYXKKw));
        AbstractC31465luY abstractC31465luY5 = this.KWHzl;
        if (abstractC31465luY5 == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY5 = null;
        }
        abstractC31465luY5.AEQbTJ.getRoot().setVisibility(8);
        AbstractC31465luY abstractC31465luY6 = this.KWHzl;
        if (abstractC31465luY6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31465luY = abstractC31465luY6;
        }
        abstractC31465luY.OLrzqt.setVisibility(0);
    }

    public static final void gEmmrt(CryptoListBottomSheet cryptoListBottomSheet, View view) {
        cryptoListBottomSheet.gEmmrt().AEQbTJ(BSCTabIndex.BUY);
        cryptoListBottomSheet.dismiss();
    }

    public final void KWHzl() {
        List<String> listEZpvd = EZpvd().EZpvd(this.djBIcL);
        final ArrayList arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            String str = (String) obj;
            List<CurrencyToken> value = EZpvd().AkhnZx().getValue();
            if (value == null) {
                value = yDY.AhwBna();
            }
            if (!(value instanceof Collection) || !value.isEmpty()) {
                Iterator<T> it = value.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.EZpvd((Object) ((CurrencyToken) it.next()).getCurrency(), (Object) str)) {
                            arrayList.add(obj);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        final AbstractC31465luY abstractC31465luY = this.KWHzl;
        if (abstractC31465luY == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY = null;
        }
        abstractC31465luY.getRoot().post(new Runnable() { // from class: o.lEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                CryptoListBottomSheet.copydefault(arrayList, abstractC31465luY, this);
            }
        });
    }

    public static final void copydefault(List list, final AbstractC31465luY abstractC31465luY, final CryptoListBottomSheet cryptoListBottomSheet) {
        if (list.isEmpty()) {
            abstractC31465luY.AhwBna.setVisibility(8);
            return;
        }
        if (cryptoListBottomSheet.OLrzqt) {
            AbstractC31465luY abstractC31465luY2 = cryptoListBottomSheet.KWHzl;
            AbstractC31465luY abstractC31465luY3 = null;
            if (abstractC31465luY2 == null) {
                Intrinsics.gEmmrt("");
                abstractC31465luY2 = null;
            }
            CoordinatorLayout coordinatorLayout = abstractC31465luY2.EZpvd;
            AbstractC31465luY abstractC31465luY4 = cryptoListBottomSheet.KWHzl;
            if (abstractC31465luY4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY3 = abstractC31465luY4;
            }
            coordinatorLayout.scrollBy(0, -abstractC31465luY3.AhwBna.getHeight());
            cryptoListBottomSheet.OLrzqt = false;
        }
        abstractC31465luY.AhwBna.setVisibility(0);
        C55187xfH c55187xfH = abstractC31465luY.AYXKKw;
        c55187xfH.OLrzqt().setText(C33070mpX.AYXKKw(C31351lsQ.Activity.dmfpNf));
        c55187xfH.setHistoryRecordList(CollectionsKt___CollectionsKt.fJNWhG((Collection) list));
        c55187xfH.setClearCallback(new Function0() { // from class: o.lEy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CryptoListBottomSheet.EZpvd(this.copydefault, abstractC31465luY);
            }
        });
        c55187xfH.setOnItemSelectedCallback(new Function1() { // from class: o.lEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CryptoListBottomSheet.EZpvd(this.OLrzqt, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit EZpvd(CryptoListBottomSheet cryptoListBottomSheet, AbstractC31465luY abstractC31465luY) {
        CryptoListBottomSheetViewModel.trackSimpleTradeCryptoList$default(cryptoListBottomSheet.EZpvd(), "delete_search", cryptoListBottomSheet.djBIcL, null, false, 12, null);
        AbstractC31465luY abstractC31465luY2 = cryptoListBottomSheet.KWHzl;
        AbstractC31465luY abstractC31465luY3 = null;
        if (abstractC31465luY2 == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY2 = null;
        }
        CoordinatorLayout coordinatorLayout = abstractC31465luY2.EZpvd;
        AbstractC31465luY abstractC31465luY4 = cryptoListBottomSheet.KWHzl;
        if (abstractC31465luY4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31465luY3 = abstractC31465luY4;
        }
        coordinatorLayout.scrollBy(0, abstractC31465luY3.AhwBna.getHeight());
        cryptoListBottomSheet.OLrzqt = true;
        abstractC31465luY.AhwBna.setVisibility(8);
        cryptoListBottomSheet.EZpvd().AEQbTJ(cryptoListBottomSheet.djBIcL);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(CryptoListBottomSheet cryptoListBottomSheet, CharSequence charSequence) {
        CurrencyToken currencyToken;
        Object next;
        List<CurrencyToken> value = cryptoListBottomSheet.EZpvd().AkhnZx().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd(((CurrencyToken) next).getCurrency(), charSequence)) {
                    break;
                }
            }
            currencyToken = (CurrencyToken) next;
        } else {
            currencyToken = null;
        }
        if (currencyToken != null) {
            clickCrypto$default(cryptoListBottomSheet, currencyToken, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void clickCrypto$default(CryptoListBottomSheet cryptoListBottomSheet, CurrencyToken currencyToken, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cryptoListBottomSheet.KWHzl(currencyToken, z);
    }

    public final void KWHzl(CurrencyToken currencyToken, boolean z) {
        EZpvd().copydefault(this.djBIcL, currencyToken.getCurrency());
        this.AkhnZx = currencyToken.getCurrency();
        boolean zEZpvd = Intrinsics.EZpvd(mHA.OLrzqt.AEQbTJ(EZpvd().getNewProxyInstance()), Boolean.TRUE);
        OLrzqt(currencyToken.getCurrency());
        if (z) {
            AEQbTJ(currencyToken);
        }
        Function2<CurrencyToken, Boolean, Unit> function2 = this.DbNXlk;
        if (function2 != null) {
            function2.invoke(currencyToken, Boolean.valueOf(zEZpvd));
        }
        dismissAllowingStateLoss();
    }

    private final void AYXKKw() {
        AbstractC31465luY abstractC31465luY = this.KWHzl;
        if (abstractC31465luY == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY = null;
        }
        C55230xfy c55230xfy = abstractC31465luY.valueOf;
        ListType listType = this.djBIcL;
        if (listType == ListType.CONVERT_FROM || listType == ListType.CONVERT_TO) {
            c55230xfy.KWHzl().setHint(C33070mpX.AYXKKw(C31351lsQ.Activity.hDKMBd));
        } else {
            c55230xfy.KWHzl().setHint(C33070mpX.AYXKKw(C31351lsQ.Activity.QSBOWP));
        }
        c55230xfy.KWHzl().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lEu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                CryptoListBottomSheet.AEQbTJ(this.KWHzl, view, z);
            }
        });
        c55230xfy.KWHzl().addTextChangedListener(new Fragment());
        c55230xfy.setClearCallback(new Function0() { // from class: o.lEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CryptoListBottomSheet.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(CryptoListBottomSheet cryptoListBottomSheet, View view, boolean z) {
        if (z) {
            CryptoListBottomSheetViewModel.trackSimpleTradeCryptoList$default(cryptoListBottomSheet.EZpvd(), "crypto_search", cryptoListBottomSheet.djBIcL, null, false, 12, null);
        }
    }

    public static final Unit copydefault(CryptoListBottomSheet cryptoListBottomSheet) {
        cryptoListBottomSheet.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void KWHzl(List<CryptoListItem> list) {
        if (!(!list.isEmpty()) || (CollectionsKt___CollectionsKt.AuCTelauCTel(list) instanceof CryptoListItem.Activity)) {
            return;
        }
        list.add(0, new CryptoListItem.Activity("", "", null, null, C33070mpX.AYXKKw(C31351lsQ.Activity.gwTjWJ), 12, null));
    }

    public final void OLrzqt(String str) {
        List value;
        CryptoListItem cryptoListItem;
        boolean zEZpvd;
        Object next;
        List<CryptoListItem> value2 = EZpvd().AuCTel().getValue();
        if (value2 != null) {
            value = new ArrayList();
            for (Object obj : value2) {
                if (!(((CryptoListItem) obj) instanceof CryptoListItem.Activity)) {
                    value.add(obj);
                }
            }
        } else {
            value = null;
        }
        if (value != null) {
            Iterator it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((CryptoListItem) next).getCryptoId(), (Object) str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            cryptoListItem = (CryptoListItem) next;
        } else {
            cryptoListItem = null;
        }
        if (value == null && (value = EZpvd().AkhnZx().getValue()) == null) {
            value = yDY.AhwBna();
        }
        List list = value;
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            Object next2 = it2.next();
            if (next2 instanceof CryptoListItem) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CryptoListItem) next2).getCryptoId(), (Object) str);
            } else if (next2 instanceof CurrencyToken) {
                zEZpvd = Intrinsics.EZpvd((Object) ((CurrencyToken) next2).getCurrency(), (Object) str);
            } else {
                continue;
                i++;
            }
            if (zEZpvd) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        String strGEmmrt = numValueOf != null ? C33129mqd.gEmmrt(Integer.valueOf(numValueOf.intValue() + 1)) : null;
        if (strGEmmrt == null) {
            strGEmmrt = "";
        }
        EZpvd().OLrzqt("select_crypto", this.djBIcL, new C30350lVc(null, CollectionsKt___CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1() { // from class: o.lEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return CryptoListBottomSheet.EZpvd(obj2);
            }
        }, 30, null), null, this.AkhnZx, false, C33129mqd.OLrzqt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getPrimarySimilarity()) : null), C33129mqd.OLrzqt(cryptoListItem != null ? Double.valueOf(cryptoListItem.getSecondarySimilarity()) : null), str, strGEmmrt, null, 533, null), true);
    }

    public static final CharSequence EZpvd(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj instanceof CryptoListItem ? ((CryptoListItem) obj).getCryptoId() : obj instanceof CurrencyToken ? ((CurrencyToken) obj).getCurrency() : "";
    }

    private final void AEQbTJ(CurrencyToken currencyToken) {
        Object next;
        lEE lee = this.copydefault;
        if (lee == null) {
            Intrinsics.gEmmrt("");
            lee = null;
        }
        List<CryptoListItem> listCopydefault = lee.copydefault();
        Iterator<T> it = listCopydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            CryptoListItem cryptoListItem = (CryptoListItem) next;
            if ((cryptoListItem instanceof CryptoListItem) && Intrinsics.EZpvd((Object) cryptoListItem.getCryptoId(), (Object) currencyToken.getCurrency())) {
                break;
            }
        }
        CryptoListItem cryptoListItem2 = next instanceof CryptoListItem ? (CryptoListItem) next : null;
        Iterator<CryptoListItem> it2 = listCopydefault.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            CryptoListItem next2 = it2.next();
            if ((next2 instanceof CryptoListItem) && Intrinsics.EZpvd((Object) next2.getCryptoId(), (Object) currencyToken.getCurrency())) {
                break;
            } else {
                i++;
            }
        }
        FuzzySearchEventTracker.EZpvd.KWHzl(FuzzySearchEventSourceEnum.OKPAYMENTS_COIN.getSource(), EZpvd().ejfBZ(), C33129mqd.gEmmrt(cryptoListItem2 != null ? cryptoListItem2.getPrimary() : null), C33129mqd.gEmmrt(cryptoListItem2 != null ? cryptoListItem2.getSecondary() : null), C33129mqd.gEmmrt(cryptoListItem2 != null ? Double.valueOf(cryptoListItem2.getPrimarySimilarity()) : null), C33129mqd.gEmmrt(cryptoListItem2 != null ? Double.valueOf(cryptoListItem2.getSecondarySimilarity()) : null), C33129mqd.gEmmrt(Integer.valueOf(i)));
    }

    public final void KWHzl(String str) {
        if (this.valueOf) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        CryptoListBottomSheetViewModel cryptoListBottomSheetViewModelEZpvd = EZpvd();
        List<CurrencyToken> value = cryptoListBottomSheetViewModelEZpvd.AkhnZx().getValue();
        if (value == null) {
            value = yDY.AhwBna();
        }
        List<CryptoListItem> listAEQbTJ = cryptoListBottomSheetViewModelEZpvd.AEQbTJ(value, this.djBIcL, this.AYXKKw, this.ejfBZ, this.gEmmrt);
        if (C33129mqd.OLrzqt((CharSequence) str)) {
            arrayList.addAll(cryptoListBottomSheetViewModelEZpvd.KWHzl(str, listAEQbTJ));
            cryptoListBottomSheetViewModelEZpvd.AuCTel().setValue(arrayList);
            cryptoListBottomSheetViewModelEZpvd.getFieldNames().setValue(Boolean.TRUE);
        } else {
            arrayList.addAll(listAEQbTJ);
            cryptoListBottomSheetViewModelEZpvd.AuCTel().setValue(new ArrayList());
            cryptoListBottomSheetViewModelEZpvd.getFieldNames().setValue(Boolean.FALSE);
        }
        AbstractC31465luY abstractC31465luY = null;
        if (Intrinsics.EZpvd(cryptoListBottomSheetViewModelEZpvd.getFieldNames().getValue(), Boolean.TRUE) && arrayList.isEmpty()) {
            AbstractC31465luY abstractC31465luY2 = this.KWHzl;
            if (abstractC31465luY2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31465luY = abstractC31465luY2;
            }
            C55173xeu c55173xeu = abstractC31465luY.djBIcL;
            ListType listType = this.djBIcL;
            if (listType == ListType.CONVERT_TO || listType == ListType.CONVERT_FROM) {
                c55173xeu.setEmptyTypeImage(7);
                c55173xeu.setTitle("");
                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C31351lsQ.Activity.gEmmrt));
            } else {
                c55173xeu.setEmptyTypeImage(6);
                c55173xeu.setTitle(C33070mpX.AYXKKw(C31351lsQ.Activity.OBJEWx));
                c55173xeu.setSubTitle((CharSequence) "");
            }
            c55173xeu.AEQbTJ().setVisibility(8);
            c55173xeu.setVisibility(0);
            abstractC31465luY.EZpvd.setVisibility(8);
            return;
        }
        KWHzl(arrayList);
        AbstractC31465luY abstractC31465luY3 = this.KWHzl;
        if (abstractC31465luY3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31465luY = abstractC31465luY3;
        }
        abstractC31465luY.djBIcL.setVisibility(8);
        abstractC31465luY.EZpvd.setVisibility(0);
        ListType listType2 = this.djBIcL;
        if (listType2 == ListType.SELL || listType2 == ListType.CONVERT_FROM) {
            EZpvd((List<? extends CryptoListItem>) arrayList);
        }
    }

    public final void OLrzqt() {
        EZpvd().AuCTel().setValue(new ArrayList());
        AbstractC31465luY abstractC31465luY = this.KWHzl;
        AbstractC31465luY abstractC31465luY2 = null;
        if (abstractC31465luY == null) {
            Intrinsics.gEmmrt("");
            abstractC31465luY = null;
        }
        abstractC31465luY.valueOf.KWHzl().setText("");
        C33570myu.copydefault((android.app.Activity) requireActivity());
        AbstractC31465luY abstractC31465luY3 = this.KWHzl;
        if (abstractC31465luY3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31465luY2 = abstractC31465luY3;
        }
        abstractC31465luY2.valueOf.KWHzl().clearFocus();
    }

    public final void EZpvd(List<? extends CryptoListItem> list) {
        if (C30327lUg.AEQbTJ(ABTestFeatureFlag.ANDROID_SUBMIT_LIST_CRASH_FIX)) {
            lEE lee = this.copydefault;
            if (lee == null) {
                Intrinsics.gEmmrt("");
                lee = null;
            }
            mHT.submitListSafe$default(lee, list, null, 2, null);
            return;
        }
        lEE lee2 = this.copydefault;
        if (lee2 == null) {
            Intrinsics.gEmmrt("");
            lee2 = null;
        }
        mHT.submitList$default(lee2, list, null, 2, null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class ListType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ListType[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Parcelable.Creator<ListType> CREATOR;
        public static final Companion Companion;
        public static final ListType BUY = new ListType("BUY", 0);
        public static final ListType SELL = new ListType("SELL", 1);
        public static final ListType CONVERT_TO = new ListType("CONVERT_TO", 2);
        public static final ListType CONVERT_FROM = new ListType("CONVERT_FROM", 3);

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<ListType> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ListType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ListType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ListType[] newArray(int i) {
                return new ListType[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ListType[] $values() {
            return new ListType[]{BUY, SELL, CONVERT_TO, CONVERT_FROM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ListType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet.ListType.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ KSerializer KWHzl() {
                return (KSerializer) ListType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<ListType> serializer() {
                return KWHzl();
            }
        }

        private ListType(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.ui.bsc.cryptolist.CryptoListBottomSheet.ListType", values());
        }

        static {
            ListType[] listTypeArr$values = $values();
            $VALUES = listTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(listTypeArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.lEw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CryptoListBottomSheet.ListType._init_$_anonymous_();
                }
            });
        }

        public static ListType valueOf(String str) {
            return (ListType) Enum.valueOf(ListType.class, str);
        }

        public static ListType[] values() {
            return (ListType[]) $VALUES.clone();
        }
    }
}
