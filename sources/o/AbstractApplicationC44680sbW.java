package o;

import com.okinc.common.application.BaseApplication;
import dagger.hilt.android.internal.modules.ApplicationContextModule;

/* JADX INFO: renamed from: o.sbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractApplicationC44680sbW extends BaseApplication implements InterfaceC58208ywu {
    public boolean fIwbmz = false;
    public final C58193ywf fJNWhG = new C58193ywf(new InterfaceC58191ywd() { // from class: o.sbW.1
        @Override // o.InterfaceC58191ywd
        public java.lang.Object EZpvd() {
            return C44659sbB.copydefault().AEQbTJ(new ApplicationContextModule(AbstractApplicationC44680sbW.this)).OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58193ywf QSBOWP() {
        return this.fJNWhG;
    }

    @Override // o.InterfaceC58206yws
    public final java.lang.Object aA_() {
        return QSBOWP().aA_();
    }

    @Override // com.okinc.common.application.BaseApplication, android.app.Application
    public void onCreate() {
        QkdxfA();
        super.onCreate();
    }

    public void QkdxfA() {
        if (this.fIwbmz) {
            return;
        }
        this.fIwbmz = true;
        ((InterfaceC44702sbs) aA_()).AEQbTJ((ApplicationC44625saU) C58163ywB.EZpvd(this));
    }

    @Override // com.okinc.common.application.BaseApplication, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }
}
