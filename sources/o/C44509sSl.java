package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.usecase.messages.SearchChatsUseCase$invoke$1;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44509sSl {
    public final C44484sRn KWHzl;
    public final pTU copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C44509sSl(@NotNull C44484sRn c44484sRn, @NotNull pTU ptu) {
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(ptu, "");
        this.KWHzl = c44484sRn;
        this.copydefault = ptu;
    }

    /* JADX INFO: renamed from: o.sSl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(C44509sSl c44509sSl, sKR skr, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c44509sSl.OLrzqt(skr, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull sKR skr, boolean z, @NotNull Continuation<? super java.util.List<sQU>> continuation) throws java.lang.Exception {
        SearchChatsUseCase$invoke$1 searchChatsUseCase$invoke$1;
        C44509sSl c44509sSl;
        boolean z2;
        boolean z3;
        java.util.List list;
        sKR skr2;
        C44508sSk c44508sSk;
        if (continuation instanceof SearchChatsUseCase$invoke$1) {
            searchChatsUseCase$invoke$1 = (SearchChatsUseCase$invoke$1) continuation;
            int i = searchChatsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchChatsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                searchChatsUseCase$invoke$1 = new SearchChatsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = searchChatsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchChatsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zKWHzl = C38303pTu.KWHzl(this.copydefault.OLrzqt().getLocale());
            boolean zAEQbTJ = C44157sFk.AEQbTJ();
            C44484sRn c44484sRn = this.KWHzl;
            java.lang.String strEZpvd = skr.EZpvd();
            java.lang.Integer numCopydefault = skr.copydefault();
            searchChatsUseCase$invoke$1.L$0 = this;
            searchChatsUseCase$invoke$1.L$1 = skr;
            searchChatsUseCase$invoke$1.Z$0 = zKWHzl;
            searchChatsUseCase$invoke$1.Z$1 = zAEQbTJ;
            searchChatsUseCase$invoke$1.label = 1;
            java.lang.Object objCopydefault2 = c44484sRn.copydefault(strEZpvd, numCopydefault, zKWHzl, zAEQbTJ, z, searchChatsUseCase$invoke$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c44509sSl = this;
            z2 = zKWHzl;
            z3 = zAEQbTJ;
            obj = objCopydefault2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c44508sSk = (C44508sSk) searchChatsUseCase$invoke$1.L$2;
                list = (java.util.List) searchChatsUseCase$invoke$1.L$1;
                skr2 = (sKR) searchChatsUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(obj);
                java.util.List<sQU> listCopydefault = c44508sSk.copydefault((java.util.List) obj);
                if (skr2.copydefault() != null) {
                    return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) listCopydefault);
                }
                return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) listCopydefault), skr2.copydefault().intValue());
            }
            boolean z4 = searchChatsUseCase$invoke$1.Z$1;
            boolean z5 = searchChatsUseCase$invoke$1.Z$0;
            sKR skr3 = (sKR) searchChatsUseCase$invoke$1.L$1;
            c44509sSl = (C44509sSl) searchChatsUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z3 = z4;
            z2 = z5;
            skr = skr3;
        }
        list = (java.util.List) obj;
        C44508sSk c44508sSk2 = C44508sSk.OLrzqt;
        C44484sRn c44484sRn2 = c44509sSl.KWHzl;
        java.lang.String strEZpvd2 = skr.EZpvd();
        java.lang.Integer numCopydefault2 = skr.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            InHouseIMConversationEntity inHouseIMConversationEntityCopydefault = ((sQU) it.next()).copydefault();
            java.lang.String channelId = inHouseIMConversationEntityCopydefault != null ? inHouseIMConversationEntityCopydefault.getChannelId() : null;
            if (channelId != null) {
                arrayList.add(channelId);
            }
        }
        searchChatsUseCase$invoke$1.L$0 = skr;
        searchChatsUseCase$invoke$1.L$1 = list;
        searchChatsUseCase$invoke$1.L$2 = c44508sSk2;
        searchChatsUseCase$invoke$1.label = 2;
        java.lang.Object objOLrzqt = c44484sRn2.OLrzqt(strEZpvd2, numCopydefault2, z2, z3, arrayList, searchChatsUseCase$invoke$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        skr2 = skr;
        c44508sSk = c44508sSk2;
        obj = objOLrzqt;
        java.util.List<sQU> listCopydefault2 = c44508sSk.copydefault((java.util.List) obj);
        if (skr2.copydefault() != null) {
        }
    }
}
