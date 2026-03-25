package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39783pyp extends AbstractC59533zio<C39709pxU, TaskDescription> {
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C36111oPr c36111oPrEZpvd = C36111oPr.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36111oPrEZpvd, "");
        return new TaskDescription(c36111oPrEZpvd);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull C39709pxU c39709pxU) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(c39709pxU, "");
        C36111oPr c36111oPrCopydefault = taskDescription.copydefault();
        c36111oPrCopydefault.copydefault.setText(c39709pxU.valueOf());
        c36111oPrCopydefault.AEQbTJ.setImageTintList(android.content.res.ColorStateList.valueOf(c39709pxU.EZpvd()));
        c36111oPrCopydefault.KWHzl.setText(pTB.formatICUCompact$default(java.lang.Long.valueOf(c39709pxU.AEQbTJ()), null, null, null, null, 15, null) + " " + this.OLrzqt);
        c36111oPrCopydefault.OLrzqt.setText(C38305pTw.formatFiatSymbol$default(java.lang.Double.valueOf(c39709pxU.copydefault()), "USD", RoundingMode.HALF_UP, C38307pTy.Companion.AEQbTJ(2), DisplaySign.AUTO, Notation.COMPACT_SHORT, null, 32, null));
    }

    /* JADX INFO: renamed from: o.pyp$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C36111oPr KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36111oPr copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36111oPr c36111oPr) {
            super(c36111oPr.getRoot());
            Intrinsics.checkNotNullParameter(c36111oPr, "");
            this.KWHzl = c36111oPr;
        }
    }
}
