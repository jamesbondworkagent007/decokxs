package o;

import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xHa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54401xHa {
    public static C57567ykp OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static java.util.HashMap<java.lang.String, C57567ykp> AEQbTJ = new java.util.HashMap<>();

    /* JADX INFO: renamed from: o.xHa$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xHa.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final java.util.List EZpvd(java.util.List list) {
            return list;
        }

        private TaskDescription() {
        }

        public final java.util.HashMap<java.lang.String, C57567ykp> EZpvd() {
            return C54401xHa.AEQbTJ;
        }

        public static /* synthetic */ C57567ykp getV5Connection$default(TaskDescription taskDescription, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, OKWsDoh oKWsDoh, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            boolean z5 = (i & 2) != 0 ? false : z;
            boolean z6 = (i & 4) != 0 ? false : z2;
            if ((i & 8) != 0) {
                z3 = true;
            }
            boolean z7 = z3;
            boolean z8 = (i & 16) == 0 ? z4 : false;
            if ((i & 32) != 0) {
                oKWsDoh = OKWsDoh.V5;
            }
            return taskDescription.copydefault(str, z5, z6, z7, z8, oKWsDoh);
        }

        public final C57567ykp copydefault(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, @NotNull OKWsDoh oKWsDoh) {
            java.lang.String str2;
            java.lang.String strEZpvd;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKWsDoh, "");
            if (str.length() != 0) {
                if (C54589xNz.EZpvd.EZpvd()) {
                    str2 = str + "?brokerId=9999";
                } else {
                    str2 = str;
                }
                pUU.KWHzl("TradeWsFactory", "domainUrl: " + str + " -- customizeUrl: " + str2);
            } else {
                C54408xHh c54408xHh = C54408xHh.copydefault;
                pUU.KWHzl("TradeWsFactory", "common needLogin: " + z + " -- getUrl: " + c54408xHh.EZpvd() + "  -- getPrivateUrl: " + c54408xHh.KWHzl());
                if (z) {
                    strEZpvd = c54408xHh.KWHzl();
                } else {
                    strEZpvd = c54408xHh.EZpvd();
                }
                str2 = strEZpvd;
            }
            if (C33129mqd.valueOf(java.lang.Integer.valueOf(str2.length()), 14)) {
                return null;
            }
            java.lang.String strEZpvd2 = C54411xHk.Companion.EZpvd(z, z3, z4, str2);
            C57567ykp c57567ykpCreateV5Connection$default = EZpvd().get(strEZpvd2);
            if (c57567ykpCreateV5Connection$default == null) {
                if (z) {
                    C55697xoo c55697xoo = C55697xoo.OLrzqt;
                    final java.util.List listEZpvd = C56402yEa.EZpvd(C56423yEv.EZpvd(C56390yDp.OLrzqt("jwtToken", c55697xoo.KWHzl())));
                    pUU.KWHzl("TradeWsFactory", "connection needLogin url " + str2 + "  -- loginTokenType: " + c55697xoo.valueOf());
                    c57567ykpCreateV5Connection$default = copydefault(str2, z, "jwt", new Function0() { // from class: o.xHe
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C54401xHa.TaskDescription.EZpvd(listEZpvd);
                        }
                    }, z3, oKWsDoh);
                } else {
                    pUU.KWHzl("TradeWsFactory", "connection notNeedLogin  url " + str2 + " ");
                    c57567ykpCreateV5Connection$default = createV5Connection$default(this, str2, z, null, null, z3, oKWsDoh, 12, null);
                }
                EZpvd().put(strEZpvd2, c57567ykpCreateV5Connection$default);
                pUU.KWHzl("TradeWsFactory", "wsnew  key: " + strEZpvd2);
            }
            pUU.KWHzl("TradeWsFactory", "wscache  key: " + strEZpvd2);
            return c57567ykpCreateV5Connection$default;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.xHa$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C57567ykp createV5Connection$default(TaskDescription taskDescription, java.lang.String str, boolean z, java.lang.String str2, Function0 function0, boolean z2, OKWsDoh oKWsDoh, int i, java.lang.Object obj) {
            return taskDescription.copydefault(str, z, (i & 4) != 0 ? null : str2, (Function0<? extends java.util.List<? extends java.lang.Object>>) ((i & 8) != 0 ? null : function0), (i & 16) != 0 ? true : z2, (i & 32) != 0 ? OKWsDoh.V5 : oKWsDoh);
        }

        public final C57567ykp copydefault(java.lang.String str, boolean z, java.lang.String str2, Function0<? extends java.util.List<? extends java.lang.Object>> function0, boolean z2, OKWsDoh oKWsDoh) {
            pUU.KWHzl("TradeWsFactory", "domainUrl: " + str + " needLogin = " + z + " disconnectWhenBackground = " + z2);
            C57567ykp c57567ykp = C54401xHa.OLrzqt;
            return c57567ykp == null ? new C57567ykp(new C57527ykB(str, z, str2, function0, z2, oKWsDoh)) : c57567ykp;
        }
    }
}
