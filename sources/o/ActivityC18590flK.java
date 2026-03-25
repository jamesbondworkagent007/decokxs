package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.google.common.base.Ascii;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.error.ChangePasswordError;
import com.okinc.business.defi.biz.core.error.FingerprintLog;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.password.PasswordCheckResult;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11010bzJ;
import o.C13754dXa;
import o.C14126dfa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.flK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18590flK extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public AbstractC16403ejK OLrzqt;
    public boolean copydefault;
    public java.lang.String EZpvd = "WalletPasswordActivity";
    public final int AEQbTJ = -100;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public java.lang.String getTAG() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setTAG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX INFO: renamed from: o.flK$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.flK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC18590flK.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        final C14775drn c14775drn;
        final C14775drn c14775drn2;
        final C14775drn c14775drn3;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        super.onCreate(bundle);
        C10856bwO.copydefault(getTAG(), 0, "onCreate");
        this.OLrzqt = (AbstractC16403ejK) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.igXuih);
        C33516mxt.EZpvd(this);
        this.copydefault = true;
        AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
        if (abstractC16403ejK != null && (c52794wYp2 = abstractC16403ejK.AEQbTJ) != null) {
            c52794wYp2.setEnabled(false);
        }
        AbstractC16403ejK abstractC16403ejK2 = this.OLrzqt;
        if (abstractC16403ejK2 != null && (c52794wYp = abstractC16403ejK2.AEQbTJ) != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.flJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC18590flK.OLrzqt(this.KWHzl, view);
                }
            });
        }
        AbstractC16403ejK abstractC16403ejK3 = this.OLrzqt;
        if (abstractC16403ejK3 != null && (c14775drn3 = abstractC16403ejK3.copydefault) != null) {
            c14775drn3.setOnTextChanged(new Function1() { // from class: o.flM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18590flK.copydefault(this.OLrzqt, c14775drn3, (java.lang.String) obj);
                }
            });
            C55001xbh c55001xbhAkhnZx = c14775drn3.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setActivated(true);
            }
        }
        AbstractC16403ejK abstractC16403ejK4 = this.OLrzqt;
        if (abstractC16403ejK4 != null && (c14775drn2 = abstractC16403ejK4.gEmmrt) != null) {
            c14775drn2.setOnTextChanged(new Function1() { // from class: o.flS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18590flK.OLrzqt(c14775drn2, this, (java.lang.String) obj);
                }
            });
        }
        AbstractC16403ejK abstractC16403ejK5 = this.OLrzqt;
        if (abstractC16403ejK5 != null && (c14775drn = abstractC16403ejK5.valueOf) != null) {
            c14775drn.setOnTextChanged(new Function1() { // from class: o.flT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18590flK.copydefault(c14775drn, this, (java.lang.String) obj);
                }
            });
            c14775drn.setOnEditorActionListener(new Function0() { // from class: o.flV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC18590flK.KWHzl(c14775drn, this);
                }
            });
        }
        KWHzl();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.flW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18590flK.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(ActivityC18590flK activityC18590flK, android.view.View view) {
        activityC18590flK.EZpvd();
    }

    public static final Unit copydefault(ActivityC18590flK activityC18590flK, C14775drn c14775drn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18590flK.AEQbTJ();
        c14775drn.values();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C14775drn c14775drn, ActivityC18590flK activityC18590flK, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (c14775drn.EZpvd()) {
            c14775drn.values();
        }
        activityC18590flK.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C14775drn c14775drn, ActivityC18590flK activityC18590flK, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c14775drn.values();
        activityC18590flK.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C14775drn c14775drn, ActivityC18590flK activityC18590flK) {
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx = c14775drn.AkhnZx();
        if (C33129mqd.copydefault((java.lang.Object) ((c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null) ? null : java.lang.Integer.valueOf(text.length())), (java.lang.Object) 6)) {
            activityC18590flK.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ActivityC18590flK activityC18590flK) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18590flK, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        C14775drn c14775drn;
        C14775drn c14775drn2;
        super.onResume();
        if (this.copydefault) {
            this.copydefault = false;
            AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
            if (abstractC16403ejK != null && (c14775drn2 = abstractC16403ejK.copydefault) != null) {
                c14775drn2.requestFocusFromTouch();
            }
            AbstractC16403ejK abstractC16403ejK2 = this.OLrzqt;
            if (abstractC16403ejK2 == null || (c14775drn = abstractC16403ejK2.copydefault) == null) {
                return;
            }
            c14775drn.setState(1);
        }
    }

    private final java.lang.String copydefault() {
        java.lang.String string;
        C14775drn c14775drn;
        C14775drn c14775drn2;
        C14775drn c14775drn3;
        C14775drn c14775drn4;
        C55001xbh c55001xbhAkhnZx;
        android.text.Editable text;
        java.lang.String string2;
        C14775drn c14775drn5;
        C55001xbh c55001xbhAkhnZx2;
        android.text.Editable text2;
        AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
        java.lang.String str = "";
        if (abstractC16403ejK == null || (c14775drn5 = abstractC16403ejK.gEmmrt) == null || (c55001xbhAkhnZx2 = c14775drn5.AkhnZx()) == null || (text2 = c55001xbhAkhnZx2.getText()) == null || (string = text2.toString()) == null) {
            string = "";
        }
        AbstractC16403ejK abstractC16403ejK2 = this.OLrzqt;
        if (abstractC16403ejK2 != null && (c14775drn4 = abstractC16403ejK2.valueOf) != null && (c55001xbhAkhnZx = c14775drn4.AkhnZx()) != null && (text = c55001xbhAkhnZx.getText()) != null && (string2 = text.toString()) != null) {
            str = string2;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC16403ejK abstractC16403ejK3 = this.OLrzqt;
            if (abstractC16403ejK3 == null || (c14775drn = abstractC16403ejK3.valueOf) == null) {
                return null;
            }
            c14775drn.values();
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) str)) {
            AbstractC16403ejK abstractC16403ejK4 = this.OLrzqt;
            if (abstractC16403ejK4 != null && (c14775drn3 = abstractC16403ejK4.valueOf) != null) {
                c14775drn3.values();
            }
            return string;
        }
        AbstractC16403ejK abstractC16403ejK5 = this.OLrzqt;
        if (abstractC16403ejK5 == null || (c14775drn2 = abstractC16403ejK5.valueOf) == null) {
            return null;
        }
        c14775drn2.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.stop));
        return null;
    }

    private final void EZpvd() {
        final java.lang.String string;
        final java.lang.String string2;
        java.lang.String string3;
        C14775drn c14775drn;
        C14775drn c14775drn2;
        C55001xbh c55001xbhAkhnZx;
        android.text.Editable text;
        C14775drn c14775drn3;
        C55001xbh c55001xbhAkhnZx2;
        android.text.Editable text2;
        C14775drn c14775drn4;
        C55001xbh c55001xbhAkhnZx3;
        android.text.Editable text3;
        AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
        if (abstractC16403ejK == null || (c14775drn4 = abstractC16403ejK.copydefault) == null || (c55001xbhAkhnZx3 = c14775drn4.AkhnZx()) == null || (text3 = c55001xbhAkhnZx3.getText()) == null || (string = text3.toString()) == null) {
            string = "";
        }
        AbstractC16403ejK abstractC16403ejK2 = this.OLrzqt;
        if (abstractC16403ejK2 == null || (c14775drn3 = abstractC16403ejK2.gEmmrt) == null || (c55001xbhAkhnZx2 = c14775drn3.AkhnZx()) == null || (text2 = c55001xbhAkhnZx2.getText()) == null || (string2 = text2.toString()) == null) {
            string2 = "";
        }
        AbstractC16403ejK abstractC16403ejK3 = this.OLrzqt;
        if (abstractC16403ejK3 == null || (c14775drn2 = abstractC16403ejK3.valueOf) == null || (c55001xbhAkhnZx = c14775drn2.AkhnZx()) == null || (text = c55001xbhAkhnZx.getText()) == null || (string3 = text.toString()) == null) {
            string3 = "";
        }
        AbstractC16403ejK abstractC16403ejK4 = this.OLrzqt;
        if (abstractC16403ejK4 != null && (c14775drn = abstractC16403ejK4.copydefault) != null) {
            c14775drn.values();
        }
        if (Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) string3)) {
            if (C14126dfa.KWHzl.copydefault(string2).OLrzqt()) {
                AbstractC58260yxt<PasswordCheckResult> abstractC58260yxtOLrzqt = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).OLrzqt(string);
                final Function1 function1 = new Function1() { // from class: o.flY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18590flK.OLrzqt(string, string2, this, (PasswordCheckResult) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.flX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return ActivityC18590flK.djBIcL(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.flO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18590flK.copydefault(this.EZpvd, (PasswordCheckResult) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.flP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC18590flK.AYXKKw(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.flN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC18590flK.copydefault(this.copydefault, (java.lang.Throwable) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.flQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC18590flK.AhwBna(function13, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
                addDisposable(interfaceC58217yxCAEQbTJ);
                return;
            }
            return;
        }
        copydefault();
    }

    public static final InterfaceC58261yxu djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(java.lang.String str, java.lang.String str2, final ActivityC18590flK activityC18590flK, final PasswordCheckResult passwordCheckResult) {
        Intrinsics.checkNotNullParameter(passwordCheckResult, "");
        if (passwordCheckResult.isPassed()) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).KWHzl(str, str2, true, "change");
            final Function1 function1 = new Function1() { // from class: o.flU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18590flK.OLrzqt(passwordCheckResult, activityC18590flK, (java.lang.Boolean) obj);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.flR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC18590flK.AEQbTJ(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(passwordCheckResult);
    }

    public static final PasswordCheckResult AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PasswordCheckResult) function1.invoke(obj);
    }

    public static final PasswordCheckResult OLrzqt(PasswordCheckResult passwordCheckResult, ActivityC18590flK activityC18590flK, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return bool.booleanValue() ? passwordCheckResult : PasswordCheckResult.Companion.EZpvd(activityC18590flK.AEQbTJ);
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC18590flK activityC18590flK, PasswordCheckResult passwordCheckResult) {
        if (passwordCheckResult.isPassed()) {
            C10856bwO.EZpvd(activityC18590flK.getTAG(), new FingerprintLog("delFingerprint changePassword"));
            C14471dmA.EZpvd.EZpvd();
            activityC18590flK.finish();
        } else {
            Intrinsics.copydefault(passwordCheckResult);
            activityC18590flK.KWHzl(passwordCheckResult);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC18590flK activityC18590flK, java.lang.Throwable th) {
        C14775drn c14775drn;
        if (th instanceof ChangePasswordError) {
            AbstractC16403ejK abstractC16403ejK = activityC18590flK.OLrzqt;
            if (abstractC16403ejK != null && (c14775drn = abstractC16403ejK.copydefault) != null) {
                c14775drn.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.stop));
            }
        } else {
            pUU.copydefault(activityC18590flK.getTAG(), "submit error message :" + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(PasswordCheckResult passwordCheckResult) {
        java.lang.String str;
        C14775drn c14775drn;
        int remain = passwordCheckResult.getRemain();
        if (remain == this.AEQbTJ) {
            AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
            if (abstractC16403ejK == null || (c14775drn = abstractC16403ejK.copydefault) == null) {
                return;
            }
            c14775drn.setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.stop));
            return;
        }
        if (remain == 0) {
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
            C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.Dff, C56424yEw.AYXKKw(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, str))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.fQQVvf, C56424yEw.AYXKKw(C56390yDp.OLrzqt("count", java.lang.String.valueOf(remain)))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    private final void KWHzl() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.ResultReceiver1, C56423yEv.EZpvd(C56390yDp.OLrzqt("learnmore", str))) + "\u200b";
        java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.fma
            private static short[] valueOf;
            private static final byte[] $$a = {96, -81, -64, 9};
            private static final int $$b = 82;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int gEmmrt = 0;
            private static int DbNXlk = 1;
            private static char AEQbTJ = 4447;
            private static char OLrzqt = 2264;
            private static char KWHzl = 44725;
            private static char EZpvd = 23196;
            private static int copydefault = 749519196;
            private static int djBIcL = 1640963091;
            private static int AYXKKw = -1760580321;
            private static byte[] AhwBna = {Ascii.FF, -49, 46, -64, Ascii.FS, Ascii.EM, -127, -58, -57, -64, 51, -53, 16, 57, -46, 54, 42, -11, -58, -57, -64, 51, -53, 16, 57, -45, Ascii.RS, -28, -61, 37, -57, -12, -61, 44, -50, 57, -64, 19, 42, -123, 57, 54, -50, 57, -64, 51, 10, -11, -60, -59, -62, 49, -55, 50, -3, -4, 8, Ascii.ETB, -19, -6, 2, -14, Ascii.FF, 6, Ascii.NAK, -40, Ascii.VT, -6, -8, 105, -98, 102, -122, 106, 110, 78, -66, 100, -107, 1, 113, -109, 126, 122, -125, 125, 117, -126, -115, -94, -118, -119, 123, 93, -86, 58, -126, -115, -126, -75, 53, -123, -117, 119, 125, -110, 126, 114, -59, 77, 107, -107, 119, -12, 16, -22, Ascii.FS, Ascii.GS, -18, Ascii.RS, -20, 57, 59, Ascii.ESC, -32, -58, -1, 10, -27, -32, 19, -10, 57, -60, Ascii.DC4, -27};

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$c(short s, short s2, short s3) {
                int i;
                int i2;
                int i3 = s3 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                byte[] bArr = $$a;
                int i4 = 4 - (s2 * 2);
                int i5 = 1 - (s * 4);
                byte[] bArr2 = new byte[i5];
                if (bArr == 0) {
                    int i6 = i3;
                    i2 = 0;
                    i3 = i5;
                    i3 += i6;
                    i4++;
                    i = i2;
                    i2 = i + 1;
                    bArr2[i] = (byte) i3;
                    if (i2 == i5) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i6 = bArr[i4];
                    i3 += i6;
                    i4++;
                    i = i2;
                    i2 = i + 1;
                    bArr2[i] = (byte) i3;
                    if (i2 == i5) {
                    }
                } else {
                    i = 0;
                    i2 = i + 1;
                    bArr2[i] = (byte) i3;
                    if (i2 == i5) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = gEmmrt + 47;
                DbNXlk = i2 % 128;
                java.util.List list = (java.util.List) obj;
                if (i2 % 2 == 0) {
                    ActivityC18590flK.AEQbTJ(list);
                    throw null;
                }
                Unit unitAEQbTJ = ActivityC18590flK.AEQbTJ(list);
                int i3 = DbNXlk + 15;
                gEmmrt = i3 % 128;
                int i4 = i3 % 2;
                return unitAEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2;
                int i3 = 2 % 2;
                Zh zh = new Zh();
                char[] cArr2 = new char[cArr.length];
                zh.EZpvd = 0;
                char[] cArr3 = new char[2];
                int i4 = $11 + 93;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                while (zh.EZpvd < cArr.length) {
                    int i6 = $10 + 5;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        cArr3[0] = cArr[zh.EZpvd];
                        cArr3[0] = cArr[zh.EZpvd + 1];
                        i2 = 1;
                    } else {
                        cArr3[0] = cArr[zh.EZpvd];
                        cArr3[1] = cArr[zh.EZpvd + 1];
                        i2 = 0;
                    }
                    int i7 = $10 + 67;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 58224;
                    while (i2 < 16) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i9) ^ ((c2 << 4) + ((char) (((long) KWHzl) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(EZpvd)};
                            java.lang.Object objEZpvd = YY.EZpvd(-2045992360);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$c(b, b2, (byte) (b2 | 7)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[0]), java.lang.Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) AEQbTJ) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(cCharValue >>> 5), java.lang.Integer.valueOf(OLrzqt)};
                            java.lang.Object objEZpvd2 = YY.EZpvd(-2045992360);
                            if (objEZpvd2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$c(b3, b4, (byte) (b4 | 7)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr3[0] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                            i9 -= 40503;
                            i2++;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[zh.EZpvd] = cArr3[0];
                    cArr2[zh.EZpvd + 1] = cArr3[1];
                    java.lang.Object[] objArr4 = {zh, zh};
                    java.lang.Object objEZpvd3 = YY.EZpvd(-549847163);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$c(b5, b6, (byte) (b6 | 8)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=8] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(short s, int i, byte b, int i2, int i3, java.lang.Object[] objArr) throws java.lang.Throwable {
                int length;
                byte[] bArr;
                int length2;
                byte[] bArr2;
                int i4;
                int i5 = 2 % 2;
                Zj zj = new Zj();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(djBIcL)};
                    java.lang.Object objEZpvd = YY.EZpvd(-1048485176);
                    if (objEZpvd == null) {
                        objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).intValue();
                    int i6 = iIntValue == -1 ? 1 : 0;
                    if (i6 != 0) {
                        byte[] bArr3 = AhwBna;
                        if (bArr3 != null) {
                            int i7 = $11 + 31;
                            $10 = i7 % 128;
                            if (i7 % 2 != 0) {
                                length2 = bArr3.length;
                                bArr2 = new byte[length2];
                                i4 = 1;
                            } else {
                                length2 = bArr3.length;
                                bArr2 = new byte[length2];
                                i4 = 0;
                            }
                            while (i4 < length2) {
                                int i8 = $10 + 11;
                                $11 = i8 % 128;
                                int i9 = i8 % 2;
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr3[i4])};
                                java.lang.Object objEZpvd2 = YY.EZpvd(1815080187);
                                if (objEZpvd2 == null) {
                                    objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new java.lang.Class[]{java.lang.Integer.TYPE});
                                }
                                bArr2[i4] = ((java.lang.Byte) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                                i4++;
                            }
                            bArr3 = bArr2;
                        }
                        if (bArr3 != null) {
                            byte[] bArr4 = AhwBna;
                            try {
                                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(copydefault)};
                                java.lang.Object objEZpvd3 = YY.EZpvd(-1048485176);
                                if (objEZpvd3 == null) {
                                    objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                                }
                                iIntValue = (byte) (((byte) (((long) bArr4[((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) djBIcL) ^ (-2166281683126510581L))));
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            iIntValue = (short) (((short) (((long) valueOf[i3 + ((int) (((long) copydefault) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) djBIcL) ^ (-2166281683126510581L))));
                        }
                    }
                    if (iIntValue > 0) {
                        zj.OLrzqt = ((i3 + iIntValue) - 2) + ((int) (((long) copydefault) ^ (-2166281683126510581L))) + i6;
                        java.lang.Object[] objArr5 = {zj, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(AYXKKw), sb};
                        java.lang.Object objEZpvd4 = YY.EZpvd(-2015189563);
                        if (objEZpvd4 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$c(b2, b3, b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class});
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                        zj.AEQbTJ = zj.EZpvd;
                        byte[] bArr5 = AhwBna;
                        if (bArr5 != null) {
                            int i10 = $11 + 73;
                            $10 = i10 % 128;
                            if (i10 % 2 != 0) {
                                length = bArr5.length;
                                bArr = new byte[length];
                            } else {
                                length = bArr5.length;
                                bArr = new byte[length];
                            }
                            int i11 = 0;
                            while (i11 < length) {
                                int i12 = $11 + 17;
                                $10 = i12 % 128;
                                if (i12 % 2 != 0) {
                                    bArr[i11] = (byte) (((long) bArr5[i11]) | (-2166281683126510581L));
                                } else {
                                    bArr[i11] = (byte) (((long) bArr5[i11]) ^ (-2166281683126510581L));
                                    i11++;
                                }
                            }
                            bArr5 = bArr;
                        }
                        boolean z = bArr5 != null;
                        zj.KWHzl = 1;
                        while (zj.KWHzl < iIntValue) {
                            int i13 = $10 + 31;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            if (z) {
                                byte[] bArr6 = AhwBna;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr6[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                            } else {
                                short[] sArr = valueOf;
                                zj.OLrzqt = zj.OLrzqt - 1;
                                zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                                int i15 = $11 + 119;
                                $10 = i15 % 128;
                                int i16 = i15 % 2;
                            }
                            sb.append(zj.EZpvd);
                            zj.AEQbTJ = zj.EZpvd;
                            zj.KWHzl++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static java.lang.Object[] AEQbTJ(android.content.Context context, int i, int i2) {
                int i3;
                int i4;
                java.lang.Object obj;
                java.lang.String str3;
                java.lang.Class<?> cls;
                short s;
                int i5;
                int i6;
                int i7 = 2;
                int i8 = 2 % 2;
                int i9 = DbNXlk;
                int i10 = 1;
                int i11 = (i9 ^ 31) + ((i9 & 31) << 1);
                int i12 = i11 % 128;
                gEmmrt = i12;
                java.lang.Object obj2 = null;
                if (i11 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i13 = 3;
                if (context == null) {
                    int[] iArr = new int[1];
                    java.lang.Object[] objArr = {new int[]{i}, null, iArr, new int[]{i}};
                    int i14 = ~i;
                    int i15 = 865342413 + (((~((-545722223) | i14)) | 537005610 | (~(434483668 | i14)) | (~((-425767057) | i))) * (-84));
                    int i16 = (~(434483668 | i)) | 545722222;
                    int i17 = ~((-434483669) | i14);
                    int i18 = i15 + ((i16 | i17) * (-84)) + ((425767056 | i17) * 84);
                    int i19 = i12 + 39;
                    int i20 = i19 % 128;
                    DbNXlk = i20;
                    if (i19 % 2 == 0) {
                        int i21 = ~i18;
                        i5 = 344 - (~(-(~(i21 | ((-1) ^ i21)))));
                    } else {
                        int i22 = ~i18;
                        int i23 = ~(i22 | ((-1) ^ i22));
                        int i24 = ~(((-1) ^ i) | i);
                        i5 = (i18 * (-344)) + (((i23 & i24) | (i23 ^ i24)) * 345);
                    }
                    int i25 = i20 + 1;
                    gEmmrt = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = ~(~i18);
                        int i27 = i5 >> ((345 ^ i26) + ((i26 & 345) << 1));
                        int i28 = ~i18;
                        int i29 = i28 | ((-1) ^ i28);
                        i6 = i27 / (345 << (~((i29 & i) | (i29 ^ i))));
                    } else {
                        int i30 = ~(i14 | ((-1) ^ i14));
                        int i31 = ~i18;
                        int i32 = ~i31;
                        int i33 = ((i30 & i32) | (i30 ^ i32)) * 345;
                        int i34 = (i5 ^ i33) + ((i5 & i33) << 1);
                        int i35 = (~(((-1) ^ i31) | i31 | i)) * 345;
                        i6 = ((i35 & i34) << 1) + (i34 ^ i35);
                    }
                    int i36 = ((i6 * CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384) - (~(i2 * (-163)))) - 1;
                    int i37 = ~i;
                    int i38 = ~((i37 ^ i2) | (i37 & i2));
                    int i39 = -(-(((i38 & i6) | (i6 ^ i38)) * (-328)));
                    int i40 = (i36 & i39) + (i36 | i39);
                    int i41 = ((i6 ^ i) | (i6 & i)) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256;
                    int i42 = (i40 & i41) + (i41 | i40);
                    int i43 = ~i6;
                    int i44 = ~i2;
                    int i45 = ~((i43 & i44) | (i43 ^ i44));
                    int i46 = ~i2;
                    int i47 = (~((i & i46) | (i46 ^ i))) | i45 | (~(i2 | i6 | i37));
                    int i48 = (i20 & 31) + (i20 | 31);
                    gEmmrt = i48 % 128;
                    int i49 = i48 % 2;
                    int i50 = i42 + (CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 * i47);
                    int i51 = i50 << 13;
                    int i52 = (i51 & (~i50)) | ((~i51) & i50);
                    int i53 = i52 >>> 17;
                    int i54 = ((~i52) & i53) | ((~i53) & i52);
                    iArr[0] = i54 ^ (i54 << 5);
                    int i55 = i20 + 9;
                    gEmmrt = i55 % 128;
                    int i56 = i55 % 2;
                    return objArr;
                }
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(new char[]{48992, 29379, 3957, 17583, 28010, 44887, 64296, 10591, 16912, 37166, 54174, 55642, 37975, 57530, 11017, 26063, 53529, 58503, 60098, 62349, 55042, 15067, 43962, 41576, 8024, 5636, 37517, 27668, 26205, 58426, 54174, 55642, 11696, 36218, 7992, 59712, 28737, 41788}, 38, objArr2);
                    java.lang.Object[] objArr3 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr2[0]), 2);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    a(new char[]{55674, 26867, 41006, 57492, 64140, 9434, 62895, 21452, 6971, 45640, 28349, 35283, 32247, 61174, 37496, 47727, 4807, 37594, 41006, 57492, 64140, 9434, 62895, 21452, 6971, 45640, 5561, 40149, 61800, 15326, 17166, 26590}, 31, objArr4);
                    java.lang.String str4 = (java.lang.String) objArr4[0];
                    int i57 = DbNXlk;
                    int i58 = (i57 ^ 75) + ((i57 & 75) << 1);
                    gEmmrt = i58 % 128;
                    int i59 = i58 % 2;
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        a(new char[]{48992, 29379, 3957, 17583, 28010, 44887, 64296, 10591, 16912, 37166, 54174, 55642, 37975, 57530, 11017, 26063, 53529, 58503, 60098, 62349, 55042, 15067, 43962, 41576, 8024, 5636, 37517, 27668, 26205, 58426, 54174, 55642, 11696, 36218, 7992, 59712, 28737, 41788}, 38, objArr5);
                        objArr3[0] = java.lang.Class.forName((java.lang.String) objArr5[0]).getDeclaredConstructor(java.lang.String.class).newInstance(str4);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        b((short) 0, -25, (byte) 54, 155143983, -1298390359, objArr6);
                        java.lang.String str5 = (java.lang.String) objArr6[0];
                        int i60 = gEmmrt + 107;
                        DbNXlk = i60 % 128;
                        int i61 = i60 % 2;
                        try {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            a(new char[]{48992, 29379, 3957, 17583, 28010, 44887, 64296, 10591, 16912, 37166, 54174, 55642, 37975, 57530, 11017, 26063, 53529, 58503, 60098, 62349, 55042, 15067, 43962, 41576, 8024, 5636, 37517, 27668, 26205, 58426, 54174, 55642, 11696, 36218, 7992, 59712, 28737, 41788}, 38, objArr7);
                            objArr3[1] = java.lang.Class.forName((java.lang.String) objArr7[0]).getDeclaredConstructor(java.lang.String.class).newInstance(str5);
                            try {
                                java.lang.Object[] objArr8 = new java.lang.Object[1];
                                b((short) 0, -25, (byte) 52, 155144013, -1298390328, objArr8);
                                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                                java.lang.Object[] objArr9 = new java.lang.Object[1];
                                a(new char[]{11821, 42268, 11520, 27234, 52934, 4691, 35740, 27841, 11821, 42268, 2727, 47934, 31761, 50212, 11821, 42268, 36297, 1782}, 17, objArr9);
                                java.lang.Object objInvoke = cls2.getMethod((java.lang.String) objArr9[0], null).invoke(context, null);
                                int i62 = gEmmrt;
                                int i63 = (i62 & 47) + (i62 | 47);
                                DbNXlk = i63 % 128;
                                int i64 = i63 % 2;
                                try {
                                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                                    b((short) 0, -25, (byte) 52, 155144013, -1298390328, objArr10);
                                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr10[0]);
                                    int i65 = gEmmrt + 55;
                                    DbNXlk = i65 % 128;
                                    int i66 = i65 % 2;
                                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                                    b((short) 0, -25, Ascii.SI, 155144019, -1298390305, objArr11);
                                    java.lang.Object objInvoke2 = cls3.getMethod((java.lang.String) objArr11[0], null).invoke(context, null);
                                    int i67 = DbNXlk;
                                    int i68 = (i67 & 37) + (i67 | 37);
                                    gEmmrt = i68 % 128;
                                    int i69 = i68 % 2;
                                    try {
                                        java.lang.Object[] objArr12 = {objInvoke2, 64};
                                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                                        a(new char[]{4422, 643, 53521, 30384, 12217, 46624, 40849, 54898, 30544, 2221, 37180, 61306, 5, 44261, 51468, 52885, 42008, 8469, 63342, 60323, 52934, 4691, 35740, 27841, 11821, 42268, 2727, 47934, 31761, 50212, 11821, 42268, 36297, 1782}, 33, objArr13);
                                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                                        a(new char[]{11821, 42268, 11520, 27234, 52934, 4691, 35740, 27841, 11821, 42268, 25261, 60219, 63608, 55906}, 14, objArr14);
                                        java.lang.Object objInvoke3 = cls4.getMethod((java.lang.String) objArr14[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(objInvoke, objArr12);
                                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                                        a(new char[]{4422, 643, 53521, 30384, 12217, 46624, 40849, 54898, 30544, 2221, 37180, 61306, 5, 44261, 51468, 52885, 42008, 8469, 63342, 60323, 52934, 4691, 35740, 27841, 11821, 42268, 25261, 60219, 63608, 55906}, 30, objArr15);
                                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr15[0]);
                                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                                        a(new char[]{30015, 4878, 49072, 44654, 17352, 51337, 15114, 10069, 42828, 35580}, 10, objArr16);
                                        java.lang.Object[] objArr17 = (java.lang.Object[]) cls5.getField((java.lang.String) objArr16[0]).get(objInvoke3);
                                        int length = objArr17.length;
                                        int i70 = 0;
                                        while (i70 < length) {
                                            int i71 = gEmmrt + 41;
                                            DbNXlk = i71 % 128;
                                            if (i71 % i7 == 0) {
                                                obj = objArr17[i70];
                                                java.lang.Object[] objArr18 = new java.lang.Object[i10];
                                                a(new char[]{50834, 2558, 37517, 27668, 779, 31211}, i13, objArr18);
                                                str3 = (java.lang.String) objArr18[0];
                                            } else {
                                                obj = objArr17[i70];
                                                java.lang.Object[] objArr19 = new java.lang.Object[i10];
                                                a(new char[]{50834, 2558, 37517, 27668, 779, 31211}, 5, objArr19);
                                                str3 = (java.lang.String) objArr19[0];
                                            }
                                            try {
                                                java.lang.Object[] objArr20 = {str3};
                                                java.lang.Object[] objArr21 = new java.lang.Object[i10];
                                                a(new char[]{48992, 29379, 3957, 17583, 32784, 37870, 59802, 60408, 15114, 10069, 55114, 35851, 43988, 44063, 35811, 5296, 62927, 7756, 52387, 8519, 51819, 7404, 19099, 37479, 33103, 43292, 39700, 26085, 8004, 54913, 36440, 59756, 37222, 26196, 59293, 49369, 61642, 20520}, 37, objArr21);
                                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                                java.lang.Object[] objArr22 = new java.lang.Object[i10];
                                                b((short) 0, -25, (byte) 96, 155144019, -1298390291, objArr22);
                                                java.lang.String str6 = (java.lang.String) objArr22[0];
                                                java.lang.Class<?>[] clsArr = new java.lang.Class[i10];
                                                clsArr[0] = java.lang.String.class;
                                                java.lang.Object objInvoke4 = cls6.getMethod(str6, clsArr).invoke(null, objArr20);
                                                try {
                                                    java.lang.Object[] objArr23 = new java.lang.Object[i10];
                                                    a(new char[]{4422, 643, 53521, 30384, 12217, 46624, 40849, 54898, 30544, 2221, 37180, 61306, 5, 44261, 51468, 52885, 42008, 8469, 42372, 5345, 60140, 50200, 31761, 50212, 62151, 46514, 24441, 34309}, 28, objArr23);
                                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                                    java.lang.Object[] objArr24 = new java.lang.Object[i10];
                                                    a(new char[]{38184, 3815, 43484, 31357, 8004, 54913, 33940, 24171, 55593, 17215, 61642, 20520}, 11, objArr24);
                                                    try {
                                                        java.lang.Object[] objArr25 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod((java.lang.String) objArr24[0], null).invoke(obj, null))};
                                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                        a(new char[]{48992, 29379, 3957, 17583, 32784, 37870, 59802, 60408, 15114, 10069, 55114, 35851, 43988, 44063, 35811, 5296, 62927, 7756, 52387, 8519, 51819, 7404, 19099, 37479, 33103, 43292, 39700, 26085, 8004, 54913, 36440, 59756, 37222, 26196, 59293, 49369, 61642, 20520}, 37, objArr26);
                                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr26[0]);
                                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                                        a(new char[]{11821, 42268, 29151, 19659, 55593, 17215, 8004, 54913, 53638, 47964, 62927, 7756, 34553, 34691, 8716, 40666, 17352, 51337, 31898, 1906}, 19, objArr27);
                                                        java.lang.Object objInvoke5 = cls8.getMethod((java.lang.String) objArr27[0], java.io.InputStream.class).invoke(objInvoke4, objArr25);
                                                        int i72 = DbNXlk;
                                                        int i73 = ((i72 | 89) << 1) - (i72 ^ 89);
                                                        gEmmrt = i73 % 128;
                                                        int i74 = i73 % 2;
                                                        int length2 = objArr3.length;
                                                        int i75 = 0;
                                                        for (int i76 = 2; i75 < i76; i76 = 2) {
                                                            java.lang.Object obj3 = objArr3[i75];
                                                            int i77 = gEmmrt;
                                                            int i78 = (i77 ^ 17) + ((i77 & 17) << 1);
                                                            DbNXlk = i78 % 128;
                                                            if (i78 % 2 == 0) {
                                                                try {
                                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                                    b((short) 0, 17, (byte) 127, 155144022, -1298390280, objArr28);
                                                                    cls = java.lang.Class.forName((java.lang.String) objArr28[0]);
                                                                    s = 1;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                                b((short) 0, -25, (byte) -117, 155144022, -1298390280, objArr29);
                                                                cls = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                                                s = 0;
                                                            }
                                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                            b(s, -25, (byte) 16, 155144019, -1298390246, objArr30);
                                                            java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr30[0], null);
                                                            int i79 = DbNXlk;
                                                            int i80 = ((i79 | 57) << 1) - (i79 ^ 57);
                                                            gEmmrt = i80 % 128;
                                                            int i81 = i80 % 2;
                                                            if (!(!obj3.equals(method.invoke(objInvoke5, null)))) {
                                                                java.lang.Object[] objArr31 = {new int[]{i ^ 1}, null, new int[1], new int[]{i}};
                                                                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                                                                int i82 = 490458624 + ((~(264239095 | elapsedCpuTime)) * 623) + (((~elapsedCpuTime) | 136222097) * (-623)) + (((~(elapsedCpuTime | 255849873)) | (~(144611319 | elapsedCpuTime)) | (-264239096)) * 623);
                                                                int i83 = ((i82 | 16) << 1) - (i82 ^ 16);
                                                                int i84 = (i2 ^ i83) + ((i83 & i2) << 1);
                                                                int i85 = i84 << 13;
                                                                int i86 = (i85 | i84) & (~(i84 & i85));
                                                                int i87 = i86 ^ (i86 >>> 17);
                                                                int i88 = i87 << 5;
                                                                ((int[]) objArr31[2])[0] = ((~i87) & i88) | ((~i88) & i87);
                                                                return objArr31;
                                                            }
                                                            i75++;
                                                            int i89 = DbNXlk;
                                                            int i90 = (i89 & 35) + (i89 | 35);
                                                            gEmmrt = i90 % 128;
                                                            if (i90 % 2 != 0) {
                                                                int i91 = 4 / 4;
                                                            }
                                                        }
                                                        i70 = (i70 ^ 1) + ((i70 & 1) << 1);
                                                        i7 = 2;
                                                        i13 = 3;
                                                        i10 = 1;
                                                    } catch (java.lang.Throwable th2) {
                                                        java.lang.Throwable cause2 = th2.getCause();
                                                        if (cause2 != null) {
                                                            throw cause2;
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause5 = th5.getCause();
                                        if (cause5 != null) {
                                            throw cause5;
                                        }
                                        throw th5;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable unused) {
                }
                int i92 = gEmmrt + 23;
                int i93 = i92 % 128;
                DbNXlk = i93;
                int i94 = i92 % 2;
                java.lang.Object[] objArr32 = {new int[]{i}, null, new int[1], new int[]{i}};
                int i95 = (i93 ^ 83) + ((i93 & 83) << 1);
                gEmmrt = i95 % 128;
                int i96 = i95 % 2;
                int i97 = (int) java.lang.Runtime.getRuntime().totalMemory();
                int i98 = (~(351794424 | i97)) | 185074178;
                int i99 = ~i97;
                int i100 = (-1575830025) + ((i98 | (~((-73835625) | i99))) * 886) + (((~(i99 | (-351794425))) | 463032978) * (-1772)) + ((~(i99 | 463032978)) * 886);
                int i101 = i100 * 624;
                int i102 = i2 * (-622);
                int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
                int i104 = ~i2;
                int i105 = (i104 & i100) | (i104 ^ i100);
                int i106 = i105 | i;
                int i107 = DbNXlk;
                int i108 = ((i107 | 107) << 1) - (i107 ^ 107);
                int i109 = i108 % 128;
                gEmmrt = i109;
                if (i108 % 2 != 0) {
                    int i110 = i103 / (623 - (~i106));
                    int i111 = ~i;
                    int i112 = ~((~i100) | i2);
                    int i113 = (i111 & i112) | (i111 ^ i112);
                    i3 = i110 / ((i113 & (-623)) + (i113 | (-623)));
                } else {
                    int i114 = i103 + ((~i106) * 623);
                    int i115 = ~i;
                    int i116 = ~i100;
                    int i117 = ~((i116 & i2) | (i116 ^ i2));
                    int i118 = ((i115 & i117) | (i115 ^ i117)) * (-623);
                    i3 = (i114 & i118) + (i118 | i114);
                    int i119 = ~i2;
                    i105 = (i119 & i100) | (i119 ^ i100);
                }
                int i120 = ~i105;
                int i121 = ~i2;
                int i122 = ~((i121 & i) | (i121 ^ i));
                int i123 = (i122 & i120) | (i120 ^ i122);
                int i124 = ~((i & i100) | (i100 ^ i));
                int i125 = 623 * ((i124 & i123) | (i123 ^ i124));
                int i126 = (i3 ^ i125) + ((i125 & i3) << 1);
                int i127 = i126 << 13;
                int i128 = (i126 | i127) & (~(i126 & i127));
                int i129 = ((i109 | 53) << 1) - (i109 ^ 53);
                int i130 = i129 % 128;
                DbNXlk = i130;
                if (i129 % 2 == 0) {
                    int i131 = i128 << 62;
                    int i132 = ((~i128) & i131) | ((~i131) & i128);
                    int i133 = i132 / 4;
                    int i134 = ((~i132) & i133) | ((~i133) & i132);
                    i4 = 2;
                    ((int[]) objArr32[2])[0] = i134;
                } else {
                    i4 = 2;
                    int i135 = i128 ^ (i128 >>> 17);
                    ((int[]) objArr32[2])[0] = i135 ^ (i135 << 5);
                }
                int i136 = i130 + 49;
                gEmmrt = i136 % 128;
                int i137 = i136 % i4;
                return objArr32;
            }
        }, 14, null);
        AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
        if (abstractC16403ejK != null && (textView2 = abstractC16403ejK.AYXKKw) != null) {
            textView2.setText(charSequence);
        }
        AbstractC16403ejK abstractC16403ejK2 = this.OLrzqt;
        if (abstractC16403ejK2 == null || (textView = abstractC16403ejK2.AYXKKw) == null) {
            return;
        }
        AbstractC16403ejK abstractC16403ejK3 = this.OLrzqt;
        Intrinsics.copydefault(abstractC16403ejK3);
        textView.setOnTouchListener(new ViewOnTouchListenerC14460dlq(abstractC16403ejK3.AYXKKw, str2, str, new Function0() { // from class: o.flZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18590flK.OLrzqt(this.copydefault);
            }
        }));
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC18590flK activityC18590flK) {
        activityC18590flK.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        C33570myu.copydefault((android.app.Activity) this);
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActionBarLayoutParams)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    public final void AEQbTJ() {
        java.lang.CharSequence text;
        java.lang.String string;
        C52794wYp c52794wYp;
        android.text.Editable text2;
        java.lang.String string2;
        android.text.Editable text3;
        AbstractC16403ejK abstractC16403ejK = this.OLrzqt;
        if (abstractC16403ejK != null) {
            C55001xbh c55001xbhAkhnZx = abstractC16403ejK.copydefault.AkhnZx();
            java.lang.String str = "";
            if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null) {
                text = "";
            }
            C55001xbh c55001xbhAkhnZx2 = abstractC16403ejK.gEmmrt.AkhnZx();
            if (c55001xbhAkhnZx2 == null || (text3 = c55001xbhAkhnZx2.getText()) == null || (string = text3.toString()) == null) {
                string = "";
            }
            C55001xbh c55001xbhAkhnZx3 = abstractC16403ejK.valueOf.AkhnZx();
            if (c55001xbhAkhnZx3 != null && (text2 = c55001xbhAkhnZx3.getText()) != null && (string2 = text2.toString()) != null) {
                str = string2;
            }
            C14126dfa c14126dfa = C14126dfa.KWHzl;
            C14126dfa.StateListAnimator stateListAnimatorCopydefault = c14126dfa.copydefault(string);
            C14126dfa.StateListAnimator stateListAnimatorCopydefault2 = c14126dfa.copydefault(str);
            boolean zOLrzqt = stateListAnimatorCopydefault.OLrzqt();
            boolean zOLrzqt2 = stateListAnimatorCopydefault2.OLrzqt();
            AbstractC16403ejK abstractC16403ejK2 = this.OLrzqt;
            if (abstractC16403ejK2 == null || (c52794wYp = abstractC16403ejK2.AEQbTJ) == null) {
                return;
            }
            c52794wYp.setEnabled(C33129mqd.OLrzqt(text) && C33129mqd.OLrzqt((java.lang.CharSequence) string) && C33129mqd.OLrzqt((java.lang.CharSequence) str) && zOLrzqt && zOLrzqt2);
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
    public void onStart() {
        super.onStart();
    }
}
