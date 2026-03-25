package com.okinc.business.defi.biz.net.bean;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class EosAccountKeyBatch$$serializer implements GeneratedSerializer<EosAccountKeyBatch> {
    public static final int $stable;
    public static final EosAccountKeyBatch$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EosAccountKeyBatch$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EosAccountKeyBatch$$serializer eosAccountKeyBatch$$serializer = new EosAccountKeyBatch$$serializer();
        INSTANCE = eosAccountKeyBatch$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.EosAccountKeyBatch", eosAccountKeyBatch$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("coinId", true);
        pluginGeneratedSerialDescriptor.addElement(MTAnalysisConstants.Account.KEY_ACCOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("balance", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("activeKey", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("ownerKey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(longSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EosAccountKeyBatch deserialize(@NotNull Decoder decoder) {
        String str;
        Long l;
        String str2;
        String str3;
        Long l2;
        int i;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            i = 127;
            str5 = str9;
            str3 = str10;
            str = str8;
            l2 = l3;
            str4 = str7;
        } else {
            int i3 = 0;
            boolean z = true;
            String str11 = null;
            Long l4 = null;
            String str12 = null;
            String str13 = null;
            str = null;
            Long l5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l5);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str11);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        i3 |= 4;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str);
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str6);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str13);
                        i2 = 6;
                        break;
                    case 5:
                        i3 |= 32;
                        l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l4);
                        i2 = 6;
                        break;
                    case 6:
                        i3 |= 64;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str12);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l4;
            str2 = str12;
            str3 = str13;
            l2 = l5;
            i = i3;
            str4 = str11;
            str5 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EosAccountKeyBatch(i, l2, str4, str, str5, str3, l, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EosAccountKeyBatch eosAccountKeyBatch) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eosAccountKeyBatch, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EosAccountKeyBatch.write$Self$OKWallet_wallet_impl(eosAccountKeyBatch, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
