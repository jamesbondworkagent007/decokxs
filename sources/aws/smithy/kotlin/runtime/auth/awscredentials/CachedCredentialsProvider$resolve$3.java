package aws.smithy.kotlin.runtime.auth.awscredentials;

import aws.smithy.kotlin.runtime.telemetry.logging.LogLevel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.C5141Gh;
import o.C5173Hn;
import o.C52751wX;
import o.C54967xb;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.HA;
import o.InterfaceC52697wV;
import o.InterfaceC52805wZ;
import o.InterfaceC57843yq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CachedCredentialsProvider$resolve$3 extends SuspendLambda implements Function1<Continuation<? super HA<InterfaceC52697wV>>, Object> {
    final /* synthetic */ InterfaceC57843yq $attributes;
    int label;
    final /* synthetic */ C52751wX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedCredentialsProvider$resolve$3(C52751wX c52751wX, InterfaceC57843yq interfaceC57843yq, Continuation<? super CachedCredentialsProvider$resolve$3> continuation) {
        super(1, continuation);
        this.this$0 = c52751wX;
        this.$attributes = interfaceC57843yq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new CachedCredentialsProvider$resolve$3(this.this$0, this.$attributes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super HA<InterfaceC52697wV>> continuation) {
        return ((CachedCredentialsProvider$resolve$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineContext context = getContext();
            AnonymousClass1 anonymousClass1 = new Function0<String>() { // from class: aws.smithy.kotlin.runtime.auth.awscredentials.CachedCredentialsProvider$resolve$3.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "refreshing credentials cache";
                }
            };
            LogLevel logLevel = LogLevel.Trace;
            String strGEmmrt = C56524yIo.AEQbTJ(C52751wX.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            C5141Gh.copydefault(context, logLevel, strGEmmrt, null, anonymousClass1);
            InterfaceC52805wZ interfaceC52805wZ = this.this$0.AhwBna;
            InterfaceC57843yq interfaceC57843yq = this.$attributes;
            this.label = 1;
            obj = interfaceC52805wZ.resolve(interfaceC57843yq, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC52697wV interfaceC52697wV = (InterfaceC52697wV) obj;
        C5173Hn c5173Hn = (C5173Hn) CollectionsKt___CollectionsKt.gGvvIC(yDY.valueOf(interfaceC52697wV.AEQbTJ(), this.this$0.AEQbTJ.EZpvd().copydefault(this.this$0.KWHzl)));
        C5173Hn c5173HnAEQbTJ = interfaceC52697wV.AEQbTJ();
        return new HA(C54967xb.copy$default(interfaceC52697wV, null, null, null, c5173HnAEQbTJ == null ? c5173Hn : c5173HnAEQbTJ, null, null, 55, null), c5173Hn);
    }
}
