package com.okinc.business.appupdate.update;

import com.okinc.p2p.api.OtcExtraKeys;
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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class AppUpdateInfo$$serializer implements GeneratedSerializer<AppUpdateInfo> {
    public static final int $stable;
    public static final AppUpdateInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AppUpdateInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AppUpdateInfo$$serializer appUpdateInfo$$serializer = new AppUpdateInfo$$serializer();
        INSTANCE = appUpdateInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.appupdate.update.AppUpdateInfo", appUpdateInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("newVersion", false);
        pluginGeneratedSerialDescriptor.addElement("updateType", false);
        pluginGeneratedSerialDescriptor.addElement("alertContent", false);
        pluginGeneratedSerialDescriptor.addElement("apkMD5", false);
        pluginGeneratedSerialDescriptor.addElement("upgradeTypeDetail", false);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.MODE, true);
        pluginGeneratedSerialDescriptor.addElement("additionalUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(AlertContent$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(UpgradeTypeDetail$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AppUpdateInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        UpgradeTypeDetail upgradeTypeDetail;
        int i;
        Integer num;
        String str3;
        String str4;
        AlertContent alertContent;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        UpgradeTypeDetail upgradeTypeDetail2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            AlertContent alertContent2 = (AlertContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, AlertContent$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            UpgradeTypeDetail upgradeTypeDetail3 = (UpgradeTypeDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, UpgradeTypeDetail$$serializer.INSTANCE, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            str3 = strDecodeStringElement;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            num = num2;
            str4 = strDecodeStringElement3;
            upgradeTypeDetail = upgradeTypeDetail3;
            alertContent = alertContent2;
            str2 = strDecodeStringElement2;
            i = 127;
        } else {
            int i2 = 0;
            boolean z = true;
            Integer num3 = null;
            String str5 = null;
            String strDecodeStringElement4 = null;
            AlertContent alertContent3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        i2 |= 4;
                        alertContent3 = (AlertContent) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, AlertContent$$serializer.INSTANCE, alertContent3);
                        break;
                    case 3:
                        i2 |= 8;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i2 |= 16;
                        upgradeTypeDetail2 = (UpgradeTypeDetail) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, UpgradeTypeDetail$$serializer.INSTANCE, upgradeTypeDetail2);
                        break;
                    case 5:
                        i2 |= 32;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num3);
                        break;
                    case 6:
                        i2 |= 64;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str5);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str5;
            str2 = strDecodeStringElement5;
            upgradeTypeDetail = upgradeTypeDetail2;
            i = i2;
            String str6 = strDecodeStringElement6;
            num = num3;
            str3 = str6;
            AlertContent alertContent4 = alertContent3;
            str4 = strDecodeStringElement4;
            alertContent = alertContent4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AppUpdateInfo(i, str3, str2, alertContent, str4, upgradeTypeDetail, num, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appUpdateInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AppUpdateInfo.write$Self$OKUpgrade_ok_upgrade(appUpdateInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
