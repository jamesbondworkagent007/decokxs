package o;

import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57589ylK {
    public static /* synthetic */ void finishStatus$default(C33546myW c33546myW, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        KWHzl(c33546myW, z);
    }

    public static final void KWHzl(@NotNull C33546myW c33546myW, boolean z) {
        Intrinsics.checkNotNullParameter(c33546myW, "");
        c33546myW.copydefault();
        if (z) {
            c33546myW.AYXKKw();
        } else {
            c33546myW.valueOf();
        }
        c33546myW.copydefault(java.lang.Boolean.valueOf(z));
    }

    public static final boolean AEQbTJ(@NotNull C33546myW c33546myW) {
        Intrinsics.checkNotNullParameter(c33546myW, "");
        return c33546myW.DbNXlk() == RefreshState.Loading;
    }
}
