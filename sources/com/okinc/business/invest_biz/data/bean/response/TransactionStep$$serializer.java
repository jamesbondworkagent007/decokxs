package com.okinc.business.invest_biz.data.bean.response;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TransactionStep$$serializer implements GeneratedSerializer<TransactionStep> {
    public static final int $stable;
    public static final TransactionStep$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransactionStep$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransactionStep$$serializer transactionStep$$serializer = new TransactionStep$$serializer();
        INSTANCE = transactionStep$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.response.TransactionStep", transactionStep$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("approveAddress", true);
        pluginGeneratedSerialDescriptor.addElement("callDataExtra", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("isNeedExecute", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("orderType", true);
        pluginGeneratedSerialDescriptor.addElement("stepInProgressName", true);
        pluginGeneratedSerialDescriptor.addElement("stepName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenInfoList", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("isBaseToken", true);
        pluginGeneratedSerialDescriptor.addElement("needApproveAmount", true);
        pluginGeneratedSerialDescriptor.addElement("approveType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TransactionStep.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.INSTANCE, booleanSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[9], intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransactionStep deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        boolean z;
        int i2;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        long j;
        int iDecodeIntElement;
        String str10;
        boolean z2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TransactionStep.$childSerializers;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            i2 = iDecodeIntElement3;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            str2 = strDecodeStringElement8;
            str10 = strDecodeStringElement11;
            i3 = iDecodeIntElement2;
            z2 = zDecodeBooleanElement2;
            str9 = strDecodeStringElement2;
            str8 = strDecodeStringElement3;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            i = 262143;
            j = jDecodeLongElement;
            str4 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            list = list2;
            str = strDecodeStringElement7;
            str7 = strDecodeStringElement4;
            z = zDecodeBooleanElement;
        } else {
            int i6 = 17;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z3 = true;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            long jDecodeLongElement2 = 0;
            i = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement6 = 0;
            List list3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 0:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 1:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i5 = 8;
                        i6 = 17;
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i |= 4;
                        i6 = 17;
                        break;
                    case 3:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i4 = i | 8;
                        i = i4;
                        i6 = 17;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 = 17;
                        break;
                    case 5:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i4 = i | 32;
                        i = i4;
                        i6 = 17;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 = 17;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i6 = 17;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 = 17;
                        break;
                    case 9:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], list3);
                        i4 = i | 512;
                        i = i4;
                        i6 = 17;
                        break;
                    case 10:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i |= 1024;
                        i6 = 17;
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i6 = 17;
                        break;
                    case 12:
                        i |= 4096;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i6 = 17;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i6 = 17;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i6 = 17;
                        break;
                    case 15:
                        i |= 32768;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i6 = 17;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i6 = 17;
                        break;
                    case 17:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i6);
                        i = 131072 | i;
                        i6 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            z = zDecodeBooleanElement3;
            i2 = iDecodeIntElement6;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement15;
            strDecodeStringElement = strDecodeStringElement16;
            str4 = strDecodeStringElement17;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement21;
            str9 = strDecodeStringElement22;
            j = jDecodeLongElement2;
            iDecodeIntElement = iDecodeIntElement4;
            str10 = strDecodeStringElement14;
            int i7 = iDecodeIntElement5;
            z2 = zDecodeBooleanElement4;
            i3 = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransactionStep(i, str9, str8, j, z, str7, i3, str6, str5, str, list, i2, str2, str4, str3, str10, z2, strDecodeStringElement, iDecodeIntElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionStep transactionStep) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionStep, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransactionStep.OLrzqt(transactionStep, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
