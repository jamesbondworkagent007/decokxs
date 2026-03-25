package o;

import com.okinc.business.dexlogic.bean.track.TrackButtonName;

/* JADX INFO: renamed from: o.los, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31167los {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "custom" : "high" : "mid" : "low";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "custom" : "high" : "mid" : "low";
    }

    public static final java.lang.String EZpvd(int i) {
        if (i == 0) {
            return TrackButtonName.QTY_LOW.getButtonName();
        }
        if (i == 1) {
            return TrackButtonName.QTY_MID.getButtonName();
        }
        if (i != 2) {
            return i != 3 ? "" : TrackButtonName.QTY_CUSTOM.getButtonName();
        }
        return TrackButtonName.QTY_HIGH.getButtonName();
    }
}
