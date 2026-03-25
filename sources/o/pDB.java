package o;

import android.view.View;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C35966oKh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pDB {
    public static final pDB OLrzqt = new pDB();

    private pDB() {
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setTitle(C35966oKh.TaskDescription.AkhnZx);
        viewOnClickListenerC54939xaY.copydefault(C35966oKh.TaskDescription.fetchVPNInfo);
        viewOnClickListenerC54939xaY.EZpvd(C35966oKh.TaskDescription.valueOf, new View.OnClickListener() { // from class: o.pDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pDB.EZpvd(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C35966oKh.TaskDescription.copydefault, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public final void KWHzl(@NotNull android.app.Activity activity, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setTitle(C35966oKh.TaskDescription.isConnected);
        viewOnClickListenerC54939xaY.OLrzqt(C35966oKh.TaskDescription.copydefault, new View.OnClickListener() { // from class: o.pDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pDB.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.EZpvd(C35966oKh.TaskDescription.AYXKKw, new View.OnClickListener() { // from class: o.pDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                pDB.copydefault(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        pDD.KWHzl(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    }

    public static final void copydefault(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
        pDD.KWHzl(RequestParameters.SUBRESOURCE_DELETE);
    }
}
