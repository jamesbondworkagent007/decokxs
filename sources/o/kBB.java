package o;

import com.okinc.business.market.features.vibes.domain.VibesKolData;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.ui.VibesKolUiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kBB {

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[VibesSortType.values().length];
            try {
                iArr[VibesSortType.MENTIONS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[VibesSortType.ENGAGEMENTS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[VibesSortType.IMPRESSIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public static final VibesKolUiModel copydefault(@NotNull VibesKolData vibesKolData, @NotNull VibesSortType vibesSortType) {
        java.lang.String strValues;
        java.lang.String strFetchVPNInfo;
        Intrinsics.checkNotNullParameter(vibesKolData, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        java.lang.String strAEQbTJ = vibesKolData.AEQbTJ();
        java.lang.String strIsConnected = vibesKolData.isConnected();
        java.lang.String strDbNXlk = vibesKolData.DbNXlk();
        java.lang.String strValueOf = vibesKolData.valueOf();
        java.lang.String strAhwBna = vibesKolData.AhwBna();
        int[] iArr = Application.AEQbTJ;
        int i = iArr[vibesSortType.ordinal()];
        if (i == 1) {
            strValues = vibesKolData.values();
        } else if (i != 2 && i == 3) {
            strValues = vibesKolData.djBIcL();
        } else {
            strValues = vibesKolData.KWHzl();
        }
        int i2 = iArr[vibesSortType.ordinal()];
        if (i2 == 1) {
            strFetchVPNInfo = vibesKolData.fetchVPNInfo();
        } else if (i2 != 2 && i2 == 3) {
            strFetchVPNInfo = vibesKolData.AYXKKw();
        } else {
            strFetchVPNInfo = vibesKolData.copydefault();
        }
        return new VibesKolUiModel(strAEQbTJ, strIsConnected, strDbNXlk, strValueOf, strAhwBna, strValues, strFetchVPNInfo, vibesKolData.gEmmrt(), vibesKolData.OLrzqt(), vibesKolData.EZpvd(), false, 1024, null);
    }

    public static final kBC EZpvd(@NotNull VibesKolData vibesKolData, int i, @NotNull VibesSortType vibesSortType) {
        java.lang.String strValues;
        java.lang.String strFetchVPNInfo;
        Intrinsics.checkNotNullParameter(vibesKolData, "");
        Intrinsics.checkNotNullParameter(vibesSortType, "");
        java.lang.String strAEQbTJ = vibesKolData.AEQbTJ();
        java.lang.String strIsConnected = vibesKolData.isConnected();
        java.lang.String strDbNXlk = vibesKolData.DbNXlk();
        java.lang.String strValueOf = vibesKolData.valueOf();
        java.lang.String strGEmmrt = vibesKolData.gEmmrt();
        int[] iArr = Application.AEQbTJ;
        int i2 = iArr[vibesSortType.ordinal()];
        if (i2 == 1) {
            strValues = vibesKolData.values();
        } else if (i2 != 2 && i2 == 3) {
            strValues = vibesKolData.djBIcL();
        } else {
            strValues = vibesKolData.KWHzl();
        }
        int iAhwBna = C33129mqd.AhwBna(strValues);
        int i3 = iArr[vibesSortType.ordinal()];
        if (i3 == 1) {
            strFetchVPNInfo = vibesKolData.fetchVPNInfo();
        } else if (i3 != 2 && i3 == 3) {
            strFetchVPNInfo = vibesKolData.AYXKKw();
        } else {
            strFetchVPNInfo = vibesKolData.copydefault();
        }
        return new kBC(strAEQbTJ, strIsConnected, iAhwBna, java.lang.String.valueOf(i), strFetchVPNInfo, strValueOf, strDbNXlk, strGEmmrt);
    }
}
