package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.okinc.base.thread.TPM;
import com.okinc.common.util.CheckTimeResponse;
import com.okinc.common.util.CheckTimeService;
import com.okinc.lib.utils.OkUtils;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32549mfg;
import o.C32613mgr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32613mgr {
    public static WeakReference<ViewOnClickListenerC54939xaY> AhwBna;
    public static boolean OLrzqt;
    public static final C32613mgr copydefault = new C32613mgr();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mgs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32613mgr.copydefault();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mgp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32613mgr.AEQbTJ();
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mgr$ActionBar */
    public static final class ActionBar implements TPM.Application {
        public final java.lang.String AEQbTJ = "Monitor.Tamper.Time";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.base.thread.TPM.Application
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }
    }

    /* JADX INFO: renamed from: o.mgr$TaskDescription */
    public static final class TaskDescription extends TypeToken<ResponseData<CheckTimeResponse>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return OLrzqt;
    }

    private C32613mgr() {
    }

    public static final CheckTimeService copydefault() {
        return CheckTimeService.Companion.copydefault();
    }

    public final CheckTimeService OLrzqt() {
        return (CheckTimeService) EZpvd.getValue();
    }

    public final AbstractC58253yxm AhwBna() {
        return (AbstractC58253yxm) KWHzl.getValue();
    }

    public static final AbstractC58253yxm AEQbTJ() {
        return TPM.ActionBar.AEQbTJ.KWHzl(new ActionBar());
    }

    public final void copydefault(boolean z) {
        if (C33551myb.copydefault()) {
            pUU.KWHzl("Monitor.Tamper.Time", "init");
            OkUtils.copydefault().registerActivityLifecycleCallbacks(new Activity(z));
            C54819xWm.KWHzl().AEQbTJ(new Application());
        }
    }

    /* JADX INFO: renamed from: o.mgr$Activity */
    public static final class Activity extends C32981mno {
        public final /* synthetic */ boolean EZpvd;
        public final java.util.List<java.lang.String> KWHzl = new java.util.ArrayList();

        public Activity(boolean z) {
            this.EZpvd = z;
        }

        @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "");
            java.lang.String name = activity.getClass().getName();
            pUU.KWHzl("Monitor.Tamper.Time", "onActivityCreated=" + this.KWHzl.size() + ",isColdInit:" + this.EZpvd + "->" + name + " ");
            if (this.KWHzl.size() == 1) {
                C32613mgr.copydefault.OLrzqt(activity);
            }
            if (this.KWHzl.size() > 3 || this.KWHzl.contains(name)) {
                return;
            }
            pUU.KWHzl("Monitor.Tamper.Time", "activityList add " + name);
            java.util.List<java.lang.String> list = this.KWHzl;
            Intrinsics.copydefault((java.lang.Object) name);
            list.add(name);
        }
    }

    /* JADX INFO: renamed from: o.mgr$Application */
    public static final class Application implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        @Override // o.InterfaceC54816xWj
        public void copydefault() {
            C32613mgr c32613mgr = C32613mgr.copydefault;
            pUU.KWHzl("Monitor.Tamper.Time", "onAppEnterForeground mandatory:" + c32613mgr.gEmmrt());
            c32613mgr.AEQbTJ(new yHO() { // from class: o.mgC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C32613mgr.Application.OLrzqt(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                }
            });
        }

        public static final Unit OLrzqt(boolean z, boolean z2, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C32613mgr.copydefault.KWHzl(z, z2, str);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl(boolean z, boolean z2, @NotNull java.lang.String str) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY;
        WeakReference<ViewOnClickListenerC54939xaY> weakReference;
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2;
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            WeakReference<ViewOnClickListenerC54939xaY> weakReference2 = AhwBna;
            if (weakReference2 == null || (viewOnClickListenerC54939xaY = weakReference2.get()) == null) {
                return;
            }
            viewOnClickListenerC54939xaY.dismiss();
            return;
        }
        WeakReference<ViewOnClickListenerC54939xaY> weakReference3 = AhwBna;
        if ((weakReference3 != null ? weakReference3.get() : null) == null || (weakReference = AhwBna) == null || (viewOnClickListenerC54939xaY2 = weakReference.get()) == null || !viewOnClickListenerC54939xaY2.isShowing()) {
            pUU.KWHzl("Monitor.Tamper.Time", "onAppEnterForeground showDialog");
            if (z2 && OLrzqt) {
                AEQbTJ(z2, str);
            }
        }
    }

    public final void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.lang.String name = activity.getClass().getName();
        android.view.View decorView = activity.getWindow() == null ? null : activity.getWindow().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            android.view.ViewTreeObserver viewTreeObserver = ((android.view.ViewGroup) decorView).getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnWindowFocusChangeListener(new StateListAnimator(decorView));
            }
            pUU.KWHzl("Monitor.Tamper.Time", "DecorView addOnWindowFocusChangeListener success " + name);
            return;
        }
        pUU.KWHzl("Monitor.Tamper.Time", "DecorView is not ViewGroup");
    }

    /* JADX INFO: renamed from: o.mgr$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnWindowFocusChangeListener {
        public final /* synthetic */ android.view.View OLrzqt;

        public StateListAnimator(android.view.View view) {
            this.OLrzqt = view;
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
            pUU.KWHzl("Monitor.Tamper.Time", "hasFocus:" + z + " ");
            if (z) {
                C32613mgr.copydefault.AEQbTJ(new yHO() { // from class: o.mgB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C32613mgr.StateListAnimator.OLrzqt(((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), (java.lang.String) obj3);
                    }
                });
                android.view.ViewTreeObserver viewTreeObserver = ((android.view.ViewGroup) this.OLrzqt).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnWindowFocusChangeListener(this);
                }
            }
        }

        public static final Unit OLrzqt(boolean z, boolean z2, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                C32613mgr c32613mgr = C32613mgr.copydefault;
                c32613mgr.AEQbTJ(z2);
                c32613mgr.AEQbTJ(z2, str);
            }
            pUU.KWHzl("Monitor.Tamper.Time", "pop=" + z + ",force=" + z2);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mgr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkTime$OKLauncher_launcher_impl$default(C32613mgr c32613mgr, yHO yho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            yho = null;
        }
        c32613mgr.AEQbTJ((yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit>) yho);
    }

    public final void AEQbTJ(final yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit> yho) {
        AbstractC58185ywX abstractC58185ywXCopydefault;
        AbstractC58185ywX abstractC58185ywXKWHzl;
        AbstractC58185ywX abstractC58185ywXCheck$default = CheckTimeService.StateListAnimator.check$default(OLrzqt(), java.lang.System.currentTimeMillis(), null, 2, null);
        if (abstractC58185ywXCheck$default == null || (abstractC58185ywXCopydefault = abstractC58185ywXCheck$default.copydefault(AhwBna())) == null || (abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(C58266yxz.OLrzqt())) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: o.mgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32613mgr.AEQbTJ(yho, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.mgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32613mgr.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.mgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32613mgr.AEQbTJ(yho, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.mgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C32613mgr.KWHzl(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(yHO yho, ResponseData responseData) {
        pUU.KWHzl("Monitor.Tamper.Time", "verify=success " + responseData);
        if (yho != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            yho.invoke(bool, bool, "");
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(yHO yho, java.lang.Throwable th) {
        C32613mgr c32613mgr = copydefault;
        Intrinsics.copydefault(th);
        c32613mgr.OLrzqt(th, (yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit>) yho);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mgr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void parseErrorResponse$OKLauncher_launcher_impl$default(C32613mgr c32613mgr, java.lang.Throwable th, yHO yho, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            yho = null;
        }
        c32613mgr.OLrzqt(th, (yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit>) yho);
    }

    public final void OLrzqt(@NotNull java.lang.Throwable th, yHO<? super java.lang.Boolean, ? super java.lang.Boolean, ? super java.lang.String, Unit> yho) {
        java.lang.String strEZpvd;
        java.lang.String msg;
        CheckTimeResponse checkTimeResponse;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(th, "");
        if (!(th instanceof OKServerException)) {
            if (yho != null) {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                yho.invoke(bool, bool, "");
                return;
            }
            return;
        }
        OKServerException oKServerException = (OKServerException) th;
        pUU.KWHzl("Monitor.Tamper.Time", "check api failed " + oKServerException.getCode() + " " + oKServerException.getResponse() + " " + th + " ");
        java.lang.reflect.Type type = new TaskDescription().getType();
        Intrinsics.checkNotNullExpressionValue(type, "");
        JsonObject response = oKServerException.getResponse();
        if (response == null || (strEZpvd = C33488mxR.EZpvd(response)) == null) {
            strEZpvd = "";
        }
        ResponseData responseData = (ResponseData) C33490mxT.EZpvd(strEZpvd, type);
        if (oKServerException.getCode() != 3968) {
            if (yho != null) {
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                yho.invoke(bool2, bool2, "");
                return;
            }
            return;
        }
        boolean mandatory = (responseData == null || (checkTimeResponse = (CheckTimeResponse) responseData.getData()) == null) ? false : checkTimeResponse.getMandatory();
        pUU.KWHzl("Monitor.Tamper.Time", "callback mandatory:" + mandatory);
        if (yho != null) {
            java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
            if (responseData != null && (msg = responseData.getMsg()) != null) {
                str = msg;
            }
            yho.invoke(bool3, java.lang.Boolean.valueOf(mandatory), str);
        }
    }

    public final void AYXKKw() {
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.DATE_SETTINGS");
            intent.setFlags(268435456);
            android.content.pm.ResolveInfo resolveInfoResolveActivity = C38052pKl.AEQbTJ().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                android.content.pm.ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                Intrinsics.checkNotNullExpressionValue(activityInfo, "");
                java.lang.String str = activityInfo.name;
                Intrinsics.checkNotNullExpressionValue(str, "");
                pUU.KWHzl("Monitor.Tamper.Time", "promptUserToEnableAutoTime  can jump to  date setting page,className:" + str);
                OkUtils.OLrzqt().startActivity(intent);
            } else {
                djBIcL();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("Monitor.Tamper.Time", "promptUserToEnableAutoTime error :" + e);
        }
    }

    public final void djBIcL() {
        android.content.Intent intent = new android.content.Intent("android.settings.SETTINGS");
        intent.setFlags(268435456);
        android.content.pm.ResolveInfo resolveInfoResolveActivity = C38052pKl.AEQbTJ().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null) {
            android.content.pm.ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            Intrinsics.checkNotNullExpressionValue(activityInfo, "");
            java.lang.String str = activityInfo.name;
            Intrinsics.checkNotNullExpressionValue(str, "");
            pUU.KWHzl("Monitor.Tamper.Time", "promptUserToEnableAutoTime  can jump to setting page,className:" + str);
            OkUtils.OLrzqt().startActivity(intent);
            return;
        }
        pUU.KWHzl("Monitor.Tamper.Time", "promptUserToEnableAutoTime can not  jump to setting");
    }

    public final void AEQbTJ(final boolean z, @NotNull final java.lang.String str) {
        android.view.View decorView;
        Intrinsics.checkNotNullParameter(str, "");
        final android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ != null) {
            pUU.KWHzl("Monitor.Tamper.Time", "showDialog Activity=> " + activityAEQbTJ.getClass().getName());
            if (activityAEQbTJ.isDestroyed() || activityAEQbTJ.isFinishing()) {
                return;
            }
            android.view.Window window = activityAEQbTJ.getWindow();
            pUU.KWHzl("Monitor.Tamper.Time", "showDialog activity exist " + (window != null ? window.getDecorView() : null));
            android.view.Window window2 = activityAEQbTJ.getWindow();
            if (window2 == null || (decorView = window2.getDecorView()) == null) {
                return;
            }
            decorView.post(new java.lang.Runnable() { // from class: o.mgz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C32613mgr.KWHzl(activityAEQbTJ, str, z);
                }
            });
            pUU.KWHzl("Monitor.Tamper.Time", "showDialog end");
        }
    }

    public static final void KWHzl(android.app.Activity activity, java.lang.String str, boolean z) {
        pUU.KWHzl("Monitor.Tamper.Time", "showDialog show");
        copydefault.OLrzqt(activity, str, z);
    }

    public final void OLrzqt(android.app.Activity activity, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (activity != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C32549mfg.StateListAnimator.copydefault));
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C32549mfg.StateListAnimator.AEQbTJ), new View.OnClickListener() { // from class: o.mgt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C32613mgr.AEQbTJ(view);
                }
            });
            if (!z) {
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C32549mfg.StateListAnimator.EZpvd), new View.OnClickListener() { // from class: o.mgv
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C32613mgr.EZpvd(viewOnClickListenerC54939xaY, view);
                    }
                });
            }
            AhwBna = new WeakReference<>(viewOnClickListenerC54939xaY);
            viewOnClickListenerC54939xaY.show();
            pUU.KWHzl("Monitor.Tamper.Time", "showDialog show");
        }
    }

    public static final void AEQbTJ(android.view.View view) {
        copydefault.AYXKKw();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
