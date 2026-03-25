package com.okinc.im.usecase.banner;

import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C35341ntW;
import o.C35755oCm;
import o.C36565odP;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveVerifyIdentityBannerUseCase$execute$1 extends SuspendLambda implements yHT<OKConversation, RelationInfo, GroupInfo, Continuation<? super C36565odP>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ IMPageType $pageType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ C35755oCm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveVerifyIdentityBannerUseCase$execute$1(C35755oCm c35755oCm, IMPageType iMPageType, String str, Continuation<? super ObserveVerifyIdentityBannerUseCase$execute$1> continuation) {
        super(4, continuation);
        this.this$0 = c35755oCm;
        this.$pageType = iMPageType;
        this.$channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(OKConversation oKConversation, RelationInfo relationInfo, GroupInfo groupInfo, Continuation<? super C36565odP> continuation) {
        ObserveVerifyIdentityBannerUseCase$execute$1 observeVerifyIdentityBannerUseCase$execute$1 = new ObserveVerifyIdentityBannerUseCase$execute$1(this.this$0, this.$pageType, this.$channelId, continuation);
        observeVerifyIdentityBannerUseCase$execute$1.L$0 = oKConversation;
        observeVerifyIdentityBannerUseCase$execute$1.L$1 = relationInfo;
        observeVerifyIdentityBannerUseCase$execute$1.L$2 = groupInfo;
        return observeVerifyIdentityBannerUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            OKConversation oKConversation = (OKConversation) this.L$0;
            RelationInfo relationInfo = (RelationInfo) this.L$1;
            GroupInfo groupInfo = (GroupInfo) this.L$2;
            C35341ntW c35341ntW = C35341ntW.EZpvd;
            boolean zKWHzl = c35341ntW.KWHzl(oKConversation);
            boolean zOLrzqt = c35341ntW.OLrzqt(oKConversation);
            boolean zFARcdN = this.this$0.EZpvd.KWHzl(this.$pageType).fARcdN();
            boolean zEZpvd = true;
            if (zKWHzl) {
                zEZpvd = relationInfo != null ? Intrinsics.EZpvd(relationInfo.getShowKycBanner(), C56443yFo.KWHzl(true)) : false;
            } else if (!zOLrzqt || groupInfo == null || groupInfo.isAllowSendMessageKyc()) {
            }
            pUU.KWHzl("ObserveVerifyIdentityBannerUseCase", "[" + this.$channelId + "]update: isPrivateChat:" + zKWHzl + ", isAllowVerifyIdentityBannerFromPageConfig:" + zFARcdN + ", isShowKycBanner:" + zEZpvd);
            C36565odP c36565odP = C36565odP.KWHzl;
            if (zFARcdN && zEZpvd) {
                return c36565odP;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
