package com.okinc.dexkline.market.features.coindetail.ui.label;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.C57406yhn;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class LabelFilter implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LabelFilter[] $VALUES;
    public static final Parcelable.Creator<LabelFilter> CREATOR;
    public static final TaskDescription Companion;
    private static final Map<String, LabelFilter> map;
    private final String value;
    public static final LabelFilter ALL = new LabelFilter("ALL", 0, "");
    public static final LabelFilter FOLLOWING = new LabelFilter("FOLLOWING", 1, "following");
    public static final LabelFilter KOL = new LabelFilter("KOL", 2, "kol");
    public static final LabelFilter SUSPICIOUS = new LabelFilter("SUSPICIOUS", 3, "suspicious");
    public static final LabelFilter WHALES = new LabelFilter("WHALES", 4, "whales");
    public static final LabelFilter SNIPER = new LabelFilter("SNIPER", 5, "sniper");
    public static final LabelFilter SMARTMONEY = new LabelFilter("SMARTMONEY", 6, "smartMoney");
    public static final LabelFilter DEV = new LabelFilter("DEV", 7, "dev");
    public static final LabelFilter TOPHOLDER = new LabelFilter("TOPHOLDER", 8, "topHolder");
    public static final LabelFilter FRESH = new LabelFilter("FRESH", 9, "fresh");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LabelFilter[] $values() {
        return new LabelFilter[]{ALL, FOLLOWING, KOL, SUSPICIOUS, WHALES, SNIPER, SMARTMONEY, DEV, TOPHOLDER, FRESH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LabelFilter> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private LabelFilter(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        LabelFilter[] labelFilterArr$values = $values();
        $VALUES = labelFilterArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(labelFilterArr$values);
        Companion = new TaskDescription(null);
        CREATOR = new Parcelable.Creator<LabelFilter>() { // from class: com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LabelFilter createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return LabelFilter.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LabelFilter[] newArray(int i) {
                return new LabelFilter[i];
            }
        };
        LabelFilter[] labelFilterArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(labelFilterArrValues.length), 16));
        for (LabelFilter labelFilter : labelFilterArrValues) {
            linkedHashMap.put(labelFilter.value, labelFilter);
        }
        map = linkedHashMap;
    }

    public static final class TaskDescription {

        /* JADX INFO: loaded from: classes15.dex */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[LabelFilter.values().length];
                try {
                    iArr[LabelFilter.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LabelFilter.FOLLOWING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LabelFilter.KOL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LabelFilter.SUSPICIOUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LabelFilter.WHALES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[LabelFilter.SNIPER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[LabelFilter.SMARTMONEY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[LabelFilter.DEV.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[LabelFilter.TOPHOLDER.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[LabelFilter.FRESH.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final LabelFilter OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (LabelFilter) LabelFilter.map.get(str);
        }

        public final int AEQbTJ(@NotNull LabelFilter labelFilter) {
            Intrinsics.checkNotNullParameter(labelFilter, "");
            switch (Activity.OLrzqt[labelFilter.ordinal()]) {
                case 1:
                    return C35964oKf.Fragment.DcMfJKDSqxTE;
                case 2:
                    return C35964oKf.Fragment.RSDDiY;
                case 3:
                    return C35964oKf.Fragment.DcMfJKfwDlxl;
                case 4:
                    return C35964oKf.Fragment.invokespecialgBtXYZ;
                case 5:
                    return C35964oKf.Fragment.DlABUU;
                case 6:
                    return C35964oKf.Fragment.DcMfJKsfEqpH;
                case 7:
                    return C35964oKf.Fragment.DcMfJKgMxgjU;
                case 8:
                    return C35964oKf.Fragment.DcMfJKfbSiEC;
                case 9:
                    return C35964oKf.Fragment.getAdvertisingId;
                case 10:
                    return C35964oKf.Fragment.XW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final int EZpvd(@NotNull LabelFilter labelFilter) {
            Intrinsics.checkNotNullParameter(labelFilter, "");
            switch (Activity.OLrzqt[labelFilter.ordinal()]) {
                case 1:
                    return C57406yhn.Activity.values;
                case 2:
                    return C52761wXj.TaskDescription.GQzpsZsQwTVT;
                case 3:
                    return C57406yhn.Activity.ejfBZ;
                case 4:
                    return C57406yhn.Activity.gHZMYf;
                case 5:
                    return C57406yhn.Activity.zuBGHE;
                case 6:
                    return C57406yhn.Activity.zsXlph;
                case 7:
                    return C57406yhn.Activity.wlaJM;
                case 8:
                    return C57406yhn.Activity.AuCTel;
                case 9:
                    return C57406yhn.Activity.AwvSrB;
                case 10:
                    return C57406yhn.Activity.fARcdN;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static LabelFilter valueOf(String str) {
        return (LabelFilter) Enum.valueOf(LabelFilter.class, str);
    }

    public static LabelFilter[] values() {
        return (LabelFilter[]) $VALUES.clone();
    }
}
