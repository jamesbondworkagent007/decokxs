package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MG {
    public final MI EZpvd;
    public final ME OLrzqt;
    public static final Application Companion = new Application(null);
    public static final java.lang.Object copydefault = new java.lang.Object();
    public static final java.util.Map<java.lang.String, MG> AEQbTJ = new LinkedHashMap();

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ME) A[MD:(o.ME):void (m)] call: o.MG.<init>(o.ME):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MG(ME me2, DefaultConstructorMarker defaultConstructorMarker) {
        this(me2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MI KWHzl() {
        return this.EZpvd;
    }

    public MG(ME me2) {
        this.OLrzqt = me2;
        this.EZpvd = new ML(me2.AEQbTJ().copydefault(me2));
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final MG EZpvd(@NotNull ME me2) {
            MG mg;
            Intrinsics.checkNotNullParameter(me2, "");
            synchronized (MG.copydefault) {
                java.util.Map map = MG.AEQbTJ;
                java.lang.String strCopydefault = me2.copydefault();
                java.lang.Object mg2 = map.get(strCopydefault);
                if (mg2 == null) {
                    mg2 = new MG(me2, null);
                    map.put(strCopydefault, mg2);
                }
                mg = (MG) mg2;
            }
            return mg;
        }
    }
}
