package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C59511ziS;

/* JADX INFO: loaded from: classes13.dex */
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private static final long serialVersionUID = -1546036869799732453L;
    private final ReferenceQueue queue = new ReferenceQueue();
    private int changeCount = 0;

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(new StateListAnimator(obj, (C59511ziS) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set entrySet() {
        purge();
        Set<Map.Entry> setEntrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : setEntrySet) {
            Object objCopydefault = ((StateListAnimator) entry.getKey()).copydefault();
            Object value = entry.getValue();
            if (objCopydefault != null) {
                hashSet.add(new TaskDescription(objCopydefault, value, null));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object get(Object obj) {
        return super.get(new StateListAnimator(obj, (C59511ziS) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        purge();
        return new C59511ziS(this, super.keys());
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set keySet() {
        purge();
        Set setKeySet = super.keySet();
        HashSet hashSet = new HashSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            Object objCopydefault = ((StateListAnimator) it.next()).copydefault();
            if (objCopydefault != null) {
                hashSet.add(objCopydefault);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this) {
            if (obj == null) {
                throw new NullPointerException("Null keys are not allowed");
            }
            if (obj2 == null) {
                throw new NullPointerException("Null values are not allowed");
            }
            int i = this.changeCount;
            int i2 = i + 1;
            this.changeCount = i2;
            if (i > 100) {
                purge();
                this.changeCount = 0;
            } else if (i2 % 10 == 0) {
                purgeOne();
            }
            objPut = super.put(new StateListAnimator(obj, this.queue, null), obj2);
        }
        return objPut;
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection values() {
        purge();
        return super.values();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object remove(Object obj) {
        Object objRemove;
        synchronized (this) {
            int i = this.changeCount;
            int i2 = i + 1;
            this.changeCount = i2;
            if (i > 100) {
                purge();
                this.changeCount = 0;
            } else if (i2 % 10 == 0) {
                purgeOne();
            }
            objRemove = super.remove(new StateListAnimator(obj, (C59511ziS) null));
        }
        return objRemove;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable
    public void rehash() {
        purge();
        super.rehash();
    }

    private void purge() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.queue) {
            while (true) {
                Application application = (Application) this.queue.poll();
                if (application == null) {
                    break;
                } else {
                    arrayList.add(application.KWHzl());
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.remove(arrayList.get(i));
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            Application application = (Application) this.queue.poll();
            if (application != null) {
                super.remove(application.KWHzl());
            }
        }
    }

    public static final class TaskDescription implements Map.Entry {
        public final Object OLrzqt;
        public final Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 java.lang.Object) A[MD:(java.lang.Object, java.lang.Object):void (m)] (LINE:353) call: org.apache.commons.logging.impl.WeakHashtable.TaskDescription.<init>(java.lang.Object, java.lang.Object):void type: THIS */
        public /* synthetic */ TaskDescription(Object obj, Object obj2, C59511ziS c59511ziS) {
            this(obj, obj2);
        }

        public TaskDescription(Object obj, Object obj2) {
            this.copydefault = obj;
            this.OLrzqt = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof Map.Entry)) {
                Map.Entry entry = (Map.Entry) obj;
                if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                    if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }
    }

    public static final class StateListAnimator {
        public final int EZpvd;
        public final WeakReference copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object), (r2v0 java.lang.ref.ReferenceQueue) A[MD:(java.lang.Object, java.lang.ref.ReferenceQueue):void (m)] (LINE:396) call: org.apache.commons.logging.impl.WeakHashtable.StateListAnimator.<init>(java.lang.Object, java.lang.ref.ReferenceQueue):void type: THIS */
        public /* synthetic */ StateListAnimator(Object obj, ReferenceQueue referenceQueue, C59511ziS c59511ziS) {
            this(obj, referenceQueue);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] (LINE:396) call: org.apache.commons.logging.impl.WeakHashtable.StateListAnimator.<init>(java.lang.Object):void type: THIS */
        public /* synthetic */ StateListAnimator(Object obj, C59511ziS c59511ziS) {
            this(obj);
        }

        public StateListAnimator(Object obj) {
            this.copydefault = new WeakReference(obj);
            this.EZpvd = obj.hashCode();
        }

        public StateListAnimator(Object obj, ReferenceQueue referenceQueue) {
            this.copydefault = new Application(obj, referenceQueue, this, null);
            this.EZpvd = obj.hashCode();
        }

        public final Object copydefault() {
            return this.copydefault.get();
        }

        public boolean equals(Object obj) {
            if (obj instanceof StateListAnimator) {
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                Object objCopydefault = copydefault();
                Object objCopydefault2 = stateListAnimator.copydefault();
                if (objCopydefault == null) {
                    if (objCopydefault2 == null && hashCode() == stateListAnimator.hashCode()) {
                        return true;
                    }
                } else {
                    return objCopydefault.equals(objCopydefault2);
                }
            }
            return false;
        }
    }

    public static final class Application extends WeakReference {
        public final StateListAnimator OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.Object)
  (r2v0 java.lang.ref.ReferenceQueue)
  (r3v0 org.apache.commons.logging.impl.WeakHashtable$StateListAnimator)
 A[MD:(java.lang.Object, java.lang.ref.ReferenceQueue, org.apache.commons.logging.impl.WeakHashtable$StateListAnimator):void (m)] (LINE:467) call: org.apache.commons.logging.impl.WeakHashtable.Application.<init>(java.lang.Object, java.lang.ref.ReferenceQueue, org.apache.commons.logging.impl.WeakHashtable$StateListAnimator):void type: THIS */
        public /* synthetic */ Application(Object obj, ReferenceQueue referenceQueue, StateListAnimator stateListAnimator, C59511ziS c59511ziS) {
            this(obj, referenceQueue, stateListAnimator);
        }

        public Application(Object obj, ReferenceQueue referenceQueue, StateListAnimator stateListAnimator) {
            super(obj, referenceQueue);
            this.OLrzqt = stateListAnimator;
        }
    }
}
