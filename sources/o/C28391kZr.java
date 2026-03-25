package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenDetailParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28391kZr {
    public final kYC EZpvd;
    public final kYA KWHzl;

    public C28391kZr(@NotNull kYA kya, @NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        this.KWHzl = kya;
        this.EZpvd = kyc;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<DexMultiTokenDetailParam> list, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) {
        return this.KWHzl.EZpvd(new DexMultiTokenDetailReq(this.EZpvd.OLrzqt(), list), continuation);
    }
}
