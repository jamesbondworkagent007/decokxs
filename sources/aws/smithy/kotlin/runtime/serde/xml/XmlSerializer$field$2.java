package aws.smithy.kotlin.runtime.serde.xml;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C5130Fw;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class XmlSerializer$field$2 extends FunctionReferenceImpl implements Function1<Character, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XmlSerializer$field$2(Object obj) {
        super(1, obj, C5130Fw.class, "serializeChar", "serializeChar(C)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(Character ch) {
        invoke(ch.charValue());
        return Unit.INSTANCE;
    }

    public final void invoke(char c) {
        ((C5130Fw) this.receiver).EZpvd(c);
    }
}
