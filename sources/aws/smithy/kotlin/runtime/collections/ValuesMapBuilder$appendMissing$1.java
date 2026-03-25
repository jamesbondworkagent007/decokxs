package aws.smithy.kotlin.runtime.collections;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C56509yI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class ValuesMapBuilder$appendMissing$1<T> extends Lambda implements Function2<String, List<? extends T>, Unit> {
    final /* synthetic */ C56509yI<T> this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuesMapBuilder$appendMissing$1(C56509yI<T> c56509yI) {
        super(2);
        this.this$0 = c56509yI;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj) {
        invoke(str, (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.this$0.KWHzl(str, (Iterable) list);
    }
}
