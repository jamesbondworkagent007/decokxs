package com.okinc.business.market.common.constants;

import androidx.annotation.StringRes;
import com.okinc.business.market.common.constants.TimeIntervalType;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
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
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TimeIntervalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TimeIntervalType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int titleResId;
    private final int value;

    @SerialName("1")
    public static final TimeIntervalType FIVE_MIN = new TimeIntervalType("FIVE_MIN", 0, 1, C23274hvD.Fragment.DuQ);

    @SerialName("2")
    public static final TimeIntervalType ONE_HOUR = new TimeIntervalType("ONE_HOUR", 1, 2, C23274hvD.Fragment.sSi);

    @SerialName("3")
    public static final TimeIntervalType FOUR_HOUR = new TimeIntervalType("FOUR_HOUR", 2, 3, C23274hvD.Fragment.ZGRCNj);

    @SerialName("4")
    public static final TimeIntervalType TWENTY_FOUR_HOUR = new TimeIntervalType("TWENTY_FOUR_HOUR", 3, 4, C23274hvD.Fragment.ZNPcth);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TimeIntervalType[] $values() {
        return new TimeIntervalType[]{FIVE_MIN, ONE_HOUR, FOUR_HOUR, TWENTY_FOUR_HOUR};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TimeIntervalType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private TimeIntervalType(String str, @StringRes int i, int i2, int i3) {
        this.value = i2;
        this.titleResId = i3;
    }

    static {
        TimeIntervalType[] timeIntervalTypeArr$values = $values();
        $VALUES = timeIntervalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(timeIntervalTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TimeIntervalType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.common.constants.TimeIntervalType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) TimeIntervalType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TimeIntervalType> serializer() {
            return KWHzl();
        }

        public final int copydefault(@NotNull TimeIntervalType timeIntervalType) {
            Intrinsics.checkNotNullParameter(timeIntervalType, "");
            return timeIntervalType.getTitleResId();
        }

        public static /* synthetic */ TimeIntervalType fromValue$default(Companion companion, int i, TimeIntervalType timeIntervalType, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                timeIntervalType = TimeIntervalType.TWENTY_FOUR_HOUR;
            }
            return companion.OLrzqt(i, timeIntervalType);
        }

        public final TimeIntervalType OLrzqt(int i, @NotNull TimeIntervalType timeIntervalType) {
            TimeIntervalType next;
            Intrinsics.checkNotNullParameter(timeIntervalType, "");
            Iterator<TimeIntervalType> it = TimeIntervalType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == i) {
                    break;
                }
            }
            TimeIntervalType timeIntervalType2 = next;
            return timeIntervalType2 == null ? timeIntervalType : timeIntervalType2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.common.constants.TimeIntervalType", values(), new String[]{"1", "2", "3", "4"}, new Annotation[][]{null, null, null, null}, null);
    }

    public static TimeIntervalType valueOf(String str) {
        return (TimeIntervalType) Enum.valueOf(TimeIntervalType.class, str);
    }

    public static TimeIntervalType[] values() {
        return (TimeIntervalType[]) $VALUES.clone();
    }
}
