package o;

import com.okinc.im.usecase.conversation.ClearOrbitConversationUnreadUseCase$invoke$1;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.planet_api.model.SimpleResp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.tWL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCD {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final tWL EZpvd;
    public final InterfaceC44375sNm KWHzl;

    @yCM
    public oCD(@NotNull InterfaceC44375sNm interfaceC44375sNm, tWL twl) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        this.KWHzl = interfaceC44375sNm;
        this.EZpvd = twl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: invoke-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8700invokegIAlus$default(oCD ocd, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ocd.EZpvd(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Result<Unit>> continuation) {
        ClearOrbitConversationUnreadUseCase$invoke$1 clearOrbitConversationUnreadUseCase$invoke$1;
        oCD ocd;
        java.lang.Object objM7377constructorimpl;
        SimpleResp simpleResp;
        if (continuation instanceof ClearOrbitConversationUnreadUseCase$invoke$1) {
            clearOrbitConversationUnreadUseCase$invoke$1 = (ClearOrbitConversationUnreadUseCase$invoke$1) continuation;
            int i = clearOrbitConversationUnreadUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                clearOrbitConversationUnreadUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                clearOrbitConversationUnreadUseCase$invoke$1 = new ClearOrbitConversationUnreadUseCase$invoke$1(this, continuation);
            }
        }
        ClearOrbitConversationUnreadUseCase$invoke$1 clearOrbitConversationUnreadUseCase$invoke$12 = clearOrbitConversationUnreadUseCase$invoke$1;
        java.lang.Object objOLrzqt = clearOrbitConversationUnreadUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = clearOrbitConversationUnreadUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            pUU.KWHzl("ClearOrbitConversationUnreadUseCase", "start clear local db unread, local Only: " + z);
            try {
                Result.Application application = Result.Companion;
                InterfaceC44375sNm interfaceC44375sNm = this.KWHzl;
                clearOrbitConversationUnreadUseCase$invoke$12.L$0 = this;
                clearOrbitConversationUnreadUseCase$invoke$12.Z$0 = z;
                clearOrbitConversationUnreadUseCase$invoke$12.label = 1;
                objOLrzqt = interfaceC44375sNm.OLrzqt("orbit_updates", clearOrbitConversationUnreadUseCase$invoke$12);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                ocd = this;
            } catch (java.lang.Throwable th) {
                th = th;
                ocd = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                simpleResp = (SimpleResp) objOLrzqt;
                if (!simpleResp.isRequestSuccess()) {
                    Result.Application application3 = Result.Companion;
                    return Result.m7377constructorimpl(Unit.INSTANCE);
                }
                Result.Application application4 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKIMException(simpleResp.getErrorMessage(), 0, 2, (DefaultConstructorMarker) null)));
            }
            z = clearOrbitConversationUnreadUseCase$invoke$12.Z$0;
            ocd = (oCD) clearOrbitConversationUnreadUseCase$invoke$12.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(((java.lang.Boolean) objOLrzqt).booleanValue()));
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application5 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
        }
        if (z) {
            Result.Application application6 = Result.Companion;
            return Result.m7377constructorimpl(Unit.INSTANCE);
        }
        tWL twl = ocd.EZpvd;
        if (twl == null) {
            Result.Application application7 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKIMException("Service not available", 0, 2, (DefaultConstructorMarker) null)));
        }
        clearOrbitConversationUnreadUseCase$invoke$12.L$0 = null;
        clearOrbitConversationUnreadUseCase$invoke$12.label = 2;
        objOLrzqt = tWL.Application.markOrbitNotificationMsgAsRead$default(twl, 0, null, clearOrbitConversationUnreadUseCase$invoke$12, 3, null);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        simpleResp = (SimpleResp) objOLrzqt;
        if (!simpleResp.isRequestSuccess()) {
        }
    }
}
