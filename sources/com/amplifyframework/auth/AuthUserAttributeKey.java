package com.amplifyframework.auth;

import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthUserAttributeKey {
    private static final String ADDRESS = "address";
    private static final String BIRTHDATE = "birthdate";
    private static final String EMAIL = "email";
    private static final String EMAIL_VERIFIED = "email_verified";
    private static final String FAMILY_NAME = "family_name";
    private static final String GENDER = "gender";
    private static final String GIVEN_NAME = "given_name";
    private static final String LOCALE = "locale";
    private static final String MIDDLE_NAME = "middle_name";
    private static final String NAME = "name";
    private static final String NICKNAME = "nickname";
    private static final String PHONE_NUMBER = "phone_number";
    private static final String PHONE_NUMBER_VERIFIED = "phone_number_verified";
    private static final String PICTURE = "picture";
    private static final String PREFERRED_USERNAME = "preferred_username";
    private static final String PROFILE = "profile";
    private static final String UPDATED_AT = "updated_at";
    private static final String WEBSITE = "website";
    private static final String ZONE_INFO = "zoneinfo";
    private final String attributeKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getKeyString() {
        return this.attributeKey;
    }

    public AuthUserAttributeKey(String str) {
        this.attributeKey = str;
    }

    public static AuthUserAttributeKey address() {
        return new AuthUserAttributeKey("address");
    }

    public static AuthUserAttributeKey birthdate() {
        return new AuthUserAttributeKey(BIRTHDATE);
    }

    public static AuthUserAttributeKey email() {
        return new AuthUserAttributeKey("email");
    }

    public static AuthUserAttributeKey emailVerified() {
        return new AuthUserAttributeKey(EMAIL_VERIFIED);
    }

    public static AuthUserAttributeKey familyName() {
        return new AuthUserAttributeKey(FAMILY_NAME);
    }

    public static AuthUserAttributeKey gender() {
        return new AuthUserAttributeKey("gender");
    }

    public static AuthUserAttributeKey givenName() {
        return new AuthUserAttributeKey(GIVEN_NAME);
    }

    public static AuthUserAttributeKey locale() {
        return new AuthUserAttributeKey(LOCALE);
    }

    public static AuthUserAttributeKey middleName() {
        return new AuthUserAttributeKey(MIDDLE_NAME);
    }

    public static AuthUserAttributeKey name() {
        return new AuthUserAttributeKey("name");
    }

    public static AuthUserAttributeKey nickname() {
        return new AuthUserAttributeKey(NICKNAME);
    }

    public static AuthUserAttributeKey phoneNumber() {
        return new AuthUserAttributeKey(PHONE_NUMBER);
    }

    public static AuthUserAttributeKey phoneNumberVerified() {
        return new AuthUserAttributeKey(PHONE_NUMBER_VERIFIED);
    }

    public static AuthUserAttributeKey picture() {
        return new AuthUserAttributeKey(PICTURE);
    }

    public static AuthUserAttributeKey preferredUsername() {
        return new AuthUserAttributeKey(PREFERRED_USERNAME);
    }

    public static AuthUserAttributeKey profile() {
        return new AuthUserAttributeKey("profile");
    }

    public static AuthUserAttributeKey updatedAt() {
        return new AuthUserAttributeKey(UPDATED_AT);
    }

    public static AuthUserAttributeKey website() {
        return new AuthUserAttributeKey("website");
    }

    public static AuthUserAttributeKey zoneInfo() {
        return new AuthUserAttributeKey(ZONE_INFO);
    }

    public static AuthUserAttributeKey custom(String str) {
        return new AuthUserAttributeKey(str);
    }

    public int hashCode() {
        return ObjectsCompat.hash(getKeyString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUserAttributeKey.class != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getKeyString(), ((AuthUserAttributeKey) obj).getKeyString());
    }

    public String toString() {
        return "AuthUserAttributeKey {attributeKey=" + this.attributeKey + AbstractJsonLexerKt.END_OBJ;
    }
}
