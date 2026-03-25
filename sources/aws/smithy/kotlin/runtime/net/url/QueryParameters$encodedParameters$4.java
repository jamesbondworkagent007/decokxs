package aws.smithy.kotlin.runtime.net.url;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5166Hg;
import o.InterfaceC5164He;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class QueryParameters$encodedParameters$4 extends FunctionReferenceImpl implements Function1<String, C5166Hg> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QueryParameters$encodedParameters$4(Object obj) {
        super(1, obj, InterfaceC5164He.class, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C5166Hg invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return ((InterfaceC5164He) this.receiver).OLrzqt(str);
    }
}
