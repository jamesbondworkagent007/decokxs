package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.pKK;
import o.pOU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class pOU extends RecyclerView.Adapter<TaskDescription> {
    public final pOV KWHzl;
    public final java.util.List<C38092pLy> copydefault;

    public pOU(@NotNull java.util.List<C38092pLy> list, @NotNull pOV pov) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pov, "");
        this.copydefault = list;
        this.KWHzl = pov;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(pKK.ActionBar.djBIcL, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new TaskDescription(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.OLrzqt(this.copydefault.get(i), this.KWHzl);
    }

    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final android.widget.TextView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(pKK.StateListAnimator.wlaJM);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.KWHzl = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(pKK.StateListAnimator.getFieldNames);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(pKK.StateListAnimator.zuBGHE);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById3;
        }

        public final void OLrzqt(@NotNull final C38092pLy c38092pLy, @NotNull final pOV pov) {
            Intrinsics.checkNotNullParameter(c38092pLy, "");
            Intrinsics.checkNotNullParameter(pov, "");
            this.KWHzl.setText(c38092pLy.EZpvd());
            this.EZpvd.setText(c38092pLy.OLrzqt());
            final java.lang.String str = C38187pPl.copydefault() + c38092pLy.EZpvd() + c38092pLy.KWHzl();
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 0);
            this.AEQbTJ.setText(spannableString);
            this.AEQbTJ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDSqxTE));
            this.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.pOZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    pOU.TaskDescription.KWHzl(pov, c38092pLy, view);
                }
            });
            this.AEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.pPa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return pOU.TaskDescription.AEQbTJ(str, view);
                }
            });
        }

        public static final void KWHzl(pOV pov, C38092pLy c38092pLy, android.view.View view) {
            pov.copydefault(c38092pLy);
        }

        public static final boolean AEQbTJ(java.lang.String str, android.view.View view) {
            java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
            android.content.ClipboardManager clipboardManager = objEZpvd instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) objEZpvd : null;
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
            }
            C55326xho.toast$default("H5 URL copied to clipboard", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return true;
        }
    }
}
