package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27200jqh extends ConstraintLayout {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public StateListAnimator EZpvd;
    public ViewDataBinding OLrzqt;
    public AbstractC23872iMl copydefault;
    public boolean gEmmrt;

    /* JADX INFO: renamed from: o.jqh$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public interface StateListAnimator {
        void AEQbTJ(@NotNull InvestTokenWithAmount investTokenWithAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27200jqh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27200jqh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNewLayout(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTipClickCallback(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:43) call: o.jqh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27200jqh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27200jqh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt();
    }

    private final void OLrzqt() {
        this.copydefault = (AbstractC23872iMl) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C25493ixk.Activity.DQzvGNdrmXxudrmXxu, this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jqh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C27200jqh c27200jqh, java.util.List list, int i, boolean z, boolean z2, java.util.List list2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            list2 = yDY.AhwBna();
        }
        c27200jqh.setData(list, i, z3, z4, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setData(@NotNull java.util.List<InvestTokenWithAmount> list, int i, boolean z, boolean z2, @NotNull java.util.List<PointInfo> list2) {
        ViewDataBinding viewDataBindingInflate;
        ViewStubProxy viewStubProxy;
        ViewDataBinding viewDataBinding;
        boolean z3;
        java.lang.String currencyAmount;
        android.widget.HorizontalScrollView horizontalScrollView;
        ViewStubProxy viewStubProxy2;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (list.isEmpty() && list2.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        AbstractC23872iMl abstractC23872iMl = this.copydefault;
        if (abstractC23872iMl != null && (linearLayout = abstractC23872iMl.gEmmrt) != null) {
            linearLayout.removeAllViews();
        }
        if (OLrzqt(list, i)) {
            if (this.gEmmrt) {
                AbstractC23872iMl abstractC23872iMl2 = this.copydefault;
                viewDataBinding = (abstractC23872iMl2 == null || (viewStubProxy2 = abstractC23872iMl2.AYXKKw) == null) ? null : (AbstractC23863iMc) C33131mqf.OLrzqt(viewStubProxy2);
            } else {
                AbstractC23872iMl abstractC23872iMl3 = this.copydefault;
                if (abstractC23872iMl3 != null && (viewStubProxy = abstractC23872iMl3.EZpvd) != null) {
                    viewDataBinding = (AbstractC23865iMe) C33131mqf.OLrzqt(viewStubProxy);
                }
            }
            this.OLrzqt = viewDataBinding;
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (investTokenWithAmount != null) {
                currencyAmount = investTokenWithAmount.getCurrencyAmount();
                z3 = z;
            } else {
                z3 = z;
                currencyAmount = null;
            }
            copydefault(OLrzqt(z3, currencyAmount), z2);
            AbstractC23872iMl abstractC23872iMl4 = this.copydefault;
            ViewGroup.LayoutParams layoutParams = (abstractC23872iMl4 == null || (horizontalScrollView = abstractC23872iMl4.KWHzl) == null) ? null : horizontalScrollView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C55298xhM.copydefault(20.0f, context);
                return;
            }
            return;
        }
        int i2 = 0;
        for (int size = list.size(); i2 < size; size = size) {
            InvestTokenWithAmount investTokenWithAmount2 = list.get(i2);
            if (this.gEmmrt) {
                int i3 = C25493ixk.Activity.gdmIOq;
                AbstractC23872iMl abstractC23872iMl5 = this.copydefault;
                viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, i3, abstractC23872iMl5 != null ? abstractC23872iMl5.gEmmrt : null, true);
            } else {
                int i4 = C25493ixk.Activity.isReflectionWorking;
                AbstractC23872iMl abstractC23872iMl6 = this.copydefault;
                viewDataBindingInflate = DataBindingUtil.inflate(layoutInflaterFrom, i4, abstractC23872iMl6 != null ? abstractC23872iMl6.gEmmrt : null, true);
            }
            android.view.View root = viewDataBindingInflate.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            EZpvd(root, investTokenWithAmount2, i, false, z, (i2 == list.size() - 1 || this.gEmmrt) ? false : true, z2);
            i2++;
        }
        if (!list2.isEmpty()) {
            int i5 = C25493ixk.Activity.DTeKQX;
            AbstractC23872iMl abstractC23872iMl7 = this.copydefault;
            AbstractC23871iMk abstractC23871iMk = (AbstractC23871iMk) DataBindingUtil.inflate(layoutInflaterFrom, i5, abstractC23872iMl7 != null ? abstractC23872iMl7.gEmmrt : null, true);
            C27538jxA c27538jxA = C27538jxA.EZpvd;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C27212jqt c27212jqt = abstractC23871iMk.KWHzl;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                java.lang.String strAEQbTJ = ((PointInfo) it.next()).AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                arrayList.add(strAEQbTJ);
            }
            c27538jxA.OLrzqt(context2, c27212jqt, new InvestmentLogoData(arrayList, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 30, (DefaultConstructorMarker) null), 24.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : 0, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : C27569jxf.OLrzqt.OLrzqt());
        }
        EZpvd();
    }

    public final void EZpvd() {
        android.widget.HorizontalScrollView horizontalScrollView;
        AbstractC23872iMl abstractC23872iMl = this.copydefault;
        if (abstractC23872iMl == null || (horizontalScrollView = abstractC23872iMl.KWHzl) == null) {
            return;
        }
        horizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.jqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                C27200jqh.EZpvd(this.AEQbTJ, view, i, i2, i3, i4);
            }
        });
    }

    public static final void EZpvd(C27200jqh c27200jqh, android.view.View view, int i, int i2, int i3, int i4) {
        android.view.View view2;
        android.view.View view3;
        AbstractC23872iMl abstractC23872iMl = c27200jqh.copydefault;
        if (abstractC23872iMl != null && (view3 = abstractC23872iMl.OLrzqt) != null) {
            view3.setVisibility(view.canScrollHorizontally(1) ? 0 : 8);
        }
        AbstractC23872iMl abstractC23872iMl2 = c27200jqh.copydefault;
        if (abstractC23872iMl2 == null || (view2 = abstractC23872iMl2.copydefault) == null) {
            return;
        }
        view2.setVisibility(view.canScrollHorizontally(-1) ? 0 : 8);
    }

    public final java.lang.String OLrzqt(boolean z, java.lang.String str) {
        if (z) {
            return C27492jwH.OLrzqt.KWHzl(true);
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) str);
        return c27492jwH.OLrzqt(str);
    }

    public final boolean OLrzqt(java.util.List<InvestTokenWithAmount> list, int i) {
        return i == 2 && list.size() == 1;
    }

    public final void copydefault(@NotNull java.util.List<InvestTokenWithAmount> list, int i, boolean z) {
        android.widget.LinearLayout linearLayout;
        int i2;
        boolean z2;
        java.lang.String currencyAmount;
        Intrinsics.checkNotNullParameter(list, "");
        if (this.OLrzqt != null) {
            if (!list.isEmpty()) {
                InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(list);
                if (investTokenWithAmount != null) {
                    currencyAmount = investTokenWithAmount.getCurrencyAmount();
                    z2 = z;
                } else {
                    z2 = z;
                    currencyAmount = null;
                }
                updatePoolData$default(this, OLrzqt(z2, currencyAmount), false, 2, null);
                return;
            }
            return;
        }
        AbstractC23872iMl abstractC23872iMl = this.copydefault;
        if (abstractC23872iMl == null || (linearLayout = abstractC23872iMl.gEmmrt) == null) {
            return;
        }
        int i3 = 0;
        for (java.lang.Object obj : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) obj;
            android.view.View childAt = linearLayout.getChildAt(i3);
            boolean z3 = i3 != list.size() - 1;
            if (childAt != null) {
                i2 = i3;
                EZpvd(childAt, investTokenWithAmount2, i, z, false, z3, false);
            } else {
                i2 = i3;
                android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
                int i4 = C25493ixk.Activity.isReflectionWorking;
                AbstractC23872iMl abstractC23872iMl2 = this.copydefault;
                android.widget.LinearLayout linearLayout2 = ((AbstractC23865iMe) DataBindingUtil.inflate(layoutInflaterFrom, i4, abstractC23872iMl2 != null ? abstractC23872iMl2.gEmmrt : null, true)).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                EZpvd(linearLayout2, investTokenWithAmount2, i, z, false, z3, false);
            }
            i3 = i2 + 1;
        }
        if (list.size() < linearLayout.getChildCount()) {
            linearLayout.removeViews(list.size(), linearLayout.getChildCount() - list.size());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, o.xgZ, o.xhc] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.view.View view, final InvestTokenWithAmount investTokenWithAmount, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        java.lang.String str;
        android.widget.ImageView imageView;
        java.lang.String strAYXKKw;
        int i2;
        int i3;
        boolean z5;
        android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.INotificationSideChannelDefault);
        str = "";
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.INotificationSideChannelStubProxy);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        ?? r8 = (C55258xgZ) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.INotificationSideChannel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C25493ixk.ActionBar.INotificationSideChannel_Parcel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        android.widget.TextView textView3 = (android.widget.TextView) viewFindViewById4;
        android.widget.ImageView imageView2 = this.gEmmrt ? (android.widget.ImageView) view.findViewById(C25493ixk.ActionBar.sWlOSi) : null;
        C55113xdn c55113xdn = (C55113xdn) view.findViewById(C25493ixk.ActionBar.itxZVF);
        if (this.gEmmrt && c55113xdn != null) {
            c55113xdn.setVisibility(z4 ? 0 : 8);
            c55113xdn.setAnimation(C33492mxV.OLrzqt() ? C25493ixk.Fragment.OLrzqt : C25493ixk.Fragment.EZpvd);
            if (z4) {
                c55113xdn.KWHzl(0L);
            } else {
                c55113xdn.copydefault();
            }
        }
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        InvestTokenType dataType = investTokenWithAmount.getDataType();
        InvestTokenType investTokenType = InvestTokenType.BONUS;
        textView.setTextColor(c27569jxf.copydefault(dataType == investTokenType));
        r8.setTextColor(c27569jxf.copydefault(investTokenWithAmount.getDataType() == investTokenType));
        boolean z6 = this.gEmmrt;
        InvestTokenType dataType2 = investTokenWithAmount.getDataType();
        InvestTokenType investTokenType2 = InvestTokenType.TRADING_FEE;
        r8.setHelperLabelType(dataType2 == investTokenType2 ? z6 : 2);
        java.lang.String str2 = " ";
        if (z4) {
            strAYXKKw = "";
        } else if (investTokenWithAmount.getDataType() == investTokenType2) {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQnQnb);
        } else {
            imageView = imageView2;
            strAYXKKw = " " + investTokenWithAmount.getTokenSymbol();
            r8.setTextValue(strAYXKKw);
            textView3.setVisibility((investTokenWithAmount.getDataType() == investTokenType || this.gEmmrt) ? 8 : 0);
            if (investTokenWithAmount.getDataType() != investTokenType2) {
                if (i == 2 && investTokenWithAmount.getDataType() == investTokenType2) {
                    str2 = "";
                }
                if (!z4) {
                    str = C27492jwH.OLrzqt.copydefault(z2, z, investTokenWithAmount.getCurrencyAmount(), true) + str2;
                }
                textView.setText(str);
                r8.setVisibility(i != 2 ? 0 : 8);
                r8.setUnderlineStyle(0);
                r8.setOnClickListener(new View.OnClickListener() { // from class: o.jqj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C27200jqh.copydefault(this.copydefault, investTokenWithAmount, view2);
                    }
                });
                if (i != 2) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: o.jqk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            C27200jqh.EZpvd(this.copydefault, investTokenWithAmount, view2);
                        }
                    });
                }
                i3 = 0;
            } else {
                if (investTokenWithAmount.getDataType() != investTokenType || this.gEmmrt) {
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
                        z5 = true;
                        DrawableCompat.setTint(drawable, c27569jxf.copydefault(true));
                    } else {
                        z5 = true;
                        i2 = 0;
                        drawable = null;
                    }
                    textView3.setCompoundDrawablesRelative(drawable, null, null, null);
                    android.content.Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    textView3.setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, context3));
                    textView3.setTextColor(c27569jxf.copydefault(z5));
                }
                if (imageView != null) {
                    i3 = i2;
                    C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
                } else {
                    i3 = i2;
                }
                textView.setText(z4 ? "" : C27492jwH.OLrzqt.KWHzl(z2, z, investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getRangeMinCoinAmount()));
            }
            if (!z3) {
                i3 = 8;
            }
            textView2.setVisibility(i3);
        }
        imageView = imageView2;
        r8.setTextValue(strAYXKKw);
        textView3.setVisibility((investTokenWithAmount.getDataType() == investTokenType || this.gEmmrt) ? 8 : 0);
        if (investTokenWithAmount.getDataType() != investTokenType2) {
        }
        if (!z3) {
        }
        textView2.setVisibility(i3);
    }

    public static final void copydefault(C27200jqh c27200jqh, InvestTokenWithAmount investTokenWithAmount, android.view.View view) {
        StateListAnimator stateListAnimator = c27200jqh.EZpvd;
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(investTokenWithAmount);
        }
    }

    public static final void EZpvd(C27200jqh c27200jqh, InvestTokenWithAmount investTokenWithAmount, android.view.View view) {
        StateListAnimator stateListAnimator = c27200jqh.EZpvd;
        if (stateListAnimator != null) {
            stateListAnimator.AEQbTJ(investTokenWithAmount);
        }
    }

    public static /* synthetic */ void updatePoolData$default(C27200jqh c27200jqh, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c27200jqh.copydefault(str, z);
    }

    public final void copydefault(java.lang.String str, boolean z) {
        android.view.View root;
        android.view.View root2;
        android.view.View root3;
        android.view.View root4;
        ViewDataBinding viewDataBinding = this.OLrzqt;
        C55113xdn c55113xdn = null;
        android.widget.TextView textView = (viewDataBinding == null || (root4 = viewDataBinding.getRoot()) == null) ? null : (android.widget.TextView) root4.findViewById(C25493ixk.ActionBar.INotificationSideChannelDefault);
        ViewDataBinding viewDataBinding2 = this.OLrzqt;
        C55258xgZ c55258xgZ = (viewDataBinding2 == null || (root3 = viewDataBinding2.getRoot()) == null) ? null : (C55258xgZ) root3.findViewById(C25493ixk.ActionBar.INotificationSideChannelStubProxy);
        ViewDataBinding viewDataBinding3 = this.OLrzqt;
        android.widget.TextView textView2 = (viewDataBinding3 == null || (root2 = viewDataBinding3.getRoot()) == null) ? null : (android.widget.TextView) root2.findViewById(C25493ixk.ActionBar.INotificationSideChannel);
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (c55258xgZ != null) {
            c55258xgZ.setTextValue(str);
        }
        if (c55258xgZ != null) {
            c55258xgZ.setHelperLabelType(2);
        }
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        if (this.gEmmrt) {
            ViewDataBinding viewDataBinding4 = this.OLrzqt;
            if (viewDataBinding4 != null && (root = viewDataBinding4.getRoot()) != null) {
                c55113xdn = (C55113xdn) root.findViewById(C25493ixk.ActionBar.itxZVF);
            }
            if (c55113xdn != null) {
                c55113xdn.setVisibility(z ? 0 : 8);
            }
            if (c55113xdn != null) {
                c55113xdn.setAnimation(C33492mxV.OLrzqt() ? C25493ixk.Fragment.OLrzqt : C25493ixk.Fragment.EZpvd);
            }
            if (z) {
                if (c55113xdn != null) {
                    c55113xdn.KWHzl(0L);
                }
            } else if (c55113xdn != null) {
                c55113xdn.copydefault();
            }
        }
    }

    public final void KWHzl() {
        android.widget.HorizontalScrollView horizontalScrollView;
        C55113xdn c55113xdn;
        if (this.gEmmrt || this.AEQbTJ) {
            return;
        }
        ViewDataBinding viewDataBinding = this.OLrzqt;
        if (viewDataBinding != null) {
            android.view.View viewFindViewById = viewDataBinding.getRoot().findViewById(C25493ixk.ActionBar.INotificationSideChannelDefault);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
            android.view.View viewFindViewById2 = viewDataBinding.getRoot().findViewById(C25493ixk.ActionBar.INotificationSideChannelStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            C55113xdn c55113xdn2 = (C55113xdn) viewFindViewById2;
            c55113xdn2.setVisibility(0);
            c55113xdn2.setAnimation(C33492mxV.OLrzqt() ? C25493ixk.Fragment.OLrzqt : C25493ixk.Fragment.EZpvd);
            c55113xdn2.KWHzl(0L);
            textView.setVisibility(8);
            c55113xdn2.setImageTintList(textView.getTextColors());
        }
        if (this.OLrzqt == null) {
            AbstractC23872iMl abstractC23872iMl = this.copydefault;
            if (abstractC23872iMl != null && (c55113xdn = abstractC23872iMl.AEQbTJ) != null) {
                setVisibility(0);
                c55113xdn.setAnimation(C33492mxV.OLrzqt() ? C25493ixk.Fragment.OLrzqt : C25493ixk.Fragment.EZpvd);
                c55113xdn.KWHzl(0L);
            }
            AbstractC23872iMl abstractC23872iMl2 = this.copydefault;
            if (abstractC23872iMl2 != null && (horizontalScrollView = abstractC23872iMl2.KWHzl) != null) {
                horizontalScrollView.setVisibility(8);
            }
        }
        this.AEQbTJ = true;
    }

    public final void AEQbTJ() {
        android.widget.HorizontalScrollView horizontalScrollView;
        C55113xdn c55113xdn;
        if (!this.gEmmrt && this.AEQbTJ) {
            ViewDataBinding viewDataBinding = this.OLrzqt;
            if (viewDataBinding != null) {
                android.view.View viewFindViewById = viewDataBinding.getRoot().findViewById(C25493ixk.ActionBar.INotificationSideChannelDefault);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                android.view.View viewFindViewById2 = viewDataBinding.getRoot().findViewById(C25493ixk.ActionBar.INotificationSideChannelStub);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                C55113xdn c55113xdn2 = (C55113xdn) viewFindViewById2;
                c55113xdn2.setVisibility(8);
                c55113xdn2.copydefault();
                ((android.widget.TextView) viewFindViewById).setVisibility(0);
            }
            if (this.OLrzqt == null) {
                AbstractC23872iMl abstractC23872iMl = this.copydefault;
                if (abstractC23872iMl != null && (c55113xdn = abstractC23872iMl.AEQbTJ) != null) {
                    c55113xdn.setVisibility(8);
                    c55113xdn.clearAnimation();
                }
                AbstractC23872iMl abstractC23872iMl2 = this.copydefault;
                if (abstractC23872iMl2 != null && (horizontalScrollView = abstractC23872iMl2.KWHzl) != null) {
                    horizontalScrollView.setVisibility(0);
                }
            }
            this.AEQbTJ = false;
        }
    }

    /* JADX INFO: renamed from: o.jqh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jqh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
