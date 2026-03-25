package com.okinc.im.imui.messageV2.view.messagelist;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.imui.messageV2.view.messagelist.MessageListViewModel;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C32989mnw;
import o.C35747oCe;
import o.C36558odI;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class MessageListViewModel$playAudio$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ OKMessage $message;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MessageListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListViewModel$playAudio$1(MessageListViewModel messageListViewModel, OKMessage oKMessage, Continuation<? super MessageListViewModel$playAudio$1> continuation) {
        super(1, continuation);
        this.this$0 = messageListViewModel;
        this.$message = oKMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MessageListViewModel$playAudio$1(this.this$0, this.$message, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MessageListViewModel$playAudio$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:8:0x001a, B:36:0x009d, B:38:0x00a3, B:41:0x00c1, B:42:0x00c3, B:13:0x0033, B:31:0x008d, B:33:0x0091, B:25:0x006f, B:27:0x0075, B:35:0x0096, B:16:0x003b, B:24:0x0061, B:19:0x0046, B:21:0x004e), top: B:48:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:8:0x001a, B:36:0x009d, B:38:0x00a3, B:41:0x00c1, B:42:0x00c3, B:13:0x0033, B:31:0x008d, B:33:0x0091, B:25:0x006f, B:27:0x0075, B:35:0x0096, B:16:0x003b, B:24:0x0061, B:19:0x0046, B:21:0x004e), top: B:48:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:8:0x001a, B:36:0x009d, B:38:0x00a3, B:41:0x00c1, B:42:0x00c3, B:13:0x0033, B:31:0x008d, B:33:0x0091, B:25:0x006f, B:27:0x0075, B:35:0x0096, B:16:0x003b, B:24:0x0061, B:19:0x0046, B:21:0x004e), top: B:48:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:8:0x001a, B:36:0x009d, B:38:0x00a3, B:41:0x00c1, B:42:0x00c3, B:13:0x0033, B:31:0x008d, B:33:0x0091, B:25:0x006f, B:27:0x0075, B:35:0x0096, B:16:0x003b, B:24:0x0061, B:19:0x0046, B:21:0x004e), top: B:48:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008a -> B:31:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MessageListViewModel messageListViewModel;
        Collection arrayList;
        Iterator it;
        MessageListViewModel messageListViewModel2;
        Iterator it2;
        MessageListViewModel messageListViewModel3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Unit unit = null;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            messageListViewModel = this.this$0;
            OKMessage oKMessage = this.$message;
            Result.Application application2 = Result.Companion;
            MessageListViewModel.ActionBar actionBar = messageListViewModel.AkhnZx;
            if (actionBar != null) {
                C35747oCe c35747oCe = messageListViewModel.hDKMBd;
                C36558odI c36558odIKWHzl = actionBar.KWHzl();
                this.L$0 = messageListViewModel;
                this.label = 1;
                obj = c35747oCe.KWHzl(c36558odIKWHzl, oKMessage, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            Result.m7377constructorimpl(unit);
            return Unit.INSTANCE;
        }
        if (i == 1) {
            messageListViewModel = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.L$1;
                messageListViewModel3 = (MessageListViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                while (it2.hasNext()) {
                    MessageListViewModel.Application application3 = (MessageListViewModel.Application) it2.next();
                    MutableLiveData mutableLiveData = messageListViewModel3.EZpvd;
                    C32989mnw c32989mnw = new C32989mnw(application3);
                    this.L$0 = messageListViewModel3;
                    this.L$1 = it2;
                    this.L$2 = null;
                    this.label = 3;
                    if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                unit = Unit.INSTANCE;
                Result.m7377constructorimpl(unit);
                return Unit.INSTANCE;
            }
            it = (Iterator) this.L$2;
            arrayList = (Collection) this.L$1;
            MessageListViewModel messageListViewModel4 = (MessageListViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            MessageListViewModel.Application application4 = (MessageListViewModel.Application) obj;
            if (application4 != null) {
                arrayList.add(application4);
            }
            messageListViewModel2 = messageListViewModel4;
            if (it.hasNext()) {
                C35747oCe.ActionBar actionBar2 = (C35747oCe.ActionBar) it.next();
                this.L$0 = messageListViewModel2;
                this.L$1 = arrayList;
                this.L$2 = it;
                this.label = 2;
                Object objKWHzl = messageListViewModel2.KWHzl(actionBar2, (Continuation<? super MessageListViewModel.Application>) this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                messageListViewModel4 = messageListViewModel2;
                obj = objKWHzl;
                MessageListViewModel.Application application42 = (MessageListViewModel.Application) obj;
                if (application42 != null) {
                }
                messageListViewModel2 = messageListViewModel4;
                if (it.hasNext()) {
                    it2 = ((List) arrayList).iterator();
                    messageListViewModel3 = messageListViewModel2;
                    while (it2.hasNext()) {
                    }
                    unit = Unit.INSTANCE;
                    Result.m7377constructorimpl(unit);
                    return Unit.INSTANCE;
                }
            }
        }
        arrayList = new ArrayList();
        MessageListViewModel messageListViewModel5 = messageListViewModel;
        it = ((List) obj).iterator();
        messageListViewModel2 = messageListViewModel5;
        if (it.hasNext()) {
        }
    }
}
