package aws.smithy.kotlin.runtime.http.engine.okhttp;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AV;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.DD;
import o.DE;
import o.DF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OkHttpDns$lookup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InetAddress>>, Object> {
    final /* synthetic */ String $hostname;
    int label;
    final /* synthetic */ AV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttpDns$lookup$1(AV av, String str, Continuation<? super OkHttpDns$lookup$1> continuation) {
        super(2, continuation);
        this.this$0 = av;
        this.$hostname = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new OkHttpDns$lookup$1(this.this$0, this.$hostname, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super List<? extends InetAddress>> continuation) {
        return ((OkHttpDns$lookup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DE de = this.this$0.EZpvd;
            String str = this.$hostname;
            this.label = 1;
            obj = de.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(DF.KWHzl((DD) it.next()));
        }
        return arrayList;
    }
}
