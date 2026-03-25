package o;

import com.okinc.unify_trade.biz.SimpleOptionProduct;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55716xpG extends AbstractC55755xpt<SimpleOptionProduct> {
    public final java.lang.String AEQbTJ;
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
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public abstract void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    public static /* synthetic */ void onError$default(AbstractC55716xpG abstractC55716xpG, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i & 2) != 0) {
            str2 = "http";
        }
        abstractC55716xpG.copydefault(str, str2);
    }
}
