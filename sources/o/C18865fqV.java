package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.ScanStatusResponseBody;
import com.okinc.business.defi.biz.net.bean.UploadScanShareRequestBody;
import com.okinc.business.defi.biz.net.bean.UploadScanStatusRequestBody;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fqV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18865fqV extends AbstractC33073mpa {
    public C13934dbu copydefault = new C13934dbu();
    public final MutableLiveData<java.lang.Boolean> EZpvd = new MutableLiveData<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.net.bean.ScanStatusResponseBody>> */
    public final AbstractC58185ywX<ResponseData<ScanStatusResponseBody>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final UploadScanStatusRequestBody uploadScanStatusRequestBody = new UploadScanStatusRequestBody(str, str2, str3, i);
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18865fqV.KWHzl(this.copydefault, uploadScanStatusRequestBody, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.frc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18865fqV.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C18865fqV c18865fqV, UploadScanStatusRequestBody uploadScanStatusRequestBody, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c18865fqV.copydefault.EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), abstractC12782ctV.aUsmxb(), uploadScanStatusRequestBody);
    }

    public final void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.fqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18865fqV.KWHzl(objectRef, str, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.fqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18865fqV.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.fqT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18865fqV.OLrzqt(str4, str2, str3, this, objectRef, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.fqU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C18865fqV.AYXKKw(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.fqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18865fqV.KWHzl(this.OLrzqt, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fqX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18865fqV.djBIcL(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.fqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18865fqV.KWHzl((java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C18865fqV.AhwBna(function14, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd KWHzl(Ref.ObjectRef objectRef, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(abstractC12782ctV, str, 2).EZpvd();
    }

    public static final InterfaceC60096zvd AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, C18865fqV c18865fqV, Ref.ObjectRef objectRef, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str4, "");
        UploadScanShareRequestBody uploadScanShareRequestBody = new UploadScanShareRequestBody(str2, str3, str, xXX.EZpvd.KWHzl(str4, str));
        C13934dbu c13934dbu = c18865fqV.copydefault;
        T t = objectRef.element;
        Intrinsics.copydefault(t);
        java.lang.String strUSBtdM = ((AbstractC12782ctV) t).USBtdM();
        T t2 = objectRef.element;
        Intrinsics.copydefault(t2);
        java.lang.String strDbNXlk = ((AbstractC12782ctV) t2).DbNXlk();
        T t3 = objectRef.element;
        Intrinsics.copydefault(t3);
        return c13934dbu.copydefault(strUSBtdM, strDbNXlk, ((AbstractC12782ctV) t3).aUsmxb(), uploadScanShareRequestBody);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasStableIds), 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C18865fqV c18865fqV, ResponseData responseData) {
        boolean z = false;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            MutableLiveData<java.lang.Boolean> mutableLiveData = c18865fqV.EZpvd;
            ScanStatusResponseBody scanStatusResponseBody = (ScanStatusResponseBody) responseData.getData();
            if (scanStatusResponseBody != null && scanStatusResponseBody.getStatus() == 0) {
                z = true;
            }
            mutableLiveData.setValue(java.lang.Boolean.valueOf(z));
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getMsg())) {
            C55326xho.toastWithFailedIcon$default(responseData.getMsg(), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
