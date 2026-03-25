package o;

import com.okinc.common.application.BaseApplication;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.mcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32408mcY implements Function0 {
    public static int KWHzl;
    public static int OLrzqt;
    public final /* synthetic */ BaseApplication EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.okinc.common.application.BaseApplication.attachBaseContext(android.content.Context):void] */
    public /* synthetic */ C32408mcY(BaseApplication baseApplication) {
        this.EZpvd = baseApplication;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.common.application.BaseApplication.getNewProxyInstance(com.okinc.common.application.BaseApplication):kotlin.Unit */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return BaseApplication.gkJEwt(this.EZpvd);
    }

    public static int AEQbTJ() {
        int i = KWHzl;
        int i2 = i % 6651464;
        KWHzl = i + 1;
        if (i2 != 0) {
            return OLrzqt;
        }
        int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
        OLrzqt = iFreeMemory;
        return iFreeMemory;
    }
}
