package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class NetworkFee$$serializer implements GeneratedSerializer<NetworkFee> {
    public static final int $stable;
    public static final NetworkFee$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NetworkFee$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NetworkFee$$serializer networkFee$$serializer = new NetworkFee$$serializer();
        INSTANCE = networkFee$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.NetworkFee", networkFee$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("averageGear", true);
        pluginGeneratedSerialDescriptor.addElement("baseFee", true);
        pluginGeneratedSerialDescriptor.addElement("coinPrice", true);
        pluginGeneratedSerialDescriptor.addElement("coinUnit", true);
        pluginGeneratedSerialDescriptor.addElement("fastGear", true);
        pluginGeneratedSerialDescriptor.addElement("gasPriceUnit", true);
        pluginGeneratedSerialDescriptor.addElement("slowGear", true);
        pluginGeneratedSerialDescriptor.addElement("suggestBaseFee", true);
        pluginGeneratedSerialDescriptor.addElement("supportEip1559", true);
        pluginGeneratedSerialDescriptor.addElement("supportSwitchGear", true);
        pluginGeneratedSerialDescriptor.addElement("minGasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("maxGasPrice", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        NetworkGear$$serializer networkGear$$serializer = NetworkGear$$serializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{networkGear$$serializer, stringSerializer, stringSerializer, stringSerializer, networkGear$$serializer, stringSerializer, networkGear$$serializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NetworkFee deserialize(@NotNull Decoder decoder) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        NetworkGear networkGear;
        NetworkGear networkGear2;
        NetworkGear networkGear3;
        String str5;
        String strDecodeStringElement;
        String str6;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        int i6 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            NetworkGear$$serializer networkGear$$serializer = NetworkGear$$serializer.INSTANCE;
            NetworkGear networkGear4 = (NetworkGear) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, networkGear$$serializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            NetworkGear networkGear5 = (NetworkGear) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, networkGear$$serializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            NetworkGear networkGear6 = (NetworkGear) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, networkGear$$serializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            networkGear3 = networkGear6;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str6 = strDecodeStringElement7;
            z2 = zDecodeBooleanElement2;
            str = strDecodeStringElement6;
            z = zDecodeBooleanElement;
            str4 = strDecodeStringElement5;
            networkGear = networkGear5;
            str3 = strDecodeStringElement2;
            i = 4095;
            str5 = strDecodeStringElement3;
            networkGear2 = networkGear4;
            str2 = strDecodeStringElement4;
        } else {
            NetworkGear networkGear7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            NetworkGear networkGear8 = null;
            boolean z3 = true;
            boolean zDecodeBooleanElement3 = false;
            NetworkGear networkGear9 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        i6 |= 1;
                        networkGear8 = (NetworkGear) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, NetworkGear$$serializer.INSTANCE, networkGear8);
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        i6 |= 2;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 = 11;
                        break;
                    case 2:
                        i6 |= 4;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = 11;
                        break;
                    case 3:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        i6 |= 16;
                        networkGear7 = (NetworkGear) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, NetworkGear$$serializer.INSTANCE, networkGear7);
                        break;
                    case 5:
                        i6 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i6 |= 64;
                        networkGear9 = (NetworkGear) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, NetworkGear$$serializer.INSTANCE, networkGear9);
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        break;
                    case 8:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i2 = i6 | 256;
                        i6 = i2;
                        break;
                    case 9:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i2 = i6 | 512;
                        i6 = i2;
                        break;
                    case 10:
                        i6 |= 1024;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 11:
                        i6 |= 2048;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            i = i6;
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement14;
            z2 = zDecodeBooleanElement3;
            str4 = strDecodeStringElement8;
            networkGear = networkGear7;
            networkGear2 = networkGear8;
            String str7 = strDecodeStringElement10;
            networkGear3 = networkGear9;
            str5 = strDecodeStringElement13;
            strDecodeStringElement = strDecodeStringElement12;
            str6 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NetworkFee(i, networkGear2, str3, str5, str2, networkGear, str4, networkGear3, str, z, z2, str6, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NetworkFee networkFee) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(networkFee, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NetworkFee.write$Self$OKDeFi_invest_biz(networkFee, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
