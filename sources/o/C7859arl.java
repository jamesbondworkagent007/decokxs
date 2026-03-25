package o;

import com.immomo.mls.util.NetworkUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: o.arl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7859arl extends android.content.BroadcastReceiver {
    public ConcurrentSkipListMap<java.lang.Integer, WeakReference<StateListAnimator>> AEQbTJ = new ConcurrentSkipListMap<>();

    /* JADX INFO: renamed from: o.arl$StateListAnimator */
    /* JADX INFO: loaded from: classes3.dex */
    public interface StateListAnimator {
        void DbNXlk();

        void isConnected();

        void values();
    }

    public void copydefault(StateListAnimator stateListAnimator) {
        java.lang.Integer numValueOf = stateListAnimator != null ? java.lang.Integer.valueOf(stateListAnimator.hashCode()) : null;
        if (numValueOf != null) {
            ConcurrentSkipListMap<java.lang.Integer, WeakReference<StateListAnimator>> concurrentSkipListMap = this.AEQbTJ;
            WeakReference<StateListAnimator> weakReference = concurrentSkipListMap != null ? concurrentSkipListMap.get(numValueOf) : null;
            if (weakReference == null || weakReference.get() == null) {
                this.AEQbTJ.put(numValueOf, new WeakReference<>(stateListAnimator));
            }
        }
    }

    public void EZpvd(StateListAnimator stateListAnimator) {
        ConcurrentSkipListMap<java.lang.Integer, WeakReference<StateListAnimator>> concurrentSkipListMap;
        java.lang.Integer numValueOf = stateListAnimator != null ? java.lang.Integer.valueOf(stateListAnimator.hashCode()) : null;
        if (numValueOf == null || (concurrentSkipListMap = this.AEQbTJ) == null) {
            return;
        }
        concurrentSkipListMap.remove(numValueOf);
    }

    public int OLrzqt() {
        ConcurrentSkipListMap<java.lang.Integer, WeakReference<StateListAnimator>> concurrentSkipListMap = this.AEQbTJ;
        if (concurrentSkipListMap != null) {
            return concurrentSkipListMap.size();
        }
        return 0;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (this.AEQbTJ != null) {
            if (intent.getAction().equals("android.intent.action.ACTION_SHUTDOWN")) {
                java.util.Iterator<java.lang.Integer> it = this.AEQbTJ.keySet().iterator();
                while (it.hasNext()) {
                    WeakReference<StateListAnimator> weakReference = this.AEQbTJ.get(it.next());
                    if (weakReference != null && weakReference.get() != null) {
                        weakReference.get().values();
                    }
                }
                return;
            }
            int i = AnonymousClass3.KWHzl[NetworkUtil.copydefault(context).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                java.util.Iterator<java.lang.Integer> it2 = this.AEQbTJ.keySet().iterator();
                while (it2.hasNext()) {
                    WeakReference<StateListAnimator> weakReference2 = this.AEQbTJ.get(it2.next());
                    if (weakReference2 != null && weakReference2.get() != null) {
                        weakReference2.get().DbNXlk();
                    }
                }
                return;
            }
            if (i == 4) {
                java.util.Iterator<java.lang.Integer> it3 = this.AEQbTJ.keySet().iterator();
                while (it3.hasNext()) {
                    WeakReference<StateListAnimator> weakReference3 = this.AEQbTJ.get(it3.next());
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().isConnected();
                    }
                }
                return;
            }
            if (i != 5) {
                return;
            }
            java.util.Iterator<java.lang.Integer> it4 = this.AEQbTJ.keySet().iterator();
            while (it4.hasNext()) {
                WeakReference<StateListAnimator> weakReference4 = this.AEQbTJ.get(it4.next());
                if (weakReference4 != null && weakReference4.get() != null) {
                    weakReference4.get().values();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.arl$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[NetworkUtil.NetworkType.values().length];
            KWHzl = iArr;
            try {
                iArr[NetworkUtil.NetworkType.NETWORK_2G.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[NetworkUtil.NetworkType.NETWORK_3G.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[NetworkUtil.NetworkType.NETWORK_4G.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[NetworkUtil.NetworkType.NETWORK_WIFI.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                KWHzl[NetworkUtil.NetworkType.NETWORK_NONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                KWHzl[NetworkUtil.NetworkType.NETWORK_UNKNOWN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }
}
