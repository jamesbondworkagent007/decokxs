package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.SignalPositionReqGroup;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54305xDm extends xKJ<C55804xqp<java.util.List<? extends StrategyPositionResponse>>> {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = this.copydefault;
        if (str4 == null) {
            Intrinsics.gEmmrt("");
            str = null;
        } else {
            str = str4;
        }
        java.lang.String str5 = this.AEQbTJ;
        if (str5 == null) {
            Intrinsics.gEmmrt("");
            str2 = null;
        } else {
            str2 = str5;
        }
        java.lang.String str6 = this.KWHzl;
        if (str6 == null) {
            Intrinsics.gEmmrt("");
            str3 = null;
        } else {
            str3 = str6;
        }
        final SignalPositionReqGroup signalPositionReqGroup = new SignalPositionReqGroup(true, str, str2, str3, false, 16, (DefaultConstructorMarker) null);
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54305xDm.EZpvd(this.KWHzl, signalPositionReqGroup, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54305xDm.EZpvd(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xDm$TaskDescription */
    public static final class TaskDescription extends AbstractC55718xpI {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(SignalPositionReqGroup signalPositionReqGroup, InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<StrategyPositionResponse>>>> interfaceC58184ywW, java.lang.String str) {
            super(signalPositionReqGroup, str);
            this.copydefault = interfaceC58184ywW;
        }

        @Override // o.AbstractC55718xpI
        public void KWHzl(java.lang.String str, java.util.ArrayList<StrategyPositionResponse> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.copydefault.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, arrayList, null, null, 12, null), null, 46, null));
        }
    }

    public static final void EZpvd(C54305xDm c54305xDm, SignalPositionReqGroup signalPositionReqGroup, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c54305xDm.EZpvd(yDY.copydefault(new TaskDescription(signalPositionReqGroup, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54305xDm.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void EZpvd(C54305xDm c54305xDm) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54305xDm.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}
