package o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.jdom2.Content;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.IllegalAddException;
import org.jdom2.Parent;

/* JADX INFO: renamed from: o.zpz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59906zpz extends java.util.AbstractList<Content> implements java.util.RandomAccess {
    public int OLrzqt;
    public final Parent copydefault;
    public Content[] KWHzl = null;
    public transient int EZpvd = Integer.MIN_VALUE;
    public transient int AEQbTJ = Integer.MIN_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.AEQbTJ++;
        this.EZpvd++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.AEQbTJ++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i, int i2) {
        this.EZpvd = i;
        this.AEQbTJ = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.OLrzqt;
    }

    public C59906zpz(Parent parent) {
        this.copydefault = parent;
    }

    public final void KWHzl(int i, boolean z) {
        int i2 = z ? this.OLrzqt - 1 : this.OLrzqt;
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + this.OLrzqt);
        }
    }

    public final void AEQbTJ(Content content, int i, boolean z) {
        if (content == null) {
            throw new java.lang.NullPointerException("Cannot add null object");
        }
        KWHzl(i, z);
        if (content.getParent() != null) {
            Parent parent = content.getParent();
            if (parent instanceof Document) {
                throw new IllegalAddException((Element) content, "The Content already has an existing parent document");
            }
            throw new IllegalAddException("The Content already has an existing parent \"" + ((Element) parent).getQualifiedName() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        }
        Parent parent2 = this.copydefault;
        if (content == parent2) {
            throw new IllegalAddException("The Element cannot be added to itself");
        }
        if ((parent2 instanceof Element) && (content instanceof Element) && ((Element) content).isAncestor((Element) parent2)) {
            throw new IllegalAddException("The Element cannot be added as a descendent of itself");
        }
    }

    /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void add(int i, Content content) {
        AEQbTJ(content, i, false);
        this.copydefault.canContainContent(content, i, false);
        content.setParent(this.copydefault);
        copydefault(this.OLrzqt + 1);
        int i2 = this.OLrzqt;
        if (i == i2) {
            Content[] contentArr = this.KWHzl;
            this.OLrzqt = i2 + 1;
            contentArr[i2] = content;
        } else {
            Content[] contentArr2 = this.KWHzl;
            java.lang.System.arraycopy(contentArr2, i, contentArr2, i + 1, i2 - i);
            this.KWHzl[i] = content;
            this.OLrzqt++;
        }
        AEQbTJ();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends Content> collection) {
        return addAll(this.OLrzqt, collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, java.util.Collection<? extends Content> collection) {
        if (collection == null) {
            throw new java.lang.NullPointerException("Can not add a null collection to the ContentList");
        }
        int i2 = 0;
        KWHzl(i, false);
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        if (size == 1) {
            add(i, collection.iterator().next());
            return true;
        }
        copydefault(size() + size);
        int iEZpvd = EZpvd();
        int iOLrzqt = OLrzqt();
        try {
            java.util.Iterator<? extends Content> it = collection.iterator();
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
                    OLrzqt(iEZpvd, iOLrzqt);
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.KWHzl != null) {
            for (int i = 0; i < this.OLrzqt; i++) {
                copydefault(this.KWHzl[i]);
            }
            this.KWHzl = null;
            this.OLrzqt = 0;
        }
        AEQbTJ();
    }

    public void EZpvd(java.util.Collection<? extends Content> collection) {
        if (collection == null || collection.isEmpty()) {
            clear();
            return;
        }
        Content[] contentArr = this.KWHzl;
        int i = this.OLrzqt;
        int iEZpvd = EZpvd();
        int iOLrzqt = OLrzqt();
        while (true) {
            int i2 = this.OLrzqt;
            if (i2 > 0) {
                int i3 = i2 - 1;
                this.OLrzqt = i3;
                contentArr[i3].setParent(null);
            } else {
                this.OLrzqt = 0;
                this.KWHzl = null;
                try {
                    addAll(0, collection);
                    return;
                } catch (java.lang.Throwable th) {
                    this.KWHzl = contentArr;
                    while (true) {
                        int i4 = this.OLrzqt;
                        if (i4 < i) {
                            Content[] contentArr2 = this.KWHzl;
                            this.OLrzqt = i4 + 1;
                            contentArr2[i4].setParent(this.copydefault);
                        } else {
                            OLrzqt(iEZpvd, iOLrzqt);
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public void copydefault(int i) {
        Content[] contentArr = this.KWHzl;
        if (contentArr == null) {
            this.KWHzl = new Content[java.lang.Math.max(i, 4)];
        } else {
            if (i < contentArr.length) {
                return;
            }
            int i2 = ((this.OLrzqt * 3) / 2) + 1;
            if (i2 >= i) {
                i = i2;
            }
            this.KWHzl = (Content[]) C59867zpD.copydefault(contentArr, i);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Content get(int i) {
        KWHzl(i, true);
        return this.KWHzl[i];
    }

    public <E extends Content> java.util.List<E> KWHzl(org.jdom2.filter.Filter<E> filter) {
        return new Application(filter);
    }

    public int AYXKKw() {
        if (this.KWHzl == null) {
            return -1;
        }
        for (int i = 0; i < this.OLrzqt; i++) {
            if (this.KWHzl[i] instanceof Element) {
                return i;
            }
        }
        return -1;
    }

    public int copydefault() {
        if (this.KWHzl == null) {
            return -1;
        }
        for (int i = 0; i < this.OLrzqt; i++) {
            if (this.KWHzl[i] instanceof DocType) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Content remove(int i) {
        KWHzl(i, true);
        Content content = this.KWHzl[i];
        copydefault(content);
        Content[] contentArr = this.KWHzl;
        java.lang.System.arraycopy(contentArr, i + 1, contentArr, i, (this.OLrzqt - i) - 1);
        Content[] contentArr2 = this.KWHzl;
        int i2 = this.OLrzqt - 1;
        this.OLrzqt = i2;
        contentArr2[i2] = null;
        AEQbTJ();
        return content;
    }

    public static void copydefault(Content content) {
        content.setParent(null);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public Content set(int i, Content content) {
        AEQbTJ(content, i, true);
        this.copydefault.canContainContent(content, i, true);
        Content content2 = this.KWHzl[i];
        copydefault(content2);
        content.setParent(this.copydefault);
        this.KWHzl[i] = content;
        KWHzl();
        return content2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<Content> iterator() {
        return new ActionBar();
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<Content> listIterator() {
        return new StateListAnimator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<Content> listIterator(int i) {
        return new StateListAnimator(i);
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
        return super.toString();
    }

    public final void copydefault(int[] iArr) {
        int[] iArrKWHzl = C59867zpD.KWHzl(iArr, iArr.length);
        java.util.Arrays.sort(iArrKWHzl);
        int length = iArrKWHzl.length;
        Content[] contentArr = new Content[length];
        for (int i = 0; i < length; i++) {
            contentArr[i] = this.KWHzl[iArr[i]];
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.KWHzl[iArrKWHzl[i2]] = contentArr[i2];
        }
    }

    public final int EZpvd(int[] iArr, int i, int i2, java.util.Comparator<? super Content> comparator) {
        int i3 = i - 1;
        Content content = this.KWHzl[i2];
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int iCompare = comparator.compare(content, this.KWHzl[iArr[i5]]);
            if (iCompare == 0) {
                while (iCompare == 0 && i5 < i3) {
                    int i6 = i5 + 1;
                    if (comparator.compare(content, this.KWHzl[iArr[i6]]) != 0) {
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

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super Content> comparator) {
        int i = this.OLrzqt;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iEZpvd = EZpvd(iArr, i2, i2, comparator);
            if (iEZpvd < i2) {
                java.lang.System.arraycopy(iArr, iEZpvd, iArr, iEZpvd + 1, i2 - iEZpvd);
            }
            iArr[iEZpvd] = i2;
        }
        copydefault(iArr);
    }

    /* JADX INFO: renamed from: o.zpz$ActionBar */
    public final class ActionBar implements java.util.Iterator<Content> {
        public boolean AEQbTJ;
        public int EZpvd;
        public int OLrzqt;

        public ActionBar() {
            this.OLrzqt = -1;
            this.EZpvd = 0;
            this.AEQbTJ = false;
            this.OLrzqt = C59906zpz.this.EZpvd();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd < C59906zpz.this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Content next() {
            if (C59906zpz.this.EZpvd() == this.OLrzqt) {
                if (this.EZpvd < C59906zpz.this.OLrzqt) {
                    this.AEQbTJ = true;
                    Content[] contentArr = C59906zpz.this.KWHzl;
                    int i = this.EZpvd;
                    this.EZpvd = i + 1;
                    return contentArr[i];
                }
                throw new NoSuchElementException("Iterated beyond the end of the ContentList.");
            }
            throw new ConcurrentModificationException("ContentList was modified outside of this Iterator");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (C59906zpz.this.EZpvd() != this.OLrzqt) {
                throw new ConcurrentModificationException("ContentList was modified outside of this Iterator");
            }
            if (!this.AEQbTJ) {
                throw new java.lang.IllegalStateException("Can only remove() content after a call to next()");
            }
            this.AEQbTJ = false;
            C59906zpz c59906zpz = C59906zpz.this;
            int i = this.EZpvd - 1;
            this.EZpvd = i;
            c59906zpz.remove(i);
            this.OLrzqt = C59906zpz.this.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.zpz$StateListAnimator */
    public final class StateListAnimator implements java.util.ListIterator<Content> {
        public int KWHzl;
        public int OLrzqt;
        public boolean copydefault;
        public boolean AEQbTJ = false;
        public boolean EZpvd = false;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return (this.copydefault ? this.KWHzl : this.KWHzl - 1) >= 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.copydefault ? this.KWHzl + 1 : this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.copydefault ? this.KWHzl : this.KWHzl - 1;
        }

        public StateListAnimator(int i) {
            this.copydefault = false;
            this.OLrzqt = -1;
            this.KWHzl = -1;
            this.OLrzqt = C59906zpz.this.EZpvd();
            this.copydefault = false;
            C59906zpz.this.KWHzl(i, false);
            this.KWHzl = i;
        }

        public final void OLrzqt() {
            if (this.OLrzqt != C59906zpz.this.EZpvd()) {
                throw new ConcurrentModificationException("The ContentList supporting this iterator has been modified bysomething other than this Iterator.");
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return (this.copydefault ? this.KWHzl + 1 : this.KWHzl) < C59906zpz.this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public Content next() {
            OLrzqt();
            int i = this.copydefault ? this.KWHzl + 1 : this.KWHzl;
            if (i < C59906zpz.this.OLrzqt) {
                this.KWHzl = i;
                this.copydefault = true;
                this.AEQbTJ = true;
                this.EZpvd = true;
                return C59906zpz.this.KWHzl[this.KWHzl];
            }
            throw new NoSuchElementException("next() is beyond the end of the Iterator");
        }

        /* JADX DEBUG: Method merged with bridge method: previous()Ljava/lang/Object; */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Content previous() {
            OLrzqt();
            int i = this.copydefault ? this.KWHzl : this.KWHzl - 1;
            if (i >= 0) {
                this.KWHzl = i;
                this.copydefault = false;
                this.AEQbTJ = true;
                this.EZpvd = true;
                return C59906zpz.this.KWHzl[this.KWHzl];
            }
            throw new NoSuchElementException("previous() is beyond the beginning of the Iterator");
        }

        /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)V */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void add(Content content) {
            OLrzqt();
            int i = this.copydefault ? this.KWHzl + 1 : this.KWHzl;
            C59906zpz.this.add(i, content);
            this.OLrzqt = C59906zpz.this.EZpvd();
            this.EZpvd = false;
            this.AEQbTJ = false;
            this.KWHzl = i;
            this.copydefault = true;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            OLrzqt();
            if (!this.AEQbTJ) {
                throw new java.lang.IllegalStateException("Can not remove an element unless either next() or previous() has been called since the last remove()");
            }
            C59906zpz.this.remove(this.KWHzl);
            this.copydefault = false;
            this.OLrzqt = C59906zpz.this.EZpvd();
            this.AEQbTJ = false;
            this.EZpvd = false;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;)V */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void set(Content content) {
            OLrzqt();
            if (!this.EZpvd) {
                throw new java.lang.IllegalStateException("Can not set an element unless either next() or previous() has been called since the last remove() or set()");
            }
            C59906zpz.this.set(this.KWHzl, content);
            this.OLrzqt = C59906zpz.this.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.zpz$Application */
    public class Application<F extends Content> extends java.util.AbstractList<F> {
        public final org.jdom2.filter.Filter<F> EZpvd;
        public int[] KWHzl;
        public int copydefault = 0;
        public int OLrzqt = -1;

        public Application(org.jdom2.filter.Filter<F> filter) {
            this.KWHzl = new int[C59906zpz.this.OLrzqt + 4];
            this.EZpvd = filter;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return copydefault(0) == C59906zpz.this.OLrzqt;
        }

        public final int copydefault(int i) {
            if (this.OLrzqt != C59906zpz.this.OLrzqt()) {
                this.OLrzqt = C59906zpz.this.OLrzqt();
                this.copydefault = 0;
                if (C59906zpz.this.OLrzqt >= this.KWHzl.length) {
                    this.KWHzl = new int[C59906zpz.this.OLrzqt + 1];
                }
            }
            if (i >= 0 && i < this.copydefault) {
                return this.KWHzl[i];
            }
            int i2 = this.copydefault;
            for (int i3 = i2 > 0 ? this.KWHzl[i2 - 1] + 1 : 0; i3 < C59906zpz.this.OLrzqt; i3++) {
                if (this.EZpvd.filter(C59906zpz.this.KWHzl[i3]) != null) {
                    int[] iArr = this.KWHzl;
                    int i4 = this.copydefault;
                    iArr[i4] = i3;
                    this.copydefault = i4 + 1;
                    if (i4 == i) {
                        return i3;
                    }
                }
            }
            return C59906zpz.this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: add(ILjava/lang/Object;)V */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void add(int i, Content content) {
            if (i < 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            int iCopydefault = copydefault(i);
            if (iCopydefault == C59906zpz.this.OLrzqt && i > size()) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            if (this.EZpvd.matches(content)) {
                C59906zpz.this.add(iCopydefault, content);
                if (this.KWHzl.length <= C59906zpz.this.OLrzqt) {
                    int[] iArr = this.KWHzl;
                    this.KWHzl = C59867zpD.KWHzl(iArr, iArr.length + 1);
                }
                this.KWHzl[i] = iCopydefault;
                this.copydefault = i + 1;
                this.OLrzqt = C59906zpz.this.OLrzqt();
                return;
            }
            throw new IllegalAddException("Filter won't allow the " + content.getClass().getName() + " '" + content + "' to be added to the list");
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, java.util.Collection<? extends F> collection) {
            if (collection == null) {
                throw new java.lang.NullPointerException("Cannot add a null collection");
            }
            if (i < 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            int iCopydefault = copydefault(i);
            if (iCopydefault == C59906zpz.this.OLrzqt && i > size()) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            int size = collection.size();
            int i2 = 0;
            if (size == 0) {
                return false;
            }
            C59906zpz c59906zpz = C59906zpz.this;
            c59906zpz.copydefault(c59906zpz.size() + size);
            int iEZpvd = C59906zpz.this.EZpvd();
            int iOLrzqt = C59906zpz.this.OLrzqt();
            try {
                for (F f : collection) {
                    if (f == null) {
                        throw new java.lang.NullPointerException("Cannot add null content");
                    }
                    if (this.EZpvd.matches(f)) {
                        int i3 = iCopydefault + i2;
                        C59906zpz.this.add(i3, f);
                        if (this.KWHzl.length <= C59906zpz.this.OLrzqt) {
                            int[] iArr = this.KWHzl;
                            this.KWHzl = C59867zpD.KWHzl(iArr, iArr.length + size);
                        }
                        int i4 = i + i2;
                        this.KWHzl[i4] = i3;
                        this.copydefault = i4 + 1;
                        this.OLrzqt = C59906zpz.this.OLrzqt();
                        i2++;
                    } else {
                        throw new IllegalAddException("Filter won't allow the " + f.getClass().getName() + " '" + f + "' to be added to the list");
                    }
                }
                return true;
            } catch (java.lang.Throwable th) {
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        C59906zpz.this.OLrzqt(iEZpvd, iOLrzqt);
                        this.copydefault = i;
                        this.OLrzqt = iEZpvd;
                        throw th;
                    }
                    C59906zpz.this.remove(iCopydefault + i2);
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public F get(int i) {
            if (i < 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            int iCopydefault = copydefault(i);
            if (iCopydefault == C59906zpz.this.OLrzqt) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            return this.EZpvd.filter(C59906zpz.this.get(iCopydefault));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<F> iterator() {
            return C59906zpz.this.new Activity(this, 0);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<F> listIterator() {
            return C59906zpz.this.new Activity(this, 0);
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<F> listIterator(int i) {
            return C59906zpz.this.new Activity(this, i);
        }

        /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public F remove(int i) {
            if (i < 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            int iCopydefault = copydefault(i);
            if (iCopydefault == C59906zpz.this.OLrzqt) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            Content contentRemove = C59906zpz.this.remove(iCopydefault);
            this.copydefault = i;
            this.OLrzqt = C59906zpz.this.OLrzqt();
            return this.EZpvd.filter(contentRemove);
        }

        /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public F set(int i, F f) {
            if (i < 0) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            int iCopydefault = copydefault(i);
            if (iCopydefault == C59906zpz.this.OLrzqt) {
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + size());
            }
            F fFilter = this.EZpvd.filter(f);
            if (fFilter != null) {
                F fFilter2 = this.EZpvd.filter(C59906zpz.this.set(iCopydefault, fFilter));
                this.OLrzqt = C59906zpz.this.OLrzqt();
                return fFilter2;
            }
            throw new IllegalAddException("Filter won't allow index " + i + " to be set to " + f.getClass().getName());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            copydefault(-1);
            return this.copydefault;
        }

        public final int OLrzqt(int[] iArr, int i, int i2, java.util.Comparator<? super F> comparator) {
            int i3 = i - 1;
            Content content = C59906zpz.this.KWHzl[this.KWHzl[i2]];
            int i4 = 0;
            while (i4 <= i3) {
                int i5 = (i4 + i3) >>> 1;
                int iCompare = comparator.compare(content, C59906zpz.this.KWHzl[iArr[i5]]);
                if (iCompare == 0) {
                    while (iCompare == 0 && i5 < i3) {
                        int i6 = i5 + 1;
                        if (comparator.compare(content, C59906zpz.this.KWHzl[iArr[i6]]) != 0) {
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

        @Override // java.util.List
        public final void sort(java.util.Comparator<? super F> comparator) {
            int size = size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                int iOLrzqt = OLrzqt(iArr, i, i, comparator);
                if (iOLrzqt < i) {
                    java.lang.System.arraycopy(iArr, iOLrzqt, iArr, iOLrzqt + 1, i - iOLrzqt);
                }
                iArr[iOLrzqt] = this.KWHzl[i];
            }
            C59906zpz.this.copydefault(iArr);
        }
    }

    /* JADX INFO: renamed from: o.zpz$Activity */
    public final class Activity<F extends Content> implements java.util.ListIterator<F> {
        public int AEQbTJ;
        public int EZpvd;
        public final Application<F> OLrzqt;
        public boolean valueOf;
        public boolean copydefault = false;
        public boolean KWHzl = false;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return (this.valueOf ? this.EZpvd : this.EZpvd - 1) >= 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.valueOf ? this.EZpvd + 1 : this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.valueOf ? this.EZpvd : this.EZpvd - 1;
        }

        public Activity(Application<F> application, int i) {
            this.valueOf = false;
            this.AEQbTJ = -1;
            this.EZpvd = -1;
            this.OLrzqt = application;
            this.AEQbTJ = C59906zpz.this.EZpvd();
            this.valueOf = false;
            if (i >= 0) {
                if (application.copydefault(i) != C59906zpz.this.OLrzqt || i <= application.size()) {
                    this.EZpvd = i;
                    return;
                }
                throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + application.size());
            }
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + " Size: " + application.size());
        }

        public final void copydefault() {
            if (this.AEQbTJ != C59906zpz.this.EZpvd()) {
                throw new ConcurrentModificationException("The ContentList supporting the FilterList this iterator is processing has been modified by something other than this Iterator.");
            }
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt.copydefault(this.valueOf ? this.EZpvd + 1 : this.EZpvd) < C59906zpz.this.OLrzqt;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public F next() {
            copydefault();
            int i = this.valueOf ? this.EZpvd + 1 : this.EZpvd;
            if (this.OLrzqt.copydefault(i) >= C59906zpz.this.OLrzqt) {
                throw new NoSuchElementException("next() is beyond the end of the Iterator");
            }
            this.EZpvd = i;
            this.valueOf = true;
            this.copydefault = true;
            this.KWHzl = true;
            return (F) this.OLrzqt.get(i);
        }

        /* JADX DEBUG: Method merged with bridge method: previous()Ljava/lang/Object; */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public F previous() {
            copydefault();
            int i = this.valueOf ? this.EZpvd : this.EZpvd - 1;
            if (i < 0) {
                throw new NoSuchElementException("previous() is beyond the beginning of the Iterator");
            }
            this.EZpvd = i;
            this.valueOf = false;
            this.copydefault = true;
            this.KWHzl = true;
            return (F) this.OLrzqt.get(i);
        }

        /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)V */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void add(Content content) {
            copydefault();
            int i = this.valueOf ? this.EZpvd + 1 : this.EZpvd;
            this.OLrzqt.add(i, content);
            this.AEQbTJ = C59906zpz.this.EZpvd();
            this.KWHzl = false;
            this.copydefault = false;
            this.EZpvd = i;
            this.valueOf = true;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            copydefault();
            if (!this.copydefault) {
                throw new java.lang.IllegalStateException("Can not remove an element unless either next() or previous() has been called since the last remove()");
            }
            this.OLrzqt.remove(this.EZpvd);
            this.valueOf = false;
            this.AEQbTJ = C59906zpz.this.EZpvd();
            this.copydefault = false;
            this.KWHzl = false;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;)V */
        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void set(F f) {
            copydefault();
            if (!this.KWHzl) {
                throw new java.lang.IllegalStateException("Can not set an element unless either next() or previous() has been called since the last remove() or set()");
            }
            this.OLrzqt.set(this.EZpvd, f);
            this.AEQbTJ = C59906zpz.this.EZpvd();
        }
    }
}
