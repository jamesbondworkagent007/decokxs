package o;

import com.okinc.market.quotation.domain.dex.mobile40.Mobile40GetAndSubscribeDexVosUseCase$onExecute$2;
import com.okinc.market.quotation.domain.dex.mobile40.Mobile40GetAndSubscribeDexVosUseCase$onExecute$3;
import com.okinc.market.quotation.domain.dex.mobile40.Mobile40GetAndSubscribeDexVosUseCase$onExecute$4;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC49404uns;
import org.jetbrains.annotations.NotNull;
import uniffi.retail_trading.DexPeriod;
import uniffi.retail_trading.DexSortBy;

/* JADX INFO: renamed from: o.qrI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41460qrI implements InterfaceC49404uns<C41495qrr, Flow<? extends java.util.List<? extends InterfaceC41655qus>>> {
    public static final int AEQbTJ = 8;
    public final CoroutineDispatcher copydefault;

    /* JADX INFO: renamed from: o.qrI$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DexPeriodEnum.values().length];
            try {
                iArr[DexPeriodEnum.FIVE_MINUTES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DexPeriodEnum.ONE_HOUR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DexPeriodEnum.FOUR_HOURS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DexPeriodEnum.ONE_DAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[DexPeriodEnum.HOUR_24.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[DexSortByEnum.values().length];
            try {
                iArr2[DexSortByEnum.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[DexSortByEnum.PRICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[DexSortByEnum.CHANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[DexSortByEnum.TURNOVER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[DexSortByEnum.MARKET_CAP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            OLrzqt = iArr2;
            int[] iArr3 = new int[SortOrder.values().length];
            try {
                iArr3[SortOrder.ASC.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[SortOrder.DESC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[SortOrder.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            copydefault = iArr3;
        }
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49404uns.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49404uns.Activity.copydefault(this);
    }

    @Override // o.InterfaceC49404uns, o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41495qrr) obj, (Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>>) continuation);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49404uns.Activity.KWHzl(this, input, function2, continuation);
    }

    @yCM
    public C41460qrI(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    public java.lang.Object OLrzqt(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) {
        pXV.KWHzl();
        return InterfaceC49404uns.Activity.EZpvd(this, c41495qrr, continuation);
    }

    public java.lang.Object KWHzl(@NotNull C41495qrr c41495qrr, @NotNull Continuation<? super Flow<? extends java.util.List<? extends InterfaceC41655qus>>> continuation) {
        DexChainGroupVo dexChainGroupVoKWHzl = c41495qrr.KWHzl();
        DexPeriodEnum dexPeriodEnumEZpvd = c41495qrr.EZpvd();
        kotlin.Pair<DexSortByEnum, SortOrder> pairCopydefault = c41495qrr.copydefault();
        InterfaceC41652qup interfaceC41652qupOLrzqt = c41495qrr.OLrzqt();
        return FlowKt.flowOn(FlowKt.onCompletion(FlowKt.onStart(FlowKt.callbackFlow(new Mobile40GetAndSubscribeDexVosUseCase$onExecute$2(OLrzqt(dexChainGroupVoKWHzl), this, dexPeriodEnumEZpvd, pairCopydefault, c41495qrr.AEQbTJ(), interfaceC41652qupOLrzqt, null)), new Mobile40GetAndSubscribeDexVosUseCase$onExecute$3(null)), new Mobile40GetAndSubscribeDexVosUseCase$onExecute$4(null)), this.copydefault);
    }

    public final BjD OLrzqt(DexChainGroupVo dexChainGroupVo) {
        return new BjD(null, dexChainGroupVo.EZpvd(), dexChainGroupVo.OLrzqt(), dexChainGroupVo.copydefault(), dexChainGroupVo.KWHzl());
    }

    public final DexPeriod OLrzqt(DexPeriodEnum dexPeriodEnum) {
        int i = StateListAnimator.AEQbTJ[dexPeriodEnum.ordinal()];
        if (i == 1) {
            return DexPeriod.FIVE_MINUTES;
        }
        if (i == 2) {
            return DexPeriod.ONE_HOUR;
        }
        if (i == 3) {
            return DexPeriod.FOUR_HOURS;
        }
        if (i == 4) {
            return DexPeriod.ONE_DAY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new NotImplementedError(null, 1, null);
    }

    public final DexSortBy KWHzl(DexSortByEnum dexSortByEnum) {
        int i = StateListAnimator.OLrzqt[dexSortByEnum.ordinal()];
        if (i == 1) {
            return DexSortBy.NONE;
        }
        if (i == 2) {
            return DexSortBy.PRICE;
        }
        if (i == 3) {
            return DexSortBy.CHANGE;
        }
        if (i == 4) {
            return DexSortBy.TURNOVER;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return DexSortBy.MARKET_CAP;
    }

    public final uniffi.retail_trading.SortOrder EZpvd(SortOrder sortOrder) {
        int i = StateListAnimator.copydefault[sortOrder.ordinal()];
        if (i == 1) {
            return uniffi.retail_trading.SortOrder.ASC;
        }
        if (i == 2) {
            return uniffi.retail_trading.SortOrder.DESC;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return uniffi.retail_trading.SortOrder.NONE;
    }

    public final DexInstrument copydefault(BjJ bjJ) {
        java.lang.String strKWHzl = bjJ.KWHzl();
        java.lang.String strOLrzqt = bjJ.OLrzqt();
        java.lang.String strAEQbTJ = bjJ.AEQbTJ();
        java.lang.String strAhwBna = bjJ.AhwBna();
        java.lang.String strAYXKKw = bjJ.AYXKKw();
        java.lang.String strValueOf = bjJ.valueOf();
        java.lang.String strDjBIcL = bjJ.djBIcL();
        java.lang.String strCopydefault = bjJ.copydefault();
        boolean zGEmmrt = bjJ.gEmmrt();
        return new DexInstrument(strKWHzl, strOLrzqt, strAEQbTJ, strAhwBna, strAYXKKw, strValueOf, strDjBIcL, strCopydefault, java.lang.Boolean.valueOf(zGEmmrt), bjJ.EZpvd(), (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, 15360, (DefaultConstructorMarker) null);
    }

    public final java.util.List<InterfaceC41655qus> OLrzqt(java.util.List<BkU> list, InterfaceC41652qup interfaceC41652qup) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BkU bkU : list) {
            DexInstrument dexInstrumentCopydefault = copydefault(bkU.KWHzl());
            java.lang.Double dAhwBna = bkU.AhwBna();
            java.lang.Double dOLrzqt = bkU.OLrzqt();
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(bkU.fetchVPNInfo());
            BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(bkU.AYXKKw());
            BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(bkU.gEmmrt());
            boolean zIsConnected = bkU.isConnected();
            boolean zAEQbTJ = bkU.AEQbTJ();
            arrayList.add(interfaceC41652qup.OLrzqt(dexInstrumentCopydefault, dOLrzqt, dAhwBna, bigDecimalEZpvd, bigDecimalEZpvd2, bigDecimalEZpvd3, zIsConnected, java.lang.Boolean.valueOf(zAEQbTJ), bkU.copydefault(), bkU.EZpvd()));
        }
        return arrayList;
    }
}
