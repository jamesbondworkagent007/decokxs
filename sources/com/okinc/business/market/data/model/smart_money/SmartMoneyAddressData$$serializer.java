package com.okinc.business.market.data.model.smart_money;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SmartMoneyAddressData$$serializer implements GeneratedSerializer<SmartMoneyAddressData> {
    public static final int $stable;
    public static final SmartMoneyAddressData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SmartMoneyAddressData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SmartMoneyAddressData$$serializer smartMoneyAddressData$$serializer = new SmartMoneyAddressData$$serializer();
        INSTANCE = smartMoneyAddressData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.smart_money.SmartMoneyAddressData", smartMoneyAddressData$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("addressInfo", true);
        pluginGeneratedSerialDescriptor.addElement("pnl7d", true);
        pluginGeneratedSerialDescriptor.addElement("roi", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("winRate", true);
        pluginGeneratedSerialDescriptor.addElement("addressAlias", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{AddressInfo$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SmartMoneyAddressData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        int i;
        String str2;
        AddressInfo addressInfo;
        String str3;
        String str4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AddressInfo addressInfo2 = (AddressInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AddressInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            addressInfo = addressInfo2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            i = 63;
        } else {
            int i3 = 0;
            boolean z2 = true;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            AddressInfo addressInfo3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 5;
                        break;
                    case 0:
                        z = false;
                        i3 |= 1;
                        addressInfo3 = (AddressInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AddressInfo$$serializer.INSTANCE, addressInfo3);
                        i2 = 5;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement9;
            str = strDecodeStringElement2;
            i = i3;
            String str5 = strDecodeStringElement10;
            str2 = strDecodeStringElement7;
            addressInfo = addressInfo3;
            str3 = strDecodeStringElement8;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SmartMoneyAddressData(i, addressInfo, str4, str3, str, str2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SmartMoneyAddressData smartMoneyAddressData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(smartMoneyAddressData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SmartMoneyAddressData.KWHzl(smartMoneyAddressData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
