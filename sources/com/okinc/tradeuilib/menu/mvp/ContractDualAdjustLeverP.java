package com.okinc.tradeuilib.menu.mvp;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeuilib.menu.mvp.ContractDualAdjustLeverP;
import com.okinc.unify_trade.biz.AdjustLeverRequiredData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DualLeverageResp;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.unify_trade.biz.LeverageReq;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C54589xNz;
import o.C54793xVn;
import o.C55326xho;
import o.C55697xoo;
import o.C56120xwn;
import o.C56168xxi;
import o.C56171xxl;
import o.InterfaceC54581xNr;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.xBF;
import o.xKK;
import o.xMJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ContractDualAdjustLeverP extends AbsPresenter {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public String AEQbTJ;
    public boolean AYXKKw;
    public String AhwBna;
    public final xBF AkhnZx;
    public final TradeLiveData<xMJ.Application> AuCTel;
    public String DbNXlk;
    public final TradeLiveData<List<DualLeverageResp>> EZpvd;
    public final TradeLiveData<Triple<Boolean, AdjustLeverRequiredData, Exception>> OLrzqt;
    public final TradeLiveData<Boolean> copydefault;
    public String djBIcL;
    public InterfaceC58217yxC ejfBZ;
    public final C56171xxl fARcdN;
    public final C56168xxi fJNWhG;
    public String fetchVPNInfo;
    public String gEmmrt;
    public boolean isConnected;
    public String valueOf;
    public final TradeLiveData<Triple<Boolean, LeverIntervalData, String>> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Boolean> AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Triple<Boolean, AdjustLeverRequiredData, Exception>> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<List<DualLeverageResp>> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56168xxi fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.Application> isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<Triple<Boolean, LeverIntervalData, String>> values() {
        return this.values;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractDualAdjustLeverP(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = "";
        this.AhwBna = "SWAP";
        this.gEmmrt = "";
        this.AEQbTJ = "";
        this.valueOf = "";
        this.DbNXlk = "isolated";
        this.AuCTel = new TradeLiveData<>();
        this.copydefault = new TradeLiveData<>();
        this.fJNWhG = new C56168xxi();
        this.AkhnZx = new xBF();
        this.fARcdN = new C56171xxl();
        this.values = new TradeLiveData<>();
        this.OLrzqt = new TradeLiveData<>();
        this.EZpvd = new TradeLiveData<>();
        this.fetchVPNInfo = "";
    }

    public final void OLrzqt(boolean z) {
        this.AYXKKw = z;
        this.copydefault.setValue(Boolean.valueOf(z || this.isConnected));
    }

    public final void EZpvd(boolean z) {
        this.isConnected = z;
        this.copydefault.setValue(Boolean.valueOf(z || this.AYXKKw));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeuilib.menu.mvp.ContractDualAdjustLeverP.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.gEmmrt(this.fJNWhG, this.AkhnZx, this.fARcdN);
    }

    public final void KWHzl(Bundle bundle) {
        String instFamily;
        BizInstrument suggestedInstrument$default;
        if (bundle != null) {
            String string = bundle.getString("instId");
            if (string == null) {
                string = "";
            }
            this.djBIcL = string;
            String string2 = bundle.getString("instType");
            if (string2 == null) {
                string2 = "";
            }
            this.AhwBna = string2;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.AhwBna, this.djBIcL, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            this.gEmmrt = instFamily;
            String string3 = bundle.getString("longLever");
            if (string3 == null) {
                string3 = "";
            }
            this.AEQbTJ = string3;
            String string4 = bundle.getString("shortLever");
            if (string4 == null) {
                string4 = "";
            }
            this.valueOf = string4;
            String string5 = bundle.getString("marginModel");
            this.DbNXlk = string5 != null ? string5 : "";
        }
    }

    public final void DbNXlk() {
        xBF xbf = this.AkhnZx;
        xbf.KWHzl(this.djBIcL);
        xbf.EZpvd(this.AhwBna);
        xbf.AEQbTJ(this.gEmmrt);
        xbf.OLrzqt(this.DbNXlk);
        xbf.KWHzl(new Function1() { // from class: o.uvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDualAdjustLeverP.djBIcL(this.EZpvd, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbf, 0L, 1, null);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fetchVPNInfo = str;
        C56168xxi c56168xxi = this.fJNWhG;
        c56168xxi.AEQbTJ(this.djBIcL);
        c56168xxi.KWHzl(this.AhwBna);
        c56168xxi.copydefault(this.DbNXlk);
        c56168xxi.OLrzqt(str);
        c56168xxi.valueOf(str2);
        c56168xxi.KWHzl(new Function1() { // from class: o.uvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDualAdjustLeverP.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56168xxi, 0L, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Boolean, String> EZpvd(boolean z, AdjustLeverRequiredData adjustLeverRequiredData, Exception exc) {
        String msg;
        boolean z2 = false;
        if (!z && (exc instanceof BizApiException)) {
            BizApiException bizApiException = (BizApiException) exc;
            String code = bizApiException.getCode();
            C56120xwn c56120xwn = C56120xwn.valueOf;
            if (Intrinsics.EZpvd((Object) code, (Object) c56120xwn.AEQbTJ()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.KWHzl())) {
                msg = bizApiException.getMsg();
                z2 = true;
            } else {
                msg = (Intrinsics.EZpvd((Object) code, (Object) c56120xwn.OLrzqt()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.copydefault()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.EZpvd()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.AhwBna()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.valueOf()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.AYXKKw()) || Intrinsics.EZpvd((Object) code, (Object) c56120xwn.gEmmrt()) || Intrinsics.EZpvd((Object) code, (Object) "51008")) ? bizApiException.getMsg() : null;
            }
        }
        return new Pair<>(Boolean.valueOf(z2), msg);
    }

    public final void AEQbTJ() {
        if (C55697xoo.OLrzqt.isConnected()) {
            C56171xxl c56171xxl = this.fARcdN;
            ArrayList arrayList = new ArrayList();
            if (this.AYXKKw) {
                arrayList.add(new LeverageReq(this.djBIcL, this.AEQbTJ, (String) null, this.DbNXlk, "long", 4, (DefaultConstructorMarker) null));
            }
            if (this.isConnected) {
                arrayList.add(new LeverageReq(this.djBIcL, this.valueOf, (String) null, this.DbNXlk, "short", 4, (DefaultConstructorMarker) null));
            }
            c56171xxl.copydefault(arrayList);
            c56171xxl.KWHzl(new Function1() { // from class: o.uvJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ContractDualAdjustLeverP.EZpvd(this.KWHzl, (ResponseData) obj);
                }
            });
            xKK.Activity.execute$default(c56171xxl, 0L, 1, null);
        }
    }

    public final boolean copydefault() {
        return this.AYXKKw && C33129mqd.AEQbTJ(this.AEQbTJ, Double.valueOf(3.0d));
    }

    public final boolean OLrzqt() {
        return this.isConnected && C33129mqd.AEQbTJ(this.valueOf, Double.valueOf(3.0d));
    }

    public final void fJNWhG() {
        if (this.djBIcL.length() == 0) {
            return;
        }
        C54793xVn c54793xVn = C54793xVn.OLrzqt;
        String str = this.djBIcL;
        if (str == null) {
            str = "";
        }
        AbstractC58185ywX<xMJ.Application> abstractC58185ywXKWHzl = c54793xVn.KWHzl(str, new Function1() { // from class: o.uvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDualAdjustLeverP.OLrzqt((xMJ.Application) obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.uvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ContractDualAdjustLeverP.AEQbTJ(this.copydefault, (xMJ.Application) obj);
            }
        };
        this.ejfBZ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.uvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ContractDualAdjustLeverP.KWHzl(function1, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ContractDualAdjustLeverP contractDualAdjustLeverP, xMJ.Application application) {
        if (Intrinsics.EZpvd((Object) application.KWHzl(), (Object) contractDualAdjustLeverP.djBIcL)) {
            contractDualAdjustLeverP.AuCTel.setValue(application);
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC58217yxC interfaceC58217yxC = this.ejfBZ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit djBIcL(ContractDualAdjustLeverP contractDualAdjustLeverP, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            TradeLiveData<Triple<Boolean, LeverIntervalData, String>> tradeLiveData = contractDualAdjustLeverP.values;
            Boolean bool = Boolean.TRUE;
            List list = (List) responseData.getData();
            tradeLiveData.setValue(new Triple<>(bool, list != null ? (LeverIntervalData) CollectionsKt___CollectionsKt.firstOrNull(list) : null, ""));
        } else {
            contractDualAdjustLeverP.values.setValue(new Triple<>(Boolean.FALSE, null, responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ContractDualAdjustLeverP contractDualAdjustLeverP, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            TradeLiveData<Triple<Boolean, AdjustLeverRequiredData, Exception>> tradeLiveData = contractDualAdjustLeverP.OLrzqt;
            Boolean bool = Boolean.TRUE;
            List list = (List) responseData.getData();
            tradeLiveData.setValue(new Triple<>(bool, list != null ? (AdjustLeverRequiredData) CollectionsKt___CollectionsKt.firstOrNull(list) : null, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ContractDualAdjustLeverP contractDualAdjustLeverP, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            contractDualAdjustLeverP.EZpvd.setValue((List<DualLeverageResp>) responseData.getData());
        } else {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
