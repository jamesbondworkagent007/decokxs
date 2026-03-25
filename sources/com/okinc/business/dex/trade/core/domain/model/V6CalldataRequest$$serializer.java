package com.okinc.business.dex.trade.core.domain.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee;
import com.okinc.business.dex.trade.core.domain.model.common.NetworkFee$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig$$serializer;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class V6CalldataRequest$$serializer implements GeneratedSerializer<V6CalldataRequest> {
    public static final int $stable;
    public static final V6CalldataRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private V6CalldataRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        V6CalldataRequest$$serializer v6CalldataRequest$$serializer = new V6CalldataRequest$$serializer();
        INSTANCE = v6CalldataRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.trade.core.domain.model.V6CalldataRequest", v6CalldataRequest$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, true);
        pluginGeneratedSerialDescriptor.addElement("simulate", true);
        pluginGeneratedSerialDescriptor.addElement("orderSource", true);
        pluginGeneratedSerialDescriptor.addElement("networkFee", true);
        pluginGeneratedSerialDescriptor.addElement("slippageConfig", false);
        pluginGeneratedSerialDescriptor.addElement("accountInfo", true);
        pluginGeneratedSerialDescriptor.addElement("preSetConfig", false);
        pluginGeneratedSerialDescriptor.addElement("permit2", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", false);
        pluginGeneratedSerialDescriptor.addElement("quoteId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(NetworkFee$$serializer.INSTANCE), SlippageConfig$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(AccountInfo$$serializer.INSTANCE), PreSetConfig$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(CalldataPermit2$$serializer.INSTANCE), stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final V6CalldataRequest deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        SlippageConfig slippageConfig;
        AccountInfo accountInfo;
        CalldataPermit2 calldataPermit2;
        PreSetConfig preSetConfig;
        String strDecodeStringElement;
        String str;
        int i;
        NetworkFee networkFee;
        String str2;
        String str3;
        NetworkFee networkFee2;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 9;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            NetworkFee networkFee3 = (NetworkFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, NetworkFee$$serializer.INSTANCE, null);
            SlippageConfig slippageConfig2 = (SlippageConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, SlippageConfig$$serializer.INSTANCE, null);
            AccountInfo accountInfo2 = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, AccountInfo$$serializer.INSTANCE, null);
            PreSetConfig preSetConfig2 = (PreSetConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, PreSetConfig$$serializer.INSTANCE, null);
            CalldataPermit2 calldataPermit22 = (CalldataPermit2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, CalldataPermit2$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            str2 = str6;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            calldataPermit2 = calldataPermit22;
            preSetConfig = preSetConfig2;
            accountInfo = accountInfo2;
            networkFee = networkFee3;
            str = strDecodeStringElement2;
            slippageConfig = slippageConfig2;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str3 = str5;
            i = 1023;
        } else {
            int i7 = 0;
            boolean z = true;
            SlippageConfig slippageConfig3 = null;
            AccountInfo accountInfo3 = null;
            PreSetConfig preSetConfig3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            NetworkFee networkFee4 = null;
            String str7 = null;
            String str8 = null;
            CalldataPermit2 calldataPermit23 = null;
            zDecodeBooleanElement = false;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        networkFee2 = networkFee4;
                        str4 = str7;
                        z = false;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 0:
                        networkFee2 = networkFee4;
                        str4 = str7;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str8);
                        i7 |= 1;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 1:
                        networkFee2 = networkFee4;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i7 |= 2;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 2:
                        networkFee2 = networkFee4;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str7);
                        i7 |= 4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 3:
                        networkFee4 = (NetworkFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, NetworkFee$$serializer.INSTANCE, networkFee4);
                        i7 |= 8;
                        networkFee2 = networkFee4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 4:
                        slippageConfig3 = (SlippageConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, SlippageConfig$$serializer.INSTANCE, slippageConfig3);
                        i7 |= 16;
                        networkFee2 = networkFee4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 5:
                        accountInfo3 = (AccountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, AccountInfo$$serializer.INSTANCE, accountInfo3);
                        i7 |= 32;
                        break;
                    case 6:
                        i7 |= 64;
                        preSetConfig3 = (PreSetConfig) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, PreSetConfig$$serializer.INSTANCE, preSetConfig3);
                        networkFee2 = networkFee4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        calldataPermit23 = (CalldataPermit2) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, CalldataPermit2$$serializer.INSTANCE, calldataPermit23);
                        networkFee2 = networkFee4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        networkFee2 = networkFee4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        networkFee2 = networkFee4;
                        str4 = str7;
                        networkFee4 = networkFee2;
                        str7 = str4;
                        i2 = 9;
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            NetworkFee networkFee5 = networkFee4;
            String str9 = str7;
            String str10 = str8;
            slippageConfig = slippageConfig3;
            accountInfo = accountInfo3;
            calldataPermit2 = calldataPermit23;
            preSetConfig = preSetConfig3;
            strDecodeStringElement = strDecodeStringElement3;
            str = strDecodeStringElement4;
            i = i7;
            networkFee = networkFee5;
            str2 = str9;
            str3 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new V6CalldataRequest(i, str3, zDecodeBooleanElement, str2, networkFee, slippageConfig, accountInfo, preSetConfig, calldataPermit2, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull V6CalldataRequest v6CalldataRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(v6CalldataRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        V6CalldataRequest.write$Self$OKDex_dex_impl(v6CalldataRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
