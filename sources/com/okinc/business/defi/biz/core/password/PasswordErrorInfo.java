package com.okinc.business.defi.biz.core.password;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class PasswordErrorInfo {
    public static final int $stable = 8;

    @SerializedName("et")
    private ArrayList<Long> errorTimes = new ArrayList<>();

    @SerializedName("lc")
    private Long lockTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getErrorTimes() {
        return this.errorTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLockTime() {
        return this.lockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorTimes(@NotNull ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.errorTimes = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockTime(Long l) {
        this.lockTime = l;
    }

    public final String toJson() {
        String json = new Gson().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt("lc", this.lockTime), C56390yDp.OLrzqt("et", this.errorTimes)));
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }
}
