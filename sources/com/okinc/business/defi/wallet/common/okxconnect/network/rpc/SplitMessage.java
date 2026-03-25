package com.okinc.business.defi.wallet.common.okxconnect.network.rpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SplitMessage {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String packageGroupId;
    private final int packageIndex;
    private final int protocolVersion;
    private final int totalCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SplitMessage copy$default(SplitMessage splitMessage, int i, int i2, String str, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = splitMessage.protocolVersion;
        }
        if ((i4 & 2) != 0) {
            i2 = splitMessage.totalCount;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = splitMessage.packageGroupId;
        }
        String str3 = str;
        if ((i4 & 8) != 0) {
            i3 = splitMessage.packageIndex;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = splitMessage.content;
        }
        return splitMessage.copy(i, i5, str3, i6, str2);
    }

    @SerialName("package_group_id")
    public static /* synthetic */ void getPackageGroupId$annotations() {
    }

    @SerialName("package_index")
    public static /* synthetic */ void getPackageIndex$annotations() {
    }

    @SerialName("protocol_version")
    public static /* synthetic */ void getProtocolVersion$annotations() {
    }

    @SerialName("total_count")
    public static /* synthetic */ void getTotalCount$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.protocolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.packageGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.packageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SplitMessage copy(int i, int i2, @NotNull String str, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SplitMessage(i, i2, str, i3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitMessage)) {
            return false;
        }
        SplitMessage splitMessage = (SplitMessage) obj;
        return this.protocolVersion == splitMessage.protocolVersion && this.totalCount == splitMessage.totalCount && Intrinsics.EZpvd((Object) this.packageGroupId, (Object) splitMessage.packageGroupId) && this.packageIndex == splitMessage.packageIndex && Intrinsics.EZpvd((Object) this.content, (Object) splitMessage.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPackageGroupId() {
        return this.packageGroupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPackageIndex() {
        return this.packageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.protocolVersion) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.packageGroupId.hashCode()) * 31) + Integer.hashCode(this.packageIndex)) * 31) + this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SplitMessage(protocolVersion=" + this.protocolVersion + ", totalCount=" + this.totalCount + ", packageGroupId=" + this.packageGroupId + ", packageIndex=" + this.packageIndex + ", content=" + this.content + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.network.rpc.SplitMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SplitMessage> serializer() {
            return SplitMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SplitMessage(int i, int i2, int i3, String str, int i4, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, SplitMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.protocolVersion = i2;
        this.totalCount = i3;
        this.packageGroupId = str;
        this.packageIndex = i4;
        this.content = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SplitMessage splitMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, splitMessage.protocolVersion);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, splitMessage.totalCount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, splitMessage.packageGroupId);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, splitMessage.packageIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, splitMessage.content);
    }

    public SplitMessage(int i, int i2, @NotNull String str, int i3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.protocolVersion = i;
        this.totalCount = i2;
        this.packageGroupId = str;
        this.packageIndex = i3;
        this.content = str2;
    }
}
