package o;

import android.os.Build;
import android.view.View;
import com.okinc.im.imui.group.members.AddMembersHelper$handleSelectedAffiliateMembersResult$1;
import com.okinc.im.imui.group.members.AddMembersHelper$resolveFailReason$2;
import com.okinc.im.imui.group.members.AddMembersHelper$showFailReasonDialog$1$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.AffiliateMemberFilter;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nWM {
    public static final nWM EZpvd = new nWM();

    private nWM() {
    }

    public final oDU KWHzl() {
        return ((InterfaceC35331ntM) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC35331ntM.class)).getPostValueLengthLimit();
    }

    public final ViewOnClickListenerC54939xaY copydefault(@NotNull android.content.Context context, @NotNull GroupAddMembersResult groupAddMembersResult, @NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(sDN.copydefault.AEQbTJ().plus(JobKt__JobKt.Job$default((Job) null, 1, (java.lang.Object) null)));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new AddMembersHelper$showFailReasonDialog$1$1(groupAddMembersResult, viewOnClickListenerC54939xaY, str, function0, CoroutineScope, null), 3, null);
        return viewOnClickListenerC54939xaY;
    }

    public final java.lang.Object EZpvd(GroupAddMembersResult groupAddMembersResult, java.lang.String str, Continuation<? super android.text.SpannableString> continuation) {
        return BuildersKt.withContext(sDN.copydefault.EZpvd(), new AddMembersHelper$resolveFailReason$2(str, groupAddMembersResult, null), continuation);
    }

    public final android.text.SpannableString AEQbTJ(@androidx.annotation.StringRes int i) {
        return C37683oyU.EZpvd(C33070mpX.AYXKKw(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull GroupInfo groupInfo, @NotNull android.content.Intent intent, @NotNull Function0<Unit> function0, @NotNull Function1<? super GroupAddMembersResult, Unit> function1, @NotNull Function1<? super java.lang.Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AddMembersHelper$handleSelectedAffiliateMembersResult$1 addMembersHelper$handleSelectedAffiliateMembersResult$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof AddMembersHelper$handleSelectedAffiliateMembersResult$1) {
            addMembersHelper$handleSelectedAffiliateMembersResult$1 = (AddMembersHelper$handleSelectedAffiliateMembersResult$1) continuation;
            int i = addMembersHelper$handleSelectedAffiliateMembersResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addMembersHelper$handleSelectedAffiliateMembersResult$1.label = i - Integer.MIN_VALUE;
            } else {
                addMembersHelper$handleSelectedAffiliateMembersResult$1 = new AddMembersHelper$handleSelectedAffiliateMembersResult$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = addMembersHelper$handleSelectedAffiliateMembersResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = addMembersHelper$handleSelectedAffiliateMembersResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU == null) {
                    return Unit.INSTANCE;
                }
                java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(groupInfo.getGroupId());
                if (fieldNames == null) {
                    return Unit.INSTANCE;
                }
                long jLongValue = fieldNames.longValue();
                Result.Application application = Result.Companion;
                java.util.List<AffiliateMemberFilter> listOLrzqt = OLrzqt(intent);
                sIR sirCopydefault = interfaceC35180nqU.AEQbTJ().copydefault();
                addMembersHelper$handleSelectedAffiliateMembersResult$1.L$0 = function0;
                addMembersHelper$handleSelectedAffiliateMembersResult$1.L$1 = function1;
                addMembersHelper$handleSelectedAffiliateMembersResult$1.L$2 = function12;
                addMembersHelper$handleSelectedAffiliateMembersResult$1.label = 1;
                objEZpvd = sirCopydefault.EZpvd(jLongValue, listOLrzqt, addMembersHelper$handleSelectedAffiliateMembersResult$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function12 = (Function1) addMembersHelper$handleSelectedAffiliateMembersResult$1.L$2;
                function1 = (Function1) addMembersHelper$handleSelectedAffiliateMembersResult$1.L$1;
                function0 = (Function0) addMembersHelper$handleSelectedAffiliateMembersResult$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupAddMembersResult) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function12.invoke(thM7380exceptionOrNullimpl);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            GroupAddMembersResult groupAddMembersResult = (GroupAddMembersResult) objM7377constructorimpl;
            if (groupAddMembersResult.isAllAddSuccess()) {
                function0.invoke();
            } else {
                function1.invoke(groupAddMembersResult);
            }
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<AffiliateMemberFilter> OLrzqt(android.content.Intent intent) {
        java.util.ArrayList parcelableArrayListExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("filters", AffiliateMemberFilter.class);
        } else {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("filters");
        }
        return parcelableArrayListExtra == null ? yDY.AhwBna() : parcelableArrayListExtra;
    }

    public final void OLrzqt(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull GroupInfo groupInfo, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(groupInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        abstractActivityC33041mov.showLoading();
        C37683oyU.AEQbTJ(groupInfo.getGroupId(), abstractActivityC33041mov, OKConversationType.GROUP, true, new Function1() { // from class: o.nWN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nWM.copydefault(str, abstractActivityC33041mov, (OKConversation) obj);
            }
        }, new Function1() { // from class: o.nWO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nWM.KWHzl(abstractActivityC33041mov, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, AbstractActivityC33041mov abstractActivityC33041mov, OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        oKConversation.setConversationTitle(str);
        abstractActivityC33041mov.dismissLoading();
        C33764nEz.OLrzqt.copydefault(oKConversation, abstractActivityC33041mov, (204 & 4) != 0 ? null : null, (204 & 8) != 0 ? null : null, (204 & 16) != 0 ? null : null, (204 & 32) != 0 ? null : null, (204 & 64) != 0 ? null : null, (204 & 128) != 0 ? null : null);
        C37290oqz.copydefault.AEQbTJ(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        abstractActivityC33041mov.dismissLoading();
        C55326xho.toast$default(th.getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final ViewOnClickListenerC54939xaY OLrzqt(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        java.lang.String localized$default = pTB.formatLocalized$default(java.lang.String.valueOf(j), null, 1, null);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.RhlVAI);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C35399nuc.LoaderManager.RjCdvp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default))));
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.SFHvfS, new View.OnClickListener() { // from class: o.nWL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                nWM.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        return viewOnClickListenerC54939xaY;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
