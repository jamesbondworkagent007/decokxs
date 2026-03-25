package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class tXS {
    public static final tXS AEQbTJ = new tXS();

    private tXS() {
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("key_preference_touch_switch", java.lang.Boolean.valueOf(z));
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("key_preference_touch_switch", true);
    }
}
