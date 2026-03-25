package com.sun.jna;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class WeakMemoryHolder {
    ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    IdentityHashMap<Reference<Object>, Memory> backingMap = new IdentityHashMap<>();

    public void put(Object obj, Memory memory) {
        synchronized (this) {
            clean();
            this.backingMap.put(new WeakReference(obj, this.referenceQueue), memory);
        }
    }

    public void clean() {
        synchronized (this) {
            ReferenceQueue<Object> referenceQueue = this.referenceQueue;
            while (true) {
                Reference<? extends Object> referencePoll = referenceQueue.poll();
                if (referencePoll != null) {
                    this.backingMap.remove(referencePoll);
                    referenceQueue = this.referenceQueue;
                }
            }
        }
    }
}
