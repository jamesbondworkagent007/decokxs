package org.apache.http.impl.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.InterfaceC59601zkC;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.CookieIdentityComparator;

/* JADX INFO: loaded from: classes13.dex */
public class BasicCookieStore implements CookieStore, Serializable {
    private static final long serialVersionUID = -7581093305228232025L;
    private final TreeSet<InterfaceC59601zkC> cookies = new TreeSet<>(new CookieIdentityComparator());
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    @Override // org.apache.http.client.CookieStore
    public void addCookie(InterfaceC59601zkC interfaceC59601zkC) {
        if (interfaceC59601zkC != null) {
            this.lock.writeLock().lock();
            try {
                this.cookies.remove(interfaceC59601zkC);
                if (!interfaceC59601zkC.isExpired(new Date())) {
                    this.cookies.add(interfaceC59601zkC);
                }
            } finally {
                this.lock.writeLock().unlock();
            }
        }
    }

    public void addCookies(InterfaceC59601zkC[] interfaceC59601zkCArr) {
        if (interfaceC59601zkCArr != null) {
            for (InterfaceC59601zkC interfaceC59601zkC : interfaceC59601zkCArr) {
                addCookie(interfaceC59601zkC);
            }
        }
    }

    @Override // org.apache.http.client.CookieStore
    public List<InterfaceC59601zkC> getCookies() {
        this.lock.readLock().lock();
        try {
            return new ArrayList(this.cookies);
        } finally {
            this.lock.readLock().unlock();
        }
    }

    @Override // org.apache.http.client.CookieStore
    public boolean clearExpired(Date date) {
        boolean z = false;
        if (date == null) {
            return false;
        }
        this.lock.writeLock().lock();
        try {
            Iterator<InterfaceC59601zkC> it = this.cookies.iterator();
            while (it.hasNext()) {
                if (it.next().isExpired(date)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    @Override // org.apache.http.client.CookieStore
    public void clear() {
        this.lock.writeLock().lock();
        try {
            this.cookies.clear();
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public String toString() {
        this.lock.readLock().lock();
        try {
            return this.cookies.toString();
        } finally {
            this.lock.readLock().unlock();
        }
    }
}
