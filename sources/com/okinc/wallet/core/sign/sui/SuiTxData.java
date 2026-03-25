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
public final class SuiTxData {
    private final String expiration;
    private final String gasBudget;
    private final String gasPrice;
    private final List<SuiObject> inputCoins;
    private final String sender;
    private final String toAddress;
    private final String transferAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(SuiObject$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.wallet.core.sign.sui.SuiTxData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuiTxData copy$default(SuiTxData suiTxData, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiTxData.gasPrice;
        }
        if ((i & 2) != 0) {
            str2 = suiTxData.gasBudget;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = suiTxData.expiration;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = suiTxData.sender;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = suiTxData.transferAmount;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = suiTxData.toAddress;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = suiTxData.inputCoins;
        }
        return suiTxData.copy(str, str7, str8, str9, str10, str11, list);
    }

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
    public final SuiTxData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<SuiObject> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SuiTxData(str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiTxData)) {
            return false;
        }
        SuiTxData suiTxData = (SuiTxData) obj;
        return Intrinsics.EZpvd((Object) this.gasPrice, (Object) suiTxData.gasPrice) && Intrinsics.EZpvd((Object) this.gasBudget, (Object) suiTxData.gasBudget) && Intrinsics.EZpvd((Object) this.expiration, (Object) suiTxData.expiration) && Intrinsics.EZpvd((Object) this.sender, (Object) suiTxData.sender) && Intrinsics.EZpvd((Object) this.transferAmount, (Object) suiTxData.transferAmount) && Intrinsics.EZpvd((Object) this.toAddress, (Object) suiTxData.toAddress) && Intrinsics.EZpvd(this.inputCoins, suiTxData.inputCoins);
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
    public final String getTransferAmount() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.gasPrice.hashCode() * 31) + this.gasBudget.hashCode()) * 31) + this.expiration.hashCode()) * 31) + this.sender.hashCode()) * 31) + this.transferAmount.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.inputCoins.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiTxData(gasPrice=" + this.gasPrice + ", gasBudget=" + this.gasBudget + ", expiration=" + this.expiration + ", sender=" + this.sender + ", transferAmount=" + this.transferAmount + ", toAddress=" + this.toAddress + ", inputCoins=" + this.inputCoins + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.sui.SuiTxData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiTxData> serializer() {
            return SuiTxData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiTxData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, SuiTxData$$serializer.INSTANCE.getDescriptor());
        }
        this.gasPrice = str;
        this.gasBudget = str2;
        this.expiration = str3;
        this.sender = str4;
        this.transferAmount = str5;
        this.toAddress = str6;
        this.inputCoins = list;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SuiTxData suiTxData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, suiTxData.gasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, suiTxData.gasBudget);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, suiTxData.expiration);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, suiTxData.sender);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, suiTxData.transferAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, suiTxData.toAddress);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], suiTxData.inputCoins);
    }

    public SuiTxData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<SuiObject> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gasPrice = str;
        this.gasBudget = str2;
        this.expiration = str3;
        this.sender = str4;
        this.transferAmount = str5;
        this.toAddress = str6;
        this.inputCoins = list;
    }
}
