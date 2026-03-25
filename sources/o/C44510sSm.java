package o;

import com.okinc.okimcore.usecase.messages.SearchMessagesUseCase$invoke$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44510sSm {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final C44486sRp AEQbTJ;
    public final pTU copydefault;

    @yCM
    public C44510sSm(@NotNull C44486sRp c44486sRp, @NotNull pTU ptu) {
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        Intrinsics.checkNotNullParameter(ptu, "");
        this.AEQbTJ = c44486sRp;
        this.copydefault = ptu;
    }

    /* JADX INFO: renamed from: o.sSm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull sKT skt, @NotNull Continuation<? super java.util.List<sQY>> continuation) throws java.lang.Exception {
        SearchMessagesUseCase$invoke$1 searchMessagesUseCase$invoke$1;
        if (continuation instanceof SearchMessagesUseCase$invoke$1) {
            searchMessagesUseCase$invoke$1 = (SearchMessagesUseCase$invoke$1) continuation;
            int i = searchMessagesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchMessagesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchMessagesUseCase$invoke$1 = new SearchMessagesUseCase$invoke$1(this, continuation);
            }
        }
        SearchMessagesUseCase$invoke$1 searchMessagesUseCase$invoke$12 = searchMessagesUseCase$invoke$1;
        java.lang.Object objAEQbTJ = searchMessagesUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchMessagesUseCase$invoke$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            boolean zKWHzl = C38303pTu.KWHzl(this.copydefault.OLrzqt().getLocale());
            C44486sRp c44486sRp = this.AEQbTJ;
            java.lang.String strCopydefault = skt.copydefault();
            java.lang.String strKWHzl = skt.KWHzl();
            int iEZpvd = skt.EZpvd();
            java.lang.Long lAEQbTJ = skt.AEQbTJ();
            searchMessagesUseCase$invoke$12.L$0 = skt;
            searchMessagesUseCase$invoke$12.label = 1;
            objAEQbTJ = c44486sRp.AEQbTJ(strCopydefault, strKWHzl, iEZpvd, lAEQbTJ, zKWHzl, searchMessagesUseCase$invoke$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            skt = (sKT) searchMessagesUseCase$invoke$12.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        java.util.List list = (java.util.List) objAEQbTJ;
        pUU.KWHzl("SearchMessagesUseCase", "[" + skt.copydefault() + "] message size=" + list.size());
        return list;
    }
}
