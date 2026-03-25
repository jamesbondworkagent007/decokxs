package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class SwitchItemInfo$$serializer implements GeneratedSerializer<SwitchItemInfo> {
    public static final int $stable;
    public static final SwitchItemInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SwitchItemInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SwitchItemInfo$$serializer switchItemInfo$$serializer = new SwitchItemInfo$$serializer();
        INSTANCE = switchItemInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo", switchItemInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("switchType", true);
        pluginGeneratedSerialDescriptor.addElement("switchName", true);
        pluginGeneratedSerialDescriptor.addElement("enName", true);
        pluginGeneratedSerialDescriptor.addElement("switchDescription", true);
        pluginGeneratedSerialDescriptor.addElement("isShow", true);
        pluginGeneratedSerialDescriptor.addElement("isOpen", true);
        pluginGeneratedSerialDescriptor.addElement("subItems", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(new ArrayListSerializer(INSTANCE))};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SwitchItemInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        boolean zDecodeBooleanElement;
        boolean z;
        List list;
        String str;
        String str2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            i2 = iDecodeIntElement;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, new ArrayListSerializer(INSTANCE), null);
            z = zDecodeBooleanElement3;
            str2 = strDecodeStringElement4;
            i = 127;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            strDecodeStringElement = strDecodeStringElement3;
            str = strDecodeStringElement2;
        } else {
            String strDecodeStringElement5 = null;
            List list2 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement6 = null;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement4 = false;
            i = 0;
            zDecodeBooleanElement = false;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        break;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i |= 2;
                        break;
                    case 2:
                        i |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 = 1;
                        break;
                    case 3:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 = i | 8;
                        i = i3;
                        i4 = 1;
                        break;
                    case 4:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i3 = i | 16;
                        i = i3;
                        i4 = 1;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i3 = i | 32;
                        i = i3;
                        i4 = 1;
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, new ArrayListSerializer(INSTANCE), list2);
                        i3 = i | 64;
                        i = i3;
                        i4 = 1;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            list = list2;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement5;
            i2 = iDecodeIntElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SwitchItemInfo(i, i2, str, strDecodeStringElement, str2, zDecodeBooleanElement, z, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SwitchItemInfo switchItemInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(switchItemInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SwitchItemInfo.write$Self$OKNotificationCenter_oknotificationcenter_impl(switchItemInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
