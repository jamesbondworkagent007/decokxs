package o;

import com.okinc.network.okg.tag.RequestTagEnum;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iBA extends C43280rmM {
    public final java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iBA() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: o.iBA.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ iBA(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iBA(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new iBF());
        if (C23580iBq.AEQbTJ.OLrzqt() != null) {
            builderInitClientBuilder.addInterceptor(new StateListAnimator());
        }
        if (this.EZpvd.length() > 0 && this.copydefault.length() > 0) {
            builderInitClientBuilder.addInterceptor(new iBI(this.EZpvd, this.copydefault, this.AEQbTJ));
        }
        return builderInitClientBuilder;
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        java.util.List<Interceptor> listBuildPreCustomInterceptors = super.buildPreCustomInterceptors();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listBuildPreCustomInterceptors.iterator();
        while (it.hasNext()) {
            arrayList.add((Interceptor) it.next());
        }
        arrayList.add(new iBD());
        return arrayList;
    }

    @Override // o.C43280rmM
    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.WEB3;
    }

    public static final class StateListAnimator implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "");
            Request.Builder builderNewBuilder = chain.request().newBuilder();
            for (Map.Entry<java.lang.String, java.lang.String> entry : ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).aM_().entrySet()) {
                builderNewBuilder.header(entry.getKey(), entry.getValue());
            }
            return chain.proceed(builderNewBuilder.build());
        }
    }
}
