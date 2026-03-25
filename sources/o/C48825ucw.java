package o;

import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.referral.bean.ReferralFooterInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48825ucw {
    public static final C48825ucw KWHzl = new C48825ucw();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.uct
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C48825ucw.EZpvd();
        }
    });
    public static final int AEQbTJ = 8;

    private C48825ucw() {
    }

    public static final InterfaceC47278tmy EZpvd() {
        return (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    }

    public final InterfaceC47278tmy AEQbTJ() {
        return (InterfaceC47278tmy) EZpvd.getValue();
    }

    public final ReferralFooterInfo KWHzl() {
        ReferralFooterInfo referralFooterInfo;
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String string = SPUtils.getString(copydefault(), null, "sp_referral_footer");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
                C33489mxS c33489mxS = C33489mxS.KWHzl;
                KSerializer<ReferralFooterInfo> kSerializerSerializer = ReferralFooterInfo.Companion.serializer();
                Intrinsics.copydefault((java.lang.Object) string);
                referralFooterInfo = (ReferralFooterInfo) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, string);
            } else {
                referralFooterInfo = null;
            }
            pUU.EZpvd("InviteFriendsInfoCacheHelper", "getLocalShareFooterInfo->costTime: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
            return referralFooterInfo;
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pUU.copydefault("InviteFriendsInfoCacheHelper", "getLocalShareFooterInfo,error=" + message);
            return null;
        }
    }

    public final void KWHzl(@NotNull ReferralFooterInfo referralFooterInfo) {
        Intrinsics.checkNotNullParameter(referralFooterInfo, "");
        try {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            SPUtils.put(copydefault(), C33489mxS.KWHzl.KWHzl(ReferralFooterInfo.Companion.serializer(), referralFooterInfo), "sp_referral_footer");
            pUU.EZpvd("InviteFriendsInfoCacheHelper", "saveLocalShareFooterInfo->costTime: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            pUU.copydefault("InviteFriendsInfoCacheHelper", "saveLocalShareFooterInfo,error=" + (message != null ? message : ""));
        }
    }

    public final java.lang.String copydefault() {
        java.lang.String loginName;
        if (AEQbTJ().values()) {
            User userOLrzqt = AEQbTJ().OLrzqt();
            if (userOLrzqt == null || (loginName = userOLrzqt.getLoginName()) == null) {
                loginName = "";
            }
        } else {
            loginName = "notLogin";
        }
        java.lang.String str = "key_share_footer_info_" + loginName + "_" + pSC.AEQbTJ.KWHzl();
        pUU.EZpvd("InviteFriendsInfoCacheHelper", "getSpKey=" + str);
        return str;
    }
}
