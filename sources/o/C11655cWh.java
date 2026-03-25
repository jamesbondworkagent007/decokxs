package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.GsonBuilder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletDataError;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.business.defi.biz.net.bean.CreateRespBatch;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqNew;
import com.okinc.business.defi.biz.net.bean.CreateWalletReqs;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.keypair.KeyPair;
import com.okinc.wallet.core.keypair.KeyPairParams;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10604brb;
import o.C11010bzJ;
import o.C12827cuN;
import o.C13058cyg;
import o.C13124czt;
import o.C13754dXa;
import o.InterfaceC48694uaX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11655cWh extends AbstractC43215rlA implements InterfaceC9849bdO {
    public final java.lang.String OLrzqt = "NostrUpdateServiceImpl";
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.cXe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11655cWh.OLrzqt();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.cXn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11655cWh.AYXKKw();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.cXk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11655cWh.KWHzl();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean copydefault(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return java.lang.Boolean.FALSE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean gEmmrt(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return java.lang.Boolean.FALSE;
    }

    public static final cPO OLrzqt() {
        return new cPO(C9678baC.Companion.AEQbTJ());
    }

    public final cPO AhwBna() {
        return (cPO) this.EZpvd.getValue();
    }

    public static final C13124czt AYXKKw() {
        return C13124czt.Application.getInstance$default(C13124czt.Companion, null, 1, null);
    }

    public final C13124czt valueOf() {
        return (C13124czt) this.copydefault.getValue();
    }

    public static final android.os.Handler KWHzl() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    private final android.os.Handler gEmmrt() {
        return (android.os.Handler) this.AEQbTJ.getValue();
    }

    public final AbstractC58185ywX<java.lang.Boolean> djBIcL() {
        AbstractC58260yxt abstractC58260yxtBooleanForKey$default = cPO.booleanForKey$default(AhwBna(), "okw_all_wallet_nostr_fixed_status", false, 2, null);
        C12827cuN.Application application = C12827cuN.Companion;
        AbstractC58260yxt<java.util.List<WalletRepairEntity>> abstractC58260yxtEZpvd = C12827cuN.Application.getInstance$default(application, null, 1, null).EZpvd(IdentifierType.IDENTIFIER_TYPE_NOSTR_FIX.getValue(), IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSUNFIX.getValue());
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(application, null, 1, null), false, false, false, 7, null);
        final yHO yho = new yHO() { // from class: o.cWr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C11655cWh.copydefault((java.lang.Boolean) obj, (java.util.List) obj2, (java.util.List) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58260yxt.AEQbTJ(abstractC58260yxtBooleanForKey$default, abstractC58260yxtEZpvd, abstractC58260yxtFetchAllWallets$default, new InterfaceC58228yxN() { // from class: o.cWt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C11655cWh.OLrzqt(yho, obj, obj2, obj3);
            }
        }).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cWy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.copydefault(this.AEQbTJ, (Triple) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.sSMYrx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final Triple OLrzqt(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (Triple) yho.invoke(obj, obj2, obj3);
    }

    public static final InterfaceC60096zvd sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C11655cWh c11655cWh, Triple triple) {
        boolean z;
        Intrinsics.checkNotNullParameter(triple, "");
        java.lang.Object first = triple.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        boolean zBooleanValue = ((java.lang.Boolean) first).booleanValue();
        java.lang.Object second = triple.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.List<WalletRepairEntity> list = (java.util.List) second;
        java.util.List<? extends AbstractC12782ctV> list2 = (java.util.List) triple.getThird();
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((WalletRepairEntity) it.next()).getExtJson().length() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (zBooleanValue) {
            if ((!list.isEmpty()) && !z) {
                AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = C14090der.OLrzqt.OLrzqt(list);
                final Function1 function1 = new Function1() { // from class: o.cWI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C11655cWh.EZpvd(this.OLrzqt, (java.lang.Integer) obj);
                    }
                };
                AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.cWN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C11655cWh.zuBGHE(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.cWO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C11655cWh.copydefault((java.lang.Boolean) obj);
                    }
                };
                return abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cWL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C11655cWh.AxsJAY(function12, obj);
                    }
                });
            }
            return AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
        }
        if (zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        if ((!list.isEmpty()) && !z) {
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt2 = C14090der.OLrzqt.OLrzqt(list);
            final Function1 function13 = new Function1() { // from class: o.cWK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.AEQbTJ(this.AEQbTJ, (java.lang.Integer) obj);
                }
            };
            return abstractC58185ywXOLrzqt2.KWHzl(new InterfaceC58229yxO() { // from class: o.cWM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11655cWh.AwvSrB(function13, obj);
                }
            });
        }
        return c11655cWh.OLrzqt(list2);
    }

    public static final InterfaceC60096zvd zuBGHE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final C11655cWh c11655cWh, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cXh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.wlaJM(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Boolean AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final C11655cWh c11655cWh, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.gHZMYf(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(java.util.List<? extends AbstractC12782ctV> list) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (OLrzqt((AbstractC12782ctV) next)) {
                break;
            }
        }
        if (next != null) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXEZpvd = AhwBna().KWHzl("okw_all_wallet_nostr_fixed_status", "true").EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.gEmmrt((java.lang.Long) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cXl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.ORxRYg(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    @Override // o.InterfaceC9849bdO
    public void AEQbTJ(@NotNull FragmentActivity fragmentActivity, final Function1<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        pUU.EZpvd("zqh", "use showNostrNeedUpdate");
        try {
            final AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivity;
            abstractActivityC33041mov.showLoadingWithLogo();
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXDjBIcL = djBIcL();
            AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false).EZpvd();
            final Function2 function2 = new Function2() { // from class: o.cWU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C11655cWh.EZpvd((java.lang.Boolean) obj, (AbstractC12782ctV) obj2);
                }
            };
            AbstractC58185ywX abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXDjBIcL, abstractC58185ywXEZpvd, new InterfaceC58223yxI() { // from class: o.cWZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C11655cWh.djBIcL(function2, obj, obj2);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.cXd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.OLrzqt(abstractActivityC33041mov, function1, this, (kotlin.Pair) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cXb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C11655cWh.QbewEr(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.cXa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.KWHzl(abstractActivityC33041mov, function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cXf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C11655cWh.RJOkX(function13, obj);
                }
            });
        } catch (java.lang.Exception unused) {
            if (function1 != null) {
                function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE));
            }
            pUU.EZpvd("zqh", "8 return (true to false)");
        }
    }

    public static final kotlin.Pair djBIcL(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(java.lang.Boolean bool, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String address;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, fieldNames != null ? fieldNames.AEQbTJ() : -1L, null, 2, null);
        if (chainAddressAddressFromChainId$default != null && (address = chainAddressAddressFromChainId$default.getAddress()) != null) {
            str = address;
        }
        return C56390yDp.OLrzqt(bool, str);
    }

    public static final void QbewEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final Function1 function1, final C11655cWh c11655cWh, kotlin.Pair pair) {
        boolean zBooleanValue = ((java.lang.Boolean) pair.getFirst()).booleanValue();
        final java.lang.String str = (java.lang.String) pair.getSecond();
        abstractActivityC33041mov.dismissLoadingWithLogo();
        if (zBooleanValue) {
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14469dlz(supportFragmentManager, abstractActivityC33041mov, null, null, new Function1() { // from class: o.cWu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.KWHzl(this.AEQbTJ, abstractActivityC33041mov, function1, str, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.cWs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C11655cWh.AEQbTJ(function1);
                }
            }, null, null, 200, null).EZpvd();
        } else {
            if (function1 != null) {
                function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE));
            }
            pUU.EZpvd("zqh", "2 return (false to true)");
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C11655cWh c11655cWh, AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        c11655cWh.EZpvd(abstractActivityC33041mov, str2, (Function1<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>, Unit>) function1, str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1) {
        pUU.EZpvd("zqh", "1 return (true to false)");
        if (function1 != null) {
            function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE));
        }
        return Unit.INSTANCE;
    }

    public static final void RJOkX(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, java.lang.Throwable th) {
        abstractActivityC33041mov.dismissLoadingWithLogo();
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fdOvFl), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        if (function1 != null) {
            function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE));
        }
        pUU.EZpvd("zqh", "3 return (true to false)");
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov, final java.lang.String str, final Function1<? super kotlin.Pair<java.lang.Boolean, java.lang.Boolean>, Unit> function1, final java.lang.String str2) {
        abstractActivityC33041mov.showLoadingWithLogo();
        AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, java.lang.String, WalletAddressItem>>> abstractC58260yxtKWHzl = KWHzl(str);
        final Function1 function12 = new Function1() { // from class: o.cWA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.AYXKKw(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cWE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.QKVWgx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtKWHzl2 = C11607cUn.KWHzl(abstractC58260yxtOLrzqt);
        final Function1 function13 = new Function1() { // from class: o.cWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.OLrzqt(abstractActivityC33041mov, function1, this, str, str2, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11655cWh.DTwDnp(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.cWG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.AEQbTJ(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cWH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11655cWh.QOLQEE(function14, obj);
            }
        });
    }

    public static final InterfaceC58261yxu QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(C11655cWh c11655cWh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = c11655cWh.AhwBna().KWHzl("okw_all_wallet_nostr_fixed_status", "true");
            final Function1 function1 = new Function1() { // from class: o.cWQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.KWHzl((java.lang.Long) obj);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cWS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11655cWh.OcIXYQ(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(list);
    }

    public static final java.util.List OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List KWHzl(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return yDY.AhwBna();
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final Function1 function1, final C11655cWh c11655cWh, final java.lang.String str, final java.lang.String str2, final java.util.List list) {
        abstractActivityC33041mov.dismissLoadingWithLogo();
        if (list.isEmpty()) {
            if (function1 != null) {
                function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, java.lang.Boolean.TRUE));
            }
            pUU.EZpvd("zqh", "4 return (false to true)");
        } else {
            C11005bzE.EZpvd.OLrzqt(abstractActivityC33041mov, new Function1() { // from class: o.cWT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.OLrzqt(function1, abstractActivityC33041mov, c11655cWh, list, str, str2, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final Function1 function1, final AbstractActivityC33041mov abstractActivityC33041mov, C11655cWh c11655cWh, java.util.List list, java.lang.String str, java.lang.String str2, boolean z) {
        if (!z) {
            if (function1 != null) {
                function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE));
            }
            pUU.EZpvd("zqh", "5 return type " + z + " (true to false)");
            return Unit.INSTANCE;
        }
        abstractActivityC33041mov.showLoadingWithLogo();
        Intrinsics.copydefault(list);
        c11655cWh.KWHzl(list, str, str2, new Function1() { // from class: o.cWD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.KWHzl(abstractActivityC33041mov, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, boolean z) {
        abstractActivityC33041mov.dismissLoadingWithLogo();
        if (function1 != null) {
            function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(z)));
        }
        pUU.EZpvd("zqh", "6 return (true to " + z + ")");
        return Unit.INSTANCE;
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        if (function1 != null) {
            function1.invoke(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE));
        }
        pUU.EZpvd("zqh", "7 return (true to false)");
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        return abstractC12782ctV.AubY() && abstractC12782ctV.finit() != 0 && C33129mqd.valueOf(C59449zhJ.replace$default(abstractC12782ctV.accept(), JwtUtilsKt.JWT_DELIMITER, "", false, 4, (java.lang.Object) null)) < 64700 && abstractC12782ctV.hBpjJd() != IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED;
    }

    public static final InterfaceC60096zvd hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final void KWHzl(java.util.List<? extends Triple<? extends AbstractC12782ctV, java.lang.String, WalletAddressItem>> list, final java.lang.String str, final java.lang.String str2, final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC58185ywX<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> abstractC58185ywXAEQbTJ = AEQbTJ(list, str);
        final Function1 function12 = new Function1() { // from class: o.cWP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.AEQbTJ(this.AEQbTJ, str, str2, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.cWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.hDKMBd(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.AEQbTJ(function1, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11655cWh.zsXlph(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.cWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.EZpvd(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C11655cWh.zLjUOn(function14, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AEQbTJ(C11655cWh c11655cWh, java.lang.String str, java.lang.String str2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c11655cWh.EZpvd((java.util.List<? extends Triple<? extends AbstractC12782ctV, C12821cuH, ChainAddressEntity>>) list, str, str2);
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Boolean bool) {
        if (function1 != null) {
            Intrinsics.copydefault(bool);
            function1.invoke(bool);
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fdOvFl), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> KWHzl(final java.util.List<? extends Triple<? extends AbstractC12782ctV, java.lang.String, WalletAddressItem>> list, final java.lang.String str) {
        final C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
        if (fieldNames == null) {
            AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(WalletType.KeyWallet);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
        final Function2 function2 = new Function2() { // from class: o.cWw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11655cWh.OLrzqt((java.util.List) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.cWz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11655cWh.gEmmrt(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cWx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.EZpvd(list, str, this, fieldNames, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cWC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(list, str);
    }

    public static final java.util.List getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List EZpvd(java.util.List list, java.lang.String str, C11655cWh c11655cWh, C10854bwM c10854bwM, kotlin.Pair pair) throws WalletImportError {
        C12786ctZ c12786ctZ;
        ChainAddressEntity chainAddressEntity;
        java.lang.String pubKey;
        java.lang.String address;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        java.util.List list2 = (java.util.List) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.String str2 = (java.lang.String) second;
        if (list2.isEmpty()) {
            c12786ctZ = new C12786ctZ(null, C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedDispatcher1), WalletType.KeyWallet, 0L, 0, 0, 57, null);
        } else {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) CollectionsKt___CollectionsKt.AuCTelauCTel(list2);
            c12786ctZ = new C12786ctZ(abstractC12784ctX.EZpvd(), abstractC12784ctX.AuCTel(), WalletType.KeyWallet, abstractC12784ctX.gEmmrt(), abstractC12784ctX.fARcdN(), 0, 32, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) triple.getFirst();
            java.lang.String str3 = (java.lang.String) triple.getSecond();
            java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str2, str3, true);
            xXW xxw = xXW.OLrzqt;
            java.lang.String strAEQbTJ2 = xxw.AEQbTJ(str, str2, strAEQbTJ, true);
            boolean zCopydefault = C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ2, str3);
            if (str3.length() == 0 || strAEQbTJ2.length() == 0 || !zCopydefault) {
                java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt("1", "KeyWallet"), C56390yDp.OLrzqt("2", java.lang.Integer.valueOf(str3.length())), C56390yDp.OLrzqt("3", java.lang.Integer.valueOf(strAEQbTJ.length())), C56390yDp.OLrzqt("4", java.lang.Integer.valueOf(strAEQbTJ2.length())), C56390yDp.OLrzqt("5", java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) strAEQbTJ2, (java.lang.Object) str3))), C56390yDp.OLrzqt("8", java.lang.Integer.valueOf(str.length())), C56390yDp.OLrzqt("9", java.lang.Integer.valueOf(str2.length())), C56390yDp.OLrzqt("10", java.lang.Boolean.valueOf(xxw.AEQbTJ(str, str2))), C56390yDp.OLrzqt("11", java.lang.Boolean.valueOf(C34702nhN.OLrzqt.copydefault())), C56390yDp.OLrzqt("12", xVW.copydefault())));
                C10856bwO.EZpvd(c11655cWh.OLrzqt, new WalletDataError(json));
                WalletImportError walletImportErrorGEmmrt = WalletImportError.Companion.gEmmrt();
                C13124czt c13124cztValueOf = c11655cWh.valueOf();
                WalletType walletType = WalletType.HDWallet;
                Intrinsics.copydefault((java.lang.Object) json);
                c13124cztValueOf.EZpvd("NostrUpdateServiceImpl", "generateBatchCreateWallets", walletType, json, CreateOrImportType.CREATE_WALLET);
                throw walletImportErrorGEmmrt;
            }
            KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, str3, true, 3, (DefaultConstructorMarker) null));
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            java.lang.String strAuCTel = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.AuCTel() : null;
            java.lang.String strAkhnZx = "Nostr_" + strAuCTel + "_" + abstractC12782ctV.AkhnZx();
            if (strAkhnZx.length() > 25) {
                strAkhnZx = C59454zhO.AkhnZx(strAkhnZx, 25);
            }
            java.lang.String str4 = strAkhnZx;
            WalletType walletType2 = WalletType.KeyWallet;
            WalletSyncStatus walletSyncStatus = WalletSyncStatus.HasSync;
            long jAEQbTJ = c10854bwM.AEQbTJ();
            java.lang.String pubKey2 = keyPairOLrzqt.getPubKey();
            java.lang.String prvKey = keyPairOLrzqt.getPrvKey();
            java.util.List<C10854bwM> listValueOf = C10954byG.EZpvd.valueOf().valueOf(c10854bwM.AEQbTJ());
            Intrinsics.copydefault(listValueOf, "");
            C12821cuH c12821cuH = new C12821cuH(null, str4, walletType2, walletSyncStatus, java.lang.Long.valueOf(jAEQbTJ), 0, c12786ctZ, strAEQbTJ, null, str3, null, pubKey2, prvKey, false, true, false, false, false, 0L, (java.util.ArrayList) listValueOf, null, null, null, null, null, null, null, null, null, 536216865, null);
            WalletAddressList walletAddressListOLrzqt = new C13847daM(c10854bwM.fetchVPNInfo()).OLrzqt(str3, AddressType.Legacy.getValue(), c12821cuH.AhwBna());
            if (walletAddressListOLrzqt != null) {
                for (CoinAddressBean coinAddressBean : walletAddressListOLrzqt.getAddressList()) {
                    c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressListOLrzqt.getPubKey(), null, null, null, 224, null));
                    c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean.getType(), c10854bwM.fetchVPNInfo(), walletAddressListOLrzqt.getSignature(), null, null, 24, null));
                }
            }
            WalletAddressItem walletAddressItem = (WalletAddressItem) triple.getThird();
            if (walletAddressItem != null && C33129mqd.OLrzqt((java.lang.CharSequence) walletAddressItem.getAddress()) && C33129mqd.OLrzqt((java.lang.CharSequence) walletAddressItem.getPubKey())) {
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                long jAEQbTJ2 = c10854bwM.AEQbTJ();
                WalletAddressItem walletAddressItem2 = (WalletAddressItem) triple.getThird();
                java.lang.String str5 = (walletAddressItem2 == null || (address = walletAddressItem2.getAddress()) == null) ? "" : address;
                int value = AddressType.Legacy.getValue();
                WalletAddressItem walletAddressItem3 = (WalletAddressItem) triple.getThird();
                chainAddressEntity = new ChainAddressEntity(strDbNXlk, jAEQbTJ2, str5, value, (walletAddressItem3 == null || (pubKey = walletAddressItem3.getPubKey()) == null) ? "" : pubKey, null, null, null, 224, null);
            } else {
                chainAddressEntity = new ChainAddressEntity(null, 0L, null, 0, null, null, null, null, 255, null);
            }
            arrayList.add(new Triple(abstractC12782ctV, c12821cuH, chainAddressEntity));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> AEQbTJ(java.util.List<? extends Triple<? extends AbstractC12782ctV, java.lang.String, WalletAddressItem>> list, java.lang.String str) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        AbstractC58260yxt abstractC58260yxtValueOf;
        pUU.EZpvd("zqh", "use batch create wallet interface " + list.size());
        C32935mmv c32935mmv = C32935mmv.KWHzl;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) c32935mmv.get("channel_id");
        if (charSequence == null || charSequence.length() == 0) {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(0, null, null, null, null, null, 62, null));
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
        } else {
            InterfaceC48694uaX interfaceC48694uaX = (InterfaceC48694uaX) C43251rlk.OLrzqt(InterfaceC48694uaX.class);
            if (interfaceC48694uaX != null) {
                java.lang.String str2 = (java.lang.String) c32935mmv.get("channel_id");
                if (str2 == null) {
                    str2 = "";
                }
                AbstractC58185ywX abstractC58185ywXCheckChannelId$default = InterfaceC48694uaX.StateListAnimator.checkChannelId$default(interfaceC48694uaX, str2, null, 2, null);
                if (abstractC58185ywXCheckChannelId$default == null || (abstractC58260yxtValueOf = abstractC58185ywXCheckChannelId$default.valueOf()) == null || (abstractC58260yxtCopydefault = abstractC58260yxtValueOf.OLrzqt(AbstractC58260yxt.copydefault(new ResponseData(0, null, null, null, null, null, 62, null)))) == null) {
                }
            } else {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(0, null, null, null, null, null, 62, null));
                Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            }
        }
        AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> abstractC58260yxtKWHzl = KWHzl(list, str);
        final Function2 function2 = new Function2() { // from class: o.cWk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11655cWh.copydefault((java.util.List) obj, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58260yxt.OLrzqt(abstractC58260yxtKWHzl, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.cWg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11655cWh.EZpvd(function2, obj, obj2);
            }
        }).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<java.util.List<Triple<AbstractC12782ctV, C12821cuH, ChainAddressEntity>>> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cWB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.iwGUEr(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(java.util.List list, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        return C56390yDp.OLrzqt(list, responseData);
    }

    public static final InterfaceC60096zvd iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C11655cWh c11655cWh, kotlin.Pair pair) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        final java.util.List list = (java.util.List) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        C12821cuH c12821cuH = (C12821cuH) ((Triple) CollectionsKt___CollectionsKt.AEQbTJ(list, kotlin.random.Random.Default)).getSecond();
        C13934dbu c13934dbu = new C13934dbu();
        java.lang.String strEjfBZ = c12821cuH.ejfBZ();
        java.lang.String strAhwBna = c12821cuH.AhwBna();
        java.util.HashMap map = (java.util.HashMap) ((ResponseData) second).getData();
        java.lang.String str2 = (map == null || (str = (java.lang.String) map.get(RemoteMessageConst.Notification.CHANNEL_ID)) == null) ? "" : str;
        java.lang.String strAhwBna2 = WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            C12821cuH c12821cuH2 = (C12821cuH) ((Triple) it.next()).getSecond();
            java.util.ArrayList<ChainAddressEntity> arrayListAYXKKw = c12821cuH2.AYXKKw();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAYXKKw, 10));
            for (ChainAddressEntity chainAddressEntity : arrayListAYXKKw) {
                arrayList2.add(new ChainAddress(chainAddressEntity.getChainId(), chainAddressEntity.getAddress(), chainAddressEntity.getAddressType(), null, null, false, chainAddressEntity.getPublicKey(), chainAddressEntity.getDerivePath(), 24, null));
            }
            arrayList.add(new CreateWalletReqNew((java.lang.String) null, c12821cuH2.iwGUEr(), c12821cuH2.values(), C13058cyg.suppleAndGroupSignData$default(C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null), c12821cuH2.AhwBna(), arrayList2, c12821cuH2.OLrzqt(), false, 8, null), c12821cuH2.fARcdN().ordinal(), c12821cuH2.EZpvd(), c12821cuH2.AhwBna(), false, 129, (DefaultConstructorMarker) null));
        }
        AbstractC58185ywX<ResponseData<CreateRespBatch>> abstractC58185ywXKWHzl = c13934dbu.KWHzl(strEjfBZ, strAhwBna, new CreateWalletReqs(strAhwBna2, str2, false, (java.util.List) arrayList, 4, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.AEQbTJ(list, c11655cWh, (ResponseData) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cXm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.getNewProxyInstance(function1, obj);
            }
        });
    }

    public static final java.util.List getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final void AEQbTJ(ResponseData responseData) {
        C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public final AbstractC58185ywX<java.lang.Boolean> EZpvd(java.util.List<? extends Triple<? extends AbstractC12782ctV, C12821cuH, ChainAddressEntity>> list, java.lang.String str, java.lang.String str2) {
        return C14090der.OLrzqt.EZpvd(list, str, str2);
    }

    /* JADX DEBUG: Type inference failed for r12v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<kotlin.Triple<o.ctV, java.lang.String, com.okinc.business.defi.biz.model.WalletAddressItem>>> */
    public final AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, java.lang.String, WalletAddressItem>>> KWHzl(final java.lang.String str) {
        final C10854bwM fieldNames = C10954byG.EZpvd.valueOf().getFieldNames();
        if (fieldNames == null) {
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = AhwBna().KWHzl("okw_all_wallet_nostr_fixed_status", "true");
            final Function1 function1 = new Function1() { // from class: o.cXs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11655cWh.copydefault((java.lang.Long) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cWi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11655cWh.AubY(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null).AhwBna(str);
        final Function2 function2 = new Function2() { // from class: o.cWj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11655cWh.KWHzl(this.EZpvd, (java.util.List) obj, (java.lang.String) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtFetchAllWallets$default, abstractC58260yxtAhwBna, new InterfaceC58223yxI() { // from class: o.cWm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11655cWh.AYXKKw(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtEZpvd = C11607cUn.EZpvd(abstractC58260yxtOLrzqt);
        final Function1 function12 = new Function1() { // from class: o.cWp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11655cWh.OLrzqt(fieldNames, str, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<java.util.List<Triple<AbstractC12782ctV, java.lang.String, WalletAddressItem>>> abstractC58260yxtOLrzqt2 = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.cWn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11655cWh.AuCTelauCTel(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.util.List AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return yDY.AhwBna();
    }

    public static final kotlin.Pair AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final InterfaceC58261yxu AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C10854bwM c10854bwM, java.lang.String str, kotlin.Pair pair) {
        java.lang.String address;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List list = (java.util.List) pair.getFirst();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.String str2 = (java.lang.String) second;
        java.util.ArrayList<AbstractC12782ctV> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AhwBna(), null, 2, null);
            java.lang.String address2 = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
            java.lang.String strAEQbTJ = xXW.OLrzqt.AEQbTJ(str, str2, abstractC12782ctV.RlQdEF(), true);
            xYS xys = xYS.copydefault;
            java.lang.String strDCUTEI = abstractC12782ctV.DCUTEI();
            long jQKVWgx = c10854bwM.QKVWgx();
            AddressType addressType = AddressType.Legacy;
            WalletAddressItem walletAddressItemKWHzl = new C13847daM(c10854bwM.fetchVPNInfo()).KWHzl(xys.KWHzl(strAEQbTJ, strDCUTEI, jQKVWgx, true, abstractC12782ctV.finit(), addressType.getValue(), "", (128 & 128) != 0 ? false : false), addressType.getValue(), "");
            java.lang.String address3 = walletAddressItemKWHzl != null ? walletAddressItemKWHzl.getAddress() : null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) address3) && !C59449zhJ.AEQbTJ((java.lang.CharSequence) address2, (java.lang.CharSequence) address3) && abstractC12782ctV.hBpjJd() != IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_FIXSTATUSFIXED) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (AbstractC12782ctV abstractC12782ctV2 : arrayList) {
            java.lang.String strAEQbTJ2 = xXW.OLrzqt.AEQbTJ(str, str2, abstractC12782ctV2.RlQdEF(), true);
            xYS xys2 = xYS.copydefault;
            java.lang.String strDCUTEI2 = abstractC12782ctV2.DCUTEI();
            long jQKVWgx2 = c10854bwM.QKVWgx();
            AddressType addressType2 = AddressType.Legacy;
            int value = addressType2.getValue();
            int iFinit = abstractC12782ctV2.finit();
            ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwM.AhwBna(), null, 2, null);
            if (chainAddressAddressFromChainId$default2 == null || (address = chainAddressAddressFromChainId$default2.getAddress()) == null) {
                address = "";
            }
            arrayList2.add(new Triple(abstractC12782ctV2, xys2.KWHzl(strAEQbTJ2, strDCUTEI2, jQKVWgx2, true, iFinit, value, address, (128 & 128) != 0 ? false : false), new C13847daM(c10854bwM.fetchVPNInfo()).KWHzl(xys2.KWHzl(strAEQbTJ2, abstractC12782ctV2.DCUTEI(), c10854bwM.QKVWgx(), true, abstractC12782ctV2.finit(), addressType2.getValue(), "", (128 & 128) != 0 ? false : false), addressType2.getValue(), "")));
        }
        if (arrayList2.isEmpty()) {
            return AbstractC58260yxt.copydefault(yDY.AhwBna());
        }
        return AbstractC58260yxt.copydefault(arrayList2);
    }

    public static final Triple copydefault(java.lang.Boolean bool, java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            if (((AbstractC12782ctV) obj).AubY()) {
                arrayList.add(obj);
            }
        }
        return new Triple(bool, list, arrayList);
    }

    public static final InterfaceC60096zvd AEQbTJ(C11655cWh c11655cWh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12782ctV) obj).AubY()) {
                arrayList.add(obj);
            }
        }
        return c11655cWh.OLrzqt(arrayList);
    }

    public static final InterfaceC60096zvd KWHzl(C11655cWh c11655cWh, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12782ctV) obj).AubY()) {
                arrayList.add(obj);
            }
        }
        return c11655cWh.OLrzqt(arrayList);
    }

    public static final java.util.List AEQbTJ(java.util.List list, C11655cWh c11655cWh, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            pUU.EZpvd("zqh", "use batch create wallet interface " + list.size());
            return list;
        }
        int code = responseData.getCode();
        if (code == 10007) {
            c11655cWh.gEmmrt().post(new java.lang.Runnable() { // from class: o.cXi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C11655cWh.AEQbTJ(responseData);
                }
            });
        } else if (code == 900003) {
            C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null).KWHzl().AEQbTJ(null, responseData.getMsg());
        }
        return yDY.AhwBna();
    }

    public static final kotlin.Pair KWHzl(C11655cWh c11655cWh, java.util.List list, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (c11655cWh.OLrzqt((AbstractC12782ctV) obj)) {
                arrayList.add(obj);
            }
        }
        return C56390yDp.OLrzqt(arrayList, str);
    }
}
