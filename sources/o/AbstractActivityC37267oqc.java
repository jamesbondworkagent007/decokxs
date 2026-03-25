package o;

import android.view.View;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.im.imui.qrcode.QRCodeInfo;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractActivityC37267oqc extends AbstractActivityC33044moy<AbstractC33852nIf> {
    public static final Application Companion = new Application(null);
    public final int AEQbTJ = C35399nuc.Dialog.isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    public abstract void copydefault(@NotNull C35893oHp c35893oHp, java.lang.String str);

    /* JADX INFO: renamed from: o.oqc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oqc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C33567myr.AEQbTJ((android.app.Activity) this, false);
        AbstractC33852nIf abstractC33852nIfKWHzl = KWHzl();
        abstractC33852nIfKWHzl.AYXKKw.setImageResource(C52761wXj.TaskDescription.newSession);
        abstractC33852nIfKWHzl.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.oqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC37267oqc.copydefault(this.KWHzl, view);
            }
        });
        abstractC33852nIfKWHzl.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.oqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC37267oqc.AEQbTJ(this.KWHzl, view);
            }
        });
        abstractC33852nIfKWHzl.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.oqt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC37267oqc.gEmmrt(this.KWHzl, view);
            }
        });
    }

    public static final void copydefault(AbstractActivityC37267oqc abstractActivityC37267oqc, android.view.View view) {
        abstractActivityC37267oqc.onBackPressed();
    }

    public static final void AEQbTJ(AbstractActivityC37267oqc abstractActivityC37267oqc, android.view.View view) {
        abstractActivityC37267oqc.copydefault();
    }

    public static final void gEmmrt(AbstractActivityC37267oqc abstractActivityC37267oqc, android.view.View view) {
        abstractActivityC37267oqc.OLrzqt();
    }

    public final void EZpvd(@NotNull QRCodeInfo qRCodeInfo) {
        Intrinsics.checkNotNullParameter(qRCodeInfo, "");
        AbstractC33852nIf abstractC33852nIfKWHzl = KWHzl();
        C35893oHp c35893oHp = abstractC33852nIfKWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        copydefault(c35893oHp, qRCodeInfo.KWHzl());
        abstractC33852nIfKWHzl.AkhnZx.setText(qRCodeInfo.copydefault());
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) qRCodeInfo.AEQbTJ());
        abstractC33852nIfKWHzl.values.setText(qRCodeInfo.AEQbTJ());
        abstractC33852nIfKWHzl.values.setVisibility(zOLrzqt ? 0 : 4);
        C6995aZr.setContent$default(abstractC33852nIfKWHzl.AhwBna, qRCodeInfo.OLrzqt(), false, 0.0f, 6, (java.lang.Object) null);
        if (qRCodeInfo.EZpvd() != null) {
            android.widget.TextView textView = abstractC33852nIfKWHzl.isConnected;
            textView.setVisibility(0);
            Intrinsics.copydefault(textView);
            C37716ozA.updateTagViewWithTagInfo$default(textView, qRCodeInfo.EZpvd(), 0, null, false, false, false, 62, null);
        }
    }

    public void copydefault() {
        C37716ozA.KWHzl(this, 1, (Function0<Unit>) new Function0() { // from class: o.oqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC37267oqc.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final Unit EZpvd(AbstractActivityC37267oqc abstractActivityC37267oqc) {
        android.widget.FrameLayout frameLayout = abstractActivityC37267oqc.KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        android.graphics.Bitmap bitmapCopydefault = abstractActivityC37267oqc.copydefault(frameLayout);
        if (bitmapCopydefault != null) {
            abstractActivityC37267oqc.EZpvd(bitmapCopydefault);
        }
        return Unit.INSTANCE;
    }

    public void OLrzqt() {
        android.widget.FrameLayout frameLayout = KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        android.graphics.Bitmap bitmapCopydefault = copydefault(frameLayout);
        if (bitmapCopydefault != null) {
            djBIcL(bitmapCopydefault);
        }
    }

    public final android.graphics.Bitmap copydefault(android.view.View view) {
        android.graphics.Bitmap bitmapCopydefault = C33487mxQ.copydefault(this, view, view.getWidth(), view.getHeight(), true, null);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        return bitmapCopydefault;
    }

    public final void djBIcL(android.graphics.Bitmap bitmap) {
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(bitmap);
        final Function1 function1 = new Function1() { // from class: o.oqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37267oqc.KWHzl((android.graphics.Bitmap) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.oqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractActivityC37267oqc.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C33024moe.KWHzl(abstractC58185ywXAEQbTJ), this);
        final Function1 function12 = new Function1() { // from class: o.oqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37267oqc.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractActivityC37267oqc.DbNXlk(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.oqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37267oqc.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractActivityC37267oqc.fIwbmz(function13, obj);
            }
        });
    }

    public static final java.lang.String fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String KWHzl(android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.File fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(bitmap);
        if (fileAEQbTJ != null) {
            return fileAEQbTJ.getAbsolutePath();
        }
        return null;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractActivityC37267oqc abstractActivityC37267oqc, java.lang.String str) {
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        Intrinsics.copydefault((java.lang.Object) str);
        ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(actionBar, str, null, 2, null);
        imageShareParamsCreate$default.setShareFrom("OKIM");
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(abstractActivityC37267oqc, ShareConfig.ActionBar.create$default(ShareConfig.Companion, imageShareParamsCreate$default, null, 2, null));
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.graphics.Bitmap bitmap) {
        showLoading();
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(bitmap);
        final Function1 function1 = new Function1() { // from class: o.oqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37267oqc.OLrzqt((android.graphics.Bitmap) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.oqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractActivityC37267oqc.AkhnZx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(C33024moe.KWHzl(abstractC58185ywXAEQbTJ), this);
        final Function1 function12 = new Function1() { // from class: o.oqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37267oqc.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractActivityC37267oqc.values(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.oqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37267oqc.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractActivityC37267oqc.isConnected(function13, obj);
            }
        });
    }

    public static final java.lang.String AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String OLrzqt(android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.File fileAEQbTJ = ShareFileProvider.Companion.AEQbTJ(bitmap);
        if (fileAEQbTJ != null) {
            return fileAEQbTJ.getAbsolutePath();
        }
        return null;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC37267oqc abstractActivityC37267oqc, java.lang.String str) {
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        Intrinsics.copydefault((java.lang.Object) str);
        oBK.KWHzl.EZpvd(abstractActivityC37267oqc, ImageShareParams.ActionBar.create$default(actionBar, str, null, 2, null), abstractActivityC37267oqc.new Activity());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.oqc$Activity */
    public static final class Activity implements oBT {
        public Activity() {
        }

        @Override // o.oBT
        public void EZpvd() {
            AbstractActivityC37267oqc.this.dismissLoading();
            java.lang.String string = AbstractActivityC37267oqc.this.getResources().getString(C35399nuc.LoaderManager.hCLrkq);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithSuccessfulIcon$default(string, 0, 1, (java.lang.Object) null);
        }

        @Override // o.oBT
        public void KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            AbstractActivityC37267oqc.this.dismissLoading();
            java.lang.String string = AbstractActivityC37267oqc.this.getResources().getString(C35399nuc.LoaderManager.fVBECu);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        }
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractActivityC37267oqc abstractActivityC37267oqc, java.lang.Throwable th) {
        abstractActivityC37267oqc.dismissLoading();
        java.lang.String string = abstractActivityC37267oqc.getResources().getString(C35399nuc.LoaderManager.fVBECu);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
