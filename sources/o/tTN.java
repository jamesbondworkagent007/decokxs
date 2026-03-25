package o;

import androidx.camera.video.AudioStats;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tTN {
    public static final Application Companion = new Application(null);

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tTN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "cross") ? C33070mpX.AYXKKw(C47501trL.Fragment.gkJEwt) : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "isolated") ? C33070mpX.AYXKKw(C47501trL.Fragment.iZzfmt) : "";
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C46392tSq.EZpvd.AhwBna().OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, str2, null, null, 12, null) : null;
            int iHashCode = str3.hashCode();
            if (iHashCode != 108957) {
                return iHashCode != 3327612 ? (iHashCode == 109413500 && str3.equals("short")) ? "sell" : str3 : !str3.equals("long") ? str3 : "buy";
            }
            if (!str3.equals("net")) {
                return str3;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
                if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
                }
            } else if (C33129mqd.AEQbTJ(str4) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            }
        }

        public final C54536xML copydefault(@NotNull java.lang.String str, C54536xML c54536xML) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C59449zhJ.gEmmrt(str, "buy", true)) {
                if (c54536xML != null) {
                    return c54536xML.copydefault();
                }
            } else if (c54536xML != null) {
                return c54536xML.AuCTel();
            }
            return null;
        }
    }
}
