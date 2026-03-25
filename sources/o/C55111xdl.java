package o;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55111xdl implements InterfaceC55114xdo {
    public final android.app.Activity EZpvd;
    public DialogC55112xdm OLrzqt;

    public C55111xdl(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
    }

    @Override // o.InterfaceC55114xdo
    public void showToast(int i, int i2) {
        dismissLoading();
        C55326xho.toast$default(i, (android.graphics.drawable.Drawable) null, i2, (java.lang.Integer) null, 0, 0, 29, (java.lang.Object) null);
    }

    @Override // o.InterfaceC55114xdo
    public void cancelToast() {
        android.widget.Toast toast;
        WeakReference<android.widget.Toast> weakReferenceKWHzl = C55328xhq.OLrzqt.KWHzl();
        if (weakReferenceKWHzl == null || (toast = weakReferenceKWHzl.get()) == null) {
            return;
        }
        toast.cancel();
    }

    @Override // o.InterfaceC33075mpc
    public void showLoading() {
        cancelToast();
        DialogC55112xdm dialogC55112xdm = this.OLrzqt;
        if (dialogC55112xdm == null || !dialogC55112xdm.isShowing()) {
            DialogC55112xdm dialogC55112xdm2 = this.OLrzqt;
            if (dialogC55112xdm2 == null) {
                android.app.Activity activity = this.EZpvd;
                dialogC55112xdm2 = new DialogC55112xdm(activity, C55366xib.copydefault(C52761wXj.ActionBar.ODXsMY, activity));
            }
            this.OLrzqt = dialogC55112xdm2;
            dialogC55112xdm2.show();
        }
    }

    @Override // o.InterfaceC33075mpc
    public void showLoading(long j) {
        AEQbTJ(j);
    }

    @Override // o.InterfaceC33075mpc
    public void dismissLoading() {
        DialogC55112xdm dialogC55112xdm = this.OLrzqt;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
    }

    @Override // o.InterfaceC33075mpc
    public void releaseLoading() {
        dismissLoading();
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingWithLogo() {
        showLoading();
    }

    @Override // o.InterfaceC33075mpc
    public void dismissLoadingWithLogo() {
        dismissLoading();
    }

    @Override // o.InterfaceC33075mpc
    public void showLoadingWithLogo(long j) {
        AEQbTJ(j);
    }

    public final void AEQbTJ(long j) {
        cancelToast();
        DialogC55112xdm dialogC55112xdm = this.OLrzqt;
        if ((dialogC55112xdm != null && dialogC55112xdm.isShowing()) || this.EZpvd.isFinishing() || this.EZpvd.isDestroyed()) {
            return;
        }
        DialogC55112xdm dialogC55112xdm2 = this.OLrzqt;
        if (dialogC55112xdm2 == null) {
            android.app.Activity activity = this.EZpvd;
            dialogC55112xdm2 = new DialogC55112xdm(activity, C55366xib.copydefault(C52761wXj.ActionBar.ODXsMY, activity));
        }
        this.OLrzqt = dialogC55112xdm2;
        dialogC55112xdm2.EZpvd(j);
        dialogC55112xdm2.show();
    }

    @Override // o.InterfaceC55114xdo
    public void destroy() {
        DialogC55112xdm dialogC55112xdm = this.OLrzqt;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
        this.OLrzqt = null;
    }
}
