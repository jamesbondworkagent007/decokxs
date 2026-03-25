package o;

import org.json.JSONException;

/* JADX INFO: renamed from: o.ypN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57804ypN extends AbstractC57803ypM {
    public C57804ypN(java.lang.String str, boolean z) {
        super(str, z);
    }

    @Override // o.AbstractC57803ypM
    public AbstractC57803ypM AEQbTJ(java.lang.String str) {
        return new C57804ypN(str, false);
    }

    @Override // o.AbstractC57803ypM
    public void KWHzl() {
        try {
            EZpvd("notification_types", java.lang.Integer.valueOf(djBIcL()));
        } catch (JSONException unused) {
        }
    }

    public final int djBIcL() {
        int iOLrzqt = AEQbTJ().OLrzqt("subscribableStatus", 1);
        if (iOLrzqt < -2) {
            return iOLrzqt;
        }
        if (AEQbTJ().copydefault("androidPermission", true)) {
            return !AEQbTJ().copydefault("userSubscribePref", true) ? -2 : 1;
        }
        return 0;
    }
}
