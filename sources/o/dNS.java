package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.okinc.business.defi.api.bean.AptosSignMessageBean;
import com.okinc.business.defi.api.bean.BTCDappSignData;
import com.okinc.business.defi.api.bean.BaseSignMessageBean;
import com.okinc.business.defi.api.bean.CosmosSignature;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignCheckResponseBean;
import com.okinc.business.defi.api.bean.SignDataResultBean;
import com.okinc.business.defi.api.bean.SignRequestBean;
import com.okinc.business.defi.api.bean.SolSignMessageBean;
import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignMessageData;
import com.okinc.business.defi.biz.core.error.EmptyResultException;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.SignMessageDataValue;
import com.okinc.wallet.api.bean.AddressType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C12827cuN;
import o.InterfaceC9854bdT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dNS extends AbstractC43215rlA implements InterfaceC9856bdV {
    @Override // o.InterfaceC9856bdV
    public AbstractC58185ywX<java.lang.Integer> AEQbTJ(final int i) {
        pUU.copydefault("ensureWalletInitialized", "begin");
        AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(C10337bmZ.KWHzl.AEQbTJ(true));
        final Function1 function1 = new Function1() { // from class: o.dNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.copydefault(i, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.dOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dNS.hDKMBd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(int i, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            if (C10954byG.EZpvd.valueOf().KWHzl(i) == null) {
                pUU.copydefault("ensureWalletInitialized", "no_support_coins");
                return AbstractC58185ywX.KWHzl(3);
            }
            pUU.copydefault("ensureWalletInitialized", "success");
            return AbstractC58185ywX.KWHzl(0);
        }
        pUU.copydefault("ensureWalletInitialized", Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        return AbstractC58185ywX.KWHzl(1);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.business.defi.api.bean.SignCheckResponseBean> */
    @Override // o.InterfaceC9856bdV
    public AbstractC58185ywX<SignCheckResponseBean> AEQbTJ(@NotNull final java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("checkStatusBeforeSign", "begin");
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = C10337bmZ.KWHzl.AEQbTJ(true);
        final Function1 function1 = new Function1() { // from class: o.dOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.OLrzqt(i, str, this, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.dOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dNS.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(int i, java.lang.String str, final dNS dns, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            final SignCheckResponseBean signCheckResponseBean = new SignCheckResponseBean(100, (java.lang.String) null, (SignDataResultBean) null, 6, (DefaultConstructorMarker) null);
            C10954byG c10954byG = C10954byG.EZpvd;
            final C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(i);
            final C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl != null ? c10954byG.valueOf().KWHzl(c10854bwMKWHzl.AhwBna()) : null;
            AbstractC58185ywX<InterfaceC9738bbJ> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).EZpvd(str, c10854bwMKWHzl2 != null ? java.lang.Long.valueOf(c10854bwMKWHzl2.fetchVPNInfo()) : null, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.finit() : true, true).EZpvd();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(abstractC58185ywXEZpvd);
            final Function1 function1 = new Function1() { // from class: o.dOo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dNS.EZpvd(signCheckResponseBean, c10854bwMKWHzl2, c10854bwMKWHzl, dns, (InterfaceC9738bbJ) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.dOp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return dNS.fIwbmz(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.dOs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dNS.EZpvd(signCheckResponseBean, (java.lang.Throwable) obj);
                }
            };
            return abstractC58185ywXKWHzl2.djBIcL(new InterfaceC58229yxO() { // from class: o.dOv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return dNS.uzCIH(function12, obj);
                }
            });
        }
        pUU.copydefault("checkStatusBeforeSign", "error_code:1");
        return AbstractC58185ywX.KWHzl(new SignCheckResponseBean(1, (java.lang.String) null, (SignDataResultBean) null, 6, (DefaultConstructorMarker) null));
    }

    public static final InterfaceC60096zvd fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(SignCheckResponseBean signCheckResponseBean, C10854bwM c10854bwM, C10854bwM c10854bwM2, dNS dns, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        if (interfaceC9738bbJ.QfsBiF() || interfaceC9738bbJ.zsXlph()) {
            signCheckResponseBean.setSignErrorCode(5);
        } else if ((interfaceC9738bbJ.gHZMYf() || interfaceC9738bbJ.iwGUEr()) && (c10854bwM == null || !c10854bwM.ejfBZ())) {
            signCheckResponseBean.setSignErrorCode(8);
        } else if (c10854bwM2 == null) {
            signCheckResponseBean.setSignErrorCode(3);
        } else if (!dns.AEQbTJ(c10854bwM)) {
            signCheckResponseBean.setSignErrorCode(4);
        } else if (!interfaceC9738bbJ.zLjUOn()) {
            signCheckResponseBean.setSignErrorCode(6);
        } else {
            signCheckResponseBean.setSignErrorCode(0);
        }
        signCheckResponseBean.setWalletId(interfaceC9738bbJ.DbNXlk());
        pUU.copydefault("checkStatusBeforeSign", "error_code:" + signCheckResponseBean.getSignErrorCode());
        return AbstractC58185ywX.KWHzl(signCheckResponseBean);
    }

    public static final SignCheckResponseBean uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SignCheckResponseBean) function1.invoke(obj);
    }

    public static final SignCheckResponseBean EZpvd(SignCheckResponseBean signCheckResponseBean, java.lang.Throwable th) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof EmptyResultException) {
            pUU.copydefault("checkStatusBeforeSign", "throwable:5");
            signCheckResponseBean.setSignErrorCode(5);
            return signCheckResponseBean;
        }
        pUU.copydefault("checkStatusBeforeSign", "throwable_unknown:" + th.getMessage());
        throw th;
    }

    @Override // o.InterfaceC9856bdV
    public void KWHzl(@NotNull final android.content.Context context, @NotNull final SignRequestBean signRequestBean, @NotNull final Function1<? super SignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.copydefault("importWalletAndSign", "begin");
        AbstractC58185ywX<SignCheckResponseBean> abstractC58185ywXAEQbTJ = AEQbTJ(signRequestBean.getToAddress(), signRequestBean.getSubCurrencyId());
        final Function1 function12 = new Function1() { // from class: o.dNZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.KWHzl(context, signRequestBean, function1, this, (SignCheckResponseBean) obj);
            }
        };
        InterfaceC58227yxM<? super SignCheckResponseBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dNS.iwGUEr(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dOb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.AYXKKw((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dNS.getFieldNames(function13, obj);
            }
        });
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(android.content.Context context, SignRequestBean signRequestBean, Function1 function1, dNS dns, SignCheckResponseBean signCheckResponseBean) {
        int signErrorCode = signCheckResponseBean.getSignErrorCode();
        if (signErrorCode == 0) {
            dns.AEQbTJ(context, signCheckResponseBean.getWalletId(), signRequestBean, (Function1<? super SignCheckResponseBean, Unit>) function1);
        } else if (signErrorCode == 5) {
            C18408fho.startImportWallet$default(C18408fho.EZpvd, context, 2, new C14462dls(null, context, signRequestBean, function1, 1, null), null, null, 24, null);
        } else {
            pUU.copydefault("importWalletAndSign", "error_code:" + signCheckResponseBean.getSignErrorCode());
            function1.invoke(new SignCheckResponseBean(signCheckResponseBean.getSignErrorCode(), signCheckResponseBean.getWalletId(), (SignDataResultBean) null, 4, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.InterfaceC9856bdV
    public void copydefault(@NotNull final android.content.Context context, @NotNull final SignRequestBean signRequestBean, @NotNull final Function1<? super SignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.copydefault("backupWalletIfNeedAndSign", "begin");
        AbstractC58185ywX<SignCheckResponseBean> abstractC58185ywXAEQbTJ = AEQbTJ(signRequestBean.getToAddress(), signRequestBean.getSubCurrencyId());
        final Function1 function12 = new Function1() { // from class: o.dOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.KWHzl(signRequestBean, (SignCheckResponseBean) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.dOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dNS.AuCTel(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.copydefault(this.KWHzl, context, signRequestBean, function1, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dNS.fJNWhG(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.djBIcL((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dNS.fARcdN(function14, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(SignRequestBean signRequestBean, final SignCheckResponseBean signCheckResponseBean) {
        Intrinsics.checkNotNullParameter(signCheckResponseBean, "");
        java.lang.String walletId = signRequestBean.getWalletId();
        if (walletId.length() == 0) {
            walletId = signCheckResponseBean.getWalletId();
        }
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(walletId, false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.copydefault(signCheckResponseBean, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dNS.values(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.dOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.copydefault((java.lang.Throwable) obj);
            }
        };
        return abstractC58185ywXKWHzl.djBIcL(new InterfaceC58229yxO() { // from class: o.dOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dNS.ejfBZ(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(SignCheckResponseBean signCheckResponseBean, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return AbstractC58185ywX.KWHzl(new kotlin.Pair(java.lang.Integer.valueOf(signCheckResponseBean.getSignErrorCode()), abstractC12782ctV));
    }

    public static final kotlin.Pair ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new kotlin.Pair(5, null);
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final dNS dns, final android.content.Context context, final SignRequestBean signRequestBean, final Function1 function1, final kotlin.Pair pair) {
        java.lang.String strDbNXlk;
        androidx.fragment.app.FragmentManager fragmentManagerCopydefault;
        AbstractC12782ctV abstractC12782ctV;
        java.lang.String strDbNXlk2;
        int iIntValue = ((java.lang.Number) pair.getFirst()).intValue();
        java.lang.String str = "";
        if (iIntValue == 0) {
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) pair.getSecond();
            if (abstractC12782ctV2 != null && (strDbNXlk = abstractC12782ctV2.DbNXlk()) != null) {
                str = strDbNXlk;
            }
            dns.AEQbTJ(context, str, signRequestBean, (Function1<? super SignCheckResponseBean, Unit>) function1);
        } else {
            if (iIntValue == 6) {
                xWS xws = (xWS) C43251rlk.copydefault(xWS.class);
                FragmentActivity fragmentActivityOLrzqt = dns.OLrzqt(context);
                AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityOLrzqt instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityOLrzqt : null;
                if (abstractActivityC33041mov != null && (fragmentManagerCopydefault = dns.copydefault(context)) != null && (abstractC12782ctV = (AbstractC12782ctV) pair.getSecond()) != null) {
                    xws.EZpvd(abstractActivityC33041mov, fragmentManagerCopydefault, abstractC12782ctV, new Function0() { // from class: o.dOk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return dNS.KWHzl(this.EZpvd, context, pair, signRequestBean, function1);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            pUU.copydefault("backupWalletIfNeedAndSign", "error_code:" + pair.getFirst());
            int iIntValue2 = ((java.lang.Number) pair.getFirst()).intValue();
            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) pair.getSecond();
            function1.invoke(new SignCheckResponseBean(iIntValue2, (abstractC12782ctV3 == null || (strDbNXlk2 = abstractC12782ctV3.DbNXlk()) == null) ? "" : strDbNXlk2, (SignDataResultBean) null, 4, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(dNS dns, android.content.Context context, kotlin.Pair pair, SignRequestBean signRequestBean, Function1 function1) {
        java.lang.String strDbNXlk;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) pair.getSecond();
        if (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        dns.AEQbTJ(context, strDbNXlk, signRequestBean, (Function1<? super SignCheckResponseBean, Unit>) function1);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    @Override // o.InterfaceC9856bdV
    public void AEQbTJ(@NotNull final android.content.Context context, @NotNull final SignRequestBean signRequestBean, @NotNull final Function1<? super SignCheckResponseBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signRequestBean, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pUU.copydefault("signData", "begin");
        AbstractC58185ywX<SignCheckResponseBean> abstractC58185ywXAEQbTJ = AEQbTJ(signRequestBean.getToAddress(), signRequestBean.getSubCurrencyId());
        final Function1 function12 = new Function1() { // from class: o.dOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.AEQbTJ((SignCheckResponseBean) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.dOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return dNS.wlaJM(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.dOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.EZpvd(this.copydefault, context, signRequestBean, function1, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dNS.zLjUOn(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.AhwBna((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dNS.AuCTelauCTel(function14, obj);
            }
        });
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(SignCheckResponseBean signCheckResponseBean) {
        Intrinsics.checkNotNullParameter(signCheckResponseBean, "");
        if (signCheckResponseBean.getSignErrorCode() == 0) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(0, signCheckResponseBean.getWalletId()));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Integer.valueOf(signCheckResponseBean.getSignErrorCode()), null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(dNS dns, android.content.Context context, SignRequestBean signRequestBean, Function1 function1, kotlin.Pair pair) {
        if (((java.lang.Number) pair.getFirst()).intValue() == 0) {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str == null) {
                str = "";
            }
            dns.AEQbTJ(context, str, signRequestBean, (Function1<? super SignCheckResponseBean, Unit>) function1);
        } else {
            pUU.copydefault("signData", "error_code:" + pair.getFirst());
            function1.invoke(new SignCheckResponseBean(((java.lang.Number) pair.getFirst()).intValue(), (java.lang.String) null, (SignDataResultBean) null, 6, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(final android.content.Context context, final java.lang.String str, final SignRequestBean signRequestBean, final Function1<? super SignCheckResponseBean, Unit> function1) {
        final FragmentActivity fragmentActivityOLrzqt = OLrzqt(context);
        if (fragmentActivityOLrzqt != null) {
            if (fragmentActivityOLrzqt.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                EZpvd(context, str, signRequestBean, function1);
            } else {
                fragmentActivityOLrzqt.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.okinc.business.defi.impl.WalletSignServiceImpl$openSignMessagePage$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                        Intrinsics.checkNotNullParameter(event, "");
                        if (event == Lifecycle.Event.ON_RESUME) {
                            fragmentActivityOLrzqt.getLifecycle().removeObserver(this);
                            this.EZpvd(context, str, signRequestBean, function1);
                        }
                    }
                });
            }
        }
    }

    public final void EZpvd(android.content.Context context, final java.lang.String str, SignRequestBean signRequestBean, final Function1<? super SignCheckResponseBean, Unit> function1) {
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(signRequestBean.getSubCurrencyId());
        C10854bwM c10854bwMKWHzl2 = c10854bwMKWHzl != null ? c10954byG.valueOf().KWHzl(c10854bwMKWHzl.AhwBna()) : null;
        AbstractC12782ctV abstractC12782ctVOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str);
        boolean z = abstractC12782ctVOLrzqt != null && (abstractC12782ctVOLrzqt.gHZMYf() || abstractC12782ctVOLrzqt.iwGUEr());
        final C10854bwM c10854bwM = c10854bwMKWHzl2;
        DappSignArgs dappSignArgs = new DappSignArgs(str, java.lang.String.valueOf(c10854bwMKWHzl2 != null ? java.lang.Long.valueOf(c10854bwMKWHzl2.fetchVPNInfo()) : null), new PlatformItem(0L, signRequestBean.getTitle(), signRequestBean.getLogoUrl(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, signRequestBean.getUrl(), (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16121, (DefaultConstructorMarker) null), copydefault(c10854bwMKWHzl2, signRequestBean.getSignMessageInfo(), signRequestBean.getToAddress(), z && c10854bwMKWHzl2 != null && c10854bwMKWHzl2.ejfBZ()), c10854bwMKWHzl2 != null && c10854bwMKWHzl2.QkdxfA(), 12, null, null, false, false, KWHzl(c10854bwMKWHzl2), null, null, EZpvd(c10854bwMKWHzl2, signRequestBean.getSignMessageInfo()), (c10854bwMKWHzl2 == null || !c10854bwMKWHzl2.run()) ? null : TronSignMethodVersion.V2, c10854bwMKWHzl2 != null && c10854bwMKWHzl2.run(), null, 72640, null);
        pUU.copydefault("showSignDappFragment-dappArgs", java.lang.String.valueOf(dappSignArgs));
        InterfaceC9854bdT.Application.startSignDapp$default((InterfaceC9854bdT) C43251rlk.copydefault(InterfaceC9854bdT.class), context, dappSignArgs, new Function1() { // from class: o.dNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dNS.OLrzqt(c10854bwM, str, function1, (android.os.Bundle) obj);
            }
        }, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C10854bwM c10854bwM, java.lang.String str, Function1 function1, android.os.Bundle bundle) {
        java.lang.String signature;
        java.util.List<java.lang.String> signature2;
        java.lang.String string;
        pUU.copydefault("showSignDappFragment-receive", "begin");
        boolean z = bundle != null ? bundle.getBoolean("is_reject_sign", true) : true;
        java.lang.String str2 = "";
        if (bundle == null || (signature = bundle.getString("data")) == null) {
            signature = "";
        }
        SignDataResultBean signDataResultBean = null;
        fullMessage = null;
        fullMessage = null;
        java.lang.String fullMessage = null;
        SignDataResultBean signDataResultBean2 = (c10854bwM == null || !c10854bwM.fIwbmz()) ? null : (SignDataResultBean) C33490mxT.EZpvd(signature, SignDataResultBean.class);
        if (c10854bwM == null || !c10854bwM.fIwbmz()) {
            if (c10854bwM != null && c10854bwM.run()) {
                TrxDappSignData trxDappSignData = (TrxDappSignData) C33490mxT.EZpvd(signature, TrxDappSignData.class);
                signature = (trxDappSignData == null || (signature2 = trxDappSignData.getSignature()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(signature2);
                if (signature == null) {
                }
            } else if (c10854bwM != null && c10854bwM.DXXBbs()) {
                CosmosSignature cosmosSignature = (CosmosSignature) C33490mxT.EZpvd(signature, CosmosSignature.class);
                signature = cosmosSignature != null ? cosmosSignature.getSignature() : null;
                if (signature == null) {
                    signature = "";
                }
            }
        } else if (signDataResultBean2 == null || (signature = signDataResultBean2.getSignature()) == null) {
        }
        int i = z ? 2 : 0;
        if (!z) {
            if (bundle != null && (string = bundle.getString("publicKey")) != null) {
                str2 = string;
            }
            if (c10854bwM != null && c10854bwM.fIwbmz() && signDataResultBean2 != null) {
                fullMessage = signDataResultBean2.getFullMessage();
            }
            signDataResultBean = new SignDataResultBean(signature, str2, fullMessage);
        }
        SignCheckResponseBean signCheckResponseBean = new SignCheckResponseBean(i, str, signDataResultBean);
        pUU.copydefault("showSignDappFragment-send", java.lang.String.valueOf(signCheckResponseBean.getSignErrorCode()));
        pUU.copydefault("showSignDappFragment-send", signCheckResponseBean.toString());
        function1.invoke(signCheckResponseBean);
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault(C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, boolean z) {
        java.lang.String message;
        java.lang.String message2;
        java.lang.String message3;
        java.lang.String json;
        java.lang.String message4;
        if (z) {
            BaseSignMessageBean baseSignMessageBean = (BaseSignMessageBean) C33490mxT.EZpvd(str, BaseSignMessageBean.class);
            message4 = baseSignMessageBean != null ? baseSignMessageBean.getMessage() : null;
            json = xYW.AEQbTJ.values(message4 != null ? message4 : "");
        } else if (c10854bwM != null && c10854bwM.fARcdN()) {
            SolSignMessageBean solSignMessageBean = (SolSignMessageBean) C33490mxT.EZpvd(str, SolSignMessageBean.class);
            message4 = solSignMessageBean != null ? solSignMessageBean.getMessage() : null;
            xYW xyw = xYW.AEQbTJ;
            json = xyw.valueOf(xyw.values(message4 != null ? message4 : ""));
        } else if (c10854bwM != null && c10854bwM.fIwbmz()) {
            json = new GsonBuilder().disableHtmlEscaping().create().toJson((AptosSignMessageBean) C33490mxT.EZpvd(str, AptosSignMessageBean.class));
            Intrinsics.copydefault((java.lang.Object) json);
        } else {
            if (c10854bwM != null && c10854bwM.iRxXKY()) {
                BaseSignMessageBean baseSignMessageBean2 = (BaseSignMessageBean) C33490mxT.EZpvd(str, BaseSignMessageBean.class);
                if (baseSignMessageBean2 == null || (message3 = baseSignMessageBean2.getMessage()) == null) {
                    message3 = "";
                }
                java.lang.String json2 = new GsonBuilder().disableHtmlEscaping().create().toJson(new BTCDappSignData(message3, (java.lang.String) null, (java.util.List) null, str2, KWHzl(c10854bwM, str2), 6, (DefaultConstructorMarker) null));
                Intrinsics.copydefault((java.lang.Object) json2);
                return json2;
            }
            if (c10854bwM != null && c10854bwM.DXXBbs()) {
                BaseSignMessageBean baseSignMessageBean3 = (BaseSignMessageBean) C33490mxT.EZpvd(str, BaseSignMessageBean.class);
                if (baseSignMessageBean3 == null || (message2 = baseSignMessageBean3.getMessage()) == null) {
                    message2 = "";
                }
                Gson gsonCreate = new GsonBuilder().disableHtmlEscaping().create();
                byte[] bytes = message2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                byte[] bArrEncode = android.util.Base64.encode(bytes, 2);
                Intrinsics.checkNotNullExpressionValue(bArrEncode, "");
                java.nio.charset.Charset charsetDefaultCharset = java.nio.charset.Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "");
                java.lang.String json3 = gsonCreate.toJson(new CosmosContractSignMessageData("", "0", "0", new CosmosContractSignMessageData.Fee("0", yDY.AhwBna()), C56402yEa.EZpvd(new CosmosContractSignMessageData.Message("sign/MsgSignData", new SignMessageDataValue(str2, new java.lang.String(bArrEncode, charsetDefaultCharset)))), "", null, null, null, null, null, 1984, null));
                Intrinsics.copydefault((java.lang.Object) json3);
                return json3;
            }
            BaseSignMessageBean baseSignMessageBean4 = (BaseSignMessageBean) C33490mxT.EZpvd(str, BaseSignMessageBean.class);
            return (baseSignMessageBean4 == null || (message = baseSignMessageBean4.getMessage()) == null) ? "" : message;
        }
        return json;
    }

    public final java.lang.String KWHzl(C10854bwM c10854bwM) {
        return (c10854bwM == null || !c10854bwM.fIwbmz()) ? (c10854bwM == null || !c10854bwM.iRxXKY()) ? "" : "btc_message" : DappSignArgs.APTOS_SIGN_NONCE_MESSAGE;
    }

    public final java.lang.String KWHzl(C10854bwM c10854bwM, java.lang.String str) {
        if (C8322bAY.KWHzl.KWHzl(C11600cUg.copydefault(c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null), str) == AddressType.P2TRType.getValue()) {
            return BTCDappSignData.Companion.KWHzl();
        }
        return null;
    }

    public final java.lang.String EZpvd(C10854bwM c10854bwM, java.lang.String str) {
        SolSignMessageBean solSignMessageBean;
        if (c10854bwM == null || !c10854bwM.fARcdN() || (solSignMessageBean = (SolSignMessageBean) C33490mxT.EZpvd(str, SolSignMessageBean.class)) == null) {
            return null;
        }
        return solSignMessageBean.getMessage();
    }

    public final FragmentActivity OLrzqt(android.content.Context context) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        if (activityOLrzqt instanceof FragmentActivity) {
            return (FragmentActivity) activityOLrzqt;
        }
        return null;
    }

    private final androidx.fragment.app.FragmentManager copydefault(android.content.Context context) {
        FragmentActivity fragmentActivityOLrzqt = OLrzqt(context);
        if (fragmentActivityOLrzqt != null) {
            return fragmentActivityOLrzqt.getSupportFragmentManager();
        }
        return null;
    }

    public final boolean AEQbTJ(C10854bwM c10854bwM) {
        if (c10854bwM != null && c10854bwM.QkdxfA()) {
            return true;
        }
        if (c10854bwM != null && c10854bwM.fIwbmz()) {
            return true;
        }
        if (c10854bwM != null && c10854bwM.ixgjPv()) {
            return true;
        }
        if (c10854bwM != null && c10854bwM.fARcdN()) {
            return true;
        }
        if (c10854bwM != null && c10854bwM.iRxXKY()) {
            return true;
        }
        if (c10854bwM == null || !c10854bwM.run()) {
            return c10854bwM != null && c10854bwM.DXXBbs();
        }
        return true;
    }
}
