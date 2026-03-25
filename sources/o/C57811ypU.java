package o;

import com.okinc.account.api.model.security.otp.OtpEventTracker;

/* JADX INFO: renamed from: o.ypU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57811ypU extends AbstractC57803ypM {
    @Override // o.AbstractC57803ypM
    public void KWHzl() {
    }

    public C57811ypU(java.lang.String str, boolean z) {
        super(OtpEventTracker.OTP_EVENT_VALUE_SMS + str, z);
    }

    @Override // o.AbstractC57803ypM
    public AbstractC57803ypM AEQbTJ(java.lang.String str) {
        return new C57811ypU(str, false);
    }
}
