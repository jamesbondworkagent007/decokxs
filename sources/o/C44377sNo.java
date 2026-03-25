package o;

import com.okinc.okimcore.feature.share.SearchShareTargetsUseCaseImpl$invoke$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.sQW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44377sNo implements InterfaceC44380sNr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C44509sSl OLrzqt;

    @yCM
    public C44377sNo(@NotNull C44509sSl c44509sSl) {
        Intrinsics.checkNotNullParameter(c44509sSl, "");
        this.OLrzqt = c44509sSl;
    }

    /* JADX INFO: renamed from: o.sNo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sNo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC44380sNr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<ShareTarget>> continuation) throws java.lang.Throwable {
        SearchShareTargetsUseCaseImpl$invoke$1 searchShareTargetsUseCaseImpl$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof SearchShareTargetsUseCaseImpl$invoke$1) {
            searchShareTargetsUseCaseImpl$invoke$1 = (SearchShareTargetsUseCaseImpl$invoke$1) continuation;
            int i = searchShareTargetsUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchShareTargetsUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchShareTargetsUseCaseImpl$invoke$1 = new SearchShareTargetsUseCaseImpl$invoke$1(this, continuation);
            }
        }
        SearchShareTargetsUseCaseImpl$invoke$1 searchShareTargetsUseCaseImpl$invoke$12 = searchShareTargetsUseCaseImpl$invoke$1;
        java.lang.Object objInvoke$default = searchShareTargetsUseCaseImpl$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchShareTargetsUseCaseImpl$invoke$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objInvoke$default);
                Result.Application application = Result.Companion;
                sKR skr = new sKR(str, C56443yFo.AEQbTJ(5));
                C44509sSl c44509sSl = this.OLrzqt;
                searchShareTargetsUseCaseImpl$invoke$12.label = 1;
                objInvoke$default = C44509sSl.invoke$default(c44509sSl, skr, false, searchShareTargetsUseCaseImpl$invoke$12, 2, null);
                if (objInvoke$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objInvoke$default);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (sQU squ : (java.lang.Iterable) objInvoke$default) {
                InHouseIMConversationEntity inHouseIMConversationEntityCopydefault = squ.copydefault();
                OKConversation oKConversationOLrzqt = inHouseIMConversationEntityCopydefault != null ? C44169sFw.OLrzqt(inHouseIMConversationEntityCopydefault) : null;
                sSM ssm = sSM.AEQbTJ;
                InHouseIMContactInfoEntity inHouseIMContactInfoEntityOLrzqt = squ.OLrzqt();
                ShareTarget shareTargetOLrzqt = sQZ.OLrzqt(new sQW.StateListAnimator(oKConversationOLrzqt, ssm.OLrzqt(inHouseIMContactInfoEntityOLrzqt != null ? C44169sFw.OLrzqt(inHouseIMContactInfoEntityOLrzqt) : null), squ.KWHzl()));
                if (shareTargetOLrzqt != null) {
                    arrayList.add(shareTargetOLrzqt);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : yDY.AhwBna();
    }
}
