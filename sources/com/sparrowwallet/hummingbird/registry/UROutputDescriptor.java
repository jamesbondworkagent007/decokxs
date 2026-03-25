package com.sparrowwallet.hummingbird.registry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import o.C5205It;
import o.C5211Iz;
import o.IE;
import o.IJ;
import o.IL;

/* JADX INFO: loaded from: classes17.dex */
public class UROutputDescriptor extends RegistryItem {
    public static final long KEYS = 2;
    public static final long NAME = 3;
    public static final long NOTE = 4;
    public static final long SOURCE = 1;
    private final List<RegistryItem> keys;
    private final String name;
    private final String note;
    private final String source;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<RegistryItem> getKeys() {
        return this.keys;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNote() {
        return this.note;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSource() {
        return this.source;
    }

    public UROutputDescriptor(String str) {
        this(str, null);
    }

    public UROutputDescriptor(String str, List<RegistryItem> list) {
        this(str, list, null, null);
    }

    public UROutputDescriptor(String str, List<RegistryItem> list, String str2, String str3) {
        this.source = str;
        this.keys = list;
        this.name = str2;
        this.note = str3;
        if (list != null && !list.stream().allMatch(new Predicate() { // from class: com.sparrowwallet.hummingbird.registry.UROutputDescriptor$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return UROutputDescriptor.lambda$new$0((RegistryItem) obj);
            }
        })) {
            throw new IllegalArgumentException("All keys must be one of HDKey, ECKey or Address");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(RegistryItem registryItem) {
        return (registryItem instanceof URHDKey) || (registryItem instanceof URECKey) || (registryItem instanceof URAddress);
    }

    @Override // com.sparrowwallet.hummingbird.registry.CborSerializable
    public C5211Iz toCbor() {
        IE ie = new IE();
        ie.EZpvd(new IL(1L), new IJ(this.source));
        List<RegistryItem> list = this.keys;
        if (list != null && !list.isEmpty()) {
            C5205It c5205It = new C5205It();
            for (RegistryItem registryItem : this.keys) {
                C5211Iz cbor = registryItem.toCbor();
                if (registryItem instanceof URHDKey) {
                    cbor.EZpvd(RegistryType.HDKEY.getTag().intValue());
                } else if (registryItem instanceof URECKey) {
                    cbor.EZpvd(RegistryType.ECKEY.getTag().intValue());
                } else if (registryItem instanceof URAddress) {
                    cbor.EZpvd(RegistryType.ADDRESS.getTag().intValue());
                }
                c5205It.EZpvd(cbor);
            }
            ie.EZpvd(new IL(2L), c5205It);
        }
        if (this.name != null) {
            ie.EZpvd(new IL(3L), new IJ(this.name));
        }
        if (this.note != null) {
            ie.EZpvd(new IL(4L), new IJ(this.note));
        }
        return ie;
    }

    @Override // com.sparrowwallet.hummingbird.registry.RegistryItem
    public RegistryType getRegistryType() {
        return RegistryType.OUTPUT_DESCRIPTOR;
    }

    public static UROutputDescriptor fromCbor(C5211Iz c5211Iz) {
        IE ie = (IE) c5211Iz;
        String strAEQbTJ = null;
        ArrayList arrayList = null;
        String strAEQbTJ2 = null;
        String strAEQbTJ3 = null;
        for (C5211Iz c5211Iz2 : ie.KWHzl()) {
            long jIntValue = ((IL) c5211Iz2).KWHzl().intValue();
            if (jIntValue == 1) {
                strAEQbTJ = ((IJ) ie.copydefault(c5211Iz2)).AEQbTJ();
            } else if (jIntValue == 2) {
                C5205It c5205It = (C5205It) ie.copydefault(c5211Iz2);
                ArrayList arrayList2 = new ArrayList(c5205It.AEQbTJ().size());
                for (C5211Iz c5211Iz3 : c5205It.AEQbTJ()) {
                    if (c5211Iz3.djBIcL().KWHzl() == RegistryType.HDKEY.getTag().intValue()) {
                        arrayList2.add(URHDKey.fromCbor(c5211Iz3));
                    } else if (c5211Iz3.djBIcL().KWHzl() == RegistryType.ECKEY.getTag().intValue()) {
                        arrayList2.add(URECKey.fromCbor(c5211Iz3));
                    } else if (c5211Iz3.djBIcL().KWHzl() == RegistryType.ADDRESS.getTag().intValue()) {
                        arrayList2.add(URAddress.fromCbor(c5211Iz3));
                    } else {
                        throw new IllegalArgumentException("All keys must be one of HDKey, ECKey or Address");
                    }
                }
                arrayList = arrayList2;
            } else if (jIntValue == 3) {
                strAEQbTJ2 = ((IJ) ie.copydefault(c5211Iz2)).AEQbTJ();
            } else if (jIntValue == 4) {
                strAEQbTJ3 = ((IJ) ie.copydefault(c5211Iz2)).AEQbTJ();
            }
        }
        if (strAEQbTJ == null) {
            throw new IllegalStateException("Source is null");
        }
        return new UROutputDescriptor(strAEQbTJ, arrayList, strAEQbTJ2, strAEQbTJ3);
    }
}
