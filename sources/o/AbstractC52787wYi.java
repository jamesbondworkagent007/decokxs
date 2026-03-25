package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC52787wYi;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC52787wYi extends wXX {
    public Function2<? super java.lang.Integer, ? super C55167xeo, Unit> AYXKKw;
    public C54963xaw AhwBna;
    public C43316rmw valueOf;
    public java.util.List<C55167xeo> gEmmrt = new java.util.ArrayList();
    public int djBIcL = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super java.lang.Integer, ? super C55167xeo, Unit> function2) {
        this.AYXKKw = function2;
    }

    public final void OLrzqt(@NotNull java.util.List<C55167xeo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = list;
        C43316rmw c43316rmw = this.valueOf;
        if (c43316rmw != null) {
            c43316rmw.AhwBna(list);
        }
    }

    public final void KWHzl(int i) {
        C55167xeo c55167xeo;
        this.djBIcL = i;
        Function2<? super java.lang.Integer, ? super C55167xeo, Unit> function2 = this.AYXKKw;
        if (function2 != null && (c55167xeo = (C55167xeo) CollectionsKt___CollectionsKt.AkhnZx(this.gEmmrt, i)) != null) {
            function2.invoke(java.lang.Integer.valueOf(i), c55167xeo);
        }
        C43316rmw c43316rmw = this.valueOf;
        if (c43316rmw != null) {
            c43316rmw.notifyDataSetChanged();
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AhwBna = C54963xaw.AEQbTJ(getCustomLayoutInflater(), constraintLayout);
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.setItems(this.gEmmrt);
        c43316rmw.register(C55167xeo.class, new TaskDescription());
        this.valueOf = c43316rmw;
        C54963xaw c54963xaw = this.AhwBna;
        if (c54963xaw == null) {
            Intrinsics.gEmmrt("");
            c54963xaw = null;
        }
        RecyclerView recyclerView = c54963xaw.OLrzqt;
        recyclerView.setAdapter(this.valueOf);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.copydefault(16.0f, context), 0));
        recyclerView.setItemViewCacheSize(0);
    }

    /* JADX INFO: renamed from: o.wYi$TaskDescription */
    public static final class TaskDescription extends AbstractC59533zio<C55167xeo, Application> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            AbstractC52787wYi abstractC52787wYi = AbstractC52787wYi.this;
            android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.iwGUEr, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Application(abstractC52787wYi, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(final Application application, C55167xeo c55167xeo) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(c55167xeo, "");
            boolean z = AbstractC52787wYi.this.AEQbTJ() == application.getBindingAdapterPosition();
            C55166xen c55166xenEZpvd = application.EZpvd();
            final AbstractC52787wYi abstractC52787wYi = AbstractC52787wYi.this;
            c55166xenEZpvd.setSelected(z);
            c55166xenEZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wYf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC52787wYi.TaskDescription.KWHzl(abstractC52787wYi, application, view);
                }
            });
            c55166xenEZpvd.setIconResId(c55167xeo.KWHzl());
            c55166xenEZpvd.setTitleText(c55167xeo.EZpvd());
            c55166xenEZpvd.setDescriptionText(c55167xeo.OLrzqt());
            c55166xenEZpvd.setTitleAttachingView(c55167xeo.copydefault());
        }

        public static final void KWHzl(AbstractC52787wYi abstractC52787wYi, Application application, android.view.View view) {
            abstractC52787wYi.KWHzl(application.getBindingAdapterPosition());
        }
    }

    /* JADX INFO: renamed from: o.wYi$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Application extends RecyclerView.ViewHolder {
        public final C55166xen AEQbTJ;
        public final /* synthetic */ AbstractC52787wYi EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55166xen EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbstractC52787wYi abstractC52787wYi, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = abstractC52787wYi;
            android.view.View viewFindViewById = view.findViewById(C52761wXj.FragmentManager.heceqZ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (C55166xen) viewFindViewById;
        }
    }
}
