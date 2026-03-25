package com.amplifyframework.predictions.aws.configuration;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.NetworkPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class InterpretTextConfiguration {
    private static final String CONFIG_NAME = "interpretText";
    private final NetworkPolicy networkPolicy;
    private final InterpretType type;

    public enum InterpretType {
        LANGUAGE,
        ENTITIES,
        KEY_PHRASES,
        SENTIMENT,
        SYNTAX,
        ALL
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterpretType getType() {
        return this.type;
    }

    private InterpretTextConfiguration(InterpretType interpretType, NetworkPolicy networkPolicy) {
        this.type = interpretType;
        this.networkPolicy = networkPolicy;
    }

    public static InterpretTextConfiguration fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new InterpretTextConfiguration(InterpretType.valueOf(jSONObject2.getString("type")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }
}
