package com.bytedance.bdtracker;

import com.bytedance.applog.profile.UserProfileCallback;

/* JADX INFO: loaded from: classes21.dex */
public class x3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298a;
    public final /* synthetic */ z3 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public x3(z3 z3Var, int i) {
        this.b = z3Var;
        this.f298a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public void run() {
        UserProfileCallback userProfileCallback = this.b.d;
        if (userProfileCallback != null) {
            userProfileCallback.onFail(this.f298a);
        }
    }
}
