package o;

import com.okinc.okimcore.feature.notification.model.NotificationSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37208opW extends C44373sNk {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.opW$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.C44373sNk, o.InterfaceC44291sKj
    public void KWHzl(@NotNull C44467sQx c44467sQx) {
        Intrinsics.checkNotNullParameter(c44467sQx, "");
        super.KWHzl(c44467sQx);
        pUU.EZpvd("WSMessageListener", "onReceiveMessage: " + c44467sQx);
        C37207opV.copydefault.AEQbTJ((C44363sNa) null, c44467sQx, NotificationSource.WS);
    }

    @Override // o.C44373sNk, o.InterfaceC44291sKj
    public void EZpvd(@NotNull C44464sQu c44464sQu) {
        Intrinsics.checkNotNullParameter(c44464sQu, "");
        super.EZpvd(c44464sQu);
        pUU.EZpvd("WSMessageListener", "onRecallEvent: " + c44464sQu);
        C37207opV.copydefault.AEQbTJ((C44363sNa) null, new C44467sQx(c44464sQu.AEQbTJ()), NotificationSource.WS);
    }
}
