package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.TreeMap;
import o.yXL;

/* JADX INFO: loaded from: classes13.dex */
public class yXU<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    public java.util.List<yXU<K, V>.TaskDescription> AEQbTJ;
    public java.util.Map<K, V> EZpvd;
    public volatile yXU<K, V>.Activity KWHzl;
    public boolean OLrzqt;
    public final int copydefault;

    public static class ActionBar {
        public static final java.util.Iterator<java.lang.Object> AEQbTJ = new java.util.Iterator<java.lang.Object>() { // from class: o.yXU.ActionBar.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
        public static final java.lang.Iterable<java.lang.Object> OLrzqt = new java.lang.Iterable<java.lang.Object>() { // from class: o.yXU.ActionBar.1
            @Override // java.lang.Iterable
            public java.util.Iterator<java.lang.Object> iterator() {
                return ActionBar.AEQbTJ;
            }
        };

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <T> java.lang.Iterable<T> copydefault() {
            return (java.lang.Iterable<T>) OLrzqt;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean djBIcL() {
        return this.OLrzqt;
    }

    public static <FieldDescriptorType extends yXL.Activity<FieldDescriptorType>> yXU<FieldDescriptorType, java.lang.Object> copydefault(int i) {
        return (yXU<FieldDescriptorType, java.lang.Object>) new yXU<FieldDescriptorType, java.lang.Object>(i) { // from class: o.yXU.3
            @Override // o.yXU, java.util.AbstractMap, java.util.Map
            public /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
                return super.put((yXL.Activity) obj, obj2);
            }

            @Override // o.yXU
            public void valueOf() {
                if (!djBIcL()) {
                    for (int i2 = 0; i2 < copydefault(); i2++) {
                        Map.Entry<FieldDescriptorType, java.lang.Object> entryEZpvd = EZpvd(i2);
                        if (((yXL.Activity) entryEZpvd.getKey()).KWHzl()) {
                            entryEZpvd.setValue(Collections.unmodifiableList((java.util.List) entryEZpvd.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, java.lang.Object> entry : KWHzl()) {
                        if (((yXL.Activity) entry.getKey()).KWHzl()) {
                            entry.setValue(Collections.unmodifiableList((java.util.List) entry.getValue()));
                        }
                    }
                }
                super.valueOf();
            }
        };
    }

    public yXU(int i) {
        this.copydefault = i;
        this.AEQbTJ = Collections.emptyList();
        this.EZpvd = Collections.emptyMap();
    }

    public void valueOf() {
        if (this.OLrzqt) {
            return;
        }
        this.EZpvd = this.EZpvd.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.EZpvd);
        this.OLrzqt = true;
    }

    public int copydefault() {
        return this.AEQbTJ.size();
    }

    public Map.Entry<K, V> EZpvd(int i) {
        return this.AEQbTJ.get(i);
    }

    public java.lang.Iterable<Map.Entry<K, V>> KWHzl() {
        return this.EZpvd.isEmpty() ? ActionBar.copydefault() : this.EZpvd.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.AEQbTJ.size() + this.EZpvd.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        return OLrzqt(comparable) >= 0 || this.EZpvd.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iOLrzqt = OLrzqt(comparable);
        if (iOLrzqt >= 0) {
            return this.AEQbTJ.get(iOLrzqt).getValue();
        }
        return this.EZpvd.get(comparable);
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public V put(K k, V v) {
        AEQbTJ();
        int iOLrzqt = OLrzqt(k);
        if (iOLrzqt >= 0) {
            return this.AEQbTJ.get(iOLrzqt).setValue(v);
        }
        OLrzqt();
        int i = -(iOLrzqt + 1);
        if (i >= this.copydefault) {
            return EZpvd().put(k, v);
        }
        int size = this.AEQbTJ.size();
        int i2 = this.copydefault;
        if (size == i2) {
            yXU<K, V>.TaskDescription taskDescriptionRemove = this.AEQbTJ.remove(i2 - 1);
            EZpvd().put(taskDescriptionRemove.getKey(), taskDescriptionRemove.getValue());
        }
        this.AEQbTJ.add(i, new TaskDescription(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        AEQbTJ();
        if (!this.AEQbTJ.isEmpty()) {
            this.AEQbTJ.clear();
        }
        if (this.EZpvd.isEmpty()) {
            return;
        }
        this.EZpvd.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        AEQbTJ();
        java.lang.Comparable comparable = (java.lang.Comparable) obj;
        int iOLrzqt = OLrzqt(comparable);
        if (iOLrzqt >= 0) {
            return KWHzl(iOLrzqt);
        }
        if (this.EZpvd.isEmpty()) {
            return null;
        }
        return this.EZpvd.remove(comparable);
    }

    public final V KWHzl(int i) {
        AEQbTJ();
        V value = this.AEQbTJ.remove(i).getValue();
        if (!this.EZpvd.isEmpty()) {
            java.util.Iterator<Map.Entry<K, V>> it = EZpvd().entrySet().iterator();
            this.AEQbTJ.add(new TaskDescription(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt(K k) {
        int size = this.AEQbTJ.size();
        int i = size - 1;
        if (i < 0) {
            size = 0;
            while (size <= i) {
                int i2 = (size + i) / 2;
                int iCompareTo = k.compareTo(this.AEQbTJ.get(i2).getKey());
                if (iCompareTo < 0) {
                    i = i2 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i2;
                    }
                    size = i2 + 1;
                }
            }
        } else {
            int iCompareTo2 = k.compareTo(this.AEQbTJ.get(i).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i;
                }
                size = 0;
                while (size <= i) {
                }
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<Map.Entry<K, V>> entrySet() {
        if (this.KWHzl == null) {
            this.KWHzl = new Activity();
        }
        return this.KWHzl;
    }

    public final void AEQbTJ() {
        if (this.OLrzqt) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final SortedMap<K, V> EZpvd() {
        AEQbTJ();
        if (this.EZpvd.isEmpty() && !(this.EZpvd instanceof TreeMap)) {
            this.EZpvd = new TreeMap();
        }
        return (SortedMap) this.EZpvd;
    }

    public final void OLrzqt() {
        AEQbTJ();
        if (!this.AEQbTJ.isEmpty() || (this.AEQbTJ instanceof java.util.ArrayList)) {
            return;
        }
        this.AEQbTJ = new java.util.ArrayList(this.copydefault);
    }

    public class TaskDescription implements java.lang.Comparable<yXU<K, V>.TaskDescription>, Map.Entry<K, V> {
        public V OLrzqt;
        public final K copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getKey()Ljava/lang/Object; */
        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map.Entry
        public V getValue() {
            return this.OLrzqt;
        }

        public TaskDescription(yXU yxu, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        public TaskDescription(K k, V v) {
            this.copydefault = k;
            this.OLrzqt = v;
        }

        /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compareTo(yXU<K, V>.TaskDescription taskDescription) {
            return getKey().compareTo(taskDescription.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            yXU.this.AEQbTJ();
            V v2 = this.OLrzqt;
            this.OLrzqt = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return copydefault(this.copydefault, entry.getKey()) && copydefault(this.OLrzqt, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.copydefault;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.OLrzqt;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public java.lang.String toString() {
            java.lang.String strValueOf = java.lang.String.valueOf(this.copydefault);
            java.lang.String strValueOf2 = java.lang.String.valueOf(this.OLrzqt);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb.append(strValueOf);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(strValueOf2);
            return sb.toString();
        }

        public final boolean copydefault(java.lang.Object obj, java.lang.Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    public class Activity extends java.util.AbstractSet<Map.Entry<K, V>> {
        public Activity() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new Application();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return yXU.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            java.lang.Object obj2 = yXU.this.get(entry.getKey());
            java.lang.Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            yXU.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            yXU.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            yXU.this.clear();
        }
    }

    public class Application implements java.util.Iterator<Map.Entry<K, V>> {
        public boolean EZpvd;
        public int KWHzl;
        public java.util.Iterator<Map.Entry<K, V>> OLrzqt;

        public Application() {
            this.KWHzl = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.KWHzl + 1 < yXU.this.AEQbTJ.size() || OLrzqt().hasNext();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.EZpvd = true;
            int i = this.KWHzl + 1;
            this.KWHzl = i;
            if (i < yXU.this.AEQbTJ.size()) {
                return (Map.Entry) yXU.this.AEQbTJ.get(this.KWHzl);
            }
            return OLrzqt().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.EZpvd) {
                this.EZpvd = false;
                yXU.this.AEQbTJ();
                if (this.KWHzl < yXU.this.AEQbTJ.size()) {
                    yXU yxu = yXU.this;
                    int i = this.KWHzl;
                    this.KWHzl = i - 1;
                    yxu.KWHzl(i);
                    return;
                }
                OLrzqt().remove();
                return;
            }
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }

        public final java.util.Iterator<Map.Entry<K, V>> OLrzqt() {
            if (this.OLrzqt == null) {
                this.OLrzqt = yXU.this.EZpvd.entrySet().iterator();
            }
            return this.OLrzqt;
        }
    }
}
