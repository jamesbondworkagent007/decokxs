package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC14334djW;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fFK extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC16367eib EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public fFK() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(fGT.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeUrgentEnterActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeUrgentEnterActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mpc.EscapeUrgentEnterActivity$special$$inlined$viewModels$default$3
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

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fFK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fFK.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra(MTAnalysisConstants.Account.KEY_ACCOUNT, str2);
            intent.putExtra("from", str3);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String copydefault() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String OLrzqt() {
        java.lang.String stringExtra = getIntent().getStringExtra(MTAnalysisConstants.Account.KEY_ACCOUNT);
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String AEQbTJ() {
        java.lang.String stringExtra = getIntent().getStringExtra("from");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fGT KWHzl() {
        return (fGT) this.OLrzqt.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16367eib abstractC16367eib = (AbstractC16367eib) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.dNCPSb);
        this.EZpvd = abstractC16367eib;
        AbstractC16367eib abstractC16367eib2 = null;
        if (abstractC16367eib == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib = null;
        }
        abstractC16367eib.copydefault.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSessionEvent), C56423yEv.EZpvd(C56390yDp.OLrzqt("wallet", OLrzqt()))));
        AbstractC16367eib abstractC16367eib3 = this.EZpvd;
        if (abstractC16367eib3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib3 = null;
        }
        abstractC16367eib3.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onAudioInfoChanged));
        AbstractC16367eib abstractC16367eib4 = this.EZpvd;
        if (abstractC16367eib4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16367eib2 = abstractC16367eib4;
        }
        android.widget.ImageView imageView = abstractC16367eib2.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/web3_wallet/android/ic_mpc_escape_urgent.webp", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.QTtQrx, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fFK.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(fFK ffk) {
        rVN.reportFullyDrawn$default((android.app.Activity) ffk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        AbstractC16367eib abstractC16367eib = this.EZpvd;
        AbstractC16367eib abstractC16367eib2 = null;
        if (abstractC16367eib == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib = null;
        }
        abstractC16367eib.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                fFK.AEQbTJ(this.AEQbTJ, compoundButton, z);
            }
        });
        AbstractC16367eib abstractC16367eib3 = this.EZpvd;
        if (abstractC16367eib3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib3 = null;
        }
        abstractC16367eib3.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                fFK.copydefault(this.KWHzl, compoundButton, z);
            }
        });
        AbstractC16367eib abstractC16367eib4 = this.EZpvd;
        if (abstractC16367eib4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib4 = null;
        }
        C52794wYp c52794wYp = abstractC16367eib4.OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        AbstractC16367eib abstractC16367eib5 = this.EZpvd;
        if (abstractC16367eib5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16367eib2 = abstractC16367eib5;
        }
        C52794wYp c52794wYp2 = abstractC16367eib2.AEQbTJ;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this));
        KWHzl().copydefault().observe(this, new Observer() { // from class: o.fFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                fFK.copydefault((java.lang.Integer) obj);
            }
        });
        KWHzl().AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.fFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFK.EZpvd(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
    }

    public static final void AEQbTJ(fFK ffk, android.widget.CompoundButton compoundButton, boolean z) {
        AbstractC16367eib abstractC16367eib = ffk.EZpvd;
        AbstractC16367eib abstractC16367eib2 = null;
        if (abstractC16367eib == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib = null;
        }
        C52794wYp c52794wYp = abstractC16367eib.OLrzqt;
        AbstractC16367eib abstractC16367eib3 = ffk.EZpvd;
        if (abstractC16367eib3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16367eib2 = abstractC16367eib3;
        }
        c52794wYp.setEnabled(abstractC16367eib2.KWHzl.isChecked() && z);
    }

    public static final void copydefault(fFK ffk, android.widget.CompoundButton compoundButton, boolean z) {
        AbstractC16367eib abstractC16367eib = ffk.EZpvd;
        AbstractC16367eib abstractC16367eib2 = null;
        if (abstractC16367eib == null) {
            Intrinsics.gEmmrt("");
            abstractC16367eib = null;
        }
        C52794wYp c52794wYp = abstractC16367eib.OLrzqt;
        AbstractC16367eib abstractC16367eib3 = ffk.EZpvd;
        if (abstractC16367eib3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16367eib2 = abstractC16367eib3;
        }
        c52794wYp.setEnabled(abstractC16367eib2.copydefault.isChecked() && z);
    }

    public static final void copydefault(java.lang.Integer num) {
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

    public static final Unit EZpvd(fFK ffk, java.lang.Integer num) {
        if (num != null && num.intValue() == 0) {
            ffk.dismissLoading();
            ffk.djBIcL();
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            ffk.KWHzl(num.intValue());
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
            ffk.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        C14571dnv c14571dnvOLrzqt = C14571dnv.Companion.OLrzqt();
        c14571dnvOLrzqt.AEQbTJ(new Function1() { // from class: o.fFN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFK.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        });
        c14571dnvOLrzqt.show(getSupportFragmentManager(), "EscapeUrgentEnterActivity");
    }

    public static final Unit copydefault(fFK ffk, int i) {
        ffk.KWHzl(i);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final int i) {
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(this, i);
        if (interfaceC14334djWOLrzqt != null) {
            InterfaceC14334djW.Application.judgeCloudServerStatus$default(interfaceC14334djWOLrzqt, this, 0, new Function0() { // from class: o.fFL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return fFK.OLrzqt(this.EZpvd, i);
                }
            }, 2, null);
        }
    }

    public static final Unit OLrzqt(final fFK ffk, final int i) {
        ffk.dismissLoading();
        C12779ctS.KWHzl.EZpvd(ffk, new Function1() { // from class: o.fFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fFK.OLrzqt(this.EZpvd, i, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final fFK ffk, final int i, boolean z) {
        if (z) {
            if (ffk.copydefault().length() == 0) {
                return Unit.INSTANCE;
            }
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(ffk.copydefault(), true);
            final Function1 function1 = new Function1() { // from class: o.fFO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fFK.copydefault(this.KWHzl, i, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fFP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    fFK.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.fFT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fFK.OLrzqt((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fFV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    fFK.copydefault(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final fFK ffk, int i, final AbstractC12782ctV abstractC12782ctV) {
        java.lang.String mpcId;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP == null || (mpcId = mpcWalletEncodeInfoQSBOWP.getMpcId()) == null) {
            mpcId = "";
        }
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(ffk, i);
        if (interfaceC14373dkIEZpvd != null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = ffk.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC14373dkIEZpvd.copydefault(mpcId, supportFragmentManager, ffk, new Function2() { // from class: o.fFI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return fFK.AEQbTJ(this.AEQbTJ, abstractC12782ctV, (MPCWalletShareBean) obj, (java.lang.String) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(fFK ffk, AbstractC12782ctV abstractC12782ctV, MPCWalletShareBean mPCWalletShareBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(mPCWalletShareBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        fGT fgtKWHzl = ffk.KWHzl();
        Intrinsics.copydefault(abstractC12782ctV);
        fgtKWHzl.OLrzqt(ffk, str, abstractC12782ctV, mPCWalletShareBean, ffk.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ fFK AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fFK ffk) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = ffk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.showLoadingAtOnceCannotCancel();
                if (C14392dkb.AEQbTJ.OLrzqt()) {
                    this.AEQbTJ.KWHzl(1);
                } else {
                    this.AEQbTJ.KWHzl().AEQbTJ(this.AEQbTJ.copydefault());
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ fFK EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fFK ffk) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = ffk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
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
