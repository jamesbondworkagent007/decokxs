package o;

/* JADX INFO: renamed from: o.Yp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5617Yp {
    public ActionBar AEQbTJ = null;
    public StateListAnimator KWHzl = null;
    public LoaderManager djBIcL = null;
    public Activity OLrzqt = null;
    public PendingIntent valueOf = null;
    public Application copydefault = null;
    public TaskDescription EZpvd = null;

    public ActionBar AEQbTJ() {
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new ActionBar();
        }
        return this.AEQbTJ;
    }

    public StateListAnimator KWHzl() {
        if (this.KWHzl == null) {
            this.KWHzl = new StateListAnimator();
        }
        return this.KWHzl;
    }

    public LoaderManager AhwBna() {
        if (this.djBIcL == null) {
            this.djBIcL = new LoaderManager();
        }
        return this.djBIcL;
    }

    public Activity EZpvd() {
        if (this.OLrzqt == null) {
            this.OLrzqt = new Activity();
        }
        return this.OLrzqt;
    }

    public PendingIntent djBIcL() {
        if (this.valueOf == null) {
            this.valueOf = new PendingIntent();
        }
        return this.valueOf;
    }

    public Application OLrzqt() {
        if (this.copydefault == null) {
            this.copydefault = new Application();
        }
        return this.copydefault;
    }

    public TaskDescription copydefault() {
        if (this.EZpvd == null) {
            this.EZpvd = new TaskDescription();
        }
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.Yp$ActionBar */
    public static final class ActionBar extends AbstractC5625Yy<boolean[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final boolean[] OLrzqt(int i) {
            return new boolean[i];
        }
    }

    /* JADX INFO: renamed from: o.Yp$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5625Yy<byte[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final byte[] OLrzqt(int i) {
            return new byte[i];
        }
    }

    /* JADX INFO: renamed from: o.Yp$LoaderManager */
    public static final class LoaderManager extends AbstractC5625Yy<short[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final short[] OLrzqt(int i) {
            return new short[i];
        }
    }

    /* JADX INFO: renamed from: o.Yp$Activity */
    public static final class Activity extends AbstractC5625Yy<int[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final int[] OLrzqt(int i) {
            return new int[i];
        }
    }

    /* JADX INFO: renamed from: o.Yp$PendingIntent */
    public static final class PendingIntent extends AbstractC5625Yy<long[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final long[] OLrzqt(int i) {
            return new long[i];
        }
    }

    /* JADX INFO: renamed from: o.Yp$Application */
    public static final class Application extends AbstractC5625Yy<float[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final float[] OLrzqt(int i) {
            return new float[i];
        }
    }

    /* JADX INFO: renamed from: o.Yp$TaskDescription */
    public static final class TaskDescription extends AbstractC5625Yy<double[]> {
        /* JADX DEBUG: Method merged with bridge method: OLrzqt(I)Ljava/lang/Object; */
        @Override // o.AbstractC5625Yy
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final double[] OLrzqt(int i) {
            return new double[i];
        }
    }

    public static java.lang.Object OLrzqt(final java.lang.Object obj) {
        final int length = java.lang.reflect.Array.getLength(obj);
        final java.lang.Class<?> cls = obj.getClass();
        return new java.lang.Object() { // from class: o.Yp.2
            public boolean equals(java.lang.Object obj2) {
                if (obj2 == this) {
                    return true;
                }
                if (!C5619Yr.AEQbTJ(obj2, (java.lang.Class<?>) cls) || java.lang.reflect.Array.getLength(obj2) != length) {
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    java.lang.Object obj3 = java.lang.reflect.Array.get(obj, i);
                    java.lang.Object obj4 = java.lang.reflect.Array.get(obj2, i);
                    if (obj3 != obj4 && obj3 != null && !obj3.equals(obj4)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static <T> java.util.HashSet<T> AEQbTJ(T[] tArr) {
        if (tArr != null) {
            java.util.HashSet<T> hashSet = new java.util.HashSet<>(tArr.length);
            for (T t : tArr) {
                hashSet.add(t);
            }
            return hashSet;
        }
        return new java.util.HashSet<>();
    }

    public static <T> T[] KWHzl(T[] tArr, T t) {
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (tArr[i] == t) {
                if (i == 0) {
                    return tArr;
                }
                T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), length));
                java.lang.System.arraycopy(tArr, 0, tArr2, 1, i);
                tArr2[0] = t;
                int i2 = i + 1;
                int i3 = length - i2;
                if (i3 > 0) {
                    java.lang.System.arraycopy(tArr, i2, tArr2, i2, i3);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), length + 1));
        if (length > 0) {
            java.lang.System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t;
        return tArr3;
    }
}
