package aws.smithy.kotlin.runtime.http.engine.okhttp;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpEngineEventListener$trace$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Function0<String> $msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpEngineEventListener$trace$1(Function0<String> function0) {
        super(0);
        this.$msg = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$msg.invoke();
    }
}
