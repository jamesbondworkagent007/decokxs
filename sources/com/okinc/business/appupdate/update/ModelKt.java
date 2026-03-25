package com.okinc.business.appupdate.update;

import com.okinc.business.appupdate.debug.UpgradeDBoxExtension;
import com.okinc.business.appupdate.update.UpdateApiService;
import com.okinc.business.appupdate.utils.UtilsExtKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC58185ywX;
import o.C32962mnV;
import o.C32979mnm;
import o.C33024moe;
import o.C33492mxV;
import o.C34703nhO;
import o.C43280rmM;
import o.C43393roT;
import o.C56524yIo;
import o.xVY;

/* JADX INFO: loaded from: classes3.dex */
public final class ModelKt {
    private static final String DARKNIGHT = "darkNight";
    private static final String DAY = "day";

    public static final AbstractC58185ywX<AppUpdateConfigResp> requestAppUpdateInfo(boolean z) {
        AppUpdateRequest appUpdateRequest = new AppUpdateRequest();
        appUpdateRequest.setAppID(C34703nhO.KWHzl(C32979mnm.EZpvd.OLrzqt()));
        appUpdateRequest.setDisplayMode(C33492mxV.OLrzqt() ? DARKNIGHT : "day");
        appUpdateRequest.setHarmony(UtilsExtKt.isHarmony());
        String strOLrzqt = xVY.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "guanwang";
        }
        appUpdateRequest.setChannel(strOLrzqt);
        appUpdateRequest.setIgnoreGray(z ? 1 : 0);
        String string = StringsKt__StringsKt.hDKMBd((CharSequence) UpgradeDBoxExtension.Companion.getTestVersionStr$OKUpgrade_ok_upgrade()).toString();
        if (string.length() > 0) {
            appUpdateRequest.setAppVersion(string);
        }
        return C33024moe.KWHzl(C32962mnV.unwrapResponseData$default(UpdateApiService.DefaultImpls.loadAppUpdateConfig$default((UpdateApiService) C43393roT.EZpvd(C56524yIo.AEQbTJ(UpdateApiService.class), C43280rmM.Companion.copydefault()), appUpdateRequest, null, null, 6, null), (Function1) null, 1, (Object) null));
    }
}
