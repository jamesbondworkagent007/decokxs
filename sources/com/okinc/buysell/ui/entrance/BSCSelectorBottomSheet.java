package com.okinc.buysell.ui.entrance;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.api.BSCBuySellBaseCurrencyInfo;
import com.okinc.buysell.api.OKBuySellSource;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC30054lKe;
import o.C31351lsQ;
import o.C32866mlf;
import o.C33129mqd;
import o.C43251rlk;
import o.C52761wXj;
import o.C55198xfS;
import o.C55276xgr;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC47251tmX;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.wXQ;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BSCSelectorBottomSheet extends AbstractC30054lKe {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public BSCBuySellBaseCurrencyInfo KWHzl;
    public final InterfaceC56387yDm copydefault;
    public String AEQbTJ = "";
    public String OLrzqt = "";

    public BSCSelectorBottomSheet() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BscSelectorViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet$special$$inlined$viewModels$default$5
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

    /* JADX DEBUG: Possible override for method o.lKe.AEQbTJ()V */
    public final BscSelectorViewModel AEQbTJ() {
        return (BscSelectorViewModel) this.copydefault.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AEQbTJ().EZpvd();
        super.onCreateContent(constraintLayout);
        Bundle arguments = getArguments();
        this.KWHzl = arguments != null ? (BSCBuySellBaseCurrencyInfo) arguments.getParcelable("currency_info") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("source")) == null) {
            this.AEQbTJ = OKBuySellSource.UNKNOWN_SOURCE.getTag();
        } else {
            this.AEQbTJ = string2;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("payment_source")) == null) {
            return;
        }
        this.OLrzqt = string;
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(2);
        ArrayList arrayList = new ArrayList();
        String string = getString(C31351lsQ.Activity.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getString(C31351lsQ.Activity.sSMYrx);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        arrayList.add(new C55276xgr(string, Option.BUY, string2, false, false, Integer.valueOf(C52761wXj.TaskDescription.getPostValueLengthLimit), null, 88, null));
        String string3 = getString(C31351lsQ.Activity.DTwDnp);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        String string4 = getString(C31351lsQ.Activity.QKVWgx);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList.add(new C55276xgr(string3, Option.SELL, string4, false, false, Integer.valueOf(C52761wXj.TaskDescription.QVMIlxQVMIlx), null, 88, null));
        String string5 = getString(C31351lsQ.Activity.ORxRYg);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        String string6 = getString(C31351lsQ.Activity.QOLQEE);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        arrayList.add(new C55276xgr(string5, Option.CONVERT, string6, false, false, Integer.valueOf(C52761wXj.TaskDescription.swzYdv), null, 88, null));
        c55198xfS.setSingleOneColumnData(arrayList, new yHO() { // from class: o.lKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return BSCSelectorBottomSheet.KWHzl(this.copydefault, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v28, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(final BSCSelectorBottomSheet bSCSelectorBottomSheet, final C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        InterfaceC47251tmX interfaceC47251tmX;
        String strOLrzqt;
        String strEZpvd;
        String strAEQbTJ;
        String strCopydefault;
        String strKWHzl;
        String strEZpvd2;
        String strAEQbTJ2;
        String strCopydefault2;
        String strKWHzl2;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo = bSCSelectorBottomSheet.KWHzl;
        if (C33129mqd.OLrzqt((CharSequence) (bSCBuySellBaseCurrencyInfo != null ? bSCBuySellBaseCurrencyInfo.KWHzl() : null))) {
            BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo2 = bSCSelectorBottomSheet.KWHzl;
            if (bSCBuySellBaseCurrencyInfo2 != null) {
                String strKWHzl3 = bSCBuySellBaseCurrencyInfo2.KWHzl();
                T t = strKWHzl3;
                if (strKWHzl3 == null) {
                    t = "";
                }
                objectRef.element = t;
            }
        }
        C32866mlf.onEvent$default("SimpleMode_BSC_BottomSheet_Click", (TrackChannel[]) null, new Function1() { // from class: o.lJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BSCSelectorBottomSheet.AEQbTJ(c55276xgr, bSCSelectorBottomSheet, objectRef, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt == Option.BUY) {
            InterfaceC47251tmX interfaceC47251tmX2 = (InterfaceC47251tmX) C43251rlk.OLrzqt(InterfaceC47251tmX.class);
            if (interfaceC47251tmX2 != null) {
                FragmentActivity fragmentActivityRequireActivity = bSCSelectorBottomSheet.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                String str = (String) objectRef.element;
                TargetTab targetTab = TargetTab.BUY;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo3 = bSCSelectorBottomSheet.KWHzl;
                String str2 = (bSCBuySellBaseCurrencyInfo3 == null || (strKWHzl2 = bSCBuySellBaseCurrencyInfo3.KWHzl()) == null) ? "" : strKWHzl2;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo4 = bSCSelectorBottomSheet.KWHzl;
                String str3 = (bSCBuySellBaseCurrencyInfo4 == null || (strCopydefault2 = bSCBuySellBaseCurrencyInfo4.copydefault()) == null) ? "" : strCopydefault2;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo5 = bSCSelectorBottomSheet.KWHzl;
                String str4 = (bSCBuySellBaseCurrencyInfo5 == null || (strAEQbTJ2 = bSCBuySellBaseCurrencyInfo5.AEQbTJ()) == null) ? "" : strAEQbTJ2;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo6 = bSCSelectorBottomSheet.KWHzl;
                BuySellBaseCurrencyInfo buySellBaseCurrencyInfo = new BuySellBaseCurrencyInfo(str2, str3, str4, (bSCBuySellBaseCurrencyInfo6 == null || (strEZpvd2 = bSCBuySellBaseCurrencyInfo6.EZpvd()) == null) ? "" : strEZpvd2, (String) null, 16, (DefaultConstructorMarker) null);
                String tag = bSCSelectorBottomSheet.OLrzqt;
                if (tag.length() == 0) {
                    tag = OKPaymentSource.LITE_HOME_PAGE.getTag();
                }
                InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default(interfaceC47251tmX2, fragmentActivityRequireActivity, new BuySellConvertParameters(OKPaymentSource.Companion.KWHzl(tag), targetTab, str, null, buySellBaseCurrencyInfo, null, null, null, null, 488, null), null, 4, null);
            }
        } else if (objOLrzqt == Option.SELL) {
            InterfaceC47251tmX interfaceC47251tmX3 = (InterfaceC47251tmX) C43251rlk.OLrzqt(InterfaceC47251tmX.class);
            if (interfaceC47251tmX3 != null) {
                FragmentActivity fragmentActivityRequireActivity2 = bSCSelectorBottomSheet.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                String str5 = (String) objectRef.element;
                TargetTab targetTab2 = TargetTab.SELL;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo7 = bSCSelectorBottomSheet.KWHzl;
                String str6 = (bSCBuySellBaseCurrencyInfo7 == null || (strKWHzl = bSCBuySellBaseCurrencyInfo7.KWHzl()) == null) ? "" : strKWHzl;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo8 = bSCSelectorBottomSheet.KWHzl;
                String str7 = (bSCBuySellBaseCurrencyInfo8 == null || (strCopydefault = bSCBuySellBaseCurrencyInfo8.copydefault()) == null) ? "" : strCopydefault;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo9 = bSCSelectorBottomSheet.KWHzl;
                String str8 = (bSCBuySellBaseCurrencyInfo9 == null || (strAEQbTJ = bSCBuySellBaseCurrencyInfo9.AEQbTJ()) == null) ? "" : strAEQbTJ;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo10 = bSCSelectorBottomSheet.KWHzl;
                String str9 = (bSCBuySellBaseCurrencyInfo10 == null || (strEZpvd = bSCBuySellBaseCurrencyInfo10.EZpvd()) == null) ? "" : strEZpvd;
                BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo11 = bSCSelectorBottomSheet.KWHzl;
                BuySellBaseCurrencyInfo buySellBaseCurrencyInfo2 = new BuySellBaseCurrencyInfo(str6, str7, str8, str9, (bSCBuySellBaseCurrencyInfo11 == null || (strOLrzqt = bSCBuySellBaseCurrencyInfo11.OLrzqt()) == null) ? "" : strOLrzqt);
                String tag2 = bSCSelectorBottomSheet.OLrzqt;
                if (tag2.length() == 0) {
                    tag2 = OKPaymentSource.LITE_HOME_PAGE.getTag();
                }
                InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default(interfaceC47251tmX3, fragmentActivityRequireActivity2, new BuySellConvertParameters(OKPaymentSource.Companion.KWHzl(tag2), targetTab2, str5, null, buySellBaseCurrencyInfo2, null, null, null, null, 488, null), null, 4, null);
            }
        } else if (objOLrzqt == Option.CONVERT && (interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.OLrzqt(InterfaceC47251tmX.class)) != null) {
            FragmentActivity fragmentActivityRequireActivity3 = bSCSelectorBottomSheet.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
            String str10 = (String) objectRef.element;
            TargetTab targetTab3 = TargetTab.CONVERT;
            String tag3 = bSCSelectorBottomSheet.OLrzqt;
            if (tag3.length() == 0) {
                tag3 = OKPaymentSource.LITE_HOME_PAGE.getTag();
            }
            InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default(interfaceC47251tmX, fragmentActivityRequireActivity3, new BuySellConvertParameters(OKPaymentSource.Companion.KWHzl(tag3), targetTab3, null, null, null, null, null, str10, null, 380, null), null, 4, null);
        }
        bSCSelectorBottomSheet.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C55276xgr c55276xgr, BSCSelectorBottomSheet bSCSelectorBottomSheet, Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
        String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        if (objOLrzqt == Option.BUY) {
            str = "buy";
        } else if (objOLrzqt == Option.SELL) {
            str = "sell";
        } else {
            if (objOLrzqt != Option.CONVERT) {
                return Unit.INSTANCE;
            }
            str = "convert";
        }
        EventParamsList.put$default(eventParamsList, "type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", bSCSelectorBottomSheet.AEQbTJ, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token", (String) objectRef.element, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Option {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Option[] $VALUES;
        public static final Option BUY = new Option("BUY", 0);
        public static final Option SELL = new Option("SELL", 1);
        public static final Option CONVERT = new Option("CONVERT", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Option[] $values() {
            return new Option[]{BUY, SELL, CONVERT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Option> getEntries() {
            return $ENTRIES;
        }

        private Option(String str, int i) {
        }

        static {
            Option[] optionArr$values = $values();
            $VALUES = optionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(optionArr$values);
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) $VALUES.clone();
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.entrance.BSCSelectorBottomSheet.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final BSCSelectorBottomSheet EZpvd(BSCBuySellBaseCurrencyInfo bSCBuySellBaseCurrencyInfo, @NotNull OKBuySellSource oKBuySellSource, OKPaymentSourceLegacy oKPaymentSourceLegacy) {
            Intrinsics.checkNotNullParameter(oKBuySellSource, "");
            BSCSelectorBottomSheet bSCSelectorBottomSheet = new BSCSelectorBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("currency_info", bSCBuySellBaseCurrencyInfo);
            bundle.putString("source", oKBuySellSource.getTag());
            if (oKPaymentSourceLegacy != null) {
                bundle.putString("payment_source", oKPaymentSourceLegacy.getTag());
            }
            bSCSelectorBottomSheet.setArguments(bundle);
            return bSCSelectorBottomSheet;
        }
    }
}
