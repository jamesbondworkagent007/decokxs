package o;

import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45770swp {
    public final android.content.Context AEQbTJ;

    public C45770swp(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(new java.net.URI(str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.String lowerCase = null;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.net.URI uri = (java.net.URI) objM7377constructorimpl;
        if (uri == null) {
            return;
        }
        java.lang.String scheme = uri.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "https") || Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "http")) {
            copydefault(str);
        } else {
            AEQbTJ(uri, this.AEQbTJ);
        }
    }

    public final void AEQbTJ(java.net.URI uri, android.content.Context context) {
        java.lang.String strSubstringAfter$default = StringsKt__StringsKt.substringAfter$default(C33129mqd.gEmmrt(uri), uri.getScheme() + "://", (java.lang.String) null, 2, (java.lang.Object) null);
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strSubstringAfter$default, (java.lang.CharSequence) "?", false, 2, (java.lang.Object) null)) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, strSubstringAfter$default, null, new Function1() { // from class: o.swo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45770swp.OLrzqt((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), context, strSubstringAfter$default, null, new Function1() { // from class: o.swm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45770swp.EZpvd((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.AEQbTJ, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
    }
}
