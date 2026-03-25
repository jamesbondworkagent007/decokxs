package com.okinc.tradingbot.impl.order.strategy.grid.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C38307pTy;
import o.C48033uCm;
import o.C50539vSd;
import o.C50546vSk;
import o.C53422wlG;
import o.C54797xVr;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.C56547yJk;
import o.InterfaceC56538yJb;
import o.pTB;
import o.pUU;
import o.vNH;
import o.xLX;
import o.xMS;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartEarnParamsCheckUseCase extends vNH<ActionBar, Result> {
    public final CoroutineDispatcher AEQbTJ;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EarnType.values().length];
            try {
                iArr[EarnType.Ratio.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EarnType.Absolute.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SmartEarnParamsCheckUseCase(@NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = coroutineDispatcher;
    }

    private final xMS EZpvd() {
        BizInstrument bizInstrumentEZpvd = xLX.OLrzqt(BizInfoConfig.DefaultBizConfig.copydefault).EZpvd();
        if (bizInstrumentEZpvd != null) {
            return C54797xVr.copydefault.AEQbTJ(bizInstrumentEZpvd.getInstId(), bizInstrumentEZpvd.getInstType());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.vNH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public Object OLrzqt(@NotNull ActionBar actionBar, @NotNull Continuation<? super Result> continuation) {
        return preCheck$default(this, actionBar, null, null, 6, null);
    }

    public static /* synthetic */ Result preCheck$default(SmartEarnParamsCheckUseCase smartEarnParamsCheckUseCase, ActionBar actionBar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return smartEarnParamsCheckUseCase.EZpvd(actionBar, str, str2);
    }

    public final Result EZpvd(@NotNull ActionBar actionBar, String str, String str2) {
        xMS xmsEZpvd;
        TrailingConfig trailingConfigEZpvd;
        InterfaceC56538yJb<String> interfaceC56538yJbEZpvd;
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (str != null && str2 != null) {
            xmsEZpvd = C54797xVr.copydefault.AEQbTJ(str, str2);
        } else {
            xmsEZpvd = EZpvd();
        }
        SmartEarnConfig smartEarnConfigAEQbTJ = actionBar.AEQbTJ();
        int iAhwBna = C33129mqd.AhwBna(actionBar.copydefault());
        if (!smartEarnConfigAEQbTJ.isEarnSupported()) {
            return Result.UserNotQualifiedForEarn.copydefault;
        }
        String str3 = (String) actionBar.OLrzqt().getStart();
        String str4 = (String) actionBar.OLrzqt().getEndInclusive();
        String strMulS$default = C33129mqd.mulS$default(str3, smartEarnConfigAEQbTJ.getDistanceLimit(), Integer.valueOf(C33129mqd.AhwBna(xmsEZpvd != null ? xmsEZpvd.AEQbTJ() : null)), null, RoundingMode.UP, 4, null);
        String strDivS$default = C33129mqd.divS$default(str4, smartEarnConfigAEQbTJ.getDistanceLimit(), Integer.valueOf(C33129mqd.AhwBna(xmsEZpvd != null ? xmsEZpvd.AEQbTJ() : null)), null, RoundingMode.DOWN, 4, null);
        pUU.EZpvd("SmartEarn", "requiredLowerLimit: " + strDivS$default + ", requiredUpperLimit: " + strMulS$default + ", quotePrecision: " + (xmsEZpvd != null ? xmsEZpvd.AEQbTJ() : null));
        if (C33129mqd.gEmmrt(str4, strMulS$default)) {
            return new Result.GridRangeIsNotWideEnough(C53422wlG.copydefault(strDivS$default, xmsEZpvd), C53422wlG.copydefault(strMulS$default, xmsEZpvd));
        }
        if (iAhwBna < C33129mqd.AhwBna(smartEarnConfigAEQbTJ.getMinGridNum())) {
            return new Result.GridCountIsNotValid(C33129mqd.AhwBna(smartEarnConfigAEQbTJ.getMinGridNum()));
        }
        TrailingConfig trailingConfigDjBIcL = actionBar.djBIcL();
        if ((trailingConfigDjBIcL != null && trailingConfigDjBIcL.getEnabled()) || ((trailingConfigEZpvd = actionBar.EZpvd()) != null && trailingConfigEZpvd.getEnabled())) {
            return Result.TrailingUpOrDownIsSet.EZpvd;
        }
        if (actionBar.KWHzl() != null && actionBar.AhwBna() != null) {
            InterfaceC56538yJb<String> interfaceC56538yJbCopydefault = C50539vSd.copydefault(actionBar.KWHzl(), smartEarnConfigAEQbTJ, actionBar.OLrzqt());
            EarnType earnTypeKWHzl = actionBar.KWHzl();
            EarnType earnTypeKWHzl2 = actionBar.KWHzl();
            int i = earnTypeKWHzl2 == null ? -1 : Activity.KWHzl[earnTypeKWHzl2.ordinal()];
            if (i == 1) {
                interfaceC56538yJbEZpvd = C56547yJk.EZpvd(C33129mqd.mulS$default(actionBar.AhwBna().getStart(), Double.valueOf(100.0d), null, null, null, 14, null), C33129mqd.mulS$default(actionBar.AhwBna().getEndInclusive(), Double.valueOf(100.0d), null, null, null, 14, null));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC56538yJbEZpvd = actionBar.AhwBna();
            }
            Pair<C50546vSk, C50546vSk> pairKWHzl = C50539vSd.KWHzl(earnTypeKWHzl, interfaceC56538yJbEZpvd, interfaceC56538yJbCopydefault);
            C50546vSk c50546vSkComponent1 = pairKWHzl.component1();
            C50546vSk c50546vSkComponent2 = pairKWHzl.component2();
            if ((c50546vSkComponent1 != null && !c50546vSkComponent1.copydefault()) || (c50546vSkComponent2 != null && !c50546vSkComponent2.copydefault())) {
                return new Result.GapMustBeMoreThan(C53422wlG.copydefault((String) interfaceC56538yJbCopydefault.getStart(), xmsEZpvd));
            }
            if (c50546vSkComponent1 != null && !c50546vSkComponent1.EZpvd() && c50546vSkComponent2 != null && !c50546vSkComponent2.EZpvd()) {
                return new Result.GapMustBeLessThan(C53422wlG.copydefault((String) interfaceC56538yJbCopydefault.getEndInclusive(), xmsEZpvd));
            }
        }
        return Result.Success.EZpvd;
    }

    public static final class ActionBar {
        public static final int KWHzl;
        public final InterfaceC56538yJb<String> AEQbTJ;
        public final TrailingConfig AYXKKw;
        public final InterfaceC56538yJb<String> AhwBna;
        public final SmartEarnConfig EZpvd;
        public final String OLrzqt;
        public final EarnType copydefault;
        public final TrailingConfig gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i = TrailingConfig.$stable;
            KWHzl = i | i | SmartEarnConfig.$stable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, SmartEarnConfig smartEarnConfig, String str, InterfaceC56538yJb interfaceC56538yJb, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, EarnType earnType, InterfaceC56538yJb interfaceC56538yJb2, int i, Object obj) {
            if ((i & 1) != 0) {
                smartEarnConfig = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str = actionBar.OLrzqt;
            }
            String str2 = str;
            if ((i & 4) != 0) {
                interfaceC56538yJb = actionBar.AEQbTJ;
            }
            InterfaceC56538yJb interfaceC56538yJb3 = interfaceC56538yJb;
            if ((i & 8) != 0) {
                trailingConfig = actionBar.AYXKKw;
            }
            TrailingConfig trailingConfig3 = trailingConfig;
            if ((i & 16) != 0) {
                trailingConfig2 = actionBar.gEmmrt;
            }
            TrailingConfig trailingConfig4 = trailingConfig2;
            if ((i & 32) != 0) {
                earnType = actionBar.copydefault;
            }
            EarnType earnType2 = earnType;
            if ((i & 64) != 0) {
                interfaceC56538yJb2 = actionBar.AhwBna;
            }
            return actionBar.copydefault(smartEarnConfig, str2, interfaceC56538yJb3, trailingConfig3, trailingConfig4, earnType2, interfaceC56538yJb2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartEarnConfig AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<String> AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TrailingConfig EZpvd() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EarnType KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<String> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull SmartEarnConfig smartEarnConfig, @NotNull String str, @NotNull InterfaceC56538yJb<String> interfaceC56538yJb, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, EarnType earnType, InterfaceC56538yJb<String> interfaceC56538yJb2) {
            Intrinsics.checkNotNullParameter(smartEarnConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            return new ActionBar(smartEarnConfig, str, interfaceC56538yJb, trailingConfig, trailingConfig2, earnType, interfaceC56538yJb2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TrailingConfig djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, actionBar.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, actionBar.gEmmrt) && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.AhwBna, actionBar.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            TrailingConfig trailingConfig = this.AYXKKw;
            int iHashCode4 = trailingConfig == null ? 0 : trailingConfig.hashCode();
            TrailingConfig trailingConfig2 = this.gEmmrt;
            int iHashCode5 = trailingConfig2 == null ? 0 : trailingConfig2.hashCode();
            EarnType earnType = this.copydefault;
            int iHashCode6 = earnType == null ? 0 : earnType.hashCode();
            InterfaceC56538yJb<String> interfaceC56538yJb = this.AhwBna;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (interfaceC56538yJb != null ? interfaceC56538yJb.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(earnConfig=" + this.EZpvd + ", gridCount=" + this.OLrzqt + ", gridRange=" + this.AEQbTJ + ", trailingDownConfig=" + this.AYXKKw + ", trailingUpConfig=" + this.gEmmrt + ", earnType=" + this.copydefault + ", xy=" + this.AhwBna + ")";
        }

        public ActionBar(@NotNull SmartEarnConfig smartEarnConfig, @NotNull String str, @NotNull InterfaceC56538yJb<String> interfaceC56538yJb, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, EarnType earnType, InterfaceC56538yJb<String> interfaceC56538yJb2) {
            Intrinsics.checkNotNullParameter(smartEarnConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            this.EZpvd = smartEarnConfig;
            this.OLrzqt = str;
            this.AEQbTJ = interfaceC56538yJb;
            this.AYXKKw = trailingConfig;
            this.gEmmrt = trailingConfig2;
            this.copydefault = earnType;
            this.AhwBna = interfaceC56538yJb2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r11v0 com.okinc.unify_trade.biz.bot.SmartEarnConfig)
  (r12v0 java.lang.String)
  (r13v0 o.yJb)
  (r14v0 com.okinc.unify_trade.biz.TrailingConfig)
  (r15v0 com.okinc.unify_trade.biz.TrailingConfig)
  (wrap:com.okinc.unify_trade.biz.bot.EarnType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.bot.EarnType) : (r16v0 com.okinc.unify_trade.biz.bot.EarnType))
  (wrap:o.yJb:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null o.yJb) : (r17v0 o.yJb))
 A[MD:(com.okinc.unify_trade.biz.bot.SmartEarnConfig, java.lang.String, o.yJb<java.lang.String>, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.bot.EarnType, o.yJb<java.lang.String>):void (m)] (LINE:134) call: com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.ActionBar.<init>(com.okinc.unify_trade.biz.bot.SmartEarnConfig, java.lang.String, o.yJb, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.TrailingConfig, com.okinc.unify_trade.biz.bot.EarnType, o.yJb):void type: THIS */
        public /* synthetic */ ActionBar(SmartEarnConfig smartEarnConfig, String str, InterfaceC56538yJb interfaceC56538yJb, TrailingConfig trailingConfig, TrailingConfig trailingConfig2, EarnType earnType, InterfaceC56538yJb interfaceC56538yJb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(smartEarnConfig, str, interfaceC56538yJb, trailingConfig, trailingConfig2, (i & 32) != 0 ? null : earnType, (i & 64) != 0 ? null : interfaceC56538yJb2);
        }
    }

    public interface Result extends Parcelable {

        public interface InvalidRange extends Result {
        }

        String KWHzl();

        public static final class Success implements Result {
            public static final Success EZpvd = new Success();
            public static final Parcelable.Creator<Success> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Success.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                return null;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Success() {
            }
        }

        public static final class UserNotQualifiedForEarn implements Result {
            public static final UserNotQualifiedForEarn copydefault = new UserNotQualifiedForEarn();
            public static final Parcelable.Creator<UserNotQualifiedForEarn> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<UserNotQualifiedForEarn> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UserNotQualifiedForEarn createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return UserNotQualifiedForEarn.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UserNotQualifiedForEarn[] newArray(int i) {
                    return new UserNotQualifiedForEarn[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private UserNotQualifiedForEarn() {
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                return C33070mpX.AYXKKw(C48033uCm.Fragment.DAgZj);
            }
        }

        public static final class GridCountIsNotValid implements Result {
            public static final Parcelable.Creator<GridCountIsNotValid> CREATOR = new Creator();
            public final int KWHzl;

            public static final class Creator implements Parcelable.Creator<GridCountIsNotValid> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GridCountIsNotValid createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new GridCountIsNotValid(parcel.readInt());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GridCountIsNotValid[] newArray(int i) {
                    return new GridCountIsNotValid[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ GridCountIsNotValid copy$default(GridCountIsNotValid gridCountIsNotValid, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = gridCountIsNotValid.KWHzl;
                }
                return gridCountIsNotValid.KWHzl(i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GridCountIsNotValid KWHzl(int i) {
                return new GridCountIsNotValid(i);
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
                return (obj instanceof GridCountIsNotValid) && this.KWHzl == ((GridCountIsNotValid) obj).KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return Integer.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GridCountIsNotValid(minGridNum=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(this.KWHzl);
            }

            public GridCountIsNotValid(int i) {
                this.KWHzl = i;
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                int i = C48033uCm.Fragment.hfeTOA;
                int i2 = this.KWHzl;
                return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("minGridNum", pTB.formatICUNumber$default(Integer.valueOf(i2), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null))));
            }
        }

        public static final class GridRangeIsNotWideEnough implements Result {
            public static final Parcelable.Creator<GridRangeIsNotWideEnough> CREATOR = new Creator();
            public final String EZpvd;
            public final String OLrzqt;

            public static final class Creator implements Parcelable.Creator<GridRangeIsNotWideEnough> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GridRangeIsNotWideEnough createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new GridRangeIsNotWideEnough(parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GridRangeIsNotWideEnough[] newArray(int i) {
                    return new GridRangeIsNotWideEnough[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ GridRangeIsNotWideEnough copy$default(GridRangeIsNotWideEnough gridRangeIsNotWideEnough, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = gridRangeIsNotWideEnough.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = gridRangeIsNotWideEnough.OLrzqt;
                }
                return gridRangeIsNotWideEnough.copydefault(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GridRangeIsNotWideEnough copydefault(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new GridRangeIsNotWideEnough(str, str2);
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
                if (!(obj instanceof GridRangeIsNotWideEnough)) {
                    return false;
                }
                GridRangeIsNotWideEnough gridRangeIsNotWideEnough = (GridRangeIsNotWideEnough) obj;
                return Intrinsics.EZpvd((Object) this.EZpvd, (Object) gridRangeIsNotWideEnough.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) gridRangeIsNotWideEnough.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GridRangeIsNotWideEnough(lowerLimit=" + this.EZpvd + ", upperLimit=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
                parcel.writeString(this.OLrzqt);
            }

            public GridRangeIsNotWideEnough(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.EZpvd = str;
                this.OLrzqt = str2;
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                return C33069mpW.copydefault(C48033uCm.Fragment.isElapsedRealtimeNanosAvailable, C56424yEw.gEmmrt(C56390yDp.OLrzqt("lowerLimit", this.EZpvd), C56390yDp.OLrzqt("upperLimit", this.OLrzqt)));
            }
        }

        public static final class TrailingUpOrDownIsSet implements Result {
            public static final TrailingUpOrDownIsSet EZpvd = new TrailingUpOrDownIsSet();
            public static final Parcelable.Creator<TrailingUpOrDownIsSet> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<TrailingUpOrDownIsSet> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TrailingUpOrDownIsSet createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return TrailingUpOrDownIsSet.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TrailingUpOrDownIsSet[] newArray(int i) {
                    return new TrailingUpOrDownIsSet[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private TrailingUpOrDownIsSet() {
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                return C33070mpX.AYXKKw(C48033uCm.Fragment.fzHEvu);
            }
        }

        public static final class GapMustBeMoreThan implements InvalidRange {
            public static final Parcelable.Creator<GapMustBeMoreThan> CREATOR = new Creator();
            public final String OLrzqt;

            public static final class Creator implements Parcelable.Creator<GapMustBeMoreThan> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GapMustBeMoreThan createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new GapMustBeMoreThan(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GapMustBeMoreThan[] newArray(int i) {
                    return new GapMustBeMoreThan[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ GapMustBeMoreThan copy$default(GapMustBeMoreThan gapMustBeMoreThan, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = gapMustBeMoreThan.OLrzqt;
                }
                return gapMustBeMoreThan.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GapMustBeMoreThan copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new GapMustBeMoreThan(str);
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
                return (obj instanceof GapMustBeMoreThan) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((GapMustBeMoreThan) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GapMustBeMoreThan(requiredLimit=" + this.OLrzqt + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.OLrzqt);
            }

            public GapMustBeMoreThan(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                return C33069mpW.copydefault(C48033uCm.Fragment.gLWkOL, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", OLrzqt())));
            }
        }

        public static final class GapMustBeLessThan implements InvalidRange {
            public static final Parcelable.Creator<GapMustBeLessThan> CREATOR = new Creator();
            public final String EZpvd;

            public static final class Creator implements Parcelable.Creator<GapMustBeLessThan> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GapMustBeLessThan createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new GapMustBeLessThan(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GapMustBeLessThan[] newArray(int i) {
                    return new GapMustBeLessThan[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ GapMustBeLessThan copy$default(GapMustBeLessThan gapMustBeLessThan, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = gapMustBeLessThan.EZpvd;
                }
                return gapMustBeLessThan.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GapMustBeLessThan EZpvd(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new GapMustBeLessThan(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String copydefault() {
                return this.EZpvd;
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
                return (obj instanceof GapMustBeLessThan) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((GapMustBeLessThan) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "GapMustBeLessThan(requiredLimit=" + this.EZpvd + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd);
            }

            public GapMustBeLessThan(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }

            @Override // com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase.Result
            public String KWHzl() {
                return C33069mpW.copydefault(C48033uCm.Fragment.iRgjgR, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", copydefault())));
            }
        }
    }
}
