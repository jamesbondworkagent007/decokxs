package o;

import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25728jEd extends RecyclerView.Adapter<Activity> {
    public final java.util.List<C25726jEb> AEQbTJ;
    public final Function1<C25726jEb, Unit> KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.jEb, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25728jEd(@NotNull java.util.List<C25726jEb> list, @NotNull java.lang.String str, Function1<? super C25726jEb, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = list;
        this.OLrzqt = str;
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.jEd$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final C21628hGk AEQbTJ;
        public final /* synthetic */ C25728jEd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21628hGk KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C25728jEd c25728jEd, C21628hGk c21628hGk) {
            super(c21628hGk.getRoot());
            Intrinsics.checkNotNullParameter(c21628hGk, "");
            this.copydefault = c25728jEd;
            this.AEQbTJ = c21628hGk;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21628hGk c21628hGkOLrzqt = C21628hGk.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21628hGkOLrzqt, "");
        return new Activity(this, c21628hGkOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        C25726jEb c25726jEb = this.AEQbTJ.get(activity.getBindingAdapterPosition());
        C21628hGk c21628hGkKWHzl = activity.KWHzl();
        OKRegularCell oKRegularCell = c21628hGkKWHzl.AEQbTJ;
        oKRegularCell.setTitle(c25726jEb.KWHzl());
        oKRegularCell.EZpvd().setTypeface(android.graphics.Typeface.create(ResourcesCompat.getFont(oKRegularCell.getContext(), C52761wXj.Dialog.valueOf), 0));
        oKRegularCell.EZpvd().setTextSize(16.0f);
        c21628hGkKWHzl.KWHzl.setVisibility(Intrinsics.EZpvd((java.lang.Object) c25726jEb.OLrzqt(), (java.lang.Object) this.OLrzqt) ? 0 : 8);
        OKRegularCell root = c21628hGkKWHzl.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c25726jEb));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    /* JADX INFO: renamed from: o.jEd$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C25728jEd EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C25726jEb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25728jEd c25728jEd, C25726jEb c25726jEb) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c25728jEd;
            this.copydefault = c25726jEb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.EZpvd.KWHzl;
                if (function1 != null) {
                    function1.invoke(this.copydefault);
                }
            }
        }
    }
}
