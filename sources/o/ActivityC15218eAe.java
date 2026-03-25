package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AAAddressResponse;
import com.okinc.business.defi.wallet.detail.DefiWalletAccountDetailActivity$adapter$2$1$2$1;
import com.okinc.business.defi.wallet.detail.binders.accountDetail.DefiWalletAccountDetailBean;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C18521fjv;
import o.C19595gIe;
import o.InterfaceC9738bbJ;
import o.dTQ;
import o.eAM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eAe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15218eAe extends AbstractActivityC15266eBz {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C17237eyx AhwBna;
    public AbstractC16288ehB EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public AbstractC12782ctV gEmmrt;
    public java.lang.String values = "";
    public boolean valueOf = true;
    public java.lang.String KWHzl = "";
    public java.lang.String AEQbTJ = "";
    public final java.util.ArrayList<DefiWalletAccountDetailBean> AYXKKw = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.eAe$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DefiWalletAccountDetailBean.AccountDetailType.values().length];
            try {
                iArr2[DefiWalletAccountDetailBean.AccountDetailType.AccountAddress.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[DefiWalletAccountDetailBean.AccountDetailType.CheckPrivateKey.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[DefiWalletAccountDetailBean.AccountDetailType.MPCCheckPrivateKey.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[DefiWalletAccountDetailBean.AccountDetailType.BindSmartAccount.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[DefiWalletAccountDetailBean.AccountDetailType.RemoveWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[DefiWalletAccountDetailBean.AccountContentType.values().length];
            try {
                iArr3[DefiWalletAccountDetailBean.AccountContentType.AccountAddress.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            OLrzqt = iArr3;
        }
    }

    public ActivityC15218eAe() {
        C12827cuN.Application application = C12827cuN.Companion;
        final Function0 function0 = null;
        this.AhwBna = new C17237eyx(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, new C17241ezA(new C17262ezV(C12827cuN.Application.getInstance$default(application, null, 1, null), null, null, 6, null)), 0 == true ? 1 : 0, 22, null);
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(fGT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.detail.DefiWalletAccountDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.detail.DefiWalletAccountDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.detail.DefiWalletAccountDetailActivity$special$$inlined$viewModels$default$3
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
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15218eAe.KWHzl(this.KWHzl);
            }
        });
    }

    /* JADX INFO: renamed from: o.eAe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eAe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15218eAe.class);
            intent.putExtra("wallet_id", str);
            context.startActivity(intent);
        }
    }

    private final void AhwBna() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.values = stringExtra;
    }

    private final fGT gEmmrt() {
        return (fGT) this.djBIcL.getValue();
    }

    private final C43316rmw valueOf() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    public static final C43316rmw KWHzl(final ActivityC15218eAe activityC15218eAe) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(DefiWalletAccountDetailBean.Application.class, new eBS(new Function0() { // from class: o.eAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15218eAe.AYXKKw(this.OLrzqt);
            }
        }, new Function1() { // from class: o.eAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.KWHzl(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        c43316rmw.register(DefiWalletAccountDetailBean.StateListAnimator.class, new eBP());
        c43316rmw.register(DefiWalletAccountDetailBean.ActionBar.class, new eBR(new Function1() { // from class: o.eAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.copydefault(this.AEQbTJ, (DefiWalletAccountDetailBean.AccountDetailType) obj);
            }
        }));
        c43316rmw.register(DefiWalletAccountDetailBean.TaskDescription.class, new eBQ(new Function1() { // from class: o.eAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.EZpvd(this.KWHzl, (DefiWalletAccountDetailBean.AccountDetailType) obj);
            }
        }));
        c43316rmw.register(DefiWalletAccountDetailBean.Activity.class, new eBO(new Function1() { // from class: o.eAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.OLrzqt(this.copydefault, (DefiWalletAccountDetailBean.AccountContentType) obj);
            }
        }));
        return c43316rmw;
    }

    public static final Unit AYXKKw(ActivityC15218eAe activityC15218eAe) {
        activityC15218eAe.AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC15218eAe activityC15218eAe, boolean z) {
        C32866mlf.onEvent$default("Web3WalletAccountPage_Button_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (!z) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC15218eAe), null, null, new DefiWalletAccountDetailActivity$adapter$2$1$2$1(activityC15218eAe, null), 3, null);
        } else {
            dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default((dTQ) C43251rlk.copydefault(dTQ.class), activityC15218eAe, activityC15218eAe.values, null, "sa_wallet_accountdetail", 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC15218eAe activityC15218eAe, DefiWalletAccountDetailBean.AccountDetailType accountDetailType) {
        Intrinsics.checkNotNullParameter(accountDetailType, "");
        activityC15218eAe.OLrzqt(accountDetailType);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC15218eAe activityC15218eAe, DefiWalletAccountDetailBean.AccountDetailType accountDetailType) {
        Intrinsics.checkNotNullParameter(accountDetailType, "");
        activityC15218eAe.OLrzqt(accountDetailType);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC15218eAe activityC15218eAe, DefiWalletAccountDetailBean.AccountContentType accountContentType) {
        Intrinsics.checkNotNullParameter(accountContentType, "");
        activityC15218eAe.OLrzqt(accountContentType);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC15266eBz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16288ehB) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.AwvSrB);
        C32866mlf.onEvent$default("Web3WalletManagement_EditWallet_Account_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AhwBna();
        djBIcL();
    }

    private final void djBIcL() {
        if (this.values.length() == 0) {
            finish();
            return;
        }
        AbstractC16288ehB abstractC16288ehB = this.EZpvd;
        AbstractC16288ehB abstractC16288ehB2 = null;
        if (abstractC16288ehB == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB = null;
        }
        abstractC16288ehB.copydefault.setAppBarTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.adjustVolume));
        AbstractC16288ehB abstractC16288ehB3 = this.EZpvd;
        if (abstractC16288ehB3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB3 = null;
        }
        abstractC16288ehB3.copydefault.setTitleTypeface("harmony_sans_bold.ttf");
        AbstractC16288ehB abstractC16288ehB4 = this.EZpvd;
        if (abstractC16288ehB4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16288ehB4 = null;
        }
        abstractC16288ehB4.EZpvd.setAdapter(valueOf());
        AbstractC16288ehB abstractC16288ehB5 = this.EZpvd;
        if (abstractC16288ehB5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16288ehB2 = abstractC16288ehB5;
        }
        C52794wYp c52794wYp = abstractC16288ehB2.KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.eAe$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC15218eAe copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC15218eAe activityC15218eAe) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC15218eAe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.OLrzqt(DefiWalletAccountDetailBean.AccountDetailType.RemoveWallet);
            }
        }
    }

    @Override // o.AbstractActivityC15266eBz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        refreshListData$default(this, false, 1, null);
    }

    private final void AYXKKw() {
        try {
            C32866mlf.onEvent$default("Web3WalletAccount_Details_Address_View", (TrackChannel[]) null, new Function1() { // from class: o.eAv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC15218eAe.AEQbTJ(this.EZpvd, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "addDefiTrackEvent error message :" + e.getMessage());
        }
    }

    public static final Unit AEQbTJ(ActivityC15218eAe activityC15218eAe, EventParamsList eventParamsList) {
        java.lang.String strOLrzqt;
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = activityC15218eAe.gEmmrt;
        AbstractC12782ctV abstractC12782ctV2 = null;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        if (abstractC12782ctV.AuCTelauCTel()) {
            AbstractC12782ctV abstractC12782ctV3 = activityC15218eAe.gEmmrt;
            if (abstractC12782ctV3 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV3 = null;
            }
            InterfaceC9780bbz interfaceC9780bbzCopydefault = abstractC12782ctV3.copydefault(1L);
            if (interfaceC9780bbzCopydefault != null) {
                strOLrzqt = interfaceC9780bbzCopydefault.getAddress();
                str = strOLrzqt;
            }
            str = null;
        } else {
            AbstractC12782ctV abstractC12782ctV4 = activityC15218eAe.gEmmrt;
            if (abstractC12782ctV4 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV4 = null;
            }
            C9698baW c9698baW = (C9698baW) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV4.AhwBna());
            if (c9698baW != null) {
                strOLrzqt = c9698baW.OLrzqt();
                str = strOLrzqt;
            }
            str = null;
        }
        AbstractC12782ctV abstractC12782ctV5 = activityC15218eAe.gEmmrt;
        if (abstractC12782ctV5 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV5 = null;
        }
        EventParamsList.put$default(eventParamsList, "firstWalletAccountID", abstractC12782ctV5.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "firstWalletAddress", str == null ? "" : str, false, 4, null);
        AbstractC12782ctV abstractC12782ctV6 = activityC15218eAe.gEmmrt;
        if (abstractC12782ctV6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12782ctV2 = abstractC12782ctV6;
        }
        EventParamsList.put$default(eventParamsList, "walletType", abstractC12782ctV2.QwvEab().name(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshListData$default(ActivityC15218eAe activityC15218eAe, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        activityC15218eAe.OLrzqt(z);
    }

    public final void OLrzqt(final boolean z) {
        this.AYXKKw.clear();
        if (this.valueOf) {
            this.valueOf = false;
            showLoadingAtOnceCannotCancel();
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.values, true);
        final Function1 function1 = new Function1() { // from class: o.eAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.KWHzl(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.eAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC15218eAe.fetchVPNInfo(function1, obj);
            }
        }).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.eAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.EZpvd(this.KWHzl, z, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.eAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC15218eAe.values(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.eAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC15218eAe.fARcdN(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.eAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.OLrzqt(this.EZpvd, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15218eAe.fJNWhG(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.eAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.KWHzl(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15218eAe.fIwbmz(function15, obj);
            }
        }));
    }

    public static final AbstractC12782ctV fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final AbstractC12782ctV KWHzl(ActivityC15218eAe activityC15218eAe, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        activityC15218eAe.gEmmrt = abstractC12782ctV;
        activityC15218eAe.AYXKKw();
        activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.Application(abstractC12782ctV, abstractC12782ctV.AkhnZx()));
        activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.StateListAnimator(0, 1, null));
        if (abstractC12782ctV.QwvEab() != WalletType.TrackingWallet) {
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.ActionBar(DefiWalletAccountDetailBean.AccountDetailType.AccountAddress, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSession), "", 0, 0, true, false, 0, 216, null));
        } else {
            ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
            if (chainAddress != null && (address = chainAddress.getAddress()) != null) {
                str = address;
            }
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.Activity(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSession), str, DefiWalletAccountDetailBean.AccountContentType.AccountAddress));
        }
        int i = Activity.AEQbTJ[abstractC12782ctV.QwvEab().ordinal()];
        if (i == 1 || i == 2) {
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.StateListAnimator(0, 1, null));
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.ActionBar(DefiWalletAccountDetailBean.AccountDetailType.CheckPrivateKey, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaControllerCallbackStubProxy), "", 0, 0, true, false, 0, 216, null));
        } else if (i == 3) {
            if (abstractC12782ctV.DCUTEIdCUTEI()) {
                activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.StateListAnimator(0, 1, null));
                activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.ActionBar(DefiWalletAccountDetailBean.AccountDetailType.MPCCheckPrivateKey, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaControllerCallbackStubProxy), "", 0, 0, true, false, 0, 216, null));
            }
        } else if (i == 4 && !abstractC12782ctV.wlaJM() && !abstractC12782ctV.iwGUEr()) {
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.StateListAnimator(0, 1, null));
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.ActionBar(DefiWalletAccountDetailBean.AccountDetailType.CheckPrivateKey, C33070mpX.AYXKKw(C13754dXa.FragmentManager.addQueueItem), "", 0, 0, true, false, 0, 216, null));
        }
        return abstractC12782ctV;
    }

    public static final InterfaceC60096zvd values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(ActivityC15218eAe activityC15218eAe, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC12782ctV abstractC12782ctV2 = activityC15218eAe.gEmmrt;
        AbstractC12782ctV abstractC12782ctV3 = null;
        if (abstractC12782ctV2 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV2 = null;
        }
        if (abstractC12782ctV2.AuCTelauCTel()) {
            AbstractC12782ctV abstractC12782ctV4 = activityC15218eAe.gEmmrt;
            if (abstractC12782ctV4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC12782ctV3 = abstractC12782ctV4;
            }
            if (!abstractC12782ctV3.QfsBiF() && !z) {
                return activityC15218eAe.KWHzl();
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final Unit fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(ActivityC15218eAe activityC15218eAe, java.lang.String str) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(str, "");
        activityC15218eAe.KWHzl = str;
        AbstractC16288ehB abstractC16288ehB = null;
        if (str.length() > 0) {
            activityC15218eAe.AYXKKw.add(new DefiWalletAccountDetailBean.StateListAnimator(0, 1, null));
            java.util.ArrayList<DefiWalletAccountDetailBean> arrayList = activityC15218eAe.AYXKKw;
            DefiWalletAccountDetailBean.AccountDetailType accountDetailType = DefiWalletAccountDetailBean.AccountDetailType.BindSmartAccount;
            AbstractC12782ctV abstractC12782ctV = activityC15218eAe.gEmmrt;
            if (abstractC12782ctV == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV = null;
            }
            if (abstractC12782ctV.getFieldNames()) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onVolumeInfoChanged);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.addQueueItemAt);
            }
            arrayList.add(new DefiWalletAccountDetailBean.ActionBar(accountDetailType, strAYXKKw, C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null), 0, 0, true, false, 0, 216, null));
        }
        AbstractC12782ctV abstractC12782ctV2 = activityC15218eAe.gEmmrt;
        if (abstractC12782ctV2 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV2 = null;
        }
        int i = Activity.AEQbTJ[abstractC12782ctV2.QwvEab().ordinal()];
        if (i == 2) {
            AbstractC16288ehB abstractC16288ehB2 = activityC15218eAe.EZpvd;
            if (abstractC16288ehB2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16288ehB2 = null;
            }
            abstractC16288ehB2.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onShuffleModeChanged));
            AbstractC16288ehB abstractC16288ehB3 = activityC15218eAe.EZpvd;
            if (abstractC16288ehB3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16288ehB = abstractC16288ehB3;
            }
            abstractC16288ehB.OLrzqt.setVisibility(0);
        } else if (i == 4) {
            AbstractC12782ctV abstractC12782ctV3 = activityC15218eAe.gEmmrt;
            if (abstractC12782ctV3 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV3 = null;
            }
            if (abstractC12782ctV3.DarRvM() == WalletType.KeyWallet) {
                AbstractC16288ehB abstractC16288ehB4 = activityC15218eAe.EZpvd;
                if (abstractC16288ehB4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16288ehB4 = null;
                }
                abstractC16288ehB4.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onShuffleModeChanged));
                AbstractC16288ehB abstractC16288ehB5 = activityC15218eAe.EZpvd;
                if (abstractC16288ehB5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16288ehB = abstractC16288ehB5;
                }
                abstractC16288ehB.OLrzqt.setVisibility(0);
            } else {
                AbstractC16288ehB abstractC16288ehB6 = activityC15218eAe.EZpvd;
                if (abstractC16288ehB6 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16288ehB = abstractC16288ehB6;
                }
                abstractC16288ehB.OLrzqt.setVisibility(8);
            }
        } else if (i != 5) {
            AbstractC16288ehB abstractC16288ehB7 = activityC15218eAe.EZpvd;
            if (abstractC16288ehB7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16288ehB = abstractC16288ehB7;
            }
            abstractC16288ehB.OLrzqt.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC15218eAe activityC15218eAe, Unit unit) {
        activityC15218eAe.dismissLoading();
        C33064mpR.OLrzqt(activityC15218eAe.valueOf(), (java.util.List<? extends java.lang.Object>) activityC15218eAe.AYXKKw);
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15218eAe, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC15218eAe activityC15218eAe, java.lang.Throwable th) {
        if ((th instanceof ResponseFailedException) || (th instanceof OKServerException)) {
            activityC15218eAe.OLrzqt(true);
        } else {
            pUU.copydefault(activityC15218eAe.getTAG(), "refreshListData error message :" + th.getMessage());
            activityC15218eAe.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.eBz.KWHzl()V */
    public final AbstractC58185ywX<java.lang.String> KWHzl() {
        final java.lang.String eoaAddress;
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        final long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        AbstractC12782ctV abstractC12782ctV = this.gEmmrt;
        AbstractC12782ctV abstractC12782ctV2 = null;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        if (abstractC12782ctV.getFieldNames()) {
            AbstractC12782ctV abstractC12782ctV3 = this.gEmmrt;
            if (abstractC12782ctV3 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV3 = null;
            }
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV3, jFetchVPNInfo, null, 2, null);
            if (chainAddress == null || (eoaAddress = chainAddress.getEoaAddress()) == null) {
                eoaAddress = "";
            }
            AbstractC12782ctV abstractC12782ctV4 = this.gEmmrt;
            if (abstractC12782ctV4 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV4 = null;
            }
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV4.gwTjWJ();
            if (abstractC12784ctXGwTjWJ != null) {
                AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(abstractC12784ctXGwTjWJ.EZpvd());
                final Function1 function1 = new Function1() { // from class: o.eAu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC15218eAe.KWHzl(jFetchVPNInfo, eoaAddress, this, (AbstractC12784ctX) obj);
                    }
                };
                abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.eAr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ActivityC15218eAe.isConnected(function1, obj);
                    }
                }).bO_();
            }
            AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(eoaAddress);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        AbstractC12782ctV abstractC12782ctV5 = this.gEmmrt;
        if (abstractC12782ctV5 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV5 = null;
        }
        java.lang.String strEZpvd = abstractC12782ctV5.EZpvd(jFetchVPNInfo);
        AbstractC12782ctV abstractC12782ctV6 = this.gEmmrt;
        if (abstractC12782ctV6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12782ctV2 = abstractC12782ctV6;
        }
        AbstractC58185ywX<java.util.List<AbstractC12782ctV>> abstractC58185ywXEZpvd = instance$default.KWHzl(strEZpvd, abstractC12782ctV2.QwvEab()).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.eAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.EZpvd(this.copydefault, jFetchVPNInfo, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.eAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC15218eAe.DbNXlk(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.eAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.KWHzl((AAAddressResponse) obj);
            }
        };
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.eAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC15218eAe.AkhnZx(function13, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(long j, java.lang.String str, ActivityC15218eAe activityC15218eAe, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        for (AbstractC12782ctV abstractC12782ctV : abstractC12784ctX.KWHzl()) {
            ChainAddress chainAddress = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV, j, null, 2, null);
            if (Intrinsics.EZpvd((java.lang.Object) (chainAddress != null ? chainAddress.getAddress() : null), (java.lang.Object) str)) {
                activityC15218eAe.AEQbTJ = abstractC12782ctV.DbNXlk();
            }
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(ActivityC15218eAe activityC15218eAe, long j, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC12782ctV abstractC12782ctV = activityC15218eAe.gEmmrt;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        java.lang.String strEZpvd = abstractC12782ctV.EZpvd(j);
        if (list.isEmpty()) {
            return C43423rox.unwrapResponseData$default(new C13934dbu().OLrzqt(strEZpvd), (Function1) null, 1, (java.lang.Object) null);
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        java.lang.String strEZpvd2 = abstractC12782ctV2.EZpvd(j);
        activityC15218eAe.AEQbTJ = abstractC12782ctV2.DbNXlk();
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new AAAddressResponse(strEZpvd2));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final java.lang.String AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String KWHzl(AAAddressResponse aAAddressResponse) {
        Intrinsics.checkNotNullParameter(aAAddressResponse, "");
        return aAAddressResponse.getAaAddress();
    }

    private final void AkhnZx() {
        java.lang.String strEZpvd;
        C18521fjv.TaskDescription taskDescription = C18521fjv.Companion;
        AbstractC12782ctV abstractC12782ctV = this.gEmmrt;
        AbstractC12782ctV abstractC12782ctV2 = null;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        java.lang.String str = (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) ? "" : strEZpvd;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.aappFQ);
        AbstractC12782ctV abstractC12782ctV3 = this.gEmmrt;
        if (abstractC12782ctV3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12782ctV2 = abstractC12782ctV3;
        }
        C18521fjv c18521fjvKWHzl = taskDescription.KWHzl(1, (20 & 2) != 0 ? "" : str, (20 & 4) != 0 ? "" : null, (20 & 8) != 0 ? "" : strAYXKKw, (20 & 16) != 0 ? "" : null, (20 & 32) == 0 ? abstractC12782ctV2.AkhnZx() : "");
        c18521fjvKWHzl.show(getSupportFragmentManager(), ActivityC15218eAe.class.getName());
        c18521fjvKWHzl.KWHzl(new Function1() { // from class: o.eAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(final ActivityC15218eAe activityC15218eAe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC15218eAe.showLoadingAtOnceCannotCancel();
        DefiWalletAccountDetailBean defiWalletAccountDetailBean = (DefiWalletAccountDetailBean) CollectionsKt___CollectionsKt.AuCTelauCTel(activityC15218eAe.AYXKKw);
        AbstractC12782ctV abstractC12782ctV = null;
        if (defiWalletAccountDetailBean instanceof DefiWalletAccountDetailBean.Application) {
            ((DefiWalletAccountDetailBean.Application) defiWalletAccountDetailBean).EZpvd(str);
            C33064mpR.OLrzqt(activityC15218eAe.valueOf(), (java.util.List<? extends java.lang.Object>) activityC15218eAe.AYXKKw);
        } else {
            refreshListData$default(activityC15218eAe, false, 1, null);
        }
        AbstractC12782ctV abstractC12782ctV2 = activityC15218eAe.gEmmrt;
        if (abstractC12782ctV2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC12782ctV = abstractC12782ctV2;
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC12782ctV.fIwbmz(str), activityC15218eAe);
        final Function1 function1 = new Function1() { // from class: o.eAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.OLrzqt(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15218eAe.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15218eAe.OLrzqt(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15218eAe.AuCTel(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC15218eAe activityC15218eAe, java.lang.Integer num) {
        activityC15218eAe.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC15218eAe activityC15218eAe, java.lang.Throwable th) {
        pUU.copydefault(activityC15218eAe.getTAG(), "walletRename error message :" + th.getMessage());
        activityC15218eAe.dismissLoading();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(DefiWalletAccountDetailBean.AccountDetailType accountDetailType) {
        AbstractC12782ctV abstractC12782ctV;
        AbstractC12782ctV abstractC12782ctV2;
        AbstractC12782ctV abstractC12782ctV3;
        int i = Activity.EZpvd[accountDetailType.ordinal()];
        AbstractC12782ctV abstractC12782ctV4 = null;
        AbstractC12782ctV abstractC12782ctV5 = null;
        AbstractC12782ctV abstractC12782ctV6 = null;
        if (i == 1) {
            AbstractC12782ctV abstractC12782ctV7 = this.gEmmrt;
            if (abstractC12782ctV7 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV7 = null;
            }
            if (abstractC12782ctV7.zLjUOn()) {
                AbstractC12782ctV abstractC12782ctV8 = this.gEmmrt;
                if (abstractC12782ctV8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV8 = null;
                }
                if (abstractC12782ctV8.ORxRYg()) {
                    AbstractC12782ctV abstractC12782ctV9 = this.gEmmrt;
                    if (abstractC12782ctV9 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC12782ctV4 = abstractC12782ctV9;
                    }
                    if (abstractC12782ctV4.DCUTEIdCUTEI()) {
                        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertDialogBuilder), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null);
                        return;
                    }
                } else {
                    AbstractC12782ctV abstractC12782ctV10 = this.gEmmrt;
                    if (abstractC12782ctV10 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC12782ctV10 = null;
                    }
                    if (abstractC12782ctV10.AEQbTJ(WalletType.MPCWallet)) {
                    }
                }
                ActivityC15219eAf.Companion.EZpvd(this, this.values);
                return;
            }
            C14325djN c14325djN = new C14325djN();
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            AbstractC12782ctV abstractC12782ctV11 = this.gEmmrt;
            if (abstractC12782ctV11 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV = null;
            } else {
                abstractC12782ctV = abstractC12782ctV11;
            }
            C14325djN.showBackupTipDialog$default(c14325djN, this, supportFragmentManager, abstractC12782ctV, null, 8, null);
            return;
        }
        if (i == 2) {
            C32866mlf.onEvent$default("Web3WalletManagement_EditAccount_PrivateKey_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            AbstractC12782ctV abstractC12782ctV12 = this.gEmmrt;
            if (abstractC12782ctV12 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV12 = null;
            }
            if (!abstractC12782ctV12.zLjUOn()) {
                C14325djN c14325djN2 = new C14325djN();
                androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                AbstractC12782ctV abstractC12782ctV13 = this.gEmmrt;
                if (abstractC12782ctV13 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV2 = null;
                } else {
                    abstractC12782ctV2 = abstractC12782ctV13;
                }
                C14325djN.showBackupTipDialog$default(c14325djN2, this, supportFragmentManager2, abstractC12782ctV2, null, 8, null);
                return;
            }
            if (C13912dbY.copydefault.gEmmrt()) {
                ActivityC18750foL.Companion.OLrzqt(this, this.values, "route_defi_wallet_detail", 1);
                return;
            } else {
                ActivityC18691fnF.Companion.AEQbTJ(this, this.values, "route_defi_wallet_detail", 1);
                return;
            }
        }
        if (i == 3) {
            AbstractC12782ctV abstractC12782ctV14 = this.gEmmrt;
            if (abstractC12782ctV14 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV14 = null;
            }
            if (!abstractC12782ctV14.zLjUOn()) {
                C14325djN c14325djN3 = new C14325djN();
                androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                AbstractC12782ctV abstractC12782ctV15 = this.gEmmrt;
                if (abstractC12782ctV15 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC12782ctV3 = null;
                } else {
                    abstractC12782ctV3 = abstractC12782ctV15;
                }
                C14325djN.showBackupTipDialog$default(c14325djN3, this, supportFragmentManager3, abstractC12782ctV3, null, 8, null);
                return;
            }
            fGT fgtGEmmrt = gEmmrt();
            AbstractC12782ctV abstractC12782ctV16 = this.gEmmrt;
            if (abstractC12782ctV16 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC12782ctV6 = abstractC12782ctV16;
            }
            fgtGEmmrt.KWHzl(this, abstractC12782ctV6, "DefiWalletDetailActivity", new Function0() { // from class: o.eAj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC15218eAe.AhwBna(this.EZpvd);
                }
            });
            return;
        }
        if (i == 4) {
            eAM.ActionBar actionBar = eAM.Companion;
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.KWHzl;
            AbstractC12782ctV abstractC12782ctV17 = this.gEmmrt;
            if (abstractC12782ctV17 == null) {
                Intrinsics.gEmmrt("");
                abstractC12782ctV17 = null;
            }
            java.lang.String strAkhnZx = abstractC12782ctV17.AkhnZx();
            AbstractC12782ctV abstractC12782ctV18 = this.gEmmrt;
            if (abstractC12782ctV18 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC12782ctV5 = abstractC12782ctV18;
            }
            actionBar.copydefault(this, str, str2, strAkhnZx, abstractC12782ctV5.QwvEab().ordinal());
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        C17237eyx c17237eyx = this.AhwBna;
        AbstractC12782ctV abstractC12782ctV19 = this.gEmmrt;
        if (abstractC12782ctV19 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV19 = null;
        }
        java.lang.String strDbNXlk = abstractC12782ctV19.DbNXlk();
        AbstractC12782ctV abstractC12782ctV20 = this.gEmmrt;
        if (abstractC12782ctV20 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV20 = null;
        }
        WalletType walletTypeQwvEab = abstractC12782ctV20.QwvEab();
        AbstractC12782ctV abstractC12782ctV21 = this.gEmmrt;
        if (abstractC12782ctV21 == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV21 = null;
        }
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV21.gwTjWJ();
        c17237eyx.EZpvd(new C17263ezW(this, strDbNXlk, walletTypeQwvEab, abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.fJNWhG() : null, true, "DefiWalletAccountDetailActivity", null, 64, null));
    }

    public static final Unit AhwBna(ActivityC15218eAe activityC15218eAe) {
        refreshListData$default(activityC15218eAe, false, 1, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(DefiWalletAccountDetailBean.AccountContentType accountContentType) {
        java.lang.String address;
        if (Activity.OLrzqt[accountContentType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC12782ctV abstractC12782ctV = this.gEmmrt;
        if (abstractC12782ctV == null) {
            Intrinsics.gEmmrt("");
            abstractC12782ctV = null;
        }
        ChainAddress chainAddress = (ChainAddress) CollectionsKt___CollectionsKt.firstOrNull(abstractC12782ctV.valueOf());
        if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
            return;
        }
        C19595gIe.StateListAnimator.newInstance$default(C19595gIe.Companion, null, address, 1, null).KWHzl(this);
        copydefault(address);
    }

    private final void copydefault(java.lang.String str) {
        java.lang.Object systemService = getSystemService("clipboard");
        Intrinsics.copydefault(systemService, "");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", str));
    }

    @Override // o.AbstractActivityC15266eBz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC15266eBz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC15266eBz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
