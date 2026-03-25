package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.dexlogic.txs.TxType;
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
public final /* synthetic */ class SignalOverviewAddressData$$serializer implements GeneratedSerializer<SignalOverviewAddressData> {
    public static final int $stable;
    public static final SignalOverviewAddressData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalOverviewAddressData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalOverviewAddressData$$serializer signalOverviewAddressData$$serializer = new SignalOverviewAddressData$$serializer();
        INSTANCE = signalOverviewAddressData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.smart_money.SignalOverviewAddressData", signalOverviewAddressData$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("addressInfo", true);
        pluginGeneratedSerialDescriptor.addElement("txPrice", true);
        pluginGeneratedSerialDescriptor.addElement("txTime", true);
        pluginGeneratedSerialDescriptor.addElement("txType", true);
        pluginGeneratedSerialDescriptor.addElement("txVolume", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("addressAlias", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SignalOverviewAddressData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{AddressInfo$$serializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[3], stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalOverviewAddressData deserialize(@NotNull Decoder decoder) {
        String str;
        String strDecodeStringElement;
        String str2;
        String str3;
        TxType txType;
        String str4;
        int i;
        AddressInfo addressInfo;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SignalOverviewAddressData.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        TxType txType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AddressInfo addressInfo2 = (AddressInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AddressInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            TxType txType3 = (TxType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            txType = txType3;
            addressInfo = addressInfo2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            i = 127;
            str3 = strDecodeStringElement2;
        } else {
            int i4 = 0;
            boolean z2 = true;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            AddressInfo addressInfo3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        z = false;
                        i4 |= 1;
                        addressInfo3 = (AddressInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AddressInfo$$serializer.INSTANCE, addressInfo3);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        i4 |= 2;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i4 |= 4;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i4 |= 8;
                        txType2 = (TxType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], txType2);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            AddressInfo addressInfo4 = addressInfo3;
            str = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement8;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            txType = txType2;
            str4 = strDecodeStringElement6;
            i = i4;
            addressInfo = addressInfo4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalOverviewAddressData(i, addressInfo, str3, str2, txType, str4, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalOverviewAddressData signalOverviewAddressData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalOverviewAddressData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalOverviewAddressData.KWHzl(signalOverviewAddressData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
