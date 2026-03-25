package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55470xkZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34911nlQ extends AbstractC59533zio<AbstractC55470xkZ.ActionBar, StateListAnimator> {
    public Function1<? super AbstractC55470xkZ.ActionBar, Unit> OLrzqt;
    public InterfaceC34987nmn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34911nlQ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:o.nmn:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null o.nmn) : (r3v0 o.nmn))
 A[MD:(kotlin.jvm.functions.Function1<? super o.xkZ$ActionBar, kotlin.Unit>, o.nmn):void (m)] (LINE:432) call: o.nlQ.<init>(kotlin.jvm.functions.Function1, o.nmn):void type: THIS */
    public /* synthetic */ C34911nlQ(Function1 function1, InterfaceC34987nmn interfaceC34987nmn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : interfaceC34987nmn);
    }

    public C34911nlQ(Function1<? super AbstractC55470xkZ.ActionBar, Unit> function1, InterfaceC34987nmn interfaceC34987nmn) {
        this.OLrzqt = function1;
        this.copydefault = interfaceC34987nmn;
    }

    /* JADX INFO: renamed from: o.nlQ$StateListAnimator */
    public static final class StateListAnimator extends C34914nlT {
        public final C42914rfR KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42914rfR EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator(@NotNull C42914rfR c42914rfR) {
            Intrinsics.checkNotNullParameter(c42914rfR, "");
            ConstraintLayout root = c42914rfR.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.KWHzl = c42914rfR;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42914rfR c42914rfRCopydefault = C42914rfR.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42914rfRCopydefault, "");
        return new StateListAnimator(c42914rfRCopydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final StateListAnimator stateListAnimator, @NotNull final AbstractC55470xkZ.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        C42914rfR c42914rfREZpvd = stateListAnimator.EZpvd();
        android.widget.TextView textView = c42914rfREZpvd.KWHzl;
        android.content.Context context = c42914rfREZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C34990nmq.OLrzqt(context, actionBar.OLrzqt(), actionBar.EZpvd()));
        AppCompatImageView appCompatImageView = c42914rfREZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, actionBar.valueOf());
        c42914rfREZpvd.AEQbTJ.setText(pXE.copydefault(C33129mqd.valueOf(actionBar.isConnected())));
        c42914rfREZpvd.EZpvd.setText(C55527xld.OLrzqt(actionBar.fARcdN()));
        stateListAnimator.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34911nlQ.OLrzqt(this.copydefault, actionBar, view);
            }
        });
        stateListAnimator.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nlY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34911nlQ.copydefault(this.OLrzqt, stateListAnimator, actionBar, view);
            }
        });
    }

    public static final void OLrzqt(C34911nlQ c34911nlQ, AbstractC55470xkZ.ActionBar actionBar, android.view.View view) {
        Function1<? super AbstractC55470xkZ.ActionBar, Unit> function1 = c34911nlQ.OLrzqt;
        if (function1 != null) {
            function1.invoke(actionBar);
        }
    }

    public static final boolean copydefault(C34911nlQ c34911nlQ, StateListAnimator stateListAnimator, AbstractC55470xkZ.ActionBar actionBar, android.view.View view) {
        InterfaceC34987nmn interfaceC34987nmn = c34911nlQ.copydefault;
        if (interfaceC34987nmn == null || view == null) {
            return true;
        }
        Intrinsics.copydefault(interfaceC34987nmn);
        interfaceC34987nmn.OLrzqt(view, stateListAnimator.getBindingAdapterPosition(), actionBar);
        return true;
    }
}
