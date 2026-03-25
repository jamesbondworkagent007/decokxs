package com.okinc.business.appupdate.update;

import com.appsflyer.AppsFlyerProperties;
import com.engagelab.privates.push.constants.MTPushConstants;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class AppRelease$$serializer implements GeneratedSerializer<AppRelease> {
    public static final int $stable;
    public static final AppRelease$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AppRelease$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AppRelease$$serializer appRelease$$serializer = new AppRelease$$serializer();
        INSTANCE = appRelease$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.appupdate.update.AppRelease", appRelease$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("appId", false);
        pluginGeneratedSerialDescriptor.addElement("appInfo", false);
        pluginGeneratedSerialDescriptor.addElement(AppsFlyerProperties.CHANNEL, false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(MTPushConstants.PlatformNode.KEY_PLATFORM, false);
        pluginGeneratedSerialDescriptor.addElement("releaseNotes", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = AppRelease.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, AppInfo$$serializer.INSTANCE, stringSerializer, intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[5]), intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AppRelease deserialize(@NotNull Decoder decoder) {
        AppInfo appInfo;
        int iDecodeIntElement;
        List list;
        int i;
        String str;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i2;
        String strDecodeStringElement3;
        AppInfo appInfo2;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AppRelease.$childSerializers;
        int i3 = 7;
        int i4 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            AppInfo appInfo3 = (AppInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, AppInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            appInfo = appInfo3;
            list = list2;
            i = 255;
            i2 = iDecodeIntElement2;
            str = strDecodeStringElement4;
        } else {
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            AppInfo appInfo4 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            boolean z2 = true;
            int iDecodeIntElement4 = 0;
            List list3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        appInfo2 = appInfo4;
                        z = true;
                        z2 = false;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 0:
                        appInfo2 = appInfo4;
                        z = true;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 1:
                        z = true;
                        appInfo2 = (AppInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, AppInfo$$serializer.INSTANCE, appInfo4);
                        i5 |= 2;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 2:
                        i5 |= 4;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        appInfo2 = appInfo4;
                        z = true;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 |= 8;
                        appInfo2 = appInfo4;
                        z = true;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 4:
                        i5 |= 16;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        appInfo2 = appInfo4;
                        z = true;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 5:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], list3);
                        i5 |= 32;
                        appInfo2 = appInfo4;
                        z = true;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i5 |= 64;
                        appInfo2 = appInfo4;
                        z = true;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 7:
                        i5 |= 128;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        appInfo2 = appInfo4;
                        z = true;
                        appInfo4 = appInfo2;
                        i3 = 7;
                        i4 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            appInfo = appInfo4;
            iDecodeIntElement = iDecodeIntElement4;
            list = list3;
            i = i5;
            str = strDecodeStringElement5;
            strDecodeStringElement = strDecodeStringElement6;
            strDecodeStringElement2 = strDecodeStringElement7;
            i2 = iDecodeIntElement3;
            strDecodeStringElement3 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AppRelease(i, strDecodeStringElement3, appInfo, str, iDecodeIntElement, strDecodeStringElement, list, i2, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AppRelease appRelease) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(appRelease, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AppRelease.write$Self$OKUpgrade_ok_upgrade(appRelease, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
