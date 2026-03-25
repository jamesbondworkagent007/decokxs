package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class BatchImportAddressData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String alias;
    public final String targetAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BatchImportAddressData copy$default(BatchImportAddressData batchImportAddressData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = batchImportAddressData.targetAddress;
        }
        if ((i & 2) != 0) {
            str2 = batchImportAddressData.alias;
        }
        return batchImportAddressData.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BatchImportAddressData AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BatchImportAddressData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchImportAddressData)) {
            return false;
        }
        BatchImportAddressData batchImportAddressData = (BatchImportAddressData) obj;
        return Intrinsics.EZpvd((Object) this.targetAddress, (Object) batchImportAddressData.targetAddress) && Intrinsics.EZpvd((Object) this.alias, (Object) batchImportAddressData.alias);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.targetAddress.hashCode() * 31) + this.alias.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BatchImportAddressData(targetAddress=" + this.targetAddress + ", alias=" + this.alias + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.BatchImportAddressData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BatchImportAddressData> serializer() {
            return BatchImportAddressData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BatchImportAddressData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BatchImportAddressData$$serializer.INSTANCE.getDescriptor());
        }
        this.targetAddress = str;
        this.alias = str2;
    }

    public static final /* synthetic */ void EZpvd(BatchImportAddressData batchImportAddressData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, batchImportAddressData.targetAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, batchImportAddressData.alias);
    }

    public BatchImportAddressData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.targetAddress = str;
        this.alias = str2;
    }
}
