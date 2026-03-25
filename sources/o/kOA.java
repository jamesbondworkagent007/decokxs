package o;

import com.okinc.business.redbag.bean.CoverInfo;
import com.okinc.business.redbag.bean.GiftInfo;
import com.okinc.business.redbag.bean.GiftSendInfo;
import com.okinc.business.redbag.bean.MsgType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public interface kOA extends InterfaceC43217rlC {
    void OLrzqt(@NotNull GiftInfo giftInfo, @NotNull android.app.Activity activity, CoverInfo coverInfo, MsgType msgType);

    void copydefault(@NotNull GiftSendInfo giftSendInfo, @NotNull android.app.Activity activity);

    public static final class TaskDescription {
        public static /* synthetic */ void claimGift$default(kOA koa, GiftInfo giftInfo, android.app.Activity activity, CoverInfo coverInfo, MsgType msgType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: claimGift");
            }
            if ((i & 4) != 0) {
                coverInfo = null;
            }
            if ((i & 8) != 0) {
                msgType = MsgType.IM_CARD;
            }
            koa.OLrzqt(giftInfo, activity, coverInfo, msgType);
        }
    }
}
