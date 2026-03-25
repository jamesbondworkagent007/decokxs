package aws.smithy.kotlin.runtime.net.url;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UserInfo$Companion$parseDecoded$1 extends Lambda implements Function1<DU.Application, Unit> {
    final /* synthetic */ String $decoded;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfo$Companion$parseDecoded$1(String str) {
        super(1);
        this.$decoded = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DU.Application application) {
        invoke2(application);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DU.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.copydefault(this.$decoded);
    }
}
