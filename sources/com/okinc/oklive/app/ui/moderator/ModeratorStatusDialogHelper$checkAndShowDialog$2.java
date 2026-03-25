package com.okinc.oklive.app.ui.moderator;

import android.content.Context;
import com.okinc.oklive.app.data.repository.remote.LiveStreamStatusModelResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;
import o.pUU;
import o.sTE;
import o.sTZ;
import o.sUW;

/* JADX INFO: loaded from: classes19.dex */
public final class ModeratorStatusDialogHelper$checkAndShowDialog$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $shareCode;
    int label;
    final /* synthetic */ sUW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeratorStatusDialogHelper$checkAndShowDialog$2(sUW suw, String str, Context context, Continuation<? super ModeratorStatusDialogHelper$checkAndShowDialog$2> continuation) {
        super(2, continuation);
        this.this$0 = suw;
        this.$shareCode = str;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModeratorStatusDialogHelper$checkAndShowDialog$2(this.this$0, this.$shareCode, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModeratorStatusDialogHelper$checkAndShowDialog$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("ModeratorStatusDialogHelper", "Error fetching moderator status", e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sTZ stz = this.this$0.copydefault;
            String str = this.$shareCode;
            this.label = 1;
            obj = stz.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
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
        LiveStreamStatusModelResponse liveStreamStatusModelResponse = (LiveStreamStatusModelResponse) obj;
        if (liveStreamStatusModelResponse == null) {
            pUU.copydefault("ModeratorStatusDialogHelper", "Failed to fetch status or response is null");
            return Unit.INSTANCE;
        }
        sTE moderatorInvitationResult = liveStreamStatusModelResponse.getModeratorInvitationResult();
        pUU.EZpvd("ModeratorStatusDialogHelper", "Moderator invitation result: " + moderatorInvitationResult);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$context, moderatorInvitationResult, this.$shareCode, null);
        this.label = 2;
        obj = BuildersKt.withContext(main, anonymousClass1, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.oklive.app.ui.moderator.ModeratorStatusDialogHelper$checkAndShowDialog$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ViewOnClickListenerC54939xaY>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ sTE $invitationResult;
        final /* synthetic */ String $shareCode;
        int label;
        final /* synthetic */ sUW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sUW suw, Context context, sTE ste, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = suw;
            this.$context = context;
            this.$invitationResult = ste;
            this.$shareCode = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$context, this.$invitationResult, this.$shareCode, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ViewOnClickListenerC54939xaY> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return this.this$0.KWHzl(this.$context, this.$invitationResult, this.$shareCode);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
