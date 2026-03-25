package com.okinc.planet.domain.remote.dto;

import com.huawei.hms.push.constant.RemoteMessageConst;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class UnreadMsg$$serializer implements GeneratedSerializer<UnreadMsg> {
    public static final int $stable;
    public static final UnreadMsg$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UnreadMsg$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UnreadMsg$$serializer unreadMsg$$serializer = new UnreadMsg$$serializer();
        INSTANCE = unreadMsg$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.domain.remote.dto.UnreadMsg", unreadMsg$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement(RemoteMessageConst.MSGID, false);
        pluginGeneratedSerialDescriptor.addElement("eventSourceType", false);
        pluginGeneratedSerialDescriptor.addElement("eventSubType", false);
        pluginGeneratedSerialDescriptor.addElement("readStatus", false);
        pluginGeneratedSerialDescriptor.addElement("relatedContentId", true);
        pluginGeneratedSerialDescriptor.addElement("relatedCommentId", true);
        pluginGeneratedSerialDescriptor.addElement("replyRootId", true);
        pluginGeneratedSerialDescriptor.addElement("ext", true);
        pluginGeneratedSerialDescriptor.addElement("msgText", true);
        pluginGeneratedSerialDescriptor.addElement("eventTime", false);
        pluginGeneratedSerialDescriptor.addElement("draft", true);
        pluginGeneratedSerialDescriptor.addElement("relatedAuthorInfo", true);
        pluginGeneratedSerialDescriptor.addElement("isUnreadAdded", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{longSerializer, intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), longSerializer, BuiltinSerializersKt.getNullable(DraftModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RelatedAuthorInfo$$serializer.INSTANCE), BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UnreadMsg deserialize(@NotNull Decoder decoder) {
        int i;
        Long l;
        Long l2;
        String str;
        Long l3;
        int i2;
        int i3;
        long j;
        long j2;
        int i4;
        DraftModel draftModel;
        RelatedAuthorInfo relatedAuthorInfo;
        boolean zDecodeBooleanElement;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
            DraftModel draftModel2 = (DraftModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DraftModel$$serializer.INSTANCE, null);
            relatedAuthorInfo = (RelatedAuthorInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, RelatedAuthorInfo$$serializer.INSTANCE, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            draftModel = draftModel2;
            str2 = str3;
            l3 = l6;
            l2 = l5;
            i2 = iDecodeIntElement3;
            str = str4;
            l = l4;
            j = jDecodeLongElement2;
            j2 = jDecodeLongElement;
            i = iDecodeIntElement;
            i3 = iDecodeIntElement2;
            i4 = 8191;
        } else {
            int i5 = 12;
            String str5 = null;
            DraftModel draftModel3 = null;
            Long l7 = null;
            RelatedAuthorInfo relatedAuthorInfo2 = null;
            Long l8 = null;
            int i6 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            Long l9 = null;
            int iDecodeIntElement6 = 0;
            String str6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 12;
                        break;
                    case 0:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 12;
                        break;
                    case 1:
                        i6 |= 2;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 = 12;
                        break;
                    case 2:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 12;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 12;
                        break;
                    case 4:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, l7);
                        i6 |= 16;
                        i5 = 12;
                        break;
                    case 5:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l8);
                        i6 |= 32;
                        i5 = 12;
                        break;
                    case 6:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, l9);
                        i6 |= 64;
                        i5 = 12;
                        break;
                    case 7:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str5);
                        i6 |= 128;
                        i5 = 12;
                        break;
                    case 8:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str6);
                        i6 |= 256;
                        i5 = 12;
                        break;
                    case 9:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 9);
                        i6 |= 512;
                        i5 = 12;
                        break;
                    case 10:
                        draftModel3 = (DraftModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, DraftModel$$serializer.INSTANCE, draftModel3);
                        i6 |= 1024;
                        i5 = 12;
                        break;
                    case 11:
                        i6 |= 2048;
                        relatedAuthorInfo2 = (RelatedAuthorInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, RelatedAuthorInfo$$serializer.INSTANCE, relatedAuthorInfo2);
                        i5 = 12;
                        break;
                    case 12:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i6 |= 4096;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement6;
            l = l7;
            l2 = l8;
            str = str6;
            l3 = l9;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            i4 = i6;
            draftModel = draftModel3;
            relatedAuthorInfo = relatedAuthorInfo2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str2 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnreadMsg(i4, j2, i, i3, i2, l, l2, l3, str2, str, j, draftModel, relatedAuthorInfo, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UnreadMsg unreadMsg) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(unreadMsg, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UnreadMsg.write$Self$OKPlanet_ok_feature_planet_impl(unreadMsg, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
