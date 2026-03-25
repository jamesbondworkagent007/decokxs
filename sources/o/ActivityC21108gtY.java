package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.assets.api.model.GoToWithdrawFromWalletResultContractArgs;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalNetworkCoinsActivity$observeNetListData$1;
import com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalNetworkCoinsActivity$onCreate$1;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean;
import com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$viewModels$default$2;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.WithdrawFromExchangeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC21086gtC;
import o.C13754dXa;
import o.C21112gtc;
import o.C52761wXj;
import o.InterfaceC8223ayg;
import o.InterfaceC9738bbJ;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.gtY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC21108gtY extends AbstractActivityC33013moT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public java.lang.String AYXKKw;
    public final ActivityResultLauncher<android.content.Context> AhwBna;
    public AbstractC16428ejj EZpvd;
    public int KWHzl;
    public boolean OLrzqt;
    public final InterfaceC8223ayg djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC8223ayg valueOf;

    public ActivityC21108gtY() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalNetworkCoinsActivity$special$$inlined$viewModels$default$1
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
        };
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C21085gtB.class);
        Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalNetworkCoinsActivity$special$$inlined$viewModels$default$2
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
        };
        final byte b = 0 == true ? 1 : 0;
        this.gEmmrt = new ViewModelLazy(interfaceC56551yJoAEQbTJ, function02, function0, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transfer.receive.exchange.WithdrawalNetworkCoinsActivity$special$$inlined$viewModels$default$3
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
                Function0 function03 = b;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
        this.KWHzl = -1;
        this.AYXKKw = "";
        this.OLrzqt = true;
        InterfaceC8106awV interfaceC8106awV = (InterfaceC8106awV) C43251rlk.OLrzqt(InterfaceC8106awV.class);
        this.AhwBna = interfaceC8106awV != null ? registerForActivityResult(interfaceC8106awV.OLrzqt(true), new ActivityResultCallback() { // from class: o.gui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC21108gtY.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }) : null;
        this.valueOf = ((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class)).AEQbTJ(new InterfaceC8223ayg.ActionBar.StateListAnimator(this));
        this.djBIcL = ((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class)).AEQbTJ(new InterfaceC8223ayg.ActionBar.StateListAnimator(this));
    }

    public final C21085gtB AEQbTJ() {
        return (C21085gtB) this.gEmmrt.getValue();
    }

    private final boolean valueOf() {
        return getIntent().getBooleanExtra("is_first_time_use", false);
    }

    public static final void copydefault(ActivityC21108gtY activityC21108gtY, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC21108gtY.DbNXlk();
        }
    }

    /* JADX INFO: renamed from: o.gtY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gtY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ android.content.Intent newInstance$default(TaskDescription taskDescription, android.content.Context context, int i, java.lang.String str, java.util.ArrayList arrayList, boolean z, java.lang.String str2, int i2, java.lang.Object obj) {
            if ((i2 & 16) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i2 & 32) != 0) {
                str2 = "";
            }
            return taskDescription.KWHzl(context, i, str, arrayList, z2, str2);
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, int i, @NotNull java.lang.String str, @NotNull java.util.ArrayList<AssetWalletNetwork> arrayList, boolean z, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC21108gtY.class);
            intent.putExtra("walletId", str);
            intent.putExtra("currencyId", i);
            intent.putParcelableArrayListExtra("networks", arrayList);
            intent.putExtra("is_first_time_use", z);
            intent.putExtra("baseCurrencySymbol", str2);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16428ejj) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.gwTjWJ);
        this.KWHzl = getIntent().getIntExtra("currencyId", -1);
        java.lang.String stringExtra = getIntent().getStringExtra("walletId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AYXKKw = stringExtra;
        java.util.ArrayList<AssetWalletNetwork> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("networks");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new java.util.ArrayList<>();
        }
        AhwBna();
        gEmmrt();
        AEQbTJ().OLrzqt(parcelableArrayListExtra);
        OLrzqt();
        djBIcL();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WithdrawalNetworkCoinsActivity$onCreate$1(null), 3, null);
        this.djBIcL.AEQbTJ(new Function0() { // from class: o.gun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC21108gtY.AhwBna(this.AEQbTJ);
            }
        });
    }

    public static final Unit AhwBna(ActivityC21108gtY activityC21108gtY) {
        if (activityC21108gtY.valueOf()) {
            activityC21108gtY.copydefault();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.OLrzqt) {
            super.onBackPressed();
            C14494dmX.KWHzl.EZpvd("WithdrawExchangeSelectExchangeNetwork_Btm_Button_Click", "return");
        }
    }

    private final void djBIcL() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXT.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.gua
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ActivityC21108gtY.KWHzl((xXT) obj));
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58239yxY() { // from class: o.gug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return ActivityC21108gtY.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        yBI.subscribeBy$default(abstractC58185ywXKWHzl2, (Function1) null, (Function0) null, new Function1() { // from class: o.guj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21108gtY.KWHzl(this.EZpvd, (xXT) obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final boolean KWHzl(xXT xxt) {
        Intrinsics.checkNotNullParameter(xxt, "");
        return xxt.OLrzqt();
    }

    public static final boolean valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final Unit KWHzl(ActivityC21108gtY activityC21108gtY, xXT xxt) {
        activityC21108gtY.copydefault();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (valueOf()) {
            copydefault();
        }
    }

    private final void AhwBna() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXK.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.gtZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21108gtY.OLrzqt(this.OLrzqt, (xXK) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.guf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21108gtY.AYXKKw(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("complete_withdrawal_from_wallet");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this);
        final Function1 function12 = new Function1() { // from class: o.gue
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21108gtY.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58227yxM() { // from class: o.gub
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21108gtY.gEmmrt(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC21108gtY activityC21108gtY, xXK xxk) {
        activityC21108gtY.setResult(-1);
        activityC21108gtY.finish();
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC21108gtY activityC21108gtY, java.lang.String str) {
        activityC21108gtY.setResult(-1);
        activityC21108gtY.finish();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        java.lang.String strDbNXlk;
        java.lang.String strDjBIcL;
        java.lang.String strFJNWhG;
        C10854bwM c10854bwMKWHzl;
        if (valueOf()) {
            C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl((java.lang.Long) 818L);
            C43316rmw c43316rmw = this.AEQbTJ;
            if (c10854bwMKWHzl2 == null || (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) == null || (strDbNXlk = c10854bwMKWHzl.DbNXlk()) == null) {
                strDbNXlk = "https://static.okx.com/cdn/wallet/logo/ETH-20220328.png";
            }
            java.lang.String str = strDbNXlk;
            if (c10854bwMKWHzl2 == null || (strDjBIcL = c10854bwMKWHzl2.djBIcL()) == null) {
                strDjBIcL = "Ethereum";
            }
            java.lang.String str2 = strDjBIcL;
            if (c10854bwMKWHzl2 == null || (strFJNWhG = c10854bwMKWHzl2.fJNWhG()) == null) {
                strFJNWhG = "USDT";
            }
            c43316rmw.setItems(C56402yEa.EZpvd(new ExchangeSelectNetworkBean(str, str2, "0.001", strFJNWhG, "1.30", (java.lang.Integer) 4, (java.lang.Integer) 1045, "$", (java.lang.Long) 818L, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15360, (DefaultConstructorMarker) null)));
            this.AEQbTJ.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            AYXKKw();
            return;
        }
        this.AEQbTJ.setItems(yDY.copydefault(new C14318djG()));
        this.AEQbTJ.notifyDataSetChanged();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WithdrawalNetworkCoinsActivity$observeNetListData$1(this, null), 3, null);
    }

    private final void gEmmrt() {
        AbstractC16428ejj abstractC16428ejj = this.EZpvd;
        if (abstractC16428ejj == null) {
            Intrinsics.gEmmrt("");
            abstractC16428ejj = null;
        }
        RecyclerView recyclerView = abstractC16428ejj.copydefault;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C43316rmw c43316rmw = this.AEQbTJ;
        c43316rmw.register(ExchangeSelectNetworkBean.class, EZpvd());
        c43316rmw.register(C14316djE.class, new ActionBar(C13754dXa.TaskDescription.OeawrHOeawrH));
        c43316rmw.register(C14318djG.class, new Activity(C13754dXa.TaskDescription.OAUGar));
        recyclerView.setAdapter(c43316rmw);
    }

    /* JADX INFO: renamed from: o.gtY$ActionBar */
    public static final class ActionBar extends C43318rmy<C14316djE, AbstractC17098ewQ> {
        public ActionBar(int i) {
            super(i, 0);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17098ewQ> c43312rms, C14316djE c14316djE) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14316djE, "");
            AbstractC17098ewQ abstractC17098ewQ = (AbstractC17098ewQ) c43312rms.OLrzqt();
            abstractC17098ewQ.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRating));
            android.widget.ImageView imageView = abstractC17098ewQ.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            android.content.Context context = abstractC17098ewQ.copydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/web3_wallet/android/ic_exchange_no_network.webp", context, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.QTtQrx, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: o.gtY$Activity */
    public static final class Activity extends C43318rmy<C14318djG, AbstractC17086ewE> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC17086ewE> c43312rms, C14318djG c14318djG) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c14318djG, "");
        }

        public Activity(int i) {
            super(i, 0);
        }
    }

    public final C21112gtc EZpvd() {
        return new C21112gtc(new C21112gtc.Activity() { // from class: o.gtW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C21112gtc.Activity
            public final void KWHzl(ExchangeSelectNetworkBean exchangeSelectNetworkBean) {
                ActivityC21108gtY.EZpvd(this.EZpvd, exchangeSelectNetworkBean);
            }
        });
    }

    public static final void EZpvd(final ActivityC21108gtY activityC21108gtY, final ExchangeSelectNetworkBean exchangeSelectNetworkBean) {
        activityC21108gtY.AEQbTJ().AEQbTJ(activityC21108gtY, activityC21108gtY.AYXKKw, exchangeSelectNetworkBean, new Function2() { // from class: o.gum
            private static final byte[] $$c = {62, 106, 120, -80};
            private static final int $$d = CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {100, -61, 88, 56, 36, -35, -25};
            private static final int $$b = 100;
            private static int EZpvd = 0;
            private static int OLrzqt = 1;
            private static int[] copydefault = {1938130529, -1383635928, 1463858964, 570142640, -1490662074, -177921911, -585057711, 1460215568, 474796219, -1029785404, 59817547, -1370221751, -1670880610, -748275926, 960254696, -799516071, -1060754302, -248017175};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(short s, short s2, int i) {
                int i2;
                int i3 = i * 4;
                int i4 = s + 4;
                int i5 = s2 + 107;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i3 + 1];
                if (bArr == null) {
                    int i6 = i4;
                    int i7 = i3;
                    int i8 = 0;
                    int i9 = (-i4) + i7;
                    i2 = i8;
                    int i10 = i6;
                    i5 = i9;
                    i4 = i10;
                    bArr2[i2] = (byte) i5;
                    int i11 = i4 + 1;
                    if (i2 == i3) {
                        return new java.lang.String(bArr2, 0);
                    }
                    int i12 = i5;
                    i6 = i11;
                    i4 = bArr[i11];
                    i8 = i2 + 1;
                    i7 = i12;
                    int i92 = (-i4) + i7;
                    i2 = i8;
                    int i102 = i6;
                    i5 = i92;
                    i4 = i102;
                    bArr2[i2] = (byte) i5;
                    int i112 = i4 + 1;
                    if (i2 == i3) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i5;
                    int i1122 = i4 + 1;
                    if (i2 == i3) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
                int i2;
                int i3 = 65 - (s * 3);
                int i4 = s2 * 3;
                int i5 = (i * 2) + 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i4 + 4];
                int i6 = i4 + 3;
                if (bArr == null) {
                    int i7 = i5;
                    int i8 = 0;
                    i5++;
                    i3 = i7 + i3 + 16;
                    i2 = i8;
                    bArr2[i2] = (byte) i3;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i7 = i3;
                    i3 = bArr[i5];
                    i5++;
                    i3 = i7 + i3 + 16;
                    i2 = i8;
                    bArr2[i2] = (byte) i3;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i3;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                int i = 2 % 2;
                int i2 = OLrzqt + 33;
                EZpvd = i2 % 128;
                int i3 = i2 % 2;
                ActivityC21108gtY activityC21108gtY2 = this.KWHzl;
                if (i3 == 0) {
                    return ActivityC21108gtY.AEQbTJ(activityC21108gtY2, exchangeSelectNetworkBean, ((java.lang.Integer) obj).intValue(), (AbstractC12782ctV) obj2);
                }
                ActivityC21108gtY.AEQbTJ(activityC21108gtY2, exchangeSelectNetworkBean, ((java.lang.Integer) obj).intValue(), (AbstractC12782ctV) obj2);
                throw null;
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int[] iArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2;
                int i3 = 2 % 2;
                Zm zm = new Zm();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = copydefault;
                int i4 = 698602880;
                int i5 = -1;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i6 = 0;
                    while (i6 < length) {
                        int i7 = $11 + 43;
                        $10 = i7 % 128;
                        int i8 = i7 % i2;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr2[i6])};
                            java.lang.Object objEZpvd = YY.EZpvd(698602880);
                            if (objEZpvd == null) {
                                byte b = (byte) i5;
                                byte b2 = (byte) (b + 4);
                                objEZpvd = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b, b2, (byte) (b2 - 3)), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            iArr3[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                            i6++;
                            i2 = 2;
                            i5 = -1;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = copydefault;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i9 = 0;
                    while (i9 < length3) {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr5[i9])};
                        java.lang.Object objEZpvd2 = YY.EZpvd(i4);
                        if (objEZpvd2 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 4);
                            objEZpvd2 = YY.EZpvd(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, 4, (char) 22195, 763566332, false, $$e(b3, b4, (byte) (b4 - 3)), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        iArr6[i9] = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).intValue();
                        i9++;
                        i4 = 698602880;
                    }
                    iArr5 = iArr6;
                }
                java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
                zm.OLrzqt = 0;
                while (zm.OLrzqt < iArr.length) {
                    cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
                    cArr[1] = (char) iArr[zm.OLrzqt];
                    cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
                    cArr[3] = (char) iArr[zm.OLrzqt + 1];
                    zm.copydefault = (cArr[0] << 16) + cArr[1];
                    zm.KWHzl = (cArr[2] << 16) + cArr[3];
                    Zm.EZpvd(iArr4);
                    int i10 = 0;
                    while (i10 < 16) {
                        int i11 = $11 + 69;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            zm.copydefault ^= iArr4[i10];
                            java.lang.Object[] objArr4 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                            java.lang.Object objEZpvd3 = YY.EZpvd(984677556);
                            if (objEZpvd3 == null) {
                                byte b5 = (byte) (-1);
                                byte b6 = (byte) (b5 + 1);
                                objEZpvd3 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                            }
                            int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue();
                            zm.copydefault = zm.KWHzl;
                            zm.KWHzl = iIntValue;
                            i10 += 9;
                        } else {
                            zm.copydefault ^= iArr4[i10];
                            java.lang.Object[] objArr5 = {zm, java.lang.Integer.valueOf(Zm.AEQbTJ(zm.copydefault)), zm, zm};
                            java.lang.Object objEZpvd4 = YY.EZpvd(984677556);
                            if (objEZpvd4 == null) {
                                byte b7 = (byte) (-1);
                                byte b8 = (byte) (b7 + 1);
                                objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, 1049637320, false, $$e(b7, b8, b8), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class});
                            }
                            int iIntValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                            zm.copydefault = zm.KWHzl;
                            zm.KWHzl = iIntValue2;
                            i10++;
                        }
                    }
                    int i12 = zm.copydefault;
                    zm.copydefault = zm.KWHzl;
                    zm.KWHzl = i12;
                    zm.KWHzl ^= iArr4[16];
                    zm.copydefault ^= iArr4[17];
                    int i13 = zm.copydefault;
                    int i14 = zm.KWHzl;
                    cArr[0] = (char) (zm.copydefault >>> 16);
                    cArr[1] = (char) zm.copydefault;
                    cArr[2] = (char) (zm.KWHzl >>> 16);
                    cArr[3] = (char) zm.KWHzl;
                    Zm.EZpvd(iArr4);
                    cArr2[zm.OLrzqt * 2] = cArr[0];
                    cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
                    cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
                    cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
                    java.lang.Object[] objArr6 = {zm, zm};
                    java.lang.Object objEZpvd5 = YY.EZpvd(-1770687495);
                    if (objEZpvd5 == null) {
                        byte b9 = (byte) (-1);
                        byte b10 = (byte) (b9 + 3);
                        objEZpvd5 = YY.EZpvd(600, 5, (char) 29201, -1839874427, false, $$e(b9, b10, (byte) (b10 - 2)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6);
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Can't wrap try/catch for region: R(11:(2:131|70)|(4:72|129|73|(8:75|140|83|84|(2:86|(5:88|136|89|90|(2:92|(1:94)(7:95|96|141|97|98|99|(1:102)))))(5:109|110|134|111|112)|115|(1:117)(1:118)|119)(1:76))(9:80|82|140|83|84|(0)(0)|115|(0)(0)|119)|81|82|140|83|84|(0)(0)|115|(0)(0)|119) */
            /* JADX WARN: Removed duplicated region for block: B:109:0x082e A[Catch: Exception -> 0x0838, TRY_LEAVE, TryCatch #6 {Exception -> 0x0838, blocks: (B:83:0x0698, B:86:0x06bf, B:88:0x06c6, B:90:0x06ec, B:92:0x06f4, B:95:0x0721, B:99:0x075f, B:104:0x081f, B:105:0x0825, B:107:0x0827, B:108:0x082d, B:109:0x082e, B:111:0x0832, B:112:0x0835, B:89:0x06d0, B:97:0x0739), top: B:140:0x0698, inners: #4, #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x08c0  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x08d6  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x06bf A[Catch: Exception -> 0x0838, TRY_ENTER, TryCatch #6 {Exception -> 0x0838, blocks: (B:83:0x0698, B:86:0x06bf, B:88:0x06c6, B:90:0x06ec, B:92:0x06f4, B:95:0x0721, B:99:0x075f, B:104:0x081f, B:105:0x0825, B:107:0x0827, B:108:0x082d, B:109:0x082e, B:111:0x0832, B:112:0x0835, B:89:0x06d0, B:97:0x0739), top: B:140:0x0698, inners: #4, #7 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] EZpvd(int i, int i2) throws java.lang.Throwable {
                java.lang.Object[] objArr;
                char c;
                int i3;
                int i4;
                char c2;
                int i5;
                java.lang.String line;
                int i6;
                int i7;
                int i8;
                int i9;
                java.io.File file;
                char c3;
                int i10;
                int i11 = 2;
                int i12 = 2 % 2;
                int i13 = 16;
                int i14 = 4;
                char c4 = 3;
                java.lang.Object[] objArr2 = null;
                int i15 = 0;
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(new int[]{-1052914059, -827868736, -1780816366, 1595235811, -320267937, 1254930077, -1440707646, 994773572, -72246921, 1684866049}, 19, objArr3);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(new int[]{-272892912, -1890228949, 1914462381, -288046918, 1420155656, -468583751, -1780816366, 1595235811, -1337716644, -1070352450}, 18, objArr4);
                    java.lang.String[] strArr = {(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                    int i16 = 0;
                    while (i16 < i11) {
                        java.lang.String str = strArr[i16];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(new int[]{-846006921, 1950338909, -1585341425, -2073442937, 201160723, 2027266205, 1793480170, -158088450}, i13, objArr5);
                        java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr5[i15]);
                        java.lang.Object objInvoke = cls.getMethod(str, new java.lang.Class[i15]).invoke(cls, objArr2);
                        int i17 = OLrzqt;
                        int i18 = (i17 ^ 83) + ((i17 & 83) << 1);
                        EZpvd = i18 % 128;
                        if (i18 % i11 != 0) {
                            int i19 = 39 / i15;
                            if (((java.lang.Boolean) objInvoke).booleanValue()) {
                                int i20 = ~i;
                                int i21 = (i & (-2)) | (i20 & 1);
                                objArr = new java.lang.Object[i14];
                                int[] iArr = new int[1];
                                objArr[i15] = iArr;
                                objArr[i11] = new int[1];
                                int[] iArr2 = new int[1];
                                objArr[c4] = iArr2;
                                int i22 = EZpvd + 71;
                                OLrzqt = i22 % 128;
                                int i23 = i22 % i11;
                                iArr2[i15] = i;
                                iArr[i15] = i21;
                                objArr[1] = objArr2;
                                int i24 = (-364419955) + (((~((-610745582) | i20)) | 721984135) * (-328)) + ((i | 721984135) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) + (((~(610745581 | i)) | 185106946 | (~((-73868393) | i20))) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
                                int iAEQbTJ = OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                                int i25 = i24 * 591;
                                int i26 = (((-9424) | i25) << 1) - (i25 ^ (-9424));
                                int i27 = ~i24;
                                int i28 = EZpvd;
                                int i29 = (i28 & 45) + (i28 | 45);
                                int i30 = i29 % 128;
                                OLrzqt = i30;
                                int i31 = i29 % i11;
                                int i32 = ~iAEQbTJ;
                                int i33 = ~(i27 | i32);
                                int i34 = ~i24;
                                int i35 = ~((i34 ^ 16) | (i34 & 16));
                                int i36 = (i33 ^ i35) | (i35 & i33);
                                int i37 = ~iAEQbTJ;
                                int i38 = ~((i37 ^ 16) | (i37 & 16));
                                int i39 = (i36 ^ i38) | (i36 & i38);
                                int i40 = ((-17) ^ i24) | ((-17) & i24);
                                int i41 = ~((i40 ^ iAEQbTJ) | (i40 & iAEQbTJ));
                                int i42 = 590 * ((i39 & i41) | (i39 ^ i41));
                                int i43 = (i26 ^ i42) + ((i42 & i26) << 1);
                                int i44 = ~((i34 & i37) | (i34 ^ i37));
                                int i45 = ~(i27 | 16);
                                int i46 = (i44 & i45) | (i44 ^ i45);
                                int i47 = ~(i37 | 16);
                                int i48 = -(-(((i46 & i47) | (i46 ^ i47)) * (-1180)));
                                int i49 = (i43 ^ i48) + ((i43 & i48) << 1);
                                int i50 = ~(((-17) ^ i32) | ((-17) & i32));
                                int i51 = ~(i37 | i24);
                                int i52 = -(-(((i50 & i51) | (i50 ^ i51)) * 590));
                                int i53 = ((i49 | i52) << 1) - (i52 ^ i49);
                                int i54 = i53 * 595;
                                int i55 = i2 * (-1187);
                                int i56 = (i54 & i55) + (i54 | i55);
                                int i57 = ~i53;
                                int i58 = ~((i57 & i2) | (i57 ^ i2));
                                int i59 = ~i;
                                int i60 = i56 + ((i58 | (~((i59 ^ i2) | (i59 & i2)))) * (-1188));
                                int i61 = ((i30 | 103) << 1) - (i30 ^ 103);
                                EZpvd = i61 % 128;
                                int i62 = i61 % 2;
                                int i63 = ~((~i53) | i2);
                                int i64 = ~i2;
                                int i65 = ~((i64 ^ i) | (i64 & i));
                                int i66 = (i63 & i65) | (i63 ^ i65);
                                int i67 = ~(i20 | i53);
                                int i68 = ((i66 & i67) | (i66 ^ i67)) * 594;
                                int i69 = (i60 & i68) + (i68 | i60);
                                int i70 = ~((i64 ^ i20) | (i64 & i20));
                                int i71 = ~((i64 ^ i53) | (i64 & i53));
                                int i72 = (i70 & i71) | (i70 ^ i71);
                                int i73 = ~((i53 & i59) | (i59 ^ i53));
                                int i74 = i69 + (((i72 & i73) | (i72 ^ i73)) * 594);
                                int i75 = i74 << 13;
                                int i76 = (i75 & (~i74)) | ((~i75) & i74);
                                int i77 = i76 >>> 17;
                                int i78 = ((~i76) & i77) | ((~i77) & i76);
                                int i79 = i78 << 5;
                                ((int[]) objArr[2])[0] = (i78 | i79) & (~(i78 & i79));
                                break;
                            }
                            i16++;
                            i11 = 2;
                            i13 = 16;
                            i14 = 4;
                            c4 = 3;
                            objArr2 = null;
                            i15 = 0;
                        } else {
                            if (((java.lang.Boolean) objInvoke).booleanValue()) {
                                int i202 = ~i;
                                int i212 = (i & (-2)) | (i202 & 1);
                                objArr = new java.lang.Object[i14];
                                int[] iArr3 = new int[1];
                                objArr[i15] = iArr3;
                                objArr[i11] = new int[1];
                                int[] iArr22 = new int[1];
                                objArr[c4] = iArr22;
                                int i222 = EZpvd + 71;
                                OLrzqt = i222 % 128;
                                int i232 = i222 % i11;
                                iArr22[i15] = i;
                                iArr3[i15] = i212;
                                objArr[1] = objArr2;
                                int i242 = (-364419955) + (((~((-610745582) | i202)) | 721984135) * (-328)) + ((i | 721984135) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) + (((~(610745581 | i)) | 185106946 | (~((-73868393) | i202))) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
                                int iAEQbTJ2 = OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                                int i252 = i242 * 591;
                                int i262 = (((-9424) | i252) << 1) - (i252 ^ (-9424));
                                int i272 = ~i242;
                                int i282 = EZpvd;
                                int i292 = (i282 & 45) + (i282 | 45);
                                int i302 = i292 % 128;
                                OLrzqt = i302;
                                int i312 = i292 % i11;
                                int i322 = ~iAEQbTJ2;
                                int i332 = ~(i272 | i322);
                                int i342 = ~i242;
                                int i352 = ~((i342 ^ 16) | (i342 & 16));
                                int i362 = (i332 ^ i352) | (i352 & i332);
                                int i372 = ~iAEQbTJ2;
                                int i382 = ~((i372 ^ 16) | (i372 & 16));
                                int i392 = (i362 ^ i382) | (i362 & i382);
                                int i402 = ((-17) ^ i242) | ((-17) & i242);
                                int i412 = ~((i402 ^ iAEQbTJ2) | (i402 & iAEQbTJ2));
                                int i422 = 590 * ((i392 & i412) | (i392 ^ i412));
                                int i432 = (i262 ^ i422) + ((i422 & i262) << 1);
                                int i442 = ~((i342 & i372) | (i342 ^ i372));
                                int i452 = ~(i272 | 16);
                                int i462 = (i442 & i452) | (i442 ^ i452);
                                int i472 = ~(i372 | 16);
                                int i482 = -(-(((i462 & i472) | (i462 ^ i472)) * (-1180)));
                                int i492 = (i432 ^ i482) + ((i432 & i482) << 1);
                                int i502 = ~(((-17) ^ i322) | ((-17) & i322));
                                int i512 = ~(i372 | i242);
                                int i522 = -(-(((i502 & i512) | (i502 ^ i512)) * 590));
                                int i532 = ((i492 | i522) << 1) - (i522 ^ i492);
                                int i542 = i532 * 595;
                                int i552 = i2 * (-1187);
                                int i562 = (i542 & i552) + (i542 | i552);
                                int i572 = ~i532;
                                int i582 = ~((i572 & i2) | (i572 ^ i2));
                                int i592 = ~i;
                                int i602 = i562 + ((i582 | (~((i592 ^ i2) | (i592 & i2)))) * (-1188));
                                int i612 = ((i302 | 103) << 1) - (i302 ^ 103);
                                EZpvd = i612 % 128;
                                int i622 = i612 % 2;
                                int i632 = ~((~i532) | i2);
                                int i642 = ~i2;
                                int i652 = ~((i642 ^ i) | (i642 & i));
                                int i662 = (i632 & i652) | (i632 ^ i652);
                                int i672 = ~(i202 | i532);
                                int i682 = ((i662 & i672) | (i662 ^ i672)) * 594;
                                int i692 = (i602 & i682) + (i682 | i602);
                                int i702 = ~((i642 ^ i202) | (i642 & i202));
                                int i712 = ~((i642 ^ i532) | (i642 & i532));
                                int i722 = (i702 & i712) | (i702 ^ i712);
                                int i732 = ~((i532 & i592) | (i592 ^ i532));
                                int i742 = i692 + (((i722 & i732) | (i722 ^ i732)) * 594);
                                int i752 = i742 << 13;
                                int i762 = (i752 & (~i742)) | ((~i752) & i742);
                                int i772 = i762 >>> 17;
                                int i782 = ((~i762) & i772) | ((~i772) & i762);
                                int i792 = i782 << 5;
                                ((int[]) objArr[2])[0] = (i782 | i792) & (~(i782 & i792));
                                break;
                            }
                            i16++;
                            i11 = 2;
                            i13 = 16;
                            i14 = 4;
                            c4 = 3;
                            objArr2 = null;
                            i15 = 0;
                        }
                    }
                    objArr = new java.lang.Object[i14];
                    objArr[0] = new int[1];
                    objArr[2] = new int[1];
                    objArr[3] = new int[1];
                    int iAEQbTJ3 = OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                    int i80 = (678191631 ^ iAEQbTJ3) | (678191631 & iAEQbTJ3);
                    int i81 = ~i80;
                    int i82 = -(-(((i81 & 524947389) | (524947389 ^ i81)) * (-465)));
                    int i83 = (82620401 ^ i82) + ((i82 & 82620401) << 1);
                    int i84 = ~(iAEQbTJ3 | 524947389);
                    int i85 = -(-(((i84 & 678191631) | (678191631 ^ i84)) * 930));
                    int i86 = (((i83 | i85) << 1) - (i85 ^ i83)) + (((i80 ^ 524947389) | (i80 & 524947389)) * 465);
                    int i87 = 804090300 - (~((~((-1264852917) | i)) * 216));
                    int i88 = ~i;
                    int i89 = i87 + ((((-1210320913) & i88) | ((-1210320913) ^ i88)) * (-216));
                    int i90 = ~(((-1264852917) & i88) | (i88 ^ (-1264852917)));
                    int i91 = ((i90 & 1816012826) | (1816012826 ^ i90)) * 216;
                    if (i86 > (i89 & i91) + (i91 | i89)) {
                        c3 = 0;
                        ((int[]) objArr[5])[0] = i;
                    } else {
                        c3 = 0;
                        ((int[]) objArr[3])[0] = i;
                    }
                    ((int[]) objArr[c3])[c3] = i;
                    objArr[1] = null;
                    int i92 = EZpvd;
                    int i93 = (i92 ^ 95) + ((i92 & 95) << 1);
                    OLrzqt = i93 % 128;
                    if (i93 % 2 == 0) {
                        int i94 = (~((-153287544) | i88)) | 39253;
                        int i95 = ~(195297279 | i);
                        i10 = i2 >>> (((1947233110 + ((i94 | i95) * (-713))) + (i95 * 1426)) + ((~(42048989 | i88)) * 713));
                    } else {
                        int iMyTid = android.os.Process.myTid();
                        int i96 = -(-((((~((-578598105) | iMyTid)) | 39326744) * (-566)) + 895339177 + ((~(iMyTid | (-539271361))) * 566)));
                        i10 = (i96 | i2) + (i2 & i96);
                    }
                    int i97 = OLrzqt;
                    int i98 = (i97 & 123) + (i97 | 123);
                    EZpvd = i98 % 128;
                    int i99 = i98 % 2;
                    int i100 = i10 << 13;
                    int i101 = (i10 | i100) & (~(i10 & i100));
                    int i102 = i101 ^ (i101 >>> 17);
                    int i103 = ((i97 | 71) << 1) - (i97 ^ 71);
                    EZpvd = i103 % 128;
                    int i104 = i103 % 2;
                    int i105 = i102 << 5;
                    ((int[]) objArr[2])[0] = (i102 | i105) & (~(i102 & i105));
                    c = 0;
                } catch (java.lang.Exception unused) {
                    objArr = new java.lang.Object[]{new int[]{(i & (-3)) | ((~i) & 2)}, null, new int[]{i}, new int[]{i}};
                    int i106 = ~((-480352085) | i);
                    int i107 = (((-1071904767) | i106) * (-196)) + 491093045 + ((i106 | 591552682) * CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256) + 16;
                    int i108 = (i107 * (-209)) + (i2 * (-209));
                    int i109 = ~i107;
                    int i110 = ~i2;
                    int i111 = (~((i109 ^ i110) | (i109 & i110))) * 210;
                    int i112 = (i108 & i111) + (i108 | i111);
                    int i113 = ~i;
                    int i114 = ~((i110 ^ i113) | (i110 & i113));
                    int i115 = ~i107;
                    int i116 = ~((i115 & i) | (i115 ^ i));
                    int i117 = (i112 - (~(((i114 & i116) | (i114 ^ i116)) * 210))) - 1;
                    int i118 = ~((i113 & i109) | (i109 ^ i113) | i2);
                    int i119 = ~(i107 | i110 | i);
                    int i120 = i117 + (((i118 & i119) | (i118 ^ i119)) * 210);
                    int i121 = i120 << 13;
                    int i122 = (i121 & (~i120)) | ((~i121) & i120);
                    int i123 = i122 >>> 17;
                    int i124 = ((~i122) & i123) | ((~i123) & i122);
                    int i125 = i124 << 5;
                    int i126 = (i124 | i125) & (~(i124 & i125));
                    c = 0;
                }
                int[] iArr4 = (int[]) objArr[c];
                int i127 = EZpvd;
                int i128 = (i127 & 99) + (i127 | 99);
                int i129 = i128 % 128;
                OLrzqt = i129;
                if (i128 % 2 != 0 ? i == iArr4[0] : i == iArr4[1]) {
                    try {
                        java.lang.Object objEZpvd = YY.EZpvd(914885467);
                        if (objEZpvd == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            a(b, b2, b2, objArr6);
                            objEZpvd = YY.EZpvd(590, 5, (char) 0, 849921575, false, (java.lang.String) objArr6[0], new java.lang.Class[0]);
                        }
                        long jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, null)).longValue();
                        long j = -354227967;
                        long j2 = 569;
                        long j3 = -1;
                        long j4 = j ^ j3;
                        long j5 = jLongValue ^ j3;
                        long j6 = j4 | j5;
                        long j7 = i;
                        long j8 = j7 ^ j3;
                        long j9 = j8 | j;
                        long j10 = (j2 * j) + (j2 * jLongValue) + (((long) (-1136)) * ((j6 ^ j3) | ((j4 | j8) ^ j3) | ((j5 | j8) ^ j3))) + (((long) (-568)) * (((j4 | j7) ^ j3) | ((j5 | j7) ^ j3) | ((j9 | jLongValue) ^ j3))) + (((long) 568) * (((j6 | j7) ^ j3) | (j9 ^ j3) | ((j8 | jLongValue) ^ j3))) + ((long) 365032882);
                        int iMyTid2 = android.os.Process.myTid();
                        int i130 = ~(1345118347 | (~iMyTid2));
                        int i131 = ((int) (j10 >> 32)) & (((270338 | i130 | (~((-1345118348) | iMyTid2))) * (-338)) + 1528600654 + (((~(iMyTid2 | (-1344848010))) | i130) * 338));
                        int iMyPid = android.os.Process.myPid();
                        int i132 = ~iMyPid;
                        int i133 = (-1467844819) + (((~(1617811267 | i132)) | 159514640) * (-1188));
                        int i134 = (~(iMyPid | (-1617811268))) | 159514640;
                        int i135 = ~(1239929618 | i132);
                        int i136 = ((int) j10) & (i133 + ((i134 | i135) * 594) + (((~((-1617811268) | i132)) | 537396289 | i135) * 594));
                        if (((i131 & i136) | (i131 ^ i136)) == 1) {
                            int i137 = ~i;
                            java.lang.Object[] objArr7 = {new int[]{(i & (-11)) | (i137 & 10)}, null, new int[1], new int[]{i}};
                            int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                            int i138 = ~elapsedCpuTime;
                            int i139 = 726089763 + (((~(522234970 | i138)) | (-1071820287)) * 98) + (((~(i138 | (-633473525))) | 522234970 | (~(633473524 | elapsedCpuTime))) * (-49)) + (((~(elapsedCpuTime | 522234970)) | 438346762) * 49);
                            int i140 = i139 * (-661);
                            int i141 = ((-10576) & i140) + (i140 | (-10576));
                            int i142 = ~i139;
                            int i143 = ~((i142 & (-17)) | ((-17) ^ i142));
                            int i144 = (i141 - (~(((i143 & i137) | (i137 ^ i143)) * 1324))) - 1;
                            int i145 = ~(i | 16);
                            int i146 = ~((i139 ^ i) | (i139 & i));
                            int i147 = ((i145 & i146) | (i145 ^ i146)) * (-1324);
                            int i148 = (i144 ^ i147) + ((i147 & i144) << 1);
                            int i149 = ~((-17) | i139);
                            int i150 = ~i139;
                            int i151 = (i149 | (~((i150 & 16) | (i150 ^ 16)))) * 662;
                            int i152 = (i148 & i151) + (i151 | i148);
                            i4 = i2;
                            int i153 = ((i4 | i152) << 1) - (i152 ^ i4);
                            int i154 = i153 << 13;
                            int i155 = (i153 | i154) & (~(i153 & i154));
                            int i156 = i155 >>> 17;
                            int i157 = (i155 | i156) & (~(i155 & i156));
                            int i158 = i157 << 5;
                            ((int[]) objArr7[2])[0] = ((~i157) & i158) | ((~i158) & i157);
                            objArr = objArr7;
                            c2 = 0;
                        } else {
                            i4 = i2;
                            int i159 = EZpvd;
                            int i160 = i159 + 5;
                            OLrzqt = i160 % 128;
                            int i161 = i160 % 2;
                            java.lang.Object[] objArr8 = {new int[]{i}, null, new int[1], new int[]{i}};
                            int i162 = (((~((-697231308) | i)) | 546079233) * (-283)) + 32838836 + ((~((-151152075) | i)) * 283);
                            int i163 = ((i162 * (-947)) - (~(-(-(i4 * 949))))) - 1;
                            int i164 = i159 + 23;
                            OLrzqt = i164 % 128;
                            int i165 = i164 % 2;
                            int i166 = ~i162;
                            int i167 = ~((~i4) | i);
                            int i168 = (-948) * ((i167 & i166) | (i166 ^ i167));
                            int i169 = (i163 & i168) + (i163 | i168);
                            int i170 = ~i4;
                            int i171 = (i166 & i170) | (i166 ^ i170);
                            OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                            int i172 = ~i;
                            int i173 = (-948) * (~((i171 & i172) | (i171 ^ i172)));
                            int i174 = (i169 ^ i173) + ((i169 & i173) << 1);
                            int i175 = -(-((i162 | i170) * 948));
                            int i176 = (i174 ^ i175) + ((i175 & i174) << 1);
                            int i177 = i176 << 13;
                            int i178 = (i177 | i176) & (~(i176 & i177));
                            int i179 = OLrzqt;
                            int i180 = (i179 ^ 109) + ((i179 & 109) << 1);
                            EZpvd = i180 % 128;
                            if (i180 % 2 != 0) {
                                int i181 = i178 % 64;
                                int i182 = ((~i178) & i181) | ((~i181) & i178);
                                int i183 = i182 >>> 5;
                                ((int[]) objArr8[2])[1] = (i182 | i183) & (~(i182 & i183));
                                c2 = 0;
                            } else {
                                int i184 = i178 >>> 17;
                                int i185 = (i178 | i184) & (~(i178 & i184));
                                int i186 = i185 << 5;
                                int i187 = (i185 | i186) & (~(i185 & i186));
                                c2 = 0;
                                ((int[]) objArr8[2])[0] = i187;
                            }
                            objArr = objArr8;
                        }
                        java.lang.Object obj = objArr[c2];
                        int i188 = OLrzqt;
                        int i189 = ((i188 | 25) << 1) - (i188 ^ 25);
                        EZpvd = i189 % 128;
                        int[] iArr5 = (int[]) obj;
                        if (i189 % 2 == 0 ? i == iArr5[0] : i == iArr5[1]) {
                            try {
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                b(new int[]{-1923456823, -706174592, 421334868, -1121545850, -1040226064, -938970273, 938235925, 1094677671, -620704380, 355645287, -1634681708, -560535124, 1616729698, 502262093, 840014713, -1910507688, -1108896160, -303571516, 57713940, -306166456}, 40, objArr9);
                                file = new java.io.File((java.lang.String) objArr9[0]);
                            } catch (java.lang.Exception unused2) {
                            }
                            if (!(!file.canRead())) {
                                java.io.FileReader fileReader = new java.io.FileReader(file);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    line = bufferedReader.readLine();
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    b(new int[]{-1872856464, 650456068}, 3, objArr10);
                                    if (line.equals((java.lang.String) objArr10[0])) {
                                        fileReader.close();
                                        bufferedReader.close();
                                    } else {
                                        fileReader.close();
                                        bufferedReader.close();
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        b(new int[]{277963610, -1735022836, -1435118322, -1085917116, -2130092304, 1610201450, 847045953, -1572682347, -1252203437, -379974383, 1075674809, 1894630070, 425802409, 321061568, 165697755, 407470540}, 31, objArr11);
                                        java.io.File file2 = new java.io.File((java.lang.String) objArr11[0]);
                                        int i190 = OLrzqt;
                                        i9 = (i190 & 71) + (i190 | 71);
                                        EZpvd = i9 % 128;
                                        if (i9 % 2 != 0) {
                                            file2.canRead();
                                            java.lang.Object obj2 = null;
                                            obj2.hashCode();
                                            throw null;
                                        }
                                        if (!(!file2.canRead())) {
                                            fileReader = new java.io.FileReader(file2);
                                            bufferedReader = new java.io.BufferedReader(fileReader);
                                            try {
                                                java.lang.String line2 = bufferedReader.readLine();
                                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                                b(new int[]{105958743, -511281950}, 1, objArr12);
                                                boolean zEquals = line2.equals((java.lang.String) objArr12[0]);
                                                fileReader.close();
                                                bufferedReader.close();
                                                if (zEquals) {
                                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                                    b(new int[]{-1923456823, -706174592, 421334868, -1121545850, -1040226064, -938970273, 938235925, 1094677671, -620704380, 355645287, -1634681708, -560535124, -620704380, 355645287, -1634681708, -560535124, -1579182886, 1004652686}, 36, objArr13);
                                                    java.io.File file3 = new java.io.File((java.lang.String) objArr13[0]);
                                                    if (!file3.canRead()) {
                                                        int i191 = OLrzqt;
                                                        int i192 = (i191 & 35) + (i191 | 35);
                                                        EZpvd = i192 % 128;
                                                        int i193 = i192 % 2;
                                                    } else {
                                                        bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file3));
                                                        int i194 = EZpvd;
                                                        int i195 = (i194 ^ 5) + ((i194 & 5) << 1);
                                                        OLrzqt = i195 % 128;
                                                        int i196 = i195 % 2;
                                                        try {
                                                            java.lang.String line3 = bufferedReader.readLine();
                                                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                            b(new int[]{105958743, -511281950}, 1, objArr14);
                                                            boolean zEquals2 = line3.equals((java.lang.String) objArr14[0]);
                                                            int i197 = EZpvd + 91;
                                                            OLrzqt = i197 % 128;
                                                            int i198 = i197 % 2;
                                                            if (zEquals2 && line != null) {
                                                                int i199 = EZpvd + 105;
                                                                OLrzqt = i199 % 128;
                                                                int i200 = i199 % 2;
                                                                int[] iArr6 = new int[1];
                                                                objArr = new java.lang.Object[]{new int[]{(~(i & 20)) & (i | 20)}, line, iArr6, new int[]{i}};
                                                                int i201 = ~i;
                                                                int i203 = 2076917118 + (((~((-178397211) | i201)) | (~((-269228357) | i)) | (~(514784222 | i))) * 765) + (((~((-447625567) | i201)) | 178397210) * 1530) + (((~((-447625567) | i)) | (~(514784222 | i201))) * 765);
                                                                int i204 = (i203 & 16) + (i203 | 16);
                                                                int i205 = i204 * 465;
                                                                int i206 = i4 * (-463);
                                                                int i207 = (i205 & i206) + (i205 | i206);
                                                                int i208 = ~i4;
                                                                int i209 = ~i;
                                                                int i210 = (~((i209 & i208) | (i208 ^ i209))) | (~(i208 | i204));
                                                                int i211 = ~((i201 & i204) | (i201 ^ i204));
                                                                int i213 = ((i211 & i210) | (i210 ^ i211)) * 464;
                                                                int i214 = (i207 ^ i213) + ((i213 & i207) << 1);
                                                                int i215 = (~i204) | i;
                                                                int i216 = ((i215 & i208) | (i215 ^ i208)) * (-464);
                                                                int i217 = (i214 & i216) + (i216 | i214) + (((~(i208 | i204)) | (~((i & i204) | (i204 ^ i)))) * 464);
                                                                int i218 = i217 << 13;
                                                                int i219 = (i218 & (~i217)) | ((~i218) & i217);
                                                                int i220 = i219 ^ (i219 >>> 17);
                                                                int i221 = i220 << 5;
                                                                iArr6[0] = (i220 | i221) & (~(i220 & i221));
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        objArr = new java.lang.Object[]{new int[]{i}, null, new int[1], new int[]{i}};
                                        int i223 = ((((~(524805031 | i)) | (-984523495)) * 262) - 1205433107) + (((~(524805031 | (~i))) | (-984523495)) * 262);
                                        int iAEQbTJ4 = OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                                        int i224 = i223 * CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                        int i225 = -(-(i4 * CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256));
                                        int i226 = (i224 & i225) + (i224 | i225);
                                        int i227 = ~iAEQbTJ4;
                                        int i228 = ~i223;
                                        int i229 = ~((i228 ^ i4) | (i228 & i4));
                                        int i230 = ((i229 & i227) | (i227 ^ i229)) * (-192);
                                        int i231 = (i226 & i230) + (i226 | i230);
                                        int i233 = ~i223;
                                        int i234 = ~i4;
                                        int i235 = ~((i233 & i234) | (i233 ^ i234));
                                        int i236 = ~i4;
                                        int i237 = ~iAEQbTJ4;
                                        int i238 = ~((i236 ^ i237) | (i236 & i237));
                                        int i239 = ((i235 & i238) | (i235 ^ i238)) * (-384);
                                        int i240 = (i231 ^ i239) + ((i239 & i231) << 1);
                                        int i241 = i228 | i234;
                                        int i243 = ~((i241 & iAEQbTJ4) | (i241 ^ iAEQbTJ4));
                                        int i244 = OLrzqt;
                                        i6 = (i244 & 49) + (i244 | 49);
                                        EZpvd = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            int i245 = (~((i227 & i236) | (i236 ^ i227) | i223)) | i243;
                                            int i246 = i223 | i4;
                                            int i247 = ~((iAEQbTJ4 & i246) | (i246 ^ iAEQbTJ4));
                                            i7 = i240 / (192 / ((i247 & i245) | (i245 ^ i247)));
                                            i8 = i7 / 26;
                                        } else {
                                            int i248 = (~(i236 | i237 | i223)) | i243;
                                            int i249 = (i223 & i4) | (i223 ^ i4);
                                            int i250 = ~((iAEQbTJ4 & i249) | (i249 ^ iAEQbTJ4));
                                            i7 = i240 + (((i250 & i248) | (i248 ^ i250)) * 192);
                                            i8 = i7 << 13;
                                        }
                                        int i251 = (i8 & (~i7)) | ((~i8) & i7);
                                        int i253 = i251 >>> 17;
                                        int i254 = ((~i251) & i253) | ((~i253) & i251);
                                        int i255 = i254 << 5;
                                        ((int[]) objArr[2])[0] = (i254 | i255) & (~(i254 & i255));
                                        i3 = (i244 ^ 83) + ((i244 & 83) << 1);
                                    }
                                } finally {
                                }
                            } else {
                                i5 = EZpvd + 83;
                                OLrzqt = i5 % 128;
                                int i256 = i5 % 2;
                                line = null;
                                java.lang.Object[] objArr112 = new java.lang.Object[1];
                                b(new int[]{277963610, -1735022836, -1435118322, -1085917116, -2130092304, 1610201450, 847045953, -1572682347, -1252203437, -379974383, 1075674809, 1894630070, 425802409, 321061568, 165697755, 407470540}, 31, objArr112);
                                java.io.File file22 = new java.io.File((java.lang.String) objArr112[0]);
                                int i1902 = OLrzqt;
                                i9 = (i1902 & 71) + (i1902 | 71);
                                EZpvd = i9 % 128;
                                if (i9 % 2 != 0) {
                                }
                                objArr = new java.lang.Object[]{new int[]{i}, null, new int[1], new int[]{i}};
                                int i2232 = ((((~(524805031 | i)) | (-984523495)) * 262) - 1205433107) + (((~(524805031 | (~i))) | (-984523495)) * 262);
                                int iAEQbTJ42 = OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                                int i2242 = i2232 * CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                int i2252 = -(-(i4 * CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256));
                                int i2262 = (i2242 & i2252) + (i2242 | i2252);
                                int i2272 = ~iAEQbTJ42;
                                int i2282 = ~i2232;
                                int i2292 = ~((i2282 ^ i4) | (i2282 & i4));
                                int i2302 = ((i2292 & i2272) | (i2272 ^ i2292)) * (-192);
                                int i2312 = (i2262 & i2302) + (i2262 | i2302);
                                int i2332 = ~i2232;
                                int i2342 = ~i4;
                                int i2352 = ~((i2332 & i2342) | (i2332 ^ i2342));
                                int i2362 = ~i4;
                                int i2372 = ~iAEQbTJ42;
                                int i2382 = ~((i2362 ^ i2372) | (i2362 & i2372));
                                int i2392 = ((i2352 & i2382) | (i2352 ^ i2382)) * (-384);
                                int i2402 = (i2312 ^ i2392) + ((i2392 & i2312) << 1);
                                int i2412 = i2282 | i2342;
                                int i2432 = ~((i2412 & iAEQbTJ42) | (i2412 ^ iAEQbTJ42));
                                int i2442 = OLrzqt;
                                i6 = (i2442 & 49) + (i2442 | 49);
                                EZpvd = i6 % 128;
                                if (i6 % 2 != 0) {
                                }
                                int i2512 = (i8 & (~i7)) | ((~i8) & i7);
                                int i2532 = i2512 >>> 17;
                                int i2542 = ((~i2512) & i2532) | ((~i2532) & i2512);
                                int i2552 = i2542 << 5;
                                ((int[]) objArr[2])[0] = (i2542 | i2552) & (~(i2542 & i2552));
                                i3 = (i2442 ^ 83) + ((i2442 & 83) << 1);
                            }
                            i5 = EZpvd + 51;
                            OLrzqt = i5 % 128;
                            int i2562 = i5 % 2;
                            line = null;
                            java.lang.Object[] objArr1122 = new java.lang.Object[1];
                            b(new int[]{277963610, -1735022836, -1435118322, -1085917116, -2130092304, 1610201450, 847045953, -1572682347, -1252203437, -379974383, 1075674809, 1894630070, 425802409, 321061568, 165697755, 407470540}, 31, objArr1122);
                            java.io.File file222 = new java.io.File((java.lang.String) objArr1122[0]);
                            int i19022 = OLrzqt;
                            i9 = (i19022 & 71) + (i19022 | 71);
                            EZpvd = i9 % 128;
                            if (i9 % 2 != 0) {
                            }
                            objArr = new java.lang.Object[]{new int[]{i}, null, new int[1], new int[]{i}};
                            int i22322 = ((((~(524805031 | i)) | (-984523495)) * 262) - 1205433107) + (((~(524805031 | (~i))) | (-984523495)) * 262);
                            int iAEQbTJ422 = OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                            int i22422 = i22322 * CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                            int i22522 = -(-(i4 * CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256));
                            int i22622 = (i22422 & i22522) + (i22422 | i22522);
                            int i22722 = ~iAEQbTJ422;
                            int i22822 = ~i22322;
                            int i22922 = ~((i22822 ^ i4) | (i22822 & i4));
                            int i23022 = ((i22922 & i22722) | (i22722 ^ i22922)) * (-192);
                            int i23122 = (i22622 & i23022) + (i22622 | i23022);
                            int i23322 = ~i22322;
                            int i23422 = ~i4;
                            int i23522 = ~((i23322 & i23422) | (i23322 ^ i23422));
                            int i23622 = ~i4;
                            int i23722 = ~iAEQbTJ422;
                            int i23822 = ~((i23622 ^ i23722) | (i23622 & i23722));
                            int i23922 = ((i23522 & i23822) | (i23522 ^ i23822)) * (-384);
                            int i24022 = (i23122 ^ i23922) + ((i23922 & i23122) << 1);
                            int i24122 = i22822 | i23422;
                            int i24322 = ~((i24122 & iAEQbTJ422) | (i24122 ^ iAEQbTJ422));
                            int i24422 = OLrzqt;
                            i6 = (i24422 & 49) + (i24422 | 49);
                            EZpvd = i6 % 128;
                            if (i6 % 2 != 0) {
                            }
                            int i25122 = (i8 & (~i7)) | ((~i8) & i7);
                            int i25322 = i25122 >>> 17;
                            int i25422 = ((~i25122) & i25322) | ((~i25322) & i25122);
                            int i25522 = i25422 << 5;
                            ((int[]) objArr[2])[0] = (i25422 | i25522) & (~(i25422 & i25522));
                            i3 = (i24422 ^ 83) + ((i24422 & 83) << 1);
                        }
                        OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                        return objArr;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                i3 = ((i129 | 109) << 1) - (i129 ^ 109);
                EZpvd = i3 % 128;
                int i257 = i3 % 2;
                OrdersPagerFragment$special$$inlined$viewModels$default$2.AEQbTJ();
                return objArr;
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC21108gtY activityC21108gtY, ExchangeSelectNetworkBean exchangeSelectNetworkBean, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC21108gtY.EZpvd(exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final ActivityC21108gtY activityC21108gtY, final ExchangeSelectNetworkBean exchangeSelectNetworkBean, int i, final AbstractC12782ctV abstractC12782ctV) {
        java.lang.Long realChainId;
        java.lang.Long realChainId2;
        if (i == 0) {
            activityC21108gtY.dismissLoading();
        } else if (i == 1) {
            final C10854bwM c10854bwMCopydefault = (exchangeSelectNetworkBean == null || (realChainId = exchangeSelectNetworkBean.getRealChainId()) == null) ? null : C10954byG.EZpvd.valueOf().copydefault(realChainId.longValue());
            if (c10854bwMCopydefault != null && c10854bwMCopydefault.dxcTrN() && abstractC12782ctV != null && abstractC12782ctV.DGOPHZ()) {
                activityC21108gtY.dismissLoading();
                C21241gvz c21241gvz = C21241gvz.EZpvd;
                androidx.fragment.app.FragmentManager supportFragmentManager = activityC21108gtY.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                java.lang.String str = activityC21108gtY.AYXKKw;
                long jAEQbTJ = c10854bwMCopydefault.AEQbTJ();
                java.lang.Long coinId = exchangeSelectNetworkBean.getCoinId();
                c21241gvz.KWHzl(supportFragmentManager, str, jAEQbTJ, coinId != null ? coinId.longValue() : -1L, "", false, true, activityC21108gtY.getTAG(), true, new Function1() { // from class: o.guu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC21108gtY.AEQbTJ(this.AEQbTJ, exchangeSelectNetworkBean, abstractC12782ctV, c10854bwMCopydefault, (java.lang.String) obj);
                    }
                });
            } else {
                goToWithdrawalDetailPage$default(activityC21108gtY, exchangeSelectNetworkBean, abstractC12782ctV, c10854bwMCopydefault, null, 8, null);
            }
        } else if (i == 2) {
            activityC21108gtY.dismissLoading();
            if (exchangeSelectNetworkBean != null && (realChainId2 = exchangeSelectNetworkBean.getRealChainId()) != null) {
                C9930beq.Companion.KWHzl(realChainId2.longValue()).show(activityC21108gtY.getSupportFragmentManager(), activityC21108gtY.getTAG());
            }
        }
        C14494dmX.KWHzl.EZpvd("WithdrawExchangeSelectExchangeNetwork_Btm_Button_Click", "select_network");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void goToWithdrawalDetailPage$default(ActivityC21108gtY activityC21108gtY, ExchangeSelectNetworkBean exchangeSelectNetworkBean, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        activityC21108gtY.EZpvd(exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void EZpvd(final ExchangeSelectNetworkBean exchangeSelectNetworkBean, final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final java.lang.String str) {
        java.lang.Long coinId;
        fPV fpv = fPV.OLrzqt;
        long jLongValue = (exchangeSelectNetworkBean == null || (coinId = exchangeSelectNetworkBean.getCoinId()) == null) ? -1L : coinId.longValue();
        if (abstractC12782ctV == null) {
            return;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = fpv.OLrzqt(jLongValue, abstractC12782ctV);
        final Function1 function1 = new Function1() { // from class: o.gud
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21108gtY.EZpvd(this.AEQbTJ, exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.guc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21108gtY.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.guh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21108gtY.KWHzl(this.KWHzl, exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.guk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21108gtY.AhwBna(function12, obj);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC21108gtY activityC21108gtY, ExchangeSelectNetworkBean exchangeSelectNetworkBean, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str, kotlin.Pair pair) {
        activityC21108gtY.dismissLoading();
        activityC21108gtY.AEQbTJ(exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC21108gtY activityC21108gtY, ExchangeSelectNetworkBean exchangeSelectNetworkBean, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str, java.lang.Throwable th) {
        activityC21108gtY.dismissLoading();
        activityC21108gtY.AEQbTJ(exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void generateGoToWithdrawalDetailPage$default(ActivityC21108gtY activityC21108gtY, ExchangeSelectNetworkBean exchangeSelectNetworkBean, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        activityC21108gtY.AEQbTJ(exchangeSelectNetworkBean, abstractC12782ctV, c10854bwM, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(ExchangeSelectNetworkBean exchangeSelectNetworkBean, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.lang.String str) {
        java.lang.String address;
        java.lang.Long realChainId;
        java.lang.Long coinId;
        long jLongValue = -1;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            address = str == null ? "" : str;
        } else if (abstractC12782ctV != null) {
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, (exchangeSelectNetworkBean == null || (realChainId = exchangeSelectNetworkBean.getRealChainId()) == null) ? -1L : realChainId.longValue(), null, 2, null);
            if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
            }
        }
        int i = this.KWHzl;
        java.lang.Integer subCurrencyId = exchangeSelectNetworkBean != null ? exchangeSelectNetworkBean.getSubCurrencyId() : null;
        java.lang.String strKWHzl = c10854bwM != null ? c10854bwM.KWHzl(address) : null;
        java.lang.String strAYXKKw = abstractC12782ctV != null ? abstractC12782ctV.AYXKKw() : null;
        java.lang.String str2 = this.AYXKKw;
        if (exchangeSelectNetworkBean != null && (coinId = exchangeSelectNetworkBean.getCoinId()) != null) {
            jLongValue = coinId.longValue();
        }
        AEQbTJ().KWHzl(this.valueOf, new WithdrawFromExchangeBean(java.lang.Integer.valueOf(i), subCurrencyId, strKWHzl, strAYXKKw, str2, java.lang.Long.valueOf(jLongValue), abstractC12782ctV != null ? abstractC12782ctV.AEQbTJ() : null), true);
    }

    private final void AYXKKw() {
        AbstractC16428ejj abstractC16428ejj = this.EZpvd;
        if (abstractC16428ejj == null) {
            Intrinsics.gEmmrt("");
            abstractC16428ejj = null;
        }
        abstractC16428ejj.copydefault.post(new java.lang.Runnable() { // from class: o.guo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC21108gtY.valueOf(this.copydefault);
            }
        });
    }

    public static final void valueOf(final ActivityC21108gtY activityC21108gtY) {
        android.view.View viewFindViewByPosition;
        AbstractC16428ejj abstractC16428ejj = activityC21108gtY.EZpvd;
        if (abstractC16428ejj == null) {
            Intrinsics.gEmmrt("");
            abstractC16428ejj = null;
        }
        RecyclerView.LayoutManager layoutManager = abstractC16428ejj.copydefault.getLayoutManager();
        if (layoutManager == null || (viewFindViewByPosition = layoutManager.findViewByPosition(0)) == null) {
            return;
        }
        java.lang.String string = activityC21108gtY.getString(C13754dXa.FragmentManager.QKDJJA);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = activityC21108gtY.getString(C13754dXa.FragmentManager.getPercentRating);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        C21022grs.EZpvd(activityC21108gtY, viewFindViewByPosition, string, string2, 2, 3, (1536 & 64) != 0 ? 0 : 12, (1536 & 128) != 0 ? 0 : 0, (1536 & 256) != 0 ? 0 : 0, (1536 & 512) != 0 ? 0 : 0, (1536 & 1024) != 0 ? 0 : 0, new Function0() { // from class: o.gul
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC21108gtY.AYXKKw(this.AEQbTJ));
            }
        }, new Function0() { // from class: o.gup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC21108gtY.gEmmrt(this.copydefault));
            }
        });
        activityC21108gtY.OLrzqt = false;
    }

    public static final boolean AYXKKw(ActivityC21108gtY activityC21108gtY) {
        if (C43453rpa.AEQbTJ.KWHzl(activityC21108gtY)) {
            ExchangeSelectNetworkBean exchangeSelectNetworkBean = (ExchangeSelectNetworkBean) activityC21108gtY.AEQbTJ.AEQbTJ(0);
            InterfaceC8223ayg interfaceC8223ayg = activityC21108gtY.djBIcL;
            int i = activityC21108gtY.KWHzl;
            java.lang.Integer subCurrencyId = exchangeSelectNetworkBean.getSubCurrencyId();
            Intrinsics.copydefault(subCurrencyId);
            interfaceC8223ayg.KWHzl(new GoToWithdrawFromWalletResultContractArgs.Tutorial(i, subCurrencyId.intValue(), "0x7a21xxxxxxxxxxE13d", "Wallet B - Account 01"));
            return true;
        }
        activityC21108gtY.KWHzl();
        return true;
    }

    public static final boolean gEmmrt(ActivityC21108gtY activityC21108gtY) {
        activityC21108gtY.KWHzl();
        return true;
    }

    public final void KWHzl() {
        if (dZP.OLrzqt.valueOf()) {
            DbNXlk();
            return;
        }
        ActivityResultLauncher<android.content.Context> activityResultLauncher = this.AhwBna;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(this);
        }
    }

    private final void DbNXlk() {
        startActivity(ActivityC21086gtC.StateListAnimator.newInstance$default(ActivityC21086gtC.Companion, this, this.AYXKKw, false, false, 12, null));
        copydefault();
    }

    public final void copydefault() {
        setResult(-1);
        finish();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.copydefault);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
