package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.obn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36483obn extends RecyclerView.Adapter<Activity> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public java.util.List<InterfaceC35288nsW> EZpvd;
    public final InterfaceC36485obp copydefault;

    public C36483obn(@NotNull InterfaceC36485obp interfaceC36485obp) {
        Intrinsics.checkNotNullParameter(interfaceC36485obp, "");
        this.copydefault = interfaceC36485obp;
        this.EZpvd = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.obn$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final RecyclerView EZpvd;
        public final /* synthetic */ C36483obn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecyclerView EZpvd() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C36483obn c36483obn, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.copydefault = c36483obn;
            android.view.View viewFindViewById = view.findViewById(C35399nuc.StateListAnimator.OStAOF);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (RecyclerView) viewFindViewById;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C35399nuc.Dialog.DPHNDa, viewGroup, false);
        pUU.KWHzl("PluginsPageAdapter", "Creating ViewHolder for position: " + i);
        Intrinsics.copydefault(viewInflate);
        return new Activity(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        int i2 = i * 8;
        java.util.List<InterfaceC35288nsW> listSubList = this.EZpvd.subList(i2, java.lang.Math.min(i2 + 8, this.EZpvd.size()));
        RecyclerView recyclerViewEZpvd = activity.EZpvd();
        recyclerViewEZpvd.addItemDecoration(new Application());
        recyclerViewEZpvd.setAdapter(new C36482obm(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listSubList), this.copydefault));
        pUU.KWHzl("PluginsPageAdapter", "Binding ViewHolder for page: " + i + ", with plugins: " + listSubList.size() + " items");
    }

    /* JADX INFO: renamed from: o.obn$Application */
    public static final class Application extends RecyclerView.ItemDecoration {
        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            android.content.Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            rect.bottom = C55298xhM.copydefault(20.0f, context);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = (this.EZpvd.size() + 7) / 8;
        pUU.KWHzl("PluginsPageAdapter", "Total pages available: " + size);
        return size;
    }

    /* JADX INFO: renamed from: o.obn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.obn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl(@NotNull java.util.List<? extends InterfaceC35288nsW> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        notifyDataSetChanged();
    }
}
