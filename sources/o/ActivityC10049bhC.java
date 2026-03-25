package o;

import android.media.AudioAttributes;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.assets.detail.DefiWalletTxDetailActivity$dealFloatView$4$1$2;
import com.okinc.business.defi.assets.detail.DefiWalletTxDetailActivity$dealFloatView$5$1$2;
import com.okinc.business.defi.assets.detail.DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.web.WebActivity;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC10168bjP;
import o.ActivityC10049bhC;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC10049bhC extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ;
    public boolean AYXKKw;
    public java.lang.String AkhnZx;
    public TxIdOrHashHistoryDetail AuCTel;
    public boolean DbNXlk;
    public AbstractC16298ehL KWHzl;
    public long OLrzqt;
    public C10854bwM copydefault;
    public java.lang.String ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fIwbmz;
    public java.lang.String fetchVPNInfo;
    public final InterfaceC56387yDm getNewProxyInstance;
    public java.lang.String iwGUEr;
    public java.lang.String uzCIH;
    public final Application djBIcL = new Application(toString(), new xZA(0, 300, null, 4, null));
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.bhJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC10049bhC.values(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.bhU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC10049bhC.AkhnZx(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.bib
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC10049bhC.fetchVPNInfo(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bin
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC10049bhC.AEQbTJ();
        }
    });
    public final LoaderManager fJNWhG = new LoaderManager();
    public final PendingIntent AhwBna = new PendingIntent();

    /* JADX INFO: renamed from: o.bhC$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.bhC$TaskDescription */
    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.ejfBZ;
    }

    public ActivityC10049bhC() {
        final Function0 function0 = null;
        this.getNewProxyInstance = new ViewModelLazy(C56524yIo.AEQbTJ(C10148biw.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.detail.DefiWalletTxDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.detail.DefiWalletTxDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.detail.DefiWalletTxDetailActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.bhC$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bhC.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, long j, @NotNull java.lang.String str7, boolean z, @NotNull java.lang.String str8) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC10049bhC.class);
            intent.putExtra("tx_id", str);
            intent.putExtra("tx_hash", str2);
            intent.putExtra("tx_uop_hash", str3);
            intent.putExtra("tx_address", str4);
            intent.putExtra("wallet_id", str5);
            intent.putExtra(OtcExtraKeys.ORDER_ID, str6);
            intent.putExtra(OtcExtraKeys.CRYPTO_ORDER_TYPE, str7);
            intent.putExtra("coin", j);
            intent.putExtra("result", z);
            intent.putExtra("url", str8);
            context.startActivity(intent);
        }
    }

    private final void ejfBZ() {
        java.lang.String stringExtra = getIntent().getStringExtra("tx_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.ejfBZ = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("tx_hash");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.fARcdN = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("tx_uop_hash");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.fIwbmz = stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("tx_address");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.AEQbTJ = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("wallet_id");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        this.iwGUEr = stringExtra5;
        java.lang.String stringExtra6 = getIntent().getStringExtra(OtcExtraKeys.ORDER_ID);
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        this.AkhnZx = stringExtra6;
        java.lang.String stringExtra7 = getIntent().getStringExtra(OtcExtraKeys.CRYPTO_ORDER_TYPE);
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        this.fetchVPNInfo = stringExtra7;
        this.OLrzqt = getIntent().getLongExtra("coin", 0L);
        this.DbNXlk = getIntent().getBooleanExtra("result", false);
        java.lang.String stringExtra8 = getIntent().getStringExtra("url");
        this.uzCIH = stringExtra8 != null ? stringExtra8 : "";
    }

    /* JADX INFO: renamed from: o.bhC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ AbstractC10170bjR AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC10049bhC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AbstractC10170bjR abstractC10170bjR, ActivityC10049bhC activityC10049bhC) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = abstractC10170bjR;
            this.copydefault = activityC10049bhC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.copydefault, BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.AEQbTJ.fJNWhG().getExplorerUrl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt(OtcExtraKeys.FLAG, java.lang.Boolean.TRUE), C56390yDp.OLrzqt("set_token", java.lang.Boolean.FALSE)), null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.bhC$Application */
    public static final class Application extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public Application(java.lang.String str, xZA xza) {
            super(str, xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            java.lang.Object obj;
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            ActivityC10049bhC activityC10049bhC = ActivityC10049bhC.this;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                WalletTxHistorySubManager.SubResponse subResponse = (WalletTxHistorySubManager.SubResponse) next;
                if (Intrinsics.EZpvd((java.lang.Object) subResponse.getOrderId(), (java.lang.Object) activityC10049bhC.AhwBna())) {
                    break;
                }
                java.lang.String orderId = subResponse.getOrderId();
                TxIdOrHashHistoryDetail value = activityC10049bhC.AkhnZx().AEQbTJ().getValue();
                if (Intrinsics.EZpvd((java.lang.Object) orderId, (java.lang.Object) (value != null ? value.getOrderId() : null))) {
                    break;
                }
            }
            if (((WalletTxHistorySubManager.SubResponse) next) != null) {
                ActivityC10049bhC.this.fetchVPNInfo();
                return;
            }
            ActivityC10049bhC activityC10049bhC2 = ActivityC10049bhC.this;
            for (java.lang.Object obj2 : list) {
                WalletTxHistorySubManager.SubResponse subResponse2 = (WalletTxHistorySubManager.SubResponse) obj2;
                if (!Intrinsics.EZpvd((java.lang.Object) subResponse2.getTxId(), (java.lang.Object) activityC10049bhC2.gEmmrt())) {
                    java.lang.String txId = subResponse2.getTxId();
                    TxIdOrHashHistoryDetail value2 = activityC10049bhC2.AkhnZx().AEQbTJ().getValue();
                    if (!Intrinsics.EZpvd((java.lang.Object) txId, (java.lang.Object) (value2 != null ? value2.getTxId() : null))) {
                        TxIdOrHashHistoryDetail value3 = activityC10049bhC2.AkhnZx().AEQbTJ().getValue();
                        if ((value3 != null ? value3.getOrderTxIdList() : null) != null) {
                            TxIdOrHashHistoryDetail value4 = activityC10049bhC2.AkhnZx().AEQbTJ().getValue();
                            java.util.List<java.lang.String> orderTxIdList = value4 != null ? value4.getOrderTxIdList() : null;
                            Intrinsics.copydefault(orderTxIdList);
                            if (orderTxIdList.contains(subResponse2.getTxId())) {
                            }
                        }
                    }
                }
                obj = obj2;
            }
            if (((WalletTxHistorySubManager.SubResponse) obj) != null) {
                ActivityC10049bhC.this.fetchVPNInfo();
            }
        }
    }

    public final C10148biw AkhnZx() {
        return (C10148biw) this.getNewProxyInstance.getValue();
    }

    private final C59534zip fIwbmz() {
        return (C59534zip) this.gEmmrt.getValue();
    }

    public static final C59534zip values(ActivityC10049bhC activityC10049bhC) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(BaseItem.Dialog.class, new C10158bjF());
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c59534zip.register(BaseItem.Application.class, new C10192bjn(supportFragmentManager, activityC10049bhC.OLrzqt, activityC10049bhC.AuCTel));
        c59534zip.register(BaseItem.FragmentManager.class, new C10155bjC(activityC10049bhC.AuCTel));
        c59534zip.register(BaseItem.TaskDescription.class, new C10195bjq(activityC10049bhC.AuCTel, activityC10049bhC.copydefault));
        c59534zip.register(BaseItem.ActionBar.class, new C10187bji());
        return c59534zip;
    }

    public final C59534zip djBIcL() {
        return (C59534zip) this.values.getValue();
    }

    public static final C59534zip AkhnZx(final ActivityC10049bhC activityC10049bhC) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AbstractC10168bjP.TaskDescription.class, new C10201bjw(new Function2() { // from class: o.bhR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC10049bhC.OLrzqt(this.KWHzl, ((java.lang.Long) obj).longValue(), (android.view.View) obj2);
            }
        }));
        c59534zip.register(AbstractC10168bjP.StateListAnimator.class, new C10163bjK());
        c59534zip.register(AbstractC10168bjP.Application.class, new C10193bjo(activityC10049bhC.OLrzqt));
        c59534zip.register(AbstractC10168bjP.Activity.class, new C10157bjE());
        c59534zip.register(AbstractC10168bjP.ActionBar.class, new C10204bjz());
        c59534zip.register(AbstractC10168bjP.LoaderManager.class, new C10164bjL());
        return c59534zip;
    }

    public static final Unit OLrzqt(final ActivityC10049bhC activityC10049bhC, long j, final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        activityC10049bhC.getFieldNames();
        activityC10049bhC.AkhnZx().EZpvd(java.lang.Long.valueOf(j), new Function1() { // from class: o.bhQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.copydefault(this.OLrzqt, view, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC10049bhC activityC10049bhC, android.view.View view, boolean z) {
        activityC10049bhC.values();
        if (z) {
            view.setVisibility(8);
            activityC10049bhC.EZpvd((android.content.Context) activityC10049bhC, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setTitle));
        } else {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public final C59534zip valueOf() {
        return (C59534zip) this.isConnected.getValue();
    }

    public static final C59534zip fetchVPNInfo(final ActivityC10049bhC activityC10049bhC) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AbstractC10168bjP.StateListAnimator.class, new C10163bjK());
        c59534zip.register(AbstractC10168bjP.TaskDescription.class, new C10201bjw(new Function2() { // from class: o.bhL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC10049bhC.KWHzl(this.KWHzl, ((java.lang.Long) obj).longValue(), (android.view.View) obj2);
            }
        }));
        c59534zip.register(AbstractC10168bjP.Application.class, new C10193bjo(activityC10049bhC.OLrzqt));
        c59534zip.register(AbstractC10168bjP.Activity.class, new C10157bjE());
        c59534zip.register(AbstractC10168bjP.ActionBar.class, new C10204bjz());
        c59534zip.register(AbstractC10168bjP.LoaderManager.class, new C10164bjL());
        return c59534zip;
    }

    public static final Unit KWHzl(final ActivityC10049bhC activityC10049bhC, long j, final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        activityC10049bhC.getFieldNames();
        activityC10049bhC.AkhnZx().EZpvd(java.lang.Long.valueOf(j), new Function1() { // from class: o.bhO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.KWHzl(this.KWHzl, view, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC10049bhC activityC10049bhC, android.view.View view, boolean z) {
        activityC10049bhC.values();
        if (z) {
            view.setVisibility(8);
            activityC10049bhC.EZpvd((android.content.Context) activityC10049bhC, C33070mpX.AYXKKw(C13754dXa.FragmentManager.setTitle));
        } else {
            view.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public final C59534zip copydefault() {
        return (C59534zip) this.valueOf.getValue();
    }

    public static final C59534zip AEQbTJ() {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AbstractC10168bjP.TaskDescription.class, new C10199bju());
        return c59534zip;
    }

    /* JADX INFO: renamed from: o.bhC$LoaderManager */
    public static final class LoaderManager extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.bhC$PendingIntent */
    public static final class PendingIntent extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            if (recyclerView.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null));
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16298ehL) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QbewEr);
        C32866mlf.onEvent$default("Web3WalletHomepage_History_Details_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        ejfBZ();
        this.AYXKKw = C10598brV.AEQbTJ.OLrzqt(this.OLrzqt) != null;
        AuCTel();
        uzCIH();
        isConnected();
        getFieldNames();
        if (!this.AYXKKw) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.OLrzqt);
            this.OLrzqt = c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : this.OLrzqt;
        }
        fetchVPNInfo();
    }

    public final void DbNXlk() {
        C14320djI c14320djI = C14320djI.OLrzqt;
        java.lang.String str = this.uzCIH;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = this.fARcdN;
        c14320djI.KWHzl(this, str, str2 != null ? str2 : "", BundleKt.bundleOf(C56390yDp.OLrzqt("TRANSITION_ANIM", new int[]{0, C52761wXj.Application.AuCTel})));
        finish();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        RxBus.AEQbTJ(new xXK());
    }

    private final void AuCTel() {
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.bhN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC10049bhC.djBIcL(this.OLrzqt, view);
            }
        });
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL3 = null;
        }
        abstractC16298ehL3.AxsJAY.OLrzqt(new InterfaceC57903yrG() { // from class: o.bhS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC10049bhC.AEQbTJ(this.EZpvd, interfaceC57934yrl);
            }
        });
        if (this.DbNXlk) {
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.AhwBna.setVisibility(8);
        }
        AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
        if (abstractC16298ehL5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL5;
        }
        abstractC16298ehL2.zsXlph.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    public static final void djBIcL(ActivityC10049bhC activityC10049bhC, android.view.View view) {
        activityC10049bhC.onBackPressed();
    }

    public static final void AEQbTJ(ActivityC10049bhC activityC10049bhC, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC10049bhC.fetchVPNInfo();
    }

    public final void fetchVPNInfo() {
        if (this.AYXKKw) {
            C10148biw c10148biwAkhnZx = AkhnZx();
            java.lang.String str = this.ejfBZ;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.iwGUEr;
            c10148biwAkhnZx.AEQbTJ(str, str2 != null ? str2 : "");
            return;
        }
        C10148biw c10148biwAkhnZx2 = AkhnZx();
        java.lang.String str3 = this.iwGUEr;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = this.fetchVPNInfo;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = this.AkhnZx;
        java.lang.String str8 = str7 == null ? "" : str7;
        long j = this.OLrzqt;
        java.lang.String str9 = this.AEQbTJ;
        c10148biwAkhnZx2.KWHzl(str4, str6, str8, j, str9 == null ? "" : str9, this.ejfBZ, this.fARcdN, this.fIwbmz);
    }

    public final void EZpvd() {
        C10854bwM c10854bwM = this.copydefault;
        if (c10854bwM == null || !c10854bwM.dxcTrN()) {
            return;
        }
        C10148biw c10148biwAkhnZx = AkhnZx();
        java.lang.String str = this.iwGUEr;
        C10854bwM c10854bwM2 = this.copydefault;
        c10148biwAkhnZx.EZpvd(str, c10854bwM2 != null ? java.lang.Long.valueOf(c10854bwM2.fetchVPNInfo()) : null);
    }

    private final void uzCIH() {
        if (this.AYXKKw) {
            return;
        }
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.djBIcL);
    }

    private final void iwGUEr() {
        if (this.AYXKKw) {
            return;
        }
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.djBIcL);
    }

    public final void isConnected() {
        AkhnZx().AEQbTJ().observe(this, new Dialog(new Function1() { // from class: o.bie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.KWHzl(this.EZpvd, (TxIdOrHashHistoryDetail) obj);
            }
        }));
        AkhnZx().KWHzl().observe(this, new Dialog(new Function1() { // from class: o.bif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.copydefault(this.EZpvd, (C10185bjg) obj);
            }
        }));
    }

    public static final Unit KWHzl(ActivityC10049bhC activityC10049bhC, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        if (txIdOrHashHistoryDetail == null) {
            return Unit.INSTANCE;
        }
        activityC10049bhC.values();
        if (txIdOrHashHistoryDetail.getTxStatus() == 1) {
            activityC10049bhC.AkhnZx().KWHzl(activityC10049bhC.getTAG(), activityC10049bhC.iwGUEr, activityC10049bhC.OLrzqt, activityC10049bhC.ejfBZ, activityC10049bhC.AEQbTJ);
        }
        activityC10049bhC.AuCTel = txIdOrHashHistoryDetail;
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        TxIdOrHashHistoryDetail txIdOrHashHistoryDetail2 = activityC10049bhC.AuCTel;
        activityC10049bhC.copydefault = c10948byAValueOf.KWHzl(txIdOrHashHistoryDetail2 != null ? txIdOrHashHistoryDetail2.getMainCoinId() : activityC10049bhC.OLrzqt);
        AbstractC16298ehL abstractC16298ehL = activityC10049bhC.KWHzl;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.AxsJAY.AEQbTJ();
        activityC10049bhC.EZpvd();
        activityC10049bhC.copydefault(txIdOrHashHistoryDetail);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC10049bhC, true, (java.lang.String) null, 2, (java.lang.Object) null);
        C10854bwM c10854bwM = activityC10049bhC.copydefault;
        if (c10854bwM != null && c10854bwM.iRxXKY()) {
            activityC10049bhC.AEQbTJ(txIdOrHashHistoryDetail.isShowSpeedUp());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final ActivityC10049bhC activityC10049bhC, C10185bjg c10185bjg) {
        java.lang.Integer numCopydefault;
        if (c10185bjg == null) {
            return Unit.INSTANCE;
        }
        activityC10049bhC.values();
        AbstractC16298ehL abstractC16298ehL = activityC10049bhC.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.AxsJAY.AEQbTJ();
        if (activityC10049bhC.DbNXlk && c10185bjg.copydefault() != null && ((numCopydefault = c10185bjg.copydefault()) == null || numCopydefault.intValue() != 0)) {
            activityC10049bhC.DbNXlk();
        } else {
            C55326xho.toast$default(c10185bjg.EZpvd(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            if (activityC10049bhC.AkhnZx().AEQbTJ().getValue() != null) {
                return Unit.INSTANCE;
            }
            AbstractC16298ehL abstractC16298ehL3 = activityC10049bhC.KWHzl;
            if (abstractC16298ehL3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL3 = null;
            }
            abstractC16298ehL3.gEmmrt.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL4 = activityC10049bhC.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL2 = abstractC16298ehL4;
            }
            android.widget.FrameLayout frameLayout = abstractC16298ehL2.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            C6980aZc.KWHzl(activityC10049bhC, frameLayout, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX), C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk), C52761wXj.TaskDescription.getSerial, new Function0() { // from class: o.bhZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC10049bhC.DbNXlk(this.copydefault);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ActivityC10049bhC activityC10049bhC) {
        AbstractC16298ehL abstractC16298ehL = activityC10049bhC.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.gEmmrt.setVisibility(8);
        AbstractC16298ehL abstractC16298ehL3 = activityC10049bhC.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL3;
        }
        android.widget.FrameLayout frameLayout = abstractC16298ehL2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C6980aZc.OLrzqt(activityC10049bhC, frameLayout);
        activityC10049bhC.getFieldNames();
        activityC10049bhC.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        iwGUEr();
    }

    public final void copydefault(TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.AxsJAY.setVisibility(0);
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL3 = null;
        }
        abstractC16298ehL3.gEmmrt.setVisibility(8);
        AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
        if (abstractC16298ehL4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL4 = null;
        }
        android.widget.FrameLayout frameLayout = abstractC16298ehL4.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        C6980aZc.OLrzqt(this, frameLayout);
        if (this.DbNXlk) {
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL5 = null;
            }
            abstractC16298ehL5.AhwBna.setVisibility(0);
        }
        AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
        if (abstractC16298ehL6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL6;
        }
        abstractC16298ehL2.wlaJM.setVisibility(0);
        AbstractC10170bjR abstractC10170bjRKWHzl = C10166bjN.Companion.KWHzl(this, txIdOrHashHistoryDetail);
        OLrzqt(abstractC10170bjRKWHzl);
        AhwBna(abstractC10170bjRKWHzl);
        valueOf(abstractC10170bjRKWHzl);
        AYXKKw(abstractC10170bjRKWHzl);
        KWHzl(abstractC10170bjRKWHzl);
        copydefault(abstractC10170bjRKWHzl);
        AEQbTJ(abstractC10170bjRKWHzl);
        EZpvd(abstractC10170bjRKWHzl);
    }

    public final void EZpvd(AbstractC10170bjR abstractC10170bjR) {
        if (this.AYXKKw) {
            AbstractC16298ehL abstractC16298ehL = this.KWHzl;
            AbstractC16298ehL abstractC16298ehL2 = null;
            if (abstractC16298ehL == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL = null;
            }
            android.view.View root = abstractC16298ehL.isConnected.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(0);
            java.lang.String strEZpvd = abstractC10170bjR.EZpvd();
            xYW xyw = xYW.AEQbTJ;
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            java.lang.String strAYXKKw = xyw.AYXKKw(strEZpvd);
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
                if (abstractC16298ehL3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL2 = abstractC16298ehL3;
                }
                abstractC16298ehL2.isConnected.getRoot().setVisibility(8);
                return;
            }
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.isConnected.KWHzl.setText(strAYXKKw);
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL5 = null;
            }
            abstractC16298ehL5.isConnected.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.bhY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10049bhC.AEQbTJ(this.AEQbTJ, view);
                }
            });
            AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
            if (abstractC16298ehL6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL2 = abstractC16298ehL6;
            }
            abstractC16298ehL2.isConnected.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.bia
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10049bhC.KWHzl(this.KWHzl, view);
                }
            });
        }
    }

    public static final void AEQbTJ(ActivityC10049bhC activityC10049bhC, android.view.View view) {
        AbstractC16298ehL abstractC16298ehL = activityC10049bhC.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        if (abstractC16298ehL.isConnected.KWHzl.getVisibility() == 0) {
            AbstractC16298ehL abstractC16298ehL3 = activityC10049bhC.KWHzl;
            if (abstractC16298ehL3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL3 = null;
            }
            abstractC16298ehL3.isConnected.copydefault.setRotation(0.0f);
            AbstractC16298ehL abstractC16298ehL4 = activityC10049bhC.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL2 = abstractC16298ehL4;
            }
            abstractC16298ehL2.isConnected.KWHzl.setVisibility(8);
            return;
        }
        AbstractC16298ehL abstractC16298ehL5 = activityC10049bhC.KWHzl;
        if (abstractC16298ehL5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL5 = null;
        }
        abstractC16298ehL5.isConnected.copydefault.setRotation(180.0f);
        AbstractC16298ehL abstractC16298ehL6 = activityC10049bhC.KWHzl;
        if (abstractC16298ehL6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL6;
        }
        abstractC16298ehL2.isConnected.KWHzl.setVisibility(0);
    }

    public static final void KWHzl(ActivityC10049bhC activityC10049bhC, android.view.View view) {
        java.lang.Object systemService = activityC10049bhC.getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) systemService;
        AbstractC16298ehL abstractC16298ehL = activityC10049bhC.KWHzl;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, abstractC16298ehL.isConnected.KWHzl.getText()));
        java.lang.String string = activityC10049bhC.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
    }

    public final void OLrzqt(AbstractC10170bjR abstractC10170bjR) {
        if (abstractC10170bjR.fIwbmz() instanceof BaseItem.StatusItem) {
            BaseItem baseItemFIwbmz = abstractC10170bjR.fIwbmz();
            Intrinsics.copydefault(baseItemFIwbmz, "");
            AEQbTJ((BaseItem.StatusItem) baseItemFIwbmz);
        }
    }

    public final void AhwBna(AbstractC10170bjR abstractC10170bjR) {
        android.graphics.drawable.Drawable drawable;
        java.lang.String strAYXKKw;
        java.lang.String strEjfBZ = abstractC10170bjR.ejfBZ();
        AbstractC16298ehL abstractC16298ehL = null;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strEjfBZ)) {
            AbstractC16298ehL abstractC16298ehL2 = this.KWHzl;
            if (abstractC16298ehL2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL = abstractC16298ehL2;
            }
            abstractC16298ehL.AubY.setVisibility(8);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strEjfBZ, (java.lang.Object) "phishing")) {
            drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.zFZsbn);
        } else {
            drawable = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.ZpNRhN);
        }
        if (drawable != null) {
            DrawableCompat.setTint(drawable, ContextCompat.getColor(this, C52761wXj.Activity.zblBkD));
        } else {
            drawable = null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strEjfBZ, (java.lang.Object) "phishing")) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ResultReceiverMyRunnable);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.viewModelsdefault);
        }
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL = abstractC16298ehL3;
        }
        OKAlertBanner oKAlertBanner = abstractC16298ehL.AubY;
        oKAlertBanner.setVisibility(0);
        oKAlertBanner.setLeadingIcon(drawable);
        oKAlertBanner.setMessage(strAYXKKw);
        Intrinsics.copydefault(oKAlertBanner);
    }

    public final void valueOf(AbstractC10170bjR abstractC10170bjR) {
        java.lang.String strOLrzqt = abstractC10170bjR.OLrzqt();
        java.lang.String strAhwBna = abstractC10170bjR.AhwBna();
        AbstractC16298ehL abstractC16298ehL = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            AbstractC16298ehL abstractC16298ehL2 = this.KWHzl;
            if (abstractC16298ehL2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL = abstractC16298ehL2;
            }
            OKAlertBanner oKAlertBanner = abstractC16298ehL.AuCTelauCTel;
            oKAlertBanner.setVisibility(0);
            oKAlertBanner.setMessage(strOLrzqt);
            Intrinsics.copydefault(oKAlertBanner);
            return;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAhwBna)) {
            AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
            if (abstractC16298ehL3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL = abstractC16298ehL3;
            }
            abstractC16298ehL.AuCTelauCTel.setVisibility(8);
            return;
        }
        AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
        if (abstractC16298ehL4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL = abstractC16298ehL4;
        }
        OKAlertBanner oKAlertBanner2 = abstractC16298ehL.AuCTelauCTel;
        oKAlertBanner2.setVisibility(0);
        oKAlertBanner2.setMessage(strAhwBna);
        Intrinsics.copydefault(oKAlertBanner2);
    }

    public final void AYXKKw(AbstractC10170bjR abstractC10170bjR) {
        java.util.List<AbstractC10168bjP> listAYXKKw = abstractC10170bjR.AYXKKw();
        java.util.List<AbstractC10168bjP> listDbNXlk = abstractC10170bjR.DbNXlk();
        java.util.List<AbstractC10168bjP> listKWHzl = abstractC10170bjR.KWHzl();
        int size = listKWHzl.size();
        int iGEmmrt = abstractC10170bjR.gEmmrt();
        int iIsConnected = abstractC10170bjR.isConnected();
        AbstractC16298ehL abstractC16298ehL = null;
        if (listAYXKKw.isEmpty() && listDbNXlk.isEmpty() && listKWHzl.isEmpty()) {
            AbstractC16298ehL abstractC16298ehL2 = this.KWHzl;
            if (abstractC16298ehL2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL = abstractC16298ehL2;
            }
            abstractC16298ehL.getNewProxyInstance.setVisibility(8);
            return;
        }
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL3 = null;
        }
        abstractC16298ehL3.getNewProxyInstance.setVisibility(0);
        if (abstractC10170bjR.zsXlph()) {
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.fIwbmz.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL5 = null;
            }
            abstractC16298ehL5.zuBGHE.setText(abstractC10170bjR.AkhnZx());
        } else {
            AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
            if (abstractC16298ehL6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL6 = null;
            }
            abstractC16298ehL6.fIwbmz.setVisibility(8);
        }
        if (abstractC10170bjR.AwvSrB()) {
            AbstractC16298ehL abstractC16298ehL7 = this.KWHzl;
            if (abstractC16298ehL7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL7 = null;
            }
            abstractC16298ehL7.uzCIH.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL8 = this.KWHzl;
            if (abstractC16298ehL8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL8 = null;
            }
            abstractC16298ehL8.ORxRYg.setText(abstractC10170bjR.AuCTel());
        } else {
            AbstractC16298ehL abstractC16298ehL9 = this.KWHzl;
            if (abstractC16298ehL9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL9 = null;
            }
            abstractC16298ehL9.uzCIH.setVisibility(8);
        }
        if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(listKWHzl.size()), (java.lang.Object) 1)) {
            AbstractC16298ehL abstractC16298ehL10 = this.KWHzl;
            if (abstractC16298ehL10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL10 = null;
            }
            abstractC16298ehL10.AuCTel.getRoot().setVisibility(0);
        } else {
            AbstractC16298ehL abstractC16298ehL11 = this.KWHzl;
            if (abstractC16298ehL11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL11 = null;
            }
            abstractC16298ehL11.AuCTel.getRoot().setVisibility(8);
        }
        gEmmrt(abstractC10170bjR);
        AbstractC16298ehL abstractC16298ehL12 = this.KWHzl;
        if (abstractC16298ehL12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL12 = null;
        }
        RecyclerView recyclerView = abstractC16298ehL12.fJNWhG.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(djBIcL());
        recyclerView.removeItemDecoration(this.fJNWhG);
        recyclerView.addItemDecoration(this.fJNWhG);
        C59534zip c59534zipDjBIcL = djBIcL();
        AbstractC16298ehL abstractC16298ehL13 = this.KWHzl;
        if (abstractC16298ehL13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL13 = null;
        }
        android.widget.ImageView imageView = abstractC16298ehL13.fJNWhG.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        AbstractC16298ehL abstractC16298ehL14 = this.KWHzl;
        if (abstractC16298ehL14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL14 = null;
        }
        android.widget.LinearLayout linearLayout = abstractC16298ehL14.fJNWhG.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        copydefault(listAYXKKw, iGEmmrt, c59534zipDjBIcL, imageView, linearLayout);
        AbstractC16298ehL abstractC16298ehL15 = this.KWHzl;
        if (abstractC16298ehL15 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL15 = null;
        }
        RecyclerView recyclerView2 = abstractC16298ehL15.hDKMBd.KWHzl;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
        recyclerView2.setAdapter(valueOf());
        recyclerView2.removeItemDecoration(this.fJNWhG);
        recyclerView2.addItemDecoration(this.fJNWhG);
        C59534zip c59534zipValueOf = valueOf();
        AbstractC16298ehL abstractC16298ehL16 = this.KWHzl;
        if (abstractC16298ehL16 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL16 = null;
        }
        android.widget.ImageView imageView2 = abstractC16298ehL16.hDKMBd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        AbstractC16298ehL abstractC16298ehL17 = this.KWHzl;
        if (abstractC16298ehL17 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL17 = null;
        }
        android.widget.LinearLayout linearLayout2 = abstractC16298ehL17.hDKMBd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        copydefault(listDbNXlk, iIsConnected, c59534zipValueOf, imageView2, linearLayout2);
        AbstractC16298ehL abstractC16298ehL18 = this.KWHzl;
        if (abstractC16298ehL18 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL18 = null;
        }
        RecyclerView recyclerView3 = abstractC16298ehL18.AuCTel.EZpvd;
        recyclerView3.setLayoutManager(new LinearLayoutManager(this));
        recyclerView3.setAdapter(copydefault());
        recyclerView3.removeItemDecoration(this.AhwBna);
        recyclerView3.addItemDecoration(this.AhwBna);
        C59534zip c59534zipCopydefault = copydefault();
        AbstractC16298ehL abstractC16298ehL19 = this.KWHzl;
        if (abstractC16298ehL19 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL19 = null;
        }
        android.widget.ImageView imageView3 = abstractC16298ehL19.AuCTel.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        AbstractC16298ehL abstractC16298ehL20 = this.KWHzl;
        if (abstractC16298ehL20 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL = abstractC16298ehL20;
        }
        android.widget.LinearLayout linearLayout3 = abstractC16298ehL.AuCTel.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        copydefault(listKWHzl, size, c59534zipCopydefault, imageView3, linearLayout3);
    }

    public final void KWHzl(AbstractC10170bjR abstractC10170bjR) {
        java.lang.String strAYXKKw;
        boolean zDjBIcL;
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.ejfBZ.removeAllViews();
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL3 = null;
        }
        abstractC16298ehL3.getFieldNames.removeAllViews();
        if (abstractC10170bjR.EZpvd(this.iwGUEr).AEQbTJ()) {
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.ejfBZ.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL5 = null;
            }
            abstractC16298ehL5.gHZMYf.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
            if (abstractC16298ehL6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL6 = null;
            }
            abstractC16298ehL6.gHZMYf.setText(abstractC10170bjR.EZpvd(this.iwGUEr).OLrzqt());
            AbstractC16298ehL abstractC16298ehL7 = this.KWHzl;
            if (abstractC16298ehL7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL7 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC16298ehL7.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            OLrzqt(abstractC10170bjR, linearLayout, abstractC10170bjR.EZpvd(this.iwGUEr));
        } else {
            AbstractC16298ehL abstractC16298ehL8 = this.KWHzl;
            if (abstractC16298ehL8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL8 = null;
            }
            abstractC16298ehL8.ejfBZ.setVisibility(8);
            AbstractC16298ehL abstractC16298ehL9 = this.KWHzl;
            if (abstractC16298ehL9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL9 = null;
            }
            abstractC16298ehL9.gHZMYf.setVisibility(8);
        }
        BaseItem baseItemOLrzqt = abstractC10170bjR.OLrzqt(this.iwGUEr);
        if (baseItemOLrzqt instanceof BaseItem.StateListAnimator) {
            BaseItem.StateListAnimator stateListAnimator = (BaseItem.StateListAnimator) baseItemOLrzqt;
            zDjBIcL = stateListAnimator.AEQbTJ();
            strAYXKKw = stateListAnimator.OLrzqt();
        } else if (baseItemOLrzqt instanceof BaseItem.Activity) {
            BaseItem.Activity activity = (BaseItem.Activity) baseItemOLrzqt;
            zDjBIcL = C33129mqd.OLrzqt((java.lang.CharSequence) activity.copydefault());
            strAYXKKw = activity.OLrzqt();
        } else if (baseItemOLrzqt instanceof BaseItem.Application) {
            BaseItem.Application application = (BaseItem.Application) baseItemOLrzqt;
            zDjBIcL = application.djBIcL();
            strAYXKKw = application.AYXKKw();
        } else {
            strAYXKKw = "";
            zDjBIcL = false;
        }
        if (!zDjBIcL) {
            AbstractC16298ehL abstractC16298ehL10 = this.KWHzl;
            if (abstractC16298ehL10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL10 = null;
            }
            abstractC16298ehL10.getFieldNames.setVisibility(8);
            AbstractC16298ehL abstractC16298ehL11 = this.KWHzl;
            if (abstractC16298ehL11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL2 = abstractC16298ehL11;
            }
            abstractC16298ehL2.QOLQEE.setVisibility(8);
            return;
        }
        AbstractC16298ehL abstractC16298ehL12 = this.KWHzl;
        if (abstractC16298ehL12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL12 = null;
        }
        abstractC16298ehL12.getFieldNames.setVisibility(0);
        AbstractC16298ehL abstractC16298ehL13 = this.KWHzl;
        if (abstractC16298ehL13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL13 = null;
        }
        abstractC16298ehL13.QOLQEE.setVisibility(0);
        AbstractC16298ehL abstractC16298ehL14 = this.KWHzl;
        if (abstractC16298ehL14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL14 = null;
        }
        abstractC16298ehL14.QOLQEE.setText(strAYXKKw);
        AbstractC16298ehL abstractC16298ehL15 = this.KWHzl;
        if (abstractC16298ehL15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL15;
        }
        android.widget.LinearLayout linearLayout2 = abstractC16298ehL2.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        OLrzqt(abstractC10170bjR, linearLayout2, abstractC10170bjR.OLrzqt(this.iwGUEr));
    }

    public final void copydefault(AbstractC10170bjR abstractC10170bjR) {
        fIwbmz().setItems(abstractC10170bjR.valueOf());
        fIwbmz().notifyDataSetChanged();
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        RecyclerView recyclerView = abstractC16298ehL.valueOf;
        recyclerView.setAdapter(fIwbmz());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public final void AEQbTJ(final AbstractC10170bjR abstractC10170bjR) {
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.fARcdN.setVisibility(8);
        if (abstractC10170bjR.hDKMBd()) {
            AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
            if (abstractC16298ehL3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL3 = null;
            }
            C8003auW.copydefault(abstractC16298ehL3.KWHzl).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bit
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC10049bhC.copydefault(this.OLrzqt, abstractC10170bjR, obj);
                }
            });
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.KWHzl.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL5 = null;
            }
            abstractC16298ehL5.fARcdN.setVisibility(0);
        } else {
            AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
            if (abstractC16298ehL6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL6 = null;
            }
            abstractC16298ehL6.KWHzl.setVisibility(8);
        }
        if (abstractC10170bjR.zLjUOn()) {
            AbstractC16298ehL abstractC16298ehL7 = this.KWHzl;
            if (abstractC16298ehL7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL7 = null;
            }
            C8003auW.copydefault(abstractC16298ehL7.AEQbTJ).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC10049bhC.EZpvd(this.AEQbTJ, abstractC10170bjR, obj);
                }
            });
            AbstractC16298ehL abstractC16298ehL8 = this.KWHzl;
            if (abstractC16298ehL8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL8 = null;
            }
            abstractC16298ehL8.AEQbTJ.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL9 = this.KWHzl;
            if (abstractC16298ehL9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL9 = null;
            }
            abstractC16298ehL9.fARcdN.setVisibility(0);
        } else {
            AbstractC16298ehL abstractC16298ehL10 = this.KWHzl;
            if (abstractC16298ehL10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL10 = null;
            }
            abstractC16298ehL10.AEQbTJ.setVisibility(8);
        }
        if (abstractC10170bjR.wlaJM()) {
            AbstractC16298ehL abstractC16298ehL11 = this.KWHzl;
            if (abstractC16298ehL11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL11 = null;
            }
            C8003auW.copydefault(abstractC16298ehL11.AYXKKw).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bis
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC10049bhC.AhwBna(this.AEQbTJ, abstractC10170bjR, obj);
                }
            });
            AbstractC16298ehL abstractC16298ehL12 = this.KWHzl;
            if (abstractC16298ehL12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL12 = null;
            }
            abstractC16298ehL12.AYXKKw.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL13 = this.KWHzl;
            if (abstractC16298ehL13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL13 = null;
            }
            abstractC16298ehL13.fARcdN.setVisibility(0);
        } else {
            AbstractC16298ehL abstractC16298ehL14 = this.KWHzl;
            if (abstractC16298ehL14 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL14 = null;
            }
            abstractC16298ehL14.AYXKKw.setVisibility(8);
        }
        if (abstractC10170bjR.iwGUEr()) {
            AbstractC16298ehL abstractC16298ehL15 = this.KWHzl;
            if (abstractC16298ehL15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL15 = null;
            }
            C8003auW.copydefault(abstractC16298ehL15.copydefault).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bhI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC10049bhC.copydefault(this.OLrzqt, obj);
                }
            });
            AbstractC16298ehL abstractC16298ehL16 = this.KWHzl;
            if (abstractC16298ehL16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL16 = null;
            }
            abstractC16298ehL16.copydefault.setVisibility(0);
            AbstractC16298ehL abstractC16298ehL17 = this.KWHzl;
            if (abstractC16298ehL17 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL17 = null;
            }
            abstractC16298ehL17.fARcdN.setVisibility(0);
        } else {
            AbstractC16298ehL abstractC16298ehL18 = this.KWHzl;
            if (abstractC16298ehL18 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL18 = null;
            }
            abstractC16298ehL18.copydefault.setVisibility(8);
        }
        if (!abstractC10170bjR.getNewProxyInstance()) {
            AbstractC16298ehL abstractC16298ehL19 = this.KWHzl;
            if (abstractC16298ehL19 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL2 = abstractC16298ehL19;
            }
            abstractC16298ehL2.OLrzqt.setVisibility(8);
            return;
        }
        AbstractC16298ehL abstractC16298ehL20 = this.KWHzl;
        if (abstractC16298ehL20 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL20 = null;
        }
        C8003auW.copydefault(abstractC16298ehL20.OLrzqt).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bhK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC10049bhC.EZpvd(this.KWHzl, obj);
            }
        });
        AbstractC16298ehL abstractC16298ehL21 = this.KWHzl;
        if (abstractC16298ehL21 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL21 = null;
        }
        abstractC16298ehL21.OLrzqt.setVisibility(0);
        AbstractC16298ehL abstractC16298ehL22 = this.KWHzl;
        if (abstractC16298ehL22 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL22;
        }
        abstractC16298ehL2.fARcdN.setVisibility(0);
    }

    public static final void copydefault(final ActivityC10049bhC activityC10049bhC, AbstractC10170bjR abstractC10170bjR, java.lang.Object obj) {
        java.lang.String str = activityC10049bhC.iwGUEr;
        if (str == null) {
            return;
        }
        gCZ gcz = gCZ.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        gcz.OLrzqt(supportFragmentManager, str, abstractC10170bjR.fJNWhG(), new yHO() { // from class: o.bio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return ActivityC10049bhC.AEQbTJ(this.KWHzl, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3, (java.lang.String) obj4);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC10049bhC activityC10049bhC, boolean z, java.lang.String str, java.lang.String str2) {
        if (str != null) {
            activityC10049bhC.ejfBZ = str;
            activityC10049bhC.fARcdN = null;
            activityC10049bhC.fetchVPNInfo();
        } else if (str2 != null && activityC10049bhC.AYXKKw) {
            activityC10049bhC.ejfBZ = null;
            activityC10049bhC.fARcdN = str2;
            activityC10049bhC.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final ActivityC10049bhC activityC10049bhC, AbstractC10170bjR abstractC10170bjR, java.lang.Object obj) {
        java.lang.String str = activityC10049bhC.iwGUEr;
        if (str == null) {
            return;
        }
        gCZ gcz = gCZ.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        gcz.AEQbTJ(supportFragmentManager, str, abstractC10170bjR.fJNWhG(), new yHO() { // from class: o.bik
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return ActivityC10049bhC.EZpvd(this.AEQbTJ, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3, (java.lang.String) obj4);
            }
        });
    }

    public static final Unit EZpvd(ActivityC10049bhC activityC10049bhC, boolean z, java.lang.String str, java.lang.String str2) {
        if (str != null) {
            activityC10049bhC.ejfBZ = str;
            activityC10049bhC.fARcdN = null;
            activityC10049bhC.fetchVPNInfo();
        } else if (str2 != null && activityC10049bhC.AYXKKw) {
            activityC10049bhC.ejfBZ = null;
            activityC10049bhC.fARcdN = str2;
            activityC10049bhC.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(final ActivityC10049bhC activityC10049bhC, AbstractC10170bjR abstractC10170bjR, java.lang.Object obj) {
        java.lang.String str = activityC10049bhC.iwGUEr;
        if (str == null) {
            return;
        }
        gCZ gcz = gCZ.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        gcz.EZpvd(supportFragmentManager, str, abstractC10170bjR.fJNWhG(), new yHO() { // from class: o.bid
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return ActivityC10049bhC.djBIcL(this.AEQbTJ, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3, (java.lang.String) obj4);
            }
        });
    }

    public static final Unit djBIcL(ActivityC10049bhC activityC10049bhC, boolean z, java.lang.String str, java.lang.String str2) {
        if (str != null) {
            activityC10049bhC.ejfBZ = str;
            activityC10049bhC.fARcdN = null;
            activityC10049bhC.fetchVPNInfo();
        } else if (str2 != null && activityC10049bhC.AYXKKw) {
            activityC10049bhC.ejfBZ = null;
            activityC10049bhC.fARcdN = str2;
            activityC10049bhC.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(final ActivityC10049bhC activityC10049bhC, java.lang.Object obj) {
        final java.lang.String str = activityC10049bhC.iwGUEr;
        if (str == null) {
            return;
        }
        gBZ gbz = gBZ.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        gbz.OLrzqt(supportFragmentManager, new Function0() { // from class: o.bil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC10049bhC.OLrzqt(this.KWHzl, str);
            }
        });
        C32866mlf.onEvent$default("Web3_Pending_ReleaseUTXO_Click", (TrackChannel[]) null, new Function1() { // from class: o.biq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC10049bhC.djBIcL(this.EZpvd, (EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(final ActivityC10049bhC activityC10049bhC, java.lang.String str) {
        C32866mlf.onEvent$default("Web3_Pending_ReleaseUTXO_Submit", (TrackChannel[]) null, new Function1() { // from class: o.bhV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.AEQbTJ(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC10049bhC), null, null, new DefiWalletTxDetailActivity$dealFloatView$4$1$2(activityC10049bhC, str, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC10049bhC activityC10049bhC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(activityC10049bhC.OLrzqt);
        if (c10854bwMKWHzl != null) {
            eventParamsList.put("chain", c10854bwMKWHzl.djBIcL(), false);
        }
        C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(activityC10049bhC.OLrzqt));
        if (c10854bwMKWHzl2 != null) {
            eventParamsList.put("token_name", c10854bwMKWHzl2.fJNWhG(), false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC10049bhC activityC10049bhC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(activityC10049bhC.OLrzqt);
        if (c10854bwMKWHzl != null) {
            eventParamsList.put("chain", c10854bwMKWHzl.djBIcL(), false);
        }
        C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(activityC10049bhC.OLrzqt));
        if (c10854bwMKWHzl2 != null) {
            eventParamsList.put("token_name", c10854bwMKWHzl2.fJNWhG(), false);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final ActivityC10049bhC activityC10049bhC, java.lang.Object obj) {
        final java.lang.String str = activityC10049bhC.iwGUEr;
        if (str == null) {
            return;
        }
        gBZ gbz = gBZ.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        gbz.copydefault(supportFragmentManager, new Function0() { // from class: o.bih
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC10049bhC.AEQbTJ(this.EZpvd, str);
            }
        });
        C32866mlf.onEvent$default("Web3_Pending_Rebroadcast_Click", (TrackChannel[]) null, new Function1() { // from class: o.bij
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return ActivityC10049bhC.gEmmrt(this.KWHzl, (EventParamsList) obj2);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(final ActivityC10049bhC activityC10049bhC, java.lang.String str) {
        C32866mlf.onEvent$default("Web3_Pending_Rebroadcast_Submit", (TrackChannel[]) null, new Function1() { // from class: o.bhH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.AhwBna(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC10049bhC), null, null, new DefiWalletTxDetailActivity$dealFloatView$5$1$2(activityC10049bhC, str, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC10049bhC activityC10049bhC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(activityC10049bhC.OLrzqt);
        if (c10854bwMKWHzl != null) {
            eventParamsList.put("chain", c10854bwMKWHzl.djBIcL(), false);
        }
        C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(activityC10049bhC.OLrzqt));
        if (c10854bwMKWHzl2 != null) {
            eventParamsList.put("token_name", c10854bwMKWHzl2.fJNWhG(), false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC10049bhC activityC10049bhC, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(activityC10049bhC.OLrzqt);
        if (c10854bwMKWHzl != null) {
            eventParamsList.put("chain", c10854bwMKWHzl.djBIcL(), false);
        }
        C10854bwM c10854bwMKWHzl2 = c10954byG.valueOf().KWHzl(java.lang.Long.valueOf(activityC10049bhC.OLrzqt));
        if (c10854bwMKWHzl2 != null) {
            eventParamsList.put("token_name", c10854bwMKWHzl2.fJNWhG(), false);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.util.List<? extends AbstractC10168bjP> list, int i, final C59534zip c59534zip, final android.widget.ImageView imageView, android.widget.LinearLayout linearLayout) {
        if (i > 2) {
            linearLayout.setVisibility(0);
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                arrayList.add(list.get(i2));
            }
            C33064mpR.OLrzqt(c59534zip, arrayList);
            imageView.setImageResource(C52761wXj.TaskDescription.DfrfUJ);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.bhM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10049bhC.copydefault(c59534zip, arrayList, list, imageView, view);
                }
            });
            return;
        }
        C33064mpR.OLrzqt(c59534zip, list);
        linearLayout.setVisibility(8);
    }

    public static final void copydefault(C59534zip c59534zip, java.util.ArrayList arrayList, java.util.List list, android.widget.ImageView imageView, android.view.View view) {
        java.util.List<?> items = c59534zip.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.util.Iterator<T> it = items.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!(it.next() instanceof AbstractC10168bjP.LoaderManager)) {
                i++;
            }
        }
        if (i > 2) {
            arrayList.clear();
            for (int i2 = 0; i2 < 2; i2++) {
                arrayList.add(list.get(i2));
            }
            C33064mpR.OLrzqt(c59534zip, arrayList);
            imageView.setImageResource(C52761wXj.TaskDescription.DfrfUJ);
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        C33064mpR.OLrzqt(c59534zip, arrayList);
        imageView.setImageResource(C52761wXj.TaskDescription.ExKek);
    }

    public final void gEmmrt(AbstractC10170bjR abstractC10170bjR) {
        final C10169bjQ c10169bjQFetchVPNInfo = abstractC10170bjR.fetchVPNInfo();
        AbstractC16298ehL abstractC16298ehL = null;
        if (c10169bjQFetchVPNInfo != null) {
            AbstractC16298ehL abstractC16298ehL2 = this.KWHzl;
            if (abstractC16298ehL2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL2 = null;
            }
            C8003auW.copydefault(abstractC16298ehL2.DbNXlk).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bhX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC10049bhC.EZpvd(this.AEQbTJ, c10169bjQFetchVPNInfo, obj);
                }
            });
            AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
            if (abstractC16298ehL3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL3 = null;
            }
            abstractC16298ehL3.DbNXlk.setVisibility(0);
        } else {
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.DbNXlk.setVisibility(8);
        }
        final C10169bjQ c10169bjQValues = abstractC10170bjR.values();
        if (c10169bjQValues == null) {
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL = abstractC16298ehL5;
            }
            abstractC16298ehL.AkhnZx.setVisibility(8);
            return;
        }
        AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
        if (abstractC16298ehL6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL6 = null;
        }
        C8003auW.copydefault(abstractC16298ehL6.AkhnZx).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.bhW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC10049bhC.OLrzqt(this.AEQbTJ, c10169bjQValues, obj);
            }
        });
        AbstractC16298ehL abstractC16298ehL7 = this.KWHzl;
        if (abstractC16298ehL7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL = abstractC16298ehL7;
        }
        abstractC16298ehL.AkhnZx.setVisibility(0);
    }

    public static final void EZpvd(ActivityC10049bhC activityC10049bhC, C10169bjQ c10169bjQ, java.lang.Object obj) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC10049bhC);
        viewOnClickListenerC54939xaY.setTitle(c10169bjQ.copydefault());
        viewOnClickListenerC54939xaY.EZpvd(c10169bjQ.OLrzqt());
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) c10169bjQ.EZpvd(), new View.OnClickListener() { // from class: o.bhT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC10049bhC.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ActivityC10049bhC activityC10049bhC, C10169bjQ c10169bjQ, java.lang.Object obj) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC10049bhC);
        viewOnClickListenerC54939xaY.setTitle(c10169bjQ.copydefault());
        viewOnClickListenerC54939xaY.EZpvd(c10169bjQ.OLrzqt());
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) c10169bjQ.EZpvd(), new View.OnClickListener() { // from class: o.bhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC10049bhC.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(final AbstractC10170bjR abstractC10170bjR, android.view.ViewGroup viewGroup, final BaseItem baseItem) {
        if (baseItem instanceof BaseItem.Application) {
            final AbstractC16982euG abstractC16982euG = (AbstractC16982euG) DataBindingUtil.inflate(getLayoutInflater(), C13754dXa.TaskDescription.dpErvT, null, false);
            BaseItem.Application application = (BaseItem.Application) baseItem;
            abstractC16982euG.EZpvd.setText(application.KWHzl());
            abstractC16982euG.EZpvd.setVisibility(application.KWHzl().length() == 0 ? 8 : 0);
            C55251xgS c55251xgS = abstractC16982euG.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) application.valueOf()) ? 0 : 8);
            abstractC16982euG.OLrzqt.setText(application.valueOf());
            C10854bwM c10854bwM = this.copydefault;
            if (c10854bwM != null && c10854bwM.dxcTrN()) {
                AkhnZx().copydefault().observe(this, new Dialog(new Function1() { // from class: o.bii
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC10049bhC.AEQbTJ(this.OLrzqt, baseItem, abstractC16982euG, (C10052bhF) obj);
                    }
                }));
            }
            if (!application.gEmmrt()) {
                abstractC16982euG.copydefault.setVisibility(8);
            } else {
                abstractC16982euG.copydefault.setVisibility(0);
            }
            abstractC16982euG.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.big
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10049bhC.EZpvd(baseItem, this, view);
                }
            });
            viewGroup.addView(abstractC16982euG.getRoot());
            return;
        }
        if (baseItem instanceof BaseItem.StateListAnimator) {
            final AbstractC17115ewh abstractC17115ewh = (AbstractC17115ewh) DataBindingUtil.inflate(getLayoutInflater(), C13754dXa.TaskDescription.dYepVG, null, false);
            final RecyclerView recyclerView = abstractC17115ewh.AEQbTJ;
            recyclerView.setHasFixedSize(true);
            recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(8.0f, null, 1, null), 0));
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            BaseItem.StateListAnimator stateListAnimator = (BaseItem.StateListAnimator) baseItem;
            if (C33129mqd.KWHzl((java.util.Collection) stateListAnimator.EZpvd())) {
                viewGroup.setVisibility(0);
                C43316rmw c43316rmw = new C43316rmw();
                c43316rmw.register(BaseItem.Application.class, new StateListAnimator(C13754dXa.TaskDescription.dpErvT, dTV.isConnected));
                recyclerView.setAdapter(c43316rmw);
                if (stateListAnimator.EZpvd().size() > 1) {
                    abstractC17115ewh.OLrzqt.setVisibility(0);
                    final java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(CollectionsKt___CollectionsKt.AuCTelauCTel(stateListAnimator.EZpvd()));
                    RecyclerView.Adapter adapter = recyclerView.getAdapter();
                    Intrinsics.copydefault(adapter, "");
                    C33064mpR.OLrzqt((C43316rmw) adapter, (java.util.List<? extends java.lang.Object>) arrayList);
                    abstractC17115ewh.OLrzqt.setImageResource(C52761wXj.TaskDescription.DfrfUJ);
                    abstractC17115ewh.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.bip
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            ActivityC10049bhC.KWHzl(recyclerView, arrayList, baseItem, abstractC17115ewh, abstractC10170bjR, this, view);
                        }
                    });
                } else {
                    RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                    Intrinsics.copydefault(adapter2, "");
                    C33064mpR.OLrzqt((C43316rmw) adapter2, (java.util.List<? extends java.lang.Object>) stateListAnimator.EZpvd());
                    abstractC17115ewh.OLrzqt.setVisibility(8);
                }
            } else {
                viewGroup.setVisibility(8);
            }
            viewGroup.addView(abstractC17115ewh.getRoot());
            return;
        }
        if (baseItem instanceof BaseItem.Activity) {
            AbstractC16982euG abstractC16982euG2 = (AbstractC16982euG) DataBindingUtil.inflate(getLayoutInflater(), C13754dXa.TaskDescription.dpErvT, null, false);
            BaseItem.Activity activity = (BaseItem.Activity) baseItem;
            abstractC16982euG2.EZpvd.setText(activity.copydefault());
            abstractC16982euG2.EZpvd.setVisibility(activity.copydefault().length() == 0 ? 8 : 0);
            if (!activity.KWHzl()) {
                abstractC16982euG2.copydefault.setVisibility(8);
            } else {
                abstractC16982euG2.copydefault.setVisibility(0);
            }
            abstractC16982euG2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.bim
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10049bhC.AEQbTJ(baseItem, this, view);
                }
            });
            viewGroup.addView(abstractC16982euG2.getRoot());
        }
    }

    public static final Unit AEQbTJ(ActivityC10049bhC activityC10049bhC, BaseItem baseItem, AbstractC16982euG abstractC16982euG, C10052bhF c10052bhF) {
        if (c10052bhF == null) {
            return Unit.INSTANCE;
        }
        boolean z = false;
        for (ChainAddress chainAddress : c10052bhF.OLrzqt()) {
            BaseItem.Application application = (BaseItem.Application) baseItem;
            if (!Intrinsics.EZpvd(chainAddress.getAddress(), application.KWHzl())) {
                C10854bwM c10854bwM = activityC10049bhC.copydefault;
                if (Intrinsics.EZpvd(c10854bwM != null ? c10854bwM.AEQbTJ(chainAddress.getAddress()) : null, application.KWHzl())) {
                }
            }
            abstractC16982euG.gEmmrt.setVisibility(0);
            abstractC16982euG.gEmmrt.setText(c10052bhF.AEQbTJ().AYXKKw());
            abstractC16982euG.KWHzl.setVisibility(0);
            abstractC16982euG.KWHzl.setText(new AddressData(chainAddress.getAddressType(), false, false, null, 14, null).getAddressFormat());
            z = true;
        }
        if (!z) {
            java.lang.String string = ((BaseItem.Application) baseItem).KWHzl().toString();
            C55251xgS c55251xgS = abstractC16982euG.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            activityC10049bhC.AEQbTJ(string, c55251xgS);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final BaseItem baseItem, final ActivityC10049bhC activityC10049bhC, android.view.View view) {
        BaseItem.Application application = (BaseItem.Application) baseItem;
        if (application.gEmmrt()) {
            activityC10049bhC.fJNWhG();
            C21027grx c21027grx = C21027grx.copydefault;
            boolean zAhwBna = application.AhwBna();
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c21027grx.AEQbTJ(zAhwBna, supportFragmentManager, new Function0() { // from class: o.bic
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC10049bhC.EZpvd(this.AEQbTJ, baseItem);
                }
            });
        }
    }

    public static final Unit EZpvd(ActivityC10049bhC activityC10049bhC, BaseItem baseItem) {
        BaseItem.Application application = (BaseItem.Application) baseItem;
        C10186bjh.KWHzl.KWHzl(activityC10049bhC, activityC10049bhC.OLrzqt, application.EZpvd(), application.OLrzqt());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bhC$StateListAnimator */
    public static final class StateListAnimator extends C43318rmy<BaseItem.Application, AbstractC16982euG> {
        public StateListAnimator(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        /* JADX WARN: Removed duplicated region for block: B:32:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onBindViewHolder(C43312rms<AbstractC16982euG> c43312rms, final BaseItem.Application application) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(application, "");
            super.onBindViewHolder((C43312rms) c43312rms, application);
            ((AbstractC16982euG) c43312rms.OLrzqt()).EZpvd.setText(application.KWHzl());
            ((AbstractC16982euG) c43312rms.OLrzqt()).EZpvd.setVisibility(application.KWHzl().length() == 0 ? 8 : 0);
            C55251xgS c55251xgS = ((AbstractC16982euG) c43312rms.OLrzqt()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) application.valueOf()) ? 0 : 8);
            ((AbstractC16982euG) c43312rms.OLrzqt()).OLrzqt.setText(application.valueOf());
            ActivityC10049bhC activityC10049bhC = ActivityC10049bhC.this;
            for (AbstractC12782ctV abstractC12782ctV : C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt()) {
                for (ChainAddress chainAddress : abstractC12782ctV.EZpvd()) {
                    if (!Intrinsics.EZpvd(chainAddress.getAddress(), application.KWHzl())) {
                        C10854bwM c10854bwM = activityC10049bhC.copydefault;
                        if (Intrinsics.EZpvd(c10854bwM != null ? c10854bwM.AEQbTJ(chainAddress.getAddress()) : null, application.KWHzl())) {
                        }
                    }
                    ((AbstractC16982euG) c43312rms.OLrzqt()).gEmmrt.setVisibility(0);
                    ((AbstractC16982euG) c43312rms.OLrzqt()).gEmmrt.setText(abstractC12782ctV.AYXKKw());
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(chainAddress.getCoinId()));
                    if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
                        ((AbstractC16982euG) c43312rms.OLrzqt()).KWHzl.setVisibility(0);
                        ((AbstractC16982euG) c43312rms.OLrzqt()).KWHzl.setText(new AddressData(chainAddress.getAddressType(), false, false, null, 14, null).getAddressFormat());
                    }
                    if (application.gEmmrt()) {
                        ((AbstractC16982euG) c43312rms.OLrzqt()).copydefault.setVisibility(8);
                    } else {
                        ((AbstractC16982euG) c43312rms.OLrzqt()).copydefault.setVisibility(0);
                    }
                    ConstraintLayout constraintLayout = ((AbstractC16982euG) c43312rms.OLrzqt()).AEQbTJ;
                    final ActivityC10049bhC activityC10049bhC2 = ActivityC10049bhC.this;
                    constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.biu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            ActivityC10049bhC.StateListAnimator.copydefault(application, activityC10049bhC2, view);
                        }
                    });
                }
            }
            ActivityC10049bhC activityC10049bhC3 = ActivityC10049bhC.this;
            java.lang.String string = application.KWHzl().toString();
            C55251xgS c55251xgS2 = ((AbstractC16982euG) c43312rms.OLrzqt()).gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            activityC10049bhC3.AEQbTJ(string, c55251xgS2);
            if (application.gEmmrt()) {
            }
            ConstraintLayout constraintLayout2 = ((AbstractC16982euG) c43312rms.OLrzqt()).AEQbTJ;
            final ActivityC10049bhC activityC10049bhC22 = ActivityC10049bhC.this;
            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.biu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC10049bhC.StateListAnimator.copydefault(application, activityC10049bhC22, view);
                }
            });
        }

        public static final void copydefault(final BaseItem.Application application, final ActivityC10049bhC activityC10049bhC, android.view.View view) {
            if (application.gEmmrt()) {
                activityC10049bhC.fJNWhG();
                C21027grx c21027grx = C21027grx.copydefault;
                boolean zAhwBna = application.AhwBna();
                androidx.fragment.app.FragmentManager supportFragmentManager = activityC10049bhC.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c21027grx.AEQbTJ(zAhwBna, supportFragmentManager, new Function0() { // from class: o.biy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC10049bhC.StateListAnimator.copydefault(activityC10049bhC, application);
                    }
                });
            }
        }

        public static final Unit copydefault(ActivityC10049bhC activityC10049bhC, BaseItem.Application application) {
            C10186bjh.KWHzl.KWHzl(activityC10049bhC, activityC10049bhC.KWHzl(), application.EZpvd(), application.OLrzqt());
            return Unit.INSTANCE;
        }
    }

    public static final void KWHzl(RecyclerView recyclerView, java.util.ArrayList arrayList, BaseItem baseItem, AbstractC17115ewh abstractC17115ewh, AbstractC10170bjR abstractC10170bjR, ActivityC10049bhC activityC10049bhC, android.view.View view) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.copydefault(adapter, "");
        if (((C43316rmw) adapter).getItems().size() > 1) {
            arrayList.clear();
            arrayList.add(CollectionsKt___CollectionsKt.AuCTelauCTel(((BaseItem.StateListAnimator) baseItem).EZpvd()));
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            Intrinsics.copydefault(adapter2, "");
            C33064mpR.OLrzqt((C43316rmw) adapter2, (java.util.List<? extends java.lang.Object>) arrayList);
            abstractC17115ewh.OLrzqt.setImageResource(C52761wXj.TaskDescription.DfrfUJ);
            C52794wYp c52794wYp = abstractC17115ewh.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            abstractC17115ewh.copydefault.setOnClickListener(null);
            return;
        }
        arrayList.clear();
        BaseItem.StateListAnimator stateListAnimator = (BaseItem.StateListAnimator) baseItem;
        int i = 0;
        for (java.lang.Object obj : stateListAnimator.EZpvd()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            BaseItem.Application application = (BaseItem.Application) obj;
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), stateListAnimator.copydefault())) {
                arrayList.add(application);
            }
            i++;
        }
        RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
        Intrinsics.copydefault(adapter3, "");
        C33064mpR.OLrzqt((C43316rmw) adapter3, (java.util.List<? extends java.lang.Object>) arrayList);
        abstractC17115ewh.OLrzqt.setImageResource(C52761wXj.TaskDescription.ExKek);
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(stateListAnimator.EZpvd().size()), stateListAnimator.copydefault())) {
            C52794wYp c52794wYp2 = abstractC17115ewh.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(0);
            C52794wYp c52794wYp3 = abstractC17115ewh.copydefault;
            c52794wYp3.setOnClickListener(new Activity(c52794wYp3, 1000L, abstractC10170bjR, activityC10049bhC));
        }
    }

    public static final void AEQbTJ(BaseItem baseItem, ActivityC10049bhC activityC10049bhC, android.view.View view) {
        BaseItem.Activity activity = (BaseItem.Activity) baseItem;
        if (activity.KWHzl()) {
            activityC10049bhC.fJNWhG();
            C10186bjh.KWHzl.KWHzl(activityC10049bhC, activityC10049bhC.OLrzqt, activity.AEQbTJ(), activity.EZpvd());
        }
    }

    public final java.lang.String KWHzl(C10854bwM c10854bwM, java.lang.String str) {
        return c10854bwM.OLrzqt(str) ? C59449zhJ.KWHzl(str, c10854bwM.zLjUOn(), EIP1271Verifier.hexPrefix, true) : str;
    }

    public final void AEQbTJ(java.lang.String str, android.widget.TextView textView) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletTxDetailActivity$lookupAddressBookAndUpdateUI$1(textView, str, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        java.lang.Object systemService = getSystemService("vibrator");
        Intrinsics.copydefault(systemService, "");
        android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(100L, new AudioAttributes.Builder().build());
        }
    }

    private final void AEQbTJ(BaseItem.StatusItem statusItem) {
        AbstractC16298ehL abstractC16298ehL = null;
        switch (TaskDescription.copydefault[statusItem.OLrzqt().ordinal()]) {
            case 1:
                AbstractC16298ehL abstractC16298ehL2 = this.KWHzl;
                if (abstractC16298ehL2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL2 = null;
                }
                abstractC16298ehL2.fetchVPNInfo.setImageDrawable(C57304yfr.copydefault.OLrzqt(this, C52761wXj.TaskDescription.RXzakW, C52761wXj.Activity.DeEinT));
                AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
                if (abstractC16298ehL3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL3;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setToolbarNavigationClickListener));
                break;
            case 2:
                AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
                if (abstractC16298ehL4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL4 = null;
                }
                LottieAnimationView lottieAnimationView = abstractC16298ehL4.fetchVPNInfo;
                lottieAnimationView.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView.playAnimation();
                AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
                if (abstractC16298ehL5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL5;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActionBarUpIndicator));
                break;
            case 3:
                AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
                if (abstractC16298ehL6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL6 = null;
                }
                LottieAnimationView lottieAnimationView2 = abstractC16298ehL6.fetchVPNInfo;
                lottieAnimationView2.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView2.playAnimation();
                AbstractC16298ehL abstractC16298ehL7 = this.KWHzl;
                if (abstractC16298ehL7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL7;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.syncState));
                break;
            case 4:
                AbstractC16298ehL abstractC16298ehL8 = this.KWHzl;
                if (abstractC16298ehL8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL8 = null;
                }
                LottieAnimationView lottieAnimationView3 = abstractC16298ehL8.fetchVPNInfo;
                lottieAnimationView3.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView3.playAnimation();
                AbstractC16298ehL abstractC16298ehL9 = this.KWHzl;
                if (abstractC16298ehL9 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL9;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDrawerStateChanged));
                break;
            case 5:
                AbstractC16298ehL abstractC16298ehL10 = this.KWHzl;
                if (abstractC16298ehL10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL10 = null;
                }
                LottieAnimationView lottieAnimationView4 = abstractC16298ehL10.fetchVPNInfo;
                lottieAnimationView4.setAnimation(C13754dXa.Fragment.djBIcL);
                lottieAnimationView4.playAnimation();
                AbstractC16298ehL abstractC16298ehL11 = this.KWHzl;
                if (abstractC16298ehL11 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL11;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onDrawerSlide));
                break;
            case 6:
                AbstractC16298ehL abstractC16298ehL12 = this.KWHzl;
                if (abstractC16298ehL12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL12 = null;
                }
                abstractC16298ehL12.fetchVPNInfo.setImageDrawable(C57304yfr.copydefault.OLrzqt(this, C52761wXj.TaskDescription.RKcVTr, C52761wXj.Activity.DQzvGN));
                android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RlQdEF));
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)), 0, spannableString.length(), 33);
                AbstractC16298ehL abstractC16298ehL13 = this.KWHzl;
                if (abstractC16298ehL13 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL13;
                }
                abstractC16298ehL.sSMYrx.setText(spannableString);
                break;
            case 7:
                AbstractC16298ehL abstractC16298ehL14 = this.KWHzl;
                if (abstractC16298ehL14 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL14 = null;
                }
                abstractC16298ehL14.fetchVPNInfo.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.Dmq));
                AbstractC16298ehL abstractC16298ehL15 = this.KWHzl;
                if (abstractC16298ehL15 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL15;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnMultiWindowModeChangedListener));
                break;
            case 8:
                AbstractC16298ehL abstractC16298ehL16 = this.KWHzl;
                if (abstractC16298ehL16 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16298ehL16 = null;
                }
                abstractC16298ehL16.fetchVPNInfo.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.FdcJU));
                AbstractC16298ehL abstractC16298ehL17 = this.KWHzl;
                if (abstractC16298ehL17 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16298ehL = abstractC16298ehL17;
                }
                abstractC16298ehL.sSMYrx.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setActionBarDescription));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        fARcdN();
    }

    private final void fARcdN() {
        int iAEQbTJ = C33570myu.AEQbTJ();
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        android.text.TextPaint paint = abstractC16298ehL.sSMYrx.getPaint();
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL3 = null;
        }
        if (C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null) + paint.measureText(abstractC16298ehL3.sSMYrx.getText().toString()) > (iAEQbTJ - (C55298xhM.dpInt$default(44, (android.content.Context) null, 1, (java.lang.Object) null) * 2)) - C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null)) {
            AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
            if (abstractC16298ehL4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16298ehL4 = null;
            }
            abstractC16298ehL4.iwGUEr.setOrientation(1);
            AbstractC16298ehL abstractC16298ehL5 = this.KWHzl;
            if (abstractC16298ehL5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16298ehL2 = abstractC16298ehL5;
            }
            ViewGroup.LayoutParams layoutParams = abstractC16298ehL2.sSMYrx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            return;
        }
        AbstractC16298ehL abstractC16298ehL6 = this.KWHzl;
        if (abstractC16298ehL6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL6 = null;
        }
        abstractC16298ehL6.iwGUEr.setOrientation(0);
        AbstractC16298ehL abstractC16298ehL7 = this.KWHzl;
        if (abstractC16298ehL7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL7;
        }
        ViewGroup.LayoutParams layoutParams2 = abstractC16298ehL2.sSMYrx.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 4;
    }

    public final void AEQbTJ(final boolean z) {
        C32866mlf.onEvent$default("BTCAccelerate_Pop_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.bhP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC10049bhC.copydefault(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_appear", z ? "yes" : "no", true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFieldNames() {
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.zLjUOn.setVisibility(0);
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL3 = null;
        }
        abstractC16298ehL3.zLjUOn.setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        AbstractC16298ehL abstractC16298ehL4 = this.KWHzl;
        if (abstractC16298ehL4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL4;
        }
        abstractC16298ehL2.zLjUOn.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        AbstractC16298ehL abstractC16298ehL = this.KWHzl;
        AbstractC16298ehL abstractC16298ehL2 = null;
        if (abstractC16298ehL == null) {
            Intrinsics.gEmmrt("");
            abstractC16298ehL = null;
        }
        abstractC16298ehL.zLjUOn.setVisibility(8);
        AbstractC16298ehL abstractC16298ehL3 = this.KWHzl;
        if (abstractC16298ehL3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16298ehL2 = abstractC16298ehL3;
        }
        abstractC16298ehL2.zLjUOn.cancelAnimation();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ymY.showNotificationViewWithToast$default(o.ymY, o.xdX, long, int, int, int, int, java.lang.Object):void */
    public final void EZpvd(android.content.Context context, java.lang.String str) {
        C55097xdX c55097xdX;
        C55097xdX c55097xdX2;
        if (context == null) {
            if (C54819xWm.KWHzl().AEQbTJ() == null) {
                c55097xdX2 = null;
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
                c55097xdX2 = new C55097xdX(activityAEQbTJ, null, 0, 4, null);
            }
            c55097xdX = c55097xdX2;
        } else {
            c55097xdX = new C55097xdX(context, null, 0, 4, null);
        }
        if (c55097xdX == null) {
            return;
        }
        c55097xdX.setMessage(str);
        c55097xdX.setType(1);
        c55097xdX.setState(2);
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
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
