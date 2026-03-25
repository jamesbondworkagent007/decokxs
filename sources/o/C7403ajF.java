package o;

import com.okinc.okuser.data.Token;
import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C7403ajF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ajF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7403ajF {
    public static final ActionBar Companion = new ActionBar(null);
    public static java.util.HashMap<java.lang.String, C57567ykp> AEQbTJ = new java.util.HashMap<>();
    public static final java.lang.String KWHzl = "jwtToken";
    public static final java.lang.String OLrzqt = "jwt";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C57567ykp copydefault(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, @NotNull OKWsDoh oKWsDoh) {
        return Companion.KWHzl(str, z, z2, z3, z4, oKWsDoh);
    }

    /* JADX INFO: renamed from: o.ajF$ActionBar */
    /* JADX INFO: loaded from: classes22.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ajF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C57567ykp getV5Connection$default(ActionBar actionBar, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, OKWsDoh oKWsDoh, int i, java.lang.Object obj) {
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
            return actionBar.KWHzl(str, z5, z6, z7, z8, oKWsDoh);
        }

        public final C57567ykp KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, @NotNull OKWsDoh oKWsDoh) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(oKWsDoh, "");
            if (str.length() == 0) {
                if (z) {
                    str = C43292rmY.OLrzqt.zuBGHE() + "/ws/v5/iprivate";
                } else {
                    str = C43292rmY.OLrzqt.zuBGHE() + "/ws/v5/ipublic";
                }
            }
            java.lang.String str2 = str;
            if (z) {
                Token tokenAhwBna = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().AhwBna();
                final java.lang.String value = tokenAhwBna != null ? tokenAhwBna.getValue() : null;
                return OLrzqt(str2, z, C7403ajF.OLrzqt, new Function0() { // from class: o.ajD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C7403ajF.ActionBar.EZpvd(value);
                    }
                }, z3, oKWsDoh);
            }
            return createV5Connection$default(this, str2, z, null, null, z3, oKWsDoh, 12, null);
        }

        public static final java.util.List EZpvd(java.lang.String str) {
            return C56402yEa.EZpvd(C56423yEv.EZpvd(C56390yDp.OLrzqt(C7403ajF.KWHzl, str)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: o.ajF$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C57567ykp createV5Connection$default(ActionBar actionBar, java.lang.String str, boolean z, java.lang.String str2, Function0 function0, boolean z2, OKWsDoh oKWsDoh, int i, java.lang.Object obj) {
            return actionBar.OLrzqt(str, z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : function0, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? OKWsDoh.V5 : oKWsDoh);
        }

        public final C57567ykp OLrzqt(java.lang.String str, boolean z, java.lang.String str2, Function0<? extends java.util.List<? extends java.lang.Object>> function0, boolean z2, OKWsDoh oKWsDoh) {
            return new C57567ykp(new C57527ykB(str, z, str2, function0, z2, oKWsDoh));
        }
    }
}
