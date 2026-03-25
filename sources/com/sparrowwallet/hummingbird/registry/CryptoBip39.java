package com.sparrowwallet.hummingbird.registry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C5205It;
import o.C5211Iz;
import o.IE;
import o.IJ;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class CryptoBip39 extends RegistryItem {
    public static final long LANG = 2;
    public static final long WORDS = 1;
    private final String language;
    private final List<String> words;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<String> getWords() {
        return this.words;
    }

    public CryptoBip39(List<String> list, String str) {
        this.words = list;
        this.language = str;
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        C5205It c5205It = new C5205It();
        Iterator<String> it = this.words.iterator();
        while (it.hasNext()) {
            c5205It.EZpvd(new IJ(it.next()));
        }
        ie.EZpvd(new IL(1L), c5205It);
        if (this.language != null) {
            ie.EZpvd(new IL(2L), new IJ(this.language));
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.CRYPTO_BIP39;
    }

    public static CryptoBip39 fromCbor(C5211Iz c5211Iz) {
        ArrayList arrayList = new ArrayList();
        IE ie = (IE) c5211Iz;
        String strAEQbTJ = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            long jIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (jIntValue == 1) {
                Iterator<C5211Iz> it = ((C5205It) ie.copydefault(c5211Iz2)).AEQbTJ().iterator();
                while (it.hasNext()) {
                    arrayList.add(((IJ) it.next()).AEQbTJ());
                }
            } else if (jIntValue == 2) {
                strAEQbTJ = ((IJ) ie.copydefault(c5211Iz2)).AEQbTJ();
            }
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No BIP39 words");
        }
        return new CryptoBip39(arrayList, strAEQbTJ);
    }
}
