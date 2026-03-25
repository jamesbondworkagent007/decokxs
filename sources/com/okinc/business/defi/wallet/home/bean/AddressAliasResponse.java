package com.okinc.business.defi.wallet.home.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class AddressAliasResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String addressAlias;
    public final int aliasType;
    public final String collectAddress;
    public final int collectType;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressAliasResponse copy$default(AddressAliasResponse addressAliasResponse, String str, String str2, int i, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = addressAliasResponse.walletAddress;
        }
        if ((i3 & 2) != 0) {
            str2 = addressAliasResponse.collectAddress;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = addressAliasResponse.collectType;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            str3 = addressAliasResponse.addressAlias;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = addressAliasResponse.aliasType;
        }
        return addressAliasResponse.EZpvd(str, str4, i4, str5, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAliasResponse EZpvd(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressAliasResponse(str, str2, i, str3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.addressAlias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.collectAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressAliasResponse)) {
            return false;
        }
        AddressAliasResponse addressAliasResponse = (AddressAliasResponse) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) addressAliasResponse.walletAddress) && Intrinsics.EZpvd((Object) this.collectAddress, (Object) addressAliasResponse.collectAddress) && this.collectType == addressAliasResponse.collectType && Intrinsics.EZpvd((Object) this.addressAlias, (Object) addressAliasResponse.addressAlias) && this.aliasType == addressAliasResponse.aliasType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.walletAddress.hashCode() * 31) + this.collectAddress.hashCode()) * 31) + Integer.hashCode(this.collectType)) * 31) + this.addressAlias.hashCode()) * 31) + Integer.hashCode(this.aliasType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAliasResponse(walletAddress=" + this.walletAddress + ", collectAddress=" + this.collectAddress + ", collectType=" + this.collectType + ", addressAlias=" + this.addressAlias + ", aliasType=" + this.aliasType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.AddressAliasResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressAliasResponse> serializer() {
            return AddressAliasResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressAliasResponse(int i, String str, String str2, int i2, String str3, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, AddressAliasResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAddress = str;
        this.collectAddress = str2;
        this.collectType = i2;
        this.addressAlias = str3;
        this.aliasType = i3;
    }

    public static final /* synthetic */ void copydefault(AddressAliasResponse addressAliasResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressAliasResponse.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, addressAliasResponse.collectAddress);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, addressAliasResponse.collectType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, addressAliasResponse.addressAlias);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, addressAliasResponse.aliasType);
    }

    public AddressAliasResponse(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.walletAddress = str;
        this.collectAddress = str2;
        this.collectType = i;
        this.addressAlias = str3;
        this.aliasType = i2;
    }
}
