package o;

import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C31172lox;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31123loA extends C55249xgQ {
    public int OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31123loA(@NotNull android.content.Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        TabLayout.Tab tabNewTab = newTab();
        tabNewTab.setText(C23274hvD.Fragment.getLong);
        tabNewTab.setContentDescription("web3_dex_meme_buy_tab");
        addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = newTab();
        tabNewTab2.setText(C23274hvD.Fragment.getBundle);
        tabNewTab2.setContentDescription("web3_dex_meme_sell_tab");
        addTab(tabNewTab2);
        addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: o.loA.2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == null || !C31172lox.KWHzl(C31123loA.this.OLrzqt, C31172lox.Companion.OLrzqt())) {
                    return;
                }
                C31123loA.this.copydefault(tab.getPosition());
            }
        });
        this.OLrzqt = C31172lox.Companion.KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31123loA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        TabLayout.Tab tabNewTab = newTab();
        tabNewTab.setText(C23274hvD.Fragment.getLong);
        tabNewTab.setContentDescription("web3_dex_meme_buy_tab");
        addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = newTab();
        tabNewTab2.setText(C23274hvD.Fragment.getBundle);
        tabNewTab2.setContentDescription("web3_dex_meme_sell_tab");
        addTab(tabNewTab2);
        addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: o.loA.2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == null || !C31172lox.KWHzl(C31123loA.this.OLrzqt, C31172lox.Companion.OLrzqt())) {
                    return;
                }
                C31123loA.this.copydefault(tab.getPosition());
            }
        });
        this.OLrzqt = C31172lox.Companion.KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31123loA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        TabLayout.Tab tabNewTab = newTab();
        tabNewTab.setText(C23274hvD.Fragment.getLong);
        tabNewTab.setContentDescription("web3_dex_meme_buy_tab");
        addTab(tabNewTab);
        TabLayout.Tab tabNewTab2 = newTab();
        tabNewTab2.setText(C23274hvD.Fragment.getBundle);
        tabNewTab2.setContentDescription("web3_dex_meme_sell_tab");
        addTab(tabNewTab2);
        addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: o.loA.2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab == null || !C31172lox.KWHzl(C31123loA.this.OLrzqt, C31172lox.Companion.OLrzqt())) {
                    return;
                }
                C31123loA.this.copydefault(tab.getPosition());
            }
        });
        this.OLrzqt = C31172lox.Companion.KWHzl();
    }

    /* JADX INFO: renamed from: setStyle-Pw-t5vo, reason: not valid java name */
    public final void m8684setStylePwt5vo(int i) {
        this.OLrzqt = i;
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        if (C31172lox.KWHzl(i, taskDescription.KWHzl())) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            KWHzl(C25382ivf.KWHzl(context, C52761wXj.Activity.fdOvFl));
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            KWHzl(C25382ivf.OLrzqt(context2, C23274hvD.StateListAnimator.RJOkX));
            return;
        }
        if (C31172lox.KWHzl(i, taskDescription.OLrzqt())) {
            copydefault(getSelectedTabPosition());
        }
    }

    @Override // o.AbstractC55238xgF, com.google.android.material.tabs.TabLayout
    public TabLayout.Tab newTab() {
        android.widget.TextView textView;
        TabLayout.Tab tabNewTab = super.newTab();
        android.view.View customView = tabNewTab.getCustomView();
        if (customView != null && (textView = (android.widget.TextView) customView.findViewById(android.R.id.text1)) != null) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iDjBIcL = C55298xhM.djBIcL(10.0f, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, iDjBIcL, C55298xhM.djBIcL(14.0f, context2), 1, 0);
            textView.setLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            ViewCompat.setPaddingRelative(textView, textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ODWQjV), textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OuxcSI), textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ODWQjV), textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.OuxcSI));
        }
        return tabNewTab;
    }

    public final void copydefault(int i) {
        int iTradeRiseHighlightsFill$default;
        int i2;
        if (i == 0) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iTradeRiseHighlightsFill$default = C33512mxp.tradeRiseHighlightsFill$default(c33512mxp, context, 0.0f, 2, null);
            i2 = C23274hvD.StateListAnimator.QVAiDq;
        } else {
            if (i != 1) {
                return;
            }
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iTradeRiseHighlightsFill$default = C33512mxp.tradeFallHighlightsFill$default(c33512mxp2, context2, 0.0f, 2, null);
            i2 = C23274hvD.StateListAnimator.OcIXYQ;
        }
        KWHzl(iTradeRiseHighlightsFill$default);
        KWHzl(ContextCompat.getColorStateList(getContext(), i2));
    }
}
