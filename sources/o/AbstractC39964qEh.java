package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40516qYt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC39964qEh<Vo extends InterfaceC40516qYt, T extends ViewBinding> extends AbstractC40510qYn<Vo, T> {
    public final java.lang.String AEQbTJ() {
        C59534zip adapter = getAdapter();
        AbstractC39961qEe abstractC39961qEe = adapter instanceof AbstractC39961qEe ? (AbstractC39961qEe) adapter : null;
        if (abstractC39961qEe != null) {
            return abstractC39961qEe.KWHzl();
        }
        return null;
    }

    public final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
            C40359qSy.addHighLightTv$default(textView, charSequence.toString(), java.lang.String.valueOf(AEQbTJ()), false, 8, null);
        } else {
            textView.setText(charSequence);
        }
    }
}
