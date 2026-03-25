package o;

import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mKI extends androidx.recyclerview.widget.ListAdapter<mKC, C31978mKz> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final DiffUtil.ItemCallback<mKC> KWHzl = new StateListAnimator();
    public final Function1<java.lang.Integer, Unit> AEQbTJ;
    public final int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public mKI() {
        this(null, 0, 0, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.mKx.Application.sSMYrx int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x000f: SGET  A[WRAPPED] o.mKx.Activity.RVsVBY int) : (r3v0 int))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, int, int):void (m)] (LINE:19) call: o.mKI.<init>(kotlin.jvm.functions.Function1, int, int):void type: THIS */
    public /* synthetic */ mKI(Function1 function1, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : function1, (i3 & 2) != 0 ? C31976mKx.Application.sSMYrx : i, (i3 & 4) != 0 ? C31976mKx.Activity.RVsVBY : i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public mKI(Function1<? super java.lang.Integer, Unit> function1, @androidx.annotation.LayoutRes int i, @androidx.annotation.IdRes int i2) {
        super(KWHzl);
        this.AEQbTJ = function1;
        this.copydefault = i;
        this.OLrzqt = i2;
    }

    public final void copydefault(@NotNull java.util.List<mKC> list) {
        Intrinsics.checkNotNullParameter(list, "");
        submitList(list);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C31978mKz onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(this.copydefault, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C31978mKz(viewInflate, this.OLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C31978mKz c31978mKz, final int i) {
        Intrinsics.checkNotNullParameter(c31978mKz, "");
        c31978mKz.EZpvd().setText(getItem(i).AEQbTJ());
        c31978mKz.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.mKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mKI.copydefault(this.EZpvd, i, view);
            }
        });
    }

    public static final void copydefault(mKI mki, int i, android.view.View view) {
        Function1<java.lang.Integer, Unit> function1 = mki.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(i));
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mKI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final class StateListAnimator extends DiffUtil.ItemCallback<mKC> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(mKC mkc, mKC mkc2) {
            Intrinsics.checkNotNullParameter(mkc, "");
            Intrinsics.checkNotNullParameter(mkc2, "");
            return mkc.OLrzqt() == mkc2.OLrzqt();
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(mKC mkc, mKC mkc2) {
            Intrinsics.checkNotNullParameter(mkc, "");
            Intrinsics.checkNotNullParameter(mkc2, "");
            return C59449zhJ.AEQbTJ(mkc.AEQbTJ(), mkc2.AEQbTJ());
        }
    }
}
