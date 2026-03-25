package o;

import com.okinc.business.web3pay.lib.features.campaign.CampaignRepositoryImpl$getCampaignGuide$1;
import com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuide;
import com.okinc.business.web3pay.lib.features.campaign.model.CampaignGuideResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class C31241lqM {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC31240lqL EZpvd;

    /* JADX INFO: renamed from: o.lqM$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lqM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Result<CampaignGuide>> continuation) {
        CampaignRepositoryImpl$getCampaignGuide$1 campaignRepositoryImpl$getCampaignGuide$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof CampaignRepositoryImpl$getCampaignGuide$1) {
            campaignRepositoryImpl$getCampaignGuide$1 = (CampaignRepositoryImpl$getCampaignGuide$1) continuation;
            int i = campaignRepositoryImpl$getCampaignGuide$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                campaignRepositoryImpl$getCampaignGuide$1.label = i - Integer.MIN_VALUE;
            } else {
                campaignRepositoryImpl$getCampaignGuide$1 = new CampaignRepositoryImpl$getCampaignGuide$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = campaignRepositoryImpl$getCampaignGuide$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = campaignRepositoryImpl$getCampaignGuide$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC31240lqL interfaceC31240lqL = this.EZpvd;
                campaignRepositoryImpl$getCampaignGuide$1.label = 1;
                objOLrzqt = interfaceC31240lqL.OLrzqt(campaignRepositoryImpl$getCampaignGuide$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
            }
            ResponseData responseData = (ResponseData) objOLrzqt;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C31237lqI.EZpvd((CampaignGuideResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl()));
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) actionBar;
        pUU.copydefault("CampaignRepository", "getCampaignGuide() | " + actionBar2.KWHzl());
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) actionBar2.KWHzl()));
    }
}
