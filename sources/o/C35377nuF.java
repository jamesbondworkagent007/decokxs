package o;

import androidx.core.os.BundleCompat;
import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nuF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35377nuF {
    public static final android.os.Bundle OLrzqt(@NotNull BroadcastMessagePageParam broadcastMessagePageParam) {
        Intrinsics.checkNotNullParameter(broadcastMessagePageParam, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("ARG_REQUEST", broadcastMessagePageParam);
        return bundle;
    }

    public static final BroadcastMessagePageParam AEQbTJ(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.Object parcelable = BundleCompat.getParcelable(bundle, "ARG_REQUEST", BroadcastMessagePageParam.class);
        Intrinsics.copydefault(parcelable);
        return (BroadcastMessagePageParam) parcelable;
    }

    public static final BroadcastMessagePageParam copydefault(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = android.os.Bundle.EMPTY;
        }
        Intrinsics.copydefault(extras);
        return AEQbTJ(extras);
    }

    public static final InterfaceC56387yDm<BroadcastMessagePageParam> KWHzl(@NotNull final android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        return C56392yDr.copydefault(new Function0() { // from class: o.nuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35377nuF.EZpvd(activity);
            }
        });
    }

    public static final BroadcastMessagePageParam EZpvd(android.app.Activity activity) {
        android.content.Intent intent = activity.getIntent();
        if (intent == null) {
            intent = new android.content.Intent();
        }
        return copydefault(intent);
    }

    public static final InterfaceC56387yDm<BroadcastMessagePageParam> copydefault(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return C56392yDr.copydefault(new Function0() { // from class: o.nuD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35377nuF.AEQbTJ(fragment);
            }
        });
    }

    public static final BroadcastMessagePageParam AEQbTJ(androidx.fragment.app.Fragment fragment) {
        android.os.Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = android.os.Bundle.EMPTY;
        }
        Intrinsics.copydefault(arguments);
        return AEQbTJ(arguments);
    }
}
