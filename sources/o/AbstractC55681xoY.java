package o;

import com.okinc.unify_trade.biz.subscribe.OptSummaryData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55681xoY extends AbstractC55755xpt<java.util.List<? extends OptSummaryData>> {
    public java.lang.String AYXKKw;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55681xoY(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        super(null, str, str3, null, str2, null, 41, null);
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = str;
        this.AYXKKw = "OptSummaryListener-" + str;
        this.gEmmrt = "OptSummaryListener";
    }
}
