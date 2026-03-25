package o;

import com.okinc.im.imui.group.joinreview.JoinReviewHelper$resolveFailReason$2;
import com.okinc.im.imui.group.joinreview.JoinReviewHelper$showFailReasonDialog$1$1;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nUF {
    public static final nUF KWHzl = new nUF();

    private nUF() {
    }

    public final oDU OLrzqt() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).getPostValueLengthLimit();
    }

    public final ViewOnClickListenerC54939xaY copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(sDN.copydefault.AEQbTJ().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new JoinReviewHelper$showFailReasonDialog$1$1(map, viewOnClickListenerC54939xaY, str, function0, CoroutineScope, null), 3, null);
        return viewOnClickListenerC54939xaY;
    }

    public final java.lang.String AEQbTJ(java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map) {
        if (map.containsKey(GroupActionFailReason.Unknown) || map.containsKey(GroupActionFailReason.SentInvitationInstead) || map.containsKey(GroupActionFailReason.AdminApprovalRequired) || map.containsKey(GroupActionFailReason.GroupEntryVerificationsRequired)) {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.RWIpjU);
        }
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.fsw);
    }

    public final java.lang.Object EZpvd(java.lang.String str, java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map, Continuation<? super android.text.SpannableString> continuation) {
        return BuildersKt.withContext(sDN.copydefault.EZpvd(), new JoinReviewHelper$resolveFailReason$2(str, map, null), continuation);
    }

    public final android.text.SpannableString OLrzqt(@androidx.annotation.StringRes int i) {
        return C37683oyU.EZpvd(C33070mpX.AYXKKw(i));
    }
}
