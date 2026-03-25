package o;

import com.okinc.common.okcore.net.OKCoreDohManagerImpl$setCorDomain$1;
import com.okinc.common.okcore.net.OKCoreDohManagerImpl$setH5CorDomain$1;
import com.okinc.network.okg.config.NetworkStringEnum;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mfM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32529mfM implements InterfaceC4310BbG {
    public static final Application Companion = new Application(null);
    public static final InterfaceC56387yDm<java.lang.String> EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mfO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32529mfM.copydefault();
        }
    });

    @Override // o.InterfaceC4310BbG
    public InterfaceC4274BaX OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C32533mfQ(new OKCoreDohManagerImpl$setCorDomain$1(str, str2, str3, str4, j, null));
    }

    @Override // o.InterfaceC4310BbG
    public InterfaceC4274BaX copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C32533mfQ(new OKCoreDohManagerImpl$setH5CorDomain$1(str, str2, j, null));
    }

    @Override // o.InterfaceC4310BbG
    public void AEQbTJ(java.lang.String str) {
        C43372rnz.copydefault.KWHzl(str);
    }

    /* JADX INFO: renamed from: o.mfM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mfM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String AEQbTJ() {
            return (java.lang.String) C32529mfM.EZpvd.getValue();
        }
    }

    public static final java.lang.String copydefault() {
        java.lang.String strInvoke;
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        return (function1ZsXlph == null || (strInvoke = function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR)) == null) ? "" : strInvoke;
    }
}
