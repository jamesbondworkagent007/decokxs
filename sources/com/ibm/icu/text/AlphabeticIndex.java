package com.ibm.icu.text;

import androidx.work.Data;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.C7223afl;
import o.C7242agD;
import o.C7286agv;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes22.dex */
public final class AlphabeticIndex<V> implements Iterable<Bucket<V>> {
    public static final Comparator<String> EZpvd = new C7242agD.ActionBar(true, false, 0);
    public final List<String> AEQbTJ;
    public List<Activity<V>> AYXKKw;
    public String AhwBna;
    public String AkhnZx;
    public final C7286agv KWHzl;
    public final C7286agv OLrzqt;
    public ActionBar<V> copydefault;
    public int djBIcL;
    public final UnicodeSet gEmmrt;
    public String valueOf;
    public final Comparator<Activity<V>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.AlphabeticIndex$3, reason: invalid class name */
    public class AnonymousClass3 implements Comparator<Activity<V>> {
        public final /* synthetic */ AlphabeticIndex KWHzl;

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public int compare(Activity<V> activity, Activity<V> activity2) {
            return this.KWHzl.OLrzqt.compare(activity.OLrzqt, activity2.OLrzqt);
        }
    }

    public final List<String> valueOf() {
        boolean z;
        Normalizer2 normalizer2AEQbTJ = Normalizer2.AEQbTJ();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        String str = this.AEQbTJ.get(0);
        List<String> list = this.AEQbTJ;
        String str2 = list.get(list.size() - 1);
        Iterator<String> it = this.gEmmrt.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!C7242agD.EZpvd(next, 1)) {
                z = false;
            } else if (next.charAt(next.length() - 1) != '*' || next.charAt(next.length() - 2) == '*') {
                z = true;
            } else {
                next = next.substring(0, next.length() - 1);
                z = false;
            }
            if (this.KWHzl.copydefault(next, str) >= 0 && this.KWHzl.copydefault(next, str2) < 0 && (!z || this.KWHzl.copydefault(next, copydefault(next)) != 0)) {
                int iBinarySearch = Collections.binarySearch(arrayList, next, this.KWHzl);
                if (iBinarySearch < 0) {
                    arrayList.add(~iBinarySearch, next);
                } else if (copydefault(normalizer2AEQbTJ, next, (String) arrayList.get(iBinarySearch))) {
                    arrayList.set(iBinarySearch, next);
                }
            }
        }
        int size = arrayList.size() - 1;
        if (size > this.djBIcL) {
            Iterator it2 = arrayList.iterator();
            int i2 = -1;
            while (it2.hasNext()) {
                i++;
                it2.next();
                int i3 = (this.djBIcL * i) / size;
                if (i3 == i2) {
                    it2.remove();
                } else {
                    i2 = i3;
                }
            }
        }
        return arrayList;
    }

    public static String KWHzl(String str) {
        if (!str.startsWith("\ufdd0")) {
            return str;
        }
        char cCharAt = str.charAt(1);
        if (10240 < cCharAt && cCharAt <= 10495) {
            return (cCharAt - Data.MAX_DATA_BYTES) + "劃";
        }
        return str.substring(1);
    }

    public final String copydefault(String str) {
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append(cCharAt);
        int i = 1;
        while (i < str.length()) {
            char cCharAt2 = str.charAt(i);
            if (!C7223afl.EZpvd(cCharAt) || !C7223afl.copydefault(cCharAt2)) {
                sb.append((char) 847);
            }
            sb.append(cCharAt2);
            i++;
            cCharAt = cCharAt2;
        }
        return sb.toString();
    }

    @Override // java.lang.Iterable
    public Iterator<Bucket<V>> iterator() {
        EZpvd();
        return this.copydefault.iterator();
    }

    public final void EZpvd() {
        Bucket bucket;
        String str;
        if (this.copydefault != null) {
            return;
        }
        this.copydefault = copydefault();
        List<Activity<V>> list = this.AYXKKw;
        if (list == null || list.isEmpty()) {
            return;
        }
        Collections.sort(this.AYXKKw, this.values);
        Iterator itCopydefault = this.copydefault.copydefault();
        Bucket bucket2 = (Bucket) itCopydefault.next();
        if (itCopydefault.hasNext()) {
            bucket = (Bucket) itCopydefault.next();
            str = bucket.EZpvd;
        } else {
            bucket = null;
            str = null;
        }
        for (Activity<V> activity : this.AYXKKw) {
            while (str != null && this.KWHzl.compare(activity.OLrzqt, str) >= 0) {
                if (itCopydefault.hasNext()) {
                    Bucket bucket3 = (Bucket) itCopydefault.next();
                    str = bucket3.EZpvd;
                    Bucket bucket4 = bucket;
                    bucket = bucket3;
                    bucket2 = bucket4;
                } else {
                    bucket2 = bucket;
                    str = null;
                }
            }
            Bucket bucket5 = bucket2.AEQbTJ != null ? bucket2.AEQbTJ : bucket2;
            if (bucket5.gEmmrt == null) {
                bucket5.gEmmrt = new ArrayList();
            }
            bucket5.gEmmrt.add(activity);
        }
    }

    public static boolean copydefault(Normalizer2 normalizer2, String str, String str2) {
        String strEZpvd = normalizer2.EZpvd(str);
        String strEZpvd2 = normalizer2.EZpvd(str2);
        int iCodePointCount = strEZpvd.codePointCount(0, strEZpvd.length()) - strEZpvd2.codePointCount(0, strEZpvd2.length());
        if (iCodePointCount != 0) {
            return iCodePointCount < 0;
        }
        Comparator<String> comparator = EZpvd;
        int iCompare = comparator.compare(strEZpvd, strEZpvd2);
        return iCompare != 0 ? iCompare < 0 : comparator.compare(str, str2) < 0;
    }

    public static class Activity<V> {
        public final V AEQbTJ;
        public final CharSequence OLrzqt;

        public String toString() {
            return ((Object) this.OLrzqt) + ContainerUtils.KEY_VALUE_DELIMITER + this.AEQbTJ;
        }
    }

    public static class Bucket<V> implements Iterable<Activity<V>> {
        public Bucket<V> AEQbTJ;
        public final String EZpvd;
        public int KWHzl;
        public final LabelType OLrzqt;
        public final String copydefault;
        public List<Activity<V>> gEmmrt;

        public enum LabelType {
            NORMAL,
            UNDERFLOW,
            INFLOW,
            OVERFLOW
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 com.ibm.icu.text.AlphabeticIndex$Bucket$LabelType) A[MD:(java.lang.String, java.lang.String, com.ibm.icu.text.AlphabeticIndex$Bucket$LabelType):void (m)] (LINE:895) call: com.ibm.icu.text.AlphabeticIndex.Bucket.<init>(java.lang.String, java.lang.String, com.ibm.icu.text.AlphabeticIndex$Bucket$LabelType):void type: THIS */
        public /* synthetic */ Bucket(String str, String str2, LabelType labelType, AnonymousClass3 anonymousClass3) {
            this(str, str2, labelType);
        }

        public Bucket(String str, String str2, LabelType labelType) {
            this.copydefault = str;
            this.EZpvd = str2;
            this.OLrzqt = labelType;
        }

        @Override // java.lang.Iterable
        public Iterator<Activity<V>> iterator() {
            List<Activity<V>> list = this.gEmmrt;
            if (list == null) {
                return Collections.emptyList().iterator();
            }
            return list.iterator();
        }

        public String toString() {
            return "{labelType=" + this.OLrzqt + ", lowerBoundary=" + this.EZpvd + ", label=" + this.copydefault + "}";
        }
    }

    public final ActionBar<V> copydefault() {
        Iterator<String> it;
        char cCharAt;
        String str;
        char cCharAt2;
        String str2;
        String str3;
        AlphabeticIndex<V> alphabeticIndex = this;
        List<String> listValueOf = valueOf();
        long jAkhnZx = alphabeticIndex.KWHzl.fetchVPNInfo() ? ((long) alphabeticIndex.KWHzl.AkhnZx()) & BodyPartID.bodyIdMax : 0L;
        Bucket[] bucketArr = new Bucket[26];
        Bucket[] bucketArr2 = new Bucket[26];
        ArrayList<Bucket> arrayList = new ArrayList();
        String str4 = "";
        AnonymousClass3 anonymousClass3 = null;
        arrayList.add(new Bucket(OLrzqt(), str4, Bucket.LabelType.UNDERFLOW, anonymousClass3));
        Iterator<String> it2 = listValueOf.iterator();
        String str5 = "";
        boolean z = false;
        boolean z2 = false;
        int i = -1;
        while (true) {
            int i2 = 1;
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            if (alphabeticIndex.KWHzl.copydefault(next, str5) >= 0) {
                boolean z3 = false;
                while (true) {
                    i += i2;
                    str2 = alphabeticIndex.AEQbTJ.get(i);
                    if (alphabeticIndex.KWHzl.copydefault(next, str2) < 0) {
                        break;
                    }
                    i2 = 1;
                    z3 = true;
                }
                if (!z3 || arrayList.size() <= 1) {
                    it = it2;
                    str3 = str2;
                    anonymousClass3 = null;
                } else {
                    it = it2;
                    str3 = str2;
                    anonymousClass3 = null;
                    arrayList.add(new Bucket(KWHzl(), str5, Bucket.LabelType.INFLOW, anonymousClass3));
                }
                str5 = str3;
            } else {
                it = it2;
            }
            Bucket bucket = new Bucket(KWHzl(next), next, Bucket.LabelType.NORMAL, anonymousClass3);
            arrayList.add(bucket);
            if (next.length() == 1 && 'A' <= (cCharAt2 = next.charAt(0)) && cCharAt2 <= 'Z') {
                bucketArr[cCharAt2 - 'A'] = bucket;
            } else if (next.length() == 2 && next.startsWith("\ufdd0") && 'A' <= (cCharAt = next.charAt(1)) && cCharAt <= 'Z') {
                bucketArr2[cCharAt - 'A'] = bucket;
                z2 = true;
            }
            if (next.startsWith("\ufdd0") || !OLrzqt(alphabeticIndex.KWHzl, jAkhnZx, next) || next.endsWith("\uffff")) {
                str = str5;
            } else {
                int size = arrayList.size() - 2;
                while (true) {
                    Bucket bucket2 = (Bucket) arrayList.get(size);
                    Bucket.LabelType labelType = bucket2.OLrzqt;
                    str = str5;
                    Bucket.LabelType labelType2 = Bucket.LabelType.NORMAL;
                    if (labelType == labelType2) {
                        if (bucket2.AEQbTJ == null && !OLrzqt(alphabeticIndex.KWHzl, jAkhnZx, bucket2.EZpvd)) {
                            Bucket bucket3 = new Bucket(str4, next + "\uffff", labelType2, null);
                            bucket3.AEQbTJ = bucket2;
                            arrayList.add(bucket3);
                            z = true;
                            break;
                        }
                        size--;
                        alphabeticIndex = this;
                        str5 = str;
                    }
                }
            }
            alphabeticIndex = this;
            it2 = it;
            str5 = str;
            anonymousClass3 = null;
        }
        if (arrayList.size() == 1) {
            return new ActionBar<>(arrayList, arrayList, null);
        }
        arrayList.add(new Bucket(AEQbTJ(), str5, Bucket.LabelType.OVERFLOW, null));
        if (z2) {
            Bucket bucket4 = null;
            for (int i3 = 0; i3 < 26; i3++) {
                Bucket bucket5 = bucketArr[i3];
                if (bucket5 != null) {
                    bucket4 = bucket5;
                }
                Bucket bucket6 = bucketArr2[i3];
                if (bucket6 != null && bucket4 != null) {
                    bucket6.AEQbTJ = bucket4;
                    z = true;
                }
            }
        }
        if (!z) {
            return new ActionBar<>(arrayList, arrayList, null);
        }
        int size2 = arrayList.size() - 1;
        Bucket bucket7 = (Bucket) arrayList.get(size2);
        while (true) {
            size2--;
            if (size2 <= 0) {
                break;
            }
            Bucket bucket8 = (Bucket) arrayList.get(size2);
            if (bucket8.AEQbTJ == null) {
                if (bucket8.OLrzqt != Bucket.LabelType.INFLOW || bucket7.OLrzqt == Bucket.LabelType.NORMAL) {
                    bucket7 = bucket8;
                } else {
                    bucket8.AEQbTJ = bucket7;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Bucket bucket9 : arrayList) {
            if (bucket9.AEQbTJ == null) {
                arrayList2.add(bucket9);
            }
        }
        return new ActionBar<>(arrayList, arrayList2, null);
    }

    public static class ActionBar<V> implements Iterable<Bucket<V>> {
        public final List<Bucket<V>> AEQbTJ;
        public final ArrayList<Bucket<V>> KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.util.ArrayList), (r2v0 java.util.ArrayList) A[MD:(java.util.ArrayList<com.ibm.icu.text.AlphabeticIndex$Bucket<V>>, java.util.ArrayList<com.ibm.icu.text.AlphabeticIndex$Bucket<V>>):void (m)] (LINE:1143) call: com.ibm.icu.text.AlphabeticIndex.ActionBar.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
        public /* synthetic */ ActionBar(ArrayList arrayList, ArrayList arrayList2, AnonymousClass3 anonymousClass3) {
            this(arrayList, arrayList2);
        }

        public ActionBar(ArrayList<Bucket<V>> arrayList, ArrayList<Bucket<V>> arrayList2) {
            this.KWHzl = arrayList;
            Iterator<Bucket<V>> it = arrayList2.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next().KWHzl = i;
                i++;
            }
            this.AEQbTJ = Collections.unmodifiableList(arrayList2);
        }

        public final Iterator<Bucket<V>> copydefault() {
            return this.KWHzl.iterator();
        }

        @Override // java.lang.Iterable
        public Iterator<Bucket<V>> iterator() {
            return this.AEQbTJ.iterator();
        }
    }

    public static boolean OLrzqt(C7286agv c7286agv, long j, String str) throws Throwable {
        boolean z = false;
        for (long j2 : c7286agv.EZpvd(str)) {
            if ((j2 >>> 32) > j) {
                if (z) {
                    return true;
                }
                z = true;
            }
        }
        return false;
    }
}
