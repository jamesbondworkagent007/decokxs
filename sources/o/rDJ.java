package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.kyc.api.biz.bean.BannerModelBean;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.ok_kyc_core.impl.OKXComplianceApiImpl$getKycInfo$1;
import com.okinc.ok_kyc_core.impl.OKXComplianceApiImpl$getKycInfo$2;
import com.okinc.ok_kyc_core.impl.OKXComplianceApiImpl$getKycInfoFromCache$1;
import com.okinc.ok_kyc_core.impl.OKXComplianceApiImpl$getKycInfoFromCache$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rDJ extends AbstractC43215rlA implements InterfaceC37981pHw {
    @Override // o.InterfaceC37981pHw
    public void copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super KycInfoListBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new OKXComplianceApiImpl$getKycInfo$1(function1, function12, null), 3, null);
    }

    @Override // o.InterfaceC37981pHw
    public Flow<KycInfoListBean> AEQbTJ() {
        return FlowKt.flow(new OKXComplianceApiImpl$getKycInfo$2(null));
    }

    @Override // o.InterfaceC37981pHw
    public java.lang.Object OLrzqt(long j, @NotNull Continuation<? super BannerModelBean> continuation) {
        return rCM.copydefault.KWHzl(j, continuation);
    }

    @Override // o.InterfaceC37981pHw
    public void EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super KycInfoListBean, Unit> function1, @NotNull Function1<? super java.lang.String, Unit> function12) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new OKXComplianceApiImpl$getKycInfoFromCache$1(function1, function12, null), 3, null);
    }

    @Override // o.InterfaceC37981pHw
    public Flow<KycInfoListBean> EZpvd() {
        return FlowKt.flow(new OKXComplianceApiImpl$getKycInfoFromCache$2(null));
    }
}
