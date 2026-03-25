package com.okinc.localization2;

import android.net.Uri;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.localization2.bean.LanguageUnit;
import com.okinc.localization2.bean.LanguagesSettingFrom;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.pTG;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LocalizeEventReport {
    public static final int $stable = 0;
    public static final LocalizeEventReport INSTANCE = new LocalizeEventReport();
    private static final String JSON_INVALID = "1";
    private static final String TAG = "LocalizeEventReport";

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LanguagesSettingFrom.values().length];
            try {
                iArr[LanguagesSettingFrom.ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LanguagesSettingFrom.COMPLIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private LocalizeEventReport() {
    }

    public final void reportCostTime(long j) {
        EventData eventData = new EventData();
        eventData.setAct("event_launch_time");
        eventData.setSource(String.valueOf(pTG.OLrzqt.gEmmrt()));
        eventData.setPath(Locale.getDefault().toLanguageTag());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(j));
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void reportSwitchMarketStart(@NotNull String str, @NotNull String str2, @NotNull LanguagesSettingFrom languagesSettingFrom) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(languagesSettingFrom, "");
        String fromString = getFromString(languagesSettingFrom);
        EventData eventData = new EventData();
        eventData.setAct("begin_synch_app_languages");
        eventData.setSource(fromString);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attr_1", str);
        linkedHashMap.put("attr_2", str2);
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void reportSwitchMarketEnd(boolean z, @NotNull String str, @NotNull String str2, @NotNull LanguagesSettingFrom languagesSettingFrom) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(languagesSettingFrom, "");
        String fromString = getFromString(languagesSettingFrom);
        EventData eventData = new EventData();
        eventData.setAct("end_synch_app_languages");
        eventData.setSource(fromString);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("attr_1", str);
        linkedHashMap.put("attr_2", str2);
        linkedHashMap.put("attr_3", z ? "0" : "1");
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void reportLanguagePackDownloadResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            Uri uri = Uri.parse(str3);
            EventData eventData = new EventData();
            eventData.setAct("download_localization_packs");
            eventData.setPath(uri.getPath());
            eventData.setCode(str);
            eventData.setMsg(str2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("base_url", String.valueOf(uri.getHost()));
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "reportLanguagePackDownloadResult", e);
        }
    }

    public final void reportLanguagePackInvalid(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            EventData eventData = new EventData();
            eventData.setAct("localization_language_pack_invalid");
            eventData.setPath(str2);
            eventData.setCode("1");
            eventData.setMsg(str);
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "reportLanguagePackInvalid", e);
        }
    }

    public final void reportLanguagePackGenerateError(@NotNull LanguageUnit languageUnit, long j, long j2) {
        Intrinsics.checkNotNullParameter(languageUnit, "");
        try {
            EventData eventData = new EventData();
            eventData.setAct("localization_language_res_generate_error");
            eventData.setCode(languageUnit.toString());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("attr_1", String.valueOf(j));
            linkedHashMap.put("attr_2", String.valueOf(j2));
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (Exception e) {
            pUU.OLrzqt(TAG, "reportLanguagePackGenerateError", e);
        }
    }

    private final String getFromString(LanguagesSettingFrom languagesSettingFrom) {
        int i = TaskDescription.copydefault[languagesSettingFrom.ordinal()];
        if (i == 1) {
            return "Account";
        }
        if (i == 2) {
            return "Compliance";
        }
        throw new NoWhenBranchMatchedException();
    }
}
