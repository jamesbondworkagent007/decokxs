package o;

import com.okinc.business.defi.dapp.net.DeFiApiService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: o.dxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C15061dxH {
    public static final C15061dxH AEQbTJ = new C15061dxH();
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.dxG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15061dxH.copydefault();
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.dxI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C15061dxH.KWHzl();
        }
    });
    public static final int copydefault = 8;

    private C15061dxH() {
    }

    public final Retrofit AhwBna() {
        java.lang.Object value = KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (Retrofit) value;
    }

    public static final Retrofit copydefault() {
        return new Retrofit.Builder().baseUrl(C43292rmY.OLrzqt.fJNWhG()).addConverterFactory(C8059avb.KWHzl(C43284rmQ.KWHzl(), C43284rmQ.copydefault())).build();
    }

    public final DeFiApiService EZpvd() {
        java.lang.Object value = OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (DeFiApiService) value;
    }

    public static final DeFiApiService KWHzl() {
        return (DeFiApiService) AEQbTJ.AhwBna().create(DeFiApiService.class);
    }
}
