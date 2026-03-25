package o;

import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46880tfX {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final OrderFrequency AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -791707519:
                if (str.equals("weekly")) {
                    return OrderFrequency.WEEKLY;
                }
                break;
            case 95346201:
                if (str.equals("daily")) {
                    return OrderFrequency.DAILY;
                }
                break;
            case 1236635661:
                if (str.equals("monthly")) {
                    return OrderFrequency.MONTHLY;
                }
                break;
            case 2060832967:
                if (str.equals("bi-weekly")) {
                    return OrderFrequency.BI_WEEKLY;
                }
                break;
        }
        return OrderFrequency.NO_FREQ;
    }
}
