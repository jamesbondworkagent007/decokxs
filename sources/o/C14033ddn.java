package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC14027ddh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ddn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14033ddn {
    public static final C14033ddn OLrzqt = new C14033ddn();

    /* JADX INFO: renamed from: o.ddn$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LedgerSupportedApp.values().length];
            try {
                iArr[LedgerSupportedApp.Bitcoin.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LedgerSupportedApp.Litecoin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[LedgerSupportedApp.Ethereum.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[LedgerSupportedApp.Ethereum_Classic.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[LedgerSupportedApp.Tron.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[LedgerSupportedApp.Solana.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[LedgerSupportedApp.Cosmos.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
        }
    }

    private C14033ddn() {
    }

    public final AbstractC58260yxt<AbstractC14027ddh> OLrzqt(@NotNull C10854bwM c10854bwM) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        C57032yak c57032yak = C57032yak.AEQbTJ;
        final InterfaceC57036yao interfaceC57036yaoAEQbTJ = c57032yak.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ == null) {
            if (c57032yak.copydefault()) {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new AbstractC14027ddh.ActionBar(73819764, null));
            } else {
                AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = c57032yak.KWHzl();
                final Function1 function1 = new Function1() { // from class: o.ddJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14033ddn.OLrzqt((java.lang.Boolean) obj);
                    }
                };
                abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.ddH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C14033ddn.EZpvd(function1, obj);
                    }
                });
            }
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        final LedgerSupportedApp ledgerSupportedAppCopydefault = LedgerSignHelper.AEQbTJ.copydefault(c10854bwM);
        if (ledgerSupportedAppCopydefault == null) {
            AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(new AbstractC14027ddh.ActionBar(73819761, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
            return abstractC58260yxtCopydefault2;
        }
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.EZpvd(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final AbstractC14027ddh EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC14027ddh) function1.invoke(obj);
    }

    public static final AbstractC14027ddh OLrzqt(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return new AbstractC14027ddh.ActionBar(73819764, null);
        }
        return new AbstractC14027ddh.ActionBar(73819770, null);
    }

    public static final void EZpvd(final InterfaceC57036yao interfaceC57036yao, final LedgerSupportedApp ledgerSupportedApp, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.ddy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.OLrzqt(ledgerSupportedApp, interfaceC58257yxq, interfaceC57036yao, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ddE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.fARcdN(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit OLrzqt(LedgerSupportedApp ledgerSupportedApp, InterfaceC58257yxq interfaceC58257yxq, InterfaceC57036yao interfaceC57036yao, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) ledgerSupportedApp.getAppName(), (java.lang.Object) str)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57036yao));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<AbstractC14027ddh> KWHzl(@NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, boolean z) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        C57032yak c57032yak = C57032yak.AEQbTJ;
        InterfaceC57036yao interfaceC57036yaoAEQbTJ = c57032yak.AEQbTJ();
        if (interfaceC57036yaoAEQbTJ == null) {
            if (c57032yak.copydefault()) {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new AbstractC14027ddh.ActionBar(73819764, null));
            } else {
                AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = c57032yak.KWHzl();
                final Function1 function1 = new Function1() { // from class: o.ddZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14033ddn.KWHzl((java.lang.Boolean) obj);
                    }
                };
                abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.dec
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C14033ddn.OLrzqt(function1, obj);
                    }
                });
            }
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        LedgerSignHelper ledgerSignHelper = LedgerSignHelper.AEQbTJ;
        ledgerSignHelper.copydefault(c10854bwM);
        LedgerSupportedApp ledgerSupportedAppCopydefault = ledgerSignHelper.copydefault(c10854bwM);
        if (ledgerSupportedAppCopydefault == null) {
            AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtCopydefault2 = AbstractC58260yxt.copydefault(new AbstractC14027ddh.ActionBar(73819761, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
            return abstractC58260yxtCopydefault2;
        }
        switch (Application.AEQbTJ[ledgerSupportedAppCopydefault.ordinal()]) {
            case 1:
                return OLrzqt(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault.getAppName(), chainAddress);
            case 2:
                return KWHzl(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault.getAppName(), chainAddress);
            case 3:
            case 4:
                return AEQbTJ(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault.getAppName(), chainAddress, z);
            case 5:
                return OLrzqt(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault.getAppName(), chainAddress, z);
            case 6:
                return EZpvd(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault.getAppName(), chainAddress, z);
            case 7:
                return OLrzqt(interfaceC57036yaoAEQbTJ, ledgerSupportedAppCopydefault.getAppName(), c10854bwM, chainAddress);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AbstractC14027ddh OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC14027ddh) function1.invoke(obj);
    }

    public static final AbstractC14027ddh KWHzl(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return new AbstractC14027ddh.ActionBar(73819764, null);
        }
        return new AbstractC14027ddh.ActionBar(73819770, null);
    }

    public final AbstractC58260yxt<AbstractC14027ddh> OLrzqt(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress) {
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.OLrzqt(interfaceC57036yao, str, chainAddress, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void OLrzqt(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.ddM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.KWHzl(str, chainAddress, interfaceC57036yao, interfaceC58257yxq, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ddL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.fJNWhG(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, final ChainAddress chainAddress, InterfaceC57036yao interfaceC57036yao, final InterfaceC58257yxq interfaceC58257yxq, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            java.lang.String strEZpvd = LedgerSignHelper.AEQbTJ.EZpvd(chainAddress.getAddressType());
            final InterfaceC57031yaj interfaceC57031yajEZpvd = InterfaceC57036yao.Companion.EZpvd(interfaceC57036yao);
            interfaceC57031yajEZpvd.EZpvd(chainAddress.getDerivePath(), false, strEZpvd, new yHO() { // from class: o.ddr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C14033ddn.OLrzqt(chainAddress, interfaceC58257yxq, interfaceC57031yajEZpvd, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }, new Function1() { // from class: o.ddv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.fIwbmz(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ChainAddress chainAddress, InterfaceC58257yxq interfaceC58257yxq, InterfaceC57031yaj interfaceC57031yaj, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str2) || Intrinsics.EZpvd((java.lang.Object) chainAddress.getEoaAddress(), (java.lang.Object) str2)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57031yaj));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819766, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<AbstractC14027ddh> KWHzl(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress) {
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.copydefault(interfaceC57036yao, str, chainAddress, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void copydefault(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.ddS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.OLrzqt(str, chainAddress, interfaceC57036yao, interfaceC58257yxq, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ddY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.AubY(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, final ChainAddress chainAddress, InterfaceC57036yao interfaceC57036yao, final InterfaceC58257yxq interfaceC58257yxq, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            java.lang.String strEZpvd = LedgerSignHelper.AEQbTJ.EZpvd(chainAddress.getAddressType());
            final InterfaceC57034yam interfaceC57034yamAEQbTJ = InterfaceC57036yao.Companion.AEQbTJ(interfaceC57036yao);
            interfaceC57034yamAEQbTJ.EZpvd(chainAddress.getDerivePath(), false, strEZpvd, new yHO() { // from class: o.ddx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C14033ddn.copydefault(chainAddress, interfaceC58257yxq, interfaceC57034yamAEQbTJ, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }, new Function1() { // from class: o.ddA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.hDKMBd(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ChainAddress chainAddress, InterfaceC58257yxq interfaceC58257yxq, InterfaceC57034yam interfaceC57034yam, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str2) || Intrinsics.EZpvd((java.lang.Object) chainAddress.getEoaAddress(), (java.lang.Object) str2)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57034yam));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819766, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit AubY(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<AbstractC14027ddh> AEQbTJ(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final boolean z) {
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.EZpvd(interfaceC57036yao, str, chainAddress, z, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void EZpvd(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final boolean z, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.ddz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.EZpvd(str, interfaceC57036yao, chainAddress, interfaceC58257yxq, z, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ddK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.iwGUEr(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, InterfaceC57036yao interfaceC57036yao, final ChainAddress chainAddress, final InterfaceC58257yxq interfaceC58257yxq, final boolean z, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            final InterfaceC57035yan interfaceC57035yanOLrzqt = InterfaceC57036yao.Companion.OLrzqt(interfaceC57036yao);
            interfaceC57035yanOLrzqt.KWHzl(chainAddress.getDerivePath(), false, false, new yHO() { // from class: o.ddt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C14033ddn.OLrzqt(chainAddress, z, interfaceC57035yanOLrzqt, interfaceC58257yxq, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }, new Function1() { // from class: o.dds
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.getNewProxyInstance(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ChainAddress chainAddress, boolean z, final InterfaceC57035yan interfaceC57035yan, final InterfaceC58257yxq interfaceC58257yxq, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (!Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str2) && !Intrinsics.EZpvd((java.lang.Object) chainAddress.getEoaAddress(), (java.lang.Object) str2)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819766, null));
        } else if (z) {
            interfaceC57035yan.AEQbTJ(new yHS() { // from class: o.deb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHS
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return C14033ddn.AEQbTJ(interfaceC58257yxq, interfaceC57035yan, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue(), ((java.lang.Boolean) obj4).booleanValue(), (java.lang.String) obj5);
                }
            }, new Function1() { // from class: o.ddq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.uzCIH(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57035yan));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC58257yxq interfaceC58257yxq, InterfaceC57035yan interfaceC57035yan, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57035yan));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819767, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<AbstractC14027ddh> OLrzqt(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final boolean z) {
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.valueOf(interfaceC57036yao, str, chainAddress, z, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void valueOf(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final boolean z, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.ddB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.valueOf(str, interfaceC57036yao, chainAddress, interfaceC58257yxq, z, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ddD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.sSMYrx(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit valueOf(java.lang.String str, InterfaceC57036yao interfaceC57036yao, final ChainAddress chainAddress, final InterfaceC58257yxq interfaceC58257yxq, final boolean z, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            final InterfaceC57042yau interfaceC57042yauValueOf = InterfaceC57036yao.Companion.valueOf(interfaceC57036yao);
            interfaceC57042yauValueOf.AEQbTJ(chainAddress.getDerivePath(), false, new Function2() { // from class: o.ddI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C14033ddn.copydefault(chainAddress, z, interfaceC57042yauValueOf, interfaceC58257yxq, (java.lang.String) obj, (java.lang.String) obj2);
                }
            }, new Function1() { // from class: o.ddO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.AwvSrB(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ChainAddress chainAddress, boolean z, final InterfaceC57042yau interfaceC57042yau, final InterfaceC58257yxq interfaceC58257yxq, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str2) && !Intrinsics.EZpvd((java.lang.Object) chainAddress.getEoaAddress(), (java.lang.Object) str2)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819766, null));
        } else if (z) {
            interfaceC57042yau.copydefault(new yHQ() { // from class: o.ddP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHQ
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
                    return C14033ddn.copydefault(interfaceC58257yxq, interfaceC57042yau, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue(), ((java.lang.Boolean) obj4).booleanValue(), (java.lang.String) obj5, (java.lang.String) obj6);
                }
            }, new Function1() { // from class: o.ddN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.AuCTelauCTel(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57042yau));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InterfaceC58257yxq interfaceC58257yxq, InterfaceC57042yau interfaceC57042yau, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z4) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57042yau));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819767, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<AbstractC14027ddh> EZpvd(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final boolean z) {
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.OLrzqt(interfaceC57036yao, str, chainAddress, z, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void OLrzqt(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final boolean z, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.ddQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.copydefault(str, interfaceC57036yao, chainAddress, interfaceC58257yxq, z, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ddR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.zsXlph(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, InterfaceC57036yao interfaceC57036yao, final ChainAddress chainAddress, final InterfaceC58257yxq interfaceC58257yxq, final boolean z, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            final InterfaceC57037yap interfaceC57037yapCopydefault = InterfaceC57036yao.Companion.copydefault(interfaceC57036yao);
            interfaceC57037yapCopydefault.OLrzqt(chainAddress.getDerivePath(), false, new Function1() { // from class: o.ddT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.AEQbTJ(chainAddress, z, interfaceC57037yapCopydefault, interfaceC58257yxq, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.ddU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.wlaJM(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ChainAddress chainAddress, boolean z, final InterfaceC57037yap interfaceC57037yap, final InterfaceC58257yxq interfaceC58257yxq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str) && !Intrinsics.EZpvd((java.lang.Object) chainAddress.getEoaAddress(), (java.lang.Object) str)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819766, null));
        } else if (z) {
            interfaceC57037yap.OLrzqt(new yHO() { // from class: o.ddm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C14033ddn.OLrzqt(interfaceC58257yxq, interfaceC57037yap, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Integer) obj3).intValue());
                }
            }, new Function1() { // from class: o.ddu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.zLjUOn(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57037yap));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC58257yxq interfaceC58257yxq, InterfaceC57037yap interfaceC57037yap, java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57037yap));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819767, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<AbstractC14027ddh> OLrzqt(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final C10854bwM c10854bwM, final ChainAddress chainAddress) {
        AbstractC58260yxt<AbstractC14027ddh> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.ddw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C14033ddn.KWHzl(interfaceC57036yao, str, chainAddress, c10854bwM, interfaceC58257yxq);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final void KWHzl(final InterfaceC57036yao interfaceC57036yao, final java.lang.String str, final ChainAddress chainAddress, final C10854bwM c10854bwM, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        interfaceC57036yao.EZpvd(new Function2() { // from class: o.dea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C14033ddn.copydefault(str, interfaceC57036yao, chainAddress, c10854bwM, interfaceC58257yxq, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }, new Function1() { // from class: o.ded
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14033ddn.getFieldNames(interfaceC58257yxq, (LedgerError) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, InterfaceC57036yao interfaceC57036yao, final ChainAddress chainAddress, C10854bwM c10854bwM, final InterfaceC58257yxq interfaceC58257yxq, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            final InterfaceC57038yaq interfaceC57038yaqKWHzl = InterfaceC57036yao.Companion.KWHzl(interfaceC57036yao);
            interfaceC57038yaqKWHzl.KWHzl(chainAddress.getDerivePath(), LedgerSignHelper.AEQbTJ.EZpvd(c10854bwM), false, new Function2() { // from class: o.ddo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C14033ddn.EZpvd(chainAddress, interfaceC58257yxq, interfaceC57038yaqKWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                }
            }, new Function1() { // from class: o.ddp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14033ddn.AuCTel(interfaceC58257yxq, (LedgerError) obj);
                }
            });
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819765, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ChainAddress chainAddress, InterfaceC58257yxq interfaceC58257yxq, InterfaceC57038yaq interfaceC57038yaq, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) chainAddress.getAddress(), (java.lang.Object) str2) || Intrinsics.EZpvd((java.lang.Object) chainAddress.getEoaAddress(), (java.lang.Object) str2)) {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.Activity(interfaceC57038yaq));
        } else {
            interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819766, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(InterfaceC58257yxq interfaceC58257yxq, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58257yxq.onSuccess(new AbstractC14027ddh.ActionBar(73819763, ledgerError));
        return Unit.INSTANCE;
    }
}
