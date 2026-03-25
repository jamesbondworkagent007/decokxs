package o;

import com.okinc.crcore.coreapi.net.requestbean.recurringbuy.RecurringBuyPlanUpdateRequestBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanUpdateBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31655lzc {
    public static final int KWHzl = C31731mBv.AEQbTJ;
    public final C31731mBv copydefault;

    @yCM
    public C31655lzc(@NotNull C31731mBv c31731mBv) {
        Intrinsics.checkNotNullParameter(c31731mBv, "");
        this.copydefault = c31731mBv;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanDetailRootBean, OKServerException>> continuation) {
        return this.copydefault.KWHzl(str, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanUpdateBean, OKServerException>> continuation) {
        return this.copydefault.OLrzqt(new RecurringBuyPlanUpdateRequestBean(str, str2, str3, str4), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<RecurringBuyFrequencyBean>, OKServerException>> continuation) {
        return this.copydefault.OLrzqt(str, continuation);
    }
}
