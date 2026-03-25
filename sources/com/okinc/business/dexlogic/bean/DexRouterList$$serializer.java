package com.okinc.business.dexlogic.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DexRouterList$$serializer implements GeneratedSerializer<DexRouterList> {
    public static final int $stable;
    public static final DexRouterList$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexRouterList$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexRouterList$$serializer dexRouterList$$serializer = new DexRouterList$$serializer();
        INSTANCE = dexRouterList$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.DexRouterList", dexRouterList$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("percent", true);
        pluginGeneratedSerialDescriptor.addElement("router", true);
        pluginGeneratedSerialDescriptor.addElement("subRouterList", true);
        pluginGeneratedSerialDescriptor.addElement("isHeaderLocal", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = DexRouterList.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[2]), BooleanSerializer.INSTANCE, IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexRouterList deserialize(@NotNull Decoder decoder) {
        ArrayList arrayList;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        int iDecodeIntElement;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DexRouterList.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            arrayList = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            str2 = strDecodeStringElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            i = 31;
            str = strDecodeStringElement2;
        } else {
            ArrayList arrayList2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            int i3 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i3 |= 1;
                } else if (iDecodeElementIndex != 1) {
                    if (iDecodeElementIndex == 2) {
                        arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], arrayList2);
                        i2 = i3 | 4;
                    } else if (iDecodeElementIndex == 3) {
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i2 = i3 | 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i2 = i3 | 16;
                    }
                    i3 = i2;
                } else {
                    i3 |= 2;
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                }
            }
            arrayList = arrayList2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            iDecodeIntElement = iDecodeIntElement2;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexRouterList(i, str2, str, arrayList, zDecodeBooleanElement, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexRouterList dexRouterList) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexRouterList, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexRouterList.write$Self$OKDex_dex_impl(dexRouterList, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
