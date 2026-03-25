package com.okinc.okex.uploadlog.viewmodel;

import android.net.Uri;
import com.okinc.okex.uploadlog.bean.ElementValue;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLogViewModel$validFormState$1 extends SuspendLambda implements yHO<Map<String, ? extends ElementValue>, List<? extends Uri>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ UploadLogViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLogViewModel$validFormState$1(UploadLogViewModel uploadLogViewModel, Continuation<? super UploadLogViewModel$validFormState$1> continuation) {
        super(3, continuation);
        this.this$0 = uploadLogViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(Map<String, ? extends ElementValue> map, List<? extends Uri> list, Continuation<? super Boolean> continuation) {
        UploadLogViewModel$validFormState$1 uploadLogViewModel$validFormState$1 = new UploadLogViewModel$validFormState$1(this.this$0, continuation);
        uploadLogViewModel$validFormState$1.L$0 = map;
        uploadLogViewModel$validFormState$1.L$1 = list;
        return uploadLogViewModel$validFormState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.this$0.fARcdN.OLrzqt((List) this.this$0.AhwBna.getValue(), (Map) this.L$0, (List) this.L$1));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
