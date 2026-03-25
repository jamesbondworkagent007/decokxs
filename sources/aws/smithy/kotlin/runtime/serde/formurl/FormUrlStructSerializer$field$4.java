package aws.smithy.kotlin.runtime.serde.formurl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.EG;

/* JADX INFO: loaded from: classes2.dex */
public final class FormUrlStructSerializer$field$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ char $value;
    final /* synthetic */ EG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormUrlStructSerializer$field$4(EG eg, char c) {
        super(0);
        this.this$0 = eg;
        this.$value = c;
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
        this.this$0.copydefault(this.$value);
    }
}
