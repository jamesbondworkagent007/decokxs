package o;

import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom;

/* JADX INFO: renamed from: o.iwo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25444iwo {
    public static final java.lang.String EZpvd(int i) {
        return (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl()) ? BusinessType.MEME : BusinessType.QUICK).getValue();
    }

    public static final java.lang.String AEQbTJ(int i) {
        if (C31172lox.KWHzl(i, C31172lox.Companion.KWHzl())) {
            return EventPageNameType.MEME.getPageName();
        }
        return EventPageNameType.QUICK.getPageName();
    }

    public static final DAppRedirectFrom copydefault(int i) {
        return C31172lox.KWHzl(i, C31172lox.Companion.KWHzl()) ? DAppRedirectFrom.MEME : DAppRedirectFrom.QUICK;
    }
}
