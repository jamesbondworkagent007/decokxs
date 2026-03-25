package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.planet.domain.remote.dto.ActivityCardPublish;
import com.okinc.planet.domain.remote.dto.ActivityCardResponse;
import com.okinc.planet.domain.remote.dto.ContentTags;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import com.okinc.planet.domain.remote.dto.PublishRequest;
import com.okinc.planet.domain.remote.dto.PublishResponse;
import com.okinc.planet.domain.usecase.PlanetPublisherPublishUseCase$invoke$1;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46358tRj {
    public final InterfaceC7298ahG KWHzl;
    public final tQP copydefault;

    public C46358tRj(@NotNull tQP tqp, InterfaceC7298ahG interfaceC7298ahG) {
        Intrinsics.checkNotNullParameter(tqp, "");
        this.copydefault = tqp;
        this.KWHzl = interfaceC7298ahG;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #2 {all -> 0x00f4, blocks: (B:32:0x009c, B:34:0x00a4, B:36:0x00aa, B:37:0x00b8), top: B:69:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<ImageItem> list, @NotNull java.util.List<com.okinc.planet.domain.remote.dto.PluginData> list2, @NotNull ContentTags contentTags, ActivityCardPublish activityCardPublish, @NotNull PlanetPublisherChannelId planetPublisherChannelId, java.util.Map<java.lang.String, java.lang.String> map, @NotNull Continuation<? super AbstractC43419rot<PublishResponse, OKServerException>> continuation) throws java.lang.Throwable {
        PlanetPublisherPublishUseCase$invoke$1 planetPublisherPublishUseCase$invoke$1;
        java.lang.String str3;
        ActivityCardPublish activityCardPublish2;
        PlanetPublisherChannelId planetPublisherChannelId2;
        C46358tRj c46358tRj;
        java.lang.String str4;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof PlanetPublisherPublishUseCase$invoke$1) {
            planetPublisherPublishUseCase$invoke$1 = (PlanetPublisherPublishUseCase$invoke$1) continuation;
            int i = planetPublisherPublishUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherPublishUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherPublishUseCase$invoke$1 = new PlanetPublisherPublishUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = planetPublisherPublishUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherPublishUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            tQN tqn = tQN.EZpvd;
            java.lang.String strAEQbTJ = tqn.AEQbTJ();
            java.util.List<PublishImageItem> listOLrzqt = tqn.OLrzqt(list);
            java.lang.String value = planetPublisherChannelId.getValue();
            java.lang.String strAEQbTJ2 = xVH.AEQbTJ.AEQbTJ();
            if (strAEQbTJ2 == null) {
                strAEQbTJ2 = "";
            }
            PublishRequest publishRequest = new PublishRequest(strAEQbTJ, str, str2, listOLrzqt, list2, contentTags, activityCardPublish, value, map, strAEQbTJ2);
            try {
                tQP tqp = this.copydefault;
                planetPublisherPublishUseCase$invoke$1.L$0 = this;
                str3 = str2;
                try {
                    planetPublisherPublishUseCase$invoke$1.L$1 = str3;
                    activityCardPublish2 = activityCardPublish;
                } catch (java.lang.Throwable th) {
                    th = th;
                    activityCardPublish2 = activityCardPublish;
                    planetPublisherChannelId2 = planetPublisherChannelId;
                    c46358tRj = this;
                    str4 = str3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    planetPublisherPublishUseCase$invoke$1.L$2 = activityCardPublish2;
                    planetPublisherChannelId2 = planetPublisherChannelId;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    planetPublisherChannelId2 = planetPublisherChannelId;
                    c46358tRj = this;
                    str4 = str3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
                try {
                    planetPublisherPublishUseCase$invoke$1.L$3 = planetPublisherChannelId2;
                    planetPublisherPublishUseCase$invoke$1.label = 1;
                    objEZpvd = tqp.EZpvd(publishRequest, planetPublisherPublishUseCase$invoke$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    c46358tRj = this;
                    str4 = str3;
                    responseData = (ResponseData) objEZpvd;
                    if (responseData.getCode() != 0) {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c46358tRj = this;
                    str4 = str3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                    }
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                str3 = str2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PlanetPublisherChannelId planetPublisherChannelId3 = (PlanetPublisherChannelId) planetPublisherPublishUseCase$invoke$1.L$3;
            ActivityCardPublish activityCardPublish3 = (ActivityCardPublish) planetPublisherPublishUseCase$invoke$1.L$2;
            str4 = (java.lang.String) planetPublisherPublishUseCase$invoke$1.L$1;
            c46358tRj = (C46358tRj) planetPublisherPublishUseCase$invoke$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                planetPublisherChannelId2 = planetPublisherChannelId3;
                activityCardPublish2 = activityCardPublish3;
                try {
                    responseData = (ResponseData) objEZpvd;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                planetPublisherChannelId2 = planetPublisherChannelId3;
                activityCardPublish2 = activityCardPublish3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
                }
            }
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            PublishResponse publishResponse = (PublishResponse) ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            publishResponse.OLrzqt(str4);
            publishResponse.copydefault(planetPublisherChannelId2.getValue());
            if (publishResponse.EZpvd() == null && activityCardPublish2 != null) {
                publishResponse.OLrzqt(new ActivityCardResponse(activityCardPublish2.KWHzl(), activityCardPublish2.OLrzqt(), activityCardPublish2.gEmmrt(), activityCardPublish2.djBIcL(), activityCardPublish2.AEQbTJ(), activityCardPublish2.AYXKKw(), activityCardPublish2.valueOf(), activityCardPublish2.EZpvd(), activityCardPublish2.copydefault()));
            }
            c46358tRj.EZpvd(publishResponse);
            return new AbstractC43419rot.StateListAnimator(publishResponse);
        }
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            return new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void EZpvd(PublishResponse publishResponse) {
        try {
            InterfaceC7298ahG interfaceC7298ahG = this.KWHzl;
            if (interfaceC7298ahG != null) {
                Json.Default r1 = Json.Default;
                r1.getSerializersModule();
                interfaceC7298ahG.AEQbTJ("Planet_Publish_Post_Success_Notification", null, C56423yEv.EZpvd(C56390yDp.OLrzqt("data", r1.encodeToString(PublishResponse.Companion.serializer(), publishResponse))));
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
