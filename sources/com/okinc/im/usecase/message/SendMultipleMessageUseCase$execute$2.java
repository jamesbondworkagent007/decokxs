package com.okinc.im.usecase.message;

import com.okinc.im.imui.messageV2.model.SendMessageRequest;
import com.okinc.okimcore.model.exception.BeingBlockedException;
import com.okinc.okimcore.model.exception.ConversationNotFoundException;
import com.okinc.okimcore.model.exception.EmptyInputTextException;
import com.okinc.okimcore.model.exception.InvalidFileException;
import com.okinc.okimcore.model.exception.MissingMediaPathException;
import com.okinc.okimcore.model.exception.NonRelationMessageLimitException;
import com.okinc.okimcore.model.exception.NotAllowToSendLinkException;
import com.okinc.okimcore.model.exception.ReferenceMessageNotFoundException;
import com.okinc.okimcore.model.exception.SingleRelationMessageLimitException;
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
import kotlinx.coroutines.CoroutineScope;
import o.C35820oEx;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.oEA;

/* JADX INFO: loaded from: classes8.dex */
public final class SendMultipleMessageUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends OKMessage>>, Object> {
    final /* synthetic */ List<SendMessageRequest> $requests;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C35820oEx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMultipleMessageUseCase$execute$2(List<SendMessageRequest> list, C35820oEx c35820oEx, Continuation<? super SendMultipleMessageUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$requests = list;
        this.this$0 = c35820oEx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SendMultipleMessageUseCase$execute$2 sendMultipleMessageUseCase$execute$2 = new SendMultipleMessageUseCase$execute$2(this.$requests, this.this$0, continuation);
        sendMultipleMessageUseCase$execute$2.L$0 = obj;
        return sendMultipleMessageUseCase$execute$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends OKMessage>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<OKMessage>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<OKMessage>> continuation) {
        return ((SendMultipleMessageUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:24:0x007a) to fix multi-entry loop: BACK_EDGE: B:24:0x007a -> B:25:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:20:0x0071). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Collection arrayList;
        CoroutineScope coroutineScope;
        C35820oEx c35820oEx;
        Iterator it;
        Object objM7377constructorimpl;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        Object next10;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            List<SendMessageRequest> list = this.$requests;
            C35820oEx c35820oEx2 = this.this$0;
            arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            coroutineScope = coroutineScope2;
            c35820oEx = c35820oEx2;
            it = list.iterator();
            collection = arrayList;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) this.L$4;
            it = (Iterator) this.L$3;
            arrayList = (Collection) this.L$2;
            c35820oEx = (C35820oEx) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                collection.add(Result.m7376boximpl(objM7377constructorimpl));
                collection = arrayList;
                if (!it.hasNext()) {
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
            collection.add(Result.m7376boximpl(objM7377constructorimpl));
            collection = arrayList;
            if (!it.hasNext()) {
                SendMessageRequest sendMessageRequest = (SendMessageRequest) it.next();
                try {
                } catch (Throwable th2) {
                    arrayList = collection;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
                Result.Application application3 = Result.Companion;
                oEA oea = c35820oEx.KWHzl;
                this.L$0 = coroutineScope;
                this.L$1 = c35820oEx;
                this.L$2 = collection;
                this.L$3 = it;
                this.L$4 = collection;
                this.label = 1;
                obj = oea.AEQbTJ(sendMessageRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                arrayList = collection;
                objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) obj);
                collection.add(Result.m7376boximpl(objM7377constructorimpl));
                collection = arrayList;
                if (!it.hasNext()) {
                    List list2 = (List) collection;
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next).m7386unboximpl()) instanceof NonRelationMessageLimitException) {
                            break;
                        }
                    }
                    Result result = (Result) next;
                    Throwable thM7380exceptionOrNullimpl = result != null ? Result.m7380exceptionOrNullimpl(result.m7386unboximpl()) : null;
                    NonRelationMessageLimitException nonRelationMessageLimitException = thM7380exceptionOrNullimpl instanceof NonRelationMessageLimitException ? (NonRelationMessageLimitException) thM7380exceptionOrNullimpl : null;
                    if (nonRelationMessageLimitException != null) {
                        throw nonRelationMessageLimitException;
                    }
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next2).m7386unboximpl()) instanceof SingleRelationMessageLimitException) {
                            break;
                        }
                    }
                    Result result2 = (Result) next2;
                    Throwable thM7380exceptionOrNullimpl2 = result2 != null ? Result.m7380exceptionOrNullimpl(result2.m7386unboximpl()) : null;
                    SingleRelationMessageLimitException singleRelationMessageLimitException = thM7380exceptionOrNullimpl2 instanceof SingleRelationMessageLimitException ? (SingleRelationMessageLimitException) thM7380exceptionOrNullimpl2 : null;
                    if (singleRelationMessageLimitException != null) {
                        throw singleRelationMessageLimitException;
                    }
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next3).m7386unboximpl()) instanceof NotAllowToSendLinkException) {
                            break;
                        }
                    }
                    Result result3 = (Result) next3;
                    Throwable thM7380exceptionOrNullimpl3 = result3 != null ? Result.m7380exceptionOrNullimpl(result3.m7386unboximpl()) : null;
                    NotAllowToSendLinkException notAllowToSendLinkException = thM7380exceptionOrNullimpl3 instanceof NotAllowToSendLinkException ? (NotAllowToSendLinkException) thM7380exceptionOrNullimpl3 : null;
                    if (notAllowToSendLinkException != null) {
                        throw notAllowToSendLinkException;
                    }
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it5.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next4).m7386unboximpl()) instanceof ConversationNotFoundException) {
                            break;
                        }
                    }
                    Result result4 = (Result) next4;
                    Throwable thM7380exceptionOrNullimpl4 = result4 != null ? Result.m7380exceptionOrNullimpl(result4.m7386unboximpl()) : null;
                    ConversationNotFoundException conversationNotFoundException = thM7380exceptionOrNullimpl4 instanceof ConversationNotFoundException ? (ConversationNotFoundException) thM7380exceptionOrNullimpl4 : null;
                    if (conversationNotFoundException != null) {
                        throw conversationNotFoundException;
                    }
                    Iterator it6 = list2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            next5 = null;
                            break;
                        }
                        next5 = it6.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next5).m7386unboximpl()) instanceof ReferenceMessageNotFoundException) {
                            break;
                        }
                    }
                    Result result5 = (Result) next5;
                    Throwable thM7380exceptionOrNullimpl5 = result5 != null ? Result.m7380exceptionOrNullimpl(result5.m7386unboximpl()) : null;
                    ReferenceMessageNotFoundException referenceMessageNotFoundException = thM7380exceptionOrNullimpl5 instanceof ReferenceMessageNotFoundException ? (ReferenceMessageNotFoundException) thM7380exceptionOrNullimpl5 : null;
                    if (referenceMessageNotFoundException != null) {
                        throw referenceMessageNotFoundException;
                    }
                    Iterator it7 = list2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it7.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next6).m7386unboximpl()) instanceof BeingBlockedException) {
                            break;
                        }
                    }
                    Result result6 = (Result) next6;
                    Throwable thM7380exceptionOrNullimpl6 = result6 != null ? Result.m7380exceptionOrNullimpl(result6.m7386unboximpl()) : null;
                    BeingBlockedException beingBlockedException = thM7380exceptionOrNullimpl6 instanceof BeingBlockedException ? (BeingBlockedException) thM7380exceptionOrNullimpl6 : null;
                    if (beingBlockedException != null) {
                        throw beingBlockedException;
                    }
                    Iterator it8 = list2.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next7 = null;
                            break;
                        }
                        next7 = it8.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next7).m7386unboximpl()) instanceof InvalidFileException) {
                            break;
                        }
                    }
                    Result result7 = (Result) next7;
                    Throwable thM7380exceptionOrNullimpl7 = result7 != null ? Result.m7380exceptionOrNullimpl(result7.m7386unboximpl()) : null;
                    InvalidFileException invalidFileException = thM7380exceptionOrNullimpl7 instanceof InvalidFileException ? (InvalidFileException) thM7380exceptionOrNullimpl7 : null;
                    if (invalidFileException != null) {
                        throw invalidFileException;
                    }
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            next8 = null;
                            break;
                        }
                        next8 = it9.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next8).m7386unboximpl()) instanceof EmptyInputTextException) {
                            break;
                        }
                    }
                    Result result8 = (Result) next8;
                    Throwable thM7380exceptionOrNullimpl8 = result8 != null ? Result.m7380exceptionOrNullimpl(result8.m7386unboximpl()) : null;
                    EmptyInputTextException emptyInputTextException = thM7380exceptionOrNullimpl8 instanceof EmptyInputTextException ? (EmptyInputTextException) thM7380exceptionOrNullimpl8 : null;
                    if (emptyInputTextException != null) {
                        throw emptyInputTextException;
                    }
                    Iterator it10 = list2.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            next9 = null;
                            break;
                        }
                        next9 = it10.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next9).m7386unboximpl()) instanceof MissingMediaPathException) {
                            break;
                        }
                    }
                    Result result9 = (Result) next9;
                    Throwable thM7380exceptionOrNullimpl9 = result9 != null ? Result.m7380exceptionOrNullimpl(result9.m7386unboximpl()) : null;
                    MissingMediaPathException missingMediaPathException = thM7380exceptionOrNullimpl9 instanceof MissingMediaPathException ? (MissingMediaPathException) thM7380exceptionOrNullimpl9 : null;
                    if (missingMediaPathException != null) {
                        throw missingMediaPathException;
                    }
                    Iterator it11 = list2.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            next10 = null;
                            break;
                        }
                        next10 = it11.next();
                        if (Result.m7380exceptionOrNullimpl(((Result) next10).m7386unboximpl()) != null) {
                            break;
                        }
                    }
                    Result result10 = (Result) next10;
                    Throwable thM7380exceptionOrNullimpl10 = result10 != null ? Result.m7380exceptionOrNullimpl(result10.m7386unboximpl()) : null;
                    if (thM7380exceptionOrNullimpl10 != null) {
                        throw thM7380exceptionOrNullimpl10;
                    }
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
                    Iterator it12 = list2.iterator();
                    while (it12.hasNext()) {
                        Object objM7386unboximpl = ((Result) it12.next()).m7386unboximpl();
                        C56391yDq.AEQbTJ(objM7386unboximpl);
                        arrayList2.add((OKMessage) objM7386unboximpl);
                    }
                    return arrayList2;
                }
            }
        }
    }
}
