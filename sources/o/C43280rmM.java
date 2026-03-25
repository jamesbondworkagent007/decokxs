package o;

import com.okinc.network.okg.decrypt.OKDecryptInterceptor;
import com.okinc.network.okg.tag.RequestTagEnum;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.Converter;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: o.rmM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43280rmM extends C43395roV {
    public static final java.lang.String TAG = "CommonHttpRequestConfig";
    public final InterfaceC56387yDm<OkHttpClient.Builder> clientBuilder;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final InterfaceC56387yDm<C43280rmM> lazy$delegate = C56392yDr.copydefault(new Function0() { // from class: o.rmN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43280rmM.lazy_delegate$lambda$8();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43280rmM() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C43395roV
    public InterfaceC56387yDm<OkHttpClient.Builder> getClientBuilder$OKNetwork_network() {
        return this.clientBuilder;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE (wrap:o.rmY:0x0004: SGET  A[WRAPPED] (LINE:44) o.rmY.OLrzqt o.rmY) VIRTUAL call: o.rmY.fJNWhG():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:44)) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:44) call: o.rmM.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C43280rmM(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C43292rmY.OLrzqt.fJNWhG() : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43280rmM(@NotNull java.lang.String str) {
        super(str, C56392yDr.copydefault(new Function0() { // from class: o.rmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43280rmM._init_$lambda$0();
            }
        }), yDY.gEmmrt(C8059avb.KWHzl(C43284rmQ.KWHzl(), C43284rmQ.copydefault()), GsonConverterFactory.create()), C56402yEa.EZpvd(RxJava2CallAdapterFactory.create()));
        Intrinsics.checkNotNullParameter(str, "");
        this.clientBuilder = C56392yDr.copydefault(new Function0() { // from class: o.rmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return this.AEQbTJ.buildClientBuilder();
            }
        });
    }

    public static final OkHttpClient.Builder _init_$lambda$0() {
        return C43282rmO.OLrzqt.OLrzqt();
    }

    /* JADX INFO: renamed from: o.rmM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rmM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C43280rmM copydefault() {
            return (C43280rmM) C43280rmM.lazy$delegate.getValue();
        }
    }

    public static final C43280rmM lazy_delegate$lambda$8() {
        return new C43280rmM(null, 1, 0 == true ? 1 : 0);
    }

    public final OkHttpClient.Builder buildClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder;
        C43282rmO c43282rmO = C43282rmO.OLrzqt;
        c43282rmO.copydefault().lock();
        try {
            try {
                builderInitClientBuilder = initClientBuilder();
                c43282rmO.copydefault().unlock();
            } catch (java.lang.Exception e) {
                java.lang.String message = e.getMessage();
                if (message == null) {
                    message = "";
                }
                pUU.AEQbTJ(TAG, message, e);
                C43282rmO.OLrzqt.copydefault().unlock();
                builderInitClientBuilder = null;
            }
            return builderInitClientBuilder == null ? C43282rmO.OLrzqt.OLrzqt() : builderInitClientBuilder;
        } catch (java.lang.Throwable th) {
            C43282rmO.OLrzqt.copydefault().unlock();
            throw th;
        }
    }

    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderNewBuilder = C43282rmO.OLrzqt.OLrzqt().build().newBuilder();
        RequestTagEnum requestHeaderTag = getRequestHeaderTag();
        if (requestHeaderTag != RequestTagEnum.NONE) {
            builderNewBuilder.addInterceptor(new C43382roI(requestHeaderTag));
        }
        java.util.Iterator<T> it = buildPreCustomInterceptors().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addInterceptor((Interceptor) it.next());
        }
        java.util.Iterator<T> it2 = C43282rmO.OLrzqt.EZpvd().copydefault().iterator();
        while (it2.hasNext()) {
            builderNewBuilder.addInterceptor((Interceptor) it2.next());
        }
        builderNewBuilder.addInterceptor(new C43275rmH(null, 1, 0 == true ? 1 : 0));
        if (C43292rmY.OLrzqt.QKVWgx()) {
            builderNewBuilder.addInterceptor(new C43389roP());
        }
        builderNewBuilder.addInterceptor(new C6889aXr());
        builderNewBuilder.addInterceptor(new C43400roa());
        builderNewBuilder.addInterceptor(new C6896aXy());
        builderNewBuilder.addInterceptor(new C6892aXu(new C43342rnV()));
        builderNewBuilder.addInterceptor(new C6878aXg(requestHeaderTag));
        builderNewBuilder.addInterceptor(new C6850aXE());
        builderNewBuilder.addInterceptor(new OKDecryptInterceptor());
        java.util.Iterator<T> it3 = C43282rmO.OLrzqt.EZpvd().KWHzl().iterator();
        while (it3.hasNext()) {
            builderNewBuilder.addNetworkInterceptor((Interceptor) it3.next());
        }
        builderNewBuilder.addInterceptor(new C6875aXd());
        builderNewBuilder.addInterceptor(new C43421rov());
        builderNewBuilder.addInterceptor(new C6893aXv());
        java.util.Iterator<T> it4 = C43282rmO.OLrzqt.EZpvd().AEQbTJ().iterator();
        while (it4.hasNext()) {
            builderNewBuilder.addInterceptor((Interceptor) it4.next());
        }
        return builderNewBuilder;
    }

    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return yDY.AhwBna();
    }

    @Override // o.C43395roV
    public java.util.List<Converter.Factory> proceedConvertFactories(@NotNull java.util.List<? extends Converter.Factory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (Converter.Factory factory : list) {
            arrayList.add(new C43420rou(factory));
            arrayList.add(factory);
        }
        return arrayList;
    }

    @Override // o.C43395roV
    public java.util.List<Interceptor> getPostInterceptors$OKNetwork_network() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            arrayList = new java.util.ArrayList();
            arrayList.add(new C43340rnT(new C43342rnV()));
            arrayList.add(new C43380roG());
        }
        return arrayList;
    }

    public RequestTagEnum getRequestHeaderTag() {
        return RequestTagEnum.NONE;
    }
}
