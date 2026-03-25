package com.amplifyframework.predictions.aws.configuration;

import androidx.annotation.NonNull;
import com.amplifyframework.predictions.aws.NetworkPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentifyEntitiesConfiguration {
    private static final String CONFIG_NAME = "identifyEntities";
    private static final int MAX_VALID_ENTITIES = 50;
    private final boolean celebrityDetectionEnabled;
    private final String collectionId;
    private final boolean generalEntityDetection;
    private final int maxEntities;
    private final NetworkPolicy networkPolicy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCollectionId() {
        return this.collectionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getMaxEntities() {
        return this.maxEntities;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkPolicy getNetworkPolicy() {
        return this.networkPolicy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isCelebrityDetectionEnabled() {
        return this.celebrityDetectionEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isGeneralEntityDetection() {
        return this.generalEntityDetection;
    }

    private IdentifyEntitiesConfiguration(int i, String str, boolean z, boolean z2, NetworkPolicy networkPolicy) {
        this.maxEntities = i;
        this.collectionId = str;
        this.generalEntityDetection = z;
        this.celebrityDetectionEnabled = z2;
        this.networkPolicy = networkPolicy;
    }

    public static IdentifyEntitiesConfiguration fromJson(@NonNull JSONObject jSONObject) throws JSONException {
        String str;
        int i;
        boolean z;
        if (!jSONObject.has(CONFIG_NAME)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(CONFIG_NAME);
        String string = jSONObject2.getString("celebrityDetectionEnabled");
        String string2 = jSONObject2.getString("defaultNetworkPolicy");
        boolean z2 = Boolean.parseBoolean(string);
        NetworkPolicy networkPolicyFromKey = NetworkPolicy.fromKey(string2);
        try {
            String string3 = jSONObject2.getString("maxEntities");
            String string4 = jSONObject2.getString("collectionId");
            int i2 = Integer.parseInt(string3);
            str = string4;
            z = i2 < 1 || i2 > 50;
            i = i2;
        } catch (IllegalArgumentException | JSONException unused) {
            str = "";
            i = 0;
            z = true;
        }
        return new IdentifyEntitiesConfiguration(i, str, z, z2, networkPolicyFromKey);
    }
}
