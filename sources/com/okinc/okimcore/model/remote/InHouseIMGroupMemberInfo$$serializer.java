package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus$$serializer;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class InHouseIMGroupMemberInfo$$serializer implements GeneratedSerializer<InHouseIMGroupMemberInfo> {
    public static final int $stable;
    public static final InHouseIMGroupMemberInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InHouseIMGroupMemberInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InHouseIMGroupMemberInfo$$serializer inHouseIMGroupMemberInfo$$serializer = new InHouseIMGroupMemberInfo$$serializer();
        INSTANCE = inHouseIMGroupMemberInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.InHouseIMGroupMemberInfo", inHouseIMGroupMemberInfo$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("groupId", true);
        pluginGeneratedSerialDescriptor.addElement("memberUid", true);
        pluginGeneratedSerialDescriptor.addElement("inviterUid", true);
        pluginGeneratedSerialDescriptor.addElement("role", true);
        pluginGeneratedSerialDescriptor.addElement("memberAlias", true);
        pluginGeneratedSerialDescriptor.addElement("memberStatus", true);
        pluginGeneratedSerialDescriptor.addElement("userInfo", true);
        pluginGeneratedSerialDescriptor.addElement("paidGroupMemberStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(InHouseUserInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(PaidGroupMemberStatus$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InHouseIMGroupMemberInfo deserialize(@NotNull Decoder decoder) {
        Integer num;
        String str;
        PaidGroupMemberStatus paidGroupMemberStatus;
        InHouseUserInfo inHouseUserInfo;
        Integer num2;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        int i3 = 6;
        int i4 = 5;
        String str6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            InHouseUserInfo inHouseUserInfo2 = (InHouseUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InHouseUserInfo$$serializer.INSTANCE, null);
            str = str10;
            paidGroupMemberStatus = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PaidGroupMemberStatus$$serializer.INSTANCE, null);
            inHouseUserInfo = inHouseUserInfo2;
            num2 = num4;
            num = num3;
            i = 255;
            str4 = str9;
            str3 = str7;
            str2 = str8;
        } else {
            int i5 = 0;
            boolean z = true;
            Integer num5 = null;
            String str11 = null;
            PaidGroupMemberStatus paidGroupMemberStatus2 = null;
            InHouseUserInfo inHouseUserInfo3 = null;
            Integer num6 = null;
            String str12 = null;
            String str13 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str5 = str12;
                        z = false;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 0:
                        str5 = str12;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str13);
                        i5 |= 1;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 1:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str12);
                        i5 |= 2;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 2:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                        i5 |= 4;
                        str5 = str12;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 3:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num5);
                        i5 |= 8;
                        break;
                    case 4:
                        i5 |= 16;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str11);
                        str5 = str12;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 5:
                        i5 |= 32;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, IntSerializer.INSTANCE, num6);
                        str5 = str12;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 6:
                        i5 |= 64;
                        inHouseUserInfo3 = (InHouseUserInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, InHouseUserInfo$$serializer.INSTANCE, inHouseUserInfo3);
                        str5 = str12;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    case 7:
                        i5 |= 128;
                        paidGroupMemberStatus2 = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, PaidGroupMemberStatus$$serializer.INSTANCE, paidGroupMemberStatus2);
                        str5 = str12;
                        str12 = str5;
                        i2 = 7;
                        i3 = 6;
                        i4 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str14 = str12;
            String str15 = str13;
            num = num5;
            str = str11;
            paidGroupMemberStatus = paidGroupMemberStatus2;
            inHouseUserInfo = inHouseUserInfo3;
            num2 = num6;
            i = i5;
            str2 = str14;
            str3 = str15;
            str4 = str6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InHouseIMGroupMemberInfo(i, str3, str2, str4, num, str, num2, inHouseUserInfo, paidGroupMemberStatus, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InHouseIMGroupMemberInfo inHouseIMGroupMemberInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupMemberInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InHouseIMGroupMemberInfo.write$Self$OKIMCore_okimcore(inHouseIMGroupMemberInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
