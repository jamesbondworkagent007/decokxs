package aws.smithy.kotlin.runtime.serde.xml;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C5130Fw;
import o.InterfaceC5132Fy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class XmlSerializer$nullField$1 extends Lambda implements Function1<InterfaceC5132Fy, Unit> {
    final /* synthetic */ C5130Fw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmlSerializer$nullField$1(C5130Fw c5130Fw) {
        super(1);
        this.this$0 = c5130Fw;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5132Fy interfaceC5132Fy) {
        invoke2(interfaceC5132Fy);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy) {
        Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
        this.this$0.OLrzqt();
    }
}
