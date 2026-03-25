package com.okinc.core.base.transtion;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC33018moY;
import o.InterfaceC33019moZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PageTranstionAnim implements InterfaceC33018moY {
    public static final int $stable = 8;
    private int enterAnim = C52761wXj.Application.isConnected;
    private int exitAnim = C52761wXj.Application.AuCTel;
    private boolean hasSetAnimatorResource;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33018moY
    public void setAnimatorResource(int i, int i2) {
        this.hasSetAnimatorResource = true;
        this.enterAnim = i;
        this.exitAnim = i2;
    }

    @Override // o.InterfaceC33018moY
    public void pageInAnim(@NotNull WeakReference<InterfaceC33019moZ> weakReference) {
        int i;
        Intrinsics.checkNotNullParameter(weakReference, "");
        if (interceptPageAnim(weakReference)) {
            Object obj = (InterfaceC33019moZ) weakReference.get();
            Intrinsics.copydefault(obj, "");
            Activity activity = (Activity) obj;
            if (this.hasSetAnimatorResource) {
                i = this.enterAnim;
            } else {
                i = isRtl(activity) ? C52761wXj.Application.DbNXlk : C52761wXj.Application.isConnected;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                activity.overrideActivityTransition(0, i, C52761wXj.Application.fetchVPNInfo);
            } else {
                activity.overridePendingTransition(i, C52761wXj.Application.fetchVPNInfo);
            }
        }
    }

    @Override // o.InterfaceC33018moY
    public void pageOutAnim(@NotNull WeakReference<InterfaceC33019moZ> weakReference) {
        int i;
        Intrinsics.checkNotNullParameter(weakReference, "");
        if (interceptPageAnim(weakReference)) {
            Object obj = (InterfaceC33019moZ) weakReference.get();
            Intrinsics.copydefault(obj, "");
            Activity activity = (Activity) obj;
            if (this.hasSetAnimatorResource) {
                i = this.exitAnim;
            } else {
                i = isRtl(activity) ? C52761wXj.Application.values : C52761wXj.Application.AuCTel;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                activity.overrideActivityTransition(1, 0, i);
            } else {
                activity.overridePendingTransition(0, i);
            }
        }
    }

    private final boolean interceptPageAnim(WeakReference<InterfaceC33019moZ> weakReference) {
        InterfaceC33019moZ interfaceC33019moZ = weakReference.get();
        if (interfaceC33019moZ != null) {
            return interfaceC33019moZ.animOpen();
        }
        return true;
    }

    private final boolean isRtl(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
