package com.amplifyframework.auth;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCognitoUserPoolTokens {
    private final String accessToken;
    private final String idToken;
    private final String refreshToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AWSCognitoUserPoolTokens copy$default(AWSCognitoUserPoolTokens aWSCognitoUserPoolTokens, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCognitoUserPoolTokens.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = aWSCognitoUserPoolTokens.idToken;
        }
        if ((i & 4) != 0) {
            str3 = aWSCognitoUserPoolTokens.refreshToken;
        }
        return aWSCognitoUserPoolTokens.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.refreshToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoUserPoolTokens copy(String str, String str2, String str3) {
        return new AWSCognitoUserPoolTokens(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoUserPoolTokens)) {
            return false;
        }
        AWSCognitoUserPoolTokens aWSCognitoUserPoolTokens = (AWSCognitoUserPoolTokens) obj;
        return Intrinsics.EZpvd((Object) this.accessToken, (Object) aWSCognitoUserPoolTokens.accessToken) && Intrinsics.EZpvd((Object) this.idToken, (Object) aWSCognitoUserPoolTokens.idToken) && Intrinsics.EZpvd((Object) this.refreshToken, (Object) aWSCognitoUserPoolTokens.refreshToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdToken() {
        return this.idToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.idToken;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.refreshToken;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSCognitoUserPoolTokens(accessToken=" + this.accessToken + ", idToken=" + this.idToken + ", refreshToken=" + this.refreshToken + ')';
    }

    public AWSCognitoUserPoolTokens(String str, String str2, String str3) {
        this.accessToken = str;
        this.idToken = str2;
        this.refreshToken = str3;
    }
}
