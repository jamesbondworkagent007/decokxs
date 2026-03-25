package com.okinc.business.invest_biz.data.logic;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.invest_biz.data.bean.InvestAACallData;
import com.okinc.business.invest_biz.data.bean.InvestCallData;
import com.okinc.business.invest_biz.data.bean.InvestCallDataExtra;
import com.okinc.business.invest_biz.data.bean.InvestCallDataReq;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxData;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.models.InvestSimpleToken;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.network.okg.response.ResponseFailedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58185ywX;
import o.C23580iBq;
import o.C25471ixO;
import o.C25493ixk;
import o.C25592izd;
import o.C27492jwH;
import o.C27539jxB;
import o.C32962mnV;
import o.C33070mpX;
import o.C33129mqd;
import o.C33134mqi;
import o.C33489mxS;
import o.C43251rlk;
import o.C43422row;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C58114yvF;
import o.InterfaceC23916iOb;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58217yxC;
import o.InterfaceC58222yxH;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.iNH;
import o.yDY;
import o.yEE;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTradeManager {
    public static Json AEQbTJ;
    public static volatile boolean copydefault;
    public static final InvestTradeManager OLrzqt = new InvestTradeManager();
    public static final C25592izd EZpvd = C25592izd.OLrzqt;
    public static final int KWHzl = 8;

    public final boolean KWHzl(int i) {
        return i == 1;
    }

    private InvestTradeManager() {
    }

    public static final class TransactionResultExtraData implements Parcelable {
        public static final Parcelable.Creator<TransactionResultExtraData> CREATOR = new Creator();
        public final Integer AEQbTJ;
        public final String EZpvd;
        public final Integer KWHzl;

        public static final class Creator implements Parcelable.Creator<TransactionResultExtraData> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionResultExtraData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TransactionResultExtraData(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionResultExtraData[] newArray(int i) {
                return new TransactionResultExtraData[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TransactionResultExtraData() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TransactionResultExtraData copy$default(TransactionResultExtraData transactionResultExtraData, Integer num, String str, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = transactionResultExtraData.KWHzl;
            }
            if ((i & 2) != 0) {
                str = transactionResultExtraData.EZpvd;
            }
            if ((i & 4) != 0) {
                num2 = transactionResultExtraData.AEQbTJ;
            }
            return transactionResultExtraData.KWHzl(num, str, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionResultExtraData KWHzl(Integer num, String str, Integer num2) {
            return new TransactionResultExtraData(num, str, num2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer copydefault() {
            return this.KWHzl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionResultExtraData)) {
                return false;
            }
            TransactionResultExtraData transactionResultExtraData = (TransactionResultExtraData) obj;
            return Intrinsics.EZpvd(this.KWHzl, transactionResultExtraData.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) transactionResultExtraData.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, transactionResultExtraData.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.KWHzl;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.EZpvd;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            Integer num2 = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransactionResultExtraData(estimatedTime=" + this.KWHzl + ", orderId=" + this.EZpvd + ", orderType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer num = this.KWHzl;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.EZpvd);
            Integer num2 = this.AEQbTJ;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            }
        }

        public TransactionResultExtraData(Integer num, String str, Integer num2) {
            this.KWHzl = num;
            this.EZpvd = str;
            this.AEQbTJ = num2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:68) call: com.okinc.business.invest_biz.data.logic.InvestTradeManager.TransactionResultExtraData.<init>(java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ TransactionResultExtraData(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.logic.InvestTradeManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitTransaction$default(InvestTradeManager investTradeManager, Context context, InvestTxModel investTxModel, yHO yho, yHO yho2, int i, Object obj) {
        if ((i & 4) != 0) {
            yho = null;
        }
        investTradeManager.AEQbTJ(context, investTxModel, yho, yho2);
    }

    public final void AEQbTJ(@NotNull Context context, @NotNull InvestTxModel investTxModel, yHO<? super String, ? super String, ? super Continuation<? super Boolean>, ? extends Object> yho, @NotNull yHO<? super Integer, ? super Bundle, ? super TransactionResultExtraData, Unit> yho2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(yho2, "");
        EZpvd(context, investTxModel, yho2, null, yho);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.business.invest_biz.data.logic.InvestTradeManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitTransaction$default(InvestTradeManager investTradeManager, Context context, InvestTxModel investTxModel, yHO yho, Function1 function1, yHO yho2, int i, Object obj) {
        if ((i & 16) != 0) {
            yho2 = null;
        }
        investTradeManager.EZpvd(context, investTxModel, yho, function1, yho2);
    }

    public final void EZpvd(@NotNull final Context context, @NotNull final InvestTxModel investTxModel, @NotNull final yHO<? super Integer, ? super Bundle, ? super TransactionResultExtraData, Unit> yho, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1, final yHO<? super String, ? super String, ? super Continuation<? super Boolean>, ? extends Object> yho2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(yho, "");
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        AEQbTJ = ((iNH) C58114yvF.OLrzqt(context, iNH.class)).QOLQEE();
        if (copydefault) {
            yho.invoke(100, null, new TransactionResultExtraData(null, null, null, 7, null));
            return;
        }
        copydefault = true;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
        if (interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.getFieldNames()) {
            AEQbTJ(investTxModel, new Function1() { // from class: o.iAE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestTradeManager.copydefault(context, investTxModel, yho, function1, (java.lang.String) obj);
                }
            });
        } else {
            AEQbTJ(investTxModel, new Function2() { // from class: o.iAJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return InvestTradeManager.AEQbTJ(context, investTxModel, yho, function1, yho2, (JsonObject) obj, (java.lang.String) obj2);
                }
            });
        }
    }

    public static final Unit copydefault(Context context, InvestTxModel investTxModel, yHO yho, Function1 function1, String str) {
        OLrzqt.AEQbTJ(str, context, investTxModel, yho, function1);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Context context, InvestTxModel investTxModel, yHO yho, Function1 function1, yHO yho2, JsonObject jsonObject, String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new InvestTradeManager$submitTransaction$2$1(str, context, investTxModel, yho, function1, yho2, jsonObject, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull InvestTxModel investTxModel, @NotNull final Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
        if (interfaceC9738bbJOLrzqt != null && interfaceC9738bbJOLrzqt.getFieldNames()) {
            AEQbTJ(investTxModel, new Function1() { // from class: o.iAs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestTradeManager.copydefault(function1, (java.lang.String) obj);
                }
            });
        } else {
            AEQbTJ(investTxModel, new Function2() { // from class: o.iAu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return InvestTradeManager.copydefault(function1, (JsonObject) obj, (java.lang.String) obj2);
                }
            });
        }
    }

    public static final Unit copydefault(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, JsonObject jsonObject, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(String str, Context context, final InvestTxModel investTxModel, final yHO<? super Integer, ? super Bundle, ? super TransactionResultExtraData, Unit> yho, final Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1) {
        DappInteractionArgs dappInteractionArgs;
        if (str == null || str.length() == 0) {
            copydefault = false;
            yho.invoke(2, null, new TransactionResultExtraData(null, null, null, 7, null));
            return;
        }
        yho.invoke(1, null, new TransactionResultExtraData(null, null, null, 7, null));
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        DappInteractionArgs dappInteractionArgs2 = new DappInteractionArgs(investTxModel.getWalletId(), null, C33129mqd.AYXKKw(Long.valueOf(investTxModel.getChainId())), new PlatformItem(0L, investTxModel.getPlatform(), (String) null, str2, str3, str4, (List) null, (List) null, str5, (String) null, 0L, investTxModel.getDrawableRes(), (String) null, (String) null, 14333, (DefaultConstructorMarker) null), str, investTxModel.getCoinId(), "invest", 7, 0 == true ? 1 : 0, str2, str3, str4, false, false, str5, true, null, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, 3, null, null, null, null, null, -67141886, null);
        List<FromToken> fromToken = investTxModel.getFromToken();
        if (fromToken != null) {
            dappInteractionArgs = dappInteractionArgs2;
            dappInteractionArgs.setSignDataJson(DappInteractionArgs.Companion.OLrzqt(dappInteractionArgs2.getSignDataJson(), fromToken));
        } else {
            dappInteractionArgs = dappInteractionArgs2;
        }
        final StateListAnimator stateListAnimator = new StateListAnimator();
        ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).AEQbTJ(context, dappInteractionArgs, new Function1() { // from class: o.iAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.copydefault(stateListAnimator, yho, (android.os.Bundle) obj);
            }
        }, new Function1() { // from class: o.iAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.copydefault(stateListAnimator, investTxModel, (NewCallbackBean) obj);
            }
        }, function1 != null ? new Function1() { // from class: o.iAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.OLrzqt(stateListAnimator, function1, (NewCallbackBean) obj);
            }
        } : null);
    }

    public static final AbstractC58185ywX OLrzqt(StateListAnimator stateListAnimator, Function1 function1, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return stateListAnimator.AEQbTJ(newCallbackBean, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>>) function1);
    }

    public static final Unit copydefault(StateListAnimator stateListAnimator, yHO yho, Bundle bundle) {
        stateListAnimator.copydefault(bundle, (yHO<? super Integer, ? super Bundle, ? super TransactionResultExtraData, Unit>) yho);
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX copydefault(StateListAnimator stateListAnimator, InvestTxModel investTxModel, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return stateListAnimator.KWHzl(newCallbackBean, investTxModel);
    }

    public final void AEQbTJ(final InvestTxModel investTxModel, final Function2<? super JsonObject, ? super String, Unit> function2) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(EZpvd.copydefault(OLrzqt(investTxModel)), (Function1) null, 1, (Object) null);
        final Function1 function1 = new Function1() { // from class: o.iAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.AEQbTJ(investTxModel, function2, (JsonObject) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestTradeManager.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.OLrzqt(function2, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestTradeManager.djBIcL(function12, obj);
            }
        });
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InvestTxModel investTxModel, Function2 function2, JsonObject jsonObject) {
        InvestTradeManager investTradeManager = OLrzqt;
        Intrinsics.copydefault(jsonObject);
        Json json = AEQbTJ;
        if (json == null) {
            Intrinsics.gEmmrt("");
            json = null;
        }
        json.getSerializersModule();
        function2.invoke(jsonObject, investTradeManager.EZpvd(jsonObject, investTxModel, (InvestCallData) json.decodeFromJsonElement(InvestCallData.Companion.serializer(), jsonObject)));
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function2 function2, Throwable th) {
        function2.invoke(null, null);
        InvestTradeManager investTradeManager = OLrzqt;
        Intrinsics.copydefault(th);
        C33134mqi.AEQbTJ(investTradeManager.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    public final String EZpvd(@NotNull JsonObject jsonObject, @NotNull InvestTxModel investTxModel, @NotNull InvestCallData investCallData) {
        String signDataString;
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(investCallData, "");
        String value = AEQbTJ(investTxModel.getOrderType()) ? "" : investCallData.getValue();
        if (investCallData.getCosmosData().length() > 0) {
            signDataString = investCallData.getCosmosData();
        } else if (investCallData.getUnsignedTx().length() > 0) {
            signDataString = investCallData.getUnsignedTx();
        } else if (C33129mqd.OLrzqt((CharSequence) investCallData.getTxOptions())) {
            signDataString = investCallData.getTxOptions();
            Intrinsics.copydefault((Object) signDataString);
        } else if (investCallData.getTxSerialize().length() > 0) {
            signDataString = investCallData.getSuiSignDataString(value);
        } else {
            signDataString = (investCallData.getCheckSum().length() <= 0 && investTxModel.getBtcMode() != BTCMode.BABYLON) ? investCallData.getSignDataString(value, OLrzqt.KWHzl(investTxModel.getGasRate())) : investCallData.getBTCSignDataString(investCallData.getSerializedData());
        }
        JsonElement toJsonElement = Json.Default.parseToJsonElement(signDataString);
        JsonObject jsonObject2 = toJsonElement instanceof JsonObject ? (JsonObject) toJsonElement : null;
        if (jsonObject2 == null || (linkedHashMap = C56424yEw.isConnected(jsonObject2)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (investCallData.getCheckSum().length() > 0) {
            Iterator<T> it = jsonObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (Intrinsics.EZpvd(entry.getKey(), (Object) "value") || Intrinsics.EZpvd(entry.getKey(), (Object) "to")) {
                    if (linkedHashMap.get(entry.getKey()) == null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        } else {
            Iterator<T> it2 = jsonObject.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                if (!Intrinsics.EZpvd(entry2.getKey(), (Object) "value") && linkedHashMap.get(entry2.getKey()) == null) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        }
        return C33489mxS.KWHzl.KWHzl(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElement.Companion.serializer()), linkedHashMap);
    }

    public final void AEQbTJ(final InvestTxModel investTxModel, final Function1<? super String, Unit> function1) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(EZpvd.AEQbTJ(OLrzqt(investTxModel)), (Function1) null, 1, (Object) null);
        final Function1 function12 = new Function1() { // from class: o.iAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.KWHzl(investTxModel, function1, (JsonObject) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestTradeManager.KWHzl(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.iAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestTradeManager.KWHzl(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestTradeManager.gEmmrt(function13, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InvestTxModel investTxModel, Function1 function1, JsonObject jsonObject) {
        JsonArray jsonArray = JsonElementKt.getJsonArray(jsonObject.getOrDefault("dataList", new JsonArray(yDY.AhwBna())));
        List<FromToken> fromToken = investTxModel.getFromToken();
        if (fromToken != null) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
            Iterator<JsonElement> it = jsonArray.iterator();
            while (true) {
                Json json = null;
                if (!it.hasNext()) {
                    break;
                }
                JsonElement next = it.next();
                Json json2 = AEQbTJ;
                if (json2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    json = json2;
                }
                json.getSerializersModule();
                arrayList.add((InvestAACallData) json.decodeFromJsonElement(InvestAACallData.Companion.serializer(), next));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.EZpvd((Object) "SUBSCRIBE", (Object) ((InvestAACallData) obj).getType())) {
                    arrayList2.add(obj);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InvestAACallData) it2.next()).setFromToken(fromToken);
            }
            investTxModel.setFromToken(null);
        }
        function1.invoke(C33489mxS.KWHzl.KWHzl(BuiltinSerializersKt.getNullable(JsonObject.Companion.serializer()), jsonObject));
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, Throwable th) {
        function1.invoke(null);
        InvestTradeManager investTradeManager = OLrzqt;
        Intrinsics.copydefault(th);
        C33134mqi.AEQbTJ(investTradeManager.AEQbTJ(th));
        return Unit.INSTANCE;
    }

    public final int KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "0")) {
            return 3;
        }
        return Intrinsics.EZpvd((Object) str, (Object) "2") ? 1 : 2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.data.models.InvestSimpleToken.copy$default(com.okinc.business.invest_biz.data.models.InvestSimpleToken, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.invest_biz.data.models.InvestSimpleToken */
    public final InvestCallDataReq OLrzqt(@NotNull InvestTxModel investTxModel) {
        List<InvestSimpleToken> listOLrzqt;
        Intrinsics.checkNotNullParameter(investTxModel, "");
        String walletId = investTxModel.getWalletId();
        int orderType = investTxModel.getOrderType();
        List<Long> investmentId = investTxModel.getInvestmentId();
        String address = investTxModel.getAddress();
        if (AEQbTJ(investTxModel.getOrderType())) {
            listOLrzqt = yDY.AhwBna();
        } else {
            listOLrzqt = OLrzqt(investTxModel.getExpectOutputList());
        }
        List<InvestSimpleToken> list = listOLrzqt;
        List<InvestSimpleToken> listOLrzqt2 = OLrzqt(investTxModel.getUserInputList());
        for (InvestSimpleToken investSimpleToken : listOLrzqt2) {
            InvestTradeManager investTradeManager = OLrzqt;
            if (investTradeManager.AEQbTJ(investTxModel.getOrderType()) || investTradeManager.EZpvd(investTxModel.getOrderType())) {
                InvestSimpleToken.copy$default(investSimpleToken, null, null, null, null, null, null, 61, null);
            }
        }
        List<InvestSimpleToken> listAhwBna = AEQbTJ(investTxModel.getOrderType()) ? yDY.AhwBna() : OLrzqt(investTxModel.getAssetsList());
        String gasPrice = investTxModel.getGasPrice();
        String priorityFee = investTxModel.getPriorityFee();
        String slipPoint = investTxModel.getSlipPoint();
        if (slipPoint.length() == 0) {
            slipPoint = null;
        }
        return new InvestCallDataReq(walletId, Integer.valueOf(orderType), investmentId, address, list, listOLrzqt2, listAhwBna, gasPrice, priorityFee, slipPoint, AEQbTJ(investTxModel), investTxModel.getGasLimit(), OLrzqt(investTxModel.getExpectOutputList()), investTxModel.getSwapSlipPoint(), investTxModel.getStakeId());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AEQbTJ(InvestTxModel investTxModel) {
        ArrayList arrayList;
        final Map linkedHashMap;
        JsonObject jsonObject;
        Json.Default r0 = Json.Default;
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        Integer numValueOf = investTxModel.getRedeemAll() != 0 ? Integer.valueOf(investTxModel.getRedeemAll()) : null;
        Long analysisPlatformId = investTxModel.getAnalysisPlatformId();
        List<String> claimIndex = investTxModel.getClaimIndex();
        Integer claimOverdue = investTxModel.getClaimOverdue();
        List<String> callDataExtJsonList = investTxModel.getCallDataExtJsonList();
        if (callDataExtJsonList != null) {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(callDataExtJsonList, 10));
            Iterator<T> it = callDataExtJsonList.iterator();
            while (it.hasNext()) {
                arrayList2.add((JsonElement) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) JsonElement.Companion.serializer(), (String) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Map<String, String> redeemExtra = investTxModel.getRedeemExtra();
        List listEZpvd = redeemExtra != null ? C56402yEa.EZpvd(redeemExtra) : null;
        String rewardingAddress = investTxModel.getRewardingAddress();
        String tokenId = investTxModel.getTokenId();
        String callDataExtJson = investTxModel.getCallDataExtJson();
        Integer tickUpper = investTxModel.getTickUpper();
        Integer tickLower = investTxModel.getTickLower();
        Integer approveType = investTxModel.getApproveType();
        JsonElement toJsonElement = r0.parseToJsonElement(c33489mxS.KWHzl(InvestCallDataExtra.CREATOR.serializer(), new InvestCallDataExtra(numValueOf, analysisPlatformId, claimIndex, claimOverdue, arrayList, listEZpvd, rewardingAddress, tokenId, callDataExtJson, tickUpper, tickLower, KWHzl(approveType != null ? approveType.intValue() : -1) ? Boolean.TRUE : null, investTxModel.getPubkey(), investTxModel.getRedeemPercent(), investTxModel.getProviderPubkey(), investTxModel.getSubscribeCallDataExtInfo(), Boolean.valueOf(investTxModel.getOpenZap()), Boolean.valueOf(investTxModel.isSingle()), (String) null, 262144, (DefaultConstructorMarker) null)));
        JsonObject jsonObject2 = toJsonElement instanceof JsonObject ? (JsonObject) toJsonElement : null;
        if (jsonObject2 == null || (linkedHashMap = C56424yEw.isConnected(jsonObject2)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        String callDataExtraFromBE = investTxModel.getCallDataExtraFromBE();
        if (callDataExtraFromBE != null) {
            JsonElement toJsonElement2 = Json.Default.parseToJsonElement(callDataExtraFromBE);
            jsonObject = toJsonElement2 instanceof JsonObject ? (JsonObject) toJsonElement2 : null;
        }
        if (jsonObject != null) {
            final Function2 function2 = new Function2() { // from class: o.iAG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return InvestTradeManager.copydefault(linkedHashMap, (java.lang.String) obj, (JsonElement) obj2);
                }
            };
            jsonObject.forEach(new BiConsumer() { // from class: o.iAH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.BiConsumer
                public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                    InvestTradeManager.copydefault(function2, obj, obj2);
                }
            });
        }
        return C33489mxS.KWHzl.KWHzl(new LinkedHashMapSerializer(StringSerializer.INSTANCE, JsonElement.Companion.serializer()), linkedHashMap);
    }

    public static final void copydefault(Function2 function2, Object obj, Object obj2) {
        function2.invoke(obj, obj2);
    }

    public static final Unit copydefault(Map map, String str, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (map.get(str) == null) {
            map.put(str, jsonElement);
        }
        return Unit.INSTANCE;
    }

    public final String AEQbTJ(Throwable th) {
        if (th instanceof ResponseFailedException) {
            String errorMsg = ((ResponseFailedException) th).getErrorMsg();
            return errorMsg.length() == 0 ? C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV) : errorMsg;
        }
        if (th instanceof OKServerException) {
            String message = th.getMessage();
            if (!(true ^ (message == null || message.length() == 0))) {
                message = null;
            }
            return message == null ? C43422row.OLrzqt() : message;
        }
        return C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY);
    }

    public final boolean AEQbTJ(int i) {
        return !yEE.AhwBna(InvestAction.Subscription, InvestAction.Redeem, InvestAction.Claim, InvestAction.Bonus, InvestAction.Deploy, InvestAction.Mint, InvestAction.Repay, InvestAction.MerklBonus, InvestAction.Borrow).contains(InvestAction.Companion.copydefault(i));
    }

    public final boolean EZpvd(int i) {
        InvestAction.Companion companion = InvestAction.Companion;
        return companion.copydefault(i) == InvestAction.StartFarming || companion.copydefault(i) == InvestAction.EndFarming;
    }

    public final boolean copydefault(int i) {
        InvestAction.Companion companion = InvestAction.Companion;
        return companion.copydefault(i) == InvestAction.Claim || companion.copydefault(i) == InvestAction.Bonus || companion.copydefault(i) == InvestAction.Repay || companion.copydefault(i) == InvestAction.MerklBonus;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public Integer AEQbTJ;
        public Integer KWHzl;
        public String OLrzqt;

        public final void copydefault(Bundle bundle, @NotNull yHO<? super Integer, ? super Bundle, ? super TransactionResultExtraData, Unit> yho) {
            Intrinsics.checkNotNullParameter(yho, "");
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            InvestTradeManager.copydefault = false;
            if (bundle == null || bundle.getInt("result") != -1) {
                yho.invoke(4, bundle, new TransactionResultExtraData(this.KWHzl, this.OLrzqt, this.AEQbTJ));
            } else {
                yho.invoke(3, bundle, new TransactionResultExtraData(this.KWHzl, this.OLrzqt, this.AEQbTJ));
            }
        }

        public final AbstractC58185ywX<ResponseData<String>> KWHzl(@NotNull final NewCallbackBean newCallbackBean, @NotNull InvestTxModel investTxModel) {
            Intrinsics.checkNotNullParameter(newCallbackBean, "");
            Intrinsics.checkNotNullParameter(investTxModel, "");
            final com.google.gson.JsonObject asJsonObject = newCallbackBean.getBody().getAsJsonObject("walletTxData");
            asJsonObject.addProperty("accountId", investTxModel.getWalletId());
            asJsonObject.addProperty("totalValue", investTxModel.getTotalValue());
            JsonPrimitive asJsonPrimitive = newCallbackBean.getBody().getAsJsonPrimitive("uopHash");
            if (asJsonPrimitive != null) {
                asJsonObject.addProperty("uopHash", asJsonPrimitive.getAsString());
                asJsonObject.remove("txHash");
            }
            Integer numValueOf = Integer.valueOf(investTxModel.getOrderType());
            this.AEQbTJ = Integer.valueOf(numValueOf.intValue());
            Unit unit = Unit.INSTANCE;
            asJsonObject.addProperty("orderType", numValueOf);
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            String contextJson = investTxModel.getContextJson();
            InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
            asJsonObject.addProperty("contextJson", c33489mxS.KWHzl(companion.serializer(), InvestTransactionParam.copy$default((InvestTransactionParam) c33489mxS.OLrzqt((DeserializationStrategy) companion.serializer(), contextJson), null, false, false, 0L, null, null, null, null, null, Integer.valueOf(C33129mqd.AhwBna(newCallbackBean.getEstTime())), null, null, null, null, null, null, 65023, null)));
            Integer numValueOf2 = Integer.valueOf(C33129mqd.AhwBna(newCallbackBean.getEstTime()));
            this.KWHzl = Integer.valueOf(numValueOf2.intValue());
            asJsonObject.addProperty(WiseOpenHianalyticsData.UNION_COSTTIME, numValueOf2);
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            if (!investTradeManager.AEQbTJ(investTxModel.getOrderType())) {
                asJsonObject.add("tokenInfo", new Gson().toJsonTree(investTradeManager.OLrzqt(investTradeManager.copydefault(investTxModel.getOrderType()) ? investTxModel.getExpectOutputList() : investTxModel.getUserInputList())));
                if (!investTradeManager.copydefault(investTxModel.getOrderType()) && (!investTxModel.getExpectTokenList().isEmpty())) {
                    asJsonObject.add("expectTokenInfo", new Gson().toJsonTree(investTradeManager.OLrzqt(investTxModel.getExpectTokenList())));
                }
            }
            if (investTxModel.isAvailableClaim()) {
                asJsonObject.addProperty("chainId", Long.valueOf(investTxModel.getChainId()));
                asJsonObject.addProperty("analysisPlatformId", investTxModel.getAnalysisPlatformId());
            } else {
                asJsonObject.addProperty("investmentId", (Number) CollectionsKt___CollectionsKt.firstOrNull(investTxModel.getInvestmentId()));
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            AbstractC58185ywX<ResponseData<String>> abstractC58185ywXCopydefault = C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.iAK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    InvestTradeManager.StateListAnimator.copydefault(objectRef, newCallbackBean, asJsonObject, this, interfaceC58184ywW);
                }
            }).copydefault(new InterfaceC58222yxH() { // from class: o.iAO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    InvestTradeManager.StateListAnimator.KWHzl(objectRef);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
            return abstractC58185ywXCopydefault;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [T, o.yxC] */
        public static final void copydefault(Ref.ObjectRef objectRef, NewCallbackBean newCallbackBean, com.google.gson.JsonObject jsonObject, final StateListAnimator stateListAnimator, final InterfaceC58184ywW interfaceC58184ywW) {
            Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
            AbstractC58185ywX<ResponseData<InvestTxData>> abstractC58185ywXCopydefault = InvestTradeManager.EZpvd.copydefault(newCallbackBean.getHeaderMap(), C27539jxB.OLrzqt.copydefault(jsonObject));
            final Function1 function1 = new Function1() { // from class: o.iAF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestTradeManager.StateListAnimator.EZpvd(interfaceC58184ywW, stateListAnimator, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM<? super ResponseData<InvestTxData>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iAI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    InvestTradeManager.StateListAnimator.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.iAN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestTradeManager.StateListAnimator.AEQbTJ(interfaceC58184ywW, (java.lang.Throwable) obj);
                }
            };
            objectRef.element = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iAM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    InvestTradeManager.StateListAnimator.AEQbTJ(function12, obj);
                }
            });
        }

        public static final void OLrzqt(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit EZpvd(InterfaceC58184ywW interfaceC58184ywW, StateListAnimator stateListAnimator, ResponseData responseData) {
            InvestTxData investTxData = (InvestTxData) responseData.getData();
            if (investTxData != null) {
                stateListAnimator.OLrzqt = investTxData.getOrderId();
            }
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                ResponseData responseData2 = new ResponseData(0, null, null, null, null, null, 63, null);
                int code = responseData.getCode();
                InvestTxData investTxData2 = (InvestTxData) responseData.getData();
                interfaceC58184ywW.onNext(ResponseData.copy$default(responseData2, code, null, null, null, investTxData2 != null ? investTxData2.getTxId() : null, null, 46, null));
            } else {
                String errorMsg = responseData.getErrorMsg();
                if (errorMsg.length() == 0) {
                    errorMsg = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV);
                }
                interfaceC58184ywW.onError(new Exception(errorMsg));
            }
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit AEQbTJ(InterfaceC58184ywW interfaceC58184ywW, Throwable th) {
            InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
            Intrinsics.copydefault(th);
            interfaceC58184ywW.onError(new Exception(investTradeManager.AEQbTJ(th)));
            return Unit.INSTANCE;
        }

        public static final void KWHzl(Ref.ObjectRef objectRef) {
            InterfaceC58217yxC interfaceC58217yxC = (InterfaceC58217yxC) objectRef.element;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }

        public final AbstractC58185ywX<ResponseData<String>> AEQbTJ(@NotNull NewCallbackBean newCallbackBean, @NotNull Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1) {
            Intrinsics.checkNotNullParameter(newCallbackBean, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return function1.invoke(newCallbackBean);
        }
    }

    public final List<InvestSimpleToken> OLrzqt(@NotNull List<InvestTokenWithAmount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (InvestTokenWithAmount investTokenWithAmount : list) {
            long chainId = investTokenWithAmount.getChainId();
            arrayList.add(new InvestSimpleToken(Long.valueOf(chainId), C27492jwH.OLrzqt.AYXKKw(investTokenWithAmount.getCoinAmount()), investTokenWithAmount.getCurrencyAmount(), investTokenWithAmount.getTokenAddress(), investTokenWithAmount.getExpectTokenAddress(), investTokenWithAmount.getTokenId()));
        }
        return arrayList;
    }
}
