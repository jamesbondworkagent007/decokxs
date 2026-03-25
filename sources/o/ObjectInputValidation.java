package o;

import aws.sdk.kotlin.runtime.ConfigurationException;
import aws.sdk.kotlin.runtime.config.endpoints.AccountIdEndpointMode;
import aws.smithy.kotlin.runtime.client.config.RetryMode;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Locale;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.DL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectInputValidation {
    public static final java.lang.String AhwBna(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return ObjectStreamField.getOrNull$default(objectStreamField, "region", null, 2, null);
    }

    public static final java.lang.Integer EZpvd(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getIntOrNull$default(objectStreamField, "max_attempts", null, 2, null);
    }

    public static final RetryMode djBIcL(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        RetryMode retryMode = null;
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "retry_mode", null, 2, null);
        if (orNull$default != null) {
            RetryMode[] retryModeArrValues = RetryMode.values();
            int length = retryModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                RetryMode retryMode2 = retryModeArrValues[i];
                if (C59449zhJ.gEmmrt(retryMode2.name(), orNull$default, true)) {
                    retryMode = retryMode2;
                    break;
                }
                i++;
            }
            if (retryMode == null) {
                throw new ConfigurationException("retry_mode " + orNull$default + " is not supported, should be one of: " + yDV.joinToString$default(RetryMode.values(), ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1<RetryMode, java.lang.CharSequence>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsProfileKt$retryMode$1$2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    public final CharSequence invoke(@NotNull RetryMode retryMode3) {
                        Intrinsics.checkNotNullParameter(retryMode3, "");
                        String lowerCase = retryMode3.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        return lowerCase;
                    }
                }, 30, (java.lang.Object) null));
            }
        }
        return retryMode;
    }

    public static final java.lang.Boolean isConnected(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getBooleanOrNull$default(objectStreamField, "use_fips_endpoint", null, 2, null);
    }

    public static final java.lang.Boolean values(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getBooleanOrNull$default(objectStreamField, "use_dualstack_endpoint", null, 2, null);
    }

    public static final DL copydefault(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getUrlOrNull$default(objectStreamField, "endpoint_url", null, 2, null);
    }

    public static final java.lang.Boolean OLrzqt(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getBooleanOrNull$default(objectStreamField, "ignore_configured_endpoint_urls", null, 2, null);
    }

    public static final java.lang.String valueOf(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return ObjectStreamField.getOrNull$default(objectStreamField, "services", null, 2, null);
    }

    public static final java.lang.String gEmmrt(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return ObjectStreamField.getOrNull$default(objectStreamField, "sdk_ua_app_id", null, 2, null);
    }

    public static final AccountIdEndpointMode AEQbTJ(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        AccountIdEndpointMode accountIdEndpointMode = null;
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "account_id_endpoint_mode", null, 2, null);
        if (orNull$default != null) {
            AccountIdEndpointMode[] accountIdEndpointModeArrValues = AccountIdEndpointMode.values();
            int length = accountIdEndpointModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AccountIdEndpointMode accountIdEndpointMode2 = accountIdEndpointModeArrValues[i];
                if (C59449zhJ.gEmmrt(accountIdEndpointMode2.name(), orNull$default, true)) {
                    accountIdEndpointMode = accountIdEndpointMode2;
                    break;
                }
                i++;
            }
            if (accountIdEndpointMode == null) {
                throw new ConfigurationException("account_id_endpoint_mode " + orNull$default + " is not supported, should be one of: " + yDV.joinToString$default(AccountIdEndpointMode.values(), ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1<AccountIdEndpointMode, java.lang.CharSequence>() { // from class: aws.sdk.kotlin.runtime.config.profile.AwsProfileKt$accountIdEndpointMode$1$2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    public final CharSequence invoke(@NotNull AccountIdEndpointMode accountIdEndpointMode3) {
                        Intrinsics.checkNotNullParameter(accountIdEndpointMode3, "");
                        String lowerCase = accountIdEndpointMode3.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        return lowerCase;
                    }
                }, 30, (java.lang.Object) null));
            }
        }
        return accountIdEndpointMode;
    }

    public static final java.lang.Boolean KWHzl(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getBooleanOrNull$default(objectStreamField, "disable_request_compression", null, 2, null);
    }

    public static final java.lang.Long AYXKKw(@NotNull ObjectStreamField objectStreamField) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        return getLongOrNull$default(objectStreamField, "request_min_compression_size_bytes", null, 2, null);
    }

    public static /* synthetic */ java.lang.Boolean getBooleanOrNull$default(ObjectStreamField objectStreamField, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return OLrzqt(objectStreamField, str, str2);
    }

    public static final java.lang.Boolean OLrzqt(@NotNull ObjectStreamField objectStreamField, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = objectStreamField.AEQbTJ(str, str2);
        if (strAEQbTJ == null) {
            return null;
        }
        java.lang.String lowerCase = strAEQbTJ.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        java.lang.Boolean boolZLjUOn = StringsKt__StringsKt.zLjUOn(lowerCase);
        if (boolZLjUOn != null) {
            return java.lang.Boolean.valueOf(boolZLjUOn.booleanValue());
        }
        throw new ConfigurationException("Failed to parse config property " + EZpvd(str, str2) + " as a boolean");
    }

    public static /* synthetic */ java.lang.Integer getIntOrNull$default(ObjectStreamField objectStreamField, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return KWHzl(objectStreamField, str, str2);
    }

    public static final java.lang.Integer KWHzl(@NotNull ObjectStreamField objectStreamField, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = objectStreamField.AEQbTJ(str, str2);
        if (strAEQbTJ == null) {
            return null;
        }
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(strAEQbTJ);
        if (intOrNull != null) {
            return java.lang.Integer.valueOf(intOrNull.intValue());
        }
        throw new ConfigurationException("Failed to parse config property " + EZpvd(str, str2) + " as an integer");
    }

    public static /* synthetic */ java.lang.Long getLongOrNull$default(ObjectStreamField objectStreamField, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return copydefault(objectStreamField, str, str2);
    }

    public static final java.lang.Long copydefault(@NotNull ObjectStreamField objectStreamField, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = objectStreamField.AEQbTJ(str, str2);
        if (strAEQbTJ == null) {
            return null;
        }
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strAEQbTJ);
        if (fieldNames != null) {
            return java.lang.Long.valueOf(fieldNames.longValue());
        }
        throw new ConfigurationException("Failed to parse config property " + EZpvd(str, str2) + " as a long");
    }

    public static /* synthetic */ DL getUrlOrNull$default(ObjectStreamField objectStreamField, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return EZpvd(objectStreamField, str, str2);
    }

    public static final DL EZpvd(@NotNull ObjectStreamField objectStreamField, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(objectStreamField, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = objectStreamField.AEQbTJ(str, str2);
        if (strAEQbTJ == null) {
            return null;
        }
        try {
            return DL.StateListAnimator.parse$default(DL.AEQbTJ, strAEQbTJ, null, 2, null);
        } catch (java.lang.Exception e) {
            throw new ConfigurationException("Failed to parse config property " + EZpvd(str, str2) + " as a URL", e);
        }
    }

    public static /* synthetic */ java.lang.String buildKeyString$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return EZpvd(str, str2);
    }

    public static final java.lang.String EZpvd(java.lang.String str, java.lang.String str2) {
        return CollectionsKt___CollectionsKt.joinToString$default(yDY.valueOf(str, str2), JwtUtilsKt.JWT_DELIMITER, null, null, 0, null, null, 62, null);
    }
}
