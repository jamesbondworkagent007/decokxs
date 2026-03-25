package o;

import com.okinc.unify_trade.biz.subscribe.MovementBean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xoI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55665xoI {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    public abstract void EZpvd(@NotNull java.util.ArrayList<MovementBean> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    public abstract void KWHzl(@NotNull java.util.ArrayList<MovementBean> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public abstract void copydefault(@NotNull java.lang.Throwable th);
}
