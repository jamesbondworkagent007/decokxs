package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9935bev extends AbstractC33073mpa {
    public final LiveData<java.util.List<C10525bqB>> AEQbTJ;
    public final C12827cuN AYXKKw;
    public final C10948byA EZpvd;
    public final MutableLiveData<java.util.List<C10525bqB>> KWHzl;
    public final MutableLiveData<CoinInfoBean> OLrzqt;
    public final LiveData<CoinInfoBean> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C9935bev() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.util.List<C10525bqB>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<CoinInfoBean> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0004: SGET  A[WRAPPED] (LINE:16) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:16)) : (r2v0 o.cuN))
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x000c: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0012: INVOKE (wrap:o.byG:0x0010: SGET  A[WRAPPED] (LINE:17) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:17)) : (r3v0 o.byA))
 A[MD:(o.cuN, o.byA):void (m)] (LINE:15) call: o.bev.<init>(o.cuN, o.byA):void type: THIS */
    public /* synthetic */ C9935bev(C12827cuN c12827cuN, C10948byA c10948byA, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA);
    }

    public C9935bev(@NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        this.AYXKKw = c12827cuN;
        this.EZpvd = c10948byA;
        MutableLiveData<java.util.List<C10525bqB>> mutableLiveData = new MutableLiveData<>();
        this.KWHzl = mutableLiveData;
        this.AEQbTJ = mutableLiveData;
        MutableLiveData<CoinInfoBean> mutableLiveData2 = new MutableLiveData<>();
        this.OLrzqt = mutableLiveData2;
        this.copydefault = mutableLiveData2;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull java.lang.String str2, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.AYXKKw.OLrzqt(str2, false);
        final Function1 function1 = new Function1() { // from class: o.beA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9935bev.KWHzl(this.OLrzqt, str, j, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.beG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9935bev.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.beF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9935bev.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.beD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9935bev.AhwBna(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
    }

    public static final Unit KWHzl(C9935bev c9935bev, java.lang.String str, long j, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        C10525bqB c10525bqBAEQbTJ;
        C10854bwM c10854bwMKWHzl = c9935bev.EZpvd.KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(str)));
        if (c10854bwMKWHzl == null) {
            return Unit.INSTANCE;
        }
        boolean z = c10854bwMKWHzl.giSNqX() && j != Long.MIN_VALUE;
        java.util.List listEZpvd = abstractC12782ctV.hrNTAI().get(c10854bwMKWHzl.fJNWhG());
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        java.util.Iterator it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C10525bqB) next).OLrzqt() == c10854bwMKWHzl.AhwBna()) {
                break;
            }
        }
        C10525bqB c10525bqB = (C10525bqB) next;
        if (z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listEZpvd) {
                if (((C10525bqB) obj).AEQbTJ() == j) {
                    arrayList.add(obj);
                }
            }
            listEZpvd = arrayList;
        }
        if ((listEZpvd.isEmpty() || c10525bqB == null) && (c10525bqBAEQbTJ = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(str)))) != null) {
            listEZpvd = C56402yEa.EZpvd(c10525bqBAEQbTJ);
        }
        c9935bev.KWHzl.setValue((java.util.List<C10525bqB>) listEZpvd);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(long j) {
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C32962mnV.unwrapResponseData$default(this.EZpvd.gEmmrt(j), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.beC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9935bev.AEQbTJ(this.AEQbTJ, (CoinInfoBean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.beB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9935bev.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.bez
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9935bev.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bey
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C9935bev.copydefault(function12, obj);
            }
        }));
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C9935bev c9935bev, CoinInfoBean coinInfoBean) {
        c9935bev.OLrzqt.setValue(coinInfoBean);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C9935bev c9935bev, java.lang.Throwable th) {
        c9935bev.OLrzqt.setValue(null);
        return Unit.INSTANCE;
    }
}
