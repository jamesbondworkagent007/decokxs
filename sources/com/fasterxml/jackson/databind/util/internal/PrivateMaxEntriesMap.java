package com.fasterxml.jackson.databind.util.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.YE;
import o.YH;

/* JADX INFO: loaded from: classes21.dex */
public final class PrivateMaxEntriesMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final long MAXIMUM_CAPACITY = 9223372034707292160L;
    static final int NCPU;
    static final int NUMBER_OF_READ_BUFFERS;
    static final int READ_BUFFERS_MASK;
    static final int READ_BUFFER_DRAIN_THRESHOLD = 8;
    static final int READ_BUFFER_INDEX_MASK = 15;
    static final int READ_BUFFER_SIZE = 16;
    static final int READ_BUFFER_THRESHOLD = 4;
    static final int WRITE_BUFFER_DRAIN_THRESHOLD = 16;
    static final long serialVersionUID = 1;
    final AtomicLong capacity;
    final int concurrencyLevel;
    final ConcurrentMap<K, Node<K, V>> data;
    final AtomicReference<DrainStatus> drainStatus;
    transient Set<Map.Entry<K, V>> entrySet;
    final YH<Node<K, V>> evictionDeque;
    final Lock evictionLock;
    transient Set<K> keySet;
    final AtomicLongArray readBufferDrainAtWriteCount;
    final long[] readBufferReadCount;
    final AtomicLongArray readBufferWriteCount;
    final AtomicReferenceArray<Node<K, V>> readBuffers;
    transient Collection<V> values;
    final AtomicLong weightedSize;
    final Queue<Runnable> writeBuffer;

    public enum DrainStatus {
        IDLE { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.1
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z) {
                return !z;
            }
        },
        REQUIRED { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.2
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z) {
                return true;
            }
        },
        PROCESSING { // from class: com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus.3
            @Override // com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap.DrainStatus
            public boolean shouldDrainBuffers(boolean z) {
                return false;
            }
        };

        public abstract boolean shouldDrainBuffers(boolean z);
    }

    private static int readBufferIndex(int i, int i2) {
        return (i * 16) + i2;
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        NCPU = iAvailableProcessors;
        int iMin = Math.min(4, ceilingNextPowerOfTwo(iAvailableProcessors));
        NUMBER_OF_READ_BUFFERS = iMin;
        READ_BUFFERS_MASK = iMin - 1;
    }

    public static int ceilingNextPowerOfTwo(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    private PrivateMaxEntriesMap(TaskDescription<K, V> taskDescription) {
        int i = taskDescription.KWHzl;
        this.concurrencyLevel = i;
        this.capacity = new AtomicLong(Math.min(taskDescription.OLrzqt, MAXIMUM_CAPACITY));
        this.data = new ConcurrentHashMap(taskDescription.AEQbTJ, 0.75f, i);
        this.evictionLock = new ReentrantLock();
        this.weightedSize = new AtomicLong();
        this.evictionDeque = new YH<>();
        this.writeBuffer = new ConcurrentLinkedQueue();
        this.drainStatus = new AtomicReference<>(DrainStatus.IDLE);
        int i2 = NUMBER_OF_READ_BUFFERS;
        this.readBufferReadCount = new long[i2];
        this.readBufferWriteCount = new AtomicLongArray(i2);
        this.readBufferDrainAtWriteCount = new AtomicLongArray(i2);
        this.readBuffers = new AtomicReferenceArray<>(i2 * 16);
    }

    public static void checkNotNull(Object obj) {
        obj.getClass();
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public long capacity() {
        return this.capacity.get();
    }

    public void setCapacity(long j) {
        checkArgument(j >= 0);
        this.evictionLock.lock();
        try {
            this.capacity.lazySet(Math.min(j, MAXIMUM_CAPACITY));
            drainBuffers();
            evict();
        } finally {
            this.evictionLock.unlock();
        }
    }

    public boolean hasOverflowed() {
        return this.weightedSize.get() > this.capacity.get();
    }

    public void evict() {
        Node<K, V> node;
        while (hasOverflowed() && (node = (Node) this.evictionDeque.poll()) != null) {
            this.data.remove(node.key, node);
            makeDead(node);
        }
    }

    public void afterRead(Node<K, V> node) {
        int bufferIndex = readBufferIndex();
        drainOnReadIfNeeded(bufferIndex, recordRead(bufferIndex, node));
    }

    public static int readBufferIndex() {
        return ((int) Thread.currentThread().getId()) & READ_BUFFERS_MASK;
    }

    public long recordRead(int i, Node<K, V> node) {
        long j = this.readBufferWriteCount.get(i);
        this.readBufferWriteCount.lazySet(i, 1 + j);
        this.readBuffers.lazySet(readBufferIndex(i, (int) (15 & j)), node);
        return j;
    }

    public void drainOnReadIfNeeded(int i, long j) {
        if (this.drainStatus.get().shouldDrainBuffers(j - this.readBufferDrainAtWriteCount.get(i) < 4)) {
            tryToDrainBuffers();
        }
    }

    public void afterWrite(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(DrainStatus.REQUIRED);
        tryToDrainBuffers();
    }

    public void tryToDrainBuffers() {
        if (this.evictionLock.tryLock()) {
            try {
                AtomicReference<DrainStatus> atomicReference = this.drainStatus;
                DrainStatus drainStatus = DrainStatus.PROCESSING;
                atomicReference.lazySet(drainStatus);
                drainBuffers();
                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.drainStatus, drainStatus, DrainStatus.IDLE);
                this.evictionLock.unlock();
            } catch (Throwable th) {
                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.drainStatus, DrainStatus.PROCESSING, DrainStatus.IDLE);
                this.evictionLock.unlock();
                throw th;
            }
        }
    }

    public void drainBuffers() {
        drainReadBuffers();
        drainWriteBuffer();
    }

    public void drainReadBuffers() {
        int id = (int) Thread.currentThread().getId();
        int i = NUMBER_OF_READ_BUFFERS;
        for (int i2 = id; i2 < i + id; i2++) {
            drainReadBuffer(READ_BUFFERS_MASK & i2);
        }
    }

    public void drainReadBuffer(int i) {
        int bufferIndex;
        Node<K, V> node;
        long j = this.readBufferWriteCount.get(i);
        for (int i2 = 0; i2 < 8 && (node = this.readBuffers.get((bufferIndex = readBufferIndex(i, (int) (this.readBufferReadCount[i] & 15))))) != null; i2++) {
            this.readBuffers.lazySet(bufferIndex, null);
            applyRead(node);
            long[] jArr = this.readBufferReadCount;
            jArr[i] = jArr[i] + 1;
        }
        this.readBufferDrainAtWriteCount.lazySet(i, j);
    }

    public void applyRead(Node<K, V> node) {
        if (this.evictionDeque.OLrzqt(node)) {
            this.evictionDeque.AhwBna(node);
        }
    }

    public void drainWriteBuffer() {
        Runnable runnablePoll;
        for (int i = 0; i < 16 && (runnablePoll = this.writeBuffer.poll()) != null; i++) {
            runnablePoll.run();
        }
    }

    public boolean tryToRetire(Node<K, V> node, SharedElementCallback<V> sharedElementCallback) {
        if (sharedElementCallback.copydefault()) {
            return node.compareAndSet(sharedElementCallback, new SharedElementCallback(sharedElementCallback.OLrzqt, -sharedElementCallback.KWHzl));
        }
        return false;
    }

    public void makeRetired(Node<K, V> node) {
        SharedElementCallback sharedElementCallback;
        do {
            sharedElementCallback = (SharedElementCallback) node.get();
            if (!sharedElementCallback.copydefault()) {
                return;
            }
        } while (!node.compareAndSet(sharedElementCallback, new SharedElementCallback(sharedElementCallback.OLrzqt, -sharedElementCallback.KWHzl)));
    }

    public void makeDead(Node<K, V> node) {
        SharedElementCallback sharedElementCallback;
        do {
            sharedElementCallback = (SharedElementCallback) node.get();
        } while (!node.compareAndSet(sharedElementCallback, new SharedElementCallback(sharedElementCallback.OLrzqt, 0)));
        AtomicLong atomicLong = this.weightedSize;
        atomicLong.lazySet(atomicLong.get() - ((long) Math.abs(sharedElementCallback.KWHzl)));
    }

    public final class StateListAnimator implements Runnable {
        public final Node<K, V> EZpvd;
        public final int OLrzqt;

        public StateListAnimator(Node<K, V> node, int i) {
            this.OLrzqt = i;
            this.EZpvd = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = PrivateMaxEntriesMap.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + ((long) this.OLrzqt));
            if (((SharedElementCallback) this.EZpvd.get()).copydefault()) {
                PrivateMaxEntriesMap.this.evictionDeque.add(this.EZpvd);
                PrivateMaxEntriesMap.this.evict();
            }
        }
    }

    public final class PendingIntent implements Runnable {
        public final Node<K, V> EZpvd;

        public PendingIntent(Node<K, V> node) {
            this.EZpvd = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            PrivateMaxEntriesMap.this.evictionDeque.fetchVPNInfo(this.EZpvd);
            PrivateMaxEntriesMap.this.makeDead(this.EZpvd);
        }
    }

    public final class FragmentManager implements Runnable {
        public final Node<K, V> AEQbTJ;
        public final int OLrzqt;

        public FragmentManager(Node<K, V> node, int i) {
            this.OLrzqt = i;
            this.AEQbTJ = node;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = PrivateMaxEntriesMap.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + ((long) this.OLrzqt));
            PrivateMaxEntriesMap.this.applyRead(this.AEQbTJ);
            PrivateMaxEntriesMap.this.evict();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.data.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.evictionLock.lock();
        while (true) {
            try {
                Node<K, V> node = (Node) this.evictionDeque.poll();
                if (node == null) {
                    break;
                }
                this.data.remove(node.key, node);
                makeDead(node);
            } finally {
                this.evictionLock.unlock();
            }
        }
        for (int i = 0; i < this.readBuffers.length(); i++) {
            this.readBuffers.lazySet(i, null);
        }
        while (true) {
            Runnable runnablePoll = this.writeBuffer.poll();
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        checkNotNull(obj);
        Iterator<Node<K, V>> it = this.data.values().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Node<K, V> node = this.data.get(obj);
        if (node == null) {
            return null;
        }
        afterRead(node);
        return node.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        return put(k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        return put(k, v, true);
    }

    public V put(K k, V v, boolean z) {
        SharedElementCallback sharedElementCallback;
        checkNotNull(k);
        checkNotNull(v);
        SharedElementCallback sharedElementCallback2 = new SharedElementCallback(v, 1);
        Node<K, V> node = new Node<>(k, sharedElementCallback2);
        while (true) {
            Node<K, V> nodePutIfAbsent = this.data.putIfAbsent(node.key, node);
            if (nodePutIfAbsent == null) {
                afterWrite(new StateListAnimator(node, 1));
                return null;
            }
            if (z) {
                afterRead(nodePutIfAbsent);
                return nodePutIfAbsent.getValue();
            }
            do {
                sharedElementCallback = (SharedElementCallback) nodePutIfAbsent.get();
                if (!sharedElementCallback.copydefault()) {
                    break;
                }
            } while (!nodePutIfAbsent.compareAndSet(sharedElementCallback, sharedElementCallback2));
            int i = 1 - sharedElementCallback.KWHzl;
            if (i == 0) {
                afterRead(nodePutIfAbsent);
            } else {
                afterWrite(new FragmentManager(nodePutIfAbsent, i));
            }
            return sharedElementCallback.OLrzqt;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Node<K, V> nodeRemove = this.data.remove(obj);
        if (nodeRemove == null) {
            return null;
        }
        makeRetired(nodeRemove);
        afterWrite(new PendingIntent(nodeRemove));
        return nodeRemove.getValue();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        Node<K, V> node = this.data.get(obj);
        if (node == null || obj2 == null) {
            return false;
        }
        SharedElementCallback<V> sharedElementCallback = (SharedElementCallback) node.get();
        while (sharedElementCallback.copydefault(obj2)) {
            if (tryToRetire(node, sharedElementCallback)) {
                if (!this.data.remove(obj, node)) {
                    return false;
                }
                afterWrite(new PendingIntent(node));
                return true;
            }
            sharedElementCallback = (SharedElementCallback) node.get();
            if (!sharedElementCallback.copydefault()) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        SharedElementCallback sharedElementCallback;
        checkNotNull(k);
        checkNotNull(v);
        SharedElementCallback sharedElementCallback2 = new SharedElementCallback(v, 1);
        Node<K, V> node = this.data.get(k);
        if (node == null) {
            return null;
        }
        do {
            sharedElementCallback = (SharedElementCallback) node.get();
            if (!sharedElementCallback.copydefault()) {
                return null;
            }
        } while (!node.compareAndSet(sharedElementCallback, sharedElementCallback2));
        int i = 1 - sharedElementCallback.KWHzl;
        if (i == 0) {
            afterRead(node);
        } else {
            afterWrite(new FragmentManager(node, i));
        }
        return sharedElementCallback.OLrzqt;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        SharedElementCallback sharedElementCallback;
        checkNotNull(k);
        checkNotNull(v);
        checkNotNull(v2);
        SharedElementCallback sharedElementCallback2 = new SharedElementCallback(v2, 1);
        Node<K, V> node = this.data.get(k);
        if (node == null) {
            return false;
        }
        do {
            sharedElementCallback = (SharedElementCallback) node.get();
            if (!sharedElementCallback.copydefault() || !sharedElementCallback.copydefault(v)) {
                return false;
            }
        } while (!node.compareAndSet(sharedElementCallback, sharedElementCallback2));
        int i = 1 - sharedElementCallback.KWHzl;
        if (i == 0) {
            afterRead(node);
        } else {
            afterWrite(new FragmentManager(node, i));
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Dialog dialog = new Dialog();
        this.keySet = dialog;
        return dialog;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Fragment fragment = new Fragment();
        this.values = fragment;
        return fragment;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        ActionBar actionBar = new ActionBar();
        this.entrySet = actionBar;
        return actionBar;
    }

    public static final class SharedElementCallback<V> {
        public final int KWHzl;
        public final V OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault() {
            return this.KWHzl > 0;
        }

        public SharedElementCallback(V v, int i) {
            this.KWHzl = i;
            this.OLrzqt = v;
        }

        public boolean copydefault(Object obj) {
            V v = this.OLrzqt;
            return obj == v || v.equals(obj);
        }
    }

    public static final class Node<K, V> extends AtomicReference<SharedElementCallback<V>> implements YE<Node<K, V>> {
        final K key;
        Node<K, V> next;
        Node<K, V> prev;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getNext()Lo/YE; */
        @Override // o.YE
        public Node<K, V> getNext() {
            return this.next;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getPrevious()Lo/YE; */
        @Override // o.YE
        public Node<K, V> getPrevious() {
            return this.prev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: setNext(Lo/YE;)V */
        @Override // o.YE
        public void setNext(Node<K, V> node) {
            this.next = node;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: setPrevious(Lo/YE;)V */
        @Override // o.YE
        public void setPrevious(Node<K, V> node) {
            this.prev = node;
        }

        public Node(K k, SharedElementCallback<V> sharedElementCallback) {
            super(sharedElementCallback);
            this.key = k;
        }

        public V getValue() {
            return ((SharedElementCallback) get()).OLrzqt;
        }
    }

    public final class Dialog extends AbstractSet<K> {
        public final PrivateMaxEntriesMap<K, V> KWHzl;

        public Dialog() {
            this.KWHzl = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.KWHzl.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.KWHzl.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new Activity();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.KWHzl.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return this.KWHzl.data.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.KWHzl.data.keySet().toArray(tArr);
        }
    }

    public final class Activity implements Iterator<K> {
        public final Iterator<K> OLrzqt;
        public K copydefault;

        public Activity() {
            this.OLrzqt = PrivateMaxEntriesMap.this.data.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            K next = this.OLrzqt.next();
            this.copydefault = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.copydefault != null);
            PrivateMaxEntriesMap.this.remove(this.copydefault);
            this.copydefault = null;
        }
    }

    public final class Fragment extends AbstractCollection<V> {
        public Fragment() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return PrivateMaxEntriesMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            PrivateMaxEntriesMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new LoaderManager();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return PrivateMaxEntriesMap.this.containsValue(obj);
        }
    }

    public final class LoaderManager implements Iterator<V> {
        public Node<K, V> KWHzl;
        public final Iterator<Node<K, V>> OLrzqt;

        public LoaderManager() {
            this.OLrzqt = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            Node<K, V> next = this.OLrzqt.next();
            this.KWHzl = next;
            return next.getValue();
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.KWHzl != null);
            PrivateMaxEntriesMap.this.remove(this.KWHzl.key);
            this.KWHzl = null;
        }
    }

    public final class ActionBar extends AbstractSet<Map.Entry<K, V>> {
        public final PrivateMaxEntriesMap<K, V> AEQbTJ;

        public ActionBar() {
            this.AEQbTJ = PrivateMaxEntriesMap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.AEQbTJ.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.AEQbTJ.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new Application();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Node<K, V> node = this.AEQbTJ.data.get(entry.getKey());
            return node != null && node.getValue().equals(entry.getValue());
        }

        /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.AEQbTJ.remove(entry.getKey(), entry.getValue());
        }
    }

    public final class Application implements Iterator<Map.Entry<K, V>> {
        public final Iterator<Node<K, V>> OLrzqt;
        public Node<K, V> copydefault;

        public Application() {
            this.OLrzqt = PrivateMaxEntriesMap.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt.hasNext();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.copydefault = this.OLrzqt.next();
            return new WriteThroughEntry(this.copydefault);
        }

        @Override // java.util.Iterator
        public void remove() {
            PrivateMaxEntriesMap.checkState(this.copydefault != null);
            PrivateMaxEntriesMap.this.remove(this.copydefault.key);
            this.copydefault = null;
        }
    }

    public final class WriteThroughEntry extends AbstractMap.SimpleEntry<K, V> {
        static final long serialVersionUID = 1;

        public WriteThroughEntry(Node<K, V> node) {
            super(node.key, node.getValue());
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public V setValue(V v) {
            PrivateMaxEntriesMap.this.put(getKey(), v);
            return (V) super.setValue(v);
        }

        public Object writeReplace() {
            return new AbstractMap.SimpleEntry(this);
        }
    }

    public Object writeReplace() {
        return new SerializationProxy(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    public static final class SerializationProxy<K, V> implements Serializable {
        static final long serialVersionUID = 1;
        final long capacity;
        final int concurrencyLevel;
        final Map<K, V> data;

        public SerializationProxy(PrivateMaxEntriesMap<K, V> privateMaxEntriesMap) {
            this.concurrencyLevel = privateMaxEntriesMap.concurrencyLevel;
            this.data = new HashMap(privateMaxEntriesMap);
            this.capacity = privateMaxEntriesMap.capacity.get();
        }

        public Object readResolve() {
            PrivateMaxEntriesMap<K, V> privateMaxEntriesMapCopydefault = new TaskDescription().AEQbTJ(this.capacity).copydefault();
            privateMaxEntriesMapCopydefault.putAll(this.data);
            return privateMaxEntriesMapCopydefault;
        }
    }

    public static final class TaskDescription<K, V> {
        public long OLrzqt = -1;
        public int AEQbTJ = 16;
        public int KWHzl = 16;

        public TaskDescription<K, V> AEQbTJ(int i) {
            PrivateMaxEntriesMap.checkArgument(i >= 0);
            this.AEQbTJ = i;
            return this;
        }

        public TaskDescription<K, V> AEQbTJ(long j) {
            PrivateMaxEntriesMap.checkArgument(j >= 0);
            this.OLrzqt = j;
            return this;
        }

        public TaskDescription<K, V> KWHzl(int i) {
            PrivateMaxEntriesMap.checkArgument(i > 0);
            this.KWHzl = i;
            return this;
        }

        public PrivateMaxEntriesMap<K, V> copydefault() {
            PrivateMaxEntriesMap.checkState(this.OLrzqt >= 0);
            return new PrivateMaxEntriesMap<>(this);
        }
    }
}
