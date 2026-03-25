package aws.smithy.kotlin.runtime.serde.formurl;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CO;
import o.CQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FormUrlListSerializer$serializeBoolean$1 extends Lambda implements Function1<CQ, Unit> {
    final /* synthetic */ boolean $value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormUrlListSerializer$serializeBoolean$1(boolean z) {
        super(1);
        this.$value = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
        invoke2(cq);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull CQ cq) throws IOException {
        Intrinsics.checkNotNullParameter(cq, "");
        CO.Application.writeUtf8$default(cq, String.valueOf(this.$value), 0, 0, 6, null);
    }
}
