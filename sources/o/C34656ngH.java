package o;

import androidx.lifecycle.SavedStateHandle;
import com.okinc.dexkline.dexlogic.error.DebugThrowException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34656ngH {
    public static /* synthetic */ java.lang.Object throwIfDebug$default(java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return AEQbTJ(th);
    }

    public static final <T> T AEQbTJ(java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new DebugThrowException(null, th, 1, null));
        return null;
    }

    public static /* synthetic */ java.lang.Object throwIfDebug$default(java.lang.Object obj, java.lang.Throwable th, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            th = null;
        }
        return AEQbTJ(obj, th);
    }

    public static final <T> T AEQbTJ(T t, java.lang.Throwable th) {
        C6777aVl.Companion.EZpvd(new DebugThrowException(null, th, 1, null));
        return t;
    }

    public static /* synthetic */ InterfaceC56387yDm getSourceType$default(android.app.Activity activity, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OLrzqt(activity, z);
    }

    public static final InterfaceC56387yDm<java.lang.String> OLrzqt(@NotNull final android.app.Activity activity, final boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        return C56392yDr.copydefault(new Function0() { // from class: o.ngL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34656ngH.KWHzl(activity, z);
            }
        });
    }

    public static final java.lang.String KWHzl(android.app.Activity activity, boolean z) {
        java.lang.String stringExtra;
        android.content.Intent intent = activity.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("source_type")) == null) ? !z ? (java.lang.String) throwIfDebug$default("default_trade", null, 2, null) : "default_trade" : stringExtra;
    }

    public static final InterfaceC56387yDm<java.lang.String> EZpvd(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return C56392yDr.copydefault(new Function0() { // from class: o.ngI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34656ngH.OLrzqt(fragment);
            }
        });
    }

    public static final java.lang.String OLrzqt(androidx.fragment.app.Fragment fragment) {
        java.lang.String string;
        android.os.Bundle arguments = fragment.getArguments();
        return (arguments == null || (string = arguments.getString("source_type")) == null) ? (java.lang.String) throwIfDebug$default("default_trade", null, 2, null) : string;
    }

    public static /* synthetic */ java.lang.String getSourceType$default(SavedStateHandle savedStateHandle, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "default_trade";
        }
        return EZpvd(savedStateHandle, str);
    }

    public static final java.lang.String EZpvd(@NotNull SavedStateHandle savedStateHandle, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = (java.lang.String) savedStateHandle.get("source_type");
        return str2 == null ? str : str2;
    }

    public static final android.os.Bundle AEQbTJ(@NotNull android.os.Bundle bundle, java.lang.String str) {
        Intrinsics.checkNotNullParameter(bundle, "");
        if (str == null || str.length() == 0) {
            throwIfDebug$default(null, 1, null);
        }
        bundle.putString("source_type", str);
        return bundle;
    }

    public static final android.content.Intent AEQbTJ(@NotNull android.content.Intent intent, java.lang.String str) {
        Intrinsics.checkNotNullParameter(intent, "");
        if (str == null || str.length() == 0) {
            throwIfDebug$default(null, 1, null);
        }
        intent.putExtra("source_type", str);
        return intent;
    }
}
