package aws.sdk.kotlin.runtime.config.profile;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.ObjectStreamClass;
import o.PutField;

/* JADX INFO: loaded from: classes.dex */
public final class AwsConfigParserKt$warnParse$1 extends Lambda implements Function0<String> {
    final /* synthetic */ Function0<String> $content;
    final /* synthetic */ PutField $line;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwsConfigParserKt$warnParse$1(Function0<String> function0, PutField putField) {
        super(0);
        this.$content = function0;
        this.$line = putField;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return ObjectStreamClass.KWHzl(this.$content.invoke(), Integer.valueOf(this.$line.OLrzqt()));
    }
}
