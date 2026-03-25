package com.bytedance.bdtracker;

import com.bytedance.applog.profile.UserProfileCallback;

/* JADX INFO: loaded from: classes21.dex */
public class y3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z3 f307a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public y3(z3 z3Var) {
        this.f307a = z3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public void run() {
        UserProfileCallback userProfileCallback = this.f307a.d;
        if (userProfileCallback != null) {
            userProfileCallback.onSuccess();
        }
    }
}
