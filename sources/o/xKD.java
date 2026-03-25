package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.BizApiException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class xKD {
    public Function1<? super kotlin.Pair<java.lang.String, ResponseData<java.lang.Object>>, Unit> AhwBna;
    public int AkhnZx;
    public int DbNXlk;
    public Function1<? super java.lang.Boolean, Unit> fetchVPNInfo;
    public boolean isConnected;
    public Function1<? super kotlin.Pair<java.lang.String, ResponseData<java.lang.Object>>, Unit> values;
    public final C56109xwc<kotlin.Pair<java.lang.String, java.lang.Object>> AYXKKw = new C56109xwc<>();
    public final C56109xwc<kotlin.Pair<java.lang.String, java.lang.Exception>> gEmmrt = new C56109xwc<>();
    public final C56109xwc<java.lang.Boolean> valueOf = new C56109xwc<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56109xwc<java.lang.Boolean> AuCTel() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super kotlin.Pair<java.lang.String, ResponseData<java.lang.Object>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.values = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fetchVPNInfo = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull Function1<? super kotlin.Pair<java.lang.String, ResponseData<java.lang.Object>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56109xwc<kotlin.Pair<java.lang.String, java.lang.Exception>> fARcdN() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56109xwc<kotlin.Pair<java.lang.String, java.lang.Object>> fJNWhG() {
        return this.AYXKKw;
    }

    public abstract java.util.List<xKK> values();

    public final void fIwbmz() {
        if (values().isEmpty()) {
            throw new java.lang.Exception("Please add at least one useCase before execute!");
        }
        ejfBZ();
        for (xKK xkk : values()) {
            if (this.isConnected) {
                return;
            }
            EZpvd(xkk);
            if (xkk.values()) {
                xKK.Activity.execute$default(xkk, 0L, 1, null);
            } else {
                this.DbNXlk++;
            }
        }
    }

    public final void EZpvd(final xKK xkk) {
        xKE xke = xkk instanceof xKE ? (xKE) xkk : null;
        if (xke != null) {
            xke.KWHzl(new Function1() { // from class: o.xKF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xKD.EZpvd(this.KWHzl, xkk, (ResponseData) obj);
                }
            });
        }
    }

    public final void isConnected() {
        Function1<? super java.lang.Boolean, Unit> function1;
        if (this.DbNXlk + this.AkhnZx == values().size()) {
            if (this.values == null || (function1 = this.fetchVPNInfo) == null) {
                this.valueOf.postValue(java.lang.Boolean.TRUE);
            } else if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
            fetchVPNInfo();
        }
    }

    public final void ejfBZ() {
        fetchVPNInfo();
        this.AkhnZx = 0;
        this.DbNXlk = 0;
        this.isConnected = false;
    }

    public final void fetchVPNInfo() {
        this.isConnected = true;
        java.util.Iterator<xKK> it = values().iterator();
        while (it.hasNext()) {
            it.next().AYXKKw();
        }
    }

    public static final Unit EZpvd(xKD xkd, xKK xkk, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            java.lang.Object data = responseData.getData();
            if (data != null) {
                xkd.AYXKKw.setValue(C56390yDp.OLrzqt(xkk.bB_(), data));
            }
            Function1<? super kotlin.Pair<java.lang.String, ResponseData<java.lang.Object>>, Unit> function1 = xkd.values;
            if (function1 != null) {
                function1.invoke(new kotlin.Pair(xkk.bB_(), responseData));
            }
            xkd.DbNXlk++;
            xkd.isConnected();
        } else {
            xkd.gEmmrt.setValue(new kotlin.Pair<>(xkk.bB_(), new BizApiException(responseData.getMsg(), C33129mqd.gEmmrt(java.lang.Integer.valueOf(responseData.getCode())), null, null, null, 28, null)));
            Function1<? super kotlin.Pair<java.lang.String, ResponseData<java.lang.Object>>, Unit> function12 = xkd.AhwBna;
            if (function12 != null) {
                function12.invoke(new kotlin.Pair(xkk.bB_(), responseData));
            }
            if (((xKE) xkk).fARcdN()) {
                xkd.AkhnZx++;
                xkd.isConnected();
            } else {
                xkd.isConnected = true;
                Function1<? super java.lang.Boolean, Unit> function13 = xkd.fetchVPNInfo;
                if (function13 != null) {
                    function13.invoke(java.lang.Boolean.FALSE);
                }
                xkd.valueOf.postValue(java.lang.Boolean.FALSE);
                xkd.fetchVPNInfo();
            }
        }
        return Unit.INSTANCE;
    }
}
