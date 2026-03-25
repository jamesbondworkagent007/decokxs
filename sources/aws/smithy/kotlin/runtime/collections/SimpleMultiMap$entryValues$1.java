package aws.smithy.kotlin.runtime.collections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC59400zgN;
import o.C56374yD;
import o.C56391yDq;
import o.C56442yFn;
import o.C58214yx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: classes2.dex */
public final class SimpleMultiMap$entryValues$1<K, V> extends RestrictedSuspendLambda implements Function2<AbstractC59400zgN<? super Map.Entry<? extends K, ? extends V>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C56374yD<K, V> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleMultiMap$entryValues$1(C56374yD<K, V> c56374yD, Continuation<? super SimpleMultiMap$entryValues$1> continuation) {
        super(2, continuation);
        this.this$0 = c56374yD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        SimpleMultiMap$entryValues$1 simpleMultiMap$entryValues$1 = new SimpleMultiMap$entryValues$1(this.this$0, continuation);
        simpleMultiMap$entryValues$1.L$0 = obj;
        return simpleMultiMap$entryValues$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull AbstractC59400zgN<? super Map.Entry<? extends K, ? extends V>> abstractC59400zgN, Continuation<? super Unit> continuation) {
        return ((SimpleMultiMap$entryValues$1) create(abstractC59400zgN, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:12:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        AbstractC59400zgN abstractC59400zgN;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            abstractC59400zgN = (AbstractC59400zgN) this.L$0;
            it = this.this$0.entrySet().iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) this.L$3;
            Object key = this.L$2;
            it = (Iterator) this.L$1;
            abstractC59400zgN = (AbstractC59400zgN) this.L$0;
            C56391yDq.AEQbTJ(obj);
            while (it2.hasNext()) {
                C58214yx c58214yx = new C58214yx(key, it2.next());
                this.L$0 = abstractC59400zgN;
                this.L$1 = it;
                this.L$2 = key;
                this.L$3 = it2;
                this.label = 1;
                if (abstractC59400zgN.KWHzl(c58214yx, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                key = entry.getKey();
                it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                }
                if (it.hasNext()) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
