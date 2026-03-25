package com.okinc.business.market.data.model.alert;

import com.okinc.business.market.data.model.alert.AlertPromptType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C23274hvD;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AlertPromptType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AlertPromptType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("1")
    public static final AlertPromptType PRICE_MOVE_ABOVE = new AlertPromptType("PRICE_MOVE_ABOVE", 0, 1);

    @SerialName("2")
    public static final AlertPromptType PRICE_MOVE_BELOW = new AlertPromptType("PRICE_MOVE_BELOW", 1, 2);

    @SerialName("3")
    public static final AlertPromptType GAIN_EXCEEDS_24H = new AlertPromptType("GAIN_EXCEEDS_24H", 2, 3);

    @SerialName("4")
    public static final AlertPromptType LOSS_EXCEEDS_24H = new AlertPromptType("LOSS_EXCEEDS_24H", 3, 4);

    @SerialName("5")
    public static final AlertPromptType PRICE_REACHES = new AlertPromptType("PRICE_REACHES", 4, 5);

    @SerialName("7")
    public static final AlertPromptType GAIN_EXCEEDS_5MIN = new AlertPromptType("GAIN_EXCEEDS_5MIN", 5, 7);

    @SerialName("8")
    public static final AlertPromptType LOSS_EXCEEDS_5MIN = new AlertPromptType("LOSS_EXCEEDS_5MIN", 6, 8);

    @SerialName("9")
    public static final AlertPromptType GAIN_EXCEEDS_1H = new AlertPromptType("GAIN_EXCEEDS_1H", 7, 9);

    @SerialName("10")
    public static final AlertPromptType LOSS_EXCEEDS_1H = new AlertPromptType("LOSS_EXCEEDS_1H", 8, 10);

    @SerialName("11")
    public static final AlertPromptType GAIN_EXCEEDS_4H = new AlertPromptType("GAIN_EXCEEDS_4H", 9, 11);

    @SerialName("12")
    public static final AlertPromptType LOSS_EXCEEDS_4H = new AlertPromptType("LOSS_EXCEEDS_4H", 10, 12);

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlertPromptType.values().length];
            try {
                iArr[AlertPromptType.PRICE_MOVE_ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertPromptType.PRICE_MOVE_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertPromptType.PRICE_REACHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_24H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_4H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_1H.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AlertPromptType.GAIN_EXCEEDS_5MIN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_24H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_4H.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_1H.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AlertPromptType.LOSS_EXCEEDS_5MIN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[AlertTimeFrame.values().length];
            try {
                iArr2[AlertTimeFrame.FIVE_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AlertTimeFrame.ONE_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AlertTimeFrame.FOUR_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AlertTimeFrame.TWENTY_FOUR_HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[PromptTypes.values().length];
            try {
                iArr3[PromptTypes.PRICE_MOVE_ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[PromptTypes.PRICE_MOVE_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[PromptTypes.PRICE_REACHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[PromptTypes.MARKETCAP_MOVE_ABOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[PromptTypes.MARKETCAP_MOVE_BELOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[PromptTypes.MARKETCAP_REACHES.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[PromptTypes.GAIN_EXCEEDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[PromptTypes.LOSS_EXCEEDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            EZpvd = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AlertPromptType[] $values() {
        return new AlertPromptType[]{PRICE_MOVE_ABOVE, PRICE_MOVE_BELOW, GAIN_EXCEEDS_24H, LOSS_EXCEEDS_24H, PRICE_REACHES, GAIN_EXCEEDS_5MIN, LOSS_EXCEEDS_5MIN, GAIN_EXCEEDS_1H, LOSS_EXCEEDS_1H, GAIN_EXCEEDS_4H, LOSS_EXCEEDS_4H};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AlertPromptType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private AlertPromptType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        AlertPromptType[] alertPromptTypeArr$values = $values();
        $VALUES = alertPromptTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(alertPromptTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AlertPromptType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.alert.AlertPromptType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) AlertPromptType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AlertPromptType> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.model.alert.AlertPromptType", values(), new String[]{"1", "2", "3", "4", "5", "7", "8", "9", "10", "11", "12"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null}, null);
    }

    public final int getTextTitle(@NotNull AlertType alertType) {
        Intrinsics.checkNotNullParameter(alertType, "");
        switch (ActionBar.AEQbTJ[ordinal()]) {
            case 1:
                return alertType == AlertType.PRICE ? C23274hvD.Fragment.DkIxYv : C23274hvD.Fragment.sWlOSi;
            case 2:
                return alertType == AlertType.PRICE ? C23274hvD.Fragment.DDNONI : C23274hvD.Fragment.UnZVfq;
            case 3:
                return alertType == AlertType.PRICE ? C23274hvD.Fragment.UkuJRw : C23274hvD.Fragment.UNDaji;
            case 4:
            case 5:
            case 6:
            case 7:
                return C23274hvD.Fragment.OYuSWK;
            case 8:
            case 9:
            case 10:
            case 11:
                return C23274hvD.Fragment.fOrBHg;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final AlertPromptType toNewTimeFrame(@NotNull AlertTimeFrame alertTimeFrame) {
        Intrinsics.checkNotNullParameter(alertTimeFrame, "");
        switch (ActionBar.AEQbTJ[ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
                int i = ActionBar.copydefault[alertTimeFrame.ordinal()];
                if (i == 1) {
                    return GAIN_EXCEEDS_5MIN;
                }
                if (i == 2) {
                    return GAIN_EXCEEDS_1H;
                }
                if (i == 3) {
                    return GAIN_EXCEEDS_4H;
                }
                if (i == 4) {
                    return GAIN_EXCEEDS_24H;
                }
                throw new NoWhenBranchMatchedException();
            case 8:
            case 9:
            case 10:
            case 11:
                int i2 = ActionBar.copydefault[alertTimeFrame.ordinal()];
                if (i2 == 1) {
                    return LOSS_EXCEEDS_5MIN;
                }
                if (i2 == 2) {
                    return LOSS_EXCEEDS_1H;
                }
                if (i2 == 3) {
                    return LOSS_EXCEEDS_4H;
                }
                if (i2 == 4) {
                    return LOSS_EXCEEDS_24H;
                }
                throw new NoWhenBranchMatchedException();
            default:
                return this;
        }
    }

    public final AlertPromptType toNewAlertPromptType(@NotNull PromptTypes promptTypes) {
        Intrinsics.checkNotNullParameter(promptTypes, "");
        switch (ActionBar.EZpvd[promptTypes.ordinal()]) {
            case 1:
            case 4:
                return PRICE_MOVE_ABOVE;
            case 2:
            case 5:
                return PRICE_MOVE_BELOW;
            case 3:
            case 6:
                return PRICE_REACHES;
            case 7:
                AlertPromptType alertPromptType = GAIN_EXCEEDS_5MIN;
                if (!yDY.gEmmrt(alertPromptType, GAIN_EXCEEDS_1H, GAIN_EXCEEDS_4H, GAIN_EXCEEDS_24H).contains(this)) {
                    return alertPromptType;
                }
                break;
            case 8:
                AlertPromptType alertPromptType2 = LOSS_EXCEEDS_5MIN;
                if (!yDY.gEmmrt(alertPromptType2, LOSS_EXCEEDS_1H, LOSS_EXCEEDS_4H, LOSS_EXCEEDS_24H).contains(this)) {
                    return alertPromptType2;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return this;
    }

    public final String getTypeForTracking() {
        switch (ActionBar.AEQbTJ[ordinal()]) {
            case 1:
                return "Price_moves_above";
            case 2:
                return "Price_moves_below";
            case 3:
                return "Price_reaches";
            case 4:
            case 5:
            case 6:
            case 7:
                return "Price_increase_reaches";
            case 8:
            case 9:
            case 10:
            case 11:
                return "Price_decrease_reaches";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getIntervalForTracking() {
        switch (ActionBar.AEQbTJ[ordinal()]) {
            case 4:
            case 8:
                return "24_hour";
            case 5:
            case 9:
                return "4_hour";
            case 6:
            case 10:
                return "1_hour";
            case 7:
            case 11:
                return "5_min";
            default:
                return "NA";
        }
    }

    public static AlertPromptType valueOf(String str) {
        return (AlertPromptType) Enum.valueOf(AlertPromptType.class, str);
    }

    public static AlertPromptType[] values() {
        return (AlertPromptType[]) $VALUES.clone();
    }
}
