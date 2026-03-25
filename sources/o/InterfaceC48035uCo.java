package o;

import com.okinc.unify_trade.biz.BannerOrderDetails;

/* JADX INFO: renamed from: o.uCo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48035uCo {
    void setData(BannerOrderDetails bannerOrderDetails);

    /* JADX INFO: renamed from: o.uCo$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public static /* synthetic */ void setData$default(InterfaceC48035uCo interfaceC48035uCo, BannerOrderDetails bannerOrderDetails, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
            }
            if ((i & 1) != 0) {
                bannerOrderDetails = null;
            }
            interfaceC48035uCo.setData(bannerOrderDetails);
        }
    }
}
