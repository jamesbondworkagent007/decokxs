package o;

import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanOrderListRootBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31658lzf {
    public static final int OLrzqt = C31731mBv.AEQbTJ;
    public final C31731mBv copydefault;

    @yCM
    public C31658lzf(@NotNull C31731mBv c31731mBv) {
        Intrinsics.checkNotNullParameter(c31731mBv, "");
        this.copydefault = c31731mBv;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanOrderListRootBean, OKServerException>> continuation) {
        return this.copydefault.copydefault(str, num, num2, num3, continuation);
    }
}
