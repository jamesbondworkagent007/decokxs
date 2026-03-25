package com.okinc.im.usecase.message;

import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okimcore.model.exception.BeingBlockedException;
import com.okinc.okimcore.model.exception.ConversationNotFoundException;
import com.okinc.okimcore.model.exception.InvalidFileException;
import com.okinc.okimcore.model.exception.NonRelationMessageLimitException;
import com.okinc.okimcore.model.exception.ReferenceMessageNotFoundException;
import com.okinc.okimcore.model.exception.SingleRelationMessageLimitException;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C35805oEi;
import o.C35857oGg;
import o.C56391yDq;
import o.C56442yFn;
import o.oCE;
import o.oEA;
import o.oEB;

/* JADX INFO: loaded from: classes8.dex */
public final class SendMessageUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OKMessage>, Object> {
    final /* synthetic */ SendMessageRequest $request;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ oEA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageUseCase$execute$2(SendMessageRequest sendMessageRequest, oEA oea, Continuation<? super SendMessageUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$request = sendMessageRequest;
        this.this$0 = oea;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SendMessageUseCase$execute$2 sendMessageUseCase$execute$2 = new SendMessageUseCase$execute$2(this.$request, this.this$0, continuation);
        sendMessageUseCase$execute$2.L$0 = obj;
        return sendMessageUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OKMessage> continuation) {
        return ((SendMessageUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=4] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0168 A[Catch: all -> 0x004d, TryCatch #6 {all -> 0x004d, blocks: (B:17:0x0048, B:72:0x0164, B:74:0x0168, B:76:0x0177, B:78:0x017d, B:80:0x0189), top: B:146:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strEZpvd;
        CoroutineScope coroutineScope;
        OKConversation oKConversation;
        Throwable th;
        Object objFirstOrNull;
        CoroutineScope coroutineScope2;
        Object objM7377constructorimpl;
        GroupInfo groupInfo;
        GroupInfo groupInfo2;
        Throwable th2;
        OKConversation oKConversation2;
        Object objOLrzqt;
        Object objM7377constructorimpl2;
        OKMessage oKMessageOLrzqt;
        Long lKWHzl;
        OKConversation oKConversation3;
        RelationInfo relationInfo;
        OKReferenceMessage oKReferenceMessage;
        Throwable th3;
        Long l;
        OKConversation oKConversation4;
        Object objOLrzqt2;
        OKMessage oKMessage;
        GroupInfo groupInfo3;
        Long l2;
        Object objM7377constructorimpl3;
        OKConversation oKConversation5;
        OKConversation oKConversation6;
        RelationInfo relationInfo2;
        OKMessage oKMessage2;
        OKReferenceMessage oKReferenceMessageCreateForReference;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            strEZpvd = this.$request.EZpvd();
            oCE oce = this.this$0.OLrzqt;
            this.L$0 = coroutineScope3;
            this.L$1 = strEZpvd;
            this.label = 1;
            Object objOLrzqt3 = oce.OLrzqt(strEZpvd, this);
            if (objOLrzqt3 == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope3;
            obj = objOLrzqt3;
        } else if (i == 1) {
            strEZpvd = (String) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else if (i == 2) {
            oKConversation = (OKConversation) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((GroupInfo) obj);
            } catch (Throwable th4) {
                th = th4;
                coroutineScope = coroutineScope2;
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                coroutineScope2 = coroutineScope;
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            groupInfo = (GroupInfo) objM7377constructorimpl;
            oEA oea = this.this$0;
            try {
                Result.Application application2 = Result.Companion;
                C35857oGg c35857oGg = oea.gEmmrt;
                String targetId = oKConversation.getTargetId();
                this.L$0 = coroutineScope2;
                this.L$1 = oKConversation;
                this.L$2 = groupInfo;
                this.label = 3;
                objOLrzqt = c35857oGg.OLrzqt(targetId, this);
            } catch (Throwable th5) {
                OKConversation oKConversation7 = oKConversation;
                groupInfo2 = groupInfo;
                th2 = th5;
                oKConversation2 = oKConversation7;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (objOLrzqt != objCopydefault) {
                return objCopydefault;
            }
            OKConversation oKConversation8 = oKConversation;
            groupInfo2 = groupInfo;
            obj = objOLrzqt;
            oKConversation2 = oKConversation8;
            objM7377constructorimpl2 = Result.m7377constructorimpl((RelationInfo) obj);
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
            }
            RelationInfo relationInfo3 = (RelationInfo) objM7377constructorimpl2;
            oKMessageOLrzqt = this.this$0.KWHzl.OLrzqt(this.$request, oKConversation2, groupInfo2);
            lKWHzl = this.$request.KWHzl();
            if (lKWHzl == null) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    relationInfo2 = (RelationInfo) this.L$2;
                    groupInfo2 = (GroupInfo) this.L$1;
                    oKConversation6 = (OKConversation) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        OKMessage oKMessage3 = (OKMessage) obj;
                        this.this$0.valueOf.KWHzl(oKConversation6, groupInfo2, oKMessage3);
                        return oKMessage3;
                    } catch (Throwable th6) {
                        th = th6;
                        relationInfo = relationInfo2;
                        z = th instanceof OKServerException;
                        if (!z && th.getCode() == 30003) {
                            throw new BeingBlockedException(relationInfo);
                        }
                        if (!z && th.getCode() == 40001) {
                            throw new SingleRelationMessageLimitException();
                        }
                        if (!z && th.getCode() == 40002) {
                            throw new NonRelationMessageLimitException();
                        }
                        if (z || th.getCode() != 400) {
                            throw th;
                        }
                        throw new InvalidFileException(th.getMessage());
                    }
                }
                l2 = (Long) this.L$4;
                oKMessage = (OKMessage) this.L$3;
                relationInfo = (RelationInfo) this.L$2;
                groupInfo3 = (GroupInfo) this.L$1;
                oKConversation4 = (OKConversation) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    oKMessage2 = (OKMessage) obj;
                    if (oKMessage2 == null) {
                        oKReferenceMessageCreateForReference = OKReferenceMessage.CREATOR.createForReference(oKMessage2);
                        oKReferenceMessageCreateForReference.setContent(null);
                        OKMessageContent content = oKMessage.getContent();
                        oKReferenceMessageCreateForReference.setMentionedInfo(content != null ? content.getMentionedInfo() : null);
                        oKReferenceMessageCreateForReference.setOriginalOKMessageContent(oKMessage.getContent());
                    } else {
                        oKReferenceMessageCreateForReference = null;
                    }
                    objM7377constructorimpl3 = Result.m7377constructorimpl(oKReferenceMessageCreateForReference);
                    oKConversation5 = oKConversation4;
                    lKWHzl = l2;
                    groupInfo2 = groupInfo3;
                    oKMessageOLrzqt = oKMessage;
                } catch (Throwable th7) {
                    th3 = th7;
                    OKMessage oKMessage4 = oKMessage;
                    l = l2;
                    groupInfo2 = groupInfo3;
                    oKMessageOLrzqt = oKMessage4;
                    Result.Application application4 = Result.Companion;
                    objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                    oKConversation5 = oKConversation4;
                    lKWHzl = l;
                }
                oKConversation3 = oKConversation5;
                if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                    objM7377constructorimpl3 = null;
                }
                oKReferenceMessage = (OKReferenceMessage) objM7377constructorimpl3;
                if (lKWHzl == null && oKReferenceMessage == null) {
                    throw new ReferenceMessageNotFoundException();
                }
                if (lKWHzl != null) {
                    lKWHzl.longValue();
                    oKMessageOLrzqt.setContent(oKReferenceMessage);
                }
                this.this$0.AhwBna.AEQbTJ(oKMessageOLrzqt);
                try {
                    oEB oeb = this.this$0.AYXKKw;
                    SendMessageRequest sendMessageRequest = this.$request;
                    this.L$0 = oKConversation3;
                    this.L$1 = groupInfo2;
                    this.L$2 = relationInfo;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                    obj = oeb.EZpvd(sendMessageRequest, oKMessageOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    oKConversation6 = oKConversation3;
                    relationInfo2 = relationInfo;
                    OKMessage oKMessage32 = (OKMessage) obj;
                    this.this$0.valueOf.KWHzl(oKConversation6, groupInfo2, oKMessage32);
                    return oKMessage32;
                } catch (Throwable th8) {
                    th = th8;
                    z = th instanceof OKServerException;
                    if (!z) {
                    }
                    if (!z) {
                    }
                    if (!z) {
                    }
                    if (z) {
                    }
                    throw th;
                }
            }
            groupInfo2 = (GroupInfo) this.L$2;
            oKConversation2 = (OKConversation) this.L$1;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl2 = Result.m7377constructorimpl((RelationInfo) obj);
            } catch (Throwable th9) {
                th2 = th9;
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = null;
            }
            RelationInfo relationInfo32 = (RelationInfo) objM7377constructorimpl2;
            oKMessageOLrzqt = this.this$0.KWHzl.OLrzqt(this.$request, oKConversation2, groupInfo2);
            lKWHzl = this.$request.KWHzl();
            if (lKWHzl == null) {
                oEA oea2 = this.this$0;
                SendMessageRequest sendMessageRequest2 = this.$request;
                lKWHzl.longValue();
                try {
                    Result.Application application5 = Result.Companion;
                    C35805oEi c35805oEi = oea2.AEQbTJ;
                    String strEZpvd2 = sendMessageRequest2.EZpvd();
                    long jLongValue = lKWHzl.longValue();
                    this.L$0 = oKConversation2;
                    this.L$1 = groupInfo2;
                    this.L$2 = relationInfo32;
                    this.L$3 = oKMessageOLrzqt;
                    this.L$4 = lKWHzl;
                    this.label = 4;
                    objOLrzqt2 = c35805oEi.OLrzqt(strEZpvd2, jLongValue, this);
                } catch (Throwable th10) {
                    OKConversation oKConversation9 = oKConversation2;
                    relationInfo = relationInfo32;
                    th3 = th10;
                    l = lKWHzl;
                    oKConversation4 = oKConversation9;
                    Result.Application application42 = Result.Companion;
                    objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
                    oKConversation5 = oKConversation4;
                    lKWHzl = l;
                }
                if (objOLrzqt2 == objCopydefault) {
                    return objCopydefault;
                }
                OKConversation oKConversation10 = oKConversation2;
                relationInfo = relationInfo32;
                obj = objOLrzqt2;
                oKMessage = oKMessageOLrzqt;
                groupInfo3 = groupInfo2;
                l2 = lKWHzl;
                oKConversation4 = oKConversation10;
                oKMessage2 = (OKMessage) obj;
                if (oKMessage2 == null) {
                }
                objM7377constructorimpl3 = Result.m7377constructorimpl(oKReferenceMessageCreateForReference);
                oKConversation5 = oKConversation4;
                lKWHzl = l2;
                groupInfo2 = groupInfo3;
                oKMessageOLrzqt = oKMessage;
                oKConversation3 = oKConversation5;
                if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                }
                oKReferenceMessage = (OKReferenceMessage) objM7377constructorimpl3;
                if (lKWHzl == null) {
                }
                if (lKWHzl != null) {
                }
                this.this$0.AhwBna.AEQbTJ(oKMessageOLrzqt);
                oEB oeb2 = this.this$0.AYXKKw;
                SendMessageRequest sendMessageRequest3 = this.$request;
                this.L$0 = oKConversation3;
                this.L$1 = groupInfo2;
                this.L$2 = relationInfo;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
                obj = oeb2.EZpvd(sendMessageRequest3, oKMessageOLrzqt, this);
                if (obj == objCopydefault) {
                }
            } else {
                oKConversation3 = oKConversation2;
                relationInfo = relationInfo32;
                oKReferenceMessage = null;
                if (lKWHzl == null) {
                }
                if (lKWHzl != null) {
                }
                this.this$0.AhwBna.AEQbTJ(oKMessageOLrzqt);
                oEB oeb22 = this.this$0.AYXKKw;
                SendMessageRequest sendMessageRequest32 = this.$request;
                this.L$0 = oKConversation3;
                this.L$1 = groupInfo2;
                this.L$2 = relationInfo;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
                obj = oeb22.EZpvd(sendMessageRequest32, oKMessageOLrzqt, this);
                if (obj == objCopydefault) {
                }
            }
        }
        OKConversation oKConversation11 = (OKConversation) obj;
        if (oKConversation11 == null) {
            throw new ConversationNotFoundException();
        }
        oEA oea3 = this.this$0;
        try {
            Result.Application application6 = Result.Companion;
            Flow<GroupInfo> flowAEQbTJ = oea3.djBIcL.AEQbTJ(strEZpvd);
            this.L$0 = coroutineScope;
            this.L$1 = oKConversation11;
            this.label = 2;
            objFirstOrNull = FlowKt.firstOrNull(flowAEQbTJ, this);
        } catch (Throwable th11) {
            oKConversation = oKConversation11;
            th = th11;
            Result.Application application7 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            coroutineScope2 = coroutineScope;
        }
        if (objFirstOrNull == objCopydefault) {
            return objCopydefault;
        }
        coroutineScope2 = coroutineScope;
        oKConversation = oKConversation11;
        obj = objFirstOrNull;
        objM7377constructorimpl = Result.m7377constructorimpl((GroupInfo) obj);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        groupInfo = (GroupInfo) objM7377constructorimpl;
        oEA oea4 = this.this$0;
        Result.Application application22 = Result.Companion;
        C35857oGg c35857oGg2 = oea4.gEmmrt;
        String targetId2 = oKConversation.getTargetId();
        this.L$0 = coroutineScope2;
        this.L$1 = oKConversation;
        this.L$2 = groupInfo;
        this.label = 3;
        objOLrzqt = c35857oGg2.OLrzqt(targetId2, this);
        if (objOLrzqt != objCopydefault) {
        }
    }
}
