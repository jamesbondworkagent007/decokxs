package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54310xDr extends xKJ<C55804xqp<TickersData>> {
    public java.lang.String copydefault = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54310xDr EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<TickersData>>> EZpvd() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<C55804xqp<TickersData>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54310xDr.EZpvd(objectRef, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54310xDr.AEQbTJ(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xDr$ActionBar */
    public static final class ActionBar extends AbstractC55744xpi {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<TickersData>>> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(InterfaceC58184ywW<ResponseData<C55804xqp<TickersData>>> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2, false, null, 12, null);
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(TickersData tickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, tickersData, null, null, 12, null), null, 46, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: o.xNr */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.util.ArrayList] */
    public static final void EZpvd(Ref.ObjectRef objectRef, C54310xDr c54310xDr, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        ?? Copydefault = yDY.copydefault(new ActionBar(interfaceC58184ywW, c54310xDr.copydefault, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        objectRef.element = Copydefault;
        if (Copydefault == 0 || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == 0) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) Copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(Ref.ObjectRef objectRef) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayList = (java.util.ArrayList) objectRef.element;
        if (arrayList == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
    }
}
