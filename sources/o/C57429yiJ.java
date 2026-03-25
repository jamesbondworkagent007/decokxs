package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yiJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57429yiJ extends ConstraintLayout {
    public TabLayout.Tab EZpvd;
    public TabLayout.Tab KWHzl;
    public final AbstractC57383yhQ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57429yiJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57429yiJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.yiJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57429yiJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57429yiJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC57383yhQ abstractC57383yhQOLrzqt = AbstractC57383yhQ.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC57383yhQOLrzqt, "");
        this.OLrzqt = abstractC57383yhQOLrzqt;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57406yhn.Fragment.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C57406yhn.Fragment.QOLQEE);
        java.lang.String str = string != null ? string : "";
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.QbewEr);
        android.graphics.drawable.Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C57406yhn.Fragment.QVAiDq);
        setHeaderTitleInfo(str);
        setHeaderIcon(drawable, drawable2);
        AhwBna();
        abstractC57383yhQOLrzqt.OLrzqt.setLayerType(1, null);
        typedArrayObtainStyledAttributes.recycle();
        setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public final android.widget.TextView OLrzqt() {
        android.widget.TextView textView = this.OLrzqt.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.OLrzqt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.OLrzqt.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView KWHzl() {
        android.widget.TextView textView = this.OLrzqt.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void AhwBna() {
        C55249xgQ c55249xgQ = this.OLrzqt.AEQbTJ;
        TabLayout.Tab tabNewTab = c55249xgQ.newTab();
        tabNewTab.setText(C33070mpX.AYXKKw(C57406yhn.ActionBar.AYXKKw));
        tabNewTab.setId(1);
        this.KWHzl = tabNewTab;
        c55249xgQ.addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = c55249xgQ.newTab();
        tabNewTab2.setText(C33070mpX.AYXKKw(C57406yhn.ActionBar.AhwBna));
        tabNewTab2.setId(2);
        this.EZpvd = tabNewTab2;
        c55249xgQ.addTab(tabNewTab2);
    }

    public final void setViewDataBean(@NotNull TransactionNetworkFeeBean transactionNetworkFeeBean) {
        Intrinsics.checkNotNullParameter(transactionNetworkFeeBean, "");
        setHeaderIcon(transactionNetworkFeeBean.getHeaderImgRes(), transactionNetworkFeeBean.getHeaderImgDefaultRes());
        setHeaderTitleInfo(transactionNetworkFeeBean.getHeaderTitle());
        setHeaderTitleUnderLineVisibility(transactionNetworkFeeBean.getHeaderTitleUnderLineClick());
        setLeftContentInfo(transactionNetworkFeeBean.getLeftContentInfo());
        setRightContentInfo(transactionNetworkFeeBean.getRightContentInfo());
        setFreeContentInfo(transactionNetworkFeeBean.getFreeContentInfo());
        setFreeTagContentInfo(transactionNetworkFeeBean.getFreeTagContentInfo());
        setDividerVisibility(transactionNetworkFeeBean.getLeftContentInfo().length() > 0 && transactionNetworkFeeBean.getRightContentInfo().length() > 0);
        setPrimaryTipInfo(transactionNetworkFeeBean.getPrimaryTip());
        setSecondaryTipInfo(transactionNetworkFeeBean.getSecondTipIcon(), transactionNetworkFeeBean.getSecondaryTip());
        setClickCallback(transactionNetworkFeeBean.getRootClickCallback());
        setLeftContentInfoErrorColor(transactionNetworkFeeBean.getHasError());
    }

    public final void setClickCallback(final Function0<Unit> function0) {
        java.lang.String string = this.OLrzqt.getRoot().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        C43296rmc.KWHzl("mRoot", string);
        if (function0 != null) {
            android.widget.ImageView imageView = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            setOnClickListener(new View.OnClickListener() { // from class: o.yiN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
            return;
        }
        android.widget.ImageView imageView2 = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        setOnClickListener(null);
    }

    public final void setHeaderIcon(java.lang.Object obj, android.graphics.drawable.Drawable drawable) {
        if (obj != null) {
            android.widget.ImageView imageView = this.OLrzqt.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            Intrinsics.copydefault(Glide.KWHzl(this.OLrzqt.AhwBna).KWHzl(obj).EZpvd(drawable).OLrzqt(drawable).AEQbTJ(drawable).gEmmrt().EZpvd(this.OLrzqt.AhwBna));
            return;
        }
        android.widget.ImageView imageView2 = this.OLrzqt.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
    }

    public final void setHeaderTitleInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.OLrzqt.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
        if (this.OLrzqt.AkhnZx.getVisibility() == 8) {
            android.view.View view = this.OLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
        }
    }

    public final void setHeaderTitleUnderLineVisibility(final Function0<Unit> function0) {
        if (function0 != null) {
            this.OLrzqt.EZpvd.setVisibility(0);
            this.OLrzqt.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.yiO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    function0.invoke();
                }
            });
        } else {
            this.OLrzqt.EZpvd.setVisibility(8);
            this.OLrzqt.gEmmrt.setOnClickListener(null);
        }
    }

    public final void setLeftContentInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setLeftContentInfoVisibility(charSequence.length() > 0);
        android.widget.TextView textView = this.OLrzqt.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    public static /* synthetic */ void setLeftContentInfoVisibility$default(C57429yiJ c57429yiJ, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57429yiJ.setLeftContentInfoVisibility(z);
    }

    public final void setLeftContentInfoVisibility(boolean z) {
        android.widget.TextView textView = this.OLrzqt.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        setDividerVisibility(z);
    }

    public final void setLeftContentInfoErrorColor(boolean z) {
        int iCopydefault;
        android.widget.TextView textView = this.OLrzqt.fetchVPNInfo;
        if (z) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.hrjNmC);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.DeEinT);
        }
        textView.setTextColor(iCopydefault);
    }

    public final void setRightContentInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setRightContentInfoVisibility(charSequence.length() > 0);
        android.widget.TextView textView = this.OLrzqt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    public static /* synthetic */ void setRightContentInfoVisibility$default(C57429yiJ c57429yiJ, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57429yiJ.setRightContentInfoVisibility(z);
    }

    public final void setRightContentInfoVisibility(boolean z) {
        android.widget.TextView textView = this.OLrzqt.fARcdN;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        setDividerVisibility(z);
    }

    public final void setFreeContentInfo(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setFreeContentInfoVisibility(charSequence.length() > 0);
        android.widget.TextView textView = this.OLrzqt.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, charSequence);
    }

    public static /* synthetic */ void setFreeContentInfoVisibility$default(C57429yiJ c57429yiJ, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57429yiJ.setFreeContentInfoVisibility(z);
    }

    public final void setFreeContentInfoVisibility(boolean z) {
        android.widget.TextView textView = this.OLrzqt.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (z) {
            android.widget.TextView textView2 = this.OLrzqt.fARcdN;
            textView2.requestLayout();
            textView2.invalidate();
        }
    }

    public final void setPrimaryTipInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setPrimaryTipInfoVisibility(str.length() > 0);
        android.widget.TextView textView = this.OLrzqt.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55307xhV.AEQbTJ(textView, str);
    }

    public static /* synthetic */ void setPrimaryTipInfoVisibility$default(C57429yiJ c57429yiJ, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57429yiJ.setPrimaryTipInfoVisibility(z);
    }

    public final void setPrimaryTipInfoVisibility(boolean z) {
        android.widget.TextView textView = this.OLrzqt.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
    }

    public final void setSecondaryTipInfo(android.graphics.drawable.Drawable drawable, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        setSecondaryTipInfoVisibility(charSequence.length() > 0);
        this.OLrzqt.fJNWhG.setText(charSequence);
        if (charSequence.length() <= 0) {
            drawable = null;
        }
        setSecondaryTipIcon(drawable);
    }

    public final void setSecondaryTipIcon(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            android.widget.ImageView imageView = this.OLrzqt.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            this.OLrzqt.AYXKKw.setImageDrawable(drawable);
            return;
        }
        android.widget.ImageView imageView2 = this.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
    }

    public static /* synthetic */ void setSecondaryTipInfoVisibility$default(C57429yiJ c57429yiJ, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c57429yiJ.setSecondaryTipInfoVisibility(z);
    }

    public final void setSecondaryTipInfoVisibility(boolean z) {
        android.view.View view = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        android.widget.LinearLayout linearLayout = this.OLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(z ? 0 : 8);
    }

    public final void setFreeTagContentInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55251xgS c55251xgS = this.OLrzqt.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        C55307xhV.AEQbTJ(c55251xgS, str);
    }

    public final void setDividerVisibility(boolean z) {
        android.view.View view = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void changeTxMode$default(C57429yiJ c57429yiJ, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c57429yiJ.OLrzqt(i, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[PHI: r9
  0x0074: PHI (r9v2 com.google.android.material.tabs.TabLayout$Tab) = 
  (r9v1 com.google.android.material.tabs.TabLayout$Tab)
  (r9v4 com.google.android.material.tabs.TabLayout$Tab)
  (r9v5 com.google.android.material.tabs.TabLayout$Tab)
 binds: [B:22:0x006e, B:19:0x0066, B:16:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(int i, Function1<? super java.lang.Integer, Unit> function1) {
        TabLayout.Tab tab;
        if (function1 == null || i == 0) {
            return;
        }
        C55249xgQ c55249xgQ = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        c55249xgQ.setVisibility(0);
        TabLayout.Tab tab2 = null;
        try {
            this.OLrzqt.AEQbTJ.measure(0, 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.OLrzqt.AEQbTJ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            OLrzqt().setWidth((C33570myu.AEQbTJ() - C55298xhM.dp2px$default(64.0f, null, 1, null)) - this.OLrzqt.AEQbTJ.getMeasuredWidth());
        } catch (java.lang.Exception unused) {
        }
        android.widget.TextView textView = this.OLrzqt.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(i != 2 ? 8 : 0);
        C55249xgQ c55249xgQ2 = this.OLrzqt.AEQbTJ;
        if (i == 0 || i == 1) {
            tab = this.KWHzl;
            if (tab == null) {
                Intrinsics.gEmmrt("");
            } else {
                tab2 = tab;
            }
        } else if (i != 2) {
            tab = this.KWHzl;
            if (tab == null) {
                Intrinsics.gEmmrt("");
            }
        } else {
            tab = this.EZpvd;
            if (tab == null) {
                Intrinsics.gEmmrt("");
            }
        }
        c55249xgQ2.selectTab(tab2);
        c55249xgQ2.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription(c55249xgQ2, this, function1));
    }

    /* JADX INFO: renamed from: o.yiJ$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C57429yiJ AEQbTJ;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> OLrzqt;
        public final /* synthetic */ C55249xgQ copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(C55249xgQ c55249xgQ, C57429yiJ c57429yiJ, Function1<? super java.lang.Integer, Unit> function1) {
            this.copydefault = c55249xgQ;
            this.AEQbTJ = c57429yiJ;
            this.OLrzqt = function1;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            this.copydefault.selectTab(tab);
            android.widget.TextView textView = this.AEQbTJ.OLrzqt.values;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility((tab == null || tab.getId() != 2) ? 8 : 0);
            Function1<java.lang.Integer, Unit> function1 = this.OLrzqt;
            if (function1 != null) {
                function1.invoke(java.lang.Integer.valueOf(tab != null ? tab.getId() : 1));
            }
        }
    }

    public final android.view.View EZpvd() {
        C55249xgQ c55249xgQ = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        return c55249xgQ;
    }
}
