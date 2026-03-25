package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.bumptech.glide.Glide;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.check.ChainStatus;
import com.okinc.business.defi.biz.core.tx.check.ChainStatusChecker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.RegisterStatusResp;
import com.okinc.business.defi.biz.net.bean.TokenInfoResp;
import com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$showAlertBannerInfo$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC17931fXp;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.ActivityC20795gnd;
import o.C10407bnq;
import o.C12827cuN;
import o.C13754dXa;
import o.C14662dpg;
import o.C19595gIe;
import o.C20867gow;
import o.C21046gsP;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC54828xWv;
import o.InterfaceC54850xXq;
import o.InterfaceC9738bbJ;
import o.ViewOnClickListenerC20995grR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC20995grR extends AbstractC20518giR implements View.OnClickListener {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public AbstractC16646enp AuCTelauCTel;
    public InterfaceC54850xXq AubY;
    public AbstractC12782ctV AxsJAY;
    public boolean KWHzl;
    public final InterfaceC56387yDm ORxRYg;
    public final InterfaceC56387yDm QKVWgx;
    public boolean QOLQEE;
    public boolean ejfBZ;
    public boolean fJNWhG;
    public boolean getNewProxyInstance;
    public boolean hDKMBd;
    public boolean iwGUEr;
    public final InterfaceC56387yDm sSMYrx;
    public java.lang.Float valueOf;
    public C10525bqB zsXlph;
    public java.lang.String RJOkX = "";
    public java.lang.String isConnected = "";
    public long AuCTel = -1;
    public java.lang.String fetchVPNInfo = "";
    public java.lang.String zLjUOn = "";
    public int OLrzqt = -1;
    public int AhwBna = 1;
    public java.lang.String gHZMYf = "";
    public java.lang.String AkhnZx = "";
    public java.lang.String DbNXlk = "";
    public java.lang.String fARcdN = "";
    public final C58216yxB fIwbmz = new C58216yxB();
    public java.lang.String AEQbTJ = "";
    public java.lang.String DTwDnp = "";
    public java.lang.String zuBGHE = "";
    public TransactionInfo AwvSrB = new TransactionInfo("", "", "", "", "", "", "", "", "", null, 512, null);
    public java.lang.String values = "";
    public java.lang.String wlaJM = "";
    public boolean getFieldNames = true;
    public java.lang.String OcIXYQ = "";
    public boolean uzCIH = true;
    public java.lang.String QVAiDq = "";
    public java.lang.String QUSxYX = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC54850xXq interfaceC54850xXq) {
        this.AubY = interfaceC54850xXq;
    }

    public ViewOnClickListenerC20995grR() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$2
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
        this.QKVWgx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C21052gsV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$5
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
        Function0 function03 = new Function0() { // from class: o.gsy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC20995grR.gEmmrt();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.sSMYrx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(gFD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.receive.ReceiveCoinQrCodeFragment$special$$inlined$viewModels$default$9
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function03);
        this.ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.gsw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC20995grR.getNewProxyInstance(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.grR$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final ViewOnClickListenerC20995grR copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, boolean z2, boolean z3, int i, long j, @NotNull java.lang.String str4, int i2, InterfaceC54850xXq interfaceC54850xXq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            ViewOnClickListenerC20995grR viewOnClickListenerC20995grR = new ViewOnClickListenerC20995grR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("walletId", str);
            bundle.putString("coinId", str2);
            bundle.putString("tip", str3);
            bundle.putBoolean("showBack", z);
            bundle.putBoolean("isHeaderGone", z3);
            bundle.putBoolean("is_first_time_use", z2);
            bundle.putInt("address_type", i);
            bundle.putString("receive_address", str4);
            bundle.putLong("chainId", j);
            bundle.putInt("backgroundType", i2);
            viewOnClickListenerC20995grR.setArguments(bundle);
            viewOnClickListenerC20995grR.copydefault(interfaceC54850xXq);
            return viewOnClickListenerC20995grR;
        }

        public final ViewOnClickListenerC20995grR AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull java.lang.String str3, int i, InterfaceC54850xXq interfaceC54850xXq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            ViewOnClickListenerC20995grR viewOnClickListenerC20995grR = new ViewOnClickListenerC20995grR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("walletId", str);
            bundle.putLong("chainId", j);
            bundle.putString("contractAddress", str2);
            bundle.putBoolean("addCustomToken", z);
            bundle.putBoolean("isAddCustomTokenEnter", true);
            bundle.putString("tip", str3);
            bundle.putBoolean("showBack", z2);
            bundle.putInt("address_type", i);
            viewOnClickListenerC20995grR.setArguments(bundle);
            viewOnClickListenerC20995grR.copydefault(interfaceC54850xXq);
            return viewOnClickListenerC20995grR;
        }

        public final ViewOnClickListenerC20995grR OLrzqt(boolean z, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            ViewOnClickListenerC20995grR viewOnClickListenerC20995grR = new ViewOnClickListenerC20995grR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("is_token", z);
            bundle.putString("receive_address", str);
            bundle.putLong("chainId", j);
            bundle.putString("contractAddress", str2);
            bundle.putBoolean("is_direct_generate", true);
            bundle.putString("symbol", str3);
            bundle.putString("coin_img_url", str4);
            viewOnClickListenerC20995grR.setArguments(bundle);
            return viewOnClickListenerC20995grR;
        }
    }

    /* JADX INFO: renamed from: o.grR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.EZpvd = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C17928fXm.KWHzl.AEQbTJ().EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.grR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C10525bqB KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C10525bqB c10525bqB) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c10525bqB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C17928fXm.KWHzl.AYXKKw().copydefault(this.KWHzl.values().DbNXlk());
            }
        }
    }

    public final C21052gsV AkhnZx() {
        return (C21052gsV) this.QKVWgx.getValue();
    }

    private final gFD getNewProxyInstance() {
        return (gFD) this.sSMYrx.getValue();
    }

    public static final gFD KWHzl(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new gFD(new C13934dbu());
    }

    private final AbstractC17931fXp.Activity wlaJM() {
        return (AbstractC17931fXp.Activity) this.ORxRYg.getValue();
    }

    public static final AbstractC17931fXp.Activity getNewProxyInstance(final ViewOnClickListenerC20995grR viewOnClickListenerC20995grR) {
        return new AbstractC17931fXp.Activity() { // from class: o.grQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC17931fXp.Activity
            public final void copydefault() {
                ViewOnClickListenerC20995grR.uzCIH(this.OLrzqt);
            }
        };
    }

    public static final void uzCIH(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR) {
        AbstractC16646enp abstractC16646enp = viewOnClickListenerC20995grR.AuCTelauCTel;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        OKAlertBanner oKAlertBanner = abstractC16646enp.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(oKAlertBanner, "");
        oKAlertBanner.setVisibility(8);
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16646enp abstractC16646enp = (AbstractC16646enp) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.RbVjfb, viewGroup, false);
        this.AuCTelauCTel = abstractC16646enp;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        android.view.View root = abstractC16646enp.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C32866mlf.onEvent$default("Web3SendCoin_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        fJNWhG();
        if (this.hDKMBd) {
            isConnected();
            return;
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.RJOkX, false), this);
        final Function1 function1 = new Function1() { // from class: o.gsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.OLrzqt(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gsb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC20995grR.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.OLrzqt((java.lang.Throwable) obj);
            }
        };
        Intrinsics.copydefault(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC20995grR.AkhnZx(function12, obj);
            }
        }));
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, AbstractC12782ctV abstractC12782ctV) {
        viewOnClickListenerC20995grR.AxsJAY = abstractC12782ctV;
        viewOnClickListenerC20995grR.fARcdN();
        viewOnClickListenerC20995grR.OLrzqt(abstractC12782ctV);
        viewOnClickListenerC20995grR.gHZMYf();
        viewOnClickListenerC20995grR.uzCIH();
        if (viewOnClickListenerC20995grR.ejfBZ) {
            viewOnClickListenerC20995grR.values();
        } else {
            viewOnClickListenerC20995grR.AwvSrB();
        }
        viewOnClickListenerC20995grR.AkhnZx().EZpvd(viewOnClickListenerC20995grR.RJOkX);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewOnClickListenerC20995grR, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        java.lang.String string7;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("walletId")) == null) {
            string = "";
        }
        this.RJOkX = string;
        if (arguments == null || (string2 = arguments.getString("coinId")) == null) {
            string2 = "";
        }
        this.isConnected = string2;
        this.AuCTel = arguments != null ? arguments.getLong("chainId") : -1L;
        if (arguments == null || (string3 = arguments.getString("contractAddress")) == null) {
            string3 = "";
        }
        this.fetchVPNInfo = string3;
        this.KWHzl = arguments != null ? arguments.getBoolean("addCustomToken") : false;
        this.ejfBZ = arguments != null ? arguments.getBoolean("isAddCustomTokenEnter") : false;
        if (arguments == null || (string4 = arguments.getString("tip")) == null) {
            string4 = "";
        }
        this.zLjUOn = string4;
        this.QOLQEE = arguments != null ? arguments.getBoolean("showBack") : false;
        this.OLrzqt = arguments != null ? arguments.getInt("address_type", -1) : -1;
        this.AhwBna = arguments != null ? arguments.getInt("backgroundType", 1) : 1;
        if (arguments == null || (string5 = arguments.getString("receive_address")) == null) {
            string5 = "";
        }
        if (string5.length() > 0) {
            this.gHZMYf = string5;
        }
        this.hDKMBd = arguments != null ? arguments.getBoolean("is_direct_generate") : false;
        this.getNewProxyInstance = arguments != null ? arguments.getBoolean("is_token") : false;
        if (arguments == null || (string6 = arguments.getString("symbol")) == null) {
            string6 = "";
        }
        this.AkhnZx = string6;
        if (arguments != null && (string7 = arguments.getString("coin_img_url")) != null) {
            str = string7;
        }
        this.fARcdN = str;
        pUU.copydefault("fcj coinId is " + this.isConnected);
    }

    public final void fARcdN() {
        if (this.AhwBna == 0) {
            OLrzqt().getRoot().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
            AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        } else {
            OLrzqt().getRoot().setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.djBIcL));
            AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.djBIcL));
        }
        KWHzl(false);
        EZpvd(this.QOLQEE);
        valueOf(true);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("isHeaderGone")) {
            AEQbTJ();
        }
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        AbstractC16646enp abstractC16646enp2 = null;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.getNewProxyInstance.setVisibility((this.KWHzl || this.ejfBZ) ? 8 : 0);
        AbstractC16646enp abstractC16646enp3 = this.AuCTelauCTel;
        if (abstractC16646enp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16646enp2 = abstractC16646enp3;
        }
        abstractC16646enp2.AuCTel.setVisibility((this.KWHzl || this.ejfBZ) ? 8 : 0);
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        java.lang.String str;
        ChainAddress chainAddress;
        ChainAddress chainAddressCopydefault;
        java.lang.String address;
        C10854bwM c10854bwMAEQbTJ;
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(C33129mqd.valueOf(this.isConnected));
        long jFetchVPNInfo = -1;
        if (this.AuCTel == -1) {
            if (customChainCoinMetaOLrzqt == null || (c10854bwMAEQbTJ = customChainCoinMetaOLrzqt.AEQbTJ()) == null) {
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(this.isConnected)));
                if (c10854bwMKWHzl != null) {
                    jFetchVPNInfo = c10854bwMKWHzl.fetchVPNInfo();
                }
            } else {
                jFetchVPNInfo = c10854bwMAEQbTJ.fetchVPNInfo();
            }
            this.AuCTel = jFetchVPNInfo;
        }
        str = "";
        if (customChainCoinMetaOLrzqt != null) {
            if (abstractC12782ctV != null && (chainAddressCopydefault = abstractC12782ctV.copydefault(java.lang.Long.valueOf(customChainCoinMetaOLrzqt.copydefault()))) != null && (address = chainAddressCopydefault.getAddress()) != null) {
                str = address;
            }
            this.gHZMYf = str;
            return;
        }
        java.lang.String address2 = null;
        java.lang.String strCopydefault = abstractC12782ctV != null ? abstractC12782ctV.copydefault(this.AuCTel, this.OLrzqt) : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.gHZMYf)) {
            address2 = this.gHZMYf;
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault)) {
            address2 = strCopydefault;
        } else if (abstractC12782ctV != null && (chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, this.AuCTel, null, 2, null)) != null) {
            address2 = chainAddress.getAddress();
        }
        this.gHZMYf = address2 != null ? address2 : "";
    }

    public final void fIwbmz() {
        final C10525bqB c10525bqB = this.zsXlph;
        if (c10525bqB == null) {
            return;
        }
        ChainAddress chainAddressEZpvd = c10525bqB.EZpvd();
        AbstractC16646enp abstractC16646enp = null;
        java.lang.Integer numValueOf = chainAddressEZpvd != null ? java.lang.Integer.valueOf(chainAddressEZpvd.getAddressType()) : null;
        if (c10525bqB.gEmmrt() == 70000061) {
            int value = AddressType.P2TRType.getValue();
            if (numValueOf == null || numValueOf.intValue() != value) {
                C17928fXm c17928fXm = C17928fXm.KWHzl;
                if (c17928fXm.AEQbTJ().KWHzl()) {
                    AbstractC16646enp abstractC16646enp2 = this.AuCTelauCTel;
                    if (abstractC16646enp2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16646enp = abstractC16646enp2;
                    }
                    OKAlertBanner oKAlertBanner = abstractC16646enp.hDKMBd;
                    Intrinsics.copydefault(oKAlertBanner);
                    oKAlertBanner.setVisibility(0);
                    oKAlertBanner.setStyle(0);
                    oKAlertBanner.setType(2);
                    oKAlertBanner.setMessage(C33069mpW.copydefault(C13754dXa.FragmentManager.isBrowsable, C56424yEw.gEmmrt(C56390yDp.OLrzqt("contractName", C33070mpX.AYXKKw(C13754dXa.FragmentManager.writeToParcel)), C56390yDp.OLrzqt("contractType", C33070mpX.AYXKKw(C13754dXa.FragmentManager.isPlayable)))));
                    android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
                    imageViewOLrzqt.setOnClickListener(new ActionBar(imageViewOLrzqt, 1000L));
                    c17928fXm.AEQbTJ().OLrzqt(wlaJM());
                    return;
                }
            }
        }
        if (c10525bqB.KWHzl().UlJrfe() && C17928fXm.KWHzl.AYXKKw().KWHzl(c10525bqB.values().DbNXlk())) {
            getNewProxyInstance().copydefault(c10525bqB.KWHzl().AhwBna(), c10525bqB.zuBGHE(), c10525bqB.KWHzl().OLrzqt(), new Function1() { // from class: o.gsf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC20995grR.EZpvd(this.OLrzqt, c10525bqB, (RegisterStatusResp) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(final ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, C10525bqB c10525bqB, final RegisterStatusResp registerStatusResp) {
        Intrinsics.checkNotNullParameter(registerStatusResp, "");
        if (ChainStatusChecker.OLrzqt.OLrzqt(registerStatusResp) == ChainStatus.UNREGISTERED) {
            AbstractC16646enp abstractC16646enp = viewOnClickListenerC20995grR.AuCTelauCTel;
            if (abstractC16646enp == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp = null;
            }
            OKAlertBanner oKAlertBanner = abstractC16646enp.hDKMBd;
            Intrinsics.copydefault(oKAlertBanner);
            oKAlertBanner.setVisibility(0);
            oKAlertBanner.setStyle(0);
            oKAlertBanner.setType(4);
            oKAlertBanner.setMessage(registerStatusResp.getAlertMessage());
            oKAlertBanner.setPrimaryAction(C33070mpX.AYXKKw(C13754dXa.FragmentManager.mapNightMode), new Function0() { // from class: o.gsr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ViewOnClickListenerC20995grR.OLrzqt(this.copydefault, registerStatusResp);
                }
            });
            android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
            imageViewOLrzqt.setOnClickListener(new Activity(imageViewOLrzqt, 1000L, c10525bqB));
            C17928fXm.KWHzl.AYXKKw().OLrzqt(viewOnClickListenerC20995grR.wlaJM());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, RegisterStatusResp registerStatusResp) {
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity activity = viewOnClickListenerC20995grR.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, activity, registerStatusResp.getUrl(), null, null, null, null, null, "wallet", 96, null);
        return Unit.INSTANCE;
    }

    public final void valueOf(boolean z) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.HalfFloat);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.FractionRes);
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        C52794wYp c52794wYp = abstractC16646enp.valueOf;
        if (!z) {
            strAYXKKw = strAYXKKw2;
        }
        c52794wYp.setText(strAYXKKw);
    }

    private final void AwvSrB() {
        initTransactionInfo$default(this, "", "", "", null, 8, null);
        if (this.zsXlph == null) {
            C21038gsH.copydefault.copydefault(this.isConnected, this.RJOkX, this.gHZMYf, new Function1() { // from class: o.gsn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC20995grR.AEQbTJ(this.KWHzl, (C10525bqB) obj);
                }
            });
        } else {
            iwGUEr();
        }
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, C10525bqB c10525bqB) {
        C10854bwM c10854bwMKWHzl;
        viewOnClickListenerC20995grR.zsXlph = c10525bqB;
        java.lang.String strDjBIcL = (c10525bqB == null || (c10854bwMKWHzl = c10525bqB.KWHzl()) == null) ? null : c10854bwMKWHzl.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        viewOnClickListenerC20995grR.DbNXlk = strDjBIcL;
        viewOnClickListenerC20995grR.iwGUEr();
        return Unit.INSTANCE;
    }

    public final void iwGUEr() {
        java.lang.String strEZpvd;
        java.lang.String strKWHzl;
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        C13852daR c13852daRODWQjV;
        AbstractC12782ctV abstractC12782ctV;
        C10525bqB c10525bqB = this.zsXlph;
        boolean z = true;
        if (c10525bqB == null && this.AubY != null) {
            AbstractC57212yeE.close$default(this, null, 1, null);
            return;
        }
        C10854bwM c10854bwMKWHzl3 = c10525bqB != null ? c10525bqB.KWHzl() : null;
        java.lang.String strFJNWhG = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.fJNWhG() : null;
        java.lang.String str = "";
        if (strFJNWhG == null) {
            strFJNWhG = "";
        }
        this.DTwDnp = (c10854bwMKWHzl3 == null || !c10854bwMKWHzl3.dxcTrN() || (abstractC12782ctV = this.AxsJAY) == null || !abstractC12782ctV.DGOPHZ()) ? "" : new AddressData(C8322bAY.KWHzl.KWHzl(c10854bwMKWHzl3.fetchVPNInfo(), this.gHZMYf), false, false, null, 14, null).getAddressFormat();
        java.lang.String amount = this.AwvSrB.getAmount();
        if (c10854bwMKWHzl3 == null) {
            strEZpvd = null;
        } else if (this.iwGUEr) {
            strEZpvd = C21038gsH.copydefault.EZpvd(c10854bwMKWHzl3, KWHzl(c10854bwMKWHzl3) ? c10854bwMKWHzl3.AEQbTJ(this.gHZMYf) : this.gHZMYf, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? "" : amount, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? "" : this.AwvSrB.getCurrency(), (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? "" : this.AwvSrB.getValuation(), (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? false : this.getFieldNames, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? null : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? null : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? null : null);
        } else {
            strEZpvd = C21038gsH.copydefault.EZpvd(c10854bwMKWHzl3, KWHzl(c10854bwMKWHzl3) ? c10854bwMKWHzl3.AEQbTJ(this.gHZMYf) : this.gHZMYf, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? "" : amount, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? false : this.getFieldNames, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? null : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? null : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? null : null);
        }
        this.zuBGHE = java.lang.String.valueOf(strEZpvd);
        C10525bqB c10525bqB2 = this.zsXlph;
        if (c10525bqB2 == null || (c10854bwMKWHzl2 = c10525bqB2.KWHzl()) == null || !c10854bwMKWHzl2.OuxcSI()) {
            strKWHzl = this.gHZMYf;
        } else {
            AbstractC12782ctV abstractC12782ctV2 = this.AxsJAY;
            if (abstractC12782ctV2 == null || (c13852daRODWQjV = abstractC12782ctV2.ODWQjV()) == null || (strKWHzl = c13852daRODWQjV.KWHzl()) == null) {
                strKWHzl = "";
            }
        }
        this.AEQbTJ = strKWHzl;
        java.lang.String strDjBIcL = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        java.lang.String strDbNXlk = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        if (c10854bwMKWHzl3 == null || (c10854bwMKWHzl = c10854bwMKWHzl3.KWHzl()) == null || !c10854bwMKWHzl.iRxXKY() || (C8322bAY.KWHzl.KWHzl(c10854bwMKWHzl3.fetchVPNInfo(), this.AEQbTJ) != AddressType.P2TRType.getValue() && !C10854bwM.isXRCToken$default(c10854bwMKWHzl3, null, 1, null))) {
            z = false;
        }
        boolean z2 = z;
        java.lang.String str2 = this.DTwDnp;
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        if (KWHzl(c10854bwMKWHzl3)) {
            java.lang.String strAEQbTJ = c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.AEQbTJ(this.AEQbTJ) : null;
            if (strAEQbTJ != null) {
                str = strAEQbTJ;
            }
        } else {
            str = this.AEQbTJ;
        }
        EZpvd(strFJNWhG, str2, strEZpvd, str, strDjBIcL, strDbNXlk, z2);
    }

    public final boolean KWHzl(C10854bwM c10854bwM) {
        AbstractC12782ctV abstractC12782ctV;
        return (c10854bwM == null || !c10854bwM.DGOPHZDGOPHZ() || (abstractC12782ctV = this.AxsJAY) == null || abstractC12782ctV.QfsBiF() || this.hDKMBd) ? false : true;
    }

    private final void gHZMYf() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXK.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.gsu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.AEQbTJ(this.copydefault, (xXK) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.grY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC20995grR.isConnected(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("complete_withdrawal_from_wallet");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function12 = new Function1() { // from class: o.grV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.grW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC20995grR.DbNXlk(function12, obj);
            }
        });
        getChildFragmentManager().setFragmentResultListener("switchXLayerAddressBottomFragmentRequestKey", this, new FragmentResultListener() { // from class: o.grX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ViewOnClickListenerC20995grR.copydefault(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, xXK xxk) {
        AbstractC57212yeE.close$default(viewOnClickListenerC20995grR, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, java.lang.String str) {
        AbstractC57212yeE.close$default(viewOnClickListenerC20995grR, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(final ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        viewOnClickListenerC20995grR.iwGUEr();
        final boolean z = bundle.getBoolean("switchXLayerAddressBottomFragmentResultKey");
        C32866mlf.onEvent$default("Web3ReceiveCoin_ReceivingAddress_SwitchXlayerAddress_Click", (TrackChannel[]) null, new Function1() { // from class: o.gsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.copydefault(z, viewOnClickListenerC20995grR, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z, ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, EventParamsList eventParamsList) {
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "address_type", z ? "default" : "evm0x", false, 4, null);
        C10525bqB c10525bqB = viewOnClickListenerC20995grR.zsXlph;
        java.lang.String strOLrzqt = null;
        java.lang.String strFJNWhG = (c10525bqB == null || (c10854bwMKWHzl2 = c10525bqB.KWHzl()) == null) ? null : c10854bwMKWHzl2.fJNWhG();
        EventParamsList.put$default(eventParamsList, "token_symbol", strFJNWhG == null ? "" : strFJNWhG, false, 4, null);
        C10525bqB c10525bqB2 = viewOnClickListenerC20995grR.zsXlph;
        if (c10525bqB2 != null && (c10854bwMKWHzl = c10525bqB2.KWHzl()) != null) {
            strOLrzqt = c10854bwMKWHzl.OLrzqt();
        }
        EventParamsList.put$default(eventParamsList, "token_contract_address", strOLrzqt == null ? "" : strOLrzqt, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        fARcdN();
        gHZMYf();
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(this.AuCTel);
        java.lang.String strDjBIcL = c10854bwMCopydefault != null ? c10854bwMCopydefault.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        this.DbNXlk = strDjBIcL;
        java.lang.String strEZpvd = C21038gsH.copydefault.EZpvd(null, this.gHZMYf, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? false : this.getFieldNames, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? null : java.lang.Boolean.valueOf(!this.getNewProxyInstance), (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? null : c10854bwMCopydefault, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? null : this.fetchVPNInfo);
        this.zuBGHE = strEZpvd;
        java.lang.String str = this.gHZMYf;
        this.AEQbTJ = str;
        EZpvd(this.AkhnZx, this.DTwDnp, strEZpvd, str, this.DbNXlk, this.fARcdN, false);
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.valueOf.setVisibility(8);
        AbstractC16646enp abstractC16646enp2 = this.AuCTelauCTel;
        if (abstractC16646enp2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp2 = null;
        }
        abstractC16646enp2.zsXlph.setText(OLrzqt(this.DbNXlk));
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        AbstractC16646enp abstractC16646enp2 = null;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.DbNXlk.setOnClickListener(this);
        AbstractC16646enp abstractC16646enp3 = this.AuCTelauCTel;
        if (abstractC16646enp3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp3 = null;
        }
        abstractC16646enp3.isConnected.setOnClickListener(this);
        AbstractC16646enp abstractC16646enp4 = this.AuCTelauCTel;
        if (abstractC16646enp4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp4 = null;
        }
        abstractC16646enp4.valueOf.setOnClickListener(this);
        AbstractC16646enp abstractC16646enp5 = this.AuCTelauCTel;
        if (abstractC16646enp5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp5 = null;
        }
        abstractC16646enp5.gEmmrt.setOnClickListener(this);
        AbstractC16646enp abstractC16646enp6 = this.AuCTelauCTel;
        if (abstractC16646enp6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp6 = null;
        }
        abstractC16646enp6.values.setOnClickListener(this);
        AbstractC16646enp abstractC16646enp7 = this.AuCTelauCTel;
        if (abstractC16646enp7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp7 = null;
        }
        abstractC16646enp7.uzCIH.setOnClickListener(this);
        AbstractC16646enp abstractC16646enp8 = this.AuCTelauCTel;
        if (abstractC16646enp8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp8 = null;
        }
        abstractC16646enp8.DbNXlk.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.gsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return ViewOnClickListenerC20995grR.OLrzqt(this.KWHzl, view);
            }
        });
        AbstractC16646enp abstractC16646enp9 = this.AuCTelauCTel;
        if (abstractC16646enp9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp9 = null;
        }
        abstractC16646enp9.values.postDelayed(new java.lang.Runnable() { // from class: o.gsg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20995grR.AuCTel(this.EZpvd);
            }
        }, 100L);
        AbstractC16646enp abstractC16646enp10 = this.AuCTelauCTel;
        if (abstractC16646enp10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16646enp2 = abstractC16646enp10;
        }
        abstractC16646enp2.valueOf.postDelayed(new java.lang.Runnable() { // from class: o.gsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnClickListenerC20995grR.fIwbmz(this.copydefault);
            }
        }, 100L);
    }

    public static final boolean OLrzqt(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, android.view.View view) {
        viewOnClickListenerC20995grR.AuCTel();
        return true;
    }

    public static final void AuCTel(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR) {
        try {
            if (!viewOnClickListenerC20995grR.isAdded() || viewOnClickListenerC20995grR.isDetached() || viewOnClickListenerC20995grR.getView() == null) {
                return;
            }
            AbstractC16646enp abstractC16646enp = viewOnClickListenerC20995grR.AuCTelauCTel;
            AbstractC16646enp abstractC16646enp2 = null;
            if (abstractC16646enp == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp = null;
            }
            TextViewCompat.setTextAppearance(abstractC16646enp.values, C52761wXj.LoaderManager.sSMYrx);
            AbstractC16646enp abstractC16646enp3 = viewOnClickListenerC20995grR.AuCTelauCTel;
            if (abstractC16646enp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16646enp2 = abstractC16646enp3;
            }
            abstractC16646enp2.values.requestLayout();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static final void fIwbmz(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR) {
        try {
            if (!viewOnClickListenerC20995grR.isAdded() || viewOnClickListenerC20995grR.isDetached() || viewOnClickListenerC20995grR.getView() == null) {
                return;
            }
            AbstractC16646enp abstractC16646enp = viewOnClickListenerC20995grR.AuCTelauCTel;
            AbstractC16646enp abstractC16646enp2 = null;
            if (abstractC16646enp == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp = null;
            }
            TextViewCompat.setTextAppearance(abstractC16646enp.valueOf, C52761wXj.LoaderManager.sSMYrx);
            AbstractC16646enp abstractC16646enp3 = viewOnClickListenerC20995grR.AuCTelauCTel;
            if (abstractC16646enp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16646enp2 = abstractC16646enp3;
            }
            abstractC16646enp2.valueOf.requestLayout();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gIe.StateListAnimator.newInstance$default(o.gIe$StateListAnimator, java.lang.String, java.lang.String, int, java.lang.Object):o.gIe */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String strAEQbTJ;
        C10854bwM c10854bwMKWHzl;
        int id = view != null ? view.getId() : 0;
        AbstractC16646enp abstractC16646enp = null;
        if (id == C13754dXa.ActionBar.newSession || id == C13754dXa.ActionBar.m) {
            java.lang.Object systemService = requireActivity().getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
            C10525bqB c10525bqB = this.zsXlph;
            if (KWHzl(c10525bqB != null ? c10525bqB.KWHzl() : null)) {
                C10525bqB c10525bqB2 = this.zsXlph;
                strAEQbTJ = (c10525bqB2 == null || (c10854bwMKWHzl = c10525bqB2.KWHzl()) == null) ? null : c10854bwMKWHzl.AEQbTJ(this.AEQbTJ);
            } else {
                strAEQbTJ = this.AEQbTJ;
            }
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, strAEQbTJ));
            C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
            if (strAEQbTJ == null) {
                strAEQbTJ = this.AEQbTJ;
            }
            C19595gIe.StateListAnimator.newInstance$default(stateListAnimator, null, strAEQbTJ, 1, null).KWHzl(getContext());
            C14494dmX.KWHzl.EZpvd("ReceiveQRCodePage_Btm_Button_Click", "copy");
            return;
        }
        if (id == C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMediaCompanion || id == C13754dXa.ActionBar.IPostMessageService) {
            AuCTel();
            C14494dmX.KWHzl.EZpvd("ReceiveQRCodePage_Btm_Button_Click", "share");
            return;
        }
        if (id != C13754dXa.ActionBar.OVMstZ) {
            if (id == C13754dXa.ActionBar.DcMfJKDCKfqP) {
                ejfBZ();
                C14494dmX.KWHzl.EZpvd("ReceiveQRCodePage_Btm_Button_Click", "set_amount");
                return;
            } else {
                if (id == C13754dXa.ActionBar.onActiveChanged) {
                    C15765eUl.Companion.copydefault(this.AuCTel, this.gHZMYf).show(getChildFragmentManager(), "SwitchXLayerAddressBottomFragment");
                    return;
                }
                return;
            }
        }
        this.fJNWhG = false;
        this.getFieldNames = true;
        AbstractC16646enp abstractC16646enp2 = this.AuCTelauCTel;
        if (abstractC16646enp2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp2 = null;
        }
        abstractC16646enp2.ejfBZ.setVisibility(8);
        AbstractC16646enp abstractC16646enp3 = this.AuCTelauCTel;
        if (abstractC16646enp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16646enp = abstractC16646enp3;
        }
        abstractC16646enp.gEmmrt.setVisibility(8);
        initTransactionInfo$default(this, "", "", "", null, 8, null);
        iwGUEr();
        valueOf(true);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gnd.Application.getStartIntent$default(o.gnd$Application, android.content.Context, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.scan.TransactionInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.business.defi.biz.net.bean.TxToastCheckRes, java.lang.String, com.okinc.business.defi.biz.core.tx.TransactionType, boolean, java.lang.String, boolean, boolean, boolean, java.lang.String, java.util.ArrayList, int, java.lang.Object):android.content.Intent */
    public final void ejfBZ() {
        C10854bwM c10854bwMKWHzl;
        if (KWHzl()) {
            if ((getParentFragment() instanceof C14662dpg) || (getParentFragment() instanceof DialogInterfaceOnKeyListenerC14659dpd)) {
                C20867gow.TaskDescription taskDescription = C20867gow.Companion;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("wallet_id", this.RJOkX);
                bundle.putString("coinId", this.isConnected);
                bundle.putParcelable("data", djBIcL());
                bundle.putString(MTAnalysisConstants.Account.KEY_ACCOUNT, "");
                bundle.putString("deposit_limit", "0");
                bundle.putString("from_address", this.gHZMYf);
                Unit unit = Unit.INSTANCE;
                AbstractC57212yeE.addFragmentForResult$default(this, taskDescription.copydefault(bundle), 1002, false, false, 12, null);
                return;
            }
            C14662dpg c14662dpgNewInstance$default = C14662dpg.Activity.newInstance$default(C14662dpg.Companion, 0.92f, 0, 2, null);
            C20867gow.TaskDescription taskDescription2 = C20867gow.Companion;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("wallet_id", this.RJOkX);
            bundle2.putString("coinId", this.isConnected);
            bundle2.putParcelable("data", djBIcL());
            bundle2.putString(MTAnalysisConstants.Account.KEY_ACCOUNT, "");
            bundle2.putString("deposit_limit", "0");
            bundle2.putString("from_address", this.gHZMYf);
            c14662dpgNewInstance$default.EZpvd((AbstractC57212yeE) taskDescription2.copydefault(bundle2));
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            java.lang.String simpleName = C20867gow.class.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "");
            c14662dpgNewInstance$default.EZpvd(childFragmentManager, simpleName, new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.gsv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
                public final void copydefault(android.os.Bundle bundle3) {
                    ViewOnClickListenerC20995grR.copydefault(this.AEQbTJ, bundle3);
                }
            });
            return;
        }
        C9694baS.Application application = C9694baS.Companion;
        ActivityC20795gnd.Application application2 = ActivityC20795gnd.Companion;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.lang.String str = this.RJOkX;
        java.lang.String str2 = this.isConnected;
        TransactionInfo transactionInfoDjBIcL = djBIcL();
        TransactionType transactionType = TransactionType.TypeTransfer;
        C10525bqB c10525bqB = this.zsXlph;
        application.KWHzl(this, application2.KWHzl(context, str, str2, transactionInfoDjBIcL, "from_receive", (1015936 & 32) != 0 ? "" : "", (1015936 & 64) != 0 ? "0" : "0", (1015936 & 128) != 0 ? "" : null, "", -1, null, "", transactionType, (c10525bqB == null || (c10854bwMKWHzl = c10525bqB.KWHzl()) == null || !c10854bwMKWHzl.DarRvM()) ? false : true, (1015936 & 16384) != 0 ? "" : this.gHZMYf, (32768 & 1015936) != 0 ? false : false, (65536 & 1015936) != 0 ? false : false, (131072 & 1015936) != 0 ? false : false, (262144 & 1015936) != 0 ? "" : null, (1015936 & 524288) != 0 ? null : null), new Function2() { // from class: o.gsx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ViewOnClickListenerC20995grR.KWHzl(this.copydefault, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    public static final void copydefault(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        java.lang.String str = "";
        if (bundle == null || (string = bundle.getString("symbol")) == null) {
            string = "";
        }
        java.lang.Boolean boolValueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("is_transfer_amount", true)) : null;
        if (bundle == null || (string2 = bundle.getString("transfer_amount")) == null) {
            string2 = "";
        }
        if (bundle == null || (string3 = bundle.getString("valuation")) == null) {
            string3 = "";
        }
        if (bundle == null || (string4 = bundle.getString("sign")) == null) {
            string4 = "";
        }
        viewOnClickListenerC20995grR.values = string4;
        if (bundle == null || (string5 = bundle.getString("iso_code")) == null) {
            string5 = "";
        }
        viewOnClickListenerC20995grR.wlaJM = string5;
        if (bundle != null && (string6 = bundle.getString("receive_address")) != null) {
            str = string6;
        }
        if (str.length() > 0) {
            viewOnClickListenerC20995grR.gHZMYf = str;
        }
        viewOnClickListenerC20995grR.OLrzqt(string2, string3, string, boolValueOf != null ? boolValueOf.booleanValue() : true);
    }

    public static final Unit KWHzl(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, int i, android.content.Intent intent) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.String string5;
        java.lang.String string6;
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        java.lang.String str = "";
        if (extras == null || (string = extras.getString("symbol")) == null) {
            string = "";
        }
        if (string.length() > 0) {
            viewOnClickListenerC20995grR.OcIXYQ = string;
        }
        if (extras != null) {
            viewOnClickListenerC20995grR.uzCIH = extras.getBoolean("is_transfer_amount");
        }
        if (extras == null || (string2 = extras.getString("transfer_amount")) == null) {
            string2 = "";
        }
        if (string2.length() > 0) {
            viewOnClickListenerC20995grR.QVAiDq = string2;
        }
        if (extras == null || (string3 = extras.getString("valuation")) == null) {
            string3 = "";
        }
        if (string3.length() > 0) {
            viewOnClickListenerC20995grR.QUSxYX = string3;
        }
        if (extras == null || (string4 = extras.getString("sign")) == null) {
            string4 = "";
        }
        if (string4.length() > 0) {
            viewOnClickListenerC20995grR.values = string4;
        }
        if (extras == null || (string5 = extras.getString("receive_address")) == null) {
            string5 = "";
        }
        if (string5.length() > 0) {
            viewOnClickListenerC20995grR.gHZMYf = string5;
        }
        if (extras != null && (string6 = extras.getString("iso_code")) != null) {
            str = string6;
        }
        if (str.length() > 0) {
            viewOnClickListenerC20995grR.wlaJM = str;
        }
        viewOnClickListenerC20995grR.OLrzqt(viewOnClickListenerC20995grR.QVAiDq, viewOnClickListenerC20995grR.QUSxYX, viewOnClickListenerC20995grR.OcIXYQ, viewOnClickListenerC20995grR.uzCIH);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC57212yeE
    public void AEQbTJ(int i, int i2, android.content.Intent intent) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        java.lang.String stringExtra3;
        java.lang.String stringExtra4;
        java.lang.String stringExtra5;
        java.lang.String stringExtra6;
        super.AEQbTJ(i, i2, intent);
        if (i == 1002) {
            java.lang.String str = "";
            if (intent == null || (stringExtra = intent.getStringExtra("symbol")) == null) {
                stringExtra = "";
            }
            java.lang.Boolean boolValueOf = intent != null ? java.lang.Boolean.valueOf(intent.getBooleanExtra("is_transfer_amount", true)) : null;
            if (intent == null || (stringExtra2 = intent.getStringExtra("transfer_amount")) == null) {
                stringExtra2 = "";
            }
            if (intent == null || (stringExtra3 = intent.getStringExtra("valuation")) == null) {
                stringExtra3 = "";
            }
            if (intent == null || (stringExtra4 = intent.getStringExtra("sign")) == null) {
                stringExtra4 = "";
            }
            this.values = stringExtra4;
            if (intent == null || (stringExtra5 = intent.getStringExtra("receive_address")) == null) {
                stringExtra5 = "";
            }
            this.gHZMYf = stringExtra5;
            if (intent != null && (stringExtra6 = intent.getStringExtra("iso_code")) != null) {
                str = stringExtra6;
            }
            this.wlaJM = str;
            OLrzqt(stringExtra2, stringExtra3, stringExtra, boolValueOf != null ? boolValueOf.booleanValue() : true);
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        AbstractC16646enp abstractC16646enp = null;
        if (str.length() <= 0 && str2.length() <= 0) {
            if (this.fJNWhG) {
                AbstractC16646enp abstractC16646enp2 = this.AuCTelauCTel;
                if (abstractC16646enp2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16646enp2 = null;
                }
                abstractC16646enp2.ejfBZ.setVisibility(8);
                AbstractC16646enp abstractC16646enp3 = this.AuCTelauCTel;
                if (abstractC16646enp3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16646enp = abstractC16646enp3;
                }
                abstractC16646enp.gEmmrt.setVisibility(8);
                initTransactionInfo$default(this, "", "", "", null, 8, null);
                this.fJNWhG = false;
                valueOf(true);
            }
            this.iwGUEr = false;
            this.getFieldNames = true;
        } else {
            valueOf(false);
            if (!this.fJNWhG) {
                AbstractC16646enp abstractC16646enp4 = this.AuCTelauCTel;
                if (abstractC16646enp4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16646enp4 = null;
                }
                abstractC16646enp4.ejfBZ.setVisibility(0);
                AbstractC16646enp abstractC16646enp5 = this.AuCTelauCTel;
                if (abstractC16646enp5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16646enp = abstractC16646enp5;
                }
                abstractC16646enp.gEmmrt.setVisibility(0);
                this.fJNWhG = true;
            }
            this.iwGUEr = !z;
            this.getFieldNames = false;
            KWHzl(C33129mqd.gEmmrt(str), str3, C33129mqd.gEmmrt(str2), this.wlaJM);
        }
        iwGUEr();
    }

    public static /* synthetic */ void initTransactionInfo$default(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        viewOnClickListenerC20995grR.KWHzl(str, str2, str3, str4);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.AwvSrB.setAmount(str);
        this.AwvSrB.setCurrency(str2);
        this.AwvSrB.setValuation(str3);
        this.AwvSrB.setIsoCode(str4);
    }

    public final TransactionInfo djBIcL() {
        return new TransactionInfo(this.AwvSrB.getText(), this.AwvSrB.getName(), this.AwvSrB.getAddress(), this.AwvSrB.getContractAddress(), this.AwvSrB.getAmount(), this.AwvSrB.getTokenId(), this.AwvSrB.getNetwork(), this.AwvSrB.getCurrency(), this.iwGUEr ? this.AwvSrB.getValuation() : "", this.AwvSrB.getIsoCode());
    }

    public final void values() {
        if (this.KWHzl) {
            AhwBna();
            return;
        }
        CustomChainCoinMeta customChainCoinMetaKWHzl = C10598brV.AEQbTJ.KWHzl(this.fetchVPNInfo, this.AuCTel);
        AbstractC16646enp abstractC16646enp = null;
        java.lang.Long lValueOf = customChainCoinMetaKWHzl != null ? java.lang.Long.valueOf(customChainCoinMetaKWHzl.valueOf()) : null;
        if (lValueOf == null) {
            C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(this.fetchVPNInfo, this.AuCTel);
            lValueOf = c10854bwMEZpvd != null ? java.lang.Long.valueOf(c10854bwMEZpvd.AhwBna()) : null;
        }
        if (lValueOf == null) {
            java.lang.String string = getString(C13754dXa.FragmentManager.attachBaseContext2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            copydefault(string);
            return;
        }
        this.isConnected = lValueOf.toString();
        AbstractC16646enp abstractC16646enp2 = this.AuCTelauCTel;
        if (abstractC16646enp2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16646enp = abstractC16646enp2;
        }
        abstractC16646enp.AuCTel.setVisibility(0);
        AwvSrB();
    }

    public final void AhwBna() {
        getFieldNames();
        AbstractC58185ywX<ResponseData<TokenInfoResp>> abstractC58185ywXDjBIcL = new C13934dbu().djBIcL(this.AuCTel, this.fetchVPNInfo);
        final Function1 function1 = new Function1() { // from class: o.gsk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXDjBIcL.KWHzl(new InterfaceC58229yxO() { // from class: o.gsl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function12 = new Function1() { // from class: o.gso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.OLrzqt(this.KWHzl, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC20995grR.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gsq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.AEQbTJ(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ViewOnClickListenerC20995grR.djBIcL(function13, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, ResponseData responseData) {
        viewOnClickListenerC20995grR.AYXKKw();
        if (responseData.getCode() == 0) {
            C10854bwM c10854bwM = (C10854bwM) responseData.getData();
            AbstractC16646enp abstractC16646enp = null;
            viewOnClickListenerC20995grR.isConnected = java.lang.String.valueOf(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
            AbstractC16646enp abstractC16646enp2 = viewOnClickListenerC20995grR.AuCTelauCTel;
            if (abstractC16646enp2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp2 = null;
            }
            abstractC16646enp2.getNewProxyInstance.setVisibility(0);
            AbstractC16646enp abstractC16646enp3 = viewOnClickListenerC20995grR.AuCTelauCTel;
            if (abstractC16646enp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16646enp = abstractC16646enp3;
            }
            abstractC16646enp.AuCTel.setVisibility(0);
            viewOnClickListenerC20995grR.AwvSrB();
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, java.lang.Throwable th) {
        viewOnClickListenerC20995grR.AYXKKw();
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        viewOnClickListenerC20995grR.copydefault(C10857bwP.AEQbTJ("ReceiveCoinQrCodeFragment", message));
        return Unit.INSTANCE;
    }

    private final void copydefault(java.lang.String str) {
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        AbstractC16646enp abstractC16646enp2 = null;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.djBIcL.setVisibility(0);
        AbstractC16646enp abstractC16646enp3 = this.AuCTelauCTel;
        if (abstractC16646enp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16646enp2 = abstractC16646enp3;
        }
        android.widget.FrameLayout frameLayout = abstractC16646enp2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        java.lang.String string = getString(C13754dXa.FragmentManager.DcMfJKfNLfdT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C6980aZc.AEQbTJ(this, frameLayout, string, str, getString(C13754dXa.FragmentManager.DcMfJKfNUfqk), C52761wXj.TaskDescription.getSerial, new Function0() { // from class: o.gse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ViewOnClickListenerC20995grR.getFieldNames(this.AEQbTJ);
            }
        });
    }

    public static final Unit getFieldNames(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR) {
        if (viewOnClickListenerC20995grR.KWHzl) {
            AbstractC16646enp abstractC16646enp = viewOnClickListenerC20995grR.AuCTelauCTel;
            AbstractC16646enp abstractC16646enp2 = null;
            if (abstractC16646enp == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp = null;
            }
            abstractC16646enp.djBIcL.setVisibility(8);
            AbstractC16646enp abstractC16646enp3 = viewOnClickListenerC20995grR.AuCTelauCTel;
            if (abstractC16646enp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16646enp2 = abstractC16646enp3;
            }
            android.widget.FrameLayout frameLayout = abstractC16646enp2.djBIcL;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            C6980aZc.OLrzqt(viewOnClickListenerC20995grR, frameLayout);
            viewOnClickListenerC20995grR.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z) {
        int iCopydefault;
        C10854bwM c10854bwMKWHzl;
        C10525bqB c10525bqB;
        AbstractC12782ctV abstractC12782ctVValues;
        C10525bqB c10525bqB2;
        C10854bwM c10854bwMKWHzl2;
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        AbstractC16646enp abstractC16646enp2 = null;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        KWHzl(abstractC16646enp, str3, str6);
        abstractC16646enp.getFieldNames.setText(str);
        C55251xgS c55251xgS = abstractC16646enp.KWHzl;
        c55251xgS.setText(str2.length() == 0 ? str5 : str2);
        int i = 8;
        if (str2.length() == 0 && str5.length() == 0) {
            c55251xgS.setVisibility(8);
        } else {
            c55251xgS.setVisibility(0);
            Intrinsics.copydefault(c55251xgS);
            ViewGroup.LayoutParams layoutParams = c55251xgS.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (str.length() == 0) {
                    iCopydefault = 0;
                } else {
                    android.content.Context context = c55251xgS.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iCopydefault = C55298xhM.copydefault(8.0f, context);
                }
                marginLayoutParams.setMarginStart(iCopydefault);
                c55251xgS.setLayoutParams(marginLayoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        abstractC16646enp.wlaJM.setText(str4);
        if (str4.length() > 0) {
            abstractC16646enp.AhwBna.setVisibility(0);
        } else {
            abstractC16646enp.AhwBna.setVisibility(8);
        }
        if (z || ((c10525bqB2 = this.zsXlph) != null && (c10854bwMKWHzl2 = c10525bqB2.KWHzl()) != null && c10854bwMKWHzl2.DarRvM())) {
            abstractC16646enp.AuCTel.setVisibility(0);
            abstractC16646enp.valueOf.setVisibility(8);
        } else {
            abstractC16646enp.AuCTel.setVisibility(0);
            abstractC16646enp.values.setVisibility(0);
        }
        if ((C33129mqd.OLrzqt((java.lang.Object) this.AwvSrB.getAmount(), (java.lang.Object) 0) && C33129mqd.OLrzqt((java.lang.Object) this.AwvSrB.getValuation(), (java.lang.Object) 0)) || (this.AwvSrB.getAmount().length() == 0 && this.AwvSrB.getValuation().length() == 0)) {
            abstractC16646enp.ejfBZ.setVisibility(8);
            abstractC16646enp.gEmmrt.setVisibility(8);
            AbstractC16646enp abstractC16646enp3 = this.AuCTelauCTel;
            if (abstractC16646enp3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp3 = null;
            }
            android.view.View view = abstractC16646enp3.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
        } else {
            abstractC16646enp.ejfBZ.setVisibility(0);
            abstractC16646enp.gEmmrt.setVisibility(0);
            KWHzl(str);
            AbstractC16646enp abstractC16646enp4 = this.AuCTelauCTel;
            if (abstractC16646enp4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16646enp4 = null;
            }
            android.view.View view2 = abstractC16646enp4.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            C57304yfr c57304yfr = C57304yfr.copydefault;
            ConstraintLayout constraintLayout = abstractC16646enp.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            ConstraintLayout constraintLayout2 = abstractC16646enp.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            view2.setVisibility(c57304yfr.AEQbTJ(constraintLayout, constraintLayout2) ? 0 : 8);
        }
        AppCompatTextView appCompatTextView = abstractC16646enp.zsXlph;
        java.lang.CharSequence defaultReceiveQrTipText$default = this.zLjUOn;
        if (!java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN(defaultReceiveQrTipText$default)).booleanValue()) {
            defaultReceiveQrTipText$default = null;
        }
        if (defaultReceiveQrTipText$default == null) {
            defaultReceiveQrTipText$default = getDefaultReceiveQrTipText$default(this, null, 1, null);
        }
        appCompatTextView.setText(defaultReceiveQrTipText$default);
        AbstractC16646enp abstractC16646enp5 = this.AuCTelauCTel;
        if (abstractC16646enp5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp5 = null;
        }
        android.widget.TextView textView = abstractC16646enp5.uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C10525bqB c10525bqB3 = this.zsXlph;
        if (c10525bqB3 != null && (c10854bwMKWHzl = c10525bqB3.KWHzl()) != null && c10854bwMKWHzl.DGgnkA() && (c10525bqB = this.zsXlph) != null && (abstractC12782ctVValues = c10525bqB.values()) != null && !abstractC12782ctVValues.QfsBiF() && !this.hDKMBd) {
            i = 0;
        }
        textView.setVisibility(i);
        AbstractC16646enp abstractC16646enp6 = this.AuCTelauCTel;
        if (abstractC16646enp6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16646enp2 = abstractC16646enp6;
        }
        abstractC16646enp2.uzCIH.setText(C33070mpX.AYXKKw(C17948fYf.copydefault.EZpvd() ? C13754dXa.FragmentManager.onSupportNavigateUp : C13754dXa.FragmentManager.onSupportActionModeFinished));
    }

    public static /* synthetic */ java.lang.CharSequence getDefaultReceiveQrTipText$default(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return viewOnClickListenerC20995grR.OLrzqt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.CharSequence OLrzqt(java.lang.String str) {
        java.lang.String strDjBIcL;
        boolean z;
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        C10525bqB c10525bqB = this.zsXlph;
        C10854bwM c10854bwMKWHzl3 = c10525bqB != null ? c10525bqB.KWHzl() : null;
        if (c10854bwMKWHzl3 == null || (strDjBIcL = c10854bwMKWHzl3.djBIcL()) == null) {
            strDjBIcL = str;
        }
        if (c10854bwMKWHzl3 == null || (c10854bwMKWHzl2 = c10854bwMKWHzl3.KWHzl()) == null || !c10854bwMKWHzl2.AxsJAYaxsJAY()) {
            z = false;
        } else {
            if (C8322bAY.KWHzl.KWHzl(c10854bwMKWHzl3 != null ? c10854bwMKWHzl3.fetchVPNInfo() : 0L, this.AEQbTJ) == AddressType.P2TRType.getValue() || (c10854bwMKWHzl3 != null && C10854bwM.isXRCToken$default(c10854bwMKWHzl3, null, 1, null))) {
                z = true;
            }
        }
        final android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C10525bqB c10525bqB2 = this.zsXlph;
        if (c10525bqB2 != null && (c10854bwMKWHzl = c10525bqB2.KWHzl()) != null && c10854bwMKWHzl.AxsJAYaxsJAY()) {
            AbstractC12782ctV abstractC12782ctV = this.AxsJAY;
            if ((abstractC12782ctV != null ? abstractC12782ctV.QwvEab() : null) == WalletType.HardwareWallet) {
                java.lang.String string = getString(C13754dXa.FragmentManager.IdRes);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return C33061mpO.setupSpanStyles$default(string, new java.lang.String[]{strDjBIcL}, 0, null, false, new Function1() { // from class: o.grZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ViewOnClickListenerC20995grR.copydefault(foregroundColorSpan, (java.util.List) obj);
                    }
                }, 14, null);
            }
        }
        if (z) {
            java.lang.String string2 = getString(C13754dXa.FragmentManager.setNavigationMode);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return C33061mpO.setupSpanStyles$default(string2, new java.lang.String[]{strDjBIcL}, 0, null, false, new Function1() { // from class: o.gsi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC20995grR.OLrzqt(foregroundColorSpan, (java.util.List) obj);
                }
            }, 14, null);
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int i = C13754dXa.FragmentManager.AppCompatDelegateImplAutoBatteryNightModeManager;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(strDjBIcL);
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        spannableStringValueOf.setSpan(foregroundColorSpan, 0, spannableStringValueOf.length(), 33);
        Unit unit = Unit.INSTANCE;
        return C33069mpW.copydefault(contextRequireContext, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", spannableStringValueOf)));
    }

    public static final Unit copydefault(android.text.style.ForegroundColorSpan foregroundColorSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(foregroundColorSpan);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.text.style.ForegroundColorSpan foregroundColorSpan, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(foregroundColorSpan);
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractC16646enp abstractC16646enp, java.lang.String str, java.lang.String str2) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        int iAEQbTJ = C33570myu.AEQbTJ() - C55298xhM.dpInt$default(WalletImportError.ERROR_CODE_AA_EXIST, (android.content.Context) null, 1, (java.lang.Object) null);
        if (str.length() > 0) {
            float f = iAEQbTJ * 0.19f;
            int i = (int) f;
            Glide.KWHzl(abstractC16646enp.AkhnZx).EZpvd().copydefault(str2).KWHzl(C13754dXa.Activity.DcqEDu).copydefault(C13754dXa.Activity.DcqEDu).gEmmrt().OLrzqt(new StateListAnimator(context, this, abstractC16646enp, iAEQbTJ, C55298xhM.AEQbTJ(8, context), f, str, i, i));
        }
    }

    /* JADX INFO: renamed from: o.grR$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5449Sd<android.graphics.Bitmap> {
        public final /* synthetic */ float AEQbTJ;
        public final /* synthetic */ AbstractC16646enp AYXKKw;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ float copydefault;
        public final /* synthetic */ java.lang.String djBIcL;
        public final /* synthetic */ ViewOnClickListenerC20995grR valueOf;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(android.content.Context context, ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, AbstractC16646enp abstractC16646enp, int i, float f, float f2, java.lang.String str, int i2, int i3) {
            super(i2, i3);
            this.OLrzqt = context;
            this.valueOf = viewOnClickListenerC20995grR;
            this.AYXKKw = abstractC16646enp;
            this.KWHzl = i;
            this.copydefault = f;
            this.AEQbTJ = f2;
            this.djBIcL = str;
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void KWHzl(android.graphics.drawable.Drawable drawable) throws java.lang.Exception {
            android.content.Context context = this.OLrzqt;
            android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.valueOf.getResources(), C13754dXa.Activity.DcqEDu);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "");
            OLrzqt(context, bitmapDecodeResource);
        }

        @Override // o.AbstractC5449Sd, o.InterfaceC5462Sq
        public void AEQbTJ(android.graphics.drawable.Drawable drawable) throws java.lang.Exception {
            android.content.Context context = this.OLrzqt;
            android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.valueOf.getResources(), C13754dXa.Activity.DcqEDu);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "");
            OLrzqt(context, bitmapDecodeResource);
            this.AYXKKw.fIwbmz.playAnimation();
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) throws java.lang.Exception {
            Intrinsics.checkNotNullParameter(bitmap, "");
            OLrzqt(this.OLrzqt, bitmap);
            this.AYXKKw.fIwbmz.playAnimation();
        }

        public final void OLrzqt(android.content.Context context, android.graphics.Bitmap bitmap) throws java.lang.Exception {
            ViewGroup.LayoutParams layoutParams = this.AYXKKw.AkhnZx.getLayoutParams();
            int i = this.KWHzl;
            layoutParams.width = i;
            layoutParams.height = i;
            this.AYXKKw.AkhnZx.setLayoutParams(layoutParams);
            this.AYXKKw.fIwbmz.setLayoutParams(layoutParams);
            C6996aZs c6996aZs = C6996aZs.OLrzqt;
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.copydefault);
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.Q;
            android.graphics.Bitmap bitmapOLrzqt = C21045gsO.OLrzqt(bitmap, this.copydefault);
            int i2 = (int) this.AEQbTJ;
            float fOLrzqt = C55298xhM.OLrzqt(0.5f, context);
            float fOLrzqt2 = C55298xhM.OLrzqt(0.75f, context);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            java.lang.String str = this.djBIcL;
            int i3 = this.KWHzl;
            this.AYXKKw.AkhnZx.setImageBitmap(c6996aZs.KWHzl(str, i3, i3, (2848 & 8) != 0 ? -16777216 : 0, (2848 & 16) != 0 ? -1 : iCopydefault, (2848 & 32) != 0 ? 0 : 0, (2848 & 64) != 0 ? 0 : 0, (2848 & 128) != 0 ? 0 : 0, (2848 & 256) != 0 ? 1.0f : 0.0f, (2848 & 512) != 0 ? 1.0f : 0.0f, (2848 & 1024) != 0 ? Bitmap.Config.RGB_565 : config, (2848 & 2048) != 0 ? 0.0f : 0.0f, (2848 & 4096) != 0 ? ErrorCorrectionLevel.H : errorCorrectionLevel, bitmapOLrzqt, i2, i2, fOLrzqt, fOLrzqt2, 0.0f));
            this.AYXKKw.fIwbmz.setBackgroundColor(ContextCompat.getColor(context, C52761wXj.Activity.QwvEab));
        }
    }

    public final Job uzCIH() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ReceiveCoinQrCodeFragment$showAlertBannerInfo$1(this, null), 3, null);
    }

    public final void KWHzl(java.lang.String str) {
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.AubY.setTextSize(24.0f);
        AppCompatTextView appCompatTextView = abstractC16646enp.AubY;
        android.content.Context context = abstractC16646enp.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setLineHeight(C55298xhM.copydefault(28.0f, context));
        abstractC16646enp.AubY.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        int iDTwDnp = 6;
        if (this.iwGUEr) {
            abstractC16646enp.AubY.setText(java.lang.String.valueOf(C54880xYt.formatValuation$default(C33129mqd.EZpvd(this.AwvSrB.getValuation()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, new WalletCurrencyBean(this.wlaJM, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 30, null), null, false, 39, null)));
            android.widget.TextView textView = abstractC16646enp.copydefault;
            java.lang.String amount = this.AwvSrB.getAmount();
            C10525bqB c10525bqB = this.zsXlph;
            if (c10525bqB != null && (c10854bwMKWHzl2 = c10525bqB.KWHzl()) != null) {
                iDTwDnp = c10854bwMKWHzl2.DTwDnp();
            }
            textView.setText("≈ " + C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, iDTwDnp, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null));
            abstractC16646enp.AEQbTJ.setText(" " + str);
            return;
        }
        AppCompatTextView appCompatTextView2 = abstractC16646enp.AubY;
        java.lang.String amount2 = this.AwvSrB.getAmount();
        C10525bqB c10525bqB2 = this.zsXlph;
        if (c10525bqB2 != null && (c10854bwMKWHzl = c10525bqB2.KWHzl()) != null) {
            iDTwDnp = c10854bwMKWHzl.DTwDnp();
        }
        appCompatTextView2.setText(java.lang.String.valueOf(C54870xYj.OLrzqt(amount2, (249 & 1) != 0 ? 0 : 0, iDTwDnp, str, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null)));
        abstractC16646enp.copydefault.setText("≈ " + C54880xYt.formatValuation$default(C33129mqd.EZpvd(this.AwvSrB.getValuation()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, new WalletCurrencyBean(this.wlaJM, null, AudioStats.AUDIO_AMPLITUDE_NONE, 0, 0, 30, null), null, false, 39, null));
        abstractC16646enp.AEQbTJ.setText("");
    }

    public final void AuCTel() {
        C21033gsC c21033gsC;
        C10854bwM c10854bwMKWHzl;
        C10525bqB c10525bqB;
        C10854bwM c10854bwMKWHzl2;
        java.lang.String strFJNWhG;
        java.lang.Character chWlaJM;
        java.lang.String string;
        C10525bqB c10525bqB2;
        C10854bwM c10854bwMKWHzl3;
        java.lang.String strFJNWhG2;
        java.lang.String str;
        C10854bwM c10854bwMKWHzl4;
        java.lang.String str2 = "";
        java.lang.String strOLrzqt = null;
        if (this.fJNWhG) {
            java.lang.String amount = this.AwvSrB.getAmount();
            if (this.hDKMBd) {
                strFJNWhG2 = this.AkhnZx;
            } else {
                C10525bqB c10525bqB3 = this.zsXlph;
                strFJNWhG2 = (c10525bqB3 == null || (c10854bwMKWHzl4 = c10525bqB3.KWHzl()) == null) ? null : c10854bwMKWHzl4.fJNWhG();
                if (strFJNWhG2 == null) {
                    str = "";
                }
                c21033gsC = new C21033gsC(amount, str, this.AwvSrB.getValuation(), this.values, this.iwGUEr, this.wlaJM);
            }
            str = strFJNWhG2;
            c21033gsC = new C21033gsC(amount, str, this.AwvSrB.getValuation(), this.values, this.iwGUEr, this.wlaJM);
        } else {
            c21033gsC = null;
        }
        C5335Nt<android.graphics.Bitmap> c5335NtEZpvd = Glide.EZpvd(this).EZpvd();
        if (this.hDKMBd) {
            str2 = this.fARcdN;
        } else {
            C10525bqB c10525bqB4 = this.zsXlph;
            if (c10525bqB4 == null || (c10854bwMKWHzl = c10525bqB4.KWHzl()) == null || (c10854bwMKWHzl.DarRvM() ? !((c10525bqB = this.zsXlph) == null || (c10854bwMKWHzl2 = c10525bqB.KWHzl()) == null || (strFJNWhG = c10854bwMKWHzl2.fJNWhG()) == null || (chWlaJM = C59454zhO.wlaJM(strFJNWhG)) == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) : !((c10525bqB2 = this.zsXlph) == null || (c10854bwMKWHzl3 = c10525bqB2.KWHzl()) == null || (strOLrzqt = c10854bwMKWHzl3.DbNXlk()) == null))) {
                str2 = strOLrzqt;
            }
        }
        c5335NtEZpvd.copydefault(str2).gEmmrt().OLrzqt(new Application(c21033gsC));
    }

    /* JADX INFO: renamed from: o.grR$Application */
    public static final class Application extends AbstractC5454Si<android.graphics.Bitmap> {
        public final /* synthetic */ C21033gsC KWHzl;

        public Application(C21033gsC c21033gsC) {
            this.KWHzl = c21033gsC;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void copydefault(android.graphics.Bitmap bitmap, InterfaceC5460So<? super android.graphics.Bitmap> interfaceC5460So) {
            java.lang.String strAEQbTJ;
            java.lang.String str;
            java.lang.String str2;
            java.lang.CharSequence charSequence;
            java.lang.String str3;
            C10854bwM c10854bwMKWHzl;
            java.lang.String strFJNWhG;
            C10854bwM c10854bwMKWHzl2;
            Intrinsics.checkNotNullParameter(bitmap, "");
            C21046gsP.Application application = C21046gsP.Companion;
            java.lang.String str4 = ViewOnClickListenerC20995grR.this.zuBGHE;
            ViewOnClickListenerC20995grR viewOnClickListenerC20995grR = ViewOnClickListenerC20995grR.this;
            C10525bqB c10525bqB = viewOnClickListenerC20995grR.zsXlph;
            if (viewOnClickListenerC20995grR.KWHzl(c10525bqB != null ? c10525bqB.KWHzl() : null)) {
                C10525bqB c10525bqB2 = ViewOnClickListenerC20995grR.this.zsXlph;
                strAEQbTJ = (c10525bqB2 == null || (c10854bwMKWHzl2 = c10525bqB2.KWHzl()) == null) ? null : c10854bwMKWHzl2.AEQbTJ(ViewOnClickListenerC20995grR.this.AEQbTJ);
                if (strAEQbTJ == null) {
                    str = "";
                }
                C10525bqB c10525bqB3 = ViewOnClickListenerC20995grR.this.zsXlph;
                C10854bwM c10854bwMKWHzl3 = c10525bqB3 == null ? c10525bqB3.KWHzl() : null;
                java.lang.String str5 = ViewOnClickListenerC20995grR.this.DTwDnp;
                boolean z = ViewOnClickListenerC20995grR.this.fJNWhG;
                java.lang.String str6 = ViewOnClickListenerC20995grR.this.zLjUOn;
                str2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6) ^ true ? str6 : null;
                if (str2 == null) {
                    charSequence = str2;
                } else {
                    ViewOnClickListenerC20995grR viewOnClickListenerC20995grR2 = ViewOnClickListenerC20995grR.this;
                    android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(C33069mpW.copydefault(viewOnClickListenerC20995grR2, C13754dXa.FragmentManager.AppCompatDelegateImplAutoBatteryNightModeManager, C56424yEw.AYXKKw(C56390yDp.OLrzqt("chainName", viewOnClickListenerC20995grR2.DbNXlk))));
                    Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
                    charSequence = C33061mpO.setupSpanStyles$default(spannableStringValueOf, new java.lang.String[]{ViewOnClickListenerC20995grR.this.DbNXlk}, 0, null, false, new Function1() { // from class: o.gsA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC20995grR.Application.copydefault((java.util.List) obj);
                        }
                    }, 14, null);
                }
                C21033gsC c21033gsC = this.KWHzl;
                if (!ViewOnClickListenerC20995grR.this.hDKMBd) {
                    strFJNWhG = ViewOnClickListenerC20995grR.this.AkhnZx;
                } else {
                    C10525bqB c10525bqB4 = ViewOnClickListenerC20995grR.this.zsXlph;
                    if (c10525bqB4 == null || (c10854bwMKWHzl = c10525bqB4.KWHzl()) == null || (strFJNWhG = c10854bwMKWHzl.fJNWhG()) == null) {
                        str3 = "";
                    }
                    C21041gsK c21041gsK = new C21041gsK(str4, bitmap, str, c10854bwMKWHzl3, str5, z, charSequence, c21033gsC, str3);
                    FragmentActivity fragmentActivityRequireActivity = ViewOnClickListenerC20995grR.this.requireActivity();
                    Intrinsics.copydefault(fragmentActivityRequireActivity, "");
                    application.OLrzqt(c21041gsK, (AbstractActivityC33041mov) fragmentActivityRequireActivity);
                }
                str3 = strFJNWhG;
                C21041gsK c21041gsK2 = new C21041gsK(str4, bitmap, str, c10854bwMKWHzl3, str5, z, charSequence, c21033gsC, str3);
                FragmentActivity fragmentActivityRequireActivity2 = ViewOnClickListenerC20995grR.this.requireActivity();
                Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
                application.OLrzqt(c21041gsK2, (AbstractActivityC33041mov) fragmentActivityRequireActivity2);
            }
            strAEQbTJ = ViewOnClickListenerC20995grR.this.AEQbTJ;
            str = strAEQbTJ;
            C10525bqB c10525bqB32 = ViewOnClickListenerC20995grR.this.zsXlph;
            if (c10525bqB32 == null) {
            }
            java.lang.String str52 = ViewOnClickListenerC20995grR.this.DTwDnp;
            boolean z2 = ViewOnClickListenerC20995grR.this.fJNWhG;
            java.lang.String str62 = ViewOnClickListenerC20995grR.this.zLjUOn;
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str62) ^ true) {
            }
            if (str2 == null) {
            }
            C21033gsC c21033gsC2 = this.KWHzl;
            if (!ViewOnClickListenerC20995grR.this.hDKMBd) {
            }
            str3 = strFJNWhG;
            C21041gsK c21041gsK22 = new C21041gsK(str4, bitmap, str, c10854bwMKWHzl3, str52, z2, charSequence, c21033gsC2, str3);
            FragmentActivity fragmentActivityRequireActivity22 = ViewOnClickListenerC20995grR.this.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity22, "");
            application.OLrzqt(c21041gsK22, (AbstractActivityC33041mov) fragmentActivityRequireActivity22);
        }

        public static final Unit copydefault(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (C33129mqd.gEmmrt(java.lang.Float.valueOf(valueOf() / 255.0f), java.lang.Float.valueOf(0.65f))) {
            KWHzl(0.65f);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        java.lang.Float f = this.valueOf;
        if (f != null) {
            KWHzl(f != null ? f.floatValue() : -1.0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.fIwbmz.dispose();
        if (this.zsXlph != null) {
            InterfaceC54850xXq interfaceC54850xXq = this.AubY;
            if (interfaceC54850xXq != null) {
                interfaceC54850xXq.copydefault();
            }
        } else {
            InterfaceC54850xXq interfaceC54850xXq2 = this.AubY;
            if (interfaceC54850xXq2 != null) {
                InterfaceC54850xXq.StateListAnimator.onError$default(interfaceC54850xXq2, 0, 1, null);
            }
        }
        this.AxsJAY = null;
        this.zsXlph = null;
        this.AubY = null;
        C17928fXm c17928fXm = C17928fXm.KWHzl;
        c17928fXm.AEQbTJ().AEQbTJ(wlaJM());
        c17928fXm.AYXKKw().AEQbTJ(wlaJM());
        super.onDestroyView();
    }

    private final void KWHzl(float f) {
        android.view.Window window;
        android.app.Dialog dialog;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        androidx.fragment.app.DialogFragment dialogFragment = parentFragment instanceof androidx.fragment.app.DialogFragment ? (androidx.fragment.app.DialogFragment) parentFragment : null;
        if (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
            FragmentActivity activity = getActivity();
            android.view.Window window2 = activity != null ? activity.getWindow() : null;
            if (window2 == null) {
                return;
            } else {
                window = window2;
            }
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        Intrinsics.checkNotNullExpressionValue(attributes, "");
        if (this.valueOf == null) {
            this.valueOf = java.lang.Float.valueOf(attributes.screenBrightness);
        }
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }

    public final int valueOf() {
        try {
            return Settings.System.getInt(requireActivity().getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final void getFieldNames() {
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.fARcdN.KWHzl(0L);
    }

    public final void AYXKKw() {
        AbstractC16646enp abstractC16646enp = this.AuCTelauCTel;
        if (abstractC16646enp == null) {
            Intrinsics.gEmmrt("");
            abstractC16646enp = null;
        }
        abstractC16646enp.fARcdN.copydefault();
    }

    public static final ViewModelProvider.Factory gEmmrt() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(gFD.class), new Function1() { // from class: o.gst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC20995grR.KWHzl((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final InterfaceC60096zvd copydefault(ViewOnClickListenerC20995grR viewOnClickListenerC20995grR, ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(viewOnClickListenerC20995grR.AuCTel);
            C10407bnq instance$default = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null);
            long jAhwBna = c10854bwMCopydefault != null ? c10854bwMCopydefault.AhwBna() : 0L;
            java.lang.String str = viewOnClickListenerC20995grR.fetchVPNInfo;
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            java.lang.String symbol = ((TokenInfoResp) data).getSymbol();
            java.lang.Object data2 = responseData.getData();
            Intrinsics.copydefault(data2);
            return instance$default.OLrzqt(jAhwBna, str, symbol, ((TokenInfoResp) data2).getPrecision(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }
}
