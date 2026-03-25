package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792Call;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.KYSApprovalType;
import com.okinc.business.defi.biz.core.dapp.interaction.bean.DappTxResultBean;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.EVM5792CallParams;
import com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams;
import com.okinc.business.defi.biz.core.transaction.sign.evm.OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1;
import com.okinc.business.defi.biz.net.bean.EVM5792CallDataReq;
import com.okinc.business.defi.biz.net.bean.EVM5792CallDataRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxTypeInfo;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import o.C8955bMV;
import o.InterfaceC9730bbB;
import o.InterfaceC9736bbH;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bMV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8955bMV implements InterfaceC9736bbH {
    public final java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> KWHzl = new java.util.ArrayList();
    public C8972bMm<?> OLrzqt;
    public java.util.List<EVM5792Call> copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull C8972bMm<?> c8972bMm) {
        Intrinsics.checkNotNullParameter(c8972bMm, "");
        this.OLrzqt = c8972bMm;
    }

    @Override // o.InterfaceC9730bbB
    public boolean AEQbTJ() {
        return InterfaceC9736bbH.StateListAnimator.EZpvd(this);
    }

    @Override // o.InterfaceC9730bbB
    public InterfaceC9730bbB.StateListAnimator EZpvd() {
        return InterfaceC9736bbH.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC9730bbB
    public void EZpvd(@NotNull java.lang.String str) {
        InterfaceC9736bbH.StateListAnimator.OLrzqt(this, str);
    }

    @Override // o.InterfaceC9730bbB
    public boolean KWHzl() {
        return InterfaceC9736bbH.StateListAnimator.copydefault(this);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String OLrzqt() {
        return InterfaceC9736bbH.StateListAnimator.OLrzqt(this);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String a_(boolean z) {
        return InterfaceC9736bbH.StateListAnimator.KWHzl(this, z);
    }

    /* JADX INFO: renamed from: o.bMV$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bMV.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final boolean copydefault(@NotNull EVM5792ContractSignData eVM5792ContractSignData) {
            java.util.Collection<JsonObject> collectionAhwBna;
            java.util.Collection<JsonObject> collectionValues;
            java.util.Collection<JsonObject> collectionValues2;
            Intrinsics.checkNotNullParameter(eVM5792ContractSignData, "");
            if (!Intrinsics.EZpvd((java.lang.Object) eVM5792ContractSignData.getVersion(), (java.lang.Object) "2.0.0")) {
                return false;
            }
            Function1 function1 = new Function1() { // from class: o.bNg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C8955bMV.Activity.OLrzqt((JsonObject) obj));
                }
            };
            java.util.Map<java.lang.String, JsonObject> capabilities = eVM5792ContractSignData.getCapabilities();
            if (capabilities != null && (collectionValues2 = capabilities.values()) != null) {
                if (collectionValues2.isEmpty()) {
                    return false;
                }
                java.util.Iterator<T> it = collectionValues2.iterator();
                while (it.hasNext()) {
                    if (!((java.lang.Boolean) function1.invoke((JsonObject) it.next())).booleanValue()) {
                        return false;
                    }
                }
            }
            java.util.List<EVM5792Call> calls = eVM5792ContractSignData.getCalls();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (EVM5792Call eVM5792Call : calls) {
                java.lang.String to = eVM5792Call.getTo();
                if (to == null || to.length() == 0) {
                    return false;
                }
                java.util.Map<java.lang.String, JsonObject> capabilities2 = eVM5792Call.getCapabilities();
                if (capabilities2 == null || (collectionValues = capabilities2.values()) == null) {
                    collectionAhwBna = yDY.AhwBna();
                } else {
                    if (collectionValues.isEmpty()) {
                        return false;
                    }
                    collectionAhwBna = collectionValues;
                }
                C56406yEe.KWHzl(arrayList, collectionAhwBna);
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((java.lang.Boolean) function1.invoke((JsonObject) it2.next())).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        public static final boolean OLrzqt(JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            JsonElement jsonElement = jsonObject.get("optional");
            if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                if (jsonPrimitive.isBoolean() && jsonPrimitive.getAsBoolean()) {
                    return true;
                }
            }
            return false;
        }

        public final void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull AbstractC12782ctV abstractC12782ctV, long j, @NotNull EVM5792ContractSignData eVM5792ContractSignData, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            Intrinsics.checkNotNullParameter(eVM5792ContractSignData, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivity), null, null, new OKWEVMSignEIP5792Helper$Companion$checkNeedUpgrade7702$1(abstractC12782ctV, function02, function0, fragmentActivity, eVM5792ContractSignData, j, null), 3, null);
        }
    }

    public final C8972bMm<?> copydefault() {
        C8972bMm<?> c8972bMm = this.OLrzqt;
        if (c8972bMm != null) {
            return c8972bMm;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean AYXKKw() {
        java.util.List<EVM5792Call> list = this.copydefault;
        return !(list == null || list.isEmpty());
    }

    /* JADX DEBUG: Type inference failed for r11v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(@NotNull java.util.List<EVM5792Call> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<EVM5792CallDataRes>> abstractC58185ywXEZpvd = copydefault().ixgjPv().EZpvd(new EVM5792CallDataReq(list, copydefault().dHguZz().fetchVPNInfo(), 0, 4, null));
        final Function1 function1 = new Function1() { // from class: o.bNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8955bMV.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8955bMV.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> valueOf() {
        if ((!this.KWHzl.isEmpty()) && C33129mqd.KWHzl((java.util.Collection) this.copydefault)) {
            java.util.List<EVM5792Call> list = this.copydefault;
            Intrinsics.copydefault(list);
            return KWHzl(list);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final java.util.List<EVM5792Call> EZpvd(@NotNull PreExecTransactionRes preExecTransactionRes) {
        java.util.List<EVM5792Call> listAhwBna;
        TxInfoItem txInfo;
        java.util.List<BaseModel<?>> moduleList;
        EVM5792Call eip5792Call;
        java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> approveInfoList;
        TxTypeInfo txTypeInfo;
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        TxInfoItem txInfo2 = preExecTransactionRes.getTxInfo();
        if (Intrinsics.EZpvd((java.lang.Object) ((txInfo2 == null || (txTypeInfo = txInfo2.getTxTypeInfo()) == null) ? null : txTypeInfo.getStrategyType()), (java.lang.Object) TxTypeInfo.STRATEGY_TYPE_7702_EXECUTE_FROM_SELF)) {
            TxInfoItem txInfo3 = preExecTransactionRes.getTxInfo();
            Intrinsics.copydefault(txInfo3);
            java.util.List<BaseModel<?>> moduleList2 = txInfo3.getModuleList();
            if (moduleList2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(moduleList2, 10));
                java.util.Iterator<T> it = moduleList2.iterator();
                while (it.hasNext()) {
                    BaseModel baseModel = (BaseModel) it.next();
                    arrayList.add(baseModel != null ? baseModel.getData() : null);
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (obj instanceof fZM) {
                        arrayList2.add(obj);
                    }
                }
                listAhwBna = new java.util.ArrayList<>();
                java.util.Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    EVM5792Call eip5792Call2 = ((fZM) it2.next()).getEip5792Call();
                    if (eip5792Call2 != null) {
                        listAhwBna.add(eip5792Call2);
                    }
                }
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            this.KWHzl.clear();
            PreExecTransactionRes preExecTransactionResQSLkRj = copydefault().QSLkRj();
            if (preExecTransactionResQSLkRj != null && (txInfo = preExecTransactionResQSLkRj.getTxInfo()) != null && (moduleList = txInfo.getModuleList()) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : moduleList) {
                    if (obj2 instanceof ApproveInfoModuleModel) {
                        arrayList3.add(obj2);
                    }
                }
                java.util.Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    ApproveInfoModuleModel.ApproveInfoItem data = ((ApproveInfoModuleModel) it3.next()).getData();
                    if (data != null && (eip5792Call = data.getEip5792Call()) != null && (approveInfoList = data.getApproveInfoList()) != null) {
                        for (ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem : approveInfoList) {
                            approveInfoListItem.setEip5792Call(eip5792Call);
                            ApproveInfoModuleModel.AuthQuantity authQuantity = approveInfoListItem.getAuthQuantity();
                            if (authQuantity != null && Intrinsics.EZpvd(authQuantity.getCanEdit(), java.lang.Boolean.TRUE)) {
                                KYSApprovalType.Application application = KYSApprovalType.Companion;
                                ApproveInfoModuleModel.Spender spender = approveInfoListItem.getSpender();
                                if (application.OLrzqt(spender != null ? spender.getApprovalType() : null) != KYSApprovalType.CANCEL_AUTHORIZATION) {
                                    this.KWHzl.add(approveInfoListItem);
                                }
                            }
                        }
                    }
                }
            }
            this.copydefault = listAhwBna;
            return listAhwBna;
        }
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC9730bbB
    public boolean w_() {
        return djBIcL() > 0;
    }

    @Override // o.InterfaceC9736bbH
    public java.lang.String copydefault(int i, boolean z) {
        java.lang.String strEZpvd;
        java.lang.Integer signTokenPrecision;
        java.lang.Integer decimals;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = (ApproveInfoModuleModel.ApproveInfoListItem) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        if (approveInfoListItem != null) {
            java.lang.String amount = approveInfoListItem.getAmount();
            strEZpvd = amount == null ? "" : amount;
            ApproveInfoModuleModel.TxInfoItem tokenInfo = approveInfoListItem.getTokenInfo();
            int iIntValue = (tokenInfo == null || (decimals = tokenInfo.getDecimals()) == null) ? 0 : decimals.intValue();
            if (z) {
                ApproveInfoModuleModel.TxInfoItem tokenInfo2 = approveInfoListItem.getTokenInfo();
                strEZpvd = C54870xYj.EZpvd(strEZpvd, iIntValue, (tokenInfo2 == null || (signTokenPrecision = tokenInfo2.getSignTokenPrecision()) == null) ? 8 : signTokenPrecision.intValue(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            }
        } else {
            strEZpvd = null;
        }
        return strEZpvd == null ? "" : strEZpvd;
    }

    @Override // o.InterfaceC9736bbH
    public void copydefault(int i, @NotNull java.lang.String str) {
        EVM5792Call eip5792Call;
        Intrinsics.checkNotNullParameter(str, "");
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = (ApproveInfoModuleModel.ApproveInfoListItem) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        if (approveInfoListItem == null || (eip5792Call = approveInfoListItem.getEip5792Call()) == null) {
            return;
        }
        java.lang.String strCopydefault = C33491mxU.copydefault(str);
        if (C59449zhJ.startsWith$default(strCopydefault, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strCopydefault = strCopydefault.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iRJOkX = CollectionsKt___CollectionsKt.RJOkX(C56548yJl.AhwBna(0, 64 - strCopydefault.length()));
        for (int i2 = 0; i2 < iRJOkX; i2++) {
            sb.append("0");
        }
        sb.append(strCopydefault);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String data = eip5792Call.getData();
        if (data != null) {
            java.lang.String strSubstring = data.substring(0, data.length() - 64);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            eip5792Call.setData(strSubstring + string);
        }
    }

    @Override // o.InterfaceC9736bbH
    public InterfaceC9730bbB.StateListAnimator copydefault(int i) {
        ApproveInfoModuleModel.TxInfoItem tokenInfo;
        java.lang.String address;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = (ApproveInfoModuleModel.ApproveInfoListItem) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        if (approveInfoListItem == null || (tokenInfo = approveInfoListItem.getTokenInfo()) == null || (address = tokenInfo.getAddress()) == null) {
            return null;
        }
        C10854bwM c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, address, copydefault().dHguZz().fetchVPNInfo(), false, 4, null);
        java.lang.String strKWHzl = copydefault().DarRvM().KWHzl(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null, copydefault().htlTjW());
        WalletTickerManager.CoinPrice coinPriceCopydefault = copydefault().DarRvM().copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null);
        java.lang.String realPrice = coinPriceCopydefault != null ? coinPriceCopydefault.getRealPrice() : null;
        java.lang.String symbol = tokenInfo.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        return new InterfaceC9730bbB.StateListAnimator(address, strKWHzl, realPrice, symbol, C11600cUg.copydefault(tokenInfo.getDecimals()), C11600cUg.copydefault(tokenInfo.getSignTokenPrecision()), tokenInfo.getImageUrl(), null, null, 128, null);
    }

    @Override // o.InterfaceC9736bbH
    public java.lang.String KWHzl(int i) {
        ApproveInfoModuleModel.Spender spender;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = (ApproveInfoModuleModel.ApproveInfoListItem) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        java.lang.String address = (approveInfoListItem == null || (spender = approveInfoListItem.getSpender()) == null) ? null : spender.getAddress();
        return address == null ? "" : address;
    }

    @Override // o.InterfaceC9736bbH
    public int djBIcL() {
        return this.KWHzl.size();
    }

    public final void KWHzl(@NotNull EVM5792ContractSignData eVM5792ContractSignData) {
        Intrinsics.checkNotNullParameter(eVM5792ContractSignData, "");
        eVM5792ContractSignData.setTo(copydefault().htlTjW());
        java.lang.String id = eVM5792ContractSignData.getId();
        if (id == null || id.length() == 0) {
            xYW xyw = xYW.AEQbTJ;
            java.lang.String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            eVM5792ContractSignData.setId(C54910xZw.OLrzqt(xyw.values(string)));
        }
    }

    public final AbstractC58185ywX<ResponseData<DappTxResultBean>> OLrzqt(@NotNull final EVM5792ContractSignData eVM5792ContractSignData, @NotNull final BroadcastBean broadcastBean, @NotNull final Function0<? extends AbstractC58185ywX<ResponseData<DappTxResultBean>>> function0) {
        Intrinsics.checkNotNullParameter(eVM5792ContractSignData, "");
        Intrinsics.checkNotNullParameter(broadcastBean, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        final Function1 function1 = new Function1() { // from class: o.bMX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8955bMV.copydefault(broadcastBean, this, eVM5792ContractSignData, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bMZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8955bMV.copydefault(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.bNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8955bMV.copydefault(function0, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bNc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8955bMV.valueOf(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8955bMV.EZpvd(eVM5792ContractSignData, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<DappTxResultBean>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bNa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C8955bMV.AhwBna(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit copydefault(BroadcastBean broadcastBean, C8955bMV c8955bMV, EVM5792ContractSignData eVM5792ContractSignData, Unit unit) {
        java.util.Map map;
        java.lang.String strEZpvd;
        java.util.Map map2;
        java.lang.String strEZpvd2;
        Intrinsics.checkNotNullParameter(unit, "");
        PlatformItem dapp = c8955bMV.copydefault().OJuSTm().getDapp();
        broadcastBean.setDapp(dapp != null ? dapp.getUrlOnlyHost() : null);
        java.lang.String version = eVM5792ContractSignData.getVersion();
        java.lang.String id = eVM5792ContractSignData.getId();
        java.lang.String from = eVM5792ContractSignData.getFrom();
        java.lang.String chainId = eVM5792ContractSignData.getChainId();
        java.lang.Boolean atomicRequired = eVM5792ContractSignData.getAtomicRequired();
        java.util.List<EVM5792Call> calls = eVM5792ContractSignData.getCalls();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(calls, 10));
        for (EVM5792Call eVM5792Call : calls) {
            java.lang.String to = eVM5792Call.getTo();
            java.lang.String data = eVM5792Call.getData();
            java.lang.String value = eVM5792Call.getValue();
            java.util.Map<java.lang.String, JsonObject> capabilities = eVM5792Call.getCapabilities();
            if (capabilities == null || (strEZpvd2 = C33488mxR.EZpvd(capabilities)) == null) {
                map2 = null;
            } else {
                Json.Default r13 = Json.Default;
                r13.getSerializersModule();
                map2 = (java.util.Map) r13.decodeFromString(BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(StringSerializer.INSTANCE, kotlinx.serialization.json.JsonObject.Companion.serializer())), strEZpvd2);
            }
            arrayList.add(new EVM5792CallParams(to, data, value, map2));
        }
        java.util.Map<java.lang.String, JsonObject> capabilities2 = eVM5792ContractSignData.getCapabilities();
        if (capabilities2 == null || (strEZpvd = C33488mxR.EZpvd(capabilities2)) == null) {
            map = null;
        } else {
            Json.Default r2 = Json.Default;
            r2.getSerializersModule();
            map = (java.util.Map) r2.decodeFromString(BuiltinSerializersKt.getNullable(new LinkedHashMapSerializer(StringSerializer.INSTANCE, kotlinx.serialization.json.JsonObject.Companion.serializer())), strEZpvd);
        }
        broadcastBean.setSendCallsParams(new EVM5792SendCallsParams(version, id, from, chainId, atomicRequired, arrayList, map));
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(Function0 function0, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return (InterfaceC60096zvd) function0.invoke();
    }

    public static final ResponseData AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(EVM5792ContractSignData eVM5792ContractSignData, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        DappTxResultBean dappTxResultBean = (DappTxResultBean) responseData.getData();
        if (dappTxResultBean != null) {
            java.lang.String id = eVM5792ContractSignData.getId();
            dappTxResultBean.setSendCallsId(id != null ? id : "");
        }
        return responseData;
    }

    public final int OLrzqt(@NotNull ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem) {
        Intrinsics.checkNotNullParameter(approveInfoListItem, "");
        return this.KWHzl.indexOf(approveInfoListItem);
    }

    public final java.lang.String OLrzqt(int i, boolean z) {
        java.lang.String defaultAmount;
        ApproveInfoModuleModel.TxInfoItem tokenInfo;
        java.lang.Integer signTokenPrecision;
        ApproveInfoModuleModel.TxInfoItem tokenInfo2;
        java.lang.Integer decimals;
        ApproveInfoModuleModel.AuthQuantity authQuantity;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = (ApproveInfoModuleModel.ApproveInfoListItem) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        if (approveInfoListItem == null || (authQuantity = approveInfoListItem.getAuthQuantity()) == null || (defaultAmount = authQuantity.getDefaultAmount()) == null) {
            defaultAmount = "0";
        }
        java.lang.String str = defaultAmount;
        if (z) {
            return C54870xYj.EZpvd(str, (approveInfoListItem == null || (tokenInfo2 = approveInfoListItem.getTokenInfo()) == null || (decimals = tokenInfo2.getDecimals()) == null) ? 0 : decimals.intValue(), (approveInfoListItem == null || (tokenInfo = approveInfoListItem.getTokenInfo()) == null || (signTokenPrecision = tokenInfo.getSignTokenPrecision()) == null) ? 8 : signTokenPrecision.intValue(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return str;
    }

    public final java.lang.String OLrzqt(int i) {
        ApproveInfoModuleModel.AuthQuantity authQuantity;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = (ApproveInfoModuleModel.ApproveInfoListItem) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
        java.lang.String warnTip = (approveInfoListItem == null || (authQuantity = approveInfoListItem.getAuthQuantity()) == null) ? null : authQuantity.getWarnTip();
        return warnTip == null ? "" : warnTip;
    }

    public static final kotlin.Pair EZpvd(C8955bMV c8955bMV, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            c8955bMV.copydefault().QVsKAR().setData(((EVM5792CallDataRes) data).getCallData());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
