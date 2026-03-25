package o;

import com.google.gson.Gson;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLD implements pLC {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final Gson OLrzqt;
    public final Function1<java.lang.String, java.lang.String> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public pLD(@NotNull Function1<? super java.lang.String, java.lang.String> function1, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.copydefault = function1;
        this.OLrzqt = gson;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pLD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.pLC
    public java.util.List<java.lang.String> EZpvd() {
        java.lang.String strInvoke = this.copydefault.invoke("lifecycle_link_domain_config");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strInvoke)) {
            return ((pLB) this.OLrzqt.fromJson(strInvoke, pLB.class)).EZpvd();
        }
        return pLH.Companion.OLrzqt();
    }

    @Override // o.pLC
    public boolean copydefault() {
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault.invoke("oklinks_param_passing_enabled"), (java.lang.Object) "true");
    }

    @Override // o.pLC
    public java.util.List<java.lang.String> OLrzqt() {
        java.lang.String strInvoke = this.copydefault.invoke("oklinks_deferred_deeplinks_blocklist");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strInvoke)) {
            return ((C38093pLz) this.OLrzqt.fromJson(strInvoke, C38093pLz.class)).KWHzl();
        }
        return yDY.AhwBna();
    }
}
