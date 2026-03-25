package o;

import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55241xgI extends AbstractC55238xgF implements InterfaceC55066xct {
    public final C55065xcs AEQbTJ;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55241xgI(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55241xgI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public boolean isPaddingOffsetRequired() {
        return true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.fdOvFl int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.xgI.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55241xgI(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.fdOvFl : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55241xgI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, null);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AEQbTJ = c55065xcs;
        this.OLrzqt = 3;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, 0, 0, 6, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fXYAwm);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setTabMode(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.Th, 0));
        this.OLrzqt = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.isReflectionWorking, 3);
        typedArrayObtainStyledAttributes.recycle();
        int iEZpvd = new C52771wXt(context).EZpvd() - C55298xhM.OLrzqt(4, context);
        ViewCompat.setPaddingRelative(getChildAt(0), iEZpvd, 0, iEZpvd, 0);
    }

    @Override // o.AbstractC55238xgF
    public TabLayout.Tab EZpvd(@NotNull TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "");
        TabLayout.Tab customView = tab.setCustomView(EZpvd(copydefault()));
        Intrinsics.checkNotNullExpressionValue(customView, "");
        return customView;
    }

    public final C54984xbQ EZpvd(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final C54984xbQ c54984xbQ = new C54984xbQ(context, null, 0, 6, null);
        c54984xbQ.setOKDSSize(i);
        c54984xbQ.setStyle(this.OLrzqt);
        c54984xbQ.setSelectedStyle(false, this.OLrzqt);
        c54984xbQ.copydefault(new Function1() { // from class: o.xgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55241xgI.KWHzl(c54984xbQ, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = KWHzl(i);
        marginLayoutParams.bottomMargin = KWHzl(i);
        c54984xbQ.setLayoutParams(marginLayoutParams);
        c54984xbQ.setId(android.R.id.text1);
        return c54984xbQ;
    }

    public static final Unit KWHzl(C54984xbQ c54984xbQ, C55241xgI c55241xgI, boolean z) {
        c54984xbQ.setSelectedStyle(z, c55241xgI.OLrzqt);
        return Unit.INSTANCE;
    }

    public final int KWHzl(int i) {
        if (i == -6) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C55298xhM.OLrzqt(4, context);
        }
        if (i == -5) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return C55298xhM.OLrzqt(8, context2);
        }
        if (i == -4) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            return C55298xhM.OLrzqt(8, context3);
        }
        android.content.Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        return C55298xhM.OLrzqt(8, context4);
    }

    public int copydefault() {
        return this.AEQbTJ.copydefault();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.AEQbTJ.setOKDSSize(i);
        updateTabAppearance$default(this, false, 1, null);
    }

    @Override // android.view.View
    public int getLeftPaddingOffset() {
        return -getPaddingLeft();
    }

    @Override // android.view.View
    public int getRightPaddingOffset() {
        return getPaddingRight();
    }

    public void setOKButtonChipStyle(int i) {
        this.OLrzqt = i;
        OLrzqt(false);
    }

    public static /* synthetic */ void updateTabAppearance$default(C55241xgI c55241xgI, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55241xgI.OLrzqt(z);
    }

    private final void OLrzqt(boolean z) {
        android.view.View customView;
        android.view.View childAt = getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        int childCount = ((android.widget.LinearLayout) childAt).getChildCount();
        for (int i = 0; i < childCount; i++) {
            TabLayout.Tab tabAt = getTabAt(i);
            if (tabAt != null && (customView = tabAt.getCustomView()) != null) {
                if (z) {
                    ((C54984xbQ) customView).setOKDSSize(copydefault());
                } else {
                    C54984xbQ c54984xbQ = (C54984xbQ) customView;
                    c54984xbQ.setSelectedStyle(c54984xbQ.isSelected(), this.OLrzqt);
                }
            }
        }
    }
}
