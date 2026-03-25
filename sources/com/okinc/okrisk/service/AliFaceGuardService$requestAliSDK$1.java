package com.okinc.okrisk.service;

import android.app.Application;
import com.okinc.okrisk.OKRiskLibrarySource;
import com.okinc.okrisk.service.AliFaceGuardService$requestAliSDK$1;
import face.security.device.api.FaceSecInitListener;
import face.security.device.api.FaceSecToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32979mnm;
import o.C47220tlt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class AliFaceGuardService$requestAliSDK$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<FaceSecToken, Unit> $callback;
    final /* synthetic */ String $riskId;
    final /* synthetic */ OKRiskLibrarySource $source;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super face.security.device.api.FaceSecToken, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AliFaceGuardService$requestAliSDK$1(OKRiskLibrarySource oKRiskLibrarySource, String str, Function1<? super FaceSecToken, Unit> function1, Continuation<? super AliFaceGuardService$requestAliSDK$1> continuation) {
        super(2, continuation);
        this.$source = oKRiskLibrarySource;
        this.$riskId = str;
        this.$callback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AliFaceGuardService$requestAliSDK$1(this.$source, this.$riskId, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AliFaceGuardService$requestAliSDK$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AliFaceGuardService aliFaceGuardService = AliFaceGuardService.copydefault;
            Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            final OKRiskLibrarySource oKRiskLibrarySource = this.$source;
            final String str = this.$riskId;
            final Function1<FaceSecToken, Unit> function1 = this.$callback;
            AliFaceGuardService.init$default(aliFaceGuardService, applicationOLrzqt, null, new FaceSecInitListener() { // from class: o.tiG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // face.security.device.api.FaceSecInitListener
                public final void onInitFinish(int i) {
                    AliFaceGuardService$requestAliSDK$1.invokeSuspend$lambda$0(oKRiskLibrarySource, str, function1, i);
                }
            }, 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(OKRiskLibrarySource oKRiskLibrarySource, String str, Function1 function1, int i) {
        String str2;
        C47220tlt c47220tlt = C47220tlt.KWHzl;
        c47220tlt.copydefault(oKRiskLibrarySource.getTag(), "AliFaceGuard init " + oKRiskLibrarySource, String.valueOf(System.currentTimeMillis()), String.valueOf(i));
        FaceSecToken faceSecTokenAEQbTJ = AliFaceGuardService.copydefault.AEQbTJ(str);
        c47220tlt.copydefault(oKRiskLibrarySource.getTag(), "AliFaceGuard getDeviceToken " + oKRiskLibrarySource + ", token length: " + ((faceSecTokenAEQbTJ == null || (str2 = faceSecTokenAEQbTJ.token) == null) ? 0 : str2.length()), String.valueOf(System.currentTimeMillis()), String.valueOf(faceSecTokenAEQbTJ != null ? Integer.valueOf(faceSecTokenAEQbTJ.code) : null));
        function1.invoke(faceSecTokenAEQbTJ);
    }
}
