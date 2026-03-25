package com.sparrowwallet.hummingbird.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C5211Iz;
import o.IE;
import o.IK;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoOutput extends RegistryItem {
    private final CryptoECKey ecKey;
    private final CryptoHDKey hdKey;
    private final MultiKey multiKey;
    private final List<ScriptExpression> scriptExpressions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoECKey getEcKey() {
        return this.ecKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoHDKey getHdKey() {
        return this.hdKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiKey getMultiKey() {
        return this.multiKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<ScriptExpression> getScriptExpressions() {
        return this.scriptExpressions;
    }

    public CryptoOutput(List<ScriptExpression> list, CryptoECKey cryptoECKey) {
        this.scriptExpressions = list;
        this.ecKey = cryptoECKey;
        this.hdKey = null;
        this.multiKey = null;
    }

    public CryptoOutput(List<ScriptExpression> list, CryptoHDKey cryptoHDKey) {
        this.scriptExpressions = list;
        this.ecKey = null;
        this.hdKey = cryptoHDKey;
        this.multiKey = null;
    }

    public CryptoOutput(List<ScriptExpression> list, MultiKey multiKey) {
        this.scriptExpressions = list;
        this.ecKey = null;
        this.hdKey = null;
        this.multiKey = multiKey;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        C5211Iz cbor;
        MultiKey multiKey = this.multiKey;
        if (multiKey != null) {
            cbor = multiKey.toCbor();
        } else {
            CryptoECKey cryptoECKey = this.ecKey;
            if (cryptoECKey != null) {
                cbor = cryptoECKey.toCbor();
                cbor.EZpvd(RegistryType.CRYPTO_ECKEY.getTag().intValue());
            } else {
                CryptoHDKey cryptoHDKey = this.hdKey;
                if (cryptoHDKey != null) {
                    cbor = cryptoHDKey.toCbor();
                    cbor.EZpvd(RegistryType.CRYPTO_HDKEY.getTag().intValue());
                } else {
                    cbor = null;
                }
            }
        }
        IK ikDjBIcL = cbor.djBIcL();
        int size = this.scriptExpressions.size() - 1;
        while (size >= 0) {
            IK ik = new IK(this.scriptExpressions.get(size).getTagValue());
            if (ikDjBIcL == null) {
                cbor.EZpvd(ik);
            } else {
                ikDjBIcL.EZpvd(ik);
            }
            size--;
            ikDjBIcL = ik;
        }
        return cbor;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_OUTPUT;
    }

    public static CryptoOutput fromCbor(C5211Iz c5211Iz) {
        RegistryType registryType;
        ArrayList arrayList = new ArrayList();
        IK ikDjBIcL = c5211Iz.djBIcL();
        do {
            long jKWHzl = ikDjBIcL.KWHzl();
            registryType = RegistryType.CRYPTO_HDKEY;
            if (jKWHzl != registryType.getTag().intValue() && ikDjBIcL.KWHzl() != RegistryType.CRYPTO_ECKEY.getTag().intValue() && ikDjBIcL.KWHzl() != RegistryType.CRYPTO_OUTPUT.getTag().intValue()) {
                arrayList.add(ScriptExpression.fromTagValue(ikDjBIcL.KWHzl()));
            }
            ikDjBIcL = ikDjBIcL.djBIcL();
        } while (ikDjBIcL != null);
        boolean z = arrayList.get(0) == ScriptExpression.MULTISIG || arrayList.get(0) == ScriptExpression.SORTED_MULTISIG;
        Collections.reverse(arrayList);
        IE ie = (IE) c5211Iz;
        if (z) {
            return new CryptoOutput(arrayList, MultiKey.fromCbor(ie));
        }
        if (c5211Iz.djBIcL().KWHzl() == RegistryType.CRYPTO_ECKEY.getTag().intValue()) {
            return new CryptoOutput(arrayList, CryptoECKey.fromCbor(ie));
        }
        if (c5211Iz.djBIcL().KWHzl() == registryType.getTag().intValue()) {
            return new CryptoOutput(arrayList, CryptoHDKey.fromCbor(ie));
        }
        throw new IllegalStateException("Unknown tag for data item: " + c5211Iz.djBIcL().KWHzl());
    }
}
