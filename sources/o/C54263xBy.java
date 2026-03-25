package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import io.reactivex.BackpressureStrategy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xBy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54263xBy extends xKJ<FundingRateData> {
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<FundingRateData>> EZpvd() {
        AbstractC58185ywX<ResponseData<FundingRateData>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C54263xBy.AEQbTJ(this.OLrzqt, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(new InterfaceC58222yxH() { // from class: o.xBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C54263xBy.KWHzl(this.copydefault);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    /* JADX INFO: renamed from: o.xBy$TaskDescription */
    public static final class TaskDescription extends AbstractC55670xoN {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<FundingRateData>> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(InterfaceC58184ywW<ResponseData<FundingRateData>> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2);
            this.AEQbTJ = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(FundingRateData fundingRateData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(fundingRateData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.onNext(new ResponseData<>(0, null, null, null, fundingRateData, null, 46, null));
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(FundingRateData fundingRateData, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(fundingRateData, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                this.AEQbTJ.onNext(new ResponseData<>(0, null, null, null, fundingRateData, null, 46, null));
            } else {
                this.AEQbTJ.onNext(new ResponseData<>(-1, "", null, null, null, null, 60, null));
            }
        }
    }

    public static final void AEQbTJ(C54263xBy c54263xBy, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.String str = c54263xBy.AEQbTJ;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        objArr[0] = new TaskDescription(interfaceC58184ywW, str, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        c54263xBy.EZpvd(yDY.copydefault(objArr));
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54263xBy.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(arrayListEjfBZ);
    }

    public static final void KWHzl(C54263xBy c54263xBy) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.ArrayList<java.lang.Object> arrayListEjfBZ = c54263xBy.ejfBZ();
        if (arrayListEjfBZ == null || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ(arrayListEjfBZ);
    }
}
