package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kFM extends AbstractC59533zio<kFQ, StateListAnimator> {
    public final Function0<Unit> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public kFM() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public kFM(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:17) call: o.kFU.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:17) call: o.kFM.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ kFM(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: o.kFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kFM.OLrzqt();
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.fsw, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new StateListAnimator(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, @NotNull kFQ kfq) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(kfq, "");
        android.view.View view = stateListAnimator.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        stateListAnimator.KWHzl(view, stateListAnimator.AEQbTJ(), kfq);
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public C55173xeu AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C55173xeu AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(qZH.StateListAnimator.RXxsjQ);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.AEQbTJ = (C55173xeu) viewFindViewById;
        }

        public final void KWHzl(@NotNull android.view.View view, @NotNull C55173xeu c55173xeu, @NotNull kFQ kfq) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(c55173xeu, "");
            Intrinsics.checkNotNullParameter(kfq, "");
            c55173xeu.setTitle(kfq.EZpvd());
            if (kfq.KWHzl() == -1.0f) {
                return;
            }
            android.widget.LinearLayout linearLayout = view instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view : null;
            if (linearLayout != null) {
                float fKWHzl = kfq.KWHzl();
                android.content.Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iEZpvd = C33052mpF.EZpvd(fKWHzl, context);
                float fKWHzl2 = kfq.KWHzl();
                android.content.Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                linearLayout.setPaddingRelative(0, iEZpvd, 0, C33052mpF.EZpvd(fKWHzl2, context2));
            }
        }
    }
}
