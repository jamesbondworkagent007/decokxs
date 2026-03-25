package o;

import java.util.Collections;
import java.util.EventListener;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.acj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7062acj extends AbstractC7058acf {
    public static final boolean djBIcL = C7060ach.AEQbTJ("service");
    public java.util.Map<java.lang.String, Activity> AYXKKw;
    public int AhwBna;
    public final C7057ace DbNXlk;
    public final java.lang.String fetchVPNInfo;
    public Application gEmmrt;
    public final java.util.List<TaskDescription> valueOf;
    public java.util.Map<java.lang.String, TaskDescription> values;

    /* JADX INFO: renamed from: o.acj$ActionBar */
    public interface ActionBar extends EventListener {
        void OLrzqt(C7062acj c7062acj);
    }

    /* JADX INFO: renamed from: o.acj$Application */
    public static class Application {
    }

    /* JADX INFO: renamed from: o.acj$TaskDescription */
    public interface TaskDescription {
        java.lang.Object AEQbTJ(StateListAnimator stateListAnimator, C7062acj c7062acj);

        void copydefault(java.util.Map<java.lang.String, TaskDescription> map);
    }

    public java.lang.Object EZpvd(StateListAnimator stateListAnimator, java.lang.String[] strArr) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt() {
        this.AYXKKw = null;
        this.values = null;
        this.gEmmrt = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void gEmmrt() {
        this.AYXKKw = null;
    }

    public C7062acj() {
        this.DbNXlk = new C7057ace();
        this.valueOf = new java.util.ArrayList();
        this.AhwBna = 0;
        this.fetchVPNInfo = "";
    }

    public C7062acj(java.lang.String str) {
        this.DbNXlk = new C7057ace();
        this.valueOf = new java.util.ArrayList();
        this.AhwBna = 0;
        this.fetchVPNInfo = str;
    }

    /* JADX INFO: renamed from: o.acj$StateListAnimator */
    public static class StateListAnimator {
        public final java.lang.String valueOf;

        public boolean AYXKKw() {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String copydefault() {
            return this.valueOf;
        }

        public StateListAnimator(java.lang.String str) {
            this.valueOf = str;
        }

        public java.lang.String OLrzqt() {
            return copydefault();
        }

        public java.lang.String KWHzl() {
            return "/" + OLrzqt();
        }

        public boolean EZpvd(java.lang.String str) {
            return copydefault().equals(str);
        }
    }

    public java.lang.Object KWHzl(StateListAnimator stateListAnimator) {
        return AEQbTJ(stateListAnimator, null);
    }

    public java.lang.Object AEQbTJ(StateListAnimator stateListAnimator, java.lang.String[] strArr) {
        return EZpvd(stateListAnimator, strArr, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0199, code lost:
    
        if (r8 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x019b, code lost:
    
        r8 = new java.util.ArrayList(5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a2, code lost:
    
        r8.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a9, code lost:
    
        if (r17.AYXKKw() != false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(StateListAnimator stateListAnimator, java.lang.String[] strArr, TaskDescription taskDescription) {
        boolean z;
        int i;
        Activity activity;
        if (this.valueOf.size() == 0) {
            return EZpvd(stateListAnimator, strArr);
        }
        boolean z2 = djBIcL;
        if (z2) {
            java.lang.System.out.println("Service: " + this.fetchVPNInfo + " key: " + stateListAnimator.copydefault());
        }
        if (stateListAnimator != null) {
            try {
                this.DbNXlk.EZpvd();
                java.util.Map<java.lang.String, Activity> concurrentHashMap = this.AYXKKw;
                if (concurrentHashMap == null) {
                    if (z2) {
                        java.lang.System.out.println("Service " + this.fetchVPNInfo + " cache was empty");
                    }
                    concurrentHashMap = new ConcurrentHashMap<>();
                }
                int size = this.valueOf.size();
                if (taskDescription != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            i = 0;
                            break;
                        }
                        if (taskDescription == this.valueOf.get(i2)) {
                            i = i2 + 1;
                            break;
                        }
                        i2++;
                    }
                    if (i == 0) {
                        throw new java.lang.IllegalStateException("Factory " + taskDescription + "not registered with service: " + this);
                    }
                    z = false;
                } else {
                    z = true;
                    i = 0;
                }
                java.util.ArrayList<java.lang.String> arrayList = null;
                int i3 = 0;
                boolean z3 = false;
                while (true) {
                    java.lang.String strKWHzl = stateListAnimator.KWHzl();
                    boolean z4 = djBIcL;
                    if (z4) {
                        java.lang.System.out.println(this.fetchVPNInfo + "[" + i3 + "] looking for: " + strKWHzl);
                        i3++;
                    }
                    activity = concurrentHashMap.get(strKWHzl);
                    if (activity == null) {
                        if (z4) {
                            java.lang.System.out.println("did not find: " + strKWHzl + " in cache");
                        }
                        int i4 = i;
                        while (true) {
                            if (i4 >= size) {
                                break;
                            }
                            TaskDescription taskDescription2 = this.valueOf.get(i4);
                            boolean z5 = djBIcL;
                            if (z5) {
                                java.lang.System.out.println("trying factory[" + i4 + "] " + taskDescription2.toString());
                            }
                            java.lang.Object objAEQbTJ = taskDescription2.AEQbTJ(stateListAnimator, this);
                            if (objAEQbTJ != null) {
                                activity = new Activity(strKWHzl, objAEQbTJ);
                                if (z5) {
                                    java.lang.System.out.println(this.fetchVPNInfo + " factory supported: " + strKWHzl + ", caching");
                                }
                            } else {
                                if (z5) {
                                    java.lang.System.out.println("factory did not support: " + strKWHzl);
                                }
                                i4++;
                            }
                        }
                    } else {
                        if (z4) {
                            java.lang.System.out.println(this.fetchVPNInfo + " found with descriptor: " + strKWHzl);
                        }
                        z = z3;
                    }
                    z3 = z;
                }
                if (activity != null) {
                    if (z) {
                        if (djBIcL) {
                            java.lang.System.out.println("caching '" + activity.copydefault + "'");
                        }
                        concurrentHashMap.put(activity.copydefault, activity);
                        if (arrayList != null) {
                            for (java.lang.String str : arrayList) {
                                if (djBIcL) {
                                    java.lang.System.out.println(this.fetchVPNInfo + " adding descriptor: '" + str + "' for actual: '" + activity.copydefault + "'");
                                }
                                concurrentHashMap.put(str, activity);
                            }
                        }
                        this.AYXKKw = concurrentHashMap;
                    }
                    if (strArr != null) {
                        if (activity.copydefault.indexOf("/") == 0) {
                            strArr[0] = activity.copydefault.substring(1);
                        } else {
                            strArr[0] = activity.copydefault;
                        }
                    }
                    if (djBIcL) {
                        java.lang.System.out.println("found in service: " + this.fetchVPNInfo);
                    }
                    return activity.EZpvd;
                }
            } finally {
                this.DbNXlk.OLrzqt();
            }
        }
        if (djBIcL) {
            java.lang.System.out.println("not found in service: " + this.fetchVPNInfo);
        }
        return EZpvd(stateListAnimator, strArr);
    }

    /* JADX INFO: renamed from: o.acj$Activity */
    public static final class Activity {
        public final java.lang.Object EZpvd;
        public final java.lang.String copydefault;

        public Activity(java.lang.String str, java.lang.Object obj) {
            this.copydefault = str;
            this.EZpvd = obj;
        }
    }

    public java.util.Set<java.lang.String> djBIcL() {
        return KWHzl((java.lang.String) null);
    }

    public java.util.Set<java.lang.String> KWHzl(java.lang.String str) {
        java.util.Set<java.lang.String> setKeySet = AhwBna().keySet();
        StateListAnimator stateListAnimatorAEQbTJ = AEQbTJ(str);
        if (stateListAnimatorAEQbTJ == null) {
            return setKeySet;
        }
        java.util.HashSet hashSet = new java.util.HashSet(setKeySet.size());
        for (java.lang.String str2 : setKeySet) {
            if (stateListAnimatorAEQbTJ.EZpvd(str2)) {
                hashSet.add(str2);
            }
        }
        return hashSet;
    }

    public final java.util.Map<java.lang.String, TaskDescription> AhwBna() {
        synchronized (this) {
            if (this.values == null) {
                try {
                    this.DbNXlk.EZpvd();
                    java.util.HashMap map = new java.util.HashMap();
                    java.util.List<TaskDescription> list = this.valueOf;
                    java.util.ListIterator<TaskDescription> listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        listIterator.previous().copydefault(map);
                    }
                    this.values = Collections.unmodifiableMap(map);
                    this.DbNXlk.OLrzqt();
                } catch (java.lang.Throwable th) {
                    this.DbNXlk.OLrzqt();
                    throw th;
                }
            }
        }
        return this.values;
    }

    public final TaskDescription copydefault(TaskDescription taskDescription) {
        taskDescription.getClass();
        try {
            this.DbNXlk.copydefault();
            this.valueOf.add(0, taskDescription);
            OLrzqt();
            this.DbNXlk.AEQbTJ();
            copydefault();
            return taskDescription;
        } catch (java.lang.Throwable th) {
            this.DbNXlk.AEQbTJ();
            throw th;
        }
    }

    public final boolean KWHzl(TaskDescription taskDescription) {
        boolean z;
        taskDescription.getClass();
        try {
            this.DbNXlk.copydefault();
            if (this.valueOf.remove(taskDescription)) {
                OLrzqt();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                copydefault();
            }
            return z;
        } finally {
            this.DbNXlk.AEQbTJ();
        }
    }

    public boolean valueOf() {
        return this.valueOf.size() == this.AhwBna;
    }

    public void AYXKKw() {
        this.AhwBna = this.valueOf.size();
    }

    public StateListAnimator AEQbTJ(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new StateListAnimator(str);
    }

    @Override // o.AbstractC7058acf
    public void AEQbTJ(EventListener eventListener) {
        ((ActionBar) eventListener).OLrzqt(this);
    }

    public java.lang.String toString() {
        return super.toString() + "{" + this.fetchVPNInfo + "}";
    }
}
