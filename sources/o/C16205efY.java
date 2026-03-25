package o;

import com.okinc.business.defi.biz.net.bean.CoinProtocol;
import com.okinc.business.defi.wallet.custom.CustomTokenRepositoryImpl$getCoinProtocolList$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.efY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16205efY implements InterfaceC16201efU {
    public final C12827cuN AEQbTJ;
    public final C13934dbu KWHzl;
    public final java.util.HashMap<java.lang.Long, ResponseData<java.util.List<CoinProtocol>>> copydefault;

    public C16205efY(@NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.KWHzl = c13934dbu;
        this.AEQbTJ = c12827cuN;
        this.copydefault = new java.util.HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC16201efU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(long j, boolean z, @NotNull Continuation<? super ResponseData<java.util.List<CoinProtocol>>> continuation) throws java.lang.Throwable {
        CustomTokenRepositoryImpl$getCoinProtocolList$1 customTokenRepositoryImpl$getCoinProtocolList$1;
        ResponseData<java.util.List<CoinProtocol>> responseData;
        C16205efY c16205efY;
        C16205efY c16205efY2;
        long j2 = j;
        if (continuation instanceof CustomTokenRepositoryImpl$getCoinProtocolList$1) {
            customTokenRepositoryImpl$getCoinProtocolList$1 = (CustomTokenRepositoryImpl$getCoinProtocolList$1) continuation;
            int i = customTokenRepositoryImpl$getCoinProtocolList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                customTokenRepositoryImpl$getCoinProtocolList$1.label = i - Integer.MIN_VALUE;
            } else {
                customTokenRepositoryImpl$getCoinProtocolList$1 = new CustomTokenRepositoryImpl$getCoinProtocolList$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = customTokenRepositoryImpl$getCoinProtocolList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = customTokenRepositoryImpl$getCoinProtocolList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!C16260ega.AEQbTJ().contains(C56443yFo.KWHzl(j))) {
                return new ResponseData(-1, null, null, null, null, null, 62, null);
            }
            if (z) {
                this.copydefault.clear();
                C13934dbu c13934dbu = this.KWHzl;
                customTokenRepositoryImpl$getCoinProtocolList$1.L$0 = this;
                customTokenRepositoryImpl$getCoinProtocolList$1.J$0 = j2;
                customTokenRepositoryImpl$getCoinProtocolList$1.label = 1;
                objOLrzqt = c13934dbu.OLrzqt(j2, customTokenRepositoryImpl$getCoinProtocolList$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                c16205efY2 = this;
                responseData = (ResponseData) objOLrzqt;
                if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                }
            } else {
                responseData = this.copydefault.get(C56443yFo.KWHzl(j));
                if (responseData == null) {
                    C13934dbu c13934dbu2 = this.KWHzl;
                    customTokenRepositoryImpl$getCoinProtocolList$1.L$0 = this;
                    customTokenRepositoryImpl$getCoinProtocolList$1.J$0 = j2;
                    customTokenRepositoryImpl$getCoinProtocolList$1.label = 2;
                    objOLrzqt = c13934dbu2.OLrzqt(j2, customTokenRepositoryImpl$getCoinProtocolList$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    c16205efY = this;
                    responseData = (ResponseData) objOLrzqt;
                    if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                    }
                }
            }
        } else if (i2 == 1) {
            j2 = customTokenRepositoryImpl$getCoinProtocolList$1.J$0;
            c16205efY2 = (C16205efY) customTokenRepositoryImpl$getCoinProtocolList$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            responseData = (ResponseData) objOLrzqt;
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                c16205efY2.copydefault.put(C56443yFo.KWHzl(j2), responseData);
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = customTokenRepositoryImpl$getCoinProtocolList$1.J$0;
            c16205efY = (C16205efY) customTokenRepositoryImpl$getCoinProtocolList$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            responseData = (ResponseData) objOLrzqt;
            if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                c16205efY.copydefault.put(C56443yFo.KWHzl(j2), responseData);
            }
        }
        return responseData;
    }

    public static final InterfaceC60096zvd KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.InterfaceC16201efU
    public Flow<java.util.List<C13924dbk>> OLrzqt() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.AEQbTJ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.egb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16205efY.OLrzqt((AbstractC12782ctV) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.efZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C16205efY.KWHzl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC60096zvdKWHzl, "");
        return ReactiveFlowKt.asFlow(interfaceC60096zvdKWHzl);
    }

    public static final InterfaceC60096zvd OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return abstractC12782ctV.gkJEwt();
    }
}
