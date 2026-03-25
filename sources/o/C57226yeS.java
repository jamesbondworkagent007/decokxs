package o;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.AsyncDifferConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57227yeT;
import o.C57233yeZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57226yeS extends androidx.recyclerview.widget.ListAdapter<C57227yeT.TaskDescription, C57288yfb> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final C57233yeZ.StateListAnimator AEQbTJ;
    public final C57233yeZ.ActionBar KWHzl;
    public final C57233yeZ.Application OLrzqt;
    public final C57233yeZ.Activity copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57226yeS(@NotNull java.util.concurrent.Executor executor, @NotNull C57233yeZ.Activity activity, @NotNull C57233yeZ.StateListAnimator stateListAnimator, @NotNull C57233yeZ.Application application, @NotNull C57233yeZ.ActionBar actionBar) {
        super(new AsyncDifferConfig.Builder(C57232yeY.copydefault).setBackgroundThreadExecutor(executor).build());
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = activity;
        this.AEQbTJ = stateListAnimator;
        this.OLrzqt = application;
        this.KWHzl = actionBar;
    }

    /* JADX INFO: renamed from: o.yeS$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yeS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C57288yfb onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C57233yeZ c57233yeZ = new C57233yeZ(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        android.content.Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams.topMargin = C55298xhM.OLrzqt(12, context2);
        android.content.Context context3 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        layoutParams.setMarginStart(C55298xhM.OLrzqt(12, context3));
        c57233yeZ.setLayoutParams(layoutParams);
        c57233yeZ.setOnWordKeyListener(this.AEQbTJ);
        c57233yeZ.setOnWordTextChangedListener(this.OLrzqt);
        c57233yeZ.setOnWordFocusChangeListener(this.copydefault);
        c57233yeZ.setOnWordEditorActionListener(this.KWHzl);
        return new C57288yfb(c57233yeZ);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C57288yfb c57288yfb, int i) {
        Intrinsics.checkNotNullParameter(c57288yfb, "");
        C57227yeT.TaskDescription item = getItem(i);
        C57233yeZ c57233yeZCopydefault = c57288yfb.copydefault();
        Intrinsics.copydefault(item);
        c57233yeZCopydefault.setAddress(item);
    }
}
