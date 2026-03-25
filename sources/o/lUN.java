package o;

import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.view.cryptolist.CryptoListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lUN<item extends CryptoListItem, binding extends ViewDataBinding> extends AbstractC43310rmq<item, binding> {
    public final int OLrzqt;

    public abstract void EZpvd(@NotNull item item, @NotNull C43312rms<binding> c43312rms);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    public lUN(@androidx.annotation.LayoutRes int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.rms<binding extends androidx.databinding.ViewDataBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<binding> c43312rms, @NotNull item item) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(item, "");
        super.onBindViewHolder((C43312rms) c43312rms, item);
        EZpvd(item, c43312rms);
    }
}
