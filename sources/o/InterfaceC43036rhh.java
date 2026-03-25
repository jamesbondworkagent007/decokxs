package o;

import com.okinc.business.market.bean.TokenInfoForAlert;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43036rhh {
    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, TokenInfoForAlert tokenInfoForAlert, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super java.lang.Boolean> continuation);

    /* JADX INFO: renamed from: o.rhh$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object createPriceRemind$default(InterfaceC43036rhh interfaceC43036rhh, java.lang.String str, java.lang.String str2, int i, TokenInfoForAlert tokenInfoForAlert, androidx.fragment.app.FragmentManager fragmentManager, Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPriceRemind");
            }
            if ((i2 & 8) != 0) {
                tokenInfoForAlert = null;
            }
            return interfaceC43036rhh.OLrzqt(str, str2, i, tokenInfoForAlert, fragmentManager, continuation);
        }
    }
}
