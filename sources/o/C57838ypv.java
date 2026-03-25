package o;

import o.C57837ypu;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57838ypv implements InterfaceC57827ypk {
    @Override // o.InterfaceC57827ypk
    public void KWHzl(java.lang.String str, JSONObject jSONObject, final InterfaceC57828ypl interfaceC57828ypl) {
        C57837ypu.KWHzl(str, jSONObject, new C57837ypu.TaskDescription() { // from class: o.ypv.1
            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(java.lang.String str2) {
                interfaceC57828ypl.AEQbTJ(str2);
            }

            @Override // o.C57837ypu.TaskDescription
            public void OLrzqt(int i, java.lang.String str2, java.lang.Throwable th) {
                interfaceC57828ypl.copydefault(i, str2, th);
            }
        });
    }
}
