package o;

import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43702ruK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rAr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C41947rAr implements InterfaceC43234rlT {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.rAr$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rAr.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.KWHzl("KYCDeepLinkHandler", "PATH==comp/general/vendor/redirect");
        C43693ruB.OLrzqt("Api_Vendor_Back_View");
        java.util.HashMap map2 = new java.util.HashMap();
        for (Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            pUU.KWHzl("KYCDeepLinkHandler", ((java.lang.Object) key) + "==" + C33129mqd.gEmmrt(entry.getValue()));
            map2.put(entry.getKey(), C33129mqd.gEmmrt(entry.getValue()));
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) InterfaceC43702ruK.Activity.getInstance$default(InterfaceC43702ruK.Companion, null, null, 3, null).copydefault(map2));
        final Function1 function1 = new Function1() { // from class: o.rAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41947rAr.KWHzl((ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.rAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C41947rAr.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.rAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41947rAr.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.rAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C41947rAr.AEQbTJ(function12, obj);
            }
        });
        C43693ruB.OLrzqt("Url_Vendor_BackEnd_View");
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(ResponseData responseData) {
        C43693ruB.copydefault("Url_Vendor_BackCall_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "yes")));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        C43693ruB.copydefault("Url_Vendor_BackCall_View", C56424yEw.AYXKKw(C56390yDp.OLrzqt("is_success", "no")));
        return Unit.INSTANCE;
    }
}
