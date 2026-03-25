package o;

import androidx.fragment.app.FragmentActivity;
import com.just.agentweb.DefaultWebClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33058mpL {
    public static /* synthetic */ java.lang.Boolean browse$default(androidx.fragment.app.Fragment fragment, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return java.lang.Boolean.valueOf(KWHzl(activity, str, z));
        }
        return null;
    }

    public static /* synthetic */ boolean browse$default(android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return KWHzl(context, str, z);
    }

    public static final boolean KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setData(android.net.Uri.parse(str));
            if (z) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            pUU.AEQbTJ("tag", e);
            return false;
        }
    }

    public static /* synthetic */ java.lang.Boolean share$default(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return java.lang.Boolean.valueOf(EZpvd(activity, str, str2));
        }
        return null;
    }

    public static /* synthetic */ boolean share$default(android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return EZpvd(context, str, str2);
    }

    public static final boolean EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", str2);
            intent.putExtra("android.intent.extra.TEXT", str);
            context.startActivity(android.content.Intent.createChooser(intent, null));
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            pUU.AEQbTJ("tag", e);
            return false;
        }
    }

    public static /* synthetic */ java.lang.Boolean email$default(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return java.lang.Boolean.valueOf(OLrzqt(activity, str, str2, str3));
        }
        return null;
    }

    public static /* synthetic */ boolean email$default(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return OLrzqt(context, str, str2, str3);
    }

    public static final boolean OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
        intent.setData(android.net.Uri.parse(androidx.core.net.MailTo.MAILTO_SCHEME));
        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{str});
        if (str2.length() > 0) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (str3.length() > 0) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    public static /* synthetic */ boolean sendSMS$default(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return copydefault(activity, str, str2);
        }
        return false;
    }

    public static /* synthetic */ boolean sendSMS$default(android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return copydefault(context, str, str2);
    }

    public static final boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(DefaultWebClient.SCHEME_SMS + str));
            intent.putExtra("sms_body", str2);
            context.startActivity(intent);
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return false;
        }
    }
}
