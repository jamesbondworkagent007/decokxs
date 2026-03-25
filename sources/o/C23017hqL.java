package o;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C23017hqL extends AbstractC22974hpV {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC22974hpV
    public void AEQbTJ(@NotNull QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
    }

    @Override // o.AbstractC22974hpV
    public void isConnected() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23017hqL(@NotNull java.lang.String str, @NotNull AbstractC22977hpY abstractC22977hpY) {
        super(str, abstractC22977hpY);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC22977hpY, "");
    }

    @Override // o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> AEQbTJ(@NotNull QuotePriceRes quotePriceRes, @NotNull MergeCallData mergeCallData, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    @Override // o.AbstractC22974hpV
    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull MergeQuoteCallData mergeQuoteCallData, InterfaceC9734bbF interfaceC9734bbF, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(mergeQuoteCallData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null));
    }
}
