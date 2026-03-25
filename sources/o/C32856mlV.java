package o;

import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32853mlS;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mlV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32856mlV {
    public static final C32856mlV OLrzqt = new C32856mlV();

    private C32856mlV() {
    }

    static {
        C32853mlS.EZpvd.OLrzqt(new C32853mlS.StateListAnimator() { // from class: o.mlV.5
            @Override // o.C32853mlS.StateListAnimator, o.C32853mlS.Activity
            public void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
                Intrinsics.checkNotNullParameter(map, "");
                C32856mlV.OLrzqt.copydefault(map, false);
            }

            @Override // o.C32853mlS.StateListAnimator, o.C32853mlS.Activity
            public void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
                Intrinsics.checkNotNullParameter(map, "");
                C32856mlV.OLrzqt.copydefault(map, true);
            }

            @Override // o.C32853mlS.StateListAnimator, o.C32853mlS.Activity
            public void copydefault(DeepLinkResult deepLinkResult) {
                Intrinsics.checkNotNullParameter(deepLinkResult, "");
                C32856mlV.OLrzqt.copydefault(deepLinkResult);
            }
        });
    }

    public final void copydefault(@NotNull DeepLinkResult deepLinkResult) {
        Intrinsics.checkNotNullParameter(deepLinkResult, "");
        pUU.valueOf("appsflyer", "processDeepLinkResult()-->:status:" + deepLinkResult.getStatus() + " result:" + deepLinkResult.getDeepLink());
        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
            DeepLink deepLink = deepLinkResult.getDeepLink();
            final java.lang.String stringValue = deepLink != null ? deepLink.getStringValue("deep_link_sub10") : null;
            pUU.valueOf("appsflyer", "processDeepLinkResult()-->:deeplinkSub10:" + stringValue);
            if (stringValue != null && stringValue.length() > 0) {
                final java.lang.String string = SPUtils.getString(RemoteMessageConst.Notification.CHANNEL_ID, null, "invite_attribution");
                if (string == null || string.length() == 0) {
                    SPUtils.put(RemoteMessageConst.Notification.CHANNEL_ID, stringValue, "invite_attribution");
                    C32935mmv.KWHzl.put("channel_id", stringValue);
                }
                pUU.valueOf("appsflyer", "processDeepLinkResult()-->:deeplinkSub10:" + stringValue + " existChannelId:" + string);
                C32866mlf.KWHzl("invite_friends_attribution", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mlX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C32856mlV.KWHzl(stringValue, string, (EventParamsList) obj);
                    }
                });
            }
            DeepLink deepLink2 = deepLinkResult.getDeepLink();
            JSONObject clickEvent = deepLink2 != null ? deepLink2.getClickEvent() : null;
            if (clickEvent != null) {
                java.util.Iterator<java.lang.String> itKeys = clickEvent.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    Intrinsics.copydefault((java.lang.Object) next);
                    if (next.length() > 0) {
                        SPUtils.put(next, clickEvent.get(next).toString(), "deep_link_result");
                    }
                }
            }
        }
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deep_link_sub10", str, false);
        if (str2 == null) {
            str2 = "";
        }
        eventParamsList.put("exist_channel_id", str2, false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0079 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public final void copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        final ?? linkedHashMap;
        Intrinsics.checkNotNullParameter(map, "");
        pUU.valueOf("appsflyer", "processAttribution()-->:" + map);
        if (z) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                if (android.text.TextUtils.equals(key, RemoteMessageConst.Notification.CHANNEL_ID) || android.text.TextUtils.equals(key, "channelFlag") || android.text.TextUtils.equals(key, "ok_first_ref") || android.text.TextUtils.equals(key, "campaign") || android.text.TextUtils.equals(key, "activityType") || android.text.TextUtils.equals(key, "activityId")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = map;
        }
        if (!linkedHashMap.isEmpty()) {
            C32866mlf.KWHzl("invite_friends_attribution", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mmc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C32856mlV.AEQbTJ(linkedHashMap, (EventParamsList) obj);
                }
            });
        }
        for (Map.Entry<java.lang.String, java.lang.String> entry2 : map.entrySet()) {
            SPUtils.put(entry2.getKey(), entry2.getValue(), "deep_link_attribution");
        }
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(str, "", "deep_link_result");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String string = SPUtils.getString(str, "", "deep_link_attribution");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final Unit AEQbTJ(java.util.Map map, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.Object value = null;
        java.lang.Object value2 = null;
        for (Map.Entry entry : map.entrySet()) {
            if (android.text.TextUtils.equals((java.lang.CharSequence) entry.getKey(), RemoteMessageConst.Notification.CHANNEL_ID)) {
                value = entry.getValue();
            } else if (android.text.TextUtils.equals((java.lang.CharSequence) entry.getKey(), "activityType")) {
                eventParamsList.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), true);
                SPUtils.put("activityType", (java.lang.String) entry.getValue(), "invite_attribution");
            } else if (android.text.TextUtils.equals((java.lang.CharSequence) entry.getKey(), "activityId")) {
                eventParamsList.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), true);
                SPUtils.put("activityId", (java.lang.String) entry.getValue(), "invite_attribution");
            } else if (android.text.TextUtils.equals((java.lang.CharSequence) entry.getKey(), "channelFlag")) {
                eventParamsList.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue(), true);
                SPUtils.put("channelFlag", (java.lang.String) entry.getValue(), "invite_attribution");
            } else if (android.text.TextUtils.equals((java.lang.CharSequence) entry.getKey(), "ok_first_ref")) {
                eventParamsList.put("firstrefer", (java.lang.String) entry.getValue(), false);
                SPUtils.put("firstrefer", (java.lang.String) entry.getValue(), "invite_attribution");
            } else if (android.text.TextUtils.equals((java.lang.CharSequence) entry.getKey(), "campaign") && C33129mqd.OLrzqt((java.lang.CharSequence) entry.getValue()) && !C59449zhJ.gEmmrt((java.lang.String) entry.getValue(), "none", true)) {
                value2 = entry.getValue();
            }
        }
        java.lang.String str = (java.lang.String) value;
        if (str == null) {
            str = (java.lang.String) value2;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            eventParamsList.put(RemoteMessageConst.Notification.CHANNEL_ID, str, false);
            SPUtils.put(RemoteMessageConst.Notification.CHANNEL_ID, str, "invite_attribution");
            C32935mmv.KWHzl.put("channel_id", str);
        }
        pUU.valueOf("appsflyer", "processAttribution->channelId:" + SPUtils.getString(RemoteMessageConst.Notification.CHANNEL_ID, null, "invite_attribution") + " channelFlag:" + SPUtils.getString("channelFlag", null, "invite_attribution") + " firstrefer:" + SPUtils.getString("firstrefer", null, "invite_attribution"));
        return Unit.INSTANCE;
    }
}
