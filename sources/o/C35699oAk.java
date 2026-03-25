package o;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.kit.config.IMSenderInfoHolder$getUserInfoByMessage$1;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35699oAk extends oAX {
    public static final C35699oAk AEQbTJ = new C35699oAk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oAX
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    private C35699oAk() {
    }

    @Override // o.oAX
    public java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, @NotNull Continuation<? super IMUserInfo> continuation) {
        return EZpvd(oKMessage, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(OKMessage oKMessage, Continuation<? super IMUserInfo> continuation) throws java.lang.Throwable {
        IMSenderInfoHolder$getUserInfoByMessage$1 iMSenderInfoHolder$getUserInfoByMessage$1;
        java.lang.String strKWHzl;
        sKH skhCopydefault;
        java.lang.Object objOLrzqt;
        if (continuation instanceof IMSenderInfoHolder$getUserInfoByMessage$1) {
            iMSenderInfoHolder$getUserInfoByMessage$1 = (IMSenderInfoHolder$getUserInfoByMessage$1) continuation;
            int i = iMSenderInfoHolder$getUserInfoByMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iMSenderInfoHolder$getUserInfoByMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                iMSenderInfoHolder$getUserInfoByMessage$1 = new IMSenderInfoHolder$getUserInfoByMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = iMSenderInfoHolder$getUserInfoByMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iMSenderInfoHolder$getUserInfoByMessage$1.label;
        IMUserInfo iMUserInfo = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (oKMessage.getConversationType() == OKConversationType.GROUP) {
                strKWHzl = oKMessage.getTargetId();
            } else {
                strKWHzl = C44157sFk.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
            }
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && (skhCopydefault = interfaceC35180nqU.copydefault()) != null) {
                iMSenderInfoHolder$getUserInfoByMessage$1.L$0 = oKMessage;
                iMSenderInfoHolder$getUserInfoByMessage$1.L$1 = strKWHzl;
                iMSenderInfoHolder$getUserInfoByMessage$1.label = 1;
                objOLrzqt = skhCopydefault.OLrzqt(oKMessage, (java.lang.String) null, iMSenderInfoHolder$getUserInfoByMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            pUU.EZpvd("InfoHolder", "IMSenderInfoHolder: messageId: " + oKMessage.getSeq());
            pUU.KWHzl("InfoHolder", "IMSenderInfoHolder: MemberInfo-->imUserInfo: " + iMUserInfo);
            return iMUserInfo;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.String str = (java.lang.String) iMSenderInfoHolder$getUserInfoByMessage$1.L$1;
        OKMessage oKMessage2 = (OKMessage) iMSenderInfoHolder$getUserInfoByMessage$1.L$0;
        C56391yDq.AEQbTJ(obj);
        strKWHzl = str;
        oKMessage = oKMessage2;
        objOLrzqt = obj;
        C44461sQr c44461sQr = (C44461sQr) objOLrzqt;
        if (c44461sQr != null) {
            iMUserInfo = new IMUserInfo(strKWHzl, c44461sQr.AEQbTJ(), C37683oyU.copydefault(c44461sQr), c44461sQr.EZpvd());
        }
        pUU.EZpvd("InfoHolder", "IMSenderInfoHolder: messageId: " + oKMessage.getSeq());
        pUU.KWHzl("InfoHolder", "IMSenderInfoHolder: MemberInfo-->imUserInfo: " + iMUserInfo);
        return iMUserInfo;
    }
}
