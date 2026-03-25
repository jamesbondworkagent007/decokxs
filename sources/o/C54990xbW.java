package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.okinc.uilab.filter.FilterChip;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C54990xbW extends ConstraintLayout {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public FilterChip AEQbTJ;
    public final C55065xcs AhwBna;
    public C54935xaU EZpvd;
    public int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C54990xbW(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54935xaU KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBinding(@NotNull C54935xaU c54935xaU) {
        Intrinsics.checkNotNullParameter(c54935xaU, "");
        this.EZpvd = c54935xaU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealChip(@NotNull FilterChip filterChip) {
        Intrinsics.checkNotNullParameter(filterChip, "");
        this.AEQbTJ = filterChip;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:33) call: o.xbW.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C54990xbW(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: o.xbW$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54990xbW(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AhwBna = c55065xcs;
        this.copydefault = C55298xhM.OLrzqt(8, context);
        this.EZpvd = C54935xaU.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        c55065xcs.OLrzqt(attributeSet, 0, 0);
        this.EZpvd.OLrzqt.setOKDSSize$OKUILib_uilib(c55065xcs.copydefault());
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.aKhcqp);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.deregisterUser, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.gBtXYZ, false);
        this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.getUserContextRegisteredStatus, C55298xhM.KWHzl(8.0f, context));
        final int integer = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.dzkkkq, 258);
        this.KWHzl = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.fupbxE, 0);
        this.AEQbTJ = new C54993xbZ(context);
        if (this.KWHzl == 1) {
            this.EZpvd.OLrzqt.setCustomChip(new Function1() { // from class: o.xbS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C54990xbW.copydefault(this.copydefault, context, integer, (C54982xbO) obj);
                }
            });
        }
        this.EZpvd.EZpvd.setVisibility(z ? 0 : 8);
        this.EZpvd.AYXKKw.setVisibility(z2 ? 0 : 8);
        setupShowRightLayoutVisibility();
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final FilterChip copydefault(C54990xbW c54990xbW, android.content.Context context, int i, C54982xbO c54982xbO) {
        Intrinsics.checkNotNullParameter(c54982xbO, "");
        c54990xbW.AEQbTJ = new C54987xbT(context);
        c54990xbW.AEQbTJ(i);
        FilterChip filterChip = c54990xbW.AEQbTJ;
        android.widget.TextView titleView = filterChip.getTitleView();
        Intrinsics.copydefault(titleView, "");
        C54984xbQ c54984xbQ = (C54984xbQ) titleView;
        if (i == 0) {
            c54984xbQ.setOKDSType(258);
        } else if (i == 1) {
            c54984xbQ.setOKDSType(260);
        } else {
            c54984xbQ.setOKDSType(257);
        }
        return filterChip;
    }

    public final /* synthetic */ <T extends FilterChip> void setCustomChip(Function1<? super C54982xbO, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl().OLrzqt.setCustomChip(function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xbW */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C54990xbW c54990xbW, java.util.List list, Function2 function2, Function2 function22, Function2 function23, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = null;
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        c54990xbW.setData(list, function2, function22, function23);
    }

    public final void setData(@NotNull java.util.List<C54982xbO> list, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function2, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function22, Function2<? super TabLayout.Tab, ? super java.lang.Integer, Unit> function23) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.OLrzqt.setData$OKUILib_uilib(list, function2, function22, function23);
        setItemHorizontalPadding(this.copydefault);
    }

    public final void OLrzqt(int i, @NotNull C54982xbO c54982xbO) {
        Intrinsics.checkNotNullParameter(c54982xbO, "");
        TabLayout.Tab tabAt = this.EZpvd.OLrzqt.getTabAt(i);
        this.EZpvd.OLrzqt.copydefault(tabAt, c54982xbO);
        java.lang.Object tag = tabAt != null ? tabAt.getTag() : null;
        Intrinsics.copydefault(tag, "");
        java.lang.Object first = ((kotlin.Pair) tag).getFirst();
        Intrinsics.copydefault(first, "");
        C54985xbR.AEQbTJ((FilterChip) first, c54982xbO);
    }

    public final C55047xca OLrzqt() {
        C55047xca c55047xca = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55047xca, "");
        return c55047xca;
    }

    public final void setMenuIconVisibility(boolean z) {
        this.EZpvd.EZpvd.setVisibility(z ? 0 : 8);
        setupShowRightLayoutVisibility();
    }

    public final void setSelectIconVisibility(boolean z) {
        this.EZpvd.AYXKKw.setVisibility(z ? 0 : 8);
        setupShowRightLayoutVisibility();
    }

    public final void setMenuClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.EZpvd.EZpvd.setOnClickListener(onClickListener);
    }

    public final void setSelectClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        this.EZpvd.AYXKKw.setOnClickListener(onClickListener);
    }

    public final void setItemHorizontalPadding(int i) {
        this.copydefault = i;
        try {
            android.view.View childAt = OLrzqt().getChildAt(0);
            Intrinsics.copydefault(childAt, "");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) childAt;
            int childCount = linearLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt2 = linearLayout.getChildAt(i2);
                childAt2.setPaddingRelative(i, 0, i, 0);
                childAt2.invalidate();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("setItemHorizontalPadding error", e.toString());
        }
    }

    public static /* synthetic */ void setButtonAppearance$default(C54990xbW c54990xbW, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setButtonAppearance");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c54990xbW.AEQbTJ(i);
    }

    private final void AEQbTJ(int i) {
        if (this.KWHzl == 1) {
            FilterChip filterChip = this.AEQbTJ;
            Intrinsics.copydefault(filterChip, "");
            ((C54987xbT) filterChip).KWHzl(i);
            FilterChip filterChip2 = this.AEQbTJ;
            Intrinsics.copydefault(filterChip2, "");
            ((C54987xbT) filterChip2).setOKDSSize(this.AhwBna.copydefault());
        }
    }

    public final void setupShowRightLayoutVisibility() {
        C54935xaU c54935xaU = this.EZpvd;
        c54935xaU.AEQbTJ.setVisibility((c54935xaU.EZpvd.getVisibility() == 0 || this.EZpvd.AYXKKw.getVisibility() == 0) ? 0 : 8);
        C54935xaU c54935xaU2 = this.EZpvd;
        c54935xaU2.djBIcL.setVisibility((c54935xaU2.EZpvd.getVisibility() == 0 || this.EZpvd.AYXKKw.getVisibility() == 0) ? 0 : 8);
    }

    public final void copydefault() {
        OLrzqt().copydefault();
    }

    public final android.widget.PopupWindow AEQbTJ() {
        return OLrzqt().KWHzl();
    }

    public final void KWHzl(int i) {
        OLrzqt().copydefault(i);
    }
}
