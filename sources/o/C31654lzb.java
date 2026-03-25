package o;

import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanListRootBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31654lzb {
    public static final int copydefault = C31731mBv.AEQbTJ;
    public final C31731mBv AEQbTJ;

    @yCM
    public C31654lzb(@NotNull C31731mBv c31731mBv) {
        Intrinsics.checkNotNullParameter(c31731mBv, "");
        this.AEQbTJ = c31731mBv;
    }

    public final java.lang.Object EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super AbstractC43419rot<RecurringBuyPlanListRootBean, OKServerException>> continuation) {
        return this.AEQbTJ.AEQbTJ(str, str2, str3, num, num2, continuation);
    }
}
