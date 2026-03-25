package com.amplifyframework.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.core.util.ObjectsCompat;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthCodeDeliveryDetails {
    private String attributeName;
    private DeliveryMedium deliveryMedium;
    private String destination;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAttributeName() {
        return this.attributeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeliveryMedium getDeliveryMedium() {
        return this.deliveryMedium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDestination() {
        return this.destination;
    }

    public AuthCodeDeliveryDetails(@NonNull String str, @NonNull DeliveryMedium deliveryMedium) {
        this(str, deliveryMedium, null);
    }

    public AuthCodeDeliveryDetails(@NonNull String str, @NonNull DeliveryMedium deliveryMedium, @Nullable String str2) {
        Objects.requireNonNull(str);
        this.destination = str;
        Objects.requireNonNull(deliveryMedium);
        this.deliveryMedium = deliveryMedium;
        this.attributeName = str2;
    }

    public int hashCode() {
        return ObjectsCompat.hash(getDestination(), getDeliveryMedium(), getAttributeName());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthCodeDeliveryDetails.class != obj.getClass()) {
            return false;
        }
        AuthCodeDeliveryDetails authCodeDeliveryDetails = (AuthCodeDeliveryDetails) obj;
        return ObjectsCompat.equals(getDestination(), authCodeDeliveryDetails.getDestination()) && ObjectsCompat.equals(getDeliveryMedium(), authCodeDeliveryDetails.getDeliveryMedium()) && ObjectsCompat.equals(getAttributeName(), authCodeDeliveryDetails.getAttributeName());
    }

    public String toString() {
        return "AuthCodeDeliveryDetails{destination='" + this.destination + "', deliveryMedium=" + this.deliveryMedium + ", attributeName='" + this.attributeName + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public enum DeliveryMedium {
        EMAIL("email"),
        SMS(OtpEventTracker.OTP_EVENT_VALUE_SMS),
        PHONE(HintConstants.AUTOFILL_HINT_PHONE),
        UNKNOWN("unknown");

        private String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getValue() {
            return this.value;
        }

        DeliveryMedium(@NonNull String str) {
            Objects.requireNonNull(str);
            this.value = str;
        }

        public static DeliveryMedium fromString(String str) {
            for (DeliveryMedium deliveryMedium : values()) {
                if (deliveryMedium.getValue().equalsIgnoreCase(str)) {
                    return deliveryMedium;
                }
            }
            return UNKNOWN;
        }
    }
}
