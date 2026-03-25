package o;

import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47828txV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tGG<Vo extends InterfaceC47828txV, T extends ViewBinding> extends AbstractC47825txS<Vo, T> {
    public final java.lang.String AEQbTJ() {
        C59534zip adapter = getAdapter();
        AbstractC46077tGz abstractC46077tGz = adapter instanceof AbstractC46077tGz ? (AbstractC46077tGz) adapter : null;
        if (abstractC46077tGz != null) {
            return abstractC46077tGz.KWHzl();
        }
        return null;
    }

    public final void EZpvd(@NotNull android.widget.TextView textView, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ != null && strAEQbTJ.length() != 0) {
            tUO.addHighLightTv$default(textView, charSequence.toString(), java.lang.String.valueOf(AEQbTJ()), false, 8, null);
        } else {
            textView.setText(charSequence);
        }
    }
}
