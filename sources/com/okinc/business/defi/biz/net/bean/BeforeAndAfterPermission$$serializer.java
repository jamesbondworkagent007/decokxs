package com.okinc.business.defi.biz.net.bean;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BeforeAndAfterPermission$$serializer implements GeneratedSerializer<BeforeAndAfterPermission> {
    public static final int $stable;
    public static final BeforeAndAfterPermission$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private BeforeAndAfterPermission$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        BeforeAndAfterPermission$$serializer beforeAndAfterPermission$$serializer = new BeforeAndAfterPermission$$serializer();
        INSTANCE = beforeAndAfterPermission$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission", beforeAndAfterPermission$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_BEFORE, true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.RUBY_AFTER, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        Permission$$serializer permission$$serializer = Permission$$serializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(permission$$serializer), BuiltinSerializersKt.getNullable(permission$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final BeforeAndAfterPermission deserialize(@NotNull Decoder decoder) {
        Permission permission;
        Permission permission2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Permission$$serializer permission$$serializer = Permission$$serializer.INSTANCE;
            permission2 = (Permission) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, permission$$serializer, null);
            permission = (Permission) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, permission$$serializer, null);
            i = 3;
        } else {
            permission = null;
            Permission permission3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    permission3 = (Permission) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, Permission$$serializer.INSTANCE, permission3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    permission = (Permission) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Permission$$serializer.INSTANCE, permission);
                    i2 |= 2;
                }
            }
            permission2 = permission3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BeforeAndAfterPermission(i, permission2, permission, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull BeforeAndAfterPermission beforeAndAfterPermission) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(beforeAndAfterPermission, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BeforeAndAfterPermission.write$Self$OKWallet_wallet_api(beforeAndAfterPermission, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
