package com.okinc.okrisk.service;

import android.content.Context;
import com.okinc.okrisk.OKRiskLibrarySource;
import com.okinc.okuser.data.User;
import face.security.device.api.FaceSecDevice;
import face.security.device.api.FaceSecInitListener;
import face.security.device.api.FaceSecToken;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C32979mnm;
import o.C56444yFp;
import o.C58113yvE;
import o.InterfaceC47230tmC;
import o.InterfaceC47278tmy;
import o.InterfaceC56445yFq;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class AliFaceGuardService {
    public static final AliFaceGuardService copydefault = new AliFaceGuardService();
    public static final AtomicBoolean AEQbTJ = new AtomicBoolean(false);
    public static final int EZpvd = 8;

    private AliFaceGuardService() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SiteCode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SiteCode[] $VALUES;
        private final String code;
        private final String customHost;
        private final String customUrl;
        public static final SiteCode US = new SiteCode("US", 0, "OKX_US", "https://cloudauth-device.us-west-1.aliyuncs.com", "cloudauth-device.us-west-1.aliyuncs.com");
        public static final SiteCode GLOBAL = new SiteCode("GLOBAL", 1, "OKX_GLOBAL", "https://cloudauth-device.cn-hongkong.aliyuncs.com", "cloudauth-device.cn-hongkong.aliyuncs.com");
        public static final SiteCode EUR = new SiteCode("EUR", 2, "OKX_EUR", "https://cloudauth-device.eu-central-1.aliyuncs.com", "cloudauth-device.eu-central-1.aliyuncs.com");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SiteCode[] $values() {
            return new SiteCode[]{US, GLOBAL, EUR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SiteCode> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCustomHost() {
            return this.customHost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCustomUrl() {
            return this.customUrl;
        }

        private SiteCode(String str, int i, String str2, String str3, String str4) {
            this.code = str2;
            this.customUrl = str3;
            this.customHost = str4;
        }

        static {
            SiteCode[] siteCodeArr$values = $values();
            $VALUES = siteCodeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(siteCodeArr$values);
        }

        public static SiteCode valueOf(String str) {
            return (SiteCode) Enum.valueOf(SiteCode.class, str);
        }

        public static SiteCode[] values() {
            return (SiteCode[]) $VALUES.clone();
        }
    }

    public final SiteCode AEQbTJ() {
        InterfaceC47278tmy interfaceC47278tmyFmB = ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
        User userOLrzqt = interfaceC47278tmyFmB.OLrzqt();
        String siteCode = userOLrzqt != null ? userOLrzqt.getSiteCode() : null;
        SiteCode siteCode2 = SiteCode.US;
        if (!Intrinsics.EZpvd((Object) siteCode, (Object) siteCode2.getCode())) {
            siteCode2 = SiteCode.EUR;
            if (!Intrinsics.EZpvd((Object) siteCode, (Object) siteCode2.getCode())) {
                siteCode2 = SiteCode.GLOBAL;
            }
        }
        pUU.KWHzl("OKRisk", "SiteCode " + siteCode + " in " + interfaceC47278tmyFmB);
        return siteCode2;
    }

    public final void KWHzl(@NotNull CoroutineScope coroutineScope, String str, @NotNull OKRiskLibrarySource oKRiskLibrarySource, @NotNull Function1<? super FaceSecToken, Unit> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(oKRiskLibrarySource, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AliFaceGuardService$requestAliSDK$1(oKRiskLibrarySource, str, function1, null), 2, null);
    }

    public static /* synthetic */ void init$default(AliFaceGuardService aliFaceGuardService, Context context, String str, FaceSecInitListener faceSecInitListener, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "sgaec7116agsc83944aa357a2066175b";
        }
        if ((i & 4) != 0) {
            faceSecInitListener = null;
        }
        aliFaceGuardService.EZpvd(context, str, faceSecInitListener);
    }

    public final void EZpvd(@NotNull Context context, @NotNull String str, FaceSecInitListener faceSecInitListener) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        SiteCode siteCodeAEQbTJ = AEQbTJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("IPv6", "0");
        linkedHashMap.put("CustomUrl", siteCodeAEQbTJ.getCustomUrl());
        linkedHashMap.put("CustomHost", siteCodeAEQbTJ.getCustomHost());
        FaceSecDevice.getInstance().initWithOptions(context, str, linkedHashMap, faceSecInitListener);
    }

    public final FaceSecToken AEQbTJ(String str) {
        return FaceSecDevice.getInstance().getDeviceToken(str);
    }
}
