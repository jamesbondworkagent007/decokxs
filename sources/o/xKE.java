package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.TradeLiveData;
import com.okinc.network.okg.response.ResponseData;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xKL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xKE<Resp> implements xKL<Resp> {
    public static final Application Companion = new Application(null);
    public static final int iwGUEr = 8;
    public boolean AxsJAY;
    public boolean DTwDnp;
    public MutableLiveData<?> gHZMYf;
    public InterfaceC58217yxC getFieldNames;
    public InterfaceC54501xKt<Resp, ?> getNewProxyInstance;
    public InterfaceC54492xKk<Resp> hDKMBd;
    public long sSMYrx;
    public boolean uzCIH;
    public InterfaceC58217yxC wlaJM;
    public boolean zuBGHE;
    public final TradeLiveData<java.lang.Boolean> AuCTelauCTel = new TradeLiveData<>();
    public final MutableLiveData<java.lang.String> zLjUOn = new MutableLiveData<>();
    public final C56109xwc<java.lang.Exception> zsXlph = new C56109xwc<>();
    public final C56109xwc<ResponseData<Resp>> AwvSrB = new C56109xwc<>();
    public boolean AubY = true;
    public volatile int QOLQEE = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.MutableLiveData<Resp> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(@NotNull MutableLiveData<Resp> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.gHZMYf = mutableLiveData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKK
    public LiveData<java.lang.Boolean> AkhnZx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AuCTel() {
        this.DTwDnp = true;
    }

    public abstract AbstractC58185ywX<ResponseData<Resp>> EZpvd() throws java.lang.Exception;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: androidx.lifecycle.MutableLiveData<UIResp> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.xKt<Resp, UIResp> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <UIResp> void OLrzqt(@NotNull MutableLiveData<UIResp> mutableLiveData, @NotNull InterfaceC54501xKt<Resp, UIResp> interfaceC54501xKt) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(interfaceC54501xKt, "");
        this.gHZMYf = mutableLiveData;
        this.getNewProxyInstance = interfaceC54501xKt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL() {
        this.uzCIH = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fIwbmz() {
        this.AxsJAY = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56109xwc<ResponseData<Resp>> fetchVPNInfo() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AhwBna()Landroidx/lifecycle/LiveData; */
    @Override // o.xKK
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public C56109xwc<java.lang.Exception> AhwBna() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xKK
    public boolean values() {
        return !this.zuBGHE || this.QOLQEE == -1;
    }

    @Override // o.xKK
    public java.lang.String bB_() {
        return xKL.ActionBar.KWHzl(this);
    }

    @Override // o.xKK
    public java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return xKL.ActionBar.AEQbTJ(this);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xKE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.xKL
    public void KWHzl(@NotNull Function1<? super ResponseData<Resp>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C54496xKo c54496xKo = new C54496xKo(function1);
        java.lang.Object objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(c54496xKo.getClass().getClassLoader(), new java.lang.Class[]{InterfaceC54492xKk.class}, new Activity(c54496xKo));
        Intrinsics.copydefault(objNewProxyInstance, "");
        this.hDKMBd = (InterfaceC54492xKk) objNewProxyInstance;
    }

    @Override // o.xKK
    public void OLrzqt(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.getFieldNames;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgTimer = AbstractC58247yxg.timer(j, java.util.concurrent.TimeUnit.MILLISECONDS, yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.xKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xKE.KWHzl(this.EZpvd, (java.lang.Long) obj);
            }
        };
        this.getFieldNames = abstractC58247yxgTimer.subscribe(new InterfaceC58227yxM() { // from class: o.xKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xKE.valueOf(function1, obj);
            }
        });
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(xKE xke, java.lang.Long l) {
        xke.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(boolean z) {
        InterfaceC58217yxC interfaceC58217yxCEZpvd;
        try {
            java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
            Intrinsics.copydefault(genericSuperclass, "");
            java.lang.reflect.Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
            java.lang.reflect.Type type = (java.lang.reflect.Type) yDV.AuCTelauCTel(actualTypeArguments);
            this.AuCTelauCTel.postValue(java.lang.Boolean.TRUE);
            this.sSMYrx = java.lang.System.currentTimeMillis();
            pUU.KWHzl("AbsUseCase", bB_() + " request start, please wait");
            AbstractC58185ywX<ResponseData<Resp>> abstractC58185ywXEZpvd = EZpvd();
            pUU.KWHzl("AbsUseCase", bB_() + " request start , flowable=" + abstractC58185ywXEZpvd);
            MutableLiveData<?> mutableLiveData = this.gHZMYf;
            TradeLiveData<java.lang.Boolean> tradeLiveData = this.AuCTelauCTel;
            C56109xwc<java.lang.Exception> c56109xwc = this.zsXlph;
            C56109xwc<ResponseData<Resp>> c56109xwc2 = this.AwvSrB;
            MutableLiveData<java.lang.String> mutableLiveData2 = this.zLjUOn;
            InterfaceC54501xKt<Resp, ?> interfaceC54501xKt = this.getNewProxyInstance;
            boolean z2 = this.uzCIH;
            boolean z3 = this.DTwDnp;
            boolean z4 = this.AubY;
            InterfaceC54492xKk<Resp> interfaceC54492xKk = this.hDKMBd;
            Intrinsics.copydefault(type);
            C54493xKl c54493xKl = new C54493xKl(mutableLiveData, tradeLiveData, c56109xwc, c56109xwc2, mutableLiveData2, interfaceC54501xKt, z2, z3, z4, interfaceC54492xKk, type, new Function0() { // from class: o.xKG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return xKE.OLrzqt(this.KWHzl);
                }
            });
            InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
            if (interfaceC58217yxC != null) {
                if (!(!interfaceC58217yxC.isDisposed())) {
                    interfaceC58217yxC = null;
                }
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
            }
            if (z) {
                interfaceC58217yxCEZpvd = c54493xKl.KWHzl(abstractC58185ywXEZpvd);
            } else {
                interfaceC58217yxCEZpvd = c54493xKl.EZpvd(abstractC58185ywXEZpvd, bB_());
            }
            this.wlaJM = interfaceC58217yxCEZpvd;
        } catch (java.lang.Exception e) {
            pUU.KWHzl(bB_(), e.getClass().getName() + e.getMessage());
            this.AuCTelauCTel.postValue(java.lang.Boolean.FALSE);
            this.zsXlph.postValue(e);
        }
    }

    public static final Unit OLrzqt(xKE xke) {
        xke.QOLQEE++;
        return Unit.INSTANCE;
    }

    public boolean isConnected() {
        InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
        return interfaceC58217yxC != null && interfaceC58217yxC.isDisposed();
    }

    public final java.lang.String DbNXlk() {
        return java.lang.String.valueOf(this.zLjUOn.getValue());
    }

    @Override // o.InterfaceC54502xKu
    public void AYXKKw() {
        InterfaceC58217yxC interfaceC58217yxC = this.wlaJM;
        if (interfaceC58217yxC != null && !interfaceC58217yxC.isDisposed()) {
            InterfaceC58217yxC interfaceC58217yxC2 = this.wlaJM;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
            pUU.KWHzl("AbsUseCase", bB_() + " dispose now!!! ");
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.getFieldNames;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        this.AuCTelauCTel.postValue(java.lang.Boolean.FALSE);
    }

    public final class Activity implements InvocationHandler {
        public java.lang.Object OLrzqt;

        public Activity(java.lang.Object obj) {
            this.OLrzqt = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object obj, @NotNull java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.IllegalAccessException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(method, "");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long j = xKE.this.sSMYrx;
            pUU.EZpvd("AbsUseCase", xKE.this.bB_() + " request end，cost time: " + (jCurrentTimeMillis - j));
            java.lang.Object obj2 = this.OLrzqt;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            java.lang.Object objInvoke = method.invoke(obj2, java.util.Arrays.copyOf(objArr, objArr.length));
            xKE.this.AYXKKw();
            pUU.EZpvd("AbsUseCase", xKE.this.bB_() + " dispose now!!! ");
            return objInvoke;
        }
    }
}
