package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TravelRuleRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final String inputAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int walletType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TravelRuleRequest copy$default(TravelRuleRequest travelRuleRequest, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = travelRuleRequest.tokenCoinTypeNo;
        }
        if ((i2 & 2) != 0) {
            str2 = travelRuleRequest.tokenAmount;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = travelRuleRequest.address;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = travelRuleRequest.walletType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = travelRuleRequest.inputAddress;
        }
        return travelRuleRequest.copy(str, str5, str6, i3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inputAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TravelRuleRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TravelRuleRequest(str, str2, str3, i, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelRuleRequest)) {
            return false;
        }
        TravelRuleRequest travelRuleRequest = (TravelRuleRequest) obj;
        return Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) travelRuleRequest.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) travelRuleRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.address, (Object) travelRuleRequest.address) && this.walletType == travelRuleRequest.walletType && Intrinsics.EZpvd((Object) this.inputAddress, (Object) travelRuleRequest.inputAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputAddress() {
        return this.inputAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tokenCoinTypeNo.hashCode() * 31) + this.tokenAmount.hashCode()) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.walletType)) * 31) + this.inputAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TravelRuleRequest(tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", tokenAmount=" + this.tokenAmount + ", address=" + this.address + ", walletType=" + this.walletType + ", inputAddress=" + this.inputAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.onchaintransaction.model.TravelRuleRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TravelRuleRequest> serializer() {
            return TravelRuleRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TravelRuleRequest(int i, String str, String str2, String str3, int i2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TravelRuleRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenCoinTypeNo = str;
        this.tokenAmount = str2;
        this.address = str3;
        this.walletType = i2;
        this.inputAddress = str4;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(TravelRuleRequest travelRuleRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, travelRuleRequest.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, travelRuleRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, travelRuleRequest.address);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, travelRuleRequest.walletType);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, travelRuleRequest.inputAddress);
    }

    public TravelRuleRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenCoinTypeNo = str;
        this.tokenAmount = str2;
        this.address = str3;
        this.walletType = i;
        this.inputAddress = str4;
    }
}
