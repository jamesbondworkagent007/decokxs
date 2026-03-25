package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ConvertStage {
    public static final int $stable = 0;
    private final ConvertStageStatus stageStatus;
    private final ConvertStageType stageType;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.ConvertStageType", ConvertStageType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.web3pay.lib.core.model.ConvertStageStatus", ConvertStageStatus.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConvertStage copy$default(ConvertStage convertStage, ConvertStageType convertStageType, ConvertStageStatus convertStageStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            convertStageType = convertStage.stageType;
        }
        if ((i & 2) != 0) {
            convertStageStatus = convertStage.stageStatus;
        }
        return convertStage.copy(convertStageType, convertStageStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertStageType component1() {
        return this.stageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertStageStatus component2() {
        return this.stageStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertStage copy(@NotNull ConvertStageType convertStageType, @NotNull ConvertStageStatus convertStageStatus) {
        Intrinsics.checkNotNullParameter(convertStageType, "");
        Intrinsics.checkNotNullParameter(convertStageStatus, "");
        return new ConvertStage(convertStageType, convertStageStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertStage)) {
            return false;
        }
        ConvertStage convertStage = (ConvertStage) obj;
        return this.stageType == convertStage.stageType && this.stageStatus == convertStage.stageStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertStageStatus getStageStatus() {
        return this.stageStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertStageType getStageType() {
        return this.stageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.stageType.hashCode() * 31) + this.stageStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertStage(stageType=" + this.stageType + ", stageStatus=" + this.stageStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ConvertStage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertStage> serializer() {
            return ConvertStage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertStage(int i, ConvertStageType convertStageType, ConvertStageStatus convertStageStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ConvertStage$$serializer.INSTANCE.getDescriptor());
        }
        this.stageType = convertStageType;
        this.stageStatus = convertStageStatus;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertStage convertStage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], convertStage.stageType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], convertStage.stageStatus);
    }

    public ConvertStage(@NotNull ConvertStageType convertStageType, @NotNull ConvertStageStatus convertStageStatus) {
        Intrinsics.checkNotNullParameter(convertStageType, "");
        Intrinsics.checkNotNullParameter(convertStageStatus, "");
        this.stageType = convertStageType;
        this.stageStatus = convertStageStatus;
    }
}
