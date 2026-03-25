package com.geetest.gtc4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f480a;
    public int b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n0(Object[] objArr) {
        this.f480a = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.f480a.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        Object[] objArr = this.f480a;
        if (i != objArr.length) {
            this.b = i + 1;
            return objArr[i];
        }
        throw new NoSuchElementException("Out of elements: " + this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove element from an Array.");
    }
}
