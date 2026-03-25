package com.geetest.gtc4;

import android.os.IBinder;

/* JADX INFO: loaded from: classes21.dex */
public final class l4 implements n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f474a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l4(IBinder iBinder) {
        this.f474a = iBinder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f474a;
    }
}
