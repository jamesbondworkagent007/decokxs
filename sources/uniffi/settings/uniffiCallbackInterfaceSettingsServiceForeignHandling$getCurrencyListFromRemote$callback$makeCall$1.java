package uniffi.settings;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.BmO;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC4736Bpc;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super List<? extends BmO>>, Object> {
    final /* synthetic */ InterfaceC4736Bpc $uniffiObj;
    final /* synthetic */ byte $useCache;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1(InterfaceC4736Bpc interfaceC4736Bpc, byte b, Continuation<? super uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC4736Bpc;
        this.$useCache = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1(this.$uniffiObj, this.$useCache, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends BmO>> continuation) {
        return invoke2((Continuation<? super List<BmO>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<BmO>> continuation) {
        return ((uniffiCallbackInterfaceSettingsServiceForeignHandling$getCurrencyListFromRemote$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC4736Bpc interfaceC4736Bpc = this.$uniffiObj;
            boolean zBooleanValue = FfiConverterBoolean.INSTANCE.lift(this.$useCache).booleanValue();
            this.label = 1;
            obj = interfaceC4736Bpc.KWHzl(zBooleanValue, this);
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
