package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54301xDi extends xKJ<C55804xqp<StrategyDetailsResponse>> {
    public java.lang.String EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C54301xDi() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:16) call: o.xDi.<init>(boolean):void type: THIS */
    public /* synthetic */ C54301xDi(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public C54301xDi(boolean z) {
        this.OLrzqt = z;
        this.EZpvd = "";
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<StrategyDetailsResponse>>> EZpvd() {
        AbstractC58185ywX<ResponseData<C55804xqp<StrategyDetailsResponse>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54301xDi.KWHzl(this.KWHzl, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54301xDi.KWHzl(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xDi$TaskDescription */
    public static final class TaskDescription extends AbstractC55719xpJ {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<StrategyDetailsResponse>>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(InterfaceC58184ywW<ResponseData<C55804xqp<StrategyDetailsResponse>>> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2);
            this.copydefault = interfaceC58184ywW;
        }

        @Override // o.AbstractC55727xpR
        public void OLrzqt(java.lang.String str, StrategyDetailsResponse strategyDetailsResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            this.copydefault.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, strategyDetailsResponse, null, null, 12, null), null, 46, null));
        }

        @Override // o.AbstractC55727xpR
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    public static final void KWHzl(C54301xDi c54301xDi, InterfaceC58184ywW interfaceC58184ywW) {
        java.lang.Object actionBar;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (c54301xDi.OLrzqt) {
            actionBar = new TaskDescription(interfaceC58184ywW, c54301xDi.EZpvd, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        } else {
            actionBar = new ActionBar(interfaceC58184ywW, c54301xDi.EZpvd, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        }
        objArr[0] = actionBar;
        c54301xDi.EZpvd(yDY.copydefault(objArr));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54301xDi.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    /* JADX INFO: renamed from: o.xDi$ActionBar */
    public static final class ActionBar extends AbstractC55722xpM {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<StrategyDetailsResponse>>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(InterfaceC58184ywW<ResponseData<C55804xqp<StrategyDetailsResponse>>> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2);
            this.copydefault = interfaceC58184ywW;
        }

        @Override // o.AbstractC55727xpR
        public void OLrzqt(java.lang.String str, StrategyDetailsResponse strategyDetailsResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
            this.copydefault.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, strategyDetailsResponse, null, null, 12, null), null, 46, null));
        }

        @Override // o.AbstractC55727xpR
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    public static final void KWHzl(C54301xDi c54301xDi) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54301xDi.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}
