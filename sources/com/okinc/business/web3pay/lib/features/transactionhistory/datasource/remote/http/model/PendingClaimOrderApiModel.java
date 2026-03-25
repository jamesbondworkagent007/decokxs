package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C31341lsG;
import o.C59443zhD;
import o.InterfaceC31382lsv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PendingClaimOrderApiModel implements InterfaceC31382lsv<C31341lsG> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final String chainIndex;
    private final String comment;
    private final long createTime;
    private final String from;
    private final String orderId;
    private final String tokenAddress;
    private final String tokenAmount;
    private final int tokenDecimal;
    private final String tokenLogo;
    private final String tokenSymbol;
    private final String uid;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component12() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingClaimOrderApiModel copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, @NotNull String str9, @NotNull String str10, long j, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new PendingClaimOrderApiModel(str, str2, str3, str4, str5, str6, str7, i, str8, str9, str10, j, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingClaimOrderApiModel)) {
            return false;
        }
        PendingClaimOrderApiModel pendingClaimOrderApiModel = (PendingClaimOrderApiModel) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) pendingClaimOrderApiModel.orderId) && Intrinsics.EZpvd((Object) this.from, (Object) pendingClaimOrderApiModel.from) && Intrinsics.EZpvd((Object) this.avatar, (Object) pendingClaimOrderApiModel.avatar) && Intrinsics.EZpvd((Object) this.comment, (Object) pendingClaimOrderApiModel.comment) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) pendingClaimOrderApiModel.tokenLogo) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) pendingClaimOrderApiModel.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) pendingClaimOrderApiModel.tokenAmount) && this.tokenDecimal == pendingClaimOrderApiModel.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) pendingClaimOrderApiModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) pendingClaimOrderApiModel.tokenAddress) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) pendingClaimOrderApiModel.usdAmount) && this.createTime == pendingClaimOrderApiModel.createTime && Intrinsics.EZpvd((Object) this.uid, (Object) pendingClaimOrderApiModel.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getComment() {
        return this.comment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.from.hashCode();
        String str = this.avatar;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.comment;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tokenLogo.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.usdAmount.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + this.uid.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PendingClaimOrderApiModel(orderId=" + this.orderId + ", from=" + this.from + ", avatar=" + this.avatar + ", comment=" + this.comment + ", tokenLogo=" + this.tokenLogo + ", chainIndex=" + this.chainIndex + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", usdAmount=" + this.usdAmount + ", createTime=" + this.createTime + ", uid=" + this.uid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PendingClaimOrderApiModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PendingClaimOrderApiModel> serializer() {
            return PendingClaimOrderApiModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PendingClaimOrderApiModel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, String str8, String str9, String str10, long j, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8191, PendingClaimOrderApiModel$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.from = str2;
        this.avatar = str3;
        this.comment = str4;
        this.tokenLogo = str5;
        this.chainIndex = str6;
        this.tokenAmount = str7;
        this.tokenDecimal = i2;
        this.tokenSymbol = str8;
        this.tokenAddress = str9;
        this.usdAmount = str10;
        this.createTime = j;
        this.uid = str11;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PendingClaimOrderApiModel pendingClaimOrderApiModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pendingClaimOrderApiModel.getOrderId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pendingClaimOrderApiModel.from);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, pendingClaimOrderApiModel.avatar);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, pendingClaimOrderApiModel.comment);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, pendingClaimOrderApiModel.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, pendingClaimOrderApiModel.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, pendingClaimOrderApiModel.tokenAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, pendingClaimOrderApiModel.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, pendingClaimOrderApiModel.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, pendingClaimOrderApiModel.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, pendingClaimOrderApiModel.usdAmount);
        compositeEncoder.encodeLongElement(serialDescriptor, 11, pendingClaimOrderApiModel.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, pendingClaimOrderApiModel.uid);
    }

    public PendingClaimOrderApiModel(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, @NotNull String str9, @NotNull String str10, long j, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.orderId = str;
        this.from = str2;
        this.avatar = str3;
        this.comment = str4;
        this.tokenLogo = str5;
        this.chainIndex = str6;
        this.tokenAmount = str7;
        this.tokenDecimal = i;
        this.tokenSymbol = str8;
        this.tokenAddress = str9;
        this.usdAmount = str10;
        this.createTime = j;
        this.uid = str11;
    }

    /* JADX DEBUG: Method merged with bridge method: toDomainModel()Ljava/lang/Object; */
    @Override // o.InterfaceC31382lsv
    public C31341lsG toDomainModel() {
        return new C31341lsG(getOrderId(), this.from, this.tokenLogo, this.chainIndex, this.tokenAmount, this.tokenDecimal, this.tokenSymbol, this.tokenAddress, C59443zhD.fARcdN(this.usdAmount), this.createTime, this.avatar, this.comment, this.uid);
    }
}
