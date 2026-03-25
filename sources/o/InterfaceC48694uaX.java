package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.referral.bean.ReferralFooterInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uaX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC48694uaX extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull android.app.Activity activity, @NotNull android.os.Bundle bundle);

    void EZpvd(@NotNull android.content.Context context, int i, int i2);

    void KWHzl(@NotNull android.content.Context context, java.lang.Integer num);

    ReferralFooterInfo OLrzqt();

    AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> OLrzqt(@NotNull java.lang.String str, java.lang.String str2);

    void OLrzqt(@NotNull android.app.Activity activity);

    void OLrzqt(@NotNull android.content.Context context);

    /* JADX INFO: renamed from: o.uaX$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void jumpToLiteMysteryBoxesList$default(InterfaceC48694uaX interfaceC48694uaX, android.content.Context context, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToLiteMysteryBoxesList");
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            interfaceC48694uaX.KWHzl(context, num);
        }

        public static /* synthetic */ AbstractC58185ywX checkChannelId$default(InterfaceC48694uaX interfaceC48694uaX, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkChannelId");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC48694uaX.OLrzqt(str, str2);
        }

        public static /* synthetic */ void gotoRewardCenter$default(InterfaceC48694uaX interfaceC48694uaX, android.content.Context context, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoRewardCenter");
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            interfaceC48694uaX.EZpvd(context, i, i2);
        }
    }
}
