package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC37162ood;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37167ooi {
    public static final java.lang.String EZpvd(@NotNull AbstractC37162ood abstractC37162ood) {
        Intrinsics.checkNotNullParameter(abstractC37162ood, "");
        if (abstractC37162ood instanceof AbstractC37162ood.Activity) {
            AbstractC37162ood.Activity activity = (AbstractC37162ood.Activity) abstractC37162ood;
            return "OneToOneCall action[" + activity.KWHzl() + "] conversationId[" + activity.djBIcL() + "] remoteUserId[" + activity.AYXKKw() + "] hasCallSession[" + (activity.copydefault() != null) + "] hasUiParams[" + (activity.EZpvd() != null) + "] floatingViewX[" + activity.OLrzqt() + "] floatingViewY[" + activity.AEQbTJ() + "]";
        }
        if (abstractC37162ood instanceof AbstractC37162ood.LoaderManager) {
            AbstractC37162ood.LoaderManager loaderManager = (AbstractC37162ood.LoaderManager) abstractC37162ood;
            return "StartGroupCall groupId[" + loaderManager.copydefault() + "] targetUids[" + CollectionsKt___CollectionsKt.joinToString$default(loaderManager.KWHzl(), ",", null, null, 0, null, null, 62, null) + "] hasUiParams[" + (loaderManager.EZpvd() != null) + "] floatingViewX[" + loaderManager.OLrzqt() + "] floatingViewY[" + loaderManager.AEQbTJ() + "]";
        }
        if (abstractC37162ood instanceof AbstractC37162ood.ActionBar) {
            AbstractC37162ood.ActionBar actionBar = (AbstractC37162ood.ActionBar) abstractC37162ood;
            return "JoinGroupCall groupId[" + actionBar.KWHzl() + "] hasUiParams[" + (actionBar.EZpvd() != null) + "] floatingViewX[" + actionBar.OLrzqt() + "] floatingViewY[" + actionBar.AEQbTJ() + "]";
        }
        if (abstractC37162ood instanceof AbstractC37162ood.Application) {
            AbstractC37162ood.Application application = (AbstractC37162ood.Application) abstractC37162ood;
            return "IncomingGroupCall groupId[" + application.copydefault() + "] hasCallSession[true] hasUiParams[" + (application.EZpvd() != null) + "] floatingViewX[" + application.OLrzqt() + "] floatingViewY[" + application.AEQbTJ() + "]";
        }
        if (!(abstractC37162ood instanceof AbstractC37162ood.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC37162ood.StateListAnimator stateListAnimator = (AbstractC37162ood.StateListAnimator) abstractC37162ood;
        return "RingGroupCallUsers targetUids[" + CollectionsKt___CollectionsKt.joinToString$default(stateListAnimator.copydefault(), ",", null, null, 0, null, null, 62, null) + "] hasUiParams[" + (stateListAnimator.EZpvd() != null) + "] floatingViewX[" + stateListAnimator.OLrzqt() + "] floatingViewY[" + stateListAnimator.AEQbTJ() + "]";
    }
}
