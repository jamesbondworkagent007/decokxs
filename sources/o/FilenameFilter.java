package o;

import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.FileFilter;
import o.FileInputStream;
import o.FilePermission;

/* JADX INFO: loaded from: classes.dex */
public final class FilenameFilter {
    public static final FileReader valueOf(ObjectStreamField objectStreamField) {
        java.lang.String orNull$default;
        if (objectStreamField.AEQbTJ("web_identity_token_file") || (orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "role_arn", null, 2, null)) == null) {
            return null;
        }
        return new FileReader(orNull$default, ObjectStreamField.getOrNull$default(objectStreamField, "role_session_name", null, 2, null), ObjectStreamField.getOrNull$default(objectStreamField, "external_id", null, 2, null));
    }

    public static final FileInputStream copydefault(FileFilter fileFilter) {
        if (fileFilter instanceof FileFilter.ActionBar) {
            return ((FileFilter.ActionBar) fileFilter).OLrzqt();
        }
        if (fileFilter instanceof FileFilter.Activity) {
            throw new ProviderConfigurationException(((FileFilter.Activity) fileFilter).EZpvd(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final FileFilter AYXKKw(ObjectStreamField objectStreamField) {
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "role_arn", null, 2, null);
        java.lang.String orNull$default2 = ObjectStreamField.getOrNull$default(objectStreamField, "web_identity_token_file", null, 2, null);
        java.lang.String orNull$default3 = ObjectStreamField.getOrNull$default(objectStreamField, "role_session_name", null, 2, null);
        if (orNull$default2 == null) {
            return null;
        }
        if (orNull$default == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `role_arn`");
        }
        return new FileFilter.ActionBar(new FileInputStream.PendingIntent(orNull$default, orNull$default2, orNull$default3));
    }

    public static final FileFilter KWHzl(ObjectStreamField objectStreamField) {
        if (!objectStreamField.AEQbTJ("sso_account_id") && !objectStreamField.AEQbTJ("sso_role_name")) {
            return null;
        }
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "sso_start_url", null, 2, null);
        if (orNull$default == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `sso_start_url`");
        }
        java.lang.String orNull$default2 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_region", null, 2, null);
        if (orNull$default2 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `sso_region`");
        }
        java.lang.String orNull$default3 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_account_id", null, 2, null);
        if (orNull$default3 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `sso_account_id`");
        }
        java.lang.String orNull$default4 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_role_name", null, 2, null);
        if (orNull$default4 != null) {
            return new FileFilter.ActionBar(new FileInputStream.TaskDescription(orNull$default, orNull$default2, orNull$default3, orNull$default4));
        }
        return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `sso_role_name`");
    }

    public static final FileFilter EZpvd(ObjectStreamField objectStreamField, ObjectOutputStream objectOutputStream) {
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "sso_session", null, 2, null);
        if (orNull$default == null) {
            return null;
        }
        ObjectStreamField objectStreamField2 = objectOutputStream.AEQbTJ().get(orNull$default);
        if (objectStreamField2 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") references non-existing sso_session = `" + orNull$default + '`');
        }
        java.lang.String orNull$default2 = ObjectStreamField.getOrNull$default(objectStreamField2, "sso_start_url", null, 2, null);
        if (orNull$default2 == null) {
            return new FileFilter.Activity("sso-session (" + orNull$default + ") missing `sso_start_url`");
        }
        java.lang.String orNull$default3 = ObjectStreamField.getOrNull$default(objectStreamField2, "sso_region", null, 2, null);
        if (orNull$default3 == null) {
            return new FileFilter.Activity("sso-session (" + orNull$default + ") missing `sso_region`");
        }
        java.lang.String orNull$default4 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_account_id", null, 2, null);
        if (orNull$default4 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `sso_account_id`");
        }
        java.lang.String orNull$default5 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_role_name", null, 2, null);
        if (orNull$default5 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `sso_role_name`");
        }
        java.lang.String orNull$default6 = ObjectStreamField.getOrNull$default(objectStreamField2, "sso_region", null, 2, null);
        java.lang.String orNull$default7 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_region", null, 2, null);
        if (orNull$default6 != null && orNull$default7 != null && !Intrinsics.EZpvd((java.lang.Object) orNull$default6, (java.lang.Object) orNull$default7)) {
            return new FileFilter.Activity("sso-session (" + orNull$default + ") sso_region = `" + orNull$default6 + "` does not match profile (" + objectStreamField.OLrzqt() + ") sso_region = `" + orNull$default7 + '`');
        }
        java.lang.String orNull$default8 = ObjectStreamField.getOrNull$default(objectStreamField2, "sso_start_url", null, 2, null);
        java.lang.String orNull$default9 = ObjectStreamField.getOrNull$default(objectStreamField, "sso_start_url", null, 2, null);
        if (orNull$default8 != null && orNull$default9 != null && !Intrinsics.EZpvd((java.lang.Object) orNull$default8, (java.lang.Object) orNull$default9)) {
            return new FileFilter.Activity("sso-session (" + orNull$default + ") sso_start_url = `" + orNull$default8 + "` does not match profile (" + objectStreamField.OLrzqt() + ") sso_start_url = `" + orNull$default9 + '`');
        }
        return new FileFilter.ActionBar(new FileInputStream.Application(orNull$default, orNull$default2, orNull$default3, orNull$default4, orNull$default5));
    }

    public static final FileFilter gEmmrt(ObjectStreamField objectStreamField) {
        if (!objectStreamField.AEQbTJ("credential_process")) {
            return null;
        }
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "credential_process", null, 2, null);
        if (orNull$default != null) {
            return new FileFilter.ActionBar(new FileInputStream.ActionBar(orNull$default));
        }
        return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `credential_process`");
    }

    public static final FileFilter AhwBna(ObjectStreamField objectStreamField) {
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "aws_access_key_id", null, 2, null);
        java.lang.String orNull$default2 = ObjectStreamField.getOrNull$default(objectStreamField, "aws_secret_access_key", null, 2, null);
        java.lang.String orNull$default3 = ObjectStreamField.getOrNull$default(objectStreamField, "aws_account_id", null, 2, null);
        if (orNull$default == null && orNull$default2 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") did not contain credential information");
        }
        if (orNull$default == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `aws_access_key_id`");
        }
        if (orNull$default2 == null) {
            return new FileFilter.Activity("profile (" + objectStreamField.OLrzqt() + ") missing `aws_secret_access_key`");
        }
        return new FileFilter.ActionBar(new FileInputStream.StateListAnimator(Spanned.AEQbTJ(orNull$default, orNull$default2, (24 & 4) != 0 ? null : ObjectStreamField.getOrNull$default(objectStreamField, "aws_session_token", null, 2, null), (24 & 8) != 0 ? null : null, (24 & 16) != 0 ? null : null, (24 & 32) != 0 ? null : orNull$default3)));
    }

    public static final FileInputStream djBIcL(ObjectStreamField objectStreamField) {
        FileFilter fileFilterAhwBna = AhwBna(objectStreamField);
        if (fileFilterAhwBna instanceof FileFilter.ActionBar) {
            return ((FileFilter.ActionBar) fileFilterAhwBna).OLrzqt();
        }
        return null;
    }

    public static final FilePermission EZpvd(ObjectStreamField objectStreamField) {
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "source_profile", null, 2, null);
        java.lang.String orNull$default2 = ObjectStreamField.getOrNull$default(objectStreamField, "credential_source", null, 2, null);
        if (orNull$default != null && orNull$default2 != null) {
            throw new ProviderConfigurationException("profile (" + objectStreamField.OLrzqt() + ") contained both `source_profile` and `credential_source`. Only one or the other can be defined.", null, 2, null);
        }
        if (orNull$default == null && orNull$default2 == null) {
            throw new ProviderConfigurationException("profile (" + objectStreamField.OLrzqt() + ") must contain `source_profile` or `credential_source` but neither were defined", null, 2, null);
        }
        if (orNull$default != null && orNull$default2 == null) {
            if (Intrinsics.EZpvd((java.lang.Object) orNull$default, (java.lang.Object) objectStreamField.OLrzqt())) {
                return FilePermission.Application.KWHzl;
            }
            return new FilePermission.ActionBar(orNull$default);
        }
        return FilePermission.Application.KWHzl;
    }

    public static final FileInputStream AEQbTJ(ObjectStreamField objectStreamField, ObjectOutputStream objectOutputStream) {
        java.lang.String orNull$default = ObjectStreamField.getOrNull$default(objectStreamField, "credential_source", null, 2, null);
        if (orNull$default != null) {
            return new FileInputStream.Activity(orNull$default);
        }
        FileFilter fileFilterAYXKKw = AYXKKw(objectStreamField);
        if (fileFilterAYXKKw == null) {
            fileFilterAYXKKw = EZpvd(objectStreamField, objectOutputStream);
        }
        if (fileFilterAYXKKw == null) {
            fileFilterAYXKKw = KWHzl(objectStreamField);
        }
        if (fileFilterAYXKKw == null) {
            fileFilterAYXKKw = gEmmrt(objectStreamField);
        }
        if (fileFilterAYXKKw == null) {
            fileFilterAYXKKw = AhwBna(objectStreamField);
        }
        return copydefault(fileFilterAYXKKw);
    }
}
