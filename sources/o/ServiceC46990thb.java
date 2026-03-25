package o;

import com.engagelab.privates.common.component.MTCommonService;

/* JADX INFO: renamed from: o.thb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ServiceC46990thb extends MTCommonService {
    public ServiceC46990thb() {
        try {
            pUU.KWHzl("JiGuangPushImpl", "JPushImpl init in UserService");
            C46919tgJ.Companion.EZpvd(C32979mnm.EZpvd.OLrzqt());
        } catch (java.lang.Exception e) {
            pUU.copydefault("JiGuangPushImpl", "JPushImpl init in UserService failed: " + e.getMessage());
        }
    }

    @Override // com.engagelab.privates.common.component.MTCommonService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        try {
            super.attachBaseContext(context);
        } catch (java.lang.Exception e) {
            pUU.copydefault("JiGuangPushImpl", "UserService attachBaseContext failed: " + e.getMessage());
        }
    }

    @Override // com.engagelab.privates.common.component.MTCommonService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }
}
