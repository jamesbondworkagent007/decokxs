package o;

import android.content.DialogInterface;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ivd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25380ivd {
    public static final C25380ivd KWHzl = new C25380ivd();

    private C25380ivd() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ivd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewOnClickListenerC54939xaY showLimitedFeatureDialog$default(C25380ivd c25380ivd, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            function0 = null;
        }
        return c25380ivd.AEQbTJ(context, str, str2, str3, z2, function0);
    }

    public final ViewOnClickListenerC54939xaY AEQbTJ(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        if (str != null) {
            viewOnClickListenerC54939xaY.setTitle(str);
        }
        if (str2 != null) {
            viewOnClickListenerC54939xaY.EZpvd(str2);
        }
        if (str3 != null) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) str3, new View.OnClickListener() { // from class: o.ivb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C25380ivd.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(z);
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.ive
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C25380ivd.OLrzqt(function0, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return viewOnClickListenerC54939xaY;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(Function0 function0, android.content.DialogInterface dialogInterface) {
        if (function0 != null) {
            function0.invoke();
        }
    }
}
