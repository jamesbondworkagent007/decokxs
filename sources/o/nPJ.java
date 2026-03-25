package o;

import com.okinc.im.imui.glide.model.AspectOrientation;
import com.okinc.im.imui.utils.IMImageHelper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPJ {
    public static final nPJ OLrzqt = new nPJ();

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AspectOrientation.values().length];
            try {
                iArr[AspectOrientation.PORTRAIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AspectOrientation.SQUARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AspectOrientation.LANDSCAPE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    private nPJ() {
    }

    public final nPB EZpvd(@NotNull C34059nPx c34059nPx, int i, int i2) {
        kotlin.Pair pairOLrzqt;
        float fDjBIcL;
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        nPE npeCopydefault = copydefault(c34059nPx, i, i2);
        if (i <= 0 || i2 <= 0) {
            int i3 = ActionBar.copydefault[npeCopydefault.EZpvd().ordinal()];
            if (i3 == 1 || i3 == 2) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(c34059nPx.fetchVPNInfo()), java.lang.Integer.valueOf(c34059nPx.gEmmrt()));
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(c34059nPx.KWHzl()), java.lang.Integer.valueOf(c34059nPx.OLrzqt()));
            }
            return new nPB(((java.lang.Number) pairOLrzqt.component1()).intValue(), ((java.lang.Number) pairOLrzqt.component2()).intValue(), npeCopydefault.EZpvd());
        }
        int i4 = ActionBar.copydefault[npeCopydefault.EZpvd().ordinal()];
        if (i4 == 1 || i4 == 2) {
            fDjBIcL = c34059nPx.djBIcL();
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fDjBIcL = c34059nPx.EZpvd();
        }
        int iValues = IMImageHelper.OLrzqt.values();
        int iEZpvd = C56548yJl.EZpvd(yII.EZpvd(iValues * fDjBIcL), npeCopydefault.copydefault(), npeCopydefault.KWHzl());
        float f = iEZpvd;
        float fMin = (i2 / i) * f;
        java.lang.Float fAhwBna = c34059nPx.AhwBna();
        if (fAhwBna != null) {
            fMin = java.lang.Math.min(fMin, f * fAhwBna.floatValue());
        }
        int iEZpvd2 = C56548yJl.EZpvd(yII.EZpvd(fMin), npeCopydefault.AEQbTJ(), npeCopydefault.OLrzqt());
        pUU.EZpvd("ImageDimensionUtils", "calculateFinalDimensions: screenWidth: " + iValues + ", finalWidth: " + iEZpvd + ", finalHeight: " + iEZpvd2 + ", orientation: " + npeCopydefault.EZpvd() + ", imageWidth: " + i + ", imageHeight: " + i2 + ", constraints: " + c34059nPx);
        return new nPB(iEZpvd, iEZpvd2, npeCopydefault.EZpvd());
    }

    public final nPE copydefault(C34059nPx c34059nPx, int i, int i2) {
        AspectOrientation aspectOrientation;
        int iFetchVPNInfo;
        int iAYXKKw;
        int iGEmmrt;
        int iValueOf;
        if (java.lang.Math.abs(i2 - i) <= 1) {
            aspectOrientation = AspectOrientation.SQUARE;
        } else if (i2 > i) {
            aspectOrientation = AspectOrientation.PORTRAIT;
        } else {
            aspectOrientation = AspectOrientation.LANDSCAPE;
        }
        AspectOrientation aspectOrientation2 = aspectOrientation;
        int i3 = ActionBar.copydefault[aspectOrientation2.ordinal()];
        if (i3 == 1) {
            iFetchVPNInfo = c34059nPx.fetchVPNInfo();
            iAYXKKw = c34059nPx.AYXKKw();
            iGEmmrt = c34059nPx.gEmmrt();
            iValueOf = c34059nPx.valueOf();
        } else if (i3 == 2) {
            iFetchVPNInfo = c34059nPx.fetchVPNInfo();
            iAYXKKw = c34059nPx.AYXKKw();
            iGEmmrt = c34059nPx.fetchVPNInfo();
            iValueOf = c34059nPx.AYXKKw();
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iFetchVPNInfo = c34059nPx.KWHzl();
            iAYXKKw = c34059nPx.copydefault();
            iGEmmrt = c34059nPx.OLrzqt();
            iValueOf = c34059nPx.AEQbTJ();
        }
        return new nPE(iFetchVPNInfo, iAYXKKw, iGEmmrt, iValueOf, aspectOrientation2);
    }
}
