package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57634ymC extends AbstractC59533zio<C57637ymF, Application> {
    public final Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57634ymC() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C57634ymC(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:17) call: o.ymG.<init>():void type: CONSTRUCTOR) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:17) call: o.ymC.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C57634ymC(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Function0() { // from class: o.ymG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C57634ymC.copydefault();
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C32113mPz.Fragment.sSMYrx, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Application(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull C57637ymF c57637ymF) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c57637ymF, "");
        android.view.View view = application.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        application.EZpvd(view, application.KWHzl(), c57637ymF);
    }

    /* JADX INFO: renamed from: o.ymC$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public android.widget.TextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            android.view.View viewFindViewById = view.findViewById(C32113mPz.FragmentManager.RKDWNf);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
        }

        public final void EZpvd(@NotNull android.view.View view, @NotNull android.widget.TextView textView, @NotNull C57637ymF c57637ymF) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(textView, "");
            Intrinsics.checkNotNullParameter(c57637ymF, "");
            textView.setText(c57637ymF.OLrzqt());
            if (c57637ymF.KWHzl() == -1.0f) {
                return;
            }
            android.widget.LinearLayout linearLayout = view instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) view : null;
            if (linearLayout != null) {
                float fKWHzl = c57637ymF.KWHzl();
                android.content.Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iEZpvd = C33052mpF.EZpvd(fKWHzl, context);
                float fKWHzl2 = c57637ymF.KWHzl();
                android.content.Context context2 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                linearLayout.setPaddingRelative(0, iEZpvd, 0, C33052mpF.EZpvd(fKWHzl2, context2));
            }
        }
    }
}
