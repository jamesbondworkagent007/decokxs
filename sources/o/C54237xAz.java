package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.ProductItemResp;
import com.okinc.unify_trade.bot.data.DcdProductListReq;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xAz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54237xAz extends xKJ<C55804xqp<java.util.List<? extends ProductItemResp>>> {
    public java.lang.String AEQbTJ;
    public DcdProductListReq EZpvd;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull DcdProductListReq dcdProductListReq) {
        Intrinsics.checkNotNullParameter(dcdProductListReq, "");
        this.EZpvd = dcdProductListReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX INFO: renamed from: o.xAz$Application */
    public static final class Application extends AbstractC55659xoC {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<ProductItemResp>>>> gEmmrt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(InterfaceC58184ywW<ResponseData<C55804xqp<java.util.List<ProductItemResp>>>> interfaceC58184ywW, DcdProductListReq dcdProductListReq, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(dcdProductListReq, str, str2, str3);
            this.gEmmrt = interfaceC58184ywW;
        }

        @Override // o.AbstractC55659xoC
        public void OLrzqt(java.lang.String str, java.util.List<ProductItemResp> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.gEmmrt.onNext(new ResponseData<>(0, null, null, null, new C55804xqp(str, list, null, null, 12, null), null, 46, null));
        }

        @Override // o.AbstractC55659xoC
        public void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.gEmmrt.onNext(new ResponseData<>(-1, str, null, null, null, null, 60, null));
        }
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<ProductItemResp>>>> EZpvd() {
        AbstractC58185ywX<ResponseData<C55804xqp<java.util.List<ProductItemResp>>>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54237xAz.OLrzqt(this.OLrzqt, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54237xAz.EZpvd(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void OLrzqt(C54237xAz c54237xAz, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        DcdProductListReq dcdProductListReq = c54237xAz.EZpvd;
        if (dcdProductListReq == null) {
            Intrinsics.gEmmrt("");
            dcdProductListReq = null;
        }
        objArr[0] = new Application(interfaceC58184ywW, dcdProductListReq, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), c54237xAz.OLrzqt, c54237xAz.AEQbTJ);
        c54237xAz.EZpvd(yDY.copydefault(objArr));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54237xAz.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void EZpvd(C54237xAz c54237xAz) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54237xAz.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}
