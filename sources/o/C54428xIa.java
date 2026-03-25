package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54428xIa {
    public static final C54428xIa AEQbTJ = new C54428xIa();

    private C54428xIa() {
    }

    public final void copydefault(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        try {
            android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (contextAEQbTJ == null) {
                contextAEQbTJ = C43246rlf.OLrzqt.valueOf();
            }
            C55097xdX c55097xdX = new C55097xdX(contextAEQbTJ, null, 0, 6, null);
            c55097xdX.setState(i);
            c55097xdX.setTitle(str);
            c55097xdX.setMessage(str2);
            c55097xdX.setCloseBtnShow(z);
            c55097xdX.setOnClickListener(onClickListener);
            if (C54819xWm.KWHzl().AEQbTJ() == null) {
                return;
            }
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 48, 0, 0, 24, null);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
