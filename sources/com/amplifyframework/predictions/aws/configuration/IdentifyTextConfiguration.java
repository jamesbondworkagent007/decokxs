package com.amplifyframework.predictions.aws.configuration;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.NetworkPolicy;
import com.amplifyframework.predictions.models.TextFormatType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentifyTextConfiguration {
    private static final String CONFIG_NAME = "identifyText";
    private final TextFormatType format;
    private final NetworkPolicy networkPolicy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TextFormatType getFormat() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    private IdentifyTextConfiguration(TextFormatType textFormatType, NetworkPolicy networkPolicy) {
        this.format = textFormatType;
        this.networkPolicy = networkPolicy;
    }

    public static IdentifyTextConfiguration fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new IdentifyTextConfiguration(TextFormatType.valueOf(jSONObject2.getString("format")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }
}
