package com.amplifyframework.predictions.aws.configuration;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.NetworkPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SpeechGeneratorConfiguration {
    private static final String CONFIG_NAME = "speechGenerator";
    private final String language;
    private final NetworkPolicy networkPolicy;
    private final String voice;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getVoice() {
        return this.voice;
    }

    private SpeechGeneratorConfiguration(String str, String str2, NetworkPolicy networkPolicy) {
        this.voice = str;
        this.language = str2;
        this.networkPolicy = networkPolicy;
    }

    public static SpeechGeneratorConfiguration fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new SpeechGeneratorConfiguration(jSONObject2.getString("voice"), jSONObject2.getString("language"), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }
}
