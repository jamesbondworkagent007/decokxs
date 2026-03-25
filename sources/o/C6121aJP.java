package o;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aJP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6121aJP extends RecyclerView.Adapter<TaskDescription> {
    public final java.util.List<GetAuthenticatorListResponse.Chain> EZpvd;
    public final boolean KWHzl;

    public C6121aJP(@NotNull java.util.List<GetAuthenticatorListResponse.Chain> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C5635aAG c5635aAGCopydefault = C5635aAG.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c5635aAGCopydefault, "");
        ShapeableImageView shapeableImageView = c5635aAGCopydefault.AEQbTJ;
        ShapeAppearanceModel.Builder builder = shapeableImageView.getShapeAppearanceModel().toBuilder();
        android.content.Context context = shapeableImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        shapeableImageView.setShapeAppearanceModel(builder.setAllCornerSizes(C55298xhM.AEQbTJ(4, context)).build());
        return new TaskDescription(c5635aAGCopydefault);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C5635aAG c5635aAGOLrzqt = taskDescription.OLrzqt();
        GetAuthenticatorListResponse.Chain chain = this.EZpvd.get(i);
        Glide.AEQbTJ(c5635aAGOLrzqt.AEQbTJ.getContext()).EZpvd(this.KWHzl ? chain.getDarkChainLogo() : chain.getLightChainLogo()).KWHzl(C52761wXj.Activity.invokespecialODCBUN).copydefault(C52761wXj.Activity.invokespecialODCBUN).EZpvd((android.widget.ImageView) c5635aAGOLrzqt.AEQbTJ);
        c5635aAGOLrzqt.copydefault.setText(chain.getChainName());
        java.lang.String status = chain.getStatus();
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) "1")) {
            c5635aAGOLrzqt.OLrzqt.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.gUEfcq));
            c5635aAGOLrzqt.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DcMfJK));
        } else if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) "0")) {
            c5635aAGOLrzqt.OLrzqt.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.gSBher));
            c5635aAGOLrzqt.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        }
    }

    /* JADX INFO: renamed from: o.aJP$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C5635aAG AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5635aAG OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C5635aAG c5635aAG) {
            super(c5635aAG.getRoot());
            Intrinsics.checkNotNullParameter(c5635aAG, "");
            this.AEQbTJ = c5635aAG;
        }
    }
}
