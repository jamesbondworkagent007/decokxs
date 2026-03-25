package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC14457dln;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C14458dlo implements InterfaceC14457dln {
    public final android.app.Activity EZpvd;

    public C14458dlo(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
    }

    @Override // o.InterfaceC14457dln
    public boolean OLrzqt() {
        return InterfaceC14457dln.Activity.OLrzqt(this);
    }

    @Override // o.InterfaceC14457dln
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.finish();
    }
}
