package o;

import android.view.View;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ujg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49180ujg {
    public static final C49180ujg EZpvd = new C49180ujg();

    private C49180ujg() {
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("key_screenshot_enable", true, "sp_screenshot");
    }

    public final void OLrzqt(boolean z, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (z) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            SPUtils.commit("key_screenshot_enable", bool, "sp_screenshot");
            function1.invoke(bool);
        } else {
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            SPUtils.commit("key_screenshot_enable", bool2, "sp_screenshot");
            function1.invoke(bool2);
        }
    }

    public final java.lang.CharSequence KWHzl() {
        android.content.Context contextAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (contextAEQbTJ == null) {
            contextAEQbTJ = C32979mnm.EZpvd.OLrzqt();
        }
        java.lang.String string = contextAEQbTJ.getResources().getString(C48931uew.Activity.hDKMBd);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final ViewOnClickListenerC54939xaY copydefault(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setTitle(C48931uew.Activity.iwGUEr);
        viewOnClickListenerC54939xaY.copydefault(C48931uew.Activity.getNewProxyInstance);
        viewOnClickListenerC54939xaY.EZpvd(C48931uew.Activity.getFieldNames, (View.OnClickListener) null);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }
}
