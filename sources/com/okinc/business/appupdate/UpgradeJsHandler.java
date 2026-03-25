package com.okinc.business.appupdate;

import android.content.Context;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.jsbridge.Message;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.AbstractC57329ygP;
import o.C34705nhQ;
import o.C43251rlk;
import o.C56524yIo;
import o.InterfaceC57336ygW;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UpgradeJsHandler extends AbstractC57329ygP {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String METHOD_CHECK_APP_UPDATE = "checkAppUpdate";
    public static final String METHOD_OPEN_SYSTEM_SETTINGS = "openSystemSettings";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public String getSupportJSObjectUri() {
        return "request";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.UpgradeJsHandler.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
            String str = message.method;
            if (Intrinsics.EZpvd((Object) str, (Object) METHOD_OPEN_SYSTEM_SETTINGS)) {
                if (C34705nhQ.AEQbTJ(contextAEQbTJ)) {
                    interfaceC57336ygW.OLrzqt(message, "success");
                    return;
                } else {
                    interfaceC57336ygW.copydefault(message, "fail");
                    return;
                }
            }
            if (Intrinsics.EZpvd((Object) str, (Object) METHOD_CHECK_APP_UPDATE)) {
                AppUpdateService appUpdateService = (AppUpdateService) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(AppUpdateService.class));
                if (appUpdateService != null) {
                    appUpdateService.checkUpdate((AbstractActivityC33041mov) contextAEQbTJ, false);
                }
                interfaceC57336ygW.OLrzqt(message, "success");
                return;
            }
            return;
        }
        interfaceC57336ygW.copydefault(message, "fail");
    }

    @Override // o.AbstractC57329ygP
    public Set<String> getSupportJSMethods() {
        return yEE.AhwBna(METHOD_OPEN_SYSTEM_SETTINGS, METHOD_CHECK_APP_UPDATE);
    }
}
