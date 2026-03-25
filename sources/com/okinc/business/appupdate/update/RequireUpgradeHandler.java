package com.okinc.business.appupdate.update;

import android.app.Activity;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.appupdate.impl.AppUpdateServiceImplKt;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.C43455rpc;
import o.C48787ucK;
import o.C54819xWm;
import o.InterfaceC48788ucL;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class RequireUpgradeHandler {
    public static final String NETWORK_COMMONERR_RANGE = "business_common_err_range";
    public static final String UPGRADE_ERR_CODE_KEY = "upgrade_err_code";
    private int errCode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public final void init() {
        C48787ucK.AEQbTJ.AEQbTJ(NETWORK_COMMONERR_RANGE, new InterfaceC48788ucL() { // from class: com.okinc.business.appupdate.update.RequireUpgradeHandler.init.1
            @Override // o.InterfaceC48788ucL
            public void onStrategyUpdated() {
                JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ(RequireUpgradeHandler.NETWORK_COMMONERR_RANGE);
                if (jsonObjectAEQbTJ != null) {
                    RequireUpgradeHandler requireUpgradeHandler = RequireUpgradeHandler.this;
                    pUU.KWHzl(RequireUpgradeHandler.class.getSimpleName(), "getJSONObjectByKeyPath: " + jsonObjectAEQbTJ);
                    JsonElement jsonElement = jsonObjectAEQbTJ.get(RequireUpgradeHandler.UPGRADE_ERR_CODE_KEY);
                    requireUpgradeHandler.errCode = jsonElement != null ? jsonElement.getAsInt() : 0;
                }
            }
        });
        RxBus.KWHzl(C43455rpc.class, new String[0]).subscribe(new RxBus.EventCallback<C43455rpc>() { // from class: com.okinc.business.appupdate.update.RequireUpgradeHandler.init.2
            {
                super(RequireUpgradeHandler.this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C43455rpc c43455rpc) {
                Intrinsics.checkNotNullParameter(c43455rpc, "");
                pUU.KWHzl(RequireUpgradeHandler.class.getSimpleName(), "receive event: " + c43455rpc.AEQbTJ() + ", " + c43455rpc.copydefault() + ", " + c43455rpc.KWHzl());
                if (c43455rpc.copydefault() == RequireUpgradeHandler.this.errCode) {
                    RequireUpgradeHandler.this.checkUpgrade();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUpgrade() {
        Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null || !(activityAEQbTJ instanceof AbstractActivityC33041mov)) {
            return;
        }
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) activityAEQbTJ;
        if (abstractActivityC33041mov.isFinishing() || abstractActivityC33041mov.isDestroyed()) {
            return;
        }
        AppUpdateServiceImplKt.getAppUpdateService().checkUpdate(abstractActivityC33041mov, false, null, null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.RequireUpgradeHandler.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
