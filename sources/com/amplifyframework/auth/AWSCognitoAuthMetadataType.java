package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalAmplifyApi;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
@InternalAmplifyApi
public final class AWSCognitoAuthMetadataType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AWSCognitoAuthMetadataType[] $VALUES;
    private final String key;
    public static final AWSCognitoAuthMetadataType Authenticator = new AWSCognitoAuthMetadataType("Authenticator", 0, "authenticator");
    public static final AWSCognitoAuthMetadataType AuthPluginsCore = new AWSCognitoAuthMetadataType("AuthPluginsCore", 1, "oidc-auth-plugin");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AWSCognitoAuthMetadataType[] $values() {
        return new AWSCognitoAuthMetadataType[]{Authenticator, AuthPluginsCore};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AWSCognitoAuthMetadataType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AWSCognitoAuthMetadataType valueOf(String str) {
        return (AWSCognitoAuthMetadataType) Enum.valueOf(AWSCognitoAuthMetadataType.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AWSCognitoAuthMetadataType[] values() {
        return (AWSCognitoAuthMetadataType[]) $VALUES.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    private AWSCognitoAuthMetadataType(String str, int i, String str2) {
        this.key = str2;
    }

    static {
        AWSCognitoAuthMetadataType[] aWSCognitoAuthMetadataTypeArr$values = $values();
        $VALUES = aWSCognitoAuthMetadataTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aWSCognitoAuthMetadataTypeArr$values);
    }
}
