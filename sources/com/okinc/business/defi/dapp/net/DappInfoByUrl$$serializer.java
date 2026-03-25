package com.okinc.business.defi.dapp.net;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class DappInfoByUrl$$serializer implements GeneratedSerializer<DappInfoByUrl> {
    public static final int $stable;
    public static final DappInfoByUrl$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DappInfoByUrl$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DappInfoByUrl$$serializer dappInfoByUrl$$serializer = new DappInfoByUrl$$serializer();
        INSTANCE = dappInfoByUrl$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.dapp.net.DappInfoByUrl", dappInfoByUrl$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("aaPromptFlag", false);
        pluginGeneratedSerialDescriptor.addElement("chainIdList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(DappInfoByUrl.$childSerializers[2])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DappInfoByUrl deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        int i;
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DappInfoByUrl.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str = strDecodeStringElement;
            i = 7;
            z = zDecodeBooleanElement;
        } else {
            ArrayList arrayList2 = null;
            String strDecodeStringElement2 = null;
            int i2 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z2 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], arrayList2);
                    i2 |= 4;
                }
            }
            arrayList = arrayList2;
            i = i2;
            str = strDecodeStringElement2;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DappInfoByUrl(i, str, z, arrayList, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DappInfoByUrl dappInfoByUrl) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dappInfoByUrl, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DappInfoByUrl.write$Self$OKDiscover_discover_impl(dappInfoByUrl, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
