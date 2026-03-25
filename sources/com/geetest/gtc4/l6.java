package com.geetest.gtc4;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes21.dex */
public final class l6 implements h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m6 f475a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l6(m6 m6Var) {
        this.f475a = m6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.h6
    public final String a(IBinder iBinder) throws RemoteException {
        try {
            return this.f475a.a(iBinder);
        } catch (RemoteException e) {
            throw e;
        } catch (e6 e2) {
            throw e2;
        } catch (Exception e3) {
            throw new e6(e3);
        }
    }
}
