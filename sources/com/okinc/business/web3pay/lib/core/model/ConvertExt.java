package com.okinc.business.web3pay.lib.core.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ConvertExt {
    private final String bidPx;
    private final ConvertOrderType convertOrderType;
    private final boolean convertStageFinished;
    private final int estimatedSeconds;
    private final ConvertFailedType failedType;
    private final String fromChainLogo;
    private final List<ConvertStage> stages;
    private final String toChainLogo;
    private final String toNetworkName;
    private final String toTokenAddress;
    private final String toTokenAmount;
    private final int toTokenDecimal;
    private final String toTokenLogo;
    private final String toTokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(ConvertStage$$serializer.INSTANCE), EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.ConvertFailedType", ConvertFailedType.values()), null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.ConvertOrderType", ConvertOrderType.values()), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertStage> component10() {
        return this.stages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertFailedType component11() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.convertStageFinished;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderType component13() {
        return this.convertOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.estimatedSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toNetworkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertExt copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<ConvertStage> list, @NotNull ConvertFailedType convertFailedType, boolean z, @NotNull ConvertOrderType convertOrderType, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(convertFailedType, "");
        Intrinsics.checkNotNullParameter(convertOrderType, "");
        return new ConvertExt(str, i, str2, str3, str4, str5, str6, str7, str8, list, convertFailedType, z, convertOrderType, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertExt)) {
            return false;
        }
        ConvertExt convertExt = (ConvertExt) obj;
        return Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) convertExt.toTokenAmount) && this.toTokenDecimal == convertExt.toTokenDecimal && Intrinsics.EZpvd((Object) this.toTokenLogo, (Object) convertExt.toTokenLogo) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) convertExt.toTokenSymbol) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) convertExt.toTokenAddress) && Intrinsics.EZpvd((Object) this.toNetworkName, (Object) convertExt.toNetworkName) && Intrinsics.EZpvd((Object) this.fromChainLogo, (Object) convertExt.fromChainLogo) && Intrinsics.EZpvd((Object) this.toChainLogo, (Object) convertExt.toChainLogo) && Intrinsics.EZpvd((Object) this.bidPx, (Object) convertExt.bidPx) && Intrinsics.EZpvd(this.stages, convertExt.stages) && this.failedType == convertExt.failedType && this.convertStageFinished == convertExt.convertStageFinished && this.convertOrderType == convertExt.convertOrderType && this.estimatedSeconds == convertExt.estimatedSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertOrderType getConvertOrderType() {
        return this.convertOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getConvertStageFinished() {
        return this.convertStageFinished;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEstimatedSeconds() {
        return this.estimatedSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertFailedType getFailedType() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainLogo() {
        return this.fromChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConvertStage> getStages() {
        return this.stages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainLogo() {
        return this.toChainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToNetworkName() {
        return this.toNetworkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenLogo() {
        return this.toTokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.toTokenAmount.hashCode() * 31) + Integer.hashCode(this.toTokenDecimal)) * 31) + this.toTokenLogo.hashCode()) * 31) + this.toTokenSymbol.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.toNetworkName.hashCode()) * 31) + this.fromChainLogo.hashCode()) * 31) + this.toChainLogo.hashCode()) * 31) + this.bidPx.hashCode()) * 31) + this.stages.hashCode()) * 31) + this.failedType.hashCode()) * 31) + Boolean.hashCode(this.convertStageFinished)) * 31) + this.convertOrderType.hashCode()) * 31) + Integer.hashCode(this.estimatedSeconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertExt(toTokenAmount=" + this.toTokenAmount + ", toTokenDecimal=" + this.toTokenDecimal + ", toTokenLogo=" + this.toTokenLogo + ", toTokenSymbol=" + this.toTokenSymbol + ", toTokenAddress=" + this.toTokenAddress + ", toNetworkName=" + this.toNetworkName + ", fromChainLogo=" + this.fromChainLogo + ", toChainLogo=" + this.toChainLogo + ", bidPx=" + this.bidPx + ", stages=" + this.stages + ", failedType=" + this.failedType + ", convertStageFinished=" + this.convertStageFinished + ", convertOrderType=" + this.convertOrderType + ", estimatedSeconds=" + this.estimatedSeconds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ConvertExt.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertExt> serializer() {
            return ConvertExt$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertExt(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, ConvertFailedType convertFailedType, boolean z, ConvertOrderType convertOrderType, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16383, ConvertExt$$serializer.INSTANCE.getDescriptor());
        }
        this.toTokenAmount = str;
        this.toTokenDecimal = i2;
        this.toTokenLogo = str2;
        this.toTokenSymbol = str3;
        this.toTokenAddress = str4;
        this.toNetworkName = str5;
        this.fromChainLogo = str6;
        this.toChainLogo = str7;
        this.bidPx = str8;
        this.stages = list;
        this.failedType = convertFailedType;
        this.convertStageFinished = z;
        this.convertOrderType = convertOrderType;
        this.estimatedSeconds = i3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertExt convertExt, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, convertExt.toTokenAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, convertExt.toTokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, convertExt.toTokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, convertExt.toTokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, convertExt.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, convertExt.toNetworkName);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, convertExt.fromChainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, convertExt.toChainLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, convertExt.bidPx);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], convertExt.stages);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], convertExt.failedType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 11, convertExt.convertStageFinished);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], convertExt.convertOrderType);
        compositeEncoder.encodeIntElement(serialDescriptor, 13, convertExt.estimatedSeconds);
    }

    public ConvertExt(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<ConvertStage> list, @NotNull ConvertFailedType convertFailedType, boolean z, @NotNull ConvertOrderType convertOrderType, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(convertFailedType, "");
        Intrinsics.checkNotNullParameter(convertOrderType, "");
        this.toTokenAmount = str;
        this.toTokenDecimal = i;
        this.toTokenLogo = str2;
        this.toTokenSymbol = str3;
        this.toTokenAddress = str4;
        this.toNetworkName = str5;
        this.fromChainLogo = str6;
        this.toChainLogo = str7;
        this.bidPx = str8;
        this.stages = list;
        this.failedType = convertFailedType;
        this.convertStageFinished = z;
        this.convertOrderType = convertOrderType;
        this.estimatedSeconds = i2;
    }
}
