package o;

import android.view.View;
import com.okinc.im.imui.group.join.JoinGroupEntryHelper$check$1;
import com.okinc.im.imui.group.join.JoinGroupEntryHelper$check$4$1;
import com.okinc.im.imui.group.join.JoinGroupEntryHelper$check$5$1;
import com.okinc.im.usecase.group.invite.CheckIsAllowGroupInvitationUseCase;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34168nTy {
    public final CheckIsAllowGroupInvitationUseCase KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C34168nTy(@NotNull CheckIsAllowGroupInvitationUseCase checkIsAllowGroupInvitationUseCase, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(checkIsAllowGroupInvitationUseCase, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = checkIsAllowGroupInvitationUseCase;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        JoinGroupEntryHelper$check$1 joinGroupEntryHelper$check$1;
        android.content.Context context2;
        Function0<Unit> function02;
        android.content.Context context3;
        C34168nTy c34168nTy;
        java.lang.Object objM7377constructorimpl;
        C34168nTy c34168nTy2;
        Function0<Unit> function03;
        java.lang.Object obj;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        boolean z2 = z;
        if (continuation instanceof JoinGroupEntryHelper$check$1) {
            joinGroupEntryHelper$check$1 = (JoinGroupEntryHelper$check$1) continuation;
            int i = joinGroupEntryHelper$check$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                joinGroupEntryHelper$check$1.label = i - Integer.MIN_VALUE;
            } else {
                joinGroupEntryHelper$check$1 = new JoinGroupEntryHelper$check$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = joinGroupEntryHelper$check$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = joinGroupEntryHelper$check$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: channelId=" + str3 + ", invitationId=" + str4 + ", checkHavePayMode=" + z2, null, 2, null);
            try {
                Result.Application application = Result.Companion;
                CheckIsAllowGroupInvitationUseCase checkIsAllowGroupInvitationUseCase = this.KWHzl;
                joinGroupEntryHelper$check$1.L$0 = this;
                context2 = context;
                try {
                    joinGroupEntryHelper$check$1.L$1 = context2;
                    joinGroupEntryHelper$check$1.L$2 = str3;
                    joinGroupEntryHelper$check$1.L$3 = str4;
                    function02 = function0;
                } catch (java.lang.Throwable th) {
                    th = th;
                    function02 = function0;
                    context3 = context2;
                    c34168nTy = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    java.lang.String str5 = str3;
                    java.lang.String str6 = str4;
                    boolean z3 = z2;
                    c34168nTy2 = c34168nTy;
                    android.content.Context context4 = context3;
                    function03 = function02;
                    obj = objM7377constructorimpl;
                    if (Result.m7384isSuccessimpl(obj)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                try {
                    joinGroupEntryHelper$check$1.L$4 = function02;
                    joinGroupEntryHelper$check$1.Z$0 = z2;
                    joinGroupEntryHelper$check$1.label = 1;
                    objEZpvd = checkIsAllowGroupInvitationUseCase.EZpvd(str4, joinGroupEntryHelper$check$1);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    context3 = context2;
                    c34168nTy = this;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    java.lang.String str52 = str3;
                    java.lang.String str62 = str4;
                    boolean z32 = z2;
                    c34168nTy2 = c34168nTy;
                    android.content.Context context42 = context3;
                    function03 = function02;
                    obj = objM7377constructorimpl;
                    if (Result.m7384isSuccessimpl(obj)) {
                    }
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                context2 = context;
            }
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            context3 = context2;
            c34168nTy = this;
            objM7377constructorimpl = Result.m7377constructorimpl((CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus) objEZpvd);
            java.lang.String str522 = str3;
            java.lang.String str622 = str4;
            boolean z322 = z2;
            c34168nTy2 = c34168nTy;
            android.content.Context context422 = context3;
            function03 = function02;
            obj = objM7377constructorimpl;
            if (Result.m7384isSuccessimpl(obj)) {
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i2 == 1) {
            boolean z4 = joinGroupEntryHelper$check$1.Z$0;
            Function0<Unit> function04 = (Function0) joinGroupEntryHelper$check$1.L$4;
            java.lang.String str7 = (java.lang.String) joinGroupEntryHelper$check$1.L$3;
            java.lang.String str8 = (java.lang.String) joinGroupEntryHelper$check$1.L$2;
            context3 = (android.content.Context) joinGroupEntryHelper$check$1.L$1;
            C34168nTy c34168nTy3 = (C34168nTy) joinGroupEntryHelper$check$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                z2 = z4;
                str3 = str8;
                c34168nTy = c34168nTy3;
                function02 = function04;
                str4 = str7;
                try {
                    objM7377constructorimpl = Result.m7377constructorimpl((CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus) objEZpvd);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                z2 = z4;
                str3 = str8;
                c34168nTy = c34168nTy3;
                function02 = function04;
                str4 = str7;
                Result.Application application2222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                java.lang.String str5222 = str3;
                java.lang.String str6222 = str4;
                boolean z3222 = z2;
                c34168nTy2 = c34168nTy;
                android.content.Context context4222 = context3;
                function03 = function02;
                obj = objM7377constructorimpl;
                if (Result.m7384isSuccessimpl(obj)) {
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            java.lang.String str52222 = str3;
            java.lang.String str62222 = str4;
            boolean z32222 = z2;
            c34168nTy2 = c34168nTy;
            android.content.Context context42222 = context3;
            function03 = function02;
            obj = objM7377constructorimpl;
            if (Result.m7384isSuccessimpl(obj)) {
                CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus checkIsAllGroupInvitationStatus = (CheckIsAllowGroupInvitationUseCase.CheckIsAllGroupInvitationStatus) obj;
                C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>check: Invitation check successful, status=" + checkIsAllGroupInvitationStatus, null, 2, null);
                CoroutineDispatcher coroutineDispatcher = c34168nTy2.OLrzqt;
                JoinGroupEntryHelper$check$4$1 joinGroupEntryHelper$check$4$1 = new JoinGroupEntryHelper$check$4$1(checkIsAllGroupInvitationStatus, c34168nTy2, context42222, z32222, str62222, str52222, function03, null);
                joinGroupEntryHelper$check$1.L$0 = c34168nTy2;
                joinGroupEntryHelper$check$1.L$1 = function03;
                joinGroupEntryHelper$check$1.L$2 = obj;
                joinGroupEntryHelper$check$1.L$3 = null;
                joinGroupEntryHelper$check$1.L$4 = null;
                joinGroupEntryHelper$check$1.label = 2;
                if (BuildersKt.withContext(coroutineDispatcher, joinGroupEntryHelper$check$4$1, joinGroupEntryHelper$check$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i2 == 2) {
            obj = joinGroupEntryHelper$check$1.L$2;
            function03 = (Function0) joinGroupEntryHelper$check$1.L$1;
            c34168nTy2 = (C34168nTy) joinGroupEntryHelper$check$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
            if (thM7380exceptionOrNullimpl != null) {
                C44124sEe.AYXKKw("JoinGroupEntryHelper=>check: Invitation check failed: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                CoroutineDispatcher coroutineDispatcher2 = c34168nTy2.OLrzqt;
                JoinGroupEntryHelper$check$5$1 joinGroupEntryHelper$check$5$1 = new JoinGroupEntryHelper$check$5$1(thM7380exceptionOrNullimpl, function03, null);
                joinGroupEntryHelper$check$1.L$0 = obj;
                joinGroupEntryHelper$check$1.L$1 = null;
                joinGroupEntryHelper$check$1.L$2 = null;
                joinGroupEntryHelper$check$1.L$3 = null;
                joinGroupEntryHelper$check$1.L$4 = null;
                joinGroupEntryHelper$check$1.label = 3;
                if (BuildersKt.withContext(coroutineDispatcher2, joinGroupEntryHelper$check$5$1, joinGroupEntryHelper$check$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.nTy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Object check$default(C34168nTy c34168nTy, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, Function0 function0, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            function0 = new Function0() { // from class: o.nTD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34168nTy.KWHzl();
                }
            };
        }
        return c34168nTy.EZpvd(context, str, str2, z2, function0, continuation);
    }

    public final void KWHzl(android.content.Context context) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showCorRestrictedDialog: Showing COR restricted dialog", null, 2, null);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(context.getResources().getString(C35399nuc.LoaderManager.gsvlRV));
        viewOnClickListenerC54939xaY.EZpvd(context.getResources().getString(C35399nuc.LoaderManager.zdxASf));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCUTEI), new View.OnClickListener() { // from class: o.nTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34168nTy.djBIcL(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showCorRestrictedDialog: Dialog dismissed", null, 2, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(android.content.Context context) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showPayUnavailableDialog: Showing Pay Mode missing dialog", null, 2, null);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C35399nuc.LoaderManager.OUcgGI);
        viewOnClickListenerC54939xaY.copydefault(C35399nuc.LoaderManager.OHsvZP);
        viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.getFieldNames, new View.OnClickListener() { // from class: o.nTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34168nTy.AhwBna(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showPayUnavailableDialog: Dialog dismissed", null, 2, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ(android.content.Context context) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showBeingKickedDialog: Showing being kicked dialog", null, 2, null);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(context.getResources().getString(C35399nuc.LoaderManager.zblBkD));
        viewOnClickListenerC54939xaY.EZpvd(context.getResources().getString(C35399nuc.LoaderManager.spnCvw));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DCUTEI), new View.OnClickListener() { // from class: o.nTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34168nTy.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showBeingKickedDialog: Dialog dismissed", null, 2, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void EZpvd(android.content.Context context) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showGroupDisbandedDialog: Showing group disbanded dialog", null, 2, null);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(context.getResources().getString(C35399nuc.LoaderManager.fdOvFl));
        viewOnClickListenerC54939xaY.EZpvd(context.getResources().getString(C35399nuc.LoaderManager.fERRXa));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.DarRvM), new View.OnClickListener() { // from class: o.nTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34168nTy.gEmmrt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        C44124sEe.imLogGroup$default("JoinGroupEntryHelper=>showGroupDisbandedDialog: Dialog dismissed", null, 2, null);
        viewOnClickListenerC54939xaY.dismiss();
    }
}
