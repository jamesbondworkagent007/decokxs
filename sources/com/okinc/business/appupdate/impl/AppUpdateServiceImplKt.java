package com.okinc.business.appupdate.impl;

import com.okinc.business.appupdate.core.adapter.OKUpgradeAdapter;
import com.okinc.business.appupdate.update.AppUpdateUtils;
import kotlin.jvm.functions.Function0;
import o.C32979mnm;
import o.C56392yDr;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateServiceImplKt {
    private static final InterfaceC56387yDm appUpdateService$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.impl.AppUpdateServiceImplKt$$ExternalSyntheticLambda0
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUpdateServiceImplKt.appUpdateService_delegate$lambda$0();
        }
    });

    public static final OKUpgradeAdapter getAppUpdateService() {
        return (OKUpgradeAdapter) appUpdateService$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OKUpgradeAdapter appUpdateService_delegate$lambda$0() {
        return new OKUpgradeAdapter(C32979mnm.EZpvd.OLrzqt(), new AppUpdateUtils(), false, 4, null);
    }
}
