package com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.Distribution;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48100uEz;
import o.C55860xrs;
import o.C56003xuc;
import o.C56006xuf;
import o.C56009xui;
import o.C56392yDr;
import o.InterfaceC56005xue;
import o.InterfaceC56387yDm;
import o.pUU;
import o.vTC;
import o.vTF;
import o.vTG;
import o.xKK;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotOrderConfirmPresenter extends AbsPresenter {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public StrategyReqGroup AYXKKw;
    public InterfaceC56005xue AhwBna;
    public String KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public String copydefault;
    public final InterfaceC56387yDm gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.valueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotOrderConfirmPresenter(@NotNull Application application, @NotNull final SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.KWHzl = "";
        this.valueOf = "";
        this.copydefault = "";
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vTB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(BotOrderConfirmPresenter.KWHzl(savedStateHandle));
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vTE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOrderConfirmPresenter.djBIcL(savedStateHandle);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vTH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return BotOrderConfirmPresenter.EZpvd(savedStateHandle);
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final boolean values() {
        return ((Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public static final boolean KWHzl(SavedStateHandle savedStateHandle) {
        Boolean bool = (Boolean) savedStateHandle.get("is_from_bot_guide");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final VoucherTagDisplayInfo djBIcL() {
        return (VoucherTagDisplayInfo) this.gEmmrt.getValue();
    }

    public static final VoucherTagDisplayInfo djBIcL(SavedStateHandle savedStateHandle) {
        return (VoucherTagDisplayInfo) savedStateHandle.get("voucher_display_info");
    }

    public static final String EZpvd(SavedStateHandle savedStateHandle) {
        String str = (String) savedStateHandle.get("AI_MODEL_URL");
        return str == null ? "" : str;
    }

    public final String AEQbTJ() {
        return (String) this.AEQbTJ.getValue();
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, StrategyReqGroup strategyReqGroup) {
        StrategyBaseReq baseReq;
        String ordType;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = str;
        this.valueOf = str2;
        this.AYXKKw = strategyReqGroup;
        if (strategyReqGroup != null && (baseReq = strategyReqGroup.getBaseReq()) != null && (ordType = baseReq.getOrdType()) != null) {
            str3 = ordType;
        }
        this.copydefault = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [69=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt() {
        AiOrderReq aiOrderReq;
        InterfaceC56005xue c48100uEz;
        ContractGridReq contractGridReq;
        String str = this.copydefault;
        switch (str.hashCode()) {
            case -1418042064:
                if (!str.equals("ai_bot")) {
                    pUU.KWHzl("BotOrderConfirmPresenter", "instId " + this.KWHzl + ", instType " + this.valueOf + " mBotType " + this.copydefault);
                    c48100uEz = new C56003xuc();
                } else {
                    StrategyReqGroup strategyReqGroup = this.AYXKKw;
                    if (strategyReqGroup == null || (aiOrderReq = strategyReqGroup.getAiBotReq()) == null) {
                        aiOrderReq = new AiOrderReq((String) null, (List) null, (String) null, (String) null, (String) null, (DataSetting) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
                    }
                    c48100uEz = new C48100uEz(aiOrderReq, AEQbTJ());
                }
                break;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    C56009xui c56009xui = new C56009xui();
                    c56009xui.AEQbTJ(this.KWHzl);
                    c56009xui.EZpvd(this.valueOf);
                    c56009xui.KWHzl(this.AYXKKw);
                    c48100uEz = c56009xui;
                    break;
                }
                break;
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                    C56003xuc c56003xuc = new C56003xuc();
                    c56003xuc.EZpvd(this.KWHzl);
                    c56003xuc.AEQbTJ(this.valueOf);
                    c56003xuc.EZpvd(this.AYXKKw);
                    c48100uEz = c56003xuc;
                    break;
                }
                break;
            case -512749997:
                if (str.equals("contract_grid")) {
                    String str2 = this.KWHzl;
                    String str3 = this.valueOf;
                    StrategyReqGroup strategyReqGroup2 = this.AYXKKw;
                    ContractGridReq contractGridReq2 = (strategyReqGroup2 == null || (contractGridReq = strategyReqGroup2.getContractGridReq()) == null) ? new ContractGridReq((String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null) : contractGridReq;
                    StrategyReqGroup strategyReqGroup3 = this.AYXKKw;
                    c48100uEz = new vTG(str2, str3, contractGridReq2, false, strategyReqGroup3 != null ? strategyReqGroup3.getVipProfit() : null, djBIcL(), 8, null);
                    break;
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    c48100uEz = new vTF(this.KWHzl, this.valueOf, this.AYXKKw, values(), djBIcL(), null, 32, null);
                    break;
                }
                break;
            case 1165749981:
                if (str.equals("recurring")) {
                    C56006xuf c56006xuf = new C56006xuf(this.KWHzl, this.valueOf);
                    c56006xuf.EZpvd(this.AYXKKw);
                    c48100uEz = c56006xuf;
                    break;
                }
                break;
            case 1485620813:
                if (str.equals("dcd_bot")) {
                    C55860xrs c55860xrs = new C55860xrs();
                    c55860xrs.copydefault(this.KWHzl);
                    c55860xrs.KWHzl(this.valueOf);
                    c55860xrs.KWHzl(this.AYXKKw);
                    c48100uEz = c55860xrs;
                    break;
                }
                break;
        }
        this.AhwBna = c48100uEz;
    }

    public final List<Object> OLrzqt() {
        InterfaceC56005xue interfaceC56005xue = this.AhwBna;
        if (interfaceC56005xue == null) {
            Intrinsics.gEmmrt("");
            interfaceC56005xue = null;
        }
        return interfaceC56005xue.AEQbTJ();
    }

    public final String AhwBna() {
        InterfaceC56005xue interfaceC56005xue = this.AhwBna;
        if (interfaceC56005xue == null) {
            Intrinsics.gEmmrt("");
            interfaceC56005xue = null;
        }
        return interfaceC56005xue.EZpvd();
    }

    public final String valueOf() {
        InterfaceC56005xue interfaceC56005xue = this.AhwBna;
        if (interfaceC56005xue == null) {
            Intrinsics.gEmmrt("");
            interfaceC56005xue = null;
        }
        return interfaceC56005xue.KWHzl();
    }

    public final LiveData<List<Distribution>> copydefault() {
        InterfaceC56005xue interfaceC56005xue = this.AhwBna;
        if (interfaceC56005xue == null) {
            Intrinsics.gEmmrt("");
            interfaceC56005xue = null;
        }
        return interfaceC56005xue.OLrzqt();
    }

    public final void OLrzqt(@NotNull vTC vtc) {
        Intrinsics.checkNotNullParameter(vtc, "");
        InterfaceC56005xue interfaceC56005xue = this.AhwBna;
        if (interfaceC56005xue == null) {
            Intrinsics.gEmmrt("");
            interfaceC56005xue = null;
        }
        interfaceC56005xue.EZpvd(vtc);
    }

    public final void copydefault(GridProfitRateResp gridProfitRateResp) {
        InterfaceC56005xue interfaceC56005xue = this.AhwBna;
        if (interfaceC56005xue == null) {
            Intrinsics.gEmmrt("");
            interfaceC56005xue = null;
        }
        vTF vtf = interfaceC56005xue instanceof vTF ? (vTF) interfaceC56005xue : null;
        if (vtf != null) {
            vtf.EZpvd(gridProfitRateResp);
        }
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return yDY.AhwBna();
    }

    public static final class VoucherTagDisplayInfo implements Parcelable {
        public static final Parcelable.Creator<VoucherTagDisplayInfo> CREATOR = new Creator();
        public final String EZpvd;
        public final String KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<VoucherTagDisplayInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VoucherTagDisplayInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new VoucherTagDisplayInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VoucherTagDisplayInfo[] newArray(int i) {
                return new VoucherTagDisplayInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoucherTagDisplayInfo() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VoucherTagDisplayInfo copy$default(VoucherTagDisplayInfo voucherTagDisplayInfo, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = voucherTagDisplayInfo.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = voucherTagDisplayInfo.EZpvd;
            }
            if ((i & 4) != 0) {
                str3 = voucherTagDisplayInfo.copydefault;
            }
            return voucherTagDisplayInfo.copydefault(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VoucherTagDisplayInfo copydefault(String str, String str2, String str3) {
            return new VoucherTagDisplayInfo(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VoucherTagDisplayInfo)) {
                return false;
            }
            VoucherTagDisplayInfo voucherTagDisplayInfo = (VoucherTagDisplayInfo) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) voucherTagDisplayInfo.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) voucherTagDisplayInfo.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) voucherTagDisplayInfo.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.copydefault;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VoucherTagDisplayInfo(voucherTagAmount=" + this.KWHzl + ", voucherTagCcyUnit=" + this.EZpvd + ", voucherTagBonusRate=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.copydefault);
        }

        public VoucherTagDisplayInfo(String str, String str2, String str3) {
            this.KWHzl = str;
            this.EZpvd = str2;
            this.copydefault = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:154) call: com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter.VoucherTagDisplayInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ VoucherTagDisplayInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }
}
