package com.amplifyframework.auth;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5173Hn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class AWSCredentials {
    public static final Factory Factory = new Factory(null);
    private final String accessKeyId;
    private final String secretAccessKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public AWSCredentials(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accessKeyId = str;
        this.secretAccessKey = str2;
    }

    public static final class Factory {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.AWSCredentials.Factory.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final AWSCredentials createAWSCredentials(String str, String str2, String str3, Long l) {
            if (str == null || str2 == null) {
                return null;
            }
            if (str3 != null && l != null) {
                return new AWSTemporaryCredentials(str, str2, str3, C5173Hn.ActionBar.fromEpochSeconds$default(C5173Hn.AEQbTJ, l.longValue(), 0, 2, null));
            }
            return new AWSCredentials(str, str2);
        }
    }
}
