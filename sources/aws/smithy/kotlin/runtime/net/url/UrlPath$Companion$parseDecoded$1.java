package aws.smithy.kotlin.runtime.net.url;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlPath$Companion$parseDecoded$1 extends Lambda implements Function1<DS.TaskDescription, Unit> {
    final /* synthetic */ String $decoded;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlPath$Companion$parseDecoded$1(String str) {
        super(1);
        this.$decoded = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DS.TaskDescription taskDescription) {
        invoke2(taskDescription);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DS.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        taskDescription.AEQbTJ(this.$decoded);
    }
}
