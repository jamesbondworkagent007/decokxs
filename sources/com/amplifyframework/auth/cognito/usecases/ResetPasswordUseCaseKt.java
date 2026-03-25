package com.amplifyframework.auth.cognito.usecases;

import com.amplifyframework.auth.AuthCodeDeliveryDetails;
import o.AnimatorInflater;

/* JADX INFO: loaded from: classes21.dex */
public final class ResetPasswordUseCaseKt {
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.AnimatorInflater */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AuthCodeDeliveryDetails toAuthCodeDeliveryDetails(AnimatorInflater animatorInflater) {
        if (animatorInflater == 0) {
            return (AuthCodeDeliveryDetails) animatorInflater;
        }
        if (animatorInflater.EZpvd() == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return new AuthCodeDeliveryDetails(String.valueOf(animatorInflater.EZpvd()), AuthCodeDeliveryDetails.DeliveryMedium.fromString(String.valueOf(animatorInflater.copydefault())), animatorInflater.KWHzl());
    }
}
