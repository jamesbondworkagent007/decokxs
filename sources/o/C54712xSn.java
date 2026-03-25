package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.trade.source.search.TradeSearchGroup;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xSn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C54712xSn extends xRQ {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fARcdN = 8;
    public int getNewProxyInstance;
    public int iwGUEr;
    public InterfaceC58217yxC uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        return true;
    }

    public C54712xSn() {
        this.getNewProxyInstance = 1;
        OLrzqt(new Function1() { // from class: o.xSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54712xSn.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
        java.lang.String strAEQbTJ = qTC.copydefault.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "usdt")) {
            this.iwGUEr = 0;
            this.getNewProxyInstance = 1;
        } else if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "usdc")) {
            this.iwGUEr = 1;
            this.getNewProxyInstance = 0;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        Objects.toString(interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.AEQbTJ() : null);
    }

    /* JADX INFO: renamed from: o.xSn$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xSn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final Unit copydefault(C54712xSn c54712xSn, int i) {
        c54712xSn.EZpvd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xSn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void search$default(C54712xSn c54712xSn, java.lang.String str, MutableLiveData mutableLiveData, java.lang.Boolean bool, java.lang.String str2, Function1 function1, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: o.xSx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C54712xSn.OLrzqt((BizInstrument) obj2));
                }
            };
        }
        Function1 function12 = function1;
        if ((i & 32) != 0) {
            z = false;
        }
        c54712xSn.KWHzl(str, mutableLiveData, bool2, str3, function12, z);
    }

    public final void KWHzl(@NotNull final java.lang.String str, @NotNull final MutableLiveData<java.util.List<TradeSearchGroup>> mutableLiveData, final java.lang.Boolean bool, final java.lang.String str2, @NotNull final Function1<? super BizInstrument, java.lang.Boolean> function1, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC58217yxC interfaceC58217yxC = this.uzCIH;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg abstractC58247yxgJust = AbstractC58247yxg.just("");
        final Function1 function12 = new Function1() { // from class: o.xSt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54712xSn.copydefault(this.copydefault, str, function1, z, (java.lang.String) obj);
            }
        };
        AbstractC58247yxg abstractC58247yxgObserveOn = abstractC58247yxgJust.map(new InterfaceC58229yxO() { // from class: o.xSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C54712xSn.valueOf(function12, obj);
            }
        }).subscribeOn(yBP.EZpvd()).observeOn(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.xSu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54712xSn.AEQbTJ(mutableLiveData, this, bool, str2, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.xSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54712xSn.isConnected(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.xSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54712xSn.KWHzl((java.lang.Throwable) obj);
            }
        };
        this.uzCIH = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.xSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C54712xSn.values(function14, obj);
            }
        });
    }

    public static final java.util.ArrayList valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    public static final java.util.ArrayList copydefault(C54712xSn c54712xSn, java.lang.String str, Function1 function1, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return C54704xSf.matchingV2$default(C54704xSf.OLrzqt, c54712xSn.OLrzqt(), StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), function1, z, false, 16, null);
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(MutableLiveData mutableLiveData, C54712xSn c54712xSn, java.lang.Boolean bool, java.lang.String str, java.util.ArrayList arrayList) {
        Intrinsics.copydefault((java.lang.Object) str);
        Intrinsics.copydefault(arrayList);
        mutableLiveData.postValue(c54712xSn.OLrzqt(bool, str, arrayList));
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        th.getMessage();
        C6777aVl.Companion.EZpvd(new java.lang.Exception("TradeSearchLoader:" + th.getMessage()));
        return Unit.INSTANCE;
    }
}
