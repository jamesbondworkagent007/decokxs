package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30922lkL implements RxBus.Application {
    public final DexMultiTokenInfoBean AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean KWHzl() {
        return this.AEQbTJ;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C30922lkL(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = dexMultiTokenInfoBean;
        this.KWHzl = str;
    }
}
