package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19173fwL extends RecyclerView.ViewHolder {
    public final C17179exs EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19173fwL(@NotNull C17179exs c17179exs) {
        super(c17179exs.getRoot());
        Intrinsics.checkNotNullParameter(c17179exs, "");
        this.EZpvd = c17179exs;
    }

    public final void copydefault(@NotNull C18994fss c18994fss) {
        Intrinsics.checkNotNullParameter(c18994fss, "");
        this.EZpvd.AEQbTJ.setSubTitle((java.lang.CharSequence) c18994fss.copydefault());
    }
}
