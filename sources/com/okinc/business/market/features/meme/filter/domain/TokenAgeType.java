package com.okinc.business.market.features.meme.filter.domain;

import androidx.annotation.StringRes;
import androidx.compose.material3.CalendarModelKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.ibm.icu.text.DateFormat;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TokenAgeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenAgeType[] $VALUES;
    public static final TaskDescription Companion;
    private final int displayStringResId;
    private final long millis;
    private final String trackingString;
    private final int value;
    public static final TokenAgeType m = new TokenAgeType(DateFormat.MINUTE, 0, 0, 60000, "min", C23274hvD.Fragment.aappFQ);
    public static final TokenAgeType H = new TokenAgeType(DateFormat.HOUR24, 1, 1, 3600000, "hour", C23274hvD.Fragment.GzAsTt);
    public static final TokenAgeType D = new TokenAgeType("D", 2, 2, CalendarModelKt.MillisecondsIn24Hours, MTPushConstants.NotificationTime.KEY_DAYS, C23274hvD.Fragment.HJWChPDXdlte);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenAgeType[] $values() {
        return new TokenAgeType[]{m, H, D};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenAgeType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayStringResId() {
        return this.displayStringResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMillis() {
        return this.millis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingString() {
        return this.trackingString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int toDisplayString() {
        return this.displayStringResId;
    }

    private TokenAgeType(String str, int i, int i2, @StringRes long j, String str2, int i3) {
        this.value = i2;
        this.millis = j;
        this.trackingString = str2;
        this.displayStringResId = i3;
    }

    static {
        TokenAgeType[] tokenAgeTypeArr$values = $values();
        $VALUES = tokenAgeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenAgeTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.filter.domain.TokenAgeType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TokenAgeType AEQbTJ(int i) {
            TokenAgeType next;
            Iterator<TokenAgeType> it = TokenAgeType.getEntries().iterator();
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
            TokenAgeType tokenAgeType = next;
            return tokenAgeType == null ? TokenAgeType.m : tokenAgeType;
        }

        public final long copydefault(@NotNull TokenAgeType tokenAgeType) {
            Intrinsics.checkNotNullParameter(tokenAgeType, "");
            return tokenAgeType.getMillis();
        }

        public final String KWHzl(@NotNull TokenAgeType tokenAgeType) {
            Intrinsics.checkNotNullParameter(tokenAgeType, "");
            return tokenAgeType.getTrackingString();
        }
    }

    public static TokenAgeType valueOf(String str) {
        return (TokenAgeType) Enum.valueOf(TokenAgeType.class, str);
    }

    public static TokenAgeType[] values() {
        return (TokenAgeType[]) $VALUES.clone();
    }
}
