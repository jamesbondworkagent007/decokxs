package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19421gBt extends RecyclerView.Adapter<ActionBar> {
    public final java.util.List<C19420gBs> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C19421gBt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:11) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
 A[MD:(java.util.List<o.gBs>):void (m)] (LINE:10) call: o.gBt.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C19421gBt(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.ArrayList() : list);
    }

    public C19421gBt(@NotNull java.util.List<C19420gBs> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ActionBar onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        AbstractC16802eqm abstractC16802eqmOLrzqt = AbstractC16802eqm.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16802eqmOLrzqt, "");
        return new ActionBar(this, abstractC16802eqmOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ActionBar actionBar, int i) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        actionBar.KWHzl(this.AEQbTJ.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    public final void copydefault(@NotNull java.util.List<C19420gBs> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o.gBt$ActionBar */
    public final class ActionBar extends RecyclerView.ViewHolder {
        public final /* synthetic */ C19421gBt AEQbTJ;
        public final AbstractC16802eqm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C19421gBt c19421gBt, AbstractC16802eqm abstractC16802eqm) {
            super(abstractC16802eqm.getRoot());
            Intrinsics.checkNotNullParameter(abstractC16802eqm, "");
            this.AEQbTJ = c19421gBt;
            this.copydefault = abstractC16802eqm;
        }

        public final void KWHzl(@NotNull C19420gBs c19420gBs) {
            Intrinsics.checkNotNullParameter(c19420gBs, "");
            this.copydefault.EZpvd(c19420gBs);
            this.copydefault.executePendingBindings();
            EZpvd(c19420gBs.copydefault(), false);
            ConstraintLayout constraintLayout = this.copydefault.OLrzqt;
            constraintLayout.setOnClickListener(new Activity(constraintLayout, 1000L, this, c19420gBs));
        }

        public final void EZpvd(boolean z, boolean z2) {
            this.copydefault.KWHzl.setRotation(z ? 180.0f : 0.0f);
            this.copydefault.copydefault.setVisibility(z ? 0 : 8);
        }

        /* JADX INFO: renamed from: o.gBt$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ ActionBar EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ C19420gBs OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, ActionBar actionBar, C19420gBs c19420gBs) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.EZpvd = actionBar;
                this.OLrzqt = c19420gBs;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    if (this.EZpvd.getBindingAdapterPosition() != -1) {
                        this.OLrzqt.AEQbTJ(!r7.copydefault());
                        this.EZpvd.EZpvd(this.OLrzqt.copydefault(), true);
                    }
                }
            }
        }
    }
}
