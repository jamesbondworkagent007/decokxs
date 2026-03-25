package com.okinc.im.imui.messageV2.view;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.exception.BeingBlockedException;
import com.okinc.im.exception.InvalidFileException;
import com.okinc.im.exception.NotAllowToSendLinkException;
import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C32989mnw;
import o.C35399nuc;
import o.C35813oEq;
import o.C35820oEx;
import o.C36588odm;
import o.C44157sFk;
import o.C56379yDe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListMainViewModel$sendMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<SendMessageRequestParam> $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.config.serviceprovider.SendMessageRequestParam> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageListMainViewModel$sendMessages$1(MessageListMainViewModel messageListMainViewModel, List<? extends SendMessageRequestParam> list, Continuation<? super MessageListMainViewModel$sendMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
        this.$params = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageListMainViewModel$sendMessages$1 messageListMainViewModel$sendMessages$1 = new MessageListMainViewModel$sendMessages$1(this.this$0, this.$params, continuation);
        messageListMainViewModel$sendMessages$1.L$0 = obj;
        return messageListMainViewModel$sendMessages$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$sendMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:84:0x0009 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v27, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v28, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: com.okinc.okimcore.model.im.OKConversation */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.okinc.okimcore.model.im.OKConversation */
    /* JADX DEBUG: Multi-variable search result rejected for r1v30, resolved type: com.okinc.okimcore.model.im.OKConversation */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        OKConversation oKConversation;
        ArrayList arrayList;
        Iterator<T> it;
        MessageListMainViewModel messageListMainViewModel;
        C35820oEx c35820oEx;
        MutableSharedFlow<Unit> mutableSharedFlowAuCTel;
        Unit unit;
        Throwable thM7380exceptionOrNullimpl;
        String displayName$default;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                oKConversation = i;
            }
        } catch (Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        switch (i) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                OKConversation value = this.this$0.valueOf().getValue();
                if (value != null) {
                    MessageListMainViewModel messageListMainViewModel2 = this.this$0;
                    Result.Application application3 = Result.Companion;
                    C35813oEq c35813oEq = messageListMainViewModel2.QVAiDq;
                    String targetId = value.getTargetId();
                    this.L$0 = coroutineScope;
                    this.L$1 = value;
                    this.label = 1;
                    obj = c35813oEq.OLrzqt(targetId, this);
                    i = value;
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
                    oKConversation = i;
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    OKMessage oKMessage = (OKMessage) objM7377constructorimpl;
                    List<SendMessageRequestParam> list = this.$params;
                    arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new SendMessageRequest(oKConversation.getTargetId(), oKMessage != null ? C56443yFo.KWHzl(oKMessage.getSeq()) : null, (SendMessageRequestParam) it.next()));
                    }
                    messageListMainViewModel = this.this$0;
                    Result.Application application4 = Result.Companion;
                    c35820oEx = messageListMainViewModel.RdAHlO;
                    this.L$0 = messageListMainViewModel;
                    this.L$1 = null;
                    this.label = 2;
                    if (c35820oEx.OLrzqt(arrayList, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlowAuCTel = messageListMainViewModel.AuCTel();
                    unit = Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 3;
                    if (mutableSharedFlowAuCTel.emit(unit, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                    MessageListMainViewModel messageListMainViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl != null) {
                        if (thM7380exceptionOrNullimpl instanceof NotAllowToSendLinkException) {
                            int i2 = Application.copydefault[((NotAllowToSendLinkException) thM7380exceptionOrNullimpl).getConversationType().ordinal()];
                            if (i2 == 1) {
                                MutableLiveData mutableLiveData = messageListMainViewModel3.AEQbTJ;
                                C32989mnw c32989mnw = new C32989mnw(new StringResource.Res(C35399nuc.LoaderManager.hcetpZ));
                                this.L$0 = objM7377constructorimpl2;
                                this.L$1 = null;
                                this.label = 4;
                                if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else if (i2 == 2) {
                                MutableLiveData mutableLiveData2 = messageListMainViewModel3.AEQbTJ;
                                C32989mnw c32989mnw2 = new C32989mnw(new StringResource.Res(C35399nuc.LoaderManager.SFHvfSaKzXkR));
                                this.L$0 = objM7377constructorimpl2;
                                this.L$1 = null;
                                this.label = 5;
                                if (C36588odm.KWHzl(mutableLiveData2, c32989mnw2, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                            obj2 = objM7377constructorimpl2;
                            objM7377constructorimpl2 = obj2;
                        } else {
                            if (thM7380exceptionOrNullimpl instanceof BeingBlockedException) {
                                RelationInfo relationInfo = ((BeingBlockedException) thM7380exceptionOrNullimpl).getRelationInfo();
                                if (relationInfo == null || (displayName$default = C44157sFk.getDisplayName$default(relationInfo, null, 1, null)) == null) {
                                    displayName$default = "";
                                }
                                MutableLiveData mutableLiveData3 = messageListMainViewModel3.getNewProxyInstance;
                                C32989mnw c32989mnw3 = new C32989mnw(displayName$default);
                                this.L$0 = objM7377constructorimpl2;
                                this.L$1 = null;
                                this.label = 6;
                                if (C36588odm.KWHzl(mutableLiveData3, c32989mnw3, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else if (thM7380exceptionOrNullimpl instanceof InvalidFileException) {
                                MutableLiveData mutableLiveData4 = messageListMainViewModel3.AEQbTJ;
                                C32989mnw c32989mnw4 = new C32989mnw(new StringResource.Raw(((InvalidFileException) thM7380exceptionOrNullimpl).getMessage()));
                                this.L$0 = objM7377constructorimpl2;
                                this.L$1 = null;
                                this.label = 7;
                                if (C36588odm.KWHzl(mutableLiveData4, c32989mnw4, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            } else {
                                pUU.copydefault("MessageListMainViewModel", "Failed to send message error=" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
                            }
                            obj2 = objM7377constructorimpl2;
                            objM7377constructorimpl2 = obj2;
                        }
                    }
                    Result.m7376boximpl(objM7377constructorimpl2);
                }
                return Unit.INSTANCE;
            case 1:
                OKConversation oKConversation2 = (OKConversation) this.L$1;
                C56391yDq.AEQbTJ(obj);
                i = oKConversation2;
                objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
                oKConversation = i;
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                OKMessage oKMessage2 = (OKMessage) objM7377constructorimpl;
                List<SendMessageRequestParam> list2 = this.$params;
                arrayList = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                }
                messageListMainViewModel = this.this$0;
                Result.Application application42 = Result.Companion;
                c35820oEx = messageListMainViewModel.RdAHlO;
                this.L$0 = messageListMainViewModel;
                this.L$1 = null;
                this.label = 2;
                if (c35820oEx.OLrzqt(arrayList, this) == objCopydefault) {
                }
                mutableSharedFlowAuCTel = messageListMainViewModel.AuCTel();
                unit = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (mutableSharedFlowAuCTel.emit(unit, this) == objCopydefault) {
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                MessageListMainViewModel messageListMainViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(objM7377constructorimpl2);
                return Unit.INSTANCE;
            case 2:
                messageListMainViewModel = (MessageListMainViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlowAuCTel = messageListMainViewModel.AuCTel();
                unit = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                if (mutableSharedFlowAuCTel.emit(unit, this) == objCopydefault) {
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                MessageListMainViewModel messageListMainViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(objM7377constructorimpl2);
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
                MessageListMainViewModel messageListMainViewModel3222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Result.m7376boximpl(objM7377constructorimpl2);
                return Unit.INSTANCE;
            case 4:
            case 5:
            case 6:
            case 7:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl2 = obj2;
                Result.m7376boximpl(objM7377constructorimpl2);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
