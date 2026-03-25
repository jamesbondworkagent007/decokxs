package com.okinc.okimcore.model.im.inhouseim.ws;

import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ReactionUserDetail$$serializer implements GeneratedSerializer<ReactionUserDetail> {
    public static final int $stable;
    public static final ReactionUserDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ReactionUserDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ReactionUserDetail$$serializer reactionUserDetail$$serializer = new ReactionUserDetail$$serializer();
        INSTANCE = reactionUserDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.im.inhouseim.ws.ReactionUserDetail", reactionUserDetail$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("name", true);
        pluginGeneratedSerialDescriptor.addElement("avatarUrl", false);
        pluginGeneratedSerialDescriptor.addElement("officialTagInfo", false);
        pluginGeneratedSerialDescriptor.addElement("userUid", false);
        pluginGeneratedSerialDescriptor.addElement("groupRole", true);
        pluginGeneratedSerialDescriptor.addElement("userTagType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ReactionUserDetail.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(OfficialTagInfo$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[5])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ReactionUserDetail deserialize(@NotNull Decoder decoder) {
        OfficialTagInfo officialTagInfo;
        List list;
        String str;
        Integer num;
        String str2;
        String str3;
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ReactionUserDetail.$childSerializers;
        int i2 = 3;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            OfficialTagInfo officialTagInfo2 = (OfficialTagInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OfficialTagInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            str = str4;
            str3 = strDecodeStringElement3;
            num = num2;
            officialTagInfo = officialTagInfo2;
            i = 63;
            str2 = strDecodeStringElement2;
        } else {
            int i3 = 0;
            boolean z2 = true;
            List list2 = null;
            Integer num3 = null;
            officialTagInfo = null;
            String strDecodeStringElement4 = null;
            String str5 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 3;
                        break;
                    case 0:
                        z = false;
                        i3 |= 1;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str5);
                        i2 = 3;
                        break;
                    case 1:
                        i3 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i3 |= 4;
                        officialTagInfo = (OfficialTagInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, OfficialTagInfo$$serializer.INSTANCE, officialTagInfo);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    case 4:
                        i3 |= 16;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, num3);
                        break;
                    case 5:
                        i3 |= 32;
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            str = str5;
            num = num3;
            str2 = strDecodeStringElement4;
            str3 = strDecodeStringElement;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReactionUserDetail(i, str, str2, officialTagInfo, str3, num, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ReactionUserDetail reactionUserDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(reactionUserDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReactionUserDetail.write$Self$OKIMCore_okimcore(reactionUserDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
