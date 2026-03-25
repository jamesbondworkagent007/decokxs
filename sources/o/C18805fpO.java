package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18805fpO extends AbstractC59533zio<java.lang.String, C19227fxM> {
    public int KWHzl;
    public Function1<? super java.lang.Integer, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18805fpO() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C18805fpO(Function1<? super java.lang.Integer, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>):void (m)] (LINE:9) call: o.fpO.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C18805fpO(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C19227fxM onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.zvzmfz, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new C19227fxM(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C19227fxM c19227fxM, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c19227fxM, "");
        Intrinsics.checkNotNullParameter(str, "");
        c19227fxM.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.fpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C18805fpO.EZpvd(c19227fxM, this, view);
            }
        });
        c19227fxM.copydefault().setText(str);
    }

    public static final void EZpvd(C19227fxM c19227fxM, C18805fpO c18805fpO, android.view.View view) {
        if (c19227fxM.KWHzl().isSelected()) {
            c18805fpO.KWHzl--;
        } else {
            c18805fpO.KWHzl++;
        }
        c19227fxM.KWHzl().setSelected(!c19227fxM.KWHzl().isSelected());
        Function1<? super java.lang.Integer, Unit> function1 = c18805fpO.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Integer.valueOf(c18805fpO.KWHzl));
        }
    }
}
