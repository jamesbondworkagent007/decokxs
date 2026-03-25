package com.okinc.business.defi.biz.walletconnect;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletWatchAsset {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final WalletWatchAssetOption options;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletWatchAsset() {
        this((String) null, (WalletWatchAssetOption) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletWatchAsset copy$default(WalletWatchAsset walletWatchAsset, String str, WalletWatchAssetOption walletWatchAssetOption, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletWatchAsset.type;
        }
        if ((i & 2) != 0) {
            walletWatchAssetOption = walletWatchAsset.options;
        }
        return walletWatchAsset.copy(str, walletWatchAssetOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletWatchAssetOption component2() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletWatchAsset copy(String str, WalletWatchAssetOption walletWatchAssetOption) {
        return new WalletWatchAsset(str, walletWatchAssetOption);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletWatchAsset)) {
            return false;
        }
        WalletWatchAsset walletWatchAsset = (WalletWatchAsset) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) walletWatchAsset.type) && Intrinsics.EZpvd(this.options, walletWatchAsset.options);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletWatchAssetOption getOptions() {
        return this.options;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        WalletWatchAssetOption walletWatchAssetOption = this.options;
        return (iHashCode * 31) + (walletWatchAssetOption != null ? walletWatchAssetOption.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletWatchAsset(type=" + this.type + ", options=" + this.options + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.walletconnect.WalletWatchAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletWatchAsset> serializer() {
            return WalletWatchAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletWatchAsset(int i, String str, WalletWatchAssetOption walletWatchAssetOption, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.options = null;
        } else {
            this.options = walletWatchAssetOption;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletWatchAsset walletWatchAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || walletWatchAsset.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletWatchAsset.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && walletWatchAsset.options == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, WalletWatchAssetOption$$serializer.INSTANCE, walletWatchAsset.options);
    }

    public WalletWatchAsset(String str, WalletWatchAssetOption walletWatchAssetOption) {
        this.type = str;
        this.options = walletWatchAssetOption;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption) : (r3v0 com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption))
 A[MD:(java.lang.String, com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption):void (m)] (LINE:133) call: com.okinc.business.defi.biz.walletconnect.WalletWatchAsset.<init>(java.lang.String, com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption):void type: THIS */
    public /* synthetic */ WalletWatchAsset(String str, WalletWatchAssetOption walletWatchAssetOption, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : walletWatchAssetOption);
    }
}
