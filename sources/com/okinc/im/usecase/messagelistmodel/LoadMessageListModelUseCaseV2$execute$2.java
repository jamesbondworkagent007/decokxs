package com.okinc.im.usecase.messagelistmodel;

import com.okinc.okimcore.model.im.GetMessageDirection;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33129mqd;
import o.C35254nrp;
import o.C36558odI;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC37705oyq;
import o.nDD;
import o.oEI;
import o.oGH;
import o.pUU;
import o.sNM;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class LoadMessageListModelUseCaseV2$execute$2 extends SuspendLambda implements Function2<InterfaceC37705oyq, Continuation<? super C36558odI>, Object> {
    final /* synthetic */ OKConversation $conversation;
    final /* synthetic */ String $searchKey;
    final /* synthetic */ OKMessage $targetMessage;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ LoadMessageListModelUseCaseV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMessageListModelUseCaseV2$execute$2(OKConversation oKConversation, String str, OKMessage oKMessage, LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV2, Continuation<? super LoadMessageListModelUseCaseV2$execute$2> continuation) {
        super(2, continuation);
        this.$conversation = oKConversation;
        this.$searchKey = str;
        this.$targetMessage = oKMessage;
        this.this$0 = loadMessageListModelUseCaseV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LoadMessageListModelUseCaseV2$execute$2 loadMessageListModelUseCaseV2$execute$2 = new LoadMessageListModelUseCaseV2$execute$2(this.$conversation, this.$searchKey, this.$targetMessage, this.this$0, continuation);
        loadMessageListModelUseCaseV2$execute$2.L$0 = obj;
        return loadMessageListModelUseCaseV2$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC37705oyq interfaceC37705oyq, Continuation<? super C36558odI> continuation) {
        return ((LoadMessageListModelUseCaseV2$execute$2) create(interfaceC37705oyq, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:23:0x00bf, B:26:0x00cc], limit reached: 65 */
    /* JADX WARN: Path cross not found for [B:38:0x0103, B:40:0x0107], limit reached: 65 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x021b -> B:59:0x0230). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Long lKWHzl;
        GetMessageDirection getMessageDirection;
        int i;
        Object objCopydefault;
        InterfaceC37705oyq interfaceC37705oyq;
        Long l;
        int i2;
        Long l2;
        sNM snm;
        Long l3;
        Long l4;
        InterfaceC37705oyq interfaceC37705oyq2;
        List<OKMessage> list;
        Long l5;
        LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV2;
        String str;
        OKConversation oKConversation;
        Iterator it;
        Collection collection;
        long j;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC37705oyq interfaceC37705oyq3 = (InterfaceC37705oyq) this.L$0;
            int i4 = this.$conversation.getUnreadMessageCount() > 0 ? 1 : 0;
            int i5 = this.$searchKey != null ? 1 : 0;
            String startMsgSeq = this.$conversation.getStartMsgSeq();
            Long lKWHzl2 = startMsgSeq != null ? C56443yFo.KWHzl(C33129mqd.valueOf(startMsgSeq)) : null;
            if (i5 != 0) {
                OKMessage oKMessage = this.$targetMessage;
                objKWHzl = oKMessage != null ? C56443yFo.KWHzl(oKMessage.getSeq()) : null;
                lKWHzl = objKWHzl == null ? C56443yFo.KWHzl(C33129mqd.valueOf(objKWHzl)) : null;
                if (lKWHzl != null) {
                    interfaceC37705oyq3.put("messageId", C56443yFo.KWHzl(lKWHzl.longValue()));
                }
                boolean z = (i5 == 0 || i4 == 0) ? false : true;
                if (lKWHzl == null) {
                    getMessageDirection = GetMessageDirection.BOTH;
                } else {
                    getMessageDirection = GetMessageDirection.TOP;
                }
                GetMessageDirection getMessageDirection2 = getMessageDirection;
                oEI oei = this.this$0.EZpvd;
                String targetId = this.$conversation.getTargetId();
                this.L$0 = interfaceC37705oyq3;
                this.L$1 = lKWHzl2;
                this.L$2 = lKWHzl;
                this.I$0 = i4;
                this.I$1 = i5;
                this.label = 1;
                Long l6 = lKWHzl;
                Long l7 = lKWHzl2;
                i = i5;
                int i6 = i4;
                objCopydefault = oei.copydefault(targetId, lKWHzl2, (48 & 4) != 0 ? null : lKWHzl, (48 & 8) != 0 ? false : z, (48 & 16) != 0 ? 50L : 0L, (48 & 32) != 0 ? Boolean.TRUE : null, getMessageDirection2, (48 & 128) != 0 ? false : true, this);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                interfaceC37705oyq = interfaceC37705oyq3;
                l = l7;
                i2 = i6;
                l2 = l6;
            } else {
                if (i4 != 0) {
                    objKWHzl = this.$conversation.getLastReadMsgSeq();
                } else {
                    OKMessage oKMessage2 = this.$targetMessage;
                    if (oKMessage2 != null) {
                        objKWHzl = C56443yFo.KWHzl(oKMessage2.getSeq());
                    }
                }
                if (objKWHzl == null) {
                }
                if (lKWHzl != null) {
                }
                if (i5 == 0) {
                }
                if (lKWHzl == null) {
                }
                GetMessageDirection getMessageDirection22 = getMessageDirection;
                oEI oei2 = this.this$0.EZpvd;
                String targetId2 = this.$conversation.getTargetId();
                this.L$0 = interfaceC37705oyq3;
                this.L$1 = lKWHzl2;
                this.L$2 = lKWHzl;
                this.I$0 = i4;
                this.I$1 = i5;
                this.label = 1;
                Long l62 = lKWHzl;
                Long l72 = lKWHzl2;
                i = i5;
                int i62 = i4;
                objCopydefault = oei2.copydefault(targetId2, lKWHzl2, (48 & 4) != 0 ? null : lKWHzl, (48 & 8) != 0 ? false : z, (48 & 16) != 0 ? 50L : 0L, (48 & 32) != 0 ? Boolean.TRUE : null, getMessageDirection22, (48 & 128) != 0 ? false : true, this);
                if (objCopydefault != objCopydefault2) {
                }
            }
        } else if (i3 == 1) {
            int i7 = this.I$1;
            i2 = this.I$0;
            l2 = (Long) this.L$2;
            l = (Long) this.L$1;
            interfaceC37705oyq = (InterfaceC37705oyq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            i = i7;
            objCopydefault = obj;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            Collection collection2 = (Collection) this.L$12;
            Iterator it2 = (Iterator) this.L$11;
            Collection collection3 = (Collection) this.L$10;
            OKConversation oKConversation2 = (OKConversation) this.L$9;
            String str2 = (String) this.L$8;
            LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV22 = (LoadMessageListModelUseCaseV2) this.L$7;
            Long l8 = (Long) this.L$6;
            Long l9 = (Long) this.L$5;
            List<OKMessage> list2 = (List) this.L$4;
            sNM snm2 = (sNM) this.L$3;
            Long l10 = (Long) this.L$2;
            Long l11 = (Long) this.L$1;
            InterfaceC37705oyq interfaceC37705oyq4 = (InterfaceC37705oyq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Iterator it3 = it2;
            snm = snm2;
            l4 = l11;
            interfaceC37705oyq2 = interfaceC37705oyq4;
            Object objEZpvd = obj;
            collection = collection3;
            list = list2;
            oKConversation = oKConversation2;
            l5 = l8;
            str = str2;
            loadMessageListModelUseCaseV2 = loadMessageListModelUseCaseV22;
            Long l12 = l10;
            j = j2;
            collection2.add((C35254nrp) objEZpvd);
            l3 = l9;
            l2 = l12;
            it = it3;
            if (it.hasNext()) {
                OKMessage oKMessage3 = (OKMessage) it.next();
                oGH ogh = loadMessageListModelUseCaseV2.copydefault;
                Integer numAEQbTJ = C56443yFo.AEQbTJ(oKConversation.getUnreadMessageCount());
                this.L$0 = interfaceC37705oyq2;
                this.L$1 = l4;
                this.L$2 = l2;
                this.L$3 = snm;
                this.L$4 = list;
                this.L$5 = l3;
                this.L$6 = l5;
                this.L$7 = loadMessageListModelUseCaseV2;
                this.L$8 = str;
                this.L$9 = oKConversation;
                this.L$10 = collection;
                this.L$11 = it;
                this.L$12 = collection;
                this.J$0 = j;
                long j3 = j;
                this.label = 2;
                Long l13 = l3;
                Long l14 = l4;
                l12 = l2;
                sNM snm3 = snm;
                List<OKMessage> list3 = list;
                Long l15 = l5;
                LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV23 = loadMessageListModelUseCaseV2;
                String str3 = str;
                OKConversation oKConversation3 = oKConversation;
                it3 = it;
                Collection collection4 = collection;
                objEZpvd = ogh.EZpvd(oKMessage3, (256 & 2) != 0 ? yDY.AhwBna() : list, (256 & 4) != 0 ? null : l12, (256 & 8) != 0 ? null : str, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : l13, (256 & 64) != 0 ? null : l15, (256 & 128) != 0 ? 0 : numAEQbTJ, (256 & 256) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault2) {
                    return objCopydefault2;
                }
                collection2 = collection4;
                collection = collection2;
                snm = snm3;
                j = j3;
                l4 = l14;
                list = list3;
                l9 = l13;
                loadMessageListModelUseCaseV2 = loadMessageListModelUseCaseV23;
                str = str3;
                l5 = l15;
                oKConversation = oKConversation3;
                collection2.add((C35254nrp) objEZpvd);
                l3 = l9;
                l2 = l12;
                it = it3;
                if (it.hasNext()) {
                    Long l16 = l3;
                    Long l17 = l4;
                    sNM snm4 = snm;
                    Long l18 = l5;
                    Pair pairOLrzqt = C56390yDp.OLrzqt((List) collection, C56443yFo.KWHzl(System.currentTimeMillis() - j));
                    List list4 = (List) pairOLrzqt.getFirst();
                    pUU.EZpvd("InitMessageListModelUseCase", "Build ui time: " + pairOLrzqt.getSecond());
                    interfaceC37705oyq2.recordTimeCost("timeCostLoadMessages");
                    boolean zEZpvd = snm4.EZpvd();
                    String lastReadMsgSeq = this.$conversation.getLastReadMsgSeq();
                    return new C36558odI(list4, this.$conversation, this.$targetMessage, this.$searchKey, l17, null, zEZpvd, snm4.OLrzqt(), l16, false, lastReadMsgSeq != null ? C56443yFo.KWHzl(C33129mqd.valueOf(lastReadMsgSeq)) : null, l18, C56443yFo.AEQbTJ(this.$conversation.getUnreadMessageCount()), false, false, 25088, null);
                }
            }
        }
        sNM snm5 = (sNM) objCopydefault;
        List<OKMessage> listCopydefault = snm5.copydefault();
        if (i != 0 || i2 != 0) {
            this.this$0.KWHzl(this.$conversation.getTargetId(), (OKMessage) CollectionsKt___CollectionsKt.wlaJM(listCopydefault));
        }
        Long lKWHzl3 = nDD.OLrzqt.KWHzl(listCopydefault);
        Long lKWHzl4 = snm5.KWHzl();
        LoadMessageListModelUseCaseV2 loadMessageListModelUseCaseV24 = this.this$0;
        String str4 = this.$searchKey;
        OKConversation oKConversation4 = this.$conversation;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        Iterator it4 = listCopydefault.iterator();
        Long l19 = l;
        snm = snm5;
        l3 = lKWHzl3;
        l4 = l19;
        interfaceC37705oyq2 = interfaceC37705oyq;
        list = listCopydefault;
        l5 = lKWHzl4;
        loadMessageListModelUseCaseV2 = loadMessageListModelUseCaseV24;
        str = str4;
        oKConversation = oKConversation4;
        it = it4;
        collection = arrayList;
        j = jCurrentTimeMillis;
        if (it.hasNext()) {
        }
    }
}
