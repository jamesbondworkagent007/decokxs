package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SpotDcaDealRecordStateData {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SpotDcaDealRecordStateData[] $VALUES;
    public static final Application Companion;
    private final int desc;
    private final String state;
    public static final SpotDcaDealRecordStateData LIVE = new SpotDcaDealRecordStateData("LIVE", 0, "live", C55688xof.Application.OBJEWx);
    public static final SpotDcaDealRecordStateData PARTIALLY_FILLED = new SpotDcaDealRecordStateData("PARTIALLY_FILLED", 1, "partially_filled", C55688xof.Application.ActivityResultRegistry1);
    public static final SpotDcaDealRecordStateData FILLED = new SpotDcaDealRecordStateData("FILLED", 2, "filled", C55688xof.Application.unit);
    public static final SpotDcaDealRecordStateData STOPPING = new SpotDcaDealRecordStateData("STOPPING", 3, "stopping", C55688xof.Application.MediaControllerCompatTransportControls);
    public static final SpotDcaDealRecordStateData CANCELING = new SpotDcaDealRecordStateData("CANCELING", 4, "cancelling", C55688xof.Application.RKDWNf);
    public static final SpotDcaDealRecordStateData CANCELED = new SpotDcaDealRecordStateData("CANCELED", 5, "canceled", C55688xof.Application.DcMfJKgMxgjU);
    public static final SpotDcaDealRecordStateData FAILED = new SpotDcaDealRecordStateData(CardSyncResponse.FAILED, 6, "order_failed", C55688xof.Application.QkdxfA);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SpotDcaDealRecordStateData[] $values() {
        return new SpotDcaDealRecordStateData[]{LIVE, PARTIALLY_FILLED, FILLED, STOPPING, CANCELING, CANCELED, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SpotDcaDealRecordStateData> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    private SpotDcaDealRecordStateData(String str, @StringRes int i, String str2, int i2) {
        this.state = str2;
        this.desc = i2;
    }

    static {
        SpotDcaDealRecordStateData[] spotDcaDealRecordStateDataArr$values = $values();
        $VALUES = spotDcaDealRecordStateDataArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(spotDcaDealRecordStateDataArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.SpotDcaDealRecordStateData.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final String EZpvd(@NotNull String str) {
            SpotDcaDealRecordStateData spotDcaDealRecordStateData;
            String strAYXKKw;
            Intrinsics.checkNotNullParameter(str, "");
            SpotDcaDealRecordStateData[] spotDcaDealRecordStateDataArrValues = SpotDcaDealRecordStateData.values();
            int length = spotDcaDealRecordStateDataArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    spotDcaDealRecordStateData = null;
                    break;
                }
                spotDcaDealRecordStateData = spotDcaDealRecordStateDataArrValues[i];
                if (Intrinsics.EZpvd((Object) spotDcaDealRecordStateData.getState(), (Object) str)) {
                    break;
                }
                i++;
            }
            return (spotDcaDealRecordStateData == null || (strAYXKKw = C33070mpX.AYXKKw(spotDcaDealRecordStateData.getDesc())) == null) ? "" : strAYXKKw;
        }
    }

    public static SpotDcaDealRecordStateData valueOf(String str) {
        return (SpotDcaDealRecordStateData) Enum.valueOf(SpotDcaDealRecordStateData.class, str);
    }

    public static SpotDcaDealRecordStateData[] values() {
        return (SpotDcaDealRecordStateData[]) $VALUES.clone();
    }
}
