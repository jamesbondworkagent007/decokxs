package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ixH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25464ixH implements InterfaceC25462ixF {
    @Override // o.InterfaceC25462ixF
    public void copydefault(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.containsKey("specialZoneTabId")) {
            C27508jwX.AEQbTJ.AEQbTJ(activity, C33129mqd.AhwBna(java.lang.Integer.valueOf(bundle.getInt("specialZoneTabId"))));
        }
    }
}
