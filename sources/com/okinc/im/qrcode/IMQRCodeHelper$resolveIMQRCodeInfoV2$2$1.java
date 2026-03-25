package com.okinc.im.qrcode;

import com.okinc.okimcore.model.other.QRCodeResultInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sNF;

/* JADX INFO: loaded from: classes8.dex */
public final class IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super QRCodeResultInfo>, Object> {
    final /* synthetic */ String $data;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1(InterfaceC35180nqU interfaceC35180nqU, String str, Continuation<? super IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1> continuation) {
        super(2, continuation);
        this.$okimService = interfaceC35180nqU;
        this.$data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1(this.$okimService, this.$data, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super QRCodeResultInfo> continuation) {
        return ((IMQRCodeHelper$resolveIMQRCodeInfoV2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sNF snfDjBIcL = this.$okimService.AEQbTJ().djBIcL();
            String str = this.$data;
            this.label = 1;
            obj = snfDjBIcL.EZpvd(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
