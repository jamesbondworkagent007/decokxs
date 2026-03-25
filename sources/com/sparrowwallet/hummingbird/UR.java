package com.sparrowwallet.hummingbird;

import co.nstant.in.cbor.CborException;
import com.sparrowwallet.hummingbird.registry.CryptoAccount;
import com.sparrowwallet.hummingbird.registry.CryptoAddress;
import com.sparrowwallet.hummingbird.registry.CryptoBip39;
import com.sparrowwallet.hummingbird.registry.CryptoCoinInfo;
import com.sparrowwallet.hummingbird.registry.CryptoECKey;
import com.sparrowwallet.hummingbird.registry.CryptoHDKey;
import com.sparrowwallet.hummingbird.registry.CryptoKeypath;
import com.sparrowwallet.hummingbird.registry.CryptoOutput;
import com.sparrowwallet.hummingbird.registry.CryptoPSBT;
import com.sparrowwallet.hummingbird.registry.CryptoSeed;
import com.sparrowwallet.hummingbird.registry.CryptoSskr;
import com.sparrowwallet.hummingbird.registry.RegistryType;
import com.sparrowwallet.hummingbird.registry.URAccountDescriptor;
import com.sparrowwallet.hummingbird.registry.URAddress;
import com.sparrowwallet.hummingbird.registry.URCoinInfo;
import com.sparrowwallet.hummingbird.registry.URECKey;
import com.sparrowwallet.hummingbird.registry.URHDKey;
import com.sparrowwallet.hummingbird.registry.URKeypath;
import com.sparrowwallet.hummingbird.registry.UROutputDescriptor;
import com.sparrowwallet.hummingbird.registry.URPSBT;
import com.sparrowwallet.hummingbird.registry.URSSKR;
import com.sparrowwallet.hummingbird.registry.URSeed;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.C5210Iy;
import o.C5211Iz;
import o.HP;
import o.HS;
import o.HU;

/* JADX INFO: loaded from: classes12.dex */
public class UR {
    public static final String UR_PREFIX = "ur";
    private final byte[] data;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getCborBytes() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getType() {
        return this.type;
    }

    public UR(RegistryType registryType, byte[] bArr) throws InvalidTypeException {
        this(registryType.toString(), bArr);
    }

    public UR(String str, byte[] bArr) throws InvalidTypeException {
        if (isURType(str)) {
            this.type = str;
            this.data = bArr;
        } else {
            throw new InvalidTypeException("Invalid UR type: " + str);
        }
    }

    public RegistryType getRegistryType() {
        return RegistryType.fromString(this.type);
    }

    public Object decodeFromRegistry() throws InvalidCBORException {
        RegistryType registryType = getRegistryType();
        try {
            C5211Iz c5211Iz = HU.copydefault(getCborBytes()).get(0);
            if (registryType == RegistryType.BYTES) {
                return ((C5210Iy) c5211Iz).KWHzl();
            }
            if (registryType == RegistryType.CRYPTO_SEED) {
                return CryptoSeed.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_BIP39) {
                return CryptoBip39.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_HDKEY) {
                return CryptoHDKey.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_KEYPATH) {
                return CryptoKeypath.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_COIN_INFO) {
                return CryptoCoinInfo.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_ECKEY) {
                return CryptoECKey.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_ADDRESS) {
                return CryptoAddress.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_OUTPUT) {
                return CryptoOutput.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_PSBT) {
                return CryptoPSBT.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_ACCOUNT) {
                return CryptoAccount.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.CRYPTO_SSKR) {
                return CryptoSskr.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.SEED) {
                return URSeed.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.HDKEY) {
                return URHDKey.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.KEYPATH) {
                return URKeypath.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.COIN_INFO) {
                return URCoinInfo.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.ECKEY) {
                return URECKey.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.ADDRESS) {
                return URAddress.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.OUTPUT_DESCRIPTOR) {
                return UROutputDescriptor.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.PSBT) {
                return URPSBT.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.ACCOUNT_DESCRIPTOR) {
                return URAccountDescriptor.fromCbor(c5211Iz);
            }
            if (registryType == RegistryType.SSKR) {
                return URSSKR.fromCbor(c5211Iz);
            }
            return null;
        } catch (CborException e) {
            throw new InvalidCBORException(e.getMessage());
        }
    }

    public byte[] toBytes() throws InvalidCBORException {
        try {
            List<C5211Iz> listCopydefault = HU.copydefault(getCborBytes());
            if (!(listCopydefault.get(0) instanceof C5210Iy)) {
                throw new IllegalArgumentException("First element of CBOR is not a byte string");
            }
            return ((C5210Iy) listCopydefault.get(0)).KWHzl();
        } catch (CborException e) {
            throw new InvalidCBORException(e.getMessage());
        }
    }

    public static boolean isURType(String str) {
        for (char c : str.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                return true;
            }
            if (('0' <= c && c <= '9') || c == '-') {
                return true;
            }
        }
        return false;
    }

    public static UR fromBytes(byte[] bArr) throws InvalidTypeException, InvalidCBORException {
        return fromBytes(RegistryType.BYTES.toString(), bArr);
    }

    public static UR fromBytes(String str, byte[] bArr) throws InvalidTypeException, InvalidCBORException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new HS(byteArrayOutputStream).OLrzqt(new HP().AEQbTJ(bArr).EZpvd());
            return new UR(str, byteArrayOutputStream.toByteArray());
        } catch (CborException e) {
            throw new InvalidCBORException(e.getMessage());
        }
    }

    public String toString() {
        return UREncoder.encode(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UR ur = (UR) obj;
        return this.type.equals(ur.type) && Arrays.equals(this.data, ur.data);
    }

    public int hashCode() {
        return (Objects.hash(this.type) * 31) + Arrays.hashCode(this.data);
    }

    public static class URException extends Exception {
        public URException(String str) {
            super(str);
        }
    }

    public static class InvalidTypeException extends URException {
        public InvalidTypeException(String str) {
            super(str);
        }
    }

    public static class InvalidSchemeException extends URException {
        public InvalidSchemeException(String str) {
            super(str);
        }
    }

    public static class InvalidPathLengthException extends URException {
        public InvalidPathLengthException(String str) {
            super(str);
        }
    }

    public static class InvalidSequenceComponentException extends URException {
        public InvalidSequenceComponentException(String str) {
            super(str);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class InvalidCBORException extends URException {
        public InvalidCBORException(String str) {
            super(str);
        }
    }
}
