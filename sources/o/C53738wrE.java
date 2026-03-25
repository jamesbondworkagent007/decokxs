package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.signalClone.domain.CreateShareLinkUseCase$execute$1;
import com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkBody;
import com.okinc.tradingbot.impl.signalClone.dto.SignalCloneCreateLinkResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53738wrE extends vNH<ActionBar, SignalCloneCreateLinkResponse> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC50055vAf KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C53738wrE(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC50055vAf;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.wrE$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wrE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C53738wrE AEQbTJ() {
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            return ((InterfaceC51009vet) C58114yvF.OLrzqt(C43246rlf.OLrzqt.valueOf(), InterfaceC51009vet.class)).DQzvGN();
        }
    }

    /* JADX INFO: renamed from: o.wrE$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.AEQbTJ;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.KWHzl;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = actionBar.OLrzqt;
            }
            return actionBar.AEQbTJ(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new ActionBar(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(algoId=" + this.EZpvd + ", algoOrdType=" + this.copydefault + ", copyType=" + this.AEQbTJ + ", instId=" + this.KWHzl + ", instType=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.AEQbTJ = str3;
            this.KWHzl = str4;
            this.OLrzqt = str5;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.vNH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull ActionBar actionBar, @NotNull Continuation<? super SignalCloneCreateLinkResponse> continuation) throws java.lang.Throwable {
        CreateShareLinkUseCase$execute$1 createShareLinkUseCase$execute$1;
        AbstractC43419rot actionBar2;
        AbstractC43419rot actionBar3;
        java.lang.String lowerCase;
        if (continuation instanceof CreateShareLinkUseCase$execute$1) {
            createShareLinkUseCase$execute$1 = (CreateShareLinkUseCase$execute$1) continuation;
            int i = createShareLinkUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createShareLinkUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                createShareLinkUseCase$execute$1 = new CreateShareLinkUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = createShareLinkUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = createShareLinkUseCase$execute$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                InterfaceC50055vAf interfaceC50055vAf = this.KWHzl;
                if (C34703nhO.AEQbTJ()) {
                    lowerCase = "OKTR".toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                } else {
                    lowerCase = "OKX".toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                SignalCloneCreateLinkBody signalCloneCreateLinkBody = new SignalCloneCreateLinkBody(actionBar.OLrzqt(), actionBar.copydefault(), (Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) "3") || Intrinsics.EZpvd((java.lang.Object) actionBar.KWHzl(), (java.lang.Object) "1")) ? "1" : "2", actionBar.EZpvd(), actionBar.AEQbTJ(), "copy_share", "exchange", "trading_bot", lowerCase, 2);
                createShareLinkUseCase$execute$1.label = 1;
                objCopydefault = interfaceC50055vAf.copydefault(signalCloneCreateLinkBody, createShareLinkUseCase$execute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
            }
            ResponseData responseData = (ResponseData) objCopydefault;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar2 = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar2 instanceof AbstractC43419rot.StateListAnimator) {
            actionBar3 = new AbstractC43419rot.StateListAnimator((SignalCloneCreateLinkResponse) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) ((AbstractC43419rot.StateListAnimator) actionBar2).KWHzl()));
        } else {
            if (!(actionBar2 instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            actionBar3 = new AbstractC43419rot.ActionBar(((AbstractC43419rot.ActionBar) actionBar2).KWHzl());
        }
        return actionBar3.AEQbTJ();
    }
}
