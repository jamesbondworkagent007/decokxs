package com.okinc.auth.impl.passkey.model;

import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.localization2.bean.AppLocaleInfo;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AuthenticationStartResponse$AdditionalData$$serializer implements GeneratedSerializer<AuthenticationStartResponse.AdditionalData> {
    public static final int $stable;
    public static final AuthenticationStartResponse$AdditionalData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AuthenticationStartResponse$AdditionalData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AuthenticationStartResponse$AdditionalData$$serializer authenticationStartResponse$AdditionalData$$serializer = new AuthenticationStartResponse$AdditionalData$$serializer();
        INSTANCE = authenticationStartResponse$AdditionalData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.auth.impl.passkey.model.AuthenticationStartResponse.AdditionalData", authenticationStartResponse$AdditionalData$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("credentialType", true);
        pluginGeneratedSerialDescriptor.addElement("lastUsedTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("registrationTimestamp", true);
        pluginGeneratedSerialDescriptor.addElement("currentDevice", true);
        pluginGeneratedSerialDescriptor.addElement("inHouse", true);
        pluginGeneratedSerialDescriptor.addElement("inHouseVer", true);
        pluginGeneratedSerialDescriptor.addElement(AppLocaleInfo.KEY_DISPLAY_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("deviceName", true);
        pluginGeneratedSerialDescriptor.addElement("credentialId", true);
        pluginGeneratedSerialDescriptor.addElement("devicesWithV2Passkey", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AuthenticationStartResponse.AdditionalData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(longSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[9])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AuthenticationStartResponse.AdditionalData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Long l;
        List list;
        Boolean bool;
        Boolean bool2;
        Long l2;
        String str3;
        Integer num;
        String str4;
        int i;
        Long l3;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AuthenticationStartResponse.AdditionalData.$childSerializers;
        int i2 = 7;
        int i3 = 6;
        int i4 = 8;
        int i5 = 9;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            i = 1023;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str2 = str9;
            str = str8;
            str3 = str7;
            num = num2;
            l = l5;
            l2 = l4;
            bool2 = bool5;
            str4 = str6;
            bool = bool4;
        } else {
            int i6 = 0;
            boolean z = true;
            String str10 = null;
            Integer num3 = null;
            String str11 = null;
            Long l6 = null;
            List list2 = null;
            Boolean bool6 = null;
            Long l7 = null;
            Boolean bool7 = null;
            String str12 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l3 = l7;
                        bool3 = bool7;
                        z = false;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 0:
                        l3 = l7;
                        bool3 = bool7;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str12);
                        i6 |= 1;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 1:
                        bool3 = bool7;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l7);
                        i6 |= 2;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 2:
                        bool3 = bool7;
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l6);
                        i6 |= 4;
                        l3 = l7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 3:
                        bool3 = bool7;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool6);
                        i6 |= 8;
                        l3 = l7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 4:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool7);
                        i6 |= 16;
                        l3 = l7;
                        bool3 = bool7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num3);
                        i6 |= 32;
                        l3 = l7;
                        bool3 = bool7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 6:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str5);
                        i6 |= 64;
                        l3 = l7;
                        bool3 = bool7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 7:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str10);
                        i6 |= 128;
                        l3 = l7;
                        bool3 = bool7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 8:
                        i6 |= 256;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str11);
                        l3 = l7;
                        bool3 = bool7;
                        bool7 = bool3;
                        l7 = l3;
                        i2 = 7;
                        i3 = 6;
                        i4 = 8;
                        i5 = 9;
                        break;
                    case 9:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list2);
                        i6 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Long l8 = l7;
            str = str10;
            str2 = str11;
            l = l6;
            list = list2;
            bool = bool6;
            bool2 = bool7;
            l2 = l8;
            str3 = str5;
            num = num3;
            str4 = str12;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AuthenticationStartResponse.AdditionalData(i, str4, l2, l, bool, bool2, num, str3, str, str2, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AuthenticationStartResponse.AdditionalData additionalData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(additionalData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AuthenticationStartResponse.AdditionalData.write$Self$OKAuth_auth_impl(additionalData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
