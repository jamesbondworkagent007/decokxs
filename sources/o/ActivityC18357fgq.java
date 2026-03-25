package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking;
import com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$bindConnectedState$1;
import com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$collectViewState$1;
import com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$initParams$1;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.reown.android.push.notifications.PushMessagingService;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC18445fiY;
import o.InterfaceC54855xXv;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18357fgq extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C16435ejq EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public java.lang.String AEQbTJ = "WalletConnectConnectionPromptActivity";
    public final TaskDescription copydefault = new TaskDescription(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

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

    public ActivityC18357fgq() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C18347fgg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fgr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18357fgq.gEmmrt();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.fgq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fgq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, int i, int i2, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18357fgq.class);
            intent.putExtra("connectType", i);
            intent.putExtra("initState", i2);
            intent.putExtra(PushMessagingService.KEY_TOPIC, str);
            intent.putExtra("walletId", str2);
            context.startActivity(intent);
        }
    }

    public final C18347fgg copydefault() {
        return (C18347fgg) this.OLrzqt.getValue();
    }

    public static final C18347fgg KWHzl(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C18347fgg(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null));
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16435ejq c16435ejqOLrzqt = C16435ejq.OLrzqt(getLayoutInflater());
        this.EZpvd = c16435ejqOLrzqt;
        if (c16435ejqOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16435ejqOLrzqt = null;
        }
        setContentView(c16435ejqOLrzqt.getRoot());
        KWHzl();
        EZpvd();
        valueOf();
    }

    private final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletConnectConnectionPromptActivity$collectViewState$1(this, null), 3, null);
    }

    private final void EZpvd() {
        final C16435ejq c16435ejq = this.EZpvd;
        if (c16435ejq == null) {
            Intrinsics.gEmmrt("");
            c16435ejq = null;
        }
        LottieAnimationView lottieAnimationView = c16435ejq.AuCTel;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        lottieAnimationView.setVisibility(0);
        c16435ejq.AuCTel.playAnimation();
        RecyclerView recyclerView = c16435ejq.iwGUEr;
        recyclerView.setAdapter(this.copydefault);
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(4.0f, context);
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        recyclerView.addItemDecoration(new SpacingItemDecoration(iCopydefault, C55298xhM.copydefault(0.0f, context2)));
        android.widget.FrameLayout frameLayout = c16435ejq.gEmmrt;
        frameLayout.setOnClickListener(new FragmentManager(frameLayout, 1000L, this));
        OKReminder oKReminder = c16435ejq.getNewProxyInstance;
        oKReminder.setStyle(2);
        oKReminder.setMessage(getString(C13754dXa.FragmentManager.MediaDescriptionCompatApi21Builder));
        oKReminder.setCloseIconVisibility(false);
        android.widget.FrameLayout frameLayout2 = c16435ejq.AhwBna;
        frameLayout2.setOnClickListener(new PendingIntent(frameLayout2, 1000L, this));
        C52794wYp c52794wYp = c16435ejq.KWHzl;
        c52794wYp.setOnClickListener(new Dialog(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c16435ejq.copydefault;
        c52794wYp2.setOnClickListener(new LoaderManager(c52794wYp2, 1000L, this));
        c16435ejq.getFieldNames.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.fgp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ActivityC18357fgq.OLrzqt(c16435ejq);
            }
        });
    }

    /* JADX INFO: renamed from: o.fgq$ActionBar */
    public static final class ActionBar implements Function2<InterfaceC9738bbJ, java.lang.Long, java.lang.Boolean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            return java.lang.Boolean.valueOf(ActivityC18357fgq.this.copydefault().OLrzqt((AbstractC12782ctV) interfaceC9738bbJ));
        }
    }

    /* JADX INFO: renamed from: o.fgq$Fragment */
    public static final class Fragment implements InterfaceC54855xXv {
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

        public Fragment() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            ActivityC18357fgq.this.copydefault().AEQbTJ((AbstractC12782ctV) interfaceC9738bbJ);
        }
    }

    /* JADX INFO: renamed from: o.fgq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC18357fgq EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC18357fgq activityC18357fgq) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = activityC18357fgq;
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

    /* JADX INFO: renamed from: o.fgq$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ActivityC18357fgq KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC18357fgq activityC18357fgq) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = activityC18357fgq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.fgq$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC18357fgq EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC18357fgq activityC18357fgq) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC18357fgq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
                androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                CurrentWalletSwitchNetworkMode.Ignored ignored = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
                java.lang.String string = this.EZpvd.getString(C13754dXa.FragmentManager.build);
                Intrinsics.checkNotNullExpressionValue(string, "");
                xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager, new CurrentWalletSwitchConfig(null, ignored, string, null, null, 1, null, null, 217, null), this.EZpvd.new ActionBar(), null, this.EZpvd.new Fragment(), 8, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fgq$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ActivityC18357fgq AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC18357fgq activityC18357fgq) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = activityC18357fgq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.copydefault().EZpvd();
                this.AEQbTJ.copydefault().EZpvd(this.AEQbTJ.getTAG());
            }
        }
    }

    /* JADX INFO: renamed from: o.fgq$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ActivityC18357fgq KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC18357fgq activityC18357fgq) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = activityC18357fgq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C18286ffY c18286ffY = new C18286ffY();
                androidx.fragment.app.FragmentManager supportFragmentManager = this.KWHzl.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c18286ffY.show(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.fgq$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C16435ejq EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C16435ejq c16435ejq) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c16435ejq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.gEmmrt.callOnClick();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(C16435ejq c16435ejq) {
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

    public final void EZpvd(java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List<C10854bwM> list, boolean z) {
        C16435ejq c16435ejq;
        C16435ejq c16435ejq2 = this.EZpvd;
        if (c16435ejq2 == null) {
            Intrinsics.gEmmrt("");
            c16435ejq = null;
        } else {
            c16435ejq = c16435ejq2;
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
        try {
            c16435ejq.zsXlph.setText(charSequence);
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.OLrzqt(e, C56423yEv.EZpvd(C56390yDp.OLrzqt("walletName", charSequence.toString())), java.lang.Boolean.TRUE);
            pUU.AEQbTJ(getTAG(), "Failed to setText: " + e.getMessage() + " on text: " + ((java.lang.Object) charSequence), e);
        }
        c16435ejq.AubY.setText(pTD.EZpvd(this, C13754dXa.Dialog.OLrzqt, list.size(), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(list.size())))));
        this.copydefault.AEQbTJ(list);
        ConnectEventTracking.AEQbTJ.EZpvd(ConnectEventTracking.Source.WALLET_CONNECT, str, str4, list);
        if (z) {
            C52794wYp c52794wYp3 = c16435ejq.copydefault;
            c52794wYp3.setText(getString(C13754dXa.FragmentManager.MediaDescriptionCompatApi23));
            c52794wYp3.setOnClickListener(new StateListAnimator(c52794wYp3, 1000L, c16435ejq));
        } else {
            C52794wYp c52794wYp4 = c16435ejq.copydefault;
            c52794wYp4.setText(getString(C13754dXa.FragmentManager.hgxRZI));
            c52794wYp4.setOnClickListener(new Application(c52794wYp4, 1000L, this));
        }
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str) {
        C16435ejq c16435ejq = this.EZpvd;
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
        finish();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new WalletConnectConnectionPromptActivity$bindConnectedState$1(null), 3, null);
    }

    private final void valueOf() {
        android.content.Context applicationContext = getApplicationContext();
        android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
        if (application == null) {
            return;
        }
        int intExtra = getIntent().getIntExtra("initState", 0);
        java.lang.String stringExtra = getIntent().getStringExtra(PushMessagingService.KEY_TOPIC);
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletId");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletConnectConnectionPromptActivity$initParams$1(this, intExtra, str, stringExtra2 == null ? "" : stringExtra2, getIntent().getIntExtra("connectType", 0), application, null), 3, null);
    }

    /* JADX INFO: renamed from: o.fgq$TaskDescription */
    public static final class TaskDescription extends RecyclerView.Adapter<Application> {
        public java.util.List<C10854bwM> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:314)) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.bwM>):void (m)] (LINE:313) call: o.fgq.TaskDescription.<init>(java.util.List):void type: THIS */
        public /* synthetic */ TaskDescription(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list);
        }

        public TaskDescription(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }

        /* JADX INFO: renamed from: o.fgq$TaskDescription$Application */
        public static final class Application extends RecyclerView.ViewHolder {
            public final C16927etE KWHzl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull C16927etE c16927etE) {
                super(c16927etE.getRoot());
                Intrinsics.checkNotNullParameter(c16927etE, "");
                this.KWHzl = c16927etE;
            }

            public final void EZpvd(@NotNull java.lang.String str, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                android.widget.ImageView imageView = this.KWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                if (!z) {
                    str = null;
                }
                C14725dqq.loadFixSizeBorderImage$default(imageView, str, z ? C52761wXj.TaskDescription.fERRXa : C13754dXa.Activity.ODWQjV, 0.0f, 24.0f, 0, false, 48, null);
            }
        }

        public final void AEQbTJ(@NotNull java.util.List<C10854bwM> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
            notifyDataSetChanged();
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            C16927etE c16927etEEZpvd = C16927etE.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c16927etEEZpvd, "");
            return new Application(c16927etEEZpvd);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            application.EZpvd(OLrzqt().get(i), i < 4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return OLrzqt().size();
        }

        private final java.util.List<java.lang.String> OLrzqt() {
            java.util.List<C10854bwM> list = this.EZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C10854bwM) it.next()).AYXKKw());
            }
            return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory gEmmrt() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C18347fgg.class), new Function1() { // from class: o.fgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18357fgq.KWHzl((CreationExtras) obj);
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
