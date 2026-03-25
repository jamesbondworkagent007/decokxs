package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tEE extends RecyclerView.ViewHolder {
    public final android.widget.TextView OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tEE(@NotNull android.widget.TextView textView) {
        super(textView);
        Intrinsics.checkNotNullParameter(textView, "");
        this.OLrzqt = textView;
    }

    public final void EZpvd() {
        this.OLrzqt.setText(C47501trL.Fragment.RvdRAu);
    }
}
