package o;

import com.okinc.lifecycle.impl.deeplink.usecase.ModeSwitchUseCaseImpl$switchModeIfRequired$1;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC33171mrS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pMF implements pMA {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC33171mrS AEQbTJ;
    public final pKH EZpvd;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DeeplinkMode.values().length];
            try {
                iArr[DeeplinkMode.WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DeeplinkMode.LITE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DeeplinkMode.PRO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DeeplinkMode.PAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public pMF(@NotNull InterfaceC33171mrS interfaceC33171mrS, pKH pkh) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.AEQbTJ = interfaceC33171mrS;
        this.EZpvd = pkh;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.pMA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull android.content.Context context, @NotNull DeeplinkMode deeplinkMode, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        ModeSwitchUseCaseImpl$switchModeIfRequired$1 modeSwitchUseCaseImpl$switchModeIfRequired$1;
        int iCopydefault;
        pMF pmf;
        android.content.Context context2 = context;
        if (continuation instanceof ModeSwitchUseCaseImpl$switchModeIfRequired$1) {
            modeSwitchUseCaseImpl$switchModeIfRequired$1 = (ModeSwitchUseCaseImpl$switchModeIfRequired$1) continuation;
            int i = modeSwitchUseCaseImpl$switchModeIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                modeSwitchUseCaseImpl$switchModeIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                modeSwitchUseCaseImpl$switchModeIfRequired$1 = new ModeSwitchUseCaseImpl$switchModeIfRequired$1(this, continuation);
            }
        }
        ModeSwitchUseCaseImpl$switchModeIfRequired$1 modeSwitchUseCaseImpl$switchModeIfRequired$12 = modeSwitchUseCaseImpl$switchModeIfRequired$1;
        java.lang.Object objKWHzl = modeSwitchUseCaseImpl$switchModeIfRequired$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = modeSwitchUseCaseImpl$switchModeIfRequired$12.label;
        boolean zBooleanValue = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            iCopydefault = copydefault(deeplinkMode);
            if (iCopydefault != 0 && iCopydefault != this.AEQbTJ.isConnected().getValue().intValue()) {
                if (iCopydefault != 3) {
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.L$0 = this;
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.L$1 = context2;
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.I$0 = iCopydefault;
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.label = 3;
                    C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(modeSwitchUseCaseImpl$switchModeIfRequired$12));
                    InterfaceC33171mrS.Activity.switchToAppMode$default(this.AEQbTJ, context, iCopydefault, true, 0, null, new Application(c56434yFf), 8, null);
                    objKWHzl = c56434yFf.KWHzl();
                    if (objKWHzl == C56442yFn.copydefault()) {
                        C56447yFs.copydefault(modeSwitchUseCaseImpl$switchModeIfRequired$12);
                    }
                    return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
                }
                pKH pkh = this.EZpvd;
                if (pkh != null) {
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.L$0 = this;
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.L$1 = context2;
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.I$0 = iCopydefault;
                    modeSwitchUseCaseImpl$switchModeIfRequired$12.label = 1;
                    objKWHzl = pkh.OLrzqt(context2, "deeplink", modeSwitchUseCaseImpl$switchModeIfRequired$12);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    pmf = this;
                    zBooleanValue = ((java.lang.Boolean) objKWHzl).booleanValue();
                } else {
                    pmf = this;
                }
            }
            return C56443yFo.KWHzl(zBooleanValue);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objKWHzl);
            }
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        int i3 = modeSwitchUseCaseImpl$switchModeIfRequired$12.I$0;
        android.content.Context context3 = (android.content.Context) modeSwitchUseCaseImpl$switchModeIfRequired$12.L$1;
        pmf = (pMF) modeSwitchUseCaseImpl$switchModeIfRequired$12.L$0;
        C56391yDq.AEQbTJ(objKWHzl);
        iCopydefault = i3;
        context2 = context3;
        zBooleanValue = ((java.lang.Boolean) objKWHzl).booleanValue();
        android.content.Context context4 = context2;
        int i4 = iCopydefault;
        if (zBooleanValue) {
            modeSwitchUseCaseImpl$switchModeIfRequired$12.L$0 = pmf;
            modeSwitchUseCaseImpl$switchModeIfRequired$12.L$1 = context4;
            modeSwitchUseCaseImpl$switchModeIfRequired$12.I$0 = i4;
            modeSwitchUseCaseImpl$switchModeIfRequired$12.label = 2;
            C56434yFf c56434yFf2 = new C56434yFf(C56441yFm.OLrzqt(modeSwitchUseCaseImpl$switchModeIfRequired$12));
            InterfaceC33171mrS.Activity.switchToAppMode$default(pmf.AEQbTJ, context4, i4, true, 0, null, new TaskDescription(c56434yFf2), 8, null);
            objKWHzl = c56434yFf2.KWHzl();
            if (objKWHzl == C56442yFn.copydefault()) {
                C56447yFs.copydefault(modeSwitchUseCaseImpl$switchModeIfRequired$12);
            }
            return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
        }
        zBooleanValue = false;
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public static final class TaskDescription implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ Continuation<java.lang.Boolean> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Continuation<? super java.lang.Boolean> continuation) {
            this.EZpvd = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            copydefault(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(boolean z) {
            Continuation<java.lang.Boolean> continuation = this.EZpvd;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    public static final class Application implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ Continuation<java.lang.Boolean> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Continuation<? super java.lang.Boolean> continuation) {
            this.AEQbTJ = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            KWHzl(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void KWHzl(boolean z) {
            Continuation<java.lang.Boolean> continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(java.lang.Boolean.valueOf(z)));
        }
    }

    public final int copydefault(@NotNull DeeplinkMode deeplinkMode) {
        Intrinsics.checkNotNullParameter(deeplinkMode, "");
        int i = Activity.OLrzqt[deeplinkMode.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 1;
    }
}
