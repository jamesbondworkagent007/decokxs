package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import io.reactivex.BackpressureStrategy;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54308xDp extends xKJ<C55804xqp<java.util.List<? extends TickersData>>> {
    public java.lang.String AEQbTJ = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54308xDp KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<TickersData>>>> EZpvd() {
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<TickersData>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54308xDp.EZpvd(this.AEQbTJ, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54308xDp.EZpvd(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xDp$ActionBar */
    public static final class ActionBar extends AbstractC55737xpb {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<TickersData>>>> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<TickersData>>>> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(java.util.List<? extends TickersData> list, java.lang.String str) {
            EZpvd2((java.util.List<TickersData>) list, str);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (((TickersData) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
                this.EZpvd.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, list, null, null, 12, null), null, 46, null));
            }
        }
    }

    public static final void EZpvd(C54308xDp c54308xDp, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        c54308xDp.EZpvd(yDY.copydefault(new ActionBar(interfaceC58184ywW, c54308xDp.AEQbTJ, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())))));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54308xDp.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void EZpvd(C54308xDp c54308xDp) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54308xDp.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}
