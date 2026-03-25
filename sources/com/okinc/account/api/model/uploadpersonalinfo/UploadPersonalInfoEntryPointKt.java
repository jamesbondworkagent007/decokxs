package com.okinc.account.api.model.uploadpersonalinfo;

import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint;
import com.okinc.account.api.service.ResetMfaUploadPersonalInfoService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class UploadPersonalInfoEntryPointKt {
    public static final UploadPersonalInfoEntryPoint toEntryPoint(@NotNull ResetMfaUploadPersonalInfoService.UploadPersonalInfoEntryPointReset2fa uploadPersonalInfoEntryPointReset2fa) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(uploadPersonalInfoEntryPointReset2fa, "");
        if (Intrinsics.EZpvd((Object) uploadPersonalInfoEntryPointReset2fa.copydefault(), (Object) "rebind")) {
            Integer numOLrzqt = uploadPersonalInfoEntryPointReset2fa.OLrzqt();
            iIntValue = numOLrzqt != null ? numOLrzqt.intValue() : 0;
            String strAEQbTJ = uploadPersonalInfoEntryPointReset2fa.AEQbTJ();
            return new UploadPersonalInfoEntryPoint.Rebind2fa(iIntValue, strAEQbTJ != null ? strAEQbTJ : "");
        }
        Integer numOLrzqt2 = uploadPersonalInfoEntryPointReset2fa.OLrzqt();
        iIntValue = numOLrzqt2 != null ? numOLrzqt2.intValue() : 0;
        String strAEQbTJ2 = uploadPersonalInfoEntryPointReset2fa.AEQbTJ();
        return new UploadPersonalInfoEntryPoint.NonAuthRebind2fa(iIntValue, strAEQbTJ2 != null ? strAEQbTJ2 : "");
    }
}
