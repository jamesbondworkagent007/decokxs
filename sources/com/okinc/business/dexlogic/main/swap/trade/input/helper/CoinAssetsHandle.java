package com.okinc.business.dexlogic.main.swap.trade.input.helper;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.error.NetError;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssetsHandle;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.AbstractC23101hrq;
import o.AbstractC58185ywX;
import o.C22332hdP;
import o.C22380heK;
import o.C22386heQ;
import o.C23311hvo;
import o.C23313hvq;
import o.C23322hvz;
import o.C28390kZq;
import o.C33050mpD;
import o.C9860bdZ;
import o.InterfaceC23194htd;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class CoinAssetsHandle {
    public static final int $stable = 8;
    private InterfaceC58217yxC assetsDisposable;
    private Object visibleKey = new Object();

    public static /* synthetic */ void getFromCoinAssets$default(CoinAssetsHandle coinAssetsHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean, CoinAssets coinAssets, String str, Integer num, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFromCoinAssets");
        }
        if ((i & 2) != 0) {
            coinAssets = CoinAssets.BOTH;
        }
        CoinAssets coinAssets2 = coinAssets;
        if ((i & 8) != 0) {
            num = null;
        }
        coinAssetsHandle.getFromCoinAssets(dexMultiTokenInfoBean, coinAssets2, str, num, function1);
    }

    public final void getFromCoinAssets(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull CoinAssets coinAssets, @NotNull String str, Integer num, @NotNull final Function1<? super CoinState, Unit> function1) {
        Intrinsics.checkNotNullParameter(coinAssets, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (dexMultiTokenInfoBean == null || !yDY.gEmmrt(CoinAssets.BOTH, CoinAssets.FROM).contains(coinAssets)) {
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<DexMultiTokenInfoBean> abstractC58185ywXCopydefault = c22380heK.copydefault(str).copydefault().copydefault(dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean.getChainId(), c22380heK.copydefault(str).fARcdN(), num);
        final Function1 function12 = new Function1() { // from class: o.hnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.getFromCoinAssets$lambda$4$lambda$0(function1, this, (DexMultiTokenInfoBean) obj);
            }
        };
        InterfaceC58227yxM<? super DexMultiTokenInfoBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hno
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.getFromCoinAssets$lambda$4$lambda$2(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hnr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function13.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.visibleKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFromCoinAssets$lambda$4$lambda$0(Function1 function1, CoinAssetsHandle coinAssetsHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.copydefault(dexMultiTokenInfoBean);
        function1.invoke(coinAssetsHandle.getCoinState(dexMultiTokenInfoBean));
        pUU.KWHzl("CoinAssets", "From Balance = " + dexMultiTokenInfoBean.getAmountNum() + "availableAmountNum" + dexMultiTokenInfoBean.getAvailableAmountNum() + " uniqueId= " + dexMultiTokenInfoBean.getUniqueId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFromCoinAssets$lambda$4$lambda$2(Function1 function1, Throwable th) {
        if (th instanceof NetError) {
            function1.invoke(new CoinState("", "", true, (String) null, (String) null, 24, (DefaultConstructorMarker) null));
        } else {
            function1.invoke(new CoinState("", "", false, (String) null, (String) null, 24, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    private final CoinState getCoinState(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (C23313hvq.valueOf(dexMultiTokenInfoBean.getAmountNum(), "0")) {
            return new CoinState("0", "0", false, (String) null, (String) null, 28, (DefaultConstructorMarker) null);
        }
        return new CoinState(C23322hvz.toLocalizedNumber$default(dexMultiTokenInfoBean.getAmountNum(), false, (RoundingMode) null, false, false, 11, (Object) null), dexMultiTokenInfoBean.getAmountNum(), false, dexMultiTokenInfoBean.getAvailableCurrencyAmount(), dexMultiTokenInfoBean.getAvailableAmountNum(), 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void getToCoinAssets$default(CoinAssetsHandle coinAssetsHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean, CoinAssets coinAssets, String str, Integer num, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToCoinAssets");
        }
        if ((i & 2) != 0) {
            coinAssets = CoinAssets.BOTH;
        }
        CoinAssets coinAssets2 = coinAssets;
        if ((i & 8) != 0) {
            num = null;
        }
        coinAssetsHandle.getToCoinAssets(dexMultiTokenInfoBean, coinAssets2, str, num, function1);
    }

    public final void getToCoinAssets(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull CoinAssets coinAssets, @NotNull String str, Integer num, @NotNull final Function1<? super CoinState, Unit> function1) {
        Intrinsics.checkNotNullParameter(coinAssets, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (dexMultiTokenInfoBean == null || !yDY.gEmmrt(CoinAssets.BOTH, CoinAssets.TO).contains(coinAssets)) {
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        AbstractC58185ywX<DexMultiTokenInfoBean> abstractC58185ywXCopydefault = c22380heK.copydefault(str).copydefault().copydefault(dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean.getChainId(), c22380heK.copydefault(str).fARcdN(), num);
        final Function1 function12 = new Function1() { // from class: o.hnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.getToCoinAssets$lambda$9$lambda$5(function1, this, (DexMultiTokenInfoBean) obj);
            }
        };
        InterfaceC58227yxM<? super DexMultiTokenInfoBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hns
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.getToCoinAssets$lambda$9$lambda$7(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hnq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function13.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.visibleKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getToCoinAssets$lambda$9$lambda$5(Function1 function1, CoinAssetsHandle coinAssetsHandle, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.copydefault(dexMultiTokenInfoBean);
        function1.invoke(coinAssetsHandle.getCoinState(dexMultiTokenInfoBean));
        pUU.KWHzl("CoinAssets", "To Balance = " + dexMultiTokenInfoBean.getAmountNum() + "availableAmountNum" + dexMultiTokenInfoBean.getAvailableAmountNum() + " uniqueId= " + dexMultiTokenInfoBean.getUniqueId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getToCoinAssets$lambda$9$lambda$7(Function1 function1, Throwable th) {
        if (th instanceof NetError) {
            function1.invoke(new CoinState("", "", true, (String) null, (String) null, 24, (DefaultConstructorMarker) null));
        } else {
            function1.invoke(new CoinState("", "", false, (String) null, (String) null, 28, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public final void disposeAssets() {
        C33050mpD.OLrzqt(this.visibleKey);
    }

    public final void addAssetsListener(@NotNull final MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull C28390kZq c28390kZq) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        InterfaceC58217yxC interfaceC58217yxC = this.assetsDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<C9860bdZ> abstractC58185ywXCopydefault = c28390kZq.copydefault();
        final Function1 function1 = new Function1() { // from class: o.hny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.addAssetsListener$lambda$10(this.OLrzqt, mutableLiveData, (C9860bdZ) obj);
            }
        };
        InterfaceC58227yxM<? super C9860bdZ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hnw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.addAssetsListener$lambda$12((java.lang.Throwable) obj);
            }
        };
        this.assetsDisposable = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                function12.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAssetsListener$lambda$10(CoinAssetsHandle coinAssetsHandle, MutableLiveData mutableLiveData, C9860bdZ c9860bdZ) {
        Intrinsics.copydefault(c9860bdZ);
        coinAssetsHandle.handleInputCoinTradeGroup(mutableLiveData, c9860bdZ);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAssetsListener$lambda$12(Throwable th) {
        return Unit.INSTANCE;
    }

    public final void disposeAssetsListener() {
        InterfaceC58217yxC interfaceC58217yxC = this.assetsDisposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final void handleInputCoinTradeGroup(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull C9860bdZ c9860bdZ) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(c9860bdZ, "");
        ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
        if (value == null) {
            return;
        }
        DexMultiTokenInfoBean data = value.getData().getFromData().getData().getCoinData().getData();
        DexMultiTokenInfoBean data2 = value.getData().getToData().getData().getCoinData().getData();
        pUU.KWHzl("CoinAssets", "from ws chainId = " + c9860bdZ.OLrzqt() + "tokenAddress" + c9860bdZ.AhwBna() + " coinAmountOriginalDec= " + c9860bdZ.AEQbTJ());
        String uniqueId = data != null ? data.getUniqueId() : null;
        String strValueOf = String.valueOf(c9860bdZ.OLrzqt());
        String strAhwBna = c9860bdZ.AhwBna();
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        Boolean boolAYXKKw = c9860bdZ.AYXKKw();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd((Object) uniqueId, (Object) C23311hvo.EZpvd(strValueOf, strAhwBna, Intrinsics.EZpvd(boolAYXKKw, bool)))) {
            C22386heQ c22386heQ = C22386heQ.EZpvd;
            if (c22386heQ.EZpvd(data, c9860bdZ)) {
                c22386heQ.KWHzl(data, c9860bdZ);
                CoinState coinState = getCoinState(data);
                ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
                Intrinsics.copydefault(value2);
                mutableLiveData.setValue(C22332hdP.EZpvd(value2.getData().setFromBalance(coinState.getShowData(), coinState.getOriginData(), (60 & 4) != 0 ? false : coinState.getErrorType(), (60 & 8) != 0 ? false : true, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? "" : data.getAvailableAmountNum())));
            }
        }
        String uniqueId2 = data2 != null ? data2.getUniqueId() : null;
        String strValueOf2 = String.valueOf(c9860bdZ.OLrzqt());
        String strAhwBna2 = c9860bdZ.AhwBna();
        if (Intrinsics.EZpvd((Object) uniqueId2, (Object) C23311hvo.EZpvd(strValueOf2, strAhwBna2 != null ? strAhwBna2 : "", Intrinsics.EZpvd(c9860bdZ.AYXKKw(), bool)))) {
            C22386heQ c22386heQ2 = C22386heQ.EZpvd;
            if (c22386heQ2.EZpvd(data2, c9860bdZ)) {
                c22386heQ2.KWHzl(data2, c9860bdZ);
                CoinState coinState2 = getCoinState(data2);
                ConsumeData<TradeInputGroup> value3 = mutableLiveData.getValue();
                Intrinsics.copydefault(value3);
                mutableLiveData.setValue(C22332hdP.EZpvd(value3.getData().setToBalance(coinState2.getShowData(), coinState2.getOriginData(), coinState2.getErrorType(), true)));
            }
        }
    }

    public static /* synthetic */ void getCoinAssets$default(CoinAssetsHandle coinAssetsHandle, CoinAssets coinAssets, MutableLiveData mutableLiveData, AbstractC23101hrq abstractC23101hrq, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinAssets");
        }
        if ((i & 1) != 0) {
            coinAssets = CoinAssets.BOTH;
        }
        coinAssetsHandle.getCoinAssets(coinAssets, mutableLiveData, abstractC23101hrq);
    }

    public final void getCoinAssets(@NotNull CoinAssets coinAssets, @NotNull final MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull final AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(coinAssets, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        if (mutableLiveData.getValue() != null) {
            if (abstractC23101hrq.QUSxYX().copydefault() != null && yDY.gEmmrt(CoinAssets.BOTH, CoinAssets.FROM).contains(coinAssets)) {
                ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
                Intrinsics.copydefault(value);
                mutableLiveData.setValue(C22332hdP.EZpvd(value.getData().setFromBalance("", "", (60 & 4) != 0 ? false : false, (60 & 8) != 0 ? false : false, (60 & 16) != 0 ? "" : null, (60 & 32) != 0 ? "" : null)));
            }
            if (abstractC23101hrq.QUSxYX().valueOf() != null && yDY.gEmmrt(CoinAssets.BOTH, CoinAssets.TO).contains(coinAssets)) {
                ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
                Intrinsics.copydefault(value2);
                mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.setToBalance$default(value2.getData(), "", "", false, false, 12, null)));
            }
        }
        getFromCoinAssets(abstractC23101hrq.QUSxYX().copydefault(), coinAssets, abstractC23101hrq.ffGIBT(), abstractC23101hrq.gEmmrt(), new Function1() { // from class: o.hnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.getCoinAssets$lambda$16$lambda$14(mutableLiveData, this, abstractC23101hrq, (CoinState) obj);
            }
        });
        getToCoinAssets(abstractC23101hrq.QUSxYX().valueOf(), coinAssets, abstractC23101hrq.ffGIBT(), abstractC23101hrq.gEmmrt(), new Function1() { // from class: o.hnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinAssetsHandle.getCoinAssets$lambda$16$lambda$15(mutableLiveData, (CoinState) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getCoinAssets$lambda$16$lambda$14(MutableLiveData mutableLiveData, CoinAssetsHandle coinAssetsHandle, AbstractC23101hrq abstractC23101hrq, CoinState coinState) {
        Intrinsics.checkNotNullParameter(coinState, "");
        T value = mutableLiveData.getValue();
        Intrinsics.copydefault(value);
        mutableLiveData.setValue(C22332hdP.EZpvd(((TradeInputGroup) ((ConsumeData) value).getData()).setFromBalance(coinState.getShowData(), coinState.getOriginData(), coinState.getErrorType(), true, coinState.getAvailableCurrencyAmount(), coinState.getAvailableAmountNum())));
        checkFromBalance$default(coinAssetsHandle, mutableLiveData, abstractC23101hrq, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit getCoinAssets$lambda$16$lambda$15(MutableLiveData mutableLiveData, CoinState coinState) {
        Intrinsics.checkNotNullParameter(coinState, "");
        T value = mutableLiveData.getValue();
        Intrinsics.copydefault(value);
        mutableLiveData.setValue(C22332hdP.EZpvd(((TradeInputGroup) ((ConsumeData) value).getData()).setToBalance(coinState.getShowData(), coinState.getOriginData(), coinState.getErrorType(), true)));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssetsHandle */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkFromBalance$default(CoinAssetsHandle coinAssetsHandle, MutableLiveData mutableLiveData, AbstractC23101hrq abstractC23101hrq, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFromBalance");
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        coinAssetsHandle.checkFromBalance(mutableLiveData, abstractC23101hrq, function0);
    }

    public final void checkFromBalance(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull AbstractC23101hrq abstractC23101hrq, Function0<Unit> function0) {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || !data2.getBalance().getFinish()) {
            return;
        }
        if (C23313hvq.KWHzl(data2.getBalance().getData(), data2.getEditData().getData())) {
            if (function0 != null) {
                function0.invoke();
            }
            abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.BALANCE, true, SwapState.INSUFFICIENT_BALANCE, true, false));
            return;
        }
        abstractC23101hrq.dHguZz().refreshStatePool(new TradeStep(CheckStep.BALANCE, true, SwapState.BALANCE_SUCCESS, false, true));
    }

    public final void setFromContent(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (mutableLiveData.getValue() != null) {
            ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
            Intrinsics.copydefault(value);
            EditTextData editData = value.getData().getFromData().getData().getEditData();
            EditTextData editTextDataCopy = editData.copy((32749 & 1) != 0 ? editData.content : str.length() != 0 ? C23311hvo.AEQbTJ(str) : "", (32749 & 2) != 0 ? editData.label : null, (32749 & 4) != 0 ? editData.data : str2, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : true, (32749 & 64) != 0 ? editData.resetFoucs : true, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : str2, (32749 & 2048) != 0 ? editData.originPrice : null, (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false);
            ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
            Intrinsics.copydefault(value2);
            TradeInputData tradeInputDataCopy$default = TradeInputData.copy$default(value2.getData().getFromData().getData(), null, null, editTextDataCopy, false, 11, null);
            ConsumeData<TradeInputGroup> value3 = mutableLiveData.getValue();
            Intrinsics.copydefault(value3);
            mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.copy$default(value3.getData(), C22332hdP.EZpvd(tradeInputDataCopy$default), null, null, 6, null)));
        }
    }

    public final void setToContent(@NotNull MutableLiveData<ConsumeData<TradeInputGroup>> mutableLiveData, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (mutableLiveData.getValue() != null) {
            ConsumeData<TradeInputGroup> value = mutableLiveData.getValue();
            Intrinsics.copydefault(value);
            EditTextData editData = value.getData().getToData().getData().getEditData();
            EditTextData editTextDataCopy = editData.copy((32749 & 1) != 0 ? editData.content : C23311hvo.AEQbTJ(str), (32749 & 2) != 0 ? editData.label : null, (32749 & 4) != 0 ? editData.data : null, (32749 & 8) != 0 ? editData.checkData : null, (32749 & 16) != 0 ? editData.status : 0, (32749 & 32) != 0 ? editData.setInput : true, (32749 & 64) != 0 ? editData.resetFoucs : true, (32749 & 128) != 0 ? editData.secondLabel : null, (32749 & 256) != 0 ? editData.secondDataLabel : null, (32749 & 512) != 0 ? editData.isWarning : false, (32749 & 1024) != 0 ? editData.maxData : str2, (32749 & 2048) != 0 ? editData.originPrice : null, (32749 & 4096) != 0 ? editData.reverseInputData : null, (32749 & 8192) != 0 ? editData.needForbidden : false, (32749 & 16384) != 0 ? editData.isLimit : false);
            ConsumeData<TradeInputGroup> value2 = mutableLiveData.getValue();
            Intrinsics.copydefault(value2);
            TradeInputData tradeInputDataCopy$default = TradeInputData.copy$default(value2.getData().getToData().getData(), null, null, editTextDataCopy, false, 11, null);
            ConsumeData<TradeInputGroup> value3 = mutableLiveData.getValue();
            Intrinsics.copydefault(value3);
            mutableLiveData.setValue(C22332hdP.EZpvd(TradeInputGroup.copy$default(value3.getData(), null, C22332hdP.EZpvd(tradeInputDataCopy$default), null, 5, null)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showAddFundsDialog(@NotNull String str, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull AbstractC23101hrq abstractC23101hrq) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(str).fARcdN();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        String str3 = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = abstractC23101hrq.QUSxYX().copydefault();
        if (dexMultiTokenInfoBeanCopydefault2 == null || !dexMultiTokenInfoBeanCopydefault2.isMainChainCoin()) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = abstractC23101hrq.QUSxYX().copydefault();
            String originContractAddress = dexMultiTokenInfoBeanCopydefault3 != null ? dexMultiTokenInfoBeanCopydefault3.getOriginContractAddress() : null;
            str2 = originContractAddress == null ? "" : originContractAddress;
        }
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, abstractActivityC33041mov, str3, str2, null, null, null, 56, null);
    }
}
