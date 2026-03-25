package o;

import com.okinc.planet.biz_performance.data.PositionAssetDto;
import com.okinc.planet.biz_performance.usecase.FetchProfileAssetsUseCase$execute$2;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBE extends AbstractC46360tRl<PlanetAuthorId, java.util.List<? extends tBG>> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final tQP AEQbTJ;
    public java.lang.String EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final InterfaceC46387tSl djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, kotlin.coroutines.Continuation] */
    @Override // o.AbstractC46360tRl
    public /* synthetic */ java.lang.Object AEQbTJ(PlanetAuthorId planetAuthorId, Continuation<? super java.util.List<? extends tBG>> continuation) {
        return AEQbTJ(planetAuthorId.copydefault(), (Continuation<? super java.util.List<tBG>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tBE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull tQP tqp) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(tqp, "");
        this.copydefault = coroutineDispatcher;
        this.djBIcL = interfaceC46387tSl;
        this.AEQbTJ = tqp;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.tBL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tBE.KWHzl();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.tBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(tBE.EZpvd(this.OLrzqt));
            }
        });
        this.EZpvd = "USD";
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tBE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final InterfaceC54581xNr EZpvd() {
        return (InterfaceC54581xNr) this.OLrzqt.getValue();
    }

    public static final InterfaceC54581xNr KWHzl() {
        return C46392tSq.EZpvd.EZpvd();
    }

    public static final boolean EZpvd(tBE tbe) {
        xOW newProxyInstance;
        if (!tbe.djBIcL.gEmmrt()) {
            return false;
        }
        InterfaceC54581xNr interfaceC54581xNrEZpvd = tbe.EZpvd();
        return Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrEZpvd == null || (newProxyInstance = interfaceC54581xNrEZpvd.getNewProxyInstance()) == null) ? null : newProxyInstance.sSMYrx()), (java.lang.Object) "1");
    }

    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<tBG>> continuation) {
        return SupervisorKt.supervisorScope(new FetchProfileAssetsUseCase$execute$2(this, str, null), continuation);
    }

    public final java.util.List<tBG> OLrzqt(java.util.List<PositionAssetDto> list) {
        if (EZpvd() == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((PositionAssetDto) it.next()).EZpvd());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        java.util.Iterator<PositionAssetDto> it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (Intrinsics.EZpvd(it2.next().EZpvd(), BigDecimal.ZERO)) {
                break;
            }
            i2++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            PositionAssetDto positionAssetDto = (PositionAssetDto) obj;
            java.lang.String strCopydefault = positionAssetDto.copydefault();
            BigDecimal bigDecimalMultiply = positionAssetDto.EZpvd().divide(bigDecimalValueOf, MathContext.DECIMAL64).multiply(BigDecimal.ONE);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "");
            BigDecimal bigDecimal = i == i2 + (-1) ? new BigDecimal("0.0001") : BigDecimal.ZERO;
            Intrinsics.copydefault(bigDecimal);
            BigDecimal bigDecimalSubtract = bigDecimalMultiply.subtract(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
            arrayList.add(new tBG(strCopydefault, bigDecimalSubtract.floatValue()));
            i++;
        }
        return arrayList;
    }
}
