package o;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46137tJe extends AbstractC59533zio<C46141tJi, C46144tJl> {
    public final Function1<java.lang.String, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C46137tJe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:22) call: o.tJe.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C46137tJe(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46137tJe(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C46144tJl onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DcqEDu, viewGroup, false);
        Intrinsics.copydefault(viewInflate);
        return new C46144tJl(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C46144tJl c46144tJl, @NotNull final C46141tJi c46141tJi) {
        Intrinsics.checkNotNullParameter(c46144tJl, "");
        Intrinsics.checkNotNullParameter(c46141tJi, "");
        if (C33129mqd.OLrzqt(c46141tJi.copydefault())) {
            c46144tJl.OLrzqt().setText(c46141tJi.copydefault());
        }
        if (C33129mqd.AEQbTJ(java.lang.Float.valueOf(c46141tJi.OLrzqt()), 0) || C33129mqd.AEQbTJ(java.lang.Float.valueOf(c46141tJi.KWHzl()), 0)) {
            android.widget.TextView textViewOLrzqt = c46144tJl.OLrzqt();
            float fOLrzqt = c46141tJi.OLrzqt();
            android.content.Context context = c46144tJl.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = C55298xhM.copydefault(fOLrzqt, context);
            float fKWHzl = c46141tJi.KWHzl();
            android.content.Context context2 = c46144tJl.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textViewOLrzqt.setPaddingRelative(0, iCopydefault, 0, C55298xhM.copydefault(fKWHzl, context2));
        }
        if (C33129mqd.AEQbTJ(java.lang.Float.valueOf(c46141tJi.AEQbTJ()), 0)) {
            ViewGroup.LayoutParams layoutParams = c46144tJl.AEQbTJ().getLayoutParams();
            float fAEQbTJ = c46141tJi.AEQbTJ();
            android.content.Context context3 = c46144tJl.AEQbTJ().getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            layoutParams.height = C55298xhM.copydefault(fAEQbTJ, context3);
            c46144tJl.AEQbTJ().setLayoutParams(layoutParams);
        }
        final Function1<java.lang.String, Unit> function1 = this.AEQbTJ;
        if (function1 != null) {
            C8003auW.copydefault(c46144tJl.itemView).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribeOn(C58266yxz.OLrzqt()).subscribe(new InterfaceC58227yxM() { // from class: o.tJk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C46137tJe.KWHzl(function1, c46141tJi, obj);
                }
            });
        }
    }

    public static final void KWHzl(Function1 function1, C46141tJi c46141tJi, java.lang.Object obj) {
        function1.invoke(c46141tJi.EZpvd());
    }
}
