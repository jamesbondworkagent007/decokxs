package o;

import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public class yXO extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, yXP {
    public static final yXP KWHzl = new yXO().OLrzqt();
    public final java.util.List<java.lang.Object> EZpvd;

    public yXO() {
        this.EZpvd = new java.util.ArrayList();
    }

    public yXO(yXP yxp) {
        this.EZpvd = new java.util.ArrayList(yxp.size());
        addAll(yxp);
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.String get(int i) {
        java.lang.Object obj = this.EZpvd.get(i);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof yXD) {
            yXD yxd = (yXD) obj;
            java.lang.String strFetchVPNInfo = yxd.fetchVPNInfo();
            if (yxd.djBIcL()) {
                this.EZpvd.set(i, strFetchVPNInfo);
            }
            return strFetchVPNInfo;
        }
        byte[] bArr = (byte[]) obj;
        java.lang.String strAEQbTJ = yXJ.AEQbTJ(bArr);
        if (yXJ.copydefault(bArr)) {
            this.EZpvd.set(i, strAEQbTJ);
        }
        return strAEQbTJ;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String set(int i, java.lang.String str) {
        return KWHzl(this.EZpvd.set(i, str));
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void add(int i, java.lang.String str) {
        this.EZpvd.add(i, str);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends java.lang.String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends java.lang.String> collection) {
        if (collection instanceof yXP) {
            collection = ((yXP) collection).EZpvd();
        }
        boolean zAddAll = this.EZpvd.addAll(i, collection);
        ((java.util.AbstractList) this).modCount++;
        return zAddAll;
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String remove(int i) {
        java.lang.Object objRemove = this.EZpvd.remove(i);
        ((java.util.AbstractList) this).modCount++;
        return KWHzl(objRemove);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.EZpvd.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // o.yXP
    public void AEQbTJ(yXD yxd) {
        this.EZpvd.add(yxd);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // o.yXP
    public yXD copydefault(int i) {
        java.lang.Object obj = this.EZpvd.get(i);
        yXD yxdOLrzqt = OLrzqt(obj);
        if (yxdOLrzqt != obj) {
            this.EZpvd.set(i, yxdOLrzqt);
        }
        return yxdOLrzqt;
    }

    public static java.lang.String KWHzl(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof yXD) {
            return ((yXD) obj).fetchVPNInfo();
        }
        return yXJ.AEQbTJ((byte[]) obj);
    }

    public static yXD OLrzqt(java.lang.Object obj) {
        if (obj instanceof yXD) {
            return (yXD) obj;
        }
        if (obj instanceof java.lang.String) {
            return yXD.KWHzl((java.lang.String) obj);
        }
        return yXD.OLrzqt((byte[]) obj);
    }

    @Override // o.yXP
    public java.util.List<?> EZpvd() {
        return Collections.unmodifiableList(this.EZpvd);
    }

    @Override // o.yXP
    public yXP OLrzqt() {
        return new yXW(this);
    }
}
