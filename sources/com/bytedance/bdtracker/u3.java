package com.bytedance.bdtracker;

import com.bytedance.applog.oneid.IDBindCallback;
import com.bytedance.applog.oneid.IDBindResult;

/* JADX INFO: loaded from: classes21.dex */
public final class u3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IDBindCallback f267a;
    public final /* synthetic */ IDBindResult b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public u3(IDBindCallback iDBindCallback, IDBindResult iDBindResult) {
        this.f267a = iDBindCallback;
        this.b = iDBindResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f267a.onSuccess(this.b);
    }
}
