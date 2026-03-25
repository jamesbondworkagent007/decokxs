package o;

import android.widget.LinearLayout;
import com.okinc.dexkline.market.domain.model.coininfo.Social;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nbL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34396nbL extends android.widget.LinearLayout {
    public Function0<Unit> EZpvd;
    public final C36082oOp OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34396nbL(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.EZpvd = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSearchClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.nbL.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C34396nbL(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34396nbL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C36082oOp c36082oOpEZpvd = C36082oOp.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c36082oOpEZpvd, "");
        this.OLrzqt = c36082oOpEZpvd;
    }

    public final void OLrzqt(@NotNull java.util.List<Social> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C36082oOp c36082oOp = this.OLrzqt;
        c36082oOp.AEQbTJ.removeAllViews();
        setupXSearch();
        for (Social social : list) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C34406nbV c34406nbV = new C34406nbV(context, null, 0, 6, null);
            c34406nbV.setSocialData(social);
            c36082oOp.AEQbTJ.addView(c34406nbV);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setupXSearch() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55251xgS c55251xgS = new C55251xgS(context, null, 0, 6, null);
        c55251xgS.setOKDSStyle(6);
        c55251xgS.setOKDSSize(-4);
        c55251xgS.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.gsvlRV));
        c55251xgS.setTagIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.UJpkuA));
        c55251xgS.setShowIcon(true);
        c55251xgS.setPadding(8, 8, 8, 8);
        c55251xgS.setCompoundDrawablePadding(4);
        int dimensionPixelSize = c55251xgS.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.RJOkX);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C55298xhM.dp2px$default(32.0f, null, 1, null));
        C55296xhK.AEQbTJ(layoutParams, 0, dimensionPixelSize, dimensionPixelSize, 0);
        c55251xgS.setLayoutParams(layoutParams);
        c55251xgS.setPaddingRelative(C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(8.0f, null, 1, null));
        mUO.setOnDoubleCheckClickListener$default(c55251xgS, 0L, new Function1() { // from class: o.nbO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34396nbL.copydefault(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        this.OLrzqt.AEQbTJ.addView(c55251xgS);
    }

    public static final Unit copydefault(C34396nbL c34396nbL, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function0<Unit> function0 = c34396nbL.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
