package com.okinc.okimcore.model.remote;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class InHouseIMGroupPermissionInfo$$serializer implements GeneratedSerializer<InHouseIMGroupPermissionInfo> {
    public static final int $stable;
    public static final InHouseIMGroupPermissionInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InHouseIMGroupPermissionInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InHouseIMGroupPermissionInfo$$serializer inHouseIMGroupPermissionInfo$$serializer = new InHouseIMGroupPermissionInfo$$serializer();
        INSTANCE = inHouseIMGroupPermissionInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.InHouseIMGroupPermissionInfo", inHouseIMGroupPermissionInfo$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("viewGroupInfo", true);
        pluginGeneratedSerialDescriptor.addElement("setRole", true);
        pluginGeneratedSerialDescriptor.addElement("muteUnmuteMember", true);
        pluginGeneratedSerialDescriptor.addElement("updateGroupSettings", true);
        pluginGeneratedSerialDescriptor.addElement("updateGroupProfile", true);
        pluginGeneratedSerialDescriptor.addElement("disbandGroup", true);
        pluginGeneratedSerialDescriptor.addElement("transferOwner", true);
        pluginGeneratedSerialDescriptor.addElement("listMember", true);
        pluginGeneratedSerialDescriptor.addElement("addMember", true);
        pluginGeneratedSerialDescriptor.addElement("removeMember", true);
        pluginGeneratedSerialDescriptor.addElement("inviteAnyone", true);
        pluginGeneratedSerialDescriptor.addElement("listAnnouncement", true);
        pluginGeneratedSerialDescriptor.addElement("postAnnouncement", true);
        pluginGeneratedSerialDescriptor.addElement("deleteAnnouncement", true);
        pluginGeneratedSerialDescriptor.addElement("atAll", true);
        pluginGeneratedSerialDescriptor.addElement("addInvitee", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowedSendMessageKyc", true);
        pluginGeneratedSerialDescriptor.addElement("allowGeneratingInvitationQrCode", true);
        pluginGeneratedSerialDescriptor.addElement("reviewJoinApplications", true);
        pluginGeneratedSerialDescriptor.addElement("allowPayGifts", true);
        pluginGeneratedSerialDescriptor.addElement("allowPay", true);
        pluginGeneratedSerialDescriptor.addElement("allowVoice", true);
        pluginGeneratedSerialDescriptor.addElement("allowFile", true);
        pluginGeneratedSerialDescriptor.addElement("convertGroupToPublic", true);
        pluginGeneratedSerialDescriptor.addElement("allowLeaveGroup", true);
        pluginGeneratedSerialDescriptor.addElement("allowStartGroupVoiceCall", true);
        pluginGeneratedSerialDescriptor.addElement("updateBizGroupName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InHouseIMGroupPermissionInfo deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        int i;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        Boolean bool21;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        Boolean bool25;
        Boolean bool26;
        Boolean bool27;
        Boolean bool28;
        Boolean bool29;
        int i2;
        int i3;
        int i4;
        Boolean bool30;
        Boolean bool31;
        Boolean bool32;
        Boolean bool33;
        Boolean bool34;
        Boolean bool35;
        Boolean bool36;
        Boolean bool37;
        Boolean bool38;
        Boolean bool39;
        Boolean bool40;
        Boolean bool41;
        Boolean bool42;
        Boolean bool43;
        Boolean bool44;
        Boolean bool45;
        Boolean bool46;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool47 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool48 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            Boolean bool49 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            Boolean bool50 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            Boolean bool51 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool52 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool53 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool54 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            Boolean bool55 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool56 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool57 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            Boolean bool58 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool59 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            Boolean bool60 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            Boolean bool61 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, booleanSerializer, null);
            Boolean bool62 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, booleanSerializer, null);
            Boolean bool63 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            Boolean bool64 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, null);
            Boolean bool65 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, null);
            Boolean bool66 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, booleanSerializer, null);
            Boolean bool67 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, booleanSerializer, null);
            Boolean bool68 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, booleanSerializer, null);
            Boolean bool69 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, booleanSerializer, null);
            Boolean bool70 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, booleanSerializer, null);
            Boolean bool71 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, booleanSerializer, null);
            Boolean bool72 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, booleanSerializer, null);
            Boolean bool73 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, booleanSerializer, null);
            bool26 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, booleanSerializer, null);
            bool27 = bool52;
            bool8 = bool72;
            bool2 = bool73;
            i = 134217727;
            bool18 = bool70;
            bool20 = bool71;
            bool22 = bool68;
            bool14 = bool69;
            bool12 = bool67;
            bool5 = bool58;
            bool19 = bool54;
            bool11 = bool57;
            bool4 = bool55;
            bool25 = bool56;
            bool13 = bool48;
            bool10 = bool50;
            bool15 = bool49;
            bool21 = bool51;
            bool6 = bool59;
            bool17 = bool53;
            bool16 = bool66;
            bool9 = bool65;
            bool7 = bool60;
            bool24 = bool64;
            bool3 = bool61;
            bool = bool63;
            bool23 = bool62;
        } else {
            int i5 = 0;
            boolean z = true;
            Boolean bool74 = null;
            Boolean bool75 = null;
            Boolean bool76 = null;
            Boolean bool77 = null;
            Boolean bool78 = null;
            Boolean bool79 = null;
            Boolean bool80 = null;
            Boolean bool81 = null;
            Boolean bool82 = null;
            Boolean bool83 = null;
            Boolean bool84 = null;
            Boolean bool85 = null;
            Boolean bool86 = null;
            Boolean bool87 = null;
            Boolean bool88 = null;
            Boolean bool89 = null;
            Boolean bool90 = null;
            Boolean bool91 = null;
            Boolean bool92 = null;
            Boolean bool93 = null;
            Boolean bool94 = null;
            Boolean bool95 = null;
            Boolean bool96 = null;
            Boolean bool97 = null;
            Boolean bool98 = null;
            Boolean bool99 = null;
            while (z) {
                Boolean bool100 = bool74;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool30 = bool75;
                        bool31 = bool76;
                        bool32 = bool86;
                        bool33 = bool87;
                        bool34 = bool88;
                        bool35 = bool89;
                        bool36 = bool90;
                        bool37 = bool91;
                        bool38 = bool92;
                        bool39 = bool93;
                        bool40 = bool94;
                        bool41 = bool96;
                        bool42 = bool97;
                        bool43 = bool98;
                        bool44 = bool99;
                        bool45 = bool100;
                        z = false;
                        bool46 = bool95;
                        bool95 = bool46;
                        bool99 = bool44;
                        bool75 = bool30;
                        bool76 = bool31;
                        bool74 = bool45;
                        bool98 = bool43;
                        bool97 = bool42;
                        bool94 = bool40;
                        bool93 = bool39;
                        bool96 = bool41;
                        bool92 = bool38;
                        bool91 = bool37;
                        bool87 = bool33;
                        bool88 = bool34;
                        bool89 = bool35;
                        bool90 = bool36;
                        bool86 = bool32;
                        break;
                    case 0:
                        bool32 = bool86;
                        bool99 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool99);
                        i5 |= 1;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool98 = bool98;
                        bool86 = bool32;
                        break;
                    case 1:
                        bool32 = bool86;
                        bool98 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool98);
                        i5 |= 2;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool97 = bool97;
                        bool86 = bool32;
                        break;
                    case 2:
                        bool32 = bool86;
                        bool97 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool97);
                        i5 |= 4;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool94 = bool94;
                        bool86 = bool32;
                        break;
                    case 3:
                        bool32 = bool86;
                        bool94 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool94);
                        i5 |= 8;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool93 = bool93;
                        bool86 = bool32;
                        break;
                    case 4:
                        bool32 = bool86;
                        bool93 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool93);
                        i5 |= 16;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool96 = bool96;
                        bool86 = bool32;
                        break;
                    case 5:
                        bool32 = bool86;
                        bool96 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool96);
                        i5 |= 32;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool86 = bool32;
                        break;
                    case 6:
                        i5 |= 64;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool92 = bool92;
                        bool86 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool86);
                        bool74 = bool100;
                        break;
                    case 7:
                        bool92 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool92);
                        i5 |= 128;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool91 = bool91;
                        break;
                    case 8:
                        bool91 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool91);
                        i5 |= 256;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool87 = bool87;
                        break;
                    case 9:
                        bool87 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool87);
                        i5 |= 512;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool88 = bool88;
                        break;
                    case 10:
                        bool88 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool88);
                        i5 |= 1024;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool89 = bool89;
                        break;
                    case 11:
                        bool89 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool89);
                        i5 |= 2048;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool90 = bool90;
                        break;
                    case 12:
                        bool90 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool90);
                        i5 |= 4096;
                        bool75 = bool75;
                        bool76 = bool76;
                        bool74 = bool100;
                        bool95 = bool95;
                        break;
                    case 13:
                        bool30 = bool75;
                        bool31 = bool76;
                        bool45 = bool100;
                        bool46 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, bool95);
                        i5 |= 8192;
                        bool32 = bool86;
                        bool33 = bool87;
                        bool34 = bool88;
                        bool35 = bool89;
                        bool36 = bool90;
                        bool37 = bool91;
                        bool38 = bool92;
                        bool39 = bool93;
                        bool40 = bool94;
                        bool41 = bool96;
                        bool42 = bool97;
                        bool43 = bool98;
                        bool44 = bool99;
                        bool95 = bool46;
                        bool99 = bool44;
                        bool75 = bool30;
                        bool76 = bool31;
                        bool74 = bool45;
                        bool98 = bool43;
                        bool97 = bool42;
                        bool94 = bool40;
                        bool93 = bool39;
                        bool96 = bool41;
                        bool92 = bool38;
                        bool91 = bool37;
                        bool87 = bool33;
                        bool88 = bool34;
                        bool89 = bool35;
                        bool90 = bool36;
                        bool86 = bool32;
                        break;
                    case 14:
                        bool74 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, bool100);
                        i5 |= 16384;
                        bool75 = bool75;
                        bool76 = bool76;
                        break;
                    case 15:
                        bool76 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool76);
                        i5 |= 32768;
                        bool75 = bool75;
                        bool74 = bool100;
                        break;
                    case 16:
                        bool28 = bool76;
                        bool29 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, bool84);
                        i2 = 65536;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 17:
                        bool28 = bool76;
                        i3 = 131072;
                        bool85 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, bool85);
                        bool29 = bool84;
                        i2 = i3;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 18:
                        bool28 = bool76;
                        i3 = 262144;
                        bool81 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, bool81);
                        bool29 = bool84;
                        i2 = i3;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 19:
                        bool28 = bool76;
                        i3 = 524288;
                        bool77 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, bool77);
                        bool29 = bool84;
                        i2 = i3;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 20:
                        bool28 = bool76;
                        i3 = 1048576;
                        bool75 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, bool75);
                        bool29 = bool84;
                        i2 = i3;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 21:
                        bool28 = bool76;
                        i4 = 2097152;
                        bool78 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, bool78);
                        bool29 = bool84;
                        i2 = i4;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 22:
                        bool28 = bool76;
                        i4 = 4194304;
                        bool82 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, bool82);
                        bool29 = bool84;
                        i2 = i4;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 23:
                        bool28 = bool76;
                        i4 = 8388608;
                        bool80 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.INSTANCE, bool80);
                        bool29 = bool84;
                        i2 = i4;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 24:
                        bool28 = bool76;
                        i4 = 16777216;
                        bool79 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, BooleanSerializer.INSTANCE, bool79);
                        bool29 = bool84;
                        i2 = i4;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 25:
                        bool28 = bool76;
                        Boolean bool101 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, BooleanSerializer.INSTANCE, bool83);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        bool83 = bool101;
                        bool29 = bool84;
                        i2 = i4;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    case 26:
                        bool28 = bool76;
                        i4 = 67108864;
                        bool47 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 26, BooleanSerializer.INSTANCE, bool47);
                        bool29 = bool84;
                        i2 = i4;
                        i5 |= i2;
                        bool84 = bool29;
                        bool74 = bool100;
                        bool76 = bool28;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            bool = bool76;
            Boolean bool102 = bool86;
            i = i5;
            bool2 = bool83;
            bool3 = bool95;
            bool4 = bool92;
            bool5 = bool88;
            bool6 = bool89;
            bool7 = bool90;
            bool8 = bool79;
            bool9 = bool85;
            bool10 = bool97;
            bool11 = bool87;
            bool12 = bool77;
            bool13 = bool99;
            bool14 = bool78;
            bool15 = bool98;
            bool16 = bool81;
            bool17 = bool96;
            bool18 = bool82;
            bool19 = bool102;
            bool20 = bool80;
            bool21 = bool94;
            bool22 = bool75;
            bool23 = bool74;
            bool24 = bool84;
            bool25 = bool91;
            bool26 = bool47;
            bool27 = bool93;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InHouseIMGroupPermissionInfo(i, bool13, bool15, bool10, bool21, bool27, bool17, bool19, bool4, bool25, bool11, bool5, bool6, bool7, bool3, bool23, bool, bool24, bool9, bool16, bool12, bool22, bool14, bool18, bool20, bool8, bool2, bool26, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InHouseIMGroupPermissionInfo inHouseIMGroupPermissionInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(inHouseIMGroupPermissionInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InHouseIMGroupPermissionInfo.write$Self$OKIMCore_okimcore(inHouseIMGroupPermissionInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
