package com.amplifyframework.predictions.aws.configuration;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.NetworkPolicy;
import com.amplifyframework.predictions.models.LabelType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentifyLabelsConfiguration {
    private static final String CONFIG_NAME = "identifyLabels";
    private final NetworkPolicy networkPolicy;
    private final LabelType type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LabelType getType() {
        return this.type;
    }

    private IdentifyLabelsConfiguration(LabelType labelType, NetworkPolicy networkPolicy) {
        this.type = labelType;
        this.networkPolicy = networkPolicy;
    }

    public static IdentifyLabelsConfiguration fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new IdentifyLabelsConfiguration(LabelType.valueOf(jSONObject2.getString("type")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }
}
