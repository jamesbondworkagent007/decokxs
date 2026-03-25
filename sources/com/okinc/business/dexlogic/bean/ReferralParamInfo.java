package com.okinc.business.dexlogic.bean;

import com.okinc.business.dexlogic.bean.track.ReferralTrackInfoName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ReferralParamInfo {
    public static final int $stable = 0;
    private final String button_name;
    private final String dex_mode;
    private final String fee_rate_before_code;
    private final String invitee_discount;
    private final String token_pair;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getButton_name() {
        return this.button_name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDex_mode() {
        return this.dex_mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee_rate_before_code() {
        return this.fee_rate_before_code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitee_discount() {
        return this.invitee_discount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken_pair() {
        return this.token_pair;
    }

    public ReferralParamInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.dex_mode = str;
        this.token_pair = str2;
        this.fee_rate_before_code = str3;
        this.invitee_discount = str4;
        this.button_name = str5;
    }

    public final Map<String, String> referralToMap() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(ReferralTrackInfoName.DEX_MODE.getInfo(), this.dex_mode), C56390yDp.OLrzqt(ReferralTrackInfoName.TOKEN_PAIR.getInfo(), this.token_pair), C56390yDp.OLrzqt(ReferralTrackInfoName.FEE_RATE_BEFORE_CODE.getInfo(), this.fee_rate_before_code), C56390yDp.OLrzqt(ReferralTrackInfoName.INVITEE_DISCOUNT.getInfo(), this.invitee_discount), C56390yDp.OLrzqt(ReferralTrackInfoName.BUTTON_NAME.getInfo(), this.button_name));
    }
}
