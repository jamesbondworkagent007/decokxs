package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.TransactionStatus;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class PaidGroupTransactionHistoryDetail$$serializer implements GeneratedSerializer<PaidGroupTransactionHistoryDetail> {
    public static final int $stable;
    public static final PaidGroupTransactionHistoryDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PaidGroupTransactionHistoryDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PaidGroupTransactionHistoryDetail$$serializer paidGroupTransactionHistoryDetail$$serializer = new PaidGroupTransactionHistoryDetail$$serializer();
        INSTANCE = paidGroupTransactionHistoryDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.PaidGroupTransactionHistoryDetail", paidGroupTransactionHistoryDetail$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("transactionId", true);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("memberUid", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("decimalPoint", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("currencySymbol", true);
        pluginGeneratedSerialDescriptor.addElement("nickname", true);
        pluginGeneratedSerialDescriptor.addElement("createTime", true);
        pluginGeneratedSerialDescriptor.addElement("updateTime", true);
        pluginGeneratedSerialDescriptor.addElement("transactionStatus", true);
        pluginGeneratedSerialDescriptor.addElement("paymentTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = PaidGroupTransactionHistoryDetail.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PaidGroupTransactionHistoryDetail deserialize(@NotNull Decoder decoder) {
        Long l;
        String str;
        Long l2;
        Long l3;
        TransactionStatus transactionStatus;
        Integer num;
        String str2;
        String str3;
        String str4;
        Integer num2;
        Long l4;
        String str5;
        int i;
        KSerializer[] kSerializerArr;
        Long l5;
        Long l6;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = PaidGroupTransactionHistoryDetail.$childSerializers;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, intSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            Long l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, longSerializer, null);
            transactionStatus = (TransactionStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str3 = str12;
            l3 = l9;
            l2 = l10;
            num = num3;
            l4 = l8;
            l = l7;
            i = 4095;
            str5 = str11;
            str2 = str10;
            str4 = str9;
            num2 = num4;
        } else {
            int i2 = 11;
            String str13 = null;
            Integer num5 = null;
            String str14 = null;
            Long l11 = null;
            Long l12 = null;
            TransactionStatus transactionStatus2 = null;
            Long l13 = null;
            Long l14 = null;
            String str15 = null;
            int i3 = 0;
            boolean z = true;
            Integer num6 = null;
            String str16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        l5 = l13;
                        l6 = l14;
                        str6 = str15;
                        str7 = str13;
                        z = false;
                        l14 = l6;
                        l13 = l5;
                        str13 = str7;
                        i2 = 11;
                        str15 = str6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        l5 = l13;
                        l6 = l14;
                        String str17 = str15;
                        str7 = str13;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str17);
                        i3 |= 1;
                        l14 = l6;
                        l13 = l5;
                        str13 = str7;
                        i2 = 11;
                        str15 = str6;
                        kSerializerArr2 = kSerializerArr;
                        break;
                    case 1:
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l13);
                        i3 |= 2;
                        kSerializerArr2 = kSerializerArr2;
                        i2 = 11;
                        break;
                    case 2:
                        i3 |= 4;
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l14);
                        i2 = 11;
                        break;
                    case 3:
                        i3 |= 8;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str16);
                        i2 = 11;
                        break;
                    case 4:
                        i3 |= 16;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num6);
                        i2 = 11;
                        break;
                    case 5:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num5);
                        i3 |= 32;
                        i2 = 11;
                        break;
                    case 6:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str14);
                        i3 |= 64;
                        i2 = 11;
                        break;
                    case 7:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str13);
                        i3 |= 128;
                        i2 = 11;
                        break;
                    case 8:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, l12);
                        i3 |= 256;
                        i2 = 11;
                        break;
                    case 9:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, l11);
                        i3 |= 512;
                        i2 = 11;
                        break;
                    case 10:
                        transactionStatus2 = (TransactionStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], transactionStatus2);
                        i3 |= 1024;
                        i2 = 11;
                        break;
                    case 11:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str8);
                        i3 |= 2048;
                        i2 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l13;
            str = str8;
            l2 = l11;
            l3 = l12;
            transactionStatus = transactionStatus2;
            num = num6;
            str2 = str16;
            str3 = str13;
            str4 = str15;
            num2 = num5;
            l4 = l14;
            str5 = str14;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaidGroupTransactionHistoryDetail(i, str4, l, l4, str2, num, num2, str5, str3, l3, l2, transactionStatus, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PaidGroupTransactionHistoryDetail paidGroupTransactionHistoryDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(paidGroupTransactionHistoryDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaidGroupTransactionHistoryDetail.write$Self$OKIMCore_okimcore(paidGroupTransactionHistoryDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
