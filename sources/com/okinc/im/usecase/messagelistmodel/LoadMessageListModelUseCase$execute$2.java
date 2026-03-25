package com.okinc.im.usecase.messagelistmodel;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C33129mqd;
import o.C35254nrp;
import o.C36558odI;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC37705oyq;
import o.nDD;
import o.oCB;
import o.oCC;
import o.oEH;
import o.oEX;
import o.oGH;
import o.sRZ;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class LoadMessageListModelUseCase$execute$2 extends SuspendLambda implements Function2<InterfaceC37705oyq, Continuation<? super C36558odI>, Object> {
    final /* synthetic */ OKConversation $conversation;
    final /* synthetic */ String $searchKey;
    final /* synthetic */ OKMessage $targetMessage;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ oEX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadMessageListModelUseCase$execute$2(oEX oex, OKConversation oKConversation, OKMessage oKMessage, String str, Continuation<? super LoadMessageListModelUseCase$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = oex;
        this.$conversation = oKConversation;
        this.$targetMessage = oKMessage;
        this.$searchKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LoadMessageListModelUseCase$execute$2 loadMessageListModelUseCase$execute$2 = new LoadMessageListModelUseCase$execute$2(this.this$0, this.$conversation, this.$targetMessage, this.$searchKey, continuation);
        loadMessageListModelUseCase$execute$2.L$0 = obj;
        return loadMessageListModelUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC37705oyq interfaceC37705oyq, Continuation<? super C36558odI> continuation) {
        return ((LoadMessageListModelUseCase$execute$2) create(interfaceC37705oyq, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x000f */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: long */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:98)|(1:(1:(1:(1:(1:(4:9|90|84|(2:86|(1:88)(4:89|90|84|(4:91|(1:93)|94|95)(0)))(0))(2:10|11))(4:12|83|84|(0)(0)))(8:13|14|15|73|76|(1:78)|79|(1:81)(4:82|83|84|(0)(0))))(17:18|104|19|20|45|54|(1:56)|57|(2:59|(1:68)(1:67))(3:62|(2:64|(0)(0))|68)|69|70|(1:72)|73|76|(0)|79|(0)(0)))(1:23))(2:24|(1:26))|27|(1:29)(1:30)|31|100|32|(2:102|34)(1:38)|39|40|96|41|(1:43)(14:44|45|54|(0)|57|(0)(0)|69|70|(0)|73|76|(0)|79|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|98|(1:(1:(1:(1:(1:(4:9|90|84|(2:86|(1:88)(4:89|90|84|(4:91|(1:93)|94|95)(0)))(0))(2:10|11))(4:12|83|84|(0)(0)))(8:13|14|15|73|76|(1:78)|79|(1:81)(4:82|83|84|(0)(0))))(17:18|104|19|20|45|54|(1:56)|57|(2:59|(1:68)(1:67))(3:62|(2:64|(0)(0))|68)|69|70|(1:72)|73|76|(0)|79|(0)(0)))(1:23))(2:24|(1:26))|27|(1:29)(1:30)|31|100|32|(2:102|34)(1:38)|39|40|96|41|(1:43)(14:44|45|54|(0)|57|(0)(0)|69|70|(0)|73|76|(0)|79|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0152, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0153, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
    
        r5 = r19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2 A[PHI: r1
  0x01a2: PHI (r1v31 long) = (r1v28 long), (r1v34 long) binds: [B:65:0x019f, B:60:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x02a4 -> B:90:0x02b9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        double d;
        Long l;
        Long l2;
        Object objAEQbTJ;
        InterfaceC37705oyq interfaceC37705oyq;
        Long lKWHzl;
        oEX oex;
        OKConversation oKConversation;
        Iterator it;
        Long l3;
        Long l4;
        Long l5;
        String str;
        Collection collection;
        List<OKMessage> list;
        InterfaceC37705oyq interfaceC37705oyq2;
        InterfaceC37705oyq interfaceC37705oyq3;
        Object objEZpvd;
        InterfaceC37705oyq interfaceC37705oyq4;
        long jLongValue;
        Long lKWHzl2;
        long sentTime;
        Object objAEQbTJ2;
        InterfaceC37705oyq interfaceC37705oyq5;
        Long l6;
        long j;
        Object objM7377constructorimpl2;
        OKMessage oKMessage;
        long jAhwBna;
        long j2;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        float f = 2.8E-45f;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            d = f;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            interfaceC37705oyq3 = (InterfaceC37705oyq) this.L$0;
            oCC occ = this.this$0.KWHzl;
            String targetId = this.$conversation.getTargetId();
            this.L$0 = interfaceC37705oyq3;
            this.label = 1;
            objEZpvd = occ.EZpvd(targetId, this);
            if (objEZpvd == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i == 1) {
            interfaceC37705oyq3 = (InterfaceC37705oyq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
        } else if (i == 2) {
            j = this.J$0;
            l6 = (Long) this.L$1;
            interfaceC37705oyq5 = (InterfaceC37705oyq) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = obj;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.AEQbTJ(((Number) objAEQbTJ2).intValue()));
            } catch (Throwable th2) {
                th = th2;
                jLongValue = j;
                lKWHzl2 = l6;
                interfaceC37705oyq4 = interfaceC37705oyq5;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jLongValue;
                interfaceC37705oyq5 = interfaceC37705oyq4;
                l6 = lKWHzl2;
            }
            Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = numAEQbTJ;
            }
            int iIntValue = ((Number) objM7377constructorimpl2).intValue();
            oKMessage = this.$targetMessage;
            if (oKMessage == null) {
                jAhwBna = j - oKMessage.getSeq();
                j2 = jAhwBna <= 0 ? 50L : jAhwBna + ((long) iIntValue) + 50;
            } else {
                if (this.$conversation.getUnreadMessageCount() != 0) {
                    jAhwBna = j - ((long) C33129mqd.AhwBna(this.$conversation.getLastReadMsgSeq()));
                    if (jAhwBna <= 0) {
                    }
                }
            }
            interfaceC37705oyq5.put("pageSize", C56443yFo.KWHzl(j2));
            oEX oex2 = this.this$0;
            OKConversation oKConversation2 = this.$conversation;
            Result.Application application3 = Result.Companion;
            oCB ocb = oex2.copydefault;
            String targetId2 = oKConversation2.getTargetId();
            this.L$0 = interfaceC37705oyq5;
            this.L$1 = l6;
            this.J$0 = j2;
            this.label = 3;
            objCopydefault = ocb.copydefault(targetId2, this);
            f = j2;
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Long) objCopydefault);
            d = f;
            long j3 = d;
            l = l6;
            InterfaceC37705oyq interfaceC37705oyq6 = interfaceC37705oyq5;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
            l2 = (Long) objM7377constructorimpl;
            oEH oeh = this.this$0.OLrzqt;
            OKConversation oKConversation3 = this.$conversation;
            this.L$0 = interfaceC37705oyq6;
            this.L$1 = l;
            this.L$2 = l2;
            this.label = 4;
            objAEQbTJ = oeh.AEQbTJ(oKConversation3, l, null, l2, j3, true, true, this);
            if (objAEQbTJ == objCopydefault2) {
            }
        } else if (i == 3) {
            long j4 = this.J$0;
            l6 = (Long) this.L$1;
            interfaceC37705oyq5 = (InterfaceC37705oyq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
            f = j4;
            objM7377constructorimpl = Result.m7377constructorimpl((Long) objCopydefault);
            d = f;
            long j32 = d;
            l = l6;
            InterfaceC37705oyq interfaceC37705oyq62 = interfaceC37705oyq5;
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            l2 = (Long) objM7377constructorimpl;
            oEH oeh2 = this.this$0.OLrzqt;
            OKConversation oKConversation32 = this.$conversation;
            this.L$0 = interfaceC37705oyq62;
            this.L$1 = l;
            this.L$2 = l2;
            this.label = 4;
            objAEQbTJ = oeh2.AEQbTJ(oKConversation32, l, null, l2, j32, true, true, this);
            if (objAEQbTJ == objCopydefault2) {
                return objCopydefault2;
            }
            interfaceC37705oyq = interfaceC37705oyq62;
            List<OKMessage> list2 = (List) objAEQbTJ;
            nDD ndd = nDD.OLrzqt;
            lKWHzl = ndd.KWHzl(list2);
            Long lEZpvd = ndd.EZpvd(this.$conversation, list2);
            oEX oex3 = this.this$0;
            String str2 = this.$searchKey;
            OKConversation oKConversation4 = this.$conversation;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            oex = oex3;
            oKConversation = oKConversation4;
            it = list2.iterator();
            l3 = l;
            l4 = l2;
            l5 = lEZpvd;
            str = str2;
            collection = arrayList;
            list = list2;
            interfaceC37705oyq2 = interfaceC37705oyq;
            if (!it.hasNext()) {
            }
        } else if (i == 4) {
            l2 = (Long) this.L$2;
            Long l7 = (Long) this.L$1;
            interfaceC37705oyq = (InterfaceC37705oyq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            l = l7;
            objAEQbTJ = obj;
            List<OKMessage> list22 = (List) objAEQbTJ;
            nDD ndd2 = nDD.OLrzqt;
            lKWHzl = ndd2.KWHzl(list22);
            Long lEZpvd2 = ndd2.EZpvd(this.$conversation, list22);
            oEX oex32 = this.this$0;
            String str22 = this.$searchKey;
            OKConversation oKConversation42 = this.$conversation;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list22, 10));
            oex = oex32;
            oKConversation = oKConversation42;
            it = list22.iterator();
            l3 = l;
            l4 = l2;
            l5 = lEZpvd2;
            str = str22;
            collection = arrayList2;
            list = list22;
            interfaceC37705oyq2 = interfaceC37705oyq;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) this.L$11;
            Iterator it2 = (Iterator) this.L$10;
            Collection collection2 = (Collection) this.L$9;
            OKConversation oKConversation5 = (OKConversation) this.L$8;
            String str3 = (String) this.L$7;
            oEX oex4 = (oEX) this.L$6;
            Long l8 = (Long) this.L$5;
            Long l9 = (Long) this.L$4;
            list = (List) this.L$3;
            Long l10 = (Long) this.L$2;
            Long l11 = (Long) this.L$1;
            InterfaceC37705oyq interfaceC37705oyq7 = (InterfaceC37705oyq) this.L$0;
            C56391yDq.AEQbTJ(obj);
            it = it2;
            oKConversation = oKConversation5;
            Object objEZpvd2 = obj;
            str = str3;
            lKWHzl = l9;
            l3 = l11;
            oex = oex4;
            l4 = l10;
            l5 = l8;
            interfaceC37705oyq2 = interfaceC37705oyq7;
            collection.add((C35254nrp) objEZpvd2);
            collection = collection2;
            if (!it.hasNext()) {
                OKMessage oKMessage2 = (OKMessage) it.next();
                oGH ogh = oex.EZpvd;
                Integer numAEQbTJ2 = C56443yFo.AEQbTJ(oKConversation.getUnreadMessageCount());
                this.L$0 = interfaceC37705oyq2;
                this.L$1 = l3;
                this.L$2 = l4;
                this.L$3 = list;
                this.L$4 = lKWHzl;
                this.L$5 = l5;
                this.L$6 = oex;
                this.L$7 = str;
                this.L$8 = oKConversation;
                this.L$9 = collection;
                this.L$10 = it;
                this.L$11 = collection;
                this.label = 5;
                Long l12 = lKWHzl;
                Long l13 = l4;
                InterfaceC37705oyq interfaceC37705oyq8 = interfaceC37705oyq2;
                Long l14 = l3;
                List<OKMessage> list3 = list;
                Long l15 = l5;
                oEX oex5 = oex;
                String str4 = str;
                OKConversation oKConversation6 = oKConversation;
                Iterator it3 = it;
                objEZpvd2 = ogh.EZpvd(oKMessage2, (256 & 2) != 0 ? yDY.AhwBna() : list, (256 & 4) != 0 ? null : l3, (256 & 8) != 0 ? null : str, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : l12, (256 & 64) != 0 ? null : l5, (256 & 128) != 0 ? 0 : numAEQbTJ2, (256 & 256) != 0 ? null : null, this);
                if (objEZpvd2 == objCopydefault2) {
                    return objCopydefault2;
                }
                collection2 = collection;
                l3 = l14;
                oKConversation = oKConversation6;
                oex = oex5;
                str = str4;
                it = it3;
                l4 = l13;
                list = list3;
                lKWHzl = l12;
                l5 = l15;
                interfaceC37705oyq2 = interfaceC37705oyq8;
                collection.add((C35254nrp) objEZpvd2);
                collection = collection2;
                if (!it.hasNext()) {
                    Long l16 = lKWHzl;
                    Long l17 = l4;
                    Long l18 = l5;
                    List list4 = (List) collection;
                    boolean zIsEmpty = list.isEmpty();
                    interfaceC37705oyq2.recordTimeCost("timeCostLoadMessages");
                    String lastReadMsgSeq = this.$conversation.getLastReadMsgSeq();
                    boolean z = !zIsEmpty;
                    return new C36558odI(list4, this.$conversation, this.$targetMessage, this.$searchKey, l17, null, z, z, l16, false, lastReadMsgSeq != null ? C56443yFo.KWHzl(C33129mqd.valueOf(lastReadMsgSeq)) : null, l18, C56443yFo.AEQbTJ(this.$conversation.getUnreadMessageCount()), false, false, 25088, null);
                }
            }
        }
        interfaceC37705oyq4 = interfaceC37705oyq3;
        Number number = (Number) objEZpvd;
        long jLongValue2 = number.longValue();
        interfaceC37705oyq4.recordTimeCost("timeCostGetMaxSequence");
        interfaceC37705oyq4.put("maxSequence", C56443yFo.KWHzl(jLongValue2));
        jLongValue = number.longValue();
        OKMessage oKMessage3 = this.$targetMessage;
        lKWHzl2 = oKMessage3 != null ? C56443yFo.KWHzl(oKMessage3.getSeq()) : null;
        interfaceC37705oyq4.put("messageId", lKWHzl2);
        oEX oex6 = this.this$0;
        OKConversation oKConversation7 = this.$conversation;
        OKMessage oKMessage4 = this.$targetMessage;
        Result.Application application4 = Result.Companion;
        sRZ srz = oex6.AhwBna;
        String targetId3 = oKConversation7.getTargetId();
        if (oKMessage4 != null) {
            try {
                sentTime = oKMessage4.getSentTime();
            } catch (Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                j = jLongValue;
                interfaceC37705oyq5 = interfaceC37705oyq4;
                l6 = lKWHzl2;
            }
        } else {
            sentTime = Long.MAX_VALUE;
        }
        this.L$0 = interfaceC37705oyq4;
        this.L$1 = lKWHzl2;
        this.J$0 = jLongValue;
        this.label = 2;
        long j5 = jLongValue;
        objAEQbTJ2 = srz.AEQbTJ(targetId3, sentTime, Long.MAX_VALUE, this);
        if (objAEQbTJ2 == objCopydefault2) {
            return objCopydefault2;
        }
        interfaceC37705oyq5 = interfaceC37705oyq4;
        l6 = lKWHzl2;
        j = j5;
        objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.AEQbTJ(((Number) objAEQbTJ2).intValue()));
        Integer numAEQbTJ3 = C56443yFo.AEQbTJ(0);
        if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
        }
        int iIntValue2 = ((Number) objM7377constructorimpl2).intValue();
        oKMessage = this.$targetMessage;
        if (oKMessage == null) {
        }
        interfaceC37705oyq5.put("pageSize", C56443yFo.KWHzl(j2));
        oEX oex22 = this.this$0;
        OKConversation oKConversation22 = this.$conversation;
        Result.Application application32 = Result.Companion;
        oCB ocb2 = oex22.copydefault;
        String targetId22 = oKConversation22.getTargetId();
        this.L$0 = interfaceC37705oyq5;
        this.L$1 = l6;
        this.J$0 = j2;
        this.label = 3;
        objCopydefault = ocb2.copydefault(targetId22, this);
        f = j2;
        if (objCopydefault == objCopydefault2) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl((Long) objCopydefault);
        d = f;
        long j322 = d;
        l = l6;
        InterfaceC37705oyq interfaceC37705oyq622 = interfaceC37705oyq5;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        l2 = (Long) objM7377constructorimpl;
        oEH oeh22 = this.this$0.OLrzqt;
        OKConversation oKConversation322 = this.$conversation;
        this.L$0 = interfaceC37705oyq622;
        this.L$1 = l;
        this.L$2 = l2;
        this.label = 4;
        objAEQbTJ = oeh22.AEQbTJ(oKConversation322, l, null, l2, j322, true, true, this);
        if (objAEQbTJ == objCopydefault2) {
        }
    }
}
