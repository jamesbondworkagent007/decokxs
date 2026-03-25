package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kLN<T> extends RecyclerView.ViewHolder {
    public abstract void EZpvd(T t);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kLN(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
    }
}
