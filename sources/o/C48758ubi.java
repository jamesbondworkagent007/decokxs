package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.referral.biz.net.service.ReferralUserService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ubi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48758ubi implements InterfaceC48756ubg {
    public static final C48758ubi copydefault = new C48758ubi();

    private C48758ubi() {
    }

    @Override // o.InterfaceC48756ubg
    public AbstractC58185ywX<ResponseData<java.util.HashMap<java.lang.String, java.lang.String>>> KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) ReferralUserService.Companion.EZpvd().checkChannelId(str, str2));
    }
}
