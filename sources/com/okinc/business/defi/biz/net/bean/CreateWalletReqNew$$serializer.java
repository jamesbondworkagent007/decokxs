package com.okinc.business.defi.biz.net.bean;

import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CreateWalletReqNew$$serializer implements GeneratedSerializer<CreateWalletReqNew> {
    public static final int $stable;
    public static final CreateWalletReqNew$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateWalletReqNew$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateWalletReqNew$$serializer createWalletReqNew$$serializer = new CreateWalletReqNew$$serializer();
        INSTANCE = createWalletReqNew$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.CreateWalletReqNew", createWalletReqNew$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("mpcId", true);
        pluginGeneratedSerialDescriptor.addElement("pubKey", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("addresses", true);
        pluginGeneratedSerialDescriptor.addElement("walletType", true);
        pluginGeneratedSerialDescriptor.addElement("timestamp", true);
        pluginGeneratedSerialDescriptor.addElement("accountId", true);
        pluginGeneratedSerialDescriptor.addElement("asyncSignVerify", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = CreateWalletReqNew.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, kSerializerArr[3], IntSerializer.INSTANCE, LongSerializer.INSTANCE, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateWalletReqNew deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        boolean zDecodeBooleanElement;
        String str;
        long j;
        int i;
        List list;
        int i2;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = CreateWalletReqNew.$childSerializers;
        int i3 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            list = list2;
            str2 = strDecodeStringElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            str = strDecodeStringElement5;
            i = 255;
            i2 = iDecodeIntElement;
            str3 = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement3;
            j = jDecodeLongElement;
        } else {
            strDecodeStringElement = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int i4 = 0;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 7;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], list3);
                        i4 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i4 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement8;
            j = jDecodeLongElement2;
            i = i4;
            list = list3;
            i2 = iDecodeIntElement2;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateWalletReqNew(i, str2, strDecodeStringElement, str3, list, i2, j, str, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateWalletReqNew createWalletReqNew) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createWalletReqNew, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateWalletReqNew.write$Self$OKWallet_wallet_impl(createWalletReqNew, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
