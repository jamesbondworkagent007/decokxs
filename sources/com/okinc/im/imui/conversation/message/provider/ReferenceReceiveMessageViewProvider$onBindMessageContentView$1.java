package com.okinc.im.imui.conversation.message.provider;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.bean.IMUserInfo;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C35254nrp;
import o.C35697oAi;
import o.C35712oAx;
import o.C56391yDq;
import o.C56442yFn;
import o.nBX;
import o.nDB;
import o.sDN;

/* JADX INFO: loaded from: classes18.dex */
public final class ReferenceReceiveMessageViewProvider$onBindMessageContentView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ nDB.Application $callbacks;
    final /* synthetic */ nDB.TaskDescription $container;
    final /* synthetic */ OKReferenceMessage $content;
    final /* synthetic */ C35254nrp $item;
    int label;
    final /* synthetic */ nBX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReferenceReceiveMessageViewProvider$onBindMessageContentView$1(C35254nrp c35254nrp, OKReferenceMessage oKReferenceMessage, nDB.TaskDescription taskDescription, nDB.Application application, nBX nbx, Continuation<? super ReferenceReceiveMessageViewProvider$onBindMessageContentView$1> continuation) {
        super(2, continuation);
        this.$item = c35254nrp;
        this.$content = oKReferenceMessage;
        this.$container = taskDescription;
        this.$callbacks = application;
        this.this$0 = nbx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReferenceReceiveMessageViewProvider$onBindMessageContentView$1(this.$item, this.$content, this.$container, this.$callbacks, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReferenceReceiveMessageViewProvider$onBindMessageContentView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        IMUserInfo iMUserInfo;
        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ;
        AnonymousClass1 anonymousClass1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessage oKMessageAEQbTJ = nDB.copydefault.AEQbTJ(this.$item.OLrzqt(), this.$content);
            if (oKMessageAEQbTJ != null) {
                C35697oAi c35697oAi = C35697oAi.KWHzl;
                this.label = 1;
                obj = c35697oAi.OLrzqt(oKMessageAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                iMUserInfo = null;
                nDB.Activity activity = new nDB.Activity(this.$item, iMUserInfo, this.$content, OKMessage.MessageDirection.RECEIVE);
                mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
                anonymousClass1 = new AnonymousClass1(this.$container, this.$callbacks, activity, this.this$0, null);
                this.label = 2;
                if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        iMUserInfo = (IMUserInfo) obj;
        nDB.Activity activity2 = new nDB.Activity(this.$item, iMUserInfo, this.$content, OKMessage.MessageDirection.RECEIVE);
        mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
        anonymousClass1 = new AnonymousClass1(this.$container, this.$callbacks, activity2, this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversation.message.provider.ReferenceReceiveMessageViewProvider$onBindMessageContentView$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ nDB.Application $callbacks;
        final /* synthetic */ nDB.TaskDescription $container;
        final /* synthetic */ nDB.Activity $data;
        int label;
        final /* synthetic */ nBX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nDB.TaskDescription taskDescription, nDB.Application application, nDB.Activity activity, nBX nbx, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$container = taskDescription;
            this.$callbacks = application;
            this.$data = activity;
            this.this$0 = nbx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$container, this.$callbacks, this.$data, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Function0 function0HDKMBd;
            Function0 function0FetchVPNInfo;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                nDB ndb = nDB.copydefault;
                nDB.TaskDescription taskDescription = this.$container;
                nDB.Application application = this.$callbacks;
                nDB.Activity activity = this.$data;
                ndb.KWHzl(taskDescription, application, activity, (!C35712oAx.KWHzl(activity.KWHzl().OLrzqt().getConversationType()) || (function0FetchVPNInfo = this.this$0.fetchVPNInfo()) == null) ? null : (OKConversation) function0FetchVPNInfo.invoke(), (!C35712oAx.KWHzl(this.$data.KWHzl().OLrzqt().getConversationType()) || (function0HDKMBd = this.this$0.hDKMBd()) == null) ? null : (UserInfo) function0HDKMBd.invoke(), LifecycleOwnerKt.getLifecycleScope(this.this$0.DbNXlk()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
