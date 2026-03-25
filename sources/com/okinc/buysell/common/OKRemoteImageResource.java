package com.okinc.buysell.common;

import android.content.Context;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class OKRemoteImageResource {
    public static final HashMap<ImagePathKey, String> EZpvd;
    public static final int KWHzl;
    public static final HashMap<ImagePathKey, String> OLrzqt;
    public static final OKRemoteImageResource copydefault = new OKRemoteImageResource();

    private OKRemoteImageResource() {
    }

    static {
        ImagePathKey imagePathKey = ImagePathKey.DOTTED_STEPPER;
        Pair pairOLrzqt = C56390yDp.OLrzqt(imagePathKey, "images/fiat_payment/ic_dotted_stepper.webp");
        ImagePathKey imagePathKey2 = ImagePathKey.RED_PACKET_COIN;
        Pair pairOLrzqt2 = C56390yDp.OLrzqt(imagePathKey2, "images/fiat_payment/icon_red_packet_coin.webp");
        ImagePathKey imagePathKey3 = ImagePathKey.CONVERT_PROGRESS_FINISHED;
        Pair pairOLrzqt3 = C56390yDp.OLrzqt(imagePathKey3, "images/fiat_payment/ic_convert_progress_finished.webp");
        ImagePathKey imagePathKey4 = ImagePathKey.CONVERT_PROGRESS_UNFINISHED;
        EZpvd = C56424yEw.AYXKKw(pairOLrzqt, pairOLrzqt2, pairOLrzqt3, C56390yDp.OLrzqt(imagePathKey4, "images/fiat_payment/ic_convert_progress_unfinished.webp"));
        OLrzqt = C56424yEw.AYXKKw(C56390yDp.OLrzqt(imagePathKey, "images/fiat_payment/ic_dotted_stepper.webp"), C56390yDp.OLrzqt(imagePathKey2, "images/fiat_payment/icon_red_packet_coin.webp"), C56390yDp.OLrzqt(imagePathKey3, "images/fiat_payment/ic_convert_progress_finished_dark.webp"), C56390yDp.OLrzqt(imagePathKey4, "images/fiat_payment/ic_convert_progress_unfinished_dark.webp"));
        KWHzl = 8;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ImagePathKey {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ImagePathKey[] $VALUES;
        public static final ImagePathKey DOTTED_STEPPER = new ImagePathKey("DOTTED_STEPPER", 0);
        public static final ImagePathKey RED_PACKET_COIN = new ImagePathKey("RED_PACKET_COIN", 1);
        public static final ImagePathKey CONVERT_PROGRESS_FINISHED = new ImagePathKey("CONVERT_PROGRESS_FINISHED", 2);
        public static final ImagePathKey CONVERT_PROGRESS_UNFINISHED = new ImagePathKey("CONVERT_PROGRESS_UNFINISHED", 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ImagePathKey[] $values() {
            return new ImagePathKey[]{DOTTED_STEPPER, RED_PACKET_COIN, CONVERT_PROGRESS_FINISHED, CONVERT_PROGRESS_UNFINISHED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ImagePathKey> getEntries() {
            return $ENTRIES;
        }

        private ImagePathKey(String str, int i) {
        }

        static {
            ImagePathKey[] imagePathKeyArr$values = $values();
            $VALUES = imagePathKeyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(imagePathKeyArr$values);
        }

        public static ImagePathKey valueOf(String str) {
            return (ImagePathKey) Enum.valueOf(ImagePathKey.class, str);
        }

        public static ImagePathKey[] values() {
            return (ImagePathKey[]) $VALUES.clone();
        }
    }

    public final String OLrzqt(@NotNull ImagePathKey imagePathKey, boolean z) {
        Intrinsics.checkNotNullParameter(imagePathKey, "");
        String str = (z ? OLrzqt : EZpvd).get(imagePathKey);
        if (str != null) {
            return "https://static.okx.com/cdn/mobile/resources/" + str;
        }
        return "https://static.okx.com/cdn/mobile/resources/" + ((Object) EZpvd.get(imagePathKey));
    }

    public final boolean AEQbTJ(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
