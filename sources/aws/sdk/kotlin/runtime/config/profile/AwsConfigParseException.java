package aws.sdk.kotlin.runtime.config.profile;

import aws.sdk.kotlin.runtime.ConfigurationException;
import kotlin.jvm.internal.Intrinsics;
import o.ObjectStreamClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AwsConfigParseException extends ConfigurationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwsConfigParseException(@NotNull String str, int i) {
        super(ObjectStreamClass.KWHzl(str, Integer.valueOf(i)));
        Intrinsics.checkNotNullParameter(str, "");
    }
}
