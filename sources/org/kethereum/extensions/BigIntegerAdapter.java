package org.kethereum.extensions;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class BigIntegerAdapter {
    @ToJson
    public final String toJson(@NotNull BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        String string = bigInteger.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @FromJson
    public final BigInteger fromJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BigInteger(str);
    }
}
