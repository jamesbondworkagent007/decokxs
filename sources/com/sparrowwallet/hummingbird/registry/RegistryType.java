package com.sparrowwallet.hummingbird.registry;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;

/* JADX INFO: loaded from: classes17.dex */
public enum RegistryType {
    BYTES("bytes", null, byte[].class),
    CBOR_PNG("cbor-png", null, null),
    CBOR_SVG("cbor-svg", null, null),
    COSE_SIGN("cose-sign", 98, null),
    COSE_SIGN1("cose-sign1", 18, null),
    COSE_ENCRYPT("cose-encrypt", 96, null),
    COSE_ENCRYPT0("cose-encrypt0", 16, null),
    COSE_MAC("cose-mac", 97, null),
    COSE_MAC0("cose-mac0", 17, null),
    COSE_KEY("cose-key", null, null),
    COSE_KEYSET("cose-keyset", null, null),
    CRYPTO_SEED("crypto-seed", 300, CryptoSeed.class),
    CRYPTO_BIP39("crypto-bip39", 301, CryptoBip39.class),
    CRYPTO_HDKEY("crypto-hdkey", 303, CryptoHDKey.class),
    CRYPTO_KEYPATH("crypto-keypath", 304, CryptoKeypath.class),
    CRYPTO_COIN_INFO("crypto-coininfo", 305, CryptoCoinInfo.class),
    CRYPTO_ECKEY("crypto-eckey", 306, CryptoECKey.class),
    CRYPTO_ADDRESS("crypto-address", 307, CryptoAddress.class),
    CRYPTO_OUTPUT("crypto-output", 308, CryptoOutput.class),
    CRYPTO_SSKR("crypto-sskr", 309, CryptoSskr.class),
    CRYPTO_PSBT("crypto-psbt", 310, CryptoPSBT.class),
    CRYPTO_ACCOUNT("crypto-account", 311, CryptoAccount.class),
    SEED("seed", 40300, URSeed.class),
    HDKEY("hdkey", 40303, URHDKey.class),
    KEYPATH("keypath", 40304, URKeypath.class),
    COIN_INFO("coininfo", 40305, URCoinInfo.class),
    ECKEY("eckey", 40306, URECKey.class),
    ADDRESS(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, 40307, URAddress.class),
    OUTPUT_DESCRIPTOR("output-descriptor", 40308, UROutputDescriptor.class),
    SSKR("sskr", 40309, URSSKR.class),
    PSBT("psbt", 40310, URPSBT.class),
    ACCOUNT_DESCRIPTOR("account-descriptor", 40311, URAccountDescriptor.class);

    private final Class registryClass;
    private final Integer tag;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Class getRegistryClass() {
        return this.registryClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    RegistryType(String str, Integer num, Class cls) {
        this.type = str;
        this.tag = num;
        this.registryClass = cls;
    }

    public static RegistryType fromString(String str) {
        for (RegistryType registryType : values()) {
            if (registryType.toString().equals(str.toLowerCase())) {
                return registryType;
            }
        }
        throw new IllegalArgumentException("Unknown UR registry type: " + str);
    }
}
