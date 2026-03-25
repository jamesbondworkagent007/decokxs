package o;

import com.okinc.network.model.CallChainExtraInfo;
import com.okinc.network.request.retrofit.TaggedCallFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.roV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43395roV implements InterfaceC43391roR {
    public static final int $stable = 8;
    public final java.lang.String baseUrl;
    public final java.util.List<CallAdapter.Factory> callAdapters;
    public final InterfaceC56387yDm<OkHttpClient.Builder> clientBuilder;
    public final java.util.List<Converter.Factory> convertFactories;
    public int hashCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String getBaseUrl() {
        return this.baseUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<CallAdapter.Factory> getCallAdapters() {
        return this.callAdapters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC56387yDm<OkHttpClient.Builder> getClientBuilder$OKNetwork_network() {
        return this.clientBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<Converter.Factory> getConvertFactories() {
        return this.convertFactories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends retrofit2.CallAdapter$Factory> */
    /* JADX WARN: Multi-variable type inference failed */
    public java.util.List<CallAdapter.Factory> proceedCallAdapters(@NotNull java.util.List<? extends CallAdapter.Factory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends retrofit2.Converter$Factory> */
    /* JADX WARN: Multi-variable type inference failed */
    public java.util.List<Converter.Factory> proceedConvertFactories(@NotNull java.util.List<? extends Converter.Factory> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends retrofit2.Converter$Factory> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends retrofit2.CallAdapter$Factory> */
    /* JADX WARN: Multi-variable type inference failed */
    public C43395roV(@NotNull java.lang.String str, @NotNull InterfaceC56387yDm<OkHttpClient.Builder> interfaceC56387yDm, @NotNull java.util.List<? extends Converter.Factory> list, @NotNull java.util.List<? extends CallAdapter.Factory> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.baseUrl = str;
        this.clientBuilder = interfaceC56387yDm;
        this.convertFactories = list;
        this.callAdapters = list2;
    }

    @Override // o.InterfaceC43391roR
    public <T> T createService(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        addPostInterceptor();
        Retrofit.Builder builderCallFactory = new Retrofit.Builder().baseUrl(getBaseUrl()).callFactory(new TaggedCallFactory(getClientBuilder$OKNetwork_network().getValue().build(), C56423yEv.EZpvd(C56390yDp.OLrzqt(CallChainExtraInfo.class, new Function0() { // from class: o.roZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C43395roV.createService$lambda$0();
            }
        }))));
        java.util.Iterator<T> it = proceedCallAdapters(getCallAdapters()).iterator();
        while (it.hasNext()) {
            builderCallFactory.addCallAdapterFactory((CallAdapter.Factory) it.next());
        }
        java.util.Iterator<T> it2 = proceedConvertFactories(getConvertFactories()).iterator();
        while (it2.hasNext()) {
            builderCallFactory.addConverterFactory(new C43394roU((Converter.Factory) it2.next()));
        }
        T t = (T) builderCallFactory.build().create(yHE.OLrzqt(interfaceC56551yJo));
        Intrinsics.copydefault(t, "");
        return t;
    }

    public static final CallChainExtraInfo createService$lambda$0() {
        return new CallChainExtraInfo();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int iHashCode = getBaseUrl().hashCode();
            this.hashCode = iHashCode;
            int iHashCode2 = (iHashCode * 31) + getClientBuilder$OKNetwork_network().hashCode();
            this.hashCode = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + getConvertFactories().hashCode();
            this.hashCode = iHashCode3;
            this.hashCode = (iHashCode3 * 31) + getCallAdapters().hashCode();
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.EZpvd(getClass(), obj.getClass())) {
            return false;
        }
        C43395roV c43395roV = (C43395roV) obj;
        return Intrinsics.EZpvd((java.lang.Object) getBaseUrl(), (java.lang.Object) c43395roV.getBaseUrl()) && Intrinsics.EZpvd(getClientBuilder$OKNetwork_network(), c43395roV.getClientBuilder$OKNetwork_network()) && Intrinsics.EZpvd(getConvertFactories(), c43395roV.getConvertFactories()) && Intrinsics.EZpvd(getCallAdapters(), c43395roV.getCallAdapters());
    }

    public java.util.List<Interceptor> getPostInterceptors$OKNetwork_network() {
        synchronized (this) {
        }
        return null;
    }

    public final void addPostInterceptor() {
        java.util.List<Interceptor> listInterceptors = getClientBuilder$OKNetwork_network().getValue().interceptors();
        java.util.List<Interceptor> postInterceptors$OKNetwork_network = getPostInterceptors$OKNetwork_network();
        if (postInterceptors$OKNetwork_network != null) {
            for (Interceptor interceptor : postInterceptors$OKNetwork_network) {
                if (!listContainsClass(interceptor, listInterceptors)) {
                    getClientBuilder$OKNetwork_network().getValue().addInterceptor(interceptor);
                }
            }
        }
    }

    public final boolean listContainsClass(Interceptor interceptor, java.util.List<Interceptor> list) {
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Interceptor) it.next()).getClass().getName().equals(interceptor.getClass().getName())) {
                return true;
            }
        }
        return false;
    }
}
