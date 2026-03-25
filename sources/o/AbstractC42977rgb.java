package o;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rgb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC42977rgb<T, B extends ViewBinding> extends kLX<T, B> implements InterfaceC33543myT<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt(@NotNull android.view.View view, int i, T t) {
        Intrinsics.checkNotNullParameter(view, "");
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.kLX, o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd */
    public void onBindViewHolder(@NotNull kLV<B> klv, @NotNull final T t) {
        Intrinsics.checkNotNullParameter(klv, "");
        Intrinsics.checkNotNullParameter(t, "");
        super.onBindViewHolder(klv, t);
        final int adapterPosition = klv.getAdapterPosition();
        klv.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.rga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC42977rgb.EZpvd(this.AEQbTJ, adapterPosition, t, view);
            }
        });
        klv.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.rfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return AbstractC42977rgb.copydefault(this.AEQbTJ, adapterPosition, t, view);
            }
        });
    }

    public static final void EZpvd(AbstractC42977rgb abstractC42977rgb, int i, java.lang.Object obj, android.view.View view) {
        Intrinsics.copydefault(view);
        abstractC42977rgb.copydefault(view, i, obj);
    }

    public static final boolean copydefault(AbstractC42977rgb abstractC42977rgb, int i, java.lang.Object obj, android.view.View view) {
        Intrinsics.copydefault(view);
        return abstractC42977rgb.OLrzqt(view, i, obj);
    }
}
