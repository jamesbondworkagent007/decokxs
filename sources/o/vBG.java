package o;

import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModel;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.bot.data.EnableState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vBG extends ViewModel {
    public ArbitrageInfo AYXKKw;
    public xMJ.TaskDescription EZpvd;
    public ArbitrageInfo OLrzqt;
    public xMJ.TaskDescription gEmmrt;
    public final TradeLiveData<java.lang.String> copydefault = new TradeLiveData<>();
    public final TradeLiveData<java.lang.String> AhwBna = new TradeLiveData<>();
    public final TradeLiveData<java.lang.String> valueOf = new TradeLiveData<>();
    public final TradeLiveData<java.lang.String> values = new TradeLiveData<>();
    public final TradeLiveData<EnableState> AkhnZx = new TradeLiveData<>();
    public final TradeLiveData<EnableState> fetchVPNInfo = new TradeLiveData<>();
    public final TradeLiveData<xMJ.TaskDescription> AEQbTJ = new TradeLiveData<>();
    public final TradeLiveData<xMJ.TaskDescription> djBIcL = new TradeLiveData<>();
    public java.util.ArrayList<java.lang.Object> KWHzl = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.Object> DbNXlk = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.lang.String> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<EnableState> AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.lang.String> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<EnableState> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<java.lang.String> gEmmrt() {
        return this.values;
    }

    public final void KWHzl(BizInstrument bizInstrument) {
        if (bizInstrument == null) {
            return;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.KWHzl);
        }
        this.KWHzl.clear();
        this.KWHzl.add(new TaskDescription(bizInstrument.getUnderlying(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 != null) {
            interfaceC54581xNrCopydefault2.copydefault(this.KWHzl);
        }
    }

    public static final class TaskDescription extends AbstractC55671xoO {
        public TaskDescription(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(IndexTickersData indexTickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(indexTickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            vBG.this.OLrzqt().postValue(C54793xVn.OLrzqt.KWHzl(indexTickersData));
        }
    }

    public final void EZpvd(BizInstrument bizInstrument) {
        if (bizInstrument == null) {
            return;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.DbNXlk);
        }
        this.DbNXlk.clear();
        this.DbNXlk.add(new StateListAnimator(bizInstrument.getUnderlying(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault2 != null) {
            interfaceC54581xNrCopydefault2.copydefault(this.DbNXlk);
        }
    }

    public static final class StateListAnimator extends AbstractC55671xoO {
        public StateListAnimator(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(IndexTickersData indexTickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(indexTickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            vBG.this.copydefault().postValue(C54793xVn.OLrzqt.KWHzl(indexTickersData));
        }
    }

    public final void AhwBna() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.KWHzl);
        }
    }

    public final void values() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.AEQbTJ(this.DbNXlk);
        }
    }

    public final void valueOf() {
        AhwBna();
        values();
    }

    public final void EZpvd(boolean z, xMJ.TaskDescription taskDescription) {
        if (z) {
            this.OLrzqt = C56036xvI.KWHzl.copydefault();
            this.EZpvd = taskDescription;
        } else {
            this.AYXKKw = C56036xvI.KWHzl.AEQbTJ();
            this.gEmmrt = taskDescription;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        EnableState enableState;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            if (z) {
                EnableState value = this.fetchVPNInfo.getValue();
                enableState = EnableState.ABLE_SELECT;
                if (value == enableState) {
                    return;
                }
            } else {
                EnableState value2 = this.fetchVPNInfo.getValue();
                enableState = EnableState.ABLE_UNSELECT;
                if (value2 == enableState) {
                    return;
                }
            }
        } else if (z) {
            EnableState value3 = this.fetchVPNInfo.getValue();
            enableState = EnableState.DISABLE_SELECT;
            if (value3 == enableState) {
                return;
            }
        } else {
            EnableState value4 = this.fetchVPNInfo.getValue();
            enableState = EnableState.DISABLE_UNSELECT;
            if (value4 == enableState) {
                return;
            }
        }
        this.fetchVPNInfo.postValue(enableState);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        EnableState enableState;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            if (z) {
                EnableState value = this.AkhnZx.getValue();
                enableState = EnableState.ABLE_SELECT;
                if (value == enableState) {
                    return;
                }
            } else {
                EnableState value2 = this.AkhnZx.getValue();
                enableState = EnableState.ABLE_UNSELECT;
                if (value2 == enableState) {
                    return;
                }
            }
        } else if (z) {
            EnableState value3 = this.AkhnZx.getValue();
            enableState = EnableState.DISABLE_SELECT;
            if (value3 == enableState) {
                return;
            }
        } else {
            EnableState value4 = this.AkhnZx.getValue();
            enableState = EnableState.DISABLE_UNSELECT;
            if (value4 == enableState) {
                return;
            }
        }
        this.AkhnZx.setValue(enableState);
    }

    public static /* synthetic */ void amtChange$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z2 = false;
        }
        vbg.OLrzqt(z, str, str2, str3, str4, z2);
    }

    public final void OLrzqt(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2) {
        if (z) {
            EnableState value = this.AkhnZx.getValue();
            EnableState enableState = EnableState.ABLE_SELECT;
            if (value == enableState) {
                updateRightAmtText$default(this, true, str3, null, null, 12, null);
                if (z2) {
                    updateRightTotalText$default(this, true, str3, null, null, 12, null);
                } else {
                    updateRightTotalText$default(this, false, null, str2, str3, 2, null);
                }
            }
            if (this.fetchVPNInfo.getValue() != enableState || str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
                return;
            }
            if (z2) {
                updateRightAmtText$default(this, true, str4, null, null, 12, null);
            } else {
                updateRightAmtText$default(this, false, null, str2, str4, 2, null);
            }
            updateRightTotalText$default(this, true, str4, null, null, 12, null);
            return;
        }
        EnableState value2 = this.AkhnZx.getValue();
        EnableState enableState2 = EnableState.ABLE_SELECT;
        if (value2 == enableState2) {
            updateLeftAmtText$default(this, true, str3, null, null, 12, null);
            if (z2) {
                updateLeftTotalText$default(this, true, str3, null, null, 12, null);
            } else {
                updateLeftTotalText$default(this, false, null, str, str3, 2, null);
            }
        }
        if (this.fetchVPNInfo.getValue() != enableState2 || str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
            return;
        }
        if (z2) {
            updateLeftAmtText$default(this, true, str4, null, null, 12, null);
        } else {
            updateLeftAmtText$default(this, false, null, str, str4, 2, null);
        }
        updateLeftTotalText$default(this, true, str4, null, null, 12, null);
    }

    public static /* synthetic */ void totalChange$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            z2 = false;
        }
        vbg.KWHzl(z, str, str2, str3, str4, z2);
    }

    public final void KWHzl(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z2) {
        if (z) {
            EnableState value = this.fetchVPNInfo.getValue();
            EnableState enableState = EnableState.ABLE_SELECT;
            if (value == enableState) {
                if (z2) {
                    updateRightAmtText$default(this, true, str3, null, null, 12, null);
                } else {
                    updateRightAmtText$default(this, false, null, str2, str3, 2, null);
                }
                updateRightTotalText$default(this, true, str3, null, null, 12, null);
            }
            if (this.AkhnZx.getValue() != enableState || str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
                return;
            }
            updateRightAmtText$default(this, true, str4, null, null, 12, null);
            if (z2) {
                updateRightTotalText$default(this, true, str4, null, null, 12, null);
                return;
            } else {
                updateRightTotalText$default(this, false, null, str2, str4, 2, null);
                return;
            }
        }
        EnableState value2 = this.fetchVPNInfo.getValue();
        EnableState enableState2 = EnableState.ABLE_SELECT;
        if (value2 == enableState2) {
            if (z2) {
                updateLeftAmtText$default(this, true, str3, null, null, 12, null);
            } else {
                updateLeftAmtText$default(this, false, null, str, str3, 2, null);
            }
            updateLeftTotalText$default(this, true, str3, null, null, 12, null);
        }
        if (this.AkhnZx.getValue() != enableState2 || str4 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str4)) {
            return;
        }
        updateLeftAmtText$default(this, true, str4, null, null, 12, null);
        if (z2) {
            updateLeftTotalText$default(this, true, str4, null, null, 12, null);
        } else {
            updateLeftTotalText$default(this, false, null, str, str4, 2, null);
        }
    }

    public static /* synthetic */ void setSameAmt$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        vbg.copydefault(z, str, str2, str3, z2);
    }

    public final void copydefault(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2) {
        if (z) {
            if (this.AkhnZx.getValue() == EnableState.ABLE_SELECT) {
                updateRightAmtText$default(this, true, str3, null, null, 12, null);
                if (z2) {
                    updateRightTotalText$default(this, true, str3, null, null, 12, null);
                    return;
                } else {
                    updateRightTotalText$default(this, false, null, str2, str3, 2, null);
                    return;
                }
            }
            return;
        }
        if (this.AkhnZx.getValue() == EnableState.ABLE_SELECT) {
            updateLeftAmtText$default(this, true, str3, null, null, 12, null);
            if (z2) {
                updateLeftTotalText$default(this, true, str3, null, null, 12, null);
            } else {
                updateLeftTotalText$default(this, false, null, str, str3, 2, null);
            }
        }
    }

    public static /* synthetic */ void setSameTotal$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        vbg.OLrzqt(z, str, str2, str3, z2);
    }

    public final void OLrzqt(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2) {
        if (z) {
            if (this.fetchVPNInfo.getValue() == EnableState.ABLE_SELECT) {
                if (z2) {
                    updateRightAmtText$default(this, true, str3, null, null, 12, null);
                } else {
                    updateRightAmtText$default(this, false, null, str2, str3, 2, null);
                }
                updateRightTotalText$default(this, true, str3, null, null, 12, null);
                return;
            }
            return;
        }
        if (this.fetchVPNInfo.getValue() == EnableState.ABLE_SELECT) {
            if (z2) {
                updateLeftAmtText$default(this, true, str3, null, null, 12, null);
            } else {
                updateLeftAmtText$default(this, false, null, str, str3, 2, null);
            }
            updateLeftTotalText$default(this, true, str3, null, null, 12, null);
        }
    }

    public static /* synthetic */ void updateLeftAmtText$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        vbg.KWHzl(z, str, str2, str3);
    }

    public final void KWHzl(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (z) {
            TradeLiveData<java.lang.String> tradeLiveData = this.copydefault;
            if (str == null) {
                str = "";
            }
            tradeLiveData.postValue(str);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0)) {
            return;
        }
        TradeLiveData<java.lang.String> tradeLiveData2 = this.copydefault;
        xMJ.TaskDescription taskDescription = this.EZpvd;
        tradeLiveData2.postValue(OLrzqt(true, str2, str3, taskDescription != null ? taskDescription.OLrzqt() : null));
    }

    public static /* synthetic */ void updateRightAmtText$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        vbg.copydefault(z, str, str2, str3);
    }

    public final void copydefault(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (z) {
            TradeLiveData<java.lang.String> tradeLiveData = this.AhwBna;
            if (str == null) {
                str = "";
            }
            tradeLiveData.postValue(str);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0)) {
            return;
        }
        TradeLiveData<java.lang.String> tradeLiveData2 = this.AhwBna;
        xMJ.TaskDescription taskDescription = this.gEmmrt;
        tradeLiveData2.postValue(OLrzqt(false, str2, str3, taskDescription != null ? taskDescription.OLrzqt() : null));
    }

    public static /* synthetic */ void updateLeftTotalText$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        vbg.AEQbTJ(z, str, str2, str3);
    }

    public final void AEQbTJ(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (z) {
            TradeLiveData<java.lang.String> tradeLiveData = this.valueOf;
            if (str == null) {
                str = "";
            }
            tradeLiveData.postValue(str);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0)) {
            return;
        }
        TradeLiveData<java.lang.String> tradeLiveData2 = this.valueOf;
        xMJ.TaskDescription taskDescription = this.EZpvd;
        tradeLiveData2.postValue(EZpvd(true, str2, str3, taskDescription != null ? taskDescription.OLrzqt() : null));
    }

    public static /* synthetic */ void updateRightTotalText$default(vBG vbg, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        vbg.AhwBna(z, str, str2, str3);
    }

    public final void AhwBna(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (z) {
            TradeLiveData<java.lang.String> tradeLiveData = this.values;
            if (str == null) {
                str = " ";
            }
            tradeLiveData.postValue(str);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str2, (java.lang.Object) 0)) {
            return;
        }
        TradeLiveData<java.lang.String> tradeLiveData2 = this.values;
        xMJ.TaskDescription taskDescription = this.gEmmrt;
        tradeLiveData2.postValue(EZpvd(false, str2, str3, taskDescription != null ? taskDescription.OLrzqt() : null));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String strDivS$default;
        java.lang.String strValues;
        java.lang.String instType;
        java.lang.String instFamily;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || C33129mqd.OLrzqt(str, "0") || C33129mqd.OLrzqt(str2, "0")) {
            return "";
        }
        ArbitrageInfo arbitrageInfo = z ? this.OLrzqt : this.AYXKKw;
        BizInstrument bizInstrumentKWHzl = KWHzl(arbitrageInfo);
        C54571xNh c54571xNh = null;
        java.lang.String instType2 = bizInstrumentKWHzl != null ? bizInstrumentKWHzl.getInstType() : null;
        if (instType2 != null) {
            switch (instType2.hashCode()) {
                case -2027980370:
                    strDivS$default = !instType2.equals("MARGIN") ? "" : C33129mqd.divS$default(str2, str, null, null, null, 14, null);
                    break;
                case -1956807563:
                    strDivS$default = !instType2.equals("OPTION") ? "" : C33129mqd.divS$default(str2, C33129mqd.mulS$default(C33129mqd.mulS$default(bizInstrumentKWHzl.getFutureMult(), str, null, null, null, 14, null), str3, null, null, null, 14, null), null, null, null, 14, null);
                    break;
                case 2552066:
                    if (!instType2.equals("SPOT")) {
                        strDivS$default = "";
                        break;
                    }
                    break;
                case 2558355:
                    if (!instType2.equals("SWAP")) {
                        strDivS$default = "";
                    } else if (bizInstrumentKWHzl.isPositiveContract()) {
                        strDivS$default = C33129mqd.divS$default(C33129mqd.divS$default(str2, str, null, null, null, 14, null), bizInstrumentKWHzl.getFutureContractVal(), null, null, null, 14, null);
                    } else {
                        strDivS$default = C33129mqd.divS$default(str2, bizInstrumentKWHzl.getFutureContractVal(), null, null, null, 14, null);
                    }
                    break;
                case 214415088:
                    if (!instType2.equals("FUTURES")) {
                        strDivS$default = "";
                        break;
                    }
                    break;
                default:
                    strDivS$default = "";
                    break;
            }
        } else {
            strDivS$default = "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (arbitrageInfo == null || (instType = arbitrageInfo.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrumentKWHzl == null || (instFamily = bizInstrumentKWHzl.getInstFamily()) == null) {
                    instFamily = "";
                }
                C54571xNh c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                if (c54571xNhCreateTradeConverterWithIndex$default != null) {
                    c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str);
                    c54571xNh = c54571xNhCreateTradeConverterWithIndex$default;
                }
            }
        }
        return (c54571xNh == null || (strValues = c54571xNh.values(strDivS$default)) == null) ? "" : strValues;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r0.equals("FUTURES") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r0.equals("SWAP") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        if (r0.equals("SPOT") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        if (r0.equals("MARGIN") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return KWHzl(r9, r10, r8.getInstType(), r8.getInstId());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return copydefault(r9, r10, r8.getInstType(), r8.getInstId());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && !C33129mqd.OLrzqt(str, "0") && !C33129mqd.OLrzqt(str2, "0")) {
            BizInstrument bizInstrumentKWHzl = KWHzl(z ? this.OLrzqt : this.AYXKKw);
            java.lang.String instType = bizInstrumentKWHzl != null ? bizInstrumentKWHzl.getInstType() : null;
            if (instType != null) {
                switch (instType.hashCode()) {
                    case -2027980370:
                        break;
                    case -1956807563:
                        if (instType.equals("OPTION")) {
                            return EZpvd(str, str2, bizInstrumentKWHzl.getInstType(), bizInstrumentKWHzl.getInstId(), str3);
                        }
                        break;
                    case 2552066:
                        break;
                    case 2558355:
                        break;
                    case 214415088:
                        break;
                }
            }
        }
        return "";
    }

    private final BizInstrument KWHzl(ArbitrageInfo arbitrageInfo) {
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            return null;
        }
        if (arbitrageInfo == null || (instType = arbitrageInfo.getInstType()) == null) {
            instType = "";
        }
        return interfaceC54581xNrCopydefault.copydefault(instType, arbitrageInfo != null ? arbitrageInfo.getInstId() : null, arbitrageInfo != null ? arbitrageInfo.getUly() : null, arbitrageInfo != null ? arbitrageInfo.getAlias() : null);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            if (str3 == null) {
                str3 = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3);
            if (abstractC54531xLwOLrzqt != null) {
                if (str4 == null) {
                    str4 = "";
                }
                BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str4);
                return bizInstrumentValueOf == null ? "" : C54536xML.toSafeString$default(abstractC54531xLwOLrzqt.AhwBna(bizInstrumentValueOf.getInstFamily(), bizInstrumentValueOf.getQuoteSymbol()).AYXKKw(C33129mqd.mulS$default(str, str2, null, null, null, 14, null)), false, 1, null);
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: o.xLw */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C54571xNh c54571xNhAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3 == null ? "" : str3);
        if (abstractC54531xLwOLrzqt == 0) {
            return "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str4 == null ? "" : str4);
        if (bizInstrumentValueOf == null) {
            return "";
        }
        java.lang.String strEZpvd = null;
        if (Intrinsics.EZpvd((java.lang.Object) abstractC54531xLwOLrzqt.copydefault(bizInstrumentValueOf), (java.lang.Object) "linear")) {
            C54571xNh c54571xNhCreateTradeConverterWithIndex$default = AbstractC54531xLw.createTradeConverterWithIndex$default(abstractC54531xLwOLrzqt, bizInstrumentValueOf.getInstFamily(), null, 2, null);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                c54571xNhCreateTradeConverterWithIndex$default.AhwBna(str);
            }
            java.lang.String strKWHzl = c54571xNhCreateTradeConverterWithIndex$default.KWHzl(str2);
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            return C33129mqd.mulS$default(C33129mqd.mulS$default(strKWHzl, str, null, null, null, 14, null), bizInstrumentValueOf.getFutureContractVal(), null, null, null, 14, null);
        }
        java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
        if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "1")) {
            return C33129mqd.mulS$default(str2, bizInstrumentValueOf.getFutureContractVal(), null, null, null, 14, null);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0")) {
            return "";
        }
        C54571xNh c54571xNhOLrzqt = ((InterfaceC54532xLx) abstractC54531xLwOLrzqt).OLrzqt(bizInstrumentValueOf.getInstFamily());
        if (c54571xNhOLrzqt != null && (c54571xNhAhwBna = c54571xNhOLrzqt.AhwBna(str)) != null) {
            strEZpvd = c54571xNhAhwBna.EZpvd(str2);
        }
        return C33129mqd.mulS$default(strEZpvd, bizInstrumentValueOf.getFutureContractVal(), null, null, null, 14, null);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        if (str5 == null || str5.length() == 0 || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3 == null ? "" : str3);
        if (abstractC54531xLwOLrzqt == null) {
            return "";
        }
        BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str4 == null ? "" : str4);
        if (bizInstrumentValueOf == null) {
            return "";
        }
        java.lang.String strGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(bizInstrumentValueOf);
        if (Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "1")) {
            return C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(str2, bizInstrumentValueOf.getFutureMult(), null, null, null, 14, null), str, null, null, null, 14, null), str5, null, null, null, 14, null);
        }
        return Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "0") ? C33129mqd.mulS$default(C33129mqd.mulS$default(C33129mqd.mulS$default(AbstractC54531xLw.createTradeConverterWithIndex$default((xLJ) abstractC54531xLwOLrzqt, bizInstrumentValueOf.getInstFamily(), null, 2, null).EZpvd(str2), bizInstrumentValueOf.getFutureMult(), null, null, null, 14, null), str, null, null, null, 14, null), str5, null, null, null, 14, null) : "";
    }
}
