package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.ail, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7382ail {
    public java.util.Map<java.lang.Object, Application> AEQbTJ;

    /* JADX INFO: renamed from: o.ail$Application */
    public interface Application {
        void KWHzl();
    }

    public void OLrzqt(java.lang.Object obj, Application application) {
        if (application == null) {
            return;
        }
        if (this.AEQbTJ == null) {
            this.AEQbTJ = new ConcurrentHashMap();
        }
        this.AEQbTJ.put(obj, application);
    }

    public <T extends Application> T EZpvd(java.lang.Object obj) {
        java.util.Map<java.lang.Object, Application> map = this.AEQbTJ;
        if (map == null) {
            return null;
        }
        return (T) map.get(obj);
    }

    public void OLrzqt() {
        java.util.Map<java.lang.Object, Application> map = this.AEQbTJ;
        if (map != null && map.size() > 0) {
            java.util.Iterator<Map.Entry<java.lang.Object, Application>> it = this.AEQbTJ.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().KWHzl();
            }
            this.AEQbTJ.clear();
        }
        this.AEQbTJ = null;
    }
}
