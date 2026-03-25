package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xBG extends xKJ<LimitPriceData> {
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xBG copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        return this;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<LimitPriceData>> EZpvd() {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        AbstractC58185ywX<ResponseData<LimitPriceData>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xBK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xBG.copydefault(objectRef, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xBI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                xBG.KWHzl(objectRef);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final class Activity extends AbstractC55678xoV {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<LimitPriceData>> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(InterfaceC58184ywW<ResponseData<LimitPriceData>> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2);
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(LimitPriceData limitPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(limitPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd.onNext(new ResponseData<>(0, null, null, null, limitPriceData, null, 46, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: o.xNr */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.util.ArrayList] */
    public static final void copydefault(Ref.ObjectRef objectRef, xBG xbg, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        ?? Copydefault = yDY.copydefault(new Activity(interfaceC58184ywW, xbg.OLrzqt, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        objectRef.element = Copydefault;
        if (Copydefault == 0 || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == 0) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) Copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(Ref.ObjectRef objectRef) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayList = (java.util.ArrayList) objectRef.element;
        if (arrayList == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
    }
}
