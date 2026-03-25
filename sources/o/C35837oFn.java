package o;

import com.okinc.im.usecase.notification.MarkNotificationConversationAsViewedUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35837oFn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final rXQ AEQbTJ;
    public final InterfaceC44375sNm EZpvd;

    @yCM
    public C35837oFn(@NotNull InterfaceC44375sNm interfaceC44375sNm, @NotNull rXQ rxq) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        Intrinsics.checkNotNullParameter(rxq, "");
        this.EZpvd = interfaceC44375sNm;
        this.AEQbTJ = rxq;
    }

    /* JADX INFO: renamed from: o.oFn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static /* synthetic */ java.lang.Object execute$default(C35837oFn c35837oFn, rXL rxl, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c35837oFn.AEQbTJ(rxl, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull rXL rxl, boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MarkNotificationConversationAsViewedUseCase$execute$1 markNotificationConversationAsViewedUseCase$execute$1;
        C35837oFn c35837oFn;
        boolean z2;
        C35837oFn c35837oFn2;
        if (continuation instanceof MarkNotificationConversationAsViewedUseCase$execute$1) {
            markNotificationConversationAsViewedUseCase$execute$1 = (MarkNotificationConversationAsViewedUseCase$execute$1) continuation;
            int i = markNotificationConversationAsViewedUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                markNotificationConversationAsViewedUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                markNotificationConversationAsViewedUseCase$execute$1 = new MarkNotificationConversationAsViewedUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = markNotificationConversationAsViewedUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = markNotificationConversationAsViewedUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            pUU.KWHzl("MarkNotificationConversationAsViewedUseCase", "execute...: " + rxl.EZpvd());
            InterfaceC44375sNm interfaceC44375sNm = this.EZpvd;
            java.lang.String strEZpvd = rxl.EZpvd();
            markNotificationConversationAsViewedUseCase$execute$1.L$0 = this;
            markNotificationConversationAsViewedUseCase$execute$1.L$1 = rxl;
            markNotificationConversationAsViewedUseCase$execute$1.Z$0 = z;
            markNotificationConversationAsViewedUseCase$execute$1.label = 1;
            objOLrzqt = interfaceC44375sNm.OLrzqt(strEZpvd, markNotificationConversationAsViewedUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c35837oFn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = markNotificationConversationAsViewedUseCase$execute$1.Z$1;
                z = markNotificationConversationAsViewedUseCase$execute$1.Z$0;
                c35837oFn2 = (C35837oFn) markNotificationConversationAsViewedUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                if (z) {
                    c35837oFn2.AEQbTJ.KWHzl();
                }
                return C56443yFo.KWHzl(z2);
            }
            z = markNotificationConversationAsViewedUseCase$execute$1.Z$0;
            rxl = (rXL) markNotificationConversationAsViewedUseCase$execute$1.L$1;
            c35837oFn = (C35837oFn) markNotificationConversationAsViewedUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objOLrzqt).booleanValue();
        rXQ rxq = c35837oFn.AEQbTJ;
        java.lang.String strAEQbTJ = rxl.AEQbTJ();
        markNotificationConversationAsViewedUseCase$execute$1.L$0 = c35837oFn;
        markNotificationConversationAsViewedUseCase$execute$1.L$1 = null;
        markNotificationConversationAsViewedUseCase$execute$1.Z$0 = z;
        markNotificationConversationAsViewedUseCase$execute$1.Z$1 = zBooleanValue;
        markNotificationConversationAsViewedUseCase$execute$1.label = 2;
        if (rxq.EZpvd(strAEQbTJ, markNotificationConversationAsViewedUseCase$execute$1) == objCopydefault) {
            return objCopydefault;
        }
        z2 = zBooleanValue;
        c35837oFn2 = c35837oFn;
        if (z) {
        }
        return C56443yFo.KWHzl(z2);
    }
}
