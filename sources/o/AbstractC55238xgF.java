package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55238xgF extends TabLayout {
    public int AYXKKw;
    public int AkhnZx;
    public int DbNXlk;
    public int djBIcL;
    public int ejfBZ;
    public int fIwbmz;
    public float fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC55238xgF(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC55238xgF(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.content.Context), (r2v0 android.util.AttributeSet), (r3v0 int) A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] call: o.xgF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC55238xgF(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i);
    }

    public static final boolean EZpvd(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TabLayout.Tab copydefault(@NotNull TabLayout.Tab tab, int i, int i2) {
        Intrinsics.checkNotNullParameter(tab, "");
        return tab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconSize$OKUILib_uilib(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconTextMargin$OKUILib_uilib(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabPaddingBottom$OKUILib_uilib(int i) {
        this.gEmmrt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabPaddingEnd$OKUILib_uilib(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabPaddingStart$OKUILib_uilib(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabPaddingTop$OKUILib_uilib(int i) {
        this.fetchVPNInfo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabSelectIconMarginStart$OKUILib_uilib(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabSelectIconSize$OKUILib_uilib(int i) {
        this.AkhnZx = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabTextAppearance$OKUILib_uilib(int i) {
        this.fIwbmz = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabTextSelectedAppearance$OKUILib_uilib(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTabTextSize$OKUILib_uilib(float f) {
        this.fJNWhG = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:23) call: o.xgF.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ AbstractC55238xgF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, null);
    }

    public AbstractC55238xgF(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AYXKKw = C55298xhM.OLrzqt(20, context);
        this.djBIcL = C55298xhM.OLrzqt(4, context);
        this.fJNWhG = C55298xhM.EZpvd(14.0f, context);
        this.AkhnZx = C55298xhM.OLrzqt(12, context);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public TabLayout.Tab newTab() {
        TabLayout.Tab tabNewTab = super.newTab();
        Intrinsics.checkNotNullExpressionValue(tabNewTab, "");
        TabLayout.Tab tabEZpvd = EZpvd(tabNewTab);
        tabEZpvd.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.xgD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return AbstractC55238xgF.EZpvd(view);
            }
        });
        return tabEZpvd;
    }

    public TabLayout.Tab EZpvd(@NotNull TabLayout.Tab tab) {
        android.widget.ImageView imageView;
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(tab, "");
        TabLayout.Tab customView = tab.setCustomView(C52761wXj.Fragment.ORxRYg);
        Intrinsics.checkNotNullExpressionValue(customView, "");
        android.view.View customView2 = customView.getCustomView();
        if (customView2 != null && (textView = (android.widget.TextView) customView2.findViewById(android.R.id.text1)) != null) {
            updateTextAppearance$OKUILib_uilib$default(this, textView, null, false, 3, null);
        }
        android.view.View customView3 = customView.getCustomView();
        if (customView3 != null && (imageView = (android.widget.ImageView) customView3.findViewById(C52761wXj.FragmentManager.zlvcHA)) != null) {
            updateIconTint$OKUILib_uilib$default(this, imageView, null, 1, null);
        }
        return customView;
    }

    public static /* synthetic */ void updateTextAppearance$OKUILib_uilib$default(AbstractC55238xgF abstractC55238xgF, android.widget.TextView textView, android.content.res.ColorStateList colorStateList, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTextAppearance");
        }
        if ((i & 1) != 0) {
            colorStateList = abstractC55238xgF.getTabTextColors();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC55238xgF.copydefault(textView, colorStateList, z);
    }

    public final void copydefault(@NotNull android.widget.TextView textView, android.content.res.ColorStateList colorStateList, boolean z) {
        Intrinsics.checkNotNullParameter(textView, "");
        if (z && textView.isSelected()) {
            TextViewCompat.setTextAppearance(textView, this.ejfBZ);
        } else {
            TextViewCompat.setTextAppearance(textView, this.fIwbmz);
        }
        textView.setTextColor(colorStateList);
        textView.setTextSize(0, this.fJNWhG);
        ViewCompat.setPaddingRelative(textView, this.isConnected, this.fetchVPNInfo, this.values, this.gEmmrt);
    }

    public static /* synthetic */ void updateIconTint$OKUILib_uilib$default(AbstractC55238xgF abstractC55238xgF, android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateIconTint");
        }
        if ((i & 1) != 0) {
            colorStateList = abstractC55238xgF.getTabTextColors();
        }
        abstractC55238xgF.copydefault(imageView, colorStateList);
    }

    public final void copydefault(@NotNull android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(imageView, "");
        imageView.setImageTintList(colorStateList);
    }

    public static /* synthetic */ TabLayout.Tab updateBadgeCount$default(AbstractC55238xgF abstractC55238xgF, TabLayout.Tab tab, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBadgeCount");
        }
        if ((i3 & 4) != 0) {
            i2 = 99;
        }
        return abstractC55238xgF.copydefault(tab, i, i2);
    }

    public static /* synthetic */ void updateBadgeCount$default(AbstractC55238xgF abstractC55238xgF, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBadgeCount");
        }
        if ((i4 & 4) != 0) {
            i3 = 99;
        }
        abstractC55238xgF.EZpvd(i, i2, i3);
    }

    public void EZpvd(int i, int i2, int i3) {
        TabLayout.Tab tabAt = getTabAt(i);
        if (tabAt != null) {
            copydefault(tabAt, i2, i3);
        }
    }
}
