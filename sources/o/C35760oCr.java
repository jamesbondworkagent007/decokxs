package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.usecase.broadcastmessage.BroadcastMessageUseCase$execute$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35760oCr {
    public final C35848oFy KWHzl;
    public final sKH OLrzqt;

    @yCM
    public C35760oCr(@NotNull C35848oFy c35848oFy, @NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(c35848oFy, "");
        Intrinsics.checkNotNullParameter(skh, "");
        this.KWHzl = c35848oFy;
        this.OLrzqt = skh;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003e, B:35:0x00a4, B:37:0x00ac, B:38:0x00b6), top: B:53:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:13:0x003e, B:35:0x00a4, B:37:0x00ac, B:38:0x00b6), top: B:53:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull OKMessage oKMessage, SendMessageRequestParam sendMessageRequestParam, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        BroadcastMessageUseCase$execute$1 broadcastMessageUseCase$execute$1;
        long j;
        OKMessageContent content;
        OKMessage oKMessage2;
        C35760oCr c35760oCr;
        WSSendMessageDetailData wSSendMessageDetailData;
        java.lang.Object objEZpvd;
        WSSendMessageDetailData wSSendMessageDetailData2;
        OKMessage oKMessage3;
        AbstractC43419rot actionBar;
        OKMessageContent oKMessageContent$default;
        ResponseData responseData;
        if (continuation instanceof BroadcastMessageUseCase$execute$1) {
            broadcastMessageUseCase$execute$1 = (BroadcastMessageUseCase$execute$1) continuation;
            int i = broadcastMessageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                broadcastMessageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                broadcastMessageUseCase$execute$1 = new BroadcastMessageUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = broadcastMessageUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = broadcastMessageUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            j = java.lang.Long.parseLong(oKMessage.getTargetId());
            if (sendMessageRequestParam != null) {
                content = this.KWHzl.EZpvd(sendMessageRequestParam);
            } else {
                content = oKMessage.getContent();
            }
            if (content == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            sKH skh = this.OLrzqt;
            broadcastMessageUseCase$execute$1.L$0 = this;
            oKMessage2 = oKMessage;
            broadcastMessageUseCase$execute$1.L$1 = oKMessage2;
            broadcastMessageUseCase$execute$1.J$0 = j;
            broadcastMessageUseCase$execute$1.label = 1;
            objOLrzqt = skh.OLrzqt(j, content, broadcastMessageUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c35760oCr = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wSSendMessageDetailData2 = (WSSendMessageDetailData) broadcastMessageUseCase$execute$1.L$1;
                oKMessage3 = (OKMessage) broadcastMessageUseCase$execute$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    responseData = (ResponseData) objOLrzqt;
                    if (responseData.getCode() != 0) {
                        actionBar = new AbstractC43419rot.StateListAnimator(responseData.getData());
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    oKMessage2 = oKMessage3;
                    wSSendMessageDetailData = wSSendMessageDetailData2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    wSSendMessageDetailData2 = wSSendMessageDetailData;
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    oKMessage3 = oKMessage2;
                }
                actionBar.AEQbTJ();
                oKMessageContent$default = C44169sFw.toOKMessageContent$default(sQS.toInHouseIMMessageEntity$default(wSSendMessageDetailData2, 0, 1, null), false, 1, null);
                if (oKMessageContent$default != null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.".toString());
                }
                oKMessage3.setContent(oKMessageContent$default);
                oKMessage3.setSentStatus(OKMessage.SentStatus.SENT);
                return oKMessage3;
            }
            j = broadcastMessageUseCase$execute$1.J$0;
            OKMessage oKMessage4 = (OKMessage) broadcastMessageUseCase$execute$1.L$1;
            C35760oCr c35760oCr2 = (C35760oCr) broadcastMessageUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            oKMessage2 = oKMessage4;
            c35760oCr = c35760oCr2;
        }
        wSSendMessageDetailData = (WSSendMessageDetailData) objOLrzqt;
        if (wSSendMessageDetailData == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        try {
            sKH skh2 = c35760oCr.OLrzqt;
            broadcastMessageUseCase$execute$1.L$0 = oKMessage2;
            broadcastMessageUseCase$execute$1.L$1 = wSSendMessageDetailData;
            broadcastMessageUseCase$execute$1.label = 2;
            objEZpvd = skh2.EZpvd(j, wSSendMessageDetailData, broadcastMessageUseCase$execute$1);
        } catch (java.lang.Throwable th2) {
            th = th2;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            wSSendMessageDetailData2 = wSSendMessageDetailData;
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            oKMessage3 = oKMessage2;
        }
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        wSSendMessageDetailData2 = wSSendMessageDetailData;
        oKMessage3 = oKMessage2;
        objOLrzqt = objEZpvd;
        responseData = (ResponseData) objOLrzqt;
        if (responseData.getCode() != 0) {
        }
        actionBar.AEQbTJ();
        oKMessageContent$default = C44169sFw.toOKMessageContent$default(sQS.toInHouseIMMessageEntity$default(wSSendMessageDetailData2, 0, 1, null), false, 1, null);
        if (oKMessageContent$default != null) {
        }
    }
}
