package o;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.im.kit.config.IMOthersInfoHolder$getUserInfoByMessage$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35695oAg extends oAX {
    public static C35257nrs EZpvd;
    public static final C35695oAg AEQbTJ = new C35695oAg();
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.oAg$Activity */
    public static final class Activity extends C35257nrs {
    }

    private C35695oAg() {
    }

    public final void KWHzl() {
        sHZ shzAEQbTJ;
        sIR sirCopydefault;
        if (EZpvd == null) {
            EZpvd = new Activity();
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) != null && (sirCopydefault = shzAEQbTJ.copydefault()) != null) {
                C35257nrs c35257nrs = EZpvd;
                if (c35257nrs == null) {
                    Intrinsics.gEmmrt("");
                    c35257nrs = null;
                }
                sirCopydefault.KWHzl(c35257nrs);
            }
            pUU.KWHzl("InfoHolder", "ensureRegisteredGroupEventListener");
        }
    }

    @Override // o.oAX
    public java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, @NotNull Continuation<? super IMUserInfo> continuation) {
        KWHzl();
        return AEQbTJ(oKMessage, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(OKMessage oKMessage, Continuation<? super IMUserInfo> continuation) throws java.lang.Throwable {
        IMOthersInfoHolder$getUserInfoByMessage$1 iMOthersInfoHolder$getUserInfoByMessage$1;
        sKH skhCopydefault;
        if (continuation instanceof IMOthersInfoHolder$getUserInfoByMessage$1) {
            iMOthersInfoHolder$getUserInfoByMessage$1 = (IMOthersInfoHolder$getUserInfoByMessage$1) continuation;
            int i = iMOthersInfoHolder$getUserInfoByMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                iMOthersInfoHolder$getUserInfoByMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                iMOthersInfoHolder$getUserInfoByMessage$1 = new IMOthersInfoHolder$getUserInfoByMessage$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = iMOthersInfoHolder$getUserInfoByMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = iMOthersInfoHolder$getUserInfoByMessage$1.label;
        IMUserInfo iMUserInfo = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && (skhCopydefault = interfaceC35180nqU.copydefault()) != null) {
                iMOthersInfoHolder$getUserInfoByMessage$1.L$0 = oKMessage;
                iMOthersInfoHolder$getUserInfoByMessage$1.label = 1;
                objOLrzqt = skhCopydefault.OLrzqt(oKMessage, (java.lang.String) null, iMOthersInfoHolder$getUserInfoByMessage$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
            pUU.EZpvd("InfoHolder", "IMOthersInfoHolder: messageId: " + oKMessage.getSeq());
            pUU.KWHzl("InfoHolder", "IMOthersInfoHolder: MemberInfo-->imUserInfo: " + iMUserInfo);
            return iMUserInfo;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        oKMessage = (OKMessage) iMOthersInfoHolder$getUserInfoByMessage$1.L$0;
        C56391yDq.AEQbTJ(objOLrzqt);
        C44461sQr c44461sQr = (C44461sQr) objOLrzqt;
        if (c44461sQr != null) {
            java.lang.String senderUserId = oKMessage.getSenderUserId();
            if (senderUserId == null) {
                senderUserId = "";
            }
            iMUserInfo = new IMUserInfo(senderUserId, c44461sQr.AEQbTJ(), C37683oyU.copydefault(c44461sQr), c44461sQr.EZpvd());
        }
        pUU.EZpvd("InfoHolder", "IMOthersInfoHolder: messageId: " + oKMessage.getSeq());
        pUU.KWHzl("InfoHolder", "IMOthersInfoHolder: MemberInfo-->imUserInfo: " + iMUserInfo);
        return iMUserInfo;
    }

    @Override // o.oAX
    public void AEQbTJ(@NotNull java.lang.String str) {
        sFU sfuEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        RelationInfo relationInfoKWHzl = (interfaceC35180nqU == null || (sfuEZpvd = interfaceC35180nqU.EZpvd()) == null) ? null : sfuEZpvd.KWHzl(str);
        if (relationInfoKWHzl != null) {
            copydefault(new IMUserInfo(str, relationInfoKWHzl.getAvatar(), C44157sFk.KWHzl(relationInfoKWHzl, null), relationInfoKWHzl.getOfficialTags()));
        }
    }
}
