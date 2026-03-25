package com.amplifyframework.predictions.aws.configuration;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.NetworkPolicy;
import com.amplifyframework.predictions.models.LanguageType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TranslateTextConfiguration {
    private static final String CONFIG_NAME = "translateText";
    private final NetworkPolicy networkPolicy;
    private final LanguageType sourceLanguage;
    private final LanguageType targetLanguage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LanguageType getSourceLanguage() {
        return this.sourceLanguage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }

    private TranslateTextConfiguration(LanguageType languageType, LanguageType languageType2, NetworkPolicy networkPolicy) {
        this.sourceLanguage = languageType;
        this.targetLanguage = languageType2;
        this.networkPolicy = networkPolicy;
    }

    public static TranslateTextConfiguration fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        return new TranslateTextConfiguration(LanguageType.from(jSONObject2.getString("sourceLang")), LanguageType.from(jSONObject2.getString("targetLang")), NetworkPolicy.fromKey(jSONObject2.getString("defaultNetworkPolicy")));
    }
}
