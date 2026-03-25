package aws.smithy.kotlin.runtime.serde.formurl;

import aws.smithy.kotlin.runtime.serde.SerializationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.EH;

/* JADX INFO: loaded from: classes2.dex */
public final class FormUrlMapSerializer$entry$8 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Double $value;
    final /* synthetic */ EH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormUrlMapSerializer$entry$8(Double d, EH eh) {
        super(0);
        this.$value = d;
        this.this$0 = eh;
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
        Double d = this.$value;
        if (d != null) {
            this.this$0.EZpvd(d.doubleValue());
            return;
        }
        throw new SerializationException("sparse collections are not supported by form-url encoding");
    }
}
