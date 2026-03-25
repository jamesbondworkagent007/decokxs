package o;

import com.okinc.common.application.BaseApplication;
import dagger.Lazy;

/* JADX INFO: renamed from: o.meL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32475meL {
    public static void KWHzl(BaseApplication baseApplication, Lazy<pTN> lazy) {
        baseApplication.localizationInit = lazy;
    }

    public static void copydefault(BaseApplication baseApplication, Lazy<pTU> lazy) {
        baseApplication.localizeService = lazy;
    }
}
