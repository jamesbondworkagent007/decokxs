package o;

import com.okinc.business.dexlogic.bean.track.TrackButtonName;

/* JADX INFO: renamed from: o.hen, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22409hen {
    public static final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt(TrackButtonName.KB_QUICK_LOW.getButtonName(), TrackButtonName.KB_QUICK_MID.getButtonName(), TrackButtonName.KB_QUICK_HIGH.getButtonName());

    public static final java.lang.String KWHzl(int i) {
        java.util.List<java.lang.String> list = OLrzqt;
        return (i < 0 || i >= list.size()) ? TrackButtonName.KB_QUICK_FULL.getButtonName() : list.get(i);
    }
}
