package com.okinc.common.util;

import com.okinc.network.okg.response.ResponseData;
import o.AbstractC58185ywX;
import o.C43417ror;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes7.dex */
public interface CheckTimeService {
    public static final String CHECK_TIME_API = "v3/users/support/common/time-validity";
    public static final ActionBar Companion = ActionBar.copydefault;

    @GET(CHECK_TIME_API)
    AbstractC58185ywX<ResponseData<CheckTimeResponse>> check(@Query("t") long j, @Header("ok-error-retry") @NotNull String str);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }

        public final CheckTimeService copydefault() {
            return (CheckTimeService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(CheckTimeService.class));
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ AbstractC58185ywX check$default(CheckTimeService checkTimeService, long j, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: check");
            }
            if ((i & 2) != 0) {
                str = "1";
            }
            return checkTimeService.check(j, str);
        }
    }
}
