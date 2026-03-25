package com.okinc.wallet.hardware.api.onekey;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class IFirmwareReleaseInfo$$serializer implements GeneratedSerializer<IFirmwareReleaseInfo> {
    public static final int $stable;
    public static final IFirmwareReleaseInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private IFirmwareReleaseInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        IFirmwareReleaseInfo$$serializer iFirmwareReleaseInfo$$serializer = new IFirmwareReleaseInfo$$serializer();
        INSTANCE = iFirmwareReleaseInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.hardware.api.onekey.IFirmwareReleaseInfo", iFirmwareReleaseInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("required", false);
        pluginGeneratedSerialDescriptor.addElement("url", false);
        pluginGeneratedSerialDescriptor.addElement("resource", true);
        pluginGeneratedSerialDescriptor.addElement("fullResource", true);
        pluginGeneratedSerialDescriptor.addElement("fullResourceRange", true);
        pluginGeneratedSerialDescriptor.addElement("bootloaderResource", true);
        pluginGeneratedSerialDescriptor.addElement("bootloaderVersion", true);
        pluginGeneratedSerialDescriptor.addElement("bootloaderRelatedFirmwareVersion", true);
        pluginGeneratedSerialDescriptor.addElement("bootloaderChangelog", true);
        pluginGeneratedSerialDescriptor.addElement("fingerprint", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("changelog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = IFirmwareReleaseInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        Changelog$$serializer changelog$$serializer = Changelog$$serializer.INSTANCE;
        return new KSerializer[]{BooleanSerializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[4]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(kSerializerArr[7]), BuiltinSerializersKt.getNullable(changelog$$serializer), stringSerializer, kSerializerArr[10], changelog$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final IFirmwareReleaseInfo deserialize(@NotNull Decoder decoder) {
        String str;
        List list;
        List list2;
        String str2;
        List list3;
        List list4;
        Changelog changelog;
        String str3;
        String str4;
        boolean z;
        String str5;
        Changelog changelog2;
        int i;
        KSerializer[] kSerializerArr;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = IFirmwareReleaseInfo.$childSerializers;
        int i2 = 9;
        int i3 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr2[4], null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr2[7], null);
            Changelog$$serializer changelog$$serializer = Changelog$$serializer.INSTANCE;
            Changelog changelog3 = (Changelog) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, changelog$$serializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            changelog2 = (Changelog) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, changelog$$serializer, null);
            str3 = strDecodeStringElement2;
            str5 = str9;
            str2 = str8;
            changelog = changelog3;
            str = str7;
            list4 = list5;
            list3 = list7;
            list = list6;
            str4 = strDecodeStringElement;
            i = 4095;
            z = zDecodeBooleanElement;
        } else {
            int i4 = 11;
            List list8 = null;
            List list9 = null;
            String str10 = null;
            Changelog changelog4 = null;
            Changelog changelog5 = null;
            String strDecodeStringElement3 = null;
            String str11 = null;
            String str12 = null;
            String strDecodeStringElement4 = null;
            int i5 = 0;
            boolean z2 = true;
            List list10 = null;
            boolean zDecodeBooleanElement2 = false;
            List list11 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        str6 = str11;
                        z2 = false;
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        str6 = str11;
                        i5 |= 1;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        str6 = str11;
                        i5 |= 2;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 2:
                        str6 = str11;
                        kSerializerArr = kSerializerArr2;
                        i5 |= 4;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str12);
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 3:
                        str6 = str11;
                        i5 |= 8;
                        kSerializerArr = kSerializerArr2;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str10);
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 4:
                        str6 = str11;
                        i5 |= 16;
                        kSerializerArr = kSerializerArr2;
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr2[4], list10);
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 5:
                        i5 |= 32;
                        kSerializerArr = kSerializerArr2;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str11);
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 6:
                        i5 |= 64;
                        kSerializerArr = kSerializerArr2;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list8);
                        str6 = str11;
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 7:
                        i5 |= 128;
                        kSerializerArr = kSerializerArr2;
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr2[7], list11);
                        str6 = str11;
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 8:
                        i5 |= 256;
                        kSerializerArr = kSerializerArr2;
                        changelog5 = (Changelog) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, Changelog$$serializer.INSTANCE, changelog5);
                        str6 = str11;
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 9:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i5 |= 512;
                        i4 = 11;
                        break;
                    case 10:
                        i5 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr2[10], list9);
                        str6 = str11;
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 11:
                        changelog4 = (Changelog) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, Changelog$$serializer.INSTANCE, changelog4);
                        i5 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        str6 = str11;
                        str11 = str6;
                        kSerializerArr2 = kSerializerArr;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str13 = str11;
            str = str12;
            list = list8;
            list2 = list9;
            str2 = str10;
            list3 = list11;
            list4 = list10;
            changelog = changelog5;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
            z = zDecodeBooleanElement2;
            str5 = str13;
            changelog2 = changelog4;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new IFirmwareReleaseInfo(i, z, str4, str, str2, list4, str5, list, list3, changelog, str3, list2, changelog2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull IFirmwareReleaseInfo iFirmwareReleaseInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(iFirmwareReleaseInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        IFirmwareReleaseInfo.write$Self$OKHardwareWallet_hardware_wallet_api(iFirmwareReleaseInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
