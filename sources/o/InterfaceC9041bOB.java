package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.evm.bean.AAEvmSignInfo;
import com.okinc.business.defi.biz.net.bean.AAAccountInfo;
import com.okinc.business.defi.biz.net.bean.AAApprovalInfo;
import com.okinc.business.defi.biz.net.bean.ApproveAAItemParam;
import com.okinc.business.defi.biz.net.bean.ApproveAASubRequest;
import com.okinc.business.defi.biz.net.bean.Paymaster;
import com.okinc.business.defi.biz.net.bean.PaymasterToken;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.transfer.manager.FreeGasManager;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.evm.ExecuteParams;
import com.okinc.wallet.core.sign.evm.ExecuteParamsTriple;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC9041bOB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bOB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9041bOB extends InterfaceC9729bbA {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    void AEQbTJ(@NotNull AAAccountInfo aAAccountInfo);

    AAAccountInfo AYXKKw();

    xYJ AkhnZx();

    java.util.List<PaymasterToken> AuCTel();

    AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AubY();

    AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AwvSrB();

    AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AxsJAY();

    java.util.List<C9168bQW> DbNXlk();

    void EZpvd(@NotNull java.util.List<PaymasterToken> list);

    void KWHzl(@NotNull java.util.List<C9168bQW> list);

    void OLrzqt(@NotNull AbstractC9226bRb abstractC9226bRb);

    AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull Function1<? super java.lang.String, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1);

    void copydefault(@NotNull FreeGasManager.UserFreeGasInfo userFreeGasInfo);

    Function1<PaymasterToken, Unit> ejfBZ();

    FreeGasManager.UserFreeGasInfo fARcdN();

    java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<java.lang.String>> fJNWhG();

    java.lang.String fetchVPNInfo();

    boolean gHZMYf();

    AbstractC8564bFB<?, ?> getFieldNames();

    AAEvmSignInfo hDKMBd();

    C9225bRa isConnected();

    AbstractC9226bRb iwGUEr();

    boolean sSMYrx();

    int uzCIH();

    FreeGasManager valueOf();

    int zsXlph();

    /* JADX INFO: renamed from: o.bOB$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.bOB$Application */
    public static final class Application {
        public static int AYXKKw(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return 1;
        }

        public static int gEmmrt(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return 0;
        }

        public static Function1<PaymasterToken, Unit> valueOf(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return null;
        }

        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> isConnected(@NotNull final InterfaceC9041bOB interfaceC9041bOB) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAwvSrB = interfaceC9041bOB.AwvSrB();
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAhwBna = AhwBna(interfaceC9041bOB);
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = AEQbTJ(interfaceC9041bOB);
            final yHO yho = new yHO() { // from class: o.bPs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InterfaceC9041bOB.Application.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
                }
            };
            AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXAwvSrB, abstractC58185ywXAhwBna, abstractC58185ywXAEQbTJ, new InterfaceC58228yxN() { // from class: o.bPp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58228yxN
                public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InterfaceC9041bOB.Application.copydefault(yho, obj, obj2, obj3);
                }
            });
            final Function1 function1 = new Function1() { // from class: o.bPr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.OLrzqt(interfaceC9041bOB, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bPt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.getNewProxyInstance(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }

        public static kotlin.Pair copydefault(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            Intrinsics.checkNotNullParameter(obj3, "");
            return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
        }

        public static kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            Intrinsics.checkNotNullParameter(pair3, "");
            return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair3.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }

        public static InterfaceC60096zvd getNewProxyInstance(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static InterfaceC60096zvd OLrzqt(final InterfaceC9041bOB interfaceC9041bOB, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAubY = interfaceC9041bOB.AubY();
                AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAxsJAY = interfaceC9041bOB.AxsJAY();
                final Function2 function2 = new Function2() { // from class: o.bOL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return InterfaceC9041bOB.Application.OLrzqt(interfaceC9041bOB, (kotlin.Pair) obj, (kotlin.Pair) obj2);
                    }
                };
                return AbstractC58185ywX.EZpvd(abstractC58185ywXAubY, abstractC58185ywXAxsJAY, new InterfaceC58223yxI() { // from class: o.bOO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58223yxI
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        return InterfaceC9041bOB.Application.copydefault(function2, obj, obj2);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(pair);
        }

        public static kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return (kotlin.Pair) function2.invoke(obj, obj2);
        }

        public static kotlin.Pair OLrzqt(InterfaceC9041bOB interfaceC9041bOB, kotlin.Pair pair, kotlin.Pair pair2) {
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(pair2, "");
            if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
                return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond());
            }
            if (!((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
                return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond());
            }
            interfaceC9041bOB.isConnected().AwvSrB();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }

        public static AbstractC58185ywX<Unit> fetchVPNInfo(@NotNull final InterfaceC9041bOB interfaceC9041bOB) {
            long jFetchVPNInfo = interfaceC9041bOB.getFieldNames().dHguZz().fetchVPNInfo();
            AbstractC58185ywX abstractC58185ywXOLrzqt = FreeGasManager.getUserFreeGasStatus$default(interfaceC9041bOB.valueOf(), "freeGasAA", jFetchVPNInfo, interfaceC9041bOB.getFieldNames().fERRXa().getAddress(), null, 8, null).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(new FreeGasManager.UserFreeGasInfo(jFetchVPNInfo, null, 0, 0, -1, null, 46, null)));
            final Function1 function1 = new Function1() { // from class: o.bOK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.copydefault(interfaceC9041bOB, (FreeGasManager.UserFreeGasInfo) obj);
                }
            };
            AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.hDKMBd(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static Unit hDKMBd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Unit) function1.invoke(obj);
        }

        public static Unit copydefault(InterfaceC9041bOB interfaceC9041bOB, FreeGasManager.UserFreeGasInfo userFreeGasInfo) {
            Intrinsics.checkNotNullParameter(userFreeGasInfo, "");
            interfaceC9041bOB.copydefault(userFreeGasInfo);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AhwBna(final InterfaceC9041bOB interfaceC9041bOB) {
            AbstractC58185ywX<ResponseData<java.util.ArrayList<PaymasterToken>>> abstractC58185ywXAYXKKw = interfaceC9041bOB.getFieldNames().ixgjPv().AYXKKw(interfaceC9041bOB.getFieldNames().dHguZz().fetchVPNInfo(), interfaceC9041bOB.getFieldNames().fERRXa().getAddress());
            final Function1 function1 = new Function1() { // from class: o.bPy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.EZpvd(interfaceC9041bOB, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAYXKKw.KWHzl(new InterfaceC58229yxO() { // from class: o.bPw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.fJNWhG(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd fJNWhG(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(final InterfaceC9041bOB interfaceC9041bOB) {
            java.util.ArrayList<Paymaster> payMaster;
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            for (PaymasterToken paymasterToken : interfaceC9041bOB.AuCTel()) {
                if (paymasterToken.getCoinMeta().DCUTEIddSDPG() && (payMaster = paymasterToken.getPayMaster()) != null) {
                    for (Paymaster paymaster : payMaster) {
                        if (paymaster != null && !paymaster.isFreeGasPaymaster()) {
                            java.lang.String address = interfaceC9041bOB.getFieldNames().fERRXa().getAddress();
                            java.lang.String contractAddress = paymasterToken.getContractAddress();
                            arrayList.add(new ApproveAAItemParam(address, contractAddress == null ? "" : contractAddress, paymaster.getRealPaymasterAddress(), java.lang.Long.valueOf(interfaceC9041bOB.getFieldNames().dHguZz().fetchVPNInfo()), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                AbstractC58185ywX<ResponseData<java.util.ArrayList<AAApprovalInfo>>> abstractC58185ywXOLrzqt = interfaceC9041bOB.getFieldNames().ixgjPv().OLrzqt(new ApproveAASubRequest(arrayList));
                final Function1 function1 = new Function1() { // from class: o.bOD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.OLrzqt(arrayList, interfaceC9041bOB, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bOH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.fIwbmz(function1, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }

        public static InterfaceC60096zvd fIwbmz(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static int djBIcL(InterfaceC9041bOB interfaceC9041bOB) {
            return interfaceC9041bOB.getFieldNames().dUDNAs().AEQbTJ(WalletType.HardwareWallet) ? 1 : 0;
        }

        /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(final InterfaceC9041bOB interfaceC9041bOB) {
            AbstractC58185ywX<ResponseData<AAAccountInfo>> abstractC58185ywXCopydefault = interfaceC9041bOB.getFieldNames().ixgjPv().copydefault(interfaceC9041bOB.getFieldNames().dHguZz().fetchVPNInfo(), interfaceC9041bOB.getFieldNames().fERRXa().getAddress());
            final Function1 function1 = new Function1() { // from class: o.bOJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.copydefault(interfaceC9041bOB, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bOG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.ejfBZ(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd ejfBZ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static boolean DbNXlk(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return C33129mqd.gEmmrt(interfaceC9041bOB.AYXKKw().getVersion(), "4") && Intrinsics.EZpvd(interfaceC9041bOB.AYXKKw().isDeploye(), java.lang.Boolean.TRUE);
        }

        public static AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> values(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return interfaceC9041bOB.iwGUEr().gEmmrt();
        }

        public static boolean copydefault(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return interfaceC9041bOB.isConnected().wlaJM();
        }

        public static boolean AkhnZx(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            Paymaster paymasterAuCTel = interfaceC9041bOB.isConnected().AuCTel();
            if (paymasterAuCTel == null) {
                return false;
            }
            return C33129mqd.KWHzl((java.util.Collection) interfaceC9041bOB.fJNWhG().get(C56390yDp.OLrzqt(paymasterAuCTel.getRealPaymasterAddress(), interfaceC9041bOB.isConnected().getFieldNames())));
        }

        public static AbstractC58185ywX<ResponseData<UserOperation>> KWHzl(@NotNull final InterfaceC9041bOB interfaceC9041bOB, @NotNull final TxToastCheckReq txToastCheckReq, @NotNull final java.util.List<ExecuteParams> list, @NotNull final Function1<? super java.lang.String, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
            Intrinsics.checkNotNullParameter(txToastCheckReq, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function1, "");
            final UserOperation userOperationValueOf = interfaceC9041bOB.iwGUEr().valueOf();
            int iCurrentTimeMillis = (int) (java.lang.System.currentTimeMillis() / ((long) 1000));
            java.lang.Integer signatureTimeout = interfaceC9041bOB.AYXKKw().getSignatureTimeout();
            final int iIntValue = iCurrentTimeMillis + (signatureTimeout != null ? signatureTimeout.intValue() : 360);
            C9170bQY c9170bQYHDKMBd = interfaceC9041bOB.isConnected().hDKMBd();
            Paymaster paymasterValueOf = c9170bQYHDKMBd.valueOf();
            final java.util.ArrayList arrayList = null;
            java.lang.String realPaymasterAddress = paymasterValueOf != null ? paymasterValueOf.getRealPaymasterAddress() : null;
            java.lang.String strDjBIcL = c9170bQYHDKMBd.djBIcL();
            if (realPaymasterAddress != null && strDjBIcL != null) {
                java.util.List<java.lang.String> list2 = interfaceC9041bOB.fJNWhG().get(C56390yDp.OLrzqt(realPaymasterAddress, strDjBIcL));
                if (C33129mqd.KWHzl((java.util.Collection) list2)) {
                    Intrinsics.copydefault(list2);
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                    java.util.Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ExecuteParams(java.lang.Boolean.FALSE, strDjBIcL, "0", (java.lang.String) it.next(), (java.util.List) null, 16, (DefaultConstructorMarker) null));
                    }
                }
            }
            final java.util.List<ExecuteParams> listKWHzl = interfaceC9041bOB.iwGUEr().KWHzl();
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAwvSrB = interfaceC9041bOB.AwvSrB();
            final Function1 function12 = new Function1() { // from class: o.bOZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.KWHzl(interfaceC9041bOB, arrayList, listKWHzl, list, userOperationValueOf, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAwvSrB.KWHzl(new InterfaceC58229yxO() { // from class: o.bPf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.getFieldNames(function12, obj);
                }
            });
            final Function1 function13 = new Function1() { // from class: o.bPh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.EZpvd(interfaceC9041bOB, userOperationValueOf, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.bPj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.iwGUEr(function13, obj);
                }
            });
            final Function1 function14 = new Function1() { // from class: o.bPi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.KWHzl(interfaceC9041bOB, userOperationValueOf, iIntValue, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.bPg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.uzCIH(function14, obj);
                }
            });
            final Function1 function15 = new Function1() { // from class: o.bPn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.copydefault(function1, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.KWHzl(new InterfaceC58229yxO() { // from class: o.bPk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.zLjUOn(function15, obj);
                }
            });
            final Function1 function16 = new Function1() { // from class: o.bPm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.EZpvd(interfaceC9041bOB, iIntValue, userOperationValueOf, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl5 = abstractC58185ywXKWHzl4.KWHzl(new InterfaceC58229yxO() { // from class: o.bPo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.wlaJM(function16, obj);
                }
            });
            final Function1 function17 = new Function1() { // from class: o.bOW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.KWHzl(txToastCheckReq, userOperationValueOf, interfaceC9041bOB, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl6 = abstractC58185ywXKWHzl5.KWHzl(new InterfaceC58229yxO() { // from class: o.bOX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.AuCTelauCTel(function17, obj);
                }
            });
            final Function1 function18 = new Function1() { // from class: o.bOY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.EZpvd(interfaceC9041bOB, userOperationValueOf, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl7 = abstractC58185ywXKWHzl6.KWHzl(new InterfaceC58229yxO() { // from class: o.bOV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.sSMYrx(function18, obj);
                }
            });
            final Function1 function19 = new Function1() { // from class: o.bPa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.copydefault(interfaceC9041bOB, userOperationValueOf, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl8 = abstractC58185ywXKWHzl7.KWHzl(new InterfaceC58229yxO() { // from class: o.bPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.gHZMYf(function19, obj);
                }
            });
            final Function1 function110 = new Function1() { // from class: o.bPb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.copydefault(userOperationValueOf, (ResponseData) obj);
                }
            };
            AbstractC58185ywX<ResponseData<UserOperation>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl8.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bPc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.AxsJAY(function110, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static InterfaceC60096zvd getFieldNames(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static InterfaceC60096zvd KWHzl(InterfaceC9041bOB interfaceC9041bOB, java.util.List list, java.util.List list2, java.util.List list3, UserOperation userOperation, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
                return interfaceC9041bOB.iwGUEr().AEQbTJ(new ExecuteParamsTriple(list, list2, list3), userOperation);
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd iwGUEr(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static InterfaceC60096zvd EZpvd(InterfaceC9041bOB interfaceC9041bOB, UserOperation userOperation, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
                return interfaceC9041bOB.iwGUEr().copydefault(userOperation);
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd uzCIH(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static InterfaceC60096zvd KWHzl(InterfaceC9041bOB interfaceC9041bOB, UserOperation userOperation, int i, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
                return interfaceC9041bOB.iwGUEr().EZpvd(userOperation, i);
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(null, pair.getSecond()));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static InterfaceC60096zvd copydefault(Function1 function1, kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            java.lang.String str = (java.lang.String) pair.getFirst();
            if (str != null) {
                return (AbstractC58185ywX) function1.invoke(str);
            }
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5000, str2 == null ? "" : str2, null, null, null, null, 60, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static void KWHzl(InterfaceC9041bOB interfaceC9041bOB, final ResponseData responseData, int i, final UserOperation userOperation, final InterfaceC58184ywW interfaceC58184ywW) {
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            xYZ xyz = xYZ.KWHzl;
            xYJ xyjAkhnZx = interfaceC9041bOB.AkhnZx();
            java.lang.String str = (java.lang.String) responseData.getData();
            if (str == null) {
                str = "";
            }
            xyz.copydefault(xyjAkhnZx, str, i, djBIcL(interfaceC9041bOB), new android.webkit.ValueCallback() { // from class: o.bPq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    InterfaceC9041bOB.Application.AEQbTJ(interfaceC58184ywW, userOperation, responseData, (java.lang.String) obj);
                }
            });
        }

        public static void AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, UserOperation userOperation, ResponseData responseData, java.lang.String str) {
            Intrinsics.copydefault((java.lang.Object) str);
            if (str.length() == 0 || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractJsonLexerKt.NULL)) {
                interfaceC58184ywW.onNext(new ResponseData(-5000, null, null, null, null, null, 62, null));
            } else {
                userOperation.setSignature(str);
                interfaceC58184ywW.onNext(responseData);
            }
            interfaceC58184ywW.onComplete();
        }

        public static InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static ResponseData zsXlph(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static InterfaceC60096zvd sSMYrx(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static ResponseData AubY(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static ResponseData OLrzqt(kotlin.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            if (pair.getFirst() == null) {
                return new ResponseData(-5000, null, null, null, null, null, 62, null);
            }
            return new ResponseData(-5001, null, null, null, pair.getFirst(), null, 46, null);
        }

        public static InterfaceC60096zvd gHZMYf(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC60096zvd) function1.invoke(obj);
        }

        public static ResponseData AwvSrB(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static ResponseData AxsJAY(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static java.lang.String OLrzqt(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            java.lang.String nonce = interfaceC9041bOB.hDKMBd().getNonce();
            return nonce == null ? "" : nonce;
        }

        public static boolean fARcdN(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            java.lang.Boolean boolIsDeploye = interfaceC9041bOB.AYXKKw().isDeploye();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            return !Intrinsics.EZpvd(boolIsDeploye, bool) && Intrinsics.EZpvd(interfaceC9041bOB.AYXKKw().getShowInitGas(), bool);
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC9041bOB interfaceC9041bOB) {
            return C9225bRa.getGasPrice$default(interfaceC9041bOB.isConnected(), 0, 1, null);
        }

        public static void EZpvd(@NotNull InterfaceC9041bOB interfaceC9041bOB, @NotNull JsonObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "");
            jsonObject.addProperty("gasPrice", C9225bRa.getGasPrice$default(interfaceC9041bOB.isConnected(), 0, 1, null));
            jsonObject.addProperty("gasLimit", interfaceC9041bOB.isConnected().getNewProxyInstance());
            jsonObject.addProperty("nonce", interfaceC9041bOB.fetchVPNInfo());
        }

        public static AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull InterfaceC9041bOB interfaceC9041bOB, @NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
            Intrinsics.checkNotNullParameter(str, "");
            return interfaceC9041bOB.copydefault(new Function1() { // from class: o.bOI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.KWHzl(str, (java.lang.String) obj);
                }
            });
        }

        public static AbstractC58185ywX KWHzl(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
                str = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            java.lang.String strAEQbTJ = xYZ.KWHzl.AEQbTJ(str, str2, false);
            if (strAEQbTJ.length() != 0) {
                strAEQbTJ = EIP1271Verifier.hexPrefix + strAEQbTJ;
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, strAEQbTJ, null, 46, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }

        public static AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull final InterfaceC9041bOB interfaceC9041bOB, SubmitTxExpandBean submitTxExpandBean) {
            return interfaceC9041bOB.copydefault(new Function1() { // from class: o.bPl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.OLrzqt(interfaceC9041bOB, (java.lang.String) obj);
                }
            });
        }

        public static AbstractC58185ywX OLrzqt(InterfaceC9041bOB interfaceC9041bOB, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C59449zhJ.startsWith$default(str, EIP1271Verifier.hexPrefix, false, 2, null)) {
                str = str.substring(2);
                Intrinsics.checkNotNullExpressionValue(str, "");
            }
            return LedgerSignHelper.AEQbTJ.EZpvd(interfaceC9041bOB.getFieldNames().dHguZz(), interfaceC9041bOB.getFieldNames().fERRXa(), str);
        }

        public static AbstractC58185ywX<ResponseData<BatchBroadcastModel>> AEQbTJ(@NotNull final InterfaceC9041bOB interfaceC9041bOB, @NotNull final java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
            Intrinsics.checkNotNullParameter(str, "");
            return interfaceC9041bOB.copydefault(new Function1() { // from class: o.bOU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.AEQbTJ(str, interfaceC9041bOB, (java.lang.String) obj);
                }
            });
        }

        public static AbstractC58185ywX AEQbTJ(java.lang.String str, InterfaceC9041bOB interfaceC9041bOB, final java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return C10965byR.OLrzqt.KWHzl(str, interfaceC9041bOB.getFieldNames().dUDNAs(), interfaceC9041bOB.getFieldNames().dHguZz(), new Function0() { // from class: o.bPx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return InterfaceC9041bOB.Application.OLrzqt(str2);
                }
            }, new Function1() { // from class: o.bPv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.EZpvd((RSV) obj);
                }
            }, new Function1() { // from class: o.bPu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InterfaceC9041bOB.Application.copydefault((java.lang.String) obj);
                }
            });
        }

        public static java.lang.String OLrzqt(java.lang.String str) {
            return xYZ.KWHzl.EZpvd(str, false);
        }

        public static java.lang.String EZpvd(RSV rsv) {
            Intrinsics.checkNotNullParameter(rsv, "");
            return xYZ.KWHzl.EZpvd(rsv.getR(), rsv.getS(), rsv.getV());
        }

        public static java.lang.String copydefault(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C54910xZw.OLrzqt(str);
        }

        public static InterfaceC60096zvd EZpvd(InterfaceC9041bOB interfaceC9041bOB, ResponseData responseData) {
            C10854bwM c10854bwMKWHzl;
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (PaymasterToken paymasterToken : (java.util.ArrayList) data) {
                    if (paymasterToken.getCoinId() != null && C33129mqd.KWHzl((java.util.Collection) paymasterToken.getPayMaster()) && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(paymasterToken.getCoinId())) != null) {
                        paymasterToken.setCoinMeta(c10854bwMKWHzl);
                        paymasterToken.setAaGasLimitRes(new java.util.ArrayList<>());
                        if (c10854bwMKWHzl.AuCTel()) {
                            java.util.ArrayList<Paymaster> payMaster = paymasterToken.getPayMaster();
                            Intrinsics.copydefault(payMaster);
                            int i = 0;
                            for (java.lang.Object obj : payMaster) {
                                if (i < 0) {
                                    yDY.AYXKKw();
                                }
                                Paymaster paymaster = (Paymaster) obj;
                                java.lang.String address = paymaster != null ? paymaster.getAddress() : null;
                                if (address == null || address.length() == 0) {
                                    java.util.ArrayList<Paymaster> payMaster2 = paymasterToken.getPayMaster();
                                    Intrinsics.copydefault(payMaster2);
                                    payMaster2.set(i, null);
                                }
                                i++;
                            }
                        }
                        Function1<PaymasterToken, Unit> function1EjfBZ = interfaceC9041bOB.ejfBZ();
                        if (function1EjfBZ != null) {
                            function1EjfBZ.invoke(paymasterToken);
                        }
                        if (C33129mqd.KWHzl((java.util.Collection) paymasterToken.getPayMaster())) {
                            arrayList.add(paymasterToken);
                        }
                    }
                }
                interfaceC9041bOB.EZpvd(arrayList);
                return EZpvd(interfaceC9041bOB);
            }
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }

        public static InterfaceC60096zvd OLrzqt(java.util.List list, InterfaceC9041bOB interfaceC9041bOB, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0) {
                java.util.ArrayList<AAApprovalInfo> arrayList = (java.util.ArrayList) responseData.getData();
                if (arrayList != null) {
                    for (AAApprovalInfo aAApprovalInfo : arrayList) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ApproveAAItemParam approveAAItemParam = (ApproveAAItemParam) it.next();
                            if (Intrinsics.EZpvd((java.lang.Object) aAApprovalInfo.getApprovalAddress(), (java.lang.Object) approveAAItemParam.getApprovalAddress()) && Intrinsics.EZpvd((java.lang.Object) aAApprovalInfo.getTokenAddress(), (java.lang.Object) approveAAItemParam.getTo())) {
                                java.lang.Integer status = aAApprovalInfo.getStatus();
                                if (status == null || status.intValue() != 1 || !Intrinsics.EZpvd((java.lang.Object) aAApprovalInfo.getApprovalNum(), (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                                    java.util.Map<kotlin.Pair<java.lang.String, java.lang.String>, java.util.List<java.lang.String>> mapFJNWhG = interfaceC9041bOB.fJNWhG();
                                    java.lang.String approvalAddress = aAApprovalInfo.getApprovalAddress();
                                    if (approvalAddress == null) {
                                        approvalAddress = "";
                                    }
                                    java.lang.String tokenAddress = aAApprovalInfo.getTokenAddress();
                                    if (tokenAddress == null) {
                                        tokenAddress = "";
                                    }
                                    kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = C56390yDp.OLrzqt(approvalAddress, tokenAddress);
                                    java.lang.String[] strArr = new java.lang.String[2];
                                    java.lang.String approvalAddress2 = aAApprovalInfo.getApprovalAddress();
                                    strArr[0] = "0x095ea7b3000000000000000000000000" + (approvalAddress2 != null ? StringsKt__StringsKt.substringAfter$default(approvalAddress2, EIP1271Verifier.hexPrefix, (java.lang.String) null, 2, (java.lang.Object) null) : null) + "0000000000000000000000000000000000000000000000000000000000000000";
                                    java.lang.String approvalAddress3 = aAApprovalInfo.getApprovalAddress();
                                    strArr[1] = "0x095ea7b3000000000000000000000000" + (approvalAddress3 != null ? StringsKt__StringsKt.substringAfter$default(approvalAddress3, EIP1271Verifier.hexPrefix, (java.lang.String) null, 2, (java.lang.Object) null) : null) + "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
                                    mapFJNWhG.put(pairOLrzqt, yDY.gEmmrt(strArr));
                                }
                                it.remove();
                            }
                        }
                    }
                }
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ApproveAAItemParam approveAAItemParam2 = (ApproveAAItemParam) it2.next();
                    interfaceC9041bOB.fJNWhG().put(C56390yDp.OLrzqt(approveAAItemParam2.getApprovalAddress(), approveAAItemParam2.getTo()), yDY.gEmmrt("0x095ea7b3000000000000000000000000" + StringsKt__StringsKt.substringAfter$default(approveAAItemParam2.getApprovalAddress(), EIP1271Verifier.hexPrefix, (java.lang.String) null, 2, (java.lang.Object) null) + "0000000000000000000000000000000000000000000000000000000000000000", "0x095ea7b3000000000000000000000000" + StringsKt__StringsKt.substringAfter$default(approveAAItemParam2.getApprovalAddress(), EIP1271Verifier.hexPrefix, (java.lang.String) null, 2, (java.lang.Object) null) + "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"));
                }
                return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            }
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
        }

        public static InterfaceC60096zvd copydefault(InterfaceC9041bOB interfaceC9041bOB, ResponseData responseData) {
            AbstractC9226bRb c9249bRy;
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                interfaceC9041bOB.AEQbTJ((AAAccountInfo) data);
                if (interfaceC9041bOB.gHZMYf()) {
                    c9249bRy = new C9227bRc(interfaceC9041bOB.getFieldNames(), interfaceC9041bOB);
                } else {
                    c9249bRy = new C9249bRy(interfaceC9041bOB.getFieldNames(), interfaceC9041bOB);
                }
                interfaceC9041bOB.OLrzqt(c9249bRy);
                java.lang.Boolean boolIsDeploye = interfaceC9041bOB.AYXKKw().isDeploye();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!Intrinsics.EZpvd(boolIsDeploye, bool)) {
                    return interfaceC9041bOB.iwGUEr().EZpvd();
                }
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, ""));
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }

        public static InterfaceC60096zvd EZpvd(final InterfaceC9041bOB interfaceC9041bOB, final int i, final UserOperation userOperation, final ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 || responseData.getCode() == -5001) {
                return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.bPd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58187ywZ
                    public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                        InterfaceC9041bOB.Application.KWHzl(interfaceC9041bOB, responseData, i, userOperation, interfaceC58184ywW);
                    }
                }, BackpressureStrategy.BUFFER);
            }
            return AbstractC58185ywX.KWHzl(responseData);
        }

        public static ResponseData copydefault(ResponseData responseData, ResponseData responseData2) {
            Intrinsics.checkNotNullParameter(responseData2, "");
            if (responseData2.getCode() == 0) {
                if (C33129mqd.KWHzl((java.util.Collection) responseData2.getData())) {
                    java.lang.Object data = responseData2.getData();
                    Intrinsics.copydefault(data);
                    TxToastCheckRes txToastCheckRes = (TxToastCheckRes) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) data);
                    if (Intrinsics.EZpvd(txToastCheckRes.getResult(), java.lang.Boolean.TRUE)) {
                        return responseData;
                    }
                    java.lang.String msg = txToastCheckRes.getMsg();
                    return new ResponseData(-5000, msg == null ? "" : msg, null, null, null, null, 60, null);
                }
                return new ResponseData(-5000, null, null, null, null, null, 62, null);
            }
            return new ResponseData(responseData2.getCode(), responseData2.getMsg(), null, null, null, null, 60, null);
        }

        public static InterfaceC60096zvd KWHzl(TxToastCheckReq txToastCheckReq, UserOperation userOperation, InterfaceC9041bOB interfaceC9041bOB, final ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 || responseData.getCode() == -5001) {
                txToastCheckReq.setUop(userOperation);
                AbstractC58185ywX<ResponseData<java.util.List<TxToastCheckRes>>> abstractC58185ywXCopydefault = interfaceC9041bOB.getFieldNames().ixgjPv().copydefault(txToastCheckReq);
                final Function1 function1 = new Function1() { // from class: o.bOM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.copydefault(responseData, (ResponseData) obj);
                    }
                };
                return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bON
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.zsXlph(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(responseData);
        }

        public static InterfaceC60096zvd EZpvd(InterfaceC9041bOB interfaceC9041bOB, UserOperation userOperation, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 || responseData.getCode() == -5001) {
                AbstractC58185ywX<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58185ywXEZpvd = interfaceC9041bOB.iwGUEr().EZpvd(userOperation);
                final Function1 function1 = new Function1() { // from class: o.bOS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.OLrzqt((kotlin.Pair) obj);
                    }
                };
                return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.AubY(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(responseData);
        }

        public static ResponseData AEQbTJ(UserOperation userOperation, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                userOperation.setUopHash((java.lang.String) data);
            }
            return responseData;
        }

        public static InterfaceC60096zvd copydefault(InterfaceC9041bOB interfaceC9041bOB, final UserOperation userOperation, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 || responseData.getCode() == -5001) {
                C13934dbu c13934dbuIxgjPv = interfaceC9041bOB.getFieldNames().ixgjPv();
                long jFetchVPNInfo = interfaceC9041bOB.getFieldNames().dHguZz().fetchVPNInfo();
                java.lang.String entryPoint = interfaceC9041bOB.AYXKKw().getEntryPoint();
                if (entryPoint == null) {
                    entryPoint = "";
                }
                java.lang.String str = (java.lang.String) responseData.getData();
                AbstractC58185ywX<ResponseData<java.lang.String>> abstractC58185ywXAEQbTJ = c13934dbuIxgjPv.AEQbTJ(jFetchVPNInfo, entryPoint, str != null ? str : "");
                final Function1 function1 = new Function1() { // from class: o.bOT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.AEQbTJ(userOperation, (ResponseData) obj);
                    }
                };
                return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bOQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return InterfaceC9041bOB.Application.AwvSrB(function1, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(responseData);
        }

        public static ResponseData copydefault(UserOperation userOperation, ResponseData responseData) {
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 || responseData.getCode() == -5001) {
                return new ResponseData(responseData.getCode(), null, null, null, userOperation, null, 46, null);
            }
            return new ResponseData(responseData.getCode(), responseData.getMsg(), null, null, null, responseData.getError_code(), 28, null);
        }
    }
}
