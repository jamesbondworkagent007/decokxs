package uniffi.account;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.AbstractC58575zHl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58571zHh;
import uniffi.RustBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1 extends SuspendLambda implements Function1<Continuation<? super AbstractC58575zHl>, Object> {
    final /* synthetic */ byte $allowResetMfa;
    final /* synthetic */ RustBuffer.ByValue $scenario;
    final /* synthetic */ RustBuffer.ByValue $sessionId;
    final /* synthetic */ InterfaceC58571zHh $uniffiObj;
    final /* synthetic */ RustBuffer.ByValue $uploadIdReminderContent;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1(InterfaceC58571zHh interfaceC58571zHh, RustBuffer.ByValue byValue, RustBuffer.ByValue byValue2, RustBuffer.ByValue byValue3, byte b, Continuation<? super uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1> continuation) {
        super(1, continuation);
        this.$uniffiObj = interfaceC58571zHh;
        this.$sessionId = byValue;
        this.$scenario = byValue2;
        this.$uploadIdReminderContent = byValue3;
        this.$allowResetMfa = b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1(this.$uniffiObj, this.$sessionId, this.$scenario, this.$uploadIdReminderContent, this.$allowResetMfa, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super AbstractC58575zHl> continuation) {
        return ((uniffiCallbackInterfaceMfaServiceTrait$verifyMfa$callback$makeCall$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC58571zHh interfaceC58571zHh = this.$uniffiObj;
            String strLift2 = FfiConverterString.INSTANCE.lift2(this.$sessionId);
            MfaScenario mfaScenario = (MfaScenario) FfiConverterTypeMfaScenario.INSTANCE.lift2(this.$scenario);
            String strLift22 = FfiConverterOptionalString.INSTANCE.lift2(this.$uploadIdReminderContent);
            boolean zBooleanValue = FfiConverterBoolean.INSTANCE.lift(this.$allowResetMfa).booleanValue();
            this.label = 1;
            obj = interfaceC58571zHh.OLrzqt(strLift2, mfaScenario, strLift22, zBooleanValue, this);
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
