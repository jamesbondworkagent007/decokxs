package com.okinc.buysell.data;

import android.content.Context;
import androidx.camera.video.AudioStats;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C38307pTy;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTB;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ConvertChipAmount {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertChipAmount[] $VALUES;
    public static final ConvertChipAmount ADD_MORE;
    public static final ConvertChipAmount CONVERT_MAX;
    public static final Activity Companion;
    public static final double DEFAULT_PERCENT_DECIMAL = 0.0d;
    public static final ConvertChipAmount TRANSFER;
    private final double percentDecimal;
    private final String tag;
    public static final ConvertChipAmount TWENTY_FIVE_PERCENT = new ConvertChipAmount("TWENTY_FIVE_PERCENT", 0, "25", 0.25d);
    public static final ConvertChipAmount FIFTY_PERCENT = new ConvertChipAmount("FIFTY_PERCENT", 1, "50", 0.5d);
    public static final ConvertChipAmount SEVENTY_FIVE_PERCENT = new ConvertChipAmount("SEVENTY_FIVE_PERCENT", 2, "75", 0.75d);
    public static final ConvertChipAmount ALL = new ConvertChipAmount("ALL", 3, "all", 1.0d);
    public static final ConvertChipAmount CONVERT_ALL = new ConvertChipAmount("CONVERT_ALL", 4, "convert_all", AudioStats.AUDIO_AMPLITUDE_NONE, 2, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertChipAmount[] $values() {
        return new ConvertChipAmount[]{TWENTY_FIVE_PERCENT, FIFTY_PERCENT, SEVENTY_FIVE_PERCENT, ALL, CONVERT_ALL, CONVERT_MAX, ADD_MORE, TRANSFER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertChipAmount> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getPercentDecimal() {
        return this.percentDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    private ConvertChipAmount(String str, int i, String str2, double d) {
        this.tag = str2;
        this.percentDecimal = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 int)
  (r9v0 java.lang.String)
  (wrap:double:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:double:0x0004: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r10v0 double))
 A[MD:(java.lang.String, int, java.lang.String, double):void (m)] (LINE:9) call: com.okinc.buysell.data.ConvertChipAmount.<init>(java.lang.String, int, java.lang.String, double):void type: THIS */
    public /* synthetic */ ConvertChipAmount(String str, int i, String str2, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d);
    }

    static {
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CONVERT_MAX = new ConvertChipAmount("CONVERT_MAX", 5, "convert_max", d, i, defaultConstructorMarker);
        ADD_MORE = new ConvertChipAmount("ADD_MORE", 6, "add_more", AudioStats.AUDIO_AMPLITUDE_NONE, 2, null);
        TRANSFER = new ConvertChipAmount("TRANSFER", 7, ExtJson.BRC20TYPE_TRANSFER, d, i, defaultConstructorMarker);
        ConvertChipAmount[] convertChipAmountArr$values = $values();
        $VALUES = convertChipAmountArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertChipAmountArr$values);
        Companion = new Activity(null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.data.ConvertChipAmount.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ConvertChipAmount copydefault(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            BigDecimal bigDecimal = new BigDecimal(25);
            C38307pTy.Application application = C38307pTy.Companion;
            if (Intrinsics.EZpvd((Object) str, (Object) pTB.formatICUPercent$default(bigDecimal, null, application.AEQbTJ(0), null, null, null, 29, null))) {
                return ConvertChipAmount.TWENTY_FIVE_PERCENT;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) pTB.formatICUPercent$default(new BigDecimal(50), null, application.AEQbTJ(0), null, null, null, 29, null))) {
                return ConvertChipAmount.FIFTY_PERCENT;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) pTB.formatICUPercent$default(new BigDecimal(75), null, application.AEQbTJ(0), null, null, null, 29, null))) {
                return ConvertChipAmount.SEVENTY_FIVE_PERCENT;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) context.getString(C31351lsQ.Activity.profile))) {
                return ConvertChipAmount.ALL;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) context.getString(C31351lsQ.Activity.fARcdN))) {
                return ConvertChipAmount.CONVERT_ALL;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) context.getString(C31351lsQ.Activity.AuCTel))) {
                return ConvertChipAmount.CONVERT_MAX;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) context.getString(C31351lsQ.Activity.uzCIH))) {
                return ConvertChipAmount.ADD_MORE;
            }
            if (Intrinsics.EZpvd((Object) str, (Object) context.getString(C31351lsQ.Activity.OJuSTm))) {
                return ConvertChipAmount.TRANSFER;
            }
            return null;
        }
    }

    public static ConvertChipAmount valueOf(String str) {
        return (ConvertChipAmount) Enum.valueOf(ConvertChipAmount.class, str);
    }

    public static ConvertChipAmount[] values() {
        return (ConvertChipAmount[]) $VALUES.clone();
    }
}
