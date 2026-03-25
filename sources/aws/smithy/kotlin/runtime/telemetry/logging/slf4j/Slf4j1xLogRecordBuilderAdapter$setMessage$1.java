package aws.smithy.kotlin.runtime.telemetry.logging.slf4j;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class Slf4j1xLogRecordBuilderAdapter$setMessage$1 extends Lambda implements Function0<String> {
    final /* synthetic */ String $message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Slf4j1xLogRecordBuilderAdapter$setMessage$1(String str) {
        super(0);
        this.$message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return this.$message;
    }
}
