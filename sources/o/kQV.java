package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.tee.domain.model.NumLimitData;
import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedErrorUseCase$checkError$1;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30503lcQ;
import o.InterfaceC30595leC;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQV {
    public final MutableStateFlow<AdvancedOrderType> AEQbTJ;
    public final MutableStateFlow<java.lang.Boolean> AYXKKw;
    public final C19703gMe AhwBna;
    public final MutableStateFlow<java.lang.Boolean> AkhnZx;
    public final C19700gMb AuCTel;
    public final MutableStateFlow<C30626leh> DbNXlk;
    public final MutableStateFlow<AdvancedApproveState> EZpvd;
    public final MutableStateFlow<NumLimitData> KWHzl;
    public final MutableStateFlow<java.lang.Boolean> OLrzqt;
    public final MutableStateFlow<AbstractC30503lcQ> copydefault;
    public final boolean djBIcL;
    public final MutableStateFlow<C30808liD> ejfBZ;
    public final MutableStateFlow<ReminderListConfig> fARcdN;
    public final C28196kSl fIwbmz;
    public final MutableStateFlow<java.lang.Boolean> fetchVPNInfo;
    public final kQX gEmmrt;
    public final StateFlow<NumLimitData> isConnected;
    public final StateFlow<java.lang.Boolean> valueOf;
    public final MutableStateFlow<AdvancedQuoteUiData> values;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<NumLimitData> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> AYXKKw() {
        return this.valueOf;
    }

    @yCM
    public kQV(@NotNull C28196kSl c28196kSl, @NotNull kQX kqx, @NotNull C19703gMe c19703gMe, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(kqx, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.fIwbmz = c28196kSl;
        this.gEmmrt = kqx;
        this.AhwBna = c19703gMe;
        this.AuCTel = c19700gMb;
        this.DbNXlk = StateFlowKt.MutableStateFlow(null);
        this.values = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = StateFlowKt.MutableStateFlow(AdvancedApproveState.APPROVED);
        this.AEQbTJ = StateFlowKt.MutableStateFlow(AdvancedOrderType.MARKET);
        this.ejfBZ = StateFlowKt.MutableStateFlow(null);
        this.copydefault = StateFlowKt.MutableStateFlow(AbstractC30503lcQ.Activity.AEQbTJ);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        MutableStateFlow<java.lang.Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.AkhnZx = StateFlowKt.MutableStateFlow(bool);
        this.AYXKKw = StateFlowKt.MutableStateFlow(bool);
        this.fetchVPNInfo = StateFlowKt.MutableStateFlow(bool);
        MutableStateFlow<NumLimitData> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow2);
        this.fARcdN = StateFlowKt.MutableStateFlow(null);
        this.djBIcL = C22416heu.AhwBna();
    }

    public final boolean valueOf() {
        return this.AEQbTJ.getValue() == AdvancedOrderType.LIMIT;
    }

    public final boolean gEmmrt() {
        return this.AkhnZx.getValue().booleanValue();
    }

    public final boolean KWHzl() {
        return this.AYXKKw.getValue().booleanValue();
    }

    public final void EZpvd(ReminderListConfig reminderListConfig) {
        this.fARcdN.setValue(reminderListConfig);
    }

    public final java.lang.Object AEQbTJ(@NotNull C30626leh c30626leh, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.DbNXlk.setValue(c30626leh);
        return AEQbTJ(continuation);
    }

    public final java.lang.Object KWHzl(C30808liD c30808liD, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.ejfBZ.setValue(c30808liD);
        return AEQbTJ(continuation);
    }

    public final java.lang.Object KWHzl(AdvancedQuoteUiData advancedQuoteUiData, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.values.setValue(advancedQuoteUiData);
        return AEQbTJ(continuation);
    }

    public final java.lang.Object EZpvd(@NotNull AdvancedApproveState advancedApproveState, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.EZpvd.setValue(advancedApproveState);
        return AEQbTJ(continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull AdvancedOrderType advancedOrderType, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.AEQbTJ.setValue(advancedOrderType);
        return AEQbTJ(continuation);
    }

    public final java.lang.Object KWHzl(@NotNull AbstractC30503lcQ abstractC30503lcQ, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.copydefault.setValue(abstractC30503lcQ);
        return AEQbTJ(continuation);
    }

    public final java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.AkhnZx.setValue(C56443yFo.KWHzl(z));
        return AEQbTJ(continuation);
    }

    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.OLrzqt.setValue(C56443yFo.KWHzl(z));
        return AEQbTJ(continuation);
    }

    public final java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.AYXKKw.setValue(C56443yFo.KWHzl(z));
        return AEQbTJ(continuation);
    }

    public final java.lang.Object KWHzl(@NotNull NumLimitData numLimitData, @NotNull Continuation<? super InterfaceC30595leC> continuation) {
        this.KWHzl.setValue(numLimitData);
        return AEQbTJ(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r15v0, types: [o.kSl] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super InterfaceC30595leC> continuation) throws java.lang.Throwable {
        AdvancedErrorUseCase$checkError$1 advancedErrorUseCase$checkError$1;
        ReminderListConfig value;
        boolean zValueOf;
        AbstractC30503lcQ value2;
        C30626leh value3;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedApproveState value4;
        java.lang.String referenceSlippage;
        java.lang.String chainId;
        ?? r3;
        kQV kqv;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ;
        AutoSlippageInfo autoSlippageInfoAEQbTJ;
        gLQ glqAEQbTJ;
        kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean> pairEjfBZ;
        DexMultiTokenInfoBean second;
        C30808liD value5;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna;
        InterfaceC30595leC.Fragment fragment;
        ReminderInfoConfig reminderConfig;
        java.lang.String strGEmmrt;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna3;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna4;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ3;
        boolean zGEmmrt;
        if (continuation instanceof AdvancedErrorUseCase$checkError$1) {
            advancedErrorUseCase$checkError$1 = (AdvancedErrorUseCase$checkError$1) continuation;
            int i = advancedErrorUseCase$checkError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedErrorUseCase$checkError$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedErrorUseCase$checkError$1 = new AdvancedErrorUseCase$checkError$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedErrorUseCase$checkError$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedErrorUseCase$checkError$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            value = this.fARcdN.getValue();
            zValueOf = valueOf();
            value2 = this.copydefault.getValue();
            value3 = this.DbNXlk.getValue();
            AdvancedQuoteUiData value6 = this.values.getValue();
            advancedQuoteAndCallDataKWHzl = value6 != null ? value6.KWHzl() : null;
            value4 = zValueOf ? AdvancedApproveState.APPROVED : this.EZpvd.getValue();
            referenceSlippage = (advancedQuoteAndCallDataKWHzl == null || (autoSlippageInfoAEQbTJ = advancedQuoteAndCallDataKWHzl.AEQbTJ()) == null) ? null : autoSlippageInfoAEQbTJ.getReferenceSlippage();
            chainId = (value3 == null || (dexMultiTokenInfoBeanAEQbTJ = value3.AEQbTJ()) == null) ? null : dexMultiTokenInfoBeanAEQbTJ.getChainId();
            ?? r1 = (zValueOf || !(value2 instanceof AbstractC30503lcQ.Activity)) ? 1 : 0;
            ?? r15 = this.fIwbmz;
            advancedErrorUseCase$checkError$1.L$0 = this;
            advancedErrorUseCase$checkError$1.L$1 = value;
            advancedErrorUseCase$checkError$1.L$2 = value2;
            advancedErrorUseCase$checkError$1.L$3 = value3;
            advancedErrorUseCase$checkError$1.L$4 = advancedQuoteAndCallDataKWHzl;
            advancedErrorUseCase$checkError$1.L$5 = value4;
            advancedErrorUseCase$checkError$1.L$6 = referenceSlippage;
            advancedErrorUseCase$checkError$1.L$7 = chainId;
            advancedErrorUseCase$checkError$1.Z$0 = zValueOf;
            advancedErrorUseCase$checkError$1.I$0 = r1;
            advancedErrorUseCase$checkError$1.label = 1;
            java.lang.Object objCopydefault2 = r15.copydefault(chainId, r1, advancedErrorUseCase$checkError$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            r3 = r1;
            obj = objCopydefault2;
            kqv = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = advancedErrorUseCase$checkError$1.I$0;
            zValueOf = advancedErrorUseCase$checkError$1.Z$0;
            chainId = (java.lang.String) advancedErrorUseCase$checkError$1.L$7;
            referenceSlippage = (java.lang.String) advancedErrorUseCase$checkError$1.L$6;
            value4 = (AdvancedApproveState) advancedErrorUseCase$checkError$1.L$5;
            advancedQuoteAndCallDataKWHzl = (AdvancedQuoteAndCallData) advancedErrorUseCase$checkError$1.L$4;
            value3 = (C30626leh) advancedErrorUseCase$checkError$1.L$3;
            value2 = (AbstractC30503lcQ) advancedErrorUseCase$checkError$1.L$2;
            value = (ReminderListConfig) advancedErrorUseCase$checkError$1.L$1;
            kqv = (kQV) advancedErrorUseCase$checkError$1.L$0;
            C56391yDq.AEQbTJ(obj);
            r3 = i3;
        }
        InterfaceC30595leC interfaceC30595leC = (InterfaceC30595leC) obj;
        int size = (!zValueOf && (value2 instanceof AbstractC30503lcQ.StateListAnimator)) ? ((AbstractC30503lcQ.StateListAnimator) value2).KWHzl().size() + 1 : 1;
        NumLimitData value7 = kqv.KWHzl.getValue();
        if (r3 == 0 || (interfaceC30595leC instanceof InterfaceC30595leC.ContentResolver)) {
            glqAEQbTJ = null;
        } else {
            C19703gMe c19703gMe = kqv.AhwBna;
            if (chainId == null) {
                chainId = "";
            }
            if (zValueOf) {
                zGEmmrt = kqv.OLrzqt.getValue().booleanValue();
            } else {
                zGEmmrt = kqv.gEmmrt();
            }
            glqAEQbTJ = c19703gMe.AEQbTJ(chainId, zGEmmrt, zValueOf);
        }
        if (!kqv.gEmmrt.AEQbTJ()) {
            if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.zsXlph()) {
                return new InterfaceC30595leC.ActionBar(true);
            }
            return InterfaceC30595leC.ComponentCallbacks.copydefault;
        }
        if (glqAEQbTJ != null && !Intrinsics.EZpvd(glqAEQbTJ, gLQ.TaskDescription.copydefault) && !glqAEQbTJ.AEQbTJ()) {
            return new InterfaceC30595leC.ContextWrapper(glqAEQbTJ);
        }
        if (interfaceC30595leC != null) {
            return interfaceC30595leC;
        }
        if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.AhwBna()) {
            return InterfaceC30595leC.TaskDescription.copydefault;
        }
        if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.AkhnZx()) {
            if (value3 == null || (dexMultiTokenInfoBeanAEQbTJ3 = value3.AEQbTJ()) == null || !dexMultiTokenInfoBeanAEQbTJ3.isHoneypotToken()) {
                return new InterfaceC30595leC.LoaderManager((value3 == null || (dexMultiTokenInfoBeanAhwBna4 = value3.AhwBna()) == null) ? null : dexMultiTokenInfoBeanAhwBna4.getTokenSymbol());
            }
            return new InterfaceC30595leC.StateListAnimator(value3.AEQbTJ().getTokenSymbol());
        }
        if (value3 != null && (dexMultiTokenInfoBeanAEQbTJ2 = value3.AEQbTJ()) != null && dexMultiTokenInfoBeanAEQbTJ2.isRiskToken()) {
            return new InterfaceC30595leC.StateListAnimator(value3.AEQbTJ().getTokenSymbol());
        }
        if (value3 != null && (dexMultiTokenInfoBeanAhwBna3 = value3.AhwBna()) != null && dexMultiTokenInfoBeanAhwBna3.isRiskToken()) {
            return new InterfaceC30595leC.StateListAnimator(value3.AhwBna().getTokenSymbol());
        }
        if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.zsXlph()) {
            return new InterfaceC30595leC.ActionBar(false);
        }
        if (advancedQuoteAndCallDataKWHzl != null && !zValueOf && advancedQuoteAndCallDataKWHzl.fJNWhG() && value3 != null && !value3.AYXKKw()) {
            boolean zIsEmpty = advancedQuoteAndCallDataKWHzl.hDKMBd().isEmpty();
            return new InterfaceC30595leC.PictureInPictureParams(null, zIsEmpty, zIsEmpty ? null : kqv.EZpvd(), null, 9, null);
        }
        if (advancedQuoteAndCallDataKWHzl != null && !advancedQuoteAndCallDataKWHzl.DbNXlk() && glqAEQbTJ != null && glqAEQbTJ.AEQbTJ()) {
            return InterfaceC30595leC.SharedElementCallback.copydefault;
        }
        if (advancedQuoteAndCallDataKWHzl != null && zValueOf && value3 != null && !value3.AYXKKw()) {
            java.lang.String strZLjUOn = advancedQuoteAndCallDataKWHzl.zLjUOn();
            if (strZLjUOn.length() == 0) {
                strZLjUOn = "0";
            }
            if (C33129mqd.OLrzqt(strZLjUOn, C56443yFo.AEQbTJ(0))) {
                return new InterfaceC30595leC.PictureInPictureParams(null, false, null, null, 15, null);
            }
        }
        if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.djBIcL()) {
            return new InterfaceC30595leC.ClipData(advancedQuoteAndCallDataKWHzl.KWHzl());
        }
        if (advancedQuoteAndCallDataKWHzl != null) {
            java.lang.String strZLjUOn2 = advancedQuoteAndCallDataKWHzl.zLjUOn();
            if (C33129mqd.OLrzqt(strZLjUOn2.length() != 0 ? strZLjUOn2 : "0", C56443yFo.AEQbTJ(0))) {
                return InterfaceC30595leC.FragmentManager.OLrzqt;
            }
        }
        if (advancedQuoteAndCallDataKWHzl != null) {
            if (C33129mqd.gEmmrt(value3 != null ? value3.EZpvd() : null, value3 != null ? value3.gEmmrt() : null)) {
                java.lang.String tokenSymbol = (value3 == null || (dexMultiTokenInfoBeanAhwBna2 = value3.AhwBna()) == null) ? null : dexMultiTokenInfoBeanAhwBna2.getTokenSymbol();
                return new InterfaceC30595leC.Dialog(tokenSymbol == null ? "" : tokenSymbol, "43671", false, null, null, 28, null);
            }
        }
        if (advancedQuoteAndCallDataKWHzl != null && value3 != null && (strGEmmrt = value3.gEmmrt()) != null && C33129mqd.gEmmrt(strGEmmrt, advancedQuoteAndCallDataKWHzl.uzCIH())) {
            java.lang.String strUzCIH = advancedQuoteAndCallDataKWHzl.uzCIH();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna5 = value3.AhwBna();
            fragment = new InterfaceC30595leC.Fragment(strUzCIH, dexMultiTokenInfoBeanAhwBna5 != null ? dexMultiTokenInfoBeanAhwBna5.getTokenSymbol() : null);
        } else {
            if (zValueOf) {
                if (((value == null || (reminderConfig = value.getReminderConfig()) == null) ? null : reminderConfig.getReminderType()) == TradeReminderType.LimitMiniTradeAmount && advancedQuoteAndCallDataKWHzl != null && value3 != null) {
                    java.lang.String strUzCIH2 = advancedQuoteAndCallDataKWHzl.uzCIH();
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna6 = value3.AhwBna();
                    fragment = new InterfaceC30595leC.Fragment(strUzCIH2, dexMultiTokenInfoBeanAhwBna6 != null ? dexMultiTokenInfoBeanAhwBna6.getTokenSymbol() : null);
                }
            }
            if (advancedQuoteAndCallDataKWHzl != null && value4 != AdvancedApproveState.APPROVED) {
                if (C33129mqd.AEQbTJ(value3 != null ? value3.gEmmrt() : null, C56443yFo.AEQbTJ(0)) && (value4 != AdvancedApproveState.NEED_APPROVE || !kqv.djBIcL || !kqv.KWHzl() || !advancedQuoteAndCallDataKWHzl.DbNXlk() || kqv.valueOf() || !Intrinsics.EZpvd(value2, AbstractC30503lcQ.Activity.AEQbTJ))) {
                    return new InterfaceC30595leC.Activity(value4, (value3 == null || (dexMultiTokenInfoBeanAhwBna = value3.AhwBna()) == null) ? null : dexMultiTokenInfoBeanAhwBna.getTokenSymbol());
                }
            }
            if (advancedQuoteAndCallDataKWHzl != null && advancedQuoteAndCallDataKWHzl.isConnected() && (value5 = kqv.ejfBZ.getValue()) != null && value5.fetchVPNInfo()) {
                return InterfaceC30595leC.PendingIntent.OLrzqt;
            }
            if (advancedQuoteAndCallDataKWHzl != null && (pairEjfBZ = advancedQuoteAndCallDataKWHzl.ejfBZ()) != null && pairEjfBZ.getFirst().booleanValue()) {
                C30808liD value8 = kqv.ejfBZ.getValue();
                if (C23313hvq.KWHzl(value8 != null ? value8.AkhnZx() : null, referenceSlippage)) {
                    kotlin.Pair<java.lang.Boolean, DexMultiTokenInfoBean> pairEjfBZ2 = advancedQuoteAndCallDataKWHzl.ejfBZ();
                    java.lang.String tokenSymbol2 = (pairEjfBZ2 == null || (second = pairEjfBZ2.getSecond()) == null) ? null : second.getTokenSymbol();
                    if (tokenSymbol2 == null) {
                        tokenSymbol2 = "";
                    }
                    if (referenceSlippage == null) {
                        referenceSlippage = "";
                    }
                    return new InterfaceC30595leC.DialogInterface(tokenSymbol2, referenceSlippage);
                }
            }
            if (advancedQuoteAndCallDataKWHzl != null && kqv.AuCTel.AYXKKw() && value7 != null && value7.getNumLimit() > 0 && value7.getPendingNum() + size > value7.getNumLimit()) {
                return new InterfaceC30595leC.Context(value7.getNumLimit());
            }
            if (glqAEQbTJ != null && !Intrinsics.EZpvd(glqAEQbTJ, gLQ.TaskDescription.copydefault) && glqAEQbTJ.AEQbTJ()) {
                return new InterfaceC30595leC.ContextWrapper(glqAEQbTJ);
            }
            return InterfaceC30595leC.ComponentName.OLrzqt;
        }
        return fragment;
    }

    public final InterfaceC30595leC EZpvd() {
        boolean zGEmmrt;
        gLQ glqAEQbTJ;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ;
        boolean zValueOf = valueOf();
        AbstractC30503lcQ value = this.copydefault.getValue();
        C30626leh value2 = this.DbNXlk.getValue();
        AdvancedQuoteUiData value3 = this.values.getValue();
        java.lang.String tokenSymbol = null;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = value3 != null ? value3.KWHzl() : null;
        AdvancedApproveState value4 = this.EZpvd.getValue();
        java.lang.String chainId = (value2 == null || (dexMultiTokenInfoBeanAEQbTJ = value2.AEQbTJ()) == null) ? null : dexMultiTokenInfoBeanAEQbTJ.getChainId();
        if (zValueOf || !(value instanceof AbstractC30503lcQ.Activity)) {
            C19703gMe c19703gMe = this.AhwBna;
            if (chainId == null) {
                chainId = "";
            }
            if (zValueOf) {
                zGEmmrt = this.OLrzqt.getValue().booleanValue();
            } else {
                zGEmmrt = gEmmrt();
            }
            glqAEQbTJ = c19703gMe.AEQbTJ(chainId, zGEmmrt, zValueOf);
        } else {
            glqAEQbTJ = null;
        }
        if (advancedQuoteAndCallDataKWHzl != null) {
            if (C33129mqd.gEmmrt(value2 != null ? value2.EZpvd() : null, value2 != null ? value2.gEmmrt() : null)) {
                if (value2 != null && (dexMultiTokenInfoBeanAhwBna2 = value2.AhwBna()) != null) {
                    tokenSymbol = dexMultiTokenInfoBeanAhwBna2.getTokenSymbol();
                }
                return new InterfaceC30595leC.Dialog(tokenSymbol == null ? "" : tokenSymbol, "43671", false, null, null, 28, null);
            }
        }
        if (advancedQuoteAndCallDataKWHzl != null && value4 != AdvancedApproveState.APPROVED) {
            if (C33129mqd.AEQbTJ(value2 != null ? value2.gEmmrt() : null, 0)) {
                if (value2 != null && (dexMultiTokenInfoBeanAhwBna = value2.AhwBna()) != null) {
                    tokenSymbol = dexMultiTokenInfoBeanAhwBna.getTokenSymbol();
                }
                return new InterfaceC30595leC.Activity(value4, tokenSymbol);
            }
        }
        if (glqAEQbTJ != null && !Intrinsics.EZpvd(glqAEQbTJ, gLQ.TaskDescription.copydefault) && glqAEQbTJ.AEQbTJ()) {
            return new InterfaceC30595leC.ContextWrapper(glqAEQbTJ);
        }
        return InterfaceC30595leC.ComponentName.OLrzqt;
    }

    public final boolean copydefault() {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        DeFiPlatformForSwap deFiPlatformForSwapEZpvd;
        AdvancedQuoteUiData value = this.values.getValue();
        if (value == null || (advancedQuoteAndCallDataKWHzl = value.KWHzl()) == null || (deFiPlatformForSwapEZpvd = advancedQuoteAndCallDataKWHzl.EZpvd()) == null) {
            return false;
        }
        return deFiPlatformForSwapEZpvd.getShowValueDiffWarn();
    }

    public final java.lang.String OLrzqt() {
        java.lang.String percent$default;
        java.lang.String scientificCurrency$default;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteUiData value = this.values.getValue();
        DeFiPlatformForSwap deFiPlatformForSwapEZpvd = (value == null || (advancedQuoteAndCallDataKWHzl = value.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.EZpvd();
        if (deFiPlatformForSwapEZpvd != null) {
            percent$default = C23311hvo.formatPercent$default(C23311hvo.copydefault(deFiPlatformForSwapEZpvd.getDiffPercent()), false, 0, 0, null, null, 31, null);
            scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C23311hvo.copydefault(deFiPlatformForSwapEZpvd.getDiffValue()), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        } else {
            percent$default = "";
            scientificCurrency$default = "";
        }
        if (scientificCurrency$default.length() <= 0) {
            return percent$default;
        }
        return percent$default + " (≈" + scientificCurrency$default + ")";
    }

    public static /* synthetic */ boolean canUseSmartAccount$default(kQV kqv, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return kqv.copydefault(str);
    }

    public final boolean copydefault(java.lang.String str) {
        gLQ glqAEQbTJ;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ;
        if (str == null) {
            C30626leh value = this.DbNXlk.getValue();
            str = (value == null || (dexMultiTokenInfoBeanAEQbTJ = value.AEQbTJ()) == null) ? null : dexMultiTokenInfoBeanAEQbTJ.getChainId();
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        int i = Application.AEQbTJ[this.AEQbTJ.getValue().ordinal()];
        if (i == 1) {
            AbstractC30503lcQ value2 = this.copydefault.getValue();
            AbstractC30503lcQ.StateListAnimator stateListAnimator = value2 instanceof AbstractC30503lcQ.StateListAnimator ? (AbstractC30503lcQ.StateListAnimator) value2 : null;
            java.util.List<AdvancedAutoSellStrategy> listKWHzl = stateListAnimator != null ? stateListAnimator.KWHzl() : null;
            gLQ glqAEQbTJ2 = this.AhwBna.AEQbTJ(str, (listKWHzl == null || listKWHzl.isEmpty()) ? this.fetchVPNInfo.getValue().booleanValue() : gEmmrt(), false);
            if (glqAEQbTJ2 == null || !glqAEQbTJ2.AEQbTJ()) {
                return false;
            }
        } else if (i != 2 || (glqAEQbTJ = this.AhwBna.AEQbTJ(str, this.OLrzqt.getValue().booleanValue(), true)) == null || !glqAEQbTJ.AEQbTJ()) {
            return false;
        }
        return true;
    }

    public final void AEQbTJ(boolean z) {
        java.lang.Boolean value;
        MutableStateFlow<java.lang.Boolean> mutableStateFlow = this.fetchVPNInfo;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Boolean.valueOf(z)));
    }
}
