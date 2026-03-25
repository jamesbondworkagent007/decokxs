package com.okinc.account.api.model.uploadpersonalinfo;

import com.okinc.account.api.service.ResetMfaUploadPersonalInfoService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class PersonalInfoKt {
    public static final PersonalInfo toPersonalInfo(@NotNull UploadPersonalInfoRequest uploadPersonalInfoRequest) {
        Intrinsics.checkNotNullParameter(uploadPersonalInfoRequest, "");
        return new PersonalInfo(uploadPersonalInfoRequest.getEmail(), uploadPersonalInfoRequest.getAreaCode(), uploadPersonalInfoRequest.getPhone(), null, 8, null);
    }

    public static final PersonalInfo toPersonalInfo(@NotNull ResetMfaUploadPersonalInfoService.UploadPersonalInfoRequestReset2fa uploadPersonalInfoRequestReset2fa) {
        Intrinsics.checkNotNullParameter(uploadPersonalInfoRequestReset2fa, "");
        return new PersonalInfo(uploadPersonalInfoRequestReset2fa.EZpvd(), uploadPersonalInfoRequestReset2fa.OLrzqt(), uploadPersonalInfoRequestReset2fa.AEQbTJ(), uploadPersonalInfoRequestReset2fa.copydefault());
    }
}
