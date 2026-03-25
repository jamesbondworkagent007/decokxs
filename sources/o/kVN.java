package o;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVN implements kVI {
    public final DefiPlatformInfo KWHzl;

    public kVN(@NotNull DefiPlatformInfo defiPlatformInfo) {
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        this.KWHzl = defiPlatformInfo;
    }

    @Override // o.kVI
    public java.lang.String OLrzqt() {
        return this.KWHzl.getDefiPlatformId();
    }

    @Override // o.kVI
    public java.lang.String KWHzl() {
        return this.KWHzl.getName();
    }

    @Override // o.kVI
    public java.lang.String EZpvd() {
        return this.KWHzl.getLogo();
    }

    @Override // o.kVI
    public java.lang.String AEQbTJ() {
        return this.KWHzl.getDiffPercent();
    }

    @Override // o.kVI
    public kVO copydefault() {
        ServiceFeeInfo serviceFeeInfo = this.KWHzl.getServiceFeeInfo();
        if (serviceFeeInfo != null) {
            return new kVS(serviceFeeInfo);
        }
        return null;
    }
}
