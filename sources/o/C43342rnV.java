package o;

import com.okinc.network.okg.encrypt.TimeBeanNew;
import com.okinc.network.okg.response.ResponseData;
import o.InterfaceC43343rnW;

/* JADX INFO: renamed from: o.rnV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43342rnV implements InterfaceC43339rnS {
    /* JADX DEBUG: Class process forced to load method for inline: o.rnW.ActionBar.getRemoteTimestamp$default(o.rnW, java.util.Map, int, java.lang.Object):o.ywX */
    @Override // o.InterfaceC43339rnS
    public long KWHzl() {
        long jCurrentTimeMillis;
        TimeBeanNew timeBeanNew = (TimeBeanNew) ((ResponseData) InterfaceC43343rnW.ActionBar.getRemoteTimestamp$default((InterfaceC43343rnW) C43417ror.OLrzqt(C56524yIo.AEQbTJ(InterfaceC43343rnW.class)), null, 1, null).AEQbTJ()).getData();
        java.lang.Long lCopydefault = timeBeanNew != null ? timeBeanNew.copydefault() : null;
        if (lCopydefault != null) {
            jCurrentTimeMillis = lCopydefault.longValue();
        } else {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        }
        return jCurrentTimeMillis / 1000;
    }
}
