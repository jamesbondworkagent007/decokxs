package com.okinc.wallet.core.sign.sui;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SuiTokenTxData {
    private static final KSerializer<Object>[] $childSerializers;
    private final String expiration;
    private final String gasBudget;
    private final String gasPrice;
    private final List<SuiObject> inputCoins;
    private final String sender;
    private final String toAddress;
    private final List<SuiObject> tokenInputCoins;
    private final String transferAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasBudget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiObject> component7() {
        return this.inputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiObject> component8() {
        return this.tokenInputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiTokenTxData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<SuiObject> list, @NotNull List<SuiObject> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SuiTokenTxData(str, str2, str3, str4, str5, str6, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiTokenTxData)) {
            return false;
        }
        SuiTokenTxData suiTokenTxData = (SuiTokenTxData) obj;
        return Intrinsics.EZpvd((Object) this.gasPrice, (Object) suiTokenTxData.gasPrice) && Intrinsics.EZpvd((Object) this.gasBudget, (Object) suiTokenTxData.gasBudget) && Intrinsics.EZpvd((Object) this.expiration, (Object) suiTokenTxData.expiration) && Intrinsics.EZpvd((Object) this.sender, (Object) suiTokenTxData.sender) && Intrinsics.EZpvd((Object) this.transferAmount, (Object) suiTokenTxData.transferAmount) && Intrinsics.EZpvd((Object) this.toAddress, (Object) suiTokenTxData.toAddress) && Intrinsics.EZpvd(this.inputCoins, suiTokenTxData.inputCoins) && Intrinsics.EZpvd(this.tokenInputCoins, suiTokenTxData.tokenInputCoins);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasBudget() {
        return this.gasBudget;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiObject> getInputCoins() {
        return this.inputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSender() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiObject> getTokenInputCoins() {
        return this.tokenInputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferAmount() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.gasPrice.hashCode() * 31) + this.gasBudget.hashCode()) * 31) + this.expiration.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.transferAmount.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.inputCoins.hashCode()) * 31) + this.tokenInputCoins.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiTokenTxData(gasPrice=" + this.gasPrice + ", gasBudget=" + this.gasBudget + ", expiration=" + this.expiration + ", sender=" + this.sender + ", transferAmount=" + this.transferAmount + ", toAddress=" + this.toAddress + ", inputCoins=" + this.inputCoins + ", tokenInputCoins=" + this.tokenInputCoins + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.sui.SuiTokenTxData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiTokenTxData> serializer() {
            return SuiTokenTxData$$serializer.INSTANCE;
        }
    }

    static {
        SuiObject$$serializer suiObject$$serializer = SuiObject$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new ArrayListSerializer(suiObject$$serializer), new ArrayListSerializer(suiObject$$serializer)};
    }

    public /* synthetic */ SuiTokenTxData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, SuiTokenTxData$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPrice = str;
        this.gasBudget = str2;
        this.expiration = str3;
        this.sender = str4;
        this.transferAmount = str5;
        this.toAddress = str6;
        this.inputCoins = list;
        this.tokenInputCoins = list2;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SuiTokenTxData suiTokenTxData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, suiTokenTxData.gasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, suiTokenTxData.gasBudget);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, suiTokenTxData.expiration);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, suiTokenTxData.sender);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, suiTokenTxData.transferAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, suiTokenTxData.toAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], suiTokenTxData.inputCoins);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], suiTokenTxData.tokenInputCoins);
    }

    public SuiTokenTxData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<SuiObject> list, @NotNull List<SuiObject> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.gasPrice = str;
        this.gasBudget = str2;
        this.expiration = str3;
        this.sender = str4;
        this.transferAmount = str5;
        this.toAddress = str6;
        this.inputCoins = list;
        this.tokenInputCoins = list2;
    }
}
