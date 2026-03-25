package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14771drj extends ConstraintLayout {
    public final AbstractC16931etI KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14771drj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14771drj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.drj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14771drj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14771drj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.gCNefq, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.KWHzl = (AbstractC16931etI) viewDataBindingInflate;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setBuyData(java.lang.String str, boolean z) {
        java.lang.String strKWHzl;
        setVisibility(8);
        this.KWHzl.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sanitizeSessionIdIgnoreCase));
        AppCompatTextView appCompatTextView = this.KWHzl.EZpvd;
        if (str == null || str.length() == 0) {
            android.content.Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setTextColor(C14773drl.getPnlTextColor$default("", context, null, 2, null));
            strKWHzl = "--";
        } else {
            android.content.Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            appCompatTextView.setTextColor(C14773drl.getPnlTextColor$default("1", context2, null, 2, null));
            strKWHzl = C54880xYt.formatValuation$default(C33129mqd.EZpvd(str), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
        }
        if (z) {
            strKWHzl = C13821dZn.EZpvd.KWHzl(strKWHzl);
        }
        appCompatTextView.setText(strKWHzl);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setSellData(java.lang.String str, boolean z) {
        java.lang.String strKWHzl;
        setVisibility(8);
        this.KWHzl.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RXxsjQ));
        AppCompatTextView appCompatTextView = this.KWHzl.EZpvd;
        if (str == null || str.length() == 0) {
            android.content.Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView.setTextColor(C14773drl.getPnlTextColor$default("", context, null, 2, null));
            strKWHzl = "--";
        } else {
            android.content.Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            appCompatTextView.setTextColor(C14773drl.getPnlTextColor$default(MultiTransferSignData.DEFAULT_INTERVAL, context2, null, 2, null));
            strKWHzl = C54880xYt.formatValuation$default(C33129mqd.EZpvd(str), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
        }
        if (z) {
            strKWHzl = C13821dZn.EZpvd.KWHzl(strKWHzl);
        }
        appCompatTextView.setText(strKWHzl);
    }
}
