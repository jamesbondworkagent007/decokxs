package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xgx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55282xgx {
    public final int OLrzqt = 16777215;
    public final int AEQbTJ = 536870912;

    public final C55279xgu KWHzl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "");
        C55279xgu c55279xgu = new C55279xgu();
        if (attributeSet == null) {
            return c55279xgu;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fqaWRL);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        c55279xgu.AkhnZx(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.asInterface, 0));
        c55279xgu.isConnected(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.extraCallbackWithResult, this.OLrzqt));
        c55279xgu.AYXKKw(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.extraCallback, this.AEQbTJ));
        c55279xgu.valueOf(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.zLnOGN, this.AEQbTJ));
        c55279xgu.AhwBna(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.ICustomTabsCallback, this.AEQbTJ));
        c55279xgu.djBIcL(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.onNavigationEvent, this.AEQbTJ));
        c55279xgu.OLrzqt(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.hQkvHM, 0));
        c55279xgu.AEQbTJ(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.gezFCt, 0));
        c55279xgu.KWHzl(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.iFnJKK, 0));
        c55279xgu.copydefault(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ZpNRhN, 0));
        c55279xgu.EZpvd(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.QAQCdZ, 0));
        c55279xgu.fIwbmz(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.asBinder, 0));
        c55279xgu.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ICustomTabsCallbackStub, 0));
        c55279xgu.AhwBna(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.ICustomTabsCallbackDefault, 0));
        c55279xgu.DbNXlk(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.onPostMessage, this.OLrzqt));
        c55279xgu.fetchVPNInfo(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.onRelationshipValidationResult, 0));
        c55279xgu.values(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.onMessageChannelReady, copydefault(context, 48.0f)));
        c55279xgu.EZpvd((int) typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.dhOYXF, -1.0f));
        c55279xgu.AYXKKw(typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.arDRxL, 0.0f));
        c55279xgu.gEmmrt(typedArrayObtainStyledAttributes.getFloat(C52761wXj.PictureInPictureParams.OBzZra, 0.0f));
        c55279xgu.KWHzl(typedArrayObtainStyledAttributes.getDimensionPixelSize(C52761wXj.PictureInPictureParams.RYPzIz, 0));
        c55279xgu.AEQbTJ(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.ddauOi, -1));
        c55279xgu.OLrzqt(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.zNQIcI, -1));
        c55279xgu.copydefault(typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.OmPrLP, -1));
        c55279xgu.gEmmrt(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.hijVBL, 0));
        c55279xgu.AEQbTJ(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.sTbpmZ, false));
        c55279xgu.copydefault(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.getDefaultImpl, false));
        typedArrayObtainStyledAttributes.recycle();
        return c55279xgu;
    }

    public final int copydefault(android.content.Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
