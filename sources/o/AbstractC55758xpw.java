package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55758xpw extends AbstractC55755xpt<java.util.List<? extends CountDownInfo>> {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55758xpw(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(null, null, null, null, str, null, 47, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.copydefault = "CountDownBizInfoListener-" + str3;
        this.KWHzl = "CountDownBizInfoListener";
    }
}
