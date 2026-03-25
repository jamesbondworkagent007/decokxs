package com.amplifyframework.auth.cognito.helpers;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C5173Hn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class FetchTokenResponse {
    public static final Companion Companion = new Companion(null);
    private final String accessToken;
    private final String error;
    private final String errorDescription;
    private final Long expiration;
    private final Integer expiresIn;
    private final String idToken;
    private final String refreshToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FetchTokenResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @SerialName("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @SerialName(Constants.IPC_BUNDLE_KEY_SEND_ERROR)
    public static /* synthetic */ void getError$annotations() {
    }

    @SerialName("error_description")
    public static /* synthetic */ void getErrorDescription$annotations() {
    }

    @SerialName("expires_in")
    private static /* synthetic */ void getExpiresIn$annotations() {
    }

    @SerialName("id_token")
    public static /* synthetic */ void getIdToken$annotations() {
    }

    @SerialName("refresh_token")
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdToken() {
        return this.idToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.helpers.FetchTokenResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FetchTokenResponse> serializer() {
            return FetchTokenResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FetchTokenResponse(int i, @SerialName("access_token") String str, @SerialName("id_token") String str2, @SerialName("refresh_token") String str3, @SerialName("expires_in") Integer num, @SerialName(Constants.IPC_BUNDLE_KEY_SEND_ERROR) String str4, @SerialName("error_description") String str5, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        Long lValueOf = null;
        if ((i & 1) == 0) {
            this.accessToken = null;
        } else {
            this.accessToken = str;
        }
        if ((i & 2) == 0) {
            this.idToken = null;
        } else {
            this.idToken = str2;
        }
        if ((i & 4) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str3;
        }
        if ((i & 8) == 0) {
            this.expiresIn = null;
        } else {
            this.expiresIn = num;
        }
        if ((i & 16) == 0) {
            this.error = null;
        } else {
            this.error = str4;
        }
        if ((i & 32) == 0) {
            this.errorDescription = null;
        } else {
            this.errorDescription = str5;
        }
        if ((i & 64) != 0) {
            this.expiration = l;
            return;
        }
        Integer num2 = this.expiresIn;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            C5173Hn c5173HnKWHzl = C5173Hn.AEQbTJ.KWHzl();
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            lValueOf = Long.valueOf(c5173HnKWHzl.copydefault(C59519zia.EZpvd(iIntValue, DurationUnit.SECONDS)).KWHzl());
        }
        this.expiration = lValueOf;
    }

    public FetchTokenResponse(String str, String str2, String str3, Integer num, String str4, String str5) {
        Long lValueOf;
        this.accessToken = str;
        this.idToken = str2;
        this.refreshToken = str3;
        this.expiresIn = num;
        this.error = str4;
        this.errorDescription = str5;
        if (num != null) {
            int iIntValue = num.intValue();
            C5173Hn c5173HnKWHzl = C5173Hn.AEQbTJ.KWHzl();
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            lValueOf = Long.valueOf(c5173HnKWHzl.copydefault(C59519zia.EZpvd(iIntValue, DurationUnit.SECONDS)).KWHzl());
        } else {
            lValueOf = null;
        }
        this.expiration = lValueOf;
    }

    public static final /* synthetic */ void write$Self(FetchTokenResponse fetchTokenResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long lValueOf;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fetchTokenResponse.accessToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, fetchTokenResponse.accessToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fetchTokenResponse.idToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, fetchTokenResponse.idToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fetchTokenResponse.refreshToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, fetchTokenResponse.refreshToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fetchTokenResponse.expiresIn != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, fetchTokenResponse.expiresIn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fetchTokenResponse.error != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, fetchTokenResponse.error);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || fetchTokenResponse.errorDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, fetchTokenResponse.errorDescription);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6)) {
            Long l = fetchTokenResponse.expiration;
            Integer num = fetchTokenResponse.expiresIn;
            if (num != null) {
                int iIntValue = num.intValue();
                C5173Hn c5173HnKWHzl = C5173Hn.AEQbTJ.KWHzl();
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                lValueOf = Long.valueOf(c5173HnKWHzl.copydefault(C59519zia.EZpvd(iIntValue, DurationUnit.SECONDS)).KWHzl());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.EZpvd(l, lValueOf)) {
                return;
            }
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, fetchTokenResponse.expiration);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:116) call: com.amplifyframework.auth.cognito.helpers.FetchTokenResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FetchTokenResponse(String str, String str2, String str3, Integer num, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
