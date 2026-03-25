package o;

import com.okinc.im.usecase.messagelistmodel.ApplyRefreshEventToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEU {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final oGD AEQbTJ;
    public final C35833oFj KWHzl;
    public final C35847oFx OLrzqt;

    @yCM
    public oEU(@NotNull oGD ogd, @NotNull C35833oFj c35833oFj, @NotNull C35847oFx c35847oFx) {
        Intrinsics.checkNotNullParameter(ogd, "");
        Intrinsics.checkNotNullParameter(c35833oFj, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        this.AEQbTJ = ogd;
        this.KWHzl = c35833oFj;
        this.OLrzqt = c35847oFx;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull sQA sqa, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyRefreshEventToMessageListModelUseCase$execute$1 applyRefreshEventToMessageListModelUseCase$execute$1;
        C36558odI c36558odI2;
        oEU oeu;
        C36558odI c36558odI3;
        if (continuation instanceof ApplyRefreshEventToMessageListModelUseCase$execute$1) {
            applyRefreshEventToMessageListModelUseCase$execute$1 = (ApplyRefreshEventToMessageListModelUseCase$execute$1) continuation;
            int i = applyRefreshEventToMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applyRefreshEventToMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                applyRefreshEventToMessageListModelUseCase$execute$1 = new ApplyRefreshEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = applyRefreshEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applyRefreshEventToMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            OKMessage oKMessageEZpvd = sqa.EZpvd();
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            if (!Intrinsics.EZpvd((java.lang.Object) oKMessageEZpvd.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId())) {
                return null;
            }
            if (this.AEQbTJ.EZpvd(listAEQbTJ, oKMessageEZpvd.getSeq(), oKMessageEZpvd.getClientMessageId()) == null) {
                pUU.KWHzl("ApplyRefreshEventToMessageListModelUseCase", "No need to refresh - messages doesn't exist in display list");
                return null;
            }
            C35847oFx c35847oFx = this.OLrzqt;
            java.lang.Long lDjBIcL = c36558odI.djBIcL();
            applyRefreshEventToMessageListModelUseCase$execute$1.L$0 = this;
            c36558odI2 = c36558odI;
            applyRefreshEventToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
            applyRefreshEventToMessageListModelUseCase$execute$1.label = 1;
            objEZpvd = c35847oFx.EZpvd(oKMessageEZpvd, lDjBIcL, null, null, null, applyRefreshEventToMessageListModelUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            oeu = this;
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
            C36558odI c36558odI4 = (C36558odI) applyRefreshEventToMessageListModelUseCase$execute$1.L$1;
            oeu = (oEU) applyRefreshEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            c36558odI2 = c36558odI4;
        }
        OKMessage oKMessage = (OKMessage) objEZpvd;
        if (oKMessage == null) {
            return null;
        }
        pUU.KWHzl("ApplyRefreshEventToMessageListModelUseCase", "Refresh message - seq:" + oKMessage.getSeq() + ", clientMsgId=" + oKMessage.getClientMessageId());
        C35833oFj c35833oFj = oeu.KWHzl;
        applyRefreshEventToMessageListModelUseCase$execute$1.L$0 = null;
        applyRefreshEventToMessageListModelUseCase$execute$1.L$1 = null;
        applyRefreshEventToMessageListModelUseCase$execute$1.label = 2;
        objEZpvd = c35833oFj.EZpvd(c36558odI2, oKMessage, applyRefreshEventToMessageListModelUseCase$execute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c36558odI3 = (C36558odI) objEZpvd;
        if (c36558odI3 == null) {
        }
    }
}
