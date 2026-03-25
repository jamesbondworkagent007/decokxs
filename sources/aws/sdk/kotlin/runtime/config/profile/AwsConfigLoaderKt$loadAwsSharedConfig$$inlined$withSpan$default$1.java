package aws.sdk.kotlin.runtime.config.profile;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C5070Do;
import o.C5141Gh;
import o.C56391yDq;
import o.C56442yFn;
import o.GU;
import o.HL;
import o.InterfaceC5148Go;
import o.ObjectInput;
import o.ObjectOutput;
import o.ObjectOutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ObjectOutputStream>, Object> {
    final /* synthetic */ ObjectOutput $configurationSource$inlined;
    final /* synthetic */ HL $platform$inlined;
    final /* synthetic */ String $profileNameOverride$inlined;
    final /* synthetic */ GU $span;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1(GU gu, Continuation continuation, ObjectOutput objectOutput, HL hl, String str) {
        super(2, continuation);
        this.$span = gu;
        this.$configurationSource$inlined = objectOutput;
        this.$platform$inlined = hl;
        this.$profileNameOverride$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1 awsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1 = new AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1(this.$span, continuation, this.$configurationSource$inlined, this.$platform$inlined, this.$profileNameOverride$inlined);
        awsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1.L$0 = obj;
        return awsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super ObjectOutputStream> continuation) {
        return ((AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ObjectOutput objectOutputKWHzl = this.$configurationSource$inlined;
            if (objectOutputKWHzl == null) {
                objectOutputKWHzl = ObjectInput.KWHzl(this.$platform$inlined, this.$profileNameOverride$inlined);
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(coroutineScope.getCoroutineContext(), "AwsConfigParser");
            CoroutineDispatcher coroutineDispatcherAEQbTJ = C5070Do.OLrzqt.AEQbTJ();
            AwsConfigLoaderKt$loadAwsSharedConfig$2$1 awsConfigLoaderKt$loadAwsSharedConfig$2$1 = new AwsConfigLoaderKt$loadAwsSharedConfig$2$1(interfaceC5148GoOLrzqt, this.$platform$inlined, objectOutputKWHzl, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcherAEQbTJ, awsConfigLoaderKt$loadAwsSharedConfig$2$1, this);
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
