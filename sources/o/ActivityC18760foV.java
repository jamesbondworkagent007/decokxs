package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.business.defi.wallet.mine.backup.PhraseAndPrivateKeyInputPasswordActivity$handleJump$3;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.listener.BackupMnemonicListener;
import com.okinc.web3.security.service.Web3SecurityService;
import com.okinc.web3.security.service.Web3SecurityServiceProvider;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18760foV;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.foV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18760foV extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public int AYXKKw;
    public AbstractC16357eiR copydefault;
    public java.lang.String KWHzl = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String valueOf = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.valueOf;
    }

    public ActivityC18760foV() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(C18807fpQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.backup.PhraseAndPrivateKeyInputPasswordActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.backup.PhraseAndPrivateKeyInputPasswordActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.backup.PhraseAndPrivateKeyInputPasswordActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final C18807fpQ AEQbTJ() {
        return (C18807fpQ) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.foV$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.foV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ void startActivity$default(Activity activity, android.content.Context context, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            activity.EZpvd(context, str, str2, i);
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18760foV.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("path", str2);
            intent.putExtra("type", i);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.copydefault = (AbstractC16357eiR) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.DCUTEI);
        C33516mxt.EZpvd(this);
        KWHzl();
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.foY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18760foV.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(ActivityC18760foV activityC18760foV) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18760foV, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.valueOf = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("path");
        this.OLrzqt = stringExtra2 != null ? stringExtra2 : "";
        this.AYXKKw = getIntent().getIntExtra("type", 0);
    }

    private final void OLrzqt() {
        android.widget.TextView textView;
        C52794wYp c52794wYp;
        C14775drn c14775drn;
        C52794wYp c52794wYp2;
        AbstractC16357eiR abstractC16357eiR = this.copydefault;
        if (abstractC16357eiR != null && (c52794wYp2 = abstractC16357eiR.copydefault) != null) {
            c52794wYp2.setEnabled(false);
        }
        AbstractC16357eiR abstractC16357eiR2 = this.copydefault;
        if (abstractC16357eiR2 != null && (c14775drn = abstractC16357eiR2.EZpvd) != null) {
            c14775drn.setOnTextChanged(new Function1() { // from class: o.fpb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18760foV.EZpvd(this.copydefault, (java.lang.String) obj);
                }
            });
            c14775drn.setState(1);
            C55001xbh c55001xbhAkhnZx = c14775drn.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setActivated(true);
            }
        }
        AbstractC16357eiR abstractC16357eiR3 = this.copydefault;
        if (abstractC16357eiR3 != null && (c52794wYp = abstractC16357eiR3.copydefault) != null) {
            c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        }
        AbstractC16357eiR abstractC16357eiR4 = this.copydefault;
        if (abstractC16357eiR4 == null || (textView = abstractC16357eiR4.AhwBna) == null) {
            return;
        }
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this));
    }

    public static final Unit EZpvd(ActivityC18760foV activityC18760foV, java.lang.String str) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        activityC18760foV.KWHzl = str;
        AbstractC16357eiR abstractC16357eiR = activityC18760foV.copydefault;
        if (abstractC16357eiR != null && (c52794wYp = abstractC16357eiR.copydefault) != null) {
            c52794wYp.setEnabled(str.length() > 0 && str.length() >= 6);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.foV$ActionBar */
    public static final class ActionBar implements Function1<PasswordCheckResult, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(PasswordCheckResult passwordCheckResult) {
            EZpvd(passwordCheckResult);
            return Unit.INSTANCE;
        }

        public final void EZpvd(PasswordCheckResult passwordCheckResult) {
            java.lang.String str;
            C14775drn c14775drn;
            C14775drn c14775drn2;
            C14775drn c14775drn3;
            if (passwordCheckResult.isPassed()) {
                AbstractC16357eiR abstractC16357eiR = ActivityC18760foV.this.copydefault;
                if (abstractC16357eiR != null && (c14775drn3 = abstractC16357eiR.EZpvd) != null) {
                    android.content.Context context = c14775drn3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C33054mpH.OLrzqt(context, c14775drn3);
                }
                ActivityC18760foV activityC18760foV = ActivityC18760foV.this;
                activityC18760foV.copydefault(activityC18760foV.KWHzl);
                return;
            }
            if (passwordCheckResult.isFailed()) {
                java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.fQQVvf, C56424yEw.AYXKKw(C56390yDp.OLrzqt("count", java.lang.String.valueOf(passwordCheckResult.getRemain()))));
                AbstractC16357eiR abstractC16357eiR2 = ActivityC18760foV.this.copydefault;
                if (abstractC16357eiR2 == null || (c14775drn2 = abstractC16357eiR2.EZpvd) == null) {
                    return;
                }
                c14775drn2.setErrorText(strCopydefault);
                return;
            }
            if (passwordCheckResult.isLocked()) {
                java.lang.String first = passwordCheckResult.m6402getLockRemain().getFirst();
                java.lang.String second = passwordCheckResult.m6402getLockRemain().getSecond();
                if (C33129mqd.AhwBna(first, 0)) {
                    if (C33129mqd.AhwBna(second, 0)) {
                        str = first + C33070mpX.AYXKKw(C13754dXa.FragmentManager.UJpkuA) + second + C33070mpX.AYXKKw(C13754dXa.FragmentManager.compare);
                    } else {
                        str = first + C33070mpX.AYXKKw(C13754dXa.FragmentManager.UJpkuA);
                    }
                } else {
                    str = second + C33070mpX.AYXKKw(C13754dXa.FragmentManager.compare);
                }
                AbstractC16357eiR abstractC16357eiR3 = ActivityC18760foV.this.copydefault;
                if (abstractC16357eiR3 == null || (c14775drn = abstractC16357eiR3.EZpvd) == null) {
                    return;
                }
                c14775drn.setErrorText(C33069mpW.copydefault(C13754dXa.FragmentManager.Dff, C56424yEw.AYXKKw(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str))));
            }
        }
    }

    /* JADX INFO: renamed from: o.foV$PendingIntent */
    public static final class PendingIntent implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            EZpvd(th);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.Throwable th) {
            pUU.copydefault(ActivityC18760foV.this.getTAG(), "checkPassword error message :" + th.getMessage());
        }
    }

    public static final InterfaceC58261yxu OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(java.lang.String str, final AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt = abstractC12784ctX.OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.fpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18760foV.AEQbTJ(abstractC12784ctX, (java.lang.String) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.fpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC18760foV.EZpvd(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AEQbTJ(AbstractC12784ctX abstractC12784ctX, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(abstractC12784ctX, str);
    }

    public static final Unit KWHzl(ActivityC18760foV activityC18760foV, java.lang.String str, kotlin.Pair pair) {
        java.lang.String string;
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) first;
        Web3SecurityService service = Web3SecurityServiceProvider.getService();
        if (abstractC12784ctX.AYXKKw()) {
            string = abstractC12784ctX.AuCTel();
        } else {
            string = activityC18760foV.getString(C13754dXa.FragmentManager.onExtraCallback);
            Intrinsics.copydefault((java.lang.Object) string);
        }
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        service.startBackupMnemonic(activityC18760foV, string, (java.lang.String) second, str, abstractC12784ctX.AYXKKw(), Intrinsics.EZpvd((java.lang.Object) activityC18760foV.OLrzqt, (java.lang.Object) "route_finish_activity"), activityC18760foV.new Application(abstractC12784ctX));
        activityC18760foV.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.foV$Application */
    public static final class Application implements BackupMnemonicListener {
        public final /* synthetic */ AbstractC12784ctX copydefault;

        public Application(AbstractC12784ctX abstractC12784ctX) {
            this.copydefault = abstractC12784ctX;
        }

        @Override // com.okinc.web3.security.listener.BackupMnemonicListener
        public void onOpenMnemonicArticle(android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            java.lang.String string = ActivityC18760foV.this.getString(C13754dXa.FragmentManager.GhqvEQ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", string), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
            C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3Onboarding_SeedDisplay_Button_Click, (TrackChannel[]) null, new Function1() { // from class: o.fpj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18760foV.Application.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, "info", true));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        @Override // com.okinc.web3.security.listener.BackupMnemonicListener
        public void onCheckMnemonicPassed(final android.app.Activity activity, final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function0, "");
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = this.copydefault.copydefault();
            final ActivityC18760foV activityC18760foV = ActivityC18760foV.this;
            final Function1 function1 = new Function1() { // from class: o.fpe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18760foV.Application.AEQbTJ(function0, activityC18760foV, activity, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fpd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC18760foV.Application.copydefault(function1, obj);
                }
            };
            final ActivityC18760foV activityC18760foV2 = ActivityC18760foV.this;
            final Function1 function12 = new Function1() { // from class: o.fph
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18760foV.Application.copydefault(function0, activityC18760foV2, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fpg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC18760foV.Application.EZpvd(function12, obj);
                }
            });
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [198=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static final Unit AEQbTJ(Function0 function0, ActivityC18760foV activityC18760foV, android.app.Activity activity, java.lang.Integer num) {
            Function0<Unit> function0AT_;
            function0.invoke();
            if (activityC18760foV.EZpvd().length() > 0) {
                java.lang.String strEZpvd = activityC18760foV.EZpvd();
                switch (strEZpvd.hashCode()) {
                    case -1293401068:
                        if (strEZpvd.equals("defi_main")) {
                            dZK.AEQbTJ.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
                        }
                        break;
                    case -651391466:
                        if (strEZpvd.equals("route_defi_manual_backup")) {
                            dZK.AEQbTJ.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
                        }
                        break;
                    case -38718190:
                        if (strEZpvd.equals("route_defi_wallet_detail")) {
                            eAZ.Companion.copydefault(activity, "");
                        }
                        break;
                    case 584736733:
                        if (strEZpvd.equals("route_backup_wallet_list")) {
                            ActivityC18768fod.Companion.AEQbTJ(activity);
                        }
                        break;
                    case 2100912965:
                        if (strEZpvd.equals("route_finish_activity") && (function0AT_ = ((xWS) C43251rlk.copydefault(xWS.class)).aT_()) != null) {
                            function0AT_.invoke();
                        }
                        break;
                }
            } else {
                dZK.AEQbTJ.AEQbTJ(activity, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void EZpvd(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(Function0 function0, ActivityC18760foV activityC18760foV, java.lang.Throwable th) {
            function0.invoke();
            pUU.copydefault(activityC18760foV.getTAG(), "backupWalletByMnemonic error message :" + th.getMessage());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.foV$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC18760foV EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC18760foV activityC18760foV) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC18760foV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC18553fka.Companion.AEQbTJ(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.foV$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC18760foV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC18760foV activityC18760foV) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = activityC18760foV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.addDisposable(C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(this.OLrzqt.KWHzl).AEQbTJ(new InterfaceC58227yxM(this.OLrzqt.new ActionBar()) { // from class: o.foV.Dialog
                    public final /* synthetic */ Function1 EZpvd;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.EZpvd = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.EZpvd.invoke(obj);
                    }
                }, new InterfaceC58227yxM(this.OLrzqt.new PendingIntent()) { // from class: o.foV.Dialog
                    public final /* synthetic */ Function1 EZpvd;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.EZpvd = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.EZpvd.invoke(obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final java.lang.String str) {
        int i = this.AYXKKw;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PhraseAndPrivateKeyInputPasswordActivity$handleJump$3(this, str, null), 3, null);
        } else {
            AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(this.valueOf);
            final Function1 function1 = new Function1() { // from class: o.foZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18760foV.copydefault(str, (AbstractC12784ctX) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtDjBIcL.OLrzqt(new InterfaceC58229yxO() { // from class: o.foX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC18760foV.OLrzqt(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            C11607cUn.subscribeOnIO$default(abstractC58260yxtOLrzqt, (Function1) null, new Function1() { // from class: o.foW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18760foV.KWHzl(this.KWHzl, str, (kotlin.Pair) obj);
                }
            }, 1, (java.lang.Object) null);
        }
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
