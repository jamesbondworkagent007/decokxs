package o;

import aws.sdk.kotlin.runtime.config.profile.ConfigSectionType;
import com.google.android.gms.common.Scopes;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.PipedInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectStreamException {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PipedInputStream.TaskDescription OLrzqt(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
        ConfigSectionType configSectionType;
        Intrinsics.checkNotNullParameter(putField, "");
        if (!ObjectStreamConstants.OLrzqt(putField)) {
            return null;
        }
        boolean z = true;
        java.util.List<java.lang.String> listCopydefault = ObjectStreamClass.copydefault(C59454zhO.DbNXlk(C59454zhO.fetchVPNInfo(ObjectStreamClass.OLrzqt(ObjectStreamClass.AEQbTJ(putField.EZpvd())), 1), 1), 2);
        boolean z2 = !Intrinsics.EZpvd(CollectionsKt___CollectionsKt.firstOrNull(listCopydefault), (java.lang.Object) "default");
        java.lang.String str = listCopydefault.get(0);
        switch (str.hashCode()) {
            case -1572100904:
                if (str.equals("sso-session")) {
                    configSectionType = ConfigSectionType.SSO_SESSION;
                } else {
                    configSectionType = ConfigSectionType.UNKNOWN;
                }
                break;
            case -309425751:
                if (str.equals(Scopes.PROFILE)) {
                    configSectionType = ConfigSectionType.PROFILE;
                    break;
                }
                break;
            case 1379209310:
                if (str.equals("services")) {
                    configSectionType = ConfigSectionType.SERVICES;
                    break;
                }
                break;
            case 1544803905:
                if (!str.equals("default")) {
                }
                break;
        }
        java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(listCopydefault);
        java.lang.String str3 = str2 != null ? str2 : "";
        if ((listCopydefault.size() != 1 || !Intrinsics.EZpvd((java.lang.Object) listCopydefault.get(0), (java.lang.Object) "default")) && (listCopydefault.size() != 2 || str3.length() <= 0 || !z2 || !ObjectStreamClass.EZpvd(listCopydefault.get(1)))) {
            z = false;
        }
        return new PipedInputStream.TaskDescription(str3, configSectionType, z2, z);
    }

    public static final PipedInputStream.TaskDescription KWHzl(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(putField, "");
        if (!ObjectStreamConstants.EZpvd(putField)) {
            return null;
        }
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C59454zhO.DbNXlk(C59454zhO.fetchVPNInfo(ObjectStreamClass.OLrzqt(ObjectStreamClass.AEQbTJ(putField.EZpvd())), 1), 1)).toString();
        return new PipedInputStream.TaskDescription(string, ConfigSectionType.PROFILE, false, ObjectStreamClass.EZpvd(string));
    }

    public static final PipedInputStream.StateListAnimator AEQbTJ(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(putField, "");
        if (!ObjectStreamConstants.KWHzl(putField) || taskDescription == null) {
            return null;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = ObjectStreamClass.KWHzl(putField.EZpvd());
        return new PipedInputStream.StateListAnimator(pairKWHzl.component1(), ObjectStreamClass.AEQbTJ(pairKWHzl.component2()));
    }

    public static final PipedInputStream.ActionBar EZpvd(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(putField, "");
        if (!ObjectStreamConstants.AEQbTJ(putField) || stateListAnimator == null || stateListAnimator.AEQbTJ().length() == 0) {
            return null;
        }
        return new PipedInputStream.ActionBar(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) putField.EZpvd()).toString());
    }

    public static final PipedInputStream.Activity copydefault(@NotNull PutField putField, PipedInputStream.TaskDescription taskDescription, PipedInputStream.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(putField, "");
        if (!ObjectStreamConstants.djBIcL(putField) || stateListAnimator == null || stateListAnimator.AEQbTJ().length() > 0) {
            return null;
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = ObjectStreamClass.KWHzl(putField.EZpvd());
        return new PipedInputStream.Activity(pairKWHzl.component1(), pairKWHzl.component2());
    }
}
