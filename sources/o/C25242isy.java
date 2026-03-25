package o;

import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.isy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25242isy extends androidx.recyclerview.widget.ListAdapter<C25237ist, TaskDescription> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Application EZpvd = new Application();
    public final Function1<C25237ist, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.ist, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C25242isy(@NotNull Function1<? super C25237ist, Unit> function1) {
        super(EZpvd);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.isy$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21611hFu OLrzqt;
        public final /* synthetic */ C25242isy copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C25242isy c25242isy, C21611hFu c21611hFu) {
            super(c21611hFu.getRoot());
            Intrinsics.checkNotNullParameter(c21611hFu, "");
            this.copydefault = c25242isy;
            this.OLrzqt = c21611hFu;
        }

        public final void AEQbTJ(@NotNull C25237ist c25237ist) {
            Intrinsics.checkNotNullParameter(c25237ist, "");
            C21611hFu c21611hFu = this.OLrzqt;
            android.widget.ImageView imageView = c21611hFu.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.AEQbTJ(imageView, c25237ist.AEQbTJ().getVendorIcon());
            c21611hFu.OLrzqt.setText(c25237ist.AEQbTJ().getName());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21611hFu c21611hFuOLrzqt = C21611hFu.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21611hFuOLrzqt, "");
        return new TaskDescription(this, c21611hFuOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C25237ist item = getItem(i);
        Intrinsics.checkNotNullExpressionValue(item, "");
        taskDescription.AEQbTJ(item);
    }

    /* JADX INFO: renamed from: o.isy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.isy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.isy$Application */
    public static final class Application extends DiffUtil.ItemCallback<C25237ist> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C25237ist c25237ist, C25237ist c25237ist2) {
            Intrinsics.checkNotNullParameter(c25237ist, "");
            Intrinsics.checkNotNullParameter(c25237ist2, "");
            return Intrinsics.EZpvd((java.lang.Object) c25237ist.AEQbTJ().getName(), (java.lang.Object) c25237ist2.AEQbTJ().getName());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C25237ist c25237ist, C25237ist c25237ist2) {
            Intrinsics.checkNotNullParameter(c25237ist, "");
            Intrinsics.checkNotNullParameter(c25237ist2, "");
            return Intrinsics.EZpvd((java.lang.Object) c25237ist.AEQbTJ().getName(), (java.lang.Object) c25237ist2.AEQbTJ().getName());
        }
    }
}
