package com.okinc.okimcore.feature.share.repository;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.share.repository.remote.IMShareService;
import com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData;
import com.okinc.okimcore.model.remote.ChannelResult;
import com.okinc.okimcore.model.remote.ShareContentRequest;
import com.okinc.okimcore.model.remote.ShareContentResponse;
import com.okinc.okimcore.model.remote.UserResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C44382sNt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;
import o.sQM;
import o.sQV;
import o.sQX;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareContentRepository$sendContent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sQV>, Object> {
    final /* synthetic */ sQX $contentPayload;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C44382sNt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareContentRepository$sendContent$2(C44382sNt c44382sNt, sQX sqx, Continuation<? super ShareContentRepository$sendContent$2> continuation) {
        super(2, continuation);
        this.this$0 = c44382sNt;
        this.$contentPayload = sqx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShareContentRepository$sendContent$2 shareContentRepository$sendContent$2 = new ShareContentRepository$sendContent$2(this.this$0, this.$contentPayload, continuation);
        shareContentRepository$sendContent$2.L$0 = obj;
        return shareContentRepository$sendContent$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sQV> continuation) {
        return ((ShareContentRepository$sendContent$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        AbstractC43419rot stateListAnimator;
        Object objOLrzqt;
        Object objShareContent;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                C44382sNt c44382sNt = this.this$0;
                String strGEmmrt = this.$contentPayload.AEQbTJ().gEmmrt();
                String strAYXKKw = this.$contentPayload.AEQbTJ().AYXKKw();
                this.L$0 = coroutineScope;
                this.label = 1;
                objOLrzqt = c44382sNt.OLrzqt(strGEmmrt, strAYXKKw, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objShareContent = obj;
                responseData = (ResponseData) objShareContent;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                    if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                    }
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    stateListAnimator = actionBar;
                    if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
                        pUU.EZpvd("ShareContentRepo", "sendContent: Share completed successfully");
                        AbstractC43419rot.StateListAnimator stateListAnimator2 = (AbstractC43419rot.StateListAnimator) stateListAnimator;
                        List<ChannelResult> channelResults = ((ShareContentResponse) stateListAnimator2.KWHzl()).getChannelResults();
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(channelResults, 10));
                        Iterator<T> it = channelResults.iterator();
                        while (it.hasNext()) {
                            arrayList.add(sQM.OLrzqt((ChannelResult) it.next()));
                        }
                        List<UserResult> usersUidResults = ((ShareContentResponse) stateListAnimator2.KWHzl()).getUsersUidResults();
                        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(usersUidResults, 10));
                        Iterator<T> it2 = usersUidResults.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(sQM.KWHzl((UserResult) it2.next()));
                        }
                        return new sQV.Application(arrayList, arrayList2);
                    }
                    if (!(stateListAnimator instanceof AbstractC43419rot.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC43419rot.ActionBar actionBar2 = (AbstractC43419rot.ActionBar) stateListAnimator;
                    pUU.copydefault("ShareContentRepo", "sendContent: Share failed - " + actionBar2.KWHzl());
                    return new sQV.Activity((Throwable) actionBar2.KWHzl());
                }
            }
            ImageMessageData imageMessageData = (ImageMessageData) objOLrzqt;
            pUU.EZpvd("ShareContentRepo", "sendContent: Image upload completed, fileId: " + (imageMessageData != null ? imageMessageData.getFileId() : null));
            sQX sqx = this.$contentPayload;
            C44382sNt c44382sNt2 = this.this$0;
            ShareContentRequest shareContentRequest = new ShareContentRequest(sqx.AEQbTJ().KWHzl(), sqx.KWHzl(), sqx.EZpvd(), sqx.AEQbTJ().isConnected(), sqx.AEQbTJ().OLrzqt(), sqx.AEQbTJ().EZpvd(), sqx.AEQbTJ().valueOf(), imageMessageData, sqx.AEQbTJ().AhwBna(), sqx.AEQbTJ().copydefault(), sqx.AEQbTJ().AEQbTJ(), sqx.AEQbTJ().djBIcL());
            IMShareService iMShareService = c44382sNt2.copydefault;
            this.L$0 = null;
            this.label = 2;
            objShareContent = iMShareService.shareContent(shareContentRequest, "", this);
            if (objShareContent == objCopydefault) {
                return objCopydefault;
            }
            responseData = (ResponseData) objShareContent;
            if (responseData.getCode() != 0) {
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            stateListAnimator = actionBar;
            if (stateListAnimator instanceof AbstractC43419rot.StateListAnimator) {
            }
        } catch (Throwable th2) {
            pUU.AEQbTJ("ShareContentRepo", "sendContent: Image upload failed with exception", th2);
            return new sQV.Activity(th2);
        }
    }
}
