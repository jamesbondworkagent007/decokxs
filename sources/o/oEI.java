package o;

import com.okinc.im.usecase.messagelist.GetMessageListUseCaseV2$execute$1;
import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEI {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final sKH AEQbTJ;
    public final C35847oFx KWHzl;

    @yCM
    public oEI(@NotNull sKH skh, @NotNull C35847oFx c35847oFx) {
        Intrinsics.checkNotNullParameter(skh, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        this.AEQbTJ = skh;
        this.KWHzl = c35847oFx;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oFx.execute$default(o.oFx, com.okinc.okimcore.model.im.OKMessage, java.lang.Long, o.sQB, o.sQy, o.sQz, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01e1 -> B:43:0x01e3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Long l, java.lang.Long l2, boolean z, long j, java.lang.Boolean bool, @NotNull GetMessageDirection getMessageDirection, boolean z2, @NotNull Continuation<? super sNM> continuation) throws java.lang.Throwable {
        GetMessageListUseCaseV2$execute$1 getMessageListUseCaseV2$execute$1;
        java.lang.Long l3;
        oEI oei;
        sNM snm;
        java.util.Collection arrayList;
        java.lang.Long l4;
        oEI oei2;
        java.util.Iterator it;
        if (continuation instanceof GetMessageListUseCaseV2$execute$1) {
            getMessageListUseCaseV2$execute$1 = (GetMessageListUseCaseV2$execute$1) continuation;
            int i = getMessageListUseCaseV2$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getMessageListUseCaseV2$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getMessageListUseCaseV2$execute$1 = new GetMessageListUseCaseV2$execute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getMessageListUseCaseV2$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getMessageListUseCaseV2$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            pUU.KWHzl("GetMessageListUseCaseV2", "Request => channelId:" + str + ", targetMsgSeq:" + l2 + ", needToGetNextUnread:" + z + ", total:" + j + ", asc:" + bool + ", direction:" + getMessageDirection + ", loadMoreWithSchedule:" + z2 + ", ");
            sNH snh = new sNH(str, l2, z, j, bool, getMessageDirection, 0, z2, 64, null);
            sKH skh = this.AEQbTJ;
            getMessageListUseCaseV2$execute$1.L$0 = this;
            l3 = l;
            getMessageListUseCaseV2$execute$1.L$1 = l3;
            getMessageListUseCaseV2$execute$1.label = 1;
            objKWHzl = skh.KWHzl(snh, getMessageListUseCaseV2$execute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            oei = this;
        } else if (i2 == 1) {
            java.lang.Long l5 = (java.lang.Long) getMessageListUseCaseV2$execute$1.L$1;
            oei = (oEI) getMessageListUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            l3 = l5;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sNM snm2 = (sNM) getMessageListUseCaseV2$execute$1.L$4;
            it = (java.util.Iterator) getMessageListUseCaseV2$execute$1.L$3;
            arrayList = (java.util.Collection) getMessageListUseCaseV2$execute$1.L$2;
            l4 = (java.lang.Long) getMessageListUseCaseV2$execute$1.L$1;
            oei2 = (oEI) getMessageListUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            OKMessage oKMessage = (OKMessage) objKWHzl;
            if (oKMessage != null) {
                arrayList.add(oKMessage);
            }
            snm = snm2;
            if (it.hasNext()) {
                OKMessage oKMessage2 = (OKMessage) it.next();
                C35847oFx c35847oFx = oei2.KWHzl;
                getMessageListUseCaseV2$execute$1.L$0 = oei2;
                getMessageListUseCaseV2$execute$1.L$1 = l4;
                getMessageListUseCaseV2$execute$1.L$2 = arrayList;
                getMessageListUseCaseV2$execute$1.L$3 = it;
                getMessageListUseCaseV2$execute$1.L$4 = snm;
                getMessageListUseCaseV2$execute$1.label = 2;
                java.lang.Object objEZpvd = c35847oFx.EZpvd(oKMessage2, (28 & 2) != 0 ? null : l4, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null, getMessageListUseCaseV2$execute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                snm2 = snm;
                objKWHzl = objEZpvd;
                OKMessage oKMessage3 = (OKMessage) objKWHzl;
                if (oKMessage3 != null) {
                }
                snm = snm2;
                if (it.hasNext()) {
                    return sNM.copy$default(snm, (java.util.List) arrayList, false, false, null, 14, null);
                }
            }
        }
        snm = (sNM) objKWHzl;
        int size = snm.copydefault().size();
        java.lang.Long lKWHzl = snm.KWHzl();
        boolean zEZpvd = snm.EZpvd();
        boolean zOLrzqt = snm.OLrzqt();
        OKMessage oKMessage4 = (OKMessage) CollectionsKt___CollectionsKt.firstOrNull(snm.copydefault());
        java.lang.Long lKWHzl2 = oKMessage4 != null ? C56443yFo.KWHzl(oKMessage4.getSeq()) : null;
        OKMessage oKMessage5 = (OKMessage) CollectionsKt___CollectionsKt.firstOrNull(snm.copydefault());
        java.lang.String clientMessageId = oKMessage5 != null ? oKMessage5.getClientMessageId() : null;
        OKMessage oKMessage6 = (OKMessage) CollectionsKt___CollectionsKt.wlaJM(snm.copydefault());
        java.lang.Long lKWHzl3 = oKMessage6 != null ? C56443yFo.KWHzl(oKMessage6.getSeq()) : null;
        OKMessage oKMessage7 = (OKMessage) CollectionsKt___CollectionsKt.wlaJM(snm.copydefault());
        pUU.KWHzl("GetMessageListUseCaseV2", "Result => size = " + size + ", firstUnreadSeq=" + lKWHzl + ", hasNextPage=" + zEZpvd + ", hasPreviousPage=" + zOLrzqt + ", firstMsgSeq=" + lKWHzl2 + ", firstMsgClientMsgId=" + clientMessageId + ", lastMsgSeq=" + lKWHzl3 + ", firstMsgClientMsgId=" + (oKMessage7 != null ? oKMessage7.getClientMessageId() : null) + ", ");
        java.util.List<OKMessage> listCopydefault = snm.copydefault();
        arrayList = new java.util.ArrayList();
        l4 = l3;
        getMessageListUseCaseV2$execute$1 = getMessageListUseCaseV2$execute$1;
        oei2 = oei;
        it = listCopydefault.iterator();
        if (it.hasNext()) {
        }
    }
}
