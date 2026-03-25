package aws.smithy.kotlin.runtime.serde.xml;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5130Fw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class XmlSerializer$numberField$1 extends FunctionReferenceImpl implements Function1<Number, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XmlSerializer$numberField$1(Object obj) {
        super(1, obj, C5130Fw.class, "serializeNumber", "serializeNumber(Ljava/lang/Number;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Number number) {
        invoke2(number);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "");
        ((C5130Fw) this.receiver).EZpvd(number);
    }
}
