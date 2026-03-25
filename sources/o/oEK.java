package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.im.usecase.messagelistmodel.ApplyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36517ocU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEK {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C35833oFj AEQbTJ;
    public final C35847oFx EZpvd;
    public final oGE KWHzl;
    public final oGD copydefault;

    @yCM
    public oEK(@NotNull oGD ogd, @NotNull oGE oge, @NotNull C35833oFj c35833oFj, @NotNull C35847oFx c35847oFx) {
        Intrinsics.checkNotNullParameter(ogd, "");
        Intrinsics.checkNotNullParameter(oge, "");
        Intrinsics.checkNotNullParameter(c35833oFj, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        this.copydefault = ogd;
        this.KWHzl = oge;
        this.AEQbTJ = c35833oFj;
        this.EZpvd = c35847oFx;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull C36517ocU.StateListAnimator stateListAnimator, @NotNull OKMessage oKMessage, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1 applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1;
        C36558odI c36558odI2;
        java.lang.Object objEZpvd;
        oEK oek;
        C36558odI c36558odI3;
        if (continuation instanceof ApplyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1) {
            applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1 = (ApplyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1) continuation;
            int i = applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1 = new ApplyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) oKMessage.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId());
            pUU.KWHzl("ApplyAudioMessageDownloadStateEvent", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "]");
            C35254nrp c35254nrpEZpvd = this.copydefault.EZpvd(listAEQbTJ, oKMessage.getSeq(), oKMessage.getClientMessageId());
            int iAEQbTJ = this.KWHzl.AEQbTJ(listAEQbTJ, oKMessage.getSeq(), oKMessage.getClientMessageId());
            pUU.KWHzl("ApplyAudioMessageDownloadStateEvent", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "], uiMessagePosition=" + iAEQbTJ);
            pUU.KWHzl("ApplyAudioMessageDownloadStateEvent", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] downloadState=" + stateListAnimator);
            if (!zEZpvd || c35254nrpEZpvd == null) {
                return null;
            }
            C35847oFx c35847oFx = this.EZpvd;
            java.lang.Long lDjBIcL = c36558odI.djBIcL();
            applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.L$0 = this;
            c36558odI2 = c36558odI;
            applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
            applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.label = 1;
            objEZpvd = c35847oFx.EZpvd(oKMessage, lDjBIcL, null, null, null, applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            oek = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd2);
                c36558odI3 = (C36558odI) objEZpvd2;
                if (c36558odI3 == null) {
                    return c36558odI3.AEQbTJ((32318 & 1) != 0 ? c36558odI3.AhwBna : null, (32318 & 2) != 0 ? c36558odI3.KWHzl : null, (32318 & 4) != 0 ? c36558odI3.DbNXlk : null, (32318 & 8) != 0 ? c36558odI3.AkhnZx : null, (32318 & 16) != 0 ? c36558odI3.isConnected : null, (32318 & 32) != 0 ? c36558odI3.djBIcL : null, (32318 & 64) != 0 ? c36558odI3.EZpvd : false, (32318 & 128) != 0 ? c36558odI3.OLrzqt : false, (32318 & 256) != 0 ? c36558odI3.values : null, (32318 & 512) != 0 ? c36558odI3.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI3.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI3.copydefault : null, (32318 & 4096) != 0 ? c36558odI3.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI3.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI3.valueOf : false);
                }
                return null;
            }
            C36558odI c36558odI4 = (C36558odI) applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.L$1;
            oek = (oEK) applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
            objEZpvd = objEZpvd2;
            c36558odI2 = c36558odI4;
        }
        OKMessage oKMessage2 = (OKMessage) objEZpvd;
        if (oKMessage2 == null) {
            return null;
        }
        C35833oFj c35833oFj = oek.AEQbTJ;
        applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.L$0 = null;
        applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.L$1 = null;
        applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1.label = 2;
        objEZpvd2 = c35833oFj.EZpvd(c36558odI2, oKMessage2, applyAudioMessageDownloadStateEventToMessageListModelUseCase$execute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        c36558odI3 = (C36558odI) objEZpvd2;
        if (c36558odI3 == null) {
        }
    }
}
