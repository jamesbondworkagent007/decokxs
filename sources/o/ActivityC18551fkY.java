package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.FingerprintLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fkY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18551fkY extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final int copydefault;
    public AbstractC16424ejf valueOf;
    public java.lang.String AEQbTJ = "SecurityModelActivity";
    public final int EZpvd = -1;
    public final int OLrzqt = 1;
    public int AhwBna = -1;

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

    /* JADX INFO: renamed from: o.fkY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fkY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC18551fkY.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.valueOf = (AbstractC16424ejf) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.RKDWNf);
        AhwBna();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.flr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18551fkY.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(ActivityC18551fkY activityC18551fkY) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18551fkY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        AbstractC16424ejf abstractC16424ejf = this.valueOf;
        AbstractC16424ejf abstractC16424ejf2 = null;
        if (abstractC16424ejf == null) {
            Intrinsics.gEmmrt("");
            abstractC16424ejf = null;
        }
        abstractC16424ejf.AEQbTJ.setTitleTypeface("harmony_sans_bold.ttf");
        AbstractC16424ejf abstractC16424ejf3 = this.valueOf;
        if (abstractC16424ejf3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16424ejf3 = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16424ejf3.djBIcL);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18551fkY.OLrzqt(this.KWHzl, obj);
            }
        });
        AbstractC16424ejf abstractC16424ejf4 = this.valueOf;
        if (abstractC16424ejf4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16424ejf2 = abstractC16424ejf4;
        }
        C8003auW.copydefault(abstractC16424ejf2.KWHzl).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18551fkY.copydefault(this.OLrzqt, obj);
            }
        });
    }

    public static final void OLrzqt(ActivityC18551fkY activityC18551fkY, java.lang.Object obj) {
        if (activityC18551fkY.AhwBna != activityC18551fkY.OLrzqt) {
            activityC18551fkY.EZpvd();
        }
    }

    public static final void copydefault(ActivityC18551fkY activityC18551fkY, java.lang.Object obj) {
        if (activityC18551fkY.AhwBna != activityC18551fkY.copydefault) {
            activityC18551fkY.AEQbTJ();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        gEmmrt();
    }

    public final void gEmmrt() {
        C10856bwO.copydefault(getTAG(), 0, "checkState");
        if (C14471dmA.EZpvd.copydefault()) {
            int i = this.AhwBna;
            if (i != this.EZpvd && i != this.copydefault) {
                C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTabAt), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                finish();
            }
            this.AhwBna = this.copydefault;
            KWHzl();
            return;
        }
        C58156yvv.KWHzl(C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ(), this).copydefault(new InterfaceC58227yxM() { // from class: o.flq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18551fkY.EZpvd(this.OLrzqt, (java.lang.Boolean) obj);
            }
        });
    }

    public static final void EZpvd(ActivityC18551fkY activityC18551fkY, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            int i = activityC18551fkY.AhwBna;
            if (i != activityC18551fkY.EZpvd && i != activityC18551fkY.OLrzqt) {
                C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTabAt), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                activityC18551fkY.finish();
            }
            activityC18551fkY.AhwBna = activityC18551fkY.OLrzqt;
            activityC18551fkY.valueOf();
            return;
        }
        C10856bwO.EZpvd(activityC18551fkY.getTAG(), new FingerprintLog("saveFingerprint trigger protect on security"));
        C14471dmA.EZpvd.OLrzqt();
        int i2 = activityC18551fkY.AhwBna;
        if (i2 != activityC18551fkY.EZpvd && i2 != activityC18551fkY.copydefault) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getTabAt), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            activityC18551fkY.finish();
        }
        activityC18551fkY.AhwBna = activityC18551fkY.copydefault;
        activityC18551fkY.KWHzl();
    }

    public final void EZpvd() {
        InterfaceC14518dmv c14514dmr;
        C10856bwO.copydefault(getTAG(), 0, "changeToPassword");
        Function1 function1 = new Function1() { // from class: o.flo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18551fkY.OLrzqt(this.OLrzqt, (java.lang.String) obj);
            }
        };
        if (C14471dmA.EZpvd.OLrzqt(C9678baC.Companion.AEQbTJ())) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c14514dmr = new C14430dlM(supportFragmentManager, "changeToPassword", false, function1, null, null, false, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            c14514dmr = new C14514dmr(supportFragmentManager2, "changeToPassword", false, function1, null, null, false, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        }
        c14514dmr.EZpvd();
    }

    public static final Unit OLrzqt(final ActivityC18551fkY activityC18551fkY, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18551fkY.showLoading();
        C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AEQbTJ().copydefault(new InterfaceC58227yxM() { // from class: o.flf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18551fkY.KWHzl(this.EZpvd, str, (java.lang.Boolean) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dZs.Activity.startActivity$default(o.dZs$Activity, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, int, java.lang.String, boolean, boolean, boolean, int, o.dln, int, java.lang.Object):void */
    public static final void KWHzl(final ActivityC18551fkY activityC18551fkY, java.lang.String str, java.lang.Boolean bool) {
        activityC18551fkY.dismissLoading();
        if (!bool.booleanValue()) {
            ActivityC13826dZs.Companion.AEQbTJ(activityC18551fkY, (16378 & 2) != 0 ? "" : null, (16378 & 4) != 0 ? null : str, (16378 & 8) != 0 ? "" : null, (16378 & 16) != 0 ? "" : null, (16378 & 32) != 0 ? null : null, (16378 & 64) != 0 ? "" : null, (16378 & 128) != 0 ? 1 : 0, (16378 & 256) == 0 ? null : "", (16378 & 512) != 0 ? false : false, (16378 & 1024) == 0 ? false : false, (16378 & 2048) == 0 ? false : true, (16378 & 4096) != 0 ? -1 : 0, (16378 & 8192) == 0 ? null : null);
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC18551fkY.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14498dmb(supportFragmentManager, new Function1() { // from class: o.flk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18551fkY.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        }, null, null, false, 28, null).EZpvd();
    }

    public static final Unit gEmmrt(ActivityC18551fkY activityC18551fkY, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C10856bwO.EZpvd(activityC18551fkY.getTAG(), new FingerprintLog("delFingerprint changeToPassword"));
        C14471dmA.EZpvd.EZpvd();
        activityC18551fkY.gEmmrt();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        C10856bwO.copydefault(getTAG(), 0, "changeToBiometric");
        if (C14471dmA.EZpvd.OLrzqt(this)) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14498dmb(supportFragmentManager, new Function1() { // from class: o.fll
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18551fkY.copydefault(this.KWHzl, (java.lang.String) obj);
                }
            }, null, null, false, 28, null).EZpvd();
        } else {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.invalidateOptionsMenu));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.areNotificationsEnabled));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.isShowing), new View.OnClickListener() { // from class: o.fli
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18551fkY.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final Unit copydefault(final ActivityC18551fkY activityC18551fkY, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C13912dbY.copydefault.DbNXlk()) {
            ActivityC14590doN.Companion.copydefault(activityC18551fkY, str, new Function1() { // from class: o.fkZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18551fkY.AEQbTJ((java.lang.String) obj);
                }
            }, new Function0() { // from class: o.fla
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC18551fkY.OLrzqt();
                }
            }, true);
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC18551fkY.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14430dlM(supportFragmentManager, "changeToBiometric", true, null, null, new Function0() { // from class: o.flm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC18551fkY.OLrzqt(str, activityC18551fkY);
                }
            }, false, 88, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.String str, final ActivityC18551fkY activityC18551fkY) {
        AbstractC58260yxt<Unit> abstractC58260yxtEZpvd = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).EZpvd(str, "changeToBiometric");
        final Function1 function1 = new Function1() { // from class: o.fld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18551fkY.OLrzqt(this.copydefault, (Unit) obj);
            }
        };
        InterfaceC58227yxM<? super Unit> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.flh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18551fkY.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.flg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18551fkY.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.flj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18551fkY.EZpvd(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC18551fkY activityC18551fkY, Unit unit) {
        C14471dmA.EZpvd.OLrzqt();
        activityC18551fkY.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void valueOf() {
        C10856bwO.copydefault(getTAG(), 0, "checkPasswordView");
        AbstractC16424ejf abstractC16424ejf = this.valueOf;
        AbstractC16424ejf abstractC16424ejf2 = null;
        if (abstractC16424ejf == null) {
            Intrinsics.gEmmrt("");
            abstractC16424ejf = null;
        }
        abstractC16424ejf.OLrzqt.setVisibility(0);
        AbstractC16424ejf abstractC16424ejf3 = this.valueOf;
        if (abstractC16424ejf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16424ejf2 = abstractC16424ejf3;
        }
        abstractC16424ejf2.EZpvd.setVisibility(8);
    }

    public final void KWHzl() {
        C10856bwO.copydefault(getTAG(), 0, "checkBiometricViewx");
        AbstractC16424ejf abstractC16424ejf = this.valueOf;
        AbstractC16424ejf abstractC16424ejf2 = null;
        if (abstractC16424ejf == null) {
            Intrinsics.gEmmrt("");
            abstractC16424ejf = null;
        }
        abstractC16424ejf.OLrzqt.setVisibility(8);
        AbstractC16424ejf abstractC16424ejf3 = this.valueOf;
        if (abstractC16424ejf3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16424ejf2 = abstractC16424ejf3;
        }
        abstractC16424ejf2.EZpvd.setVisibility(0);
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
