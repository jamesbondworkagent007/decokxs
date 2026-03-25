package o;

import com.okinc.uilib.hyperlink.state.HyperlinkFontWeight;
import com.okinc.uilib.hyperlink.state.HyperlinkSize;
import com.okinc.uilib.hyperlink.state.HyperlinkStyle;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55355xiQ implements InterfaceC55348xiJ {
    @Override // o.InterfaceC55348xiJ
    public C55356xiR copydefault(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        new C55356xiR(null, null, null, null, null, false, false, false, null, null, 1023, null);
        int[] iArr = C52761wXj.PictureInPictureParams.giSNqX;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        HyperlinkStyle hyperlinkStyleCopydefault = HyperlinkStyle.Companion.copydefault(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.AxsJAYsNCnLh, HyperlinkStyle.PRIMARY.getId()));
        HyperlinkSize hyperlinkSizeEZpvd = HyperlinkSize.Companion.EZpvd(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.hUfVAv, HyperlinkSize.LARGE.getId()));
        java.lang.CharSequence text = typedArrayObtainStyledAttributes.getText(C52761wXj.PictureInPictureParams.gGvvIC);
        int color = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.iRxXKY, C33517mxu.KWHzl.OLrzqt(context, hyperlinkStyleCopydefault.getTextColorRes$OKUILib_uilib()));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.gkJEwt, typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(hyperlinkSizeEZpvd.getTextSize$OKUILib_uilib()));
        HyperlinkFontWeight hyperlinkFontWeightAEQbTJ = HyperlinkFontWeight.Companion.AEQbTJ(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.accept, HyperlinkFontWeight.REGULAR.getId$OKUILib_uilib()));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.AxsJAYaxsJAY, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.iZzfmt, false);
        C55356xiR c55356xiR = new C55356xiR(text, java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(dimensionPixelSize), hyperlinkFontWeightAEQbTJ, java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getResources().getDimensionPixelSize(hyperlinkSizeEZpvd.getLineHeight$OKUILib_uilib())), typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.gasjUx, true), z2, z, hyperlinkStyleCopydefault, hyperlinkSizeEZpvd);
        typedArrayObtainStyledAttributes.recycle();
        return c55356xiR;
    }
}
