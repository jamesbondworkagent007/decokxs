package o;

import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aVi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6774aVi {
    public static final C6774aVi AEQbTJ = new C6774aVi();
    public static final DetectionInfoBean OLrzqt = new DetectionInfoBean();
    public static final int KWHzl = 8;

    private C6774aVi() {
    }

    public final DetectionInfoBean copydefault() {
        java.lang.Integer num = SPUtils.getInt("SP_KEY_DETECTION_ENVIRONMENT_DATA", 0, "detectionEnvironment");
        if (num.intValue() < 0) {
            OLrzqt.initByFlag(0);
        } else {
            DetectionInfoBean detectionInfoBean = OLrzqt;
            Intrinsics.copydefault(num);
            detectionInfoBean.initByFlag(num.intValue());
        }
        return OLrzqt;
    }

    public final int EZpvd() {
        java.lang.Integer num = SPUtils.getInt("SP_KEY_DETECTION_ENVIRONMENT_DATA", 0, "detectionEnvironment");
        Intrinsics.copydefault(num);
        return num.intValue();
    }
}
