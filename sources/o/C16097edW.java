package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC16104edd;
import o.C13754dXa;
import o.C16097edW;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16097edW extends RecyclerView.Adapter<ActionBar> {
    public final java.util.List<CustomChainMeta> copydefault;

    public C16097edW(@NotNull java.util.List<CustomChainMeta> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.DcMfJKRKUgwx, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new ActionBar(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.OLrzqt(this.copydefault.get(i));
    }

    /* JADX INFO: renamed from: o.edW$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.TextView AhwBna;
        public final android.widget.ImageView EZpvd;
        public final android.widget.ImageView KWHzl;
        public final android.widget.TextView OLrzqt;
        public final android.view.View copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (android.widget.ImageView) this.itemView.findViewById(C13754dXa.ActionBar.fromMediaItemList);
            this.AEQbTJ = (android.widget.ImageView) this.itemView.findViewById(C13754dXa.ActionBar.DvMhtu);
            this.KWHzl = (android.widget.ImageView) this.itemView.findViewById(C13754dXa.ActionBar.UUsvzU);
            this.copydefault = this.itemView.findViewById(C13754dXa.ActionBar.GVpNrsfQMcgE);
            this.AhwBna = (android.widget.TextView) this.itemView.findViewById(C13754dXa.ActionBar.getDescription);
            this.OLrzqt = (android.widget.TextView) this.itemView.findViewById(C13754dXa.ActionBar.invokespecialatDTRm);
        }

        public final void OLrzqt(@NotNull final CustomChainMeta customChainMeta) {
            java.lang.String strOLrzqt;
            java.lang.String string;
            Intrinsics.checkNotNullParameter(customChainMeta, "");
            this.AhwBna.setText(customChainMeta.OLrzqt());
            android.widget.ImageView imageView = this.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            android.widget.ImageView imageView2 = this.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            android.view.View view = this.copydefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            this.OLrzqt.setText(customChainMeta.isConnected());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) customChainMeta.valueOf())) {
                strOLrzqt = customChainMeta.valueOf();
            } else {
                java.lang.Character chWlaJM = C59454zhO.wlaJM(customChainMeta.OLrzqt());
                if (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
                    strOLrzqt = "";
                }
            }
            customChainMeta.KWHzl(strOLrzqt);
            android.widget.ImageView imageView3 = this.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            C57659ymb.loadFixSizeBorderImage$default(imageView3, customChainMeta.valueOf(), C52761wXj.TaskDescription.fERRXa, 0.0f, 0.0f, 12, null);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.eec
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C16097edW.ActionBar.copydefault(this.AEQbTJ, customChainMeta, view2);
                }
            });
        }

        public static final void copydefault(ActionBar actionBar, CustomChainMeta customChainMeta, android.view.View view) {
            ActivityC16104edd.TaskDescription taskDescription = ActivityC16104edd.Companion;
            android.content.Context context = actionBar.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            long jEZpvd = customChainMeta.EZpvd();
            taskDescription.KWHzl(context, java.lang.String.valueOf(jEZpvd), customChainMeta.isConnected());
        }
    }
}
