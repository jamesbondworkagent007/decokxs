package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class gIO extends C57662yme {
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl(false);
        android.content.Context context = getContext();
        if (context != null) {
            AEQbTJ(C33052mpF.AEQbTJ(6, context));
        }
        view.post(new java.lang.Runnable() { // from class: o.gIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                gIO.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(gIO gio) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) gio, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
