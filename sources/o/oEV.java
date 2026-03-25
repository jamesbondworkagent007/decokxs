package o;

import com.okinc.im.usecase.messagelistmodel.ApplyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEV {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final oGD AEQbTJ;
    public final C35832oFi KWHzl;
    public final oEP OLrzqt;
    public final C35847oFx copydefault;

    @yCM
    public oEV(@NotNull C35832oFi c35832oFi, @NotNull oEP oep, @NotNull C35847oFx c35847oFx, @NotNull oGD ogd) {
        Intrinsics.checkNotNullParameter(c35832oFi, "");
        Intrinsics.checkNotNullParameter(oep, "");
        Intrinsics.checkNotNullParameter(c35847oFx, "");
        Intrinsics.checkNotNullParameter(ogd, "");
        this.KWHzl = c35832oFi;
        this.OLrzqt = oep;
        this.copydefault = c35847oFx;
        this.AEQbTJ = ogd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull C44467sQx c44467sQx, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1 applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1;
        java.lang.Object objEZpvd;
        oEV oev;
        OKMessage oKMessage;
        int i;
        C36558odI c36558odI2;
        C36558odI c36558odI3;
        OKMessage oKMessage2;
        OKMessage oKMessage3;
        oEV oev2;
        int i2;
        C36558odI c36558odI4;
        C36558odI c36558odI5;
        OKMessage oKMessage4;
        OKMessage oKMessage5;
        if (continuation instanceof ApplyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1) {
            applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1 = (ApplyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1) continuation;
            int i3 = applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.label = i3 - Integer.MIN_VALUE;
            } else {
                applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1 = new ApplyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            OKMessage oKMessageCopydefault = c44467sQx.copydefault();
            if (!Intrinsics.EZpvd((java.lang.Object) oKMessageCopydefault.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId())) {
                return null;
            }
            int i5 = this.AEQbTJ.EZpvd(c36558odI.AEQbTJ(), oKMessageCopydefault.getSeq(), oKMessageCopydefault.getClientMessageId()) != null ? 1 : 0;
            C35847oFx c35847oFx = this.copydefault;
            applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$0 = this;
            applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$1 = c36558odI;
            applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$2 = oKMessageCopydefault;
            applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.I$0 = i5;
            applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.label = 1;
            int i6 = i5;
            objEZpvd = c35847oFx.EZpvd(oKMessageCopydefault, (28 & 2) != 0 ? null : null, (28 & 4) != 0 ? null : null, (28 & 8) != 0 ? null : null, (28 & 16) != 0 ? null : null, applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            oev = this;
            oKMessage = oKMessageCopydefault;
            i = i6;
            c36558odI2 = c36558odI;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oKMessage5 = (OKMessage) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd2);
                    c36558odI5 = (C36558odI) objEZpvd2;
                    oKMessage4 = oKMessage5;
                    return c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : oKMessage4, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
                }
                i2 = applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.I$0;
                oKMessage3 = (OKMessage) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$3;
                oKMessage2 = (OKMessage) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$2;
                c36558odI3 = (C36558odI) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$1;
                oev2 = (oEV) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                c36558odI4 = (C36558odI) objEZpvd2;
                if (c36558odI4 != null) {
                    return null;
                }
                java.lang.Long lOLrzqt = oev2.OLrzqt(oKMessage2, c36558odI3);
                if (i2 != 0) {
                    oKMessage3 = null;
                }
                if (!Intrinsics.EZpvd(lOLrzqt, c36558odI3.AYXKKw())) {
                    oEP oep = oev2.OLrzqt;
                    applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$0 = oKMessage3;
                    applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$1 = null;
                    applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$2 = null;
                    applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$3 = null;
                    applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.label = 3;
                    objEZpvd2 = oep.EZpvd(lOLrzqt, c36558odI4, applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1);
                    if (objEZpvd2 == objCopydefault) {
                        return objCopydefault;
                    }
                    oKMessage5 = oKMessage3;
                    c36558odI5 = (C36558odI) objEZpvd2;
                    oKMessage4 = oKMessage5;
                    return c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : oKMessage4, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
                }
                c36558odI5 = c36558odI4;
                oKMessage4 = oKMessage3;
                return c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : oKMessage4, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
            }
            int i7 = applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.I$0;
            OKMessage oKMessage6 = (OKMessage) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$2;
            C36558odI c36558odI6 = (C36558odI) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$1;
            oEV oev3 = (oEV) applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
            i = i7;
            oKMessage = oKMessage6;
            oev = oev3;
            objEZpvd = objEZpvd2;
            c36558odI2 = c36558odI6;
        }
        OKMessage oKMessage7 = (OKMessage) objEZpvd;
        C35832oFi c35832oFi = oev.KWHzl;
        applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$0 = oev;
        applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$1 = c36558odI2;
        applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$2 = oKMessage;
        applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.L$3 = oKMessage7;
        applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.I$0 = i;
        applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1.label = 2;
        oEV oev4 = oev;
        OKMessage oKMessage8 = oKMessage;
        int i8 = i;
        java.lang.Object objEZpvd3 = c35832oFi.EZpvd(c36558odI2, oKMessage, (16 & 4) != 0 ? null : null, (16 & 8) != 0 ? null : null, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? java.lang.Boolean.FALSE : null, applyReceivedMessageFromOpponentEventToMessageListModelUseCase$execute$1);
        if (objEZpvd3 == objCopydefault) {
            return objCopydefault;
        }
        c36558odI3 = c36558odI2;
        objEZpvd2 = objEZpvd3;
        oKMessage2 = oKMessage8;
        oKMessage3 = oKMessage7;
        oev2 = oev4;
        i2 = i8;
        c36558odI4 = (C36558odI) objEZpvd2;
        if (c36558odI4 != null) {
        }
    }

    public final java.lang.Long OLrzqt(OKMessage oKMessage, C36558odI c36558odI) {
        nDD ndd = nDD.OLrzqt;
        if (ndd.EZpvd(oKMessage)) {
            return ndd.KWHzl(oKMessage, c36558odI.AEQbTJ()) ? java.lang.Long.valueOf(oKMessage.getSeq()) : c36558odI.AYXKKw();
        }
        return null;
    }
}
