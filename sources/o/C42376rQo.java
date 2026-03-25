package o;

import android.view.View;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rQo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42376rQo extends RecyclerView.Adapter<StateListAnimator> {
    public final java.util.List<android.text.SpannableString> AEQbTJ;
    public Application copydefault;

    /* JADX INFO: renamed from: o.rQo$Application */
    public interface Application {
        void OLrzqt(android.view.View view, int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
    }

    public C42376rQo(java.util.List<android.text.SpannableString> list) {
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C43662rtX.TaskDescription.DGgnkA, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new StateListAnimator(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, final int i) {
        android.text.SpannableString spannableString;
        java.lang.CharSequence charSequence = "";
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        android.widget.TextView textViewCopydefault = stateListAnimator.copydefault();
        java.util.List<android.text.SpannableString> list = this.AEQbTJ;
        if (list != null && (spannableString = list.get(i)) != null) {
            charSequence = spannableString;
        }
        textViewCopydefault.setText(charSequence);
        if (this.copydefault != null) {
            stateListAnimator.copydefault().setOnClickListener(new View.OnClickListener() { // from class: o.rQm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C42376rQo.OLrzqt(this.EZpvd, i, view);
                }
            });
        }
    }

    public static final void OLrzqt(C42376rQo c42376rQo, int i, android.view.View view) {
        Application application = c42376rQo.copydefault;
        if (application != null) {
            application.OLrzqt(view, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        java.util.List<android.text.SpannableString> list = this.AEQbTJ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.rQo$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C42376rQo AEQbTJ;
        public android.widget.TextView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C42376rQo c42376rQo, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ = c42376rQo;
            android.view.View viewFindViewById = view.findViewById(C43662rtX.ActionBar.DsL);
            Intrinsics.copydefault(viewFindViewById, "");
            android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
            this.KWHzl = textView;
            TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.dHguZz);
        }
    }
}
