package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.model.tx.SubmitTxExpandBean;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.UTXOTransferBaseSignData;
import com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.RefreshUTXOVenue;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import com.okinc.business.defi.biz.core.transaction.sign.utxo.transaction.OKWUTXOBaseTransaction$loadUTXOManagement$1$1;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.WalletDappInteractionBizService;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import io.reactivex.BackpressureStrategy;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC11993ceZ;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11993ceZ<SignData extends UTXOTransferBaseSignData> extends AbstractC8664bGw<C11990ceW, SignData> {
    public java.util.List<UTXOInfoResp> AEQbTJ;
    public java.lang.String AYXKKw;
    public ChainAddress AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public java.util.List<UTXOInfoResp> OLrzqt;
    public boolean RJOkX;
    public boolean copydefault;
    public UTXOSignInfo fetchVPNInfo;
    public java.lang.String gEmmrt;
    public boolean valueOf;
    public final java.lang.String QbewEr = "OKWUTXOBaseTransaction";
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.cfE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC11993ceZ.djBIcL(this.OLrzqt);
        }
    });
    public final C12797ctk OcIXYQ = new C12797ctk();

    public abstract java.util.List<UTXOAddressInfoReq> AEQbTJ(@NotNull RefreshUTXOVenue refreshUTXOVenue);

    @Override // o.AbstractC8564bFB
    public boolean DCUTEI() {
        return true;
    }

    public boolean DGOPHZDGOPHZ() {
        return false;
    }

    public abstract java.util.List<UTXOAddressInfoReq> EZpvd(@NotNull RefreshUTXOVenue refreshUTXOVenue);

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.util.List<UTXOInfoResp> list) {
        this.OLrzqt = list;
    }

    public abstract void EZpvd(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list);

    public abstract C12797ctk.Application KWHzl(@NotNull ResponseData<java.util.List<UTXOInfoResp>> responseData, FragmentActivity fragmentActivity);

    public abstract AbstractC58185ywX<ResponseData<BatchBroadcastModel>> KWHzl(java.lang.String str, java.lang.String str2, SubmitTxExpandBean submitTxExpandBean);

    public abstract void KWHzl(boolean z, int i, @NotNull RefreshUTXOVenue refreshUTXOVenue, java.util.List<UTXOInfoResp> list);

    public abstract AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(boolean z, @NotNull RefreshUTXOVenue refreshUTXOVenue);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ORxRYg() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OcIXYQ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<UTXOInfoResp> QKVWgx() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOSignInfo UeEOUB() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C12797ctk aKErDB() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<UTXOInfoResp> djSkpj() {
        return this.AEQbTJ;
    }

    public abstract java.lang.Integer dvKsVJ();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8704bHj
    public java.lang.String ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.gEmmrt;
        return str2 == null ? "" : str2;
    }

    public abstract java.lang.String fZBcTu();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean flVtFt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.AYXKKw;
        return str2 == null ? "" : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gasjUx() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean giSNqX() {
        return this.valueOf;
    }

    public abstract AbstractC58185ywX<java.lang.Boolean> iZzfmt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String zuBGHE() {
        return "";
    }

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: dNCPSb, reason: merged with bridge method [inline-methods] */
    public C11990ceW DXXBbs() {
        return (C11990ceW) this.djBIcL.getValue();
    }

    public static final C11990ceW djBIcL(AbstractC11993ceZ abstractC11993ceZ) {
        return new C11990ceW(abstractC11993ceZ);
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<SignData> signDataArgs) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        OLrzqt(this.QbewEr, "init: " + signDataArgs.getSignData());
        return zKWHzl;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDBxZfM;
        OLrzqt(this.QbewEr, "onPrepare");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        if (DGOPHZDGOPHZ()) {
            abstractC58185ywXDBxZfM = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDBxZfM, "");
        } else {
            abstractC58185ywXDBxZfM = DBxZfM();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywX = abstractC58185ywXDBxZfM;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(new RefreshUTXOVenue(true, false, false, false, false, false, false, false, 0, TypedValues.PositionType.TYPE_POSITION_TYPE, (DefaultConstructorMarker) null));
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDGUQLI = DGUQLI();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDsrFlB = DsrFlB();
        final yHS yhs = new yHS() { // from class: o.cfb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return AbstractC11993ceZ.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3, (kotlin.Pair) obj4, (kotlin.Pair) obj5);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(abstractC58185ywXR_, abstractC58185ywX, abstractC58185ywXCopydefault, abstractC58185ywXDGUQLI, abstractC58185ywXDsrFlB, new InterfaceC58231yxQ() { // from class: o.cfh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58231yxQ
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return AbstractC11993ceZ.copydefault(yhs, obj, obj2, obj3, obj4, obj5);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cfn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.djBIcL(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.cfy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.DLWbHP(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.AYXKKw(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.QCjLjM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair copydefault(yHS yhs, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        Intrinsics.checkNotNullParameter(obj5, "");
        return (kotlin.Pair) yhs.invoke(obj, obj2, obj3, obj4, obj5);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3, kotlin.Pair pair4, kotlin.Pair pair5) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(pair4, "");
        Intrinsics.checkNotNullParameter(pair5, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? pair3 : !((java.lang.Boolean) pair4.getFirst()).booleanValue() ? pair4 : !((java.lang.Boolean) pair5.getFirst()).booleanValue() ? pair5 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(AbstractC11993ceZ abstractC11993ceZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return abstractC11993ceZ.copydefault(new RefreshUTXOVenue(false, true, false, false, false, false, false, false, 0, 509, (DefaultConstructorMarker) null));
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AYXKKw(AbstractC11993ceZ abstractC11993ceZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            abstractC11993ceZ.DXXBbs().KWHzl(0);
        }
        return pair;
    }

    @Override // o.AbstractC8664bGw, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> newProxyInstance = super.getNewProxyInstance();
        newProxyInstance.add(9);
        return newProxyInstance;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> ffGIBT() {
        OLrzqt(this.QbewEr, "onUpdateSignData");
        return copydefault(new RefreshUTXOVenue(false, false, false, false, true, false, false, false, 0, 495, (DefaultConstructorMarker) null));
    }

    public static final InterfaceC60096zvd dHguZz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> RJOkX() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXRJOkX = super.RJOkX();
        final Function1 function1 = new Function1() { // from class: o.cfr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.AhwBna(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXRJOkX.KWHzl(new InterfaceC58229yxO() { // from class: o.cfq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.dHguZz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AhwBna(AbstractC11993ceZ abstractC11993ceZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return abstractC11993ceZ.copydefault(new RefreshUTXOVenue(false, false, false, false, false, true, false, false, 0, 479, (DefaultConstructorMarker) null));
    }

    /* JADX DEBUG: Type inference failed for r15v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8664bGw, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd(@NotNull final C8486bDd c8486bDd) {
        Intrinsics.checkNotNullParameter(c8486bDd, "");
        OLrzqt(this.QbewEr, "onFeeChange  feeChangeType:" + c8486bDd.getFeeChangeType() + "  selectFeeType:" + DXXBbs().DbNXlk());
        if (c8486bDd.getFeeChangeType() == 4) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(new RefreshUTXOVenue(false, false, false, false, false, false, true, false, 0, 447, (DefaultConstructorMarker) null));
            final Function1 function1 = new Function1() { // from class: o.cfi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC11993ceZ.AEQbTJ(this.KWHzl, c8486bDd, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.cfm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC11993ceZ.gwTjWJ(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return super.EZpvd(c8486bDd);
    }

    public static final InterfaceC60096zvd gwTjWJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(AbstractC11993ceZ abstractC11993ceZ, C8486bDd c8486bDd, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC11993ceZ.DXXBbs().KWHzl(2);
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return super.EZpvd(c8486bDd);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC8704bHj, o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        OLrzqt(this.QbewEr, "onLoopRefresh");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDBxZfM = DBxZfM();
        final Function1 function1 = new Function1() { // from class: o.cfY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.gEmmrt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXDBxZfM.KWHzl(new InterfaceC58229yxO() { // from class: o.cfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.hBpjJd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.valueOf(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.RdAHlO(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final InterfaceC60096zvd hBpjJd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd gEmmrt(AbstractC11993ceZ abstractC11993ceZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return abstractC11993ceZ.copydefault(new RefreshUTXOVenue(false, false, false, true, false, false, false, false, 0, 503, (DefaultConstructorMarker) null));
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final Unit RdAHlO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit valueOf(AbstractC11993ceZ abstractC11993ceZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        abstractC11993ceZ.DXXBbs().KWHzl(3);
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd dmfpNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC11993ceZ abstractC11993ceZ, UTXOSignInfo uTXOSignInfo) {
        Intrinsics.checkNotNullParameter(uTXOSignInfo, "");
        abstractC11993ceZ.copydefault(uTXOSignInfo);
        return abstractC11993ceZ.copydefault(new RefreshUTXOVenue(false, false, false, true, false, false, false, false, 0, 503, (DefaultConstructorMarker) null));
    }

    public final void AEQbTJ(@NotNull WalletBtcAddressBean walletBtcAddressBean) {
        Intrinsics.checkNotNullParameter(walletBtcAddressBean, "");
        OLrzqt(this.QbewEr, "setFeeAddress  " + walletBtcAddressBean);
        this.AhwBna = dUDNAs().copydefault(walletBtcAddressBean.getAddress(), java.lang.Long.valueOf(dmfpNf()));
        KWHzl(walletBtcAddressBean.getBalance());
        DXXBbs().KWHzl(4);
        QkdxfA();
        KWHzl(0L);
    }

    public final ChainAddress RcXXUw() {
        OLrzqt(this.QbewEr, "getFeeChainAddress  " + this.AhwBna);
        return this.AhwBna;
    }

    public final java.lang.String QUSxYX() {
        ChainAddress chainAddressRcXXUw = RcXXUw();
        java.lang.String address = chainAddressRcXXUw != null ? chainAddressRcXXUw.getAddress() : null;
        return address == null ? "" : address;
    }

    public final void OLrzqt(java.lang.String str) {
        OLrzqt(this.QbewEr, "setCanTransfer Coin Amount  " + htlTjW() + ": " + str);
        this.gEmmrt = str;
    }

    public final void KWHzl(java.lang.String str) {
        OLrzqt(this.QbewEr, "setCanTransfer Chain Amount  " + QUSxYX() + ": " + str);
        this.AYXKKw = str;
    }

    public long QVAiDq() {
        return dmfpNf();
    }

    /* JADX DEBUG: Type inference failed for r1v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DBxZfM() {
        OLrzqt(this.QbewEr, "loadSignInfo");
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = OFhtUX().copydefault(OxVOHk(), Dmq(), new SignInfoReq(C33129mqd.gEmmrt(java.lang.Long.valueOf(QVAiDq())), htlTjW(), zLjUOn(), DWgRXt(), (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, dvKsVJ(), (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8000, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cfV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.zuWLRA(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair zuWLRA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(AbstractC11993ceZ abstractC11993ceZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "loadSignInfo  end  " + responseData.getData());
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            if ((signInfo != null ? signInfo.getInfo() : null) != null) {
                SignInfo signInfo2 = (SignInfo) responseData.getData();
                abstractC11993ceZ.copydefault(signInfo2 != null ? signInfo2.getSupportPush() : false);
                Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
                KSerializer<UTXOSignInfo> kSerializerSerializer = UTXOSignInfo.Companion.serializer();
                SignInfo signInfo3 = (SignInfo) responseData.getData();
                JsonObject info = signInfo3 != null ? signInfo3.getInfo() : null;
                Intrinsics.copydefault(info);
                abstractC11993ceZ.copydefault((UTXOSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info));
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    /* JADX INFO: renamed from: o.ceZ$Activity */
    public static final class Activity<T> implements InterfaceC58187ywZ {
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.Object obj, java.lang.String str) {
            this.copydefault = obj;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.ywW<com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC58187ywZ
        public final void subscribe(InterfaceC58184ywW<UTXOSignInfo> interfaceC58184ywW) {
            java.lang.Object objM7377constructorimpl;
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            java.lang.String str = this.OLrzqt;
            java.lang.Object obj = this.copydefault;
            try {
                Result.Application application = Result.Companion;
                com.google.gson.JsonObject asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.ceZ.Activity.3
                }.getType())).getAsJsonObject();
                if (asJsonObject.has("gasPrice") && asJsonObject.get("gasPrice").isJsonObject()) {
                    asJsonObject = ((com.google.gson.JsonObject) new Gson().fromJson(str, new TypeToken<com.google.gson.JsonObject>() { // from class: o.ceZ.Activity.2
                    }.getType())).get("gasPrice").getAsJsonObject();
                }
                com.google.gson.JsonObject jsonObject = (com.google.gson.JsonObject) new Gson().fromJson(obj != null ? C33488mxR.EZpvd(obj) : null, new TypeToken<com.google.gson.JsonObject>() { // from class: o.ceZ.Activity.1
                }.getType());
                C12764ctD c12764ctD = C12764ctD.OLrzqt;
                Intrinsics.copydefault(jsonObject);
                Intrinsics.copydefault(asJsonObject);
                objM7377constructorimpl = Result.m7377constructorimpl(new Gson().fromJson((JsonElement) c12764ctD.OLrzqt(jsonObject, asJsonObject), (java.lang.Class) UTXOSignInfo.class));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Object obj2 = Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl;
            if (obj2 == null) {
                obj2 = this.copydefault;
            }
            interfaceC58184ywW.onNext(obj2);
            interfaceC58184ywW.onComplete();
        }
    }

    public final void copydefault(UTXOSignInfo uTXOSignInfo) {
        if (uTXOSignInfo != null) {
            if (C33129mqd.AEQbTJ(uTXOSignInfo.getNormal(), uTXOSignInfo.getMax())) {
                uTXOSignInfo.setNormal(uTXOSignInfo.getMax());
                uTXOSignInfo.setNormalCost(uTXOSignInfo.getNormalCost());
            } else if (C33129mqd.gEmmrt(uTXOSignInfo.getNormal(), uTXOSignInfo.getMin())) {
                uTXOSignInfo.setNormal(uTXOSignInfo.getMin());
                uTXOSignInfo.setNormalCost(uTXOSignInfo.getMinCost());
            }
        }
        this.fetchVPNInfo = uTXOSignInfo;
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DGUQLI() {
        AbstractC58185ywX abstractC58185ywXAEQbTJ;
        OLrzqt(this.QbewEr, "loadFeeAddress");
        if (QVsKAR().isSupportAnotherAddressPayFee()) {
            AbstractC58185ywX<java.util.List<WalletBtcAddressBean>> abstractC58185ywXCopydefault = ((WalletDappInteractionBizService) C43251rlk.copydefault(WalletDappInteractionBizService.class)).copydefault(Dmq(), dHguZz().fetchVPNInfo(), OJuSTm().getBizType(), dvKsVJ());
            final Function1 function1 = new Function1() { // from class: o.cfA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC11993ceZ.EZpvd(this.KWHzl, (java.util.List) obj);
                }
            };
            abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC11993ceZ.ffGIBT(function1, obj);
                }
            });
        } else {
            OLrzqt(this.QbewEr, "loadFeeAddress  end  no need");
            abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cfz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return AbstractC11993ceZ.AhwBna(this.copydefault);
                }
            });
        }
        final Function1 function12 = new Function1() { // from class: o.cfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.AEQbTJ(this.copydefault, (Unit) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.getPostValueLengthLimit(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final Unit ffGIBT(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:37:0x0021 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0021 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x007f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.wallet.api.bean.WalletBtcAddressBean] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static final Unit EZpvd(AbstractC11993ceZ abstractC11993ceZ, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "loadFeeAddress  end  " + list);
        java.util.Iterator it = list.iterator();
        ?? next = 0;
        while (it.hasNext()) {
            WalletBtcAddressBean walletBtcAddressBean = (WalletBtcAddressBean) it.next();
            if (C33129mqd.copydefault(walletBtcAddressBean.getBalance(), next != 0 ? next.getBalance() : null)) {
                next = walletBtcAddressBean;
            }
        }
        if (C33129mqd.valueOf(next != 0 ? next.getBalance() : null, 0)) {
            java.util.Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = 0;
                    break;
                }
                next = it2.next();
                WalletBtcAddressBean walletBtcAddressBean2 = (WalletBtcAddressBean) next;
                if (walletBtcAddressBean2.getAddressType() == AddressType.P2SHType.getValue() || walletBtcAddressBean2.getAddressType() == AddressType.P2SHCommonType.getValue()) {
                    break;
                }
            }
        }
        AbstractC12782ctV abstractC12782ctVDUDNAs = abstractC11993ceZ.dUDNAs();
        WalletBtcAddressBean walletBtcAddressBean3 = (WalletBtcAddressBean) next;
        java.lang.String address = walletBtcAddressBean3 != null ? walletBtcAddressBean3.getAddress() : null;
        abstractC11993ceZ.AhwBna = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctVDUDNAs, address != null ? address : "", null, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(AbstractC11993ceZ abstractC11993ceZ) {
        abstractC11993ceZ.AhwBna = abstractC11993ceZ.fERRXa();
        return Unit.INSTANCE;
    }

    public static final kotlin.Pair getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(AbstractC11993ceZ abstractC11993ceZ, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(abstractC11993ceZ.AhwBna != null), "");
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DsrFlB() {
        OLrzqt(this.QbewEr, "loadUTXOManagement");
        if (QVsKAR().isNeedUTXOManagement()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cfg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return AbstractC11993ceZ.gEmmrt(this.KWHzl);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        OLrzqt(this.QbewEr, "loadUTXOManagement  end  no need");
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, ""));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair gEmmrt(AbstractC11993ceZ abstractC11993ceZ) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKWUTXOBaseTransaction$loadUTXOManagement$1$1(abstractC11993ceZ, null), 3, null);
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final java.lang.Boolean DCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> hCLrkq() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(new RefreshUTXOVenue(false, false, false, false, false, false, false, true, 0, 383, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.cfe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.KWHzl((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cff
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.DCUTEI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return (java.lang.Boolean) pair.getFirst();
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(@NotNull final RefreshUTXOVenue refreshUTXOVenue) {
        Intrinsics.checkNotNullParameter(refreshUTXOVenue, "");
        OLrzqt(this.QbewEr, "loadUTXO  " + refreshUTXOVenue);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = AEQbTJ(refreshUTXOVenue, this);
        final Function1 function1 = new Function1() { // from class: o.cfs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.OLrzqt(this.AEQbTJ, refreshUTXOVenue, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.cfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.QSBOWP(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.EZpvd(refreshUTXOVenue, this, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.QkdxfA(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.EZpvd(this.AEQbTJ, refreshUTXOVenue, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.cfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.QHmsKR(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public static final <SignData extends UTXOTransferBaseSignData> AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(final RefreshUTXOVenue refreshUTXOVenue, final AbstractC11993ceZ<SignData> abstractC11993ceZ) {
        if (refreshUTXOVenue.isInitAsset()) {
            return abstractC11993ceZ.OLrzqt(refreshUTXOVenue);
        }
        if (refreshUTXOVenue.isInitFee() || refreshUTXOVenue.isModifyFee() || refreshUTXOVenue.isLoop() || refreshUTXOVenue.isSubmit()) {
            return abstractC11993ceZ.KWHzl(refreshUTXOVenue);
        }
        if (refreshUTXOVenue.isChangedAmtOrAddress() || refreshUTXOVenue.isAssetChange()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt = abstractC11993ceZ.OLrzqt(refreshUTXOVenue);
            final Function1 function1 = new Function1() { // from class: o.cfQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC11993ceZ.valueOf(this.KWHzl, refreshUTXOVenue, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.cfP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC11993ceZ.RKDWNf(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (refreshUTXOVenue.getUpdateCanTransferAmount()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOLrzqt2 = abstractC11993ceZ.OLrzqt(refreshUTXOVenue);
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC11993ceZ.KWHzl(refreshUTXOVenue);
            final Function2 function2 = new Function2() { // from class: o.cfU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC11993ceZ.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
                }
            };
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXOLrzqt2, abstractC58185ywXKWHzl2, new InterfaceC58223yxI() { // from class: o.cfT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC11993ceZ.OLrzqt(function2, obj, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            return abstractC58185ywXEZpvd;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd RKDWNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd valueOf(AbstractC11993ceZ abstractC11993ceZ, RefreshUTXOVenue refreshUTXOVenue, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return abstractC11993ceZ.KWHzl(refreshUTXOVenue);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final InterfaceC60096zvd QSBOWP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC11993ceZ abstractC11993ceZ, RefreshUTXOVenue refreshUTXOVenue, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return abstractC11993ceZ.EZpvd(((java.lang.Boolean) pair.getFirst()).booleanValue(), refreshUTXOVenue);
    }

    public static final InterfaceC60096zvd QkdxfA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final RefreshUTXOVenue refreshUTXOVenue, final AbstractC11993ceZ abstractC11993ceZ, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (!refreshUTXOVenue.isInitAsset() && ((java.lang.Boolean) pair.getFirst()).booleanValue() && !abstractC11993ceZ.copydefault && !abstractC11993ceZ.EZpvd && !abstractC11993ceZ.valueOf && refreshUTXOVenue.getCount() < abstractC11993ceZ.aKErDB().OLrzqt()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXIZzfmt = abstractC11993ceZ.iZzfmt();
            final Function1 function1 = new Function1() { // from class: o.cfM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC11993ceZ.OLrzqt(this.copydefault, refreshUTXOVenue, pair, (java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXIZzfmt.KWHzl(new InterfaceC58229yxO() { // from class: o.cfN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC11993ceZ.OBJEWx(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final InterfaceC60096zvd OBJEWx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC11993ceZ abstractC11993ceZ, RefreshUTXOVenue refreshUTXOVenue, kotlin.Pair pair, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            refreshUTXOVenue.setCount(refreshUTXOVenue.getCount() + 1);
            return abstractC11993ceZ.copydefault(refreshUTXOVenue);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd QHmsKR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(AbstractC11993ceZ abstractC11993ceZ, RefreshUTXOVenue refreshUTXOVenue, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return abstractC11993ceZ.OLrzqt(((java.lang.Boolean) pair.getFirst()).booleanValue(), refreshUTXOVenue);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(final RefreshUTXOVenue refreshUTXOVenue) {
        OLrzqt(this.QbewEr, "loadAssetUTXO");
        java.util.List<UTXOAddressInfoReq> listEZpvd = EZpvd(refreshUTXOVenue);
        OLrzqt(this.QbewEr, "loadAssetUTXO args: " + listEZpvd);
        Unit unit = Unit.INSTANCE;
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXAEQbTJ = AEQbTJ(true, listEZpvd);
        final Function1 function1 = new Function1() { // from class: o.cfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.copydefault(this.KWHzl, refreshUTXOVenue, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.DarRvM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(AbstractC11993ceZ abstractC11993ceZ, RefreshUTXOVenue refreshUTXOVenue, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "loadAssetUTXO  end  " + responseData.getData());
        if (responseData.getCode() == 0 || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            if (!refreshUTXOVenue.getUpdateCanTransferAmount()) {
                abstractC11993ceZ.copydefault = responseData.getCode() == 10004 || responseData.getCode() == 100041;
                if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                    abstractC11993ceZ.OLrzqt = (java.util.List) responseData.getData();
                }
            }
            abstractC11993ceZ.EZpvd(true, refreshUTXOVenue, (java.util.List<UTXOInfoResp>) responseData.getData());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        abstractC11993ceZ.EZpvd(false, refreshUTXOVenue, (java.util.List<UTXOInfoResp>) null);
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> KWHzl(final RefreshUTXOVenue refreshUTXOVenue) {
        OLrzqt(this.QbewEr, "loadFeeUTXO");
        java.util.List<UTXOAddressInfoReq> listAEQbTJ = AEQbTJ(refreshUTXOVenue);
        OLrzqt(this.QbewEr, "loadFeeUTXO args: " + listAEQbTJ);
        Unit unit = Unit.INSTANCE;
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXAEQbTJ = AEQbTJ(false, listAEQbTJ);
        final Function1 function1 = new Function1() { // from class: o.cfj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.KWHzl(this.KWHzl, refreshUTXOVenue, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.OuxcSI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair OuxcSI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(AbstractC11993ceZ abstractC11993ceZ, RefreshUTXOVenue refreshUTXOVenue, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "loadFeeUTXO  end  " + responseData.getData());
        java.lang.Object obj = null;
        if (responseData.getCode() == 0 || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            if (!refreshUTXOVenue.getUpdateCanTransferAmount()) {
                abstractC11993ceZ.valueOf = responseData.getCode() == 10004;
                abstractC11993ceZ.EZpvd = responseData.getCode() == 100041;
                if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                    abstractC11993ceZ.AEQbTJ = (java.util.List) responseData.getData();
                }
            }
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) abstractC11993ceZ.QUSxYX())) {
                        obj = next;
                        break;
                    }
                }
                UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) obj;
                if (uTXOInfoResp != null) {
                    abstractC11993ceZ.KWHzl(uTXOInfoResp.getCanTransferAmount());
                }
            }
            abstractC11993ceZ.KWHzl(true, responseData.getCode(), refreshUTXOVenue, (java.util.List<UTXOInfoResp>) responseData.getData());
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        abstractC11993ceZ.KWHzl(false, responseData.getCode(), refreshUTXOVenue, (java.util.List<UTXOInfoResp>) null);
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> AEQbTJ(boolean z, java.util.List<UTXOAddressInfoReq> list) {
        int iKWHzl;
        if (list.isEmpty()) {
            AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 62, null));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C13934dbu c13934dbuOFhtUX = OFhtUX();
        java.lang.String strOxVOHk = OxVOHk();
        java.lang.String strDmq = Dmq();
        long jDmfpNf = dmfpNf();
        if (z) {
            iKWHzl = UTXOInfoReq.Companion.OLrzqt();
        } else {
            iKWHzl = UTXOInfoReq.Companion.KWHzl();
        }
        return c13934dbuOFhtUX.KWHzl(strOxVOHk, strDmq, new UTXOInfoReq(java.lang.Long.valueOf(jDmfpNf), list, iKWHzl));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ceW.getFeeRate$default(o.ceW, int, int, java.lang.Object):java.lang.String */
    public static /* synthetic */ java.lang.String calSignLength$default(AbstractC11993ceZ abstractC11993ceZ, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calSignLength");
        }
        if ((i & 2) != 0) {
            str2 = C11990ceW.getFeeRate$default(abstractC11993ceZ.DXXBbs(), 0, 1, null);
        }
        return abstractC11993ceZ.KWHzl(str, str2);
    }

    public final java.lang.String KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.divB$default(str, str2, 0, null, 6, null), true, (RoundingMode) null, 2, (java.lang.Object) null);
        OLrzqt(this.QbewEr, "calSignLength  feeValue:" + str + "  feeRate:" + str2 + "  " + strConvertToBigIntegerString$default);
        return strConvertToBigIntegerString$default;
    }

    @Override // o.AbstractC8664bGw
    public java.lang.String D_() {
        return C54862xYb.convertToString$default(C54862xYb.AEQbTJ(AbstractC8704bHj.getCoinBalance$default(this, null, 1, null), ORxRYg()), false, null, null, 7, null);
    }

    @Override // o.AbstractC8664bGw
    public boolean E_() {
        return super.E_() && !this.copydefault;
    }

    @Override // o.AbstractC8664bGw
    public boolean F_() {
        return (!super.F_() || this.valueOf || this.EZpvd) ? false : true;
    }

    public final boolean KWHzl() {
        if (!dHguZz().iRxXKY() || this.KWHzl || !aKErDB().AhwBna(copydefault(this.OLrzqt, this.AEQbTJ))) {
            return false;
        }
        this.KWHzl = true;
        return true;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> AEQbTJ() {
        AbstractC58185ywX<ResponseData<java.lang.Boolean>> abstractC58185ywXKWHzl = OFhtUX().KWHzl(htlTjW(), dHguZz().AhwBna());
        final Function1 function1 = new Function1() { // from class: o.cfL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.valueOf((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.ODWQjV(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean ODWQjV(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> KWHzl(final SubmitTxExpandBean submitTxExpandBean) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault;
        if (submitTxExpandBean != null) {
            java.lang.Boolean ignoreRefreshUTXO = submitTxExpandBean.getIgnoreRefreshUTXO();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(ignoreRefreshUTXO, bool)) {
                abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, ""));
            } else {
                abstractC58185ywXCopydefault = copydefault(new RefreshUTXOVenue(false, false, true, false, false, false, false, false, 0, TypedValues.PositionType.TYPE_PERCENT_Y, (DefaultConstructorMarker) null));
            }
        }
        final ActionBar actionBar = new ActionBar(this, submitTxExpandBean);
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.cfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.hrNTAI(actionBar, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cfJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.OLrzqt(this.KWHzl, submitTxExpandBean, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<? extends java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cfO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.OFhtUX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    /* JADX INFO: renamed from: o.ceZ$ActionBar */
    public static final class ActionBar implements Function1<?, InterfaceC60096zvd<? extends ResponseData<java.util.List<? extends UTXOInfoResp>>>> {
        public final /* synthetic */ SubmitTxExpandBean KWHzl;
        public final /* synthetic */ AbstractC11993ceZ<SignData> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(AbstractC11993ceZ<SignData> abstractC11993ceZ, SubmitTxExpandBean submitTxExpandBean) {
            this.OLrzqt = abstractC11993ceZ;
            this.KWHzl = submitTxExpandBean;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final InterfaceC60096zvd<? extends ResponseData<java.util.List<UTXOInfoResp>>> invoke(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            boolean zBooleanValue = pair.component1().booleanValue();
            final java.lang.String strComponent2 = pair.component2();
            if (zBooleanValue) {
                AbstractC11993ceZ<SignData> abstractC11993ceZ = this.OLrzqt;
                java.util.List<UTXOInfoResp> listCopydefault = abstractC11993ceZ.copydefault(abstractC11993ceZ.QKVWgx(), this.OLrzqt.djSkpj());
                if (this.OLrzqt.flVtFt() || this.OLrzqt.gasjUx() || this.OLrzqt.giSNqX() || listCopydefault.isEmpty()) {
                    AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXHCLrkq = this.OLrzqt.hCLrkq();
                    final Function1 function1 = new Function1() { // from class: o.cgd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC11993ceZ.ActionBar.KWHzl(strComponent2, (java.lang.Boolean) obj);
                        }
                    };
                    return abstractC58185ywXHCLrkq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cgb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj) {
                            return AbstractC11993ceZ.ActionBar.EZpvd(function1, obj);
                        }
                    });
                }
                SubmitTxExpandBean submitTxExpandBean = this.KWHzl;
                if ((submitTxExpandBean == null || !Intrinsics.EZpvd(submitTxExpandBean.getIgnoreNotDetectUTXO(), java.lang.Boolean.TRUE)) && this.OLrzqt.aKErDB().KWHzl(listCopydefault, this.OLrzqt.fERRXa().getAddress())) {
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5008, null, null, null, null, null, 62, null));
                }
                SubmitTxExpandBean submitTxExpandBean2 = this.KWHzl;
                if ((submitTxExpandBean2 == null || !Intrinsics.EZpvd(submitTxExpandBean2.getIgnorePendingUTXO(), java.lang.Boolean.TRUE)) && this.OLrzqt.KWHzl()) {
                    this.OLrzqt.KWHzl = true;
                    return AbstractC58185ywX.KWHzl(new ResponseData(-5011, null, null, null, null, null, 62, null));
                }
                return AbstractC58185ywX.KWHzl(new ResponseData(-5001, null, null, null, listCopydefault, null, 46, null));
            }
            return AbstractC58185ywX.KWHzl(new ResponseData(0, strComponent2 == null ? "" : strComponent2, null, strComponent2 == null ? "" : strComponent2, null, null, 53, null));
        }

        public static final ResponseData EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (ResponseData) function1.invoke(obj);
        }

        public static final ResponseData KWHzl(java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(bool, "");
            return new ResponseData(-5009, str == null ? "" : str, null, null, null, null, 60, null);
        }
    }

    public static final InterfaceC60096zvd hrNTAI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OFhtUX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC11993ceZ abstractC11993ceZ, SubmitTxExpandBean submitTxExpandBean, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == -5001 && responseData.getData() != null && abstractC11993ceZ.dHguZz().iRxXKY()) {
            C12797ctk.Application applicationKWHzl = abstractC11993ceZ.KWHzl((ResponseData<java.util.List<UTXOInfoResp>>) responseData, submitTxExpandBean != null ? submitTxExpandBean.getActivity() : null);
            return abstractC11993ceZ.aKErDB().copydefault(applicationKWHzl.AhwBna(), applicationKWHzl.AEQbTJ(), applicationKWHzl.gEmmrt(), applicationKWHzl.EZpvd(), applicationKWHzl.valueOf(), applicationKWHzl.OLrzqt(), applicationKWHzl.KWHzl(), applicationKWHzl.djBIcL(), applicationKWHzl.copydefault());
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(responseData);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final java.util.List<UTXOInfoResp> copydefault(java.util.List<UTXOInfoResp> list, java.util.List<UTXOInfoResp> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public final java.util.List<UtxoInfo> AEQbTJ(java.util.List<UTXOInfoResp> list, java.util.List<UTXOInfoResp> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    arrayList.addAll(utxoList);
                }
            }
        }
        if (list2 != null) {
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                java.util.List<UtxoInfo> utxoList2 = ((UTXOInfoResp) it2.next()).getUtxoList();
                if (utxoList2 != null) {
                    arrayList.addAll(utxoList2);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<UtxoInfo> copydefault(java.util.List<UTXOInfoResp> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    arrayList.addAll(utxoList);
                }
            }
        }
        return arrayList;
    }

    public final java.lang.String fvQaOB() {
        UTXOSignInfo uTXOSignInfo = this.fetchVPNInfo;
        if (uTXOSignInfo != null) {
            return uTXOSignInfo.getTransferReminder();
        }
        return null;
    }

    public static final ResponseData ODXsMY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r2v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = KWHzl((java.lang.String) null, str2, submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.cfo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.AEQbTJ(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.ODXsMY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AEQbTJ(AbstractC11993ceZ abstractC11993ceZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "broadcast: " + responseData);
        return responseData;
    }

    public static final ResponseData OHqIaq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.core.transaction.bean.BatchBroadcastModel>> */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<ResponseData<BatchBroadcastModel>> OLrzqt(@NotNull java.lang.String str, SubmitTxExpandBean submitTxExpandBean) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ResponseData<BatchBroadcastModel>> abstractC58185ywXKWHzl = KWHzl(str, (java.lang.String) null, submitTxExpandBean);
        final Function1 function1 = new Function1() { // from class: o.cfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.AYXKKw(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.OHqIaq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AYXKKw(AbstractC11993ceZ abstractC11993ceZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        abstractC11993ceZ.OLrzqt(abstractC11993ceZ.QbewEr, "broadcast: " + responseData);
        return responseData;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DbNXlk(@NotNull java.lang.String str) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        UTXOSignInfo uTXOSignInfo = this.fetchVPNInfo;
        if (uTXOSignInfo == null || str.length() == 0) {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(uTXOSignInfo);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new Activity(uTXOSignInfo, str), BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        final Function1 function1 = new Function1() { // from class: o.cfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC11993ceZ.OLrzqt(this.copydefault, (UTXOSignInfo) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cfl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC11993ceZ.dmfpNf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final java.lang.Boolean valueOf(ResponseData responseData) {
        java.lang.Boolean bool;
        Intrinsics.checkNotNullParameter(responseData, "");
        return java.lang.Boolean.valueOf((responseData.getCode() != 0 || responseData.getData() == null || (bool = (java.lang.Boolean) responseData.getData()) == null) ? false : bool.booleanValue());
    }
}
