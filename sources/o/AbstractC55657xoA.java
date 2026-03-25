package o;

import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55657xoA extends AbstractC55755xpt<AccountBalanceData> {
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55657xoA(java.lang.String str, @NotNull java.lang.String str2) {
        super(null, null, null, null, str2, null, 47, null);
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.AEQbTJ = "BalanceAccountListener-" + str;
        this.copydefault = "BalanceAccountListener";
    }
}
