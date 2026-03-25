package o;

import com.google.android.gms.stats.CodePackage;
import com.onesignal.LocationController;
import com.onesignal.OneSignal;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC57840ypx;
import o.C57713ync;
import o.C57792ypB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ynI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57693ynI implements ActivityC57840ypx.TaskDescription {
    public static final C57693ynI copydefault;

    private C57693ynI() {
    }

    static {
        C57693ynI c57693ynI = new C57693ynI();
        copydefault = c57693ynI;
        ActivityC57840ypx.KWHzl(CodePackage.LOCATION, c57693ynI);
    }

    public final void OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ActivityC57840ypx.EZpvd(z, CodePackage.LOCATION, str, C57693ynI.class);
    }

    public final void KWHzl(OneSignal.PromptActionResult promptActionResult) {
        LocationController.copydefault(true, promptActionResult);
    }

    @Override // o.ActivityC57840ypx.TaskDescription
    public void KWHzl() {
        KWHzl(OneSignal.PromptActionResult.PERMISSION_GRANTED);
        LocationController.AkhnZx();
    }

    @Override // o.ActivityC57840ypx.TaskDescription
    public void AEQbTJ(boolean z) {
        KWHzl(OneSignal.PromptActionResult.PERMISSION_DENIED);
        if (z) {
            OLrzqt();
        }
        LocationController.djBIcL();
    }

    public final void OLrzqt() {
        android.app.Activity newProxyInstance = OneSignal.getNewProxyInstance();
        if (newProxyInstance == null) {
            return;
        }
        C57713ync c57713ync = C57713ync.OLrzqt;
        java.lang.String string = newProxyInstance.getString(C57792ypB.ActionBar.KWHzl);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = newProxyInstance.getString(C57792ypB.ActionBar.EZpvd);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c57713ync.copydefault(newProxyInstance, string, string2, new Activity(newProxyInstance));
    }

    /* JADX INFO: renamed from: o.ynI$Activity */
    public static final class Activity implements C57713ync.Activity {
        public final /* synthetic */ android.app.Activity KWHzl;

        public Activity(android.app.Activity activity) {
            this.KWHzl = activity;
        }

        @Override // o.C57713ync.Activity
        public void EZpvd() {
            C57691ynG.AEQbTJ.EZpvd(this.KWHzl);
            LocationController.copydefault(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
        }

        @Override // o.C57713ync.Activity
        public void copydefault() {
            LocationController.copydefault(true, OneSignal.PromptActionResult.PERMISSION_DENIED);
        }
    }
}
