package aws.smithy.kotlin.runtime.serde.formurl;

import aws.smithy.kotlin.runtime.serde.SerializationException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.C5173Hn;
import o.EH;

/* JADX INFO: loaded from: classes2.dex */
public final class FormUrlMapSerializer$entry$10 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TimestampFormat $format;
    final /* synthetic */ C5173Hn $value;
    final /* synthetic */ EH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormUrlMapSerializer$entry$10(C5173Hn c5173Hn, EH eh, TimestampFormat timestampFormat) {
        super(0);
        this.$value = c5173Hn;
        this.this$0 = eh;
        this.$format = timestampFormat;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C5173Hn c5173Hn = this.$value;
        if (c5173Hn != null) {
            this.this$0.copydefault(c5173Hn, this.$format);
            return;
        }
        throw new SerializationException("sparse collections are not supported by form-url encoding");
    }
}
