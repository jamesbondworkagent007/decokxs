package com.okinc.business.defi.biz.wallethardware.ledger;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.wallet.hardware.api.ledger.LedgerSupportedApp;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.AbstractC14027ddh;
import o.AbstractC58185ywX;
import o.C10854bwM;
import o.C14033ddn;
import o.C33129mqd;
import o.C33489mxS;
import o.C56403yEb;
import o.C57041yat;
import o.C8377bBa;
import o.InterfaceC57031yaj;
import o.InterfaceC57036yao;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.xYW;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class LedgerSignHelper {
    public static final LedgerSignHelper AEQbTJ = new LedgerSignHelper();

    private LedgerSignHelper() {
    }

    public final boolean KWHzl(C10854bwM c10854bwM) {
        if (c10854bwM == null) {
            return false;
        }
        if (c10854bwM.AuCTel()) {
            return c10854bwM.ejfBZ() || c10854bwM.ffGIBT() || c10854bwM.AxsJAYaxsJAY() || c10854bwM.DLWbHP() || c10854bwM.fdOvFl() || c10854bwM.run() || c10854bwM.gasjUx() || c10854bwM.dUDNAs();
        }
        C10854bwM c10854bwMKWHzl = c10854bwM.KWHzl();
        if (c10854bwMKWHzl == null || c10854bwMKWHzl.fdOvFl()) {
            return false;
        }
        return KWHzl(c10854bwMKWHzl);
    }

    public final LedgerSupportedApp copydefault(C10854bwM c10854bwM) {
        if (c10854bwM == null) {
            return null;
        }
        if (c10854bwM.AxsJAYaxsJAY()) {
            return LedgerSupportedApp.Bitcoin;
        }
        if (c10854bwM.DLWbHP()) {
            return LedgerSupportedApp.Litecoin;
        }
        if (c10854bwM.ffGIBT()) {
            return LedgerSupportedApp.Ethereum_Classic;
        }
        if (c10854bwM.ejfBZ()) {
            return LedgerSupportedApp.Ethereum;
        }
        if (c10854bwM.run()) {
            return LedgerSupportedApp.Tron;
        }
        if (c10854bwM.fdOvFl()) {
            return LedgerSupportedApp.Solana;
        }
        if (c10854bwM.DXXBbs()) {
            return LedgerSupportedApp.Cosmos;
        }
        return null;
    }

    public final String EZpvd(int i) {
        return (i == AddressType.P2SHType.getValue() || i == AddressType.P2SHCommonType.getValue()) ? "p2sh" : i == AddressType.Legacy.getValue() ? "legacy" : i == AddressType.Bech32Type.getValue() ? "bech32" : i == AddressType.P2TRType.getValue() ? "bech32m" : "cashaddr";
    }

    public final String[] copydefault(int i) {
        return i == AddressType.Bech32Type.getValue() ? new String[]{"bech32"} : i == AddressType.P2TRType.getValue() ? new String[]{"bech32m"} : new String[0];
    }

    public final String EZpvd(@NotNull C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return c10854bwM.gasjUx() ? "cosmos" : c10854bwM.dUDNAs() ? "osmo" : "";
    }

    public static final class StateListAnimator {
        public final ChainAddress AEQbTJ;
        public final C10854bwM EZpvd;
        public final boolean KWHzl;
        public final String OLrzqt;
        public final int copydefault;
        public final String djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainAddress OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.djBIcL;
        }

        public StateListAnimator(@NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, boolean z, int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = c10854bwM;
            this.AEQbTJ = chainAddress;
            this.KWHzl = z;
            this.copydefault = i;
            this.OLrzqt = str;
            this.djBIcL = str2;
        }
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<String>> KWHzl(@NotNull final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(stateListAnimator.KWHzl(), stateListAnimator.OLrzqt(), stateListAnimator.copydefault()).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.EZpvd(stateListAnimator, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dcM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final StateListAnimator stateListAnimator, final AbstractC14027ddh abstractC14027ddh) {
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.dcH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.AEQbTJ(stateListAnimator, abstractC14027ddh, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar.OLrzqt();
        String code = ledgerErrorOLrzqt != null ? ledgerErrorOLrzqt.getCode() : null;
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, code == null ? "" : code, 30, null));
    }

    public static final void AEQbTJ(final StateListAnimator stateListAnimator, AbstractC14027ddh abstractC14027ddh, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final String strValueOf = stateListAnimator.valueOf();
        if (strValueOf.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
            interfaceC58184ywW.onComplete();
        } else {
            interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
            InterfaceC57036yao.Companion.OLrzqt(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ()).AEQbTJ(stateListAnimator.OLrzqt().getDerivePath(), strValueOf, new yHO() { // from class: o.ddi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return LedgerSignHelper.OLrzqt(stateListAnimator, strValueOf, interfaceC58184ywW, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }, new Function1() { // from class: o.dcG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.DbNXlk(interfaceC58184ywW, (LedgerError) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(StateListAnimator stateListAnimator, String str, InterfaceC58184ywW interfaceC58184ywW, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String strEZpvd = C8377bBa.AEQbTJ.EZpvd(stateListAnimator.EZpvd(), stateListAnimator.KWHzl().QKVWgx(), stateListAnimator.AEQbTJ(), str, str4, str2, str3);
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        if (strEZpvd.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, strEZpvd, null, 46, null));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<String>> EZpvd(@NotNull C10854bwM c10854bwM, @NotNull final ChainAddress chainAddress, @NotNull final String str, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(c10854bwM, chainAddress, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.KWHzl(chainAddress, str, str2, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final ChainAddress chainAddress, final String str, final String str2, final AbstractC14027ddh abstractC14027ddh) {
        String code;
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.dcF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.copydefault(abstractC14027ddh, chainAddress, str, str2, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar.OLrzqt();
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, (ledgerErrorOLrzqt == null || (code = ledgerErrorOLrzqt.getCode()) == null) ? "" : code, 30, null));
    }

    public static final void copydefault(AbstractC14027ddh abstractC14027ddh, ChainAddress chainAddress, String str, String str2, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
        InterfaceC57036yao.Companion.OLrzqt(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ()).EZpvd(chainAddress.getDerivePath(), str, str2, new Function1() { // from class: o.dcC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.AEQbTJ(interfaceC58184ywW, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.dcD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.valueOf(interfaceC58184ywW, (LedgerError) obj);
            }
        });
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, str, null, 46, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r4v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<String>> EZpvd(@NotNull C10854bwM c10854bwM, @NotNull final ChainAddress chainAddress, @NotNull final String str) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(c10854bwM, chainAddress, true).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.copydefault(chainAddress, str, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dcK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.AkhnZx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AkhnZx(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final ChainAddress chainAddress, final String str, final AbstractC14027ddh abstractC14027ddh) {
        String code;
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.dcT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.copydefault(abstractC14027ddh, chainAddress, str, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar.OLrzqt();
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, (ledgerErrorOLrzqt == null || (code = ledgerErrorOLrzqt.getCode()) == null) ? "" : code, 30, null));
    }

    public static final void copydefault(AbstractC14027ddh abstractC14027ddh, ChainAddress chainAddress, String str, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
        InterfaceC57036yao.Companion.OLrzqt(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ()).OLrzqt(chainAddress.getDerivePath(), str, new Function1() { // from class: o.dcX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.AhwBna(interfaceC58184ywW, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.ddb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.isConnected(interfaceC58184ywW, (LedgerError) obj);
            }
        });
    }

    public static final Unit AhwBna(InterfaceC58184ywW interfaceC58184ywW, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, str, null, 46, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final String AhwBna;
        public final List<UTXOTxIn> DbNXlk;
        public final int EZpvd;
        public final ChainAddress KWHzl;
        public final C10854bwM OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final String fetchVPNInfo;
        public final String gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainAddress KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOTxIn> fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.valueOf;
        }

        public ActionBar(@NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<UTXOTxIn> list, int i, String str8) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = c10854bwM;
            this.KWHzl = chainAddress;
            this.fetchVPNInfo = str;
            this.copydefault = str2;
            this.AhwBna = str3;
            this.gEmmrt = str4;
            this.djBIcL = str5;
            this.AEQbTJ = str6;
            this.valueOf = str7;
            this.DbNXlk = list;
            this.EZpvd = i;
            this.AYXKKw = str8;
        }
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.lang.String>> */
    public final AbstractC58185ywX<ResponseData<String>> AEQbTJ(@NotNull final ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(actionBar.AEQbTJ(), actionBar.KWHzl(), false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.OLrzqt(actionBar, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.ddf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final ActionBar actionBar, final AbstractC14027ddh abstractC14027ddh) {
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.ddg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.AEQbTJ(actionBar, abstractC14027ddh, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar2 = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar2.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar2.OLrzqt();
        String code = ledgerErrorOLrzqt != null ? ledgerErrorOLrzqt.getCode() : null;
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, code == null ? "" : code, 30, null));
    }

    public static final void AEQbTJ(ActionBar actionBar, AbstractC14027ddh abstractC14027ddh, final InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC57031yaj interfaceC57031yajAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        String strEZpvd = C8377bBa.AEQbTJ.EZpvd(actionBar.AEQbTJ().fetchVPNInfo(), actionBar.isConnected(), actionBar.OLrzqt(), actionBar.gEmmrt(), actionBar.djBIcL(), actionBar.AhwBna(), actionBar.EZpvd(), actionBar.valueOf(), actionBar.fetchVPNInfo(), actionBar.copydefault(), actionBar.AYXKKw());
        if (strEZpvd.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
            interfaceC58184ywW.onComplete();
            return;
        }
        interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
        List<UTXOTxIn> listFetchVPNInfo = actionBar.fetchVPNInfo();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
        for (UTXOTxIn uTXOTxIn : listFetchVPNInfo) {
            String rawTransaction = uTXOTxIn.getRawTransaction();
            if (rawTransaction == null) {
                rawTransaction = "";
            }
            arrayList.add(new C57041yat(rawTransaction, C33129mqd.AhwBna(uTXOTxIn.getIndex()), C33129mqd.AhwBna(uTXOTxIn.getSequence())));
        }
        C57041yat[] c57041yatArr = (C57041yat[]) arrayList.toArray(new C57041yat[0]);
        List<UTXOTxIn> listFetchVPNInfo2 = actionBar.fetchVPNInfo();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo2, 10));
        for (UTXOTxIn uTXOTxIn2 : listFetchVPNInfo2) {
            arrayList2.add(actionBar.KWHzl().getDerivePath());
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        if (actionBar.AEQbTJ().AxsJAYaxsJAY()) {
            interfaceC57031yajAEQbTJ = InterfaceC57036yao.Companion.EZpvd(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ());
        } else {
            interfaceC57031yajAEQbTJ = InterfaceC57036yao.Companion.AEQbTJ(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ());
        }
        interfaceC57031yajAEQbTJ.OLrzqt(c57041yatArr, strEZpvd, strArr, AEQbTJ.copydefault(actionBar.copydefault()), actionBar.copydefault() != AddressType.Legacy.getValue(), new Function1() { // from class: o.dcN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.copydefault(interfaceC58184ywW, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.dcP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.djBIcL(interfaceC58184ywW, (LedgerError) obj);
            }
        });
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        if (str.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, str, null, 46, null));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final class Activity {
        public final ChainAddress AEQbTJ;
        public final String AYXKKw;
        public final String AhwBna;
        public final String AkhnZx;
        public final String DbNXlk;
        public final String EZpvd;
        public final String KWHzl;
        public final C10854bwM OLrzqt;
        public final String copydefault;
        public final String djBIcL;
        public final String ejfBZ;
        public final String fetchVPNInfo;
        public final boolean gEmmrt;
        public final String isConnected;
        public final String valueOf;
        public final String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainAddress AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AkhnZx() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fJNWhG() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String fetchVPNInfo() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String values() {
            return this.fetchVPNInfo;
        }

        public Activity(@NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
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
            this.OLrzqt = c10854bwM;
            this.AEQbTJ = chainAddress;
            this.gEmmrt = z;
            this.valueOf = str;
            this.ejfBZ = str2;
            this.KWHzl = str3;
            this.EZpvd = str4;
            this.values = str5;
            this.isConnected = str6;
            this.fetchVPNInfo = str7;
            this.copydefault = str8;
            this.AhwBna = str9;
            this.AYXKKw = str10;
            this.djBIcL = str11;
            this.DbNXlk = str12;
            this.AkhnZx = str13;
        }
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.wallet.core.sign.cosmos.CosmosSignedTx>> */
    public final AbstractC58185ywX<ResponseData<CosmosSignedTx>> OLrzqt(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(activity.KWHzl(), activity.AEQbTJ(), false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.OLrzqt(activity, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dcS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.valueOf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final Activity activity, final AbstractC14027ddh abstractC14027ddh) {
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.ddj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.EZpvd(activity, abstractC14027ddh, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar.OLrzqt();
        String code = ledgerErrorOLrzqt != null ? ledgerErrorOLrzqt.getCode() : null;
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, code == null ? "" : code, 30, null));
    }

    public static final void EZpvd(final Activity activity, AbstractC14027ddh abstractC14027ddh, final InterfaceC58184ywW interfaceC58184ywW) {
        final String strAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (activity.fJNWhG()) {
            strAEQbTJ = C8377bBa.AEQbTJ.copydefault(activity.KWHzl().QKVWgx(), activity.AEQbTJ().getPublicKey(), activity.djBIcL(), activity.AkhnZx(), activity.OLrzqt(), activity.EZpvd(), activity.DbNXlk(), activity.fetchVPNInfo(), activity.values(), activity.copydefault(), activity.gEmmrt(), activity.valueOf(), activity.AYXKKw(), activity.AhwBna(), activity.isConnected());
        } else {
            strAEQbTJ = C8377bBa.AEQbTJ.AEQbTJ(activity.KWHzl().QKVWgx(), activity.AEQbTJ().getPublicKey(), activity.djBIcL(), activity.AkhnZx(), activity.OLrzqt(), activity.EZpvd(), activity.fetchVPNInfo(), activity.values(), activity.copydefault(), activity.gEmmrt(), activity.valueOf(), activity.AYXKKw(), activity.AhwBna(), activity.isConnected());
        }
        if (strAEQbTJ.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
            interfaceC58184ywW.onComplete();
        } else {
            String derivePath = activity.AEQbTJ().getDerivePath();
            interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
            InterfaceC57036yao.Companion.KWHzl(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ()).EZpvd(derivePath, strAEQbTJ, new Function1() { // from class: o.ddl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.OLrzqt(activity, strAEQbTJ, interfaceC58184ywW, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.ddk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.AhwBna(interfaceC58184ywW, (LedgerError) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(Activity activity, String str, InterfaceC58184ywW interfaceC58184ywW, String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        CosmosSignedTx cosmosSignedTxCopydefault = C8377bBa.AEQbTJ.copydefault(activity.KWHzl().QKVWgx(), activity.AEQbTJ().getPublicKey(), str, str2);
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        String tx = cosmosSignedTxCopydefault.getTx();
        if (tx == null || tx.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, cosmosSignedTxCopydefault, null, 46, null));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        public final ChainAddress AEQbTJ;
        public final ActionBar EZpvd;
        public final StateListAnimator KWHzl;
        public final C10854bwM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainAddress EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription(@NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, StateListAnimator stateListAnimator, ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            this.OLrzqt = c10854bwM;
            this.AEQbTJ = chainAddress;
            this.KWHzl = stateListAnimator;
            this.EZpvd = actionBar;
        }

        public static final class StateListAnimator {
            public final String AEQbTJ;
            public final String AYXKKw;
            public final String EZpvd;
            public final String KWHzl;
            public String OLrzqt;
            public String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String valueOf() {
                return this.AYXKKw;
            }

            public StateListAnimator(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                this.AEQbTJ = str;
                this.AYXKKw = str2;
                this.KWHzl = str3;
                this.EZpvd = str4;
                this.copydefault = str5;
                this.OLrzqt = str6;
            }
        }

        public static final class ActionBar {
            public final String AEQbTJ;
            public final String AYXKKw;
            public final String AhwBna;
            public final boolean AkhnZx;
            public final String EZpvd;
            public String KWHzl;
            public String OLrzqt;
            public final String copydefault;
            public final String djBIcL;
            public final String fetchVPNInfo;
            public final String gEmmrt;
            public final String isConnected;
            public final String valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AYXKKw() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AhwBna() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AkhnZx() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String DbNXlk() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String djBIcL() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String gEmmrt() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean isConnected() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String valueOf() {
                return this.valueOf;
            }

            public ActionBar(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, @NotNull String str9, String str10, boolean z, String str11, String str12) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str9, "");
                this.gEmmrt = str;
                this.isConnected = str2;
                this.fetchVPNInfo = str3;
                this.copydefault = str4;
                this.AEQbTJ = str5;
                this.EZpvd = str6;
                this.djBIcL = str7;
                this.AYXKKw = str8;
                this.valueOf = str9;
                this.AhwBna = str10;
                this.AkhnZx = z;
                this.OLrzqt = str11;
                this.KWHzl = str12;
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.wallet.core.sign.SignedTx>> */
    public final AbstractC58185ywX<ResponseData<SignedTx>> KWHzl(@NotNull final TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(taskDescription.copydefault(), taskDescription.EZpvd(), false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.copydefault(taskDescription, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd DbNXlk(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final TaskDescription taskDescription, final AbstractC14027ddh abstractC14027ddh) {
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.ddc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.EZpvd(taskDescription, abstractC14027ddh, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar.OLrzqt();
        String code = ledgerErrorOLrzqt != null ? ledgerErrorOLrzqt.getCode() : null;
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, code == null ? "" : code, 30, null));
    }

    public static final void EZpvd(final TaskDescription taskDescription, AbstractC14027ddh abstractC14027ddh, final InterfaceC58184ywW interfaceC58184ywW) {
        String strKWHzl = "";
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (taskDescription.OLrzqt() != null) {
            strKWHzl = C8377bBa.AEQbTJ.AEQbTJ(taskDescription.copydefault().fetchVPNInfo(), taskDescription.OLrzqt().AEQbTJ(), taskDescription.OLrzqt().valueOf(), taskDescription.OLrzqt().EZpvd(), taskDescription.OLrzqt().KWHzl(), taskDescription.OLrzqt().copydefault(), taskDescription.OLrzqt().OLrzqt());
        } else if (taskDescription.AEQbTJ() != null) {
            strKWHzl = C8377bBa.AEQbTJ.KWHzl(taskDescription.copydefault().fetchVPNInfo(), taskDescription.AEQbTJ().gEmmrt(), taskDescription.AEQbTJ().AkhnZx(), taskDescription.AEQbTJ().DbNXlk(), taskDescription.AEQbTJ().AEQbTJ(), taskDescription.AEQbTJ().copydefault(), taskDescription.AEQbTJ().OLrzqt(), taskDescription.AEQbTJ().AYXKKw(), taskDescription.AEQbTJ().AhwBna(), taskDescription.AEQbTJ().valueOf(), taskDescription.AEQbTJ().djBIcL(), taskDescription.AEQbTJ().isConnected(), taskDescription.AEQbTJ().EZpvd(), taskDescription.AEQbTJ().KWHzl());
        }
        String str = strKWHzl;
        if (str.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
            interfaceC58184ywW.onComplete();
        } else {
            interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
            InterfaceC57036yao.Companion.copydefault(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ()).copydefault(taskDescription.EZpvd().getDerivePath(), taskDescription.EZpvd().getAddress(), str, new Function1() { // from class: o.dde
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.AEQbTJ(interfaceC58184ywW, taskDescription, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.ddd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.fetchVPNInfo(interfaceC58184ywW, (LedgerError) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, TaskDescription taskDescription, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        if (str.length() == 0) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, new SignedTx(str, xYW.AEQbTJ.OLrzqt(str, taskDescription.copydefault().QKVWgx()), (String) null, (String) null, 12, (DefaultConstructorMarker) null), null, 46, null));
        }
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final class TronTransactionParam {
        public final ChainAddress AEQbTJ;
        public final C10854bwM EZpvd;
        public final StateListAnimator KWHzl;
        public final Activity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChainAddress OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault() {
            return this.copydefault;
        }

        public TronTransactionParam(@NotNull C10854bwM c10854bwM, @NotNull ChainAddress chainAddress, Activity activity, StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(chainAddress, "");
            this.EZpvd = c10854bwM;
            this.AEQbTJ = chainAddress;
            this.copydefault = activity;
            this.KWHzl = stateListAnimator;
        }

        public static final class Activity {
            public final String AEQbTJ;
            public final String AYXKKw;
            public final String AhwBna;
            public final String EZpvd;
            public final String KWHzl;
            public final String OLrzqt;
            public final String copydefault;
            public final String djBIcL;
            public final String gEmmrt;
            public final String valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AYXKKw() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AhwBna() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String djBIcL() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String gEmmrt() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String valueOf() {
                return this.gEmmrt;
            }

            public Activity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, String str10) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                this.AYXKKw = str;
                this.copydefault = str2;
                this.AhwBna = str3;
                this.KWHzl = str4;
                this.OLrzqt = str5;
                this.djBIcL = str6;
                this.gEmmrt = str7;
                this.valueOf = str8;
                this.EZpvd = str9;
                this.AEQbTJ = str10;
            }
        }

        public static final class StateListAnimator {
            public final String AEQbTJ;
            public final String AYXKKw;
            public final String AhwBna;
            public final String AkhnZx;
            public final String DbNXlk;
            public final String EZpvd;
            public final String KWHzl;
            public final String OLrzqt;
            public final String copydefault;
            public final String djBIcL;
            public final String fetchVPNInfo;
            public final String gEmmrt;
            public final String isConnected;
            public final String valueOf;
            public final String values;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AYXKKw() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AhwBna() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AkhnZx() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String DbNXlk() {
                return this.values;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String djBIcL() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String fetchVPNInfo() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String gEmmrt() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String isConnected() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String valueOf() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String values() {
                return this.isConnected;
            }

            public StateListAnimator(String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, String str12, String str13, String str14, @NotNull String str15) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str10, "");
                Intrinsics.checkNotNullParameter(str15, "");
                this.AkhnZx = str;
                this.AhwBna = str2;
                this.fetchVPNInfo = str3;
                this.isConnected = str4;
                this.djBIcL = str5;
                this.AYXKKw = str6;
                this.gEmmrt = str7;
                this.valueOf = str8;
                this.DbNXlk = str9;
                this.AEQbTJ = str10;
                this.copydefault = str11;
                this.OLrzqt = str12;
                this.KWHzl = str13;
                this.EZpvd = str14;
                this.values = str15;
            }
        }

        @Serializable
        public static final class TronUnsignedTx {
            private String signDataHex;
            private String txHex;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TronUnsignedTx() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TronUnsignedTx copy$default(TronUnsignedTx tronUnsignedTx, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tronUnsignedTx.signDataHex;
                }
                if ((i & 2) != 0) {
                    str2 = tronUnsignedTx.txHex;
                }
                return tronUnsignedTx.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.signDataHex;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.txHex;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TronUnsignedTx copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new TronUnsignedTx(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TronUnsignedTx)) {
                    return false;
                }
                TronUnsignedTx tronUnsignedTx = (TronUnsignedTx) obj;
                return Intrinsics.EZpvd((Object) this.signDataHex, (Object) tronUnsignedTx.signDataHex) && Intrinsics.EZpvd((Object) this.txHex, (Object) tronUnsignedTx.txHex);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSignDataHex() {
                return this.signDataHex;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTxHex() {
                return this.txHex;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.signDataHex.hashCode() * 31) + this.txHex.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setSignDataHex(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.signDataHex = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setTxHex(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.txHex = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TronUnsignedTx(signDataHex=" + this.signDataHex + ", txHex=" + this.txHex + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper.TronTransactionParam.TronUnsignedTx.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<TronUnsignedTx> serializer() {
                    return LedgerSignHelper$TronTransactionParam$TronUnsignedTx$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ TronUnsignedTx(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.signDataHex = "";
                } else {
                    this.signDataHex = str;
                }
                if ((i & 2) == 0) {
                    this.txHex = "";
                } else {
                    this.txHex = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TronUnsignedTx tronUnsignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tronUnsignedTx.signDataHex, (Object) "")) {
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, tronUnsignedTx.signDataHex);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) tronUnsignedTx.txHex, (Object) "")) {
                    return;
                }
                compositeEncoder.encodeStringElement(serialDescriptor, 1, tronUnsignedTx.txHex);
            }

            public TronUnsignedTx(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.signDataHex = str;
                this.txHex = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:698) call: com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper.TronTransactionParam.TronUnsignedTx.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ TronUnsignedTx(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
            }

            public final boolean isValid() {
                return this.signDataHex.length() > 0 && this.txHex.length() > 0;
            }
        }

        @Serializable
        public static final class TronSignedTx {
            private String rawTx;
            private String txHash;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TronSignedTx() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TronSignedTx copy$default(TronSignedTx tronSignedTx, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tronSignedTx.rawTx;
                }
                if ((i & 2) != 0) {
                    str2 = tronSignedTx.txHash;
                }
                return tronSignedTx.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.rawTx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.txHash;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TronSignedTx copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new TronSignedTx(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TronSignedTx)) {
                    return false;
                }
                TronSignedTx tronSignedTx = (TronSignedTx) obj;
                return Intrinsics.EZpvd((Object) this.rawTx, (Object) tronSignedTx.rawTx) && Intrinsics.EZpvd((Object) this.txHash, (Object) tronSignedTx.txHash);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getRawTx() {
                return this.rawTx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTxHash() {
                return this.txHash;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.rawTx.hashCode() * 31) + this.txHash.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setRawTx(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.rawTx = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setTxHash(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.txHash = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TronSignedTx(rawTx=" + this.rawTx + ", txHash=" + this.txHash + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper.TronTransactionParam.TronSignedTx.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<TronSignedTx> serializer() {
                    return LedgerSignHelper$TronTransactionParam$TronSignedTx$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ TronSignedTx(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.rawTx = "";
                } else {
                    this.rawTx = str;
                }
                if ((i & 2) == 0) {
                    this.txHash = "";
                } else {
                    this.txHash = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TronSignedTx tronSignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tronSignedTx.rawTx, (Object) "")) {
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, tronSignedTx.rawTx);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) tronSignedTx.txHash, (Object) "")) {
                    return;
                }
                compositeEncoder.encodeStringElement(serialDescriptor, 1, tronSignedTx.txHash);
            }

            public TronSignedTx(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.rawTx = str;
                this.txHash = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:709) call: com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper.TronTransactionParam.TronSignedTx.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ TronSignedTx(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
            }

            public final boolean isValid() {
                return this.rawTx.length() > 0 && this.txHash.length() > 0;
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper$TronTransactionParam$TronSignedTx>> */
    public final AbstractC58185ywX<ResponseData<TronTransactionParam.TronSignedTx>> KWHzl(@NotNull final TronTransactionParam tronTransactionParam) {
        Intrinsics.checkNotNullParameter(tronTransactionParam, "");
        AbstractC58185ywX<AbstractC14027ddh> abstractC58185ywXEZpvd = C14033ddn.OLrzqt.KWHzl(tronTransactionParam.KWHzl(), tronTransactionParam.OLrzqt(), false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.dcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LedgerSignHelper.copydefault(tronTransactionParam, (AbstractC14027ddh) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dda
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return LedgerSignHelper.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd values(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final TronTransactionParam tronTransactionParam, final AbstractC14027ddh abstractC14027ddh) {
        Intrinsics.checkNotNullParameter(abstractC14027ddh, "");
        if (abstractC14027ddh instanceof AbstractC14027ddh.Activity) {
            return AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.dcQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    LedgerSignHelper.AEQbTJ(tronTransactionParam, abstractC14027ddh, interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
        }
        if (!(abstractC14027ddh instanceof AbstractC14027ddh.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC14027ddh.ActionBar actionBar = (AbstractC14027ddh.ActionBar) abstractC14027ddh;
        int iEZpvd = actionBar.EZpvd();
        LedgerError ledgerErrorOLrzqt = actionBar.OLrzqt();
        String code = ledgerErrorOLrzqt != null ? ledgerErrorOLrzqt.getCode() : null;
        return AbstractC58185ywX.KWHzl(new ResponseData(iEZpvd, null, null, null, null, code == null ? "" : code, 30, null));
    }

    public static final void AEQbTJ(final TronTransactionParam tronTransactionParam, AbstractC14027ddh abstractC14027ddh, final InterfaceC58184ywW interfaceC58184ywW) {
        final TronTransactionParam.TronUnsignedTx tronUnsignedTx;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (tronTransactionParam.copydefault() != null) {
            tronUnsignedTx = (TronTransactionParam.TronUnsignedTx) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) TronTransactionParam.TronUnsignedTx.Companion.serializer(), C8377bBa.AEQbTJ.KWHzl(tronTransactionParam.KWHzl().fetchVPNInfo(), tronTransactionParam.copydefault().copydefault(), tronTransactionParam.copydefault().AhwBna(), tronTransactionParam.copydefault().AYXKKw(), tronTransactionParam.copydefault().EZpvd(), tronTransactionParam.copydefault().KWHzl(), tronTransactionParam.copydefault().djBIcL(), tronTransactionParam.copydefault().valueOf(), tronTransactionParam.copydefault().gEmmrt(), tronTransactionParam.copydefault().OLrzqt(), tronTransactionParam.copydefault().AEQbTJ()));
        } else if (tronTransactionParam.AEQbTJ() != null) {
            tronUnsignedTx = (TronTransactionParam.TronUnsignedTx) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) TronTransactionParam.TronUnsignedTx.Companion.serializer(), C8377bBa.AEQbTJ.KWHzl(tronTransactionParam.KWHzl().fetchVPNInfo(), tronTransactionParam.AEQbTJ().AkhnZx(), tronTransactionParam.AEQbTJ().AYXKKw(), tronTransactionParam.AEQbTJ().fetchVPNInfo(), tronTransactionParam.AEQbTJ().values(), tronTransactionParam.AEQbTJ().gEmmrt(), tronTransactionParam.AEQbTJ().AhwBna(), tronTransactionParam.AEQbTJ().djBIcL(), tronTransactionParam.AEQbTJ().valueOf(), tronTransactionParam.AEQbTJ().isConnected(), tronTransactionParam.AEQbTJ().OLrzqt(), tronTransactionParam.AEQbTJ().AEQbTJ(), tronTransactionParam.AEQbTJ().EZpvd(), tronTransactionParam.AEQbTJ().KWHzl(), tronTransactionParam.AEQbTJ().copydefault(), tronTransactionParam.AEQbTJ().DbNXlk()));
        } else {
            tronUnsignedTx = new TronTransactionParam.TronUnsignedTx((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
        if (!tronUnsignedTx.isValid()) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
            interfaceC58184ywW.onComplete();
        } else {
            interfaceC58184ywW.onNext(new ResponseData(73819768, null, null, null, null, null, 62, null));
            InterfaceC57036yao.Companion.valueOf(((AbstractC14027ddh.Activity) abstractC14027ddh).AEQbTJ()).OLrzqt(tronTransactionParam.OLrzqt().getDerivePath(), tronUnsignedTx.getSignDataHex(), null, new Function1() { // from class: o.dcV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.copydefault(tronTransactionParam, tronUnsignedTx, interfaceC58184ywW, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.dcZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LedgerSignHelper.values(interfaceC58184ywW, (LedgerError) obj);
                }
            });
        }
    }

    public static final Unit copydefault(TronTransactionParam tronTransactionParam, TronTransactionParam.TronUnsignedTx tronUnsignedTx, InterfaceC58184ywW interfaceC58184ywW, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TronTransactionParam.TronSignedTx tronSignedTx = (TronTransactionParam.TronSignedTx) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) TronTransactionParam.TronSignedTx.Companion.serializer(), C8377bBa.AEQbTJ.KWHzl(tronTransactionParam.KWHzl().fetchVPNInfo(), tronUnsignedTx.getTxHex(), str));
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        if (!tronSignedTx.isValid()) {
            interfaceC58184ywW.onNext(new ResponseData(-5005, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onNext(new ResponseData(-5001, null, null, null, tronSignedTx, null, 46, null));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final Unit values(InterfaceC58184ywW interfaceC58184ywW, LedgerError ledgerError) {
        Intrinsics.checkNotNullParameter(ledgerError, "");
        interfaceC58184ywW.onNext(new ResponseData(73819769, null, null, null, null, null, 62, null));
        interfaceC58184ywW.onNext(new ResponseData(73819763, null, null, null, null, ledgerError.getCode(), 30, null));
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }
}
