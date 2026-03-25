package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28874kix extends androidx.recyclerview.widget.ListAdapter<C28868kir, ActionBar> {
    public final Function1<C28868kir, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.kir, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28874kix(@NotNull Function1<? super C28868kir, Unit> function1) {
        super(new Activity());
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21539hDc c21539hDcKWHzl = C21539hDc.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21539hDcKWHzl, "");
        return new ActionBar(this, c21539hDcKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        C28868kir item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        actionBar.EZpvd(item);
    }

    /* JADX INFO: renamed from: o.kix$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final C21539hDc AEQbTJ;
        public final /* synthetic */ C28874kix copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C28874kix c28874kix, C21539hDc c21539hDc) {
            super(c21539hDc.getRoot());
            Intrinsics.checkNotNullParameter(c21539hDc, "");
            this.copydefault = c28874kix;
            this.AEQbTJ = c21539hDc;
        }

        public final void EZpvd(@NotNull C28868kir c28868kir) {
            Intrinsics.checkNotNullParameter(c28868kir, "");
            C21539hDc c21539hDc = this.AEQbTJ;
            C28874kix c28874kix = this.copydefault;
            android.widget.ImageView imageView = c21539hDc.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadSquareImage$default(imageView, c28868kir.valueOf(), C55298xhM.dp2px$default(8.0f, null, 1, null), null, 4, null);
            android.widget.ImageView imageView2 = c21539hDc.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C25386ivj.KWHzl(imageView2, c28868kir.KWHzl(), new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
            c21539hDc.djBIcL.setText(c28868kir.gEmmrt());
            c21539hDc.gEmmrt.setText(c28868kir.AhwBna());
            android.widget.TextView textView = c21539hDc.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C28926kjw.EZpvd(textView, c28868kir.OLrzqt());
            android.widget.TextView textView2 = c21539hDc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            java.lang.String strCopydefault = c28868kir.copydefault();
            android.content.Context context = this.AEQbTJ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C28926kjw.KWHzl(textView2, strCopydefault, context);
            android.widget.TextView textView3 = c21539hDc.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            java.lang.String strEZpvd = c28868kir.EZpvd();
            android.content.Context context2 = this.AEQbTJ.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C28926kjw.OLrzqt(textView3, strEZpvd, context2);
            ConstraintLayout root = c21539hDc.getRoot();
            root.setOnClickListener(new TaskDescription(root, 1000L, c28874kix, c28868kir));
        }

        /* JADX INFO: renamed from: o.kix$ActionBar$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C28874kix OLrzqt;
            public final /* synthetic */ C28868kir copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C28874kix c28874kix, C28868kir c28868kir) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.OLrzqt = c28874kix;
                this.copydefault = c28868kir;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.OLrzqt.OLrzqt.invoke(this.copydefault);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kix$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C28868kir> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull C28868kir c28868kir, @NotNull C28868kir c28868kir2) {
            Intrinsics.checkNotNullParameter(c28868kir, "");
            Intrinsics.checkNotNullParameter(c28868kir2, "");
            return Intrinsics.EZpvd((java.lang.Object) c28868kir.djBIcL(), (java.lang.Object) c28868kir2.djBIcL()) && Intrinsics.EZpvd((java.lang.Object) c28868kir.AEQbTJ(), (java.lang.Object) c28868kir2.AEQbTJ());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull C28868kir c28868kir, @NotNull C28868kir c28868kir2) {
            Intrinsics.checkNotNullParameter(c28868kir, "");
            Intrinsics.checkNotNullParameter(c28868kir2, "");
            return Intrinsics.EZpvd(c28868kir, c28868kir2);
        }
    }
}
