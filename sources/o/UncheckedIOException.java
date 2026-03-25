package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.UTFDataFormatException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class UncheckedIOException {
    public static final UTFDataFormatException OLrzqt(@NotNull DT dt) {
        Intrinsics.checkNotNullParameter(dt, "");
        return (UTFDataFormatException) dt.EZpvd(UTFDataFormatException.OLrzqt.AEQbTJ(), new Function0<UTFDataFormatException>() { // from class: aws.sdk.kotlin.runtime.http.operation.CustomUserAgentMetadataKt$customUserAgentMetadata$1
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final UTFDataFormatException invoke() {
                return new UTFDataFormatException(null, null, 3, null);
            }
        });
    }
}
