package com.okinc.im.imui.messageV2.view.messagelist;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C36558odI;
import o.C36588odm;
import o.C36593odr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$loadMessageList$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ String $searchKey;
    final /* synthetic */ Long $targetMessageId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$loadMessageList$1(MessageListViewModel messageListViewModel, String str, Long l, String str2, Continuation<? super MessageListViewModel$loadMessageList$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$channelId = str;
        this.$targetMessageId = l;
        this.$searchKey = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$loadMessageList$1(this.this$0, this.$channelId, this.$targetMessageId, this.$searchKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$loadMessageList$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:45:0x00e2 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v18, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(2:65|(1:(1:(1:(3:9|61|62)(2:10|11))(5:12|58|(1:60)|61|62))(11:13|14|15|63|43|55|(1:57)|58|(0)|61|62))(8:16|17|18|66|32|(1:34)(2:35|(1:37)(1:38))|39|(1:41)(9:42|63|43|55|(0)|58|(0)|61|62)))(1:21))(2:22|(1:24))|25|70|26|27|68|28|(1:30)(6:31|66|32|(0)(0)|39|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
    
        r18 = r6;
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: all -> 0x00e4, TryCatch #2 {all -> 0x00e4, blocks: (B:32:0x00ad, B:39:0x00bd, B:35:0x00b4), top: B:66:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Throwable th;
        Object objM7377constructorimpl;
        MutableLiveData mutableLiveData;
        Boolean boolKWHzl;
        MessageListViewModel messageListViewModel;
        int i;
        Long l;
        MessageListViewModel messageListViewModel2;
        Object objInitMessageListModel$default;
        MessageListViewModel messageListViewModel3;
        int i2;
        MessageListViewModel.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        ?? r1 = 2;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableLiveData mutableLiveData2 = this.this$0.valueOf;
            Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
            this.label = 1;
            if (C36588odm.KWHzl(mutableLiveData2, boolKWHzl2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = null;
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    messageListViewModel = r1;
                    this.L$0 = obj2;
                    this.L$1 = obj2;
                    this.L$2 = obj2;
                    this.label = 4;
                    if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                    }
                    pUU.KWHzl("MessageListViewModel", "LoadMessageList: loading completed");
                    mutableLiveData = this.this$0.valueOf;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 5;
                    if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                    }
                    this.this$0.copydefault();
                    return Unit.INSTANCE;
                }
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C56391yDq.AEQbTJ(obj);
                            this.this$0.copydefault();
                            return Unit.INSTANCE;
                        }
                        C56391yDq.AEQbTJ(obj);
                        pUU.KWHzl("MessageListViewModel", "LoadMessageList: loading completed");
                        mutableLiveData = this.this$0.valueOf;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.label = 5;
                        if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        this.this$0.copydefault();
                        return Unit.INSTANCE;
                    }
                    MessageListViewModel messageListViewModel4 = (MessageListViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    obj2 = null;
                    r1 = messageListViewModel4;
                    try {
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        messageListViewModel = r1;
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        messageListViewModel = r1;
                    }
                    this.L$0 = obj2;
                    this.L$1 = obj2;
                    this.L$2 = obj2;
                    this.label = 4;
                    if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    pUU.KWHzl("MessageListViewModel", "LoadMessageList: loading completed");
                    mutableLiveData = this.this$0.valueOf;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 5;
                    if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                    }
                    this.this$0.copydefault();
                    return Unit.INSTANCE;
                }
                MessageListViewModel messageListViewModel5 = (MessageListViewModel) this.L$2;
                messageListViewModel3 = (MessageListViewModel) this.L$1;
                Long l2 = (Long) this.L$0;
                C56391yDq.AEQbTJ(obj);
                l = l2;
                obj2 = null;
                i = 1;
                messageListViewModel2 = messageListViewModel5;
                objInitMessageListModel$default = obj;
                try {
                    C36558odI c36558odI = (C36558odI) objInitMessageListModel$default;
                    if (l == null) {
                        i2 = i;
                    } else {
                        i2 = c36558odI.copydefault() != null ? 5 : 0;
                    }
                    pUU.EZpvd("MessageListViewModel", "initMessageListModel setMessageListModel");
                    actionBar = new MessageListViewModel.ActionBar(c36558odI, C56443yFo.AEQbTJ(i2));
                    this.L$0 = messageListViewModel2;
                    this.L$1 = obj2;
                    this.L$2 = obj2;
                    this.label = 3;
                } catch (Throwable th4) {
                    th = th4;
                    r1 = messageListViewModel2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    messageListViewModel = r1;
                    this.L$0 = obj2;
                    this.L$1 = obj2;
                    this.L$2 = obj2;
                    this.label = 4;
                    if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                    }
                    pUU.KWHzl("MessageListViewModel", "LoadMessageList: loading completed");
                    mutableLiveData = this.this$0.valueOf;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.label = 5;
                    if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                    }
                    this.this$0.copydefault();
                    return Unit.INSTANCE;
                }
                if (messageListViewModel3.EZpvd(actionBar, (Continuation<? super Unit>) this) != objCopydefault) {
                    return objCopydefault;
                }
                r1 = messageListViewModel2;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                messageListViewModel = r1;
                this.L$0 = obj2;
                this.L$1 = obj2;
                this.L$2 = obj2;
                this.label = 4;
                if (messageListViewModel.AEQbTJ(objM7377constructorimpl, (Continuation<? super Unit>) this) == objCopydefault) {
                }
                pUU.KWHzl("MessageListViewModel", "LoadMessageList: loading completed");
                mutableLiveData = this.this$0.valueOf;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.label = 5;
                if (C36588odm.KWHzl(mutableLiveData, boolKWHzl, this) == objCopydefault) {
                }
                this.this$0.copydefault();
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("MessageListViewModel", "LoadMessageList: startLoading");
        MessageListViewModel messageListViewModel6 = this.this$0;
        String str = this.$channelId;
        Long l3 = this.$targetMessageId;
        String str2 = this.$searchKey;
        Result.Application application3 = Result.Companion;
        pUU.EZpvd("MessageListViewModel", "initMessageListModel processing");
        C36593odr c36593odr = messageListViewModel6.QVAiDq;
        this.L$0 = l3;
        this.L$1 = messageListViewModel6;
        this.L$2 = messageListViewModel6;
        this.label = 2;
        MessageListViewModel messageListViewModel7 = messageListViewModel6;
        obj2 = null;
        i = 1;
        objInitMessageListModel$default = C36593odr.initMessageListModel$default(c36593odr, str, l3, str2, false, this, 8, null);
        if (objInitMessageListModel$default == objCopydefault) {
            return objCopydefault;
        }
        l = l3;
        messageListViewModel3 = messageListViewModel7;
        messageListViewModel2 = messageListViewModel3;
        C36558odI c36558odI2 = (C36558odI) objInitMessageListModel$default;
        if (l == null) {
        }
        pUU.EZpvd("MessageListViewModel", "initMessageListModel setMessageListModel");
        actionBar = new MessageListViewModel.ActionBar(c36558odI2, C56443yFo.AEQbTJ(i2));
        this.L$0 = messageListViewModel2;
        this.L$1 = obj2;
        this.L$2 = obj2;
        this.label = 3;
        if (messageListViewModel3.EZpvd(actionBar, (Continuation<? super Unit>) this) != objCopydefault) {
        }
    }
}
