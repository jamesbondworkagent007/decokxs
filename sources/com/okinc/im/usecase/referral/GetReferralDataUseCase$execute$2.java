package com.okinc.im.usecase.referral;

import androidx.camera.video.AudioStats;
import com.okinc.im.imui.relationlist.model.ReferralData;
import com.okinc.im.imui.relationlist.model.RewardType;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.remote.ReferralTasks;
import com.okinc.okimcore.model.remote.TotalReward;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C35856oGf;
import o.C38305pTw;
import o.C38307pTy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44177sGd;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class GetReferralDataUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ReferralData>, Object> {
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $phonebookName;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C35856oGf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReferralDataUseCase$execute$2(C35856oGf c35856oGf, String str, String str2, Continuation<? super GetReferralDataUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = c35856oGf;
        this.$phonebookName = str;
        this.$phoneNumber = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetReferralDataUseCase$execute$2 getReferralDataUseCase$execute$2 = new GetReferralDataUseCase$execute$2(this.this$0, this.$phonebookName, this.$phoneNumber, continuation);
        getReferralDataUseCase$execute$2.L$0 = obj;
        return getReferralDataUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ReferralData> continuation) {
        return ((GetReferralDataUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        String str;
        Object objCopydefault;
        String str2;
        RewardType rewardTypeOLrzqt;
        TotalReward totalReward;
        String cryptoCode$default;
        String rewardValuationCurrency;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35856oGf c35856oGf = this.this$0;
                str = this.$phonebookName;
                String str3 = this.$phoneNumber;
                Result.Application application = Result.Companion;
                InterfaceC44177sGd interfaceC44177sGd = c35856oGf.AEQbTJ;
                this.L$0 = str;
                this.L$1 = str3;
                this.label = 1;
                objCopydefault = interfaceC44177sGd.copydefault(this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                str2 = str3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$1;
                String str4 = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = str4;
                objCopydefault = obj;
            }
            ReferralTasks referralTasks = (ReferralTasks) objCopydefault;
            RewardType.TaskDescription taskDescription = RewardType.Companion;
            TotalReward totalReward2 = referralTasks.getTotalReward();
            rewardTypeOLrzqt = taskDescription.OLrzqt(totalReward2 != null ? totalReward2.getRewardType() : null);
            totalReward = referralTasks.getTotalReward();
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if ((totalReward != null ? totalReward.isFiatRewardValuationCurrency() : null) == null || C33129mqd.AEQbTJ(totalReward.getRewardValuation()) == AudioStats.AUDIO_AMPLITUDE_NONE || (rewardValuationCurrency = totalReward.getRewardValuationCurrency()) == null || rewardValuationCurrency.length() == 0) {
            pUU.KWHzl("GetReferralDataUseCase", "rewardAmount will be set as null as not enough info for display");
        } else {
            if (Intrinsics.EZpvd(totalReward.isFiatRewardValuationCurrency(), C56443yFo.KWHzl(true))) {
                pUU.KWHzl("GetReferralDataUseCase", "rewardAmount is fiat");
                Double rewardValuation = totalReward.getRewardValuation();
                if (rewardValuation != null) {
                    cryptoCode$default = C38305pTw.formatFiatCode$default(rewardValuation, C33129mqd.gEmmrt(totalReward.getRewardValuationCurrency()), null, C38307pTy.Companion.AEQbTJ(8), null, null, null, 58, null);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new ReferralData(str, str2, cryptoCode$default, rewardTypeOLrzqt));
            } else {
                pUU.KWHzl("GetReferralDataUseCase", "rewardAmount is crypto");
                Double rewardValuation2 = totalReward.getRewardValuation();
                if (rewardValuation2 != null) {
                    cryptoCode$default = C38305pTw.formatCryptoCode$default(rewardValuation2, C33129mqd.gEmmrt(totalReward.getRewardValuationCurrency()), null, C38307pTy.Companion.AEQbTJ(8), null, null, null, 58, null);
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new ReferralData(str, str2, cryptoCode$default, rewardTypeOLrzqt));
            }
            String str5 = this.$phonebookName;
            String str6 = this.$phoneNumber;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                pUU.copydefault("GetReferralDataUseCase", "GetReferralData error: " + message);
                if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                    OKServerException oKServerException = (OKServerException) thM7380exceptionOrNullimpl;
                    if (oKServerException.getCode() == 4003 || oKServerException.getCode() == 4558) {
                        objM7377constructorimpl = new ReferralData(str5, str6, null, RewardType.NO_REWARD);
                    } else {
                        throw thM7380exceptionOrNullimpl;
                    }
                } else {
                    throw thM7380exceptionOrNullimpl;
                }
            }
            return (ReferralData) objM7377constructorimpl;
        }
        cryptoCode$default = null;
        objM7377constructorimpl = Result.m7377constructorimpl(new ReferralData(str, str2, cryptoCode$default, rewardTypeOLrzqt));
        String str52 = this.$phonebookName;
        String str62 = this.$phoneNumber;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return (ReferralData) objM7377constructorimpl;
    }
}
