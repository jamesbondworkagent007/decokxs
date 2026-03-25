package com.amplifyframework.auth.result.step;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import com.amplifyframework.auth.MFAType;
import com.amplifyframework.auth.TOTPSetupDetails;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthNextSignInStep {
    private final Map<String, String> additionalInfo;
    private final Set<MFAType> allowedMFATypes;
    private final AuthCodeDeliveryDetails codeDeliveryDetails;
    private final AuthSignInStep signInStep;
    private final TOTPSetupDetails totpSetupDetails;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<MFAType> getAllowedMFATypes() {
        return this.allowedMFATypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthCodeDeliveryDetails getCodeDeliveryDetails() {
        return this.codeDeliveryDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthSignInStep getSignInStep() {
        return this.signInStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TOTPSetupDetails getTotpSetupDetails() {
        return this.totpSetupDetails;
    }

    public AuthNextSignInStep(@NonNull AuthSignInStep authSignInStep, @NonNull Map<String, String> map, @Nullable AuthCodeDeliveryDetails authCodeDeliveryDetails, @Nullable TOTPSetupDetails tOTPSetupDetails, @Nullable Set<MFAType> set) {
        Objects.requireNonNull(authSignInStep);
        this.signInStep = authSignInStep;
        HashMap map2 = new HashMap();
        this.additionalInfo = map2;
        Objects.requireNonNull(map);
        map2.putAll(map);
        this.codeDeliveryDetails = authCodeDeliveryDetails;
        this.totpSetupDetails = tOTPSetupDetails;
        this.allowedMFATypes = set;
    }

    public int hashCode() {
        return ObjectsCompat.hash(getSignInStep(), getAdditionalInfo(), getCodeDeliveryDetails(), getTotpSetupDetails(), getAllowedMFATypes());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthNextSignInStep.class != obj.getClass()) {
            return false;
        }
        AuthNextSignInStep authNextSignInStep = (AuthNextSignInStep) obj;
        return ObjectsCompat.equals(getSignInStep(), authNextSignInStep.getSignInStep()) && ObjectsCompat.equals(getAdditionalInfo(), authNextSignInStep.getAdditionalInfo()) && ObjectsCompat.equals(getCodeDeliveryDetails(), authNextSignInStep.getCodeDeliveryDetails()) && ObjectsCompat.equals(getTotpSetupDetails(), authNextSignInStep.getTotpSetupDetails()) && ObjectsCompat.equals(getAllowedMFATypes(), authNextSignInStep.getAllowedMFATypes());
    }

    public String toString() {
        return "AuthNextSignInStep{signInStep=" + getSignInStep() + ", additionalInfo=" + getAdditionalInfo() + ", codeDeliveryDetails=" + getCodeDeliveryDetails() + ", totpSetupDetails=" + getTotpSetupDetails() + ", allowedMFATypes=" + getAllowedMFATypes() + AbstractJsonLexerKt.END_OBJ;
    }
}
