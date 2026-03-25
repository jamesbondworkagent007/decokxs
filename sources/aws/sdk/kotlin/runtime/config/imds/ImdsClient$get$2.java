package aws.sdk.kotlin.runtime.config.imds;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BP;
import o.C5036Cg;
import o.C56391yDq;
import o.C56442yFn;
import o.CG;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ImdsClient$get$2 extends SuspendLambda implements yHO<BP<C5036Cg>, CG<? super BP<C5036Cg>, ? extends String>, Continuation<? super String>, Object> {
    final /* synthetic */ String $path;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImdsClient$get$2(String str, Continuation<? super ImdsClient$get$2> continuation) {
        super(3, continuation);
        this.$path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(BP<C5036Cg> bp, CG<? super BP<C5036Cg>, ? extends String> cg, Continuation<? super String> continuation) {
        return invoke2(bp, (CG<? super BP<C5036Cg>, String>) cg, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull BP<C5036Cg> bp, @NotNull CG<? super BP<C5036Cg>, String> cg, Continuation<? super String> continuation) {
        ImdsClient$get$2 imdsClient$get$2 = new ImdsClient$get$2(this.$path, continuation);
        imdsClient$get$2.L$0 = bp;
        imdsClient$get$2.L$1 = cg;
        return imdsClient$get$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            BP bp = (BP) this.L$0;
            CG cg = (CG) this.L$1;
            ((C5036Cg) bp.EZpvd()).djBIcL().AYXKKw().EZpvd(this.$path);
            this.L$0 = null;
            this.label = 1;
            obj = cg.OLrzqt(bp, this);
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
