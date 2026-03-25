package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.okinc.im.imui.sticker.model.StickerPackModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC36935okO;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.okK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C36931okK extends RecyclerView.Adapter<AbstractC36935okO> {
    public final Function1<StickerPackModel, Unit> AEQbTJ;
    public int EZpvd;
    public java.util.List<StickerPackModel> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return C35399nuc.Dialog.iqMDAV;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.im.imui.sticker.model.StickerPackModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C36931okK(@NotNull Function1<? super StickerPackModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
        this.OLrzqt = yDY.AhwBna();
        this.EZpvd = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public AbstractC36935okO onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        nOB nobAEQbTJ = nOB.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(nobAEQbTJ, "");
        return new AbstractC36935okO.TaskDescription(nobAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC36935okO abstractC36935okO, int i) {
        Intrinsics.checkNotNullParameter(abstractC36935okO, "");
        if (abstractC36935okO instanceof AbstractC36935okO.TaskDescription) {
            final StickerPackModel stickerPackModel = this.OLrzqt.get(i);
            nOB nobCopydefault = ((AbstractC36935okO.TaskDescription) abstractC36935okO).copydefault();
            if (stickerPackModel.OLrzqt()) {
                Glide.KWHzl(nobCopydefault.EZpvd).AEQbTJ().EZpvd(java.lang.Integer.valueOf(C52761wXj.TaskDescription.getValue)).EZpvd(nobCopydefault.EZpvd);
            } else {
                Glide.KWHzl(nobCopydefault.EZpvd).EZpvd(stickerPackModel.AEQbTJ()).EZpvd(nobCopydefault.EZpvd);
            }
            nobCopydefault.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.okQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C36931okK.copydefault(this.copydefault, stickerPackModel, view);
                }
            });
            nobCopydefault.KWHzl.setBackgroundResource(this.EZpvd == i ? C35399nuc.ActionBar.AYXKKw : 0);
        }
    }

    public static final void copydefault(C36931okK c36931okK, StickerPackModel stickerPackModel, android.view.View view) {
        c36931okK.AEQbTJ.invoke(stickerPackModel);
    }

    public final void AEQbTJ(@NotNull java.util.List<StickerPackModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        notifyDataSetChanged();
    }

    public final void copydefault(@NotNull StickerPackModel stickerPackModel) {
        Intrinsics.checkNotNullParameter(stickerPackModel, "");
        java.util.Iterator<StickerPackModel> it = this.OLrzqt.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().KWHzl(), (java.lang.Object) stickerPackModel.KWHzl())) {
                break;
            } else {
                i++;
            }
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            this.EZpvd = numValueOf.intValue();
            notifyDataSetChanged();
        }
    }
}
