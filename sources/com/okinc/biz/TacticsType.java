package com.okinc.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56402yEa;
import o.C56403yEb;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class TacticsType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TacticsType[] $VALUES;
    public static final Parcelable.Creator<TacticsType> CREATOR;
    public static final TaskDescription Companion;
    private final String constant;
    private final int stgyName;
    private final boolean supportMP;
    public static final TacticsType TACTICS_GRDE = new TacticsType("TACTICS_GRDE", 0, "grid", C55688xof.Application.ComponentActivity22, true);
    public static final TacticsType TACTICS_CONTRACT_GRID = new TacticsType("TACTICS_CONTRACT_GRID", 1, "contract_grid", C55688xof.Application.onContextAvailable, true);
    public static final TacticsType TACTICS_SPOT_DCA = new TacticsType("TACTICS_SPOT_DCA", 2, "spot_dca", C55688xof.Application.MediaSessionCompatCallbackStubApi23, true);
    public static final TacticsType TACTICS_CONTRACT_DCA = new TacticsType("TACTICS_CONTRACT_DCA", 3, "contract_dca", C55688xof.Application.onSeekTo, true);
    public static final TacticsType TACTICS_INFINITE_GRID = new TacticsType("TACTICS_INFINITE_GRID", 4, "infinite_grid", C55688xof.Application.ComponentActivity3, false);
    public static final TacticsType TACTICS_SMART_ARBITRAGE = new TacticsType("TACTICS_SMART_ARBITRAGE", 5, "smart_arbitrage", C55688xof.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21, false);
    public static final TacticsType TACTICS_DCD_BOT = new TacticsType("TACTICS_DCD_BOT", 6, "dcd_bot", C55688xof.Application.setCurrentKeyboardTarget, false);
    public static final TacticsType TACTICS_SIGNAL_BOT = new TacticsType("TACTICS_SIGNAL_BOT", 7, "signal_bot", C55688xof.Application.fdazkH, false);
    public static final TacticsType TACTICS_RECURRING = new TacticsType("TACTICS_RECURRING", 8, "recurring", C55688xof.Application.setSessionImpl, true);
    public static final TacticsType TACTICS_SMART_PORTFOLIO = new TacticsType("TACTICS_SMART_PORTFOLIO", 9, "smart_portfolio", C55688xof.Application.FractionRes, true);
    public static final TacticsType TACTICS_ARBITRAGE = new TacticsType("TACTICS_ARBITRAGE", 10, "arbitrage", C55688xof.Application.ComponentActivityExternalSyntheticLambda0, false);
    public static final TacticsType TACTICS_SMART_ICEBERG = new TacticsType("TACTICS_SMART_ICEBERG", 11, "smart_iceberg", C55688xof.Application.ComponentActivity1, false);
    public static final TacticsType TACTICS_TIME_WEIGHTED = new TacticsType("TACTICS_TIME_WEIGHTED", 12, "twap", C55688xof.Application.ComponentActivityNonConfigurationInstances, false);
    public static final TacticsType TACTICS_LLM_BOT = new TacticsType("TACTICS_LLM_BOT", 13, "ai_bot", C55688xof.Application.OEsIKP, false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TacticsType[] $values() {
        return new TacticsType[]{TACTICS_GRDE, TACTICS_CONTRACT_GRID, TACTICS_SPOT_DCA, TACTICS_CONTRACT_DCA, TACTICS_INFINITE_GRID, TACTICS_SMART_ARBITRAGE, TACTICS_DCD_BOT, TACTICS_SIGNAL_BOT, TACTICS_RECURRING, TACTICS_SMART_PORTFOLIO, TACTICS_ARBITRAGE, TACTICS_SMART_ICEBERG, TACTICS_TIME_WEIGHTED, TACTICS_LLM_BOT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TacticsType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConstant() {
        return this.constant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStgyName() {
        return this.stgyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportMP() {
        return this.supportMP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TacticsType(String str, @StringRes int i, String str2, int i2, boolean z) {
        this.constant = str2;
        this.stgyName = i2;
        this.supportMP = z;
    }

    static {
        TacticsType[] tacticsTypeArr$values = $values();
        $VALUES = tacticsTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tacticsTypeArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<TacticsType>() { // from class: com.okinc.biz.TacticsType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TacticsType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TacticsType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TacticsType[] newArray(int i) {
                return new TacticsType[i];
            }
        };
    }

    public static final class TaskDescription {

        /* JADX INFO: renamed from: com.okinc.biz.TacticsType$TaskDescription$TaskDescription, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes14.dex */
        public final /* synthetic */ class C0244TaskDescription {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[TacticsType.values().length];
                try {
                    iArr[TacticsType.TACTICS_GRDE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TacticsType.TACTICS_CONTRACT_GRID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TacticsType.TACTICS_CONTRACT_DCA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TacticsType.TACTICS_SMART_ARBITRAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.TacticsType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TacticsType AEQbTJ(String str) {
            for (TacticsType tacticsType : TacticsType.values()) {
                if (Intrinsics.EZpvd((Object) tacticsType.getConstant(), (Object) str)) {
                    return tacticsType;
                }
            }
            return null;
        }

        public final List<String> KWHzl() {
            TacticsType[] tacticsTypeArrValues = TacticsType.values();
            ArrayList arrayList = new ArrayList();
            for (TacticsType tacticsType : tacticsTypeArrValues) {
                if (tacticsType.getSupportMP()) {
                    arrayList.add(tacticsType);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((TacticsType) it.next()).getConstant());
            }
            return arrayList2;
        }

        public final List<String> EZpvd() {
            TacticsType[] tacticsTypeArrValues = TacticsType.values();
            ArrayList arrayList = new ArrayList(tacticsTypeArrValues.length);
            for (TacticsType tacticsType : tacticsTypeArrValues) {
                arrayList.add(tacticsType.getConstant());
            }
            return arrayList;
        }

        public final List<String> OLrzqt() {
            TacticsType[] tacticsTypeArrValues = TacticsType.values();
            ArrayList arrayList = new ArrayList(tacticsTypeArrValues.length);
            for (TacticsType tacticsType : tacticsTypeArrValues) {
                arrayList.add(tacticsType.getConstant());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                String str = (String) obj;
                if (!Intrinsics.EZpvd((Object) str, (Object) "lvf_buy") && !Intrinsics.EZpvd((Object) str, (Object) "lvf_sell")) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }

        public final List<TacticsVoucherType> AEQbTJ(@NotNull TacticsType tacticsType) {
            Intrinsics.checkNotNullParameter(tacticsType, "");
            int i = C0244TaskDescription.EZpvd[tacticsType.ordinal()];
            if (i == 1 || i == 2) {
                return yDY.gEmmrt(TacticsVoucherType.STRATEGY_COMPENSATION, TacticsVoucherType.AIRDROP);
            }
            if (i == 3) {
                return C56402yEa.EZpvd(TacticsVoucherType.STRATEGY_COMPENSATION);
            }
            if (i == 4) {
                return C56402yEa.EZpvd(TacticsVoucherType.INTEREST_RATE);
            }
            return yDY.AhwBna();
        }
    }

    public static TacticsType valueOf(String str) {
        return (TacticsType) Enum.valueOf(TacticsType.class, str);
    }

    public static TacticsType[] values() {
        return (TacticsType[]) $VALUES.clone();
    }
}
