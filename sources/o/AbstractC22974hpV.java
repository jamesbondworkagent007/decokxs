package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.ReserveInfoBean;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.Permit2Data;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.QuoteCallDataReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.dexlogic.error.NoWalletWithMassageException;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hpV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC22974hpV {
    public AbstractC23102hrr EZpvd;
    public final AbstractC22977hpY KWHzl;
    public InterfaceC9734bbF OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(java.lang.String str) {
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return "";
    }

    public abstract AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> AEQbTJ(@NotNull QuotePriceRes quotePriceRes, @NotNull MergeCallData mergeCallData, @NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    public abstract void AEQbTJ(@NotNull QuotePriceRes quotePriceRes);

    public boolean AhwBna() {
        return false;
    }

    public abstract AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull MergeQuoteCallData mergeQuoteCallData, InterfaceC9734bbF interfaceC9734bbF, @NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull InterfaceC9734bbF interfaceC9734bbF) {
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        this.OLrzqt = interfaceC9734bbF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC9734bbF djBIcL() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.copydefault;
    }

    public abstract void isConnected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC22977hpY valueOf() {
        return this.KWHzl;
    }

    public AbstractC22974hpV(@NotNull java.lang.String str, @NotNull AbstractC22977hpY abstractC22977hpY) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC22977hpY, "");
        this.copydefault = str;
        this.KWHzl = abstractC22977hpY;
    }

    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(@NotNull BaseSignData baseSignData, InterfaceC9734bbF interfaceC9734bbF) {
        Intrinsics.checkNotNullParameter(baseSignData, "");
        if (interfaceC9734bbF != null) {
            return interfaceC9734bbF.AEQbTJ(baseSignData);
        }
        return null;
    }

    public AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(@NotNull java.lang.String str, InterfaceC9734bbF interfaceC9734bbF) {
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC9734bbF != null) {
            return interfaceC9734bbF.copydefault(str);
        }
        return null;
    }

    public AbstractC58185ywX<Triple<InterfaceC9734bbF, java.lang.String, java.lang.Object>> copydefault(@NotNull QuotePriceRes quotePriceRes, boolean z, @NotNull MergeCallData mergeCallData, java.lang.String str, @NotNull TeeSaStatus teeSaStatus) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(mergeCallData, "");
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
        return C23016hqK.copydefault.KWHzl(quotePriceRes, this, z, this.KWHzl, mergeCallData, str, teeSaStatus);
    }

    public SwapOrderInfoReq OLrzqt(@NotNull QuotePriceRes quotePriceRes, @NotNull NewCallbackBean newCallbackBean, boolean z, java.lang.String str, MevConfig mevConfig, final java.lang.String str2) {
        kotlin.Pair<JsonObject, java.lang.String> pairEZpvd;
        java.lang.String str3;
        MevConfig mevConfig2;
        java.util.ArrayList<UpdateMultiOrderInfo> arrayList;
        UpdateMultiOrderInfo updateMultiOrderInfo;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        java.lang.String strKWHzl = C31256lqb.KWHzl(C22380heK.OLrzqt.copydefault(this.copydefault).DbNXlk().copydefault(), (Function0<java.lang.String>) new Function0() { // from class: o.hqx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC22974hpV.EZpvd(str2);
            }
        });
        if (newCallbackBean.isBatch()) {
            java.util.ArrayList<UpdateMultiOrderInfo> arrayListEZpvd = C25189iry.EZpvd(this.copydefault, newCallbackBean.getBody(), z, strKWHzl);
            if (arrayListEZpvd.isEmpty()) {
                return new SwapOrderInfoReq(null, null, null, null, 15, null);
            }
            str3 = str;
            mevConfig2 = mevConfig;
            arrayList = arrayListEZpvd;
            pairEZpvd = null;
        } else {
            pairEZpvd = C25189iry.EZpvd(this.copydefault, newCallbackBean.getBody(), z);
            if (pairEZpvd.getFirst() == null || pairEZpvd.getSecond().length() == 0) {
                return new SwapOrderInfoReq(null, null, null, null, 15, null);
            }
            str3 = str;
            mevConfig2 = mevConfig;
            arrayList = null;
        }
        DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReqKWHzl = KWHzl(quotePriceRes, z, str3, mevConfig2);
        if (pairEZpvd != null) {
            updateMultiOrderInfo = new UpdateMultiOrderInfo(strKWHzl == null ? "" : strKWHzl, pairEZpvd.getSecond(), pairEZpvd.getFirst(), null, newCallbackBean.getHeaderMap().get("sign"), 8, null);
        } else {
            updateMultiOrderInfo = null;
        }
        SwapOrderInfoReq swapOrderInfoReq = new SwapOrderInfoReq(defiMultiSwapOrderInfoReqKWHzl, updateMultiOrderInfo, arrayList, quotePriceRes.getTraceData());
        DefiMultiSwapOrderInfoReq dexMultiMetaSaveOrderParam = swapOrderInfoReq.getDexMultiMetaSaveOrderParam();
        if (dexMultiMetaSaveOrderParam != null) {
            TransactionBean transactionBeanFJNWhG = this.KWHzl.fJNWhG();
            java.lang.String mevInfo = transactionBeanFJNWhG != null ? transactionBeanFJNWhG.getMevInfo() : null;
            dexMultiMetaSaveOrderParam.setMevInfo(mevInfo != null ? mevInfo : "");
            TransactionBean transactionBeanFJNWhG2 = this.KWHzl.fJNWhG();
            dexMultiMetaSaveOrderParam.setOpenMev(transactionBeanFJNWhG2 != null ? transactionBeanFJNWhG2.getOpenMev() : false);
            TransactionBean transactionBeanFJNWhG3 = this.KWHzl.fJNWhG();
            dexMultiMetaSaveOrderParam.setReceiveWalletAddress(transactionBeanFJNWhG3 != null ? transactionBeanFJNWhG3.getReceiveWalletAddress() : null);
            dexMultiMetaSaveOrderParam.setOrderId(strKWHzl);
        }
        return swapOrderInfoReq;
    }

    /* JADX INFO: renamed from: o.hpV$Activity */
    public static final class Activity implements Function1 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            AEQbTJ((InterfaceC9752bbX) obj);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(InterfaceC9752bbX interfaceC9752bbX) {
            AbstractC22974hpV.this.valueOf().fIwbmz().setValue(interfaceC9752bbX);
        }
    }

    public void OLrzqt(@NotNull InterfaceC9734bbF interfaceC9734bbF, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(interfaceC9734bbF.AkhnZx(), lifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Activity activity = new Activity();
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.AubY(activity, obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: o.hqA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.zsXlph(function1, obj);
            }
        });
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull InterfaceC9734bbF interfaceC9734bbF, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(interfaceC9734bbF, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(interfaceC9734bbF.isConnected(), lifecycleOwner, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.hpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.KWHzl(this.OLrzqt, (AbstractC9832bcy) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.AuCTelauCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hqy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.zLjUOn(function12, obj);
            }
        });
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC22974hpV abstractC22974hpV, AbstractC9832bcy abstractC9832bcy) {
        if (!Intrinsics.EZpvd(abstractC22974hpV.KWHzl.valueOf().getValue(), abstractC9832bcy)) {
            abstractC22974hpV.KWHzl.valueOf().setValue(abstractC9832bcy);
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public AbstractC58185ywX<java.lang.String> EZpvd(@NotNull QuotePriceRes quotePriceRes, @NotNull MergeQuoteCallDataReq mergeQuoteCallDataReq, @NotNull final LifecycleOwner lifecycleOwner, boolean z) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(mergeQuoteCallDataReq, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(this.copydefault).fARcdN().AEQbTJ();
        boolean fieldNames = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.getFieldNames() : false;
        final java.lang.String userWalletAddress = mergeQuoteCallDataReq.getUserWalletAddress(fieldNames, false);
        if (userWalletAddress.length() == 0) {
            boolean z2 = interfaceC9738bbJAEQbTJ == null;
            C6777aVl.Companion.EZpvd(new NoWalletWithMassageException("getQuoteOrCallData walletEmpty error: wallet is empty:  " + z2 + " isAAWallet = " + fieldNames + "  chainId = " + mergeQuoteCallDataReq.getEoaQuoteCallDataReq().getChainId() + " "));
            return C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hqt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    AbstractC22974hpV.EZpvd(interfaceC58184ywW);
                }
            });
        }
        final AbstractC58185ywX<ResponseData<MergeQuoteCallData>> abstractC58185ywXKWHzl = C23020hqO.OLrzqt.AEQbTJ().OLrzqt(this.copydefault, fieldNames, C56424yEw.KWHzl(), mergeQuoteCallDataReq, z).KWHzl(C58266yxz.OLrzqt());
        final boolean z3 = fieldNames;
        AbstractC58185ywX<java.lang.String> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                AbstractC22974hpV.AEQbTJ(objectRef, abstractC58185ywXKWHzl, z3, this, userWalletAddress, lifecycleOwner, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                AbstractC22974hpV.KWHzl(objectRef);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXCopydefault);
        return abstractC58185ywXCopydefault;
    }

    public static final void EZpvd(InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onError(new NoWalletWithMassageException(C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu)));
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [T, o.yxC] */
    public static final void AEQbTJ(Ref.ObjectRef objectRef, AbstractC58185ywX abstractC58185ywX, final boolean z, final AbstractC22974hpV abstractC22974hpV, final java.lang.String str, final LifecycleOwner lifecycleOwner, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Function1 function1 = new Function1() { // from class: o.hqM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.EZpvd(z, abstractC22974hpV, str, lifecycleOwner, interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.iwGUEr(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.KWHzl(this.AEQbTJ, interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywX.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.uzCIH(function12, obj);
            }
        });
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(boolean z, final AbstractC22974hpV abstractC22974hpV, java.lang.String str, LifecycleOwner lifecycleOwner, final InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        AbstractC58260yxt abstractC58260yxtAEQbTJ;
        MergeQuoteCallData mergeQuoteCallData = (MergeQuoteCallData) responseData.getData();
        if (mergeQuoteCallData != null) {
            final QuotePriceRes quoteResult = mergeQuoteCallData.getQuoteResult(z, false);
            abstractC22974hpV.KWHzl.hDKMBd().setValue(quoteResult);
            AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtEZpvd = abstractC22974hpV.EZpvd(z, mergeQuoteCallData, abstractC22974hpV.djBIcL(), str);
            if (abstractC58260yxtEZpvd != null && (abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(abstractC58260yxtEZpvd, lifecycleOwner, Lifecycle.Event.ON_DESTROY)) != null) {
                final Function1 function1 = new Function1() { // from class: o.hqk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC22974hpV.AEQbTJ(this.EZpvd, quoteResult, interfaceC58184ywW, (kotlin.Pair) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hqo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC22974hpV.fIwbmz(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.hqq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC22974hpV.djBIcL(interfaceC58184ywW, abstractC22974hpV, (java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hqs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        AbstractC22974hpV.getNewProxyInstance(function12, obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractC22974hpV abstractC22974hpV, QuotePriceRes quotePriceRes, InterfaceC58184ywW interfaceC58184ywW, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            abstractC22974hpV.KWHzl.getFieldNames().setValue(quotePriceRes);
            abstractC22974hpV.isConnected();
            InterfaceC9734bbF interfaceC9734bbF = abstractC22974hpV.OLrzqt;
            abstractC22974hpV.KWHzl.uzCIH().setValue(interfaceC9734bbF != null ? interfaceC9734bbF.fetchVPNInfo() : null);
            abstractC22974hpV.KWHzl.iwGUEr().setValue(java.lang.Boolean.TRUE);
            interfaceC58184ywW.onNext("");
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception((java.lang.String) pair.getSecond()));
        }
        abstractC22974hpV.KWHzl.DbNXlk().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(InterfaceC58184ywW interfaceC58184ywW, AbstractC22974hpV abstractC22974hpV, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        abstractC22974hpV.KWHzl.DbNXlk().setValue(java.lang.Boolean.FALSE);
        abstractC22974hpV.KWHzl.fARcdN().setValue(th);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractC22974hpV abstractC22974hpV, InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        abstractC22974hpV.KWHzl.fARcdN().setValue(th);
        interfaceC58184ywW.onError(th);
        abstractC22974hpV.KWHzl.DbNXlk().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public AbstractC58185ywX<java.lang.String> AEQbTJ(@NotNull final QuotePriceRes quotePriceRes, @NotNull final AbstractC58185ywX<MergeCallData> abstractC58185ywX, @NotNull LifecycleOwner lifecycleOwner, boolean z) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<java.lang.String> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                AbstractC22974hpV.AEQbTJ(objectRef, abstractC58185ywX, this, quotePriceRes, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                AbstractC22974hpV.OLrzqt(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, o.yxC] */
    public static final void AEQbTJ(Ref.ObjectRef objectRef, AbstractC58185ywX abstractC58185ywX, final AbstractC22974hpV abstractC22974hpV, final QuotePriceRes quotePriceRes, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Function1 function1 = new Function1() { // from class: o.hqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.OLrzqt(this.AEQbTJ, quotePriceRes, interfaceC58184ywW, (MergeCallData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.fARcdN(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.copydefault(interfaceC58184ywW, abstractC22974hpV, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywX.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC22974hpV.AuCTel(function12, obj);
            }
        });
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final AbstractC22974hpV abstractC22974hpV, QuotePriceRes quotePriceRes, final InterfaceC58184ywW interfaceC58184ywW, final MergeCallData mergeCallData) {
        AbstractC58260yxt<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58260yxtEZpvd;
        if (C22380heK.OLrzqt.copydefault(abstractC22974hpV.KWHzl.fetchVPNInfo()).fARcdN().EZpvd(C33129mqd.valueOf(quotePriceRes.fromToken().getChainId()))) {
            MutableLiveData<QuotePriceRes> mutableLiveDataHDKMBd = abstractC22974hpV.KWHzl.hDKMBd();
            UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
            mutableLiveDataHDKMBd.setValue(unsingedCallData != null ? unsingedCallData.getQuoteResult() : null);
            UnsignedSwapData unsingedCallData2 = mergeCallData.getUnsingedCallData();
            java.lang.String unsignedTx = unsingedCallData2 != null ? unsingedCallData2.getUnsignedTx() : null;
            if (unsignedTx == null) {
                unsignedTx = "";
            }
            abstractC58260yxtEZpvd = abstractC22974hpV.OLrzqt(unsignedTx, abstractC22974hpV.djBIcL());
        } else {
            BaseSignData baseSignDataAEQbTJ = abstractC22974hpV.AEQbTJ(mergeCallData.getUnsingedCallData());
            MutableLiveData<QuotePriceRes> mutableLiveDataHDKMBd2 = abstractC22974hpV.KWHzl.hDKMBd();
            UnsignedSwapData unsingedCallData3 = mergeCallData.getUnsingedCallData();
            mutableLiveDataHDKMBd2.setValue(unsingedCallData3 != null ? unsingedCallData3.getQuoteResult() : null);
            abstractC58260yxtEZpvd = abstractC22974hpV.EZpvd(baseSignDataAEQbTJ, abstractC22974hpV.djBIcL());
        }
        if (abstractC58260yxtEZpvd != null) {
            final Function1 function1 = new Function1() { // from class: o.hqH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC22974hpV.copydefault(this.EZpvd, mergeCallData, interfaceC58184ywW, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hqI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC22974hpV.ejfBZ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hqE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC22974hpV.EZpvd(interfaceC58184ywW, abstractC22974hpV, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hqF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    AbstractC22974hpV.fJNWhG(function12, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC22974hpV abstractC22974hpV, MergeCallData mergeCallData, InterfaceC58184ywW interfaceC58184ywW, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            MutableLiveData<QuotePriceRes> fieldNames = abstractC22974hpV.KWHzl.getFieldNames();
            UnsignedSwapData unsingedCallData = mergeCallData.getUnsingedCallData();
            fieldNames.setValue(unsingedCallData != null ? unsingedCallData.getQuoteResult() : null);
            abstractC22974hpV.KWHzl.iwGUEr().setValue(java.lang.Boolean.TRUE);
            interfaceC58184ywW.onNext("");
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception((java.lang.String) pair.getSecond()));
        }
        abstractC22974hpV.KWHzl.DbNXlk().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, AbstractC22974hpV abstractC22974hpV, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        abstractC22974hpV.KWHzl.DbNXlk().setValue(java.lang.Boolean.FALSE);
        abstractC22974hpV.KWHzl.fARcdN().setValue(th);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, AbstractC22974hpV abstractC22974hpV, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        abstractC22974hpV.KWHzl.DbNXlk().setValue(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public final BaseSignData AEQbTJ(UnsignedSwapData unsignedSwapData) {
        java.lang.String unsignedTx = unsignedSwapData != null ? unsignedSwapData.getUnsignedTx() : null;
        java.lang.String str = unsignedTx == null ? "" : unsignedTx;
        SignType signType = SignType.TYPED_MESSAGE;
        java.lang.String unsignedTx2 = unsignedSwapData != null ? unsignedSwapData.getUnsignedTx() : null;
        return new EVMMessageSignData(str, false, null, signType, unsignedTx2 == null ? "" : unsignedTx2, null, null, 102, null);
    }

    public DefiMultiSwapOrderInfoReq KWHzl(@NotNull QuotePriceRes quotePriceRes, boolean z, java.lang.String str, MevConfig mevConfig) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        C23016hqK c23016hqK = C23016hqK.copydefault;
        java.lang.String str2 = this.copydefault;
        java.lang.String walletAddressByType$default = AbstractC22977hpY.getWalletAddressByType$default(this.KWHzl, quotePriceRes.fromToken().getChainId(), null, 2, null);
        TransactionBean transactionBeanFJNWhG = this.KWHzl.fJNWhG();
        boolean zAhwBna = AhwBna();
        return c23016hqK.AEQbTJ(str2, quotePriceRes, z, walletAddressByType$default, transactionBeanFJNWhG, str, java.lang.Boolean.valueOf(zAhwBna), mevConfig, AYXKKw());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100 A[PHI: r9
  0x0100: PHI (r9v10 java.lang.String) = (r9v8 java.lang.String), (r9v29 java.lang.String) binds: [B:58:0x00fe, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104 A[PHI: r9
  0x0104: PHI (r9v27 java.lang.String) = (r9v8 java.lang.String), (r9v29 java.lang.String) binds: [B:58:0x00fe, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MergeQuoteCallDataReq AEQbTJ(@NotNull QuotePriceRes quotePriceRes, java.lang.String str) {
        java.lang.String fromTokenAmount;
        java.lang.String maxSlippage;
        java.lang.String strAutoSlippage;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String strAEQbTJ;
        java.lang.String str4;
        DexQuoteBridgeVO bridge;
        Permit2Data permit2Data;
        DexQuoteBridgeVO bridge2;
        TransactionBean transactionBeanFJNWhG;
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
        DexMultiTokenInfoBean token = quotePriceRes.toToken();
        java.lang.String chainId = dexMultiTokenInfoBeanFromToken.getChainId();
        java.lang.String chainId2 = token.getChainId();
        C22380heK c22380heK = C22380heK.OLrzqt;
        java.lang.String strKWHzl = c22380heK.copydefault(this.copydefault).fARcdN().KWHzl(chainId);
        java.lang.String originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress();
        java.lang.String decimals = dexMultiTokenInfoBeanFromToken.getDecimals();
        java.lang.String originContractAddress2 = token.getOriginContractAddress();
        java.lang.String decimals2 = token.getDecimals();
        java.lang.String strAEQbTJ2 = c22380heK.copydefault(this.copydefault).DbNXlk().AEQbTJ();
        InterfaceC9734bbF interfaceC9734bbFDjBIcL = djBIcL();
        ReserveInfoBean reserveInfoBeanValues = interfaceC9734bbFDjBIcL != null ? interfaceC9734bbFDjBIcL.values() : null;
        C23212htv c23212htvAYXKKw = AYXKKw();
        java.lang.String reservedAmount = reserveInfoBeanValues != null ? reserveInfoBeanValues.getReservedAmount() : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) reservedAmount)) {
            InterfaceC23194htd interfaceC23194htdFARcdN = c22380heK.copydefault(this.copydefault).fARcdN();
            Intrinsics.copydefault((java.lang.Object) reservedAmount);
            fromTokenAmount = interfaceC23194htdFARcdN.KWHzl(reservedAmount, reserveInfoBeanValues != null ? reserveInfoBeanValues.getPrecision() : C33129mqd.AhwBna(dexMultiTokenInfoBeanFromToken.getDecimals()));
        } else {
            fromTokenAmount = quotePriceRes.getFromTokenAmount(false);
        }
        java.lang.Boolean customPriorityFee = (!quotePriceRes.isSingle() || (transactionBeanFJNWhG = this.KWHzl.fJNWhG()) == null) ? null : transactionBeanFJNWhG.getCustomPriorityFee();
        TransactionBean transactionBeanFJNWhG2 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG2 == null) {
            maxSlippage = null;
        } else {
            if (transactionBeanFJNWhG2.getSlippageMode() != SlippageMode.Dynamic) {
                transactionBeanFJNWhG2 = null;
            }
            if (transactionBeanFJNWhG2 != null) {
                maxSlippage = transactionBeanFJNWhG2.getMaxSlippage();
            }
        }
        TransactionBean transactionBeanFJNWhG3 = this.KWHzl.fJNWhG();
        boolean z = (transactionBeanFJNWhG3 != null ? transactionBeanFJNWhG3.getSlippageMode() : null) == SlippageMode.Dynamic;
        TransactionBean transactionBeanFJNWhG4 = this.KWHzl.fJNWhG();
        java.lang.String spSlipPage = transactionBeanFJNWhG4 != null ? transactionBeanFJNWhG4.getSpSlipPage() : null;
        java.lang.String str5 = spSlipPage != null ? spSlipPage : "";
        if (quotePriceRes.isSingle()) {
            strAutoSlippage = z ? quotePriceRes.autoSlippage() : null;
            if (z) {
                str2 = strAutoSlippage;
                str3 = null;
            } else {
                str3 = str5;
                str2 = strAutoSlippage;
            }
        } else {
            strAutoSlippage = z ? quotePriceRes.autoSlippage() : str5;
            if (z) {
            }
        }
        if (quotePriceRes.isSingle()) {
            TransactionBean transactionBeanFJNWhG5 = this.KWHzl.fJNWhG();
            if (transactionBeanFJNWhG5 == null) {
                str4 = null;
                java.lang.String str6 = !quotePriceRes.isCrossChain() ? str2 : null;
                TransactionBean transactionBeanFJNWhG6 = this.KWHzl.fJNWhG();
                java.lang.String receiveWalletAddress = transactionBeanFJNWhG6 == null ? transactionBeanFJNWhG6.getReceiveWalletAddress() : null;
                DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = !quotePriceRes.isCrossChain() ? quotePriceRes.autoSlippageInfo() : null;
                TransactionBean transactionBeanFJNWhG7 = this.KWHzl.fJNWhG();
                DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam = new DexMultiMetaSaveOrderParam(dexAutoSlippageInfoParamAutoSlippageInfo, str3, transactionBeanFJNWhG7 == null ? transactionBeanFJNWhG7.getTradeModeValue() : TradeMode.SwapMode.getType(), !quotePriceRes.isSingle() ? maxSlippage : null, str2);
                java.util.List<java.lang.String> value = c22380heK.copydefault(this.copydefault).copydefault().gEmmrt().OLrzqt().getValue();
                PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
                java.lang.String bridgeId = (selectRouterItem$default != null || (bridge2 = selectRouterItem$default.getBridge()) == null) ? null : bridge2.getBridgeId();
                DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
                java.lang.String defiPlatformId = selectedDeFiPlatform == null ? selectedDeFiPlatform.getDefiPlatformId() : null;
                DeFiPlatformForSwap selectedDeFiPlatform2 = quotePriceRes.getSelectedDeFiPlatform();
                java.lang.String unsignedTx = (selectedDeFiPlatform2 != null || (permit2Data = selectedDeFiPlatform2.getPermit2Data()) == null) ? null : permit2Data.getUnsignedTx();
                boolean zAhwBna = !quotePriceRes.isSingle() ? false : AhwBna();
                DeFiPlatformForSwap selectedDeFiPlatform3 = quotePriceRes.getSelectedDeFiPlatform();
                ServiceFeeInfo serviceFeeInfo = selectedDeFiPlatform3 == null ? selectedDeFiPlatform3.getServiceFeeInfo() : null;
                java.lang.String strOLrzqt = c23212htvAYXKKw.OLrzqt(chainId);
                java.lang.String strCopydefault = c23212htvAYXKKw.copydefault(chainId);
                TransactionBean transactionBeanFJNWhG8 = this.KWHzl.fJNWhG();
                java.lang.String mevInfo = transactionBeanFJNWhG8 == null ? transactionBeanFJNWhG8.getMevInfo() : null;
                TransactionBean transactionBeanFJNWhG9 = this.KWHzl.fJNWhG();
                java.lang.String priorityFeeType = transactionBeanFJNWhG9 == null ? transactionBeanFJNWhG9.getPriorityFeeType() : null;
                TransactionBean transactionBeanFJNWhG10 = this.KWHzl.fJNWhG();
                java.lang.String gasPrice = transactionBeanFJNWhG10 == null ? transactionBeanFJNWhG10.getGasPrice() : null;
                TransactionBean transactionBeanFJNWhG11 = this.KWHzl.fJNWhG();
                AccountInfo accountInfo = transactionBeanFJNWhG11 == null ? transactionBeanFJNWhG11.getAccountInfo() : null;
                TransactionBean transactionBeanFJNWhG12 = this.KWHzl.fJNWhG();
                PresetRouteType routerModeType = transactionBeanFJNWhG12 == null ? transactionBeanFJNWhG12.getRouterModeType() : null;
                TransactionBean transactionBeanFJNWhG13 = this.KWHzl.fJNWhG();
                java.lang.String str7 = fromTokenAmount;
                java.lang.String str8 = str2;
                QuoteCallDataReq quoteCallDataReq = new QuoteCallDataReq(fromTokenAmount, str6, strKWHzl, chainId, chainId2, originContractAddress, decimals, originContractAddress2, decimals2, "1", receiveWalletAddress, dexMultiMetaSaveOrderParam, value, strAEQbTJ2, bridgeId, defiPlatformId, unsignedTx, str, zAhwBna, str4, customPriorityFee, serviceFeeInfo, strOLrzqt, strCopydefault, mevInfo, priorityFeeType, gasPrice, accountInfo, routerModeType, transactionBeanFJNWhG13 == null ? transactionBeanFJNWhG13.getSlippageMode() : null);
                PathSelectionRouterItem selectRouterItem$default2 = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
                java.lang.String bridgeId2 = (selectRouterItem$default2 != null || (bridge = selectRouterItem$default2.getBridge()) == null) ? null : bridge.getBridgeId();
                TransactionBean transactionBeanFJNWhG14 = this.KWHzl.fJNWhG();
                return new MergeQuoteCallDataReq(quoteCallDataReq, new IntentBridgeQuoteCallDataReq(bridgeId2, str8, chainId2, transactionBeanFJNWhG14 == null ? transactionBeanFJNWhG14.getReceiveWalletAddress() : null, strKWHzl, chainId, originContractAddress, originContractAddress2, str7));
            }
            strAEQbTJ = transactionBeanFJNWhG5.getPriorityFee();
        } else {
            strAEQbTJ = AEQbTJ();
        }
        str4 = strAEQbTJ;
        if (!quotePriceRes.isCrossChain()) {
        }
        TransactionBean transactionBeanFJNWhG62 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG62 == null) {
        }
        if (!quotePriceRes.isCrossChain()) {
        }
        TransactionBean transactionBeanFJNWhG72 = this.KWHzl.fJNWhG();
        DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam2 = new DexMultiMetaSaveOrderParam(dexAutoSlippageInfoParamAutoSlippageInfo, str3, transactionBeanFJNWhG72 == null ? transactionBeanFJNWhG72.getTradeModeValue() : TradeMode.SwapMode.getType(), !quotePriceRes.isSingle() ? maxSlippage : null, str2);
        java.util.List<java.lang.String> value2 = c22380heK.copydefault(this.copydefault).copydefault().gEmmrt().OLrzqt().getValue();
        PathSelectionRouterItem selectRouterItem$default3 = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
        if (selectRouterItem$default3 != null) {
        }
        DeFiPlatformForSwap selectedDeFiPlatform4 = quotePriceRes.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform4 == null) {
        }
        DeFiPlatformForSwap selectedDeFiPlatform22 = quotePriceRes.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform22 != null) {
        }
        if (!quotePriceRes.isSingle()) {
        }
        DeFiPlatformForSwap selectedDeFiPlatform32 = quotePriceRes.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform32 == null) {
        }
        java.lang.String strOLrzqt2 = c23212htvAYXKKw.OLrzqt(chainId);
        java.lang.String strCopydefault2 = c23212htvAYXKKw.copydefault(chainId);
        TransactionBean transactionBeanFJNWhG82 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG82 == null) {
        }
        TransactionBean transactionBeanFJNWhG92 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG92 == null) {
        }
        TransactionBean transactionBeanFJNWhG102 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG102 == null) {
        }
        TransactionBean transactionBeanFJNWhG112 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG112 == null) {
        }
        TransactionBean transactionBeanFJNWhG122 = this.KWHzl.fJNWhG();
        if (transactionBeanFJNWhG122 == null) {
        }
        TransactionBean transactionBeanFJNWhG132 = this.KWHzl.fJNWhG();
        java.lang.String str72 = fromTokenAmount;
        java.lang.String str82 = str2;
        QuoteCallDataReq quoteCallDataReq2 = new QuoteCallDataReq(fromTokenAmount, str6, strKWHzl, chainId, chainId2, originContractAddress, decimals, originContractAddress2, decimals2, "1", receiveWalletAddress, dexMultiMetaSaveOrderParam2, value2, strAEQbTJ2, bridgeId, defiPlatformId, unsignedTx, str, zAhwBna, str4, customPriorityFee, serviceFeeInfo, strOLrzqt2, strCopydefault2, mevInfo, priorityFeeType, gasPrice, accountInfo, routerModeType, transactionBeanFJNWhG132 == null ? transactionBeanFJNWhG132.getSlippageMode() : null);
        PathSelectionRouterItem selectRouterItem$default22 = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
        if (selectRouterItem$default22 != null) {
        }
        TransactionBean transactionBeanFJNWhG142 = this.KWHzl.fJNWhG();
        return new MergeQuoteCallDataReq(quoteCallDataReq2, new IntentBridgeQuoteCallDataReq(bridgeId2, str82, chainId2, transactionBeanFJNWhG142 == null ? transactionBeanFJNWhG142.getReceiveWalletAddress() : null, strKWHzl, chainId, originContractAddress, originContractAddress2, str72));
    }

    public void AkhnZx() {
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.OLrzqt();
        }
        this.EZpvd = null;
        TaskDescription taskDescription = new TaskDescription(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US, 1000L, this);
        this.EZpvd = taskDescription;
        taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.hpV$TaskDescription */
    public static final class TaskDescription extends AbstractC23102hrr {
        public final /* synthetic */ AbstractC22974hpV EZpvd;

        @Override // o.AbstractC23102hrr
        public void AEQbTJ(long j) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(long j, long j2, AbstractC22974hpV abstractC22974hpV) {
            super(j, j2);
            this.EZpvd = abstractC22974hpV;
        }

        @Override // o.AbstractC23102hrr
        public void copydefault() {
            this.EZpvd.valueOf().getNewProxyInstance().setValue(java.lang.Boolean.TRUE);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull final java.lang.String str, @NotNull final QuotePriceRes quotePriceRes, @NotNull NewCallbackBean newCallbackBean, @NotNull final SwapOrderInfoReq swapOrderInfoReq, final boolean z, UnsignedSwapData unsignedSwapData, @NotNull java.lang.String str2, @NotNull TeeSaStatus teeSaStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(swapOrderInfoReq, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(teeSaStatus, "");
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.KWHzl();
        }
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = C23020hqO.OLrzqt.AEQbTJ().KWHzl(this.copydefault, newCallbackBean, swapOrderInfoReq, unsignedSwapData, str2, teeSaStatus);
        final Function1 function1 = new Function1() { // from class: o.hqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.copydefault(str, quotePriceRes, swapOrderInfoReq, this, z, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC22974hpV.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(java.lang.String str, QuotePriceRes quotePriceRes, SwapOrderInfoReq swapOrderInfoReq, AbstractC22974hpV abstractC22974hpV, boolean z, final ResponseData responseData) throws OKServerException {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(responseData, "");
        try {
            str2 = (java.lang.String) responseData.getData();
        } catch (java.lang.Exception unused) {
            str2 = "";
        }
        if (responseData.getCode() == 0) {
            C25189iry.AEQbTJ(responseData, str, quotePriceRes, swapOrderInfoReq, abstractC22974hpV.copydefault, abstractC22974hpV.KWHzl, z, abstractC22974hpV.djBIcL());
            return ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), responseData.getCode(), responseData.getMsg(), null, null, str2, null, 44, null);
        }
        AbstractC23102hrr abstractC23102hrr = abstractC22974hpV.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.EZpvd();
        }
        throw new OKServerException(responseData.getCode(), C31256lqb.KWHzl(responseData.getMsg(), (Function0<java.lang.String>) new Function0() { // from class: o.hqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC22974hpV.AYXKKw(responseData);
            }
        }), null, null, 12, null);
    }

    public static final java.lang.String AYXKKw(ResponseData responseData) {
        return C31256lqb.KWHzl(responseData.getDetailMsg(), (Function0<java.lang.String>) new Function0() { // from class: o.hqG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC22974hpV.copydefault();
            }
        });
    }

    public static final java.lang.String copydefault() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu);
    }

    /* JADX DEBUG: Type inference failed for r10v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public AbstractC58185ywX<ResponseData<java.lang.String>> KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, boolean z, java.lang.String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.KWHzl();
        }
        AbstractC58185ywX<ResponseData<SaveIntentData>> abstractC58185ywXCopydefault = C22380heK.OLrzqt.copydefault(this.copydefault).DbNXlk().copydefault(str2, str, str3, z, str4, i);
        final Function1 function1 = new Function1() { // from class: o.hqD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hqB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC22974hpV.hDKMBd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        int code = responseData.getCode();
        java.lang.String error_code = responseData.getError_code();
        SaveIntentData saveIntentData = (SaveIntentData) responseData.getData();
        return ResponseData.copy$default(responseData2, code, responseData.getMsg(), null, null, C33129mqd.gEmmrt(saveIntentData != null ? saveIntentData.getOrderId() : null), error_code, 12, null);
    }

    /* JADX DEBUG: Type inference failed for r2v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, java.lang.String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.KWHzl();
        }
        AbstractC58185ywX<ResponseData<SaveIntentData>> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(this.copydefault).DbNXlk().EZpvd(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
        final Function1 function1 = new Function1() { // from class: o.hqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC22974hpV.EZpvd((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC22974hpV.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
        SaveIntentData saveIntentData = (SaveIntentData) responseData.getData();
        return ResponseData.copy$default(responseData2, 0, null, null, null, C33129mqd.gEmmrt(saveIntentData != null ? saveIntentData.getOrderId() : null), null, 47, null);
    }

    public void OLrzqt() {
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.KWHzl();
        }
    }

    public void EZpvd() {
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.EZpvd();
        }
    }

    public final C23212htv AYXKKw() {
        return new C23212htv(new kYB(), new C23214htx((xWP) C43251rlk.copydefault(xWP.class)));
    }

    public void DbNXlk() {
        AbstractC23102hrr abstractC23102hrr = this.EZpvd;
        if (abstractC23102hrr != null) {
            abstractC23102hrr.OLrzqt();
        }
        this.EZpvd = null;
    }
}
