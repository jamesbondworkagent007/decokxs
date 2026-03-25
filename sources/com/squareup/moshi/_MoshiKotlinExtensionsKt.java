package com.squareup.moshi;

import androidx.exifinterface.media.ExifInterface;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC56559yJw;
import o.yJB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class _MoshiKotlinExtensionsKt {
    public static final /* synthetic */ <T> JsonAdapter<T> adapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "");
        Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
        return adapter(moshi, null);
    }

    public static final /* synthetic */ <T> Moshi.Builder addAdapter(Moshi.Builder builder, JsonAdapter<T> jsonAdapter) {
        Intrinsics.checkNotNullParameter(builder, "");
        Intrinsics.checkNotNullParameter(jsonAdapter, "");
        Intrinsics.KWHzl(6, ExifInterface.GPS_DIRECTION_TRUE);
        Moshi.Builder builderAdd = builder.add(yJB.AEQbTJ(null), jsonAdapter);
        Intrinsics.checkNotNullExpressionValue(builderAdd, "");
        return builderAdd;
    }

    public static final <T> JsonAdapter<T> adapter(@NotNull Moshi moshi, @NotNull InterfaceC56559yJw interfaceC56559yJw) {
        Intrinsics.checkNotNullParameter(moshi, "");
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        JsonAdapter<T> jsonAdapterAdapter = moshi.adapter(yJB.AEQbTJ(interfaceC56559yJw));
        if ((jsonAdapterAdapter instanceof NullSafeJsonAdapter) || (jsonAdapterAdapter instanceof NonNullJsonAdapter)) {
            return jsonAdapterAdapter;
        }
        if (interfaceC56559yJw.isMarkedNullable()) {
            JsonAdapter<T> jsonAdapterNullSafe = jsonAdapterAdapter.nullSafe();
            Intrinsics.checkNotNullExpressionValue(jsonAdapterNullSafe, "");
            return jsonAdapterNullSafe;
        }
        JsonAdapter<T> jsonAdapterNonNull = jsonAdapterAdapter.nonNull();
        Intrinsics.checkNotNullExpressionValue(jsonAdapterNonNull, "");
        return jsonAdapterNonNull;
    }
}
