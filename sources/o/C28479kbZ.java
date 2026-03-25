package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C28479kbZ;
import o.kMW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28479kbZ extends androidx.recyclerview.widget.ListAdapter<C28422kaV, Application> implements kMW<C28422kaV> {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public static final int copydefault = 8;
    public final int AEQbTJ;
    public java.util.List<C28422kaV> AYXKKw;
    public final Function1<C28422kaV, Unit> AhwBna;
    public final java.util.List<C28422kaV> EZpvd;
    public final ItemTouchHelper KWHzl;
    public final Function1<java.util.List<C28422kaV>, Unit> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kMW
    public java.util.List<C28422kaV> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.util.List<C28422kaV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AYXKKw = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<C28422kaV, Unit> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C28422kaV> copydefault() {
        return this.EZpvd;
    }

    public java.util.List<C28422kaV> KWHzl() {
        return kMW.TaskDescription.copydefault(this);
    }

    public void OLrzqt(int i, int i2) {
        kMW.TaskDescription.KWHzl(this, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.kaV, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.util.List<o.kaV>, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C28479kbZ(ItemTouchHelper itemTouchHelper, @NotNull Function1<? super C28422kaV, Unit> function1, @NotNull Function1<? super java.util.List<C28422kaV>, Unit> function12) {
        super(OLrzqt);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = itemTouchHelper;
        this.AhwBna = function1;
        this.djBIcL = function12;
        this.AEQbTJ = 20;
        this.AYXKKw = new java.util.ArrayList();
        this.EZpvd = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.kbZ$TaskDescription */
    public static final class TaskDescription extends DiffUtil.ItemCallback<C28422kaV> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kbZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull C28422kaV c28422kaV, @NotNull C28422kaV c28422kaV2) {
            Intrinsics.checkNotNullParameter(c28422kaV, "");
            Intrinsics.checkNotNullParameter(c28422kaV2, "");
            return Intrinsics.EZpvd((java.lang.Object) c28422kaV.AkhnZx(), (java.lang.Object) c28422kaV2.AkhnZx());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull C28422kaV c28422kaV, @NotNull C28422kaV c28422kaV2) {
            Intrinsics.checkNotNullParameter(c28422kaV, "");
            Intrinsics.checkNotNullParameter(c28422kaV2, "");
            return Intrinsics.EZpvd(c28422kaV, c28422kaV2);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21553hDq c21553hDqOLrzqt = C21553hDq.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21553hDqOLrzqt, "");
        return new Application(this, c21553hDqOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, int i) {
        Intrinsics.checkNotNullParameter(application, "");
        C28422kaV item = getItem(i);
        Intrinsics.copydefault(item);
        application.EZpvd(item, i);
        ItemTouchHelper itemTouchHelper = this.KWHzl;
        if (itemTouchHelper != null) {
            application.EZpvd(itemTouchHelper);
        }
    }

    /* JADX INFO: renamed from: o.kbZ$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final C21553hDq AEQbTJ;
        public final /* synthetic */ C28479kbZ EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C28479kbZ c28479kbZ, C21553hDq c21553hDq) {
            super(c21553hDq.getRoot());
            Intrinsics.checkNotNullParameter(c21553hDq, "");
            this.EZpvd = c28479kbZ;
            this.AEQbTJ = c21553hDq;
        }

        public final void EZpvd(@NotNull final C28422kaV c28422kaV, int i) {
            Intrinsics.checkNotNullParameter(c28422kaV, "");
            final C21553hDq c21553hDq = this.AEQbTJ;
            final C28479kbZ c28479kbZ = this.EZpvd;
            c21553hDq.getRoot().setContentDescription("web3_dex_watchlist_edit_item_" + i);
            android.widget.ImageView imageView = c21553hDq.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.KWHzl(imageView, c28422kaV.ejfBZ(), new C25385ivi(null, null, 0.0f, 0, 11, null));
            c21553hDq.valueOf.setText(c28422kaV.AuCTel());
            android.widget.ImageView imageView2 = c21553hDq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C25352ivB.toggleSelectionState$default(imageView2, c28479kbZ.EZpvd.contains(c28422kaV), false, null, 0, null, 0, 62, null);
            wYC wyc = c21553hDq.KWHzl;
            wyc.setOnClickListener(new ActionBar(wyc, 1000L, c28479kbZ, c28422kaV));
            c21553hDq.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.kcd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28479kbZ.Application.EZpvd(c28479kbZ, c28422kaV, c21553hDq, view);
                }
            });
        }

        public static final void EZpvd(C28479kbZ c28479kbZ, C28422kaV c28422kaV, C21553hDq c21553hDq, android.view.View view) {
            android.widget.ImageView imageView = c21553hDq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            c28479kbZ.KWHzl(c28422kaV, imageView);
        }

        public final void EZpvd(@NotNull final ItemTouchHelper itemTouchHelper) {
            Intrinsics.checkNotNullParameter(itemTouchHelper, "");
            this.AEQbTJ.copydefault.setOnTouchListener(new View.OnTouchListener() { // from class: o.kcc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C28479kbZ.Application.KWHzl(itemTouchHelper, this, view, motionEvent);
                }
            });
        }

        public static final boolean KWHzl(ItemTouchHelper itemTouchHelper, Application application, android.view.View view, android.view.MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            itemTouchHelper.startDrag(application);
            return false;
        }

        /* JADX INFO: renamed from: o.kbZ$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C28479kbZ KWHzl;
            public final /* synthetic */ C28422kaV copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C28479kbZ c28479kbZ, C28422kaV c28422kaV) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.KWHzl = c28479kbZ;
                this.copydefault = c28422kaV;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.KWHzl.OLrzqt().invoke(this.copydefault);
                }
            }
        }
    }

    public final void EZpvd(@NotNull java.util.List<C28422kaV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AEQbTJ(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list));
        submitList(list);
    }

    public final void OLrzqt(@NotNull java.util.List<C28422kaV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        notifyDataSetChanged();
    }

    public final void EZpvd() {
        this.EZpvd.clear();
        this.djBIcL.invoke(copydefault());
    }

    public final void KWHzl(C28422kaV c28422kaV, android.widget.ImageView imageView) {
        if (this.EZpvd.contains(c28422kaV)) {
            this.EZpvd.remove(c28422kaV);
            C25352ivB.toggleSelectionState$default(imageView, false, false, null, 0, null, 0, 62, null);
        } else if (this.EZpvd.size() >= this.AEQbTJ) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C23274hvD.Fragment.setDefaultImpl), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        } else {
            this.EZpvd.add(c28422kaV);
            C25352ivB.toggleSelectionState$default(imageView, true, false, null, 0, null, 0, 62, null);
        }
        this.djBIcL.invoke(copydefault());
    }
}
