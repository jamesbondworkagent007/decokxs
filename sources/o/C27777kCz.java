package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C27777kCz;
import o.kMW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27777kCz extends androidx.recyclerview.widget.ListAdapter<CommonGroupUiModel, TaskDescription> implements kMW<CommonGroupUiModel> {
    public final ItemTouchHelper AEQbTJ;
    public final Function1<CommonGroupUiModel, Unit> EZpvd;
    public java.util.List<CommonGroupUiModel> KWHzl;
    public static final ActionBar copydefault = new ActionBar(null);
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C27777kCz() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kMW
    public java.util.List<CommonGroupUiModel> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull java.util.List<CommonGroupUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    public void AEQbTJ(int i, int i2) {
        kMW.TaskDescription.KWHzl(this, i, i2);
    }

    public java.util.List<CommonGroupUiModel> OLrzqt() {
        return kMW.TaskDescription.copydefault(this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:androidx.recyclerview.widget.ItemTouchHelper:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null androidx.recyclerview.widget.ItemTouchHelper) : (r1v0 androidx.recyclerview.widget.ItemTouchHelper))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:21) call: o.kCB.<init>():void type: CONSTRUCTOR) : (r2v0 kotlin.jvm.functions.Function1))
 A[MD:(androidx.recyclerview.widget.ItemTouchHelper, kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.group.domain.CommonGroupUiModel, kotlin.Unit>):void (m)] (LINE:19) call: o.kCz.<init>(androidx.recyclerview.widget.ItemTouchHelper, kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C27777kCz(ItemTouchHelper itemTouchHelper, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : itemTouchHelper, (i & 2) != 0 ? new Function1() { // from class: o.kCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27777kCz.KWHzl((CommonGroupUiModel) obj);
            }
        } : function1);
    }

    public static final Unit KWHzl(CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.group.domain.CommonGroupUiModel, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C27777kCz(ItemTouchHelper itemTouchHelper, @NotNull Function1<? super CommonGroupUiModel, Unit> function1) {
        super(copydefault);
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = itemTouchHelper;
        this.EZpvd = function1;
        this.KWHzl = new java.util.ArrayList();
    }

    /* JADX INFO: renamed from: o.kCz$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<CommonGroupUiModel> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kCz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull CommonGroupUiModel commonGroupUiModel, @NotNull CommonGroupUiModel commonGroupUiModel2) {
            Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
            Intrinsics.checkNotNullParameter(commonGroupUiModel2, "");
            return Intrinsics.EZpvd(commonGroupUiModel, commonGroupUiModel2);
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull CommonGroupUiModel commonGroupUiModel, @NotNull CommonGroupUiModel commonGroupUiModel2) {
            Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
            Intrinsics.checkNotNullParameter(commonGroupUiModel2, "");
            return Intrinsics.EZpvd(commonGroupUiModel, commonGroupUiModel2);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21556hDt c21556hDtCopydefault = C21556hDt.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21556hDtCopydefault, "");
        return new TaskDescription(this, c21556hDtCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, int i) {
        CommonGroupUiModel item;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        if (i < AEQbTJ().size()) {
            item = AEQbTJ().get(i);
        } else {
            item = getItem(i);
        }
        Intrinsics.copydefault(item);
        taskDescription.KWHzl(item, i);
        ItemTouchHelper itemTouchHelper = this.AEQbTJ;
        if (itemTouchHelper != null) {
            taskDescription.copydefault(itemTouchHelper);
        }
    }

    /* JADX INFO: renamed from: o.kCz$TaskDescription */
    public final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21556hDt AEQbTJ;
        public final /* synthetic */ C27777kCz EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C27777kCz c27777kCz, C21556hDt c21556hDt) {
            super(c21556hDt.getRoot());
            Intrinsics.checkNotNullParameter(c21556hDt, "");
            this.EZpvd = c27777kCz;
            this.AEQbTJ = c21556hDt;
        }

        public final void KWHzl(@NotNull CommonGroupUiModel commonGroupUiModel, int i) {
            Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
            C21556hDt c21556hDt = this.AEQbTJ;
            C27777kCz c27777kCz = this.EZpvd;
            c21556hDt.getRoot().setContentDescription("web3_dex_watchlist_group_item_" + i);
            c21556hDt.EZpvd.setImageDrawable(C33070mpX.KWHzl(commonGroupUiModel.AEQbTJ()));
            c21556hDt.copydefault.setText(commonGroupUiModel.EZpvd() + " (" + commonGroupUiModel.OLrzqt() + ")");
            android.widget.ImageView imageView = c21556hDt.OLrzqt;
            imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, c27777kCz, commonGroupUiModel));
            android.widget.ImageView imageView2 = c21556hDt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(commonGroupUiModel.gEmmrt() ? 0 : 8);
        }

        public final void copydefault(@NotNull final ItemTouchHelper itemTouchHelper) {
            Intrinsics.checkNotNullParameter(itemTouchHelper, "");
            this.AEQbTJ.KWHzl.setOnTouchListener(new View.OnTouchListener() { // from class: o.kCy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C27777kCz.TaskDescription.EZpvd(itemTouchHelper, this, view, motionEvent);
                }
            });
        }

        public static final boolean EZpvd(ItemTouchHelper itemTouchHelper, TaskDescription taskDescription, android.view.View view, android.view.MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            itemTouchHelper.startDrag(taskDescription);
            return false;
        }

        /* JADX INFO: renamed from: o.kCz$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ C27777kCz AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ CommonGroupUiModel copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C27777kCz c27777kCz, CommonGroupUiModel commonGroupUiModel) {
                this.EZpvd = view;
                this.KWHzl = j;
                this.AEQbTJ = c27777kCz;
                this.copydefault = commonGroupUiModel;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.AEQbTJ.EZpvd.invoke(this.copydefault);
                }
            }
        }
    }

    public final void OLrzqt(@NotNull java.util.List<CommonGroupUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        copydefault(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list));
        submitList(list);
    }
}
