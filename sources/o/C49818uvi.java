package o;

import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.LeverageReq;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49810uva;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49818uvi {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public InterfaceC49810uva.Activity OLrzqt;
    public java.lang.String KWHzl = "";
    public java.lang.String AhwBna = "";
    public final C56168xxi valueOf = new C56168xxi();
    public final C56175xxp djBIcL = new C56175xxp();
    public final C56111xwe<java.util.ArrayList<LeverageReq>> copydefault = new C56111xwe<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull InterfaceC49810uva.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56175xxp AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    public void KWHzl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.util.ArrayList<LeverageReq>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.AhwBna = str2;
        this.EZpvd = str3;
    }

    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi valueOf() {
        return this.valueOf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r6.equals("59110") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r6.equals("59108") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r6.equals("59107") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r6.equals("59103") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r6.equals("59102") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        r6 = r8.getMsg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r6.equals("59101") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r6 = r8.getMsg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0020. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(boolean z, AdjustLeverRequiredData adjustLeverRequiredData, java.lang.Exception exc) {
        java.lang.String message;
        InterfaceC49810uva.Activity activity;
        java.lang.String str;
        java.lang.String maxAmount;
        java.lang.String margin;
        InterfaceC49810uva.Activity activity2;
        InterfaceC49810uva.Activity activity3;
        InterfaceC49810uva.Activity activity4 = null;
        if (z) {
            Intrinsics.EZpvd((java.lang.Object) (adjustLeverRequiredData != null ? adjustLeverRequiredData.getExistOrd() : null), (java.lang.Object) "true");
        } else {
            if (exc instanceof BizApiException) {
                BizApiException bizApiException = (BizApiException) exc;
                java.lang.String code = bizApiException.getCode();
                switch (code.hashCode()) {
                    case 50693326:
                        break;
                    case 50693327:
                        break;
                    case 50693328:
                        break;
                    case 50693332:
                        break;
                    case 50693333:
                        break;
                    case 50693356:
                        break;
                    default:
                        C33134mqi.AEQbTJ(bizApiException.getMsg());
                        break;
                }
                activity = this.OLrzqt;
                if (activity == null) {
                    Intrinsics.gEmmrt("");
                    activity = null;
                }
                str = this.AEQbTJ;
                if (str == null) {
                    str = "";
                }
                if (adjustLeverRequiredData != null || (maxAmount = adjustLeverRequiredData.getMaxAmount()) == null) {
                    maxAmount = "";
                }
                if (adjustLeverRequiredData != null || (margin = adjustLeverRequiredData.getMargin()) == null) {
                    margin = "";
                }
                activity2 = this.OLrzqt;
                if (activity2 == null) {
                    Intrinsics.gEmmrt("");
                    activity2 = null;
                }
                activity.AEQbTJ(str, maxAmount, margin, activity2.KWHzl());
                activity3 = this.OLrzqt;
                if (activity3 != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    activity4 = activity3;
                }
                activity4.KWHzl(msg);
            }
            if (exc != null && (message = exc.getMessage()) != null) {
                C33134mqi.AEQbTJ(message);
            }
        }
        java.lang.String msg = null;
        activity = this.OLrzqt;
        if (activity == null) {
        }
        str = this.AEQbTJ;
        if (str == null) {
        }
        if (adjustLeverRequiredData != null) {
            maxAmount = "";
        }
        if (adjustLeverRequiredData != null) {
            margin = "";
        }
        activity2 = this.OLrzqt;
        if (activity2 == null) {
        }
        activity.AEQbTJ(str, maxAmount, margin, activity2.KWHzl());
        activity3 = this.OLrzqt;
        if (activity3 != null) {
        }
        activity4.KWHzl(msg);
    }

    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49810uva.Activity activity = null;
        if (str.length() == 0) {
            InterfaceC49810uva.Activity activity2 = this.OLrzqt;
            if (activity2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                activity = activity2;
            }
            activity.EZpvd(str);
            return;
        }
        this.AEQbTJ = str;
        C56168xxi c56168xxi = this.valueOf;
        c56168xxi.KWHzl(xVE.copydefault.EZpvd("MARGIN"));
        c56168xxi.copydefault(this.AhwBna);
        InterfaceC49810uva.Activity activity3 = this.OLrzqt;
        if (activity3 == null) {
            Intrinsics.gEmmrt("");
            activity3 = null;
        }
        c56168xxi.EZpvd(activity3.KWHzl());
        c56168xxi.OLrzqt(str);
        c56168xxi.AuCTel();
        xKK.Activity.execute$default(c56168xxi, 0L, 1, null);
    }

    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49810uva.Activity activity = this.OLrzqt;
        if (activity == null) {
            Intrinsics.gEmmrt("");
            activity = null;
        }
        LeverageReq leverageReq = new LeverageReq("", str, activity.KWHzl(), this.AhwBna, "");
        C56175xxp c56175xxp = this.djBIcL;
        c56175xxp.AEQbTJ(leverageReq);
        c56175xxp.AEQbTJ(this.copydefault);
        xKK.Activity.execute$default(c56175xxp, 0L, 1, null);
    }

    public void djBIcL() {
        this.valueOf.AYXKKw();
        this.djBIcL.AYXKKw();
    }
}
