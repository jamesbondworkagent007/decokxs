package o;

import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import com.okinc.lifecycle.impl.deeplink.processor.UnknownAppLinkProcessor$validateH5Config$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C38104pMj {
    public static final Activity Companion = new Activity(null);
    public final pMV EZpvd;
    public final Function1<java.lang.String, Unit> KWHzl;
    public final InterfaceC38091pLx copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    @yCM
    public C38104pMj(@NotNull pMV pmv, @NotNull InterfaceC38091pLx interfaceC38091pLx, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(pmv, "");
        Intrinsics.checkNotNullParameter(interfaceC38091pLx, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = pmv;
        this.copydefault = interfaceC38091pLx;
        this.KWHzl = function1;
    }

    /* JADX INFO: renamed from: o.pMj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pMj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Function1<? super LinkState, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (z) {
            java.lang.Object objAEQbTJ = AEQbTJ(str, z2, function1, continuation);
            return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
        }
        copydefault(str, z2, function1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, boolean z, Function1<? super LinkState, Unit> function1, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        UnknownAppLinkProcessor$validateH5Config$1 unknownAppLinkProcessor$validateH5Config$1;
        C38104pMj c38104pMj;
        if (continuation instanceof UnknownAppLinkProcessor$validateH5Config$1) {
            unknownAppLinkProcessor$validateH5Config$1 = (UnknownAppLinkProcessor$validateH5Config$1) continuation;
            int i = unknownAppLinkProcessor$validateH5Config$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                unknownAppLinkProcessor$validateH5Config$1.label = i - Integer.MIN_VALUE;
            } else {
                unknownAppLinkProcessor$validateH5Config$1 = new UnknownAppLinkProcessor$validateH5Config$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = unknownAppLinkProcessor$validateH5Config$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = unknownAppLinkProcessor$validateH5Config$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            InterfaceC38091pLx interfaceC38091pLx = this.copydefault;
            unknownAppLinkProcessor$validateH5Config$1.L$0 = this;
            unknownAppLinkProcessor$validateH5Config$1.L$1 = str;
            unknownAppLinkProcessor$validateH5Config$1.L$2 = function1;
            unknownAppLinkProcessor$validateH5Config$1.Z$0 = z;
            unknownAppLinkProcessor$validateH5Config$1.label = 1;
            objAEQbTJ = interfaceC38091pLx.AEQbTJ(str, unknownAppLinkProcessor$validateH5Config$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c38104pMj = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = unknownAppLinkProcessor$validateH5Config$1.Z$0;
            function1 = (Function1) unknownAppLinkProcessor$validateH5Config$1.L$2;
            str = (java.lang.String) unknownAppLinkProcessor$validateH5Config$1.L$1;
            c38104pMj = (C38104pMj) unknownAppLinkProcessor$validateH5Config$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.lang.String str2 = (java.lang.String) objAEQbTJ;
        if (str2 == null) {
            str2 = "okx://app/web?url=" + str;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            c38104pMj.KWHzl.invoke(str2);
        } else {
            c38104pMj.copydefault(str, z, function1);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str, boolean z, Function1<? super LinkState, Unit> function1) {
        if (z) {
            try {
                this.EZpvd.copydefault(str);
                function1.invoke(LinkState.LINK_OPENED_EXTERNALLY);
                return;
            } catch (java.lang.Exception unused) {
                function1.invoke(LinkState.NO_SUPPORTED_HANDLER);
                return;
            }
        }
        function1.invoke(LinkState.NO_SUPPORTED_HANDLER);
    }
}
