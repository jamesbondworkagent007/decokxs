package o;

import com.okinc.im.usecase.message.CheckRecallEligibilityUseCase$invoke$1;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35802oEf {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final sNF EZpvd;
    public final oDB KWHzl;

    @yCM
    public C35802oEf(@NotNull sNF snf, @NotNull oDB odb) {
        Intrinsics.checkNotNullParameter(snf, "");
        Intrinsics.checkNotNullParameter(odb, "");
        this.EZpvd = snf;
        this.KWHzl = odb;
    }

    /* JADX INFO: renamed from: o.oEf$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull OKMessage oKMessage, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        CheckRecallEligibilityUseCase$invoke$1 checkRecallEligibilityUseCase$invoke$1;
        C35802oEf c35802oEf;
        GroupUserSettingInfo userSettingInfo;
        if (continuation instanceof CheckRecallEligibilityUseCase$invoke$1) {
            checkRecallEligibilityUseCase$invoke$1 = (CheckRecallEligibilityUseCase$invoke$1) continuation;
            int i = checkRecallEligibilityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkRecallEligibilityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkRecallEligibilityUseCase$invoke$1 = new CheckRecallEligibilityUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = checkRecallEligibilityUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkRecallEligibilityUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (oKMessage.getConversationType() == OKConversationType.GROUP) {
                oDB odb = this.KWHzl;
                java.lang.String targetId = oKMessage.getTargetId();
                checkRecallEligibilityUseCase$invoke$1.L$0 = this;
                checkRecallEligibilityUseCase$invoke$1.L$1 = oKMessage;
                checkRecallEligibilityUseCase$invoke$1.label = 1;
                objAEQbTJ = odb.AEQbTJ(targetId, checkRecallEligibilityUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                c35802oEf = this;
            } else {
                c35802oEf = this;
                return C56443yFo.KWHzl((java.lang.System.currentTimeMillis() - c35802oEf.EZpvd.OLrzqt()) - oKMessage.getSentTime() < 3600000);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oKMessage = (OKMessage) checkRecallEligibilityUseCase$invoke$1.L$1;
            c35802oEf = (C35802oEf) checkRecallEligibilityUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        GroupInfo groupInfo = (GroupInfo) objAEQbTJ;
        if (groupInfo != null && (userSettingInfo = groupInfo.getUserSettingInfo()) != null && C44170sFx.KWHzl(userSettingInfo.getRole())) {
            return C56443yFo.KWHzl(true);
        }
        return C56443yFo.KWHzl((java.lang.System.currentTimeMillis() - c35802oEf.EZpvd.OLrzqt()) - oKMessage.getSentTime() < 3600000);
    }
}
