package com.okinc.im.deeplink;

import android.app.Activity;
import android.content.Context;
import com.okinc.core.util.ScannerActivity;
import com.okinc.im.deeplink.IMDeeplinkHandler$handleJoinGroup$1;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C34168nTy;
import o.C35358ntn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class IMDeeplinkHandler$handleJoinGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $inviteId;
    final /* synthetic */ Activity $suitableActivity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35358ntn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMDeeplinkHandler$handleJoinGroup$1(C35358ntn c35358ntn, Activity activity, String str, String str2, Context context, Continuation<? super IMDeeplinkHandler$handleJoinGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = c35358ntn;
        this.$suitableActivity = activity;
        this.$channelId = str;
        this.$inviteId = str2;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IMDeeplinkHandler$handleJoinGroup$1 iMDeeplinkHandler$handleJoinGroup$1 = new IMDeeplinkHandler$handleJoinGroup$1(this.this$0, this.$suitableActivity, this.$channelId, this.$inviteId, this.$context, continuation);
        iMDeeplinkHandler$handleJoinGroup$1.L$0 = obj;
        return iMDeeplinkHandler$handleJoinGroup$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMDeeplinkHandler$handleJoinGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35358ntn c35358ntn = this.this$0;
                Activity activity = this.$suitableActivity;
                String str = this.$channelId;
                String str2 = this.$inviteId;
                final Context context = this.$context;
                Result.Application application = Result.Companion;
                C34168nTy c34168nTyAEQbTJ = c35358ntn.AEQbTJ(activity);
                Function0 function0 = new Function0() { // from class: o.nto
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return IMDeeplinkHandler$handleJoinGroup$1.invokeSuspend$lambda$1$lambda$0(context);
                    }
                };
                this.label = 1;
                if (C34168nTy.check$default(c34168nTyAEQbTJ, activity, str, str2, false, function0, this, 8, null) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.copydefault("IMDeeplinkHandler", "handleJoinGroup, error calling joinGroupEntryHelper: " + thM7380exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(Context context) {
        if ((context instanceof ScannerActivity) || (context instanceof WebActivity)) {
            ((AbstractActivityC33041mov) context).finish();
        }
        return Unit.INSTANCE;
    }
}
