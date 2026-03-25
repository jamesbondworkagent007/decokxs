package com.amplifyframework.auth.cognito;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthChannelEventName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AWSCognitoAuthChannelEventName[] $VALUES;
    public static final AWSCognitoAuthChannelEventName FEDERATED_TO_IDENTITY_POOL = new AWSCognitoAuthChannelEventName("FEDERATED_TO_IDENTITY_POOL", 0);
    public static final AWSCognitoAuthChannelEventName FEDERATION_TO_IDENTITY_POOL_CLEARED = new AWSCognitoAuthChannelEventName("FEDERATION_TO_IDENTITY_POOL_CLEARED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AWSCognitoAuthChannelEventName[] $values() {
        return new AWSCognitoAuthChannelEventName[]{FEDERATED_TO_IDENTITY_POOL, FEDERATION_TO_IDENTITY_POOL_CLEARED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AWSCognitoAuthChannelEventName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AWSCognitoAuthChannelEventName valueOf(String str) {
        return (AWSCognitoAuthChannelEventName) Enum.valueOf(AWSCognitoAuthChannelEventName.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AWSCognitoAuthChannelEventName[] values() {
        return (AWSCognitoAuthChannelEventName[]) $VALUES.clone();
    }

    private AWSCognitoAuthChannelEventName(String str, int i) {
    }

    static {
        AWSCognitoAuthChannelEventName[] aWSCognitoAuthChannelEventNameArr$values = $values();
        $VALUES = aWSCognitoAuthChannelEventNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(aWSCognitoAuthChannelEventNameArr$values);
    }
}
