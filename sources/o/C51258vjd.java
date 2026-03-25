package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vjd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51258vjd extends RecyclerView.ViewHolder {
    public android.widget.TextView AEQbTJ;
    public android.widget.TextView EZpvd;
    public android.widget.ImageView KWHzl;
    public android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.ImageView EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView OLrzqt() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51258vjd(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = (android.widget.TextView) view.findViewById(C48033uCm.Application.detect);
        this.KWHzl = (android.widget.ImageView) view.findViewById(C48033uCm.Application.animateToMode);
        this.AEQbTJ = (android.widget.TextView) view.findViewById(C48033uCm.Application.generateConfigDelta_colorMode);
        this.EZpvd = (android.widget.TextView) view.findViewById(C48033uCm.Application.setCompatVectorFromResourcesEnabled);
    }
}
