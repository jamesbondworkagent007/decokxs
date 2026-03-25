package com.okinc.kyc.api.biz.bean;

import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class KycInfoListBean$PersonalBean$KycInfoBean$$serializer implements GeneratedSerializer<KycInfoListBean.PersonalBean.KycInfoBean> {
    public static final int $stable;
    public static final KycInfoListBean$PersonalBean$KycInfoBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private KycInfoListBean$PersonalBean$KycInfoBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        KycInfoListBean$PersonalBean$KycInfoBean$$serializer kycInfoListBean$PersonalBean$KycInfoBean$$serializer = new KycInfoListBean$PersonalBean$KycInfoBean$$serializer();
        INSTANCE = kycInfoListBean$PersonalBean$KycInfoBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.kyc.api.biz.bean.KycInfoListBean.PersonalBean.KycInfoBean", kycInfoListBean$PersonalBean$KycInfoBean$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("corKey", true);
        pluginGeneratedSerialDescriptor.addElement("kycId", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.LEVEL, true);
        pluginGeneratedSerialDescriptor.addElement("levelFlag", true);
        pluginGeneratedSerialDescriptor.addElement("faceStatus", true);
        pluginGeneratedSerialDescriptor.addElement("info", true);
        pluginGeneratedSerialDescriptor.addElement("passTip1", true);
        pluginGeneratedSerialDescriptor.addElement("passTip2", true);
        pluginGeneratedSerialDescriptor.addElement("failReason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, LongSerializer.INSTANCE, intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final KycInfoListBean.PersonalBean.KycInfoBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        int i3;
        int i4;
        String str4;
        String str5;
        long jDecodeLongElement;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            i2 = FrameMetricsAggregator.EVERY_DURATION;
            str3 = strDecodeStringElement;
            str5 = str8;
            str = str7;
            str2 = str6;
            i3 = iDecodeIntElement2;
            str4 = str9;
            i = iDecodeIntElement3;
            i4 = iDecodeIntElement;
        } else {
            boolean z2 = true;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement4 = 0;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement5 = 0;
            int i6 = 0;
            int iDecodeIntElement6 = 0;
            String str13 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        i5 = 7;
                        break;
                    case 0:
                        i6 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        z = z2;
                        z2 = z;
                        i5 = 7;
                        break;
                    case 1:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i6 |= 2;
                        i5 = 7;
                        break;
                    case 2:
                        i6 |= 4;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 = 7;
                        break;
                    case 3:
                        i6 |= 8;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i5 = 7;
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i6 |= 16;
                        i5 = 7;
                        break;
                    case 5:
                        i6 |= 32;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str12);
                        i5 = 7;
                        break;
                    case 6:
                        i6 |= 64;
                        z = z2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str11);
                        z2 = z;
                        i5 = 7;
                        break;
                    case 7:
                        i6 |= 128;
                        z = z2;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str13);
                        z2 = z;
                        i5 = 7;
                        break;
                    case 8:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str10);
                        i6 |= 256;
                        z = z2;
                        z2 = z;
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str11;
            str2 = str12;
            i = iDecodeIntElement6;
            i2 = i6;
            str3 = strDecodeStringElement2;
            i3 = iDecodeIntElement4;
            i4 = iDecodeIntElement5;
            long j = jDecodeLongElement2;
            str4 = str10;
            str5 = str13;
            jDecodeLongElement = j;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new KycInfoListBean.PersonalBean.KycInfoBean(i2, str3, jDecodeLongElement, i4, i3, i, str2, str, str5, str4, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull KycInfoListBean.PersonalBean.KycInfoBean kycInfoBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(kycInfoBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        KycInfoListBean.PersonalBean.KycInfoBean.write$Self$OKCompliance_ok_compliance_api(kycInfoBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
