package o;

import com.okinc.im.usecase.messagelistmodel.AppendUiMessageFromMessageListModelUseCase$execute$1;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oEJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final oEL OLrzqt;
    public final oGF copydefault;

    @yCM
    public oEJ(@NotNull oGF ogf, @NotNull oEL oel) {
        Intrinsics.checkNotNullParameter(ogf, "");
        Intrinsics.checkNotNullParameter(oel, "");
        this.copydefault = ogf;
        this.OLrzqt = oel;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static /* synthetic */ java.lang.Object execute$default(oEJ oej, C36558odI c36558odI, OKMessage oKMessage, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return oej.OLrzqt(c36558odI, oKMessage, bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull C36558odI c36558odI, @NotNull OKMessage oKMessage, java.lang.Boolean bool, @NotNull Continuation<? super C36558odI> continuation) {
        AppendUiMessageFromMessageListModelUseCase$execute$1 appendUiMessageFromMessageListModelUseCase$execute$1;
        C36558odI c36558odI2;
        java.util.List<C35254nrp> list;
        if (continuation instanceof AppendUiMessageFromMessageListModelUseCase$execute$1) {
            appendUiMessageFromMessageListModelUseCase$execute$1 = (AppendUiMessageFromMessageListModelUseCase$execute$1) continuation;
            int i = appendUiMessageFromMessageListModelUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                appendUiMessageFromMessageListModelUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                appendUiMessageFromMessageListModelUseCase$execute$1 = new AppendUiMessageFromMessageListModelUseCase$execute$1(this, continuation);
            }
        }
        AppendUiMessageFromMessageListModelUseCase$execute$1 appendUiMessageFromMessageListModelUseCase$execute$12 = appendUiMessageFromMessageListModelUseCase$execute$1;
        java.lang.Object obj = appendUiMessageFromMessageListModelUseCase$execute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = appendUiMessageFromMessageListModelUseCase$execute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.List<C35254nrp> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) c36558odI.AEQbTJ());
            int iAEQbTJ = Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? -1 : this.copydefault.AEQbTJ(c36558odI.AEQbTJ(), oKMessage.getSentTime());
            pUU.EZpvd("AppendUiMessageFromMessageListModelUseCase", "insertPos: " + iAEQbTJ + ", messageListSize: " + c36558odI.AEQbTJ().size());
            long sentTime = oKMessage.getSentTime();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("messageSentTime: ");
            sb.append(sentTime);
            pUU.EZpvd("AppendUiMessageFromMessageListModelUseCase", sb.toString());
            if (iAEQbTJ >= 0) {
                oEL oel = this.OLrzqt;
                appendUiMessageFromMessageListModelUseCase$execute$12.L$0 = c36558odI;
                appendUiMessageFromMessageListModelUseCase$execute$12.L$1 = listFJNWhG;
                appendUiMessageFromMessageListModelUseCase$execute$12.label = 1;
                if (oel.copydefault(c36558odI, true, listFJNWhG, iAEQbTJ, oKMessage, appendUiMessageFromMessageListModelUseCase$execute$12) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                oEL oel2 = this.OLrzqt;
                int size = listFJNWhG.size();
                appendUiMessageFromMessageListModelUseCase$execute$12.L$0 = c36558odI;
                appendUiMessageFromMessageListModelUseCase$execute$12.L$1 = listFJNWhG;
                appendUiMessageFromMessageListModelUseCase$execute$12.label = 2;
                if (oel2.copydefault(c36558odI, true, listFJNWhG, size, oKMessage, appendUiMessageFromMessageListModelUseCase$execute$12) == objCopydefault) {
                    return objCopydefault;
                }
            }
            c36558odI2 = c36558odI;
            list = listFJNWhG;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List<C35254nrp> list2 = (java.util.List) appendUiMessageFromMessageListModelUseCase$execute$12.L$1;
            C36558odI c36558odI3 = (C36558odI) appendUiMessageFromMessageListModelUseCase$execute$12.L$0;
            C56391yDq.AEQbTJ(obj);
            list = list2;
            c36558odI2 = c36558odI3;
        }
        return c36558odI2.AEQbTJ((32318 & 1) != 0 ? c36558odI2.AhwBna : list, (32318 & 2) != 0 ? c36558odI2.KWHzl : null, (32318 & 4) != 0 ? c36558odI2.DbNXlk : null, (32318 & 8) != 0 ? c36558odI2.AkhnZx : null, (32318 & 16) != 0 ? c36558odI2.isConnected : null, (32318 & 32) != 0 ? c36558odI2.djBIcL : null, (32318 & 64) != 0 ? c36558odI2.EZpvd : false, (32318 & 128) != 0 ? c36558odI2.OLrzqt : false, (32318 & 256) != 0 ? c36558odI2.values : null, (32318 & 512) != 0 ? c36558odI2.AYXKKw : false, (32318 & 1024) != 0 ? c36558odI2.gEmmrt : null, (32318 & 2048) != 0 ? c36558odI2.copydefault : null, (32318 & 4096) != 0 ? c36558odI2.fetchVPNInfo : null, (32318 & 8192) != 0 ? c36558odI2.AEQbTJ : false, (32318 & 16384) != 0 ? c36558odI2.valueOf : false);
    }
}
