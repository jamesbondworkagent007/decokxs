package aws.smithy.kotlin.runtime.io;

import java.io.Closeable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C5067Dl;
import o.C56391yDq;
import o.C56442yFn;
import o.CQ;
import o.CT;
import o.InterfaceC5060De;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SdkSourceJVMKt$toSdkByteReadChannel$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C5067Dl $ch;
    final /* synthetic */ InterfaceC5060De $source;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkSourceJVMKt$toSdkByteReadChannel$job$1(C5067Dl c5067Dl, InterfaceC5060De interfaceC5060De, Continuation<? super SdkSourceJVMKt$toSdkByteReadChannel$job$1> continuation) {
        super(2, continuation);
        this.$ch = c5067Dl;
        this.$source = interfaceC5060De;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        SdkSourceJVMKt$toSdkByteReadChannel$job$1 sdkSourceJVMKt$toSdkByteReadChannel$job$1 = new SdkSourceJVMKt$toSdkByteReadChannel$job$1(this.$ch, this.$source, continuation);
        sdkSourceJVMKt$toSdkByteReadChannel$job$1.L$0 = obj;
        return sdkSourceJVMKt$toSdkByteReadChannel$job$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SdkSourceJVMKt$toSdkByteReadChannel$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, MOVE_EXCEPTION, THROW, THROW, INVOKE, MOVE_EXCEPTION, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, o.De] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM7377constructorimpl;
        CoroutineScope coroutineScope;
        CQ cq;
        int i;
        C5067Dl c5067Dl;
        Closeable closeable;
        ?? r12;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            cq = new CQ();
            InterfaceC5060De interfaceC5060De = this.$source;
            C5067Dl c5067Dl2 = this.$ch;
            Result.Application application2 = Result.Companion;
            i = 0;
            c5067Dl = c5067Dl2;
            closeable = interfaceC5060De;
            r12 = closeable;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            closeable = (Closeable) this.L$4;
            coroutineScope = (CoroutineScope) this.L$3;
            C5067Dl c5067Dl3 = (C5067Dl) this.L$2;
            InterfaceC5060De interfaceC5060De2 = (InterfaceC5060De) this.L$1;
            cq = (CQ) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                c5067Dl = c5067Dl3;
                r12 = interfaceC5060De2;
            } finally {
            }
            this.$ch.copydefault(Result.m7380exceptionOrNullimpl(objM7377constructorimpl));
            return Unit.INSTANCE;
        }
        CQ cq2 = cq;
        do {
            CoroutineScopeKt.ensureActive(coroutineScope);
            if (r12.KWHzl(cq2, 16384L) != -1) {
                this.L$0 = cq2;
                this.L$1 = r12;
                this.L$2 = c5067Dl;
                this.L$3 = coroutineScope;
                this.L$4 = closeable;
                this.I$0 = i;
                this.label = 1;
            } else {
                Unit unit = Unit.INSTANCE;
                if (i == 0) {
                    closeable.close();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
            }
            this.$ch.copydefault(Result.m7380exceptionOrNullimpl(objM7377constructorimpl));
            return Unit.INSTANCE;
        } while (CT.TaskDescription.write$default(c5067Dl, cq2, 0L, this, 2, null) != objCopydefault);
        return objCopydefault;
    }
}
