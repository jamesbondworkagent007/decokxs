package o;

import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55659xoC {
    public final DcdProductListReq AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdProductListReq EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str);

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<ProductItemResp> list);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public AbstractC55659xoC(@NotNull DcdProductListReq dcdProductListReq, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(dcdProductListReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = dcdProductListReq;
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.copydefault = "DcdProductListListener";
    }
}
