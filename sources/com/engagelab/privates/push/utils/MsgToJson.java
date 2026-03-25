package com.engagelab.privates.push.utils;

import android.os.Bundle;
import com.engagelab.privates.push.api.AliasMessage;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import com.engagelab.privates.push.api.TagMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.huawei.hms.push.constant.RemoteMessageConst;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MsgToJson {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String aliasMessageToJson(AliasMessage aliasMessage) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MTPushConstants.Operation.KEY_ALIAS, aliasMessage.getAlias());
            jSONObject.put("code", aliasMessage.getCode());
            jSONObject.put(MTPushConstants.Operation.KEY_SEQUENCE, aliasMessage.getSequence());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static JSONArray arrayToJson(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        if (strArr != null) {
            for (String str : strArr) {
                jSONArray.put(str);
            }
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String booleanToJson(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enable", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static JSONObject bundleToJson(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String customMessageToJson(CustomMessage customMessage) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", customMessage.getContent());
            jSONObject.put("contentType", customMessage.getContentType());
            jSONObject.put("messageId", customMessage.getMessageId());
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, (int) customMessage.getPlatform());
            jSONObject.put("platformMessageId", customMessage.getPlatformMessageId());
            jSONObject.put("title", customMessage.getTitle());
            jSONObject.put("extras", bundleToJson(customMessage.getExtras()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String notificationMessageToJson(NotificationMessage notificationMessage) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("badge", notificationMessage.getBadge());
            jSONObject.put("bigPicture", notificationMessage.getBigPicture());
            jSONObject.put("bigText", notificationMessage.getBigText());
            jSONObject.put("builderId", notificationMessage.getBuilderId());
            jSONObject.put("category", notificationMessage.getCategory());
            jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, notificationMessage.getChannelId());
            jSONObject.put("content", notificationMessage.getContent());
            jSONObject.put("defaults", notificationMessage.getDefaults());
            jSONObject.put("extras", bundleToJson(notificationMessage.getExtras()));
            jSONObject.put("inbox", arrayToJson(notificationMessage.getInbox()));
            jSONObject.put("intentSsl", notificationMessage.getIntentSsl());
            jSONObject.put(RemoteMessageConst.Notification.INTENT_URI, notificationMessage.getIntentUri());
            jSONObject.put("largeIcon", notificationMessage.getLargeIcon());
            jSONObject.put("messageId", notificationMessage.getMessageId());
            jSONObject.put("notificationId", notificationMessage.getNotificationId());
            jSONObject.put("overrideMessageId", notificationMessage.getOverrideMessageId());
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, (int) notificationMessage.getPlatform());
            jSONObject.put("platformMessageId", notificationMessage.getPlatformMessageId());
            jSONObject.put(RemoteMessageConst.Notification.PRIORITY, notificationMessage.getPriority());
            jSONObject.put("importance", notificationMessage.getImportance());
            jSONObject.put("smallIcon", notificationMessage.getSmallIcon());
            jSONObject.put(RemoteMessageConst.Notification.SOUND, notificationMessage.getSound());
            jSONObject.put(TtmlNode.TAG_STYLE, notificationMessage.getStyle());
            jSONObject.put("title", notificationMessage.getTitle());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String platformTokenMessageToJson(PlatformTokenMessage platformTokenMessage) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MTPushConstants.PlatformNode.KEY_PLATFORM, (int) platformTokenMessage.getPlatform());
            jSONObject.put("token", platformTokenMessage.getToken());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String tagMessageToJson(TagMessage tagMessage) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", tagMessage.getCode());
            jSONObject.put("queryTag", tagMessage.getQueryTag());
            jSONObject.put(MTPushConstants.Operation.KEY_SEQUENCE, tagMessage.getSequence());
            jSONObject.put("tags", arrayToJson(tagMessage.getTags()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
