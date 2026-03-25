package com.okinc.business.defi.biz.net.bean;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class XRC20BalanceDetailInfoResp$$serializer implements GeneratedSerializer<XRC20BalanceDetailInfoResp> {
    public static final int $stable;
    public static final XRC20BalanceDetailInfoResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private XRC20BalanceDetailInfoResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        XRC20BalanceDetailInfoResp$$serializer xRC20BalanceDetailInfoResp$$serializer = new XRC20BalanceDetailInfoResp$$serializer();
        INSTANCE = xRC20BalanceDetailInfoResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp", xRC20BalanceDetailInfoResp$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("coinId", false);
        pluginGeneratedSerialDescriptor.addElement(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, true);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("totalBalance", false);
        pluginGeneratedSerialDescriptor.addElement("receivedPendingBalance", false);
        pluginGeneratedSerialDescriptor.addElement("transferableWithoutSpending", false);
        pluginGeneratedSerialDescriptor.addElement("availableWithoutSpending", false);
        pluginGeneratedSerialDescriptor.addElement("availableReceiving", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(longSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final XRC20BalanceDetailInfoResp deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        Long l;
        Long l2;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        Long l3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            l2 = l5;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            str4 = str12;
            str5 = str11;
            str = str9;
            str2 = str10;
            i = 255;
            l = l4;
            str6 = str8;
        } else {
            int i5 = 0;
            boolean z = true;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Long l6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str7 = str18;
                        z = false;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        str7 = str18;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l6);
                        i5 |= 1;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str18);
                        i5 |= 2;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l3);
                        i5 |= 4;
                        str7 = str18;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str13);
                        i5 |= 8;
                        break;
                    case 4:
                        i5 |= 16;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        str7 = str18;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        i5 |= 32;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str17);
                        str7 = str18;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 6:
                        i5 |= 64;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str16);
                        str7 = str18;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 7:
                        i5 |= 128;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str15);
                        str7 = str18;
                        str18 = str7;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str19 = str18;
            Long l7 = l6;
            str = str13;
            str2 = str14;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            i = i5;
            str6 = str19;
            l = l7;
            l2 = l3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new XRC20BalanceDetailInfoResp(i, l, str6, l2, str, str2, str5, str4, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(xRC20BalanceDetailInfoResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        XRC20BalanceDetailInfoResp.write$Self$OKWallet_wallet_impl(xRC20BalanceDetailInfoResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
