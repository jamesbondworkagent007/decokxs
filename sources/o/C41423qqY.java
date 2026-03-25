package o;

import com.okinc.market.quotation.data.util.TwoKeyMap;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.ticker.model.DexTickerPo;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41655qus;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41423qqY implements InterfaceC49405unt<Triple<? extends java.util.List<? extends InterfaceC41655qus>, ? extends TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>, ? extends DexPeriodEnum>, java.util.List<? extends InterfaceC41655qus>> {
    public final InterfaceC46557tYt AEQbTJ;

    /* JADX INFO: renamed from: o.qqY$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

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
                iArr[DexPeriodEnum.HOUR_24.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[DexPeriodEnum.ONE_DAY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C41423qqY(@NotNull InterfaceC46557tYt interfaceC46557tYt) {
        Intrinsics.checkNotNullParameter(interfaceC46557tYt, "");
        this.AEQbTJ = interfaceC46557tYt;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    public java.util.List<InterfaceC41655qus> copydefault(@NotNull Triple<? extends java.util.List<? extends InterfaceC41655qus>, TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>, ? extends DexPeriodEnum> triple) {
        return (java.util.List) InterfaceC49405unt.Activity.EZpvd(this, triple);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.util.List<InterfaceC41655qus> AEQbTJ(@NotNull Triple<? extends java.util.List<? extends InterfaceC41655qus>, TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>, ? extends DexPeriodEnum> triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        java.util.List<? extends InterfaceC41655qus> listComponent1 = triple.component1();
        final TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo> twoKeyMapComponent2 = triple.component2();
        final DexPeriodEnum dexPeriodEnumComponent3 = triple.component3();
        C41434qqj.KWHzl.AEQbTJ("ApplyDexTickerUseCase", "apply dex tickers, [dexVoList: " + listComponent1.size() + ", tickersMap: " + twoKeyMapComponent2.size() + ", period: " + dexPeriodEnumComponent3 + "]");
        return C41389qpr.EZpvd(listComponent1, new Function1() { // from class: o.qqV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41423qqY.AEQbTJ(this.copydefault, twoKeyMapComponent2, dexPeriodEnumComponent3, (InterfaceC41655qus) obj);
            }
        });
    }

    public static final InterfaceC41655qus AEQbTJ(C41423qqY c41423qqY, TwoKeyMap twoKeyMap, DexPeriodEnum dexPeriodEnum, InterfaceC41655qus interfaceC41655qus) {
        Intrinsics.checkNotNullParameter(interfaceC41655qus, "");
        return c41423qqY.KWHzl(interfaceC41655qus, (TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo>) twoKeyMap, dexPeriodEnum);
    }

    public final InterfaceC41655qus KWHzl(InterfaceC41655qus interfaceC41655qus, TwoKeyMap<java.lang.String, java.lang.String, DexTickerPo> twoKeyMap, DexPeriodEnum dexPeriodEnum) {
        java.lang.String change5M;
        java.lang.Double dKWHzl;
        java.lang.String volume5M;
        DexTickerPo value = twoKeyMap.getValue(interfaceC41655qus);
        if (value == null) {
            return interfaceC41655qus;
        }
        int[] iArr = Application.KWHzl;
        int i = iArr[dexPeriodEnum.ordinal()];
        if (i == 1) {
            change5M = value.getChange5M();
        } else if (i == 2) {
            change5M = value.getChange1H();
        } else if (i == 3) {
            change5M = value.getChange4H();
        } else if (i == 4) {
            change5M = value.getChange();
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            int iEZpvd = this.AEQbTJ.EZpvd();
            if (iEZpvd == 1) {
                change5M = value.getChangeUtc0();
            } else if (iEZpvd == 2) {
                change5M = value.getChangeUtc8();
            } else {
                change5M = value.getChange();
            }
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) change5M)) {
            change5M = null;
        }
        if (change5M != null) {
            dKWHzl = java.lang.Double.valueOf(C33129mqd.AEQbTJ(change5M));
        } else {
            dKWHzl = interfaceC41655qus.KWHzl();
        }
        double dAEQbTJ = C33129mqd.AEQbTJ(value.getPrice());
        int i2 = iArr[dexPeriodEnum.ordinal()];
        if (i2 == 1) {
            volume5M = value.getVolume5M();
        } else if (i2 == 2) {
            volume5M = value.getVolume1H();
        } else if (i2 == 3) {
            volume5M = value.getVolume4H();
        } else {
            volume5M = value.getVolume();
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(volume5M);
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(value.getMarketCap());
        return InterfaceC41655qus.ActionBar.onCopy$default(interfaceC41655qus, dKWHzl, java.lang.Double.valueOf(dAEQbTJ), bigDecimalEZpvd, bigDecimalEZpvd2, null, 16, null);
    }
}
