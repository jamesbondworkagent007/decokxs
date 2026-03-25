package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56207xyU extends xKE<java.util.List<? extends HomeStrategyCardResult>> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public java.lang.String AkhnZx;
    public java.lang.String values = "";
    public java.lang.String AEQbTJ = "";
    public java.lang.String OLrzqt = "";
    public java.lang.String DbNXlk = "";
    public java.lang.String EZpvd = "";
    public java.lang.String djBIcL = "";
    public java.lang.String copydefault = "";
    public java.lang.String valueOf = "";
    public java.lang.String gEmmrt = "";
    public java.lang.String AYXKKw = "";
    public java.lang.String AhwBna = "";
    public java.lang.String isConnected = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56207xyU copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AEQbTJ = str;
        this.isConnected = str2;
        this.AYXKKw = str5;
        this.AhwBna = str6;
        this.valueOf = str3;
        this.gEmmrt = str4;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56207xyU copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, java.lang.String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.values = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.DbNXlk = str4;
        this.EZpvd = str5;
        this.djBIcL = str6;
        this.copydefault = str7;
        this.valueOf = str8;
        this.gEmmrt = str9;
        this.AYXKKw = str10;
        this.AhwBna = str11;
        this.AkhnZx = str12;
        return this;
    }

    /* JADX INFO: renamed from: o.xyU$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xyU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.HomeStrategyCardResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends HomeStrategyCardResult>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2 = this.AkhnZx;
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "LOCAL_TRADER")) {
            this.AkhnZx = "lead_trader";
            str = "1";
        } else {
            str = Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "lead_trader") ? "2" : "0";
        }
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchHomeStrategyCards(this.values, this.AEQbTJ, this.OLrzqt, this.DbNXlk, this.EZpvd, this.djBIcL, this.copydefault, this.valueOf, this.gEmmrt, this.AYXKKw, this.AhwBna, this.isConnected, this.AkhnZx, str);
    }
}
