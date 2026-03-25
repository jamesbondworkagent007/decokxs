package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27138jpY extends ConstraintLayout {
    public boolean AEQbTJ;
    public View.OnClickListener EZpvd;
    public InterfaceC27199jqg KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27138jpY(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27138jpY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void set3MoreClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.EZpvd = onClickListener;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.jpY.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27138jpY(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27138jpY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    private final InterfaceC27199jqg OLrzqt() {
        InterfaceC27199jqg c27321jsw;
        if (this.KWHzl == null) {
            if (this.AEQbTJ) {
                iLY ilyAEQbTJ = iLY.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(ilyAEQbTJ, "");
                c27321jsw = new C27274jsB(ilyAEQbTJ);
            } else {
                AbstractC23861iMa abstractC23861iMaOLrzqt = AbstractC23861iMa.OLrzqt(android.view.LayoutInflater.from(getContext()), this, false);
                Intrinsics.checkNotNullExpressionValue(abstractC23861iMaOLrzqt, "");
                c27321jsw = new C27321jsw(abstractC23861iMaOLrzqt);
            }
            this.KWHzl = c27321jsw;
        }
        InterfaceC27199jqg interfaceC27199jqg = this.KWHzl;
        Intrinsics.copydefault(interfaceC27199jqg);
        return interfaceC27199jqg;
    }

    public final void AEQbTJ(boolean z) {
        if (this.AEQbTJ != z) {
            this.AEQbTJ = z;
            this.KWHzl = null;
            EZpvd();
        }
    }

    private final void EZpvd() {
        removeAllViews();
        addView(OLrzqt().EZpvd());
        OLrzqt().KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.jpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C27138jpY.copydefault(this.AEQbTJ, view);
            }
        });
    }

    public static final void copydefault(C27138jpY c27138jpY, android.view.View view) {
        View.OnClickListener onClickListener = c27138jpY.EZpvd;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public final void setUniv3TextData(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setVisibility(str.length() > 0 ? 0 : 8);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        InterfaceC27199jqg interfaceC27199jqgOLrzqt = OLrzqt();
        interfaceC27199jqgOLrzqt.OLrzqt().removeAllViews();
        interfaceC27199jqgOLrzqt.copydefault().getPaint().measureText(interfaceC27199jqgOLrzqt.copydefault().getText().toString());
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55298xhM.copydefault(16.0f, context);
        iLN iln = (iLN) DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.ihnvzI, interfaceC27199jqgOLrzqt.OLrzqt(), true);
        iln.KWHzl.setText(str);
        android.widget.TextView textView = iln.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    public static /* synthetic */ void setData$default(C27138jpY c27138jpY, java.util.List list, int i, boolean z, boolean z2, java.lang.String str, int i2, java.lang.Object obj) {
        boolean z3 = (i2 & 4) != 0 ? true : z;
        boolean z4 = (i2 & 8) != 0 ? true : z2;
        if ((i2 & 16) != 0) {
            str = null;
        }
        c27138jpY.setData(list, i, z3, z4, str);
    }

    public final void setData(@NotNull java.util.List<InvestTokenWithAmount> list, int i, boolean z, boolean z2, java.lang.String str) {
        ViewDataBinding viewDataBindingInflate;
        int i2;
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC27199jqg interfaceC27199jqgOLrzqt = OLrzqt();
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        interfaceC27199jqgOLrzqt.OLrzqt().removeAllViews();
        android.text.TextPaint paint = interfaceC27199jqgOLrzqt.copydefault().getPaint();
        java.lang.Float fValueOf = paint != null ? java.lang.Float.valueOf(paint.measureText(interfaceC27199jqgOLrzqt.copydefault().getText().toString())) : null;
        if (fValueOf == null) {
            fValueOf = java.lang.Float.valueOf(0.0f);
        }
        float fFloatValue = fValueOf.floatValue();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fCopydefault = C55298xhM.copydefault(16.0f, context);
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
            if (!z2 || list.size() <= 3 || i3 <= 2) {
                if (this.AEQbTJ) {
                    viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.DQYQgr, interfaceC27199jqgOLrzqt.OLrzqt(), true);
                } else {
                    viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.ihnvzI, interfaceC27199jqgOLrzqt.OLrzqt(), true);
                }
                android.view.View viewFindViewById = viewDataBindingInflate.getRoot().findViewById(C25493ixk.ActionBar.RihMUf);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
                android.view.View root = viewDataBindingInflate.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                i2 = i3;
                EZpvd(root, investTokenWithAmount, i, z, false, str);
                if (i2 == 0 && !this.AEQbTJ && (constraintLayout.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                    ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                    Intrinsics.copydefault(layoutParams, "");
                    ((LinearLayout.LayoutParams) layoutParams).setMarginStart((int) java.lang.Float.valueOf(fFloatValue + fCopydefault).floatValue());
                }
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
        if (z2 && list.size() > 3) {
            interfaceC27199jqgOLrzqt.KWHzl().setVisibility(0);
            interfaceC27199jqgOLrzqt.KWHzl().setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C25493ixk.FragmentManager.DPHOMC, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, java.lang.Integer.valueOf(list.size() - 2)))));
        } else {
            interfaceC27199jqgOLrzqt.KWHzl().setVisibility(8);
        }
    }

    public final void copydefault(@NotNull java.util.List<InvestTokenWithAmount> list, int i, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        InterfaceC27199jqg interfaceC27199jqgOLrzqt = OLrzqt();
        copydefault(false);
        android.widget.LinearLayout linearLayoutOLrzqt = interfaceC27199jqgOLrzqt.OLrzqt();
        int childCount = linearLayoutOLrzqt.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (list.size() > i2) {
                android.view.View childAt = linearLayoutOLrzqt.getChildAt(i2);
                Intrinsics.copydefault(childAt);
                update$default(this, childAt, list.get(i2), i, false, z, null, 32, null);
            }
        }
        if (list.size() > 3) {
            interfaceC27199jqgOLrzqt.KWHzl().setVisibility(0);
        } else {
            interfaceC27199jqgOLrzqt.KWHzl().setVisibility(8);
        }
    }

    public static /* synthetic */ void update$default(C27138jpY c27138jpY, android.view.View view, InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            str = null;
        }
        c27138jpY.EZpvd(view, investTokenWithAmount, i, z, z2, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void EZpvd(android.view.View view, InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, java.lang.String str) {
        java.lang.String str2;
        int i2;
        boolean z3;
        boolean z4;
        android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.RYPzIz);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.OBzZra);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.OmPrLP);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        android.widget.TextView textView3 = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C25493ixk.ActionBar.IPostMessageServiceStub);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        android.widget.TextView textView4 = (android.widget.TextView) viewFindViewById4;
        android.widget.ImageView imageView = this.AEQbTJ ? (android.widget.ImageView) view.findViewById(C25493ixk.ActionBar.sWlOSi) : null;
        C55251xgS c55251xgS = this.AEQbTJ ? (C55251xgS) view.findViewById(C25493ixk.ActionBar.getDefaultImpl) : null;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        InvestTokenType dataType = investTokenWithAmount.getDataType();
        InvestTokenType investTokenType = InvestTokenType.BONUS;
        textView.setTextColor(c27569jxf.copydefault(dataType == investTokenType));
        textView2.setTextColor(c27569jxf.copydefault(investTokenWithAmount.getDataType() == investTokenType));
        InvestTokenType dataType2 = investTokenWithAmount.getDataType();
        InvestTokenType investTokenType2 = InvestTokenType.TRADING_FEE;
        if (dataType2 == investTokenType2) {
            str2 = " " + C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQnQnb);
        } else {
            str2 = " " + investTokenWithAmount.getTokenSymbol();
        }
        textView2.setText(str2);
        textView3.setVisibility(investTokenWithAmount.getDataType() == investTokenType && !this.AEQbTJ ? 0 : 8);
        textView4.setVisibility((investTokenWithAmount.getDataType() == investTokenType2 || investTokenWithAmount.getDataType() == investTokenType || !C33129mqd.OLrzqt((java.lang.CharSequence) investTokenWithAmount.getCurrencyAmount()) || z || z2) ? 8 : 0);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investTokenWithAmount.getCurrencyAmount())) {
            textView4.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
        }
        if (c55251xgS != null && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            c55251xgS.setVisibility(0);
            c55251xgS.setText(str);
        } else if (c55251xgS != null) {
            c55251xgS.setVisibility(8);
        }
        if (investTokenWithAmount.getDataType() == investTokenType2) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            textView.setText(C27492jwH.OLrzqt.copydefault(z, z2, investTokenWithAmount.getCurrencyAmount(), false));
            return;
        }
        if (investTokenWithAmount.getDataType() != investTokenType || this.AEQbTJ) {
            i2 = 0;
        } else {
            textView3.setText("");
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView3.getContext(), C25493ixk.StateListAnimator.valueOf);
            if (drawable != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iCopydefault = C55298xhM.copydefault(16.0f, context);
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iCopydefault2 = C55298xhM.copydefault(16.0f, context2);
                i2 = 0;
                drawable.setBounds(0, 0, iCopydefault, iCopydefault2);
                z4 = true;
                DrawableCompat.setTint(drawable, c27569jxf.copydefault(true));
            } else {
                z4 = true;
                i2 = 0;
                drawable = null;
            }
            textView3.setCompoundDrawablesRelative(drawable, null, null, null);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textView3.setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, context3));
            textView3.setTextColor(c27569jxf.copydefault(z4));
        }
        if (imageView != null) {
            imageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) investTokenWithAmount.getTokenLogo()) ? i2 : 8);
        }
        if (imageView == null || !C33129mqd.OLrzqt((java.lang.CharSequence) investTokenWithAmount.getTokenLogo())) {
            z3 = i2;
        } else {
            z3 = i2;
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        }
        textView.setText(C27492jwH.OLrzqt.copydefault(z, z2, investTokenWithAmount.getCoinAmount(), z3));
    }

    public static /* synthetic */ void showNoData$default(C27138jpY c27138jpY, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c27138jpY.copydefault(z);
    }

    public final void copydefault(boolean z) {
        InterfaceC27199jqg interfaceC27199jqgOLrzqt = OLrzqt();
        interfaceC27199jqgOLrzqt.OLrzqt().setVisibility(z ^ true ? 0 : 8);
        interfaceC27199jqgOLrzqt.AEQbTJ().setVisibility(z ? 0 : 8);
    }
}
