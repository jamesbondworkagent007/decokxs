package o;

/* JADX INFO: loaded from: classes13.dex */
public class yXW extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, yXP {
    public final yXP OLrzqt;

    @Override // o.yXP
    public yXP OLrzqt() {
        return this;
    }

    public yXW(yXP yxp) {
        this.OLrzqt = yxp;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i) {
        return this.OLrzqt.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.OLrzqt.size();
    }

    @Override // o.yXP
    public yXD copydefault(int i) {
        return this.OLrzqt.copydefault(i);
    }

    @Override // o.yXP
    public void AEQbTJ(yXD yxd) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int i) {
        return new java.util.ListIterator<java.lang.String>(i) { // from class: o.yXW.1
            public java.util.ListIterator<java.lang.String> KWHzl;
            public final /* synthetic */ int copydefault;

            {
                this.copydefault = i;
                this.KWHzl = yXW.this.OLrzqt.listIterator(i);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.KWHzl.hasNext();
            }

            /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
            @Override // java.util.ListIterator, java.util.Iterator
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public java.lang.String next() {
                return this.KWHzl.next();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.KWHzl.hasPrevious();
            }

            /* JADX DEBUG: Method merged with bridge method: previous()Ljava/lang/Object; */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public java.lang.String previous() {
                return this.KWHzl.previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.KWHzl.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.KWHzl.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }

            /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;)V */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public void set(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException();
            }

            /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)V */
            @Override // java.util.ListIterator
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void add(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
        return new java.util.Iterator<java.lang.String>() { // from class: o.yXW.3
            public java.util.Iterator<java.lang.String> OLrzqt;

            {
                this.OLrzqt = yXW.this.OLrzqt.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.OLrzqt.hasNext();
            }

            /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
            @Override // java.util.Iterator
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public java.lang.String next() {
                return this.OLrzqt.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new java.lang.UnsupportedOperationException();
            }
        };
    }

    @Override // o.yXP
    public java.util.List<?> EZpvd() {
        return this.OLrzqt.EZpvd();
    }
}
