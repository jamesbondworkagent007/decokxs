package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.market.alert.database.MarketAlertDataBase;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.okmarket.ui.market.remind.fragment.PriceEditViewModel;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$1;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$2;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$3;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$4;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$5;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$6;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$7;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$8;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initUIStatus$9;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initView$1$1;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initView$3$1$1$1;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$initView$4$1;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$subTopInfo$1;
import com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$subTopInfo$2$1;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.unify_trade.biz.CoinInfo;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C46810teG;
import o.C52761wXj;
import o.C52812wZg;
import o.InterfaceC48910ueb;
import o.InterfaceC54581xNr;
import o.qZH;
import o.wYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.teV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46825teV extends AbstractC46809teF {
    public InterfaceC58217yxC AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel;
    public boolean DbNXlk;
    public AlertRemindPo djBIcL;
    public C46845tep ejfBZ;
    public java.lang.String fARcdN;
    public boolean fIwbmz;
    public java.lang.String gEmmrt;
    public C46817teN getNewProxyInstance;
    public InterfaceC46849tet hDKMBd;
    public final InterfaceC56387yDm uzCIH;
    public C42933rfk valueOf;
    public final InterfaceC56387yDm zLjUOn;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public int iwGUEr = 1;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.teU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46825teV.gEmmrt();
        }
    });
    public java.lang.String isConnected = "SPOT";
    public java.lang.String fetchVPNInfo = "BTC-USDT";
    public TokenInfoForAlert AubY = new TokenInfoForAlert(null, null, null, null, null, null, null, null, false, 0, 1023, null);
    public java.lang.String AhwBna = "";
    public java.lang.String fJNWhG = "";
    public java.lang.String AkhnZx = "";
    public int getFieldNames = 2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42933rfk AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.gsvlRV;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRemindPo valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46817teN values() {
        return this.getNewProxyInstance;
    }

    public C46825teV() {
        final Function0 function0 = null;
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$viewModels$default$2
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
        this.zLjUOn = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PriceEditViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$viewModels$default$5
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
        this.uzCIH = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C46848tes.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.remind.fragment.PriceRemindEditFragment$special$$inlined$activityViewModels$default$3
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
        this.AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.teY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46825teV.zLjUOn();
            }
        });
        this.ejfBZ = new C46845tep();
    }

    /* JADX INFO: renamed from: o.teV$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.teV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C46825teV AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, AlertRemindPo alertRemindPo, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, @NotNull TokenInfoForAlert tokenInfoForAlert) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
            C46825teV c46825teV = new C46825teV();
            c46825teV.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("inst_id", str), C56390yDp.OLrzqt("instType", str2), C56390yDp.OLrzqt("data", alertRemindPo), C56390yDp.OLrzqt("from", str3), C56390yDp.OLrzqt("msg", str4), C56390yDp.OLrzqt("alert_type", str5), C56390yDp.OLrzqt("source_type", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("token_alert_info", tokenInfoForAlert)));
            return c46825teV;
        }
    }

    /* JADX INFO: renamed from: o.teV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C46825teV OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C46825teV c46825teV) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c46825teV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            BottomSheetDialogFragment searchRootFragment$default;
            InterfaceC49508upq interfaceC49508upq;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC49508upq interfaceC49508upq2 = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
                if (interfaceC49508upq2 != null) {
                    InterfaceC46849tet interfaceC46849tet = this.OLrzqt.hDKMBd;
                    if (interfaceC46849tet == null) {
                        Intrinsics.gEmmrt("");
                        interfaceC46849tet = null;
                    }
                    searchRootFragment$default = InterfaceC48910ueb.Application.getSearchRootFragment$default(interfaceC49508upq2, "", interfaceC46849tet.OLrzqt(), "biz", "page_alert", null, null, 48, null);
                } else {
                    searchRootFragment$default = null;
                }
                InterfaceC48913uee interfaceC48913uee = searchRootFragment$default instanceof InterfaceC48913uee ? (InterfaceC48913uee) searchRootFragment$default : null;
                if (interfaceC48913uee != null) {
                    interfaceC48913uee.copydefault(this.OLrzqt.new ActionBar());
                    interfaceC48913uee.copydefault(this.OLrzqt.new FragmentManager());
                    interfaceC48913uee.EZpvd(LoaderManager.OLrzqt);
                }
                if (searchRootFragment$default == null || (interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class)) == null) {
                    return;
                }
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                interfaceC49508upq.EZpvd(searchRootFragment$default, childFragmentManager, Fragment.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.teV$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C46825teV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C46825teV c46825teV, android.view.View view2) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c46825teV;
            this.KWHzl = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C46693tbw c46693tbw;
            C55001xbh c55001xbhAEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    C33054mpH.OLrzqt(context, this.KWHzl);
                    C42933rfk c42933rfkAYXKKw = this.OLrzqt.AYXKKw();
                    if (c42933rfkAYXKKw != null && (c46693tbw = c42933rfkAYXKKw.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) != null) {
                        c55001xbhAEQbTJ.clearFocus();
                    }
                    this.OLrzqt.AEQbTJ("alert_type");
                    this.OLrzqt.getNewProxyInstance();
                }
            }
        }
    }

    public final void OLrzqt(java.lang.String str) {
        C46693tbw c46693tbw;
        this.gEmmrt = str;
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk == null || (c46693tbw = c42933rfk.fetchVPNInfo) == null) {
            return;
        }
        c46693tbw.setBasePrice(str);
    }

    public final java.util.List<wYO> AhwBna() {
        return (java.util.List) this.values.getValue();
    }

    public static final java.util.List gEmmrt() {
        return yDY.gEmmrt(new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPOZOJIj), 44, true, true), new wYO(C33070mpX.AYXKKw(qZH.PendingIntent.DjwCMv), 44, false, true));
    }

    public final void AhwBna(java.lang.String str) {
        java.lang.String localized$default;
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.fARcdN)) {
            this.fARcdN = str;
        }
        java.lang.String str2 = this.gEmmrt;
        if ((str2 == null || str2.length() == 0) && C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.AEQbTJ(str, 0)) {
            OLrzqt(str);
        }
        int promptType = isConnected().copydefault().getValue().AEQbTJ().getPromptType();
        isConnected().AEQbTJ(str);
        C43296rmc.EZpvd(getTAG(), "fill last price: " + str);
        if (this.DbNXlk || str == null || !C33129mqd.OLrzqt((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0")) {
            return;
        }
        this.DbNXlk = true;
        if (promptType == 1 || promptType == 2 || promptType == 5) {
            java.lang.String promptThreshold = isConnected().copydefault().getValue().AEQbTJ().getPromptThreshold();
            C43296rmc.AEQbTJ(getTAG(), "last price change () price");
            if (promptThreshold.length() == 0) {
                PriceEditViewModel priceEditViewModelIsConnected = isConnected();
                java.lang.String str3 = this.fARcdN;
                if (str3 == null || (localized$default = pTB.formatLocalized$default(str3, null, 1, null)) == null) {
                    localized$default = "";
                }
                priceEditViewModelIsConnected.EZpvd(localized$default);
            }
        }
    }

    public final PriceEditViewModel isConnected() {
        return (PriceEditViewModel) this.zLjUOn.getValue();
    }

    public final C46848tes DbNXlk() {
        return (C46848tes) this.uzCIH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C38383pWt hDKMBd() {
        return (C38383pWt) this.AuCTelauCTel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C38383pWt zLjUOn() {
        return new C38383pWt(C38384pWu.Companion.copydefault(MarketAlertDataBase.Companion.EZpvd()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        TokenInfoForAlert tokenInfoForAlert;
        java.lang.String string2;
        InterfaceC46849tet c46908tfz;
        java.lang.String string3;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "inst_id";
        if (arguments != null && (string3 = arguments.getString("inst_id", this.fetchVPNInfo)) != null) {
            str = string3;
        }
        this.fetchVPNInfo = str;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("instType", this.isConnected)) == null) {
            string = this.isConnected;
        }
        this.isConnected = string;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (tokenInfoForAlert = (TokenInfoForAlert) arguments3.getParcelable("token_alert_info")) == null) {
            tokenInfoForAlert = new TokenInfoForAlert(null, null, null, null, null, null, null, null, false, 0, 1023, null);
        }
        this.AubY = tokenInfoForAlert;
        android.os.Bundle arguments4 = getArguments();
        this.djBIcL = arguments4 != null ? (AlertRemindPo) arguments4.getParcelable("data") : null;
        android.os.Bundle arguments5 = getArguments();
        if (arguments5 == null || (string2 = arguments5.getString("from")) == null) {
            string2 = "";
        }
        this.AkhnZx = string2;
        android.os.Bundle arguments6 = getArguments();
        this.fJNWhG = arguments6 != null ? arguments6.getString("msg") : null;
        android.os.Bundle arguments7 = getArguments();
        this.AhwBna = arguments7 != null ? arguments7.getString("alert_type") : null;
        android.os.Bundle arguments8 = getArguments();
        this.iwGUEr = arguments8 != null ? arguments8.getInt("source_type") : 1;
        AlertRemindPo alertRemindPo = this.djBIcL;
        if (alertRemindPo != null) {
            isConnected().AEQbTJ(alertRemindPo, this.fetchVPNInfo, this.isConnected);
        } else {
            isConnected().AEQbTJ(this.fetchVPNInfo, this.isConnected);
        }
        if (this.AubY.OLrzqt().length() == 0 || this.AubY.copydefault().length() == 0) {
            c46908tfz = new C46908tfz(this.fetchVPNInfo, this.isConnected);
        } else {
            c46908tfz = new C46857tfA(this.AubY);
        }
        this.hDKMBd = c46908tfz;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            this.getNewProxyInstance = (C46817teN) new ViewModelProvider(parentFragment).get(C46817teN.class);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull final android.view.View view, android.os.Bundle bundle) {
        android.view.View view2;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        C52794wYp c52794wYp3;
        C52794wYp c52794wYp4;
        android.widget.TextView textView;
        LinearLayoutCompat linearLayoutCompat;
        android.widget.ImageView imageView;
        android.widget.TextView textView2;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        OKEditText oKEditText;
        C42933rfk c42933rfk;
        wYX wyx;
        C46693tbw c46693tbw;
        C46693tbw c46693tbw2;
        C55001xbh c55001xbhAEQbTJ;
        C52794wYp c52794wYp5;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        C55390xiz c55390xiz;
        C52794wYp c52794wYp6;
        C46693tbw c46693tbw3;
        C55001xbh c55001xbhAEQbTJ2;
        C52794wYp c52794wYp7;
        android.view.View view3;
        C52794wYp c52794wYp8;
        Intrinsics.checkNotNullParameter(view, "");
        this.valueOf = C42933rfk.EZpvd(view);
        InterfaceC46849tet interfaceC46849tet = this.hDKMBd;
        if (interfaceC46849tet == null) {
            Intrinsics.gEmmrt("");
            interfaceC46849tet = null;
        }
        this.getFieldNames = interfaceC46849tet.KWHzl();
        ejfBZ();
        if (isConnected().AEQbTJ() == 0) {
            C42933rfk c42933rfk2 = this.valueOf;
            if (c42933rfk2 != null && (c52794wYp8 = c42933rfk2.EZpvd) != null) {
                c52794wYp8.setVisibility(8);
            }
            C42933rfk c42933rfk3 = this.valueOf;
            if (c42933rfk3 != null && (view3 = c42933rfk3.DbNXlk) != null) {
                view3.setVisibility(8);
            }
            C42933rfk c42933rfk4 = this.valueOf;
            if (c42933rfk4 != null && (c52794wYp7 = c42933rfk4.AEQbTJ) != null) {
                c52794wYp7.setText(C33070mpX.AYXKKw(qZH.PendingIntent.OgHfcT));
            }
        } else {
            C42933rfk c42933rfk5 = this.valueOf;
            if (c42933rfk5 != null && (c52794wYp4 = c42933rfk5.EZpvd) != null) {
                c52794wYp4.setVisibility(0);
            }
            C42933rfk c42933rfk6 = this.valueOf;
            if (c42933rfk6 != null && (c52794wYp3 = c42933rfk6.EZpvd) != null) {
                c52794wYp3.setEnabled(true);
            }
            C42933rfk c42933rfk7 = this.valueOf;
            if (c42933rfk7 != null && (c52794wYp2 = c42933rfk7.EZpvd) != null) {
                c52794wYp2.setText(C33070mpX.AYXKKw(qZH.PendingIntent.NRYds));
            }
            C42933rfk c42933rfk8 = this.valueOf;
            if (c42933rfk8 != null && (c52794wYp = c42933rfk8.AEQbTJ) != null) {
                c52794wYp.setText(C33070mpX.AYXKKw(qZH.PendingIntent.UJEglR));
            }
            C42933rfk c42933rfk9 = this.valueOf;
            if (c42933rfk9 != null && (view2 = c42933rfk9.DbNXlk) != null) {
                view2.setVisibility(0);
            }
        }
        C42933rfk c42933rfk10 = this.valueOf;
        if (c42933rfk10 != null && (c46693tbw3 = c42933rfk10.fetchVPNInfo) != null && (c55001xbhAEQbTJ2 = c46693tbw3.AEQbTJ()) != null) {
            c55001xbhAEQbTJ2.setShowThousandsSeparator(true);
        }
        C42933rfk c42933rfk11 = this.valueOf;
        if (c42933rfk11 != null && (c52794wYp6 = c42933rfk11.EZpvd) != null) {
            c52794wYp6.setOnClickListener(new View.OnClickListener() { // from class: o.tfh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    C46825teV.OLrzqt(this.AEQbTJ, view4);
                }
            });
        }
        C42933rfk c42933rfk12 = this.valueOf;
        if (c42933rfk12 != null && (c55390xiz = c42933rfk12.fARcdN) != null) {
            c55390xiz.setOnClickListener(new View.OnClickListener() { // from class: o.tfa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    C46825teV.KWHzl(this.KWHzl, view4);
                }
            });
        }
        fARcdN();
        getFieldNames();
        if (Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) "page_k") || Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "0")) {
            C42933rfk c42933rfk13 = this.valueOf;
            if (c42933rfk13 != null && (textView = c42933rfk13.fIwbmz) != null) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        } else {
            C42933rfk c42933rfk14 = this.valueOf;
            if (c42933rfk14 != null && (textView4 = c42933rfk14.fIwbmz) != null) {
                textView4.setCompoundDrawablesWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.OJuSTm, 0);
            }
            C42933rfk c42933rfk15 = this.valueOf;
            if (c42933rfk15 != null && (textView3 = c42933rfk15.fIwbmz) != null) {
                textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, this));
            }
        }
        C42933rfk c42933rfk16 = this.valueOf;
        if (c42933rfk16 != null && (c52794wYp5 = c42933rfk16.AEQbTJ) != null) {
            c52794wYp5.setOnClickListener(new View.OnClickListener() { // from class: o.teX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    C46825teV.AYXKKw(this.KWHzl, view4);
                }
            });
        }
        C42933rfk c42933rfk17 = this.valueOf;
        if (c42933rfk17 != null && (c46693tbw2 = c42933rfk17.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw2.AEQbTJ()) != null) {
            c55001xbhAEQbTJ.addTextChangedListener(new Dialog());
        }
        C42933rfk c42933rfk18 = this.valueOf;
        if (c42933rfk18 != null && (c46693tbw = c42933rfk18.fetchVPNInfo) != null) {
            c46693tbw.setTimeClickListener(new View.OnClickListener() { // from class: o.teZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    C46825teV.AEQbTJ(this.EZpvd, view, view4);
                }
            });
        }
        C42933rfk c42933rfk19 = this.valueOf;
        if (c42933rfk19 != null && (wyx = c42933rfk19.copydefault) != null) {
            wyx.setSelectionChipBeans(AhwBna());
            wyx.setOnChipClickListener(new PendingIntent(wyx, this));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.fJNWhG) && (c42933rfk = this.valueOf) != null) {
            c42933rfk.values.setText(this.fJNWhG);
            android.widget.TextView textView5 = c42933rfk.hDKMBd;
            java.lang.String str = this.fJNWhG;
            textView5.setText((str != null ? str.length() : 0) + "/40");
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        C42933rfk c42933rfk20 = this.valueOf;
        if (c42933rfk20 != null && (oKEditText = c42933rfk20.values) != null) {
            oKEditText.addTextChangedListener(new PictureInPictureParams(booleanRef, this));
        }
        if (this.djBIcL != null) {
            C42933rfk c42933rfk21 = this.valueOf;
            if (c42933rfk21 != null && (linearLayoutCompat3 = c42933rfk21.OLrzqt) != null) {
                linearLayoutCompat3.setEnabled(false);
            }
            C42933rfk c42933rfk22 = this.valueOf;
            if (c42933rfk22 != null && (linearLayoutCompat2 = c42933rfk22.OLrzqt) != null) {
                linearLayoutCompat2.setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.RXdAnZ)));
            }
            C42933rfk c42933rfk23 = this.valueOf;
            if (c42933rfk23 != null && (textView2 = c42933rfk23.AuCTel) != null) {
                textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.hfeTOA));
            }
            C42933rfk c42933rfk24 = this.valueOf;
            if (c42933rfk24 != null && (imageView = c42933rfk24.gEmmrt) != null) {
                imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.hfeTOA)));
            }
        }
        C42933rfk c42933rfk25 = this.valueOf;
        if (c42933rfk25 != null && (linearLayoutCompat = c42933rfk25.OLrzqt) != null) {
            linearLayoutCompat.setOnClickListener(new TaskDescription(linearLayoutCompat, 1000L, this, view));
        }
        fIwbmz();
        uzCIH();
    }

    public static final void OLrzqt(C46825teV c46825teV, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c46825teV), null, null, new PriceRemindEditFragment$initView$1$1(c46825teV, null), 3, null);
    }

    public static final void KWHzl(C46825teV c46825teV, android.view.View view) {
        C46693tbw c46693tbw;
        C46693tbw c46693tbw2;
        C55001xbh c55001xbhAEQbTJ;
        java.lang.String localized$default;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c46825teV.fARcdN)) {
            c46825teV.fIwbmz = true;
            C42933rfk c42933rfk = c46825teV.valueOf;
            if (c42933rfk != null && (c46693tbw2 = c42933rfk.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw2.AEQbTJ()) != null) {
                java.lang.String str = c46825teV.fARcdN;
                if (str == null || (localized$default = pTB.formatLocalized$default(str, null, 1, null)) == null) {
                    localized$default = "";
                }
                c55001xbhAEQbTJ.setLocalizedNumericText(localized$default);
            }
            C42933rfk c42933rfk2 = c46825teV.valueOf;
            if (c42933rfk2 != null && (c46693tbw = c42933rfk2.fetchVPNInfo) != null) {
                c46693tbw.copydefault();
            }
            c46825teV.fJNWhG();
        }
    }

    /* JADX INFO: renamed from: o.teV$ActionBar */
    public static final class ActionBar implements Function1<java.lang.Object, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Object obj) {
            EZpvd(obj);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            if (obj instanceof CoinInfo) {
                CoinInfo coinInfo = (CoinInfo) obj;
                C46825teV.this.EZpvd(coinInfo.getIntId());
                C46825teV.this.KWHzl(coinInfo.getIntType());
                C46825teV c46825teV = C46825teV.this;
                c46825teV.hDKMBd = new C46908tfz(c46825teV.AkhnZx(), C46825teV.this.fetchVPNInfo());
                C46825teV c46825teV2 = C46825teV.this;
                InterfaceC46849tet interfaceC46849tet = c46825teV2.hDKMBd;
                if (interfaceC46849tet == null) {
                    Intrinsics.gEmmrt("");
                    interfaceC46849tet = null;
                }
                c46825teV2.getFieldNames = interfaceC46849tet.KWHzl();
                C46825teV.this.iwGUEr = 1;
                C46825teV.this.ejfBZ();
                C46825teV.this.isConnected().AEQbTJ(C46825teV.this.AkhnZx(), C46825teV.this.fetchVPNInfo());
                C46825teV.this.getFieldNames();
                C46825teV.this.fARcdN();
                C46825teV.this.OLrzqt("");
                C46825teV.this.DbNXlk = false;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(C46825teV.this), null, null, new PriceRemindEditFragment$initView$3$1$1$1(C46825teV.this, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.teV$FragmentManager */
    public static final class FragmentManager implements Function2<DexInstrument, java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(DexInstrument dexInstrument, java.lang.String str) {
            KWHzl(dexInstrument, str);
            return Unit.INSTANCE;
        }

        public final void KWHzl(DexInstrument dexInstrument, java.lang.String str) {
            Intrinsics.checkNotNullParameter(dexInstrument, "");
            Intrinsics.checkNotNullParameter(str, "");
            C46825teV.this.AubY = new TokenInfoForAlert(dexInstrument.getChainId(), dexInstrument.getChainName(), dexInstrument.getTokenContractAddress(), dexInstrument.getTokenLogoUrl(), dexInstrument.getChainLogoUrl(), dexInstrument.getTokenSymbol(), "", "", false, 0, 768, null);
            C46825teV.this.iwGUEr = 2;
            C46825teV c46825teV = C46825teV.this;
            c46825teV.hDKMBd = new C46857tfA(c46825teV.AubY);
            C46825teV c46825teV2 = C46825teV.this;
            InterfaceC46849tet interfaceC46849tet = c46825teV2.hDKMBd;
            if (interfaceC46849tet == null) {
                Intrinsics.gEmmrt("");
                interfaceC46849tet = null;
            }
            c46825teV2.getFieldNames = interfaceC46849tet.KWHzl();
            C46825teV.this.ejfBZ();
            C46825teV.this.isConnected().AEQbTJ("", "");
            C46825teV.this.getFieldNames();
            C46825teV.this.fARcdN();
            C46825teV.this.OLrzqt("");
            C46825teV.this.DbNXlk = false;
            C46825teV.this.iwGUEr();
        }
    }

    /* JADX INFO: renamed from: o.teV$Activity */
    public static final class Activity implements java.lang.Runnable {
        public final /* synthetic */ LinearLayoutCompat AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(LinearLayoutCompat linearLayoutCompat) {
            this.AEQbTJ = linearLayoutCompat;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.app.Activity activityKWHzl = C41431qqg.KWHzl(this.AEQbTJ);
            if (activityKWHzl != null) {
                C52812wZg c52812wZg = new C52812wZg(activityKWHzl);
                C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
                if (c52794wYpIsConnected != null) {
                    c52794wYpIsConnected.setText(C33070mpX.AYXKKw(qZH.PendingIntent.values));
                }
                C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
                if (c52794wYpAkhnZx != null) {
                    c52794wYpAkhnZx.setVisibility(8);
                }
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(this.AEQbTJ);
                stateListAnimator.EZpvd(1);
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.DQYQgr));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.Swccd));
                c52812wZg.AEQbTJ(stateListAnimator);
                c52812wZg.OLrzqt(1);
                c52812wZg.fARcdN();
                SPUtils.put("sp_indicator_coach_mark_showed", java.lang.Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: o.teV$LoaderManager */
    public static final class LoaderManager implements Function1<java.lang.Boolean, Unit> {
        public static final LoaderManager OLrzqt = new LoaderManager();

        public final void EZpvd(boolean z) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            EZpvd(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.teV$Fragment */
    public static final class Fragment implements Function1<java.lang.Boolean, Unit> {
        public static final Fragment KWHzl = new Fragment();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            EZpvd(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(boolean z) {
            if (z) {
                C32866mlf.onEvent$default("PriceAlert_SearchTicker_Page_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.teV.Fragment.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public final void OLrzqt(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    public static final void AYXKKw(C46825teV c46825teV, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c46825teV), null, null, new PriceRemindEditFragment$initView$4$1(c46825teV, null), 3, null);
    }

    /* JADX INFO: renamed from: o.teV$Dialog */
    public static final class Dialog implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Dialog() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.lang.String strIsConnected;
            C46693tbw c46693tbw;
            C55001xbh c55001xbhAEQbTJ;
            C43296rmc.EZpvd(C46825teV.this.getTAG(), "onTextChanged: " + ((java.lang.Object) charSequence));
            PriceEditViewModel priceEditViewModelIsConnected = C46825teV.this.isConnected();
            C42933rfk c42933rfkAYXKKw = C46825teV.this.AYXKKw();
            if (c42933rfkAYXKKw == null || (c46693tbw = c42933rfkAYXKKw.fetchVPNInfo) == null || (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) == null || (strIsConnected = c55001xbhAEQbTJ.isConnected()) == null) {
                strIsConnected = "";
            }
            priceEditViewModelIsConnected.EZpvd(strIsConnected);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C42933rfk c42933rfkAYXKKw;
            C46693tbw c46693tbw;
            C55001xbh c55001xbhAEQbTJ;
            if (C46825teV.this.fIwbmz) {
                if (editable != null && (c42933rfkAYXKKw = C46825teV.this.AYXKKw()) != null && (c46693tbw = c42933rfkAYXKKw.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) != null) {
                    c55001xbhAEQbTJ.setSelection(editable.length());
                }
                C46825teV.this.fIwbmz = false;
            }
        }
    }

    public static final void AEQbTJ(final C46825teV c46825teV, android.view.View view, android.view.View view2) {
        C46693tbw c46693tbw;
        C55001xbh c55001xbhAEQbTJ;
        android.content.Context context = c46825teV.getContext();
        if (context != null) {
            C33054mpH.OLrzqt(context, view);
            C42933rfk c42933rfk = c46825teV.valueOf;
            if (c42933rfk != null && (c46693tbw = c42933rfk.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) != null) {
                c55001xbhAEQbTJ.clearFocus();
            }
            C46813teJ c46813teJAEQbTJ = C46813teJ.Companion.AEQbTJ(java.lang.String.valueOf(c46825teV.isConnected().copydefault().getValue().AEQbTJ().getPercentageTime()), new Function1() { // from class: o.tfe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46825teV.KWHzl(this.AEQbTJ, (java.lang.String) obj);
                }
            });
            if (!c46825teV.isAdded() || c46825teV.getChildFragmentManager().isStateSaved()) {
                return;
            }
            androidx.fragment.app.FragmentManager childFragmentManager = c46825teV.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c46813teJAEQbTJ.show(childFragmentManager);
        }
    }

    public static final Unit KWHzl(C46825teV c46825teV, java.lang.String str) {
        C46693tbw c46693tbw;
        Intrinsics.checkNotNullParameter(str, "");
        c46825teV.isConnected().copydefault(C33129mqd.AhwBna(str));
        C42933rfk c42933rfk = c46825teV.valueOf;
        if (c42933rfk != null && (c46693tbw = c42933rfk.fetchVPNInfo) != null) {
            c46693tbw.EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.teV$PendingIntent */
    public static final class PendingIntent implements wYX.ActionBar {
        public final /* synthetic */ C46825teV AEQbTJ;
        public final /* synthetic */ wYX OLrzqt;

        public PendingIntent(wYX wyx, C46825teV c46825teV) {
            this.OLrzqt = wyx;
            this.AEQbTJ = c46825teV;
        }

        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Intrinsics.checkNotNullParameter(wys, "");
            wys.setSelected(!wys.isSelected());
            for (wYS wys2 : this.OLrzqt.EZpvd()) {
                if (!Intrinsics.EZpvd(wys2, wys)) {
                    wys2.setSelected(false);
                }
            }
            this.AEQbTJ.KWHzl(Intrinsics.EZpvd((java.lang.Object) wys.getText(), (java.lang.Object) C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPOZOJIj)));
        }
    }

    /* JADX INFO: renamed from: o.teV$PictureInPictureParams */
    public static final class PictureInPictureParams implements android.text.TextWatcher {
        public final /* synthetic */ C46825teV AEQbTJ;
        public final /* synthetic */ Ref.BooleanRef KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public PictureInPictureParams(Ref.BooleanRef booleanRef, C46825teV c46825teV) {
            this.KWHzl = booleanRef;
            this.AEQbTJ = c46825teV;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            OKEditText oKEditText;
            android.widget.TextView textView;
            if (this.KWHzl.element) {
                return;
            }
            int length = editable != null ? editable.length() : 0;
            if (length > 40) {
                this.KWHzl.element = true;
                if (editable != null) {
                    editable.delete(40, length);
                }
                this.KWHzl.element = false;
            }
            int length2 = editable != null ? editable.length() : 0;
            C42933rfk c42933rfkAYXKKw = this.AEQbTJ.AYXKKw();
            if (c42933rfkAYXKKw != null && (textView = c42933rfkAYXKKw.hDKMBd) != null) {
                textView.setText(length2 + "/40");
            }
            PriceEditViewModel priceEditViewModelIsConnected = this.AEQbTJ.isConnected();
            C42933rfk c42933rfkAYXKKw2 = this.AEQbTJ.AYXKKw();
            priceEditViewModelIsConnected.copydefault(C33129mqd.gEmmrt((c42933rfkAYXKKw2 == null || (oKEditText = c42933rfkAYXKKw2.values) == null) ? null : oKEditText.getText()));
        }
    }

    private final void uzCIH() {
        C42933rfk c42933rfk;
        LinearLayoutCompat linearLayoutCompat;
        InterfaceC46849tet interfaceC46849tet = this.hDKMBd;
        if (interfaceC46849tet == null) {
            Intrinsics.gEmmrt("");
            interfaceC46849tet = null;
        }
        if (!(interfaceC46849tet instanceof C46908tfz) || !C27563jxZ.OLrzqt.DbNXlk() || SPUtils.getBoolean("sp_indicator_coach_mark_showed", false) || (c42933rfk = this.valueOf) == null || (linearLayoutCompat = c42933rfk.OLrzqt) == null) {
            return;
        }
        linearLayoutCompat.postDelayed(new Activity(linearLayoutCompat), 100L);
    }

    public final void getNewProxyInstance() {
        C46810teG.StateListAnimator stateListAnimator = C46810teG.Companion;
        int promptType = isConnected().copydefault().getValue().AEQbTJ().getPromptType();
        InterfaceC46849tet interfaceC46849tet = this.hDKMBd;
        if (interfaceC46849tet == null) {
            Intrinsics.gEmmrt("");
            interfaceC46849tet = null;
        }
        C46810teG c46810teGAEQbTJ = stateListAnimator.AEQbTJ(promptType, interfaceC46849tet instanceof C46908tfz, new Function1() { // from class: o.tfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46825teV.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue());
            }
        });
        c46810teGAEQbTJ.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.tfi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C46825teV.OLrzqt(this.OLrzqt, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c46810teGAEQbTJ.show(childFragmentManager);
    }

    public static final Unit OLrzqt(C46825teV c46825teV, int i) {
        C46693tbw c46693tbw;
        C46693tbw c46693tbw2;
        C46645tbA c46645tbA;
        C46693tbw c46693tbw3;
        LinearLayoutCompat linearLayoutCompat;
        C46645tbA c46645tbA2;
        C46645tbA c46645tbA3;
        C46693tbw c46693tbw4;
        LinearLayoutCompat linearLayoutCompat2;
        C46693tbw c46693tbw5;
        C46693tbw c46693tbw6;
        c46825teV.isConnected().AEQbTJ(i);
        C42933rfk c42933rfk = c46825teV.valueOf;
        if (c42933rfk != null && (c46693tbw6 = c42933rfk.fetchVPNInfo) != null) {
            c46693tbw6.copydefault();
        }
        C42933rfk c42933rfk2 = c46825teV.valueOf;
        if (c42933rfk2 != null && (c46693tbw5 = c42933rfk2.fetchVPNInfo) != null) {
            c46693tbw5.EZpvd();
        }
        if (C56402yEa.EZpvd(6).contains(java.lang.Integer.valueOf(i))) {
            c46825teV.iwGUEr = 4;
            C42933rfk c42933rfk3 = c46825teV.valueOf;
            if (c42933rfk3 != null && (linearLayoutCompat2 = c42933rfk3.valueOf) != null) {
                linearLayoutCompat2.setVisibility(8);
            }
            C42933rfk c42933rfk4 = c46825teV.valueOf;
            if (c42933rfk4 != null && (c46693tbw4 = c42933rfk4.fetchVPNInfo) != null) {
                c46693tbw4.setVisibility(8);
            }
            C42933rfk c42933rfk5 = c46825teV.valueOf;
            if (c42933rfk5 != null && (c46645tbA3 = c42933rfk5.AhwBna) != null) {
                c46645tbA3.setVisibility(0);
            }
            C46690tbt c46690tbt = new C46690tbt(null, 0, null, null, null, 0, 63, null);
            C42933rfk c42933rfk6 = c46825teV.valueOf;
            if (c42933rfk6 != null && (c46645tbA2 = c42933rfk6.AhwBna) != null) {
                c46645tbA2.setIndicator(c46690tbt);
            }
        } else {
            InterfaceC46849tet interfaceC46849tet = c46825teV.hDKMBd;
            if (interfaceC46849tet == null) {
                Intrinsics.gEmmrt("");
                interfaceC46849tet = null;
            }
            c46825teV.iwGUEr = interfaceC46849tet instanceof C46908tfz ? 1 : 2;
            C42933rfk c42933rfk7 = c46825teV.valueOf;
            if (c42933rfk7 != null && (linearLayoutCompat = c42933rfk7.valueOf) != null) {
                linearLayoutCompat.setVisibility(0);
            }
            C42933rfk c42933rfk8 = c46825teV.valueOf;
            if (c42933rfk8 != null && (c46693tbw3 = c42933rfk8.fetchVPNInfo) != null) {
                c46693tbw3.setVisibility(0);
            }
            C42933rfk c42933rfk9 = c46825teV.valueOf;
            if (c42933rfk9 != null && (c46645tbA = c42933rfk9.AhwBna) != null) {
                c46645tbA.setVisibility(8);
            }
            C42933rfk c42933rfk10 = c46825teV.valueOf;
            if (c42933rfk10 != null && (c46693tbw2 = c42933rfk10.fetchVPNInfo) != null) {
                c46693tbw2.copydefault();
            }
            C42933rfk c42933rfk11 = c46825teV.valueOf;
            if (c42933rfk11 != null && (c46693tbw = c42933rfk11.fetchVPNInfo) != null) {
                c46693tbw.EZpvd();
            }
        }
        int iAhwBna = C33129mqd.AhwBna(java.lang.Integer.valueOf(i));
        if (iAhwBna == 1) {
            c46825teV.copydefault("price_rises_above");
        } else if (iAhwBna == 2) {
            c46825teV.copydefault("price_drops_below");
        } else if (iAhwBna == 3) {
            c46825teV.copydefault("24h_rise_exceeds");
        } else if (iAhwBna == 4) {
            c46825teV.copydefault("24h_fall_exceeds");
        } else if (iAhwBna == 5) {
            c46825teV.copydefault("price_reached");
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C46825teV c46825teV, android.content.DialogInterface dialogInterface) {
        c46825teV.copydefault(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    }

    public final void getFieldNames() {
        android.widget.TextView textView;
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk == null || (textView = c42933rfk.fIwbmz) == null) {
            return;
        }
        InterfaceC46849tet interfaceC46849tet = this.hDKMBd;
        if (interfaceC46849tet == null) {
            Intrinsics.gEmmrt("");
            interfaceC46849tet = null;
        }
        textView.setText(interfaceC46849tet.EZpvd());
    }

    public final void fARcdN() {
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk != null) {
            InterfaceC46849tet interfaceC46849tet = this.hDKMBd;
            InterfaceC46849tet interfaceC46849tet2 = null;
            if (interfaceC46849tet == null) {
                Intrinsics.gEmmrt("");
                interfaceC46849tet = null;
            }
            kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = interfaceC46849tet.copydefault();
            java.lang.String strComponent1 = pairCopydefault.component1();
            java.lang.String strComponent2 = pairCopydefault.component2();
            android.widget.ImageView imageView = c42933rfk.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C46742tcs.copydefault(imageView, strComponent1);
            InterfaceC46849tet interfaceC46849tet3 = this.hDKMBd;
            if (interfaceC46849tet3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                interfaceC46849tet2 = interfaceC46849tet3;
            }
            if (interfaceC46849tet2 instanceof C46908tfz) {
                android.widget.ImageView imageView2 = c42933rfk.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            } else {
                android.widget.ImageView imageView3 = c42933rfk.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(0);
                android.widget.ImageView imageView4 = c42933rfk.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                C46742tcs.copydefault(imageView4, strComponent2 != null ? strComponent2 : "", new C46746tcw(C33070mpX.KWHzl(C52761wXj.TaskDescription.fERRXa), null, 0.0f, 0, 14, null));
            }
        }
    }

    public final void ejfBZ() {
        C46693tbw c46693tbw;
        C55001xbh c55001xbhAEQbTJ;
        C46693tbw c46693tbw2;
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk != null && (c46693tbw2 = c42933rfk.fetchVPNInfo) != null) {
            c46693tbw2.setPriceDigit(this.getFieldNames);
        }
        C42933rfk c42933rfk2 = this.valueOf;
        if (c42933rfk2 == null || (c46693tbw = c42933rfk2.fetchVPNInfo) == null || (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) == null) {
            return;
        }
        c55001xbhAEQbTJ.setMaxDecimalValue(this.getFieldNames);
    }

    public final void KWHzl(boolean z) {
        wYX wyx;
        AhwBna().get(0).KWHzl(z);
        AhwBna().get(1).KWHzl(!z);
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk != null && (wyx = c42933rfk.copydefault) != null) {
            wyx.setSelectionChipBeans(AhwBna());
        }
        isConnected().gEmmrt(C33129mqd.AhwBna(z ? "0" : "1"));
    }

    public final void fIwbmz() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new PriceRemindEditFragment$initUIStatus$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new PriceRemindEditFragment$initUIStatus$2(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new PriceRemindEditFragment$initUIStatus$3(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new PriceRemindEditFragment$initUIStatus$4(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new PriceRemindEditFragment$initUIStatus$5(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new PriceRemindEditFragment$initUIStatus$6(this, null));
        int i = this.iwGUEr;
        if (i == 1) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PriceRemindEditFragment$initUIStatus$7(this, null), 3, null);
        } else if (i == 2) {
            iwGUEr();
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new PriceRemindEditFragment$initUIStatus$8(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PriceRemindEditFragment$initUIStatus$9(this, null), 3, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(boolean z) {
        C46693tbw c46693tbw;
        C55001xbh c55001xbhAEQbTJ;
        C46693tbw c46693tbw2;
        android.widget.TextView textView;
        C46693tbw c46693tbw3;
        LinearLayoutCompat linearLayoutCompat;
        C46693tbw c46693tbw4;
        C55001xbh c55001xbhAEQbTJ2;
        C46693tbw c46693tbw5;
        android.widget.TextView textView2;
        C46645tbA c46645tbA;
        C46693tbw c46693tbw6;
        LinearLayoutCompat linearLayoutCompat2;
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk != null && (linearLayoutCompat2 = c42933rfk.valueOf) != null) {
            linearLayoutCompat2.setVisibility(0);
        }
        C42933rfk c42933rfk2 = this.valueOf;
        if (c42933rfk2 != null && (c46693tbw6 = c42933rfk2.fetchVPNInfo) != null) {
            c46693tbw6.setVisibility(0);
        }
        C42933rfk c42933rfk3 = this.valueOf;
        if (c42933rfk3 != null && (c46645tbA = c42933rfk3.AhwBna) != null) {
            c46645tbA.setVisibility(8);
        }
        if (z) {
            C42933rfk c42933rfk4 = this.valueOf;
            if (c42933rfk4 != null && (textView2 = c42933rfk4.fJNWhG) != null) {
                textView2.setText(C33070mpX.AYXKKw(qZH.PendingIntent.seuMaA));
            }
            C42933rfk c42933rfk5 = this.valueOf;
            if (c42933rfk5 != null && (c46693tbw5 = c42933rfk5.fetchVPNInfo) != null) {
                c46693tbw5.setHint(C33070mpX.AYXKKw(qZH.PendingIntent.avCqka));
            }
            C42933rfk c42933rfk6 = this.valueOf;
            if (c42933rfk6 != null && (c46693tbw4 = c42933rfk6.fetchVPNInfo) != null && (c55001xbhAEQbTJ2 = c46693tbw4.AEQbTJ()) != null) {
                c55001xbhAEQbTJ2.setMaxDecimalValue(this.getFieldNames);
            }
        } else {
            C42933rfk c42933rfk7 = this.valueOf;
            if (c42933rfk7 != null && (textView = c42933rfk7.fJNWhG) != null) {
                textView.setText(C33070mpX.AYXKKw(qZH.PendingIntent.dYepVG));
            }
            C42933rfk c42933rfk8 = this.valueOf;
            if (c42933rfk8 != null && (c46693tbw2 = c42933rfk8.fetchVPNInfo) != null) {
                c46693tbw2.setHint(C33070mpX.AYXKKw(qZH.PendingIntent.znKlvJ));
            }
            C42933rfk c42933rfk9 = this.valueOf;
            if (c42933rfk9 != null && (c46693tbw = c42933rfk9.fetchVPNInfo) != null && (c55001xbhAEQbTJ = c46693tbw.AEQbTJ()) != null) {
                c55001xbhAEQbTJ.setMaxDecimalValue(2);
            }
        }
        C42933rfk c42933rfk10 = this.valueOf;
        if (c42933rfk10 != null && (linearLayoutCompat = c42933rfk10.AYXKKw) != null) {
            linearLayoutCompat.setVisibility(z ? 0 : 8);
        }
        C42933rfk c42933rfk11 = this.valueOf;
        if (c42933rfk11 == null || (c46693tbw3 = c42933rfk11.fetchVPNInfo) == null) {
            return;
        }
        c46693tbw3.EZpvd(!z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PriceRemindEditFragment$subTopInfo$1 priceRemindEditFragment$subTopInfo$1;
        final java.lang.String str;
        final java.lang.String str2;
        final C46825teV c46825teV;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String str3;
        C46825teV c46825teV2;
        java.lang.String str4;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        InterfaceC58217yxC interfaceC58217yxC;
        if (continuation instanceof PriceRemindEditFragment$subTopInfo$1) {
            priceRemindEditFragment$subTopInfo$1 = (PriceRemindEditFragment$subTopInfo$1) continuation;
            int i = priceRemindEditFragment$subTopInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                priceRemindEditFragment$subTopInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                priceRemindEditFragment$subTopInfo$1 = new PriceRemindEditFragment$subTopInfo$1(this, continuation);
            }
        }
        java.lang.Object obj = priceRemindEditFragment$subTopInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = priceRemindEditFragment$subTopInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            str = this.fetchVPNInfo;
            str2 = this.isConnected;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt2, null, 1, null)) {
                InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                priceRemindEditFragment$subTopInfo$1.L$0 = this;
                priceRemindEditFragment$subTopInfo$1.L$1 = str;
                priceRemindEditFragment$subTopInfo$1.L$2 = str2;
                priceRemindEditFragment$subTopInfo$1.label = 1;
                if (C55608xnE.copydefault(interfaceC54577xNnKWHzl, priceRemindEditFragment$subTopInfo$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c46825teV = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (java.lang.String) priceRemindEditFragment$subTopInfo$1.L$2;
                str4 = (java.lang.String) priceRemindEditFragment$subTopInfo$1.L$1;
                c46825teV2 = (C46825teV) priceRemindEditFragment$subTopInfo$1.L$0;
                C56391yDq.AEQbTJ(obj);
                c46825teV = c46825teV2;
                str = str4;
                str2 = str3;
                C42933rfk c42933rfk = c46825teV.valueOf;
                final C55390xiz c55390xiz = c42933rfk != null ? c42933rfk.fARcdN : null;
                c46825teV.isConnected().OLrzqt();
                interfaceC58217yxC = c46825teV.AuCTel;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
                AbstractC58185ywX<C37936pGe> abstractC58185ywXAEQbTJ = c46825teV.ejfBZ.AEQbTJ(str, str2);
                final Function1 function1 = new Function1() { // from class: o.tfc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C46825teV.EZpvd(this.OLrzqt, str2, str, c55390xiz, (C37936pGe) obj2);
                    }
                };
                c46825teV.AuCTel = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.tfg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj2) {
                        C46825teV.EZpvd(function1, obj2);
                    }
                });
                c46825teV.AuCTel();
                return Unit.INSTANCE;
            }
            str2 = (java.lang.String) priceRemindEditFragment$subTopInfo$1.L$2;
            java.lang.String str5 = (java.lang.String) priceRemindEditFragment$subTopInfo$1.L$1;
            c46825teV = (C46825teV) priceRemindEditFragment$subTopInfo$1.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str5;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = pWO.KWHzl().OLrzqt();
        if ((interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt(str2)) == null || !abstractC54531xLwOLrzqt2.copydefault(false)) && (interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null) {
            priceRemindEditFragment$subTopInfo$1.L$0 = c46825teV;
            priceRemindEditFragment$subTopInfo$1.L$1 = str;
            priceRemindEditFragment$subTopInfo$1.L$2 = str2;
            priceRemindEditFragment$subTopInfo$1.label = 2;
            if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, priceRemindEditFragment$subTopInfo$1) == objCopydefault) {
                return objCopydefault;
            }
            str3 = str2;
            c46825teV2 = c46825teV;
            str4 = str;
            c46825teV = c46825teV2;
            str = str4;
            str2 = str3;
        }
        C42933rfk c42933rfk2 = c46825teV.valueOf;
        if (c42933rfk2 != null) {
        }
        c46825teV.isConnected().OLrzqt();
        interfaceC58217yxC = c46825teV.AuCTel;
        if (interfaceC58217yxC != null) {
        }
        AbstractC58185ywX<C37936pGe> abstractC58185ywXAEQbTJ2 = c46825teV.ejfBZ.AEQbTJ(str, str2);
        final Function1 function12 = new Function1() { // from class: o.tfc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C46825teV.EZpvd(this.OLrzqt, str2, str, c55390xiz, (C37936pGe) obj2);
            }
        };
        c46825teV.AuCTel = abstractC58185ywXAEQbTJ2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.tfg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                C46825teV.EZpvd(function12, obj2);
            }
        });
        c46825teV.AuCTel();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C46825teV c46825teV, java.lang.String str, java.lang.String str2, C55390xiz c55390xiz, C37936pGe c37936pGe) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c46825teV), null, null, new PriceRemindEditFragment$subTopInfo$2$1(str, str2, c46825teV, c37936pGe, c55390xiz, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        InterfaceC58217yxC interfaceC58217yxC = this.AuCTel;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        isConnected().KWHzl(this.AubY.OLrzqt(), this.AubY.copydefault());
        AuCTel();
    }

    public final void AuCTel() {
        C46693tbw c46693tbw;
        int promptType = isConnected().copydefault().getValue().AEQbTJ().getPromptType();
        C42933rfk c42933rfk = this.valueOf;
        if (c42933rfk == null || (c46693tbw = c42933rfk.fetchVPNInfo) == null) {
            return;
        }
        InterfaceC46849tet interfaceC46849tet = this.hDKMBd;
        if (interfaceC46849tet == null) {
            Intrinsics.gEmmrt("");
            interfaceC46849tet = null;
        }
        c46693tbw.setUnit(interfaceC46849tet.KWHzl(promptType));
    }

    public final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("PriceAlert_Pop_AlertType_Click", (TrackChannel[]) null, new Function1() { // from class: o.tfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46825teV.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("alert_type", str, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("PriceAlert_Function_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.tff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46825teV.copydefault(str, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, C46825teV c46825teV, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button", str, true);
        eventParamsList.put("instrument_id", c46825teV.fetchVPNInfo, false);
        eventParamsList.put("instrument_type", c46825teV.isConnected, true);
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        C32866mlf.onEvent$default("PriceAlert_AddAlert_MarketPrice_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }
}
