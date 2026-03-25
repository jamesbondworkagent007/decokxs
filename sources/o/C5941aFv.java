package o;

import com.okinc.auth.impl.passkey.domain.CheckCredentialManagerUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5941aFv {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final C5904aFK EZpvd;
    public final C5943aFx KWHzl;
    public final InterfaceC5687aBF copydefault;

    @yCM
    public C5941aFv(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C5943aFx c5943aFx, @NotNull C5904aFK c5904aFK, @NotNull InterfaceC5687aBF interfaceC5687aBF) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c5943aFx, "");
        Intrinsics.checkNotNullParameter(c5904aFK, "");
        Intrinsics.checkNotNullParameter(interfaceC5687aBF, "");
        this.AEQbTJ = coroutineDispatcher;
        this.KWHzl = c5943aFx;
        this.EZpvd = c5904aFK;
        this.copydefault = interfaceC5687aBF;
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new CheckCredentialManagerUseCase$invoke$2(this, null), continuation);
    }

    public final java.lang.String copydefault() {
        java.lang.String str = android.os.Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX INFO: renamed from: o.aFv$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFv.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
