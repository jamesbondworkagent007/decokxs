package com.bytedance.bdtracker;

import com.bytedance.applog.oneid.IDBindCallback;

/* JADX INFO: loaded from: classes21.dex */
public final class t3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IDBindCallback f263a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public t3(IDBindCallback iDBindCallback, int i, String str) {
        this.f263a = iDBindCallback;
        this.b = i;
        this.c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f263a.onFail(this.b, this.c);
    }
}
