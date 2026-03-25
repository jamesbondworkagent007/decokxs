package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.kline.data.TimeIntervalItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39482ptF extends AbstractC59533zio<TimeIntervalItem, TaskDescription> {
    public final Function1<TimeIntervalItem, Unit> KWHzl;
    public final android.content.Context OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.kline.data.TimeIntervalItem, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C39482ptF(@NotNull android.content.Context context, @NotNull Function1<? super TimeIntervalItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = context;
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.Dmq, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new TaskDescription(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull final TimeIntervalItem timeIntervalItem) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(timeIntervalItem, "");
        android.widget.TextView textViewAEQbTJ = taskDescription.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setSelected(timeIntervalItem.isSelected());
        }
        android.widget.TextView textViewAEQbTJ2 = taskDescription.AEQbTJ();
        if (textViewAEQbTJ2 != null) {
            textViewAEQbTJ2.setText(EZpvd(timeIntervalItem.getDisplayName(), timeIntervalItem.isSelected()));
        }
        if (timeIntervalItem.isSelected()) {
            android.widget.ImageView imageViewCopydefault = taskDescription.copydefault();
            if (imageViewCopydefault != null) {
                imageViewCopydefault.setVisibility(0);
            }
        } else {
            android.widget.ImageView imageViewCopydefault2 = taskDescription.copydefault();
            if (imageViewCopydefault2 != null) {
                imageViewCopydefault2.setVisibility(8);
            }
        }
        taskDescription.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.ptL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39482ptF.OLrzqt(this.AEQbTJ, timeIntervalItem, view);
            }
        });
    }

    public static final void OLrzqt(C39482ptF c39482ptF, TimeIntervalItem timeIntervalItem, android.view.View view) {
        Function1<TimeIntervalItem, Unit> function1 = c39482ptF.KWHzl;
        if (function1 != null) {
            function1.invoke(timeIntervalItem);
        }
    }

    public final java.lang.CharSequence EZpvd(java.lang.String str, boolean z) {
        if (z) {
            return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.ptD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39482ptF.KWHzl(this.KWHzl, (java.util.List) obj);
                }
            }, 14, null);
        }
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.ptK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39482ptF.AEQbTJ(this.OLrzqt, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(C39482ptF c39482ptF, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39482ptF.OLrzqt, C35964oKf.Dialog.copydefault));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C39482ptF c39482ptF, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c39482ptF.OLrzqt, C35964oKf.Dialog.OLrzqt));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ptF$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.ImageView AEQbTJ;
        public final android.widget.TextView KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = (android.widget.TextView) view.findViewById(C35964oKf.StateListAnimator.dTTfOR);
            this.AEQbTJ = (android.widget.ImageView) view.findViewById(C35964oKf.StateListAnimator.QMuEJi);
        }
    }
}
