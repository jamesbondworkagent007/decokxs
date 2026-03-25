package com.bytedance.bdtracker;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class h0 extends d0 {
    public static final long[] i = {1000};
    public final String g;
    public int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public h0(f0 f0Var, String str) {
        super(f0Var);
        this.h = 0;
        this.g = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bytedance.bdtracker.d0
    public boolean c() {
        int i2 = this.f.k.a((JSONObject) null, this.g) ? 0 : this.h + 1;
        this.h = i2;
        if (i2 > 3) {
            this.f.setRangersEventVerifyEnable(false, this.g);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public String d() {
        return "RangersEventVerify";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.bytedance.bdtracker.d0
    public long[] e() {
        return i;
    }

    @Override // com.bytedance.bdtracker.d0
    public boolean f() {
        return true;
    }

    @Override // com.bytedance.bdtracker.d0
    public long g() {
        return 1000L;
    }
}
