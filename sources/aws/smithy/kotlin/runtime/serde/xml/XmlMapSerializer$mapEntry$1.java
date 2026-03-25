package aws.smithy.kotlin.runtime.serde.xml;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o.C5101Et;
import o.C5121Fn;
import o.InterfaceC5097Ep;

/* JADX INFO: loaded from: classes21.dex */
public final class XmlMapSerializer$mapEntry$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<InterfaceC5097Ep, Unit> $block;
    final /* synthetic */ C5101Et $mapDescriptor;
    final /* synthetic */ C5121Fn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.Ep, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public XmlMapSerializer$mapEntry$1(C5101Et c5101Et, C5121Fn c5121Fn, Function1<? super InterfaceC5097Ep, Unit> function1) {
        super(0);
        this.$mapDescriptor = c5101Et;
        this.this$0 = c5121Fn;
        this.$block = function1;
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
        this.$block.invoke(new C5121Fn(this.$mapDescriptor, this.this$0.OLrzqt, this.this$0.copydefault, true));
    }
}
