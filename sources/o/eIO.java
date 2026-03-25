package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eIO extends RecyclerView.ViewHolder {
    public final AbstractC16899esd EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eIO(@NotNull AbstractC16899esd abstractC16899esd) {
        super(abstractC16899esd.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16899esd, "");
        this.EZpvd = abstractC16899esd;
    }

    public static /* synthetic */ void bindData$default(eIO eio, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        eio.OLrzqt(str, z);
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.getRoot().setVisibility(str.length() == 0 ? 8 : 0);
        this.EZpvd.AEQbTJ.setText(str);
        this.EZpvd.OLrzqt.setVisibility(z ? 0 : 4);
    }
}
