package o;

import com.okinc.business.market.features.meme.preview.domain.model.TwitterPreviewData;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterTranslateResponse;
import com.okinc.business.market.features.meme.preview.domain.model.TwitterV2Response;
import com.okinc.business.market.features.meme.preview.domain.repository.TwitterPreviewRepositoryImpl$getTwitterPreview$$inlined$getApiResult$1;
import com.okinc.business.market.features.meme.preview.domain.repository.TwitterPreviewRepositoryImpl$getTwitterPreview$1;
import com.okinc.business.market.features.meme.preview.domain.repository.TwitterPreviewRepositoryImpl$getTwitterPreviewV2$$inlined$getApiResult$1;
import com.okinc.business.market.features.meme.preview.domain.repository.TwitterPreviewRepositoryImpl$getTwitterPreviewV2$1;
import com.okinc.business.market.features.meme.preview.domain.repository.TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1;
import com.okinc.business.market.features.meme.preview.domain.repository.TwitterPreviewRepositoryImpl$translateTwitter$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28743kgY implements InterfaceC28744kgZ {
    public final InterfaceC27595jyE EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C28743kgY(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC27595jyE;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28744kgZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TwitterPreviewData, OKServerException>> continuation) throws java.lang.Throwable {
        TwitterPreviewRepositoryImpl$getTwitterPreview$1 twitterPreviewRepositoryImpl$getTwitterPreview$1;
        if (continuation instanceof TwitterPreviewRepositoryImpl$getTwitterPreview$1) {
            twitterPreviewRepositoryImpl$getTwitterPreview$1 = (TwitterPreviewRepositoryImpl$getTwitterPreview$1) continuation;
            int i = twitterPreviewRepositoryImpl$getTwitterPreview$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twitterPreviewRepositoryImpl$getTwitterPreview$1.label = i - Integer.MIN_VALUE;
            } else {
                twitterPreviewRepositoryImpl$getTwitterPreview$1 = new TwitterPreviewRepositoryImpl$getTwitterPreview$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = twitterPreviewRepositoryImpl$getTwitterPreview$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = twitterPreviewRepositoryImpl$getTwitterPreview$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                TwitterPreviewRepositoryImpl$getTwitterPreview$$inlined$getApiResult$1 twitterPreviewRepositoryImpl$getTwitterPreview$$inlined$getApiResult$1 = new TwitterPreviewRepositoryImpl$getTwitterPreview$$inlined$getApiResult$1(null, this, str, str2);
                twitterPreviewRepositoryImpl$getTwitterPreview$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, twitterPreviewRepositoryImpl$getTwitterPreview$$inlined$getApiResult$1, twitterPreviewRepositoryImpl$getTwitterPreview$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28744kgZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<TwitterV2Response, OKServerException>> continuation) throws java.lang.Throwable {
        TwitterPreviewRepositoryImpl$getTwitterPreviewV2$1 twitterPreviewRepositoryImpl$getTwitterPreviewV2$1;
        if (continuation instanceof TwitterPreviewRepositoryImpl$getTwitterPreviewV2$1) {
            twitterPreviewRepositoryImpl$getTwitterPreviewV2$1 = (TwitterPreviewRepositoryImpl$getTwitterPreviewV2$1) continuation;
            int i = twitterPreviewRepositoryImpl$getTwitterPreviewV2$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                twitterPreviewRepositoryImpl$getTwitterPreviewV2$1.label = i - Integer.MIN_VALUE;
            } else {
                twitterPreviewRepositoryImpl$getTwitterPreviewV2$1 = new TwitterPreviewRepositoryImpl$getTwitterPreviewV2$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = twitterPreviewRepositoryImpl$getTwitterPreviewV2$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = twitterPreviewRepositoryImpl$getTwitterPreviewV2$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                TwitterPreviewRepositoryImpl$getTwitterPreviewV2$$inlined$getApiResult$1 twitterPreviewRepositoryImpl$getTwitterPreviewV2$$inlined$getApiResult$1 = new TwitterPreviewRepositoryImpl$getTwitterPreviewV2$$inlined$getApiResult$1(null, this, str, str2);
                twitterPreviewRepositoryImpl$getTwitterPreviewV2$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, twitterPreviewRepositoryImpl$getTwitterPreviewV2$$inlined$getApiResult$1, twitterPreviewRepositoryImpl$getTwitterPreviewV2$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28744kgZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.util.List<java.lang.String> list, int i, @NotNull Continuation<? super AbstractC43419rot<TwitterTranslateResponse, OKServerException>> continuation) throws java.lang.Throwable {
        TwitterPreviewRepositoryImpl$translateTwitter$1 twitterPreviewRepositoryImpl$translateTwitter$1;
        if (continuation instanceof TwitterPreviewRepositoryImpl$translateTwitter$1) {
            twitterPreviewRepositoryImpl$translateTwitter$1 = (TwitterPreviewRepositoryImpl$translateTwitter$1) continuation;
            int i2 = twitterPreviewRepositoryImpl$translateTwitter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                twitterPreviewRepositoryImpl$translateTwitter$1.label = i2 - Integer.MIN_VALUE;
            } else {
                twitterPreviewRepositoryImpl$translateTwitter$1 = new TwitterPreviewRepositoryImpl$translateTwitter$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = twitterPreviewRepositoryImpl$translateTwitter$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = twitterPreviewRepositoryImpl$translateTwitter$1.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1 twitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1 = new TwitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1(null, this, str, list, i);
                twitterPreviewRepositoryImpl$translateTwitter$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, twitterPreviewRepositoryImpl$translateTwitter$$inlined$getApiResult$1, twitterPreviewRepositoryImpl$translateTwitter$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, C43401rob.EZpvd(responseData), null, 11, null));
        } catch (java.lang.Exception e) {
            return new AbstractC43419rot.ActionBar(new OKServerException(0, null, null, e, 7, null));
        }
    }
}
