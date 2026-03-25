package com.okinc.okuser.data;

import com.google.android.gms.common.Scopes;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class User$$serializer implements GeneratedSerializer<User> {
    public static final int $stable;
    public static final User$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private User$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        User$$serializer user$$serializer = new User$$serializer();
        INSTANCE = user$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okuser.data.User", user$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("loginName", false);
        pluginGeneratedSerialDescriptor.addElement("token", false);
        pluginGeneratedSerialDescriptor.addElement("tk", false);
        pluginGeneratedSerialDescriptor.addElement("uid", false);
        pluginGeneratedSerialDescriptor.addElement("isLogin", true);
        pluginGeneratedSerialDescriptor.addElement("loginTime", true);
        pluginGeneratedSerialDescriptor.addElement("isVisibleInSwitchAccountList", true);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement(Scopes.PROFILE, true);
        pluginGeneratedSerialDescriptor.addElement("isTesting", true);
        pluginGeneratedSerialDescriptor.addElement("entityCode", true);
        pluginGeneratedSerialDescriptor.addElement("personalSetting", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, Token$$serializer.INSTANCE, stringSerializer, stringSerializer, booleanSerializer, LongSerializer.INSTANCE, booleanSerializer, BuiltinSerializersKt.getNullable(UserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(UserProfile$$serializer.INSTANCE), booleanSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(PersonalSetting$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final User deserialize(@NotNull Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        int i;
        boolean z3;
        String str2;
        long j;
        UserProfile userProfile;
        String str3;
        PersonalSetting personalSetting;
        String str4;
        UserInfo userInfo;
        Token token;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        int i6 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Token token2 = (Token) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, Token$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            UserInfo userInfo2 = (UserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, UserInfo$$serializer.INSTANCE, null);
            UserProfile userProfile2 = (UserProfile) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, UserProfile$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, null);
            i = 4095;
            personalSetting = (PersonalSetting) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, PersonalSetting$$serializer.INSTANCE, null);
            str = str5;
            z = zDecodeBooleanElement3;
            userInfo = userInfo2;
            z2 = zDecodeBooleanElement2;
            userProfile = userProfile2;
            str2 = strDecodeStringElement3;
            j = jDecodeLongElement;
            z3 = zDecodeBooleanElement;
            str3 = strDecodeStringElement;
            str4 = strDecodeStringElement2;
            token = token2;
        } else {
            boolean z4 = true;
            String str6 = null;
            UserProfile userProfile3 = null;
            UserInfo userInfo3 = null;
            PersonalSetting personalSetting2 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Token token3 = null;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        token3 = (Token) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, Token$$serializer.INSTANCE, token3);
                        i6 |= 2;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        i6 |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = 11;
                        break;
                    case 3:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i3 = 11;
                        break;
                    case 4:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i6 |= 16;
                        i3 = 11;
                        break;
                    case 5:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 5);
                        i6 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i2 = i6 | 64;
                        i6 = i2;
                        break;
                    case 7:
                        i6 |= 128;
                        userInfo3 = (UserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, UserInfo$$serializer.INSTANCE, userInfo3);
                        break;
                    case 8:
                        i6 |= 256;
                        userProfile3 = (UserProfile) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, UserProfile$$serializer.INSTANCE, userProfile3);
                        break;
                    case 9:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i2 = i6 | 512;
                        i6 = i2;
                        break;
                    case 10:
                        i6 |= 1024;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str6);
                        break;
                    case 11:
                        i6 |= 2048;
                        personalSetting2 = (PersonalSetting) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, PersonalSetting$$serializer.INSTANCE, personalSetting2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            str = str6;
            z2 = zDecodeBooleanElement5;
            i = i6;
            z3 = zDecodeBooleanElement6;
            str2 = strDecodeStringElement5;
            j = jDecodeLongElement2;
            userProfile = userProfile3;
            str3 = strDecodeStringElement6;
            personalSetting = personalSetting2;
            str4 = strDecodeStringElement4;
            userInfo = userInfo3;
            token = token3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new User(i, str3, token, str4, str2, z3, j, z2, userInfo, userProfile, z, str, personalSetting, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull User user) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(user, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        User.write$Self$OKUser_okuser(user, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
