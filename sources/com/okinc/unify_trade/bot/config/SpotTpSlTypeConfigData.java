package com.okinc.unify_trade.bot.config;

import androidx.annotation.StringRes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SpotTpSlTypeConfigData {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SpotTpSlTypeConfigData[] $VALUES;
    public static final ActionBar Companion;
    private final int title;
    private final String type;
    public static final SpotTpSlTypeConfigData PRICE = new SpotTpSlTypeConfigData("PRICE", 0, C55688xof.Application.MediaMetadataCompatTextKey, FirebaseAnalytics.Param.PRICE);
    public static final SpotTpSlTypeConfigData PNL = new SpotTpSlTypeConfigData("PNL", 1, C55688xof.Application.MediaMetadataCompatLongKey, "pnl");
    public static final SpotTpSlTypeConfigData RATIO = new SpotTpSlTypeConfigData("RATIO", 2, C55688xof.Application.MediaMetadataCompatApi21Builder, "pnlRatio");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SpotTpSlTypeConfigData[] $values() {
        return new SpotTpSlTypeConfigData[]{PRICE, PNL, RATIO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SpotTpSlTypeConfigData> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private SpotTpSlTypeConfigData(@StringRes String str, int i, int i2, String str2) {
        this.title = i2;
        this.type = str2;
    }

    static {
        SpotTpSlTypeConfigData[] spotTpSlTypeConfigDataArr$values = $values();
        $VALUES = spotTpSlTypeConfigDataArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(spotTpSlTypeConfigDataArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SpotTpSlTypeConfigData EZpvd(String str) {
            SpotTpSlTypeConfigData next;
            Iterator<SpotTpSlTypeConfigData> it = SpotTpSlTypeConfigData.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getType(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    public static SpotTpSlTypeConfigData valueOf(String str) {
        return (SpotTpSlTypeConfigData) Enum.valueOf(SpotTpSlTypeConfigData.class, str);
    }

    public static SpotTpSlTypeConfigData[] values() {
        return (SpotTpSlTypeConfigData[]) $VALUES.clone();
    }
}
