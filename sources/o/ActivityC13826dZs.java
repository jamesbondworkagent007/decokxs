package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.autofill.HintConstants;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC18418fhy;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import o.C15714eSo;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC13826dZs extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public static InterfaceC14457dln OLrzqt;
    public final InterfaceC56387yDm AYXKKw;
    public boolean copydefault;
    public AbstractC16295ehI gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String AEQbTJ = "DefiWalletSetPasswordActivity";
    public final C58216yxB KWHzl = new C58216yxB();

    /* JADX INFO: renamed from: o.dZs$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public static final void AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
    }

    public static final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    public ActivityC13826dZs() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(C19629gJl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.common.DefiWalletSetPasswordActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.common.DefiWalletSetPasswordActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.common.DefiWalletSetPasswordActivity$special$$inlined$viewModels$default$3
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
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(C19631gJn.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.common.DefiWalletSetPasswordActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.common.DefiWalletSetPasswordActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.common.DefiWalletSetPasswordActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: renamed from: o.dZs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dZs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Long l, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, boolean z, boolean z2, boolean z3, InterfaceC14457dln interfaceC14457dln) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC13826dZs.class);
            intent.putExtra("from", str);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            intent.putExtra("mnemonic", str3);
            intent.putExtra(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY, str4);
            if (l != null) {
                intent.putExtra("chain_id", l.longValue());
            }
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str5);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra(MTAnalysisConstants.Account.KEY_ACCOUNT, str6);
            intent.putExtra("isSmartContract", z);
            intent.putExtra("is_near_short_address", z2);
            intent.putExtra("isNotNeedMPCCreateGuidePage", z3);
            ActivityC13826dZs.OLrzqt = interfaceC14457dln;
            return intent;
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Long l, @NotNull java.lang.String str5, int i, @NotNull java.lang.String str6, boolean z, boolean z2, boolean z3, int i2, InterfaceC14457dln interfaceC14457dln) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC13826dZs.class);
            intent.putExtra("from", str);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            intent.putExtra("mnemonic", str3);
            intent.putExtra(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY, str4);
            if (l != null) {
                intent.putExtra("chain_id", l.longValue());
            }
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str5);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra(MTAnalysisConstants.Account.KEY_ACCOUNT, str6);
            intent.putExtra("isSmartContract", z);
            intent.putExtra("is_near_short_address", z2);
            intent.putExtra("isNotNeedMPCCreateGuidePage", z3);
            ActivityC13826dZs.OLrzqt = interfaceC14457dln;
            if (i2 == -1) {
                context.startActivity(intent);
            } else if (context instanceof android.app.Activity) {
                ((android.app.Activity) context).startActivityForResult(intent, i2);
            }
        }
    }

    private final java.lang.String AuCTel() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("from") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    public final java.lang.String AYXKKw() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
        }
        return null;
    }

    public final java.lang.String AEQbTJ() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("mnemonic") : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String ejfBZ() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.Long values() {
        android.content.Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("chain_id")) {
            return null;
        }
        return java.lang.Long.valueOf(intent.getLongExtra("chain_id", 0L));
    }

    private final java.lang.String DbNXlk() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final int fJNWhG() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    private final java.lang.String AkhnZx() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(MTAnalysisConstants.Account.KEY_ACCOUNT) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final boolean getNewProxyInstance() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isSmartContract", false);
        }
        return false;
    }

    private final boolean getFieldNames() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("is_near_short_address", false);
        }
        return false;
    }

    public final boolean AhwBna() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isNotNeedMPCCreateGuidePage", true);
        }
        return true;
    }

    private final C19629gJl fIwbmz() {
        return (C19629gJl) this.valueOf.getValue();
    }

    public final C19631gJn valueOf() {
        return (C19631gJn) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.dZs$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC13826dZs EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AbstractC16295ehI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC13826dZs activityC13826dZs, AbstractC16295ehI abstractC16295ehI) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = activityC13826dZs;
            this.OLrzqt = abstractC16295ehI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.djBIcL(Web3SecurityTrackEvent.VALUE_CONFIRM);
                this.EZpvd.copydefault();
                AbstractC16295ehI abstractC16295ehI = this.OLrzqt;
                abstractC16295ehI.AEQbTJ.smoothScrollTo(0, abstractC16295ehI.djBIcL.getHeight());
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C10856bwO.copydefault(getTAG(), 0, "onCreate");
        C32866mlf.onEvent$default("Web3Onboarding_PasswordSetting_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.dZH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13826dZs.AEQbTJ(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        this.gEmmrt = (AbstractC16295ehI) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.DTwDnp);
        C33516mxt.EZpvd(this);
        this.copydefault = true;
        final AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        if (abstractC16295ehI != null) {
            final C14775drn c14775drn = abstractC16295ehI.AYXKKw;
            c14775drn.setOnTextChanged(new Function1() { // from class: o.dZG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC13826dZs.copydefault(this.copydefault, c14775drn, (java.lang.String) obj);
                }
            });
            c14775drn.setOnFocusChanged(new Function1() { // from class: o.dZO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC13826dZs.EZpvd(this.EZpvd, c14775drn, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            final C14775drn c14775drn2 = abstractC16295ehI.EZpvd;
            c14775drn2.setOnTextChanged(new Function1() { // from class: o.dZN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC13826dZs.EZpvd(this.OLrzqt, c14775drn2, (java.lang.String) obj);
                }
            });
            c14775drn2.setOnFocusChanged(new Function1() { // from class: o.dZx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC13826dZs.copydefault(this.AEQbTJ, c14775drn2, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            c14775drn2.setOnEditorActionListener(new Function0() { // from class: o.dZy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC13826dZs.KWHzl(c14775drn2, this, abstractC16295ehI);
                }
            });
            abstractC16295ehI.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.dZz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC13826dZs.copydefault(this.OLrzqt, view);
                }
            });
            C52794wYp c52794wYp = abstractC16295ehI.copydefault;
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, abstractC16295ehI));
            OLrzqt();
        }
        isConnected();
        gEmmrt();
        fetchVPNInfo();
        fARcdN();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.dZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC13826dZs.KWHzl(this.copydefault);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC13826dZs activityC13826dZs, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C14494dmX.KWHzl.AEQbTJ(eventParamsList, activityC13826dZs.AuCTel());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC13826dZs activityC13826dZs, C14775drn c14775drn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC13826dZs.OLrzqt();
        c14775drn.values();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC13826dZs activityC13826dZs, C14775drn c14775drn, boolean z) {
        Intrinsics.copydefault(c14775drn);
        activityC13826dZs.AEQbTJ(c14775drn);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC13826dZs activityC13826dZs, C14775drn c14775drn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC13826dZs.OLrzqt();
        c14775drn.values();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC13826dZs activityC13826dZs, C14775drn c14775drn, boolean z) {
        Intrinsics.copydefault(c14775drn);
        activityC13826dZs.AEQbTJ(c14775drn);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C14775drn c14775drn, ActivityC13826dZs activityC13826dZs, AbstractC16295ehI abstractC16295ehI) {
        java.lang.String string;
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx = c14775drn.AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() >= 6) {
            activityC13826dZs.copydefault();
        } else {
            abstractC16295ehI.EZpvd.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRewind));
        }
        activityC13826dZs.EZpvd();
        abstractC16295ehI.AEQbTJ.smoothScrollTo(0, abstractC16295ehI.djBIcL.getHeight());
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC13826dZs activityC13826dZs, android.view.View view) {
        activityC13826dZs.EZpvd();
    }

    public static final void KWHzl(ActivityC13826dZs activityC13826dZs) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC13826dZs, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(C14775drn c14775drn) {
        c14775drn.EZpvd();
    }

    public final void djBIcL(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3Onboarding_PasswordSetting_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.dZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13826dZs.OLrzqt(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(ActivityC13826dZs activityC13826dZs, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C14494dmX.KWHzl.AEQbTJ(eventParamsList, activityC13826dZs.AuCTel());
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        C14775drn c14775drn;
        C14775drn c14775drn2;
        super.onResume();
        if (this.copydefault) {
            this.copydefault = false;
            AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
            if (abstractC16295ehI != null && (c14775drn2 = abstractC16295ehI.AYXKKw) != null) {
                c14775drn2.requestFocusFromTouch();
            }
            AbstractC16295ehI abstractC16295ehI2 = this.gEmmrt;
            if (abstractC16295ehI2 == null || (c14775drn = abstractC16295ehI2.AYXKKw) == null) {
                return;
            }
            c14775drn.setState(1);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.KWHzl.OLrzqt();
        C15714eSo.Companion.AEQbTJ();
    }

    public final void copydefault() {
        AbstractC58260yxt abstractC58260yxtAEQbTJ;
        java.lang.String strKWHzl = KWHzl();
        if (strKWHzl != null) {
            showLoading();
            java.lang.String strAYXKKw = AYXKKw();
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                abstractC58260yxtAEQbTJ = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ(strKWHzl, true, "set");
            } else {
                C11010bzJ instance$default = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null);
                java.lang.String strAYXKKw2 = AYXKKw();
                Intrinsics.copydefault((java.lang.Object) strAYXKKw2);
                abstractC58260yxtAEQbTJ = instance$default.KWHzl(strAYXKKw2, strKWHzl, true, "set");
            }
            final StateListAnimator stateListAnimator = new StateListAnimator(strKWHzl);
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dZD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC13826dZs.OLrzqt(stateListAnimator, obj);
                }
            };
            final Function1 function1 = new Function1() { // from class: o.dZJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC13826dZs.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dZF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC13826dZs.AEQbTJ(function1, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.dZs$StateListAnimator */
    public static final class StateListAnimator implements Function1 {
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(java.lang.String str) {
            this.OLrzqt = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            KWHzl(obj);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Object obj) {
            ActivityC13826dZs.this.dismissLoading();
            C14471dmA.EZpvd.EZpvd();
            ActivityC13826dZs.this.AEQbTJ(this.OLrzqt);
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC13826dZs activityC13826dZs, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        activityC13826dZs.dismissLoading();
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl() {
        java.lang.String string;
        C14775drn c14775drn;
        C14775drn c14775drn2;
        C14775drn c14775drn3;
        C55001xbh c55001xbhAkhnZx;
        android.text.Editable text;
        java.lang.String string2;
        C14775drn c14775drn4;
        C55001xbh c55001xbhAkhnZx2;
        android.text.Editable text2;
        AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        java.lang.String str = "";
        if (abstractC16295ehI == null || (c14775drn4 = abstractC16295ehI.AYXKKw) == null || (c55001xbhAkhnZx2 = c14775drn4.AkhnZx()) == null || (text2 = c55001xbhAkhnZx2.getText()) == null || (string = text2.toString()) == null) {
            string = "";
        }
        AbstractC16295ehI abstractC16295ehI2 = this.gEmmrt;
        if (abstractC16295ehI2 != null && (c14775drn3 = abstractC16295ehI2.EZpvd) != null && (c55001xbhAkhnZx = c14775drn3.AkhnZx()) != null && (text = c55001xbhAkhnZx.getText()) != null && (string2 = text.toString()) != null) {
            str = string2;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC16295ehI abstractC16295ehI3 = this.gEmmrt;
            if (abstractC16295ehI3 == null || (c14775drn = abstractC16295ehI3.EZpvd) == null) {
                return null;
            }
            c14775drn.values();
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) str)) {
            return string;
        }
        AbstractC16295ehI abstractC16295ehI4 = this.gEmmrt;
        if (abstractC16295ehI4 == null || (c14775drn2 = abstractC16295ehI4.EZpvd) == null) {
            return null;
        }
        c14775drn2.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.stop));
        return null;
    }

    public final void EZpvd() {
        C14775drn c14775drn;
        C14775drn c14775drn2;
        AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        if (abstractC16295ehI != null && (c14775drn2 = abstractC16295ehI.AYXKKw) != null) {
            c14775drn2.clearFocus();
        }
        AbstractC16295ehI abstractC16295ehI2 = this.gEmmrt;
        if (abstractC16295ehI2 == null || (c14775drn = abstractC16295ehI2.EZpvd) == null) {
            return;
        }
        c14775drn.clearFocus();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        boolean z;
        android.text.Editable text;
        android.text.Editable text2;
        AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        if (abstractC16295ehI != null) {
            C55001xbh c55001xbhAkhnZx = abstractC16295ehI.AYXKKw.AkhnZx();
            java.lang.Integer numValueOf = null;
            if (C33129mqd.copydefault((java.lang.Object) ((c55001xbhAkhnZx == null || (text2 = c55001xbhAkhnZx.getText()) == null) ? null : java.lang.Integer.valueOf(text2.length())), (java.lang.Object) 6)) {
                C55001xbh c55001xbhAkhnZx2 = abstractC16295ehI.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx2 != null && (text = c55001xbhAkhnZx2.getText()) != null) {
                    numValueOf = java.lang.Integer.valueOf(text.length());
                }
                if (C33129mqd.copydefault((java.lang.Object) numValueOf, (java.lang.Object) 6)) {
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC16295ehI.copydefault.setEnabled(z);
        }
    }

    public final void fetchVPNInfo() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getEnabledChangedCallbackactivity_release) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.onKeyDown, C56423yEv.EZpvd(C56390yDp.OLrzqt("termsservice", str))) + "\u200b";
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.dZw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13826dZs.copydefault((java.util.List) obj);
            }
        }, 14, null);
        AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        if (abstractC16295ehI != null && (appCompatTextView2 = abstractC16295ehI.AhwBna) != null) {
            appCompatTextView2.setText(charSequence);
        }
        AbstractC16295ehI abstractC16295ehI2 = this.gEmmrt;
        if (abstractC16295ehI2 == null || (appCompatTextView = abstractC16295ehI2.AhwBna) == null) {
            return;
        }
        AbstractC16295ehI abstractC16295ehI3 = this.gEmmrt;
        appCompatTextView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(abstractC16295ehI3 != null ? abstractC16295ehI3.AhwBna : null, str2, str, new Function0() { // from class: o.dZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC13826dZs.gEmmrt(this.KWHzl);
            }
        }));
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC13826dZs activityC13826dZs) {
        activityC13826dZs.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.PickVisualMediaRequest));
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.onTabUnselected, C56423yEv.EZpvd(C56390yDp.OLrzqt("learnmore", str))) + "\u200b";
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.dZq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13826dZs.OLrzqt((java.util.List) obj);
            }
        }, 14, null);
        AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        if (abstractC16295ehI != null && (textView2 = abstractC16295ehI.valueOf) != null) {
            textView2.setText(charSequence);
        }
        AbstractC16295ehI abstractC16295ehI2 = this.gEmmrt;
        if (abstractC16295ehI2 == null || (textView = abstractC16295ehI2.valueOf) == null) {
            return;
        }
        AbstractC16295ehI abstractC16295ehI3 = this.gEmmrt;
        textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(abstractC16295ehI3 != null ? abstractC16295ehI3.valueOf : null, str2, str, new Function0() { // from class: o.dZu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC13826dZs.valueOf(this.KWHzl);
            }
        }));
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ActivityC13826dZs activityC13826dZs) {
        activityC13826dZs.djBIcL("learn_more");
        activityC13826dZs.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActionBarLayoutParams));
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        C33570myu.copydefault((android.app.Activity) this);
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    public final void djBIcL() {
        if (fJNWhG() == 1) {
            dZK.AEQbTJ.AEQbTJ(this, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) AuCTel(), (java.lang.Object) "cefi")) {
            setResult(-1);
        }
        finish();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [390=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r0.equals("create_mpc") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r0.equals("restore_mpc") == false) goto L42;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(java.lang.String str) {
        java.lang.String strAuCTel = AuCTel();
        switch (strAuCTel.hashCode()) {
            case -1470420798:
                if (strAuCTel.equals("mnemonic")) {
                    OLrzqt(AEQbTJ(), str);
                    return;
                }
                finish();
                return;
            case -1352294148:
                if (strAuCTel.equals("create")) {
                    KWHzl(str);
                    return;
                }
                finish();
                return;
            case -1194150036:
                if (strAuCTel.equals("icloud")) {
                    android.content.Intent intent = getIntent();
                    intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str);
                    Unit unit = Unit.INSTANCE;
                    setResult(-1, intent);
                    finish();
                    return;
                }
                finish();
                return;
            case 3049637:
                if (strAuCTel.equals("cefi")) {
                    KWHzl(str);
                    return;
                }
                finish();
                return;
            case 330281455:
                break;
            case 951351530:
                if (strAuCTel.equals("connect")) {
                    return;
                }
                finish();
                return;
            case 1270488759:
                if (strAuCTel.equals("tracking")) {
                    OLrzqt(str);
                    return;
                }
                finish();
                return;
            case 1369545053:
                break;
            case 1971943843:
                if (strAuCTel.equals(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY)) {
                    android.content.Intent intent2 = getIntent();
                    intent2.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str);
                    intent2.putExtra(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY, ejfBZ());
                    java.lang.Long lValues = values();
                    if (lValues != null) {
                        intent2.putExtra("chain_id", lValues.longValue());
                    }
                    Unit unit2 = Unit.INSTANCE;
                    setResult(-1, intent2);
                    finish();
                    return;
                }
                finish();
                return;
            default:
                finish();
                return;
        }
        copydefault(str);
        finish();
    }

    public final void KWHzl(java.lang.String str) {
        C19629gJl c19629gJlFIwbmz = fIwbmz();
        int iFJNWhG = fJNWhG();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        C19629gJl.createHDWallet$default(c19629gJlFIwbmz, str, supportFragmentManager, iFJNWhG, null, 8, null);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        InterfaceC14457dln interfaceC14457dln = OLrzqt;
        if (interfaceC14457dln != null) {
            if (interfaceC14457dln instanceof C14462dls) {
                ((C14462dls) interfaceC14457dln).AEQbTJ(this);
            } else if (interfaceC14457dln instanceof C14456dlm) {
                ((C14456dlm) interfaceC14457dln).AEQbTJ(this);
            }
        }
        InterfaceC14457dln c14458dlo = OLrzqt;
        if (c14458dlo == null) {
            if (fJNWhG() == 1) {
                c14458dlo = new C14459dlp(this, false, 2, null);
            } else {
                c14458dlo = new C14458dlo(this);
            }
        }
        valueOf().OLrzqt(str2, str, false, false, getSupportFragmentManager(), c14458dlo);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fhy.StateListAnimator.startActivity$default(o.fhy$StateListAnimator, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, o.dln, java.util.List, int, java.lang.Object):void */
    public final void OLrzqt(java.lang.String str) {
        ActivityC18418fhy.StateListAnimator stateListAnimator = ActivityC18418fhy.Companion;
        java.lang.String strDbNXlk = DbNXlk();
        boolean newProxyInstance = getNewProxyInstance();
        stateListAnimator.OLrzqt(this, (784 & 2) != 0 ? "" : strDbNXlk, (784 & 4) != 0 ? "" : str, (784 & 8) != 0 ? "" : AkhnZx(), (784 & 16) == 0 ? null : "", (784 & 32) != 0 ? 1 : fJNWhG(), (784 & 64) != 0 ? false : newProxyInstance, (784 & 128) == 0 ? getFieldNames() : false, (784 & 256) != 0 ? null : null, (784 & 512) == 0 ? null : null);
        finish();
    }

    public final void copydefault(java.lang.String str) {
        C15714eSo.TaskDescription.step$default(C15714eSo.Companion, this, str, fJNWhG(), false, C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).fetchVPNInfo() == WalletStatus.NoWallet && AhwBna(), 8, null);
    }

    private final void fARcdN() {
        fIwbmz().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.dZC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13826dZs.AEQbTJ(this.AEQbTJ, (AbstractC12782ctV) obj);
            }
        }));
        valueOf().EZpvd().observe(this, new Observer() { // from class: o.dZA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC13826dZs.AEQbTJ((AbstractC12782ctV) obj);
            }
        });
        valueOf().OLrzqt().observe(this, new Observer() { // from class: o.dZE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC13826dZs.OLrzqt((AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC13826dZs activityC13826dZs, AbstractC12782ctV abstractC12782ctV) {
        activityC13826dZs.djBIcL();
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        C14775drn c14775drn;
        C14775drn c14775drn2;
        AbstractC16295ehI abstractC16295ehI = this.gEmmrt;
        if (abstractC16295ehI != null && (c14775drn2 = abstractC16295ehI.AYXKKw) != null) {
            c14775drn2.setContentDescription("edit_password");
        }
        AbstractC16295ehI abstractC16295ehI2 = this.gEmmrt;
        if (abstractC16295ehI2 == null || (c14775drn = abstractC16295ehI2.EZpvd) == null) {
            return;
        }
        c14775drn.setContentDescription("edit_password");
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
    public void onStart() {
        super.onStart();
    }
}
