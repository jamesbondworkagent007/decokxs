package o;

import androidx.databinding.ViewDataBinding;
import com.okinc.cruilib.model.listitem.OKCRListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class mIP<Item extends OKCRListItem, Binding extends ViewDataBinding> extends AbstractC31910mIl<Item, Binding> {
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC31910mIl
    public mHV KWHzl(@NotNull Binding binding) {
        Intrinsics.checkNotNullParameter(binding, "");
        return null;
    }

    public abstract void KWHzl(@NotNull Item item, @NotNull C43312rms<Binding> c43312rms);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return this.EZpvd;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    public mIP(@androidx.annotation.LayoutRes int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.rms<Binding extends androidx.databinding.ViewDataBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<Binding> c43312rms, @NotNull Item item) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(item, "");
        super.onBindViewHolder((C43312rms) c43312rms, item);
        KWHzl(item, c43312rms);
    }
}
