package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson;
import com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import com.okinc.wallet.core.sign.tron.Contract;
import com.okinc.wallet.core.sign.tron.Parameter;
import com.okinc.wallet.core.sign.tron.TronRawData;
import com.okinc.wallet.core.sign.tron.TronSignData;
import com.okinc.wallet.core.sign.tron.Value;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cYO extends AbstractC43215rlA implements WalletDappInteractionBizService {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return true;
    }

    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public AbstractC58185ywX<ResponseData<xWF>> EZpvd(@NotNull android.content.Context context, int i, @NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        return C11735cZg.Companion.OLrzqt(context, i, dappInteractionArgs, function1);
    }

    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public AbstractC58185ywX<java.util.List<WalletBtcAddressBean>> copydefault(@NotNull final java.lang.String str, long j, final java.lang.Integer num, final java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        final C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
        final Function1 function1 = new Function1() { // from class: o.cYQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cYO.EZpvd(str, c10854bwMCopydefault, num, num2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.cYW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cYO.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cYO.copydefault(c10854bwMCopydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<java.util.List<WalletBtcAddressBean>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cYO.valueOf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC60096zvd EZpvd(java.lang.String str, C10854bwM c10854bwM, java.lang.Integer num, java.lang.Integer num2, final AbstractC12782ctV abstractC12782ctV) {
        int i;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C13934dbu c13934dbu = new C13934dbu();
        java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
        java.lang.Long lValueOf = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.AhwBna()) : null;
        int iCopydefault = UTXOInfoReq.Companion.copydefault();
        java.util.ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctV.gGvvIC();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListGGvvIC) {
            ChainAddress chainAddress = (ChainAddress) obj;
            if (c10854bwM != null && chainAddress.getCoinId() == c10854bwM.AhwBna()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 1;
            if (it.hasNext()) {
                java.lang.String address = ((ChainAddress) it.next()).getAddress();
                if (num != null && num.intValue() == 3) {
                    i2 = 11;
                } else {
                    if (num != null && num.intValue() == 4) {
                        if ((num2 != null && num2.intValue() == 2) || (num2 != null && num2.intValue() == 8)) {
                            i = 6;
                        } else {
                            i = 13;
                            if ((num2 == null || num2.intValue() != 13) && ((num2 == null || num2.intValue() != 16) && (num2 == null || num2.intValue() != 17))) {
                                if ((num2 != null && num2.intValue() == 1) || ((num2 != null && num2.intValue() == 7) || ((num2 != null && num2.intValue() == 14) || (num2 != null && num2.intValue() == 15)))) {
                                }
                            }
                        }
                    } else if (num != null && num.intValue() == 5) {
                        if ((num2 == null || num2.intValue() != 2) && (num2 == null || num2.intValue() != 8)) {
                            if ((num2 == null || num2.intValue() != 1) && ((num2 == null || num2.intValue() != 7) && ((num2 == null || num2.intValue() != 14) && num2 != null))) {
                                num2.intValue();
                            }
                        }
                        i = 6;
                    }
                    java.util.ArrayList arrayList3 = arrayList2;
                    arrayList3.add(new UTXOAddressInfoReq(address, "0", "0", java.lang.Integer.valueOf(i), "", (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, num2, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59360, (DefaultConstructorMarker) null));
                    arrayList2 = arrayList3;
                    iCopydefault = iCopydefault;
                    lValueOf = lValueOf;
                    strUSBtdM = strUSBtdM;
                    c13934dbu = c13934dbu;
                }
                i = i2;
                java.util.ArrayList arrayList32 = arrayList2;
                arrayList32.add(new UTXOAddressInfoReq(address, "0", "0", java.lang.Integer.valueOf(i), "", (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, num2, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59360, (DefaultConstructorMarker) null));
                arrayList2 = arrayList32;
                iCopydefault = iCopydefault;
                lValueOf = lValueOf;
                strUSBtdM = strUSBtdM;
                c13934dbu = c13934dbu;
            } else {
                AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c13934dbu.KWHzl(strUSBtdM, str, new UTXOInfoReq(lValueOf, arrayList2, iCopydefault)), (Function1) null, 1, (java.lang.Object) null);
                final Function1 function1 = new Function1() { // from class: o.cYT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return cYO.OLrzqt(abstractC12782ctV, (java.util.List) obj2);
                    }
                };
                return abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return cYO.AYXKKw(function1, obj2);
                    }
                });
            }
        }
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, list);
    }

    public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(C10854bwM c10854bwM, kotlin.Pair pair) {
        int value;
        java.lang.String strFJNWhG;
        Intrinsics.checkNotNullParameter(pair, "");
        C12797ctk c12797ctk = new C12797ctk();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.Iterable<UTXOInfoResp> iterable = (java.lang.Iterable) second;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (UTXOInfoResp uTXOInfoResp : iterable) {
            java.lang.String address = uTXOInfoResp.getAddress();
            java.lang.String str = address == null ? "" : address;
            java.lang.String canTransferAmount = uTXOInfoResp.getCanTransferAmount();
            if (canTransferAmount == null) {
                canTransferAmount = "0";
            }
            if (c10854bwM != null) {
                java.lang.Object first = pair.getFirst();
                Intrinsics.checkNotNullExpressionValue(first, "");
                value = c12797ctk.EZpvd((AbstractC12782ctV) first, c10854bwM, str);
            } else {
                value = AddressType.Legacy.getValue();
            }
            arrayList.add(new WalletBtcAddressBean(str, value, canTransferAmount, C54870xYj.EZpvd(canTransferAmount, c10854bwM != null ? c10854bwM.valueOf() : 0, c10854bwM != null ? c10854bwM.AkhnZx() : 0, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), (c10854bwM == null || (strFJNWhG = c10854bwM.fJNWhG()) == null) ? "" : strFJNWhG));
        }
        return arrayList;
    }

    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public void EZpvd(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, java.lang.Long l, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        activity.startActivity(ActivityC21019grp.Companion.copydefault(activity, str, str2, str3, str4, TransactionType.TypeInscribe, num, l, str5));
    }

    /* JADX DEBUG: Type inference failed for r11v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.wallet.api.WalletDappInteractionBizService$SubmitResult> */
    @Override // com.okinc.wallet.api.WalletDappInteractionBizService
    public AbstractC58185ywX<WalletDappInteractionBizService.SubmitResult> EZpvd(@NotNull final DappInteractionArgs dappInteractionArgs) {
        TronRawData raw_data;
        java.util.List<Contract> contract;
        Contract contract2;
        Parameter parameter;
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        final TronSignData tronSignData = (TronSignData) C33490mxT.EZpvd(dappInteractionArgs.getSignDataJson(), TronSignData.class);
        PlatformItem dapp = dappInteractionArgs.getDapp();
        if (dapp != null) {
            dapp.getUrl();
        }
        final C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(dappInteractionArgs.getChainId()));
        final Value value = (tronSignData == null || (raw_data = tronSignData.getRaw_data()) == null || (contract = raw_data.getContract()) == null || (contract2 = (Contract) CollectionsKt___CollectionsKt.firstOrNull(contract)) == null || (parameter = contract2.getParameter()) == null) ? null : parameter.getValue();
        java.lang.String data = value != null ? value.getData() : null;
        boolean z = data == null || data.length() == 0;
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(dappInteractionArgs.getWalletId(), true);
        final boolean z2 = z;
        final Function1 function1 = new Function1() { // from class: o.cYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cYO.EZpvd(c10854bwMCopydefault, tronSignData, z2, value, dappInteractionArgs, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.cYV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cYO.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC60096zvd EZpvd(C10854bwM c10854bwM, final TronSignData tronSignData, boolean z, Value value, final DappInteractionArgs dappInteractionArgs, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String contract_address;
        java.lang.Long call_value;
        java.lang.String txHashValue;
        java.util.List<java.lang.String> fullSignature;
        java.lang.String address;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM != null ? c10854bwM.AhwBna() : -1L, null, 2, null);
        java.lang.String str = (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) ? "" : address;
        C13934dbu c13934dbu = new C13934dbu();
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
        java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
        java.lang.String strDbNXlk2 = abstractC12782ctV.DbNXlk();
        int iOLrzqt = WalletType.Companion.OLrzqt(abstractC12782ctV);
        java.lang.String str2 = (tronSignData == null || (fullSignature = tronSignData.getFullSignature()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(fullSignature);
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = (tronSignData == null || (txHashValue = tronSignData.getTxHashValue()) == null) ? "" : txHashValue;
        if (z) {
            contract_address = value != null ? value.getTo_address() : null;
            if (contract_address == null || contract_address.length() == 0) {
                contract_address = str;
            }
        } else {
            contract_address = value != null ? value.getContract_address() : null;
        }
        java.lang.String str5 = contract_address == null ? "" : contract_address;
        long jAhwBna = c10854bwM != null ? c10854bwM.AhwBna() : -1L;
        if (z) {
            call_value = value != null ? value.getAmount() : null;
        } else if (value != null) {
            call_value = value.getCall_value();
        }
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C33129mqd.gEmmrt(call_value), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(tronSignData != null ? tronSignData.getServiceCharge() : null, true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.Integer source = dappInteractionArgs.getSource();
        int iIntValue = source != null ? source.intValue() : 2;
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(new CommonExtJson(c10854bwM != null ? c10854bwM.valueOf() : 0, 0, null));
        Intrinsics.checkNotNullExpressionValue(json, "");
        AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXKWHzl = c13934dbu.KWHzl(strDbNXlk, strUSBtdM, strAUsmxb, new BroadcastBean(strDbNXlk2, iOLrzqt, str3, str4, str, str5, jAhwBna, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, iIntValue, string, json, (java.lang.String) null, value != null ? value.getData() : null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (UserOperation) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (EVM5792SendCallsParams) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.Integer) null, (java.lang.String) null, -12288, 7, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cYO.OLrzqt(tronSignData, dappInteractionArgs, (ResponseData) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cYO.gEmmrt(function1, obj);
            }
        });
    }

    public static final WalletDappInteractionBizService.SubmitResult gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletDappInteractionBizService.SubmitResult) function1.invoke(obj);
    }

    public static final WalletDappInteractionBizService.SubmitResult OLrzqt(TronSignData tronSignData, DappInteractionArgs dappInteractionArgs, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            return new WalletDappInteractionBizService.SubmitResult(0, null, null, null, null, null, new GsonBuilder().disableHtmlEscaping().create().toJson(new OKWTronSignContract.TronSignResultData(true, tronSignData != null ? tronSignData.getTxID() : null, (TronContractSignData) new Gson().fromJson(dappInteractionArgs.getSignDataJson(), TronContractSignData.class))), false, false, 446, null);
        }
        return new WalletDappInteractionBizService.SubmitResult(-1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.Dfm), null, null, null, null, new GsonBuilder().disableHtmlEscaping().create().toJson(new OKWTronSignContract.TronSignResultData(false, tronSignData != null ? tronSignData.getTxID() : null, (TronContractSignData) new Gson().fromJson(dappInteractionArgs.getSignDataJson(), TronContractSignData.class))), false, false, 444, null);
    }
}
