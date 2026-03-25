package o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.IllegalAddException;
import org.jdom2.Namespace;

/* JADX INFO: renamed from: o.zpA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59864zpA extends java.util.AbstractList<Attribute> implements java.util.RandomAccess {
    public Attribute[] AEQbTJ;
    public int EZpvd;
    public final Element OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.EZpvd == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.EZpvd;
    }

    public C59864zpA(Element element) {
        this.OLrzqt = element;
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean add(Attribute attribute) {
        if (attribute.getParent() != null) {
            throw new IllegalAddException("The attribute already has an existing parent \"" + attribute.getParent().getQualifiedName() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (C59868zpE.EZpvd(attribute, this.OLrzqt) != null) {
            Element element = this.OLrzqt;
            throw new IllegalAddException(element, attribute, C59868zpE.EZpvd(attribute, element));
        }
        int iAEQbTJ = AEQbTJ(attribute);
        if (iAEQbTJ < 0) {
            attribute.setParent(this.OLrzqt);
            KWHzl(this.EZpvd + 1);
            Attribute[] attributeArr = this.AEQbTJ;
            int i = this.EZpvd;
            this.EZpvd = i + 1;
            attributeArr[i] = attribute;
            ((java.util.AbstractList) this).modCount++;
        } else {
            this.AEQbTJ[iAEQbTJ].setParent(null);
            this.AEQbTJ[iAEQbTJ] = attribute;
            attribute.setParent(this.OLrzqt);
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void add(int i, Attribute attribute) {
        if (i < 0 || i > this.EZpvd) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
        }
        if (attribute.getParent() != null) {
            throw new IllegalAddException("The attribute already has an existing parent \"" + attribute.getParent().getQualifiedName() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        if (AEQbTJ(attribute) >= 0) {
            throw new IllegalAddException("Cannot add duplicate attribute");
        }
        java.lang.String strEZpvd = C59868zpE.EZpvd(attribute, this.OLrzqt);
        if (strEZpvd != null) {
            throw new IllegalAddException(this.OLrzqt, attribute, strEZpvd);
        }
        attribute.setParent(this.OLrzqt);
        KWHzl(this.EZpvd + 1);
        int i2 = this.EZpvd;
        if (i == i2) {
            Attribute[] attributeArr = this.AEQbTJ;
            this.EZpvd = i2 + 1;
            attributeArr[i2] = attribute;
        } else {
            Attribute[] attributeArr2 = this.AEQbTJ;
            java.lang.System.arraycopy(attributeArr2, i, attributeArr2, i + 1, i2 - i);
            this.AEQbTJ[i] = attribute;
            this.EZpvd++;
        }
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends Attribute> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends Attribute> collection) {
        if (i < 0 || i > this.EZpvd) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
        }
        if (collection == null) {
            throw new java.lang.NullPointerException("Can not add a null Collection to AttributeList");
        }
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            return false;
        }
        if (size == 1) {
            add(i, collection.iterator().next());
            return true;
        }
        KWHzl(size() + size);
        int i3 = ((java.util.AbstractList) this).modCount;
        try {
            java.util.Iterator<? extends Attribute> it = collection.iterator();
            while (it.hasNext()) {
                add(i + i2, it.next());
                i2++;
            }
            return true;
        } catch (java.lang.Throwable th) {
            while (true) {
                i2--;
                if (i2 >= 0) {
                    remove(i + i2);
                } else {
                    ((java.util.AbstractList) this).modCount = i3;
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.AEQbTJ != null) {
            while (true) {
                int i = this.EZpvd;
                if (i <= 0) {
                    break;
                }
                int i2 = i - 1;
                this.EZpvd = i2;
                this.AEQbTJ[i2].setParent(null);
                this.AEQbTJ[this.EZpvd] = null;
            }
        }
        ((java.util.AbstractList) this).modCount++;
    }

    public void AEQbTJ(java.util.Collection<? extends Attribute> collection) {
        if (collection == null || collection.isEmpty()) {
            clear();
            return;
        }
        Attribute[] attributeArr = this.AEQbTJ;
        int i = this.EZpvd;
        int i2 = ((java.util.AbstractList) this).modCount;
        while (true) {
            int i3 = this.EZpvd;
            if (i3 > 0) {
                int i4 = i3 - 1;
                this.EZpvd = i4;
                attributeArr[i4].setParent(null);
            } else {
                this.EZpvd = 0;
                this.AEQbTJ = null;
                try {
                    addAll(0, collection);
                    return;
                } catch (java.lang.Throwable th) {
                    this.AEQbTJ = attributeArr;
                    while (true) {
                        int i5 = this.EZpvd;
                        if (i5 < i) {
                            Attribute[] attributeArr2 = this.AEQbTJ;
                            this.EZpvd = i5 + 1;
                            attributeArr2[i5].setParent(this.OLrzqt);
                        } else {
                            ((java.util.AbstractList) this).modCount = i2;
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final void KWHzl(int i) {
        Attribute[] attributeArr = this.AEQbTJ;
        if (attributeArr == null) {
            this.AEQbTJ = new Attribute[java.lang.Math.max(i, 4)];
        } else {
            if (i < attributeArr.length) {
                return;
            }
            this.AEQbTJ = (Attribute[]) C59867zpD.copydefault(attributeArr, ((i + 4) >>> 1) << 1);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public Attribute get(int i) {
        if (i < 0 || i >= this.EZpvd) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
        }
        return this.AEQbTJ[i];
    }

    public Attribute AEQbTJ(java.lang.String str, Namespace namespace) {
        int iOLrzqt = OLrzqt(str, namespace);
        if (iOLrzqt < 0) {
            return null;
        }
        return this.AEQbTJ[iOLrzqt];
    }

    public int OLrzqt(java.lang.String str, Namespace namespace) {
        if (this.AEQbTJ == null) {
            return -1;
        }
        if (namespace == null) {
            return OLrzqt(str, Namespace.NO_NAMESPACE);
        }
        java.lang.String uri = namespace.getURI();
        for (int i = 0; i < this.EZpvd; i++) {
            Attribute attribute = this.AEQbTJ[i];
            if (uri.equals(attribute.getNamespaceURI()) && str.equals(attribute.getName())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Attribute remove(int i) {
        if (i < 0 || i >= this.EZpvd) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
        }
        Attribute attribute = this.AEQbTJ[i];
        attribute.setParent(null);
        Attribute[] attributeArr = this.AEQbTJ;
        java.lang.System.arraycopy(attributeArr, i + 1, attributeArr, i, (this.EZpvd - i) - 1);
        Attribute[] attributeArr2 = this.AEQbTJ;
        int i2 = this.EZpvd - 1;
        this.EZpvd = i2;
        attributeArr2[i2] = null;
        ((java.util.AbstractList) this).modCount++;
        return attribute;
    }

    public boolean copydefault(java.lang.String str, Namespace namespace) {
        int iOLrzqt = OLrzqt(str, namespace);
        if (iOLrzqt < 0) {
            return false;
        }
        remove(iOLrzqt);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Attribute set(int i, Attribute attribute) {
        if (i < 0 || i >= this.EZpvd) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
        }
        if (attribute.getParent() != null) {
            throw new IllegalAddException("The attribute already has an existing parent \"" + attribute.getParent().getQualifiedName() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        int iAEQbTJ = AEQbTJ(attribute);
        if (iAEQbTJ >= 0 && iAEQbTJ != i) {
            throw new IllegalAddException("Cannot set duplicate attribute");
        }
        java.lang.String strEZpvd = C59868zpE.EZpvd(attribute, this.OLrzqt, i);
        if (strEZpvd != null) {
            throw new IllegalAddException(this.OLrzqt, attribute, strEZpvd);
        }
        Attribute attribute2 = this.AEQbTJ[i];
        attribute2.setParent(null);
        this.AEQbTJ[i] = attribute;
        attribute.setParent(this.OLrzqt);
        return attribute2;
    }

    public final int AEQbTJ(Attribute attribute) {
        return OLrzqt(attribute.getName(), attribute.getNamespace());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<Attribute> iterator() {
        return new Application();
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return super.toString();
    }

    public final int OLrzqt(int[] iArr, int i, int i2, java.util.Comparator<? super Attribute> comparator) {
        int i3 = i - 1;
        Attribute attribute = this.AEQbTJ[i2];
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int iCompare = comparator.compare(attribute, this.AEQbTJ[iArr[i5]]);
            if (iCompare == 0) {
                while (iCompare == 0 && i5 < i3) {
                    int i6 = i5 + 1;
                    if (comparator.compare(attribute, this.AEQbTJ[iArr[i6]]) != 0) {
                        break;
                    }
                    i5 = i6;
                }
                return i5 + 1;
            }
            if (iCompare < 0) {
                i3 = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return i4;
    }

    public final void AEQbTJ(int[] iArr) {
        int[] iArrKWHzl = C59867zpD.KWHzl(iArr, iArr.length);
        java.util.Arrays.sort(iArrKWHzl);
        int length = iArrKWHzl.length;
        Attribute[] attributeArr = new Attribute[length];
        for (int i = 0; i < length; i++) {
            attributeArr[i] = this.AEQbTJ[iArr[i]];
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.AEQbTJ[iArrKWHzl[i2]] = attributeArr[i2];
        }
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super Attribute> comparator) {
        int i = this.EZpvd;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOLrzqt = OLrzqt(iArr, i2, i2, comparator);
            if (iOLrzqt < i2) {
                java.lang.System.arraycopy(iArr, iOLrzqt, iArr, iOLrzqt + 1, i2 - iOLrzqt);
            }
            iArr[iOLrzqt] = i2;
        }
        AEQbTJ(iArr);
    }

    /* JADX INFO: renamed from: o.zpA$Application */
    public final class Application implements java.util.Iterator<Attribute> {
        public boolean EZpvd;
        public int OLrzqt;
        public int copydefault;

        public Application() {
            this.copydefault = -1;
            this.OLrzqt = 0;
            this.EZpvd = false;
            this.copydefault = ((java.util.AbstractList) C59864zpA.this).modCount;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt < C59864zpA.this.EZpvd;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Attribute next() {
            if (((java.util.AbstractList) C59864zpA.this).modCount == this.copydefault) {
                if (this.OLrzqt < C59864zpA.this.EZpvd) {
                    this.EZpvd = true;
                    Attribute[] attributeArr = C59864zpA.this.AEQbTJ;
                    int i = this.OLrzqt;
                    this.OLrzqt = i + 1;
                    return attributeArr[i];
                }
                throw new NoSuchElementException("Iterated beyond the end of the ContentList.");
            }
            throw new ConcurrentModificationException("ContentList was modified outside of this Iterator");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (((java.util.AbstractList) C59864zpA.this).modCount != this.copydefault) {
                throw new ConcurrentModificationException("ContentList was modified outside of this Iterator");
            }
            if (!this.EZpvd) {
                throw new java.lang.IllegalStateException("Can only remove() content after a call to next()");
            }
            C59864zpA c59864zpA = C59864zpA.this;
            int i = this.OLrzqt - 1;
            this.OLrzqt = i;
            c59864zpA.remove(i);
            this.copydefault = ((java.util.AbstractList) C59864zpA.this).modCount;
            this.EZpvd = false;
        }
    }
}
