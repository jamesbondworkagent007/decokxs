package o;

import com.okinc.biz.bean.ChatBotRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C22003hUh;

/* JADX INFO: renamed from: o.hUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22003hUh {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.hUh$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hUh.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ChatBotRequest KWHzl() {
            return C6805aWM.OLrzqt(new Function1() { // from class: o.hUm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22003hUh.StateListAnimator.AEQbTJ((ChatBotRequest) obj);
                }
            });
        }

        public static final Unit AEQbTJ(ChatBotRequest chatBotRequest) {
            Intrinsics.checkNotNullParameter(chatBotRequest, "");
            chatBotRequest.setOkaFrom("dex_limitorder_pending");
            chatBotRequest.setOkaChatbotMessage("dex_pending");
            return Unit.INSTANCE;
        }

        public final ChatBotRequest OLrzqt() {
            return C6805aWM.OLrzqt(new Function1() { // from class: o.hUj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C22003hUh.StateListAnimator.copydefault((ChatBotRequest) obj);
                }
            });
        }

        public static final Unit copydefault(ChatBotRequest chatBotRequest) {
            Intrinsics.checkNotNullParameter(chatBotRequest, "");
            chatBotRequest.setOkaFrom("dex_txhistory_error");
            chatBotRequest.setOkaChatbotMessage("dex_error");
            return Unit.INSTANCE;
        }
    }
}
