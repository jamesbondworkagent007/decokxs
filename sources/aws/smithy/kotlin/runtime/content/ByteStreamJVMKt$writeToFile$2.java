package aws.smithy.kotlin.runtime.content;

import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC59439zh;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59545zj;
import o.CK;
import o.CO;
import o.CS;
import o.CX;
import o.InterfaceC5058Dc;
import o.InterfaceC5060De;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ByteStreamJVMKt$writeToFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Long>, Object> {
    final /* synthetic */ File $file;
    final /* synthetic */ AbstractC59439zh $this_writeToFile;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteStreamJVMKt$writeToFile$2(AbstractC59439zh abstractC59439zh, File file, Continuation<? super ByteStreamJVMKt$writeToFile$2> continuation) {
        super(2, continuation);
        this.$this_writeToFile = abstractC59439zh;
        this.$file = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new ByteStreamJVMKt$writeToFile$2(this.$this_writeToFile, this.$file, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Long> continuation) {
        return ((ByteStreamJVMKt$writeToFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        InterfaceC5060De interfaceC5060DeAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC59439zh abstractC59439zh = this.$this_writeToFile;
            if (abstractC59439zh instanceof AbstractC59439zh.Activity) {
                File file = this.$file;
                CS csEZpvd = ((AbstractC59439zh.Activity) abstractC59439zh).EZpvd();
                this.label = 1;
                obj = C59545zj.KWHzl(file, csEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (abstractC59439zh instanceof AbstractC59439zh.Application) {
                    interfaceC5060DeAEQbTJ = CX.EZpvd(((AbstractC59439zh.Application) abstractC59439zh).EZpvd());
                } else {
                    if (!(abstractC59439zh instanceof AbstractC59439zh.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC5060DeAEQbTJ = ((AbstractC59439zh.StateListAnimator) abstractC59439zh).AEQbTJ();
                }
                InterfaceC5058Dc interfaceC5058DcAEQbTJ = CK.AEQbTJ(this.$file);
                try {
                    CO coAEQbTJ = CX.AEQbTJ(interfaceC5058DcAEQbTJ);
                    try {
                        long jKWHzl = coAEQbTJ.KWHzl(interfaceC5060DeAEQbTJ);
                        yFA.copydefault(coAEQbTJ, null);
                        Long lKWHzl = C56443yFo.KWHzl(jKWHzl);
                        yFA.copydefault(interfaceC5058DcAEQbTJ, null);
                        return lKWHzl;
                    } finally {
                    }
                } finally {
                }
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
