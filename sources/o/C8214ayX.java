package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8214ayX extends C43280rmM {
    public final java.util.List<Interceptor> KWHzl;
    public final java.util.List<Interceptor> OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final java.util.List<Interceptor> copydefault = yDY.AhwBna();
    public static final java.util.List<C47277tmx> EZpvd = C56402yEa.EZpvd(new C47277tmx(((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB()));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return copydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends okhttp3.Interceptor> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8214ayX(@NotNull java.util.List<? extends Interceptor> list) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
        this.KWHzl = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) EZpvd);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        java.util.Iterator<Interceptor> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            builderInitClientBuilder.addInterceptor(it.next());
        }
        return builderInitClientBuilder;
    }

    /* JADX INFO: renamed from: o.ayX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ayX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
