package o;

import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.biz.net.bean.GetScanShareResponseBody;
import com.okinc.business.defi.wallet.mine.scan.MPCWalletQrcodeActivity$refreshQrcode$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.core.keypair.KeyPair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.yCQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18845fqB extends AbstractActivityC33013moT {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public boolean AhwBna;
    public AbstractC16344eiE EZpvd;
    public final InterfaceC56387yDm djBIcL;
    public java.lang.String isConnected = "";
    public boolean valueOf = true;
    public final int gEmmrt = 1000;
    public final int AYXKKw = 2000;
    public final int copydefault = C33570myu.AEQbTJ() - C55298xhM.dpInt$default(100, (android.content.Context) null, 1, (java.lang.Object) null);
    public final C58216yxB AEQbTJ = new C58216yxB();
    public final android.os.Handler OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper(), new Handler.Callback() { // from class: o.fqy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            return ActivityC18845fqB.AEQbTJ(this.OLrzqt, message);
        }
    });

    /* JADX INFO: renamed from: o.fqB$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB OLrzqt() {
        return this.AEQbTJ;
    }

    public ActivityC18845fqB() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(C18856fqM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.scan.MPCWalletQrcodeActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.scan.MPCWalletQrcodeActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.scan.MPCWalletQrcodeActivity$special$$inlined$viewModels$default$3
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

    public final C18856fqM EZpvd() {
        return (C18856fqM) this.djBIcL.getValue();
    }

    public static final boolean AEQbTJ(ActivityC18845fqB activityC18845fqB, android.os.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        int i = message.what;
        if (i == activityC18845fqB.gEmmrt) {
            if (!activityC18845fqB.AhwBna) {
                activityC18845fqB.KWHzl();
            }
        } else {
            if (i != activityC18845fqB.AYXKKw) {
                return false;
            }
            activityC18845fqB.AEQbTJ();
        }
        return true;
    }

    /* JADX INFO: renamed from: o.fqB$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fqB.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startActivity$default(Application application, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            application.copydefault(context, str, z);
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            context.startActivity(KWHzl(context, str, z));
        }

        public static /* synthetic */ android.content.Intent getIntent$default(Application application, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return application.KWHzl(context, str, z);
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18845fqB.class);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str);
            intent.putExtra("jump_home", z);
            return intent;
        }
    }

    private final void copydefault() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD) : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.isConnected = stringExtra;
        android.content.Intent intent2 = getIntent();
        this.valueOf = intent2 != null ? intent2.getBooleanExtra("jump_home", false) : false;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        this.EZpvd = (AbstractC16344eiE) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.accept);
        KWHzl();
        AbstractC16344eiE abstractC16344eiE = this.EZpvd;
        if (abstractC16344eiE == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(abstractC16344eiE.OLrzqt).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C58156yvv.copydefault(abstractC58247yxgThrottleFirst, this).subscribe(new InterfaceC58227yxM() { // from class: o.fqI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18845fqB.copydefault(this.KWHzl, obj);
            }
        });
        EZpvd().AEQbTJ().observe(this, new ActionBar(new Function1() { // from class: o.fqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18845fqB.EZpvd(this.KWHzl, (GetScanShareResponseBody) obj);
            }
        }));
        EZpvd().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.fqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18845fqB.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void copydefault(ActivityC18845fqB activityC18845fqB, java.lang.Object obj) {
        activityC18845fqB.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ActivityC18845fqB activityC18845fqB, GetScanShareResponseBody getScanShareResponseBody) {
        java.lang.String prvKey;
        if (getScanShareResponseBody == null) {
            return Unit.INSTANCE;
        }
        int status = getScanShareResponseBody.getStatus();
        if (status == 0) {
            showShare$default(activityC18845fqB, true, false, 2, null);
        } else if (status == 1) {
            showShare$default(activityC18845fqB, false, false, 2, null);
        } else if (status == 2) {
            activityC18845fqB.OLrzqt.removeMessages(activityC18845fqB.AYXKKw);
            KeyPair keyPairKWHzl = activityC18845fqB.EZpvd().KWHzl();
            if (keyPairKWHzl != null && (prvKey = keyPairKWHzl.getPrvKey()) != null) {
                activityC18845fqB.AEQbTJ(getScanShareResponseBody.getMpcId(), getScanShareResponseBody.getCipherText(), prvKey);
            }
        } else if (status == 3) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC18845fqB activityC18845fqB, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC18845fqB.AEQbTJ(false, true);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt.removeCallbacksAndMessages(null);
        this.AEQbTJ.OLrzqt();
    }

    public final void AEQbTJ() {
        EZpvd().copydefault();
        this.OLrzqt.sendEmptyMessageDelayed(this.AYXKKw, 1000L);
    }

    public final void djBIcL(boolean z) {
        final java.lang.String str = z ? "yes" : "no";
        C32866mlf.onEvent$default("Web3MPC_WalletRestoreScan_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18845fqB.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("is_success", str, false));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showShare$default(ActivityC18845fqB activityC18845fqB, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        activityC18845fqB.AEQbTJ(z, z2);
    }

    public final void AEQbTJ(boolean z, boolean z2) {
        java.lang.String strAYXKKw;
        this.AhwBna = true;
        AbstractC16344eiE abstractC16344eiE = this.EZpvd;
        AbstractC16344eiE abstractC16344eiE2 = null;
        if (abstractC16344eiE == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE = null;
        }
        abstractC16344eiE.EZpvd.setVisibility(0);
        AbstractC16344eiE abstractC16344eiE3 = this.EZpvd;
        if (abstractC16344eiE3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE3 = null;
        }
        abstractC16344eiE3.copydefault.setVisibility(0);
        AbstractC16344eiE abstractC16344eiE4 = this.EZpvd;
        if (abstractC16344eiE4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE4 = null;
        }
        abstractC16344eiE4.KWHzl.post(new java.lang.Runnable() { // from class: o.fqE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18845fqB.gEmmrt(this.AEQbTJ);
            }
        });
        AbstractC16344eiE abstractC16344eiE5 = this.EZpvd;
        if (abstractC16344eiE5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE5 = null;
        }
        abstractC16344eiE5.AYXKKw.setVisibility(0);
        djBIcL(z);
        if (z) {
            AbstractC16344eiE abstractC16344eiE6 = this.EZpvd;
            if (abstractC16344eiE6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16344eiE6 = null;
            }
            abstractC16344eiE6.gEmmrt.setImageResource(C13754dXa.Activity.zuBGHE);
            AbstractC16344eiE abstractC16344eiE7 = this.EZpvd;
            if (abstractC16344eiE7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16344eiE7 = null;
            }
            abstractC16344eiE7.valueOf.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OpenForTesting));
        } else {
            AbstractC16344eiE abstractC16344eiE8 = this.EZpvd;
            if (abstractC16344eiE8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16344eiE8 = null;
            }
            abstractC16344eiE8.gEmmrt.setImageResource(C13754dXa.Activity.gHZMYf);
            AbstractC16344eiE abstractC16344eiE9 = this.EZpvd;
            if (abstractC16344eiE9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16344eiE9 = null;
            }
            android.widget.TextView textView = abstractC16344eiE9.valueOf;
            if (z2) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RequiresFeature);
            }
            textView.setText(strAYXKKw);
        }
        AbstractC16344eiE abstractC16344eiE10 = this.EZpvd;
        if (abstractC16344eiE10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE10 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16344eiE10.copydefault.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i = this.copydefault;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        AbstractC16344eiE abstractC16344eiE11 = this.EZpvd;
        if (abstractC16344eiE11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE11 = null;
        }
        abstractC16344eiE11.copydefault.setLayoutParams(layoutParams2);
        AbstractC16344eiE abstractC16344eiE12 = this.EZpvd;
        if (abstractC16344eiE12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE12 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = abstractC16344eiE12.EZpvd.getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        int i2 = this.copydefault;
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = i2;
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = i2;
        AbstractC16344eiE abstractC16344eiE13 = this.EZpvd;
        if (abstractC16344eiE13 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16344eiE2 = abstractC16344eiE13;
        }
        abstractC16344eiE2.EZpvd.setLayoutParams(layoutParams4);
    }

    public static final void gEmmrt(final ActivityC18845fqB activityC18845fqB) {
        AbstractC16344eiE abstractC16344eiE = activityC18845fqB.EZpvd;
        AbstractC16344eiE abstractC16344eiE2 = null;
        if (abstractC16344eiE == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE = null;
        }
        if (ViewCompat.isLaidOut(abstractC16344eiE.KWHzl)) {
            AbstractC16344eiE abstractC16344eiE3 = activityC18845fqB.EZpvd;
            if (abstractC16344eiE3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16344eiE3 = null;
            }
            ShapeableImageView shapeableImageView = abstractC16344eiE3.KWHzl;
            Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
            final android.graphics.Bitmap bitmapDrawToBitmap$default = ViewKt.drawToBitmap$default(shapeableImageView, null, 1, null);
            yCQ.Application applicationAEQbTJ = yCQ.KWHzl(activityC18845fqB).EZpvd(20).AEQbTJ(2).EZpvd(new yCQ.TaskDescription.StateListAnimator() { // from class: o.fqz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yCQ.TaskDescription.StateListAnimator
                public final void onImageReady(BitmapDrawable bitmapDrawable) {
                    ActivityC18845fqB.AEQbTJ(this.copydefault, bitmapDrawToBitmap$default, bitmapDrawable);
                }
            }).AEQbTJ(bitmapDrawToBitmap$default);
            AbstractC16344eiE abstractC16344eiE4 = activityC18845fqB.EZpvd;
            if (abstractC16344eiE4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16344eiE2 = abstractC16344eiE4;
            }
            applicationAEQbTJ.OLrzqt(abstractC16344eiE2.copydefault);
        }
    }

    public static final void AEQbTJ(ActivityC18845fqB activityC18845fqB, android.graphics.Bitmap bitmap, BitmapDrawable bitmapDrawable) {
        AbstractC16344eiE abstractC16344eiE = activityC18845fqB.EZpvd;
        if (abstractC16344eiE == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE = null;
        }
        abstractC16344eiE.copydefault.setImageDrawable(bitmapDrawable);
        bitmap.recycle();
    }

    public final void KWHzl() {
        this.AhwBna = false;
        AbstractC16344eiE abstractC16344eiE = this.EZpvd;
        if (abstractC16344eiE == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE = null;
        }
        abstractC16344eiE.AYXKKw.setVisibility(8);
        AbstractC16344eiE abstractC16344eiE2 = this.EZpvd;
        if (abstractC16344eiE2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE2 = null;
        }
        abstractC16344eiE2.EZpvd.setVisibility(8);
        AbstractC16344eiE abstractC16344eiE3 = this.EZpvd;
        if (abstractC16344eiE3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE3 = null;
        }
        abstractC16344eiE3.copydefault.setVisibility(8);
        AbstractC16344eiE abstractC16344eiE4 = this.EZpvd;
        if (abstractC16344eiE4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE4 = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16344eiE4.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i = this.copydefault;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.dpInt$default(90, (android.content.Context) null, 1, (java.lang.Object) null);
        AbstractC16344eiE abstractC16344eiE5 = this.EZpvd;
        if (abstractC16344eiE5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16344eiE5 = null;
        }
        abstractC16344eiE5.KWHzl.setLayoutParams(layoutParams2);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MPCWalletQrcodeActivity$refreshQrcode$1(this, null), 3, null);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strOLrzqt = xXW.OLrzqt.OLrzqt(str2, str3);
        new fIO().KWHzl(this, this.valueOf ? 3 : 4, str, strOLrzqt, this.isConnected, new Function1() { // from class: o.fqH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18845fqB.KWHzl(this.copydefault, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit KWHzl(ActivityC18845fqB activityC18845fqB, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            showShare$default(activityC18845fqB, false, false, 2, null);
            return Unit.INSTANCE;
        }
        if (activityC18845fqB.valueOf) {
            dZK.AEQbTJ.AEQbTJ(activityC18845fqB, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        } else {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).aS_().invoke(java.lang.Boolean.TRUE);
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).AEQbTJ(new Function1() { // from class: o.fqG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18845fqB.gEmmrt(((java.lang.Boolean) obj).booleanValue());
                }
            });
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.fqC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18845fqB.KWHzl(((java.lang.Boolean) obj).booleanValue());
                }
            });
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).copydefault(new Function1() { // from class: o.fqD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18845fqB.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            });
            activityC18845fqB.setResult(1);
            activityC18845fqB.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
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
