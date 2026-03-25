package com.okinc.okimcore.model.utility;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class UriSerializer implements KSerializer<Uri> {
    public static final int $stable = 0;
    public static final UriSerializer INSTANCE = new UriSerializer();

    private UriSerializer() {
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public Uri deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        Uri uri = Uri.parse(decoder.decodeString());
        Intrinsics.checkNotNullExpressionValue(uri, "");
        return uri;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return SerialDescriptorsKt.PrimitiveSerialDescriptor("Uri", PrimitiveKind.STRING.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(uri, "");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        encoder.encodeString(string);
    }
}
