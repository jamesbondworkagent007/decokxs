package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57474yjB extends RecyclerView.Adapter<ActionBar> {
    public final Function1<java.lang.String, Unit> AEQbTJ;
    public final java.util.List<C57481yjI> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C57474yjB(@NotNull java.util.List<C57481yjI> list, Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C57406yhn.TaskDescription.AYXKKw, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new ActionBar(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.EZpvd(this.copydefault.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    /* JADX INFO: renamed from: o.yjB$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final AppCompatTextView AEQbTJ;
        public final AppCompatTextView EZpvd;
        public final C55251xgS OLrzqt;
        public final /* synthetic */ C57474yjB copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C57474yjB c57474yjB, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = c57474yjB;
            android.view.View viewFindViewById = view.findViewById(C57406yhn.StateListAnimator.QSLkRj);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (AppCompatTextView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C57406yhn.StateListAnimator.USBtdM);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.AEQbTJ = (AppCompatTextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C57406yhn.StateListAnimator.hBpjJd);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.OLrzqt = (C55251xgS) viewFindViewById3;
        }

        public final void EZpvd(@NotNull C57481yjI c57481yjI) {
            Intrinsics.checkNotNullParameter(c57481yjI, "");
            this.EZpvd.setText(c57481yjI.EZpvd());
            AppCompatTextView appCompatTextView = this.AEQbTJ;
            java.lang.String strCopydefault = c57481yjI.copydefault();
            appCompatTextView.setText(strCopydefault != null ? strCopydefault : "");
            java.lang.Integer numAEQbTJ = c57481yjI.AEQbTJ();
            if (numAEQbTJ != null) {
                this.AEQbTJ.setTextColor(ContextCompat.getColor(this.itemView.getContext(), numAEQbTJ.intValue()));
            } else {
                this.AEQbTJ.setTextColor(ContextCompat.getColor(this.itemView.getContext(), C52761wXj.Activity.fdOvFl));
            }
            C55307xhV.AEQbTJ(this.OLrzqt, c57481yjI.OLrzqt());
            java.lang.String strCopydefault2 = c57481yjI.copydefault();
            if (strCopydefault2 == null || strCopydefault2.length() == 0) {
                this.itemView.setOnClickListener(null);
            } else {
                android.view.View view = this.itemView;
                view.setOnClickListener(new Application(view, 1000L, this.copydefault, c57481yjI));
            }
        }

        /* JADX INFO: renamed from: o.yjB$ActionBar$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ C57474yjB EZpvd;
            public final /* synthetic */ C57481yjI KWHzl;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, C57474yjB c57474yjB, C57481yjI c57481yjI) {
                this.copydefault = view;
                this.OLrzqt = j;
                this.EZpvd = c57474yjB;
                this.KWHzl = c57481yjI;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    Function1 function1 = this.EZpvd.AEQbTJ;
                    if (function1 != null) {
                        function1.invoke(this.KWHzl.copydefault());
                    }
                }
            }
        }
    }
}
