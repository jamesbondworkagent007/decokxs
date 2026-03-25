package o;

import android.os.Build;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eCM {
    public static final eCM KWHzl = new eCM();

    private eCM() {
    }

    public final android.app.Dialog copydefault(@NotNull final android.app.Activity activity, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.getQueueItem);
        viewOnClickListenerC54939xaY.copydefault(Build.VERSION.SDK_INT >= 31 ? C13754dXa.FragmentManager.MediaSessionCompatResultReceiverWrapper1 : C13754dXa.FragmentManager.MediaSessionCompatResultReceiverWrapper);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.fromQueueItem, new View.OnClickListener() { // from class: o.eCT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eCM.AEQbTJ(activity, viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.MediaSessionCompatQueueItem, new View.OnClickListener() { // from class: o.eCU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eCM.EZpvd(viewOnClickListenerC54939xaY, function02, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }

    public static final void AEQbTJ(android.app.Activity activity, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        C33625mzw.OLrzqt().KWHzl(activity);
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public final android.app.Dialog OLrzqt(@NotNull android.content.Context context, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.MediaSessionCompatQueueItem1);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.MediaSessionCompatSessionFlags);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.getQueueId, new View.OnClickListener() { // from class: o.eCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eCM.KWHzl(function0, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.MediaSessionCompatQueueItem, new View.OnClickListener() { // from class: o.eCR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eCM.OLrzqt(viewOnClickListenerC54939xaY, function02, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }

    public static final void KWHzl(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }
}
