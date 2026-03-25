package com.okinc.business.defi.wallet.tee.activate.model;

import com.okinc.business.defi.wallet.tee.common.model.TeeCommand;
import com.okinc.business.defi.wallet.tee.common.model.TeeType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ActivateTeeModel {
    private final boolean autoRenew;
    private final List<Long> chainIndexList;
    private final TeeCommand command;
    private final long expireTimestamp;
    private final TeeType teeType;
    private final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(LongSerializer.INSTANCE), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.wallet.tee.common.model.TeeType", TeeType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.wallet.tee.common.model.TeeCommand", TeeCommand.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeType component5() {
        return this.teeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeCommand component6() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivateTeeModel copy(@NotNull List<Long> list, long j, long j2, boolean z, @NotNull TeeType teeType, @NotNull TeeCommand teeCommand) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(teeType, "");
        Intrinsics.checkNotNullParameter(teeCommand, "");
        return new ActivateTeeModel(list, j, j2, z, teeType, teeCommand);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateTeeModel)) {
            return false;
        }
        ActivateTeeModel activateTeeModel = (ActivateTeeModel) obj;
        return Intrinsics.EZpvd(this.chainIndexList, activateTeeModel.chainIndexList) && this.timestamp == activateTeeModel.timestamp && this.expireTimestamp == activateTeeModel.expireTimestamp && this.autoRenew == activateTeeModel.autoRenew && this.teeType == activateTeeModel.teeType && this.command == activateTeeModel.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoRenew() {
        return this.autoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getChainIndexList() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeCommand getCommand() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeType getTeeType() {
        return this.teeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainIndexList.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.expireTimestamp)) * 31) + Boolean.hashCode(this.autoRenew)) * 31) + this.teeType.hashCode()) * 31) + this.command.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ActivateTeeModel(chainIndexList=" + this.chainIndexList + ", timestamp=" + this.timestamp + ", expireTimestamp=" + this.expireTimestamp + ", autoRenew=" + this.autoRenew + ", teeType=" + this.teeType + ", command=" + this.command + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ActivateTeeModel> serializer() {
            return ActivateTeeModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ActivateTeeModel(int i, List list, long j, long j2, boolean z, TeeType teeType, TeeCommand teeCommand, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ActivateTeeModel$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndexList = list;
        this.timestamp = j;
        this.expireTimestamp = j2;
        this.autoRenew = z;
        this.teeType = teeType;
        this.command = teeCommand;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ActivateTeeModel activateTeeModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], activateTeeModel.chainIndexList);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, activateTeeModel.timestamp);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, activateTeeModel.expireTimestamp);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, activateTeeModel.autoRenew);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], activateTeeModel.teeType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], activateTeeModel.command);
    }

    public ActivateTeeModel(@NotNull List<Long> list, long j, long j2, boolean z, @NotNull TeeType teeType, @NotNull TeeCommand teeCommand) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(teeType, "");
        Intrinsics.checkNotNullParameter(teeCommand, "");
        this.chainIndexList = list;
        this.timestamp = j;
        this.expireTimestamp = j2;
        this.autoRenew = z;
        this.teeType = teeType;
        this.command = teeCommand;
    }
}
