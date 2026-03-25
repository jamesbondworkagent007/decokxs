package aws.smithy.kotlin.runtime.telemetry.logging;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes21.dex */
public final class LoggerKt$error$1 extends Lambda implements Function0<String> {
    final /* synthetic */ String $msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggerKt$error$1(String str) {
        super(0);
        this.$msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$msg;
    }
}
