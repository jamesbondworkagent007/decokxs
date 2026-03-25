package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import com.okinc.p2p.api.OtcExtraKeys;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31349lsO {
    public static final C31349lsO EZpvd = new C31349lsO();

    private C31349lsO() {
    }

    public static /* synthetic */ void trackEntrance$default(C31349lsO c31349lsO, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = PaymentsReporterProperty.PaymentsReportSource.PAYMENT_ENTRANCE.getType();
        }
        if ((i & 2) != 0) {
            str2 = PaymentsReporterProperty.PaymentsReportAttrPage.CRYPTO_LIST.getType();
        }
        c31349lsO.OLrzqt(str, str2, str3);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        trackPaymentsEvent$default(this, str, str2, str3, null, null, null, null, null, null, null, null, null, null, 8184, null);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        trackPaymentsEvent$default(this, null, str, str2, null, null, null, null, null, null, null, null, null, null, 8185, null);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        trackPaymentsEvent$default(this, null, str, str2, null, str3, null, null, null, null, null, null, null, null, 8169, null);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        trackPaymentsEvent$default(this, null, str, "Log", null, null, null, null, null, null, null, str2, str3, null, 5113, null);
    }

    public static /* synthetic */ void trackPaymentsEvent$default(C31349lsO c31349lsO, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, int i, java.lang.Object obj) {
        c31349lsO.EZpvd((i & 1) != 0 ? "" : str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        ReportManager.AEQbTJ.EZpvd(OLrzqt(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13));
    }

    public final EventData OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13) {
        EventData eventData = new EventData();
        eventData.setAct(OtcExtraKeys.PAYMENT);
        eventData.setSource(str);
        eventData.setCode(str11);
        eventData.setMsg(str12);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page", str2);
        linkedHashMap.put("type", str3);
        linkedHashMap.put("payment_channel", str4);
        linkedHashMap.put("click", str5);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str6);
        linkedHashMap.put("fiat_amount", str7);
        linkedHashMap.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str8);
        linkedHashMap.put("crypto_amount", str9);
        linkedHashMap.put("unified_amount", str10);
        linkedHashMap.put(OtcExtraKeys.ERROR_TYPE, str13);
        eventData.setAttrs(linkedHashMap);
        return eventData;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str.length() > 0) {
            sb.append("source: " + str + ", ");
            sb.append('\n');
        }
        sb.append("currentPage: " + str2);
        sb.append('\n');
        sb.append("flowType: " + str3);
        sb.append('\n');
        if (str4.length() > 0) {
            sb.append("paymentChannel: " + str4);
            sb.append('\n');
        }
        if (str5.length() > 0) {
            sb.append("click: " + str5);
            sb.append('\n');
        }
        if (str6.length() > 0) {
            sb.append("fiat: " + str6);
            sb.append('\n');
        }
        if (str7.length() > 0) {
            sb.append("fiatAmount: " + str7);
            sb.append('\n');
        }
        if (str8.length() > 0) {
            sb.append("crypto: " + str8);
            sb.append('\n');
        }
        if (str9.length() > 0) {
            sb.append("cryptoAmount: " + str9);
            sb.append('\n');
        }
        if (str10.length() > 0) {
            sb.append("unifiedAmount: " + str10);
            sb.append('\n');
        }
        if (str11.length() > 0) {
            sb.append("errorCode: " + str11);
            sb.append('\n');
        }
        if (str12.length() > 0) {
            sb.append("errorMessage: " + str12);
            sb.append('\n');
        }
        if (str13.length() > 0) {
            sb.append("errorType: " + str13);
            sb.append('\n');
        }
        sb.append("time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault()).format(new Date(java.lang.System.currentTimeMillis())));
        sb.append('\n');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
