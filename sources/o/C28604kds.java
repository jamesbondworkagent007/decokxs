package o;

import com.google.common.primitives.UnsignedBytes;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28604kds {
    @yCM
    public C28604kds() {
    }

    public final java.lang.String OLrzqt(byte[] bArr) {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listFetchVPNInfo = yDV.fetchVPNInfo(bArr);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length && bArr[i2] == 0; i2++) {
            i++;
        }
        do {
            arrayList2.clear();
            java.util.Iterator it = listFetchVPNInfo.iterator();
            int i3 = 0;
            z = false;
            while (it.hasNext()) {
                int iByteValue = (((java.lang.Number) it.next()).byteValue() & UnsignedBytes.MAX_VALUE) + (i3 * 256);
                int i4 = iByteValue / 58;
                if (i4 > 0 || z) {
                    arrayList2.add(java.lang.Integer.valueOf(i4));
                    z = true;
                }
                i3 = iByteValue % 58;
            }
            arrayList.add(0, java.lang.Character.valueOf("123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".charAt(i3)));
            listFetchVPNInfo.clear();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(java.lang.Byte.valueOf((byte) ((java.lang.Number) it2.next()).intValue()));
            }
            listFetchVPNInfo.addAll(arrayList3);
        } while (z);
        return C59449zhJ.copydefault("1", i) + CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return OLrzqt(bytes);
    }
}
