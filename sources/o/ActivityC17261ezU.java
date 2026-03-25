package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.api.bean.CloudBackupWalletType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.common.track.CloudBackupEventCode;
import com.okinc.business.defi.common.track.CloudBackupEventType;
import com.okinc.components.track.TrackChannel;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC17261ezU extends AbstractActivityC33013moT {
    public AbstractC16324ehl KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public java.lang.String OLrzqt = "";
    public java.lang.String copydefault = "";
    public CloudBackupWalletType EZpvd = CloudBackupWalletType.HD;

    /* JADX INFO: renamed from: o.ezU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ezU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17261ezU.class);
            intent.putExtra("root_wallet_id", str);
            intent.putExtra("walletName", str2);
            context.startActivity(intent);
        }
    }

    private final void KWHzl() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.OLrzqt = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletName");
        this.copydefault = stringExtra2 != null ? stringExtra2 : "";
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16324ehl) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.zLjUOn);
        C32866mlf.onEvent$default("Web3WalletManagement_Backup_Cloud_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        KWHzl();
        showLoadingAtOnce();
        AbstractC16324ehl abstractC16324ehl = this.KWHzl;
        if (abstractC16324ehl == null) {
            Intrinsics.gEmmrt("");
            abstractC16324ehl = null;
        }
        ShapeableImageView shapeableImageView = abstractC16324ehl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        C33054mpH.EZpvd(shapeableImageView, C43454rpb.copydefault("images/web3_wallet/android/icon_wallet_cloud_backup_success.webp", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.QTtQrx, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtDjBIcL = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(this.OLrzqt);
        final Function1 function1 = new Function1() { // from class: o.ezX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17261ezU.copydefault(this.copydefault, (AbstractC12784ctX) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12784ctX> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17261ezU.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ezY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17261ezU.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtDjBIcL.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17261ezU.AEQbTJ(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC17261ezU activityC17261ezU, AbstractC12784ctX abstractC12784ctX) {
        CloudBackupWalletType cloudBackupWalletType;
        if (abstractC12784ctX.fJNWhG() == WalletType.TonWallet) {
            cloudBackupWalletType = CloudBackupWalletType.TON;
        } else {
            cloudBackupWalletType = CloudBackupWalletType.HD;
        }
        activityC17261ezU.EZpvd = cloudBackupWalletType;
        activityC17261ezU.dismissLoading();
        Intrinsics.copydefault(abstractC12784ctX);
        activityC17261ezU.OLrzqt(activityC17261ezU.copydefault(abstractC12784ctX));
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17261ezU, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC17261ezU activityC17261ezU, java.lang.Throwable th) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17261ezU, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final int copydefault(AbstractC12784ctX abstractC12784ctX) {
        if (abstractC12784ctX.AkhnZx()) {
            return 2;
        }
        abstractC12784ctX.valueOf();
        return 1;
    }

    public final void OLrzqt(int i) {
        AbstractC16324ehl abstractC16324ehl = this.KWHzl;
        AbstractC16324ehl abstractC16324ehl2 = null;
        if (abstractC16324ehl == null) {
            Intrinsics.gEmmrt("");
            abstractC16324ehl = null;
        }
        abstractC16324ehl.OLrzqt.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.createFromParcel, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("WalletName", this.copydefault))));
        AbstractC16324ehl abstractC16324ehl3 = this.KWHzl;
        if (abstractC16324ehl3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16324ehl3 = null;
        }
        android.widget.TextView textView = abstractC16324ehl3.EZpvd;
        int i2 = C13754dXa.FragmentManager.MediaBrowserCompatMediaItem1;
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        textView.setText(C33069mpW.KWHzl(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", c14392dkb.KWHzl(this, i)))));
        AbstractC16324ehl abstractC16324ehl4 = this.KWHzl;
        if (abstractC16324ehl4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16324ehl4 = null;
        }
        abstractC16324ehl4.copydefault.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.Dimension, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("CloudName", c14392dkb.KWHzl(this, i)))));
        AbstractC16324ehl abstractC16324ehl5 = this.KWHzl;
        if (abstractC16324ehl5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16324ehl2 = abstractC16324ehl5;
        }
        C52794wYp c52794wYp = abstractC16324ehl2.copydefault;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, i));
    }

    public final void KWHzl(final int i) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaMetadataCompatBitmapKey, C56424yEw.AYXKKw(C56390yDp.OLrzqt("CloudName", C14392dkb.AEQbTJ.KWHzl(this, i)))));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompat1));
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaMetadataCompatBuilder), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.scaleBitmap), new View.OnClickListener() { // from class: o.eAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC17261ezU.copydefault(this.EZpvd, i, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(final ActivityC17261ezU activityC17261ezU, final int i, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC17261ezU.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "deleteCloud", new Function1() { // from class: o.ezZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17261ezU.EZpvd(this.copydefault, i, viewOnClickListenerC54939xaY, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
    }

    public static final Unit EZpvd(final ActivityC17261ezU activityC17261ezU, final int i, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            activityC17261ezU.showLoadingAtOnceCannotCancel();
            ((InterfaceC54838xXe) C43251rlk.copydefault(InterfaceC54838xXe.class)).OLrzqt(activityC17261ezU, activityC17261ezU.OLrzqt, i, new Function1() { // from class: o.eAg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17261ezU.copydefault(this.OLrzqt, i, viewOnClickListenerC54939xaY, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault(activityC17261ezU.getTAG(), "delete cloud failed. error message:" + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC17261ezU activityC17261ezU, int i, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, boolean z) {
        C14493dmW.KWHzl(activityC17261ezU.EZpvd, CloudBackupEventType.DeleteCloudBackupWallet, activityC17261ezU.OLrzqt, z ? "success" : EopTrackEvent.KEY_RESULT_FAILED, z, z ? CloudBackupEventCode.SUCCESS : CloudBackupEventCode.UNKNOWN_ERROR, i, (128 & 128) != 0 ? "" : null);
        if (z) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getNavigationMode), 0, 1, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.dismiss();
            activityC17261ezU.finish();
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTabCount), 0, 1, (java.lang.Object) null);
        }
        activityC17261ezU.dismissLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ezU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ ActivityC17261ezU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC17261ezU activityC17261ezU, int i) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC17261ezU;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl(this.OLrzqt);
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
