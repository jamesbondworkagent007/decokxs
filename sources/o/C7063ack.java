package o;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: o.ack, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7063ack {
    public boolean AEQbTJ;
    public java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public java.lang.StringBuilder EZpvd;
    public char[] KWHzl;
    public boolean OLrzqt;
    public java.lang.String copydefault;
    public int djBIcL;

    public static boolean EZpvd(char c) {
        return c == 65535 || c == ';';
    }

    public static boolean KWHzl(char c) {
        return c == 65535 || c == '=';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(java.lang.String str) {
        this.copydefault = str;
    }

    public final boolean OLrzqt(char c) {
        return c == '@' || c == 65535 || c == '.';
    }

    public C7063ack(java.lang.String str) {
        this(str, false);
    }

    public C7063ack(java.lang.String str, boolean z) {
        char[] charArray = str.toCharArray();
        this.KWHzl = charArray;
        this.djBIcL = 0;
        this.EZpvd = new java.lang.StringBuilder(charArray.length + 5);
        this.AEQbTJ = z;
    }

    public final void iwGUEr() {
        this.djBIcL = 0;
        this.EZpvd = new java.lang.StringBuilder(this.KWHzl.length + 5);
    }

    public final void AEQbTJ(char c) {
        this.EZpvd.append(c);
    }

    public final void EZpvd() {
        AEQbTJ('_');
    }

    public final java.lang.String copydefault(int i) {
        return this.EZpvd.substring(i);
    }

    public final void EZpvd(int i, java.lang.String str) {
        java.lang.StringBuilder sb = this.EZpvd;
        sb.delete(i, sb.length());
        this.EZpvd.insert(i, str);
    }

    public final void copydefault(java.lang.String str) {
        this.EZpvd.append(str);
    }

    public final char fIwbmz() {
        int i = this.djBIcL;
        char[] cArr = this.KWHzl;
        if (i == cArr.length) {
            this.djBIcL = i + 1;
            return (char) 65535;
        }
        this.djBIcL = i + 1;
        return cArr[i];
    }

    public final void zLjUOn() {
        while (!copydefault(fIwbmz())) {
        }
        this.djBIcL--;
    }

    public final boolean AEQbTJ() {
        int i = this.djBIcL;
        char[] cArr = this.KWHzl;
        return i >= cArr.length || OLrzqt(cArr[i]);
    }

    public final boolean copydefault(char c) {
        return c == '_' || c == '-' || OLrzqt(c);
    }

    public final boolean fetchVPNInfo() {
        char[] cArr = this.KWHzl;
        if (cArr.length <= 2) {
            return false;
        }
        char c = cArr[1];
        if (c != '-' && c != '_') {
            return false;
        }
        char c2 = cArr[0];
        return c2 == 'x' || c2 == 'X' || c2 == 'i' || c2 == 'I';
    }

    public final boolean DbNXlk() {
        int i = this.djBIcL;
        while (true) {
            char[] cArr = this.KWHzl;
            if (i >= cArr.length) {
                return false;
            }
            if (cArr[i] == '=') {
                return true;
            }
            i++;
        }
    }

    public final int AuCTel() {
        java.lang.String strKWHzl;
        int length = this.EZpvd.length();
        if (fetchVPNInfo()) {
            AEQbTJ(C7090adK.AEQbTJ(this.KWHzl[0]));
            AEQbTJ('-');
            this.djBIcL = 2;
        }
        while (true) {
            char cFIwbmz = fIwbmz();
            if (copydefault(cFIwbmz)) {
                break;
            }
            AEQbTJ(C7090adK.AEQbTJ(cFIwbmz));
        }
        this.djBIcL--;
        if (this.EZpvd.length() - length == 3 && (strKWHzl = C7064acl.KWHzl(copydefault(0))) != null) {
            EZpvd(0, strKWHzl);
        }
        return 0;
    }

    public final void AuCTelauCTel() {
        if (fetchVPNInfo()) {
            this.djBIcL = 2;
        }
        zLjUOn();
    }

    public final int getFieldNames() {
        if (!AEQbTJ()) {
            int i = this.djBIcL;
            this.djBIcL = i + 1;
            int length = this.EZpvd.length();
            boolean z = true;
            while (true) {
                char cFIwbmz = fIwbmz();
                if (copydefault(cFIwbmz) || !C7090adK.EZpvd(cFIwbmz)) {
                    break;
                }
                if (z) {
                    EZpvd();
                    AEQbTJ(C7090adK.OLrzqt(cFIwbmz));
                    z = false;
                } else {
                    AEQbTJ(C7090adK.AEQbTJ(cFIwbmz));
                }
            }
            int i2 = this.djBIcL - 1;
            this.djBIcL = i2;
            if (i2 - i == 5) {
                return length + 1;
            }
            this.djBIcL = i;
            java.lang.StringBuilder sb = this.EZpvd;
            sb.delete(length, sb.length());
            return length;
        }
        return this.EZpvd.length();
    }

    public final void AubY() {
        char cFIwbmz;
        if (AEQbTJ()) {
            return;
        }
        int i = this.djBIcL;
        this.djBIcL = i + 1;
        do {
            cFIwbmz = fIwbmz();
            if (copydefault(cFIwbmz)) {
                break;
            }
        } while (C7090adK.EZpvd(cFIwbmz));
        int i2 = this.djBIcL - 1;
        this.djBIcL = i2;
        if (i2 - i != 5) {
            this.djBIcL = i;
        }
    }

    public final int fJNWhG() {
        java.lang.String strGEmmrt;
        if (!AEQbTJ()) {
            int i = this.djBIcL;
            this.djBIcL = i + 1;
            int length = this.EZpvd.length();
            boolean z = true;
            while (true) {
                char cFIwbmz = fIwbmz();
                if (copydefault(cFIwbmz)) {
                    break;
                }
                if (z) {
                    this.OLrzqt = true;
                    EZpvd();
                    length++;
                    z = false;
                }
                AEQbTJ(C7090adK.OLrzqt(cFIwbmz));
            }
            this.djBIcL--;
            int length2 = this.EZpvd.length() - length;
            if (length2 == 0) {
                return length;
            }
            if (length2 >= 2 && length2 <= 3) {
                if (length2 != 3 || (strGEmmrt = C7064acl.gEmmrt(copydefault(length))) == null) {
                    return length;
                }
                EZpvd(length, strGEmmrt);
                return length;
            }
            this.djBIcL = i;
            int i2 = length - 1;
            java.lang.StringBuilder sb = this.EZpvd;
            sb.delete(i2, sb.length());
            this.OLrzqt = false;
            return i2;
        }
        return this.EZpvd.length();
    }

    public final void hDKMBd() {
        if (AEQbTJ()) {
            return;
        }
        char[] cArr = this.KWHzl;
        int i = this.djBIcL;
        char c = cArr[i];
        if (c == '_' || c == '-') {
            this.djBIcL = i + 1;
        }
        int i2 = this.djBIcL;
        zLjUOn();
        int i3 = this.djBIcL - i2;
        if (i3 < 2 || i3 > 3) {
            this.djBIcL = i2;
        }
    }

    public final int getNewProxyInstance() {
        int length = this.EZpvd.length();
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = false;
        while (true) {
            char cFIwbmz = fIwbmz();
            if (cFIwbmz == 65535) {
                break;
            }
            if (cFIwbmz == '.') {
                z4 = true;
            } else if (cFIwbmz != '@') {
                char c = '_';
                if (z) {
                    if (cFIwbmz != '_' && cFIwbmz != '-') {
                        this.djBIcL--;
                    }
                } else if (!z4) {
                    if (z2) {
                        if (z3 && !this.OLrzqt) {
                            EZpvd();
                            length++;
                        }
                        EZpvd();
                        if (z3) {
                            length++;
                            z2 = false;
                            z3 = false;
                        } else {
                            z2 = false;
                        }
                    }
                    char cOLrzqt = C7090adK.OLrzqt(cFIwbmz);
                    if (cOLrzqt != '-' && cOLrzqt != ',') {
                        c = cOLrzqt;
                    }
                    AEQbTJ(c);
                }
            } else {
                if (DbNXlk()) {
                    break;
                }
                z2 = true;
                z = false;
                z4 = false;
            }
            z = false;
        }
        this.djBIcL--;
        return length;
    }

    public java.lang.String djBIcL() {
        iwGUEr();
        return copydefault(AuCTel());
    }

    public java.lang.String isConnected() {
        iwGUEr();
        AuCTelauCTel();
        return copydefault(getFieldNames());
    }

    public java.lang.String OLrzqt() {
        iwGUEr();
        AuCTelauCTel();
        AubY();
        return copydefault(fJNWhG());
    }

    public java.lang.String AkhnZx() {
        iwGUEr();
        AuCTelauCTel();
        AubY();
        hDKMBd();
        return copydefault(getNewProxyInstance());
    }

    public void fARcdN() {
        java.lang.String str = this.copydefault;
        if (str != null) {
            EZpvd(0, str);
            return;
        }
        iwGUEr();
        AuCTel();
        getFieldNames();
        fJNWhG();
        getNewProxyInstance();
        int length = this.EZpvd.length();
        if (length > 0) {
            int i = length - 1;
            if (this.EZpvd.charAt(i) == '_') {
                this.EZpvd.deleteCharAt(i);
            }
        }
    }

    public java.lang.String KWHzl() {
        java.lang.String str = this.copydefault;
        if (str != null) {
            return str;
        }
        fARcdN();
        return copydefault(0);
    }

    public java.lang.String valueOf() {
        fARcdN();
        ejfBZ();
        return copydefault(0);
    }

    public final boolean uzCIH() {
        int i = this.djBIcL;
        while (true) {
            char[] cArr = this.KWHzl;
            if (i >= cArr.length) {
                return false;
            }
            if (cArr[i] != '@') {
                i++;
            } else {
                if (!this.AEQbTJ) {
                    int i2 = i + 1;
                    if (i2 >= cArr.length) {
                        return false;
                    }
                    this.djBIcL = i2;
                    return true;
                }
                int i3 = i + 1;
                int i4 = i3;
                while (true) {
                    char[] cArr2 = this.KWHzl;
                    if (i4 >= cArr2.length) {
                        return false;
                    }
                    if (cArr2[i4] == '=') {
                        this.djBIcL = i3;
                        return true;
                    }
                    i4++;
                }
            }
        }
    }

    public final java.lang.String AhwBna() {
        int i = this.djBIcL;
        while (!KWHzl(fIwbmz())) {
        }
        int i2 = this.djBIcL - 1;
        this.djBIcL = i2;
        return C7090adK.AEQbTJ(new java.lang.String(this.KWHzl, i, i2 - i).trim());
    }

    public final java.lang.String values() {
        int i = this.djBIcL;
        while (!EZpvd(fIwbmz())) {
        }
        int i2 = this.djBIcL - 1;
        this.djBIcL = i2;
        return new java.lang.String(this.KWHzl, i, i2 - i).trim();
    }

    public final java.util.Comparator<java.lang.String> copydefault() {
        return new java.util.Comparator<java.lang.String>() { // from class: o.ack.5
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public int compare(java.lang.String str, java.lang.String str2) {
                return str.compareTo(str2);
            }
        };
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x004d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x004d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
        ?? treeMap;
        if (this.AYXKKw == null) {
            ?? EmptyMap = 0;
            EmptyMap = 0;
            if (uzCIH()) {
                do {
                    java.lang.String strAhwBna = AhwBna();
                    if (strAhwBna.length() == 0) {
                        break;
                    }
                    char cFIwbmz = fIwbmz();
                    if (cFIwbmz != '=') {
                        EmptyMap = EmptyMap;
                        if (cFIwbmz != 65535) {
                            break;
                            break;
                        }
                        break;
                    }
                    java.lang.String strValues = values();
                    EmptyMap = EmptyMap;
                    if (strValues.length() != 0) {
                        if (EmptyMap == 0) {
                            treeMap = new TreeMap(copydefault());
                        } else {
                            boolean zContainsKey = EmptyMap.containsKey(strAhwBna);
                            EmptyMap = EmptyMap;
                            treeMap = EmptyMap;
                            if (!zContainsKey) {
                            }
                        }
                        treeMap.put(strAhwBna, strValues);
                        EmptyMap = treeMap;
                    }
                } while (fIwbmz() == ';');
            }
            if (EmptyMap == 0) {
                EmptyMap = Collections.emptyMap();
            }
            this.AYXKKw = EmptyMap;
        }
        return this.AYXKKw;
    }

    public final int ejfBZ() {
        int length = this.EZpvd.length();
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = gEmmrt();
        if (mapGEmmrt.isEmpty()) {
            return length;
        }
        boolean z = true;
        for (Map.Entry<java.lang.String, java.lang.String> entry : mapGEmmrt.entrySet()) {
            AEQbTJ(z ? '@' : ';');
            copydefault(entry.getKey());
            AEQbTJ('=');
            copydefault(entry.getValue());
            z = false;
        }
        return !z ? length + 1 : length;
    }

    public java.util.Iterator<java.lang.String> AYXKKw() {
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = gEmmrt();
        if (mapGEmmrt.isEmpty()) {
            return null;
        }
        return mapGEmmrt.keySet().iterator();
    }

    public java.lang.String EZpvd(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = gEmmrt();
        if (mapGEmmrt.isEmpty()) {
            return null;
        }
        return mapGEmmrt.get(C7090adK.AEQbTJ(str.trim()));
    }

    public void EZpvd(java.lang.String str, java.lang.String str2) {
        KWHzl(str, str2, true);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            if (z) {
                this.AYXKKw = Collections.emptyMap();
                return;
            }
            return;
        }
        java.lang.String strAEQbTJ = C7090adK.AEQbTJ(str.trim());
        if (strAEQbTJ.length() == 0) {
            throw new java.lang.IllegalArgumentException("keyword must not be empty");
        }
        if (str2 != null) {
            str2 = str2.trim();
            if (str2.length() == 0) {
                throw new java.lang.IllegalArgumentException("value must not be empty");
            }
        }
        java.util.Map<java.lang.String, java.lang.String> mapGEmmrt = gEmmrt();
        if (mapGEmmrt.isEmpty()) {
            if (str2 != null) {
                TreeMap treeMap = new TreeMap(copydefault());
                this.AYXKKw = treeMap;
                treeMap.put(strAEQbTJ, str2.trim());
                return;
            }
            return;
        }
        if (z || !mapGEmmrt.containsKey(strAEQbTJ)) {
            if (str2 != null) {
                mapGEmmrt.put(strAEQbTJ, str2);
                return;
            }
            mapGEmmrt.remove(strAEQbTJ);
            if (mapGEmmrt.isEmpty()) {
                this.AYXKKw = Collections.emptyMap();
            }
        }
    }
}
