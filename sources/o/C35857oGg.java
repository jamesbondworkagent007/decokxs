package o;

import com.okinc.im.usecase.relationinfo.GetRelationInfoByConversationIdUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35857oGg {
    public final C35864oGn AEQbTJ;
    public final oCE OLrzqt;

    @yCM
    public C35857oGg(@NotNull C35864oGn c35864oGn, @NotNull oCE oce) {
        Intrinsics.checkNotNullParameter(c35864oGn, "");
        Intrinsics.checkNotNullParameter(oce, "");
        this.AEQbTJ = c35864oGn;
        this.OLrzqt = oce;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super RelationInfo> continuation) throws java.lang.Throwable {
        GetRelationInfoByConversationIdUseCase$execute$1 getRelationInfoByConversationIdUseCase$execute$1;
        C35857oGg c35857oGg;
        if (continuation instanceof GetRelationInfoByConversationIdUseCase$execute$1) {
            getRelationInfoByConversationIdUseCase$execute$1 = (GetRelationInfoByConversationIdUseCase$execute$1) continuation;
            int i = getRelationInfoByConversationIdUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRelationInfoByConversationIdUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRelationInfoByConversationIdUseCase$execute$1 = new GetRelationInfoByConversationIdUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getRelationInfoByConversationIdUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRelationInfoByConversationIdUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            oCE oce = this.OLrzqt;
            getRelationInfoByConversationIdUseCase$execute$1.L$0 = this;
            getRelationInfoByConversationIdUseCase$execute$1.label = 1;
            objOLrzqt = oce.OLrzqt(str, getRelationInfoByConversationIdUseCase$execute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c35857oGg = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c35857oGg = (C35857oGg) getRelationInfoByConversationIdUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        OKConversation oKConversation = (OKConversation) objOLrzqt;
        java.lang.String strCopydefault = oKConversation != null ? C44166sFt.copydefault(oKConversation) : null;
        C35864oGn c35864oGn = c35857oGg.AEQbTJ;
        getRelationInfoByConversationIdUseCase$execute$1.L$0 = null;
        getRelationInfoByConversationIdUseCase$execute$1.label = 2;
        objOLrzqt = c35864oGn.AEQbTJ(strCopydefault, getRelationInfoByConversationIdUseCase$execute$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }
}
