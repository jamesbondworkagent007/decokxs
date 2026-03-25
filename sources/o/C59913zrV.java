package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jsoup.nodes.Document;

/* JADX INFO: renamed from: o.zrV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C59913zrV implements java.lang.Iterable<C59911zrT>, java.lang.Cloneable {
    public LinkedHashMap<java.lang.String, C59911zrT> EZpvd = null;

    public java.lang.String copydefault(java.lang.String str) {
        C59911zrT c59911zrT;
        C59912zrU.copydefault(str);
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap = this.EZpvd;
        return (linkedHashMap == null || (c59911zrT = linkedHashMap.get(str.toLowerCase())) == null) ? "" : c59911zrT.getValue();
    }

    public void copydefault(java.lang.String str, java.lang.String str2) {
        EZpvd(new C59911zrT(str, str2));
    }

    public void EZpvd(C59911zrT c59911zrT) {
        C59912zrU.KWHzl(c59911zrT);
        if (this.EZpvd == null) {
            this.EZpvd = new LinkedHashMap<>(2);
        }
        this.EZpvd.put(c59911zrT.getKey(), c59911zrT);
    }

    public boolean KWHzl(java.lang.String str) {
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap = this.EZpvd;
        return linkedHashMap != null && linkedHashMap.containsKey(str.toLowerCase());
    }

    public int OLrzqt() {
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap = this.EZpvd;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public void AEQbTJ(C59913zrV c59913zrV) {
        if (c59913zrV.OLrzqt() == 0) {
            return;
        }
        if (this.EZpvd == null) {
            this.EZpvd = new LinkedHashMap<>(c59913zrV.OLrzqt());
        }
        this.EZpvd.putAll(c59913zrV.EZpvd);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<C59911zrT> iterator() {
        return copydefault().iterator();
    }

    public java.util.List<C59911zrT> copydefault() {
        if (this.EZpvd == null) {
            return Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.EZpvd.size());
        java.util.Iterator<Map.Entry<java.lang.String, C59911zrT>> it = this.EZpvd.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public java.lang.String EZpvd() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        KWHzl(sb, new Document("").djBIcL());
        return sb.toString();
    }

    public void KWHzl(java.lang.StringBuilder sb, Document.Activity activity) {
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap = this.EZpvd;
        if (linkedHashMap == null) {
            return;
        }
        java.util.Iterator<Map.Entry<java.lang.String, C59911zrT>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            C59911zrT value = it.next().getValue();
            sb.append(" ");
            value.AEQbTJ(sb, activity);
        }
    }

    public java.lang.String toString() {
        return EZpvd();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59913zrV)) {
            return false;
        }
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap = this.EZpvd;
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap2 = ((C59913zrV) obj).EZpvd;
        return linkedHashMap == null ? linkedHashMap2 == null : linkedHashMap.equals(linkedHashMap2);
    }

    public int hashCode() {
        LinkedHashMap<java.lang.String, C59911zrT> linkedHashMap = this.EZpvd;
        if (linkedHashMap != null) {
            return linkedHashMap.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C59913zrV clone() {
        if (this.EZpvd == null) {
            return new C59913zrV();
        }
        try {
            C59913zrV c59913zrV = (C59913zrV) super.clone();
            c59913zrV.EZpvd = new LinkedHashMap<>(this.EZpvd.size());
            for (C59911zrT c59911zrT : this) {
                c59913zrV.EZpvd.put(c59911zrT.getKey(), c59911zrT.clone());
            }
            return c59913zrV;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }
}
