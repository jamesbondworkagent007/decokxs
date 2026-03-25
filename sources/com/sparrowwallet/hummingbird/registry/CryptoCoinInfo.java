package com.sparrowwallet.hummingbird.registry;

import java.util.Objects;
import o.C5211Iz;
import o.IE;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoCoinInfo extends RegistryItem {
    public static final int NETWORK_KEY = 2;
    public static final int TYPE_KEY = 1;
    private final Integer network;
    private final Integer type;

    public CryptoCoinInfo(Integer num, Integer num2) {
        if (Objects.equals(num2, Network.GOERLI.networkValue) && !Objects.equals(num, Type.ETHEREUM.typeValue)) {
            throw new IllegalArgumentException("Goerli network can only be selected for Ethereum");
        }
        this.type = num;
        this.network = num2;
    }

    public CryptoCoinInfo(Type type, Network network) {
        if (network == Network.GOERLI && type != Type.ETHEREUM) {
            throw new IllegalArgumentException("Goerli network can only be selected for Ethereum");
        }
        this.type = type != null ? type.typeValue : null;
        this.network = network != null ? network.networkValue : null;
    }

    public Type getType() {
        Integer num = this.type;
        return num == null ? Type.BITCOIN : Type.getTypeFromValue(num.intValue());
    }

    public Network getNetwork() {
        Integer num = this.network;
        return num == null ? Network.MAINNET : Network.getNetworkFromValue(num.intValue());
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        if (this.type != null) {
            ie.EZpvd(new IL(1L), new IL(this.type.intValue()));
        }
        if (this.network != null) {
            ie.EZpvd(new IL(2L), new IL(this.network.intValue()));
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_COIN_INFO;
    }

    public static CryptoCoinInfo fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            int iIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (iIntValue == 1) {
                numValueOf = Integer.valueOf(((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue());
            } else if (iIntValue == 2) {
                numValueOf2 = Integer.valueOf(((IL) ie.copydefault(c5211Iz2)).KWHzl().intValue());
            }
        }
        return new CryptoCoinInfo(numValueOf, numValueOf2);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public enum Type {
        BITCOIN(0),
        ETHEREUM(60);

        Integer typeValue;

        Type(Integer num) {
            this.typeValue = num;
        }

        public static Type getTypeFromValue(int i) {
            for (int i2 = 0; i2 < values().length; i2++) {
                Type type = values()[i2];
                if (i == type.typeValue.intValue()) {
                    return type;
                }
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public enum Network {
        MAINNET(0),
        TESTNET(1),
        GOERLI(4);

        Integer networkValue;

        Network(Integer num) {
            this.networkValue = num;
        }

        public static Network getNetworkFromValue(int i) {
            for (int i2 = 0; i2 < values().length; i2++) {
                Network network = values()[i2];
                if (i == network.networkValue.intValue()) {
                    return network;
                }
            }
            return null;
        }
    }
}
