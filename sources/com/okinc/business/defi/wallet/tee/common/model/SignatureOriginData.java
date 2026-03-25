package com.okinc.business.defi.wallet.tee.common.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C54907xZt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class SignatureOriginData {
    private final String accountId;
    private final List<Long> chainIndexList;
    private final String command;
    private final String hpkeInfoHash;
    private final String teeId;
    private final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.wallet.tee.common.model.SignatureOriginData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignatureOriginData copy$default(SignatureOriginData signatureOriginData, String str, String str2, long j, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signatureOriginData.accountId;
        }
        if ((i & 2) != 0) {
            str2 = signatureOriginData.teeId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = signatureOriginData.timestamp;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = signatureOriginData.command;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = signatureOriginData.chainIndexList;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str4 = signatureOriginData.hpkeInfoHash;
        }
        return signatureOriginData.copy(str, str5, j2, str6, list2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component5() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hpkeInfoHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignatureOriginData copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull List<Long> list, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SignatureOriginData(str, str2, j, str3, list, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignatureOriginData)) {
            return false;
        }
        SignatureOriginData signatureOriginData = (SignatureOriginData) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) signatureOriginData.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) signatureOriginData.teeId) && this.timestamp == signatureOriginData.timestamp && Intrinsics.EZpvd((Object) this.command, (Object) signatureOriginData.command) && Intrinsics.EZpvd(this.chainIndexList, signatureOriginData.chainIndexList) && Intrinsics.EZpvd((Object) this.hpkeInfoHash, (Object) signatureOriginData.hpkeInfoHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getChainIndexList() {
        return this.chainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommand() {
        return this.command;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHpkeInfoHash() {
        return this.hpkeInfoHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + this.teeId.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.command.hashCode()) * 31) + this.chainIndexList.hashCode()) * 31) + this.hpkeInfoHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignatureOriginData(accountId=" + this.accountId + ", teeId=" + this.teeId + ", timestamp=" + this.timestamp + ", command=" + this.command + ", chainIndexList=" + this.chainIndexList + ", hpkeInfoHash=" + this.hpkeInfoHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.tee.common.model.SignatureOriginData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignatureOriginData> serializer() {
            return SignatureOriginData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignatureOriginData(int i, String str, String str2, long j, String str3, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, SignatureOriginData$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.teeId = str2;
        this.timestamp = j;
        this.command = str3;
        this.chainIndexList = list;
        this.hpkeInfoHash = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignatureOriginData signatureOriginData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signatureOriginData.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signatureOriginData.teeId);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, signatureOriginData.timestamp);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, signatureOriginData.command);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], signatureOriginData.chainIndexList);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, signatureOriginData.hpkeInfoHash);
    }

    public SignatureOriginData(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull List<Long> list, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountId = str;
        this.teeId = str2;
        this.timestamp = j;
        this.command = str3;
        this.chainIndexList = list;
        this.hpkeInfoHash = str4;
    }

    public final String toJson() {
        return C54907xZt.encodeToString$default(Companion.serializer(), this, false, 2, null);
    }
}
