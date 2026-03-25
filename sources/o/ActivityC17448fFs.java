package o;

import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.components.track.TrackChannel;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17435fFf;
import o.ActivityC17448fFs;
import o.C10407bnq;
import o.C13754dXa;
import o.C17351fCc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fFs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17448fFs extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public AbstractC16398ejF AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.fFx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17448fFs.AEQbTJ();
        }
    });
    public final long AYXKKw = 600;
    public boolean KWHzl = true;
    public android.os.Handler EZpvd = new android.os.Handler(android.os.Looper.getMainLooper());
    public java.lang.Runnable OLrzqt = new java.lang.Runnable() { // from class: o.fFA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            ActivityC17448fFs.OLrzqt(this.KWHzl);
        }
    };
    public java.lang.String djBIcL = "";

    /* JADX INFO: renamed from: o.fFs$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public ActivityC17448fFs() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(fGT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeMpcWalletListActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.fFs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fFs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ void start$default(Activity activity, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            activity.KWHzl(context, str);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17448fFs.class);
            intent.putExtra("root_wallet_id", str);
            context.startActivity(intent);
        }
    }

    public final C17351fCc.Activity KWHzl() {
        return (C17351fCc.Activity) this.gEmmrt.getValue();
    }

    public static final C17351fCc.Activity AEQbTJ() {
        return new C17351fCc.Activity();
    }

    private final fGT EZpvd() {
        return (fGT) this.AhwBna.getValue();
    }

    public static final void OLrzqt(ActivityC17448fFs activityC17448fFs) {
        activityC17448fFs.dismissLoading();
        activityC17448fFs.OLrzqt();
    }

    private final void AhwBna() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.djBIcL = stringExtra;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = (AbstractC16398ejF) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.USBtdM);
        AbstractC16398ejF abstractC16398ejF = null;
        C32866mlf.onEvent$default("Web3WalletSetting_Top_EmergencyExit_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        AhwBna();
        AYXKKw();
        AbstractC16398ejF abstractC16398ejF2 = this.AEQbTJ;
        if (abstractC16398ejF2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16398ejF = abstractC16398ejF2;
        }
        OKAlertBanner oKAlertBanner = abstractC16398ejF.AEQbTJ;
        oKAlertBanner.setVisibility(0);
        oKAlertBanner.setLeadingIcon(ContextCompat.getDrawable(this, C13754dXa.Activity.UeEOUB));
        EZpvd().copydefault().observe(this, new Observer() { // from class: o.fFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC17448fFs.OLrzqt((java.lang.Integer) obj);
            }
        });
        EZpvd().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.fFz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.EZpvd(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
        EZpvd().OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.fFB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final void OLrzqt(java.lang.Integer num) {
        if (num != null && num.intValue() == 0) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaControllerCompatApi21PlaybackInfo), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        if (num != null && num.intValue() == 1) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.getAudioAttributes, 0, 1, (java.lang.Object) null);
        } else {
            if (num == null) {
                return;
            }
            num.intValue();
        }
    }

    public static final Unit EZpvd(ActivityC17448fFs activityC17448fFs, java.lang.Integer num) {
        if (num != null && num.intValue() == 0) {
            activityC17448fFs.dismissLoading();
            activityC17448fFs.gEmmrt();
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            AbstractC12782ctV abstractC12782ctVEZpvd = activityC17448fFs.EZpvd().EZpvd();
            if (abstractC12782ctVEZpvd != null) {
                fGT fgtEZpvd = activityC17448fFs.EZpvd();
                MpcWalletDecodeInfo mpcWalletDecodeInfoKWHzl = activityC17448fFs.EZpvd().KWHzl();
                Intrinsics.copydefault(mpcWalletDecodeInfoKWHzl);
                fgtEZpvd.copydefault(activityC17448fFs, mpcWalletDecodeInfoKWHzl, activityC17448fFs.EZpvd().AYXKKw(), activityC17448fFs.EZpvd().djBIcL(), num.intValue(), abstractC12782ctVEZpvd, "EscapeMpcWalletListActivity");
            }
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
            activityC17448fFs.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC17448fFs activityC17448fFs, java.util.List list) {
        if (list == null) {
            return Unit.INSTANCE;
        }
        activityC17448fFs.KWHzl().EZpvd((java.util.List<? extends fDL<java.lang.Object>>) list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            fDL<java.lang.Object> fdl = (fDL) it.next();
            if (fdl instanceof Application) {
                Application application = (Application) fdl;
                boolean zKWHzl = activityC17448fFs.EZpvd().KWHzl(application.copydefault());
                application.AEQbTJ(zKWHzl);
                if (zKWHzl) {
                    activityC17448fFs.KWHzl().KWHzl(fdl);
                }
            } else {
                activityC17448fFs.KWHzl().KWHzl(fdl);
            }
        }
        activityC17448fFs.KWHzl().notifyDataSetChanged();
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17448fFs, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.KWHzl) {
            showLoading();
            this.EZpvd.postDelayed(this.OLrzqt, this.AYXKKw);
        } else {
            this.EZpvd.post(this.OLrzqt);
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C10407bnq.refreshAllWalletAsset$default(C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null), 0, null, false, 7, null), this);
        final Function1 function1 = new Function1() { // from class: o.fFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.KWHzl(this.EZpvd, jCurrentTimeMillis, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17448fFs.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.AEQbTJ(this.copydefault, jCurrentTimeMillis, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17448fFs.copydefault(function12, obj);
            }
        });
    }

    public static final void OLrzqt(ActivityC17448fFs activityC17448fFs, long j) {
        if (activityC17448fFs.KWHzl) {
            activityC17448fFs.KWHzl = false;
            if (java.lang.System.currentTimeMillis() - j < activityC17448fFs.AYXKKw) {
                activityC17448fFs.EZpvd.removeCallbacksAndMessages(null);
                activityC17448fFs.EZpvd.post(activityC17448fFs.OLrzqt);
                return;
            }
            return;
        }
        activityC17448fFs.EZpvd.post(activityC17448fFs.OLrzqt);
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ActivityC17448fFs activityC17448fFs, long j, java.util.List list) {
        OLrzqt(activityC17448fFs, j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC17448fFs activityC17448fFs, long j, java.lang.Throwable th) {
        OLrzqt(activityC17448fFs, j);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.KWHzl = false;
    }

    private final void OLrzqt() {
        EZpvd().OLrzqt(this.djBIcL);
    }

    private final void AYXKKw() {
        AbstractC16398ejF abstractC16398ejF = this.AEQbTJ;
        AbstractC16398ejF abstractC16398ejF2 = null;
        if (abstractC16398ejF == null) {
            Intrinsics.gEmmrt("");
            abstractC16398ejF = null;
        }
        abstractC16398ejF.copydefault.setHasFixedSize(true);
        AbstractC16398ejF abstractC16398ejF3 = this.AEQbTJ;
        if (abstractC16398ejF3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16398ejF2 = abstractC16398ejF3;
        }
        abstractC16398ejF2.copydefault.setAdapter(KWHzl());
        KWHzl().AEQbTJ(Application.class, (fDP) new C17543fJf(new Function1() { // from class: o.fFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.EZpvd(this.KWHzl, (ActivityC17448fFs.Application) obj);
            }
        }));
        KWHzl().AEQbTJ(cCS.class, (fDP) new C17540fJc(new Function1() { // from class: o.fFJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.EZpvd(this.KWHzl, (AbstractC12782ctV) obj);
            }
        }));
        KWHzl().AEQbTJ(StateListAnimator.class, (fDP) new C17539fJb(new Function1() { // from class: o.fFt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.KWHzl(this.OLrzqt, (AbstractC12784ctX) obj);
            }
        }));
        KWHzl().AEQbTJ(fED.class, (fDP) new C17428fEz());
    }

    public static final Unit EZpvd(ActivityC17448fFs activityC17448fFs, Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (activityC17448fFs.KWHzl().OLrzqt(application)) {
            application.AEQbTJ(false);
            activityC17448fFs.KWHzl().AEQbTJ(application);
        } else {
            application.AEQbTJ(true);
            activityC17448fFs.KWHzl().KWHzl(application);
        }
        activityC17448fFs.EZpvd().KWHzl(application.copydefault(), application.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC17448fFs activityC17448fFs, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        activityC17448fFs.copydefault(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC17448fFs activityC17448fFs, AbstractC12784ctX abstractC12784ctX) {
        java.lang.String mpcId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        ActivityC17435fFf.Activity activity = ActivityC17435fFf.Companion;
        java.lang.String strEZpvd = abstractC12784ctX.EZpvd();
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        if (mpcWalletEncodeInfoIsConnected != null && (mpcId = mpcWalletEncodeInfoIsConnected.getMpcId()) != null) {
            str = mpcId;
        }
        activity.KWHzl(activityC17448fFs, strEZpvd, str);
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        if (!abstractC12782ctV.zLjUOn()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else if (!abstractC12782ctV.DCUTEIdCUTEI() && !abstractC12782ctV.Dmq()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            EZpvd().KWHzl(this, abstractC12782ctV, "EscapeMpcWalletListActivity", new Function0() { // from class: o.fFw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC17448fFs.copydefault(this.OLrzqt);
                }
            });
        }
    }

    public static final Unit copydefault(ActivityC17448fFs activityC17448fFs) {
        activityC17448fFs.OLrzqt();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.scanPackages);
    }

    private final void gEmmrt() {
        C14571dnv c14571dnvOLrzqt = C14571dnv.Companion.OLrzqt();
        c14571dnvOLrzqt.AEQbTJ(new Function1() { // from class: o.fFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17448fFs.AEQbTJ(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        c14571dnvOLrzqt.show(getSupportFragmentManager(), "EscapeUrgentEnterActivity");
    }

    public static final Unit AEQbTJ(ActivityC17448fFs activityC17448fFs, int i) {
        AbstractC12782ctV abstractC12782ctVEZpvd = activityC17448fFs.EZpvd().EZpvd();
        if (abstractC12782ctVEZpvd != null) {
            fGT fgtEZpvd = activityC17448fFs.EZpvd();
            MpcWalletDecodeInfo mpcWalletDecodeInfoKWHzl = activityC17448fFs.EZpvd().KWHzl();
            Intrinsics.copydefault(mpcWalletDecodeInfoKWHzl);
            fgtEZpvd.copydefault(activityC17448fFs, mpcWalletDecodeInfoKWHzl, activityC17448fFs.EZpvd().AYXKKw(), activityC17448fFs.EZpvd().djBIcL(), i, abstractC12782ctVEZpvd, "EscapeMpcWalletListActivity");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fFs$Application */
    public static final class Application implements fDL<java.lang.Object> {
        public final InterfaceC56387yDm AEQbTJ;
        public final AbstractC12784ctX OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.copydefault = z;
        }

        @Override // o.fDL
        public boolean AEQbTJ() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12784ctX copydefault() {
            return this.OLrzqt;
        }

        public Application(@NotNull AbstractC12784ctX abstractC12784ctX, boolean z) {
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            this.OLrzqt = abstractC12784ctX;
            this.copydefault = z;
            this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fFH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC17448fFs.Application.copydefault(this.copydefault);
                }
            });
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ctX)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(o.ctX, boolean):void (m)] (LINE:260) call: o.fFs.Application.<init>(o.ctX, boolean):void type: THIS */
        public /* synthetic */ Application(AbstractC12784ctX abstractC12784ctX, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC12784ctX, (i & 2) != 0 ? true : z);
        }

        private final java.util.ArrayList<java.lang.Object> KWHzl() {
            return (java.util.ArrayList) this.AEQbTJ.getValue();
        }

        public static final java.util.ArrayList copydefault(Application application) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<AbstractC12782ctV> listKWHzl = application.OLrzqt.KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (((AbstractC12782ctV) obj).QwvEab() != WalletType.AAWallet) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            if (application.OLrzqt.getNewProxyInstance()) {
                arrayList.add(new StateListAnimator(application.OLrzqt));
            }
            return arrayList;
        }

        @Override // o.fDL
        public int OLrzqt() {
            return KWHzl().size();
        }

        @Override // o.fDL
        public java.lang.Object copydefault(int i) {
            java.lang.Object obj = KWHzl().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return obj;
        }
    }

    /* JADX INFO: renamed from: o.fFs$StateListAnimator */
    public static final class StateListAnimator {
        public final AbstractC12784ctX copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12784ctX OLrzqt() {
            return this.copydefault;
        }

        public StateListAnimator(@NotNull AbstractC12784ctX abstractC12784ctX) {
            Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
            this.copydefault = abstractC12784ctX;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
