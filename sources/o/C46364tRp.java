package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.domain.remote.dto.ActivityCardPublish;
import com.okinc.planet.domain.remote.dto.ContentTags;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import com.okinc.planet.domain.remote.dto.PublishRequest;
import com.okinc.planet.domain.remote.dto.SaveDraftResponse;
import com.okinc.planet.domain.usecase.PlanetPublisherSaveDraftUseCase$invoke$1;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46364tRp {
    public final tQP copydefault;

    public C46364tRp(@NotNull tQP tqp) {
        Intrinsics.checkNotNullParameter(tqp, "");
        this.copydefault = tqp;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<ImageItem> list, @NotNull java.util.List<com.okinc.planet.domain.remote.dto.PluginData> list2, @NotNull ContentTags contentTags, ActivityCardPublish activityCardPublish, @NotNull PlanetPublisherChannelId planetPublisherChannelId, java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43419rot<SaveDraftResponse, OKServerException>> continuation) throws java.lang.Throwable {
        PlanetPublisherSaveDraftUseCase$invoke$1 planetPublisherSaveDraftUseCase$invoke$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof PlanetPublisherSaveDraftUseCase$invoke$1) {
            planetPublisherSaveDraftUseCase$invoke$1 = (PlanetPublisherSaveDraftUseCase$invoke$1) continuation;
            int i = planetPublisherSaveDraftUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherSaveDraftUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherSaveDraftUseCase$invoke$1 = new PlanetPublisherSaveDraftUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = planetPublisherSaveDraftUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = planetPublisherSaveDraftUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                tQN tqn = tQN.EZpvd;
                java.lang.String strAEQbTJ = tqn.AEQbTJ();
                java.util.List<PublishImageItem> listOLrzqt = tqn.OLrzqt(list);
                java.lang.String value = planetPublisherChannelId.getValue();
                java.lang.String strAEQbTJ2 = xVH.AEQbTJ.AEQbTJ();
                if (strAEQbTJ2 == null) {
                    strAEQbTJ2 = "";
                }
                PublishRequest publishRequest = new PublishRequest(strAEQbTJ, str, str2, listOLrzqt, list2, contentTags, activityCardPublish, value, map, strAEQbTJ2);
                tQP tqp = this.copydefault;
                planetPublisherSaveDraftUseCase$invoke$1.label = 1;
                objCopydefault = tqp.copydefault(publishRequest, (Continuation<? super ResponseData<SaveDraftResponse>>) planetPublisherSaveDraftUseCase$invoke$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
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
            return new AbstractC43419rot.StateListAnimator((SaveDraftResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl());
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }
}
