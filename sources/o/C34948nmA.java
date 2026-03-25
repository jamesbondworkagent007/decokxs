package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55470xkZ;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nmA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34948nmA extends AbstractC59533zio<AbstractC55470xkZ.StateListAnimator, Application> {
    public Function1<? super AbstractC55470xkZ.StateListAnimator, Unit> AEQbTJ;
    public InterfaceC34987nmn KWHzl;
    public Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34948nmA() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r2v0 kotlin.jvm.functions.Function1))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:o.nmn:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.nmn) : (r4v0 o.nmn))
 A[MD:(kotlin.jvm.functions.Function1<? super o.xkZ$StateListAnimator, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, o.nmn):void (m)] (LINE:352) call: o.nmA.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, o.nmn):void type: THIS */
    public /* synthetic */ C34948nmA(Function1 function1, Function0 function0, InterfaceC34987nmn interfaceC34987nmn, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : interfaceC34987nmn);
    }

    public C34948nmA(Function1<? super AbstractC55470xkZ.StateListAnimator, Unit> function1, Function0<Unit> function0, InterfaceC34987nmn interfaceC34987nmn) {
        this.AEQbTJ = function1;
        this.OLrzqt = function0;
        this.KWHzl = interfaceC34987nmn;
    }

    /* JADX INFO: renamed from: o.nmA$Application */
    public static final class Application extends C34914nlT {
        public final C42912rfP KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C42912rfP EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Application(@NotNull C42912rfP c42912rfP) {
            Intrinsics.checkNotNullParameter(c42912rfP, "");
            ConstraintLayout root = c42912rfP.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(root);
            this.KWHzl = c42912rfP;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42912rfP c42912rfPOLrzqt = C42912rfP.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42912rfPOLrzqt, "");
        return new Application(c42912rfPOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final Application application, @NotNull final AbstractC55470xkZ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C42912rfP c42912rfPEZpvd = application.EZpvd();
        android.widget.TextView textView = c42912rfPEZpvd.KWHzl;
        android.content.Context context = c42912rfPEZpvd.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(C34990nmq.OLrzqt(context, stateListAnimator.OLrzqt(), stateListAnimator.EZpvd()));
        AppCompatImageView appCompatImageView = c42912rfPEZpvd.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C46742tcs.AEQbTJ(appCompatImageView, stateListAnimator.djBIcL());
        if (Intrinsics.EZpvd((java.lang.Object) stateListAnimator.fetchVPNInfo(), (java.lang.Object) "0")) {
            android.widget.TextView textView2 = c42912rfPEZpvd.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            java.lang.CharSequence text = c42912rfPEZpvd.AhwBna.getText();
            c42912rfPEZpvd.AhwBna.setText(pXE.copydefault(C33129mqd.valueOf(stateListAnimator.AhwBna())));
            C40492qXw c40492qXw = c42912rfPEZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
            c40492qXw.setVisibility(0);
            if (!Intrinsics.EZpvd(text, c42912rfPEZpvd.AhwBna.getText())) {
                c42912rfPEZpvd.AEQbTJ.setDeadlineTime(CountDownType.SHOW_COUNT_DOWN, C33070mpX.AYXKKw(qZH.PendingIntent.getSessionID), stateListAnimator.AYXKKw(), new Function1() { // from class: o.nmD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C34948nmA.copydefault(this.copydefault, ((java.lang.Long) obj).longValue());
                    }
                });
            }
        } else {
            C40492qXw c40492qXw2 = c42912rfPEZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
            c40492qXw2.setVisibility(0);
            C40492qXw.setDeadlineTime$default(c42912rfPEZpvd.AEQbTJ, CountDownType.SHOW_EXPECT, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf), 0L, null, 8, null);
            android.widget.TextView textView3 = c42912rfPEZpvd.AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        }
        application.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.nmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34948nmA.KWHzl(this.AEQbTJ, stateListAnimator, view);
            }
        });
        application.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C34948nmA.copydefault(this.AEQbTJ, application, stateListAnimator, view);
            }
        });
    }

    public static final Unit copydefault(C34948nmA c34948nmA, long j) {
        Function0<Unit> function0 = c34948nmA.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C34948nmA c34948nmA, AbstractC55470xkZ.StateListAnimator stateListAnimator, android.view.View view) {
        Function1<? super AbstractC55470xkZ.StateListAnimator, Unit> function1 = c34948nmA.AEQbTJ;
        if (function1 != null) {
            function1.invoke(stateListAnimator);
        }
    }

    public static final boolean copydefault(C34948nmA c34948nmA, Application application, AbstractC55470xkZ.StateListAnimator stateListAnimator, android.view.View view) {
        InterfaceC34987nmn interfaceC34987nmn = c34948nmA.KWHzl;
        if (interfaceC34987nmn == null || view == null) {
            return true;
        }
        Intrinsics.copydefault(interfaceC34987nmn);
        interfaceC34987nmn.OLrzqt(view, application.getBindingAdapterPosition(), stateListAnimator);
        return true;
    }
}
