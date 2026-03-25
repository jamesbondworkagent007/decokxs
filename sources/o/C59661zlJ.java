package o;

/* JADX INFO: renamed from: o.zlJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59661zlJ extends java.util.AbstractList<java.lang.Object> {
    public final java.util.Set<java.net.URI> OLrzqt = new java.util.HashSet();
    public final java.util.List<java.net.URI> KWHzl = new java.util.ArrayList();

    public boolean KWHzl(java.net.URI uri) {
        return this.OLrzqt.contains(uri);
    }

    public void EZpvd(java.net.URI uri) {
        this.OLrzqt.add(uri);
        this.KWHzl.add(uri);
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.net.URI get(int i) {
        return this.KWHzl.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.KWHzl.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i, java.lang.Object obj) {
        java.net.URI uri = (java.net.URI) obj;
        java.net.URI uri2 = this.KWHzl.set(i, uri);
        this.OLrzqt.remove(uri2);
        this.OLrzqt.add(uri);
        if (this.KWHzl.size() != this.OLrzqt.size()) {
            this.OLrzqt.addAll(this.KWHzl);
        }
        return uri2;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, java.lang.Object obj) {
        java.net.URI uri = (java.net.URI) obj;
        this.KWHzl.add(i, uri);
        this.OLrzqt.add(uri);
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.net.URI remove(int i) {
        java.net.URI uriRemove = this.KWHzl.remove(i);
        this.OLrzqt.remove(uriRemove);
        if (this.KWHzl.size() != this.OLrzqt.size()) {
            this.OLrzqt.addAll(this.KWHzl);
        }
        return uriRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return this.OLrzqt.contains(obj);
    }
}
