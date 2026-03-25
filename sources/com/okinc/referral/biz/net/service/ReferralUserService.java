package com.okinc.referral.biz.net.service;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.referral.bean.InviterInfo;
import com.okinc.referral.bean.ReferralRewardParam;
import com.okinc.referral.bean.ReferralUserInfo;
import com.okinc.referral.biz.net.bean.ShareFooterInfoResp;
import java.util.HashMap;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes11.dex */
public interface ReferralUserService {
    public static final TaskDescription Companion = TaskDescription.OLrzqt;

    @GET("/priapi/v3/growth/mobile/support/common/invite-channel-type")
    AbstractC58185ywX<ResponseData<HashMap<String, String>>> checkChannelId(@NotNull @Query(RemoteMessageConst.Notification.CHANNEL_ID) String str, @Header("Subdomain-Strategy") String str2);

    @GET("/priapi/v3/growth/mobile/blindbox/inviter-info")
    AbstractC58185ywX<ResponseData<InviterInfo>> getInviterInfo(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v3/growth/mobile/onboarding/content/placeholders")
    AbstractC58185ywX<ResponseData<ReferralRewardParam>> getReferralRewardData();

    @GET("/priapi/v3/growth/mobile/onboarding/user-info")
    AbstractC58185ywX<ResponseData<ReferralUserInfo>> getReferralUserInfo(@Header("Cache-Strategy") @NotNull String str, @Header("Cache-Expire") int i);

    @GET("/priapi/v3/growth/mobile/support/common/sharing-footer-info")
    AbstractC58185ywX<ResponseData<ShareFooterInfoResp>> getShareFooterInfo();

    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }

        public final ReferralUserService EZpvd() {
            return (ReferralUserService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(ReferralUserService.class));
        }
    }
}
