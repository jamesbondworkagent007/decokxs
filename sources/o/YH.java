package o;

import java.util.Deque;
import java.util.NoSuchElementException;
import o.YE;

/* JADX INFO: loaded from: classes21.dex */
public final class YH<E extends YE<E>> extends java.util.AbstractCollection<E> implements Deque<E> {
    public E KWHzl;
    public E copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: peekLast()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public E peekLast() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: peekFirst()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public E peekFirst() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.copydefault == null;
    }

    public void EZpvd(E e) {
        E e2 = this.copydefault;
        this.copydefault = e;
        if (e2 == null) {
            this.KWHzl = e;
        } else {
            e2.setPrevious(e);
            e.setNext(e2);
        }
    }

    public void gEmmrt(E e) {
        E e2 = this.KWHzl;
        this.KWHzl = e;
        if (e2 == null) {
            this.copydefault = e;
        } else {
            e2.setNext(e);
            e.setPrevious(e2);
        }
    }

    public E isConnected() {
        E e = this.copydefault;
        E e2 = (E) e.getNext();
        e.setNext(null);
        this.copydefault = e2;
        if (e2 == null) {
            this.KWHzl = null;
        } else {
            e2.setPrevious(null);
        }
        return e;
    }

    public E fJNWhG() {
        E e = this.KWHzl;
        E e2 = (E) e.getPrevious();
        e.setPrevious(null);
        this.KWHzl = e2;
        if (e2 == null) {
            this.copydefault = null;
        } else {
            e2.setNext(null);
        }
        return e;
    }

    public void DbNXlk(E e) {
        E e2 = (E) e.getPrevious();
        E e3 = (E) e.getNext();
        if (e2 == null) {
            this.copydefault = e3;
        } else {
            e2.setNext(e3);
            e.setPrevious(null);
        }
        if (e3 == null) {
            this.KWHzl = e2;
        } else {
            e3.setPrevious(e2);
            e.setNext(null);
        }
    }

    public void KWHzl() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public int size() {
        int i = 0;
        for (YE next = this.copydefault; next != null; next = next.getNext()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        YE ye = this.copydefault;
        while (ye != null) {
            YE next = ye.getNext();
            ye.setPrevious(null);
            ye.setNext(null);
            ye = next;
        }
        this.KWHzl = null;
        this.copydefault = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean contains(java.lang.Object obj) {
        return (obj instanceof YE) && OLrzqt((YE) obj);
    }

    public boolean OLrzqt(YE<?> ye) {
        return (ye.getPrevious() == null && ye.getNext() == null && ye != this.copydefault) ? false : true;
    }

    public void AhwBna(E e) {
        if (e != this.KWHzl) {
            DbNXlk(e);
            gEmmrt(e);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: peek()Ljava/lang/Object; */
    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public E peek() {
        return (E) peekFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: getFirst()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public E getFirst() {
        KWHzl();
        return (E) peekFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: getLast()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public E getLast() {
        KWHzl();
        return (E) peekLast();
    }

    /* JADX DEBUG: Method merged with bridge method: element()Ljava/lang/Object; */
    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public E element() {
        return (E) getFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: offer(Ljava/lang/Object;)Z */
    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public boolean offer(E e) {
        return offerLast(e);
    }

    /* JADX DEBUG: Method merged with bridge method: offerFirst(Ljava/lang/Object;)Z */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public boolean offerFirst(E e) {
        if (OLrzqt(e)) {
            return false;
        }
        EZpvd(e);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: offerLast(Ljava/lang/Object;)Z */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public boolean offerLast(E e) {
        if (OLrzqt(e)) {
            return false;
        }
        gEmmrt(e);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean add(E e) {
        return offerLast(e);
    }

    /* JADX DEBUG: Method merged with bridge method: addFirst(Ljava/lang/Object;)V */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void addFirst(E e) {
        if (!offerFirst(e)) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: addLast(Ljava/lang/Object;)V */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void addLast(E e) {
        if (!offerLast(e)) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: poll()Ljava/lang/Object; */
    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public E poll() {
        return (E) pollFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: pollFirst()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public E pollFirst() {
        if (isEmpty()) {
            return null;
        }
        return (E) isConnected();
    }

    /* JADX DEBUG: Method merged with bridge method: pollLast()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: AhwBna, reason: merged with bridge method [inline-methods] */
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) fJNWhG();
    }

    /* JADX DEBUG: Method merged with bridge method: remove()Ljava/lang/Object; */
    @Override // java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] */
    public E remove() {
        return (E) removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean remove(java.lang.Object obj) {
        return (obj instanceof YE) && fetchVPNInfo((YE) obj);
    }

    public boolean fetchVPNInfo(E e) {
        if (!OLrzqt(e)) {
            return false;
        }
        DbNXlk(e);
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: removeFirst()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public E removeFirst() {
        KWHzl();
        return (E) pollFirst();
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(java.lang.Object obj) {
        return remove(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: removeLast()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public E removeLast() {
        KWHzl();
        return (E) pollLast();
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(java.lang.Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    /* JADX DEBUG: Method merged with bridge method: push(Ljava/lang/Object;)V */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public void push(E e) {
        addFirst(e);
    }

    /* JADX DEBUG: Method merged with bridge method: pop()Ljava/lang/Object; */
    @Override // java.util.Deque
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public E pop() {
        return (E) removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public java.util.Iterator<E> iterator() {
        return new YH<E>.ActionBar(this.copydefault) { // from class: o.YH.4
            @Override // o.YH.ActionBar
            public E KWHzl() {
                return (E) this.KWHzl.getNext();
            }
        };
    }

    @Override // java.util.Deque
    public java.util.Iterator<E> descendingIterator() {
        return new YH<E>.ActionBar(this.KWHzl) { // from class: o.YH.5
            @Override // o.YH.ActionBar
            public E KWHzl() {
                return (E) this.KWHzl.getPrevious();
            }
        };
    }

    public abstract class ActionBar implements java.util.Iterator<E> {
        public E KWHzl;

        public abstract E KWHzl();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.KWHzl != null;
        }

        public ActionBar(E e) {
            this.KWHzl = e;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E e = this.KWHzl;
            this.KWHzl = (E) KWHzl();
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
