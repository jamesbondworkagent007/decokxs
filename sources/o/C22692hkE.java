package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.MutableLiveData;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dexlogic.bean.ApproveResultInfo;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.BridgeApproveInfoReq;
import com.okinc.business.dexlogic.bean.CallData;
import com.okinc.business.dexlogic.bean.CloseAccountBean;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData;
import com.okinc.business.dexlogic.bean.CrossChainBridgeRulesRequest;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DefiMultiSwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.ExtendOrderBroadcast;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallData;
import com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.IntentQuoteCallData;
import com.okinc.business.dexlogic.bean.JitoData;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.QuoteCallData;
import com.okinc.business.dexlogic.bean.QuoteCallDataReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.RepeatOrderRequest;
import com.okinc.business.dexlogic.bean.RepeatOrderResponse;
import com.okinc.business.dexlogic.bean.RepeatSubOrderRequest;
import com.okinc.business.dexlogic.bean.SaveIntentBridgeOrderData;
import com.okinc.business.dexlogic.bean.SwapApproveInfoReq;
import com.okinc.business.dexlogic.bean.SwapOrderInfoReq;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.dexlogic.error.BtcEncryptException;
import com.okinc.business.dexlogic.main.swap.operation_handler.OperationHandlerImpl$getApproveUnsignedData$1;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxFlowableKt;
import o.C23274hvD;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hkE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C22692hkE implements InterfaceC22693hkF {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public java.util.List<ApproveStatusGroup> AEQbTJ;
    public final java.lang.String AYXKKw;
    public android.util.LruCache<java.lang.String, DeFiPlatformTokenApprovalInfo> EZpvd;
    public final C23237huT KWHzl;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;
    public MutableLiveData<gKW> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22693hkF
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ApproveStatusGroup> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22693hkF
    public java.lang.String copydefault() {
        return this.gEmmrt;
    }

    public C22692hkE(@NotNull java.lang.String str, @NotNull C23237huT c23237huT, @NotNull android.util.LruCache<java.lang.String, DeFiPlatformTokenApprovalInfo> lruCache) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c23237huT, "");
        Intrinsics.checkNotNullParameter(lruCache, "");
        this.AYXKKw = str;
        this.KWHzl = c23237huT;
        this.EZpvd = lruCache;
        this.valueOf = new MutableLiveData<>();
        this.AEQbTJ = yDY.AhwBna();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 o.huT)
  (wrap:android.util.LruCache:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:android.util.LruCache:0x0008: CONSTRUCTOR (15 int) A[MD:(int):void (c), WRAPPED] (LINE:81) call: android.util.LruCache.<init>(int):void type: CONSTRUCTOR) : (r3v0 android.util.LruCache))
 A[MD:(java.lang.String, o.huT, android.util.LruCache<java.lang.String, com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo>):void (m)] (LINE:78) call: o.hkE.<init>(java.lang.String, o.huT, android.util.LruCache):void type: THIS */
    public /* synthetic */ C22692hkE(java.lang.String str, C23237huT c23237huT, android.util.LruCache lruCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c23237huT, (i & 4) != 0 ? new android.util.LruCache(15) : lruCache);
    }

    /* JADX INFO: renamed from: o.hkE$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hkE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return str + "_" + str2 + "_" + str3;
        }
    }

    @Override // o.InterfaceC22693hkF
    public void OLrzqt() {
        this.EZpvd.evictAll();
        this.AEQbTJ = yDY.AhwBna();
    }

    public final void copydefault(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str, @NotNull InterfaceC22824hme interfaceC22824hme) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC22824hme, "");
        java.util.Set<Map.Entry<java.lang.String, DeFiPlatformTokenApprovalInfo>> setEntrySet = this.EZpvd.snapshot().entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setEntrySet, 10));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) ((Map.Entry) it.next()).getValue();
            arrayList.add(ApproveStatusGroup.copy$default(deFiPlatformTokenApprovalInfo.checkApproveStatusGroupForSwap(dexMultiTokenInfoBean.getDecimals(), str), false, null, null, null, false, Companion.EZpvd(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean2.getTokenContractAddress()), deFiPlatformTokenApprovalInfo.getId(), 31, null));
        }
        this.AEQbTJ = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    @Override // o.InterfaceC22693hkF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String chainId;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String originContractAddress = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getOriginContractAddress() : null;
        if (originContractAddress == null) {
            originContractAddress = "";
        }
        java.lang.String originContractAddress2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getOriginContractAddress() : null;
        if (originContractAddress2 == null) {
            originContractAddress2 = "";
        }
        android.util.LruCache<java.lang.String, DeFiPlatformTokenApprovalInfo> lruCache = this.EZpvd;
        java.lang.String chainId2 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = lruCache.get(OLrzqt(str2, chainId2, originContractAddress, originContractAddress2));
        if (!OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2) || deFiPlatformTokenApprovalInfo == null) {
            if (deFiPlatformTokenApprovalInfo != null) {
                if (C23311hvo.copydefault(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null, deFiPlatformTokenApprovalInfo.getTokenContractAddress(), dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getOriginContractAddress() : null)) {
                    android.util.LruCache<java.lang.String, DeFiPlatformTokenApprovalInfo> lruCache2 = this.EZpvd;
                    chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
                    lruCache2.put(OLrzqt(str2, chainId != null ? chainId : "", originContractAddress, originContractAddress2), DeFiPlatformTokenApprovalInfo.copy$default(deFiPlatformTokenApprovalInfo, null, null, null, "", str, false, null, 103, null));
                }
            }
            return false;
        }
        if (C23311hvo.copydefault(dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null, deFiPlatformTokenApprovalInfo.getTokenContractAddress(), dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getOriginContractAddress() : null)) {
            android.util.LruCache<java.lang.String, DeFiPlatformTokenApprovalInfo> lruCache3 = this.EZpvd;
            chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            lruCache3.put(OLrzqt(str2, chainId != null ? chainId : "", originContractAddress, originContractAddress2), DeFiPlatformTokenApprovalInfo.copy$default(deFiPlatformTokenApprovalInfo, null, null, null, "", str, false, null, 103, null));
        }
        return true;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return str + "_" + str2 + "_" + str3 + "_" + str4;
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ApproveStatusGroup> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull InterfaceC22824hme interfaceC22824hme, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(interfaceC22824hme, "");
        if (dexMultiTokenInfoBean.isMainChainCoin() && !C22370heA.EZpvd(dexMultiTokenInfoBean.getChainId())) {
            AbstractC58185ywX<ApproveStatusGroup> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ApproveStatusGroup(false, ApproveStatus.APPROVED, "115792089237316195423570985008687907853269984665640564039457584007913129639935", (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 104, (DefaultConstructorMarker) null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        java.lang.String originContractAddress = dexMultiTokenInfoBean.getOriginContractAddress();
        java.lang.String originContractAddress2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getOriginContractAddress() : null;
        if (originContractAddress2 == null) {
            originContractAddress2 = "";
        }
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = this.EZpvd.get(OLrzqt(str3, dexMultiTokenInfoBean.getChainId(), originContractAddress, originContractAddress2));
        if (OLrzqt(dexMultiTokenInfoBean, dexMultiTokenInfoBean2)) {
            Intrinsics.copydefault(dexMultiTokenInfoBean2);
            return copydefault(str3, str2, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, interfaceC22824hme, str);
        }
        if (deFiPlatformTokenApprovalInfo != null && C23311hvo.copydefault(dexMultiTokenInfoBean.getChainId(), deFiPlatformTokenApprovalInfo.getTokenContractAddress(), originContractAddress)) {
            AbstractC58185ywX<ApproveStatusGroup> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(copydefault(deFiPlatformTokenApprovalInfo, dexMultiTokenInfoBean, str, interfaceC22824hme));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        return EZpvd(str2, dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getDecimals(), str, interfaceC22824hme, originContractAddress, originContractAddress2, str3 == null ? "" : str3);
    }

    public final AbstractC58185ywX<ApproveStatusGroup> copydefault(java.lang.String str, java.lang.String str2, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, InterfaceC22824hme interfaceC22824hme, java.lang.String str3) {
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = this.EZpvd.get(OLrzqt(str, dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean2.getOriginContractAddress()));
        if (deFiPlatformTokenApprovalInfo != null && C23311hvo.copydefault(dexMultiTokenInfoBean.getChainId(), deFiPlatformTokenApprovalInfo.getTokenContractAddress(), dexMultiTokenInfoBean.getOriginContractAddress())) {
            AbstractC58185ywX<ApproveStatusGroup> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(deFiPlatformTokenApprovalInfo.checkApproveStatusGroupForSwap(dexMultiTokenInfoBean.getDecimals(), str3));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return EZpvd(str2, dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getDecimals(), str3, interfaceC22824hme, dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean2.getOriginContractAddress(), str == null ? "" : str);
    }

    public final AbstractC58185ywX<ApproveStatusGroup> EZpvd(java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, InterfaceC22824hme interfaceC22824hme, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7) {
        AbstractC58185ywX abstractC58185ywXEZpvd = C23223huF.EZpvd(C23237huT.getBatchTokenApproveAllowanceStatus$default(this.KWHzl, str, str2, str5, str6, null, 16, null));
        final Function1 function1 = new Function1() { // from class: o.hlP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.OLrzqt(str7, str3, str4, this, str2, str5, str6, (java.util.Map) obj);
            }
        };
        AbstractC58185ywX<ApproveStatusGroup> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hlS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.AxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ApproveStatusGroup AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ApproveStatusGroup) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo.copy$default(com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.Object):com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo */
    public static final ApproveStatusGroup OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, C22692hkE c22692hkE, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.Map map) {
        ApproveStatusGroup approveStatusGroupCheckApproveStatusGroupForSwap;
        Intrinsics.checkNotNullParameter(map, "");
        for (Map.Entry entry : map.entrySet()) {
            java.lang.String str7 = (java.lang.String) entry.getKey();
            c22692hkE.EZpvd.put(c22692hkE.OLrzqt(str7, str4, str5, str6), DeFiPlatformTokenApprovalInfo.copy$default((DeFiPlatformTokenApprovalInfo) entry.getValue(), str7, null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) map.get(str);
        return (deFiPlatformTokenApprovalInfo == null || (approveStatusGroupCheckApproveStatusGroupForSwap = deFiPlatformTokenApprovalInfo.checkApproveStatusGroupForSwap(str2, str3)) == null) ? new ApproveStatusGroup(true, ApproveStatus.UN_APPROVE, "", "0", false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null) : approveStatusGroupCheckApproveStatusGroupForSwap;
    }

    public final ApproveStatusGroup copydefault(@NotNull DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull java.lang.String str, @NotNull InterfaceC22824hme interfaceC22824hme) {
        Intrinsics.checkNotNullParameter(deFiPlatformTokenApprovalInfo, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC22824hme, "");
        java.lang.String status = deFiPlatformTokenApprovalInfo.getStatus();
        ApproveStatus approveStatus = ApproveStatus.APPROVING;
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus.getType())) {
            return new ApproveStatusGroup(false, approveStatus, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
        }
        ApproveStatus approveStatus2 = ApproveStatus.UN_APPROVE;
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus2.getType())) {
            return new ApproveStatusGroup(true, approveStatus2, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
        }
        ApproveStatus approveStatus3 = ApproveStatus.CANCEL_APPROVING;
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus3.getType())) {
            if (deFiPlatformTokenApprovalInfo.isApprovedAndNeedCancelApprove(str, dexMultiTokenInfoBean.getDecimals())) {
                return new ApproveStatusGroup(false, approveStatus3, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), true, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
            }
            return new ApproveStatusGroup(false, approveStatus2, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) ApproveStatus.APPROVE_FAIL.getType())) {
            if (deFiPlatformTokenApprovalInfo.isApprovedAndNeedCancelApprove(str, dexMultiTokenInfoBean.getDecimals())) {
                return new ApproveStatusGroup(true, ApproveStatus.APPROVED_NEED_CANCEL_APPROVE, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), true, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
            }
            return new ApproveStatusGroup(true, approveStatus2, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), false, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
        }
        ApproveStatus approveStatus4 = ApproveStatus.APPROVED;
        if (Intrinsics.EZpvd((java.lang.Object) status, (java.lang.Object) approveStatus4.getType())) {
            boolean zOLrzqt = false;
            if (C23313hvq.valueOf(deFiPlatformTokenApprovalInfo.getAmount(), 0)) {
                zOLrzqt = true;
            } else if (!Intrinsics.EZpvd((java.lang.Object) deFiPlatformTokenApprovalInfo.getAmount(), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                zOLrzqt = C23313hvq.OLrzqt(str, interfaceC22824hme.copydefault(deFiPlatformTokenApprovalInfo.getAmount(), dexMultiTokenInfoBean.getDecimals()));
            }
            boolean z = zOLrzqt;
            if (deFiPlatformTokenApprovalInfo.isApprovedAndNeedCancelApprove(str, dexMultiTokenInfoBean.getDecimals())) {
                approveStatus4 = ApproveStatus.APPROVED_NEED_CANCEL_APPROVE;
            }
            return new ApproveStatusGroup(z, approveStatus4, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), deFiPlatformTokenApprovalInfo.getNeedCancelApproveToken(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
        }
        return new ApproveStatusGroup(true, approveStatus2, deFiPlatformTokenApprovalInfo.getAmount(), deFiPlatformTokenApprovalInfo.getType(), deFiPlatformTokenApprovalInfo.getNeedCancelApproveToken(), (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null);
    }

    public AbstractC58185ywX<ApproveUnsignedData> KWHzl(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (z) {
            return this.KWHzl.AEQbTJ(str, str2, str3, str4, str5, str6);
        }
        if (C22416heu.AYXKKw()) {
            return RxFlowableKt.rxFlowable(Dispatchers.getIO(), new OperationHandlerImpl$getApproveUnsignedData$1(this, str, str2, str3, str5, str6, null));
        }
        return this.KWHzl.EZpvd(str, str2, str3, str5, str6);
    }

    public AbstractC58185ywX<MergeCallData> KWHzl(@NotNull final DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, final boolean z) {
        Intrinsics.checkNotNullParameter(defiMultiSwapOrderInfoReq, "");
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(this.AYXKKw).fARcdN().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.hlj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.KWHzl(this.AEQbTJ, defiMultiSwapOrderInfoReq, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.hlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.zuBGHE(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.hlh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.copydefault(this.EZpvd, z, defiMultiSwapOrderInfoReq, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<MergeCallData> abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.hli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.gHZMYf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C22692hkE c22692hkE, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c22692hkE.KWHzl.copydefault(defiMultiSwapOrderInfoReq, str);
    }

    public static final InterfaceC60096zvd gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final MergeCallData EZpvd(UnsignedSwapData unsignedSwapData, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, boolean z) throws BtcEncryptException {
        if (unsignedSwapData != null && unsignedSwapData.isTransfer()) {
            java.lang.String sender = unsignedSwapData.getCallData().getSender();
            if (sender.length() == 0) {
                sender = unsignedSwapData.evmTransferReceiveWalletAddressAesDecrypt(defiMultiSwapOrderInfoReq.getUserWalletAddress());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) sender)) {
                Intrinsics.copydefault((java.lang.Object) sender);
                KWHzl(unsignedSwapData, z, sender);
            } else {
                throw new BtcEncryptException();
            }
        }
        return new MergeCallData(unsignedSwapData);
    }

    public final AbstractC58185ywX<UnsignedSwapData> AEQbTJ(UnsignedSwapData unsignedSwapData, QuoteCallDataReq quoteCallDataReq) {
        AbstractC58185ywX<UnsignedSwapData> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(EZpvd(unsignedSwapData, quoteCallDataReq, true));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static /* synthetic */ UnsignedSwapData processQuoteTransferLogic$default(C22692hkE c22692hkE, UnsignedSwapData unsignedSwapData, QuoteCallDataReq quoteCallDataReq, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processQuoteTransferLogic");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return c22692hkE.EZpvd(unsignedSwapData, quoteCallDataReq, z);
    }

    public final UnsignedSwapData EZpvd(UnsignedSwapData unsignedSwapData, QuoteCallDataReq quoteCallDataReq, boolean z) throws BtcEncryptException {
        if (unsignedSwapData != null && unsignedSwapData.isTransfer()) {
            java.lang.String sender = unsignedSwapData.getCallData().getSender();
            if (sender.length() == 0) {
                sender = unsignedSwapData.evmTransferReceiveWalletAddressAesDecrypt(quoteCallDataReq.getUserWalletAddress());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) sender)) {
                Intrinsics.copydefault((java.lang.Object) sender);
                KWHzl(unsignedSwapData, z, sender);
            } else {
                throw new BtcEncryptException();
            }
        }
        return unsignedSwapData;
    }

    public final ResponseData<QuoteCallData> EZpvd(ResponseData<QuoteCallData> responseData, QuoteCallDataReq quoteCallDataReq, boolean z) throws BtcEncryptException {
        QuoteCallData data = responseData.getData();
        EZpvd(data != null ? data.getCallDataResult() : null, quoteCallDataReq, z);
        return responseData;
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<MergeCallData> KWHzl(boolean z, @NotNull DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(defiMultiSwapOrderInfoReq, "");
        KWHzl((UnsignedSwapData) null, z2, (java.lang.String) null);
        if (!z3) {
            return KWHzl(defiMultiSwapOrderInfoReq, z2);
        }
        if (z2) {
            return OLrzqt(defiMultiSwapOrderInfoReq);
        }
        return KWHzl(defiMultiSwapOrderInfoReq);
    }

    public final AbstractC58185ywX<MergeCallData> KWHzl(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq) {
        C23237huT c23237huT = this.KWHzl;
        java.lang.String bridgeId = defiMultiSwapOrderInfoReq.getBridgeId();
        java.lang.String customSlippage = defiMultiSwapOrderInfoReq.getCustomSlippage();
        DexAutoSlippageInfoParam autoSlippageInfo = defiMultiSwapOrderInfoReq.getAutoSlippageInfo();
        java.lang.String autoTotalSlippage = autoSlippageInfo != null ? autoSlippageInfo.getAutoTotalSlippage() : null;
        if (autoTotalSlippage == null) {
            autoTotalSlippage = "";
        }
        if (customSlippage != null && customSlippage.length() != 0) {
            autoTotalSlippage = customSlippage;
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = C23223huF.EZpvd(c23237huT.EZpvd(new IntentBridgeQuoteCallDataReq(bridgeId, autoTotalSlippage, defiMultiSwapOrderInfoReq.getToChainId(), defiMultiSwapOrderInfoReq.getReceiveWalletAddress(), defiMultiSwapOrderInfoReq.getUserWalletAddress(), defiMultiSwapOrderInfoReq.getChainId(), defiMultiSwapOrderInfoReq.getFromTokenAddress(), defiMultiSwapOrderInfoReq.getToTokenAddress(), defiMultiSwapOrderInfoReq.getFromAmount())));
        final Function1 function1 = new Function1() { // from class: o.hlK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.AEQbTJ((IntentBridgeQuoteCallData) obj);
            }
        };
        AbstractC58185ywX<MergeCallData> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hlN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.QOLQEE(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final MergeCallData QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MergeCallData) function1.invoke(obj);
    }

    public static final MergeCallData AEQbTJ(IntentBridgeQuoteCallData intentBridgeQuoteCallData) {
        DexQuoteBridgeVO dexQuoteBridgeVOBridge;
        OfflineQuote calldata;
        Intrinsics.checkNotNullParameter(intentBridgeQuoteCallData, "");
        java.lang.String unsignedTx = intentBridgeQuoteCallData.getUnsignedTx();
        QuotePriceRes quoteResult = intentBridgeQuoteCallData.getQuoteResult();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quoteResult != null ? quoteResult.fromToken() : null;
        QuotePriceRes quoteResult2 = intentBridgeQuoteCallData.getQuoteResult();
        DexMultiTokenInfoBean token = quoteResult2 != null ? quoteResult2.toToken() : null;
        java.lang.String tokenName = dexMultiTokenInfoBeanFromToken != null ? dexMultiTokenInfoBeanFromToken.getTokenName() : null;
        java.lang.String str = tokenName == null ? "" : tokenName;
        java.lang.String tokenName2 = token != null ? token.getTokenName() : null;
        CallData callData = new CallData(str, tokenName2 == null ? "" : tokenName2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32764, (DefaultConstructorMarker) null);
        QuotePriceRes quoteResult3 = intentBridgeQuoteCallData.getQuoteResult();
        return new MergeCallData(new UnsignedSwapData((java.lang.String) null, callData, unsignedTx, (java.lang.String) null, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, (java.lang.String) null, intentBridgeQuoteCallData.getQuoteResult(), (quoteResult3 == null || (dexQuoteBridgeVOBridge = quoteResult3.bridge()) == null || (calldata = dexQuoteBridgeVOBridge.getCalldata()) == null) ? null : calldata.getQuote(), (JitoData) null, false, false, (MevConfig) null, MTPushConstants.RemoteWhat.ADD_GEOFENCE, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.dexlogic.bean.MergeCallData> */
    public final AbstractC58185ywX<MergeCallData> OLrzqt(DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq) {
        AbstractC58185ywX<ResponseData<IntentQuoteCallData>> abstractC58185ywXAEQbTJ = this.KWHzl.AEQbTJ(defiMultiSwapOrderInfoReq);
        final Function1 function1 = new Function1() { // from class: o.hlM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.copydefault((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hlL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.QfsBiF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final MergeCallData QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MergeCallData) function1.invoke(obj);
    }

    public final void KWHzl(UnsignedSwapData unsignedSwapData, boolean z, java.lang.String str) {
        if (unsignedSwapData != null) {
            C22380heK.OLrzqt.copydefault(this.AYXKKw).OLrzqt(z).KWHzl(new C22397heb(unsignedSwapData.getOrderId(), str, unsignedSwapData.getCallData().getTo()));
        }
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ApproveSwapData> EZpvd(final boolean z, @NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull final DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final java.lang.Integer num, final java.lang.Integer num2, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<ApproveSwapData> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hlg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) throws java.lang.Exception {
                C22692hkE.copydefault(this.KWHzl, z, dexMultiTokenInfoBean, objectRef, num2, objectRef2, dexMultiTokenInfoBean2, str4, str, num, str2, str3, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hll
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22692hkE.djBIcL(objectRef, objectRef2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, o.yxC] */
    public static final void copydefault(final C22692hkE c22692hkE, final boolean z, final DexMultiTokenInfoBean dexMultiTokenInfoBean, Ref.ObjectRef objectRef, final java.lang.Integer num, final Ref.ObjectRef objectRef2, final DexMultiTokenInfoBean dexMultiTokenInfoBean2, final java.lang.String str, final java.lang.String str2, final java.lang.Integer num2, final java.lang.String str3, final java.lang.String str4, final InterfaceC58184ywW interfaceC58184ywW) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C22380heK c22380heK = C22380heK.OLrzqt;
        final DefiChainInfo defiChainInfoKWHzl = c22380heK.copydefault(c22692hkE.AYXKKw).EZpvd(z).KWHzl(dexMultiTokenInfoBean.getChainId());
        if (defiChainInfoKWHzl == null) {
            throw new java.lang.Exception(C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating));
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = c22380heK.copydefault(c22692hkE.AYXKKw).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.EZpvd(this.copydefault, dexMultiTokenInfoBean, num, objectRef2, z, dexMultiTokenInfoBean2, str, str2, defiChainInfoKWHzl, num2, str3, str4, interfaceC58184ywW, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.djSkpj(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hkU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.DbNXlk(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.UeEOUB(function12, obj);
            }
        });
    }

    public static final void djSkpj(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, o.yxC] */
    public static final Unit EZpvd(C22692hkE c22692hkE, DexMultiTokenInfoBean dexMultiTokenInfoBean, java.lang.Integer num, Ref.ObjectRef objectRef, boolean z, DexMultiTokenInfoBean dexMultiTokenInfoBean2, java.lang.String str, final java.lang.String str2, final DefiChainInfo defiChainInfo, final java.lang.Integer num2, final java.lang.String str3, final java.lang.String str4, final InterfaceC58184ywW interfaceC58184ywW, final InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        AbstractC58185ywX<ApproveUnsignedData> abstractC58185ywXKWHzl = c22692hkE.KWHzl(z, c22692hkE.copydefault(interfaceC9738bbJ, C33129mqd.valueOf(dexMultiTokenInfoBean.getChainId()), num), dexMultiTokenInfoBean.getOriginContractAddress(), dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean2.getOriginContractAddress(), str, C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? str2 : null);
        final Function1 function1 = new Function1() { // from class: o.hlb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.KWHzl(defiChainInfo, num2, str2, str3, str4, interfaceC58184ywW, interfaceC9738bbJ, (ApproveUnsignedData) obj);
            }
        };
        InterfaceC58227yxM<? super ApproveUnsignedData> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hle
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.RcXXUw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hlc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.isConnected(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.dNCPSb(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void RcXXUw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(DefiChainInfo defiChainInfo, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC58184ywW interfaceC58184ywW, InterfaceC9738bbJ interfaceC9738bbJ, ApproveUnsignedData approveUnsignedData) {
        interfaceC58184ywW.onNext(new ApproveSwapData(defiChainInfo.getChainId(), defiChainInfo.getNetwork(), approveUnsignedData.getSignDataJson(defiChainInfo.isEvm(), num), interfaceC9738bbJ.DbNXlk(), new PlatformItem(C33129mqd.valueOf(str), str2, str3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 16376, (DefaultConstructorMarker) null), approveUnsignedData.getId(), approveUnsignedData.getDexContractAddress(), false, (UnsignedSwapData) null, (java.lang.String) null, FaceDetector.NUM_BOXES, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
        return Unit.INSTANCE;
    }

    public static final void dNCPSb(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void UeEOUB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = (InterfaceC58217yxC) objectRef2.element;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<RepeatOrderResponse> AEQbTJ(@NotNull final RepeatSubOrderRequest repeatSubOrderRequest, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(repeatSubOrderRequest, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<RepeatOrderResponse> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22692hkE.KWHzl(objectRef, this, num, repeatSubOrderRequest, objectRef2, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22692hkE.OLrzqt(objectRef, objectRef2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, o.yxC] */
    public static final void KWHzl(Ref.ObjectRef objectRef, final C22692hkE c22692hkE, final java.lang.Integer num, final RepeatSubOrderRequest repeatSubOrderRequest, final Ref.ObjectRef objectRef2, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(c22692hkE.AYXKKw).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.KWHzl(num, repeatSubOrderRequest, objectRef2, c22692hkE, interfaceC58184ywW, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hlT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.sSMYrx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.AkhnZx(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.AwvSrB(function12, obj);
            }
        });
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0014  */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, o.yxC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(java.lang.Integer num, RepeatSubOrderRequest repeatSubOrderRequest, Ref.ObjectRef objectRef, C22692hkE c22692hkE, final InterfaceC58184ywW interfaceC58184ywW, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strEZpvd;
        if (num != null) {
            strEZpvd = interfaceC9738bbJ.copydefault(C33129mqd.valueOf(repeatSubOrderRequest.getChainId()), num.intValue());
            if (strEZpvd == null) {
                strEZpvd = interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(repeatSubOrderRequest.getChainId()));
            }
        }
        AbstractC58185ywX<ResponseData<RepeatOrderResponse>> abstractC58185ywXKWHzl = c22692hkE.KWHzl.KWHzl(new RepeatOrderRequest(repeatSubOrderRequest.getChainId(), repeatSubOrderRequest.getFromTokenAddress(), repeatSubOrderRequest.getAmount(), repeatSubOrderRequest.getToTokenAddress(), strEZpvd, interfaceC9738bbJ.DbNXlk(), repeatSubOrderRequest.getFromSwapFeeUsd()));
        final Function1 function1 = new Function1() { // from class: o.hlm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.AhwBna(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<RepeatOrderResponse>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hlq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.wlaJM(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hlt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.AhwBna(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hlr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.AuCTelauCTel(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = (InterfaceC58217yxC) objectRef2.element;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<CrossChainBridgeRulesData> OLrzqt(@NotNull final CrossChainBridgeRulesRequest crossChainBridgeRulesRequest, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(crossChainBridgeRulesRequest, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        AbstractC58185ywX<CrossChainBridgeRulesData> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hlF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22692hkE.copydefault(objectRef, this, num, crossChainBridgeRulesRequest, objectRef2, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hlJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22692hkE.copydefault(objectRef, objectRef2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [T, o.yxC] */
    public static final void copydefault(Ref.ObjectRef objectRef, final C22692hkE c22692hkE, final java.lang.Integer num, final CrossChainBridgeRulesRequest crossChainBridgeRulesRequest, final Ref.ObjectRef objectRef2, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(c22692hkE.AYXKKw).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hlw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.EZpvd(num, crossChainBridgeRulesRequest, objectRef2, c22692hkE, interfaceC58184ywW, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hlx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.OcIXYQ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.values(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hlu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.QKVWgx(function12, obj);
            }
        });
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, o.yxC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(java.lang.Integer num, CrossChainBridgeRulesRequest crossChainBridgeRulesRequest, Ref.ObjectRef objectRef, C22692hkE c22692hkE, final InterfaceC58184ywW interfaceC58184ywW, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.lang.String strEZpvd;
        if (num != null) {
            strEZpvd = interfaceC9738bbJ.copydefault(C33129mqd.valueOf(crossChainBridgeRulesRequest.getFromChainId()), num.intValue());
            if (strEZpvd == null) {
                strEZpvd = interfaceC9738bbJ.EZpvd(C33129mqd.valueOf(crossChainBridgeRulesRequest.getFromChainId()));
            }
        }
        AbstractC58185ywX<ResponseData<CrossChainBridgeRulesData>> abstractC58185ywXKWHzl = c22692hkE.KWHzl.KWHzl(crossChainBridgeRulesRequest.copy((TypedValues.PositionType.TYPE_POSITION_TYPE & 1) != 0 ? crossChainBridgeRulesRequest.accountId : interfaceC9738bbJ.DbNXlk(), (TypedValues.PositionType.TYPE_POSITION_TYPE & 2) != 0 ? crossChainBridgeRulesRequest.amount : 0.0f, (TypedValues.PositionType.TYPE_POSITION_TYPE & 4) != 0 ? crossChainBridgeRulesRequest.bridgeId : 0, (TypedValues.PositionType.TYPE_POSITION_TYPE & 8) != 0 ? crossChainBridgeRulesRequest.fromChainId : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 16) != 0 ? crossChainBridgeRulesRequest.fromSwapFeeUsd : 0.0f, (TypedValues.PositionType.TYPE_POSITION_TYPE & 32) != 0 ? crossChainBridgeRulesRequest.fromTokenAddress : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 64) != 0 ? crossChainBridgeRulesRequest.receiveWalletAddress : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 128) != 0 ? crossChainBridgeRulesRequest.toChainId : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 256) != 0 ? crossChainBridgeRulesRequest.toTokenAddress : null, (TypedValues.PositionType.TYPE_POSITION_TYPE & 512) != 0 ? crossChainBridgeRulesRequest.userWalletAddress : strEZpvd));
        final Function1 function1 = new Function1() { // from class: o.hlD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.djBIcL(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<CrossChainBridgeRulesData>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hlH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.DTwDnp(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hlE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.fetchVPNInfo(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hlG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.ORxRYg(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fetchVPNInfo(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit values(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = (InterfaceC58217yxC) objectRef2.element;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    @Override // o.InterfaceC22693hkF
    public void AEQbTJ(@NotNull gKW gkw) {
        Intrinsics.checkNotNullParameter(gkw, "");
        this.valueOf.setValue(gkw);
    }

    public AbstractC58185ywX<ResponseData<MergeQuoteCallData>> OLrzqt(@NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final QuoteCallDataReq quoteCallDataReq, final boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(quoteCallDataReq, "");
        AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(this.AYXKKw).fARcdN().KWHzl();
        final Function1 function1 = new Function1() { // from class: o.hkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.copydefault(this.OLrzqt, map, quoteCallDataReq, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.hkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.QbewEr(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.hkZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.copydefault(this.OLrzqt, z, quoteCallDataReq, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.hkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.QUSxYX(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.hkY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.EZpvd((ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<MergeQuoteCallData>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl3.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hkX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.RJOkX(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C22692hkE c22692hkE, java.util.Map map, QuoteCallDataReq quoteCallDataReq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c22692hkE.KWHzl.EZpvd(map, quoteCallDataReq, str);
    }

    public static final InterfaceC60096zvd QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final ResponseData QVAiDq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexlogic.bean.QuoteCallData.copy$default(com.okinc.business.dexlogic.bean.QuoteCallData, com.okinc.business.dexlogic.bean.UnsignedSwapData, com.okinc.business.dexlogic.bean.QuotePriceRes, int, java.lang.Object):com.okinc.business.dexlogic.bean.QuoteCallData */
    public static final ResponseData KWHzl(ResponseData responseData, UnsignedSwapData unsignedSwapData) {
        Intrinsics.checkNotNullParameter(unsignedSwapData, "");
        QuoteCallData quoteCallData = (QuoteCallData) responseData.getData();
        return ResponseData.copy$default(responseData, 0, null, null, null, quoteCallData != null ? QuoteCallData.copy$default(quoteCallData, unsignedSwapData, null, 2, null) : null, null, 47, null);
    }

    public static final ResponseData RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return C22399hed.OLrzqt(responseData);
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<MergeQuoteCallData>> copydefault(boolean z, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull MergeQuoteCallDataReq mergeQuoteCallDataReq, boolean z2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(mergeQuoteCallDataReq, "");
        return OLrzqt(map, mergeQuoteCallDataReq.getEoaQuoteCallDataReq(), z2);
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<java.lang.Object>> KWHzl(@NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final SwapOrderInfoReq swapOrderInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapOrderInfoReq, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22692hkE.OLrzqt(objectRef, this, map, swapOrderInfoReq, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hlQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22692hkE.djBIcL(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yxC] */
    public static final void OLrzqt(Ref.ObjectRef objectRef, C22692hkE c22692hkE, java.util.Map map, SwapOrderInfoReq swapOrderInfoReq, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXAEQbTJ = c22692hkE.KWHzl.AEQbTJ((java.util.Map<java.lang.String, java.lang.String>) map, swapOrderInfoReq);
        final Function1 function1 = new Function1() { // from class: o.hkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.gEmmrt(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<java.lang.Object>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hkL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.fFgQHt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hkO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.fARcdN(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hkP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.fvQaOB(function12, obj);
            }
        });
    }

    public static final void fFgQHt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void fvQaOB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fARcdN(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<SaveIntentData>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, java.lang.String str14) {
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
        return this.KWHzl.copydefault(new SaveIntentBridgeOrderData(str2, str3, str4, str5, str6, str10, str11, str, str7, str8, str9, str12, str13, null, str14, 8192, null));
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<SaveIntentData>> copydefault(final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, boolean z, final java.lang.String str4, final int i) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<SaveIntentData>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22692hkE.KWHzl(objectRef, str, this, str2, str3, str4, i, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hlp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22692hkE.OLrzqt(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(Ref.ObjectRef objectRef, java.lang.String str, C22692hkE c22692hkE, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, final InterfaceC58184ywW interfaceC58184ywW) {
        T tAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (str != null) {
            AbstractC58185ywX<ResponseData<SaveIntentData>> abstractC58185ywXCopydefault = c22692hkE.KWHzl.copydefault(str2, str, str3, str4, i);
            final Function1 function1 = new Function1() { // from class: o.hkC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22692hkE.valueOf(interfaceC58184ywW, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<SaveIntentData>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hkK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C22692hkE.dvKsVJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hkR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22692hkE.AuCTel(interfaceC58184ywW, (java.lang.Throwable) obj);
                }
            };
            tAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hla
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C22692hkE.dxcTrN(function12, obj);
                }
            });
        } else {
            tAEQbTJ = 0;
        }
        objectRef.element = tAEQbTJ;
    }

    public static final void dvKsVJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void dxcTrN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AuCTel(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<ApproveResultInfo>> AEQbTJ(@NotNull final java.util.Map<java.lang.String, java.lang.String> map, @NotNull final SwapApproveInfoReq swapApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(swapApproveInfoReq, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXCopydefault = C23220huC.KWHzl(new InterfaceC58187ywZ() { // from class: o.hlR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C22692hkE.KWHzl(objectRef, this, map, swapApproveInfoReq, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.hlO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C22692hkE.KWHzl(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, o.yxC] */
    public static final void KWHzl(Ref.ObjectRef objectRef, C22692hkE c22692hkE, java.util.Map map, SwapApproveInfoReq swapApproveInfoReq, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXKWHzl = c22692hkE.KWHzl.KWHzl((java.util.Map<java.lang.String, java.lang.String>) map, swapApproveInfoReq);
        final Function1 function1 = new Function1() { // from class: o.hlz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.AYXKKw(interfaceC58184ywW, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<ApproveResultInfo>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hlA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.aKErDB(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hlB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.fJNWhG(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        };
        objectRef.element = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hlC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22692hkE.finit(function12, obj);
            }
        });
    }

    public static final void aKErDB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void finit(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fJNWhG(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        interfaceC58184ywW.onError(th);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Ref.ObjectRef objectRef) {
        InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final ResponseData fZBcTu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.dexlogic.bean.ApproveResultInfo>> */
    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<ApproveResultInfo>> copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull BridgeApproveInfoReq bridgeApproveInfoReq) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(bridgeApproveInfoReq, "");
        AbstractC58185ywX<ResponseData<ApproveResultInfo>> abstractC58185ywXOLrzqt = this.KWHzl.OLrzqt(map, bridgeApproveInfoReq);
        final Function1 function1 = new Function1() { // from class: o.hlo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22692hkE.djBIcL((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hlv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C22692hkE.fZBcTu(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<CloseAccountBean>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.KWHzl.EZpvd(str, str2);
    }

    @Override // o.InterfaceC22693hkF
    public AbstractC58185ywX<ResponseData<java.lang.Object>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull ExtendOrderBroadcast extendOrderBroadcast) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(extendOrderBroadcast, "");
        return this.KWHzl.OLrzqt(map, extendOrderBroadcast);
    }

    public final java.lang.String copydefault(InterfaceC9738bbJ interfaceC9738bbJ, long j, java.lang.Integer num) {
        if (num != null && j == 0) {
            java.lang.String strCopydefault = interfaceC9738bbJ.copydefault(j, num.intValue());
            return strCopydefault == null ? interfaceC9738bbJ.EZpvd(j) : strCopydefault;
        }
        return interfaceC9738bbJ.EZpvd(j);
    }

    public final boolean OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null))) {
            if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null), (java.lang.Object) (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null))) {
                return true;
            }
        }
        return false;
    }

    public static final InterfaceC60096zvd copydefault(C22692hkE c22692hkE, boolean z, DefiMultiSwapOrderInfoReq defiMultiSwapOrderInfoReq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            UnsignedSwapData unsignedSwapData = (UnsignedSwapData) responseData.getData();
            c22692hkE.copydefault = unsignedSwapData != null ? unsignedSwapData.getCalldataType() : null;
            UnsignedSwapData unsignedSwapData2 = (UnsignedSwapData) responseData.getData();
            c22692hkE.gEmmrt = unsignedSwapData2 != null ? unsignedSwapData2.getOrderId() : null;
            if (z) {
                return AbstractC58185ywX.KWHzl(c22692hkE.EZpvd((UnsignedSwapData) responseData.getData(), defiMultiSwapOrderInfoReq, true));
            }
            return AbstractC58185ywX.KWHzl(c22692hkE.EZpvd((UnsignedSwapData) responseData.getData(), defiMultiSwapOrderInfoReq, false));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getDetailMsg())) {
            C55326xho.toastWithFailedIcon$default(responseData.getDetailMsg(), 0, 1, (java.lang.Object) null);
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(responseData.getMsg()));
    }

    public static final MergeCallData copydefault(ResponseData responseData) throws java.lang.Exception {
        QuotePriceRes quoteResult;
        QuotePriceRes quoteResult2;
        java.lang.String unsignedTx;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            IntentQuoteCallData intentQuoteCallData = (IntentQuoteCallData) responseData.getData();
            java.lang.String str = (intentQuoteCallData == null || (unsignedTx = intentQuoteCallData.getUnsignedTx()) == null) ? "" : unsignedTx;
            IntentQuoteCallData intentQuoteCallData2 = (IntentQuoteCallData) responseData.getData();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = (intentQuoteCallData2 == null || (quoteResult2 = intentQuoteCallData2.getQuoteResult()) == null) ? null : quoteResult2.fromToken();
            IntentQuoteCallData intentQuoteCallData3 = (IntentQuoteCallData) responseData.getData();
            DexMultiTokenInfoBean token = (intentQuoteCallData3 == null || (quoteResult = intentQuoteCallData3.getQuoteResult()) == null) ? null : quoteResult.toToken();
            java.lang.String tokenName = dexMultiTokenInfoBeanFromToken != null ? dexMultiTokenInfoBeanFromToken.getTokenName() : null;
            java.lang.String str2 = tokenName == null ? "" : tokenName;
            java.lang.String tokenName2 = token != null ? token.getTokenName() : null;
            CallData callData = new CallData(str2, tokenName2 == null ? "" : tokenName2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 32764, (DefaultConstructorMarker) null);
            IntentQuoteCallData intentQuoteCallData4 = (IntentQuoteCallData) responseData.getData();
            java.lang.String quote = intentQuoteCallData4 != null ? intentQuoteCallData4.getQuote() : null;
            IntentQuoteCallData intentQuoteCallData5 = (IntentQuoteCallData) responseData.getData();
            return new MergeCallData(new UnsignedSwapData((java.lang.String) null, callData, str, (java.lang.String) null, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, (java.lang.String) null, intentQuoteCallData5 != null ? intentQuoteCallData5.getQuoteResult() : null, quote, (JitoData) null, false, false, (MevConfig) null, MTPushConstants.RemoteWhat.ADD_GEOFENCE, (DefaultConstructorMarker) null));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getDetailMsg())) {
            C55326xho.toastWithFailedIcon$default(responseData.getDetailMsg(), 0, 1, (java.lang.Object) null);
        }
        throw new java.lang.Exception(responseData.getMsg());
    }

    public static final Unit AhwBna(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            interfaceC58184ywW.onNext(data);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            interfaceC58184ywW.onNext(data);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd copydefault(C22692hkE c22692hkE, boolean z, QuoteCallDataReq quoteCallDataReq, final ResponseData responseData) {
        UnsignedSwapData callDataResult;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            QuoteCallData quoteCallData = (QuoteCallData) responseData.getData();
            c22692hkE.gEmmrt = (quoteCallData == null || (callDataResult = quoteCallData.getCallDataResult()) == null) ? null : callDataResult.getOrderId();
            if (z) {
                QuoteCallData quoteCallData2 = (QuoteCallData) responseData.getData();
                AbstractC58185ywX<UnsignedSwapData> abstractC58185ywXAEQbTJ = c22692hkE.AEQbTJ(quoteCallData2 != null ? quoteCallData2.getCallDataResult() : null, quoteCallDataReq);
                final Function1 function1 = new Function1() { // from class: o.hln
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C22692hkE.KWHzl(responseData, (UnsignedSwapData) obj);
                    }
                };
                return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.hlk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C22692hkE.QVAiDq(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(c22692hkE.EZpvd((ResponseData<QuoteCallData>) responseData, quoteCallDataReq, false));
        }
        return AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new java.lang.Exception(responseData.getMsg()));
    }

    public static final Unit gEmmrt(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Intrinsics.copydefault(responseData);
            interfaceC58184ywW.onNext(responseData);
        } else {
            int code = responseData.getCode();
            java.lang.String msg = responseData.getMsg();
            interfaceC58184ywW.onError(new OKServerException(code, msg.length() == 0 ? responseData.getDetailMsg() : msg, null, null, 12, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Intrinsics.copydefault(responseData);
            interfaceC58184ywW.onNext(responseData);
        } else {
            interfaceC58184ywW.onError(new OKServerException(responseData.getCode(), responseData.getMsg(), null, null, 12, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Intrinsics.copydefault(responseData);
            interfaceC58184ywW.onNext(responseData);
        } else {
            interfaceC58184ywW.onError(new java.lang.Exception(responseData.getMsg()));
        }
        return Unit.INSTANCE;
    }

    public static final ResponseData djBIcL(ResponseData responseData) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null) {
            throw new java.lang.Exception(responseData.getMsg());
        }
        return responseData;
    }
}
