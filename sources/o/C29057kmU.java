package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.overview.domain.StockInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29057kmU extends ConstraintLayout {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29057kmU(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:24) call: o.kmU.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29057kmU(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29057kmU(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29057kmU.KWHzl(context, this);
            }
        });
    }

    private final C21608hFr copydefault() {
        return (C21608hFr) this.OLrzqt.getValue();
    }

    public static final C21608hFr KWHzl(android.content.Context context, C29057kmU c29057kmU) {
        return C21608hFr.AEQbTJ(android.view.LayoutInflater.from(context), c29057kmU);
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
    public final void OLrzqt(@NotNull StockInfo stockInfo, @NotNull Function0<Unit> function0, @NotNull final Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(stockInfo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function02, "");
        C21608hFr c21608hFrCopydefault = copydefault();
        android.view.View view = c21608hFrCopydefault.KWHzl;
        view.setOnClickListener(new Activity(view, 1000L, function0));
        ConstraintLayout constraintLayout = c21608hFrCopydefault.values;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AppCompatTextView appCompatTextView = c21608hFrCopydefault.wlaJM;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        setRowData(constraintLayout, appCompatTextView, stockInfo.AhwBna());
        ConstraintLayout constraintLayout2 = c21608hFrCopydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        AppCompatTextView appCompatTextView2 = c21608hFrCopydefault.AuCTel;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        setRowData(constraintLayout2, appCompatTextView2, stockInfo.EZpvd());
        ConstraintLayout constraintLayout3 = c21608hFrCopydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
        C55251xgS c55251xgS = c21608hFrCopydefault.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        setRowData(constraintLayout3, c55251xgS, stockInfo.copydefault());
        ConstraintLayout constraintLayout4 = c21608hFrCopydefault.AhwBna;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
        AppCompatTextView appCompatTextView3 = c21608hFrCopydefault.AuCTelauCTel;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        setRowData(constraintLayout4, appCompatTextView3, KWHzl(stockInfo.AYXKKw()));
        ConstraintLayout constraintLayout5 = c21608hFrCopydefault.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        AppCompatTextView appCompatTextView4 = c21608hFrCopydefault.fARcdN;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        setRowData(constraintLayout5, appCompatTextView4, KWHzl(stockInfo.OLrzqt()));
        ConstraintLayout constraintLayout6 = c21608hFrCopydefault.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(constraintLayout6, "");
        AppCompatTextView appCompatTextView5 = c21608hFrCopydefault.gHZMYf;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
        setRowData(constraintLayout6, appCompatTextView5, C23311hvo.formatPercentWithoutSymbol$default(stockInfo.gEmmrt(), false, 0, new BigDecimal(0.01d), true, null, 19, null));
        ConstraintLayout constraintLayout7 = c21608hFrCopydefault.djBIcL;
        Intrinsics.checkNotNullExpressionValue(constraintLayout7, "");
        AppCompatTextView appCompatTextView6 = c21608hFrCopydefault.zsXlph;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
        setRowData(constraintLayout7, appCompatTextView6, C23319hvw.getNumberICU$default(stockInfo.djBIcL(), null, null, null, null, 15, null));
        ConstraintLayout constraintLayout8 = c21608hFrCopydefault.valueOf;
        Intrinsics.checkNotNullExpressionValue(constraintLayout8, "");
        AppCompatTextView appCompatTextView7 = c21608hFrCopydefault.uzCIH;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
        setRowData(constraintLayout8, appCompatTextView7, stockInfo.AEQbTJ());
        java.lang.String strKWHzl = stockInfo.KWHzl();
        boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl) && !Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "--");
        android.view.View view2 = c21608hFrCopydefault.zuBGHE;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(z ? 0 : 8);
        ConstraintLayout constraintLayout9 = c21608hFrCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout9, "");
        constraintLayout9.setVisibility(z ? 0 : 8);
        if (z) {
            AppCompatTextView appCompatTextView8 = c21608hFrCopydefault.DbNXlk;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            appCompatTextView8.setText(pTD.KWHzl(context, C23274hvD.Fragment.dzCpvv, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("company", stockInfo.EZpvd()))));
            jPJ jpj = c21608hFrCopydefault.fetchVPNInfo;
            jpj.setDescriptionTextStyle(C52761wXj.LoaderManager.zuBGHE, C52761wXj.Activity.QwvEab, 16.0f);
            jPJ.setDescription$default(jpj, strKWHzl, false, 2, null);
            jpj.setDropdownChevronBackgroundTint(C52761wXj.Activity.djBIcL);
            jpj.setToggleDescriptionBoxListener(new Function1() { // from class: o.kmV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29057kmU.KWHzl(function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            java.lang.String string = jpj.getContext().getString(C23274hvD.Fragment.ReportDrawnKtReportDrawn1);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = jpj.getContext().getString(C23274hvD.Fragment.HJWChPRGtXKCRGtXKC);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            java.lang.String str = string + " " + string2;
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, string2, 0, false, 6, (java.lang.Object) null);
            spannableString.setSpan(new Application(function02, jpj), iIndexOf$default, string2.length() + iIndexOf$default, 33);
            jpj.setFooter(spannableString);
        }
    }

    public static final Unit KWHzl(Function1 function1, boolean z) {
        function1.invoke(java.lang.Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kmU$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> AEQbTJ;
        public final /* synthetic */ jPJ copydefault;

        public Application(Function0<Unit> function0, jPJ jpj) {
            this.AEQbTJ = function0;
            this.copydefault = jpj;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            int i = C52761wXj.Activity.fdOvFl;
            android.content.Context context = this.copydefault.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textPaint.setColor(C25382ivf.copydefault(i, context));
            textPaint.setUnderlineText(true);
        }
    }

    public final void setRowData(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, java.lang.String str) {
        constraintLayout.setVisibility((!C33129mqd.OLrzqt((java.lang.CharSequence) str) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--")) ? 8 : 0);
        if (constraintLayout.getVisibility() == 0) {
            appCompatTextView.setText(str);
        }
    }

    private final java.lang.String KWHzl(java.lang.String str) {
        java.lang.String scientificCurrency$default;
        return (str == null || (scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, true, true, false, false, null, false, false, 496, null)) == null) ? "--" : scientificCurrency$default;
    }

    /* JADX INFO: renamed from: o.kmU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }
}
