package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: renamed from: o.tge, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46940tge {
    public static final C46940tge OLrzqt = new C46940tge();

    private C46940tge() {
    }

    public final java.lang.Integer OLrzqt() {
        java.lang.Integer num = SPUtils.getInt("force_push_channel", 0);
        if (num != null && num.intValue() == 1) {
            return num;
        }
        if (num != null && num.intValue() == 2) {
            return num;
        }
        return null;
    }
}
