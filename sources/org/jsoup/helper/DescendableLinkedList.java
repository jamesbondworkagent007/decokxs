package org.jsoup.helper;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes20.dex */
public class DescendableLinkedList<E> extends LinkedList<E> {
    @Override // java.util.LinkedList, java.util.Deque
    public void push(E e) {
        addFirst(e);
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E peekLast() {
        if (size() == 0) {
            return null;
        }
        return getLast();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public E pollLast() {
        if (size() == 0) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.LinkedList, java.util.Deque
    public Iterator<E> descendingIterator() {
        return new TaskDescription(size());
    }

    public class TaskDescription<E> implements Iterator<E> {
        public final ListIterator<E> KWHzl;

        public TaskDescription(int i) {
            this.KWHzl = DescendableLinkedList.this.listIterator(i);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.KWHzl.hasPrevious();
        }

        @Override // java.util.Iterator
        public E next() {
            return this.KWHzl.previous();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.KWHzl.remove();
        }
    }
}
