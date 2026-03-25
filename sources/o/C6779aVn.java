package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6779aVn {
    public static final android.os.Bundle copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        if (fragment.getArguments() == null) {
            fragment.setArguments(new android.os.Bundle());
        }
        android.os.Bundle bundleRequireArguments = fragment.requireArguments();
        Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "");
        return bundleRequireArguments;
    }
}
