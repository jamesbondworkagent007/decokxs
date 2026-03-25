package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import o.AbstractC5169Hj;
import o.C5174Ho;
import o.C5178Hs;
import o.C56548yJl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ParserCombinatorsKt$takeTill$1 extends Lambda implements Function2<String, Integer, C5178Hs<? extends IntRange>> {
    final /* synthetic */ Function1<Character, Boolean> $predicate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ParserCombinatorsKt$takeTill$1(Function1<? super Character, Boolean> function1) {
        super(2);
        this.$predicate = function1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ C5178Hs<? extends IntRange> invoke(String str, Integer num) {
        return invoke(str, num.intValue());
    }

    public final C5178Hs<IntRange> invoke(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C5174Ho.precond$default(str, i, 0, 4, null);
        int i2 = i;
        while (i2 < str.length() && !this.$predicate.invoke(Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        if (i2 == str.length()) {
            throw new IncompleteException(str, AbstractC5169Hj.TaskDescription.AEQbTJ);
        }
        return new C5178Hs<>(i2, C56548yJl.AhwBna(i, i2));
    }
}
