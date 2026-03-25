package com.amplifyframework.auth.cognito;

import com.amplifyframework.auth.MFAType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MFATypeUtil {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MFAType.values().length];
            try {
                iArr[MFAType.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MFAType.TOTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getChallengeResponse(@NotNull MFAType mFAType) {
        Intrinsics.checkNotNullParameter(mFAType, "");
        int i = WhenMappings.$EnumSwitchMapping$0[mFAType.ordinal()];
        if (i == 1) {
            return "SMS_MFA";
        }
        if (i == 2) {
            return "SOFTWARE_TOKEN_MFA";
        }
        throw new NoWhenBranchMatchedException();
    }
}
