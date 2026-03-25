package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57362ygw extends RxBus.TaskDescription {
    public static final Application Companion = new Application(null);
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int copydefault;

    /* JADX INFO: renamed from: o.ygw$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ygw.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57362ygw(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        super("event_web_token_expire_logout");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.copydefault = i;
        this.KWHzl = str2;
    }
}
