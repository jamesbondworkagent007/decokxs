package o;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.DiffUtil;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.olf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37005olf extends androidx.recyclerview.widget.ListAdapter<C35254nrp, oGY<ViewDataBinding>> {
    public final AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>[] OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37005olf(@NotNull AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>[] abstractC35703oAoArr, @NotNull DiffUtil.ItemCallback<C35254nrp> itemCallback) {
        super(itemCallback);
        Intrinsics.checkNotNullParameter(abstractC35703oAoArr, "");
        Intrinsics.checkNotNullParameter(itemCallback, "");
        this.OLrzqt = abstractC35703oAoArr;
        for (AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo : abstractC35703oAoArr) {
            Intrinsics.copydefault(abstractC35703oAo, "");
            abstractC35703oAo.AEQbTJ(this);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        C35254nrp item = getItem(i);
        AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>[] abstractC35703oAoArr = this.OLrzqt;
        Intrinsics.copydefault(item);
        return OLrzqt(abstractC35703oAoArr, item);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.oGY<? extends androidx.databinding.ViewDataBinding>, java.lang.Object, o.oGY<androidx.databinding.ViewDataBinding> */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public oGY<ViewDataBinding> onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo = this.OLrzqt[i];
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        Intrinsics.copydefault(layoutInflaterFrom);
        oGY ogyAhwBna = abstractC35703oAo.AhwBna(layoutInflaterFrom, viewGroup);
        Intrinsics.copydefault(ogyAhwBna, "");
        return ogyAhwBna;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull oGY<ViewDataBinding> ogy, int i) {
        Intrinsics.checkNotNullParameter(ogy, "");
        C35254nrp item = getItem(i);
        AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo = this.OLrzqt[getItemViewType(i)];
        Intrinsics.copydefault(abstractC35703oAo, "");
        Intrinsics.copydefault(item);
        abstractC35703oAo.KWHzl(ogy, item);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull oGY<ViewDataBinding> ogy, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(ogy, "");
        Intrinsics.checkNotNullParameter(list, "");
        C35254nrp item = getItem(i);
        AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo = this.OLrzqt[getItemViewType(i)];
        Intrinsics.copydefault(abstractC35703oAo, "");
        Intrinsics.copydefault(item);
        abstractC35703oAo.AEQbTJ(ogy, item, list);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull oGY<ViewDataBinding> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.onViewRecycled(ogy);
        int itemViewType = ogy.getItemViewType();
        if (itemViewType >= 0) {
            AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>[] abstractC35703oAoArr = this.OLrzqt;
            if (itemViewType < abstractC35703oAoArr.length) {
                AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo = abstractC35703oAoArr[itemViewType];
                if (!(abstractC35703oAo instanceof AbstractC35882oHe)) {
                    abstractC35703oAo = null;
                }
                if (abstractC35703oAo != null) {
                    abstractC35703oAo.AEQbTJ(ogy);
                }
            }
        }
    }

    public final int OLrzqt(AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>[] abstractC35703oAoArr, C35254nrp c35254nrp) {
        OKMessage.MessageDirection messageDirection = c35254nrp.OLrzqt().getMessageDirection();
        int length = abstractC35703oAoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo = abstractC35703oAoArr[i];
            OKMessageContent content = c35254nrp.OLrzqt().getContent();
            if (content != null) {
                java.lang.Class<?> cls = content.getClass();
                java.lang.reflect.GenericDeclaration genericDeclarationKWHzl = abstractC35703oAo.KWHzl();
                java.util.Set<OKMessage.MessageDirection> setBe_ = abstractC35703oAo.be_();
                if (Intrinsics.EZpvd(genericDeclarationKWHzl, cls) && setBe_.contains(messageDirection)) {
                    break;
                }
            }
            i++;
        }
        if (i != -1) {
            return i;
        }
        int length2 = abstractC35703oAoArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo2 = abstractC35703oAoArr[i2];
            java.lang.reflect.GenericDeclaration genericDeclarationKWHzl2 = abstractC35703oAo2.KWHzl();
            java.util.Set<OKMessage.MessageDirection> setBe_2 = abstractC35703oAo2.be_();
            if (Intrinsics.EZpvd(genericDeclarationKWHzl2, OKMessageContent.class) && setBe_2.contains(messageDirection)) {
                return i2;
            }
        }
        return -1;
    }

    public final void EZpvd(boolean z) {
        for (AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAo : this.OLrzqt) {
            if (abstractC35703oAo instanceof AbstractC35707oAs) {
                ((AbstractC35707oAs) abstractC35703oAo).AEQbTJ(z);
            }
        }
        notifyItemRangeChanged(0, getItemCount(), "AGENT_BOT_CHAT_CHANGED");
    }
}
