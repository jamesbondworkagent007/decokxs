package o;

import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class rBR {
    public java.lang.Object OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) OnDemandKYCAppModel.Companion.serializer(), str);
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(onDemandKYCAppModel);
        } catch (java.lang.Exception e) {
            pUU.KWHzl("MockGetKYCInfoUseCase", "Failed to parse JSON properly", e);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(e));
        }
    }
}
