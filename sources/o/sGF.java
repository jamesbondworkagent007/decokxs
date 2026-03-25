package o;

import com.okinc.okimcore.model.im.CacheStrategy;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.RelationSourceType;
import com.okinc.okimcore.model.other.AnnouncementBanner;
import com.okinc.okimcore.model.other.IMSource;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import o.sNF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sGF extends sGH {
    java.lang.Object AEQbTJ(int i, boolean z, boolean z2, boolean z3, @NotNull Continuation<? super Flow<? extends Result<? extends java.util.List<OKConversation>>>> continuation);

    java.lang.Object AEQbTJ(@NotNull OKConversation oKConversation, boolean z, @NotNull Continuation<? super sNF.Application> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation);

    Flow<java.lang.Integer> AEQbTJ();

    Flow<Result<OKConversation>> AEQbTJ(@NotNull java.lang.String str, @NotNull OKConversationType oKConversationType, @NotNull IMSource iMSource, java.lang.String str2);

    java.lang.Object AhwBna(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object EZpvd(@NotNull OKConversation oKConversation, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super sNF.Application> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super AnnouncementBanner> continuation);

    Flow<java.lang.Integer> EZpvd();

    void EZpvd(@NotNull OKConversation oKConversation);

    void EZpvd(@NotNull AnnouncementBanner announcementBanner);

    void EZpvd(@NotNull java.lang.String str, sGC sgc);

    java.lang.Object KWHzl(@NotNull OKConversationType oKConversationType, @NotNull java.lang.String str, boolean z, boolean z2, java.lang.String str2, @NotNull Continuation<? super OKConversation> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super sNF.Dialog> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super sNF.StateListAnimator> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super Flow<java.lang.Integer>> continuation);

    Flow<java.lang.Integer> KWHzl(@NotNull java.lang.String str);

    OKConversation OLrzqt(@NotNull java.lang.String str);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull RelationSourceType relationSourceType, java.lang.String str2, @NotNull Continuation<? super Result<OKConversation>> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super sNF.Application> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super Flow<java.lang.Integer>> continuation);

    Flow<Result<java.util.List<OKConversation>>> OLrzqt();

    void OLrzqt(@NotNull java.lang.String str, InterfaceC44197sGx interfaceC44197sGx);

    boolean OLrzqt(@NotNull AnnouncementBanner announcementBanner);

    java.lang.Object copydefault(@NotNull OKConversation oKConversation, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull CacheStrategy cacheStrategy, @NotNull Continuation<? super OKConversation> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, boolean z2, @NotNull Continuation<? super sNF.ActionBar> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Flow<java.lang.Integer>> continuation);

    Flow<java.lang.Integer> copydefault();

    Flow<OKConversation> copydefault(@NotNull java.lang.String str);

    java.lang.Object djBIcL(@NotNull Continuation<? super java.lang.Integer> continuation);

    public static final class Activity {
        public static /* synthetic */ java.lang.Object getConversation$default(sGF sgf, OKConversationType oKConversationType, java.lang.String str, boolean z, boolean z2, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversation");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = true;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                str2 = null;
            }
            return sgf.KWHzl(oKConversationType, str, z3, z4, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getConversation$default(sGF sgf, java.lang.String str, CacheStrategy cacheStrategy, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversation");
            }
            if ((i & 2) != 0) {
                cacheStrategy = CacheStrategy.CacheOnly;
            }
            return sgf.copydefault(str, cacheStrategy, continuation);
        }

        /* JADX INFO: renamed from: initConversationByRelationId-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m8708initConversationByRelationIdBWLJW6A$default(sGF sgf, java.lang.String str, RelationSourceType relationSourceType, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initConversationByRelationId-BWLJW6A");
            }
            if ((i & 2) != 0) {
                relationSourceType = RelationSourceType.NORMAL;
            }
            return sgf.OLrzqt(str, relationSourceType, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object changeTopStatus$default(sGF sgf, java.lang.String str, boolean z, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeTopStatus");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return sgf.KWHzl(str, z, z2, continuation);
        }

        public static /* synthetic */ java.lang.Object changeFlaggedTopStatus$default(sGF sgf, java.lang.String str, boolean z, boolean z2, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeFlaggedTopStatus");
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return sgf.copydefault(str, z, z2, continuation);
        }
    }
}
