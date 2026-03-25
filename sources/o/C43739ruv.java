package o;

import com.google.gson.Gson;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core_api.Playbook;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43739ruv {
    public static final Activity Companion = new Activity(null);
    public static final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("birthCountry", "occupationLayerI", "occupationLayerII", "sourceOfFundKyc", "employerCountry", "depositVolume", "accountPurpose", "occupation");

    /* JADX INFO: renamed from: o.ruv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ruv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final java.lang.String str4, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.lang.String str5, final java.util.HashMap<java.lang.String, java.lang.String> map2, final java.lang.Integer num, final java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) Playbook.OKX_APP_KYC.getValue())) {
            EventData eventData = new EventData();
            eventData.setAct("event_kyc_flow_entrance");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("attr_1", str5);
            linkedHashMap.put("attr_2", str);
            java.lang.String str6 = map.get("refreshType");
            linkedHashMap.put("attr_3", str6 != null ? str6 : "");
            eventData.setAttrs(linkedHashMap);
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
        java.lang.String str7 = EZpvd(str) + "_Full_Page_View";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str7, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ruz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43739ruv.EZpvd(str, str2, str3, str4, this, map, map2, num, num2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C43739ruv c43739ruv, java.util.HashMap map, java.util.HashMap map2, java.lang.Integer num, java.lang.Integer num2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C43296rmc.AEQbTJ("KycEvent", "pageId: {" + str + "} playbook: {" + str2 + "} type: {" + str3 + "} status: {" + str4 + "}");
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        eventParamsList.put("playbook", c43739ruv.KWHzl(str2), false);
        eventParamsList.put("type", c43739ruv.KWHzl(str3), false);
        java.lang.String json = new Gson().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        java.lang.String str5 = (java.lang.String) map.get("refreshType");
        if (str5 == null) {
            str5 = "";
        }
        eventParamsList.put("refresh_type", str5, false);
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                java.lang.String str6 = (java.lang.String) entry.getKey();
                java.lang.String str7 = (java.lang.String) entry.getValue();
                if (str7 == null) {
                    str7 = "";
                }
                eventParamsList.put(str6, str7, false);
            }
        }
        eventParamsList.put("is_vpn", C43396roW.EZpvd().AhwBna() ? "yes" : "no", false);
        eventParamsList.put("is_tr", C34703nhO.AEQbTJ() ? "yes" : "no", false);
        if (str4 != null && C33129mqd.OLrzqt((java.lang.CharSequence) str4)) {
            eventParamsList.put("status", c43739ruv.KWHzl(str4), false);
        }
        if (num != null) {
            num.intValue();
            eventParamsList.put("current_step", num.toString(), false);
        }
        if (num2 != null) {
            num2.intValue();
            eventParamsList.put("questionsTotalStep", num2.toString(), false);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.util.HashMap<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strReplace$default = C59449zhJ.replace$default("KYC_{action}_Api_Click", "{action}", EZpvd(str), false, 4, (java.lang.Object) null);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(strReplace$default, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ruu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43739ruv.AEQbTJ(str, str2, str3, str4, this, map, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, C43739ruv c43739ruv, java.util.HashMap map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C43296rmc.AEQbTJ("KycEvent", "pageId: {" + str + "} playbook: {" + str2 + "} screen: {" + str3 + "} toScreen: {" + str4 + "}");
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        eventParamsList.put("playbook", c43739ruv.KWHzl(str2), false);
        java.lang.String json = new Gson().toJson(map);
        Intrinsics.checkNotNullExpressionValue(json, "");
        eventParamsList.put("action_params", json, false);
        java.lang.String str5 = (java.lang.String) map.get("refreshType");
        eventParamsList.put("refresh_type", str5 != null ? str5 : "", false);
        eventParamsList.put("screen", c43739ruv.KWHzl(str3), false);
        eventParamsList.put("to_screen", c43739ruv.KWHzl(str4), false);
        eventParamsList.put("is_vpn", C43396roW.EZpvd().AhwBna() ? "yes" : "no", false);
        eventParamsList.put("is_tr", C34703nhO.AEQbTJ() ? "yes" : "no", false);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (KWHzl.contains(str)) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("KYC_PrimaryReason_SelectReason_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ruD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C43739ruv.KWHzl(str, str2, str3, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C43296rmc.AEQbTJ("KycEvent", "questionId: {" + str + "} value: {" + str2 + "} valueName: {" + str3 + "}");
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        eventParamsList.put("questionId", str, false);
        eventParamsList.put("value", str2, false);
        eventParamsList.put("valueName", str3, false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43739ruv.KWHzl(str2, str3, str4, str5, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("event", str, true);
        eventParamsList.put("code", str2, false);
        eventParamsList.put("message", str3, false);
        if (str4 == null) {
            str4 = "";
        }
        eventParamsList.put("classname", str4, false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str.length() == 0) {
            return "";
        }
        java.lang.String upperCase = C59454zhO.AkhnZx(str, 1).toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(upperCase);
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        java.lang.String string = sb.toString();
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.copydefault(str, "-", "_", true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ruv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportEopFacialEvent$default(C43739ruv c43739ruv, java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            trackChannelArr = C32867mlg.KWHzl.KWHzl(str);
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        c43739ruv.KWHzl(str, trackChannelArr, function1);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trackChannelArr, "");
        EventParamsList eventParamsList = new EventParamsList(yDY.AhwBna());
        C32872mll c32872mll = C32872mll.OLrzqt;
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        Unit unit = Unit.INSTANCE;
        java.lang.String[] strArrKWHzl = C32866mlf.KWHzl((TrackChannel[]) java.util.Arrays.copyOf(trackChannelArr, trackChannelArr.length));
        c32872mll.copydefault(str, eventParamsList, (java.lang.String[]) java.util.Arrays.copyOf(strArrKWHzl, strArrKWHzl.length));
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.ruy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43739ruv.KWHzl(str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("isGmsAvailable", str, true);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }
}
