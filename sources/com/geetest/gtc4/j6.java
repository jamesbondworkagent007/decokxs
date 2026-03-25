package com.geetest.gtc4;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes21.dex */
public final class j6 implements h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k6 f468a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j6(k6 k6Var) {
        this.f468a = k6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) throws RemoteException {
        try {
            return this.f468a.a(iBinder);
        } catch (RemoteException e) {
            throw e;
        } catch (e6 e2) {
            throw e2;
        } catch (Exception e3) {
            throw new e6(e3);
        }
    }
}
