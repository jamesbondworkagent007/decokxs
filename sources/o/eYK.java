package o;

import android.media.AudioAttributes;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DecodeFormat;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetTxDetailActivity$initFlowListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetTxViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes15.dex */
public final class eYK extends eXL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public boolean AYXKKw;
    public final InterfaceC56387yDm fetchVPNInfo;
    public AddressCoinHistoryDetail gEmmrt;
    public AbstractC16361eiV valueOf;
    public int values;
    public java.lang.String djBIcL = "";
    public long AhwBna = Long.MIN_VALUE;
    public java.lang.String isConnected = "";
    public java.lang.String AkhnZx = "";
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.eYQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eYK.AkhnZx(this.OLrzqt);
        }
    });

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BaseItem.StatusItem.Status.values().length];
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_WAITING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_PENDING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_EXCHANGE_REQUEST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_SPEEDING_UP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_CANCELING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_COMPLETED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseItem.StatusItem.Status.STATUS_CANCELED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr;
        }
    }

    public eYK() {
        final Function0 function0 = null;
        this.fetchVPNInfo = new ViewModelLazy(C56524yIo.AEQbTJ(AddressProfileAssetTxViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetTxDetailActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetTxDetailActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetTxDetailActivity$special$$inlined$viewModels$default$3
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.app.Activity activity, @NotNull AddressCoinHistoryDetail addressCoinHistoryDetail, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(addressCoinHistoryDetail, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) eYK.class);
            intent.putExtra("data", addressCoinHistoryDetail);
            intent.putExtra("show_coin_url", str);
            activity.startActivity(intent);
        }
    }

    public final AddressProfileAssetTxViewModel AYXKKw() {
        return (AddressProfileAssetTxViewModel) this.fetchVPNInfo.getValue();
    }

    public final C59534zip AhwBna() {
        return (C59534zip) this.DbNXlk.getValue();
    }

    public static final C59534zip AkhnZx(final eYK eyk) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(BaseItem.Dialog.class, new C10158bjF());
        c59534zip.register(BaseItem.Application.class, new C15902eZn(new Function1() { // from class: o.eYI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eYK.EZpvd(this.copydefault, (BaseItem.Application) obj);
            }
        }));
        return c59534zip;
    }

    public static final Unit EZpvd(eYK eyk, BaseItem.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        eyk.copydefault(eyk, application.EZpvd(), application.OLrzqt());
        return Unit.INSTANCE;
    }

    @Override // o.eXL, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.valueOf = (AbstractC16361eiV) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.getPostValueLengthLimit);
        fetchVPNInfo();
        values();
        djBIcL();
        DbNXlk();
    }

    public final void djBIcL() {
        AbstractC16361eiV abstractC16361eiV = this.valueOf;
        AbstractC16361eiV abstractC16361eiV2 = null;
        if (abstractC16361eiV == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV = null;
        }
        abstractC16361eiV.AuCTel.setLayoutManager(new SafeLinearLayoutManager(this));
        AbstractC16361eiV abstractC16361eiV3 = this.valueOf;
        if (abstractC16361eiV3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV3 = null;
        }
        abstractC16361eiV3.AuCTel.setAdapter(AhwBna());
        AbstractC16361eiV abstractC16361eiV4 = this.valueOf;
        if (abstractC16361eiV4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV4 = null;
        }
        android.widget.ImageView imageView = abstractC16361eiV4.gEmmrt;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        AbstractC16361eiV abstractC16361eiV5 = this.valueOf;
        if (abstractC16361eiV5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16361eiV2 = abstractC16361eiV5;
        }
        abstractC16361eiV2.ejfBZ.OLrzqt(new InterfaceC57903yrG() { // from class: o.eYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                eYK.OLrzqt(this.AEQbTJ, interfaceC57934yrl);
            }
        });
    }

    public static final void OLrzqt(eYK eyk, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        eyk.AYXKKw().EZpvd(eyk.djBIcL, eyk.AhwBna, eyk.values, eyk.isConnected);
    }

    private final void fetchVPNInfo() {
        AddressCoinHistoryDetail addressCoinHistoryDetail;
        if (Build.VERSION.SDK_INT >= 33) {
            addressCoinHistoryDetail = (AddressCoinHistoryDetail) getIntent().getParcelableExtra("data", AddressCoinHistoryDetail.class);
        } else {
            addressCoinHistoryDetail = (AddressCoinHistoryDetail) getIntent().getParcelableExtra("data");
        }
        if (addressCoinHistoryDetail == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("show_coin_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AkhnZx = stringExtra;
        this.gEmmrt = addressCoinHistoryDetail;
        copydefault(addressCoinHistoryDetail);
    }

    public final void copydefault(AddressCoinHistoryDetail addressCoinHistoryDetail) {
        java.lang.String address = addressCoinHistoryDetail.getAddress();
        if (address == null) {
            address = "";
        }
        this.djBIcL = address;
        java.lang.Long chainId = addressCoinHistoryDetail.getChainId();
        this.AhwBna = chainId != null ? chainId.longValue() : Long.MIN_VALUE;
        this.values = addressCoinHistoryDetail.getOrderType();
        java.lang.String txhash = addressCoinHistoryDetail.getTxhash();
        this.isConnected = txhash != null ? txhash : "";
    }

    private final void values() {
        AkhnZx();
        AYXKKw().EZpvd(this.djBIcL, this.AhwBna, this.values, this.isConnected);
        AbstractC16361eiV abstractC16361eiV = this.valueOf;
        if (abstractC16361eiV == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV = null;
        }
        abstractC16361eiV.fetchVPNInfo.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    private final void DbNXlk() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new ProfileAssetTxDetailActivity$initFlowListener$1(this, null));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ eYK EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, eYK eyk, java.lang.String str) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = eyk;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.valueOf();
                eYK eyk = this.EZpvd;
                eyk.copydefault(eyk, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), this.KWHzl);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ eYK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, eYK eyk) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = eyk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    public final void EZpvd(AddressTxHistoryDetail addressTxHistoryDetail) {
        java.lang.CharSequence addressStr$default;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistryKtrememberLauncherForActivityResult11), pTA.formatSimpleDateTime$default(new Date(addressTxHistoryDetail.getTxTime()), null, 1, null)));
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSavedStateRegistry);
        C15836eXb c15836eXb = new C15836eXb();
        AddressCoinHistoryDetail addressCoinHistoryDetail = this.gEmmrt;
        arrayList.add(new BaseItem.Dialog(strAYXKKw, c15836eXb.AEQbTJ(addressCoinHistoryDetail != null ? addressCoinHistoryDetail.getTxType() : 0)));
        arrayList.add(new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.putBitmap), C54870xYj.KWHzl(addressTxHistoryDetail.getServiceCharge(), addressTxHistoryDetail.getChainDecimalNum(), 6, addressTxHistoryDetail.getChainSymbol(), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null)));
        arrayList.add(new BaseItem.Dialog(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setLauncher), addressTxHistoryDetail.getChainName()));
        java.lang.String txHash = addressTxHistoryDetail.getTxHash();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) txHash)) {
            if (addressTxHistoryDetail.getExplorerUrl().length() > 0 && addressTxHistoryDetail.getShowExplorerUrl()) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C14079deg.getAddressStr$default(C14079deg.EZpvd, txHash, false, 2, null));
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), 0, spannableStringBuilder.length(), 33);
                addressStr$default = spannableStringBuilder;
            } else {
                addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, txHash, false, 2, null);
            }
            arrayList.add(new BaseItem.Application(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistryKt), addressStr$default, txHash, C33070mpX.AYXKKw(C13754dXa.FragmentManager.AnyRes), null, true, false, (addressTxHistoryDetail.getExplorerUrl().length() <= 0 || !addressTxHistoryDetail.getShowExplorerUrl()) ? "" : addressTxHistoryDetail.getExplorerUrl(), 0, null, false, 1872, null));
        }
        C33064mpR.OLrzqt(AhwBna(), arrayList);
    }

    public final void AEQbTJ(boolean z, AddressTxHistoryDetail addressTxHistoryDetail) {
        java.lang.String to;
        AbstractC16361eiV abstractC16361eiV = null;
        AbstractC16982euG abstractC16982euG = (AbstractC16982euG) DataBindingUtil.inflate(getLayoutInflater(), C13754dXa.TaskDescription.dpErvT, null, false);
        if (z) {
            to = addressTxHistoryDetail.getFrom();
        } else {
            to = addressTxHistoryDetail.getTo();
        }
        java.lang.String str = to;
        abstractC16982euG.EZpvd.setText(str);
        android.widget.TextView textView = abstractC16982euG.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        C55251xgS c55251xgS = abstractC16982euG.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
        C55251xgS c55251xgS2 = abstractC16982euG.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
        c55251xgS2.setVisibility(8);
        C55251xgS c55251xgS3 = abstractC16982euG.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
        c55251xgS3.setVisibility(8);
        android.widget.ImageView imageView = abstractC16982euG.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        ConstraintLayout constraintLayout = abstractC16982euG.AEQbTJ;
        constraintLayout.setOnClickListener(new Application(constraintLayout, 1000L, this, str));
        if (z) {
            AbstractC16361eiV abstractC16361eiV2 = this.valueOf;
            if (abstractC16361eiV2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16361eiV2 = null;
            }
            android.widget.TextView textView2 = abstractC16361eiV2.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            AbstractC16361eiV abstractC16361eiV3 = this.valueOf;
            if (abstractC16361eiV3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16361eiV3 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC16361eiV3.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            AbstractC16361eiV abstractC16361eiV4 = this.valueOf;
            if (abstractC16361eiV4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16361eiV4 = null;
            }
            abstractC16361eiV4.AYXKKw.removeAllViews();
            AbstractC16361eiV abstractC16361eiV5 = this.valueOf;
            if (abstractC16361eiV5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16361eiV = abstractC16361eiV5;
            }
            abstractC16361eiV.AYXKKw.addView(abstractC16982euG.getRoot());
            return;
        }
        AbstractC16361eiV abstractC16361eiV6 = this.valueOf;
        if (abstractC16361eiV6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV6 = null;
        }
        android.widget.TextView textView3 = abstractC16361eiV6.hDKMBd;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        AbstractC16361eiV abstractC16361eiV7 = this.valueOf;
        if (abstractC16361eiV7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV7 = null;
        }
        android.widget.LinearLayout linearLayout2 = abstractC16361eiV7.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        AbstractC16361eiV abstractC16361eiV8 = this.valueOf;
        if (abstractC16361eiV8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV8 = null;
        }
        abstractC16361eiV8.AkhnZx.removeAllViews();
        AbstractC16361eiV abstractC16361eiV9 = this.valueOf;
        if (abstractC16361eiV9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16361eiV = abstractC16361eiV9;
        }
        abstractC16361eiV.AkhnZx.addView(abstractC16982euG.getRoot());
    }

    public final void copydefault(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.Object systemService = context.getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str2));
        C19595gIe.Companion.AEQbTJ(str, str2).KWHzl(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        java.lang.Object systemService = getSystemService("vibrator");
        Intrinsics.copydefault(systemService, "");
        android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(100L, new AudioAttributes.Builder().build());
        }
    }

    public final BaseItem.StatusItem KWHzl(AddressTxHistoryDetail addressTxHistoryDetail) {
        BaseItem.StatusItem.Status status;
        switch (addressTxHistoryDetail.getTxStatus()) {
            case 1:
                status = BaseItem.StatusItem.Status.STATUS_PENDING;
                break;
            case 2:
            case 5:
                status = BaseItem.StatusItem.Status.STATUS_WAITING;
                break;
            case 3:
                status = BaseItem.StatusItem.Status.STATUS_FAILED;
                break;
            case 4:
                status = BaseItem.StatusItem.Status.STATUS_COMPLETED;
                break;
            case 6:
                status = BaseItem.StatusItem.Status.STATUS_CANCELED;
                break;
            default:
                status = BaseItem.StatusItem.Status.STATUS_COMPLETED;
                break;
        }
        return new BaseItem.StatusItem(status);
    }

    public final void KWHzl(BaseItem.StatusItem statusItem) {
        AbstractC16361eiV abstractC16361eiV = null;
        switch (Activity.OLrzqt[statusItem.OLrzqt().ordinal()]) {
            case 1:
                AbstractC16361eiV abstractC16361eiV2 = this.valueOf;
                if (abstractC16361eiV2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV2 = null;
                }
                abstractC16361eiV2.valueOf.setImageDrawable(C57304yfr.copydefault.OLrzqt(this, C52761wXj.TaskDescription.RXzakW, C52761wXj.Activity.fdOvFl));
                AbstractC16361eiV abstractC16361eiV3 = this.valueOf;
                if (abstractC16361eiV3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV3;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setToolbarNavigationClickListener));
                break;
            case 2:
                AbstractC16361eiV abstractC16361eiV4 = this.valueOf;
                if (abstractC16361eiV4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV4 = null;
                }
                LottieAnimationView lottieAnimationView = abstractC16361eiV4.valueOf;
                lottieAnimationView.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView.playAnimation();
                AbstractC16361eiV abstractC16361eiV5 = this.valueOf;
                if (abstractC16361eiV5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV5;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActionBarUpIndicator));
                break;
            case 3:
                AbstractC16361eiV abstractC16361eiV6 = this.valueOf;
                if (abstractC16361eiV6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV6 = null;
                }
                LottieAnimationView lottieAnimationView2 = abstractC16361eiV6.valueOf;
                lottieAnimationView2.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView2.playAnimation();
                AbstractC16361eiV abstractC16361eiV7 = this.valueOf;
                if (abstractC16361eiV7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV7;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.syncState));
                break;
            case 4:
                AbstractC16361eiV abstractC16361eiV8 = this.valueOf;
                if (abstractC16361eiV8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV8 = null;
                }
                LottieAnimationView lottieAnimationView3 = abstractC16361eiV8.valueOf;
                lottieAnimationView3.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView3.playAnimation();
                AbstractC16361eiV abstractC16361eiV9 = this.valueOf;
                if (abstractC16361eiV9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV9;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDrawerStateChanged));
                break;
            case 5:
                AbstractC16361eiV abstractC16361eiV10 = this.valueOf;
                if (abstractC16361eiV10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV10 = null;
                }
                LottieAnimationView lottieAnimationView4 = abstractC16361eiV10.valueOf;
                lottieAnimationView4.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView4.playAnimation();
                AbstractC16361eiV abstractC16361eiV11 = this.valueOf;
                if (abstractC16361eiV11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV11;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDrawerSlide));
                break;
            case 6:
                AbstractC16361eiV abstractC16361eiV12 = this.valueOf;
                if (abstractC16361eiV12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV12 = null;
                }
                abstractC16361eiV12.valueOf.setImageDrawable(C57304yfr.copydefault.OLrzqt(this, C52761wXj.TaskDescription.RKcVTr, C52761wXj.Activity.DQzvGN));
                android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RlQdEF));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)), 0, spannableString.length(), 33);
                AbstractC16361eiV abstractC16361eiV13 = this.valueOf;
                if (abstractC16361eiV13 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV13;
                }
                abstractC16361eiV.iwGUEr.setText(spannableString);
                break;
            case 7:
                AbstractC16361eiV abstractC16361eiV14 = this.valueOf;
                if (abstractC16361eiV14 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV14 = null;
                }
                abstractC16361eiV14.valueOf.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.Dmq));
                AbstractC16361eiV abstractC16361eiV15 = this.valueOf;
                if (abstractC16361eiV15 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV15;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnMultiWindowModeChangedListener));
                break;
            case 8:
                AbstractC16361eiV abstractC16361eiV16 = this.valueOf;
                if (abstractC16361eiV16 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16361eiV16 = null;
                }
                abstractC16361eiV16.valueOf.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.FdcJU));
                AbstractC16361eiV abstractC16361eiV17 = this.valueOf;
                if (abstractC16361eiV17 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16361eiV = abstractC16361eiV17;
                }
                abstractC16361eiV.iwGUEr.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActionBarDescription));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        EZpvd();
    }

    public final void EZpvd() {
        int iAEQbTJ = C33570myu.AEQbTJ();
        AbstractC16361eiV abstractC16361eiV = this.valueOf;
        AbstractC16361eiV abstractC16361eiV2 = null;
        if (abstractC16361eiV == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV = null;
        }
        android.text.TextPaint paint = abstractC16361eiV.iwGUEr.getPaint();
        AbstractC16361eiV abstractC16361eiV3 = this.valueOf;
        if (abstractC16361eiV3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV3 = null;
        }
        if (C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null) + paint.measureText(abstractC16361eiV3.iwGUEr.getText().toString()) > (iAEQbTJ - (C55298xhM.dpInt$default(44, (android.content.Context) null, 1, (java.lang.Object) null) * 2)) - C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null)) {
            AbstractC16361eiV abstractC16361eiV4 = this.valueOf;
            if (abstractC16361eiV4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16361eiV4 = null;
            }
            abstractC16361eiV4.isConnected.setOrientation(1);
            AbstractC16361eiV abstractC16361eiV5 = this.valueOf;
            if (abstractC16361eiV5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16361eiV2 = abstractC16361eiV5;
            }
            ViewGroup.LayoutParams layoutParams = abstractC16361eiV2.iwGUEr.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            return;
        }
        AbstractC16361eiV abstractC16361eiV6 = this.valueOf;
        if (abstractC16361eiV6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV6 = null;
        }
        abstractC16361eiV6.isConnected.setOrientation(0);
        AbstractC16361eiV abstractC16361eiV7 = this.valueOf;
        if (abstractC16361eiV7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16361eiV2 = abstractC16361eiV7;
        }
        ViewGroup.LayoutParams layoutParams2 = abstractC16361eiV2.iwGUEr.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        AbstractC16361eiV abstractC16361eiV = this.valueOf;
        AbstractC16361eiV abstractC16361eiV2 = null;
        if (abstractC16361eiV == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV = null;
        }
        abstractC16361eiV.DbNXlk.setVisibility(0);
        AbstractC16361eiV abstractC16361eiV3 = this.valueOf;
        if (abstractC16361eiV3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV3 = null;
        }
        abstractC16361eiV3.DbNXlk.setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        AbstractC16361eiV abstractC16361eiV4 = this.valueOf;
        if (abstractC16361eiV4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16361eiV2 = abstractC16361eiV4;
        }
        abstractC16361eiV2.DbNXlk.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        AbstractC16361eiV abstractC16361eiV = this.valueOf;
        AbstractC16361eiV abstractC16361eiV2 = null;
        if (abstractC16361eiV == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV = null;
        }
        abstractC16361eiV.DbNXlk.setVisibility(8);
        AbstractC16361eiV abstractC16361eiV3 = this.valueOf;
        if (abstractC16361eiV3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16361eiV2 = abstractC16361eiV3;
        }
        abstractC16361eiV2.DbNXlk.cancelAnimation();
    }

    public final void copydefault(java.lang.String str) {
        C5335Nt c5335NtEZpvd = Glide.copydefault((FragmentActivity) this).EZpvd(str).OLrzqt((RX<?>) AEQbTJ(str)).KWHzl(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(this, 0.5f, C33070mpX.copydefault(C52761wXj.Activity.wlaJM), false, 8, null));
        AbstractC16361eiV abstractC16361eiV = this.valueOf;
        if (abstractC16361eiV == null) {
            Intrinsics.gEmmrt("");
            abstractC16361eiV = null;
        }
        c5335NtEZpvd.EZpvd(abstractC16361eiV.djBIcL);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(AddressCoinHistoryDetail addressCoinHistoryDetail, AddressTxHistoryDetail addressTxHistoryDetail) {
        C10854bwM c10854bwMEZpvd;
        java.lang.String coinAmount;
        TxAssetChangeBean txAssetChangeBean;
        java.lang.Object next;
        java.lang.String str;
        java.lang.String strOLrzqt;
        int iCopydefault;
        TxAssetChangeBean txAssetChangeBean2;
        java.lang.Object next2;
        java.lang.Long chainId = addressCoinHistoryDetail.getChainId();
        AbstractC16361eiV abstractC16361eiV = null;
        if (chainId != null) {
            long jLongValue = chainId.longValue();
            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
            java.lang.String address = addressCoinHistoryDetail.getAddress();
            if (address == null) {
                address = "";
            }
            c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, C33129mqd.valueOf(java.lang.Long.valueOf(jLongValue)));
        } else {
            c10854bwMEZpvd = null;
        }
        java.lang.String direction = addressCoinHistoryDetail.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
            java.util.List<TxAssetChangeBean> input = addressTxHistoryDetail.getInput();
            if (input != null) {
                java.util.Iterator<T> it = input.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it.next();
                        if (C59449zhJ.equals$default(((TxAssetChangeBean) next2).getName(), addressCoinHistoryDetail.getCoinSymbol(), false, 2, null)) {
                            break;
                        }
                    }
                }
                txAssetChangeBean2 = (TxAssetChangeBean) next2;
            } else {
                txAssetChangeBean2 = null;
            }
            if (txAssetChangeBean2 != null) {
                coinAmount = txAssetChangeBean2.getAmount();
            } else {
                coinAmount = addressCoinHistoryDetail.getCoinAmount();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2")) {
            java.util.List<TxAssetChangeBean> output = addressTxHistoryDetail.getOutput();
            if (output != null) {
                java.util.Iterator<T> it2 = output.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (C59449zhJ.equals$default(((TxAssetChangeBean) next).getName(), addressCoinHistoryDetail.getCoinSymbol(), false, 2, null)) {
                            break;
                        }
                    }
                }
                txAssetChangeBean = (TxAssetChangeBean) next;
            } else {
                txAssetChangeBean = null;
            }
            if (txAssetChangeBean != null) {
                coinAmount = txAssetChangeBean.getAmount();
            } else {
                coinAmount = addressCoinHistoryDetail.getCoinAmount();
            }
        } else {
            coinAmount = addressCoinHistoryDetail.getCoinAmount();
        }
        java.lang.String str2 = coinAmount;
        java.lang.String direction2 = addressCoinHistoryDetail.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction2, (java.lang.Object) "1")) {
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            str = Intrinsics.EZpvd((java.lang.Object) direction2, (java.lang.Object) "2") ? "-" : "";
        }
        if (str2 == null) {
            strOLrzqt = "--";
        } else {
            strOLrzqt = C54870xYj.OLrzqt(str2, (249 & 1) != 0 ? 0 : 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            if (strOLrzqt == null) {
            }
        }
        java.lang.String str3 = str + strOLrzqt + " ";
        java.lang.String direction3 = addressCoinHistoryDetail.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction3, (java.lang.Object) "1")) {
            iCopydefault = C33512mxp.profitAlternativeColor$default(C33512mxp.AEQbTJ, this, 0.0f, 2, null);
        } else {
            iCopydefault = Intrinsics.EZpvd((java.lang.Object) direction3, (java.lang.Object) "2") ? C33070mpX.copydefault(C52761wXj.Activity.fdOvFl) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        java.lang.CharSequence charSequenceJointColorCharSequence$default = C10186bjh.jointColorCharSequence$default(C10186bjh.KWHzl, str3, iCopydefault, addressCoinHistoryDetail.getCoinSymbol(), 0, 8, null);
        AbstractC16361eiV abstractC16361eiV2 = this.valueOf;
        if (abstractC16361eiV2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16361eiV = abstractC16361eiV2;
        }
        abstractC16361eiV.fIwbmz.setText(charSequenceJointColorCharSequence$default);
    }

    private final C5448Sc AEQbTJ(java.lang.String str) {
        C5448Sc c5448Sc;
        C5448Sc c5448ScCopydefault = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_RGB_565).copydefault(AbstractC5360Os.copydefault);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        C5448Sc c5448Sc2 = c5448ScCopydefault;
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (C59449zhJ.endsWith$default(lowerCase, ".svg", false, 2, null)) {
            if (C59449zhJ.startsWith$default("SVG:" + str, "SVG:", false, 2, null)) {
                C5448Sc c5448ScAEQbTJ = c5448Sc2.copydefault(AbstractC5360Os.OLrzqt).AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
                Intrinsics.copydefault(c5448ScAEQbTJ);
                c5448Sc = c5448ScAEQbTJ;
            } else {
                C5448Sc c5448ScCopydefault2 = c5448Sc2.copydefault(AbstractC5360Os.EZpvd);
                Intrinsics.copydefault(c5448ScCopydefault2);
                c5448Sc = c5448ScCopydefault2;
            }
            return c5448Sc;
        }
        java.util.Locale locale2 = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        java.lang.String lowerCase2 = str.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) lowerCase2, (java.lang.CharSequence) ".gif", false, 2, (java.lang.Object) null) ? c5448Sc2.copydefault(AbstractC5360Os.OLrzqt) : c5448Sc2;
    }

    @Override // o.eXL, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eXL, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eXL, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eXL, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
