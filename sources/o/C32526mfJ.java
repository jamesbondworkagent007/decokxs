package o;

import com.okinc.localization.bean.LanguageItem;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32526mfJ extends AbstractC32525mfI {
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32525mfI
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32525mfI
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32526mfJ(@NotNull pTU ptu, java.lang.String str) {
        super(ptu, str);
        Intrinsics.checkNotNullParameter(ptu, "");
        this.KWHzl = "LanguageListFromRemoteTask";
        this.copydefault = "remote server";
    }

    @Override // o.AbstractC32525mfI
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<LanguageItem>> continuation) {
        return EZpvd().OLrzqt(KWHzl(), continuation);
    }
}
