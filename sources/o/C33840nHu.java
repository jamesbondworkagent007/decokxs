package o;

import com.okinc.im.imui.conversationlist.usecase.IMConnectionUseCaseImpl$checkImConnectivity$1;
import com.okinc.okimcore.model.im.MessengerConnectionStatus;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33840nHu implements InterfaceC33835nHp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final sKH OLrzqt;

    /* JADX INFO: renamed from: o.nHu$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessengerConnectionStatus.values().length];
            try {
                iArr[MessengerConnectionStatus.Connected.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public C33840nHu(@NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(skh, "");
        this.OLrzqt = skh;
    }

    /* JADX INFO: renamed from: o.nHu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nHu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:24:0x0086). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC33835nHp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        IMConnectionUseCaseImpl$checkImConnectivity$1 iMConnectionUseCaseImpl$checkImConnectivity$1;
        C33840nHu c33840nHu;
        int i;
        int i2;
        if (continuation instanceof IMConnectionUseCaseImpl$checkImConnectivity$1) {
            iMConnectionUseCaseImpl$checkImConnectivity$1 = (IMConnectionUseCaseImpl$checkImConnectivity$1) continuation;
            int i3 = iMConnectionUseCaseImpl$checkImConnectivity$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iMConnectionUseCaseImpl$checkImConnectivity$1.label = i3 - Integer.MIN_VALUE;
            } else {
                iMConnectionUseCaseImpl$checkImConnectivity$1 = new IMConnectionUseCaseImpl$checkImConnectivity$1(this, continuation);
            }
        }
        java.lang.Object obj = iMConnectionUseCaseImpl$checkImConnectivity$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = iMConnectionUseCaseImpl$checkImConnectivity$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            c33840nHu = this;
            i = 10;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = iMConnectionUseCaseImpl$checkImConnectivity$1.I$1;
            i = iMConnectionUseCaseImpl$checkImConnectivity$1.I$0;
            c33840nHu = (C33840nHu) iMConnectionUseCaseImpl$checkImConnectivity$1.L$0;
            C56391yDq.AEQbTJ(obj);
            i2++;
            if (i2 < i) {
                MessengerConnectionStatus messengerConnectionStatusOLrzqt = c33840nHu.OLrzqt();
                C44124sEe.imLogImConnectivity$default("check im attempt count: " + i2 + ", connectionStatus: " + messengerConnectionStatusOLrzqt, null, 2, null);
                if (TaskDescription.AEQbTJ[messengerConnectionStatusOLrzqt.ordinal()] == 1) {
                    return C56443yFo.KWHzl(true);
                }
                iMConnectionUseCaseImpl$checkImConnectivity$1.L$0 = c33840nHu;
                iMConnectionUseCaseImpl$checkImConnectivity$1.I$0 = i;
                iMConnectionUseCaseImpl$checkImConnectivity$1.I$1 = i2;
                iMConnectionUseCaseImpl$checkImConnectivity$1.label = 1;
                if (DelayKt.delay(1000L, iMConnectionUseCaseImpl$checkImConnectivity$1) == objCopydefault) {
                    return objCopydefault;
                }
                i2++;
                if (i2 < i) {
                    C44124sEe.imLogImConnectivity$default("checkImConnectivity retry max reached", null, 2, null);
                    return C56443yFo.KWHzl(false);
                }
            }
        }
    }

    @Override // o.InterfaceC33835nHp
    public boolean KWHzl() {
        return OLrzqt() == MessengerConnectionStatus.Connected;
    }

    public final MessengerConnectionStatus OLrzqt() {
        C44124sEe.imLogImConnectivity$default("getConnectionStatus-->InHouseIM", null, 2, null);
        return this.OLrzqt.AYXKKw();
    }
}
