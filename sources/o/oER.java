package o;

import com.okinc.im.usecase.messagelistmodel.ApplyMessageSentEventToMessageListModelUseCaseV2$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oER {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final oEP AEQbTJ;
    public final C35832oFi KWHzl;
    public final oEW OLrzqt;
    public final oGD copydefault;

    @yCM
    public oER(@NotNull C35832oFi c35832oFi, @NotNull oEP oep, @NotNull oEW oew, @NotNull oGD ogd) {
        Intrinsics.checkNotNullParameter(c35832oFi, "");
        Intrinsics.checkNotNullParameter(oep, "");
        Intrinsics.checkNotNullParameter(oew, "");
        Intrinsics.checkNotNullParameter(ogd, "");
        this.KWHzl = c35832oFi;
        this.AEQbTJ = oep;
        this.OLrzqt = oew;
        this.copydefault = ogd;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oER.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oER.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.oER$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0901StateListAnimator extends StateListAnimator {
            public static final int EZpvd = C44468sQy.EZpvd;
            public final C44468sQy OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C44468sQy EZpvd() {
                return this.OLrzqt;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0901StateListAnimator(@NotNull C44468sQy c44468sQy) {
                super(null);
                Intrinsics.checkNotNullParameter(c44468sQy, "");
                this.OLrzqt = c44468sQy;
            }
        }

        private StateListAnimator() {
        }

        public static final class ActionBar extends StateListAnimator {
            public static final int AEQbTJ = sQB.copydefault;
            public final sQB EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final sQB KWHzl() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull sQB sqb) {
                super(null);
                Intrinsics.checkNotNullParameter(sqb, "");
                this.EZpvd = sqb;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull C36558odI c36558odI, @NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super C36558odI> continuation) throws java.lang.Throwable {
        ApplyMessageSentEventToMessageListModelUseCaseV2$execute$1 applyMessageSentEventToMessageListModelUseCaseV2$execute$1;
        oER oer;
        StateListAnimator stateListAnimator2;
        OKMessage oKMessage;
        int i;
        C36558odI c36558odI2;
        oER oer2;
        OKMessage oKMessage2;
        java.lang.Object obj;
        int i2;
        boolean z;
        int i3;
        java.lang.Object objEZpvd;
        StateListAnimator stateListAnimator3;
        OKMessage oKMessage3;
        oER oer3;
        C36558odI c36558odI3;
        int i4;
        C36558odI c36558odI4;
        C36558odI c36558odIAEQbTJ;
        StateListAnimator stateListAnimator4 = stateListAnimator;
        if (continuation instanceof ApplyMessageSentEventToMessageListModelUseCaseV2$execute$1) {
            applyMessageSentEventToMessageListModelUseCaseV2$execute$1 = (ApplyMessageSentEventToMessageListModelUseCaseV2$execute$1) continuation;
            int i5 = applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label = i5 - Integer.MIN_VALUE;
            } else {
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1 = new ApplyMessageSentEventToMessageListModelUseCaseV2$execute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = applyMessageSentEventToMessageListModelUseCaseV2$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i6 = applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label;
        if (i6 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            OKMessage oKMessageEZpvd = EZpvd(stateListAnimator4);
            if (!Intrinsics.EZpvd((java.lang.Object) oKMessageEZpvd.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId())) {
                return null;
            }
            if (this.copydefault.EZpvd(c36558odI.AEQbTJ(), oKMessageEZpvd.getSeq(), oKMessageEZpvd.getClientMessageId()) == null && c36558odI.KWHzl()) {
                pUU.EZpvd("ApplyMessageSentEventToMessageListModelUseCase", "Load last page");
                oEW oew = this.OLrzqt;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$0 = this;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$1 = stateListAnimator4;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$2 = oKMessageEZpvd;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0 = 1;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label = 1;
                java.lang.Object objEZpvd3 = oew.EZpvd(c36558odI, applyMessageSentEventToMessageListModelUseCaseV2$execute$1);
                if (objEZpvd3 == objCopydefault) {
                    return objCopydefault;
                }
                oer2 = this;
                oKMessage2 = oKMessageEZpvd;
                obj = objEZpvd3;
                i2 = 1;
            } else {
                oer = this;
                stateListAnimator2 = stateListAnimator4;
                oKMessage = oKMessageEZpvd;
                i = 0;
                c36558odI2 = c36558odI;
                C35832oFi c35832oFi = oer.KWHzl;
                StateListAnimator.C0901StateListAnimator c0901StateListAnimator = !(stateListAnimator2 instanceof StateListAnimator.C0901StateListAnimator) ? (StateListAnimator.C0901StateListAnimator) stateListAnimator2 : null;
                C44468sQy c44468sQyEZpvd = c0901StateListAnimator == null ? c0901StateListAnimator.EZpvd() : null;
                StateListAnimator.ActionBar actionBar = !(stateListAnimator2 instanceof StateListAnimator.ActionBar) ? (StateListAnimator.ActionBar) stateListAnimator2 : null;
                sQB sqbKWHzl = actionBar == null ? actionBar.KWHzl() : null;
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(true);
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$0 = oer;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$1 = stateListAnimator2;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$2 = oKMessage;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$3 = c36558odI2;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0 = i;
                applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label = 2;
                oER oer4 = oer;
                C44468sQy c44468sQy = c44468sQyEZpvd;
                OKMessage oKMessage4 = oKMessage;
                int i7 = i;
                z = true;
                i3 = 3;
                objEZpvd = c35832oFi.EZpvd(c36558odI2, oKMessage, (16 & 4) != 0 ? null : sqbKWHzl, (16 & 8) != 0 ? null : c44468sQy, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? java.lang.Boolean.FALSE : boolKWHzl, applyMessageSentEventToMessageListModelUseCaseV2$execute$1);
                if (objEZpvd != objCopydefault) {
                    return objCopydefault;
                }
                stateListAnimator3 = stateListAnimator2;
                objEZpvd2 = objEZpvd;
                oKMessage3 = oKMessage4;
                oer3 = oer4;
                c36558odI3 = c36558odI2;
                i4 = i7;
                c36558odI4 = (C36558odI) objEZpvd2;
                return c36558odI4 == null ? null : null;
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4 = applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0;
                    C56391yDq.AEQbTJ(objEZpvd2);
                    z = true;
                    c36558odIAEQbTJ = (C36558odI) objEZpvd2;
                    C36558odI c36558odI5 = c36558odIAEQbTJ;
                    return c36558odI5.AEQbTJ((32318 & 1) != 0 ? c36558odI5.AhwBna : null, (32318 & 2) != 0 ? c36558odI5.KWHzl : null, (32318 & 4) != 0 ? c36558odI5.DbNXlk : null, (32318 & 8) != 0 ? c36558odI5.AkhnZx : null, (32318 & 16) != 0 ? c36558odI5.isConnected : null, (32318 & 32) != 0 ? c36558odI5.djBIcL : null, (32318 & 64) != 0 ? c36558odI5.EZpvd : false, (32318 & 128) != 0 ? c36558odI5.OLrzqt : false, (32318 & 256) != 0 ? c36558odI5.values : null, (32318 & 512) != 0 ? c36558odI5.AYXKKw : (i4 == 0 || c36558odI5.valueOf()) ? z : false, (32318 & 1024) != 0 ? c36558odI5.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI5.copydefault : null, (32318 & 4096) != 0 ? c36558odI5.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI5.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI5.valueOf : false);
                }
                i4 = applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0;
                c36558odI3 = (C36558odI) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$3;
                oKMessage3 = (OKMessage) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$2;
                stateListAnimator3 = (StateListAnimator) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$1;
                oer3 = (oER) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                z = true;
                i3 = 3;
                c36558odI4 = (C36558odI) objEZpvd2;
                if (c36558odI4 == null && (c36558odIAEQbTJ = c36558odI4.AEQbTJ((32318 & 1) != 0 ? c36558odI4.AhwBna : null, (32318 & 2) != 0 ? c36558odI4.KWHzl : null, (32318 & 4) != 0 ? c36558odI4.DbNXlk : null, (32318 & 8) != 0 ? c36558odI4.AkhnZx : null, (32318 & 16) != 0 ? c36558odI4.isConnected : null, (32318 & 32) != 0 ? c36558odI4.djBIcL : null, (32318 & 64) != 0 ? c36558odI4.EZpvd : false, (32318 & 128) != 0 ? c36558odI4.OLrzqt : false, (32318 & 256) != 0 ? c36558odI4.values : null, (32318 & 512) != 0 ? c36558odI4.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI4.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI4.copydefault : null, (32318 & 4096) != 0 ? c36558odI4.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI4.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI4.valueOf : false)) != null) {
                    java.lang.Long lKWHzl = oer3.KWHzl(stateListAnimator3, oKMessage3, c36558odI3);
                    pUU.EZpvd("ApplyMessageSentEventToMessageListModelUseCase", "newShowSendStatusSeq:" + lKWHzl);
                    if (!Intrinsics.EZpvd(lKWHzl, c36558odI3.AYXKKw())) {
                        oEP oep = oer3.AEQbTJ;
                        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$0 = null;
                        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$1 = null;
                        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$2 = null;
                        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$3 = null;
                        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0 = i4;
                        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label = i3;
                        objEZpvd2 = oep.EZpvd(lKWHzl, c36558odIAEQbTJ, applyMessageSentEventToMessageListModelUseCaseV2$execute$1);
                        if (objEZpvd2 == objCopydefault) {
                            return objCopydefault;
                        }
                        c36558odIAEQbTJ = (C36558odI) objEZpvd2;
                    }
                    C36558odI c36558odI52 = c36558odIAEQbTJ;
                    return c36558odI52.AEQbTJ((32318 & 1) != 0 ? c36558odI52.AhwBna : null, (32318 & 2) != 0 ? c36558odI52.KWHzl : null, (32318 & 4) != 0 ? c36558odI52.DbNXlk : null, (32318 & 8) != 0 ? c36558odI52.AkhnZx : null, (32318 & 16) != 0 ? c36558odI52.isConnected : null, (32318 & 32) != 0 ? c36558odI52.djBIcL : null, (32318 & 64) != 0 ? c36558odI52.EZpvd : false, (32318 & 128) != 0 ? c36558odI52.OLrzqt : false, (32318 & 256) != 0 ? c36558odI52.values : null, (32318 & 512) != 0 ? c36558odI52.AYXKKw : (i4 == 0 || c36558odI52.valueOf()) ? z : false, (32318 & 1024) != 0 ? c36558odI52.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI52.copydefault : null, (32318 & 4096) != 0 ? c36558odI52.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI52.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI52.valueOf : false);
                }
            }
            int i8 = applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0;
            OKMessage oKMessage5 = (OKMessage) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$2;
            StateListAnimator stateListAnimator5 = (StateListAnimator) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$1;
            oer2 = (oER) applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
            i2 = i8;
            stateListAnimator4 = stateListAnimator5;
            oKMessage2 = oKMessage5;
            obj = objEZpvd2;
        }
        i = i2;
        oKMessage = oKMessage2;
        oer = oer2;
        stateListAnimator2 = stateListAnimator4;
        c36558odI2 = (C36558odI) obj;
        C35832oFi c35832oFi2 = oer.KWHzl;
        if (!(stateListAnimator2 instanceof StateListAnimator.C0901StateListAnimator)) {
        }
        if (c0901StateListAnimator == null) {
        }
        if (!(stateListAnimator2 instanceof StateListAnimator.ActionBar)) {
        }
        if (actionBar == null) {
        }
        java.lang.Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$0 = oer;
        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$1 = stateListAnimator2;
        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$2 = oKMessage;
        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.L$3 = c36558odI2;
        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.I$0 = i;
        applyMessageSentEventToMessageListModelUseCaseV2$execute$1.label = 2;
        oER oer42 = oer;
        C44468sQy c44468sQy2 = c44468sQyEZpvd;
        OKMessage oKMessage42 = oKMessage;
        int i72 = i;
        z = true;
        i3 = 3;
        objEZpvd = c35832oFi2.EZpvd(c36558odI2, oKMessage, (16 & 4) != 0 ? null : sqbKWHzl, (16 & 8) != 0 ? null : c44468sQy2, (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? java.lang.Boolean.FALSE : boolKWHzl2, applyMessageSentEventToMessageListModelUseCaseV2$execute$1);
        if (objEZpvd != objCopydefault) {
        }
    }

    public final OKMessage EZpvd(StateListAnimator stateListAnimator) {
        if (stateListAnimator instanceof StateListAnimator.ActionBar) {
            return ((StateListAnimator.ActionBar) stateListAnimator).KWHzl().copydefault();
        }
        if (stateListAnimator instanceof StateListAnimator.C0901StateListAnimator) {
            return ((StateListAnimator.C0901StateListAnimator) stateListAnimator).EZpvd().EZpvd();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final java.lang.Long KWHzl(StateListAnimator stateListAnimator, OKMessage oKMessage, C36558odI c36558odI) {
        if (stateListAnimator instanceof StateListAnimator.C0901StateListAnimator) {
            return EZpvd(((StateListAnimator.C0901StateListAnimator) stateListAnimator).EZpvd(), oKMessage, c36558odI);
        }
        if (!(stateListAnimator instanceof StateListAnimator.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        return KWHzl(((StateListAnimator.ActionBar) stateListAnimator).KWHzl(), oKMessage, c36558odI);
    }

    public final java.lang.Long EZpvd(C44468sQy c44468sQy, OKMessage oKMessage, C36558odI c36558odI) {
        if (c44468sQy.OLrzqt() == 1) {
            if (nDD.OLrzqt.KWHzl(oKMessage, c36558odI.AEQbTJ())) {
                return java.lang.Long.valueOf(oKMessage.getSeq());
            }
            return c36558odI.AYXKKw();
        }
        return c36558odI.AYXKKw();
    }

    public final java.lang.Long KWHzl(sQB sqb, OKMessage oKMessage, C36558odI c36558odI) {
        if (sqb.AEQbTJ() == 1) {
            if (nDD.OLrzqt.KWHzl(oKMessage, c36558odI.AEQbTJ())) {
                return java.lang.Long.valueOf(oKMessage.getSeq());
            }
            return c36558odI.AYXKKw();
        }
        return c36558odI.AYXKKw();
    }
}
