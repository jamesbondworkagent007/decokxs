package aws.smithy.kotlin.runtime.serde.xml;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.C5121Fn;

/* JADX INFO: loaded from: classes21.dex */
public final class XmlMapSerializer$entry$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Integer $value;
    final /* synthetic */ C5121Fn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmlMapSerializer$entry$1(C5121Fn c5121Fn, Integer num) {
        super(0);
        this.this$0 = c5121Fn;
        this.$value = num;
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
        this.this$0.OLrzqt.KWHzl(String.valueOf(this.$value));
    }
}
