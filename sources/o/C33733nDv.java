package o;

import com.okinc.im.imui.conversation.message.provider.base.TextMessageBindHelper$canRecall$1;
import com.okinc.im.imui.conversation.message.provider.base.TextMessageBindHelper$getLongClickOptions$2;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKContractAddressMessage;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKShareMessage;
import com.okinc.okimcore.model.im.OKStickerMessage;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33733nDv {
    public static final C33733nDv copydefault = new C33733nDv();

    private C33733nDv() {
    }

    public final C35802oEf EZpvd() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).DarRvM();
    }

    public final java.lang.Object OLrzqt(@NotNull C35254nrp c35254nrp, @NotNull Function0<java.lang.Boolean> function0, Function0<OKConversation> function02, @NotNull Continuation<? super java.util.ArrayList<MenuActionBase>> continuation) {
        return BuildersKt.withContext(sDN.copydefault.copydefault(), new TextMessageBindHelper$getLongClickOptions$2(c35254nrp, function02, function0, null), continuation);
    }

    /* JADX INFO: renamed from: o.nDv$StateListAnimator */
    public static final class StateListAnimator {
        public final GroupTagType AEQbTJ;
        public final OKMessageContent EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final boolean copydefault;
        public final OKMessage gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, OKMessage oKMessage, OKMessageContent oKMessageContent, GroupTagType groupTagType, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                oKMessage = stateListAnimator.gEmmrt;
            }
            if ((i & 2) != 0) {
                oKMessageContent = stateListAnimator.EZpvd;
            }
            OKMessageContent oKMessageContent2 = oKMessageContent;
            if ((i & 4) != 0) {
                groupTagType = stateListAnimator.AEQbTJ;
            }
            GroupTagType groupTagType2 = groupTagType;
            if ((i & 8) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            boolean z4 = z;
            if ((i & 16) != 0) {
                z2 = stateListAnimator.KWHzl;
            }
            boolean z5 = z2;
            if ((i & 32) != 0) {
                z3 = stateListAnimator.copydefault;
            }
            return stateListAnimator.copydefault(oKMessage, oKMessageContent2, groupTagType2, z4, z5, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessageContent AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupTagType OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull OKMessage oKMessage, OKMessageContent oKMessageContent, GroupTagType groupTagType, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            return new StateListAnimator(oKMessage, oKMessageContent, groupTagType, z, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.AEQbTJ == stateListAnimator.AEQbTJ && this.OLrzqt == stateListAnimator.OLrzqt && this.KWHzl == stateListAnimator.KWHzl && this.copydefault == stateListAnimator.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.gEmmrt.hashCode();
            OKMessageContent oKMessageContent = this.EZpvd;
            int iHashCode2 = oKMessageContent == null ? 0 : oKMessageContent.hashCode();
            GroupTagType groupTagType = this.AEQbTJ;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + (groupTagType != null ? groupTagType.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MessageActionState(msg=" + this.gEmmrt + ", content=" + this.EZpvd + ", groupType=" + this.AEQbTJ + ", isAutomated=" + this.OLrzqt + ", isSentSuccess=" + this.KWHzl + ", isAdmin=" + this.copydefault + ")";
        }

        public StateListAnimator(@NotNull OKMessage oKMessage, OKMessageContent oKMessageContent, GroupTagType groupTagType, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            this.gEmmrt = oKMessage;
            this.EZpvd = oKMessageContent;
            this.AEQbTJ = groupTagType;
            this.OLrzqt = z;
            this.KWHzl = z2;
            this.copydefault = z3;
        }
    }

    public final boolean KWHzl(StateListAnimator stateListAnimator) {
        return (stateListAnimator.EZpvd() || (stateListAnimator.AEQbTJ() instanceof OKShareMessage) || (stateListAnimator.AEQbTJ() instanceof OKStickerMessage) || (stateListAnimator.AEQbTJ() instanceof OKContractAddressMessage)) ? false : true;
    }

    public final boolean AEQbTJ(StateListAnimator stateListAnimator) {
        return copydefault(stateListAnimator) && C44157sFk.EZpvd(stateListAnimator.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(StateListAnimator stateListAnimator, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        TextMessageBindHelper$canRecall$1 textMessageBindHelper$canRecall$1;
        C33733nDv c33733nDv;
        boolean z;
        if (continuation instanceof TextMessageBindHelper$canRecall$1) {
            textMessageBindHelper$canRecall$1 = (TextMessageBindHelper$canRecall$1) continuation;
            int i = textMessageBindHelper$canRecall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                textMessageBindHelper$canRecall$1.label = i - Integer.MIN_VALUE;
            } else {
                textMessageBindHelper$canRecall$1 = new TextMessageBindHelper$canRecall$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = textMessageBindHelper$canRecall$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = textMessageBindHelper$canRecall$1.label;
        boolean z2 = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            if (Intrinsics.EZpvd((java.lang.Object) C44157sFk.KWHzl(), (java.lang.Object) stateListAnimator.KWHzl().getSenderUserId())) {
                C35802oEf c35802oEfEZpvd = EZpvd();
                OKMessage oKMessageKWHzl = stateListAnimator.KWHzl();
                textMessageBindHelper$canRecall$1.L$0 = this;
                textMessageBindHelper$canRecall$1.L$1 = stateListAnimator;
                textMessageBindHelper$canRecall$1.label = 1;
                objKWHzl = c35802oEfEZpvd.KWHzl(oKMessageKWHzl, textMessageBindHelper$canRecall$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c33733nDv = this;
            } else {
                c33733nDv = this;
                if (c33733nDv.copydefault(stateListAnimator) && (stateListAnimator.copydefault() || z)) {
                    z2 = true;
                }
                return C56443yFo.KWHzl(z2);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stateListAnimator = (StateListAnimator) textMessageBindHelper$canRecall$1.L$1;
            c33733nDv = (C33733nDv) textMessageBindHelper$canRecall$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        z = ((java.lang.Boolean) objKWHzl).booleanValue();
        if (c33733nDv.copydefault(stateListAnimator)) {
            z2 = true;
        }
        return C56443yFo.KWHzl(z2);
    }

    public final boolean copydefault(StateListAnimator stateListAnimator) {
        return ((stateListAnimator.OLrzqt() == GroupTagType.OTC_AGENT) || stateListAnimator.EZpvd() || (stateListAnimator.KWHzl().getConversationType() == OKConversationType.BROADCAST) || (stateListAnimator.OLrzqt() == GroupTagType.VIDEO_CALL_CHAT_GROUP) || !stateListAnimator.AhwBna()) ? false : true;
    }
}
