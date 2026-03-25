package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.LeverageReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49827uvr;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49838uwB {
    public java.lang.String AEQbTJ;
    public TradePositionManager.PositionItem AhwBna;
    public java.lang.String AkhnZx;
    public InterfaceC49827uvr.Application copydefault;
    public InterfaceC58217yxC valueOf;
    public xMJ.Application values;
    public java.lang.String KWHzl = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String djBIcL = "";
    public java.lang.String gEmmrt = "";
    public final C56168xxi fetchVPNInfo = new C56168xxi();
    public final C56175xxp AYXKKw = new C56175xxp();
    public final C56111xwe<java.util.ArrayList<LeverageReq>> EZpvd = new C56111xwe<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56111xwe<java.util.ArrayList<LeverageReq>> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56175xxp AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xMJ.Application AhwBna() {
        return this.values;
    }

    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, TradePositionManager.PositionItem positionItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.OLrzqt = str2;
        this.djBIcL = str3;
        this.gEmmrt = str4;
        this.AhwBna = positionItem;
        this.AkhnZx = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull InterfaceC49827uvr.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.copydefault = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi isConnected() {
        return this.fetchVPNInfo;
    }

    public boolean AkhnZx() {
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "cross");
    }

    public boolean DbNXlk() {
        return Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "isolated");
    }

    public final java.lang.String valueOf() {
        if (Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) "cash")) {
            return null;
        }
        return this.djBIcL;
    }

    public final java.lang.String djBIcL() {
        if (Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) "net") || AkhnZx()) {
            return null;
        }
        return this.gEmmrt;
    }

    public final void EZpvd(boolean z, AdjustLeverRequiredData adjustLeverRequiredData, java.lang.Exception exc) {
        java.lang.String message;
        java.lang.Boolean bool;
        java.lang.String msg;
        java.lang.String maxAmount;
        java.lang.String liqPx;
        java.lang.String margin;
        java.lang.String availTransfer;
        InterfaceC49827uvr.Application application = null;
        if (z) {
            bool = java.lang.Boolean.FALSE;
            msg = null;
        } else {
            if (exc instanceof BizApiException) {
                BizApiException bizApiException = (BizApiException) exc;
                java.lang.String code = bizApiException.getCode();
                C56120xwn c56120xwn = C56120xwn.valueOf;
                if (Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.AEQbTJ()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.KWHzl())) {
                    bool = java.lang.Boolean.TRUE;
                    msg = bizApiException.getMsg();
                } else if (Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.copydefault()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.OLrzqt()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.EZpvd()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.AhwBna()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.valueOf()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.AYXKKw()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) c56120xwn.gEmmrt()) || Intrinsics.EZpvd((java.lang.Object) code, (java.lang.Object) "51008")) {
                    msg = bizApiException.getMsg();
                    bool = null;
                } else {
                    C55326xho.toastWithFailedIcon$default(bizApiException.getMsg(), 0, 1, (java.lang.Object) null);
                }
            } else if (exc != null && (message = exc.getMessage()) != null) {
                C33134mqi.AEQbTJ(message);
            }
            bool = null;
            msg = null;
        }
        InterfaceC49827uvr.Application application2 = this.copydefault;
        java.lang.String str = "";
        if (application2 == null) {
            Intrinsics.gEmmrt("");
            application2 = null;
        }
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null) {
            str2 = "";
        }
        if (adjustLeverRequiredData == null || (maxAmount = adjustLeverRequiredData.getMaxAmount()) == null) {
            maxAmount = "";
        }
        if (adjustLeverRequiredData == null || (liqPx = adjustLeverRequiredData.getLiqPx()) == null) {
            liqPx = "";
        }
        if (adjustLeverRequiredData == null || (margin = adjustLeverRequiredData.getMargin()) == null) {
            margin = "";
        }
        application2.copydefault(str2, maxAmount, liqPx, margin);
        InterfaceC49827uvr.Application application3 = this.copydefault;
        if (application3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            application = application3;
        }
        java.lang.String str3 = this.AEQbTJ;
        if (str3 == null) {
            str3 = "";
        }
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (adjustLeverRequiredData != null && (availTransfer = adjustLeverRequiredData.getAvailTransfer()) != null) {
            str = availTransfer;
        }
        application.copydefault(str3, zBooleanValue, msg, str);
    }

    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49827uvr.Application application = null;
        if (str.length() == 0) {
            InterfaceC49827uvr.Application application2 = this.copydefault;
            if (application2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                application = application2;
            }
            application.EZpvd(str);
            return;
        }
        this.AEQbTJ = str;
        java.lang.String str2 = this.OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) {
            C56168xxi c56168xxi = this.fetchVPNInfo;
            c56168xxi.AEQbTJ(this.KWHzl);
            c56168xxi.KWHzl(xVE.copydefault.EZpvd("FUTURES"));
            c56168xxi.copydefault(valueOf());
            c56168xxi.valueOf(djBIcL());
            c56168xxi.OLrzqt(str);
            c56168xxi.KWHzl(new Function1() { // from class: o.uwD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49838uwB.AEQbTJ(this.EZpvd, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c56168xxi, 0L, 1, null);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) {
            C56168xxi c56168xxi2 = this.fetchVPNInfo;
            c56168xxi2.AEQbTJ(this.KWHzl);
            c56168xxi2.KWHzl(xVE.copydefault.EZpvd("SWAP"));
            c56168xxi2.copydefault(valueOf());
            c56168xxi2.valueOf(djBIcL());
            c56168xxi2.OLrzqt(str);
            c56168xxi2.KWHzl(new Function1() { // from class: o.uwF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49838uwB.OLrzqt(this.AEQbTJ, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c56168xxi2, 0L, 1, null);
        }
    }

    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        LeverageReq leverageReq = new LeverageReq(this.KWHzl, str, null, this.djBIcL, djBIcL());
        C56175xxp c56175xxp = this.AYXKKw;
        c56175xxp.AEQbTJ(leverageReq);
        c56175xxp.AEQbTJ(this.EZpvd);
        xKK.Activity.execute$default(c56175xxp, 0L, 1, null);
    }

    public void OLrzqt(final java.lang.String str) {
        if (str == null || str.length() != 0) {
            AbstractC58185ywX<xMJ.Application> abstractC58185ywXKWHzl = C54793xVn.OLrzqt.KWHzl(str == null ? "" : str, new Function1() { // from class: o.uwz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49838uwB.copydefault((xMJ.Application) obj);
                }
            });
            final Function1 function1 = new Function1() { // from class: o.uwy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49838uwB.copydefault(str, this, (xMJ.Application) obj);
                }
            };
            this.valueOf = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.uwG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C49838uwB.OLrzqt(function1, obj);
                }
            });
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, C49838uwB c49838uwB, xMJ.Application application) {
        if (Intrinsics.EZpvd((java.lang.Object) application.KWHzl(), (java.lang.Object) str)) {
            c49838uwB.values = application;
        }
        return Unit.INSTANCE;
    }

    public void fetchVPNInfo() {
        this.fetchVPNInfo.AYXKKw();
        this.AYXKKw.AYXKKw();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit AEQbTJ(C49838uwB c49838uwB, ResponseData responseData) {
        AdjustLeverRequiredData adjustLeverRequiredData;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            return Unit.INSTANCE;
        }
        if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            adjustLeverRequiredData = (AdjustLeverRequiredData) ((java.util.List) data).get(0);
        } else {
            adjustLeverRequiredData = null;
        }
        c49838uwB.EZpvd(true, adjustLeverRequiredData, new BizApiException(responseData.getMsg(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, 28, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C49838uwB c49838uwB, ResponseData responseData) {
        AdjustLeverRequiredData adjustLeverRequiredData;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            return Unit.INSTANCE;
        }
        if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            adjustLeverRequiredData = (AdjustLeverRequiredData) ((java.util.List) data).get(0);
        } else {
            adjustLeverRequiredData = null;
        }
        c49838uwB.EZpvd(true, adjustLeverRequiredData, new BizApiException(responseData.getMsg(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, 28, null));
        return Unit.INSTANCE;
    }
}
