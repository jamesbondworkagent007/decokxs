package o;

import com.okinc.im.usecase.messagelistmodel.ReplaceUiMessageFromMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35833oFj {
    public final oEL EZpvd;
    public final oGE OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C35833oFj(@NotNull oGE oge, @NotNull oEL oel) {
        Intrinsics.checkNotNullParameter(oge, "");
        Intrinsics.checkNotNullParameter(oel, "");
        this.OLrzqt = oge;
        this.EZpvd = oel;
    }

    /* JADX INFO: renamed from: o.oFj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull C36558odI c36558odI, @NotNull OKMessage oKMessage, @NotNull Continuation<? super C36558odI> continuation) {
        ReplaceUiMessageFromMessageListModelUseCase$execute$1 replaceUiMessageFromMessageListModelUseCase$execute$1;
        java.util.List<C35254nrp> list;
        C36558odI c36558odI2;
        if (continuation instanceof ReplaceUiMessageFromMessageListModelUseCase$execute$1) {
            replaceUiMessageFromMessageListModelUseCase$execute$1 = (ReplaceUiMessageFromMessageListModelUseCase$execute$1) continuation;
            int i = replaceUiMessageFromMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                replaceUiMessageFromMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                replaceUiMessageFromMessageListModelUseCase$execute$1 = new ReplaceUiMessageFromMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        ReplaceUiMessageFromMessageListModelUseCase$execute$1 replaceUiMessageFromMessageListModelUseCase$execute$12 = replaceUiMessageFromMessageListModelUseCase$execute$1;
        java.lang.Object obj = replaceUiMessageFromMessageListModelUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = replaceUiMessageFromMessageListModelUseCase$execute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.lang.String targetId = c36558odI.OLrzqt().getTargetId();
            java.util.List<C35254nrp> listAEQbTJ = c36558odI.AEQbTJ();
            int iAEQbTJ = this.OLrzqt.AEQbTJ(listAEQbTJ, oKMessage.getSeq(), oKMessage.getClientMessageId());
            pUU.KWHzl("ReplaceUiMessageFromMessageListModelUseCase", "[" + targetId + "] execute: [" + oKMessage.getSeq() + "] indexOfMessage: " + iAEQbTJ);
            if (iAEQbTJ == -1) {
                return null;
            }
            java.util.List<C35254nrp> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listAEQbTJ);
            oEL oel = this.EZpvd;
            replaceUiMessageFromMessageListModelUseCase$execute$12.L$0 = c36558odI;
            replaceUiMessageFromMessageListModelUseCase$execute$12.L$1 = listFJNWhG;
            replaceUiMessageFromMessageListModelUseCase$execute$12.label = 1;
            if (oel.copydefault(c36558odI, false, listFJNWhG, iAEQbTJ, oKMessage, replaceUiMessageFromMessageListModelUseCase$execute$12) == objCopydefault) {
                return objCopydefault;
            }
            list = listFJNWhG;
            c36558odI2 = c36558odI;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List<C35254nrp> list2 = (java.util.List) replaceUiMessageFromMessageListModelUseCase$execute$12.L$1;
            C36558odI c36558odI3 = (C36558odI) replaceUiMessageFromMessageListModelUseCase$execute$12.L$0;
            C56391yDq.AEQbTJ(obj);
            list = list2;
            c36558odI2 = c36558odI3;
        }
        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : list, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
    }
}
