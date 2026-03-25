package o;

/* JADX INFO: renamed from: o.zsh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C59952zsh implements java.util.List<C59946zsb>, java.lang.Cloneable {
    public java.util.List<C59946zsb> copydefault;

    public C59952zsh() {
        this.copydefault = new java.util.ArrayList();
    }

    public C59952zsh(java.util.List<C59946zsb> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59952zsh clone() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<C59946zsb> it = this.copydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().clone());
        }
        return new C59952zsh(arrayList);
    }

    public java.lang.String KWHzl() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (C59946zsb c59946zsb : this.copydefault) {
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(c59946zsb.EZpvd());
        }
        return sb.toString();
    }

    public java.lang.String toString() {
        return KWHzl();
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.copydefault.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.copydefault.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return this.copydefault.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C59946zsb> iterator() {
        return this.copydefault.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return this.copydefault.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.copydefault.toArray(tArr);
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.List, java.util.Collection
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean add(C59946zsb c59946zsb) {
        return this.copydefault.add(c59946zsb);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.copydefault.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<?> collection) {
        return this.copydefault.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends C59946zsb> collection) {
        return this.copydefault.addAll(collection);
    }

    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends C59946zsb> collection) {
        return this.copydefault.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        return this.copydefault.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> collection) {
        return this.copydefault.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.copydefault.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return this.copydefault.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.List
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C59946zsb get(int i) {
        return this.copydefault.get(i);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.List
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59946zsb set(int i, C59946zsb c59946zsb) {
        return this.copydefault.set(i, c59946zsb);
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.List
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void add(int i, C59946zsb c59946zsb) {
        this.copydefault.add(i, c59946zsb);
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.List
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C59946zsb remove(int i) {
        return this.copydefault.remove(i);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.copydefault.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return this.copydefault.lastIndexOf(obj);
    }

    @Override // java.util.List
    public java.util.ListIterator<C59946zsb> listIterator() {
        return this.copydefault.listIterator();
    }

    @Override // java.util.List
    public java.util.ListIterator<C59946zsb> listIterator(int i) {
        return this.copydefault.listIterator(i);
    }

    @Override // java.util.List
    public java.util.List<C59946zsb> subList(int i, int i2) {
        return this.copydefault.subList(i, i2);
    }
}
