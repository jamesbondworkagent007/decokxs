package com.okinc.business.invest_biz.data.bean.request;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BonusPopupRequest {
    public final long chainId;
    public final String investmentId;
    public final List<String> unclaimedTokenAddress;
    public final String userAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.data.bean.request.BonusPopupRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BonusPopupRequest copy$default(BonusPopupRequest bonusPopupRequest, String str, String str2, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bonusPopupRequest.investmentId;
        }
        if ((i & 2) != 0) {
            str2 = bonusPopupRequest.userAddress;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = bonusPopupRequest.chainId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            list = bonusPopupRequest.unclaimedTokenAddress;
        }
        return bonusPopupRequest.OLrzqt(str, str3, j2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BonusPopupRequest OLrzqt(@NotNull String str, @NotNull String str2, long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BonusPopupRequest(str, str2, j, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusPopupRequest)) {
            return false;
        }
        BonusPopupRequest bonusPopupRequest = (BonusPopupRequest) obj;
        return Intrinsics.EZpvd((Object) this.investmentId, (Object) bonusPopupRequest.investmentId) && Intrinsics.EZpvd((Object) this.userAddress, (Object) bonusPopupRequest.userAddress) && this.chainId == bonusPopupRequest.chainId && Intrinsics.EZpvd(this.unclaimedTokenAddress, bonusPopupRequest.unclaimedTokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.investmentId.hashCode() * 31) + this.userAddress.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + this.unclaimedTokenAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BonusPopupRequest(investmentId=" + this.investmentId + ", userAddress=" + this.userAddress + ", chainId=" + this.chainId + ", unclaimedTokenAddress=" + this.unclaimedTokenAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.BonusPopupRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BonusPopupRequest> serializer() {
            return BonusPopupRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BonusPopupRequest(int i, String str, String str2, long j, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BonusPopupRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.investmentId = str;
        this.userAddress = str2;
        this.chainId = j;
        this.unclaimedTokenAddress = list;
    }

    public static final /* synthetic */ void OLrzqt(BonusPopupRequest bonusPopupRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bonusPopupRequest.investmentId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bonusPopupRequest.userAddress);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, bonusPopupRequest.chainId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], bonusPopupRequest.unclaimedTokenAddress);
    }

    public BonusPopupRequest(@NotNull String str, @NotNull String str2, long j, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.investmentId = str;
        this.userAddress = str2;
        this.chainId = j;
        this.unclaimedTokenAddress = list;
    }
}
