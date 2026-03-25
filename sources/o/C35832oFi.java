package o;

import com.okinc.im.usecase.messagelistmodel.ReplaceOrAppendOkMessageInMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35832oFi {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final oGD AEQbTJ;
    public final oEJ EZpvd;
    public final C35833oFj KWHzl;
    public final C35847oFx OLrzqt;

    @yCM
    public C35832oFi(@NotNull C35847oFx c35847oFx, @NotNull oGD ogd, @NotNull C35833oFj c35833oFj, @NotNull oEJ oej) {
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        Intrinsics.checkNotNullParameter(ogd, "");
        Intrinsics.checkNotNullParameter(c35833oFj, "");
        Intrinsics.checkNotNullParameter(oej, "");
        this.OLrzqt = c35847oFx;
        this.AEQbTJ = ogd;
        this.KWHzl = c35833oFj;
        this.EZpvd = oej;
    }

    /* JADX INFO: renamed from: o.oFi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull OKMessage oKMessage, sQB sqb, C44468sQy c44468sQy, C44469sQz c44469sQz, java.lang.Boolean bool, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ReplaceOrAppendOkMessageInMessageListModelUseCase$execute$1 replaceOrAppendOkMessageInMessageListModelUseCase$execute$1;
        java.lang.Boolean bool2;
        C36558odI c36558odI2;
        sQB sqb2;
        C44468sQy c44468sQy2;
        C35832oFi c35832oFi;
        java.lang.String str;
        C35254nrp c35254nrp;
        OKMessage oKMessageOLrzqt;
        C44468sQy c44468sQy3;
        sQB sqb3;
        C44468sQy c44468sQy4;
        sQB sqb4;
        C36558odI c36558odI3;
        C36558odI c36558odI4;
        C36558odI c36558odI5;
        if (continuation instanceof ReplaceOrAppendOkMessageInMessageListModelUseCase$execute$1) {
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1 = (ReplaceOrAppendOkMessageInMessageListModelUseCase$execute$1) continuation;
            int i = replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                replaceOrAppendOkMessageInMessageListModelUseCase$execute$1 = new ReplaceOrAppendOkMessageInMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.lang.String targetId = c36558odI.OLrzqt().getTargetId();
            C35254nrp c35254nrpEZpvd = this.AEQbTJ.EZpvd(c36558odI.AEQbTJ(), oKMessage.getSeq(), oKMessage.getClientMessageId());
            pUU.KWHzl("ReplaceOrAppendOkMessageInMessageListModelUseCase", "[" + targetId + "] execute: oldUiMessageId: " + ((c35254nrpEZpvd == null || (oKMessageOLrzqt = c35254nrpEZpvd.OLrzqt()) == null) ? null : C56443yFo.KWHzl(oKMessageOLrzqt.getSeq())));
            C35847oFx c35847oFx = this.OLrzqt;
            java.lang.Long lDjBIcL = c36558odI.djBIcL();
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$0 = this;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$1 = c36558odI;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$2 = sqb;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$3 = c44468sQy;
            bool2 = bool;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$4 = bool2;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$5 = targetId;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$6 = c35254nrpEZpvd;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.label = 1;
            java.lang.Object objEZpvd = c35847oFx.EZpvd(oKMessage, lDjBIcL, sqb, c44468sQy, c44469sQz, replaceOrAppendOkMessageInMessageListModelUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c36558odI2 = c36558odI;
            sqb2 = sqb;
            c44468sQy2 = c44468sQy;
            c35832oFi = this;
            str = targetId;
            objOLrzqt = objEZpvd;
            c35254nrp = c35254nrpEZpvd;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c44468sQy3 = (C44468sQy) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$1;
                    sqb3 = (sQB) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    c36558odI5 = (C36558odI) objOLrzqt;
                    if (c44468sQy3 == null || sqb3 != null) {
                        return c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : null, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : true, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
                    }
                    return c36558odI5;
                }
                c44468sQy4 = (C44468sQy) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$2;
                sqb4 = (sQB) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$1;
                c36558odI3 = (C36558odI) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                C36558odI c36558odI6 = (C36558odI) objOLrzqt;
                c36558odI4 = c36558odI6 != null ? c36558odI3 : c36558odI6;
                if (c44468sQy4 == null || sqb4 != null) {
                    return c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : null, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
                }
                return c36558odI4;
            }
            c35254nrp = (C35254nrp) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$6;
            str = (java.lang.String) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$5;
            java.lang.Boolean bool3 = (java.lang.Boolean) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$4;
            c44468sQy2 = (C44468sQy) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$3;
            sqb2 = (sQB) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$2;
            c36558odI2 = (C36558odI) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$1;
            c35832oFi = (C35832oFi) replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            bool2 = bool3;
        }
        OKMessage oKMessage2 = (OKMessage) objOLrzqt;
        pUU.KWHzl("ReplaceOrAppendOkMessageInMessageListModelUseCase", "[" + str + "] execute: newUiMessage: " + (oKMessage2 != null ? C56443yFo.KWHzl(oKMessage2.getSeq()) : null));
        if (oKMessage2 == null) {
            return c36558odI2;
        }
        if (c35254nrp != null) {
            C35833oFj c35833oFj = c35832oFi.KWHzl;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$0 = c36558odI2;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$1 = sqb2;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$2 = c44468sQy2;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$3 = null;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$4 = null;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$5 = null;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$6 = null;
            replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.label = 2;
            objOLrzqt = c35833oFj.EZpvd(c36558odI2, oKMessage2, replaceOrAppendOkMessageInMessageListModelUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c44468sQy4 = c44468sQy2;
            sqb4 = sqb2;
            c36558odI3 = c36558odI2;
            C36558odI c36558odI62 = (C36558odI) objOLrzqt;
            if (c36558odI62 != null) {
            }
            if (c44468sQy4 == null) {
            }
            return c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : null, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false);
        }
        if (c36558odI2.KWHzl()) {
            pUU.EZpvd("ReplaceOrAppendOkMessageInMessageListModelUseCase", "Will not append message as display list hasn't loaded the last msg");
            return null;
        }
        oEJ oej = c35832oFi.EZpvd;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$0 = sqb2;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$1 = c44468sQy2;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$2 = null;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$3 = null;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$4 = null;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$5 = null;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.L$6 = null;
        replaceOrAppendOkMessageInMessageListModelUseCase$execute$1.label = 3;
        objOLrzqt = oej.OLrzqt(c36558odI2, oKMessage2, bool2, replaceOrAppendOkMessageInMessageListModelUseCase$execute$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        c44468sQy3 = c44468sQy2;
        sqb3 = sqb2;
        c36558odI5 = (C36558odI) objOLrzqt;
        if (c44468sQy3 == null) {
        }
        return c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : null, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : true, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
    }
}
