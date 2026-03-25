package o;

import o.YE;

/* JADX INFO: loaded from: classes21.dex */
public interface YE<T extends YE<T>> {
    T getNext();

    T getPrevious();

    void setNext(T t);

    void setPrevious(T t);
}
