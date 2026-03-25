package o;

import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55660xoD extends AbstractC55755xpt<DexAssetsResponse> {
    public java.lang.String AEQbTJ;
    public final int EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final boolean copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55660xoD(int i, java.lang.String str, java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
        super(null, null, null, null, str3, null, 47, null);
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = i;
        this.OLrzqt = str;
        this.valueOf = str2;
        this.copydefault = z;
        this.AEQbTJ = "DexAssetsListener-" + z + "-" + i + "-" + str + "-" + str2;
        this.KWHzl = "DexAssetsListener";
    }
}
