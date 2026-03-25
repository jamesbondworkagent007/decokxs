package aws.smithy.kotlin.runtime.time;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C5178Hs;
import o.C5181Hv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ParsersKt$parseRfc5322$3 extends FunctionReferenceImpl implements Function2<String, Integer, C5178Hs<? extends Character>> {
    public static final ParsersKt$parseRfc5322$3 INSTANCE = new ParsersKt$parseRfc5322$3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ParsersKt$parseRfc5322$3() {
        super(2, C5181Hv.class, "sp", "sp(Ljava/lang/String;I)Laws/smithy/kotlin/runtime/time/ParseResult;", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ C5178Hs<? extends Character> invoke(String str, Integer num) {
        return invoke(str, num.intValue());
    }

    public final C5178Hs<Character> invoke(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return C5181Hv.KWHzl(str, i);
    }
}
