package o;

import android.view.View;
import androidx.databinding.BindingAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31913mIo {
    @BindingAdapter(requireAll = false, value = {"android:onClick"})
    public static final void AEQbTJ(@NotNull final android.view.View view, final View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "");
        if (onClickListener != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.mIr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C31913mIo.AEQbTJ(onClickListener, view, view2);
                }
            });
        }
    }

    public static final void AEQbTJ(View.OnClickListener onClickListener, android.view.View view, android.view.View view2) {
        onClickListener.onClick(view);
    }
}
