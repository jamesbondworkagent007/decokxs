package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.usecase.broadcastmessage.GetPendingBroadcastMessageUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35768oCz {
    public final C35848oFy AEQbTJ;
    public final oGM EZpvd;
    public final sKH copydefault;

    @yCM
    public C35768oCz(@NotNull C35848oFy c35848oFy, @NotNull oGM ogm, @NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(c35848oFy, "");
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(skh, "");
        this.AEQbTJ = c35848oFy;
        this.EZpvd = ogm;
        this.copydefault = skh;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, long j2, @NotNull SendMessageRequestParam sendMessageRequestParam, @NotNull Continuation<? super OKMessage> continuation) throws java.lang.Throwable {
        GetPendingBroadcastMessageUseCase$execute$1 getPendingBroadcastMessageUseCase$execute$1;
        C35768oCz c35768oCz;
        InHouseIMMessageEntity inHouseIMMessageEntity$default;
        if (continuation instanceof GetPendingBroadcastMessageUseCase$execute$1) {
            getPendingBroadcastMessageUseCase$execute$1 = (GetPendingBroadcastMessageUseCase$execute$1) continuation;
            int i = getPendingBroadcastMessageUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPendingBroadcastMessageUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getPendingBroadcastMessageUseCase$execute$1 = new GetPendingBroadcastMessageUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getPendingBroadcastMessageUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getPendingBroadcastMessageUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            OKMessageContent oKMessageContentEZpvd = this.AEQbTJ.EZpvd(sendMessageRequestParam);
            sKH skh = this.copydefault;
            getPendingBroadcastMessageUseCase$execute$1.L$0 = this;
            getPendingBroadcastMessageUseCase$execute$1.J$0 = j;
            getPendingBroadcastMessageUseCase$execute$1.J$1 = j2;
            getPendingBroadcastMessageUseCase$execute$1.label = 1;
            objEZpvd = skh.EZpvd(j2, oKMessageContentEZpvd, getPendingBroadcastMessageUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c35768oCz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = getPendingBroadcastMessageUseCase$execute$1.J$1;
            j = getPendingBroadcastMessageUseCase$execute$1.J$0;
            c35768oCz = (C35768oCz) getPendingBroadcastMessageUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        WSSendMessageDetailData wSSendMessageDetailData = (WSSendMessageDetailData) objEZpvd;
        OKMessageContent oKMessageContent$default = null;
        if (wSSendMessageDetailData != null && (inHouseIMMessageEntity$default = sQS.toInHouseIMMessageEntity$default(wSSendMessageDetailData, 0, 1, null)) != null) {
            oKMessageContent$default = C44169sFw.toOKMessageContent$default(inHouseIMMessageEntity$default, false, 1, null);
        }
        if (oKMessageContent$default == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(java.lang.String.valueOf(j2), OKConversationType.BROADCAST, oKMessageContent$default);
        oKMessageAEQbTJ.setSeq(j);
        oKMessageAEQbTJ.setSenderUserId(c35768oCz.EZpvd.AEQbTJ());
        oKMessageAEQbTJ.setSentTime(java.lang.System.currentTimeMillis());
        oKMessageAEQbTJ.setSentStatus(OKMessage.SentStatus.SENDING);
        return oKMessageAEQbTJ;
    }
}
