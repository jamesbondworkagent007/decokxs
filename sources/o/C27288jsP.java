package o;

import com.okinc.business.invest_biz.data.bean.InvestAssetPositionType;
import com.okinc.business.invest_biz.data.contants.PositionStatus;
import o.C25493ixk;

/* JADX INFO: renamed from: o.jsP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27288jsP {
    public static final C27288jsP KWHzl = new C27288jsP();

    /* JADX INFO: renamed from: o.jsP$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestAssetPositionType.values().length];
            try {
                iArr[InvestAssetPositionType.UNI_V3_POSITION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestAssetPositionType.EXPIRY_POSITION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C27288jsP() {
    }

    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> AEQbTJ(InvestAssetPositionType investAssetPositionType, PositionStatus positionStatus) {
        int i = investAssetPositionType == null ? -1 : ActionBar.EZpvd[investAssetPositionType.ordinal()];
        if (i == 1) {
            if (positionStatus == PositionStatus.Active) {
                return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.RihMUf), 7);
            }
            return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.resume), 11);
        }
        if (i == 2) {
            if (positionStatus == PositionStatus.Active) {
                return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.hCLrkq), 7);
            }
            return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C25493ixk.FragmentManager.DGOPHZDGOPHZ), 11);
        }
        return C56390yDp.OLrzqt(null, null);
    }
}
