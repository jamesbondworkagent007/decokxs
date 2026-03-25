package o;

import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.MajorType;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C5199In extends AbstractC5197Il<IE> {
    public C5199In(HS hs, java.io.OutputStream outputStream) {
        super(hs, outputStream);
    }

    public void AEQbTJ(IE ie) throws CborException {
        java.util.Collection<C5211Iz> collectionKWHzl = ie.KWHzl();
        if (ie.OLrzqt()) {
            copydefault(MajorType.MAP);
        } else {
            EZpvd(MajorType.MAP, collectionKWHzl.size());
        }
        if (collectionKWHzl.isEmpty()) {
            return;
        }
        if (ie.OLrzqt()) {
            KWHzl(ie);
            this.AEQbTJ.EZpvd(II.AYXKKw);
        } else if (this.AEQbTJ.AEQbTJ()) {
            EZpvd(ie);
        } else {
            KWHzl(ie);
        }
    }

    public final void KWHzl(IE ie) throws CborException {
        for (C5211Iz c5211Iz : ie.KWHzl()) {
            this.AEQbTJ.EZpvd(c5211Iz);
            this.AEQbTJ.EZpvd(ie.copydefault(c5211Iz));
        }
    }

    public final void EZpvd(IE ie) throws CborException {
        TreeMap treeMap = new TreeMap(new java.util.Comparator<byte[]>() { // from class: o.In.2
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public int compare(byte[] bArr, byte[] bArr2) {
                if (bArr.length < bArr2.length) {
                    return -1;
                }
                if (bArr.length > bArr2.length) {
                    return 1;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b < b2) {
                        return -1;
                    }
                    if (b > b2) {
                        return 1;
                    }
                }
                return 0;
            }
        });
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        HS hs = new HS(byteArrayOutputStream);
        for (C5211Iz c5211Iz : ie.KWHzl()) {
            hs.EZpvd(c5211Iz);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            hs.EZpvd(ie.copydefault(c5211Iz));
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.reset();
            treeMap.put(byteArray, byteArray2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            AEQbTJ((byte[]) entry.getKey());
            AEQbTJ((byte[]) entry.getValue());
        }
    }
}
