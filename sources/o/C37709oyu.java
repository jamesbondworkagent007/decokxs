package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.utils.IMImageHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37709oyu extends RecyclerView.Adapter<TaskDescription> {
    public final Function2<nGS, java.lang.Integer, Unit> AEQbTJ;
    public int EZpvd;
    public java.util.List<nGS> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super o.nGS, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37709oyu(@NotNull Function2<? super nGS, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
        this.KWHzl = yDY.AhwBna();
        this.EZpvd = 1;
    }

    public final void copydefault(@NotNull java.util.List<nGS> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C34023nOo c34023nOoCopydefault = C34023nOo.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c34023nOoCopydefault, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new TaskDescription(this, c34023nOoCopydefault, context);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        ViewGroup.LayoutParams layoutParams = taskDescription.itemView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        }
        if (this.KWHzl.size() <= 2) {
            marginLayoutParams.width = -1;
        } else {
            android.content.Context context = taskDescription.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.width = C55298xhM.copydefault(295.0f, context);
        }
        taskDescription.itemView.setLayoutParams(marginLayoutParams);
        taskDescription.AEQbTJ(this.KWHzl.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    /* JADX INFO: renamed from: o.oyu$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C34023nOo EZpvd;
        public final /* synthetic */ C37709oyu KWHzl;
        public final android.content.Context OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37709oyu c37709oyu, @NotNull C34023nOo c34023nOo, android.content.Context context) {
            super(c34023nOo.getRoot());
            Intrinsics.checkNotNullParameter(c34023nOo, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.KWHzl = c37709oyu;
            this.EZpvd = c34023nOo;
            this.OLrzqt = context;
        }

        public final void AEQbTJ(@NotNull nGS ngs, int i) {
            Intrinsics.checkNotNullParameter(ngs, "");
            KWHzl();
            this.EZpvd.OLrzqt.setCardBackgroundColor(ContextCompat.getColor(this.OLrzqt, C52761wXj.Activity.invokespecialDPHOMC));
            this.EZpvd.gEmmrt.setText(ngs.gEmmrt());
            this.EZpvd.gEmmrt.setIncludeFontPadding(false);
            this.EZpvd.AhwBna.setText(C33129mqd.AYXKKw(java.lang.Integer.valueOf(ngs.EZpvd())));
            if (ngs.OLrzqt() != null) {
                C35893oHp c35893oHp = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                C35891oHn.loadGroupAvatar$default(c35893oHp, ngs.OLrzqt(), null, 2, null);
            } else {
                this.EZpvd.AEQbTJ.setImageDrawable(IMImageHelper.OLrzqt.AhwBna());
            }
            this.EZpvd.AYXKKw.setText(ngs.AEQbTJ());
            android.widget.ImageView imageView = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(ngs.valueOf() ? 0 : 8);
            android.widget.ImageView imageView2 = this.EZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(ngs.AhwBna() ? 0 : 8);
            CardView root = this.EZpvd.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, this.KWHzl, ngs, i));
        }

        private final void KWHzl() {
            this.EZpvd.gEmmrt.setText((java.lang.CharSequence) null);
            this.EZpvd.AhwBna.setText((java.lang.CharSequence) null);
            this.EZpvd.AYXKKw.setText((java.lang.CharSequence) null);
            this.EZpvd.AEQbTJ.setTaggedDrawable(null);
            this.EZpvd.AEQbTJ.setImageDrawable(null);
            android.widget.ImageView imageView = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            this.EZpvd.getRoot().setOnClickListener(null);
        }

        /* JADX INFO: renamed from: o.oyu$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ int AEQbTJ;
            public final /* synthetic */ C37709oyu EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ nGS OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C37709oyu c37709oyu, nGS ngs, int i) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = c37709oyu;
                this.OLrzqt = ngs;
                this.AEQbTJ = i;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.EZpvd.AEQbTJ.invoke(this.OLrzqt, java.lang.Integer.valueOf(this.AEQbTJ));
                }
            }
        }
    }
}
