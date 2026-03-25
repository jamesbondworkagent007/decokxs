package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C5178Hs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
public final class ParserCombinatorsKt$cond$1<T> extends Lambda implements Function2<String, Integer, C5178Hs<? extends T>> {
    final /* synthetic */ boolean $condition;
    final /* synthetic */ Function2<String, Integer, C5178Hs<T>> $parser;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, ? extends o.Hs<? extends T>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ParserCombinatorsKt$cond$1(boolean z, Function2<? super String, ? super Integer, ? extends C5178Hs<? extends T>> function2) {
        super(2);
        this.$condition = z;
        this.$parser = function2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(String str, Integer num) {
        return invoke(str, num.intValue());
    }

    public final C5178Hs<T> invoke(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.$condition) {
            return this.$parser.invoke(str, Integer.valueOf(i));
        }
        return new C5178Hs<>(i, null);
    }
}
