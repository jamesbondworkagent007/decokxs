package o;

import android.content.res.Resources;
import androidx.core.view.ViewCompat;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5222Jk {
    public static final C5222Jk KWHzl = new C5222Jk();

    private C5222Jk() {
    }

    public final java.lang.String AEQbTJ(@NotNull android.view.View view) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(KWHzl.OLrzqt(view));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            if (view.getId() == -1) {
                string = null;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(EIP1271Verifier.hexPrefix);
                java.lang.String string2 = java.lang.Integer.toString(view.getId(), CharsKt__CharJVMKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string2, "");
                sb.append(string2);
                string = sb.toString();
            }
            objM7377constructorimpl = string;
        }
        return (java.lang.String) objM7377constructorimpl;
    }

    public final java.lang.String OLrzqt(@NotNull android.view.View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "");
        if (view.getId() == -1 || EZpvd(view)) {
            throw new Resources.NotFoundException();
        }
        android.content.res.Resources resources = view.getContext().getResources();
        java.lang.String resourceEntryName = resources != null ? resources.getResourceEntryName(view.getId()) : null;
        return resourceEntryName == null ? "" : resourceEntryName;
    }

    public final boolean EZpvd(android.view.View view) {
        return (view.getId() & ViewCompat.MEASURED_STATE_MASK) == 0 && (view.getId() & 16777215) != 0;
    }
}
