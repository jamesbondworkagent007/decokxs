package com.okinc.ok_kyc_core.domain.usecase;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WCResultResp;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.AbstractC43728ruk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC41969rBm;
import o.rBH;

/* JADX INFO: loaded from: classes23.dex */
public final class GetWCResultUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43728ruk<? extends WCResultResp, ? extends ResponseFailedException>>, Object> {
    final /* synthetic */ Map<String, String> $param;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rBH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWCResultUseCase$invoke$2(rBH rbh, String str, Map<String, String> map, Continuation<? super GetWCResultUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = rbh;
        this.$url = str;
        this.$param = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GetWCResultUseCase$invoke$2 getWCResultUseCase$invoke$2 = new GetWCResultUseCase$invoke$2(this.this$0, this.$url, this.$param, continuation);
        getWCResultUseCase$invoke$2.L$0 = obj;
        return getWCResultUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43728ruk<? extends WCResultResp, ? extends ResponseFailedException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43728ruk<WCResultResp, ResponseFailedException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43728ruk<WCResultResp, ResponseFailedException>> continuation) {
        return ((GetWCResultUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0069 -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Integer status;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) obj;
            status = ((WCResultResp) abstractC43728ruk.copydefault()).getStatus();
            if (status == null || status.intValue() != 0) {
                return abstractC43728ruk;
            }
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(2000L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            InterfaceC41969rBm interfaceC41969rBm = this.this$0.AEQbTJ;
            String str = this.$url;
            Map<String, String> map = this.$param;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = interfaceC41969rBm.djBIcL(str, map, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            AbstractC43728ruk abstractC43728ruk2 = (AbstractC43728ruk) obj;
            status = ((WCResultResp) abstractC43728ruk2.copydefault()).getStatus();
            if (status == null) {
                this.L$0 = coroutineScope;
                this.label = 2;
                if (DelayKt.delay(2000L, this) == objCopydefault) {
                }
                if (!CoroutineScopeKt.isActive(coroutineScope)) {
                    return new AbstractC43728ruk.ActionBar(new WCResultResp(C56443yFo.AEQbTJ(-1)));
                }
            }
            return abstractC43728ruk2;
        }
    }
}
