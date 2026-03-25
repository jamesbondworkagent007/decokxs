package o;

import com.okinc.im.usecase.conversation.InitConversationUseCase$execute$1;
import com.okinc.okimcore.model.exception.UnableToInitConversation;
import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.RelationSourceType;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final sGF EZpvd;

    @yCM
    public oCJ(@NotNull sGF sgf) {
        Intrinsics.checkNotNullParameter(sgf, "");
        this.EZpvd = sgf;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, RelationSourceType relationSourceType, java.lang.String str3, @NotNull Continuation<? super OKConversation> continuation) throws java.lang.Throwable {
        InitConversationUseCase$execute$1 initConversationUseCase$execute$1;
        oCJ ocj;
        java.lang.String targetId;
        java.lang.Object objOLrzqt;
        OKConversation oKConversation;
        if (continuation instanceof InitConversationUseCase$execute$1) {
            initConversationUseCase$execute$1 = (InitConversationUseCase$execute$1) continuation;
            int i = initConversationUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                initConversationUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                initConversationUseCase$execute$1 = new InitConversationUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = initConversationUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = initConversationUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pUU.KWHzl("InitConversationUseCase", "[" + str + "] execute: relationId=" + str2);
            pUU.KWHzl("InitConversationUseCase", "[" + str + "] execute: relationSourceType=" + relationSourceType);
            if (relationSourceType == null) {
                relationSourceType = RelationSourceType.NORMAL;
            }
            pUU.KWHzl("InitConversationUseCase", "[" + str + "] execute: finalRelationSourceType=" + relationSourceType);
            if (str == null && str2 == null) {
                throw new UnableToInitConversation("");
            }
            if (str != null) {
                ocj = this;
                targetId = str;
            } else if (str2 != null) {
                sGF sgf = this.EZpvd;
                initConversationUseCase$execute$1.L$0 = this;
                initConversationUseCase$execute$1.L$1 = str;
                initConversationUseCase$execute$1.label = 1;
                objOLrzqt = sgf.OLrzqt(str2, relationSourceType, str3, initConversationUseCase$execute$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                ocj = this;
            } else {
                ocj = this;
                targetId = null;
            }
            pUU.KWHzl("InitConversationUseCase", "[" + str + "] execute: finalChannelId=" + targetId);
            if (targetId != null || targetId.length() == 0) {
                throw new UnableToInitConversation("");
            }
            sGF sgf2 = ocj.EZpvd;
            CacheStrategy cacheStrategy = CacheStrategy.CacheFirst;
            initConversationUseCase$execute$1.L$0 = str;
            initConversationUseCase$execute$1.L$1 = null;
            initConversationUseCase$execute$1.label = 2;
            objCopydefault = sgf2.copydefault(targetId, cacheStrategy, initConversationUseCase$execute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            oKConversation = (OKConversation) objCopydefault;
            if (oKConversation != null) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) initConversationUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                oKConversation = (OKConversation) objCopydefault;
                if (oKConversation != null) {
                    throw new UnableToInitConversation("");
                }
                pUU.KWHzl("InitConversationUseCase", "[" + str + "] execute: finalChannelIdFetched=" + oKConversation.getTargetId());
                return oKConversation;
            }
            str = (java.lang.String) initConversationUseCase$execute$1.L$1;
            ocj = (oCJ) initConversationUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            objOLrzqt = ((Result) objCopydefault).m7386unboximpl();
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
            java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
            throw new UnableToInitConversation(message != null ? message : "");
        }
        targetId = ((OKConversation) objOLrzqt).getTargetId();
        pUU.KWHzl("InitConversationUseCase", "[" + str + "] execute: finalChannelId=" + targetId);
        if (targetId != null) {
        }
        throw new UnableToInitConversation("");
    }
}
