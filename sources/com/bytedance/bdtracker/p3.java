package com.bytedance.bdtracker;

/* JADX INFO: loaded from: classes2.dex */
public class p3 {
    public static final long[][] h = {new long[]{60000, 0, 10}, new long[]{120000, 5, 1}, new long[]{240000, 5, 1}, new long[]{480000, 4, 1}, new long[]{960000, 2, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f241a;
    public v1 b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return this.b.c.isCongestionControlEnable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        if (a()) {
            if (this.c >= h.length - 1) {
                this.e = 0;
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.c++;
            this.d = 1;
            this.e = 0;
            this.f = jCurrentTimeMillis;
            this.g = jCurrentTimeMillis;
            this.b.f.putLong(this.f241a + "downgrade_time", jCurrentTimeMillis).putInt(this.f241a + "downgrade_index", this.c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        if (a()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = this.e;
            long j = i;
            long[][] jArr = h;
            int i2 = this.c;
            if (j < jArr[i2][1] && jCurrentTimeMillis - this.g <= 1800000) {
                this.e = i + 1;
                return;
            }
            if (i2 > 0) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                this.c--;
                this.d = 1;
                this.e = 1;
                this.f = jCurrentTimeMillis2;
                this.g = jCurrentTimeMillis2;
                this.b.f.putLong(this.f241a + "downgrade_time", jCurrentTimeMillis2).putInt(this.f241a + "downgrade_index", this.c);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public p3(String str, v1 v1Var) {
        this.b = v1Var;
        this.f241a = str;
        this.c = 0;
        if (System.currentTimeMillis() - v1Var.f.getLong(this.f241a + "downgrade_time", 0L) < 10800000) {
            this.c = this.b.f.getInt(this.f241a + "downgrade_index", 0);
            return;
        }
        this.b.f.remove(this.f241a + "downgrade_time").remove(this.f241a + "downgrade_index");
    }
}
