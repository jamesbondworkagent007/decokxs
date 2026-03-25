package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.im.usecase.messagelistmodel.ApplyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEN {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final oGE AEQbTJ;
    public final C35833oFj EZpvd;
    public final C35847oFx KWHzl;
    public final oGD copydefault;

    @yCM
    public oEN(@NotNull oGD ogd, @NotNull oGE oge, @NotNull C35833oFj c35833oFj, @NotNull C35847oFx c35847oFx) {
        Intrinsics.checkNotNullParameter(ogd, "");
        Intrinsics.checkNotNullParameter(oge, "");
        Intrinsics.checkNotNullParameter(c35833oFj, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        this.copydefault = ogd;
        this.AEQbTJ = oge;
        this.EZpvd = c35833oFj;
        this.KWHzl = c35847oFx;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull C35249nrk c35249nrk, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1 applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1;
        C36558odI c36558odI2;
        oEN oen;
        C36558odI c36558odI3;
        if (continuation instanceof ApplyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1) {
            applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1 = (ApplyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1) continuation;
            int i = applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1 = new ApplyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) c35249nrk.KWHzl(), (java.lang.Object) c36558odI.OLrzqt().getTargetId());
            pUU.KWHzl("ApplyAudioMessagePlayStateEvent", "[" + c35249nrk.KWHzl() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + c35249nrk.copydefault() + "]");
            C35254nrp c35254nrpEZpvd = this.copydefault.EZpvd(listAEQbTJ, c35249nrk.copydefault(), null);
            int iAEQbTJ = this.AEQbTJ.AEQbTJ(listAEQbTJ, c35249nrk.copydefault(), null);
            pUU.KWHzl("ApplyAudioMessagePlayStateEvent", "[" + c35249nrk.KWHzl() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + c35249nrk.copydefault() + "] playState=" + c35249nrk);
            pUU.KWHzl("ApplyAudioMessagePlayStateEvent", "[" + c35249nrk.KWHzl() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + c35249nrk.copydefault() + "], uiMessagePosition=" + iAEQbTJ);
            if (!zEZpvd || c35254nrpEZpvd == null) {
                return null;
            }
            C35847oFx c35847oFx = this.KWHzl;
            OKMessage oKMessageOLrzqt = c35254nrpEZpvd.OLrzqt();
            java.lang.Long lDjBIcL = c36558odI.djBIcL();
            applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.L$0 = this;
            c36558odI2 = c36558odI;
            applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
            applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.label = 1;
            objEZpvd = c35847oFx.EZpvd(oKMessageOLrzqt, lDjBIcL, null, null, null, applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            oen = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                c36558odI3 = (C36558odI) objEZpvd;
                if (c36558odI3 == null) {
                    return c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
                }
                return null;
            }
            C36558odI c36558odI4 = (C36558odI) applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.L$1;
            oen = (oEN) applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            c36558odI2 = c36558odI4;
        }
        OKMessage oKMessage = (OKMessage) objEZpvd;
        if (oKMessage == null) {
            return null;
        }
        C35833oFj c35833oFj = oen.EZpvd;
        applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.L$0 = null;
        applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.L$1 = null;
        applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1.label = 2;
        objEZpvd = c35833oFj.EZpvd(c36558odI2, oKMessage, applyAudioMessagePlayStateEventToMessageListModelUseCase$execute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c36558odI3 = (C36558odI) objEZpvd;
        if (c36558odI3 == null) {
        }
    }
}
