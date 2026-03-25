package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.invest_biz.data.bean.InvestmentLogoData;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27538jxA {
    public static final C27538jxA EZpvd = new C27538jxA();

    private C27538jxA() {
    }

    public static /* synthetic */ InvestmentLogoData parseInvestLogoData$default(C27538jxA c27538jxA, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return c27538jxA.EZpvd(list, str, str2, str3);
    }

    public final InvestmentLogoData EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestmentLogoData(list, str, str2, null, str3);
    }

    public final void KWHzl(@NotNull android.content.Context context, C27212jqt c27212jqt, InvestmentLogoData investmentLogoData, float f, float f2, int i, float f3) {
        java.util.List<java.lang.String> tokenLogo;
        android.widget.ImageView imageView;
        float f4 = f;
        Intrinsics.checkNotNullParameter(context, "");
        if (c27212jqt == null || investmentLogoData == null || (tokenLogo = investmentLogoData.getTokenLogo()) == null || tokenLogo.isEmpty()) {
            return;
        }
        c27212jqt.removeAllViews();
        boolean zAEQbTJ = C55296xhK.AEQbTJ(c27212jqt);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        java.util.List<java.lang.String> tokenLogo2 = investmentLogoData.getTokenLogo();
        Intrinsics.copydefault(tokenLogo2);
        boolean z = false;
        int i2 = 0;
        for (java.lang.Object obj : tokenLogo2) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            android.view.View viewInflate = layoutInflaterFrom.inflate(C25493ixk.Activity.QIZEnU, c27212jqt, z);
            android.view.View viewFindViewById = viewInflate.findViewById(C25493ixk.ActionBar.RWIpjU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.ImageView imageView2 = (android.widget.ImageView) viewFindViewById;
            imageView2.getLayoutParams().width = C55298xhM.copydefault(f4, context);
            imageView2.getLayoutParams().height = C55298xhM.copydefault(f4, context);
            android.view.View viewFindViewById2 = viewInflate.findViewById(C25493ixk.ActionBar.UnZVfqExternalSyntheticApiModelOutline0);
            Intrinsics.copydefault(viewFindViewById2);
            android.widget.ImageView imageView3 = (android.widget.ImageView) viewFindViewById2;
            imageView3.getLayoutParams().width = C55298xhM.copydefault(f2, context);
            imageView3.getLayoutParams().height = C55298xhM.copydefault(f2, context);
            ViewGroup.LayoutParams layoutParams = imageView3.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.circleAngle = zAEQbTJ ? 45.0f : 315.0f;
            }
            ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
            Intrinsics.copydefault(layoutParams3, "");
            ((ConstraintLayout.LayoutParams) layoutParams3).circleRadius = C55298xhM.copydefault(f2, context);
            imageView3.setVisibility(4);
            android.view.View viewFindViewById3 = viewInflate.findViewById(C25493ixk.ActionBar.WFXFk);
            Intrinsics.copydefault(viewFindViewById3);
            android.widget.ImageView imageView4 = (android.widget.ImageView) viewFindViewById3;
            imageView4.getLayoutParams().width = C55298xhM.copydefault(f2, context);
            imageView4.getLayoutParams().height = C55298xhM.copydefault(f2, context);
            ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams5 = layoutParams4 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams4 : null;
            if (layoutParams5 != null) {
                layoutParams5.circleAngle = zAEQbTJ ? 315.0f : 45.0f;
            }
            ViewGroup.LayoutParams layoutParams6 = imageView4.getLayoutParams();
            Intrinsics.copydefault(layoutParams6, "");
            ((ConstraintLayout.LayoutParams) layoutParams6).circleRadius = C55298xhM.copydefault(f2, context);
            imageView4.setVisibility(4);
            android.view.View viewFindViewById4 = viewInflate.findViewById(C25493ixk.ActionBar.iZzfmt);
            Intrinsics.copydefault(viewFindViewById4);
            android.widget.ImageView imageView5 = (android.widget.ImageView) viewFindViewById4;
            imageView5.getLayoutParams().width = C55298xhM.copydefault(f2, context);
            imageView5.getLayoutParams().height = C55298xhM.copydefault(f2, context);
            ViewGroup.LayoutParams layoutParams7 = imageView5.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams8 = layoutParams7 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.circleAngle = zAEQbTJ ? 135.0f : 225.0f;
            }
            ViewGroup.LayoutParams layoutParams9 = imageView5.getLayoutParams();
            Intrinsics.copydefault(layoutParams9, "");
            ((ConstraintLayout.LayoutParams) layoutParams9).circleRadius = C55298xhM.copydefault(f2, context);
            imageView5.setVisibility(4);
            android.view.View viewFindViewById5 = viewInflate.findViewById(C25493ixk.ActionBar.AxsJAYaxsJAY);
            Intrinsics.copydefault(viewFindViewById5);
            android.widget.ImageView imageView6 = (android.widget.ImageView) viewFindViewById5;
            imageView6.getLayoutParams().width = C55298xhM.copydefault(f2, context);
            imageView6.getLayoutParams().height = C55298xhM.copydefault(f2, context);
            ViewGroup.LayoutParams layoutParams10 = imageView6.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams11 = layoutParams10 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams10 : null;
            if (layoutParams11 != null) {
                layoutParams11.circleAngle = zAEQbTJ ? 225.0f : 135.0f;
            }
            ViewGroup.LayoutParams layoutParams12 = imageView6.getLayoutParams();
            Intrinsics.copydefault(layoutParams12, "");
            ((ConstraintLayout.LayoutParams) layoutParams12).circleRadius = C55298xhM.copydefault(f2, context);
            imageView6.setVisibility(4);
            if (i2 != 0) {
                imageView = imageView4;
            } else if (C33129mqd.OLrzqt((java.lang.CharSequence) investmentLogoData.getLtLogo())) {
                imageView3.setVisibility(0);
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                imageView = imageView4;
                c27569jxf.KWHzl(imageView3, investmentLogoData.getLtLogo(), c27569jxf.EZpvd(), i, f3);
            } else {
                imageView = imageView4;
                imageView3.setVisibility(4);
            }
            Intrinsics.copydefault(investmentLogoData.getTokenLogo());
            if (i2 == r8.size() - 1) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) investmentLogoData.getRtLogo())) {
                    imageView.setVisibility(0);
                    C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
                    c27569jxf2.KWHzl(imageView, investmentLogoData.getRtLogo(), c27569jxf2.OLrzqt(), i, f3);
                } else {
                    imageView.setVisibility(4);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) investmentLogoData.getRbLogo())) {
                    z = false;
                    imageView6.setVisibility(0);
                    C27569jxf c27569jxf3 = C27569jxf.OLrzqt;
                    c27569jxf3.KWHzl(imageView6, investmentLogoData.getRbLogo(), c27569jxf3.EZpvd(), i, f3);
                } else {
                    z = false;
                    imageView6.setVisibility(4);
                }
            } else {
                z = false;
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                C27569jxf c27569jxf4 = C27569jxf.OLrzqt;
                c27569jxf4.KWHzl(imageView2, str, c27569jxf4.OLrzqt(), i, f3);
            }
            c27212jqt.addView(viewInflate);
            i2++;
            f4 = f;
        }
    }

    public final void OLrzqt(@NotNull android.content.Context context, C27212jqt c27212jqt, InvestmentLogoData investmentLogoData, float f, int i, float f2, int i2) {
        java.util.List<java.lang.String> tokenLogo;
        Intrinsics.checkNotNullParameter(context, "");
        if (c27212jqt == null || investmentLogoData == null || (tokenLogo = investmentLogoData.getTokenLogo()) == null || tokenLogo.isEmpty()) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        java.util.List<java.lang.String> tokenLogo2 = investmentLogoData.getTokenLogo();
        Intrinsics.copydefault(tokenLogo2);
        int i3 = 0;
        for (java.lang.Object obj : tokenLogo2) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            android.view.View childAt = i3 < c27212jqt.getChildCount() ? c27212jqt.getChildAt(i3) : null;
            if (childAt == null) {
                childAt = layoutInflaterFrom.inflate(C25493ixk.Activity.QIZEnU, (android.view.ViewGroup) c27212jqt, false);
                c27212jqt.addView(childAt);
            }
            Intrinsics.copydefault(childAt);
            android.view.View viewFindViewById = childAt.findViewById(C25493ixk.ActionBar.RWIpjU);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
            imageView.getLayoutParams().width = C55298xhM.copydefault(f, context);
            imageView.getLayoutParams().height = C55298xhM.copydefault(f, context);
            android.view.View viewFindViewById2 = childAt.findViewById(C25493ixk.ActionBar.UnZVfqExternalSyntheticApiModelOutline0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            ((android.widget.ImageView) viewFindViewById2).setVisibility(8);
            android.view.View viewFindViewById3 = childAt.findViewById(C25493ixk.ActionBar.WFXFk);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            ((android.widget.ImageView) viewFindViewById3).setVisibility(8);
            android.view.View viewFindViewById4 = childAt.findViewById(C25493ixk.ActionBar.iZzfmt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            ((android.widget.ImageView) viewFindViewById4).setVisibility(8);
            android.view.View viewFindViewById5 = childAt.findViewById(C25493ixk.ActionBar.AxsJAYaxsJAY);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            ((android.widget.ImageView) viewFindViewById5).setVisibility(8);
            C27569jxf.OLrzqt.KWHzl(imageView, str, i2, i, f2);
            i3++;
        }
        int childCount = c27212jqt.getChildCount();
        java.util.List<java.lang.String> tokenLogo3 = investmentLogoData.getTokenLogo();
        Intrinsics.copydefault(tokenLogo3);
        if (childCount > tokenLogo3.size()) {
            java.util.List<java.lang.String> tokenLogo4 = investmentLogoData.getTokenLogo();
            Intrinsics.copydefault(tokenLogo4);
            int size = tokenLogo4.size();
            int childCount2 = c27212jqt.getChildCount();
            java.util.List<java.lang.String> tokenLogo5 = investmentLogoData.getTokenLogo();
            Intrinsics.copydefault(tokenLogo5);
            c27212jqt.removeViews(size, childCount2 - tokenLogo5.size());
        }
    }
}
