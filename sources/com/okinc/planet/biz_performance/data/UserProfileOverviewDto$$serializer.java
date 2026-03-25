package com.okinc.planet.biz_performance.data;

import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import o.C46417tTo;
import o.C46419tTq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class UserProfileOverviewDto$$serializer implements GeneratedSerializer<UserProfileOverviewDto> {
    public static final int $stable;
    public static final UserProfileOverviewDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UserProfileOverviewDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UserProfileOverviewDto$$serializer userProfileOverviewDto$$serializer = new UserProfileOverviewDto$$serializer();
        INSTANCE = userProfileOverviewDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.planet.biz_performance.data.UserProfileOverviewDto", userProfileOverviewDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("pnl", true);
        pluginGeneratedSerialDescriptor.addElement("pnlRatio", true);
        pluginGeneratedSerialDescriptor.addElement("equity", true);
        pluginGeneratedSerialDescriptor.addElement("onboardDuration", true);
        pluginGeneratedSerialDescriptor.addElement("maxRetreat", true);
        pluginGeneratedSerialDescriptor.addElement("riskRewardRatio", false);
        pluginGeneratedSerialDescriptor.addElement("winRate", true);
        pluginGeneratedSerialDescriptor.addElement("withdrawal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        PlanetNumericString$$serializer planetNumericString$$serializer = PlanetNumericString$$serializer.INSTANCE;
        C46419tTq c46419tTq = C46419tTq.EZpvd;
        return new KSerializer[]{planetNumericString$$serializer, planetNumericString$$serializer, planetNumericString$$serializer, C46417tTo.KWHzl, c46419tTq, StringSerializer.INSTANCE, c46419tTq, planetNumericString$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UserProfileOverviewDto deserialize(@NotNull Decoder decoder) {
        int i;
        String strAEQbTJ;
        float f;
        long j;
        String str;
        String str2;
        String str3;
        float f2;
        String str4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        boolean zDecodeSequentially = compositeDecoderBeginStructure.decodeSequentially();
        Float fValueOf = Float.valueOf(0.0f);
        boolean z2 = false;
        if (zDecodeSequentially) {
            PlanetNumericString$$serializer planetNumericString$$serializer = PlanetNumericString$$serializer.INSTANCE;
            PlanetNumericString planetNumericString = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, planetNumericString$$serializer, null);
            strAEQbTJ = planetNumericString != null ? planetNumericString.AEQbTJ() : null;
            PlanetNumericString planetNumericString2 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, planetNumericString$$serializer, null);
            String strAEQbTJ2 = planetNumericString2 != null ? planetNumericString2.AEQbTJ() : null;
            PlanetNumericString planetNumericString3 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, planetNumericString$$serializer, null);
            String strAEQbTJ3 = planetNumericString3 != null ? planetNumericString3.AEQbTJ() : null;
            long jLongValue = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, C46417tTo.KWHzl, 0L)).longValue();
            C46419tTq c46419tTq = C46419tTq.EZpvd;
            float fFloatValue = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, c46419tTq, fValueOf)).floatValue();
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            float fFloatValue2 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, c46419tTq, fValueOf)).floatValue();
            PlanetNumericString planetNumericString4 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, planetNumericString$$serializer, null);
            String strAEQbTJ4 = planetNumericString4 != null ? planetNumericString4.AEQbTJ() : null;
            i = 255;
            f2 = fFloatValue2;
            str = strAEQbTJ3;
            str2 = strAEQbTJ2;
            str3 = strAEQbTJ4;
            str4 = strDecodeStringElement;
            j = jLongValue;
            f = fFloatValue;
        } else {
            float fFloatValue3 = 0.0f;
            long jLongValue2 = 0;
            i = 0;
            boolean z3 = true;
            String strDecodeStringElement2 = null;
            String strAEQbTJ5 = null;
            String strAEQbTJ6 = null;
            String strAEQbTJ7 = null;
            float fFloatValue4 = 0.0f;
            strAEQbTJ = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = z2;
                        z3 = z;
                        continue;
                        z2 = z;
                        break;
                    case 0:
                        z = false;
                        PlanetNumericString planetNumericString5 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ != null ? PlanetNumericString.OLrzqt(strAEQbTJ) : null);
                        strAEQbTJ = planetNumericString5 != null ? planetNumericString5.AEQbTJ() : null;
                        i |= 1;
                        continue;
                        z2 = z;
                        break;
                    case 1:
                        PlanetNumericString planetNumericString6 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ6 != null ? PlanetNumericString.OLrzqt(strAEQbTJ6) : null);
                        strAEQbTJ6 = planetNumericString6 != null ? planetNumericString6.AEQbTJ() : null;
                        i |= 2;
                        break;
                    case 2:
                        PlanetNumericString planetNumericString7 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ5 != null ? PlanetNumericString.OLrzqt(strAEQbTJ5) : null);
                        strAEQbTJ5 = planetNumericString7 != null ? planetNumericString7.AEQbTJ() : null;
                        i |= 4;
                        break;
                    case 3:
                        jLongValue2 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, C46417tTo.KWHzl, Long.valueOf(jLongValue2))).longValue();
                        i |= 8;
                        break;
                    case 4:
                        fFloatValue3 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, C46419tTq.EZpvd, Float.valueOf(fFloatValue3))).floatValue();
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        fFloatValue4 = ((Number) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, C46419tTq.EZpvd, Float.valueOf(fFloatValue4))).floatValue();
                        i |= 64;
                        break;
                    case 7:
                        PlanetNumericString planetNumericString8 = (PlanetNumericString) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, PlanetNumericString$$serializer.INSTANCE, strAEQbTJ7 != null ? PlanetNumericString.OLrzqt(strAEQbTJ7) : null);
                        strAEQbTJ7 = planetNumericString8 != null ? planetNumericString8.AEQbTJ() : null;
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                z = false;
                z2 = z;
            }
            f = fFloatValue3;
            j = jLongValue2;
            str = strAEQbTJ5;
            str2 = strAEQbTJ6;
            str3 = strAEQbTJ7;
            String str5 = strDecodeStringElement2;
            f2 = fFloatValue4;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserProfileOverviewDto(i, strAEQbTJ, str2, str, j, f, str4, f2, str3, null, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UserProfileOverviewDto userProfileOverviewDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(userProfileOverviewDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserProfileOverviewDto.OLrzqt(userProfileOverviewDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
