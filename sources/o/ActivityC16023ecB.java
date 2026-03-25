package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking;
import com.okinc.business.defi.wallet.common.tonconnect.ui.prompt.ConnectionPromptActivity$collectViewState$1;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.web.WebActivity;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC54855xXv;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC16023ecB extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ = "ConnectionPromptActivity";
    public final StateListAnimator EZpvd = new StateListAnimator(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    public final InterfaceC56387yDm OLrzqt;
    public C16435ejq copydefault;

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

    public ActivityC16023ecB() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C16029ecH.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.prompt.ConnectionPromptActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.ecG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC16023ecB.KWHzl(this.KWHzl);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.common.tonconnect.ui.prompt.ConnectionPromptActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.ecB$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ecB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void copydefault(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) ActivityC16023ecB.class).putExtra("connectType", i);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            context.startActivity(intentPutExtra);
        }
    }

    public final C16029ecH copydefault() {
        return (C16029ecH) this.OLrzqt.getValue();
    }

    public static final C16029ecH AEQbTJ(ActivityC16023ecB activityC16023ecB, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.content.Context applicationContext = activityC16023ecB.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        InterfaceC13426dKx interfaceC13426dKxEZpvd = C13458dMb.EZpvd(applicationContext);
        return new C16029ecH(interfaceC13426dKxEZpvd.OcIXYQ(), interfaceC13426dKxEZpvd.ORxRYg(), interfaceC13426dKxEZpvd.wlaJM(), interfaceC13426dKxEZpvd.fJNWhG(), interfaceC13426dKxEZpvd.DTwDnp(), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16435ejq c16435ejqOLrzqt = C16435ejq.OLrzqt(getLayoutInflater());
        this.copydefault = c16435ejqOLrzqt;
        if (c16435ejqOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16435ejqOLrzqt = null;
        }
        setContentView(c16435ejqOLrzqt.getRoot());
        EZpvd();
        KWHzl();
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ConnectionPromptActivity$collectViewState$1(this, null), 3, null);
    }

    private final void KWHzl() {
        int iOLrzqt = copydefault().OLrzqt();
        java.lang.String string = getString(iOLrzqt != 2 ? iOLrzqt != 3 ? C13754dXa.FragmentManager.build : C13754dXa.FragmentManager.getIconUri : C13754dXa.FragmentManager.fromMediaDescription);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C16435ejq c16435ejq = this.copydefault;
        if (c16435ejq == null) {
            Intrinsics.gEmmrt("");
            c16435ejq = null;
        }
        final C16435ejq c16435ejq2 = c16435ejq;
        LottieAnimationView lottieAnimationView = c16435ejq2.AuCTel;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(0);
        c16435ejq2.AuCTel.playAnimation();
        RecyclerView recyclerView = c16435ejq2.iwGUEr;
        recyclerView.setAdapter(this.EZpvd);
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(4.0f, context);
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        recyclerView.addItemDecoration(new SpacingItemDecoration(iCopydefault, C55298xhM.copydefault(0.0f, context2)));
        android.widget.FrameLayout frameLayout = c16435ejq2.gEmmrt;
        frameLayout.setOnClickListener(new LoaderManager(frameLayout, 1000L, this, string));
        OKReminder oKReminder = c16435ejq2.getNewProxyInstance;
        oKReminder.setStyle(2);
        oKReminder.setMessage(getString(C13754dXa.FragmentManager.MediaDescriptionCompatApi21Builder));
        oKReminder.setCloseIconVisibility(false);
        android.widget.FrameLayout frameLayout2 = c16435ejq2.AhwBna;
        frameLayout2.setOnClickListener(new VoiceInteractor(frameLayout2, 1000L, this));
        C52794wYp c52794wYp = c16435ejq2.KWHzl;
        c52794wYp.setOnClickListener(new PictureInPictureParams(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c16435ejq2.copydefault;
        c52794wYp2.setOnClickListener(new AssistContent(c52794wYp2, 1000L, this));
        c16435ejq2.getFieldNames.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.ecC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActivityC16023ecB.KWHzl(c16435ejq2);
            }
        });
    }

    /* JADX INFO: renamed from: o.ecB$PendingIntent */
    public static final class PendingIntent implements Function2<InterfaceC9738bbJ, java.lang.Long, java.lang.Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            return java.lang.Boolean.valueOf(ActivityC16023ecB.this.copydefault().OLrzqt((AbstractC12782ctV) interfaceC9738bbJ));
        }
    }

    /* JADX INFO: renamed from: o.ecB$FragmentManager */
    public static final class FragmentManager implements InterfaceC54855xXv {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
        }

        public FragmentManager() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            ActivityC16023ecB.this.copydefault().KWHzl((AbstractC12782ctV) interfaceC9738bbJ);
        }
    }

    /* JADX INFO: renamed from: o.ecB$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C16435ejq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C16435ejq c16435ejq) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c16435ejq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.gEmmrt.callOnClick();
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC16023ecB AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC16023ecB activityC16023ecB, java.lang.String str) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC16023ecB;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                try {
                    java.lang.Object systemService = this.AEQbTJ.getSystemService("clipboard");
                    Intrinsics.copydefault(systemService, "");
                    ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, this.copydefault));
                    java.lang.String string = this.AEQbTJ.getString(C13754dXa.FragmentManager.setProfilesSinceInitCount);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("Failed to copy", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC16023ecB EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, ActivityC16023ecB activityC16023ecB) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC16023ecB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault().copydefault();
                this.EZpvd.copydefault().EZpvd(this.EZpvd.getTAG());
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ActivityC16023ecB EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC16023ecB activityC16023ecB) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = activityC16023ecB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault().EZpvd();
                this.EZpvd.copydefault().EZpvd(this.EZpvd.getTAG());
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC16023ecB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC16023ecB activityC16023ecB) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = activityC16023ecB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault().copydefault();
                this.copydefault.copydefault().EZpvd(this.copydefault.getTAG());
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ActivityC16023ecB EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC16023ecB activityC16023ecB, java.lang.String str) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = activityC16023ecB;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
                androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager, new CurrentWalletSwitchConfig(null, CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, this.OLrzqt, null, null, 1, null, null, 217, null), this.EZpvd.new PendingIntent(), null, this.EZpvd.new FragmentManager(), 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC16023ecB KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, ActivityC16023ecB activityC16023ecB) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC16023ecB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C16435ejq EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C16435ejq c16435ejq) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c16435ejq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.widget.LinearLayout linearLayout = this.EZpvd.fARcdN;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                android.widget.LinearLayout linearLayout2 = this.EZpvd.fARcdN;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout.setVisibility((linearLayout2.getVisibility() == 0) ^ true ? 0 : 8);
                C16435ejq c16435ejq = this.EZpvd;
                android.widget.ImageView imageView = c16435ejq.valueOf;
                android.widget.LinearLayout linearLayout3 = c16435ejq.fARcdN;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                imageView.setRotation(linearLayout3.getVisibility() == 0 ? 0.0f : 180.0f);
            }
        }
    }

    /* JADX INFO: renamed from: o.ecB$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC16023ecB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, ActivityC16023ecB activityC16023ecB) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = activityC16023ecB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C16025ecD c16025ecD = new C16025ecD();
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c16025ecD.show(supportFragmentManager);
            }
        }
    }

    public static final void KWHzl(C16435ejq c16435ejq) {
        boolean z = c16435ejq.getFieldNames.getHeight() < (c16435ejq.AkhnZx.getHeight() + c16435ejq.getFieldNames.getPaddingTop()) + c16435ejq.getFieldNames.getPaddingBottom();
        android.widget.LinearLayout linearLayout = c16435ejq.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = z ? 48 : 17;
            linearLayout.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void EZpvd(java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<C10854bwM> list, boolean z, C15937eaV c15937eaV) {
        C16435ejq c16435ejq = this.copydefault;
        if (c16435ejq == null) {
            Intrinsics.gEmmrt("");
            c16435ejq = null;
        }
        OKReminder oKReminder = c16435ejq.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(z ? 0 : 8);
        ConstraintLayout constraintLayout = c16435ejq.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        android.view.View view = c16435ejq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        android.widget.LinearLayout linearLayout = c16435ejq.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        C52794wYp c52794wYp = c16435ejq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        C52794wYp c52794wYp2 = c16435ejq.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(0);
        LottieAnimationView lottieAnimationView = c16435ejq.AuCTel;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(8);
        c16435ejq.AuCTel.cancelAnimation();
        android.widget.ImageView imageView = c16435ejq.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14725dqq.loadFixSizeBorderImage$default(imageView, str3, C13754dXa.Activity.aKErDB, 0.0f, 80.0f, 0, false, 48, null);
        c16435ejq.wlaJM.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.MediaDescriptionCompatBuilder, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", str))));
        c16435ejq.uzCIH.setText(str4);
        android.widget.ImageView imageView2 = c16435ejq.isConnected;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C14725dqq.loadBlockiesIcon$default(imageView2, str2, 0, null, 24.0f, 6, null);
        c16435ejq.zsXlph.setText(charSequence);
        c16435ejq.AubY.setText(pTD.EZpvd(this, C13754dXa.Dialog.OLrzqt, list.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(list.size())))));
        this.EZpvd.copydefault(list);
        ConnectEventTracking.AEQbTJ.EZpvd(copydefault().OLrzqt() == 3 ? ConnectEventTracking.Source.OKX_CONNECT : ConnectEventTracking.Source.TON_CONNECT, str, str4, list);
        if (c15937eaV != null) {
            c16435ejq.wlaJM.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.MediaMetadataCompat, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("dappName", str))));
            java.lang.String strAEQbTJ = c15937eaV.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            AbstractC8610bFv<?> abstractC8610bFvEZpvd = c15937eaV.EZpvd();
            java.lang.String strAEQbTJ2 = abstractC8610bFvEZpvd != null ? abstractC8610bFvEZpvd.AEQbTJ(true) : null;
            if (strAEQbTJ2 == null) {
                strAEQbTJ2 = "";
            }
            android.widget.TextView textView = c16435ejq.zLjUOn;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) ? 0 : 8);
            android.widget.LinearLayout linearLayout2 = c16435ejq.values;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ2) ? 0 : 8);
            android.widget.LinearLayout linearLayout3 = c16435ejq.fARcdN;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ2) ? 0 : 8);
            c16435ejq.zLjUOn.setText(strAEQbTJ);
            c16435ejq.AuCTelauCTel.setText(strAEQbTJ2);
            android.widget.LinearLayout linearLayout4 = c16435ejq.values;
            linearLayout4.setOnClickListener(new TaskDescription(linearLayout4, 1000L, c16435ejq));
            AppCompatTextView appCompatTextView = c16435ejq.AuCTelauCTel;
            appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this, strAEQbTJ2));
        }
        if (z) {
            C52794wYp c52794wYp3 = c16435ejq.copydefault;
            c52794wYp3.setText(getString(C13754dXa.FragmentManager.MediaDescriptionCompatApi23));
            c52794wYp3.setOnClickListener(new ActionBar(c52794wYp3, 1000L, c16435ejq));
        } else if (c15937eaV != null) {
            C52794wYp c52794wYp4 = c16435ejq.copydefault;
            c52794wYp4.setText(getString(C13754dXa.FragmentManager.invokespecialRtjmuc));
            c52794wYp4.setOnClickListener(new Dialog(c52794wYp4, 1000L, this));
        } else {
            C52794wYp c52794wYp5 = c16435ejq.copydefault;
            c52794wYp5.setText(getString(C13754dXa.FragmentManager.hgxRZI));
            c52794wYp5.setOnClickListener(new Fragment(c52794wYp5, 1000L, this));
        }
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(java.lang.String str) {
        C16435ejq c16435ejq = this.copydefault;
        if (c16435ejq == null) {
            Intrinsics.gEmmrt("");
            c16435ejq = null;
        }
        ConstraintLayout constraintLayout = c16435ejq.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
        android.view.View view = c16435ejq.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        android.widget.LinearLayout linearLayout = c16435ejq.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = c16435ejq.fARcdN;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
        android.widget.LinearLayout linearLayout3 = c16435ejq.values;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(8);
        C52794wYp c52794wYp = c16435ejq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(0);
        C52794wYp c52794wYp2 = c16435ejq.copydefault;
        Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
        c52794wYp2.setVisibility(8);
        LottieAnimationView lottieAnimationView = c16435ejq.AuCTel;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(0);
        c16435ejq.AuCTel.playAnimation();
        c16435ejq.wlaJM.setText(getString(C13754dXa.FragmentManager.getMediaUri));
        c16435ejq.uzCIH.setText(str);
    }

    public final void OLrzqt() {
        C16435ejq c16435ejq = this.copydefault;
        if (c16435ejq == null) {
            Intrinsics.gEmmrt("");
            c16435ejq = null;
        }
        android.widget.FrameLayout frameLayout = c16435ejq.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(0);
        java.lang.String strAYXKKw = copydefault().KWHzl().getValue().AYXKKw();
        java.lang.String string = getString(C13754dXa.FragmentManager.sYOsaF);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.CharSequence charSequence = C33574myy.setupSpanStyles$default(new android.text.SpannableString(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.RestrictToScope, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("link", strAYXKKw), C56390yDp.OLrzqt("case", string)))), new java.lang.String[]{string}, 0, null, false, new Function1() { // from class: o.ecF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16023ecB.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null);
        C57445yiZ c57445yiZ = C57445yiZ.copydefault;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        int i = C13754dXa.ActionBar.HJWChPOKBmQNaCIdOM;
        java.lang.String string2 = getString(C13754dXa.FragmentManager.min);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = getString(C13754dXa.FragmentManager.max);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c57445yiZ.copydefault(this, supportFragmentManager, i, new RiskPageInfoBean(string2, charSequence, null, string3, null, null, null, null, null, null, false, 2036, null), (496 & 16) != 0 ? null : null, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
    }

    public static final Unit EZpvd(ActivityC16023ecB activityC16023ecB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(activityC16023ecB, C52761wXj.LoaderManager.DLWbHP));
        list.add(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(activityC16023ecB, C52761wXj.Activity.fdOvFl)));
        list.add(activityC16023ecB.new TaskStackBuilder());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ecB$TaskStackBuilder */
    public static final class TaskStackBuilder extends android.text.style.ClickableSpan {
        public TaskStackBuilder() {
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", ActivityC16023ecB.this.getString(C13754dXa.FragmentManager.setDescription)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, ActivityC16023ecB.this, bundleBundleOf, null, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.ecB$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.Adapter<ActionBar> {
        public java.util.List<C10854bwM> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:379)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.bwM>):void (m)] (LINE:378) call: o.ecB.StateListAnimator.<init>(java.util.List):void type: THIS */
        public /* synthetic */ StateListAnimator(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }

        public StateListAnimator(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        /* JADX INFO: renamed from: o.ecB$StateListAnimator$ActionBar */
        public static final class ActionBar extends RecyclerView.ViewHolder {
            public final C16927etE EZpvd;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull C16927etE c16927etE) {
                super(c16927etE.getRoot());
                Intrinsics.checkNotNullParameter(c16927etE, "");
                this.EZpvd = c16927etE;
            }

            public final void EZpvd(@NotNull java.lang.String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                android.widget.ImageView imageView = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                if (!z) {
                    str = null;
                }
                C14725dqq.loadFixSizeBorderImage$default(imageView, str, z ? C52761wXj.TaskDescription.fERRXa : C13754dXa.Activity.ODWQjV, 0.0f, 24.0f, 0, false, 48, null);
            }
        }

        public final void copydefault(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16927etE c16927etEEZpvd = C16927etE.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16927etEEZpvd, "");
            return new ActionBar(c16927etEEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            actionBar.EZpvd(EZpvd().get(i), i < 4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return EZpvd().size();
        }

        public final java.util.List<java.lang.String> EZpvd() {
            java.util.List<C10854bwM> list = this.AEQbTJ;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C10854bwM) it.next()).AYXKKw());
            }
            return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 5);
        }
    }

    public static final ViewModelProvider.Factory KWHzl(final ActivityC16023ecB activityC16023ecB) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C16029ecH.class), new Function1() { // from class: o.ecI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC16023ecB.AEQbTJ(this.KWHzl, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
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
