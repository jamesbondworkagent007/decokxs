package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import com.okinc.business.web3pay.lib.core.model.UserFundStatus;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo;
import com.okinc.business.web3pay.lib.features.paytransaction.model.ExternalFeeInfo$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C2BExt$$serializer implements GeneratedSerializer<C2BExt> {
    public static final int $stable;
    public static final C2BExt$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private C2BExt$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        C2BExt$$serializer c2BExt$$serializer = new C2BExt$$serializer();
        INSTANCE = c2BExt$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.C2BExt", c2BExt$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("toTokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("bidPx", false);
        pluginGeneratedSerialDescriptor.addElement("userFundStatus", false);
        pluginGeneratedSerialDescriptor.addElement("acquireLogo", false);
        pluginGeneratedSerialDescriptor.addElement("acquireName", false);
        pluginGeneratedSerialDescriptor.addElement("externalFeeInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = C2BExt.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(ExternalFeeInfo$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final C2BExt deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        ExternalFeeInfo externalFeeInfo;
        String str3;
        UserFundStatus userFundStatus;
        String str4;
        int i;
        String str5;
        Integer num;
        Integer num2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = C2BExt.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            UserFundStatus userFundStatus2 = (UserFundStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            userFundStatus = userFundStatus2;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            externalFeeInfo = (ExternalFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ExternalFeeInfo$$serializer.INSTANCE, null);
            str2 = str10;
            str4 = str9;
            str5 = str8;
            str = str7;
            num = num3;
            i = 255;
        } else {
            int i5 = 0;
            boolean z = true;
            String str11 = null;
            UserFundStatus userFundStatus3 = null;
            String str12 = null;
            ExternalFeeInfo externalFeeInfo2 = null;
            String str13 = null;
            Integer num4 = null;
            String str14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num2 = num4;
                        z = false;
                        num4 = num2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        num2 = num4;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str14);
                        i5 |= 1;
                        num4 = num2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num4);
                        i5 |= 2;
                        num2 = num4;
                        num4 = num2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                        i5 |= 4;
                        num2 = num4;
                        num4 = num2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        i5 |= 8;
                        num2 = num4;
                        num4 = num2;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 4:
                        userFundStatus3 = (UserFundStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], userFundStatus3);
                        i5 |= 16;
                        break;
                    case 5:
                        i5 |= 32;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str11);
                        break;
                    case 6:
                        i5 |= 64;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str13);
                        break;
                    case 7:
                        i5 |= 128;
                        externalFeeInfo2 = (ExternalFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, ExternalFeeInfo$$serializer.INSTANCE, externalFeeInfo2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num5 = num4;
            str = str14;
            str2 = str11;
            externalFeeInfo = externalFeeInfo2;
            str3 = str13;
            userFundStatus = userFundStatus3;
            str4 = str12;
            i = i5;
            str5 = str6;
            num = num5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new C2BExt(i, str, num, str5, str4, userFundStatus, str2, str3, externalFeeInfo, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull C2BExt c2BExt) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(c2BExt, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        C2BExt.write$Self$OKPayCore_web3pay_lib(c2BExt, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
